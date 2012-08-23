(ns clojurec.core-test
  (:require [clojure.java.io :as io])
  (:use clojure.test
        clojurec.core))

(defn- run [x]
  (run-expr 'clojurec.core-test false x))

(defn- core-run [x]
  (run-expr 'clojurec.core-test true x))

(defmacro run-and-print [& exprs]
  `(run '(do ~@(map #(list 'cljc.core/print %) exprs))))

(defmacro core-run-and-print [& exprs]
  `(core-run '(do ~@(map #(list 'print %) exprs))))

(deftest basic
  (testing "very basic stuff"
    (is (= (run '(cljc.core/print nil)) [nil]))
    (is (= (run '(cljc.core/print (has-type? 1 Integer))) [true]))
    (is (= (run '(def heusler (fn* ([x] x)))) []))
    (is (= (run '(cljc.core/print (let [a 1 a a] a))) [1]))
    (is (= (run '(cljc.core/print (let [a 1 a (+ a 1) a (+ a 1)] a))) [3]))
    (is (= (run '(cljc.core/print (((fn* ([x] (fn* ([y] x)))) 1) 2))) [1]))
    (is (= (run '(do (cljc.core/print 1) (cljc.core/print 2))) [1 2]))
    (is (= (run '(def transient nil)) []))
    (is (= (run '(letfn [(dispatch [x]
                           (if (<= x 1)
                             0
                             (+ 1
                                (if (< (bit-and x 1) 1)
                                  (decrease x)
                                  (increase x)))))
                         (decrease [x]
                           (dispatch (bit-shift-right x 1)))
                         (increase [x]
                           (dispatch (+ x 1)))]
                   (cljc.core/print (dispatch 9))))
           [7]))))

(deftest protocols
  (testing "protocols"
    (is (= (run '(defprotocol* foo (-bar [x y]))) []))
    (is (= (run '(defprotocol foo (-bar [x y]))) []))
    (is (= (run '(let [x (fn [] 1)]
			(cljc.core/print (. x (-invoke)))))
	   [1]))))

(deftest types
  (testing "deftype"
    (is (= (run '(deftype* Cons [first rest])) []))
    (is (= (core-run '(do
                        (deftype Bla [^:mutable x y])
                        (let [b (Bla. 1 2)]
                          (set! (.-x b) 3)
                          (pr (.-x b) (.-y b)))))
           [3 2]))))

(deftest types-protocols
  (testing "types with protocols"
    (is (= (run '(do
		   (defprotocol ISeq
		     (-first [coll])
		     (-rest [coll]))
		   (deftype Cons [first rest]
		     ISeq
		     (-first [coll] first)
		     (-rest [coll] rest))
		   (let [c (Cons. 1 2)]
		     (cljc.core/print (. c -first))
		     (cljc.core/print (. c -rest)))))
	   [1 2]))
    (is (= (core-run '(deftype Bla []
                        ICounted
                        (-count [_] 0)))
           []))
    (is (= (core-run '(deftype Bla []
                        ICounted
                        (-count ([_] 0))))
           []))
    (is (= (core-run '(do
                        (deftype Bla [])
                        (extend-type Bla
                          ICounted
                          (-count [_] 0))))
           []))
    (is (= (core-run '(do
                        (deftype Bla [])
                        (extend-type Bla
                          ICounted
                          (-count ([_] 0)))))
           []))
    (is (= (core-run '(do
			(deftype Bla [a b c d e f g]
			  ISeqable
			  (-seq [_] (list a b c d e f g)))
			(pr (seq (Bla. 1 2 3 4 5 6 7)))))
	   ['(1 2 3 4 5 6 7)]))
    (is (= (core-run '(do
			(deftype Bla [a b c])
			(let [x (Bla. 1 2 3)]
			  (pr (.-a x) (.-b x) (.-c x)))))
	   [1 2 3]))
    (is (= (core-run '(do
			(defprotocol IBla
			  (-x [o]))
			(deftype Bla [x y]
			  IBla
			  (-x [_] (inc y)))
			(let [x (Bla. 1 2)]
			  (pr (. x -x) (. x -y) (. x (-x))))))
	   [1 2 3]))
    (is (= (core-run '(do
			(deftype Bla [x y])
			(deftype Blu [y z])
			(let [a (Bla. 1 2)
			      u (Blu. 3 4)]
			  (pr (.-x a) (.-y a)
			      (.-y u) (.-z u)))))
	   [1 2 3 4]))
    (is (= (core-run '(do
			(defprotocol IFoo
			  (-foo [o r]))
			(deftype Bar []
			  IFoo
			  (-foo [o _] (pr 1)))
			(deftype Baz [x]
			  IFoo
			  (-foo [o r]
				(pr 2)
				(when r
				  (pr " ")
				  (-foo x false))))
			(-foo (Baz. (Bar.)) true)))
	   [2 1]))
    (is (= (core-run '(do
			(defprotocol IGet
			  (-get [o]))
			(deftype Getter [x]
			  IGet
			  (-get [o]
				((fn [o] x)
				 (Getter. 345))))
			(pr (-get (Getter. 123)))))
	   [123]))
    (is (= (core-run '(do
                        (defprotocol IFoo
                          (-foo [o]))
                        (deftype Bar [^:mutable x]
                          IFoo
                          (-foo [o] (set! x (inc x))))
                        (let [o (Bar. 0)]
                          (print (-foo o))
                          (print (-foo o))
                          (print (-foo o)))))
           [1 2 3]))))

(deftest numbers
  (testing "simple numbers"
    (is (= (core-run-and-print (+)
                               (+ 1)
                               (+ 1.0)
                               (+ 1 2)
                               (+ 1 2.0)
                               (+ 1.0 2.0)
                               (+ 1.0 2.0 4)
                               (- 1)
                               (- 1.0)
                               (- 1 2)
                               (- 1 2 3)
                               (- 1 2.0 3))
           [0 1 1.0 3 3.0 3.0 7.0 -1 -1.0 -1 -4 -4.0]))

    (is (= (core-run-and-print (*)
                               (* 1)
                               (* 1.0)
                               (* 1 2)
                               (* 1 2 3)
                               (* 1 2 3.0))
           [1 1 1.0 2 6 6.0]))
    
    (is (= (core-run-and-print (apply + ())
                               (apply + '(1))
                               (apply + '(1 2))
                               (apply + '(1 2.0))
                               (apply - '(1 2 3))
                               (apply - '(1 2.0 3))
                               (apply * '())
                               (apply * '(1 2 3))
                               (apply * '(1 2 3.0)))
           [0 1 3 3.0 -4 -4.0 1 6 6.0]))

    (is (= (core-run-and-print (zero? nil)
                               (zero? 0)
                               (zero? 1)
                               (zero? 0.0)
                               (zero? 1.0)
                               (float? 1.0)
                               (float? 1))
           [false true false true false true false]))

    (is (= (core-run-and-print (< 1 2)
                               (< 1 1)
                               (< 1.0 1)
                               (< 2 1)
                               (< 2 1.0)
                               (> 2 1.0)
                               (>= 2 1)
                               (>= 2 1.0))
           [true false false false false true true true]))
    
    (is (= (core-run-and-print (dec 1)
                               (inc 1))
	   [0 2]))))

(deftest bit-ops
  (testing "primitive low level bit ops"
    (is (= (core-run-and-print (bit-and 1 0)
                               (bit-and 0 0)
                               (bit-and 1 1)
                               (bit-and 42 1)
                               (bit-and 41 1)
                               (bit-or 1 0)
                               (bit-or 0 0)
                               (bit-or 1 1)
                               (bit-or 42 1)
                               (bit-or 41 1)
                               (bit-and-not 1 0)
                               (bit-and-not 0 0)
                               (bit-and-not 1 1)
                               (bit-and-not 42 1)
                               (bit-and-not 41 1))
           [0 0 1 0 1 1 0 1 43 41 1 0 0 42 40]))

    (is (= (core-run-and-print (bit-clear 1 0)
                               (bit-clear 2 0)
                               (bit-clear 1000 5)
                               (bit-clear 16713 6)
                               (bit-clear 1024 10)
                               (bit-flip 1 0)
                               (bit-flip 2 1)
                               (bit-flip 1000 3)
                               (bit-flip 16713 11)
                               (bit-flip 1024 10)
                               (bit-not 1)
                               (bit-not 2)
                               (bit-not -1000)
                               (bit-not 16713)
                               (bit-not 1024))
           [0 2 968 16649 0 0 0 992 18761 0 -2 -3 999 -16714 -1025]))

    (is (= (core-run-and-print (bit-set 1 0)
                               (bit-set 2 1)
                               (bit-set 1000 3)
                               (bit-set 16713 11)
                               (bit-set 1024 10)
                               (bit-test 1 0)
                               (bit-test 2 1)
                               (bit-test 1000 3)
                               (bit-test 16713 11)
                               (bit-test 1024 10))
           [1 2 1000 18761 1024 true true true false true]))))

(deftest symbols
  (testing "symbols and keywords"
    (is (= (run-and-print (identical? 'a 'a)
                          (identical? 'a 'b)
                          (identical? :a :a)
                          (identical? :a :b)
                          (identical? :a 'a))
           [true false true false false]))
    (is (= (core-run-and-print (= 'a 'a)
                               (= 'a 'b)
                               (= :a :a)
                               (= :a :b)
                               (= :a 'a))
           [true false true false false]))
    (is (= (core-run-and-print (symbol? 'a)
                               (symbol? :a)
                               (symbol? "a")
                               (keyword? :a)
                               (keyword? 'a)
                               (keyword? ":a"))
           [true false false true false false]))
    (is (= (core-run '(do
			(pr (get {:a 1 :b 2 :c 3} :b)
			    (= (assoc {} :a 1 :b 2 :c 3) (assoc {} :a 1 :b 2 :c 3)))))
	   [2 true]))))

(deftest constants
  (testing "constants"
    (is (= (core-run '(pr '(1 2)
			  (let [m '{3 4 5 6}]
			    (list (keys m) (vals m)))
			  (map identity '#{7 8})))
	   '[(1 2) ((3 5) (4 6)) (7 8)]))))

(deftest loops
  (testing "simple loops"
    (is (= (run '(loop [i 2
			x 1]
		   (if (< i 11)
		     (recur (+ i 1) (* x i))
		     (cljc.core/print x))))
	   [3628800]))))

(deftest dynamic
  (testing "dynamic vars and binding"
    (is (= (core-run '(do
                        (def ^:dynamic *x* 1)
                        (defn print-x []
                          (cljc.core/print *x*))
                        (print-x)
                        (try
                          (binding [*x* (+ *x* 1)]
                            (print-x)
                            (binding [*x* (+ *x* 1)]
                              (print-x)
                              (throw (Exception. "bla"))))
                          (catch Exception _
                            (print-x)))
                        (print-x)))
           [1 2 3 1 1]))))

(deftest exceptions
  (testing "exception handling"
    (is (= (run '(cljc.core/print (try
                                    123
                                    (finally
                                     (cljc.core/print 345)))))
           [345 123]))
    (is (= (core-run '(pr (try
                            (throw (Exception. 123))
                            (catch Exception e
                              (.-info e))
                            (finally
                             (pr 345 " ")))))
           [345 123]))
    (is (= (core-run '(pr (try
                            (try
                              (throw (Exception. 123))
                              (catch Cons _
                                (pr 0))
                              (finally
                               (pr 345 " ")))
                            (catch Exception e
                              (.-info e))
                            (finally
                             (pr 567 " ")))))
           [345 567 123]))
    (is (= (core-run '(try
                        (loop [i 2
                               x 1]
                          (if (< i 11)
                            (recur (+ i 1) (* x i))
                            (throw (Exception. x))))
                        (catch Exception e
                          (cljc.core/print (.-info e)))))
           [3628800]))))

(deftest core
  (testing "cljc.core"
    (is (= (core-run '(let [c (Cons. 1 2 nil)]
			(print (. c -first))
			(print (. c -rest))))
	   [1 2]))
    (is (= (core-run '(loop [l (cons 1 (cons 2 nil))]
			(when (seq l)
			  (print (first l))
			  (recur (rest l)))))
	   [1 2]))
    (is (= (core-run '(loop [l '(1 2 3)]
			(when (seq l)
			  (print (first l))
			  (recur (rest l)))))
	   [1 2 3]))
    (is (= (core-run '(loop [l (reverse '(1 2 3))]
			(when (seq l)
			  (print (first l))
			  (recur (rest l)))))
	   [3 2 1]))
    (is (= (core-run '(print (count '(0 0 0)))) [3]))
    (is (= (core-run '(loop [l (flatten-tail '(1 2 (3 4)))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [1 2 3 4]))
    (is (= (core-run '(loop [l (concat '(1) '(2 3) '(4 5 6) () '(7))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [1 2 3 4 5 6 7]))
    (is (= (core-run '(loop [l (interpose 0 '(1 2 3))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [1 0 2 0 3]))
    (is (= (core-run '(loop [l (flatten1 '((1 2 3) (4 5) (6)))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [1 2 3 4 5 6]))
    (is (= (core-run '(loop [l (map inc '(1 2 3))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [2 3 4]))
    (is (= (core-run '(loop [l (map + '(1 2 3) '(8 1 2))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [9 3 5]))
    (is (= (core-run '(loop [l (map + '(1 2 3) '(8 1 2) '(8 3 7))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [17 6 12]))
    (is (= (core-run '(loop [l (map + '(1 2 3) '(8 1 2) '(8 3 7) '(-4 -6 -2))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [13 0 10]))
    (is (= (core-run '(print (-count nil))) [0]))
    (is (= (core-run '(let [v ["A" "B" "C"] vm (with-meta v {:a 33})] (pr ((meta vm) :a))))
           [33]))
    (is (= (core-run '(pr (filter #(> % 3) (list 1 2 3 4 5))))
           ['(4 5)]))
    (is (= (core-run '(do
                        (pr "\"")
                        (pr (str \a))
                        (pr " ")
                        (pr (str 'abc))
                        (pr " ")
                        (pr (str :abc))
                        (pr " ")
                        (pr (str :abc 'def \g "hi"))
                        (pr "\"")))
           ["a abc :abc :abcdefghi"]))
    (is (= (core-run '(assert true))
           []))
    (is (= (core-run '(assert false))
           :run-error))))

(deftest arrays
  (testing "arrays"
    (is (= (core-run '(print (make-array 3))) [[nil nil nil]]))
    (is (= (core-run '(let [a (make-array 3)]
                        (aset a 0 1)
                        (aset a 1 2)
                        (aset a 2 3)
                        (print a)))
           [[1 2 3]]))
    (is (= (core-run '(let [a (make-array 3)]
                        (aset a 0 1)
                        (aset a 1 2)
                        (aset a 2 3)
                        (print (aget a 0))
                        (print (aget a 1))
                        (print (aget a 2))))
           [1 2 3]))
    (is (= (core-run '(print (-count (make-array 3))))
           [3]))))

(deftest strings
  (testing "strings and chars"
    (is (= (run '(c* "puts (string_get_utf8 (~{}))" "abc"))
           ['abc]))
    (is (= (core-run '(pr (seq "abc")))
           ['(\a \b \c)]))
    (is (= (core-run-and-print (string? "abc")
                               (string? 'abc)
                               (string? :abc)
                               (string? \a)
                               (char? \a)
                               (char? "a"))
           [true false false false true false]))))

(deftest printing
  (testing "printing"
    (is (= (core-run '(string-print "abc"))
           ['abc]))
    (is (= (core-run '(do
                        (pr true false) (pr " ")
                        (pr -1 0 1) (pr " ")
                        (pr "a" "b") (pr " ")
                        (pr :a :b) (pr " ")
                        (pr 'a 'b) (pr " ")
                        (pr \a \b) (pr " ")
                        (pr '(1 2 3)) (pr " ")
                        (pr (make-array 2)) (pr " ")
                        (pr [1 2]) (pr " ")
                        (pr {:a 1}) (pr " ")
                        (pr #{1 2 3})))
           [true false
            -1 0 1
            'a 'b
            :a :b
            'a 'b
            \a \b
            '(1 2 3)
            [nil nil]
            [1 2]
            {:a 1}
            #{1 2 3}]))))

(deftest equality
  (testing "equality"
    (is (= (core-run '(pr (= true true)
                          (= false false)
                          (= true false)
                          (= false true)
                          (= false nil)
                          (= false 0)))
           [true true false false false false]))
    (is (= (core-run '(pr (= 1 1)
                          (= 1 2)
                          (= 0 false)
                          (= 0 nil)))
           [true false false false]))
    (is (= (core-run '(pr (= () ())
                          (= nil nil)
                          (= () nil)
                          (= nil ())))
           [true true false false]))
    (is (= (core-run '(pr (= "abc" "abc")
                          (= "abc" "def")))
           [true false]))
    (is (= (core-run '(pr (= '(1 2 3) '(1 2 3))
                          (= '(nil nil nil) (seq (make-array 3)))))
           [true true]))))

(deftest hashing
  (testing "object hashing"
    (is (= (core-run-and-print (hash \a)
			       (hash 2354)
			       (hash nil)
			       (hash '())
			       (hash false)
			       (hash true)
			       (hash 0)
			       (hash "")
                               (hash :a)
                               (hash 'a))
           [97 2354 0 0 0 1 0 0 4093931314 4093931313]))))

(deftest sets
  (testing "sets"
    (is (= (core-run '(pr (contains? nil 123)))
           [false]))
    (is (= (core-run '(pr (conj (conj (conj (conj (set ()) 1) 2) 3) 1)))
           [#{1 2 3}]))
    (is (= (core-run '(pr (disj (set '(1 2 2 3)) 2)))
           [#{1 3}]))
    (is (= (core-run '(pr (get (set '(1 2 3)) 1)
                          (get (set '(1 2 3)) 4)
                          (get (set '(1 2 3)) 4 5)))
           [1 nil 5]))
    (is (= (core-run '(pr ((set '(1 2 3)) 1)
                          ((set '(1 2 3)) 4)
                          ((set '(1 2 3)) 4 5)))
           [1 nil 5]))
    (is (= (core-run '(pr
                       (distinct? 1 2 3 1)
                       (distinct? 1 2 3)))
           [false true]))))

(deftest functions
  (testing "functions"
    (is (= (run '(cljc.core/print ((fn fac [x]
                                     (if (< x 2)
                                       x
                                       (* x (fac (- x 1)))))
                                   3)))
           [6]))
    (is (= (core-run '(do
                        (defn fac [x]
                          (if (< x 2)
                            x
                            (* x (fac (- x 1)))))
                        (print (fac 3))))
           [6]))
    (is (= (core-run '(apply (fn [& r] r) '())) []))
    (is (= (core-run '(do
			(defn printer [a b c d e]
			  (print a)
			  (print b)
			  (print c)
			  (print d)
			  (print e))
			(printer 1 2 3 4 5)))
	   [1 2 3 4 5]))
    (is (= (core-run '(loop [l (apply (fn [& r] r) 1 2 '(3 4))]
                        (when (seq l)
                          (print (first l))
                          (recur (rest l)))))
           [1 2 3 4]))
    (is (= (core-run '(do
                        (defn m
                          ([] 0)
                          ([x] x)
                          ([x y] (+ x y))
                          ([x & r] (+ x (apply m r))))
                        (print (m))
                        (print (m 1))
                        (print (m 1 2))
                        (print (m 1 2 3))))
           [0 1 3 6]))
    (is (= (core-run '(do
			(defn print-list [l]
			  (loop [l l]
			    (when (seq l)
			      (print (first l))
			      (recur (rest l)))))
			(defn printer0 [& r]
			  (print 0)
			  (print-list r))
			(defn printer1 [a & r]
			  (print a)
			  (print 0)
			  (print-list r))
			(defn printer2 [a b & r]
			  (print a)
			  (print b)
			  (print 0)
			  (print-list r))
			(defn printer3 [a b c & r]
			  (print a)
			  (print b)
			  (print c)
			  (print 0)
			  (print-list r))
			(defn printer4 [a b c d & r]
			  (print a)
			  (print b)
			  (print c)
			  (print d)
			  (print 0)
			  (print-list r))
			(defn printer5 [a b c d e & r]
			  (print a)
			  (print b)
			  (print c)
			  (print d)
			  (print e)
			  (print 0)
			  (print-list r))
			(defn p0 [p] (p) (print -1))
			(defn p1 [p] (p 1) (print -1))
			(defn p2 [p] (p 1 2) (print -1))
			(defn p3 [p] (p 1 2 3) (print -1))
			(defn p4 [p] (p 1 2 3 4) (print -1))
			(defn p5 [p] (p 1 2 3 4 5) (print -1))
			(defn p6 [p] (p 1 2 3 4 5 6) (print -1))
			(defn ap0 [p] (apply p '()) (print -1))
			(defn ap1 [p] (apply p '(1)) (print -1))
			(defn ap2 [p] (apply p '(1 2)) (print -1))
			(defn ap3 [p] (apply p '(1 2 3)) (print -1))
			(defn ap4 [p] (apply p '(1 2 3 4)) (print -1))
			(defn ap5 [p] (apply p '(1 2 3 4 5)) (print -1))
			(defn ap6 [p] (apply p '(1 2 3 4 5 6)) (print -1))
			(p0 printer0) (p1 printer0) (p2 printer0) (p3 printer0) (p4 printer0) (p5 printer0) (p6 printer0)
			(p1 printer1) (p2 printer1) (p3 printer1) (p4 printer1) (p5 printer1) (p6 printer1)
			(p2 printer2) (p3 printer2) (p4 printer2) (p5 printer2) (p6 printer2)
			(p3 printer3) (p4 printer3) (p5 printer3) (p6 printer3)
			(p4 printer4) (p5 printer4) (p6 printer4)
			(p5 printer5) (p6 printer5)
                        (ap0 printer0) (ap1 printer0) (ap2 printer0) (ap3 printer0) (ap4 printer0) (ap5 printer0) (ap6 printer0)
			(ap1 printer1) (ap2 printer1) (ap3 printer1) (ap4 printer1) (ap5 printer1) (ap6 printer1)
			(ap2 printer2) (ap3 printer2) (ap4 printer2) (ap5 printer2) (ap6 printer2)
			(ap3 printer3) (ap4 printer3) (ap5 printer3) (ap6 printer3)
			(ap4 printer4) (ap5 printer4) (ap6 printer4)
			(ap5 printer5) (ap6 printer5)))
	   [0 -1 0 1 -1 0 1 2 -1 0 1 2 3 -1 0 1 2 3 4 -1 0 1 2 3 4 5 -1 0 1 2 3 4 5 6 -1
	    1 0 -1 1 0 2 -1 1 0 2 3 -1 1 0 2 3 4 -1 1 0 2 3 4 5 -1 1 0 2 3 4 5 6 -1
	    1 2 0 -1 1 2 0 3 -1 1 2 0 3 4 -1 1 2 0 3 4 5 -1 1 2 0 3 4 5 6 -1
	    1 2 3 0 -1 1 2 3 0 4 -1 1 2 3 0 4 5 -1 1 2 3 0 4 5 6 -1
	    1 2 3 4 0 -1 1 2 3 4 0 5 -1 1 2 3 4 0 5 6 -1
	    1 2 3 4 5 0 -1 1 2 3 4 5 0 6 -1
            0 -1 0 1 -1 0 1 2 -1 0 1 2 3 -1 0 1 2 3 4 -1 0 1 2 3 4 5 -1 0 1 2 3 4 5 6 -1
	    1 0 -1 1 0 2 -1 1 0 2 3 -1 1 0 2 3 4 -1 1 0 2 3 4 5 -1 1 0 2 3 4 5 6 -1
	    1 2 0 -1 1 2 0 3 -1 1 2 0 3 4 -1 1 2 0 3 4 5 -1 1 2 0 3 4 5 6 -1
	    1 2 3 0 -1 1 2 3 0 4 -1 1 2 3 0 4 5 -1 1 2 3 0 4 5 6 -1
	    1 2 3 4 0 -1 1 2 3 4 0 5 -1 1 2 3 4 0 5 6 -1
	    1 2 3 4 5 0 -1 1 2 3 4 5 0 6 -1]))))

(deftest io
  (testing "I/O"
    (let [filename (.getAbsolutePath (io/file (java.lang.System/getProperty "user.dir") "test" "words.txt"))]
      (is (= (core-run `(pr (slurp ~filename)))
             ['foo 'bar 'quux]))
      (is (= (core-run `(pr (~'split-string-seq (slurp ~filename) \newline)))
             ['(foo bar quux)])))))

(deftest programs
  (testing "somewhat useful programs"
    (is (= (let [filename (.getAbsolutePath (io/file (java.lang.System/getProperty "user.dir") "test" "english.0"))]
             (core-run (list 'do
                             '(defn remove-one [coll o]
                                (loop [rev ()
                                       coll (seq coll)]
                                  (if coll
                                    (let [f (first coll)]
                                      (if (= o f)
                                        (concat rev (next coll))
                                        (recur (cons f rev) (next coll))))
                                    rev)))

                             '(defn check-word [len chars word]
                                (and (= len (count word))
                                     (empty? (reduce remove-one word chars))))

                             `(pr (filter (fn [word] (check-word 5 "abcdefg" word))
                                          (~'split-string-seq (slurp ~filename) \newline))))))
           ['(badge caged faced)]))))

;;(run-tests *ns*)

(deftest array-copy
  (testing "Array copy"
    (is (= [3 8 1 0
            3 8 1 0
            3 8 nil nil
            3 3 8 1
            8 1 0 0]
           (core-run '(let [fill-array (fn [a b & bs]
                                         (loop [i 0 b b bs bs]
                                           (when (< i (alength a))
                                             (aset a i b)
                                             (recur (inc i) (first bs) (rest bs)))))
                            print-array (fn [a]
                                          (loop [i 0]
                                            (when (< i (alength a))
                                              (print (aget a i))
                                              (recur (inc i)))))
                            x (make-array 4)
                            y (make-array 4)
                            z (make-array 4)]
                        (fill-array x 3 8 1 0)

                        (print-array (aclone x))

                        (array-copy x y)
                        (print-array y)

                        (array-copy x z 2)
                        (print-array z)

                        (array-copy y 0 y 1 3)
                        (print-array y)

                        (array-copy x 1 x 0 3)
                        (print-array x)))))))

(deftest bit-operations
  (testing "Bit operations"
    (is (= [0 0 1 0 0 1]
           (core-run-and-print (bit-and 1 0)
                               (bit-and 0 0)
                               (bit-and 1 1)
                               (bit-and 42 1)
                               (apply bit-and '(42 1))
                               (bit-and 41 1))))
    (is (= [1 0 1 43 43 41]
           (core-run-and-print (bit-or 1 0)
                               (bit-or 0 0)
                               (bit-or 1 1)
                               (bit-or 42 1)
                               (apply bit-or '(42 1))
                               (bit-or 41 1))))
    (is (= [1 0 0 42 42 40]
           (core-run-and-print (bit-and-not 1 0)
                               (bit-and-not 0 0)
                               (bit-and-not 1 1)
                               (bit-and-not 42 1)
                               (apply bit-and-not '(42 1))
                               (bit-and-not 41 1))))
    (is (= [0 2 968 16649 16649 0]
           (core-run-and-print (bit-clear 1 0)
                               (bit-clear 2 0)
                               (bit-clear 1000 5)
                               (bit-clear 16713 6)
                               (apply bit-clear '(16713 6))
                               (bit-clear 1024 10))))
    (is (= [0 0 992 18761 18761 0]
           (core-run-and-print (bit-flip 1 0)
                               (bit-flip 2 1)
                               (bit-flip 1000 3)
                               (bit-flip 16713 11)
                               (apply bit-flip '(16713 11))
                               (bit-flip 1024 10))))
    (is (= [-2 -3 999 -16714 -16714 -1025]
           (core-run-and-print (bit-not 1)
                               (bit-not 2)
                               (bit-not -1000)
                               (bit-not 16713)
                               (apply bit-not '(16713))
                               (bit-not 1024))))
    (is (= [1 2 1000 18761 18761 1024]
           (core-run-and-print (bit-set 1 0)
                               (bit-set 2 1)
                               (bit-set 1000 3)
                               (bit-set 16713 11)
                               (apply bit-set '(16713 11))
                               (bit-set 1024 10))))
    (is (= [true true true false false true]
           (core-run-and-print (bit-test 1 0)
                               (bit-test 2 1)
                               (bit-test 1000 3)
                               (bit-test 16713 11)
                               (apply bit-test '(16713 11))
                               (bit-test 1024 10))))
    (is (= [2r10 2r100 2r1000 2r00101110 2r00101110 0 4294967296 65536]
           (core-run-and-print (bit-shift-left 2r1 1)
                               (bit-shift-left 2r1 2)
                               (bit-shift-left 2r1 3)
                               (bit-shift-left 2r00010111 1)
                               (apply bit-shift-left '(2r00010111 1))
                               (bit-shift-left 2r10 -1)
                               (bit-shift-left 1 32)
                               (bit-shift-left 1 10000))))
    (is (= [2r0 2r010 2r001 2r000 2r0001011 2r0001011 0 1 1]
           (core-run-and-print (bit-shift-right 2r1 1)
                               (bit-shift-right 2r100 1)
                               (bit-shift-right 2r100 2)
                               (bit-shift-right 2r100 3)
                               (bit-shift-right 2r00010111 1)
                               (apply bit-shift-right '(2r00010111 1))
                               (bit-shift-right 2r10 -1)
                               (bit-shift-right 4294967296 32)
                               (bit-shift-right 65536 10000))))))

(deftest array-chunk
  (testing "ArrayChunk"
    (is (= [2 1 2 3 nil 3 nil 5 5 0 0]
           (core-run '(let [a (doto (make-array 4)
                                (aset 0 1) (aset 1 2) (aset 2 3) (aset 3 4))
                            ac (array-chunk a 1 3)
                            ac2 (-drop-first ac)
                            ac3 (array-chunk a 1 1)]
                        (print (-count ac))
                        (print (-count ac2))
                        (print (-nth ac 0))
                        (print (-nth ac 1))
                        (print (-nth ac 2 nil))
                        (print (-nth ac2 0))
                        (print (-nth ac2 1 nil))
                        (print (reduce + ac))
                        (print (reduce + 0 ac))
                        (print (reduce + ac3))
                        (print (reduce + 0 ac3))))))))
