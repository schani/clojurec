(ns clojurec.pattern-test
  (:use clojure.test
        clojurec.core))

(defn- run [x]
  (run-expr 'clojurec.core-test false x))

(defn- core-run [x]
  (run-expr 'clojurec.core-test true x))

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

(deftest re-find
  (testing "re-find"
    (is (= (core-run '(pr (re-find (re-pattern "") "") [""]))))
    (is (= (core-run '(pr (re-find (re-pattern "") "foo") [""]))))
    (is (= (core-run '(pr (re-find (re-pattern "foo") "") [nil]))))
    (is (= (core-run '(pr (re-find (re-pattern "foo") "bar") [nil]))))
    (is (= (core-run '(pr (re-find (re-pattern "foo") "foo") ["foo"]))))
    (is (= (core-run '(pr (re-find (re-pattern "barfoo") "foo") ["foo"]))))
    (is (= (core-run '(pr (re-find (re-pattern "barfoobar") "foo") ["foo"]))))))

(deftest re-matches
  (testing "re-matches"
    (is (= (core-run '(pr (re-matches (re-pattern "") "") [""]))))
    (is (= (core-run '(pr (re-matches (re-pattern "") "foo") [nil]))))
    (is (= (core-run '(pr (re-matches (re-pattern "foo") "") [nil]))))
    (is (= (core-run '(pr (re-matches (re-pattern "foo") "bar") [nil]))))
    (is (= (core-run '(pr (re-matches (re-pattern "foo") "foo") ["foo"]))))
    (is (= (core-run '(pr (re-matches (re-pattern "barfoo") "foo") [nil]))))
    (is (= (core-run '(pr (re-matches (re-pattern "barfoobar") "foo") [nil]))))))

(use-fixtures :once (fn [f] (clean-default-run-dir true) (f)))
