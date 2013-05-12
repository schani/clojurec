(ns clojurec.core
  (:require [clojure.inspector :as inspector]
            [clojure.java.io :as io]
	    [clojure.java.shell :as shell]
            [cljc.compiler :as cljc])
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

(defn init-or-main-function [init-name main-name main-code used-namespaces]
  (apply str [(apply str (map (fn [ns]
                                (str "extern void " (init-function-name ns) " (void);\n"))
                              used-namespaces))
              (if main-name
                "int MAIN_FUNCTION_NAME"
                (str "void " init-name))
              "("
              (if main-name
                "int argc, char *argv[]"
                "void")
              ") {\n"
              "environment_t *env = NULL;\n"
              (if main-name
                (str "cljc_init ();\n"
                     "BEGIN_MAIN_CODE;\n")
                (apply str
                       (map (fn [ns]
                              (str (init-function-name ns) " ();\n"))
                            used-namespaces)))
              (if main-code
                main-code
                "")
              (if (and main-name (not= main-name :none))
                (str "return integer_get (FUNCALL1 ((closure_t*)VAR_NAME ("
                     (cljc/munge 'cljc.core/main-exit-value)
                     "), cljc_core_apply (2, (closure_t*)VALUE_NONE, VAR_NAME ("
                     (cljc/munge main-name)
                     "), FUNCALL2 ((closure_t*)VAR_NAME ("
                     (cljc/munge 'cljc.core/vector-from-c-string-array)
                     "), make_integer (argc), make_raw_pointer (argv)), VALUE_NONE, NULL)));")
                "return;\n")
              (if main-name
                "END_MAIN_CODE;\n"
                "")
              "}\n"]))

(defn compile-asts [asts]
  (let [main-code (with-out-str
		    (doseq [ast asts]
		      (cljc/emit ast)))
        init-name (:init-function-name *build-options*)
        main-name (:main-function-name *build-options*)]
    (apply str
	   (concat @cljc/declarations
                   [(init-or-main-function init-name main-name main-code @cljc/used-namespaces)]))))

(def default-run-dir (io/file (java.lang.System/getProperty "user.dir") "run"))

(defn read-exports-fn-for-dir [dir]
  (fn [ns]
    (let [file (io/file dir (str (cljc/munge ns) "-exports.clj"))]
      (slurp file))))

(defn compile-expr [ns-name with-core expr]
  (binding [*build-options* (assoc *build-options*
                              :init-function-name (init-function-name ns-name))
            cljc/*read-exports-fn* (read-exports-fn-for-dir default-run-dir)]
    (compile-asts (analyze ns-name with-core expr))))

(def src-c-dir (let [user-dir (java.lang.System/getProperty "user.dir")]
                 (io/file user-dir "src" "c")))

(defn spit-code [out-file code exports-file]
  (let [preamble (slurp (io/file src-c-dir "preamble.c"))]
    (spit out-file (str preamble code))
    (when exports-file
      (spit exports-file (prn-str @cljc/exports)))))

(defn make-and-run [run-dir]
  (when (:with-makefile *build-options*)
    (let [{:keys [exit out err]} (shell/sh "make" :dir run-dir)]
      (if (= exit 0)
        (do
          (let [{:keys [exit out]} (shell/sh "./cljc" :dir run-dir)]
            (if (= exit 0)
              (read-string (str \[ out \]))
              :run-error)))
        {:compile-error "Makefile ERROR"}))))

(defn c-file-name [namespace]
  (str (cljc/munge namespace) ".c"))

(defn exports-file-name [namespace]
  (str (cljc/munge namespace) "-exports.clj"))

(defn spit-driver [init-name main-name with-core out-dir]
  (let [init-name (or init-name (init-function-name (namespace main-name)))
        main-string (init-or-main-function nil main-name
                                           (str (if with-core
                                                  (str (init-function-name 'cljc.core) " ();\n")
                                                  "")
                                                init-name " ();\n")
                                           nil)]
    (spit-code (io/file out-dir "driver.c")
               (str "extern void " init-name " (void);\n"
                    (if (not= main-name :none)
                      (str "extern value_t *VAR_NAME (" (str (cljc/munge main-name)) ");\n")
                      "")
                    main-string)
               nil)))

(defn clean-default-run-dir [including-core]
  (shell/sh "make" (if including-core "clean" "clean-non-core")
            :dir default-run-dir))

(defn run-code [ns-name code with-core]
  (clean-default-run-dir false)

  (spit-code (io/file default-run-dir (c-file-name ns-name)) code nil)
  (spit-driver (init-function-name ns-name) :none with-core default-run-dir)

  ;; iOS Specific
  (when (= :ios (:host *build-options*))
    (let [ios (slurp (io/file src-c-dir "support_ios.m"))]
      (spit (io/file default-run-dir "cljc.m") (str ios))))

  (make-and-run default-run-dir))

(defn inspect-and-run-expr [ns-name with-core expr]
  (let [asts (analyze ns-name with-core expr)]
    (inspect-ast (last asts))
    (run-code ns-name (compile-asts asts) with-core)))

(defn compile-file [src dest exports-file with-core]
  (cljc/reset-namespaces!)
  (when with-core
    (cljc/analyze-deps ['cljc.core]))
  (let [asts (cljc/analyze-files [src])
        code (compile-asts asts)]
    (spit-code (io/file dest) code exports-file)))

(defn compile-file-to-dirs [source namespace out-dir exports-dir]
  (let [namespace-munged (str (cljc/munge namespace))]
    (binding [*build-options* (assoc default-build-options
                                :init-function-name (init-function-name namespace))
              cljc/*read-exports-fn* (read-exports-fn-for-dir exports-dir)]
      (compile-file source
                    (io/file out-dir (c-file-name namespace))
                    (io/file exports-dir (exports-file-name namespace))
                    (not= namespace 'cljc.core)))))

(defn compile-cljc-core-if-needed []
  (let [cljc-core-c-file (io/file default-run-dir (c-file-name 'cljc.core))]
    (when-not (.exists cljc-core-c-file)
      (compile-file-to-dirs (io/file (java.lang.System/getProperty "user.dir") "src" "cljc" "cljc" "core.cljc")
                            'cljc.core
                            default-run-dir
                            default-run-dir))))

(defn run-expr [ns-name with-core expr]
  (compile-cljc-core-if-needed)
  (run-code ns-name (compile-expr ns-name with-core expr) with-core))

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
             ["-d" "--driver" "Generate the driver C file." :flag true])]
    (cond
     (:compile options)
     (if (= (count remaining) 4)
       (let [[source namespace out-dir exports-dir] remaining
             namespace (symbol namespace)]
         (compile-file-to-dirs source namespace out-dir exports-dir))
       (do
         (print-usage)
         (System/exit 1)))

     (:driver options)
     (if (= (count remaining) 2)
       (let [[main-name out-dir] remaining
             main-name (symbol main-name)]
         (spit-driver nil main-name true out-dir))
       (do
         (print-usage)
         (System/exit 1)))

     :else
     (do
       (print-usage)
       (System/exit 1)))))
