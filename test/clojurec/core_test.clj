(ns clojurec.core-test
  (:use clojure.test
        clojurec.core))

(defn- run [x]
  (run-expr 'clojurec.core-test x))

(deftest basic
  (testing "very basic stuff"
    (is (= (run '(print (has-type? 1 Integer))) [true]))
    (is (= (run '(def heusler (fn* ([x] x)))) []))
    (is (= (run '(print (let [a 1 a a] a))) [1]))
    (is (= (run '(print (((fn* ([x] (fn* ([y] x)))) 1) 2))) [1]))
    (is (= (run '(do (print 1) (print 2))) [1 2]))))

(deftest protocols
  (testing "protocols"
    (is (= (run '(defprotocol* foo (-bar [x y]))) []))
    (is (= (run '(let [x (fn [] 1)]
			(print (. x -invoke))))
	   [1]))))

(deftest types
  (testing "deftype"
    (is (= (run '(deftype* Cons [first rest])) []))
    (is (= (run '(do
		   (deftype* Cons [first rest])
		   (def f (fn [c] (c* "DEFTYPE_GET_FIELD (~{}, 0)" c)))
		   (def r (fn [c] (c* "DEFTYPE_GET_FIELD (~{}, 1)" c)))
		   (let [c (Cons 1 2)]
		     (print (f c))
		     (print (r c)))))
	   [1 2]))))

(deftest types-protocols
  (testing "types with protocols"
    (is (= (run-expr '(do
			(defprotocol* ISeq
			  (-first [coll])
			  (-rest [coll]))
			(deftype* Cons [first rest])
			(let [vtable (c* "make_vtable_value (alloc_vtable (2))")]
			  (c* "set_vtable_entry (((vtable_value_t*)~{})->vtable, 0, (closure_t*)~{})" vtable (fn [c] (c* "DEFTYPE_GET_FIELD (~{}, 0)" c)))
			  (c* "set_vtable_entry (((vtable_value_t*)~{})->vtable, 1, (closure_t*)~{})" vtable (fn [c] (c* "DEFTYPE_GET_FIELD (~{}, 1)" c)))
			  (c* "extend_ptable (PTABLE_NAME (cljc_DOT_user_DOT_Cons), PROTOCOL_NAME (cljc_DOT_user_DOT_ISeq), ((vtable_value_t*)~{})->vtable)" vtable)
			  nil)
			(let [c (Cons 1 2)]
			  (print (. c -first))
			  (print (. c -rest)))))
	   [1 2]))))

;;(run-tests *ns*)
