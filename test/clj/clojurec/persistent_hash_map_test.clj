(ns clojurec.persistent-hash-map-test
  (:use clojure.test
        clojurec.core))

(defn- core-run [x]
  (run-expr 'clojurec.core-test true x))

(deftest bitmap-indexed-node-test
  (testing "BitmapIndexedNode"
    (is (= [1] (core-run '(pr (.-bitmap (BitmapIndexedNode. nil 1 (make-array 1)))))))
    (is (= [true] (clojurec.core/run-expr
                    'clojurec.core-test true
                    '(pr (let [a (make-array 2)
                               bm (BitmapIndexedNode. nil 2r1000 a)]
                           (aset a 0 33)
                           (aset a 1 "BAR")
                           (= "BAR" (-inode-lookup bm 0 2r11 33 "NOT FOUND")))))))))

(deftest persistent-hashmap-test
  (testing "PersistentHashMap"
    (is (= [true true true]
           (clojurec.core/run-expr
            'clojurec.core-test true
            '(let [f1 "Foo"
                   f2 "Foo"
                   m cljc.core.PersistentHashMap/EMPTY
                   m2 (assoc m f1 "Baz")
                   m3 {1 "V1" 2 "V2"}
                   r (.-root m2)]
               (pr (= (aget (.-arr r) 0) "Foo")
                   (= (get m2 f2 "NOT FOUND") "Baz")
                   (= (get m3 2 "NOT FOUND") "V2"))))))

    (is (= [100 100 true true true false nil 3 false 99 true]
           (clojurec.core/run-expr
            'clojurec.core-test true
            '(loop [m1 cljc.core.PersistentHashMap/EMPTY
                    m2 (transient cljc.core.PersistentHashMap/EMPTY)
                    i 0]
               (if (< i 100)
                 (recur (assoc m1 i i) (assoc! m2 i i) (inc i))
                 (let [m2 (persistent! m2)
                        v (loop [i 0 accum (-as-transient [])]
                            (if (< i 100)
                              (do (= (m1 i) i)
                                  (conj! accum (= (m2 i) i))
                                  (conj! accum (= (get m1 i) i))
                                  (conj! accum (= (get m2 i) i))
                                  (conj! accum (contains? m1 i))
                                  (conj! accum (contains? m2 i))
                                  (recur (inc i) accum))
                              (persistent! accum)))]
                   (pr (count m1)
                       (count m2)
                       (= m1 m2)
                       (associative? m1)
                       (contains? m1 3)
                       (contains? m1 333)
                       (get m1 333)
                       (first (find m1 3))
                       (contains? (dissoc m1 3) 3)
                       (count (dissoc m1 3))
                       (every? boolean v))))))))))

(use-fixtures :once (fn [f] (clean-default-run-dir true) (f)))
