(ns cljc.string-test
  (:use clojure.test
        cljc.test
        cljc.driver))

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

(deftest split-lines
  (testing "split-lines"
    (is (= (core-run '(pr (cljc.string/split-lines "x"))) [["x"]]))
    (is (= (core-run '(pr (cljc.string/split-lines "x\n"))) [["x"]]))
    (is (= (core-run '(pr (cljc.string/split-lines "x\r\n"))) [["x"]]))
    (is (= (core-run '(pr (cljc.string/split-lines "x\ny"))) [["x" "y"]]))
    (is (= (core-run '(pr (cljc.string/split-lines "x\r\ny"))) [["x" "y"]]))
    (is (= (core-run '(pr (cljc.string/split-lines "x\ny\n"))) [["x" "y"]]))
    (is (= (core-run '(pr (cljc.string/split-lines "x\r\ny\r\n"))) [["x" "y"]]))))

(deftest index-of
  (testing "index-of"
    (is (= (core-run '(pr (cljc.string/index-of "" ""))) [0]))
    (is (= (core-run '(pr (cljc.string/index-of "" "" 0))) [0]))
    (is (= (core-run '(pr (cljc.string/index-of "" "" 1))) [0]))
    (is (= (core-run '(pr (cljc.string/index-of "x" "" 1))) [1]))
    (is (= (core-run '(pr (cljc.string/index-of "x" "" 2))) [1]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" ""))) [0]))
    (is (= (core-run '(pr (cljc.string/index-of "" "xyz"))) [nil]))
    (is (= (core-run '(pr (cljc.string/index-of "x" "xyz"))) [nil]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "xyz"))) [0]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz..." "xyz"))) [0]))
    (is (= (core-run '(pr (cljc.string/index-of "...xyz" "xyz"))) [3]))
    (is (= (core-run '(pr (cljc.string/index-of "...xyz..." "xyz"))) [3]))
    (is (= (core-run '(pr (cljc.string/index-of "xy" "xyz"))) [nil]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "a"))) [nil]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "y" 0))) [1]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "y" -1))) [1]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "y" 2))) [nil]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "z" 2))) [2]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "z" 3))) [nil]))
    (is (= (core-run '(pr (cljc.string/index-of "xyz" "z" 100))) [nil]))))

(deftest replace
  (testing "replace"
    (is (= (core-run '(pr (cljc.string/replace "" \x \y))) [""]))
    (is (= (core-run '(pr (cljc.string/replace "xyx" \x \y))) ["yyy"]))
    (is (= (core-run '(pr (cljc.string/replace "xyx" \y \x))) ["xxx"]))

    (is (= (core-run '(pr (cljc.string/replace "" "" ""))) [""]))
    (is (= (core-run '(pr (cljc.string/replace "x" "x" ""))) [""]))
    (is (= (core-run '(pr (cljc.string/replace "xyz" "" "-"))) ["-x-y-z-"]))
    (is (= (core-run '(pr (cljc.string/replace "xyxyxy" "x" "z"))) ["zyzyzy"]))
    (is (= (core-run '(pr (cljc.string/replace "xyx" "x" "zz"))) ["zzyzz"]))
    (is (= (core-run '(pr (cljc.string/replace "xyx" "y" "zz"))) ["xzzx"]))
    (is (= (core-run '(pr (cljc.string/replace "x" "" ""))) ["x"]))
    (is (= (core-run '(pr (cljc.string/replace "x" "y" ""))) ["x"]))))

(use-fixtures :once (cljc-once-fixture :c))
