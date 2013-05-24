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

(ns cljc.core.PersistentTreeSet)

(def EMPTY nil)

(ns cljc.core.PersistentArrayMap)

(def EMPTY nil)
(def HASHMAP_THRESHOLD nil)
(def fromArrays nil)

(ns cljc.core.PersistentTreeMap)

(def EMPTY nil)

(ns cljc.core.List)

(def EMPTY nil)

(ns cljc.objc)

(if-objc
 (declare objc-msg-send))

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

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; arrays ;;;;;;;;;;;;;;;;

(defn aclone
  "Returns a array, cloned from the passed in array"
  [array]
  (cljc.core/aclone array))

(declare inc seq first next count make-array)

(defn array [& args]
  (let [n (count args)
	a (make-array n)]
    (if-let [args (seq args)]
      (loop [i 0
	     args args]
	(aset a i (first args))
	(if-let [args (next args)]
	  (recur (inc i) args))))
    a))

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
  (cljc.core/aset array i val))

(defn alength
  "Returns the length of the array. Works on arrays of all types."
  [array]
  (cljc.core/alength array))

(declare reduce)

;;;;;;;;;;;;;;;;;;;;;;;;;;; core protocols ;;;;;;;;;;;;;

(defprotocol ICounted
  (-count [coll] "constant time count"))

(defprotocol IEmptyableCollection
  (-empty [coll]))

(defprotocol ICollection
  (-conj [coll o]))

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

(defprotocol ISet
  (-disjoin [coll v]))

(defprotocol IStack
  (-peek [coll])
  (-pop [coll]))

(defprotocol IVector
  (-assoc-n [coll n val]))

(defprotocol IDeref
 (-deref [o]))

(defprotocol IMeta
  (-meta [o]))

(defprotocol IWithMeta
  (-with-meta [o meta]))

(defprotocol IReduce
  (-reduce [coll f] [coll f start]))

(defprotocol IKVReduce
  (-kv-reduce [coll f init]))

(defprotocol IEquiv
  (-equiv [o other]))

(defprotocol IHash
  (-hash [o]))

(defprotocol ISeqable
  (-seq [o]))

(defprotocol ISequential
  "Marker interface indicating a persistent collection of sequential items")

(defprotocol IList
  "Marker interface indicating a persistent list")

(defprotocol IRecord
  "Marker interface indicating a record object")

(defprotocol IReversible
  (-rseq [coll]))

(defprotocol ISorted
  (-sorted-seq [coll ascending?])
  (-sorted-seq-from [coll k ascending?])
  (-entry-key [coll entry])
  (-comparator [coll]))

(defprotocol IPrintable
  (-pr-seq [o opts]))

(defprotocol IPending
  (-realized? [d]))

(defprotocol IWatchable
  (-notify-watches [this oldval newval])
  (-add-watch [this key f])
  (-remove-watch [this key]))

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

(defprotocol IComparable
  (-compare [x y]))

(defprotocol IChunk
  (-drop-first [coll]))

(defprotocol IChunkedSeq
  (-chunked-first [coll])
  (-chunked-rest [coll]))

(defprotocol IChunkedNext
  (-chunked-next [coll]))

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

;;;;;;;;;;;;;;;;;;; protocols on primitives ;;;;;;;;
(declare hash-map list equiv-sequential)

(extend-type Nil
  IEquiv
  (-equiv [_ o] (nil? o))

  ICounted
  (-count [_] 0)

  IEmptyableCollection
  (-empty [_] nil)

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
    (or (and (has-type? o Integer)
             (c* "make_boolean (integer_get (~{}) == integer_get (~{}))" i o))
        (and (has-type? o Float)
             (c* "make_boolean ((double)integer_get (~{}) == float_get (~{}))" i o))))

  IHash
  (-hash [o] o)

  IPrintable
  (-pr-seq [i opts]
    (list
     (if-objc
       (c* "make_objc_object ([NSString stringWithFormat: @\"%ld\", integer_get (~{})])" i)
       (c* "make_string_copy_free (g_strdup_printf (\"%ld\", integer_get (~{})))" i)))))

(extend-type Float
  IEquiv
  (-equiv [f o]
    (or (and (has-type? o Float)
             (c* "make_boolean (float_get (~{}) == float_get (~{}))" f o))
        (and (has-type? o Integer)
             (c* "make_boolean (float_get (~{}) == (double)integer_get (~{}))" f o))))

  IHash
  (-hash [o]
    (c* "make_integer (hashmurmur3_32 (&((floating_t*)(~{}))->x, sizeof (double)))" o))

  IPrintable
  (-pr-seq [f opts]
    (list
     (if-objc
       (c* "make_objc_object ([NSString stringWithFormat: @\"%f\", float_get (~{})])" f)
       (c* "make_string_copy_free (g_strdup_printf (\"%f\", float_get (~{})))" f)))))

(extend-type Boolean
  IHash
  (-hash [o]
    (if (identical? o true) 1 0))

  IComparable
  (-compare [x y]
    (if x
      (if y 0 1)
      (if y -1 0)))

  IPrintable
  (-pr-seq [o opts] (list (if o "true" "false"))))

(extend-type Closure
  IHash
  (-hash [o]
    (c* "make_integer ((long)~{})" o)))

(defn inc
  "Returns a number one greater than num."
  [x] (cljc.core/+ x 1))

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

(declare cons pr-str pr-sequential pr-seq)

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

  ILookup
  (-lookup
    ([array k]
       (aget array k))
    ([array k not-found]
       (-nth array k not-found)))

  IReduce
  (-reduce
    ([array f]
       (ci-reduce array f))
    ([array f start]
       (ci-reduce array f start)))

  IPrintable
  (-pr-seq [a opts]
    (pr-sequential pr-seq "#<Array [" ", " "]>" opts a)))

(declare not)

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

(defn ^boolean not
  "Returns true if x is logical false, false otherwise."
  [x] (if x false true))

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

(defn empty
  "Returns an empty collection of the same category as coll, or nil"
  [coll]
  (-empty coll))

(declare counted?)

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

(declare indexed? dec)

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

(declare int)

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

(defn get
  "Returns the value mapped to key, not-found or nil if key not present."
  ([o k]
     (-lookup o k))
  ([o k not-found]
     (-lookup o k not-found)))

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

(defn hash [o]
  (-hash o))

(defn ^boolean empty?
  "Returns true if coll has no items - same as (not (seq coll)).
  Please use the idiom (seq x) rather than (not (empty? x))"
  [coll] (not (seq coll)))

(defn ^boolean coll?
  "Returns true if x satisfies ICollection"
  [x]
  (if (nil? x)
    false
    (satisfies? ICollection x)))

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

(defn ^boolean map?
  "Return true if x satisfies IMap"
  [x]
  (if (nil? x)
    false
    (satisfies? IMap x)))

(defn ^boolean vector?
  "Return true if x satisfies IVector"
  [x] (satisfies? IVector x))

(defn ^boolean chunked-seq?
  [x] (satisfies? IChunkedSeq x))

;;;;;;;;;;;;;;;;;;;; js primitives ;;;;;;;;;;;;
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

;;;;;;;;;;;;;;;; preds ;;;;;;;;;;;;;;;;;;

(def ^:private lookup-sentinel (c* "alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Nil), sizeof (value_t))"))

(defn ^boolean false?
  "Returns true if x is the value false, false otherwise."
  [x] (cljc.core/false? x))

(defn ^boolean true?
  "Returns true if x is the value true, false otherwise."
  [x] (cljc.core/true? x))

(defn ^boolean instance? [t o]
  (c* "make_boolean (~{}->ptable->constructor == ~{})" o t))

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

(defn ^boolean boolean [x]
  (if x true false))

(defn ^boolean char?
  [s]
  (has-type? s Character))

(defn ^boolean string?
  [s]
  (if-objc
    (and (has-type? s ObjCObject)
         (c* "make_boolean ([[objc_object_get (~{}) class] isSubclassOfClass: [NSString class]])" s))
    (has-type? s String)))

(defn ^boolean keyword?
  [s]
  (has-type? s Keyword))

(defn ^boolean symbol?
  [s]
  (has-type? s Symbol))

(defn ^boolean number? [n]
  (or
   (has-type? n Integer)
   (has-type? n Float)))

(defn ^boolean fn? [f]
  (has-type? f Closure))

(defn ^boolean integer?
  [s]
  (has-type? s Integer))

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

(defn find
  "Returns the map entry for key, or nil if key not present."
  [coll k]
  (when (and coll
             (associative? coll)
             (contains? coll k))
    [k (-lookup coll k)]))

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

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Seq fns ;;;;;;;;;;;;;;;;

(declare compare)

(defn ^:private compare-seqs [x y]
  (loop [x x
         y y]
    (if x
      (if y
        (let [c (compare (first x) (first y))]
          (if (zero? c)
            (recur (next x) (next y))
            c))
        1)
      (if y
        -1
        0))))

(defn compare
  "Comparator. Returns a negative number, zero, or a positive number
  when x is logically 'less than', 'equal to', or 'greater than'
  y. Uses IComparable if available and google.array.defaultCompare for objects
 of the same type and special-cases nil to be less than any other object."
  [x y]
  (cond
   (identical? x y) 0
   (nil? x) -1
   (nil? y) 1
   (and (number? x) (number? y)) (cond
                                  (< x y) -1
                                  (> x y) 1
                                  :else 0)
   (have-same-type? x y) (cond
                          (satisfies? IComparable x) (-compare x y)
                          (satisfies? ISeqable x) (compare-seqs (seq x) (seq y))
                          :else (throw (Exception. "compare of non-comparable type")))
   :else (throw (Exception. "compare on non-nil objects of different types"))))

(defn ^:private compare-indexed
  "Compare indexed collection."
  ([xs ys]
     (let [xl (count xs)
           yl (count ys)]
       (cond
        (< xl yl) -1
        (> xl yl) 1
        :else (compare-indexed xs ys xl 0))))
  ([xs ys len n]
     (let [d (compare (nth xs n) (nth ys n))]
       (if (and (zero? d) (< (+ n 1) len))
         (recur xs ys len (inc n))
         d))))

(defn ^:private fn->comparator
  "Given a fn that might be boolean valued or a comparator,
   return a fn that is a comparator."
  [f]
  (if (= f compare)
    compare
    (fn [x y]
      (let [r (f x y)]
        (cond
         (integer? r) r
         (float? r) (cond
                     (< r 0) -1
                     (> r 0) 1
                     :else 0)
         r -1
         (f y x) 1
         :else 0)))))

(declare quot)

(defn- merge-sort! [src dst min max comp]
  (let [len (- max min)]
    (if (< len 2)
      (do
        (array-copy src min dst 0 len)
        dst)
      (let [left-len (quot len 2)
            right-len (- len left-len)
            mid (+ min left-len)
            left (make-array left-len)
            right (make-array right-len)]
        (merge-sort! src left min mid comp)
        (merge-sort! src right mid max comp)
        (loop [i 0
               l 0
               r 0]
          (if (= l left-len)
            (if (= r right-len)
              dst
              (do
                (aset dst i (aget right r))
                (recur (inc i) l (inc r))))
            (if (= r right-len)
              (do
                (aset dst i (aget left l))
                (recur (inc i) (inc l) r))
              (let [le (aget left l)
                    re (aget right r)]
                (if (<= (comp le re) 0)
                  (do
                    (aset dst i le)
                    (recur (inc i) (inc l) r))
                  (do
                    (aset dst i re)
                    (recur (inc i) l (inc r))))))))))))

(declare to-array)
(defn sort
  "Returns a sorted sequence of the items in coll. Comp can be
   boolean-valued comparison funcion, or a -/0/+ valued comparator.
   Comp defaults to compare."
  ([coll]
   (sort compare coll))
  ([comp coll]
   (if (seq coll)
     (let [a (to-array coll)]
       (seq (merge-sort! a a 0 (count a) (fn->comparator comp))))
     ())))

(defn sort-by
  "Returns a sorted sequence of the items in coll, where the sort
   order is determined by comparing (keyfn item).  Comp can be
   boolean-valued comparison funcion, or a -/0/+ valued comparator.
   Comp defaults to compare."
  ([keyfn coll]
   (sort-by keyfn compare coll))
  ([keyfn comp coll]
     (sort (fn [x y] ((fn->comparator comp) (keyfn x) (keyfn y))) coll)))

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

(declare vec rand-int)

(defn shuffle
  "Return a random permutation of coll"
  [coll]
  (let [a (to-array coll)]
    (loop [i (alength a)]
      (if (> i 1)
        (let [j (rand-int i)
              i-1 (dec i)
              tmp (aget a i-1)]
          (aset a i-1 (aget a j))
          (aset a j tmp)
          (recur i-1))
        (vec a)))))

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

;; FIXME: implement once we have Reduced
(defn reduced? [r]
  false)

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

(defn /
  "If no denominators are supplied, returns 1/numerator,
  else returns numerator divided by all of the denominators."
  ([x] (/ 1 x))
  ([x y] (c* "make_float (float_get (~{}) / float_get (~{}))" (number-as-float x) (number-as-float y))) ;; FIXME: waiting on cljs.core//
  ([x y & more] (reduce / (/ x y) more)))

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

(defn quot
  "quot[ient] of dividing numerator by denominator."
  [n d]
  (c* "make_integer (integer_get (~{}) / integer_get (~{}))" (fix n) (fix d)))

(defn rem
  "remainder of dividing numerator by denominator."
  [n d]
  (let [q (quot n d)]
    (- n (* d q))))

(defn rand
  "Returns a random floating point number between 0 (inclusive) and n (default 1) (exclusive)."
  ([]  (c* "make_float (drand48 ())"))
  ([n] (* (rand) n)))

(defn rand-int
  "Returns a random integer between 0 (inclusive) and n (exclusive)."
  [n] (c* "make_integer (random () % integer_get (~{}))" (fix n)))

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

(defn ^boolean pos?
  "Returns true if num is greater than zero, else false"
  [n] (> n 0))

(defn ^boolean zero? [n]
  (cljc.core/zero? n))

(defn ^boolean neg?
  "Returns true if num is less than zero, else false"
  [n] (< n 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; protocols for host types ;;;;;;

(defn nthnext
  "Returns the nth next of coll, (seq coll) when n is 0."
  [coll n]
  (loop [n n xs (seq coll)]
    (if (and xs (pos? n))
      (recur (dec n) (next xs))
      xs)))

;;;;;;;;;;;;;;;;;;;;;;;;;; basics ;;;;;;;;;;;;;;;;;;

(defprotocol IStringBuilder
  (-append! [sb appendee])
  (-to-string [sb]))

(declare reverse)

;; FIXME: use StringBuilder
(defn str
  "With no args, returns the empty string. With one arg x, returns
  x.toString().  (str nil) returns the empty string. With more than
  one arg, returns the concatenation of the str values of the args."
  ([] "")
  ([x] (cond
        (string? x) x
        (symbol? x) (c* "make_string ((char*)symbol_get_utf8 (~{}))" x)
        (keyword? x) (str ":" (c* "make_string ((char*)keyword_get_utf8 (~{}))" x))
        (char? x) (c* "make_string_from_unichar (character_get (~{}))" x)
        (nil? x) ""
        (satisfies? IStringBuilder x) (-to-string x)
        :else (pr-str x)))
  ([& xs]
     (if-objc
       (let [sb (§ (§ NSMutableString) :stringWithCapacity 64)]
         (loop [xs (seq xs)]
           (if xs
             (do
               (§ sb :appendString (str (first xs)))
               (recur (next xs)))
             (§ (§ NSString) :stringWithString sb))))
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
                   (c* "memcpy ((void*)string_get_utf8 (~{}) + integer_get (~{}), string_get_utf8 (~{}), integer_get (~{}))" sb i s b)
                   (recur (next ss) (+ i b)))
                 (do
                   (assert (= i bytes))
                   (c* "((char*)string_get_utf8 (~{})) [integer_get (~{})] = '\\0'" sb i)
                   sb)))))))))

(defn- checked-substring [s start end]
  (let [len (count s)
	end (min end len)
	start (min start end)]
    (if-objc
      (c* "make_objc_object ([objc_object_get (~{}) substringWithRange: NSMakeRange (integer_get (~{}), integer_get (~{}))])" s start (- end start))
      (c* "make_string_copy_free (g_utf8_substring (string_get_utf8 (~{}), integer_get (~{}), integer_get (~{})))" s start end))))

(defn subs
  "Returns the substring of s beginning at start inclusive, and ending
  at end (defaults to length of string), exclusive."
  ([s start]
     (if-objc
       (§ s :substringFromIndex start)
       (subs s start (count s))))
  ([s start end]
     (checked-substring s start end)))

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

(defn hash-combine [seed hash]
  ; a la boost
  (bit-xor seed (+ hash 0x9e3779b9
                   (bit-shift-left seed 6)
                   (bit-shift-right seed 2))))

(defn- hash-coll [coll]
  (reduce #(hash-combine %1 (hash %2)) (hash (first coll)) (next coll)))

(declare key val transient persistent! concat list*)

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

;;;;;;;;;;;;;;;; cons ;;;;;;;;;;;;;;;;
(deftype List [meta first rest count ^:mutable __hash]
  IList

  IWithMeta
  (-with-meta [coll meta] (List. meta first rest count __hash))

  IMeta
  (-meta [coll] meta)

  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll]
    (if (== count 1)
      ()
      rest))

  INext
  (-next [coll]
    (if (== count 1)
      nil
      rest))

  IStack
  (-peek [coll] first)
  (-pop [coll] (-rest coll))

  ICollection
  (-conj [coll o] (List. meta o coll (inc count) nil))

  IEmptyableCollection
  (-empty [coll] cljc.core.List/EMPTY)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll] coll)

  ICounted
  (-count [coll] count)

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(deftype EmptyList [meta]
  IWithMeta
  (-with-meta [coll meta] (EmptyList. meta))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] nil)
  (-rest [coll] ())

  INext
  (-next [coll] nil)

  ISeqable
  (-seq [coll] nil)

  ICollection
  (-conj [coll o] (List. meta o nil 1 nil))

  IEmptyableCollection
  (-empty [coll] coll)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICounted
  (-count [_] 0)

  IHash
  (-hash [coll] 0)

  IPrintable
  (-pr-seq [coll opts] (list "()")))

(set! cljc.core.List/EMPTY (cljc.core/EmptyList. nil))

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

  IEmptyableCollection
  (-empty [coll] (with-meta cljc.core.List/EMPTY meta))

  IHash
  (-hash [coll]
    (caching-hash coll hash-coll __hash))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn cons
  "Returns a new seq where x is the first element and seq is the rest."
  [x coll]
  (if (or (nil? coll)
          (satisfies? ISeq coll))
    (Cons. nil x coll nil)
    (Cons. nil x (seq coll) nil)))

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

(declare string-quote)

(if-objc
  (extend-type (§ NSString)
    IEquiv
    (-equiv [s o]
      (and (string? o)
           (§ s :isEqualToString o)))

    IComparable
    (-compare [s o]
      (§ s :compare o))

    IHash
    (-hash [s]
      (§ s :hash))

    ISeqable
    (-seq [string] (prim-seq string 0))

    ICounted
    (-count [s]
      (§ s :length))

    IIndexed
    (-nth
      ([s n]
         (c* "make_character ([objc_object_get (~{}) characterAtIndex: integer_get (~{})])" s n))
      ([coll n not-found]
         (if (and (<= 0 n) (< n (count coll)))
           (-nth coll n)
           not-found)))

    ILookup
    (-lookup
      ([string k]
         (-nth string k))
      ([string k not_found]
         (-nth string k not_found)))

    IReduce
    (-reduce
      ([string f]
         (ci-reduce string f))
      ([string f start]
         (ci-reduce string f start)))

    IPrintable
    (-pr-seq [s opts]
      (if (:readably opts)
        (list "\"" (string-quote s) "\"")
        (list s))))
  (extend-type String
    IEquiv
    (-equiv [s o]
      (and (has-type? o String)
           (c* "make_boolean (g_utf8_collate (string_get_utf8 (~{}), string_get_utf8 (~{})) == 0)" s o)))

    IComparable
    (-compare [s o]
      (c* "make_integer (g_utf8_collate (string_get_utf8 (~{}), string_get_utf8 (~{})))" s o))

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

    ILookup
    (-lookup
      ([string k]
         (-nth string k))
      ([string k not_found]
         (-nth string k not_found)))

    IReduce
    (-reduce
      ([string f]
         (ci-reduce string f))
      ([string f start]
         (ci-reduce string f start)))

    IPrintable
    (-pr-seq [s opts]
      (if (:readably opts)
        (list "\"" (string-quote s) "\"")
        (list s)))))

(declare str)

(extend-type Keyword
  IEquiv
  (-equiv [k o]
    (identical? k o))

  IComparable
  (-compare [s o]
    (if-objc
     ;;FIXME: this needs to process unicode
     (c* "make_integer (strcmp (keyword_get_utf8 (~{}), keyword_get_utf8 (~{})))" s o)
     (c* "make_integer (g_utf8_collate (keyword_get_utf8 (~{}), keyword_get_utf8 (~{})))" s o)))

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

  IComparable
  (-compare [s o]
    (if-objc
     ;;FIXME: this needs to process unicode
     (c* "make_integer (strcmp (symbol_get_utf8 (~{}), symbol_get_utf8 (~{})))" s o)
     (c* "make_integer (g_utf8_collate (symbol_get_utf8 (~{}), symbol_get_utf8 (~{})))" s o)))

  IPrintable
  (-pr-seq [s opts]
    (list (str s))))

; could use reify
;;; LazySeq ;;;

(declare lazy-seq-value)

(deftype LazySeq [meta ^:mutable realized ^:mutable x ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (LazySeq. meta realized x __hash))

  IMeta
  (-meta [coll] meta)

  ISeq
  (-first [coll] (first (lazy-seq-value coll)))
  (-rest [coll] (rest (lazy-seq-value coll)))

  INext
  (-next [coll] (-seq (-rest coll)))

  ICollection
  (-conj [coll o] (cons o coll))

  IEmptyableCollection
  (-empty [coll] (with-meta cljc.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll] (seq (lazy-seq-value coll)))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn- lazy-seq-value [lazy-seq]
  (let [x (.-x lazy-seq)]
    (if ^boolean (.-realized lazy-seq)
      x
      (do
        (set! (.-x lazy-seq) (x))
        (set! (.-realized lazy-seq) true)
        (.-x lazy-seq)))))

(declare ArrayChunk)

(defprotocol IChunkBuffer
  (-add [_ o])
  (-chunk [_ o]))

(deftype ChunkBuffer [^:mutable buf ^:mutable end]
  IChunkBuffer
  (-add [_ o]
    (if (> (alength buf) (inc end))
      (aset buf end o)
      ;;Fixme -- is this the correct growth behavior?
      (let [newbuf (make-array (* 2 end))]
        (array-copy buf newbuf)
        (aset newbuf end o)
        (set! buf newbuf)))
    (set! end (inc end)))

  (-chunk [_ o]
    (let [ret (ArrayChunk. buf 0 end)]
      (set! buf nil)
      ret))

  ICounted
  (-count [_] end))

(defn chunk-buffer [capacity]
  (ChunkBuffer. (make-array capacity) 0))

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

(deftype ChunkedCons [chunk more meta ^:mutable __hash]
  IWithMeta
  (-with-meta [coll m]
    (ChunkedCons. chunk more m __hash))

  IMeta
  (-meta [coll] meta)

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ISeqable
  (-seq [coll] coll)

  ASeq
  ISeq
  (-first [coll] (-nth chunk 0))
  (-rest [coll]
    (if (> (-count chunk) 1)
      (ChunkedCons. (-drop-first chunk) more meta nil)
      (if (nil? more)
        ()
        more)))

  IChunkedSeq
  (-chunked-first [coll] chunk)
  (-chunked-rest [coll]
    (if (nil? more)
      ()
      more))

  IChunkedNext
  (-chunked-next [coll]
    (if (nil? more)
      nil
      more))

  ICollection
  (-conj [this o]
    (cons o this))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "(" " " ")" opts coll)))

(defn chunk-cons [chunk rest]
  (if (zero? (-count chunk))
    rest
    (ChunkedCons. chunk rest nil nil)))

(defn chunk-append [b x]
  (-add b x))

(defn chunk [b]
  (-chunk b nil))

(defn chunk-first [s]
  (-chunked-first s))

(defn chunk-rest [s]
  (-chunked-rest s))

(defn chunk-next [s]
  (if (satisfies? IChunkedNext s)
    (-chunked-next s)
    (seq (-chunked-rest s))))

;;;;;;;;;;;;;;;;

(defn to-array
  "Naive impl of to-array as a start."
  [s]
  (let [ary (make-array (count s))]
    (loop [s (seq s)
           i 0]
      (if s
        (do
          (aset ary i (first s))
          (recur (next s) (inc i)))
        ary))))

(defn spread
  [arglist]
  (cond
   (nil? arglist) nil
   (nil? (next arglist)) (seq (first arglist))
   :else (cons (first arglist)
               (spread (next arglist)))))

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

(defn list*
  "Creates a new list containing the items prepended to the rest, the
  last of which will be treated as a sequence."
  ([args] (seq args))
  ([a args] (cons a args))
  ([a b args] (cons a (cons b args)))
  ([a b c args] (cons a (cons b (cons c args))))
  ([a b c d & more]
     (cons a (cons b (cons c (cons d (spread more)))))))

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

(defn vary-meta
 "Returns an object of the same type and value as obj, with
  (apply f (meta obj) args) as its metadata."
 [obj f & args]
 (with-meta obj (apply f (meta obj) args)))

(defn ^boolean not=
  "Same as (not (= obj1 obj2))"
  ([x] false)
  ([x y] (not (= x y)))
  ([x y & more]
   (not (apply = x y more))))

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

(defn some
  "Returns the first logical true value of (pred x) for any x in coll,
  else nil.  One common idiom is to use a set as pred, for example
  this will return :fred if :fred is in the sequence, otherwise nil:
  (some #{:fred} coll)"
  [pred coll]
    (when (seq coll)
      (or (pred (first coll)) (recur pred (next coll)))))

(defn ^boolean even?
  "Returns true if n is even, throws an exception if n is not an integer"
   [n] (if (integer? n)
        (zero? (bit-and n 1))
        (throw (Exception. (str "Argument must be an integer: " n)))))

(defn ^boolean odd?
  "Returns true if n is odd, throws an exception if n is not an integer"
  [n] (not (even? n)))

(defn identity [x] x)

(defn ^boolean complement
  "Takes a fn f and returns a fn that takes the same arguments as f,
  has the same effects, if any, and returns the opposite truth value."
  [f]
  (fn
    ([] (not (f)))
    ([x] (not (f x)))
    ([x y] (not (f x y)))
    ([x y & zs] (not (apply f x y zs)))))

(defn comp
  "Takes a set of functions and returns a fn that is the composition
  of those fns.  The returned fn takes a variable number of args,
  applies the rightmost of fns to the args, the next
  fn (right-to-left) to the result, etc."
  ([] identity)
  ([f] f)
  ([f g]
     (fn
       ([] (f (g)))
       ([x] (f (g x)))
       ([x y] (f (g x y)))
       ([x y z] (f (g x y z)))
       ([x y z & args] (f (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (f (g (h))))
       ([x] (f (g (h x))))
       ([x y] (f (g (h x y))))
       ([x y z] (f (g (h x y z))))
       ([x y z & args] (f (g (apply h x y z args))))))
  ([f1 f2 f3 & fs]
    (let [fs (reverse (list* f1 f2 f3 fs))]
      (fn [& args]
        (loop [ret (apply (first fs) args) fs (next fs)]
          (if fs
            (recur ((first fs) ret) (next fs))
            ret))))))

(defn partial
  "Takes a function f and fewer than the normal arguments to f, and
  returns a fn that takes a variable number of additional args. When
  called, the returned function calls f with args + additional args."
  ([f arg1]
   (fn [& args] (apply f arg1 args)))
  ([f arg1 arg2]
   (fn [& args] (apply f arg1 arg2 args)))
  ([f arg1 arg2 arg3]
   (fn [& args] (apply f arg1 arg2 arg3 args)))
  ([f arg1 arg2 arg3 & more]
   (fn [& args] (apply f arg1 arg2 arg3 (concat more args)))))

(defn map-indexed
  "Returns a lazy sequence consisting of the result of applying f to 0
  and the first item of coll, followed by applying f to 1 and the second
  item in coll, etc, until coll is exhausted. Thus function f should
  accept 2 arguments, index and item."
  [f coll]
  (letfn [(mapi [idx coll]
            (lazy-seq
             (when-let [s (seq coll)]
               (if (chunked-seq? s)
                 (let [c (chunk-first s)
                       size (count c)
                       b (chunk-buffer size)]
                   (dotimes [i size]
                     (chunk-append b (f (+ idx i) (-nth c i))))
                   (chunk-cons (chunk b) (mapi (+ idx size) (chunk-rest s))))
                 (cons (f idx (first s)) (mapi (inc idx) (rest s)))))))]
    (mapi 0 coll)))

(defn keep
  "Returns a lazy sequence of the non-nil results of (f item). Note,
  this means false return values will be included.  f must be free of
  side-effects."
  ([f coll]
   (lazy-seq
    (when-let [s (seq coll)]
      (if (chunked-seq? s)
        (let [c (chunk-first s)
              size (count c)
              b (chunk-buffer size)]
          (dotimes [i size]
            (let [x (f (-nth c i))]
              (when-not (nil? x)
                (chunk-append b x))))
          (chunk-cons (chunk b) (keep f (chunk-rest s))))
        (let [x (f (first s))]
          (if (nil? x)
            (keep f (rest s))
            (cons x (keep f (rest s))))))))))

(defn keep-indexed
  "Returns a lazy sequence of the non-nil results of (f index item). Note,
  this means false return values will be included.  f must be free of
  side-effects."
  ([f coll]
     (letfn [(keepi [idx coll]
               (lazy-seq
                (when-let [s (seq coll)]
                  (if (chunked-seq? s)
                    (let [c (chunk-first s)
                          size (count c)
                          b (chunk-buffer size)]
                      (dotimes [i size]
                        (let [x (f (+ idx i) (-nth c i))]
                          (when-not (nil? x)
                            (chunk-append b x))))
                      (chunk-cons (chunk b) (keepi (+ idx size) (chunk-rest s))))
                    (let [x (f idx (first s))]
                      (if (nil? x)
                        (keepi (inc idx) (rest s))
                        (cons x (keepi (inc idx) (rest s)))))))))]
       (keepi 0 coll))))

(defn every-pred
  "Takes a set of predicates and returns a function f that returns true if all of its
  composing predicates return a logical true value against all of its arguments, else it returns
  false. Note that f is short-circuiting in that it will stop execution on the first
  argument that triggers a logical false result against the original predicates."
  ([p]
     (fn ep1
       ([] true)
       ([x] (boolean (p x)))
       ([x y] (boolean (and (p x) (p y))))
       ([x y z] (boolean (and (p x) (p y) (p z))))
       ([x y z & args] (boolean (and (ep1 x y z)
                                     (every? p args))))))
  ([p1 p2]
     (fn ep2
       ([] true)
       ([x] (boolean (and (p1 x) (p2 x))))
       ([x y] (boolean (and (p1 x) (p1 y) (p2 x) (p2 y))))
       ([x y z] (boolean (and (p1 x) (p1 y) (p1 z) (p2 x) (p2 y) (p2 z))))
       ([x y z & args] (boolean (and (ep2 x y z)
                                     (every? #(and (p1 %) (p2 %)) args))))))
  ([p1 p2 p3]
     (fn ep3
       ([] true)
       ([x] (boolean (and (p1 x) (p2 x) (p3 x))))
       ([x y] (boolean (and (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y))))
       ([x y z] (boolean (and (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y) (p1 z) (p2 z) (p3 z))))
       ([x y z & args] (boolean (and (ep3 x y z)
                                     (every? #(and (p1 %) (p2 %) (p3 %)) args))))))
  ([p1 p2 p3 & ps]
     (let [ps (list* p1 p2 p3 ps)]
       (fn epn
         ([] true)
         ([x] (every? #(% x) ps))
         ([x y] (every? #(and (% x) (% y)) ps))
         ([x y z] (every? #(and (% x) (% y) (% z)) ps))
         ([x y z & args] (boolean (and (epn x y z)
                                       (every? #(every? % args) ps))))))))

(defn some-fn
  "Takes a set of predicates and returns a function f that returns the first logical true value
  returned by one of its composing predicates against any of its arguments, else it returns
  logical false. Note that f is short-circuiting in that it will stop execution on the first
  argument that triggers a logical true result against the original predicates."
  ([p]
     (fn sp1
       ([] nil)
       ([x] (p x))
       ([x y] (or (p x) (p y)))
       ([x y z] (or (p x) (p y) (p z)))
       ([x y z & args] (or (sp1 x y z)
                           (some p args)))))
  ([p1 p2]
     (fn sp2
       ([] nil)
       ([x] (or (p1 x) (p2 x)))
       ([x y] (or (p1 x) (p1 y) (p2 x) (p2 y)))
       ([x y z] (or (p1 x) (p1 y) (p1 z) (p2 x) (p2 y) (p2 z)))
       ([x y z & args] (or (sp2 x y z)
                           (some #(or (p1 %) (p2 %)) args)))))
  ([p1 p2 p3]
     (fn sp3
       ([] nil)
       ([x] (or (p1 x) (p2 x) (p3 x)))
       ([x y] (or (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y)))
       ([x y z] (or (p1 x) (p2 x) (p3 x) (p1 y) (p2 y) (p3 y) (p1 z) (p2 z) (p3 z)))
       ([x y z & args] (or (sp3 x y z)
                           (some #(or (p1 %) (p2 %) (p3 %)) args)))))
  ([p1 p2 p3 & ps]
     (let [ps (list* p1 p2 p3 ps)]
       (fn spn
         ([] nil)
         ([x] (some #(% x) ps))
         ([x y] (some #(or (% x) (% y)) ps))
         ([x y z] (some #(or (% x) (% y) (% z)) ps))
         ([x y z & args] (or (spn x y z)
                             (some #(some % args) ps)))))))

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

(defn take
  "Returns a lazy sequence of the first n items in coll, or all items if
  there are fewer than n."
  [n coll]
  (lazy-seq
   (when (pos? n)
     (when-let [s (seq coll)]
      (cons (first s) (take (dec n) (rest s)))))))

(defn drop
  "Returns a lazy sequence of all but the first n items in coll."
  [n coll]
  (let [step (fn [n coll]
               (let [s (seq coll)]
                 (if (and (pos? n) s)
                   (recur (dec n) (rest s))
                   s)))]
    (lazy-seq (step n coll))))

(defn drop-while
  "Returns a lazy sequence of the items in coll starting from the first
  item for which (pred item) returns nil."
  [pred coll]
  (let [step (fn [pred coll]
               (let [s (seq coll)]
                 (if (and s (pred (first s)))
                   (recur pred (rest s))
                   s)))]
    (lazy-seq (step pred coll))))

(defn split-at
  "Returns a vector of [(take n coll) (drop n coll)]"
  [n coll]
  [(take n coll) (drop n coll)])

(defn iterate
  "Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects"
  {:added "1.0"}
  [f x] (cons x (lazy-seq (iterate f (f x)))))

(defn interleave
  "Returns a lazy seq of the first item in each coll, then the second etc."
  ([c1 c2]
     (lazy-seq
      (let [s1 (seq c1) s2 (seq c2)]
        (when (and s1 s2)
          (cons (first s1) (cons (first s2)
                                 (interleave (rest s1) (rest s2))))))))
  ([c1 c2 & colls]
     (lazy-seq
      (let [ss (map seq (conj colls c2 c1))]
        (when (every? identity ss)
          (concat (map first ss) (apply interleave (map rest ss))))))))

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

(defn mapcat
  "Returns the result of applying concat to the result of applying map
  to f and colls.  Thus function f should return a collection."
  ([f coll]
    (flatten1 (map f coll)))
  ([f coll & colls]
    (flatten1 (apply map f coll colls))))

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

(defn remove
  "Returns a lazy sequence of the items in coll for which
  (pred item) returns false. pred must be free of side-effects."
  [pred coll]
  (filter (complement pred) coll))

(defn into
  "Returns a new coll consisting of to-coll with all of the items of
  from-coll conjoined."
  [to from]
  (if (satisfies? IEditableCollection to)
    (persistent! (reduce -conj! (transient to) from))
    (reduce -conj to from)))

(defn get-in
  "Returns the value in a nested associative structure,
  where ks is a sequence of ke(ys. Returns nil if the key is not present,
  or the not-found value if supplied."
  {:added "1.2"
   :static true}
  ([m ks]
     (reduce get m ks))
  ([m ks not-found]
     (loop [sentinel lookup-sentinel
            m m
            ks (seq ks)]
       (if ks
         (let [m (get m (first ks) sentinel)]
           (if (identical? sentinel m)
             not-found
             (recur sentinel m (next ks))))
         m))))

(defn assoc-in
  "Associates a value in a nested associative structure, where ks is a
  sequence of keys and v is the new value and returns a new nested structure.
  If any levels do not exist, hash-maps will be created."
  [m [k & ks] v]
  (if ks
    (assoc m k (assoc-in (get m k) ks v))
    (assoc m k v)))

(defn update-in
  "'Updates' a value in a nested associative structure, where ks is a
  sequence of keys and f is a function that will take the old value
  and any supplied args and return the new value, and returns a new
  nested structure.  If any levels do not exist, hash-maps will be
  created."
  ([m [k & ks] f & args]
   (if ks
     (assoc m k (apply update-in (get m k) ks f args))
     (assoc m k (apply f (get m k) args)))))

(declare pr-sequential pr-seq list hash-coll cons inc equiv-sequential string-quote with-meta)

(declare reduce hash-map nth deref associative?)

(defn flatten-tail
  [coll]
  (if-let [n (next coll)]
    (cons (first coll) (flatten-tail n))
    (first coll)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; String builders ;;;;;;;;;;;;;;;;

(if-objc
  (do
    (deftype StringBuilder [string]
      IStringBuilder
      (-append! [sb appendee]
        (§ string :appendString appendee))
      (-to-string [sb]
        (§ (§ NSString) :stringWithString string)))

    (defn- sb-make [string]
      (StringBuilder. (§ (§ NSMutableString) :stringWithString string))))
  (do
    (deftype StringBuilder [string size used]
      IStringBuilder
      (-append! [sb appendee]
        (let [len (c* "make_integer (strlen (string_get_utf8 (~{})))" appendee)
              new-used (+ used len)
              new-sb (if (<= new-used size)
                       (StringBuilder. string size new-used)
                       (let [new-size (loop [size (if (< size 16)
                                                    32
                                                    (* size 2))]
                                        (if (<= new-used size)
                                          size
                                          (recur (* size 2))))
                             new-string (c* "make_string_with_size (integer_get (~{}))" new-size)]
                         (c* "memcpy ((void*)string_get_utf8 (~{}), string_get_utf8 (~{}), integer_get (~{}))"
                             new-string string used)
                         (StringBuilder. new-string new-size new-used)))]
          (c* "memcpy ((void*)string_get_utf8 (~{}) + integer_get (~{}), string_get_utf8 (~{}), integer_get (~{}))"
              (.-string new-sb) used appendee len)
          new-sb))
      (-to-string [sb]
        string))

    (defn- sb-make [string]
      (let [len (c* "make_integer (strlen (string_get_utf8 (~{})))" string)]
        (StringBuilder. string len len)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Strings ;;;;;;;;;;;;;;;;

;; FIXME: horribly inefficient as well as incomplete
(defn string-quote [s]
  (loop [sb (sb-make "")
         cs (seq s)]
    (if cs
      (let [c (first cs)]
        (recur (-append! sb
                         (cond
                          (= c \") "\\\""
                          (= c \newline) "\\n"
                          (= c \tab) "\\t"
                          :else (str c)))
               (next cs)))
      (str sb))))

;;; PersistentVector
(deftype VectorNode [edit arr])

(declare tv-editable-root tv-editable-tail TransientVector tail-off do-assoc
         pv-fresh-node pv-aget pv-aset new-path push-tail pop-tail chunked-seq array-for)

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

(declare tv-editable-root tv-editable-tail TransientVector deref
         pr-sequential pr-seq)

(declare chunked-seq)

(set! cljc.core.PersistentVector/EMPTY_NODE (pv-fresh-node nil))
(set! cljc.core.PersistentVector/EMPTY
      (PersistentVector. nil 0 5 cljc.core.PersistentVector/EMPTY_NODE (make-array 0) 0))

(defn vec [coll]
  (persistent! (reduce conj! (-as-transient []) coll)))

(defn vector [& args] (vec args))

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

  ISequential
  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  ISeqable
  (-seq [coll]
    (let [subvec-seq (fn subvec-seq [i]
                       (when-not (== i end)
                         (cons (-nth v i)
                               (lazy-seq
                                (subvec-seq (inc i))))))]
      (subvec-seq start)))

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

  IPrintable
  (-pr-seq [coll opts] (pr-sequential pr-seq "[" " " "]" opts coll)))

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

(declare tv-ensure-editable tv-pop-tail tv-push-tail editable-array-for)

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

;;; FIXME: PersistentQueue ;;;

(deftype NeverEquiv []
  IEquiv
  (-equiv [o other] false))

(def ^:private never-equiv (NeverEquiv.))

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

;;; PersistentArrayMap

(defn- array-map-index-of [m k]
  (let [arr (.-arr m)
        len (alength arr)]
    (loop [i 0]
      (cond
        (<= len i) -1
        (= (aget arr i) k) i
        :else (recur (+ i 2))))))

(defn- array-push [arr & vals]
  (let [arr-cnt (count arr)
        vals-cnt (count vals)
        new-arr (make-array (+ arr-cnt vals-cnt))]
    (array-copy arr 0 new-arr 0 arr-cnt)
    (loop [vals (seq vals)
           i arr-cnt]
      (if vals
	(do
	 (aset new-arr i (first vals))
	 (recur (next vals) (inc i)))
	new-arr))))

(defn- array-pop [arr num]
  (let [arr-cnt (count arr)
        new-cnt (- arr-cnt num)
	new-arr (make-array new-cnt)]
    (array-copy arr 0 new-arr 0 new-cnt)
    new-arr))

(declare TransientArrayMap)

(deftype PersistentArrayMap [meta cnt arr ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (PersistentArrayMap. meta cnt arr __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (reduce -conj coll entry)))

  IEmptyableCollection
  (-empty [coll] (-with-meta cljc.core.PersistentArrayMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ISeqable
  (-seq [coll]
    (when (pos? cnt)
      (let [len (alength arr)
            array-map-seq
            (fn array-map-seq [i]
              (lazy-seq
               (when (< i len)
                 (cons [(aget arr i) (aget arr (inc i))]
                       (array-map-seq (+ i 2))))))]
        (array-map-seq 0))))

  ICounted
  (-count [coll] cnt)

  ILookup
  (-lookup [coll k]
    (-lookup coll k nil))

  (-lookup [coll k not-found]
    (let [idx (array-map-index-of coll k)]
      (if (== idx -1)
        not-found
        (aget arr (inc idx)))))

  IAssociative
  (-assoc [coll k v]
    (let [idx (array-map-index-of coll k)]
      (cond
        (== idx -1)
        (if (< cnt cljc.core.PersistentArrayMap/HASHMAP_THRESHOLD)
	  (let [new-cnt (inc cnt)]
	    (PersistentArrayMap. meta
				 new-cnt
				 (array-push arr k v)
				 nil))
          (persistent!
           (assoc!
            (transient (into cljc.core.PersistentHashMap/EMPTY coll))
            k v)))

        (identical? v (aget arr (inc idx)))
        coll

        :else
        (PersistentArrayMap. meta
                             cnt
                             (doto (aclone arr)
                               (aset (inc idx) v))
                             nil))))

  (-contains-key? [coll k]
    (not (== (array-map-index-of coll k) -1)))

  IMap
  (-dissoc [coll k]
    (let [idx (array-map-index-of coll k)]
      (if (>= idx 0)
        (let [len     (alength arr)
              new-len (- len 2)]
          (if (zero? new-len)
            (-empty coll)
            (let [new-arr (make-array new-len)]
              (loop [s 0 d 0]
                (cond
                  (>= s len) (PersistentArrayMap. meta (dec cnt) new-arr nil)
                  (= k (aget arr s)) (recur (+ s 2) d)
                  :else (do (aset new-arr d (aget arr s))
                            (aset new-arr (inc d) (aget arr (inc s)))
                            (recur (+ s 2) (+ d 2))))))))
        coll)))

  IKVReduce
  (-kv-reduce [coll f init]
    (let [len (alength arr)]
      (loop [i 0 init init]
        (if (< i len)
          (let [init (f init (aget arr i) (aget arr (inc i)))]
            (if (reduced? init)
              @init
              (recur (+ i 2) init)))))))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  IEditableCollection
  (-as-transient [coll]
    (TransientArrayMap. true (alength arr) (aclone arr))))

(set! cljc.core.PersistentArrayMap/EMPTY (PersistentArrayMap. nil 0 (array) nil))

(set! cljc.core.PersistentArrayMap/HASHMAP_THRESHOLD 16)

(set! cljc.core.PersistentArrayMap/fromArrays
      (fn [ks vs]
        (let [len (count ks)]
          (loop [i   0
                 out (transient cljc.core.PersistentArrayMap/EMPTY)]
            (if (< i len)
              (recur (inc i) (assoc! out (aget ks i) (aget vs i)))
              (persistent! out))))))

(declare array->transient-hash-map)

(deftype TransientArrayMap [^:mutable editable?
                            ^:mutable len
                            ^:mutable arr]
  ICounted
  (-count [tcoll]
    (if editable?
      (quot len 2)
      (throw (Exception. "count after persistent!"))))

  ILookup
  (-lookup [tcoll k]
    (-lookup tcoll k nil))

  (-lookup [tcoll k not-found]
    (if editable?
      (let [idx (array-map-index-of tcoll k)]
        (if (== idx -1)
          not-found
          (aget arr (inc idx))))
      (throw (Exception. "lookup after persistent!"))))

  ITransientCollection
  (-conj! [tcoll o]
    (if editable?
      (if (satisfies? IMapEntry o)
        (-assoc! tcoll (key o) (val o))
        (loop [es (seq o) tcoll tcoll]
          (if-let [e (first es)]
            (recur (next es)
                   (-assoc! tcoll (key e) (val e)))
            tcoll)))
      (throw (Exception. "conj! after persistent!"))))

  (-persistent! [tcoll]
    (if editable?
      (do (set! editable? false)
          (PersistentArrayMap. nil (quot len 2) arr nil))
      (throw (Exception. "persistent! called twice"))))

  ITransientAssociative
  (-assoc! [tcoll key val]
    (if editable?
      (let [idx (array-map-index-of tcoll key)]
        (if (== idx -1)
          (if (<= (+ len 2) (* 2 cljc.core.PersistentArrayMap/HASHMAP_THRESHOLD))
            (do (set! len (+ len 2))
		(set! arr (array-push arr key val))
                tcoll)
            (assoc! (array->transient-hash-map len arr) key val))
          (if (identical? val (aget arr (inc idx)))
            tcoll
            (do (aset arr (inc idx) val)
                tcoll))))
      (throw (Exception. "assoc! after persistent!"))))

  ITransientMap
  (-dissoc! [tcoll key]
    (if editable?
      (let [idx (array-map-index-of tcoll key)]
        (when (>= idx 0)
          (aset arr idx (aget arr (- len 2)))
          (aset arr (inc idx) (aget arr (dec len)))
	  (set! arr (array-pop arr 2))
          (set! len (- len 2)))
        tcoll)
      (throw (Exception. "dissoc! after persistent!")))))

(declare TransientHashMap)

(defn- array->transient-hash-map [len arr]
  (loop [out (transient {})
         i   0]
    (if (< i len)
      (recur (assoc! out (aget arr i) (aget arr (inc i))) (+ i 2))
      out)))

;;; PersistentHashMap

(declare create-inode-seq create-array-node-seq create-node)

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

(defn- bitmap-indexed-node-index [bitmap bit]
  (bit-count (bit-and bitmap (dec bit))))

(defprotocol IBitmapIndexedNode
  (-edit-and-remove-pair [inode e bit i]))

(defprotocol INode
  (-inode-assoc [inode shift hash key val added-leaf?])
  (-inode-without [inode shift hash key])
  (-inode-lookup [inode shift hash key not-found])
  (-inode-find [inode shift hash key not-found])
  (-inode-seq [inode])
  (-ensure-editable [inode e])
  (-inode-assoc! [inode edit shift hash key val added-leaf?])
  (-inode-without! [inode edit shift hash key removed-leaf?]))

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

(defn ^boolean key-test [key other]
  (if ^boolean (string? key)
      ;; Note the below test is an optimisation used in java and JS
      ;; impls relying on all strings being interned constats, and thus
      ;; there is only one string created with the same char sequence
      ;;(identical? key other)
      (= key other)
    (= key other)))

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
              (aset added-leaf? 0 true)
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
                (do (aset added-leaf? 0 true)
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
              (aset added-leaf? 0 true)
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
              (aset added-leaf? 0 true)
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
                (do (aset added-leaf? 0 true)
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

(defprotocol IHashCollisionNode
  (-ensure-editable-array [inode e count array]))

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
            (aset added-leaf? 0 true)
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

  (-inode-assoc! [inode edit shift hash key val added-leaf?]
    (if (== hash collision-hash)
      (let [idx (hash-collision-node-find-index arr cnt key)]
        (if (== idx -1)
          (if (> (alength arr) (* 2 cnt))
            (let [editable (edit-and-set inode edit (* 2 cnt) key (inc (* 2 cnt)) val)]
              (aset added-leaf? 0 true)
              (set! (.-cnt editable) (inc (.-cnt editable)))
              editable)
            (let [len     (alength arr)
                  new-arr (make-array (+ len 2))]
              (array-copy arr 0 new-arr 0 len)
              (aset new-arr len key)
              (aset new-arr (inc len) val)
              (aset added-leaf? 0 true)
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
                editable))))))

  IHashCollisionNode
  (-ensure-editable-array [inode e count array]
    (if (identical? e edit)
      (do (set! arr array)
          (set! cnt count)
          inode)
      (HashCollisionNode. edit collision-hash count array))))

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
         (let [added-leaf? (array false)]
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
         (let [added-leaf? (array false)]
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

(deftype EditSentinel [])

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
      (let [added-leaf? (array false)
            new-root    (-> (if (nil? root)
                              cljc.core.BitmapIndexedNode/EMPTY
                              root)
                            (-inode-assoc 0 (hash k) k v added-leaf?))]
        (if (identical? new-root root)
          coll
          (PersistentHashMap. meta (if ^boolean (aget added-leaf? 0) (inc cnt) cnt) new-root has-nil? nil-val nil)))))

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

(defprotocol ITransientHashMap
  (-without! [tcoll k]))

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
        (let [added-leaf? (array false)
              node        (-> (if (nil? root)
                                cljc.core.BitmapIndexedNode/EMPTY
                                root)
                              (-inode-assoc! edit 0 (hash k) k v added-leaf?))]
          (if (identical? node root)
            nil
            (set! root node))
          (if ^boolean (aget added-leaf? 0)
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
          (let [removed-leaf? (array false)
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

(declare create-inode-seq create-array-node-seq reset! create-node atom deref)

;;; PersistentTreeMap

(defprotocol IRedBlackNode
  (-add-left [node ins])
  (-add-right [node ins])
  (-remove-left [node del])
  (-remove-right [node del])
  (-blacken [node])
  (-redden [node])
  (-balance-left [node parent])
  (-balance-right [node parent])
  (-replace [node key val left right]))

(declare balance-left-del balance-right-del tree-map-kv-reduce RedNode BlackNode)

(deftype BlackNode [key val left right ^:mutable __hash]
  IRedBlackNode
  (-add-left [node ins]
    (-balance-left ins node))

  (-add-right [node ins]
    (-balance-right ins node))

  (-remove-left [node del]
    (balance-left-del key val del right))

  (-remove-right [node del]
    (balance-right-del key val left del))

  (-blacken [node] node)

  (-redden [node] (RedNode. key val left right nil))

  (-balance-left [node parent]
    (BlackNode. (.-key parent) (.-val parent) node (.-right parent) nil))

  (-balance-right [node parent]
    (BlackNode. (.-key parent) (.-val parent) (.-left parent) node nil))

  (-replace [node key val left right]
    (BlackNode. key val left right nil))

  IKVReduce
  (-kv-reduce [node f init]
    (tree-map-kv-reduce node f init))

  IMapEntry
  (-key [node] key)
  (-val [node] val)

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IMeta
  (-meta [node] nil)

  IWithMeta
  (-with-meta [node meta]
    (with-meta [key val] meta))

  IStack
  (-peek [node] val)

  (-pop [node] [key])

  ICollection
  (-conj [node o] [key val o])

  IEmptyableCollection
  (-empty [node] [])

  ISequential
  ISeqable
  (-seq [node] (list key val))

  ICounted
  (-count [node] 2)

  IIndexed
  (-nth [node n]
    (cond (== n 0) key
          (== n 1) val
          :else    nil))

  (-nth [node n not-found]
    (cond (== n 0) key
          (== n 1) val
          :else    not-found))

  ILookup
  (-lookup [node k] (-nth node k nil))
  (-lookup [node k not-found] (-nth node k not-found))

  IAssociative
  (-assoc [node k v]
    (assoc [key val] k v))

  IVector
  (-assoc-n [node n v]
    (-assoc-n [key val] n v))

  IReduce
  (-reduce [node f]
    (ci-reduce node f))

  (-reduce [node f start]
    (ci-reduce node f start))

  IFn
  (-invoke [node k]
    (-lookup node k))

  (-invoke [node k not-found]
    (-lookup node k not-found)))

(deftype RedNode [key val left right ^:mutable __hash]
  IRedBlackNode
  (-add-left [node ins]
    (RedNode. key val ins right nil))

  (-add-right [node ins]
    (RedNode. key val left ins nil))

  (-remove-left [node del]
    (RedNode. key val del right nil))

  (-remove-right [node del]
    (RedNode. key val left del nil))

  (-blacken [node]
    (BlackNode. key val left right nil))

  (-redden [node]
    (throw (Exception. "red-black tree invariant violation")))

  (-balance-left [node parent]
    (cond
      (instance? RedNode left)
      (RedNode. key val
                (-blacken left)
                (BlackNode. (.-key parent) (.-val parent) right (.-right parent) nil)
                nil)

      (instance? RedNode right)
      (RedNode. (.-key right) (.-val right)
                (BlackNode. key val left (.-left right) nil)
                (BlackNode. (.-key parent) (.-val parent)
                            (.-right right)
                            (.-right parent)
                            nil)
                nil)

      :else
      (BlackNode. (.-key parent) (.-val parent) node (.-right parent) nil)))

  (-balance-right [node parent]
    (cond
      (instance? RedNode right)
      (RedNode. key val
                (BlackNode. (.-key parent) (.-val parent)
                            (.-left parent)
                            left
                            nil)
                (-blacken right)
                nil)

      (instance? RedNode left)
      (RedNode. (.-key left) (.-val left)
                (BlackNode. (.-key parent) (.-val parent)
                            (.-left parent)
                            (.-left left)
                            nil)
                (BlackNode. key val (.-right left) right nil)
                nil)

      :else
      (BlackNode. (.-key parent) (.-val parent) (.-left parent) node nil)))

  (-replace [node key val left right]
    (RedNode. key val left right nil))

  IKVReduce
  (-kv-reduce [node f init]
    (tree-map-kv-reduce node f init))

  IMapEntry
  (-key [node] key)
  (-val [node] val)

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  IMeta
  (-meta [node] nil)

  IWithMeta
  (-with-meta [node meta]
    (with-meta [key val] meta))

  IStack
  (-peek [node] val)

  (-pop [node] [key])

  ICollection
  (-conj [node o] [key val o])

  IEmptyableCollection
  (-empty [node] [])

  ISequential
  ISeqable
  (-seq [node] (list key val))

  ICounted
  (-count [node] 2)

  IIndexed
  (-nth [node n]
    (cond (== n 0) key
          (== n 1) val
          :else    nil))

  (-nth [node n not-found]
    (cond (== n 0) key
          (== n 1) val
          :else    not-found))

  ILookup
  (-lookup [node k] (-nth node k nil))
  (-lookup [node k not-found] (-nth node k not-found))

  IAssociative
  (-assoc [node k v]
    (assoc [key val] k v))

  IVector
  (-assoc-n [node n v]
    (-assoc-n [key val] n v))

  IReduce
  (-reduce [node f]
    (ci-reduce node f))

  (-reduce [node f start]
    (ci-reduce node f start))

  IFn
  (-invoke [node k]
    (-lookup node k))

  (-invoke [node k not-found]
    (-lookup node k not-found)))

(defn- tree-map-seq-push [node stack ascending?]
  (loop [t node stack stack]
    (if-not (nil? t)
      (recur (if ascending? (.-left t) (.-right t))
             (conj stack t))
      stack)))

(deftype PersistentTreeMapSeq [meta stack ascending? cnt ^:mutable __hash]
  ISeqable
  (-seq [this] this)

  ISequential
  ISeq
  (-first [this] (peek stack))
  (-rest [this]
    (let [t (first stack)
          next-stack (tree-map-seq-push (if ascending? (.-right t) (.-left t))
                                        (next stack)
                                        ascending?)]
      (if-not (nil? next-stack)
        (PersistentTreeMapSeq. nil next-stack ascending? (dec cnt) nil)
        ())))

  ICounted
  (-count [coll]
    (if (neg? cnt)
      (inc (count (next coll)))
      cnt))

  IEquiv
  (-equiv [coll other] (equiv-sequential coll other))

  ICollection
  (-conj [coll o] (cons o coll))

  IHash
  (-hash [coll] (caching-hash coll hash-coll __hash))

  IMeta
  (-meta [coll] meta)

  IWithMeta
  (-with-meta [coll meta]
    (PersistentTreeMapSeq. meta stack ascending? cnt __hash)))

(defn- create-tree-map-seq [tree ascending? cnt]
  (PersistentTreeMapSeq. nil (tree-map-seq-push tree nil ascending?) ascending? cnt nil))

(defn- balance-left [key val ins right]
  (if (instance? RedNode ins)
    (cond
      (instance? RedNode (.-left ins))
      (RedNode. (.-key ins) (.-val ins)
              (-blacken (.-left ins))
              (BlackNode. key val (.-right ins) right nil)
              nil)

      (instance? RedNode (.-right ins))
      (RedNode. (.. ins -right -key) (.. ins -right -val)
                (BlackNode. (.-key ins) (.-val ins)
                            (.-left ins)
                            (.. ins -right -left)
                            nil)
                (BlackNode. key val
                            (.. ins -right -right)
                            right
                            nil)
                nil)

      :else
      (BlackNode. key val ins right nil))
    (BlackNode. key val ins right nil)))

(defn- balance-right [key val left ins]
  (if (instance? RedNode ins)
    (cond
      (instance? RedNode (.-right ins))
      (RedNode. (.-key ins) (.-val ins)
                (BlackNode. key val left (.-left ins) nil)
                (-blacken (.-right ins))
                nil)

      (instance? RedNode (.-left ins))
      (RedNode. (.. ins -left -key) (.. ins -left -val)
                (BlackNode. key val left (.. ins -left -left) nil)
                (BlackNode. (.-key ins) (.-val ins)
                            (.. ins -left -right)
                            (.-right ins)
                            nil)
                nil)

      :else
      (BlackNode. key val left ins nil))
    (BlackNode. key val left ins nil)))

(defn- balance-left-del [key val del right]
  (cond
    (instance? RedNode del)
    (RedNode. key val (-blacken del) right nil)

    (instance? BlackNode right)
    (balance-right key val del (-redden right))

    (and (instance? RedNode right) (instance? BlackNode (.-left right)))
    (RedNode. (.. right -left -key) (.. right -left -val)
              (BlackNode. key val del (.. right -left -left) nil)
              (balance-right (.-key right) (.-val right)
                             (.. right -left -right)
                             (-redden (.-right right)))
              nil)

    :else
    (throw (Exception. "red-black tree invariant violation"))))

(defn- balance-right-del [key val left del]
  (cond
    (instance? RedNode del)
    (RedNode. key val left (-blacken del) nil)

    (instance? BlackNode left)
    (balance-left key val (-redden left) del)

    (and (instance? RedNode left) (instance? BlackNode (.-right left)))
    (RedNode. (.. left -right -key) (.. left -right -val)
              (balance-left (.-key left) (.-val left)
                            (-redden (.-left left))
                            (.. left -right -left))
              (BlackNode. key val (.. left -right -right) del nil)
              nil)

    :else
    (throw (Exception. "red-black tree invariant violation"))))

(defn- tree-map-kv-reduce [node f init]
  (let [init (f init (.-key node) (.-val node))]
    (if (reduced? init)
      @init
      (let [init (if-not (nil? (.-left node))
                   (tree-map-kv-reduce (.-left node) f init)
                   init)]
        (if (reduced? init)
          @init
          (let [init (if-not (nil? (.-right node))
                       (tree-map-kv-reduce (.-right node) f init)
                       init)]
            (if (reduced? init)
              @init
              init)))))))

(defn- tree-map-add [comp tree k v found]
  (if (nil? tree)
    (RedNode. k v nil nil nil)
    (let [c (comp k (.-key tree))]
      (cond
        (zero? c)
        (do (aset found 0 tree)
            nil)

        (neg? c)
        (let [ins (tree-map-add comp (.-left tree) k v found)]
          (if-not (nil? ins)
            (-add-left tree ins)))

        :else
        (let [ins (tree-map-add comp (.-right tree) k v found)]
          (if-not (nil? ins)
            (-add-right tree ins)))))))

(defn- tree-map-append [left right]
  (cond
    (nil? left)
    right

    (nil? right)
    left

    (instance? RedNode left)
    (if (instance? RedNode right)
      (let [app (tree-map-append (.-right left) (.-left right))]
        (if (instance? RedNode app)
          (RedNode. (.-key app) (.-val app)
                    (RedNode. (.-key left) (.-val left)
                              (.-left left)
                              (.-left app)
                              nil)
                    (RedNode. (.-key right) (.-val right)
                              (.-right app)
                              (.-right right)
                              nil)
                    nil)
          (RedNode. (.-key left) (.-val left)
                    (.-left left)
                    (RedNode. (.-key right) (.-val right) app (.-right right) nil)
                    nil)))
      (RedNode. (.-key left) (.-val left)
                (.-left left)
                (tree-map-append (.-right left) right)
                nil))

    (instance? RedNode right)
    (RedNode. (.-key right) (.-val right)
              (tree-map-append left (.-left right))
              (.-right right)
              nil)

    :else
    (let [app (tree-map-append (.-right left) (.-left right))]
      (if (instance? RedNode app)
        (RedNode. (.-key app) (.-val app)
                  (BlackNode. (.-key left) (.-val left)
                              (.-left left)
                              (.-left app)
                              nil)
                  (BlackNode. (.-key right) (.-val right)
                              (.-right app)
                              (.-right right)
                              nil)
                  nil)
        (balance-left-del (.-key left) (.-val left)
                          (.-left left)
                          (BlackNode. (.-key right) (.-val right)
                                      app
                                      (.-right right)
                                      nil))))))

(defn- tree-map-remove [comp tree k found]
  (if-not (nil? tree)
    (let [c (comp k (.-key tree))]
      (cond
        (zero? c)
        (do (aset found 0 tree)
            (tree-map-append (.-left tree) (.-right tree)))

        (neg? c)
        (let [del (tree-map-remove comp (.-left tree) k found)]
          (if (or (not (nil? del)) (not (nil? (aget found 0))))
            (if (instance? BlackNode (.-left tree))
              (balance-left-del (.-key tree) (.-val tree) del (.-right tree))
              (RedNode. (.-key tree) (.-val tree) del (.-right tree) nil))))

        :else
        (let [del (tree-map-remove comp (.-right tree) k found)]
          (if (or (not (nil? del)) (not (nil? (aget found 0))))
            (if (instance? BlackNode (.-right tree))
              (balance-right-del (.-key tree) (.-val tree) (.-left tree) del)
              (RedNode. (.-key tree) (.-val tree) (.-left tree) del nil))))))))

(defn- tree-map-replace [comp tree k v]
  (let [tk (.-key tree)
        c  (comp k tk)]
    (cond (zero? c) (-replace tree tk v (.-left tree) (.-right tree))
          (neg? c)  (-replace tree tk (.-val tree) (tree-map-replace comp (.-left tree) k v) (.-right tree))
          :else     (-replace tree tk (.-val tree) (.-left tree) (tree-map-replace comp (.-right tree) k v)))))

(declare key)

(defprotocol IPersistentTreeMap
  (-entry-at [coll k]))

(deftype PersistentTreeMap [comp tree cnt meta ^:mutable __hash]
  IPersistentTreeMap
  (-entry-at [coll k]
    (loop [t tree]
      (if-not (nil? t)
        (let [c (comp k (.-key t))]
          (cond (zero? c) t
                (neg? c)  (recur (.-left t))
                :else     (recur (.-right t)))))))

  IWithMeta
  (-with-meta [coll meta] (PersistentTreeMap. comp tree cnt meta __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll entry]
    (if (vector? entry)
      (-assoc coll (-nth entry 0) (-nth entry 1))
      (reduce -conj
              coll
              entry)))

  IEmptyableCollection
  (-empty [coll] (with-meta cljc.core.PersistentTreeMap/EMPTY meta))

  IEquiv
  (-equiv [coll other] (equiv-map coll other))

  IHash
  (-hash [coll] (caching-hash coll hash-imap __hash))

  ICounted
  (-count [coll] cnt)

  IKVReduce
  (-kv-reduce [coll f init]
    (if-not (nil? tree)
      (tree-map-kv-reduce tree f init)
      init))

  IFn
  (-invoke [coll k]
    (-lookup coll k))

  (-invoke [coll k not-found]
    (-lookup coll k not-found))

  ISeqable
  (-seq [coll]
    (if (pos? cnt)
      (create-tree-map-seq tree true cnt)))

  IReversible
  (-rseq [coll]
    (if (pos? cnt)
      (create-tree-map-seq tree false cnt)))

  ILookup
  (-lookup [coll k]
    (-lookup coll k nil))

  (-lookup [coll k not-found]
    (let [n (-entry-at coll k)]
      (if-not (nil? n)
        (.-val n)
        not-found)))

  IAssociative
  (-assoc [coll k v]
    (let [found (array nil)
          t     (tree-map-add comp tree k v found)]
      (if (nil? t)
        (let [found-node (nth found 0)]
          (if (= v (.-val found-node))
            coll
            (PersistentTreeMap. comp (tree-map-replace comp tree k v) cnt meta nil)))
        (PersistentTreeMap. comp (-blacken t) (inc cnt) meta nil))))

  (-contains-key? [coll k]
    (not (nil? (-entry-at coll k))))

  IMap
  (-dissoc [coll k]
    (let [found (array nil)
          t     (tree-map-remove comp tree k found)]
      (if (nil? t)
        (if (nil? (nth found 0))
          coll
          (PersistentTreeMap. comp nil 0 meta nil))
        (PersistentTreeMap. comp (-blacken t) (dec cnt) meta nil))))

  ISorted
  (-sorted-seq [coll ascending?]
    (if (pos? cnt)
      (create-tree-map-seq tree ascending? cnt)))

  (-sorted-seq-from [coll k ascending?]
    (if (pos? cnt)
      (loop [stack nil t tree]
        (if-not (nil? t)
          (let [c (comp k (.-key t))]
            (cond
              (zero? c)  (PersistentTreeMapSeq. nil (conj stack t) ascending? -1 nil)
              ascending? (if (neg? c)
                           (recur (conj stack t) (.-left t))
                           (recur stack          (.-right t)))
              :else      (if (pos? c)
                           (recur (conj stack t) (.-right t))
                           (recur stack          (.-left t)))))
          (if (nil? stack)
            (PersistentTreeMapSeq. nil stack ascending? -1 nil))))))

  (-entry-key [coll entry] (key entry))

  (-comparator [coll] comp))

(set! cljc.core.PersistentTreeMap/EMPTY (PersistentTreeMap. compare nil 0 nil 0))

(defn hash-map
  "keyval => key val
  Returns a new hash map with supplied mappings."
  [& keyvals]
  (loop [in (seq keyvals), out (transient cljc.core.PersistentHashMap/EMPTY)]
    (if in
      (recur (nnext in) (assoc! out (first in) (second in)))
      (persistent! out))))

(defn sorted-map
  "keyval => key val
  Returns a new sorted map with supplied mappings."
  ([& keyvals]
     (loop [in (seq keyvals) out cljc.core.PersistentTreeMap/EMPTY]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))

(defn sorted-map-by
  "keyval => key val
  Returns a new sorted map with supplied mappings, using the supplied comparator."
  ([comparator & keyvals]
     (loop [in (seq keyvals)
            out (cljc.core/PersistentTreeMap. comparator nil 0 nil 0)]
       (if in
         (recur (nnext in) (assoc out (first in) (second in)))
         out))))

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

(defn merge
  "Returns a map that consists of the rest of the maps conj-ed onto
  the first.  If a key occurs in more than one map, the mapping from
  the latter (left-to-right) will be the mapping in the result."
  [& maps]
  (when (some identity maps)
    (reduce #(conj (or %1 {}) %2) maps)))

(defn merge-with
  "Returns a map that consists of the rest of the maps conj-ed onto
  the first.  If a key occurs in more than one map, the mapping(s)
  from the latter (left-to-right) will be combined with the mapping in
  the result by calling (f val-in-result val-in-latter)."
  [f & maps]
  (when (some identity maps)
    (let [merge-entry (fn [m e]
                        (let [k (first e) v (second e)]
                          (if (contains? m k)
                            (assoc m k (f (get m k) v))
                            (assoc m k v))))
          merge2 (fn [m1 m2]
                   (reduce merge-entry (or m1 {}) (seq m2)))]
      (reduce merge2 maps))))

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

(deftype PersistentTreeSet [meta tree-map ^:mutable __hash]
  IWithMeta
  (-with-meta [coll meta] (PersistentTreeSet. meta tree-map __hash))

  IMeta
  (-meta [coll] meta)

  ICollection
  (-conj [coll o]
    (PersistentTreeSet. meta (assoc tree-map o nil) nil))

  IEmptyableCollection
  (-empty [coll] (with-meta cljc.core.PersistentTreeSet/EMPTY meta))

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
  (-seq [coll] (keys tree-map))

  ISorted
  (-sorted-seq [coll ascending?]
    (map key (-sorted-seq tree-map ascending?)))

  (-sorted-seq-from [coll k ascending?]
    (map key (-sorted-seq-from tree-map k ascending?)))

  (-entry-key [coll entry] entry)

  (-comparator [coll] (-comparator tree-map))

  IReversible
  (-rseq [coll]
    (map key (rseq tree-map)))

  ICounted
  (-count [coll] (count tree-map))

  ILookup
  (-lookup [coll v]
    (-lookup coll v nil))
  (-lookup [coll v not-found]
    (if (-contains-key? tree-map v)
      v
      not-found))

  ISet
  (-disjoin [coll v]
    (PersistentTreeSet. meta (dissoc tree-map v) nil))

  IFn
  (-invoke [coll k]
    (-lookup coll k))
  (-invoke [coll k not-found]
    (-lookup coll k not-found)))

(set! cljc.core.PersistentTreeSet/EMPTY (PersistentTreeSet. nil (sorted-map) 0))

(defn set
  "Returns a set of the distinct elements of coll."
  ([coll]
     (loop [in (seq coll)
	    out (transient cljc.core.PersistentHashSet/EMPTY)]
       (if (seq in)
	 (recur (next in) (conj! out (first in)))
	 (persistent! out)))))

(defn sorted-set
  "Returns a new sorted set with supplied keys."
  ([& keys]
   (reduce -conj cljc.core.PersistentTreeSet/EMPTY keys)))

(defn sorted-set-by
  "Returns a new sorted set with supplied keys, using the supplied comparator."
  ([comparator & keys]
   (reduce -conj
           (cljc.core/PersistentTreeSet. nil (sorted-map-by comparator) 0)
           keys)))

(defn replace
  "Given a map of replacement pairs and a vector/collection, returns a
  vector/seq with any elements = a key in smap replaced with the
  corresponding val in smap"
  [smap coll]
  (if (vector? coll)
    (let [n (count coll)]
      (reduce (fn [v i]
                (if-let [e (find smap (nth v i))]
                  (assoc v i (second e))
                  v))
              coll (take n (iterate inc 0))))
    (map #(if-let [e (find smap %)] (second e) %) coll)))

(defn distinct
  "Returns a lazy sequence of the elements of coll with duplicates removed"
  [coll]
  (let [step (fn step [xs seen]
               (lazy-seq
                ((fn [[f :as xs] seen]
                   (when-let [s (seq xs)]
                     (if (contains? seen f)
                       (recur (rest s) seen)
                       (cons f (step (rest s) (conj seen f))))))
                 xs seen)))]
    (step coll #{})))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn name
  "Returns the name String of a string, symbol or keyword."
  [x]
  (cond
   (string? x) x
   (keyword? x) (c* "keyword_get_name (~{})" x)
   (symbol? x) (c* "symbol_get_name (~{})" x)
   :else (error (str "Doesn't support name: " x))))

(defn namespace
  "Returns the namespace String of a symbol or keyword, or nil if not present."
  [x]
  (cond
   (keyword? x) (c* "keyword_get_namespace (~{})" x)
   (symbol? x) (c* "symbol_get_namespace (~{})" x)
   :else (error (str "Doesn't support namespace: " x))))

(defn zipmap
  "Returns a map with the keys mapped to the corresponding vals."
  [keys vals]
    (loop [map {}
           ks (seq keys)
           vs (seq vals)]
      (if (and ks vs)
        (recur (assoc map (first ks) (first vs))
               (next ks)
               (next vs))
        map)))

(defn max-key
  "Returns the x for which (k x), a number, is greatest."
  ([k x] x)
  ([k x y] (if (> (k x) (k y)) x y))
  ([k x y & more]
   (reduce #(max-key k %1 %2) (max-key k x y) more)))

(defn min-key
  "Returns the x for which (k x), a number, is least."
  ([k x] x)
  ([k x y] (if (< (k x) (k y)) x y))
  ([k x y & more]
     (reduce #(min-key k %1 %2) (min-key k x y) more)))

(defn partition-all
  "Returns a lazy sequence of lists like partition, but may include
  partitions with fewer than n items at the end."
  ([n coll]
     (partition-all n n coll))
  ([n step coll]
     (lazy-seq
      (when-let [s (seq coll)]
        (cons (take n s) (partition-all n step (drop step s)))))))

(defn take-while
  "Returns a lazy sequence of successive items from coll while
  (pred item) returns true. pred must be free of side-effects."
  [pred coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (when (pred (first s))
       (cons (first s) (take-while pred (rest s)))))))

(defn mk-bound-fn
  [sc test key]
  (fn [e]
    (let [comp (-comparator sc)]
      (test (comp (-entry-key sc e) key) 0))))

(defn subseq
  "sc must be a sorted collection, test(s) one of <, <=, > or
  >=. Returns a seq of those entries with keys ek for
  which (test (.. sc comparator (compare ek key)) 0) is true"
  ([sc test key]
     (let [include (mk-bound-fn sc test key)]
       (if (#{> >=} test)
         (when-let [[e :as s] (-sorted-seq-from sc key true)]
           (if (include e) s (next s)))
         (take-while include (-sorted-seq sc true)))))
  ([sc start-test start-key end-test end-key]
     (when-let [[e :as s] (-sorted-seq-from sc start-key true)]
       (take-while (mk-bound-fn sc end-test end-key)
                   (if ((mk-bound-fn sc start-test start-key) e) s (next s))))))

(deftype Range [meta start end step ^:mutable __hash]
  IWithMeta
  (-with-meta [rng meta] (Range. meta start end step __hash))

  IMeta
  (-meta [rng] meta)

  ISeqable
  (-seq [rng]
    (if (pos? step)
      (when (< start end)
        rng)
      (when (> start end)
        rng)))

  ISeq
  (-first [rng] start)
  (-rest [rng]
    (if-not (nil? (-seq rng))
      (Range. meta (+ start step) end step nil)
      ()))

  INext
  (-next [rng]
    (if (pos? step)
      (when (< (+ start step) end)
        (Range. meta (+ start step) end step nil))
      (when (> (+ start step) end)
        (Range. meta (+ start step) end step nil))))

  ICollection
  (-conj [rng o] (cons o rng))

  IEmptyableCollection
  (-empty [rng] (with-meta cljc.core.List/EMPTY meta))

  ISequential
  IEquiv
  (-equiv [rng other] (equiv-sequential rng other))

  IHash
  (-hash [rng] (caching-hash rng hash-coll __hash))

  ICounted
  (-count [rng]
    (if-not (-seq rng)
      0
      (c* "make_integer ((long)ceil (float_get (~{})))" (/ (- end start) step))))

  IIndexed
  (-nth [rng n]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        (throw (Exception. "Index out of bounds")))))
  (-nth [rng n not-found]
    (if (< n (-count rng))
      (+ start (* n step))
      (if (and (> start end) (zero? step))
        start
        not-found)))

  IReduce
  (-reduce [rng f] (ci-reduce rng f))
  (-reduce [rng f s] (ci-reduce rng f s)))

(defn range
  "Returns a lazy seq of nums from start (inclusive) to end
   (exclusive), by step, where start defaults to 0, step to 1,
   and end to infinity."
  ([] (range 0 (c* "make_integer (LONG_MAX)") 1))
  ([end] (range 0 end 1))
  ([start end] (range start end 1))
  ([start end step] (Range. nil start end step nil)))

(defn take-nth
  "Returns a lazy seq of every nth item in coll."
  [n coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (cons (first s) (take-nth n (drop n s))))))

(defn split-with
  "Returns a vector of [(take-while pred coll) (drop-while pred coll)]"
  [pred coll]
  [(take-while pred coll) (drop-while pred coll)])

(defn partition-by
  "Applies f to each value in coll, splitting it each time f returns
   a new value.  Returns a lazy seq of partitions."
  [f coll]
  (lazy-seq
   (when-let [s (seq coll)]
     (let [fst (first s)
           fv (f fst)
           run (cons fst (take-while #(= fv (f %)) (next s)))]
       (cons run (partition-by f (seq (drop (count run) s))))))))

(defn frequencies
  "Returns a map from distinct items in coll to the number of times
  they appear."
  [coll]
  (persistent!
   (reduce (fn [counts x]
             (assoc! counts x (inc (get counts x 0))))
           (transient {}) coll)))

(defn reductions
  "Returns a lazy seq of the intermediate values of the reduction (as
  per reduce) of coll by f, starting with init."
  ([f coll]
     (lazy-seq
      (if-let [s (seq coll)]
        (reductions f (first s) (rest s))
        (list (f)))))
  ([f init coll]
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (reductions f (f init (first s)) (rest s)))))))

(defn juxt
  "Takes a set of functions and returns a fn that is the juxtaposition
  of those fns.  The returned fn takes a variable number of args, and
  returns a vector containing the result of applying each fn to the
  args (left-to-right).
  ((juxt a b c) x) => [(a x) (b x) (c x)]"
  ([f]
     (fn
       ([] (vector (f)))
       ([x] (vector (f x)))
       ([x y] (vector (f x y)))
       ([x y z] (vector (f x y z)))
       ([x y z & args] (vector (apply f x y z args)))))
  ([f g]
     (fn
       ([] (vector (f) (g)))
       ([x] (vector (f x) (g x)))
       ([x y] (vector (f x y) (g x y)))
       ([x y z] (vector (f x y z) (g x y z)))
       ([x y z & args] (vector (apply f x y z args) (apply g x y z args)))))
  ([f g h]
     (fn
       ([] (vector (f) (g) (h)))
       ([x] (vector (f x) (g x) (h x)))
       ([x y] (vector (f x y) (g x y) (h x y)))
       ([x y z] (vector (f x y z) (g x y z) (h x y z)))
       ([x y z & args] (vector (apply f x y z args) (apply g x y z args) (apply h x y z args)))))
  ([f g h & fs]
     (let [fs (list* f g h fs)]
       (fn
         ([] (reduce #(conj %1 (%2)) [] fs))
         ([x] (reduce #(conj %1 (%2 x)) [] fs))
         ([x y] (reduce #(conj %1 (%2 x y)) [] fs))
         ([x y z] (reduce #(conj %1 (%2 x y z)) [] fs))
         ([x y z & args] (reduce #(conj %1 (apply %2 x y z args)) [] fs))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Printing ;;;;;;;;;;;;;;;;

(defn pr-sequential [print-one begin sep end opts coll]
  (concat (list begin)
          (flatten1
            (interpose (list sep) (map #(print-one % opts) coll)))
          (list end)))

(defn string-print [x]
  (*print-fn* x)
  nil)

(defn flush [] ;stub
  nil)

(defn- pr-seq [obj opts]
  ;; FIXME: print meta
  (if (satisfies? IPrintable obj)
    (-pr-seq obj opts)
    (list "#<" (str obj) ">")))

(defn- pr-sb [objs opts]
  (loop [sb (sb-make "")
         objs (seq objs)
         need-sep false]
    (if objs
      (recur (loop [sb (if need-sep (-append! sb " ") sb)
                    strings (seq (pr-seq (first objs) opts))]
               (if strings
                 (recur (-append! sb (first strings))
                        (next strings))
                 sb))
             (next objs)
             true)
      sb)))

(defn pr-str-with-opts
  "Prints a sequence of objects to a string, observing all the
  options given in opts"
  [objs opts]
  (str (pr-sb objs opts)))

(defn prn-str-with-opts
  "Same as pr-str-with-opts followed by (newline)"
  [objs opts]
  (let [sb (pr-sb objs opts)]
    (str (-append! sb "\n"))))

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

(defn newline [opts]
  (string-print "\n")
  (when (get opts :flush-on-newline)
    (flush)))

(def *flush-on-newline* true)
(def *print-readably* true)
(def *print-meta* false)
(def *print-dup* false)

(defn- pr-opts []
  {:flush-on-newline *flush-on-newline*
   :readably *print-readably*
   :meta *print-meta*
   :dup *print-dup*})

(defn pr-str
  "pr to a string, returning it. Fundamental entrypoint to IPrintable."
  [& objs]
  (pr-str-with-opts objs (pr-opts)))

(defn prn-str
  "Same as pr-str followed by (newline)"
  [& objs]
  (prn-str-with-opts objs (pr-opts)))

(defn pr
  "Prints the object(s) using string-print.  Prints the
  object(s), separated by spaces if there is more than one.
  By default, pr and prn print in a way that objects can be
  read by the reader"
  [& objs]
  (pr-with-opts objs (pr-opts)))

(def ^{:doc
  "Prints the object(s) using string-print.
  print and println produce output for human consumption."}
  print
  (fn cljs-core-print [& objs]
    (pr-with-opts objs (assoc (pr-opts) :readably false))))

(defn print-str
  "print to a string, returning it"
  [& objs]
  (pr-str-with-opts objs (assoc (pr-opts) :readably false)))

(defn println
  "Same as print followed by (newline)"
  [& objs]
  (pr-with-opts objs (assoc (pr-opts) :readably false))
  (newline (pr-opts)))

(defn println-str
  "println to a string, returning it"
  [& objs]
  (prn-str-with-opts objs (assoc (pr-opts) :readably false)))

(defn prn
  "Same as pr followed by (newline)."
  [& objs]
  (pr-with-opts objs (pr-opts))
  (newline (pr-opts)))

;; FIXME: extend-protocol IPrintable

;; IComparable
(extend-protocol IComparable
  PersistentVector
  (-compare [x y] (compare-indexed x y)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Reference Types ;;;;;;;;;;;;;;;;

(deftype Atom [^:mutable state ^:mutable meta ^:mutable validator ^:mutable watches]
  IEquiv
  (-equiv [o other] (identical? o other))

  IDeref
  (-deref [_] state)

  IMeta
  (-meta [_] meta)

  IPrintable
  (-pr-seq [a opts]
    (concat  ["#<Atom: "] (-pr-seq state opts) [">"]))

  IWatchable
  (-notify-watches [this oldval newval]
    (doseq [[key f] watches]
      (f key this oldval newval)))
  (-add-watch [this key f]
    (set! (.-watches this) (assoc watches key f)))
  (-remove-watch [this key]
    (set! (.-watches this) (dissoc watches key)))

  IHash
  (-hash [this] (c* "make_integer (identity_hash_code (~{}))" this)))

(defn atom
  "Creates and returns an Atom with an initial value of x and zero or
  more options (in any order):

  :meta metadata-map

  :validator validate-fn

  If metadata-map is supplied, it will be come the metadata on the
  atom. validate-fn must be nil or a side-effect-free fn of one
  argument, which will be passed the intended new state on any state
  change. If the new state is unacceptable, the validate-fn should
  return false or throw an Error.  If either of these error conditions
  occur, then the value of the atom will not change."
  ([x] (Atom. x nil nil nil))
  ([x & {:keys [meta validator]}] (Atom. x meta validator nil)))

(defn reset!
  "Sets the value of atom to newval without regard for the
  current value. Returns newval."
  [a new-value]
  (when-let [validate (.-validator a)]
    (assert (validate new-value) "Validator rejected reference state"))
  (let [old-value (.-state a)]
    (set! (.-state a) new-value)
    (-notify-watches a old-value new-value))
  new-value)

(defn swap!
  "Atomically swaps the value of atom to be:
  (apply f current-value-of-atom args). Note that f may be called
  multiple times, and thus should be free of side effects.  Returns
  the value that was swapped in."
  ([a f]
     (reset! a (f (.-state a))))
  ([a f x]
     (reset! a (f (.-state a) x)))
  ([a f x y]
     (reset! a (f (.-state a) x y)))
  ([a f x y z]
     (reset! a (f (.-state a) x y z)))
  ([a f x y z & more]
     (reset! a (apply f (.-state a) x y z more))))

(defn compare-and-set!
  "Atomically sets the value of atom to newval if and only if the
  current value of the atom is identical to oldval. Returns true if
  set happened, else false."
  [a oldval newval]
  (if (= (.-state a) oldval)
    (do (reset! a newval) true)
    false))

;; generic to all refs
;; (but currently hard-coded to atom!)

(defn deref
  [o]
  (-deref o))

(defn set-validator!
  "Sets the validator-fn for an atom. validator-fn must be nil or a
  side-effect-free fn of one argument, which will be passed the intended
  new state on any state change. If the new state is unacceptable, the
  validator-fn should return false or throw an Error. If the current state
  is not acceptable to the new validator, an Error will be thrown and the
  validator will not be changed."
  [iref val]
  (set! (.-validator iref) val))

(defn get-validator
  "Gets the validator-fn for a var/ref/agent/atom."
  [iref]
  (.-validator iref))

(defn alter-meta!
  "Atomically sets the metadata for a namespace/var/ref/agent/atom to be:

  (apply f its-current-meta args)

  f must be free of side-effects"
  [iref f & args]
  (set! (.-meta iref) (apply f (.-meta iref) args)))

(defn reset-meta!
  "Atomically resets the metadata for an atom"
  [iref m]
  (set! (.-meta iref) m))

(defn add-watch
  "Alpha - subject to change.

  Adds a watch function to an atom reference. The watch fn must be a
  fn of 4 args: a key, the reference, its old-state, its
  new-state. Whenever the reference's state might have been changed,
  any registered watches will have their functions called. The watch
  fn will be called synchronously. Note that an atom's state
  may have changed again prior to the fn call, so use old/new-state
  rather than derefing the reference. Keys must be unique per
  reference, and can be used to remove the watch with remove-watch,
  but are otherwise considered opaque by the watch mechanism.  Bear in
  mind that regardless of the result or action of the watch fns the
  atom's value will change.  Example:

      (def a (atom 0))
      (add-watch a :inc (fn [k r o n] (assert (== 0 n))))
      (swap! a inc)
      ;; Assertion Error
      (deref a)
      ;=> 1"
  [iref key f]
  (-add-watch iref key f))

(defn remove-watch
  "Alpha - subject to change.

  Removes a watch (set by add-watch) from a reference"
  [iref key]
  (-remove-watch iref key))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Delay ;;;;;;;;;;;;;;;;;;;;

(deftype Delay [state f]
  IDeref
  (-deref [_]
    (:value (swap! state (fn [{:keys [done] :as curr-state}]
                           (if done
                             curr-state,
                             {:done true :value (f)})))))

  IPending
  (-realized? [d]
    (:done @state)))

(defn ^boolean delay?
  "returns true if x is a Delay created with delay"
  [x] (instance? cljc.core/Delay x))

(defn force
  "If x is a Delay, returns the (possibly cached) value of its expression, else returns x"
  [x]
  (if (delay? x)
    (deref x)
    x))

(defn ^boolean realized?
  "Returns true if a value has been produced for a promise, delay, future or lazy sequence."
  [d]
  (-realized? d))

(defn memoize
  "Returns a memoized version of a referentially transparent function. The
  memoized version of the function keeps a cache of the mapping from arguments
  to results and, when calls with the same arguments are repeated often, has
  higher performance at the expense of higher memory use."
  [f]
  (let [mem (atom {})]
    (fn [& args]
      (if-let [v (get @mem args)]
        v
        (let [ret (apply f args)]
          (swap! mem assoc args ret)
          ret)))))

(defn trampoline
  "trampoline can be used to convert algorithms requiring mutual
  recursion without stack consumption. Calls f with supplied args, if
  any. If f returns a fn, calls that fn with no arguments, and
  continues to repeat, until the return value is not a fn, then
  returns that non-fn value. Note that if you want to return a fn as a
  final value, you must wrap it in some data structure and unpack it
  after trampoline returns."
  ([f]
     (let [ret (f)]
       (if (fn? ret)
         (recur ret)
         ret)))
  ([f & args]
     (trampoline #(apply f args))))

(defn group-by
  "Returns a map of the elements of coll keyed by the result of
  f on each element. The value at each key will be a vector of the
  corresponding elements, in the order they appeared in coll."
  [f coll]
  (reduce
   (fn [ret x]
     (let [k (f x)]
       (assoc ret k (conj (get ret k []) x))))
   {} coll))

(defn make-hierarchy
  "Creates a hierarchy object for use with derive, isa? etc."
  [] {:parents {} :descendants {} :ancestors {}})

(def
  ^{:private true}
  global-hierarchy (atom (make-hierarchy)))

(defn ^boolean isa?
  "Returns true if (= child parent), or child is directly or indirectly derived from
  parent, either via a JavaScript type inheritance relationship or a
  relationship established via derive. h must be a hierarchy obtained
  from make-hierarchy, if not supplied defaults to the global
  hierarchy"
  ([child parent] (isa? @global-hierarchy child parent))
  ([h child parent]
     (or (= child parent)
         ;; (and (class? parent) (class? child)
         ;;    (. ^Class parent isAssignableFrom child))
         (contains? ((:ancestors h) child) parent)
         ;;(and (class? child) (some #(contains? ((:ancestors h) %) parent) (supers child)))
         (and (vector? parent) (vector? child)
              (== (count parent) (count child))
              (loop [ret true i 0]
                (if (or (not ret) (== i (count parent)))
                  ret
                  (recur (isa? h (child i) (parent i)) (inc i))))))))

(defn parents
  "Returns the immediate parents of tag, either via a JavaScript type
  inheritance relationship or a relationship established via derive. h
  must be a hierarchy obtained from make-hierarchy, if not supplied
  defaults to the global hierarchy"
  ([tag] (parents @global-hierarchy tag))
  ([h tag] (not-empty (get (:parents h) tag))))

(defn ancestors
  "Returns the immediate and indirect parents of tag, either via a JavaScript type
  inheritance relationship or a relationship established via derive. h
  must be a hierarchy obtained from make-hierarchy, if not supplied
  defaults to the global hierarchy"
  ([tag] (ancestors @global-hierarchy tag))
  ([h tag] (not-empty (get (:ancestors h) tag))))

(defn descendants
  "Returns the immediate and indirect children of tag, through a
  relationship established via derive. h must be a hierarchy obtained
  from make-hierarchy, if not supplied defaults to the global
  hierarchy. Note: does not work on JavaScript type inheritance
  relationships."
  ([tag] (descendants @global-hierarchy tag))
  ([h tag] (not-empty (get (:descendants h) tag))))

(defn derive
  "Establishes a parent/child relationship between parent and
  tag. Parent must be a namespace-qualified symbol or keyword and
  child can be either a namespace-qualified symbol or keyword or a
  class. h must be a hierarchy obtained from make-hierarchy, if not
  supplied defaults to, and modifies, the global hierarchy."
  ([tag parent]
   (assert (namespace parent))
   ;; (assert (or (class? tag) (and (instance? cljs.core.Named tag) (namespace tag))))
   (swap! global-hierarchy derive tag parent) nil)
  ([h tag parent]
   (assert (not= tag parent))
   ;; (assert (or (class? tag) (instance? clojure.lang.Named tag)))
   ;; (assert (instance? clojure.lang.INamed tag))
   ;; (assert (instance? clojure.lang.INamed parent))
   (let [tp (:parents h)
         td (:descendants h)
         ta (:ancestors h)
         tf (fn [m source sources target targets]
              (reduce (fn [ret k]
                        (assoc ret k
                               (reduce conj (get targets k #{}) (cons target (targets target)))))
                      m (cons source (sources source))))]
     (or
      (when-not (contains? (tp tag) parent)
        (when (contains? (ta tag) parent)
          (throw (Exception. (str tag "already has" parent "as ancestor"))))
        (when (contains? (ta parent) tag)
          (throw (Exception. (str "Cyclic derivation:" parent "has" tag "as ancestor"))))
        {:parents (assoc (:parents h) tag (conj (get tp tag #{}) parent))
         :ancestors (tf (:ancestors h) tag td parent ta)
         :descendants (tf (:descendants h) parent ta tag td)})
      h))))

(defn- reset-cache
  [method-cache method-table cached-hierarchy hierarchy]
  (swap! method-cache (fn [_] (deref method-table)))
  (swap! cached-hierarchy (fn [_] (deref hierarchy))))

(defn- prefers*
  [x y prefer-table]
  (let [xprefs (@prefer-table x)]
    (or
     (when (and xprefs (xprefs y))
       true)
     (loop [ps (parents y)]
       (when (pos? (count ps))
         (when (prefers* x (first ps) prefer-table)
           true)
         (recur (rest ps))))
     (loop [ps (parents x)]
       (when (pos? (count ps))
         (when (prefers* (first ps) y prefer-table)
           true)
         (recur (rest ps))))
     false)))

(defn- dominates
  [x y prefer-table]
  (or (prefers* x y prefer-table) (isa? x y)))

(defn- find-and-cache-best-method
  [name dispatch-val hierarchy method-table prefer-table method-cache cached-hierarchy]
  (let [best-entry (reduce (fn [be [k _ :as e]]
                             (if (isa? dispatch-val k)
                               (let [be2 (if (or (nil? be) (dominates k (first be) prefer-table))
                                           e
                                           be)]
                                 (when-not (dominates (first be2) k prefer-table)
                                   (throw (Exception.
                                           (str "Multiple methods in multimethod '" name
                                                "' match dispatch value: " dispatch-val " -> " k
                                                " and " (first be2) ", and neither is preferred"))))
                                 be2)
                               be))
                           nil @method-table)]
    (when best-entry
      (if (= @cached-hierarchy @hierarchy)
        (do
          (swap! method-cache assoc dispatch-val (second best-entry))
          (second best-entry))
        (do
          (reset-cache method-cache method-table cached-hierarchy hierarchy)
          (find-and-cache-best-method name dispatch-val hierarchy method-table prefer-table
                                      method-cache cached-hierarchy))))))

(defprotocol IMultiFn
  (-reset [mf])
  (-add-method [mf dispatch-val method])
  (-remove-method [mf dispatch-val])
  (-prefer-method [mf dispatch-val dispatch-val-y])
  (-get-method [mf dispatch-val])
  (-methods [mf])
  (-prefers [mf])
  (-dispatch [mf args]))

(defn- do-dispatch
  [mf dispatch-fn args]
  (let [dispatch-val (apply dispatch-fn args)
        target-fn (-get-method mf dispatch-val)]
    (when-not target-fn
      (throw (Exception. (str "No method in multimethod '" name "' for dispatch value: " dispatch-val))))
    (apply target-fn args)))

(deftype MultiFn [name dispatch-fn default-dispatch-val hierarchy
                  method-table prefer-table method-cache cached-hierarchy]
  IMultiFn
  (-reset [mf]
    (swap! method-table (fn [mf] {}))
    (swap! method-cache (fn [mf] {}))
    (swap! prefer-table (fn [mf] {}))
    (swap! cached-hierarchy (fn [mf] nil))
    mf)

  (-add-method [mf dispatch-val method]
    (swap! method-table assoc dispatch-val method)
    (reset-cache method-cache method-table cached-hierarchy hierarchy)
    mf)

  (-remove-method [mf dispatch-val]
    (swap! method-table dissoc dispatch-val)
    (reset-cache method-cache method-table cached-hierarchy hierarchy)
    mf)

  (-get-method [mf dispatch-val]
    (when-not (= @cached-hierarchy @hierarchy)
      (reset-cache method-cache method-table cached-hierarchy hierarchy))
    (if-let [target-fn (@method-cache dispatch-val)]
      target-fn
      (if-let [target-fn (find-and-cache-best-method name dispatch-val hierarchy method-table
                                                     prefer-table method-cache cached-hierarchy)]
        target-fn
        (@method-table default-dispatch-val))))

  (-prefer-method [mf dispatch-val-x dispatch-val-y]
    (when (prefers* dispatch-val-x dispatch-val-y prefer-table)
      (throw (Exception. (str "Preference conflict in multimethod '" name "': " dispatch-val-y
                   " is already preferred to " dispatch-val-x))))
    (swap! prefer-table
           (fn [old]
             (assoc old dispatch-val-x
                    (conj (get old dispatch-val-x #{})
                          dispatch-val-y))))
    (reset-cache method-cache method-table cached-hierarchy hierarchy))

  (-methods [mf] @method-table)
  (-prefers [mf] @prefer-table)

  (-dispatch [mf args] (do-dispatch mf dispatch-fn args))

  IHash
  (-hash [this] (c* "make_integer (identity_hash_code (~{}))" this))

  IFn
  (-invoke [this & args]
    (-dispatch this args)))

(defn remove-all-methods
  "Removes all of the methods of multimethod."
 [multifn]
 (-reset multifn))

(defn remove-method
  "Removes the method of multimethod associated with dispatch-value."
 [multifn dispatch-val]
 (-remove-method multifn dispatch-val))

(defn prefer-method
  "Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y
   when there is a conflict"
  [multifn dispatch-val-x dispatch-val-y]
  (-prefer-method multifn dispatch-val-x dispatch-val-y))

(defn methods
  "Given a multimethod, returns a map of dispatch values -> dispatch fns"
  [multifn] (-methods multifn))

(defn get-method
  "Given a multimethod and a dispatch value, returns the dispatch fn
  that would apply to that value, or nil if none apply and no default"
  [multifn dispatch-val] (-get-method multifn dispatch-val))

(defn prefers
  "Given a multimethod, returns a map of preferred value -> set of other values"
  [multifn] (-prefers multifn))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; Strings ;;;;;;;;;;;;;;;;

(if-objc
  nil
  (do
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
      (-conj [coll o] (List. nil o coll (inc (count coll)) nil))

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
                             len)))))))

;; FIXME: implement seq for NSArray
(defn split-string-seq [string char]
  (if-objc
    (§ string :componentsSeparatedByString (str char))
    (split-string-seq-next-fn string
                              (c* "make_integer (strlen (string_get_utf8 (~{})))" string)
                              char
                              0)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; I/O ;;;;;;;;;;;;;;;;

(defn slurp [filename]
  (if-objc
    (§ (§ NSString) :stringWithContentsOfFile filename :encoding (c* "make_integer (NSUTF8StringEncoding)") :error nil)
    (c* "make_string_copy_free (slurp_file (string_get_utf8 (~{})))" filename)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; main function support ;;;;;;;;;;;;;;;;

(defn vector-from-c-string-array [argc argv]
  (loop [acc []
         i 1]
    (if (< i argc)
      (let [arg (c* "make_string (RAW_POINTER_GET (~{}, char**) [integer_get (~{})])" argv i)]
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
