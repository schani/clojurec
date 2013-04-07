(ns clojurec.vector-test
  (:use clojure.test
        clojurec.core))

;; TODO: refactor tests when (range n) will be implemented: replace loops with
;;       (vec (range N))

(defn- core-run [x]
  (run-expr 'clojurec.core-test true x))

(deftest persistent-vector-test
  (testing "PersistentVector predicates"
    (is (= [true true true true true]
           (core-run '(do (println (vector? []))
                          (println (vector? [1 2 3]))
                          (println (vector? (conj [1 2 3] 4)))
                          (println (vector? (conj [] 1)))
                          (println (seqable? [1 2 3])))))))

  (testing "PersistentVector conj/get"
    (is (= [1234
            0 100 200 300 400 500 600 700 800 900 1000 1100 1200 1233
            nil]
           (core-run '(let [vec (loop [i 0 v []]
                                  (if (< i 1234)
                                    (recur (inc i) (conj v i))
                                    v))]
                        (println (count vec))
                        (loop [i 0]
                          (when (< i 1234)
                            (println (get vec i))
                            (recur (+ i 100))))
                        (println (get vec 1233))
                        (println (get vec 1234)))))))

  (testing "PersistentVector pop/peek"
    (is (= [123 0 99 99 1]
           (core-run '(let [v1 (conj [] 123)
                            v100 (loop [i 1 v v1]
                                   (if (< i 100) (recur (inc i) (conj v i)) v))]
                        (println (peek v1))
                        (println (count (pop v1)))
                        (println (peek v100))
                        (println (count (pop v100)))
                        (println (count (loop [i 1 v v100]
                                        (if (< i 100)
                                          (recur (inc i) (pop v))
                                          v)))))))))

  (testing "PersistentVector assoc"
    (is (= [1234 0 1 2 3 4 5 6 7 8 9 10 11 12 1233 nil]
           (core-run '(let [vec1 (loop [i 0 v []]
                                   (if (< i 1234)
                                     (recur (inc i) (conj v i))
                                     v))
                            vec (loop [i 0 v vec1]
                                  (if (< i 13)
                                    (recur (inc i) (-assoc v (* 100 i) i))
                                    v))
                            ]
                        (println (count vec))
                        (loop [i 0]
                          (when (< i 1234)
                            (println (get vec i))
                            (recur (+ i 100))))
                        (println (get vec 1233))
                        (println (get vec 1234)))))))

  (testing "PersistentVector invoke"
    (is (= [1 33 7]
           (core-run '(let [v (conj [] 1 33 7)]
                        (println (v 0))
                        (println (v 1))
                        (println (v 2)))))))

  (testing "PersistentVector literal"
    (is (= [1 33 7]
           (core-run '(let [v [1 33 (inc 6)]]
                        (println (get v 0))
                        (println (get v 1))
                        (println (get v 2)))))))
  (testing "PersistentVector constant"
    (is (= [1 33 7]
           (core-run '(let [v '[1 33 7]]
                        (println (get v 0))
                        (println (get v 1))
                        (println (get v 2)))))))
  (testing "PersistentVector reduce"
    (is (= [true 6]
           (core-run '(do
                        (println (reduceable? []))
                        (println (reduce + [1 2 3])))))))
  (testing "PersistentVector equiv"
    (is (= [true false]
           (core-run '(do (println (= [1 2 3] [1 2 3]))
                          (println (= [1 2 3] [1 2 3 4])))))))

  (testing "PersistentVector vec/vector"
    (is (= [1 33 7 1 33 7]
           (core-run '(let [v1 (vector 1 33 (inc 6))
                            v2 (vec (list 1 33 7))]
                        (println (get v1 0))
                        (println (get v1 1))
                        (println (get v1 2))
                        (println (get v2 0))
                        (println (get v2 1))
                        (println (get v2 2))))))))

(deftest chunked-seq-test
  (testing "ChunkedSeq created from PersistentVector"
    (is (= [true true 0 99 -1]
           (core-run '(let [v (loop [i 0 v []]
                                (if (< i 100)
                                  (recur (inc i) (conj v i))
                                  v))
                            cs (-seq v)]
                        (println (seq? cs))
                        (println (= cs v))
                        (println (first cs))
                        (println (last cs))
                        (println (first (conj cs -1)))))))))

(deftest subvec-test
  (testing "Subvec"
    (is (= [100 0 99 nil
            99 1 99 nil
            1 99 nil
            0 nil
            0 nil
            1234 4321]
           (core-run '(let [v (loop [i 0 v []]
                                (if (< i 100)
                                  (recur (inc i) (conj v i))
                                  v))
                            sv1 (subvec v 0)
                            sv2 (subvec v 1)
                            sv3 (subvec v 99)
                            sv4 (subvec v 100)
                            sv5 (subvec v 50 50)]
                        (println (count sv1))
                        (println (sv1 0))
                        (println (sv1 99))
                        (println (sv1 100))

                        (println (count sv2))
                        (println (sv2 0))
                        (println (sv2 98))
                        (println (sv2 99))

                        (println (count sv3))
                        (println (sv3 0))
                        (println (sv3 1))

                        (println (count sv4))
                        (println (sv4 0))

                        (println (count sv5))
                        (println (sv5 0))

                        (println ((conj sv5 1234) 0))
                        (println ((-assoc sv2 50 4321) 50))))))))

(deftest transient-vector-test
  (testing "TransientVector conj!"
    (is (= [1234
            0 100 200 300 400 500 600 700 800 900 1000 1100 1200 1233
            nil]
           (core-run '(let [vec (loop [i 0 v (-as-transient [])]
                                  (if (< i 1234)
                                    (recur (inc i) (conj! v i))
                                    v))]
                        (println (count vec))
                        (loop [i 0]
                          (when (< i 1234)
                            (println (get vec i))
                            (recur (+ i 100))))
                        (println (get vec 1233))
                        (println (get vec 1234)))))))

  (testing "TransientVector assoc!"
    (is (= [1234 0 1 2 3 4 5 6 7 8 9 10 11 12 1233 nil]
           (core-run '(let [vec1 (loop [i 0 v (-as-transient [])]
                                   (if (< i 1234)
                                     (recur (inc i) (conj! v i))
                                     v))
                            vec (loop [i 0 v vec1]
                                  (if (< i 13)
                                    (recur (inc i) (assoc! v (* 100 i) i))
                                    v))]
                        (println (count vec))
                        (loop [i 0]
                          (when (< i 1234)
                            (println (get vec i))
                            (recur (+ i 100))))
                        (println (get vec 1233))
                        (println (get vec 1234)))))))

  (testing "PersistentVector pop!"
    (is (= [0 123 1]
           (core-run '(let [v1 (conj! (-as-transient []) 123)
                            v100 (loop [i 1 v (-as-transient [123])]
                                   (if (< i 100) (recur (inc i) (conj! v i)) v))
                            vec (loop [i 1 v v100]
                                  (if (< i 100)
                                    (recur (inc i) (pop! v))
                                    v))]
                        (println (count (pop! v1)))
                        (println (vec (dec (count vec))))
                        (println (count vec))))))))
