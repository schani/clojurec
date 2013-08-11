(ns cljc.test
  (:require [clojure.java.io :as io]
            [cljc.c-interface :as c]
            [cljc.compiler :as cljc])
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

(defn- once-fixture-c [f]
  (clean-default-run-dir true)
  (f))

(defn- once-fixture-objc [f]
  (if (check-objc)
    (binding [*build-options* (assoc *build-options*
                                :objc true
                                :frameworks ["UIKit"])
              cljc/*objc* true]
      (clean-default-run-dir true)
      (f)
      (c/objc-reset-selectors!))
    (println "Cannot build Objective-C code - not running tests.  Check `make test-objc` in `run/objc`.")))

(defn cljc-once-fixture [target]
  (case target
    :c
    once-fixture-c

    :objc
    once-fixture-objc

    :both
    (fn [f]
      (once-fixture-c f)
      (once-fixture-objc f))

    (throw (Error. (str "Unknown test target " target)))))
