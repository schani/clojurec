(ns cljc.pattern-test
  (:use clojure.test
        cljc.driver))

(defn- run [x]
  (run-expr 'cljc.pattern-test false x))

(defn- core-run [x]
  (run-expr 'cljc.pattern-test true x))

(defmacro run-and-print [& exprs]
  `(run '(do ~@(map #(list 'cljc.core/print %) exprs))))

(defmacro core-run-and-print [& exprs]
  `(core-run '(do ~@(map #(list 'println %) exprs))))

(deftest re-seq
  (testing "re-seq"
    (is (= (core-run '(pr (re-seq (re-pattern "") "foo"))) [["" "" ""]]))
    (is (= (core-run '(pr (re-seq (re-pattern "foo") "foo"))) [["foo"]]))
    (is (= (core-run '(pr (re-seq (re-pattern "\\d") "123"))) [["1" "2" "3"]]))
    (is (= (core-run '(pr (re-seq (re-pattern "(\\d)2") "122232")))
           [[["12" "1"]
             ["22" "2"]
             ["32" "3"]]]))))

(def ^:private find-match-cases
  [["" "x"]
   ["x" ""]
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

(use-fixtures :once (fn [f] (clean-default-run-dir true) (f)))
