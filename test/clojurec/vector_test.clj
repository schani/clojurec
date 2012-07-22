(ns clojurec.vector-test
  (:use clojure.test
        clojurec.core))

(defn- core-run [x]
  (run-expr 'clojurec.core-test true x))

(deftest persistent-vector
  (testing "PersistentVector conj/get"
    (is (= [1234
            0 100 200 300 400 500 600 700 800 900 1000 1100 1200 1233
            nil]
           (core-run '(let [empty-vec cljc.core.PersistentVector/EMPTY
                            vec (loop [i 0 v empty-vec]
                                  (if (< i 1234)
                                    (recur (inc i) (conj v i))
                                    v))]
                        (print (count vec))
                        (loop [i 0]
                          (when (< i 1234)
                            (print (get vec i))
                            (recur (+ i 100))))
                        (print (get vec 1233))
                        (print (get vec 1234)))))))

  (testing "PersistentVector pop/peek"
    (is (= [123 0 99 99 1]
           (core-run '(let [empty-vec cljc.core.PersistentVector/EMPTY
                            v1 (conj empty-vec 123)
                            v100 (loop [i 1 v v1]
                                   (if (< i 100) (recur (inc i) (conj v i)) v))]
                        (print (-peek v1))
                        (print (count (-pop v1)))
                        (print (-peek v100))
                        (print (count (-pop v100)))
                        (print (count (loop [i 1 v v100]
                                        (if (< i 100)
                                          (recur (inc i) (-pop v))
                                          v)))))))))

  (testing "PersistentVector assoc"
    (is (= [1234 0 1 2 3 4 5 6 7 8 9 10 11 12 1233 nil]
           (core-run '(let [empty-vec cljc.core.PersistentVector/EMPTY
                            vec1 (loop [i 0 v empty-vec]
                                   (if (< i 1234)
                                     (recur (inc i) (conj v i))
                                     v))
                            vec (loop [i 0 v vec1]
                                  (if (< i 13)
                                    (recur (inc i) (-assoc v (* 100 i) i))
                                    v))
                            ]
                        (print (count vec))
                        (loop [i 0]
                          (when (< i 1234)
                            (print (get vec i))
                            (recur (+ i 100))))
                        (print (get vec 1233))
                        (print (get vec 1234)))))))

  (testing "PersistentVector invoke"
    (is (= [1 33 7]
           (core-run '(let [v (conj cljc.core.PersistentVector/EMPTY 1 33 7)]
                        (print (v 0))
                        (print (v 1))
                        (print (v 2)))))))

  (testing "PersistentVector literal"
    (is (= [1 33 7]
           (core-run '(let [v [1 33 (inc 6)]]
                        (print (get v 0))
                        (print (get v 1))
                        (print (get v 2)))))))
  (testing "PersistentVector constant"
    (is (= [1 33 7]
           (core-run '(let [v '[1 33 7]]
                        (print (get v 0))
                        (print (get v 1))
                        (print (get v 2)))))))
  (testing "PersistentVector reduce"
    (is (= [true 6]
           (core-run '(do
                        (print (reduceable? []))
                        (print (reduce + [1 2 3]))))))))
