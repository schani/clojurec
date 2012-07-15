(ns clojurec.core-test
  (:require [clojure.java.io :as io])
  (:use clojure.test
        clojurec.core))

(defn- run [x]
  (run-expr 'clojurec.core-test false x))

(defn- core-run [x]
  (run-expr 'clojurec.core-test true x))

(deftest basic
  (testing "very basic stuff"
    (is (= (run '(cljc.core/print nil)) [nil]))
    (is (= (run '(cljc.core/print (has-type? 1 Integer))) [true]))
    (is (= (run '(def heusler (fn* ([x] x)))) []))
    (is (= (run '(cljc.core/print (let [a 1 a a] a))) [1]))
    (is (= (run '(cljc.core/print (((fn* ([x] (fn* ([y] x)))) 1) 2))) [1]))
    (is (= (run '(do (cljc.core/print 1) (cljc.core/print 2))) [1 2]))))

(deftest protocols
  (testing "protocols"
    (is (= (run '(defprotocol* foo (-bar [x y]))) []))
    (is (= (run '(defprotocol foo (-bar [x y]))) []))
    (is (= (run '(let [x (fn [] 1)]
			(cljc.core/print (. x (-invoke)))))
	   [1]))))

(deftest types
  (testing "deftype"
    (is (= (run '(deftype* Cons [first rest])) []))))

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
		   (let [c (Cons 1 2)]
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
			(pr (seq (Bla 1 2 3 4 5 6 7)))))
	   ['(1 2 3 4 5 6 7)]))
    (is (= (core-run '(do
			(deftype Bla [a b c])
			(let [x (Bla 1 2 3)]
			  (pr (.-a x) (.-b x) (.-c x)))))
	   [1 2 3]))
    (is (= (core-run '(do
			(defprotocol IBla
			  (-x [o]))
			(deftype Bla [x y]
			  IBla
			  (-x [_] (inc y)))
			(let [x (Bla 1 2)]
			  (pr (. x -x) (. x -y) (. x (-x))))))
	   [1 2 3]))
    (is (= (core-run '(do
			(deftype Bla [x y])
			(deftype Blu [y z])
			(let [a (Bla 1 2)
			      u (Blu 3 4)]
			  (pr (.-x a) (.-y a)
			      (.-y u) (.-z u)))))
	   [1 2 3 4]))))

(deftest numbers
  (testing "simple numbers"
    (is (= (run '(cljc.core/print (+ 1 2))) [3]))
    (is (= (run '(cljc.core/print (< 1 2))) [true]))
    (is (= (run '(cljc.core/print (< 1 1))) [false]))
    (is (= (run '(cljc.core/print (< 2 1))) [false]))
    (is (= (core-run '(do
			(print (dec 1))
			(print (inc 1))))
	   [0 2]))))

(deftest loops
  (testing "simple loops"
    (is (= (run '(loop [i 2
			x 1]
		   (if (< i 11)
		     (recur (+ i 1) (* x i))
		     (cljc.core/print x))))
	   [3628800]))))

(deftest core
  (testing "cljc.core"
    (is (= (core-run '(let [c (Cons 1 2)]
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
    (is (= (core-run '(pr (filter #(> % 3) (list 1 2 3 4 5))))
           ['(4 5)]))))

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
  (testing "strings"
    (is (= (run '(c* "puts (string_get_utf8 (~{}))" "abc"))
           ['abc]))
    (is (= (core-run '(pr (seq "abc")))
           ['(\a \b \c)]))))

(deftest printing
  (testing "printing"
    (is (= (core-run '(string-print "abc"))
           ['abc]))
    (is (= (core-run '(pr true false))
           [true false]))
    (is (= (core-run '(pr -1 0 1))
           [-1 0 1]))
    (is (= (core-run '(pr "a" "b"))
           ['a 'b]))
    (is (= (core-run '(pr \a \b))
           [\a \b]))
    (is (= (core-run '(pr '(1 2 3)))
           ['(1 2 3)]))
    (is (= (core-run '(pr (make-array 2)))
           [[nil nil]]))
    (is (= (core-run '(pr (set (list 1 2 3))))
           [#{1 2 3}]))))

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
           [1 nil 5]))))

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
    (is (= (core-run '(do
                        (defn remove-one [coll o]
                          (loop [rev ()
                                 coll (seq coll)]
                            (if coll
                              (let [f (first coll)]
                                (if (= o f)
                                  (concat rev (next coll))
                                  (recur (cons f rev) (next coll))))
                              rev)))

                        (defn check-word [len chars word]
                          (and (= len (count word))
                               (empty? (reduce remove-one word chars))))

                        (pr (filter (fn [word] (check-word 3 "abcdef" word))
                                    (list "bad" "leg" "its" "gig" "gag" "bag" "fad")))))
           ['(bad fad)]))))

;;(run-tests *ns*)
