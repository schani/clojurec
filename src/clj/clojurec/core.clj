(ns clojurec.core
  (:require [clojure.inspector :as inspector]
            [clojure.java.io :as io]
	    [clojure.java.shell :as shell]
            [cljc.compiler :as cljc]))

(defn analyze [expr]
  (cljc/reset-namespaces!)
  (let [env {:ns (@cljc/namespaces 'cljc.user) :context :statement :locals {}}]
    (cljc/analyze env expr)))

(defn inspect-ast [ast]
  (inspector/inspect-tree ast))

(defn inspect-expr [expr]
  (inspect-ast (analyze expr)))

(defn compile-ast [ast]
  (let [main-code (with-out-str (cljc/emit ast))]
    (apply str
	   (concat @cljc/declarations
		   ["int main (void) {\n"
		    "environment_t *env = NULL;\n"
		    "cljc_init ();\n"
		    main-code
		    "return 0;\n}\n"]))))

(defn compile-expr [expr]
  (compile-ast (analyze expr)))

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

(defn run-expr [expr]
  (run-code (compile-expr expr)))

(defn inspect-and-run-expr [expr]
  (let [ast (analyze expr)]
    (inspect-ast ast)
    (run-code (compile-ast ast))))

;;(inspect-and-run-expr '(print 1))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))
