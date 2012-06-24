(ns clojurec.core-test
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
			(cljc.core/print (. x -invoke))))
	   [1]))))

(deftest types
  (testing "deftype"
    (is (= (run '(deftype* Cons [first rest])) []))
    (is (= (run '(do
		   (deftype* Cons [first rest])
		   (def f (fn [c] (c* "DEFTYPE_GET_FIELD (~{}, 0)" c)))
		   (def r (fn [c] (c* "DEFTYPE_GET_FIELD (~{}, 1)" c)))
		   (let [c (Cons 1 2)]
		     (cljc.core/print (f c))
		     (cljc.core/print (r c)))))
	   [1 2]))))

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
	   [1 2]))))

(deftest numbers
  (testing "simple numbers"
    (is (= (run '(cljc.core/print (+ 1 2))) [3]))
    (is (= (run '(cljc.core/print (< 1 2))) [true]))
    (is (= (run '(cljc.core/print (< 1 1))) [false]))
    (is (= (run '(cljc.core/print (< 2 1))) [false]))
    (is (= (core-run '(do
			(cljc.core/print (cljc.core/dec 1))
			(cljc.core/print (cljc.core/inc 1))))
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
    (is (= (core-run '(let [c (cljc.core/Cons 1 2)]
			(cljc.core/print (. c -first))
			(cljc.core/print (. c -rest))))
	   [1 2]))
    (is (= (core-run '(loop [l (cljc.core/Cons 1 (cljc.core/Cons 2 nil))]
			(when (cljc.core/seq l)
			  (cljc.core/print (cljc.core/first l))
			  (recur (cljc.core/rest l)))))
	   [1 2]))
    (is (= (core-run '(loop [l '(1 2 3)]
			(when (cljc.core/seq l)
			  (cljc.core/print (cljc.core/first l))
			  (recur (cljc.core/rest l)))))
	   [1 2 3]))
    (is (= (core-run '(cljc.core/print (count '(0 0 0)))) [3]))))

(deftest functions
  (testing "functions"
    (is (= (core-run '(do
			(defn printer [a b c d e]
			  (cljc.core/print a)
			  (cljc.core/print b)
			  (cljc.core/print c)
			  (cljc.core/print d)
			  (cljc.core/print e))
			(printer 1 2 3 4 5)))
	   [1 2 3 4 5]))
    (is (= (core-run '(do
			(defn print-list [l]
			  (loop [l l]
			    (when (cljc.core/seq l)
			      (cljc.core/print (cljc.core/first l))
			      (recur (cljc.core/rest l)))))
			(defn printer0 [& r]
			  (cljc.core/print 0)
			  (print-list r))
			(defn printer1 [a & r]
			  (cljc.core/print a)
			  (cljc.core/print 0)
			  (print-list r))
			(defn printer2 [a b & r]
			  (cljc.core/print a)
			  (cljc.core/print b)
			  (cljc.core/print 0)
			  (print-list r))
			(defn printer3 [a b c & r]
			  (cljc.core/print a)
			  (cljc.core/print b)
			  (cljc.core/print c)
			  (cljc.core/print 0)
			  (print-list r))
			(defn printer4 [a b c d & r]
			  (cljc.core/print a)
			  (cljc.core/print b)
			  (cljc.core/print c)
			  (cljc.core/print d)
			  (cljc.core/print 0)
			  (print-list r))
			(defn printer5 [a b c d e & r]
			  (cljc.core/print a)
			  (cljc.core/print b)
			  (cljc.core/print c)
			  (cljc.core/print d)
			  (cljc.core/print e)
			  (cljc.core/print 0)
			  (print-list r))
			(defn p0 [p] (p) (cljc.core/print -1))
			(defn p1 [p] (p 1) (cljc.core/print -1))
			(defn p2 [p] (p 1 2) (cljc.core/print -1))
			(defn p3 [p] (p 1 2 3) (cljc.core/print -1))
			(defn p4 [p] (p 1 2 3 4) (cljc.core/print -1))
			(defn p5 [p] (p 1 2 3 4 5) (cljc.core/print -1))
			(defn p6 [p] (p 1 2 3 4 5 6) (cljc.core/print -1))
			(p0 printer0) (p1 printer0) (p2 printer0) (p3 printer0) (p4 printer0) (p5 printer0) (p6 printer0)
			(p1 printer1) (p2 printer1) (p3 printer1) (p4 printer1) (p5 printer1) (p6 printer1)
			(p2 printer2) (p3 printer2) (p4 printer2) (p5 printer2) (p6 printer2)
			(p3 printer3) (p4 printer3) (p5 printer3) (p6 printer3)
			(p4 printer4) (p5 printer4) (p6 printer4)
			(p5 printer5) (p6 printer5)))
	   [0 -1 0 1 -1 0 1 2 -1 0 1 2 3 -1 0 1 2 3 4 -1 0 1 2 3 4 5 -1 0 1 2 3 4 5 6 -1
	    1 0 -1 1 0 2 -1 1 0 2 3 -1 1 0 2 3 4 -1 1 0 2 3 4 5 -1 1 0 2 3 4 5 6 -1
	    1 2 0 -1 1 2 0 3 -1 1 2 0 3 4 -1 1 2 0 3 4 5 -1 1 2 0 3 4 5 6 -1
	    1 2 3 0 -1 1 2 3 0 4 -1 1 2 3 0 4 5 -1 1 2 3 0 4 5 6 -1
	    1 2 3 4 0 -1 1 2 3 4 0 5 -1 1 2 3 4 0 5 6 -1
	    1 2 3 4 5 0 -1 1 2 3 4 5 0 6 -1]))))

;;(run-tests *ns*)
