(ns clojurec.core
  (:require [clojure.inspector :as inspector]
            [clojure.java.io :as io]
	    [clojure.java.shell :as shell]
            [cljc.compiler :as cljc]))

(defn analyze [ns-name with-core expr]
  (cljc/reset-namespaces!)
  (let [ns (if-let [ns (@cljc/namespaces ns-name)]
	     ns
	     {:name ns-name})
	env {:ns ns :context :statement :locals {}}]
    (if with-core
      (conj (cljc/analyze-file "cljc/core.cljc")
	    (cljc/analyze env expr))
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
		   ["int main (void) {\n"
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
    (shell/sh "make" "clean" :dir run-dir)
    (let [{:keys [exit out]} (shell/sh "make" :dir run-dir)]
      (if (= exit 0)
	(let [{:keys [exit out]} (shell/sh "./cljc" :dir run-dir)]
	  (if (= exit 0)
	    (read-string (str \[ out \]))
	    :run-error))
	:compile-error))))

(defn run-expr [ns-name with-core expr]
  (run-code (compile-expr ns-name with-core expr)))

(defn inspect-and-run-expr [ns-name with-core expr]
  (let [asts (analyze ns-name with-core expr)]
    (inspect-ast (last asts))
    (run-code (compile-asts asts))))

;;(inspect-and-run-expr '(print 1))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))
