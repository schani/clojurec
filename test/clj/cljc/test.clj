(ns cljc.test
  (:require [clojure.java.io :as io]
            [cljc.c-interface :as c])
  (:use clojure.test
        cljc.driver))

(defn run [x]
  (run-expr 'cljc.test false x))

(defn core-run [x]
  (run-expr 'cljc.test true x))

(defmacro run-and-print [& exprs]
  `(run '(do ~@(map #(list 'cljc.core/print %) exprs))))

(defmacro core-run-and-print [& exprs]
  `(core-run '(do ~@(map #(list 'println %) exprs))))

(defn objc-run [x]
  (binding [*build-options* (assoc *build-options* :objc true)]
    (run-expr 'cljc.test true x)))
