(ns clojurec.inherited-test
  (:require [clojure.java.io :as io])
  (:use clojure.test
        clojurec.core))

(deftest inherited-test
  (testing "Inherited test suite from ClojureScript"
    (let [run-dir (.getAbsolutePath (io/file (java.lang.System/getProperty "user.dir") "run"))]
      (binding [*build-options* (assoc default-build-options
                                  :main-function-name 'cljc.core-test/main)]
        (compile-file (.getAbsolutePath (io/file (java.lang.System/getProperty "user.dir") "test" "cljc" "core_test.cljc"))
                      (.getAbsolutePath (io/file run-dir "cljc.c")))
        (is (= [true]
               (make-and-run run-dir)))))))
