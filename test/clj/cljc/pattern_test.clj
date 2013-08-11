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

(defmacro ^:private test-split [s pattern limit expected]
  `(is (= (core-run '(pr (cljc.string/split ~s (re-pattern ~pattern) ~limit)))
          [~expected])))

(deftest split
  (testing "split"
    (test-split "x_y_z" "/" 0 ["x_y_z"])
    (test-split "_" "_" 0 [])
    (test-split "_x" "_" 0 ["" "x"])
    (test-split "x_" "_" 0 ["x"])
    (test-split "x_" "_" -1 ["x" ""])
    (test-split "_x_" "_" 0 ["" "x"])
    (test-split "_x_" "_" -1 ["" "x" ""])
    (test-split "x_y_z" "_" 0 ["x" "y" "z"])
    (test-split "x_y_z" "_" -1 ["x" "y" "z"])
    (test-split "x_y_z" "_" 3 ["x" "y" "z"])
    (test-split "x__y__z" "_" 0 ["x" "" "y" "" "z"])
    (test-split "x_y_z" "." 0 [])
    (test-split "x_y_z" "." 2 ["" "_y_z"])
    (test-split "x_y_z" "_" 2 ["x" "y_z"])
    (test-split "x1y2z3" "\\d" -1 ["x" "y" "z" ""])
    (test-split "x1y234z5" "\\d" -1 ["x" "y" "" "" "z" ""])
    (test-split "x1y234z5" "\\d+" -1 ["x" "y" "z" ""])))

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

(deftest replace
  (testing "replace"
    (is (= (core-run '(pr (cljc.string/replace "" (re-pattern "y") ""))) [""]))
    (is (= (core-run '(pr (cljc.string/replace "x" (re-pattern "y") ""))) ["x"]))
    (is (= (core-run '(pr (cljc.string/replace "x" (re-pattern "x") "y"))) ["y"]))
    (is (= (core-run '(pr (cljc.string/replace "x" (re-pattern "x") ""))) [""]))
    (is (= (core-run '(pr (cljc.string/replace "xyz" (re-pattern ".") ""))) [""]))

    (is (= (core-run '(pr (cljc.string/replace
                           "wxyz" (re-pattern "(.)(.)") "$2$1"))) ["xwzy"]))
    (is (= (core-run '(pr (cljc.string/replace
                           "wxyz" (re-pattern "(.)(.)")
                           (cljc.string/re-quote-replacement "$2$1"))
                          ["$2$1"]))))))

(use-fixtures :once (cljc-once-fixture :both))
