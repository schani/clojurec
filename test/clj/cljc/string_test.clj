(ns cljc.string-test
  (:use clojure.test
        cljc.driver))

(defn- run [x]
  (run-expr 'cljc.string-test false x))

(defn- core-run [x]
  (run-expr 'cljc.string-test true x))

(defmacro run-and-print [& exprs]
  `(run '(do ~@(map #(list 'cljc.core/print %) exprs))))

(defmacro core-run-and-print [& exprs]
  `(core-run '(do ~@(map #(list 'println %) exprs))))

(deftest reverse
  (testing "reverse"
    (is (= (core-run '(pr (cljc.string/reverse "oof"))) ["foo"]))
    (is (= (core-run '(pr (cljc.string/reverse ""))) [""]))))

(deftest escape
  (testing "escape"
    (is (= (core-run '(pr (cljc.string/escape "" {}))) [""]))
    (is (= (core-run '(pr (cljc.string/escape "" {\x \1 \y \2 \z \3}))) [""]))
    (is (= (core-run '(pr (cljc.string/escape "xyz" {}))) ["xyz"]))
    (is (= (core-run '(pr (cljc.string/escape "xyz" {\a \1 \b \2 \c \3}))) ["xyz"]))
    (is (= (core-run '(pr (cljc.string/escape "xyzabc" {\a \1 \b \2 \c \3}))) ["xyz123"]))
    (is (= (core-run '(pr (cljc.string/escape "xyz" {\x \1 \y \2 \z \3}))) ["123"]))))

(deftest lower-case
  (testing "lower-case"
    (is (= (core-run '(pr (cljc.string/lower-case ""))) [""]))
    (is (= (core-run '(pr (cljc.string/lower-case "x"))) ["x"]))
    (is (= (core-run '(pr (cljc.string/lower-case "X"))) ["x"]))
    (is (= (core-run '(pr (cljc.string/lower-case "eXcItInG"))) ["exciting"]))))

(deftest upper-case
  (testing "upper-case"
    (is (= (core-run '(pr (cljc.string/upper-case ""))) [""]))
    (is (= (core-run '(pr (cljc.string/upper-case "X"))) ["X"]))
    (is (= (core-run '(pr (cljc.string/upper-case "x"))) ["X"]))
    (is (= (core-run '(pr (cljc.string/upper-case "eXcItInG"))) ["EXCITING"]))))

(deftest capitalize
  (testing "capitalize"
    (is (= (core-run '(pr (cljc.string/capitalize ""))) [""]))
    (is (= (core-run '(pr (cljc.string/capitalize "X"))) ["X"]))
    (is (= (core-run '(pr (cljc.string/capitalize "x"))) ["X"]))
    (is (= (core-run '(pr (cljc.string/capitalize "eXcItInG"))) ["Exciting"]))))

(deftest blank?
  (testing "blank?"
    (is (= (core-run '(pr (cljc.string/blank? nil))) [true]))
    (is (= (core-run '(pr (cljc.string/blank? ""))) [true]))
    (is (= (core-run '(pr (cljc.string/blank? " \t\n\r"))) [true]))
    (is (= (core-run '(pr (cljc.string/blank? "x"))) [false]))))

(deftest triml
  (testing "triml"
    (is (= (core-run '(pr (cljc.string/triml ""))) [""]))
    (is (= (core-run '(pr (cljc.string/triml " \t\n\r"))) [""]))
    (is (= (core-run '(pr (cljc.string/triml " \t\n\rx"))) ["x"]))
    (is (= (core-run '(pr (cljc.string/triml "x \t\n\r"))) ["x \t\n\r"]))
    (is (= (core-run '(pr (cljc.string/triml " \t\n\rx \t\n\r"))) ["x \t\n\r"]))))

(deftest trimr
  (testing "trimr"
    (is (= (core-run '(pr (cljc.string/trimr ""))) [""]))
    (is (= (core-run '(pr (cljc.string/trimr " \t\n\r"))) [""]))
    (is (= (core-run '(pr (cljc.string/trimr "x \t\n\r"))) ["x"]))
    (is (= (core-run '(pr (cljc.string/trimr " \t\n\rx"))) [" \t\n\rx"]))
    (is (= (core-run '(pr (cljc.string/trimr " \t\n\rx \t\n\r"))) [" \t\n\rx"]))))

(deftest trim
  (testing "trim"
    (is (= (core-run '(pr (cljc.string/trim ""))) [""]))
    (is (= (core-run '(pr (cljc.string/trim " \t\n\r"))) [""]))
    (is (= (core-run '(pr (cljc.string/trim " \t\n\rx"))) ["x"]))
    (is (= (core-run '(pr (cljc.string/trim "x \t\n\r"))) ["x"]))
    (is (= (core-run '(pr (cljc.string/trim " \t\n\rx \t\n\r"))) ["x"]))))

(deftest trim-newline
  (testing "trim-newline"
    (is (= (core-run '(pr (cljc.string/trim-newline ""))) [""]))
    (is (= (core-run '(pr (cljc.string/trim-newline "\r"))) [""]))
    (is (= (core-run '(pr (cljc.string/trim-newline "\n"))) [""]))
    (is (= (core-run '(pr (cljc.string/trim-newline "\n\r"))) [""]))
    (is (= (core-run '(pr (cljc.string/trim-newline "\r\n"))) [""]))
    (is (= (core-run '(pr (cljc.string/trim-newline " \t\n\r"))) [" \t"]))))

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

(use-fixtures :once (fn [f] (clean-default-run-dir true) (f)))
