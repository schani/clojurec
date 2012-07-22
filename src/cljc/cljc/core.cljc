;;; -*- clojure -*-

(ns cljc.core.PersistentVector)

(def EMPTY_NODE nil)
(def EMPTY nil)

(ns cljc.core.List)

(def EMPTY nil)

(ns cljc.core)

(declare print)
(declare apply)

(defn- error [cause]
  (c* "fprintf(stderr, \"%s\\n\", string_get_utf8 (~{}))" cause)
  (c* "exit(1)")
  nil)

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

(defn array-copy
  "Copies n elements from src array, beginning at position specified by src_pos,
  to dst array, beginning at position specified by dst_pos. If src_pos and
  dst_pos aren't specified then elements are copied from beginning of src to
  beginning of dst. If n is also not specified, then all elements of src is
  copied to dst."
  ([src dst]
     (c* "array_copy (~{}, 0, ~{}, 0, array_length (~{}))"
         src dst src))
  ([src dst n]
     (c* "array_copy (~{}, 0, ~{}, 0, integer_get (~{}))"
         src dst n))
  ([src src_pos dst dst_pos n]
     (c* "array_copy (~{}, integer_get (~{}), ~{}, integer_get (~{}), integer_get (~{}))"
         src src_pos dst dst_pos n)))

(defn aclone
  "Returns array, cloned from the passed in array"
  [array-like]
  (array-copy array-like (make-array (alength array-like))))

(comment
(defprotocol IFn
  (-invoke [& args]))
)

(defprotocol ICounted
  (-count [coll] "constant time count"))

(defprotocol IEmptyableCollection
  (-empty [coll]))

(defprotocol IIndexed
  (-nth [coll n] [coll n not-found]))

(defprotocol ASeq)

(defprotocol ISeq
  (-first [coll])
  (-rest [coll]))

(defprotocol INext
  (-next [coll]))

(defprotocol ILookup
  (-lookup [o k] [o k not-found]))

(defprotocol IAssociative
  (-contains-key? [coll k])
  #_(-entry-at [coll k])
  (-assoc [coll k v]))

(defprotocol IEquiv
  (-equiv [o other]))

(defprotocol ISeqable
  (-seq [o]))

(defprotocol ISequential
  "Marker interface indicating a persistent collection of sequential items")

(defprotocol ICollection
  (-conj [coll o]))

(defprotocol IReversible
  (-rseq [coll]))

(defprotocol ISet
  (-disjoin [coll v]))

(defprotocol IStack
  (-peek [coll])
  (-pop [coll]))

(defprotocol IVector
  (-assoc-n [coll n val]))

(defprotocol IMeta
  (-meta [o]))

(defprotocol IWithMeta
  (-with-meta [o meta]))

(defprotocol IReduce
  (-reduce [coll f] [coll f start]))

(defprotocol IPrintable
  (-pr-seq [o opts]))

(defprotocol IChunk
  (-drop-first [coll]))

(defprotocol IChunkedSeq
  (-chunked-first [coll])
  (-chunked-rest [coll]))

(defprotocol IChunkedNext
  (-chunked-next [coll]))

(declare pr-sequential pr-seq list cons inc equiv-sequential)

(deftype Cons [first rest]
  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  INext
  (-next [coll] (if (nil? rest) nil (-seq rest)))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

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

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

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

(declare first next)

(defn ^boolean =
  "Equality. Returns true if x equals y, false if not. Compares
  numbers and collections in a type-independent manner.  Clojure's immutable data
  structures define -equiv (and thus =) as a value, not an identity,
  comparison."
  ([x] true)
  ([x y] (or (identical? x y)
             (and (satisfies? IEquiv x)
                  (-equiv x y))))
  ([x y & more]
     (if (= x y)
       (if (next more)
         (recur y (first more) (next more))
         (= y (first more)))
       false)))

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
  IEquiv
  (-equiv [_ o] (nil? o))

  ICounted
  (-count [_] 0)

  ICollection
  (-conj [coll o] (list o))

  IIndexed
  (-nth
    ([_ n] nil)
    ([_ n not-found] not-found))

  ILookup
  (-lookup
    ([o k] nil)
    ([o k not-found] not-found))

  ISet
  (-disjoin [_ v] nil)

  IPrintable
  (-pr-seq [o opts] (list "nil")))

(extend-type Integer
  IEquiv
  (-equiv [i o]
    (and (has-type? o Integer)
         (c* "make_boolean (integer_get (~{}) == integer_get (~{}))" i o)))

  IPrintable
  (-pr-seq [i opts] (list (c* "make_string_copy_free (g_strdup_printf (\"%ld\", integer_get (~{})))" i))))

(extend-type Boolean
  IPrintable
  (-pr-seq [o opts] (list (if o "true" "false"))))

(defn- ci-reduce
  "Accepts any collection which satisfies the ICount and IIndexed protocols and
reduces them without incurring seq initialization"
  ([cicoll f]
     (let [cnt (-count cicoll)]
       (if (zero? cnt)
         (f)
         (loop [val (-nth cicoll 0), n 1]
           (if (< n cnt)
             (let [nval (f val (-nth cicoll n))]
               (recur nval (inc n)))
             val)))))
  ([cicoll f val]
     (let [cnt (-count cicoll)]
       (loop [val val, n 0]
         (if (< n cnt)
           (let [nval (f val (-nth cicoll n))]
             (recur nval (inc n)))
           val))))
  ([cicoll f val idx]
     (let [cnt (-count cicoll)]
       (loop [val val, n idx]
         (if (< n cnt)
           (let [nval (f val (-nth cicoll n))]
             (recur nval (inc n)))
           val)))))

(deftype IndexedSeq [a i]
  ISeqable
  (-seq [this] this)

  ASeq
  ISeq
  (-first [_] (-nth a i))
  (-rest [_] (if (< (inc i) (-count a))
               (IndexedSeq a (inc i))
               (list)))

  INext
  (-next [_] (if (< (inc i) (-count a))
               (IndexedSeq a (inc i))
               nil))

  ICounted
  (-count [_] (- (-count a) i))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))


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

  IIndexed
  (-nth
    ([coll n]
       (aget coll n))
    ([coll n not-found]
       (if (and (<= 0 n) (< n (alength coll)))
         (aget coll n)
         not-found)))

  IPrintable
  (-pr-seq [a opts]
    (pr-sequential pr-seq "[" " " "]" opts a)))

(extend-type Character
  IEquiv
  (-equiv [c o]
    (and (has-type? o Character)
         (c* "make_boolean (character_get (~{}) == character_get (~{}))" c o)))

  IPrintable
  (-pr-seq [c opts]
    (list "\\" (c* "make_string_from_unichar (character_get (~{}))" c))))

(extend-type String
  IEquiv
  (-equiv [s o]
    (and (has-type? o String)
         ;; FIXME: normalize first
         (c* "make_boolean (strcmp (string_get_utf8 (~{}), string_get_utf8 (~{})) == 0)" s o)))

  ISeqable
  (-seq [string] (prim-seq string 0))

  ICounted
  ;; FIXME: cache the count!
  (-count [s] (c* "make_integer (g_utf8_strlen (string_get_utf8 (~{}), -1))" s))

  IIndexed
  (-nth
    ([coll n]
       (c* "make_character (g_utf8_get_char (g_utf8_offset_to_pointer (string_get_utf8 (~{}), integer_get (~{}))))"
           coll n))
    ([coll n not-found]
       (if (and (<= 0 n) (< n (count coll)))
         (-nth coll n)
         not-found)))

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

(defn last
  "Return the last item in coll, in linear time"
  [s]
  (let [sn (next s)]
    (if-not (nil? sn)
      (recur sn)
      (first s))))

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

(defn ^boolean <
  "Returns non-nil if nums are in monotonically increasing order,
  otherwise false."
  ([x] true)
  ([x y] (cljc.core/< x y))
  ([x y & more]
     (if (cljc.core/< x y)
       (if (next more)
         (recur y (first more) (next more))
         (cljc.core/< y (first more)))
       false)))

(defn ^boolean <=
  "Returns non-nil if nums are in monotonically non-decreasing order,
  otherwise false."
  ([x] true)
  ([x y] (cljc.core/<= x y))
  ([x y & more]
   (if (cljc.core/<= x y)
     (if (next more)
       (recur y (first more) (next more))
       (cljc.core/<= y (first more)))
     false)))

(defn ^boolean >
  "Returns non-nil if nums are in monotonically decreasing order,
  otherwise false."
  ([x] true)
  ([x y] (cljc.core/> x y))
  ([x y & more]
   (if (cljc.core/> x y)
     (if (next more)
       (recur y (first more) (next more))
       (cljc.core/> y (first more)))
     false)))

(defn ^boolean >=
  "Returns non-nil if nums are in monotonically non-increasing order,
  otherwise false."
  ([x] true)
  ([x y] (cljc.core/>= x y))
  ([x y & more]
   (if (cljc.core/>= x y)
     (if (next more)
       (recur y (first more) (next more))
       (cljc.core/>= y (first more)))
     false)))

(defn inc
  "Returns a number one greater than num."
  [x] (cljc.core/+ x 1))

(defn dec
  "Returns a number one less than num."
  [x] (- x 1))

(defn ^boolean pos?
  "Returns true if num is greater than zero, else false"
  [n] (> n 0))

(defn bit-xor
  "Bitwise exclusive or"
  [x y] (cljc.core/bit-xor x y))

(defn bit-and
  "Bitwise and"
  [x y] (cljc.core/bit-and x y))

(defn bit-or
  "Bitwise or"
  [x y] (cljc.core/bit-or x y))

(defn bit-and-not
  "Bitwise and"
  [x y] (cljc.core/bit-and-not x y))

(defn bit-clear
  "Clear bit at index n"
  [x n]
  (cljc.core/bit-clear x n))

(defn bit-flip
  "Flip bit at index n"
  [x n]
  (cljc.core/bit-flip x n))

(defn bit-not
  "Bitwise complement"
  [x] (cljc.core/bit-not x))

(defn bit-set
  "Set bit at index n"
  [x n]
  (cljc.core/bit-set x n))

(defn bit-test
  "Test bit at index n"
  [x n]
  (cljc.core/bit-test x n))

(defn bit-shift-left
  "Bitwise shift left"
  [x n] (cljc.core/bit-shift-left x n))

(defn bit-shift-right
  "Bitwise shift right"
  [x n] (cljc.core/bit-shift-right x n))

(defn ^boolean ==
  "Returns non-nil if nums all have the equivalent
  value, otherwise false. Behavior on non nums is
  undefined."
  ([x] true)
  ([x y] (-equiv x y))
  ([x y & more]
   (if (== x y)
     (if (next more)
       (recur y (first more) (next more))
       (== y (first more)))
     false)))

;;;;;;;;;;;;;;;; preds ;;;;;;;;;;;;;;;;;;

(def ^:private lookup-sentinel (c* "alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Nil), sizeof (value_t))"))

(defn ^boolean boolean [x]
  (if x true false))

(defn ^boolean seq?
  "Return true if s satisfies ISeq"
  [s]
  (if (nil? s)
    false
    (satisfies? ISeq s)))

(defn ^boolean seqable?
  "Return true if s satisfies ISeqable"
  [s]
  (satisfies? ISeqable s))

(defn ^boolean contains?
  "Returns true if key is present in the given collection, otherwise
  returns false.  Note that for numerically indexed collections like
  vectors and arrays, this tests if the numeric key is within the
  range of indexes. 'contains?' operates constant or logarithmic time;
  it will not perform a linear search for a value.  See also 'some'."
  [coll v]
  (if (identical? (-lookup coll v lookup-sentinel) lookup-sentinel)
    false
    true))

(defn ^boolean vector?
  "Return true if x satisfies IVector"
  [x] (satisfies? IVector x))

(defn ^boolean empty?
  "Returns true if coll has no items - same as (not (seq coll)).
  Please use the idiom (seq x) rather than (not (empty? x))"
  [coll] (not (seq coll)))

(defn ^boolean set?
  "Returns true if x satisfies ISet"
  [x]
  (if (nil? x)
    false
    (satisfies? ISet x)))

(defn ^boolean sequential?
  "Returns true if coll satisfies ISequential"
  [x] (satisfies? ISequential x))

(defn ^boolean counted?
  "Returns true if coll implements count in constant time"
  [x] (satisfies? ICounted x))

(defn ^boolean indexed?
  "Returns true if coll implements nth in constant time"
  [x] (satisfies? IIndexed x))

(defn ^boolean reduceable?
  "Returns true if coll satisfies IReduce"
  [x] (satisfies? IReduce x))

(defn ^boolean chunked-seq?
  [x] (satisfies? IChunkedSeq x))

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

(defn get
  "Returns the value mapped to key, not-found or nil if key not present."
  ([o k]
     (-lookup o k))
  ([o k not-found]
     (-lookup o k not-found)))

(defn disj
  "disj[oin]. Returns a new set of the same (hashed/sorted) type, that
  does not contain key(s)."
  ([coll] coll)
  ([coll k]
     (-disjoin coll k))
  ([coll k & ks]
     (let [ret (disj coll k)]
       (if ks
         (recur ret (first ks) (next ks))
         ret))))

(defn- equiv-sequential
  "Assumes x is sequential. Returns true if x equals y, otherwise
  returns false."
  [x y]
  (boolean
   (when (sequential? y)
     (loop [xs (seq x) ys (seq y)]
       (cond (nil? xs) (nil? ys)
             (nil? ys) false
             (= (first xs) (first ys)) (recur (next xs) (next ys))
             true false)))))

(defn ^boolean every?
  "Returns true if (pred x) is logical true for every x in coll, else
  false."
  [pred coll]
  (cond
   (nil? (seq coll)) true
   (pred (first coll)) (recur pred (next coll))
   true false))

(defn identity [x] x)

(defn filter
  "Returns a lazy sequence of the items in coll for which
  (pred item) returns true. pred must be free of side-effects."
  ([pred coll]
     (loop [rev ()
            coll (seq coll)]
       (if coll
         (let [f (first coll) r (next coll)]
           (if (pred f)
             (recur (cons f rev) r)
             (recur rev r)))
         (reverse rev)))))

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
     (if (satisfies? IReduce coll)
       (-reduce coll f)
       (seq-reduce f coll)))
  ([f val coll]
     (if (satisfies? IReduce coll)
       (-reduce coll f val)
       (seq-reduce f val coll))))

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

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Sets ;;;;;;;;;;;;;;;;

(defn- member? [coll o]
  (not (every? #(not (= % o)) coll)))

(defn- reverse-rember [coll o]
  (loop [rev ()
         coll (seq coll)]
    (if coll
      (let [f (first coll)]
        (if (= o f)
          (recur rev (next coll))
          (recur (cons f rev) (next coll))))
      rev)))

(deftype ListSet [elems]
  ICollection
  (-conj [coll o]
    (if (member? elems o)
      coll
      (ListSet (conj elems o))))

  IEquiv
  (-equiv [coll other]
    (and
     (set? other)
     (== (count coll) (count other))
     (every? #(contains? coll %)
             other)))

  ISeqable
  (-seq [_] elems)

  ICounted
  (-count [coll] (count (seq coll)))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (if (member? elems v)
      v
      not-found))

  ISet
  (-disjoin [coll v]
    (if (member? elems v)
      (ListSet (reverse-rember elems v))
      coll))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "#{" " " "}" opts elems)))

(defn set
  "Returns a set of the distinct elements of coll."
  [coll]
  (loop [in (seq coll)
         out (ListSet ())]
    (if (seq in)
      (recur (next in) (conj out (first in)))
      out)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Strings ;;;;;;;;;;;;;;;;

(declare split-string-seq-next-fn)

(deftype SplitStringSeq [string len char first offset]
  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll]
    (or (split-string-seq-next-fn string len char offset) ()))

  INext
  (-next [coll]
    (split-string-seq-next-fn offset))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeqable
  (-seq [coll] coll)

  ICollection
  (-conj [coll o] (Cons o coll))

  IPrintable
  (-pr-seq [coll opts]
    (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn- split-string-seq-next-fn [string len char offset]
  (when-not (== offset len)
    (let [next-offset (c* "make_integer (strchr_offset (string_get_utf8 (~{}) + integer_get (~{}), character_get (~{})))"
			  string offset char)]
      (if (>= next-offset 0)
	(SplitStringSeq string len char
			(c* "make_string_copy_free (g_strndup (string_get_utf8 (~{}) + integer_get (~{}), integer_get (~{})))"
			    string offset next-offset)
			(c* "make_integer (g_utf8_next_char (string_get_utf8 (~{}) + integer_get (~{})) - string_get_utf8 (~{}))"
			    string (+ offset next-offset) string))
	(SplitStringSeq string len char
			(c* "make_string_copy_free (g_strdup (string_get_utf8 (~{}) + integer_get (~{})))" string offset)
			len)))))

(defn split-string-seq [string char]
  (split-string-seq-next-fn string
			    (c* "make_integer (strlen (string_get_utf8 (~{})))" string)
			    char
			    0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Printing ;;;;;;;;;;;;;;;;

(defn pr-sequential [print-one begin sep end opts coll]
  (concat (list begin)
          (flatten1
            (interpose (list sep) (map #(print-one % opts) coll)))
          (list end)))

(defn string-print [x]
  (*print-fn* x)
  nil)

(defn str [& xs]
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

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; I/O ;;;;;;;;;;;;;;;;

(defn slurp [filename]
  (c* "make_string_copy_free (slurp_file (string_get_utf8 (~{})))" filename))

(deftype ArrayChunk [arr off end]
  ICounted
  (-count [_] (- end off))

  IIndexed
  (-nth [coll i]
    (aget arr (+ off i)))
  (-nth [coll i not-found]
    (if (and (>= i 0) (< i (- end off)))
      (aget arr (+ off i))
      not-found))

  IChunk
  (-drop-first [coll]
    (if (== off end)
      (error "-drop-first of empty chunk")
      (ArrayChunk arr (inc off) end)))

  IReduce
  (-reduce [coll f]
    (if (< off end) (ci-reduce coll f (aget arr off) 1) 0))
  (-reduce [coll f start]
    (ci-reduce coll f start 0)))

(defn array-chunk
  ([arr]
     (array-chunk arr 0 (alength arr)))
  ([arr off]
     (array-chunk arr off (alength arr)))
  ([arr off end]
     (ArrayChunk arr off end)))

;;; PersistentVector
(deftype VectorNode [edit arr])

(declare pv-fresh-node pv-aget pv-aset tail-off new-path push-tail array-for
         do-assoc pop-tail chunked-seq)

(deftype PersistentVector [meta cnt shift root tail]
  IWithMeta
  (-with-meta [coll meta] (PersistentVector meta cnt shift root tail))

  IMeta
  (-meta [coll] meta)

  ICounted
  (-count [coll] cnt)

  ICollection
  (-conj [coll o]
    (if (< (- cnt (tail-off coll)) 32)
      (let [tail-len (alength tail)
            new-tail (make-array (inc tail-len))]
        (array-copy tail new-tail)
        (aset new-tail tail-len o)
        (PersistentVector meta (inc cnt) shift root new-tail))
      (let [root-overflow? (> (bit-shift-right-zero-fill cnt 5) (bit-shift-left 1 shift))
            new-shift (if root-overflow? (+ shift 5) shift)
            new-root (if root-overflow?
                       (let [n-r (pv-fresh-node nil)]
                           (pv-aset n-r 0 root)
                           (pv-aset n-r 1 (new-path nil shift (VectorNode nil tail)))
                           n-r)
                       (push-tail coll shift root (VectorNode nil tail)))
            new-tail (make-array 1)]
        (aset new-tail 0 o)
        (PersistentVector meta (inc cnt) new-shift new-root new-tail))))

  IIndexed
  (-nth [coll n]
    (aget (array-for coll n) (bit-and n 0x01f)))
  (-nth [coll n not-found]
    (if (and (<= 0 n) (< n cnt))
      (-nth coll n)
      not-found))

  ILookup
  (-lookup [coll k] (-nth coll k nil))
  (-lookup [coll k not-found] (-nth coll k not-found))

  IStack
  (-peek [coll]
    (when (> cnt 0)
      (-nth coll (dec cnt))))
  (-pop [coll]
    (cond
     (zero? cnt) (error "Can't pop empty vector")
     (== 1 cnt) (-with-meta cljc.core.PersistentVector/EMPTY meta)
     (< 1 (- cnt (tail-off coll))) (let [new-tail-len (dec (alength tail))
                                         new-tail (make-array new-tail-len)]
                                     (PersistentVector meta (dec cnt) shift root
                                                       (array-copy tail new-tail new-tail-len)))
     true (let [new-tail (array-for coll (- cnt 2))
                nr (pop-tail coll shift root)
                new-root (if (nil? nr) cljc.core.PersistentVector/EMPTY_NODE nr)
                cnt-1 (dec cnt)]
            (if (and (< 5 shift) (nil? (pv-aget new-root 1)))
              (PersistentVector meta cnt-1 (- shift 5) (pv-aget new-root 0) new-tail)
              (PersistentVector meta cnt-1 shift new-root new-tail)))))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.PersistentVector/EMPTY meta))

  IAssociative
  (-assoc [coll k v]
    (cond
       (and (<= 0 k) (< k cnt))
       (if (<= (tail-off coll) k)
         (let [new-tail (aclone tail)]
           (aset new-tail (bit-and k 0x01f) v)
           (PersistentVector meta cnt shift root new-tail))
         (PersistentVector meta cnt shift (do-assoc coll shift root k v) tail))
       (== k cnt) (-conj coll v)
       true (error (str "Index " k " out of bounds  [0," cnt "]"))))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IReduce
  (-reduce [v f]
    (ci-reduce v f))
  (-reduce [v f start]
    (ci-reduce v f start))

  IVector
  (-assoc-n [coll n val] (-assoc coll n val))

  ISeqable
  (-seq [coll]
    (if (zero? cnt)
      nil
      (chunked-seq coll 0 0)))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ;; Not yet ported from ClojureScript

  ;; IHash
  ;; (-hash [coll] (caching-hash coll hash-coll __hash))

  ;; IMapEntry
  ;; (-key [coll]
  ;;   (-nth coll 0))
  ;; (-val [coll]
  ;;   (-nth coll 1))

  ;; IKVReduce
  ;; (-kv-reduce [v f init]
  ;;   (let [step-init (array 0 init)] ; [step 0 init init]
  ;;     (loop [i 0]
  ;;       (if (< i cnt)
  ;;         (let [arr (array-for v i)
  ;;               len (.-length arr)]
  ;;           (let [init (loop [j 0 init (aget step-init 1)]
  ;;                        (if (< j len)
  ;;                          (let [init (f init (+ j i) (aget arr j))]
  ;;                            (if (reduced? init)
  ;;                              init
  ;;                              (recur (inc j) init)))
  ;;                          (do (aset step-init 0 len)
  ;;                              (aset step-init 1 init)
  ;;                              init)))]
  ;;             (if (reduced? init)
  ;;               @init
  ;;               (recur (+ i (aget step-init 0))))))
  ;;         (aget step-init 1)))))

  ;; IEditableCollection
  ;; (-as-transient [coll]
  ;;   (TransientVector. cnt shift (tv-editable-root root) (tv-editable-tail tail)))

  ;; IReversible
  ;; (-rseq [coll]
  ;;   (if (pos? cnt)
  ;;     (RSeq. coll (dec cnt) nil)
  ;;     ())))
  )

(defn- pv-fresh-node [edit]
  (VectorNode edit (make-array 32)))

(defn- pv-aget [node idx]
  (aget (.-arr node) idx))

(defn- pv-aset [node idx val]
  (aset (.-arr node) idx val))

(defn- pv-clone-node [node]
  (VectorNode (.-edit node) (aclone (.-arr node))))

(defn- tail-off [pv]
  (let [cnt (.-cnt pv)]
    (if (< cnt 32)
      0
      (bit-shift-left (bit-shift-right-zero-fill (dec cnt) 5) 5))))

(defn- new-path [edit level node]
  (loop [ll level
         ret node]
    (if (zero? ll)
      ret
      (let [embed ret
            r (pv-fresh-node edit)
            _ (pv-aset r 0 embed)]
        (recur (- ll 5) r)))))

(defn- push-tail [pv level parent tailnode]
  (let [ret (pv-clone-node parent)
        subidx (bit-and (bit-shift-right-zero-fill (dec (.-cnt pv)) level) 0x01f)]
    (if (== 5 level)
      (do
        (pv-aset ret subidx tailnode)
        ret)
      (let [child (pv-aget parent subidx)]
        (if-not (nil? child)
          (let [node-to-insert (push-tail pv (- level 5) child tailnode)]
            (pv-aset ret subidx node-to-insert)
            ret)
          (let [node-to-insert (new-path nil (- level 5) tailnode)]
            (pv-aset ret subidx node-to-insert)
            ret))))))

(defn- array-for [pv i]
  (if (and (<= 0 i) (< i (.-cnt pv)))
    (if (>= i (tail-off pv))
      (.-tail pv)
      (loop [node (.-root pv)
             level (.-shift pv)]
        (if (pos? level)
          (recur (pv-aget node (bit-and (bit-shift-right-zero-fill i level) 0x01f))
                 (- level 5))
          (.-arr node))))
    (error (str "No item " i " in vector of length " (.-cnt pv)))))

(defn- do-assoc [pv level node i val]
  (let [ret (pv-clone-node node)]
    (if (zero? level)
      (do
        (pv-aset ret (bit-and i 0x01f) val)
        ret)
      (let [subidx (bit-and (bit-shift-right-zero-fill i level) 0x01f)]
        (pv-aset ret subidx (do-assoc pv (- level 5) (pv-aget node subidx) i val))
        ret))))

(defn- pop-tail [pv level node]
  (let [subidx (bit-and (bit-shift-right-zero-fill (- (.-cnt pv) 2) level) 0x01f)]
    (cond
     (> level 5) (let [new-child (pop-tail pv (- level 5) (pv-aget node subidx))]
                   (if (and (nil? new-child) (zero? subidx))
                     nil
                     (let [ret (pv-clone-node node)]
                       (pv-aset ret subidx new-child)
                       ret)))
     (zero? subidx) nil
     true (let [ret (pv-clone-node node)]
            (pv-aset ret subidx nil)
            ret))))

(set! cljc.core.PersistentVector/EMPTY_NODE (pv-fresh-node nil))
(set! cljc.core.PersistentVector/EMPTY
      (PersistentVector nil 0 5 cljc.core.PersistentVector/EMPTY_NODE (make-array 0)))

(deftype ChunkedSeq [vec node i off meta]
  IWithMeta
  (-with-meta [coll m]
    (chunked-seq vec node i off m))
  (-meta [coll] meta)

  ISeqable
  (-seq [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ASeq
  ISeq
  (-first [coll]
    (aget node off))
  (-rest [coll]
    (if (< (inc off) (alength node))
      (let [s (chunked-seq vec node i (inc off))]
        (if (nil? s)
          ()
          s))
      (-chunked-rest coll)))

  IChunkedSeq
  (-chunked-first [coll]
    (array-chunk node off))
  (-chunked-rest [coll]
    (let [l (alength node)
          s (when (< (+ i l) (-count vec))
              (chunked-seq vec (+ i l) 0))]
      (if (nil? s)
        ()
        s)))

  INext
  (-next [coll]
    (if (< (inc off) (alength node))
      (let [s (chunked-seq vec node i (inc off))]
        (if (nil? s)
          nil
          s))
      (-chunked-next coll)))

  IChunkedNext
  (-chunked-next [coll]
    (let [l (alength node)
          s (when (< (+ i l) (-count vec))
              (chunked-seq vec (+ i l) 0))]
      (if (nil? s)
        nil
        s)))

  ICollection
  (-conj [coll o]
    (cons o coll))

  IEmptyableCollection
  (-empty [coll]
    (-with-meta cljc.core.PersistentVector/EMPTY meta)))

(defn chunked-seq
  ([vec i off] (chunked-seq vec (array-for vec i) i off nil))
  ([vec node i off] (chunked-seq vec node i off nil))
  ([vec node i off meta]
     (ChunkedSeq vec node i off meta)))
