;;; -*- clojure -*-

(ns cljc.core.PersistentVector)

(def EMPTY_NODE nil)
(def EMPTY nil)

(ns cljc.core.BitmapIndexedNode)

(def EMPTY nil)

(ns cljc.core.PersistentHashMap)

(def EMPTY nil)

(ns cljc.core.PersistentHashSet)

(def EMPTY nil)
(def fromArray nil)

(ns cljc.core.List)

(def EMPTY nil)

(ns cljc.core)

(declare print)
(declare apply)

(deftype Exception [info])

(defn- error [cause]
  (throw (Exception. cause)))

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

(defprotocol IMap
  #_(-assoc-ex [coll k v])
  (-dissoc [coll k]))

(defprotocol IMapEntry
  (-key [coll])
  (-val [coll]))

(defprotocol IEquiv
  (-equiv [o other]))

(defprotocol IHash
  (-hash [o]))

(defprotocol ISeqable
  (-seq [o]))

(defprotocol ISequential
  "Marker interface indicating a persistent collection of sequential items")

(defprotocol IRecord
  "Marker interface indicating a record object")

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

(defprotocol IEditableCollection
  (-as-transient [coll]))

(defprotocol ITransientCollection
  (-conj! [tcoll val])
  (-persistent! [tcoll]))

(defprotocol ITransientAssociative
  (-assoc! [tcoll key val]))

(defprotocol ITransientMap
  (-dissoc! [tcoll key]))

(defprotocol ITransientVector
  (-assoc-n! [tcoll n val])
  (-pop! [tcoll]))

(defprotocol ITransientSet
  (-disjoin! [tcoll v]))

(defprotocol IChunk
  (-drop-first [coll]))

(defprotocol IChunkedSeq
  (-chunked-first [coll])
  (-chunked-rest [coll]))

(defprotocol IChunkedNext
  (-chunked-next [coll]))

(declare pr-sequential pr-seq list hash-coll cons inc equiv-sequential str)

(deftype Cons [meta first rest ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (Cons. meta first rest __hash))

  IMeta
  (-meta [coll] meta)

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
  (-conj [coll o] (Cons. nil o coll nil))

  IHash
  (-hash [coll]
    (caching-hash coll hash-coll __hash))

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
  (-conj [coll o] (Cons. nil o nil nil))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICounted
  (-count [_] 0)

  IHash
  (-hash [coll] 0)

  IPrintable
  (-pr-seq [coll opts] (list "()")))

(set! cljc.core.List/EMPTY (cljc.core/EmptyList.))

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

(declare reduce hash-map)

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

  IAssociative
  (-assoc [_ k v] (hash-map k v))

  IMap
  (-dissoc [_ k] nil)

  ISet
  (-disjoin [_ v] nil)

  IMeta
  (-meta [_] nil)

  IWithMeta
  (-with-meta [_ meta] nil)

  IHash
  (-hash [o] 0)

  IReduce
  (-reduce
    ([_ f] (f))
    ([_ f start] start))

  IPrintable
  (-pr-seq [o opts] (list "nil")))

(extend-type Integer
  IEquiv
  (-equiv [i o]
    (and (has-type? o Integer)
         (c* "make_boolean (integer_get (~{}) == integer_get (~{}))" i o)))

  IHash
  (-hash [o] o)

  IPrintable
  (-pr-seq [i opts] (list (c* "make_string_copy_free (g_strdup_printf (\"%ld\", integer_get (~{})))" i))))

(extend-type Float
  IEquiv
  (-equiv [f o]
    (and (has-type? o Float)
         (c* "make_boolean (float_get (~{}) == float_get (~{}))" f o)))

  IPrintable
  (-pr-seq [f opts] (list (c* "make_string_copy_free (g_strdup_printf (\"%f\", float_get (~{})))" f))))

(extend-type Boolean
  IHash
  (-hash [o]
    (if (identical? o true) 1 0))

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
               (IndexedSeq. a (inc i))
               (list)))

  INext
  (-next [_] (if (< (inc i) (-count a))
               (IndexedSeq. a (inc i))
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
       (IndexedSeq. prim i))))

(defn array-seq
  ([array]
     (prim-seq array 0))
  ([array i]
     (prim-seq array i)))

(extend-type Array
  ISeqable
  (-seq [array] (array-seq array 0))

  ICollection
  (-conj [coll o] (Cons. nil o coll nil))

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

  IHash
  (-hash [c]
    (c* "make_integer (character_get (~{}))" c))

  IPrintable
  (-pr-seq [c opts]
    (list "\\" (c* "make_string_from_unichar (character_get (~{}))" c))))

(extend-type String
  IEquiv
  (-equiv [s o]
    (and (has-type? o String)
         ;; FIXME: normalize first
         (c* "make_boolean (strcmp (string_get_utf8 (~{}), string_get_utf8 (~{})) == 0)" s o)))

  IHash
  (-hash [s]
    (c* "make_integer (string_hash_code (string_get_utf8 (~{})))" s))

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

(extend-type Keyword
  IEquiv
  (-equiv [k o]
    (identical? k o))

  IFn
  (-invoke [k coll]
	   (when-not (nil? coll)
	     (-lookup coll k nil)))

  IHash
  (-hash [k]
    (c* "make_integer (string_hash_code (keyword_get_utf8 (~{})) + 2)" k))

  IPrintable
  (-pr-seq [k opts]
    (list (str k))))

(extend-type Symbol
  IEquiv
  (-equiv [s o]
    (identical? s o))

  IFn
  (-invoke [k coll]
	   (when-not (nil? coll)
	     (-lookup coll k nil)))

  IHash
  (-hash [s]
    (c* "make_integer (string_hash_code (symbol_get_utf8 (~{})) + 1)" s))

  IPrintable
  (-pr-seq [s opts]
    (list (str s))))

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

(defn second
  "Same as (first (next x))"
  [coll]
  (first (next coll)))

(defn ffirst
  "Same as (first (first x))"
  [coll]
  (first (first coll)))

(defn nfirst
  "Same as (next (first x))"
  [coll]
  (next (first coll)))

(defn fnext
  "Same as (first (next x))"
  [coll]
  (first (next coll)))

(defn nnext
  "Same as (next (next x))"
  [coll]
  (next (next coll)))

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

(defn max
  "Returns the greatest of the nums."
  ([x] x)
  ([x y] (if (> x y) x y))
  ([x y & more]
     (reduce max (max x y) more)))

(defn min
  "Returns the least of the nums."
  ([x] x)
  ([x y] (if (< x y) x y))
  ([x y & more]
     (reduce min (min x y) more)))

(defn- fix [q]
  (if (integer? q)
    q
    (c* "make_integer ((long)float_get (~{}))" q)))

(defn int
  "Coerce to int by stripping decimal places."
  [x]
  (fix x))

(defn long
  "Coerce to long by stripping decimal places. Identical to `int'."
  [x]
  (fix x))

(defn mod
  "Modulus of num and div. Truncates toward negative infinity."
  [n d]
  (cljc.core/mod n d))

(defn ^boolean pos?
  "Returns true if num is greater than zero, else false"
  [n] (> n 0))

(defn ^boolean zero? [n]
  (cljc.core/zero? n))

(defn ^boolean neg?
  "Returns true if num is less than zero, else false"
  [n] (< n 0))

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

(defn ^boolean char?
  [s]
  (has-type? s Character))

(defn ^boolean string?
  [s]
  (has-type? s String))

(defn ^boolean keyword?
  [s]
  (has-type? s Keyword))

(defn ^boolean symbol?
  [s]
  (has-type? s Symbol))

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

(defn ^boolean map?
  "Return true if x satisfies IMap"
  [x]
  (if (nil? x)
    false
    (satisfies? IMap x)))

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

(defn ^boolean associative?
 "Returns true if coll implements Associative"
  [x] (satisfies? IAssociative x))

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

(defn ^boolean distinct?
  "Returns true if no two of the arguments are ="
  ([x] true)
  ([x y] (not (= x y)))
  ([x y & more]
     (if (not (= x y))
     (loop [s #{x y} xs more]
       (let [x (first xs)
             etc (next xs)]
         (if xs
           (if (contains? s x)
             false
             (recur (conj s x) etc))
           true)))
     false)))

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

(declare indexed?)

(defn- linear-traversal-nth
  ([coll n]
     (cond
       (nil? coll)     (error "Index out of bounds")
       (zero? n)       (if (seq coll)
                         (first coll)
                         (error "Index out of bounds"))
       (indexed? coll) (-nth coll n)
       (seq coll)      (linear-traversal-nth (next coll) (dec n))
       true            (error "Index out of bounds")))
  ([coll n not-found]
     (cond
       (nil? coll)     not-found
       (zero? n)       (if (seq coll)
                         (first coll)
                         not-found)
       (indexed? coll) (-nth coll n not-found)
       (seq coll)      (linear-traversal-nth (next coll) (dec n) not-found)
       true            not-found)))

(defn nth
  "Returns the value at the index. get returns nil if index out of
  bounds, nth throws an exception unless not-found is supplied.  nth
  also works for strings, arrays, regex Matchers and Lists, and,
  in O(n) time, for sequences."
  ([coll n]
     (when-not (nil? coll)
       (if (satisfies? IIndexed coll)
         (-nth coll (int n))
         (linear-traversal-nth coll (int n)))))
  ([coll n not-found]
     (if-not (nil? coll)
       (if (satisfies? IIndexed coll)
         (-nth coll (int n) not-found)
         (linear-traversal-nth coll (int n) not-found))
       not-found)))

(defn cons
  "Returns a new seq where x is the first element and seq is the rest."
  [x coll]
  (if (or (nil? coll)
          (satisfies? ISeq coll))
    (Cons. nil x coll nil)
    (Cons. nil x (seq coll) nil)))

(defn get
  "Returns the value mapped to key, not-found or nil if key not present."
  ([o k]
     (-lookup o k))
  ([o k not-found]
     (-lookup o k not-found)))

(defn find
  "Returns the map entry for key, or nil if key not present."
  [coll k]
  (when (and coll
             (associative? coll)
             (contains? coll k))
    [k (-lookup coll k)]))

(defn assoc
  "assoc[iate]. When applied to a map, returns a new map of the
   same (hashed/sorted) type, that contains the mapping of key(s) to
   val(s). When applied to a vector, returns a new vector that
   contains val at index."
  ([coll k v]
     (-assoc coll k v))
  ([coll k v & kvs]
     (let [ret (assoc coll k v)]
       (if kvs
         (recur ret (first kvs) (second kvs) (nnext kvs))
         ret))))

(defn dissoc
  "dissoc[iate]. Returns a new map of the same (hashed/sorted) type,
  that does not contain a mapping for key(s)."
  ([coll] coll)
  ([coll k]
     (-dissoc coll k))
  ([coll k & ks]
     (let [ret (dissoc coll k)]
       (if ks
         (recur ret (first ks) (next ks))
         ret))))

(defn with-meta
  "Returns an object of the same type and value as obj, with
  map m as its metadata."
  [o meta]
  (-with-meta o meta))

(defn meta
  "Returns the metadata of obj, returns nil if there is no metadata."
  [o]
  (when (satisfies? IMeta o)
    (-meta o)))

(defn peek
  "For a list or queue, same as first, for a vector, same as, but much
  more efficient than, last. If the collection is empty, returns nil."
  [coll]
  (-peek coll))

(defn pop
  "For a list or queue, returns a new list/queue without the first
  item, for a vector, returns a new vector without the last item.
  Note - not the same as next/butlast."
  [coll]
  (-pop coll))

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

(defn hash [o]
  (-hash o))

(defn hash-combine [seed hash]
  ; a la boost
  (bit-xor seed (+ hash 0x9e3779b9
                   (bit-shift-left seed 6)
                   (bit-shift-right seed 2))))

(defn- hash-coll [coll]
  (reduce #(hash-combine %1 (hash %2)) (hash (first coll)) (next coll)))

(declare key val transient persistent!)

(defn- hash-imap [m]
  ;; a la clojure.lang.APersistentMap
  (loop [h 0 s (seq m)]
    (if s
      (let [e (first s)]
        (recur (mod (+ h (bit-xor (hash (key e)) (hash (val e))))
                    4503599627370496)
               (next s)))
      h)))

(defn- hash-iset [s]
  ;; a la clojure.lang.APersistentSet
  (loop [h 0 s (seq s)]
    (if s
      (let [e (first s)]
        (recur (mod (+ h (hash e)) 4503599627370496)
               (next s)))
      h)))

(defn not-empty
  "If coll is empty, returns nil, else coll"
  [coll] (when (seq coll) coll))

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

(defn into
  "Returns a new coll consisting of to-coll with all of the items of
  from-coll conjoined."
  [to from]
  (if (satisfies? IEditableCollection to)
    (persistent! (reduce -conj! (transient to) from))
    (reduce -conj to from)))

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

;;; Transients

(defn transient [coll]
  (-as-transient coll))

(defn persistent! [tcoll]
  (-persistent! tcoll))

(defn conj! [tcoll val]
  (-conj! tcoll val))

(defn assoc! [tcoll key val]
  (-assoc! tcoll key val))

(defn dissoc! [tcoll key]
  (-dissoc! tcoll key))

(defn pop! [tcoll]
  (-pop! tcoll))

(defn disj! [tcoll val]
  (-disjoin! tcoll val))

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

(defn set
  "Returns a set of the distinct elements of coll."
  ([coll]
     (loop [in (seq coll)
	    out (transient cljc.core.PersistentHashSet/EMPTY)]
       (if (seq in)
	 (recur (next in) (conj! out (first in)))
	 (persistent! out)))))

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
    (split-string-seq-next-fn string len char offset))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeqable
  (-seq [coll] coll)

  ICollection
  (-conj [coll o] (Cons. nil o coll nil))

  IPrintable
  (-pr-seq [coll opts]
    (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn- split-string-seq-next-fn [string len char offset]
  (when-not (== offset len)
    (let [next-offset (c* "make_integer (strchr_offset (string_get_utf8 (~{}) + integer_get (~{}), character_get (~{})))"
			  string offset char)]
      (if (>= next-offset 0)
	(SplitStringSeq. string len char
                         (c* "make_string_copy_free (g_strndup (string_get_utf8 (~{}) + integer_get (~{}), integer_get (~{})))"
                             string offset next-offset)
                         (c* "make_integer (g_utf8_next_char (string_get_utf8 (~{}) + integer_get (~{})) - string_get_utf8 (~{}))"
                             string (+ offset next-offset) string))
	(SplitStringSeq. string len char
                         (c* "make_string_copy_free (g_strdup (string_get_utf8 (~{}) + integer_get (~{})))" string offset)
                         len)))))

(defn split-string-seq [string char]
  (split-string-seq-next-fn string
			    (c* "make_integer (strlen (string_get_utf8 (~{})))" string)
			    char
			    0))

(defn- checked-substring [s start end]
  (let [len (count s)
	end (min end len)
	start (min start end)]
    (c* "make_string_copy_free (g_utf8_substring (string_get_utf8 (~{}), integer_get (~{}), integer_get (~{})))" s start end)))

(defn subs
  "Returns the substring of s beginning at start inclusive, and ending
  at end (defaults to length of string), exclusive."
  ([s start] (subs s start (count s)))
  ([s start end] (checked-substring s start end)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn name
  "Returns the name String of a string, symbol or keyword."
  [x]
  (cond
   (string? x) x
   (keyword? x) (let [ptr (c* "make_raw_pointer (g_utf8_strrchr (keyword_get_utf8 (~{}), -1, '/'))" x)]
		  (if (c* "make_boolean (raw_pointer_get (~{}) == NULL)" ptr)
		    (c* "make_string ((gchar*)keyword_get_utf8 (~{}))" x)
		    (c* "make_string (g_utf8_next_char (raw_pointer_get (~{})))" ptr)))
   (symbol? x) (let [ptr (c* "make_raw_pointer (g_utf8_strrchr (symbol_get_utf8 (~{}), -1, '/'))" x)]
		 (if (c* "make_boolean (raw_pointer_get (~{}) == NULL)" ptr)
		   (c* "make_string ((gchar*)symbol_get_utf8 (~{}))" x)
		   (c* "make_string (g_utf8_next_char (raw_pointer_get (~{})))" ptr)))
   :else (error (str "Doesn't support name: " x))))

(defn namespace
  "Returns the namespace String of a symbol or keyword, or nil if not present."
  [x]
  (cond
   (keyword? x) (let [ptr (c* "make_raw_pointer (g_utf8_strrchr (keyword_get_utf8 (~{}), -1, '/'))" x)]
		  (when (c* "make_boolean (raw_pointer_get (~{}) != NULL)" ptr)
		    (c* "make_string_from_buf (keyword_get_utf8 (~{}), raw_pointer_get (~{}))" x ptr)))
   (symbol? x) (let [ptr (c* "make_raw_pointer (g_utf8_strrchr (symbol_get_utf8 (~{}), -1, '/'))" x)]
		 (when (c* "make_boolean (raw_pointer_get (~{}) != NULL)" ptr)
		   (c* "make_string_from_buf (symbol_get_utf8 (~{}), raw_pointer_get (~{}))" x ptr)))
   :else (error (str "Doesn't support namespace: " x))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Printing ;;;;;;;;;;;;;;;;

(defn pr-sequential [print-one begin sep end opts coll]
  (concat (list begin)
          (flatten1
            (interpose (list sep) (map #(print-one % opts) coll)))
          (list end)))

(defn string-print [x]
  (*print-fn* x)
  nil)

(defn str
  "With no args, returns the empty string. With one arg x, returns
  x.toString().  (str nil) returns the empty string. With more than
  one arg, returns the concatenation of the str values of the args."
  ([] "")
  ([x] (cond
        (string? x) x
        (symbol? x) (c* "make_string ((gchar*)symbol_get_utf8 (~{}))" x)
        (keyword? x) (str ":" (c* "make_string ((gchar*)keyword_get_utf8 (~{}))" x))
        (char? x) (c* "make_string_from_unichar (character_get (~{}))" x)
        (nil? x) ""
        :else (error "FIXME: not implemented yet")))
  ([& xs]
     (loop [xs (seq xs)
            rstrings ()
            bytes 0]
       (if xs
         (let [s (str (first xs))
               b (c* "make_integer (strlen (string_get_utf8 (~{})))" s)]
           (recur (next xs)
                  (cons [s b] rstrings)
                  (+ bytes b)))
         (let [sb (c* "make_string_with_size (integer_get (~{}))" bytes)]
           (loop [ss (reverse rstrings)
                  i 0]
             (if ss
               (let [[s b] (first ss)]
                 (c* "memcpy (string_get_utf8 (~{}) + integer_get (~{}), string_get_utf8 (~{}), integer_get (~{}))" sb i s b)
                 (recur (next ss) (+ i b)))
               (do
                 (assert (= i bytes))
                 (c* "string_get_utf8 (~{}) [integer_get (~{})] = '\\0'" sb i)
                 sb))))))))

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
      (ArrayChunk. arr (inc off) end)))

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
     (ArrayChunk. arr off end)))

;;; PersistentVector
(deftype VectorNode [edit arr])

(declare pv-fresh-node pv-aget pv-aset tail-off new-path push-tail array-for
         do-assoc pop-tail chunked-seq tv-ensure-editable tv-pop-tail
         tv-push-tail editable-array-for TransientVector tv-editable-root
         tv-editable-tail)

(deftype PersistentVector [meta cnt shift root tail ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (PersistentVector. meta cnt shift root tail __hash))

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
        (PersistentVector. meta (inc cnt) shift root new-tail nil))
      (let [root-overflow? (> (bit-shift-right-zero-fill cnt 5) (bit-shift-left 1 shift))
            new-shift (if root-overflow? (+ shift 5) shift)
            new-root (if root-overflow?
                       (let [n-r (pv-fresh-node nil)]
                           (pv-aset n-r 0 root)
                           (pv-aset n-r 1 (new-path nil shift (VectorNode. nil tail)))
                           n-r)
                       (push-tail coll shift root (VectorNode. nil tail)))
            new-tail (make-array 1)]
        (aset new-tail 0 o)
        (PersistentVector. meta (inc cnt) new-shift new-root new-tail nil))))

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
                                     (PersistentVector. meta (dec cnt) shift root
                                                        (array-copy tail new-tail new-tail-len) nil))
     true (let [new-tail (array-for coll (- cnt 2))
                nr (pop-tail coll shift root)
                new-root (if (nil? nr) cljc.core.PersistentVector/EMPTY_NODE nr)
                cnt-1 (dec cnt)]
            (if (and (< 5 shift) (nil? (pv-aget new-root 1)))
              (PersistentVector. meta cnt-1 (- shift 5) (pv-aget new-root 0) new-tail nil)
              (PersistentVector. meta cnt-1 shift new-root new-tail nil)))))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.PersistentVector/EMPTY meta))

  IAssociative
  (-assoc [coll k v]
    (cond
       (and (<= 0 k) (< k cnt))
       (if (<= (tail-off coll) k)
         (let [new-tail (aclone tail)]
           (aset new-tail (bit-and k 0x01f) v)
           (PersistentVector. meta cnt shift root new-tail nil))
         (PersistentVector. meta cnt shift (do-assoc coll shift root k v) tail nil))
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

  IEditableCollection
  (-as-transient [coll]
    (TransientVector cnt shift (tv-editable-root root) (tv-editable-tail tail)))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IMapEntry
  (-key [coll]
    (-nth coll 0))
  (-val [coll]
    (-nth coll 1))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "[" " " "]" opts coll))
  ;; Not yet ported from ClojureScript

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

  ;; IReversible
  ;; (-rseq [coll]
  ;;   (if (pos? cnt)
  ;;     (RSeq. coll (dec cnt) nil)
  ;;     ())))
  )

(defn- pv-fresh-node [edit]
  (VectorNode. edit (make-array 32)))

(defn- pv-aget [node idx]
  (aget (.-arr node) idx))

(defn- pv-aset [node idx val]
  (aset (.-arr node) idx val))

(defn- pv-clone-node [node]
  (VectorNode. (.-edit node) (aclone (.-arr node))))

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
      (PersistentVector. nil 0 5 cljc.core.PersistentVector/EMPTY_NODE (make-array 0) 0))

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
    (-with-meta cljc.core.PersistentVector/EMPTY meta))
  
  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn chunked-seq
  ([vec i off] (chunked-seq vec (array-for vec i) i off nil))
  ([vec node i off] (chunked-seq vec node i off nil))
  ([vec node i off meta]
     (ChunkedSeq. vec node i off meta)))

(deftype Subvec [meta v start end ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (Subvec. meta v start end __hash))

  IMeta
  (-meta [coll] meta)

  IStack
  (-peek [coll]
    (-nth v (dec end)))
  (-pop [coll]
    (if (== start end)
      (error "Can't pop empty vector")
      (Subvec. meta v start (dec end) nil)))

  ICollection
  (-conj [coll o]
    (Subvec. meta (-assoc-n v end o) start (inc end) nil))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.PersistentVector/EMPTY meta))

  ICounted
  (-count [coll] (- end start))

  IIndexed
  (-nth [coll n]
    (if (< n (- end start))
      (nth v (+ start n))
      (error "Index out of bounds")))
  (-nth [coll n not-found]
    (if (< n (- end start))
      (nth v (+ start n) not-found)
      not-found))

  ILookup
  (-lookup [coll k] (-nth coll k nil))
  (-lookup [coll k not-found] (-nth coll k not-found))

  IAssociative
  (-assoc [coll key val]
    (let [v-pos (+ start key)]
      (Subvec. meta (assoc v v-pos val)
               start (max end (inc v-pos))
               nil)))

  IVector
  (-assoc-n [coll n val] (-assoc coll n val))

  IReduce
  (-reduce [coll f]
    (ci-reduce coll f))
  (-reduce [coll f start]
    (ci-reduce coll f start))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "[" " " "]" opts coll))


  ;; ISeqable
  ;; (-seq [coll]
  ;;   (let [subvec-seq (fn subvec-seq [i]
  ;;                      (when-not (== i end)
  ;;                        (cons (-nth v i)
  ;;                              (lazy-seq
  ;;                               (subvec-seq (inc i))))))]
  ;;     (subvec-seq start)))
  )

(defn subvec
  "Returns a persistent vector of the items in vector from
  start (inclusive) to end (exclusive).  If end is not supplied,
  defaults to (count vector). This operation is O(1) and very fast, as
  the resulting vector shares structure with the original and no
  trimming is done."
  ([v start]
     (subvec v start (count v)))
  ([v start end]
     (if (<= start end)
       (Subvec. nil v start end nil)
       (error "Invalid subvec range"))))

(deftype TransientVector [^:mutable cnt
                          ^:mutable shift
                          ^:mutable root
                          ^:mutable tail]
  ITransientCollection
  (-conj! [tcoll o]
    (if (.-edit root)
      (if (< (- cnt (tail-off tcoll)) 32)
        (do (aset tail (bit-and cnt 0x01f) o)
            (set! cnt (inc cnt))
            tcoll)
        (let [tail-node (VectorNode. (.-edit root) tail)
              new-tail  (make-array 32)]
          (aset new-tail 0 o)
          (set! tail new-tail)
          (if (> (bit-shift-right-zero-fill cnt 5)
                 (bit-shift-left 1 shift))
            (let [new-root-array (make-array 32)
                  new-shift      (+ shift 5)]
              (aset new-root-array 0 root)
              (aset new-root-array 1 (new-path (.-edit root) shift tail-node))
              (set! root  (VectorNode. (.-edit root) new-root-array))
              (set! shift new-shift)
              (set! cnt   (inc cnt))
              tcoll)
            (let [new-root (tv-push-tail tcoll shift root tail-node)]
              (set! root new-root)
              (set! cnt  (inc cnt))
              tcoll))))
      (error "conj! after persistent!")))

  (-persistent! [tcoll]
    (if (.-edit root)
      (let [persistent-root (VectorNode. nil (.-arr root))
            len (- cnt (tail-off tcoll))
            trimmed-tail (make-array len)]
        (set! root persistent-root)
        (array-copy tail trimmed-tail len)
        (PersistentVector. nil cnt shift root trimmed-tail nil))
      (error "persistent! called twice")))

  ITransientAssociative
  (-assoc! [tcoll key val] (-assoc-n! tcoll key val))

  ITransientVector
  (-assoc-n! [tcoll n val]
    (if (.-edit root)
      (cond
        (and (<= 0 n) (< n cnt))
        (if (<= (tail-off tcoll) n)
          (do (aset tail (bit-and n 0x01f) val)
              tcoll)
          (let [new-root
                ((fn go [level node]
                   (let [node (tv-ensure-editable (.-edit root) node)]
                     (if (zero? level)
                       (do (pv-aset node (bit-and n 0x01f) val)
                           node)
                       (let [subidx (bit-and (bit-shift-right-zero-fill n level)
                                             0x01f)]
                         (pv-aset node subidx
                                  (go (- level 5) (pv-aget node subidx)))
                         node))))
                 shift root)]
            (set! root new-root)
            tcoll))
        (== n cnt) (-conj! tcoll val)
        true
        (error
          (str "Index " n " out of bounds for TransientVector of length" cnt)))
      (error "assoc! after persistent!")))

  (-pop! [tcoll]
    (if (.-edit root)
      (cond
        (zero? cnt) (error "Can't pop empty vector")
        (== 1 cnt)                       (do (set! cnt 0) tcoll)
        (pos? (bit-and (dec cnt) 0x01f)) (do (set! cnt (dec cnt)) tcoll)
        true
        (let [new-tail (editable-array-for tcoll (- cnt 2))
              new-root (let [nr (tv-pop-tail tcoll shift root)]
                         (if-not (nil? nr)
                           nr
                           (VectorNode. (.-edit root) (make-array 32))))]
          (if (and (< 5 shift) (nil? (pv-aget new-root 1)))
            (let [new-root (tv-ensure-editable (.-edit root) (pv-aget new-root 0))]
              (set! root  new-root)
              (set! shift (- shift 5))
              (set! cnt   (dec cnt))
              (set! tail  new-tail)
              tcoll)
            (do (set! root new-root)
                (set! cnt  (dec cnt))
                (set! tail new-tail)
                tcoll))))
      (error "pop! after persistent!")))

  ICounted
  (-count [coll]
    (if (.-edit root)
      cnt
      (error "count after persistent!")))

  IIndexed
  (-nth [coll n]
    (if (.-edit root)
      (aget (array-for coll n) (bit-and n 0x01f))
      (error "nth after persistent!")))

  (-nth [coll n not-found]
    (if (and (<= 0 n) (< n cnt))
      (-nth coll n)
      not-found))

  ILookup
  (-lookup [coll k] (-nth coll k nil))

  (-lookup [coll k not-found] (-nth coll k not-found))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found)))

(defn- tv-ensure-editable [edit node]
  (if (identical? edit (.-edit node))
    node
    (VectorNode. edit (aclone (.-arr node)))))

(defn- tv-editable-root [node]
  (VectorNode. true (aclone (.-arr node))))

(defn- tv-editable-tail [tl]
  (let [ret (make-array 32)]
    (array-copy tl ret)
    ret))

(defn- tv-push-tail [tv level parent tail-node]
  (let [ret    (tv-ensure-editable (.. tv -root -edit) parent)
        subidx (bit-and (bit-shift-right-zero-fill (dec (.-cnt tv)) level) 0x01f)]
    (pv-aset ret subidx
             (if (== level 5)
               tail-node
               (let [child (pv-aget ret subidx)]
                 (if-not (nil? child)
                   (tv-push-tail tv (- level 5) child tail-node)
                   (new-path (.. tv -root -edit) (- level 5) tail-node)))))
    ret))

(defn- tv-pop-tail [tv level node]
  (let [node   (tv-ensure-editable (.. tv -root -edit) node)
        subidx (bit-and (bit-shift-right-zero-fill (- (.-cnt tv) 2) level) 0x01f)]
    (cond
      (> level 5) (let [new-child (tv-pop-tail
                                   tv (- level 5) (pv-aget node subidx))]
                    (if (and (nil? new-child) (zero? subidx))
                      nil
                      (do (pv-aset node subidx new-child)
                          node)))
      (zero? subidx) nil
      true (do (pv-aset node subidx nil)
               node))))

(defn- editable-array-for [tv i]
  (if (and (<= 0 i) (< i (.-cnt tv)))
    (if (>= i (tail-off tv))
      (.-tail tv)
      (let [root (.-root tv)]
        (loop [node  root
               level (.-shift tv)]
          (if (pos? level)
            (recur (tv-ensure-editable
                    (.-edit root)
                    (pv-aget node
                             (bit-and (bit-shift-right-zero-fill i level)
                                      0x01f)))
                   (- level 5))
            (.-arr node)))))
    (error
     (str "No item " i " in transient vector of length " (.-cnt tv)))))

(defn vec [coll]
  (persistent! (reduce conj! (-as-transient []) coll)))

(defn vector [& args] (vec args))

;;;PersistentHashMap
(defprotocol INode
  (-inode-assoc [inode shift hash key val added-leaf?])
  (-inode-without [inode shift hash key])
  (-inode-lookup [inode shift hash key not-found])
  (-inode-find [inode shift hash key not-found])
  (-inode-seq [inode])
  (-ensure-editable [inode e])
  (-inode-assoc! [inode edit shift hash key val added-leaf?])
  (-inode-without! [inode edit shift hash key removed-leaf?]))

(defprotocol IBitmapIndexedNode
  (-edit-and-remove-pair [inode e bit i]))

(defprotocol IHashCollisionNode
  (-ensure-editable-array [inode e count array]))

(defprotocol ITransientHashMap
  (-without! [tcoll k]))

(deftype NeverEquiv []
  IEquiv
  (-equiv [o other] false))

(def ^:private never-equiv (NeverEquiv.))

(deftype Box [^:mutable val])

(deftype EditSentinel [])

(declare create-inode-seq create-array-node-seq reset! create-node atom deref)

(defn ^boolean key-test [key other]
  (if ^boolean (has-type? key String)
      ;; Note the below test is an optimisation used in java and JS
      ;; impls relying on all strings being interned constats, and thus
      ;; there is only one string created with the same char sequence
      ;;(identical? key other)
      (= key other)
    (= key other)))

;;XXX--remove after merging of rest of math fns
(defn quot
  "quot[ient] of dividing numerator by denominator."
  [n d]
  (error "NOT IMPLEMENTED"))

(defn- equiv-map
  "Assumes y is a map. Returns true if x equals y, otherwise returns
  false."
  [x y]
  (boolean
    (when (map? y)
      ; assume all maps are counted
      (when (== (count x) (count y))
        (every? identity
                (map (fn [xkv] (= (get y (first xkv) never-equiv)
                                  (second xkv)))
                     x))))))

(defn- clone-and-set
  ([arr i a]
     (doto (aclone arr)
       (aset i a)))
  ([arr i a j b]
     (doto (aclone arr)
       (aset i a)
       (aset j b))))

(defn- remove-pair [arr i]
  (let [new-arr (make-array (- (alength arr) 2))]
    (array-copy arr 0 new-arr 0 (* 2 i))
    (array-copy arr (* 2 (inc i)) new-arr (* 2 i) (- (alength new-arr) (* 2 i)))
    new-arr))

(defn- edit-and-set
  ([inode edit i a]
     (let [editable (-ensure-editable inode edit)]
       (aset (.-arr editable) i a)
       editable))
  ([inode edit i a j b]
     (let [editable (-ensure-editable inode edit)]
       (aset (.-arr editable) i a)
       (aset (.-arr editable) j b)
       editable)))

(defn- bitmap-indexed-node-index [bitmap bit]
  (cljc.core/bit-index bitmap bit))

(declare ArrayNode)

(deftype BitmapIndexedNode [edit ^:mutable bitmap ^:mutable arr]
  IBitmapIndexedNode
  (-edit-and-remove-pair [inode e bit i]
    (if (== bitmap bit)
      nil
      (let [editable (-ensure-editable inode e)
            earr     (.-arr editable)
            len      (alength earr)]
        (set! (.-bitmap editable) (bit-xor bit (.-bitmap editable)))
        (array-copy earr (* 2 (inc i))
                    earr (* 2 i)
                    (- len (* 2 (inc i))))
        (aset earr (- len 2) nil)
        (aset earr (dec len) nil)
        editable)))
  INode
  (-inode-assoc [inode shift hash key val added-leaf?]
    (let [bit (bitpos hash shift)
          idx (bitmap-indexed-node-index bitmap bit)]
      (if (zero? (bit-and bitmap bit))
        (let [n (bit-count bitmap)]
          (if (>= n 16)
            (let [nodes (make-array 32)
                  jdx   (mask hash shift)]
              (aset nodes jdx (-inode-assoc cljc.core.BitmapIndexedNode/EMPTY (+ shift 5) hash key val added-leaf?))
              (loop [i 0 j 0]
                (if (< i 32)
                  (if (zero? (bit-and (bit-shift-right-zero-fill bitmap i) 1))
                    (recur (inc i) j)
                    (do (aset nodes i
                              (if-not (nil? (aget arr j))
                                (-inode-assoc cljc.core.BitmapIndexedNode/EMPTY
                                              (+ shift 5) (-hash (aget arr j)) (aget arr j) (aget arr (inc j)) added-leaf?)
                                (aget arr (inc j))))
                        (recur (inc i) (+ j 2))))))
              (ArrayNode. nil (inc n) nodes))
            (let [new-arr (make-array (* 2 (inc n)))]
              (array-copy arr 0 new-arr 0 (* 2 idx))
              (aset new-arr (* 2 idx) key)
              (aset new-arr (inc (* 2 idx)) val)
              (array-copy arr (* 2 idx) new-arr (* 2 (inc idx)) (* 2 (- n idx)))
              (set! (.-val added-leaf?) true)
              (BitmapIndexedNode. nil (bit-or bitmap bit) new-arr))))
        (let [key-or-nil  (aget arr (* 2 idx))
              val-or-node (aget arr (inc (* 2 idx)))]
          (cond (nil? key-or-nil)
                (let [n (-inode-assoc val-or-node (+ shift 5) hash key val added-leaf?)]
                  (if (identical? n val-or-node)
                    inode
                    (BitmapIndexedNode. nil bitmap (clone-and-set arr (inc (* 2 idx)) n))))

                (key-test key key-or-nil)
                (if (identical? val val-or-node)
                  inode
                  (BitmapIndexedNode. nil bitmap (clone-and-set arr (inc (* 2 idx)) val)))
                :else
                (do (set! (.-val added-leaf?) true)
                    (BitmapIndexedNode. nil bitmap
                                       (clone-and-set arr (* 2 idx) nil (inc (* 2 idx))
                                                      (create-node (+ shift 5) key-or-nil val-or-node hash key val)))))))))

  (-inode-without [inode shift hash key]
    (let [bit (bitpos hash shift)]
      (if (zero? (bit-and bitmap bit))
        inode
        (let [idx         (bitmap-indexed-node-index bitmap bit)
              key-or-nil  (aget arr (* 2 idx))
              val-or-node (aget arr (inc (* 2 idx)))]
          (cond (nil? key-or-nil)
                (let [n (-inode-without val-or-node (+ shift 5) hash key)]
                  (cond (identical? n val-or-node) inode
                        (not (nil? n)) (BitmapIndexedNode. nil bitmap (clone-and-set arr (inc (* 2 idx)) n))
                        (== bitmap bit) nil
                        :else (BitmapIndexedNode. nil (bit-xor bitmap bit) (remove-pair arr idx))))
                (key-test key key-or-nil)
                (BitmapIndexedNode. nil (bit-xor bitmap bit) (remove-pair arr idx))
                :else inode)))))

  (-inode-lookup [inode shift hash key not-found]
    (let [bit (bitpos hash shift)]
      (if (zero? (bit-and bitmap bit))
        not-found
        (let [idx         (bitmap-indexed-node-index bitmap bit)
              key-or-nil  (aget arr (* 2 idx))
              val-or-node (aget arr (inc (* 2 idx)))]
          (cond (nil? key-or-nil)  (-inode-lookup val-or-node (+ shift 5) hash key not-found)
                (key-test key key-or-nil) val-or-node
                :else not-found)))))

  (-inode-find [inode shift hash key not-found]
    (let [bit (bitpos hash shift)]
      (if (zero? (bit-and bitmap bit))
        not-found
        (let [idx         (bitmap-indexed-node-index bitmap bit)
              key-or-nil  (aget arr (* 2 idx))
              val-or-node (aget arr (inc (* 2 idx)))]
          (cond (nil? key-or-nil) (-inode-find val-or-node (+ shift 5) hash key not-found)
                (key-test key key-or-nil)          [key-or-nil val-or-node]
                :else not-found)))))

  (-inode-seq [inode]
    (create-inode-seq arr))

  (-ensure-editable [inode e]
    (if (identical? e edit)
      inode
      (let [n       (bit-count bitmap)
            new-arr (make-array (if (neg? n) 4 (* 2 (inc n))))]
        (array-copy arr 0 new-arr 0 (* 2 n))
        (BitmapIndexedNode. e bitmap new-arr))))

  (-inode-assoc! [inode edit shift hash key val added-leaf?]
    (let [bit (bitpos hash shift)
          idx (bitmap-indexed-node-index bitmap bit)]
      (if (zero? (bit-and bitmap bit))
        (let [n (bit-count bitmap)]
          (cond
            (< (* 2 n) (alength arr))
            (let [editable (-ensure-editable inode edit)
                  earr     (.-arr editable)]
              (set! (.-val added-leaf?) true)
              (array-copy earr (* 2 idx)
                          earr (* 2 (inc idx))
                          (* 2 (- n idx)))
              (aset earr (* 2 idx) key)
              (aset earr (inc (* 2 idx)) val)
              (set! (.-bitmap editable) (bit-or (.-bitmap editable) bit))
              editable)

            (>= n 16)
            (let [nodes (make-array 32)
                  jdx   (mask hash shift)]
              (aset nodes jdx (-inode-assoc! cljc.core.BitmapIndexedNode/EMPTY edit (+ shift 5) hash key val added-leaf?))
              (loop [i 0 j 0]
                (if (< i 32)
                  (if (zero? (bit-and (bit-shift-right-zero-fill bitmap i) 1))
                    (recur (inc i) j)
                    (do (aset nodes i
                              (if-not (nil? (aget arr j))
                                (-inode-assoc! cljc.core.BitmapIndexedNode/EMPTY
                                               edit (+ shift 5) (cljc.core/hash (aget arr j)) (aget arr j) (aget arr (inc j)) added-leaf?)
                                (aget arr (inc j))))
                        (recur (inc i) (+ j 2))))))
              (ArrayNode. edit (inc n) nodes))

            :else
            (let [new-arr (make-array (* 2 (+ n 4)))]
              (array-copy arr 0 new-arr 0 (* 2 idx))
              (aset new-arr (* 2 idx) key)
              (aset new-arr (inc (* 2 idx)) val)
              (array-copy arr (* 2 idx) new-arr (* 2 (inc idx)) (* 2 (- n idx)))
              (set! (.-val added-leaf?) true)
              (let [editable (-ensure-editable inode edit)]
                (set! (.-arr editable) new-arr)
                (set! (.-bitmap editable) (bit-or (.-bitmap editable) bit))
                editable))))
        (let [key-or-nil  (aget arr (* 2 idx))
              val-or-node (aget arr (inc (* 2 idx)))]
          (cond (nil? key-or-nil)
                (let [n (-inode-assoc! val-or-node edit (+ shift 5) hash key val added-leaf?)]
                  (if (identical? n val-or-node)
                    inode
                    (edit-and-set inode edit (inc (* 2 idx)) n)))

                (key-test key key-or-nil)
                (if (identical? val val-or-node)
                  inode
                  (edit-and-set inode edit (inc (* 2 idx)) val))

                :else
                (do (set! (.-val added-leaf?) true)
                    (edit-and-set inode edit (* 2 idx) nil (inc (* 2 idx))
                                  (create-node edit (+ shift 5) key-or-nil val-or-node hash key val))))))))

  (-inode-without! [inode edit shift hash key removed-leaf?]
    (let [bit (bitpos hash shift)]
      (if (zero? (bit-and bitmap bit))
        inode
        (let [idx         (bitmap-indexed-node-index bitmap bit)
              key-or-nil  (aget arr (* 2 idx))
              val-or-node (aget arr (inc (* 2 idx)))]
          (cond (nil? key-or-nil)
                (let [n (-inode-without! val-or-node edit (+ shift 5) hash key removed-leaf?)]
                  (cond (identical? n val-or-node) inode
                        (not (nil? n)) (edit-and-set inode edit (inc (* 2 idx)) n)
                        (== bitmap bit) nil
                        :else (-edit-and-remove-pair inode edit bit idx)))
                (key-test key key-or-nil)
                (do (aset removed-leaf? 0 true)
                    (-edit-and-remove-pair inode edit bit idx))
                :else inode))))))

(set! cljc.core.BitmapIndexedNode/EMPTY (BitmapIndexedNode. nil 0 (make-array 0)))

(defn- pack-array-node [array-node edit idx]
  (let [arr     (.-arr array-node)
        len     (* 2 (dec (.-cnt array-node)))
        new-arr (make-array len)]
    (loop [i 0 j 1 bitmap 0]
      (if (< i len)
        (if (and (not (== i idx))
                 (not (nil? (aget arr i))))
          (do (aset new-arr j (aget arr i))
              (recur (inc i) (+ j 2) (bit-or bitmap (bit-shift-left 1 i))))
          (recur (inc i) j bitmap))
        (BitmapIndexedNode. edit bitmap new-arr)))))

(deftype ArrayNode [edit ^:mutable cnt ^:mutable arr]
  INode
  (-inode-assoc [inode shift hash key val added-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (nil? node)
        (ArrayNode. nil (inc cnt) (clone-and-set arr idx (-inode-assoc cljc.core.BitmapIndexedNode/EMPTY (+ shift 5) hash key val added-leaf?)))
        (let [n (-inode-assoc node (+ shift 5) hash key val added-leaf?)]
          (if (identical? n node)
            inode
            (ArrayNode. nil cnt (clone-and-set arr idx n)))))))

  (-inode-without [inode shift hash key]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if-not (nil? node)
        (let [n (-inode-without node (+ shift 5) hash key)]
          (cond
            (identical? n node)
            inode

            (nil? n)
            (if (<= cnt 8)
              (pack-array-node inode nil idx)
              (ArrayNode. nil (dec cnt) (clone-and-set arr idx n)))

            :else
            (ArrayNode. nil cnt (clone-and-set arr idx n))))
        inode)))

  (-inode-lookup [inode shift hash key not-found]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if-not (nil? node)
        (-inode-lookup node (+ shift 5) hash key not-found)
        not-found)))

  (-inode-find [inode shift hash key not-found]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if-not (nil? node)
        (-inode-find node (+ shift 5) hash key not-found)
        not-found)))

  (-inode-seq [inode]
    (create-array-node-seq arr))

  (-ensure-editable [inode e]
    (if (identical? e edit)
      inode
      (ArrayNode. e cnt (aclone arr))))

  (-inode-assoc! [inode edit shift hash key val added-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (nil? node)
        (let [editable (edit-and-set inode edit idx (-inode-assoc! cljc.core.BitmapIndexedNode/EMPTY edit (+ shift 5) hash key val added-leaf?))]
          (set! (.-cnt editable) (inc (.-cnt editable)))
          editable)
        (let [n (-inode-assoc! node edit (+ shift 5) hash key val added-leaf?)]
          (if (identical? n node)
            inode
            (edit-and-set inode edit idx n))))))

  (-inode-without! [inode edit shift hash key removed-leaf?]
    (let [idx  (mask hash shift)
          node (aget arr idx)]
      (if (nil? node)
        inode
        (let [n (-inode-without! node edit (+ shift 5) hash key removed-leaf?)]
          (cond
            (identical? n node)
            inode

            (nil? n)
            (if (<= cnt 8)
              (pack-array-node inode edit idx)
              (let [editable (edit-and-set inode edit idx n)]
                (set! (.-cnt editable) (dec (.-cnt editable)))
                editable))

            :else
            (edit-and-set inode edit idx n)))))))


(defn- hash-collision-node-find-index [arr cnt key]
  (let [lim (* 2 cnt)]
    (loop [i 0]
      (if (< i lim)
        (if (key-test key (aget arr i))
          i
          (recur (+ i 2)))
        -1))))

(deftype HashCollisionNode [edit
                            ^:mutable collision-hash
                            ^:mutable cnt
                            ^:mutable arr]
  INode
  (-inode-assoc [inode shift hash key val added-leaf?]
    (if (== hash collision-hash)
      (let [idx (hash-collision-node-find-index arr cnt key)]
        (if (== idx -1)
          (let [len (alength arr)
                new-arr (make-array (+ len 2))]
            (array-copy arr 0 new-arr 0 len)
            (aset new-arr len key)
            (aset new-arr (inc len) val)
            (set! (.-val added-leaf?) true)
            (HashCollisionNode. nil collision-hash (inc cnt) new-arr))
          (if (= (aget arr idx) val)
            inode
            (HashCollisionNode. nil collision-hash cnt (clone-and-set arr (inc idx) val)))))
      (let [arr (make-array 2)]
        (aset arr 0 nil)
        (aset arr 1 inode)
        (-inode-assoc (BitmapIndexedNode. nil (bitpos collision-hash shift) arr)
                      shift hash key val added-leaf?))))

  (-inode-without [inode shift hash key]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (cond (== idx -1) inode
            (== cnt 1)  nil
            :else (HashCollisionNode. nil collision-hash (dec cnt) (remove-pair arr (quot idx 2))))))

  (-inode-lookup [inode shift hash key not-found]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (cond (< idx 0)              not-found
            (key-test key (aget arr idx)) (aget arr (inc idx))
            :else                  not-found)))

  (-inode-find [inode shift hash key not-found]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (cond (< idx 0)              not-found
            (key-test key (aget arr idx)) [(aget arr idx) (aget arr (inc idx))]
            :else                  not-found)))

  (-inode-seq [inode]
    (create-inode-seq arr))

  (-ensure-editable [inode e]
    (if (identical? e edit)
      inode
      (let [new-arr (make-array (* 2 (inc cnt)))]
        (array-copy arr 0 new-arr 0 (* 2 cnt))
        (HashCollisionNode. e collision-hash cnt new-arr))))

  (-ensure-editable-array [inode e count array]
    (if (identical? e edit)
      (do (set! arr array)
          (set! cnt count)
          inode)
      (HashCollisionNode. edit collision-hash count array)))

  (-inode-assoc! [inode edit shift hash key val added-leaf?]
    (if (== hash collision-hash)
      (let [idx (hash-collision-node-find-index arr cnt key)]
        (if (== idx -1)
          (if (> (alength arr) (* 2 cnt))
            (let [editable (edit-and-set inode edit (* 2 cnt) key (inc (* 2 cnt)) val)]
              (set! (.-val added-leaf?) true)
              (set! (.-cnt editable) (inc (.-cnt editable)))
              editable)
            (let [len     (alength arr)
                  new-arr (make-array (+ len 2))]
              (array-copy arr 0 new-arr 0 len)
              (aset new-arr len key)
              (aset new-arr (inc len) val)
              (set! (.-val added-leaf?) true)
              (-ensure-editable-array inode edit (inc cnt) new-arr)))
          (if (identical? (aget arr (inc idx)) val)
            inode
            (edit-and-set inode edit (inc idx) val))))
      (let [arr (make-array 4)]
        (aset arr 0 nil)
        (aset arr 1 inode)
        (aset arr 2 nil)
        (aset arr 3 nil)
        (-inode-assoc! (BitmapIndexedNode. edit (bitpos collision-hash shift) arr)
                       edit shift hash key val added-leaf?))))

  (-inode-without! [inode edit shift hash key removed-leaf?]
    (let [idx (hash-collision-node-find-index arr cnt key)]
      (if (== idx -1)
        inode
        (do (aset removed-leaf? 0 true)
            (if (== cnt 1)
              nil
              (let [editable (-ensure-editable inode edit)
                    earr     (.-arr editable)]
                (aset earr idx (aget earr (- (* 2 cnt) 2)))
                (aset earr (inc idx) (aget earr (dec (* 2 cnt))))
                (aset earr (dec (* 2 cnt)) nil)
                (aset earr (- (* 2 cnt) 2) nil)
                (set! (.-cnt editable) (dec (.-cnt editable)))
                editable)))))))

(defn- create-node
  ([shift key1 val1 key2hash key2 val2]
     (let [key1hash (hash key1)]
       (if (== key1hash key2hash)
         (let [arr (make-array 4)]
           (aset arr 0 key1)
           (aset arr 1 val1)
           (aset arr 2 key2)
           (aset arr 3 val2)
           (HashCollisionNode. nil key1hash 2 arr))
         (let [added-leaf? (Box. false)]
           (-> cljc.core.BitmapIndexedNode/EMPTY
               (-inode-assoc shift key1hash key1 val1 added-leaf?)
               (-inode-assoc shift key2hash key2 val2 added-leaf?))))))
  ([edit shift key1 val1 key2hash key2 val2]
     (let [key1hash (hash key1)]
       (if (== key1hash key2hash)
         (let[arr (make-array 4)]
           (aset arr 0 key1)
           (aset arr 1 val1)
           (aset arr 2 key2)
           (aset arr 3 val2)
           (HashCollisionNode. nil key1hash 2 arr))
         (let [added-leaf? (Box. false)]
           (-> cljc.core.BitmapIndexedNode/EMPTY
               (-inode-assoc! edit shift key1hash key1 val1 added-leaf?)
               (-inode-assoc! edit shift key2hash key2 val2 added-leaf?)))))))

(deftype NodeSeq [meta nodes i s ^:mutable __hash]
  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (NodeSeq. meta nodes i s __hash))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.List/EMPTY))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.List/EMPTY meta))

  ISequential
  ISeq
  (-first [coll]
    (if (nil? s)
      [(aget nodes i) (aget nodes (inc i))]
      (first s)))

  (-rest [coll]
    (if (nil? s)
      (create-inode-seq nodes (+ i 2) nil)
      (create-inode-seq nodes i (next s))))

  ISeqable
  (-seq [this] this)

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn- create-inode-seq
  ([nodes]
     (create-inode-seq nodes 0 nil))
  ([nodes i s]
     (if (nil? s)
       (let [len (alength nodes)]
         (loop [j i]
           (if (< j len)
             (if-not (nil? (aget nodes j))
               (NodeSeq. nil nodes j nil nil)
               (if-let [node (aget nodes (inc j))]
                 (if-let [node-seq (-inode-seq node)]
                   (NodeSeq. nil nodes (+ j 2) node-seq nil)
                   (recur (+ j 2)))
                 (recur (+ j 2)))))))
       (NodeSeq. nil nodes i s nil))))


(deftype ArrayNodeSeq [meta nodes i s ^:mutable __hash]
  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta] (ArrayNodeSeq. meta nodes i s __hash))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.List/EMPTY meta))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.List/EMPTY meta))

  ISequential
  ISeq
  (-first [coll] (first s))
  (-rest  [coll] (create-array-node-seq nil nodes i (next s)))

  ISeqable
  (-seq [this] this)

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))
  
  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn- create-array-node-seq
  ([nodes] (create-array-node-seq nil nodes 0 nil))
  ([meta nodes i s]
     (if (nil? s)
       (let [len (alength nodes)]
         (loop [j i]
           (if (< j len)
             (if-let [nj (aget nodes j)]
               (if-let [ns (-inode-seq nj)]
                 (ArrayNodeSeq. meta nodes (inc j) ns nil)
                 (recur (inc j)))
               (recur (inc j))))))
       (ArrayNodeSeq. meta nodes i s nil))))

(declare TransientHashMap)

(deftype PersistentHashMap [meta cnt root ^boolean has-nil? nil-val ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (PersistentHashMap. meta cnt root has-nil? nil-val __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (reduce -conj coll entry)))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.PersistentHashMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ISeqable
  (-seq [coll]
    (when (pos? cnt)
      (let [s (if-not (nil? root) (-inode-seq root))]
        (if has-nil?
          (cons [nil nil-val] s)
          s))))

  ICounted
  (-count [coll] cnt)

  ILookup
  (-lookup [coll k]
    (-lookup coll k nil))

  (-lookup [coll k not-found]
    (cond (nil? k)    (if has-nil?
                        nil-val
                        not-found)
          (nil? root) not-found
          :else       (-inode-lookup root 0 (hash k) k not-found)))

  IAssociative
  (-assoc [coll k v]
    (if (nil? k)
      (if (and has-nil? (identical? v nil-val))
        coll
        (PersistentHashMap. meta (if has-nil? cnt (inc cnt)) root true v nil))
      (let [added-leaf? (Box. false)
            new-root    (-> (if (nil? root)
                              cljc.core.BitmapIndexedNode/EMPTY
                              root)
                            (-inode-assoc 0 (hash k) k v added-leaf?))]
        (if (identical? new-root root)
          coll
          (PersistentHashMap. meta (if ^boolean (.-val added-leaf?) (inc cnt) cnt) new-root has-nil? nil-val nil)))))

  (-contains-key? [coll k]
    (cond (nil? k)    has-nil?
          (nil? root) false
          :else       (not (identical? (-inode-lookup root 0 (hash k) k lookup-sentinel)
                                       lookup-sentinel))))

  IMap
  (-dissoc [coll k]
    (cond (nil? k)    (if has-nil?
                        (PersistentHashMap. meta (dec cnt) root false nil nil)
                        coll)
          (nil? root) coll
          :else
          (let [new-root (-inode-without root 0 (hash k) k)]
            (if (identical? new-root root)
              coll
              (PersistentHashMap. meta (dec cnt) new-root has-nil? nil-val nil)))))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll]
    (TransientHashMap. (EditSentinel.) root cnt has-nil? nil-val))

  IPrintable
  (-pr-seq [coll opts]
    (let [pr-pair (fn [keyval opts] (pr-sequential pr-seq "" " " "" opts keyval))]
      (pr-sequential pr-pair "{" ", " "}" opts coll))))

(set! cljc.core.PersistentHashMap/EMPTY (PersistentHashMap. nil 0 nil false nil 0))

(deftype TransientHashMap [^:mutable ^boolean edit
                           ^:mutable root
                           ^:mutable count
                           ^:mutable ^boolean has-nil?
                           ^:mutable nil-val]
  ITransientCollection
  (-conj! [tcoll o]
    (if edit
      (if (satisfies? IMapEntry o)
        (-assoc! tcoll (-key o) (-val o))
        (loop [es (seq o) tcoll tcoll]
          (if-let [e (first es)]
            (recur (next es)
                   (-assoc! tcoll (-key e) (-val e)))
            tcoll)))
      (error "conj! after persistent")))

  (-persistent! [tcoll]
    (if edit
      (do (set! edit nil)
          (PersistentHashMap. nil count root has-nil? nil-val nil))
      (error "persistent! called twice")))

  ITransientAssociative
  (-assoc! [tcoll k v]
    (if edit
      (if (nil? k)
        (do (if (identical? nil-val v)
              nil
              (set! nil-val v))
            (if has-nil?
              nil
              (do (set! count (inc count))
                  (set! has-nil? true)))
            tcoll)
        (let [added-leaf? (Box. false)
              node        (-> (if (nil? root)
                                cljc.core.BitmapIndexedNode/EMPTY
                                root)
                              (-inode-assoc! edit 0 (hash k) k v added-leaf?))]
          (if (identical? node root)
            nil
            (set! root node))
          (if ^boolean (.-val added-leaf?)
            (set! count (inc count)))
          tcoll))
      (error "assoc! after persistent!")))

  ITransientHashMap
  (-without! [tcoll k]
    (if edit
      (if (nil? k)
        (if has-nil?
          (do (set! has-nil? false)
              (set! nil-val nil)
              (set! count (dec count))
              tcoll)
          tcoll)
        (if (nil? root)
          tcoll
          (let [removed-leaf? (Box. false)
                node (-inode-without! root edit 0 (hash k) k removed-leaf?)]
            (if (identical? node root)
              nil
              (set! root node))
            (if (aget removed-leaf? 0)
              (set! count (dec count)))
            tcoll)))
      (error "dissoc! after persistent!")))

  ICounted
  (-count [coll]
    (if edit
      count
      (error "count after persistent!")))

  ILookup
  (-lookup [tcoll k]
    (if (nil? k)
      (if has-nil?
        nil-val)
      (if (nil? root)
        nil
        (-inode-lookup root 0 (hash k) k nil))))

  (-lookup [tcoll k not-found]
    (if (nil? k)
      (if has-nil?
        nil-val
        not-found)
      (if (nil? root)
        not-found
        (-inode-lookup root 0 (hash k) k not-found))))

  ITransientMap
  (-dissoc! [tcoll key] (-without! tcoll key)))

(defn hash-map
  "keyval => key val
  Returns a new hash map with supplied mappings."
  [& keyvals]
  (loop [in (seq keyvals), out (transient cljc.core.PersistentHashMap/EMPTY)]
    (if in
      (recur (nnext in) (assoc! out (first in) (second in)))
      (persistent! out))))

(defn keys
  "Returns a sequence of the map's keys."
  [hash-map]
  (seq (map first hash-map)))

(defn key
  "Returns the key of the map entry."
  [map-entry]
  (-key map-entry))

(defn vals
  "Returns a sequence of the map's values."
  [hash-map]
  (seq (map second hash-map)))

(defn val
  "Returns the value in the map entry."
  [map-entry]
  (-val map-entry))


;;; PersistentHashSet

(declare TransientHashSet)

(deftype PersistentHashSet [meta hash-map ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (PersistentHashSet. meta hash-map __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll o]
    (PersistentHashSet. meta (assoc hash-map o nil) nil))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.PersistentHashSet/EMPTY meta))

  IEquiv
  (-equiv [coll other]
    (and
     (set? other)
     (== (count coll) (count other))
     (every? #(contains? coll %)
             other)))

  IHash
  (-hash [coll] (caching-hash coll hash-iset __hash))

  ISeqable
  (-seq [coll] (keys hash-map))

  ICounted
  (-count [coll] (count (seq coll)))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (if (-contains-key? hash-map v)
      v
      not-found))

  ISet
  (-disjoin [coll v]
    (PersistentHashSet. meta (dissoc hash-map v) nil))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll] (TransientHashSet. (transient hash-map)))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "#{" " " "}" opts coll)))

(set! cljc.core.PersistentHashSet/EMPTY (PersistentHashSet. nil (hash-map) 0))

(set! cljc.core.PersistentHashSet/fromArray
      (fn [items]
        (let [len (count items)]
          (loop [i   0
                 out (transient cljc.core.PersistentHashSet/EMPTY)]
            (if (< i len)
              (recur (inc i) (conj! out (aget items i)))
              (persistent! out))))))

(deftype TransientHashSet [^:mutable transient-map]
  ITransientCollection
  (-conj! [tcoll o]
    (set! transient-map (assoc! transient-map o nil))
    tcoll)

  (-persistent! [tcoll]
    (PersistentHashSet. nil (persistent! transient-map) nil))

  ITransientSet
  (-disjoin! [tcoll v]
    (set! transient-map (dissoc! transient-map v))
    tcoll)

  ICounted
  (-count [tcoll] (count transient-map))

  ILookup
  (-lookup [tcoll v]
    (-lookup tcoll v nil))

  (-lookup [tcoll v not-found]
    (if (identical? (-lookup transient-map v lookup-sentinel) lookup-sentinel)
      not-found
      v))

  IFn
  (-invoke [tcoll k]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      nil
      k))

  (-invoke [tcoll k not-found]
    (if (identical? (-lookup transient-map k lookup-sentinel) lookup-sentinel)
      not-found
      k)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; main function support ;;;;;;;;;;;;;;;;

(defn vector-from-c-string-array [argc argv]
  (loop [acc []
         i 1]
    (if (< i argc)
      (let [arg (c* "make_string (RAW_POINTER_GET (~{}, gchar**) [integer_get (~{})])" argv i)]
        (recur (conj acc arg)
               (inc i)))
      acc)))

(defn main-exit-value [value]
  (cond (integer? value)
        value
        (nil? value)
        0
        :else
        1))
