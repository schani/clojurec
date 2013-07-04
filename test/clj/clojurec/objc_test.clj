(ns clojurec.objc-test
  (:require [clojure.java.io :as io])
  (:use clojure.test
        clojurec.core))

(defn- core-run [x]
  (binding [*build-options* (assoc *build-options* :objc true)]
    (run-expr 'clojurec.objc-test true x)))

(deftest foundation
  (testing "Foundation"
    (is (= (core-run '(println (§ "abc" :length))) [3]))))

(use-fixtures :once (fn [f] (clean-default-run-dir true) (f)))
