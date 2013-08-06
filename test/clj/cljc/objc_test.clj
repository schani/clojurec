(ns cljc.objc-test
  (:require [cljc.c-interface :as c])
  (:use clojure.test
        cljc.test
        cljc.driver))

(deftest foundation
  (testing "Foundation"
    (is (= (objc-run '(println (§ "abc" :length))) [3]))))

(deftest marshalling
  (testing "marshalling"
    (doseq [[selector types]
            '[[[1 :testBool] [Boolean Boolean]]
              [[1 :testChar] [:char :char]]
              [[1 :testSignedChar] [:signed-char :signed-char]]
              [[1 :testUnsignedChar] [:unsigned-char :unsigned-char]]
              [[1 :testShort] [:short :short]]
              [[1 :testUnsignedShort] [:unsigned-short :unsigned-short]]
              [[1 :testInt] [:int :int]]
              [[1 :testUnsignedInt] [:unsigned-int :unsigned-int]]
              [[1 :testLong] [:long :long]]
              [[1 :testUnsignedLong] [:unsigned-long :unsigned-long]]
              [[1 :testLongLong] [:long-long :long-long]]
              [[1 :testUnsignedLongLong] [:unsigned-long-long :unsigned-long-long]]
              [[1 :testFloat] [:float :float]]
              [[1 :testDouble] [:double :double]]]]
      (c/objc-register-selector! selector types))
    (binding [*build-options* (update-in *build-options* [:make-args] conj "EXTRA_OBJS=TestClass.o" "TEST_CFLAGS=-I../../test/objc")]
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testBool false)))) [true]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testChar \A)))) [\B]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testSignedChar -2)))) [-1]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testUnsignedChar 1)))) [2]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testShort -2)))) [-1]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testUnsignedShort 1)))) [2]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testInt -2)))) [-1]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testUnsignedInt 1)))) [2]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testLong -2)))) [-1]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testUnsignedLong 1)))) [2]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testLongLong -2)))) [-1]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testUnsignedLongLong 1)))) [2]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testFloat 1)))) [2.0]))
      (is (= (objc-run '(do (c-decl* "#import \"TestClass.h\"\n") (println (§ (§ TestClass) :testDouble 1)))) [2.0])))))

(use-fixtures :once (cljc-once-fixture :objc))
