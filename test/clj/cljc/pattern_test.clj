(ns cljc.pattern-test
  (:use clojure.test
        cljc.test
        cljc.driver))

(deftest re-seq
  (testing "re-seq"
    (is (= (core-run '(pr (re-seq (re-pattern "foo") "foo"))) [["foo"]]))
    (is (= (core-run '(pr (re-seq (re-pattern "\\d") "123"))) [["1" "2" "3"]]))
    (is (= (core-run '(pr (re-seq (re-pattern "(\\d)2") "122232")))
           [[["12" "1"]
             ["22" "2"]
             ["32" "3"]]]))))

(def ^:private find-match-cases
  [["x" ""]
   ["x" "y"]
   ["xy" "x"]
   ["x" "x"]
   ["x" "yx"]
   ["x" "yxy"]])

(deftest re-find
  (testing "re-find"
    (doseq [[re s] find-match-cases]
      (is (= (core-run `(pr (re-find (re-pattern ~re) ~s)))
             [(clojure.core/re-find (re-pattern re) s)])))))

(deftest re-matches
  (testing "re-matches"
    (doseq [[re s] find-match-cases]
      (is (= (core-run `(pr (re-matches (re-pattern ~re) ~s)))
             [(clojure.core/re-matches (re-pattern re) s)])))))

(defmacro ^:private test-re-partition []
  (let [tests (for [[re s expected] [["-" "" ()]
                                     ["-" "-" ["" "-"]]
                                     ["-" "x-" ["x" "-"]]
                                     ["-" "-x" ["" "-" "x"]]
                                     ["-" "-x" ["" "-" "x"]]
                                     ["-" "x-y-z" ["x" "-" "y" "-" "z"]]
                                     ["x(y)" "xyy" ["" ["xy" "y"] "y"]]
                                     ]]
                `(is (= (core-run '(pr (cljc.core/re-partition (re-pattern ~re) ~s)))
                        [~expected])))]
    `(do ~@tests)))

(deftest re-partition
  (testing "re-partition"
    (test-re-partition)))

(use-fixtures :once (cljc-once-fixture :c))
