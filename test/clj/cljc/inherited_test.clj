(ns cljc.inherited-test
  (:require [clojure.java.io :as io]
            [cljc.compiler :as cljc])
  (:use clojure.test
        cljc.test
        cljc.driver))

(deftest inherited-test
  (testing "Inherited test suite from ClojureScript"
    (let [run-dir (default-run-dir)
          init-name (init-function-name 'cljc.core-test)]
      (compile-cljc-core-if-needed)
      (binding [*build-options* (assoc default-build-options
                                  :init-function-name init-name)
                cljc/*read-exports-fn* (read-exports-fn-for-dir run-dir)]
        (compile-file (.getAbsolutePath (io/file (java.lang.System/getProperty "user.dir") "test" "cljc" "core_test.cljc"))
                      (.getAbsolutePath (io/file run-dir (c-file-name 'cljc.core-test)))
                      nil
                      true)
        (spit-driver init-name 'cljc.core-test/main true run-dir)
        (is (= [true]
               (make-and-run run-dir)))))))

(use-fixtures :once (cljc-once-fixture :c))
