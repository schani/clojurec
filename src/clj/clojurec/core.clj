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
    (cljc/analyze-file "cljc/core.cljc"
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
		      (cljc/emit ast)))]
    (apply str
	   (concat @cljc/declarations
		   ["int MAIN_FUNCTION_NAME (void) {\n"
		    "environment_t *env = NULL;\n"
		    "cljc_init ();\n"
		    main-code
		    "return 0;\n}\n"]))))

(defn compile-expr [ns-name with-core expr]
  (compile-asts (analyze ns-name with-core expr)))

(defn run-code [code]
  (let [user-dir (java.lang.System/getProperty "user.dir")
	run-dir (io/file user-dir "run")
	preamble (slurp (io/file user-dir "src" "c" "preamble.c"))]
    (spit (io/file run-dir "cljc.c") (str preamble code))

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

;;(inspect-and-run-expr '(print 1))

(comment
  ;; default build options
  (run-expr 'my-test true '(do (cljc.core/print (+ 2 4))))

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
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))
