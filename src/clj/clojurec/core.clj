(ns clojurec.core
  (:require [clojure.inspector :as inspector]
            [clojure.java.io :as io]
	    [clojure.java.shell :as shell]
            [cljc.compiler :as cljc]))

(def default-build-options
  {:host :unix
   :with-makefile true})
(def ^:dynamic *build-options* default-build-options)

(defn analyze [ns-name with-core expr]
  (cljc/reset-namespaces!)
  (if with-core
    (cljc/analyze-files ["cljc/core.cljc"]
                        (list (list 'ns ns-name)
                              expr))
    (let [ns (if-let [ns (@cljc/namespaces ns-name)]
               ns
               {:name ns-name})
          env {:ns ns :context :statement :locals {}}]
      [(cljc/analyze env expr)])))

(defn inspect-ast [ast]
  (inspector/inspect-tree ast))

(defn inspect-expr [ns-name with-core expr]
  (inspect-ast (last (analyze ns-name with-core expr))))

(defn compile-asts [asts]
  (let [main-code (with-out-str
		    (doseq [ast asts]
		      (cljc/emit ast)))
        main-name (:main-function-name *build-options*)]
    (apply str
	   (concat @cljc/declarations
		   ["int MAIN_FUNCTION_NAME ("
                    (if main-name
                      "int argc, char *argv[]"
                      "void")
                    ") {\n"
		    "environment_t *env = NULL;\n"
		    "cljc_init ();\n"
		    main-code
                    (if main-name
                      (str "return integer_get (FUNCALL1 ((closure_t*)VAR_NAME ("
                           (cljc/munge 'cljc.core/main-exit-value)
                           "), cljc_core_apply (2, (closure_t*)VALUE_NONE, VAR_NAME ("
                           (cljc/munge main-name)
                           "), FUNCALL2 ((closure_t*)VAR_NAME ("
                           (cljc/munge 'cljc.core/vector-from-c-string-array)
                           "), make_integer (argc), make_raw_pointer (argv)), VALUE_NONE, NULL)));")
                      "return 0;\n")
                    "}\n"]))))

(defn compile-expr [ns-name with-core expr]
  (compile-asts (analyze ns-name with-core expr)))

(defn spit-code [out-file code]
  (let [user-dir (java.lang.System/getProperty "user.dir")
	run-dir (io/file user-dir "run")
	preamble (slurp (io/file user-dir "src" "c" "preamble.c"))]
    (spit out-file (str preamble code))))

(defn run-code [code]
  (let [user-dir (java.lang.System/getProperty "user.dir")
	run-dir (io/file user-dir "run")]
    (spit-code (io/file run-dir "cljc.c") code)

    ;; iOS Specific
    (when (= :ios (:host *build-options*))
      (let [ios (slurp (io/file user-dir "src" "c" "support_ios.m"))]
        (spit (io/file run-dir "cljc.m") (str ios))))

    (when (:with-makefile *build-options*)
      (shell/sh "make" "clean" :dir run-dir)
      (let [{:keys [exit out err]} (shell/sh "make" :dir run-dir)]
        (if (= exit 0)
          (let [{:keys [exit out]} (shell/sh "./cljc" :dir run-dir)]
            (if (= exit 0)
              (read-string (str \[ out \]))
              :run-error))
          {:compile-error (str "Makefile ERROR: " err)})))))

(defn run-expr [ns-name with-core expr]
  (run-code (compile-expr ns-name with-core expr)))

(defn inspect-and-run-expr [ns-name with-core expr]
  (let [asts (analyze ns-name with-core expr)]
    (inspect-ast (last asts))
    (run-code (compile-asts asts))))

(defn compile-file [src dest]
  (cljc/reset-namespaces!)
  (let [asts (cljc/analyze-files ["cljc/core.cljc" src])
        code (compile-asts asts)]
    (spit-code (io/file dest) code)))

;;(inspect-and-run-expr '(print 1))

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

(defn -main
  [& args]
  (if (= (count args) 3)
    (let [[source dest main-name] args]
      (binding [*build-options* (assoc default-build-options
                                  :main-function-name (symbol main-name))]
        (compile-file source dest)))
    (println "Usage: cljc <source-file> <out-file> <main-fn-name>")))
