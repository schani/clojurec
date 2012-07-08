;;; -*- clojure -*-

(ns cljc.core.List)

(def EMPTY nil)

(ns cljc.core)

(declare print)
(declare apply)

(def
  ^{:doc "Each runtime environment provides a diffenent way to print output.
  Whatever function *print-fn* is bound to will be passed any
  Strings which should be printed."}
  *print-fn*
  (fn [s]
    (c* "fputs (string_get_utf8 (~{}), stdout)" s)
    nil))

(defn ^boolean not
  "Returns true if x is logical false, false otherwise."
  [x] (if x false true))

(defn make-array [size]
  (c* "make_array (integer_get (~{}))" size))

(defn aget
  "Returns the value at the index."
  ([array i]
     (c* "array_get (~{}, integer_get (~{}))" array i))
  ([array i & idxs]
     (apply aget (aget array i) idxs)))

(defn aset
  "Sets the value at the index."
  [array i val]
  (c* "array_set (~{}, integer_get (~{}), ~{})" array i val)
  nil)

(defn alength
  "Returns the length of the array. Works on arrays of all types."
  [array]
  (c* "make_integer (array_length (~{}))" array))

(comment
(defprotocol IFn
  (-invoke [& args]))
)

(defprotocol ICounted
  (-count [coll] "constant time count"))

(defprotocol ASeq)

(defprotocol ISeq
  (-first [coll])
  (-rest [coll]))

(defprotocol INext
  (-next [coll]))

(defprotocol ISeqable
  (-seq [o]))

(defprotocol ICollection
  (-conj [coll o]))

(defprotocol IReversible
  (-rseq [coll]))

(defprotocol IPrintable
  (-pr-seq [o opts]))

(declare pr-sequential pr-seq list cons inc)

(deftype Cons [first rest]
  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  INext
  (-next [coll] (if (nil? rest) nil (-seq rest)))

  ISeqable
  (-seq [coll] coll)

  ICollection
  (-conj [coll o] (Cons o coll))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(deftype EmptyList []
  ISeq
  (-first [coll] nil)
  (-rest [coll] ())

  INext
  (-next [coll] nil)

  ISeqable
  (-seq [coll] nil)

  ICollection
  (-conj [coll o] (Cons o nil))

  ICounted
  (-count [_] 0)

  IPrintable
  (-pr-seq [coll opts] (list "()")))

(set! cljc.core.List/EMPTY (cljc.core/EmptyList))

;;;;;;;;;;;;;;;;;;; fundamentals ;;;;;;;;;;;;;;;
(defn ^boolean identical?
  "Tests if 2 arguments are the same object"
  [x y]
  (cljc.core/identical? x y))

(declare reduce)

(defn conj
  "conj[oin]. Returns a new collection with the xs
  'added'. (conj nil item) returns (item).  The 'addition' may
  happen at different 'places' depending on the concrete type."
  ([coll x]
     (-conj coll x))
  ([coll x & xs]
     (if xs
       (recur (conj coll x) (first xs) (next xs))
       (conj coll x))))

(defn ^boolean reversible? [coll]
  (satisfies? IReversible coll))

(defn rseq [coll]
  (-rseq coll))

(defn reverse
  "Returns a seq of the items in coll in reverse order. Not lazy."
  [coll]
  (if (reversible? coll)
    (rseq coll)
    (reduce conj () coll)))

(defn list
  ([] ())
  ([x] (conj () x))
  ([x y] (conj (list y) x))
  ([x y z] (conj (list y z) x))
  ([x y z & items]
     (conj (conj (conj (reduce conj () (reverse items))
                       z) y) x)))

(extend-type Nil
  ICounted
  (-count [_] 0)

  ICollection
  (-conj [coll o] (list o))

  IPrintable
  (-pr-seq [o opts] (list "nil")))

(extend-type Integer
  IPrintable
  (-pr-seq [i opts] (list (c* "make_string_copy_free (g_strdup_printf (\"%ld\", integer_get (~{})))" i))))

(extend-type Boolean
  IPrintable
  (-pr-seq [o opts] (list (if o "true" "false"))))

(deftype IndexedSeq [a i]
  ISeqable
  (-seq [this] this)

  ASeq
  ISeq
  (-first [_] (aget a i))
  (-rest [_] (if (< (inc i) (-count a))
               (IndexedSeq a (inc i))
               (list)))

  INext
  (-next [_] (if (< (inc i) (-count a))
               (IndexedSeq a (inc i))
               nil))

  ICounted
  (-count [_] (- (-count a) i))

  ICollection
  (-conj [coll o] (cons o coll)))

(defn prim-seq
  ([prim]
     (prim-seq prim 0))
  ([prim i]
     (when-not (zero? (-count prim))
       (IndexedSeq prim i))))

(defn array-seq
  ([array]
     (prim-seq array 0))
  ([array i]
     (prim-seq array i)))

(extend-type Array
  ISeqable
  (-seq [array] (array-seq array 0))

  ICounted
  (-count [a] (alength a))

  IPrintable
  (-pr-seq [a opts]
    (pr-sequential pr-seq "[" " " "]" opts a)))

(extend-type Character
  IPrintable
  (-pr-seq [c opts]
    (list "\\" (c* "make_string_from_unichar (character_get (~{}))" c))))

(extend-type String
  IPrintable
  (-pr-seq [s opts]
    (list s)))

(defn seq
  "Returns a seq on the collection. If the collection is
  empty, returns nil.  (seq nil) returns nil. seq also works on
  Strings."
  [coll]
  (if-not (nil? coll)
    (if (satisfies? ASeq coll)
      coll
      (-seq coll))))

(defn first
  "Returns the first item in the collection. Calls seq on its
  argument. If coll is nil, returns nil."
  [coll]
  (when-not (nil? coll)
    (if (satisfies? ISeq coll)
      (-first coll)
      (let [s (seq coll)]
        (when-not (nil? s)
          (-first s))))))

(defn ^seq rest
  "Returns a possibly empty seq of the items after the first. Calls seq on its
  argument."
  [coll]
  (if-not (nil? coll)
    (if (satisfies? ISeq coll)
      (-rest coll)
      (let [s (seq coll)]
        (if-not (nil? s)
          (-rest s)
          ())))
    ()))

(defn ^seq next
  "Returns a seq of the items after the first. Calls seq on its
  argument.  If there are no more items, returns nil"
  [coll]
  (when-not (nil? coll)
    (if (satisfies? INext coll)
      (-next coll)
      (seq (rest coll)))))

(defn +
  "Returns the sum of nums. (+) returns 0."
  ([] 0)
  ([x] x)
  ([x y] (cljc.core/+ x y))
  ([x y & more] (reduce + (cljc.core/+ x y) more)))

(defn -
  "If no ys are supplied, returns the negation of x, else subtracts
  the ys from x and returns the result."
  ([x] (cljc.core/- x))
  ([x y] (cljc.core/- x y))
  ([x y & more] (reduce - (cljc.core/- x y) more)))

(defn *
  "Returns the product of nums. (*) returns 1."
  ([] 1)
  ([x] x)
  ([x y] (cljc.core/* x y))
  ([x y & more] (reduce * (cljc.core/* x y) more)))

(defn inc
  "Returns a number one greater than num."
  [x] (cljc.core/+ x 1))

(defn dec
  "Returns a number one less than num."
  [x] (- x 1))

(defn ^boolean counted?
  "Returns true if coll implements count in constant time"
  [x] (satisfies? ICounted x))

(defn- accumulating-seq-count [coll]
  (loop [s (seq coll) acc 0]
    (if (counted? s) ; assumes nil is counted, which it currently is
      (+ acc (-count s))
      (recur (next s) (inc acc)))))

(defn count
  "Returns the number of items in the collection. (count nil) returns
  0.  Also works on strings, arrays, and Maps"
  [coll]
  (if (counted? coll)
    (-count coll)
    (accumulating-seq-count coll)))

(defn cons
  "Returns a new seq where x is the first element and seq is the rest."
  [x coll]
  (if (or (nil? coll)
          (satisfies? ISeq coll))
    (Cons x coll)
    (Cons x (seq coll))))

(defn ^boolean every?
  "Returns true if (pred x) is logical true for every x in coll, else
  false."
  [pred coll]
  (cond
   (nil? (seq coll)) true
   (pred (first coll)) (recur pred (next coll))
   true false))

(defn identity [x] x)

(defn flatten-tail
  [coll]
  (if-let [n (next coll)]
    (cons (first coll) (flatten-tail n))
    (first coll)))

; simple reduce based on seqs, used as default
(defn- seq-reduce
  ([f coll]
    (if-let [s (seq coll)]
      (reduce f (first s) (next s))
      (f)))
  ([f val coll]
     (loop [val val, coll (seq coll)]
       (if coll
         (let [nval (f val (first coll))]
           (recur nval (next coll)))
         val))))

(defn reduce
  "f should be a function of 2 arguments. If val is not supplied,
  returns the result of applying f to the first 2 items in coll, then
  applying f to that result and the 3rd item, etc. If coll contains no
  items, f must accept no arguments as well, and reduce returns the
  result of calling f with no arguments.  If coll has only 1 item, it
  is returned and f is not called.  If val is supplied, returns the
  result of applying f to val and the first item in coll, then
  applying f to that result and the 2nd item, etc. If coll contains no
  items, returns val and f is not called."
  ([f coll]
     (seq-reduce f coll))
  ([f val coll]
     (seq-reduce f val coll)))

(defn concat
  "Returns a lazy seq representing the concatenation of the elements in the supplied colls."
  ([] nil)
  ([x] (list x))
  ([x y]
     (let [s (seq x)]
       (if s
         (cons (first s) (concat (rest s) y))
         y)))
  ([x y & zs]
     (let [cat (fn cat [xys zs]
                 (let [xys (seq xys)]
                   (if xys
                     (cons (first xys) (cat (rest xys) zs))
                     (when zs
                       (cat (first zs) (next zs))))))]
       (cat (concat x y) zs))))

(defn map
  "Returns a lazy sequence consisting of the result of applying f to the
  set of first items of each coll, followed by applying f to the set
  of second items in each coll, until any one of the colls is
  exhausted.  Any remaining items in other colls are ignored. Function
  f should accept number-of-colls arguments."
  ([f coll]
     (when-let [s (seq coll)]
       (cons (f (first s)) (map f (rest s)))))
  ([f c1 c2]
     (let [s1 (seq c1) s2 (seq c2)]
       (when (and s1 s2)
         (cons (f (first s1) (first s2))
               (map f (rest s1) (rest s2))))))
  ([f c1 c2 c3]
     (let [s1 (seq c1) s2 (seq c2) s3 (seq c3)]
       (when (and  s1 s2 s3)
         (cons (f (first s1) (first s2) (first s3))
               (map f (rest s1) (rest s2) (rest s3))))))
  ([f c1 c2 c3 & colls]
   (let [step (fn step [cs]
                (let [ss (map seq cs)]
                  (when (every? identity ss)
                    (cons (map first ss) (step (map rest ss))))))]
     (map #(apply f %) (step (conj colls c3 c2 c1))))))

(defn interpose
  "Returns a lazy seq of the elements of coll separated by sep"
  [sep coll]
  (if (seq coll)
    (if-let [n (next coll)]
      (cons (first coll) (cons sep (interpose sep n)))
      (list (first coll)))
    ()))

(defn- flatten1
  "Take a collection of collections, and return a lazy seq
  of items from the inner collection"
  [colls]
  (let [cat (fn cat [coll colls]
              (if-let [coll (seq coll)]
                (cons (first coll) (cat (rest coll) colls))
                (when (seq colls)
                  (cat (first colls) (rest colls)))))]
    (cat nil colls)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Printing ;;;;;;;;;;;;;;;;

(defn pr-sequential [print-one begin sep end opts coll]
  (concat (list begin)
          (flatten1
            (interpose (list sep) (map #(print-one % opts) coll)))
          (list end)))

(defn string-print [x]
  (*print-fn* x)
  nil)

(defn str [x]
  "?")

(defn- pr-seq [obj opts]
  (if (satisfies? IPrintable obj)
    (-pr-seq obj opts)
    (list "#<" (str obj) ">")))

(defn pr-with-opts
  "Prints a sequence of objects using string-print, observing all
  the options given in opts"
  [objs opts]
  (loop [objs (seq objs)
         need-sep false]
    (when objs
      (when need-sep
        (string-print " "))
      (doseq [string (pr-seq (first objs) opts)]
        (string-print string))
      (recur (next objs) true))))

(defn- pr-opts []
  nil)

(defn pr
  "Prints the object(s) using string-print.  Prints the
  object(s), separated by spaces if there is more than one.
  By default, pr and prn print in a way that objects can be
  read by the reader"
  [& objs]
  (pr-with-opts objs (pr-opts)))
