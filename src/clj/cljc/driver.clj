(ns cljc.driver
  (:require [clojure.inspector :as inspector]
            [clojure.java.io :as io]
	    [clojure.java.shell :as shell]
            [cljc.compiler :as cljc]
            [cljc.c-interface :as c]
            [clojure.string :as string])
  (:use [clojure.tools.cli :only [cli]]))

(def default-build-options
  {:host :unix
   :with-makefile true})
(def ^:dynamic *build-options* default-build-options)

(defn analyze [ns-name with-core expr]
  (cljc/reset-namespaces!)
  (if with-core
    (do
      (cljc/analyze-deps ['cljc.core])
      (cljc/analyze-files []
                          (list (list 'ns ns-name)
                                expr)))
    (let [ns (if-let [ns (@cljc/namespaces ns-name)]
               ns
               {:name ns-name})
          env {:ns ns :context :statement :locals {}}]
      [(cljc/analyze env expr)])))

(defn inspect-ast [ast]
  (inspector/inspect-tree ast))

(defn inspect-expr [ns-name with-core expr]
  (inspect-ast (last (analyze ns-name with-core expr))))

(defn init-function-name [namespace]
  (str (cljc/munge (symbol (str "init-" namespace)))))

(defn init-or-main-function [init-name make-main main-code return-code used-namespaces]
  (apply str [(apply str (map (fn [ns]
                                (str "extern void " (init-function-name ns) " (void);\n"))
                              used-namespaces))
              (if make-main
                "int MAIN_FUNCTION_NAME"
                (str "void " init-name))
              "("
              (if make-main
                "int argc, char *argv[]"
                "void")
              ") {\n"
              "environment_t *env = NULL;\n"
              (if make-main
                (str "cljc_init ();\n"
                     (if (cljc/compiling-for-objc)
                       "cljc_objc_init ();\n"
                       "")
                     "BEGIN_MAIN_CODE;\n")
                "")
              (apply str
                     (map (fn [ns]
                            (str (init-function-name ns) " ();\n"))
                          used-namespaces))
              (if main-code
                main-code
                "")
              (if return-code
                return-code
                "")
              (if make-main
                "END_MAIN_CODE;\n"
                "")
              "}\n"]))

(defn standard-init-or-main-function [init-name main-name main-code used-namespaces]
  (init-or-main-function init-name
                         (boolean main-name)
                         main-code
                         (cond
                          (and main-name (not= main-name :none))
                          (str "return integer_get (FUNCALL1 ((closure_t*)VAR_NAME ("
                               (cljc/munge 'cljc.core/main-exit-value)
                               "), cljc_core_apply (2, (closure_t*)VALUE_NONE, VAR_NAME ("
                               (cljc/munge main-name)
                               "), FUNCALL2 ((closure_t*)VAR_NAME ("
                               (cljc/munge 'cljc.core/vector-from-c-string-array)
                               "), make_integer (argc), make_raw_pointer (argv)), VALUE_NONE, NULL)));")

                          main-name
                          "return 0;\n"

                          :else
                          "return;\n")
                         used-namespaces))

(defn ios-main-function [app-delegate-class used-namespaces]
  (init-or-main-function nil
                         true
                         (str "NSAutoreleasePool * pool = [[NSAutoreleasePool alloc] init];\n"
                              "int retVal = UIApplicationMain(argc, argv, nil, @\"" app-delegate-class "\");\n"
                              "[pool release];\n")
                         (str "return retVal;\n")
                         used-namespaces))

(defn compile-asts [asts]
  (let [main-code (with-out-str
		    (doseq [ast asts]
		      (cljc/emit ast)))
        init-name (:init-function-name *build-options*)
        main-name (:main-function-name *build-options*)]
    (apply str
	   (concat @cljc/declarations
                   [(standard-init-or-main-function init-name main-name main-code @cljc/used-namespaces)]))))

(defn default-run-dir []
  (io/file (java.lang.System/getProperty "user.dir") "run" (if (:objc *build-options*) "objc" "c")))
(def default-frameworks-dir (io/file (java.lang.System/getProperty "user.dir") "frameworks"))

(defn read-exports-fn-for-dir [dir]
  (fn [ns]
    (let [file (io/file dir (str (cljc/munge ns) "-exports.clj"))]
      (slurp file))))

(defn compile-expr [ns-name with-core expr]
  (binding [*build-options* (assoc *build-options*
                              :init-function-name (init-function-name ns-name))
            cljc/*read-exports-fn* (read-exports-fn-for-dir (default-run-dir))]
    (compile-asts (analyze ns-name with-core expr))))

(def src-c-dir (let [user-dir (java.lang.System/getProperty "user.dir")]
                 (io/file user-dir "src" "c")))

(defn spit-code [out-file code exports-file]
  (let [preamble (slurp (io/file src-c-dir "preamble.c"))]
    (spit out-file (str preamble code))
    (when exports-file
      (spit exports-file (prn-str @cljc/exports)))))

(defn make [make-args run-dir]
  (let [{:keys [exit out err]} (apply shell/sh "make" (concat make-args [:dir run-dir]))]
    (if (= exit 0)
      true
      {:compile-error exit :output out :error err})))

(defn make-and-run [run-dir]
  (when (:with-makefile *build-options*)
    (let [make-result (make (:make-args *build-options*) run-dir)]
      (if (true? make-result)
        (do
          (let [{:keys [exit out]} (shell/sh "./cljc" :dir run-dir)]
            (if (= exit 0)
              (read-string (str \[ out \]))
              {:run-error exit :output out})))
        make-result))))

(defn check-objc []
  (binding [*build-options* (assoc *build-options* :objc true)]
    (let [run-dir (default-run-dir)]
      (true? (make ["test-objc"] run-dir)))))

(defn c-file-extension []
  (if (cljc/compiling-for-objc) ".m" ".c"))

(defn c-file-name [namespace]
  (str (cljc/munge namespace) (c-file-extension)))

(defn exports-file-name [namespace]
  (str (cljc/munge namespace) "-exports.clj"))

(defn spit-driver [init-name main-name with-core out-dir]
  (let [used-namespaces (concat (if with-core
                                  ['cljc.core]
                                  [])
                                (if (and with-core (:objc *build-options*))
                                  ['cljc.objc]
                                  [])
                                (if init-name
                                  []
                                  [(namespace main-name)]))
        main-string (standard-init-or-main-function nil main-name
                                                    (if init-name
                                                      (str init-name " ();\n")
                                                      "")
                                                    used-namespaces)]
    (spit-code (io/file out-dir (str "driver" (c-file-extension)))
               (str (if init-name
                      (str "extern void " init-name " (void);\n")
                      "")
                    (if (not= main-name :none)
                      (str "extern value_t *VAR_NAME (" (str (cljc/munge main-name)) ");\n")
                      "")
                    main-string)
               nil)))

(defn spit-objc-driver [main-namespace app-delegate-class out-dir]
  (let [init-name (init-function-name main-namespace)]
    (spit-code (io/file out-dir (str "driver" (c-file-extension)))
               (ios-main-function app-delegate-class ['cljc.core main-namespace])
               nil)))

(defn clean-default-run-dir [including-core]
  (let [target (if including-core "clean" "clean-non-core")]
    (shell/sh "make" target :dir (default-run-dir))))

(defn run-code [ns-name code with-core]
  (clean-default-run-dir false)

  (spit-code (io/file (default-run-dir) (c-file-name ns-name)) code nil)
  (spit-driver (init-function-name ns-name) :none with-core (default-run-dir))

  ;; iOS Specific
  (when (= :ios (:host *build-options*))
    (let [ios (slurp (io/file src-c-dir "support_ios.m"))]
      (spit (io/file (default-run-dir) "cljc.m") (str ios))))

  (make-and-run (default-run-dir)))

(defn inspect-and-run-expr [ns-name with-core expr]
  (let [asts (analyze ns-name with-core expr)]
    (inspect-ast (last asts))
    (run-code ns-name (compile-asts asts) with-core)))

(defn load-framework [framework frameworks-dir]
  (let [framework-file (io/file frameworks-dir (str framework "-framework.clj"))
        entries (read-string (slurp framework-file))]
    (doseq [[kind & data] entries]
      (case kind
        :selector
        (let [[selector types] data]
          (c/objc-register-selector! selector types))

        :compound
        (let [[name size] data]
          (cljc/register-c-compound! (symbol framework (str name)) size))

        :enum
        (let [name (last data)
              members (take (dec (count data)) data)]
          (when name
            (cljc/register-c-enum! (symbol framework (str name))))
          (doseq [member members]
            (cljc/register-c-enum-member! (symbol framework (str member)))))

        :function
        (let [[name [return-type & arg-types]] data]
          (cljc/register-c-function! (symbol framework (str name)) return-type arg-types))

        (throw (Error. (str "Invalid framework entry " kind)))))))

(defn compile-file [src dest exports-file with-core]
  (cljc/reset-namespaces!)
  (when with-core
    (cljc/analyze-deps ['cljc.core]))
  (doseq [framework (:frameworks *build-options*)]
    (load-framework framework default-frameworks-dir))
  (let [asts (cljc/analyze-files [src])
        code (compile-asts asts)]
    (spit-code (io/file dest) code exports-file)))

(defn compile-file-to-dirs [source namespace out-dir exports-dir]
  (let [namespace-munged (str (cljc/munge namespace))]
    (binding [*build-options* (assoc *build-options*
                                :init-function-name (init-function-name namespace))
              cljc/*read-exports-fn* (read-exports-fn-for-dir exports-dir)]
      (compile-file source
                    (io/file out-dir (c-file-name namespace))
                    (io/file exports-dir (exports-file-name namespace))
                    (not= namespace 'cljc.core)))))

(defn- compile-system-namespace-if-needed [namespace]
  (let [c-file (io/file (default-run-dir) (c-file-name namespace))
        src-name (str (last (string/split (name namespace) #"\.")) ".cljc")
        src-file (io/file (java.lang.System/getProperty "user.dir") "src" "cljc" "cljc" src-name)]
    (when-not (.exists c-file)
      (println "Compiling" namespace)
      (compile-file-to-dirs src-file namespace (default-run-dir) (default-run-dir)))))

(defn compile-cljc-core-if-needed []
  (compile-system-namespace-if-needed 'cljc.core)
  (when (:objc *build-options*)
    (compile-system-namespace-if-needed 'cljc.objc)))

(defn run-expr [ns-name with-core expr]
  (binding [cljc/*objc* (:objc *build-options*)]
    (compile-cljc-core-if-needed)
    (compile-system-namespace-if-needed 'cljc.reader)
    (compile-system-namespace-if-needed 'cljc.analyzer)
    (run-code ns-name (compile-expr ns-name with-core expr) with-core)))

(comment
  ;; default build options
  (run-expr 'my-test true '(do (cljc.core/print (+ 2 4))))

  ;; simple echo command-line program
  (binding [*build-options* (assoc default-build-options
                              :main-function-name 'cljc.user/-main
                              :with-makefile false)]
    (run-expr 'cljc.user true '(defn -main [& args]
                                 (doseq [arg args]
                                   (pr arg)
                                   (pr "\n")))))

  ;; for iOS build
  (binding [*build-options* (assoc default-build-options
                              :host :ios
                              :with-makefile false)]
    (run-expr 'my-test true '(map #(cljc.core/pr %)
                                  ["Hi from iOS ClojureC!\n"
                                   "(+ 2.0 3) == " (+ 2.0 3)
                                   "\nThe END\n"])))

  ;; for Android build
  (binding [*build-options* (assoc default-build-options
                              :host :android
                              :with-makefile false)]
    (run-expr 'my-test true '(do
                               (cljc.core/pr "Hi From Android ClojureC!")
                               (cljc.core/pr (+ 2.0 3)))))
)

(defn- print-usage []
  (println "Usage: cljc -c <source-file> <namespace> <out-dir> <exports-dir>")
  (println "            -d <main-fn-name> <out-dir>"))

(defn -main
  [& args]
  (let [[options remaining usage]
        (cli args
             ["-c" "--compile" "Compile a ClojureC file." :flag true]
             ["-d" "--driver" "Generate a driver C file." :flag true]
             ["-D" "--ios-driver" "Generate an iOS driver M file." :flag true]
             ["-m" "--objc" "Generate Objective-C code." :flag true]
             ["-F" "--framework" "Include a framework."])]
    (cond
     (:compile options)
     (if (= (count remaining) 4)
       (let [[source namespace out-dir exports-dir] remaining
             namespace (symbol namespace)
             frameworks (if-let [f (:framework options)] [f] [])]
         (binding [*build-options* (assoc *build-options*
                                     :objc (:objc options)
                                     :frameworks frameworks)
                   cljc/*objc* (:objc options)]
           (compile-file-to-dirs source namespace out-dir exports-dir)))
       (do
         (print-usage)
         (System/exit 1)))

     (:driver options)
     (if (= (count remaining) 2)
       (let [[main-name out-dir] remaining
             main-name (symbol main-name)]
         (binding [*build-options* (assoc *build-options* :objc (:objc options))
                   cljc/*objc* (:objc options)]
           (spit-driver nil main-name true out-dir)))
       (do
         (print-usage)
         (System/exit 1)))

     (:ios-driver options)
     (if (= (count remaining) 3)
       (let [[main-namespace app-delegate-class out-dir] remaining]
         (binding [*build-options* (assoc *build-options* :objc true)
                   cljc/*objc* true]
           (spit-objc-driver main-namespace app-delegate-class out-dir))))

     :else
     (do
       (print-usage)
       (System/exit 1)))))
