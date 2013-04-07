(ns cljc.core
  (:refer-clojure :exclude [-> ->> .. amap and areduce alength aclone assert binding bound-fn case comment cond condp
                            declare definline definterface defmethod defmulti defn defn- defonce
                            defprotocol defrecord defstruct deftype delay doseq dosync dotimes doto
                            extend-protocol extend-type fn float float? for future gen-class gen-interface
                            if-let if-not import integer? io! lazy-cat lazy-seq let letfn locking loop
                            memfn ns or proxy proxy-super pvalues refer-clojure reify sync time
                            when when-first when-let when-not while with-bindings with-in-str
                            with-loading-context with-local-vars with-open with-out-str with-precision with-redefs
                            satisfies? identical? true? false? nil? str get

                            aget aset
                            + - * / < <= > >= == zero? pos? neg? inc dec max min mod
                            bit-and bit-and-not bit-clear bit-flip bit-not bit-or bit-set
                            bit-test bit-shift-left bit-shift-right bit-xor

                            unchecked-inc]))

(alias 'core 'clojure.core)

(defmacro import-macros [ns [& vars]]
  (core/let [ns (find-ns ns)
             vars (map #(ns-resolve ns %) vars)
             syms (map (core/fn [^clojure.lang.Var v] (core/-> v .sym (with-meta {:macro true}))) vars)
             defs (map (core/fn [sym var]
                                `(def ~sym (deref ~var))) syms vars)]
            `(do ~@defs
                 :imported)))

(import-macros clojure.core
 [-> ->> ..  and assert comment cond
  declare defn defn-
  doto
  extend-protocol fn for
  if-let if-not let letfn loop
  or
  when when-first when-let when-not while])

(defn bool-expr [e]
  (vary-meta e assoc :tag 'boolean))

(defmacro identical? [a b]
  (bool-expr (list 'c* "(make_boolean (~{} == ~{}))" a b)))

(defmacro nil? [x]
  `(identical? ~x nil))

(defmacro true? [x]
  (bool-expr (list 'c* "(make_boolean (~{} == value_true))" x)))

(defmacro false? [x]
  (bool-expr (list 'c* "(make_boolean (~{} == value_false))" x)))

(defmacro has-type? [val t]
  ;; FIXME: This is a horrible hack - it can't cope with user types
  ;; because they need to be resolved to get their namespaces.
  (bool-expr `(~'c* ~(core/str "(make_boolean (~{}->ptable->type == TYPE_" (core/str t) "))") ~val)))

(defmacro integer? [x]
  `(has-type? ~x "Integer"))

(defmacro float? [x]
  `(has-type? ~x "Float"))

(defmacro float [x]
  `(let [x# ~x]
     (if (integer? x#)
       (~'c* "make_float (integer_get (~{}))" x#)
       x#)))

(defmacro extend-type [tsym & impls]
  (let [resolve #(let [ret (cljc.compiler/resolve-existing-var (dissoc &env :locals) %)]
                   (assert (:name ret) (core/str "Can't resolve: " %))
                   [(:name ret) (:fields ret)])
        impl-map (loop [ret {} s impls]
                   (if (seq s)
                     (recur (assoc ret (first s) (take-while seq? (next s)))
                            (drop-while seq? (next s)))
                     ret))
        warn-if-not-protocol #(when-not (= 'Object %)
                                (if cljc.compiler/*cljs-warn-on-undeclared*
                                  (if-let [var (cljc.compiler/resolve-existing-var (dissoc &env :locals) %)]
                                    (when-not (:protocol-symbol var)
                                      (cljc.compiler/warning &env
                                        (core/str "WARNING: Symbol " % " is not a protocol")))
                                    (cljc.compiler/warning &env
							   (core/str "WARNING: Can't resolve protocol symbol " %)))))
	[t fields] (resolve tsym)
	assign-impls (fn [[p sigs]]
		       (let [[psym _] (resolve p)
			     vtable (gensym "vtable")]
			 `(let [~vtable (~'c* ~(core/str "make_raw_pointer (alloc_vtable (PROTOCOL_VTABLE_SIZE (" psym ")))"))]
			    ~@(map (fn [[name & meths]]
                                     (let [meths (if (vector? (first meths))
                                                   (list meths)
                                                   meths)]
                                       `(~'c* ~(core/str "set_vtable_entry (RAW_POINTER_GET (~{}, closure_t**), MEMBER_NAME (" (cljc.compiler/munge name) "), (closure_t*)~{})")
                                              ~vtable
                                              (fn ~@meths))))
                                   sigs)
			    (~'c* ~(core/str "extend_ptable (PTABLE_NAME (" t "), PROTOCOL_NAME (" psym "), RAW_POINTER_GET (~{}, closure_t**))") ~vtable))))]
    (concat '(do) (map assign-impls impl-map))))

(defmacro defprotocol [psym & doc+methods]
  (let [p (:name (cljc.compiler/resolve-var (dissoc &env :locals) psym))
        psym (vary-meta psym assoc :protocol-symbol true)
        ns-name (-> &env :ns :name)
        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)
        expand-sig (fn [fname sig]
                     `(~sig
		       ;; FIXME: check satisfies?
		       (. ~(first sig) (~fname ~@(rest sig)))))
        method (fn [[fname & sigs]]
                 (let [sigs (take-while vector? sigs)
                       fname (vary-meta fname assoc :protocol p)]
                   `(defn ~fname ~@(map (fn [sig]
                                          (expand-sig fname
                                                      sig))
                                        sigs))))]
    `(do
       (~'defprotocol* ~psym ~@methods)
       (def ~psym nil)
       ~@(map method methods))))

(defmacro satisfies?
  "Returns true if x satisfies the protocol"
  [psym x]
  (let [p (:name (cljc.compiler/resolve-var (dissoc &env :locals) psym))]
    (list 'c* "make_boolean (value_satisfies_protocol (~{}, PROTOCOL_NAME (~{str})))" x (core/str p))))

(defmacro lazy-seq [& body]
  `(cljc.core/LazySeq. nil false (fn [] ~@body) nil))

(defmacro binding
  "binding => var-symbol init-expr

  Creates new bindings for the (already-existing) vars, with the
  supplied initial values, executes the exprs in an implicit do, then
  re-establishes the bindings that existed before.  The new bindings
  are made in parallel (unlike let); all init-exprs are evaluated
  before the vars are bound to their new values."
  [bindings & body]
  (let [names (take-nth 2 bindings)
        vals (take-nth 2 (drop 1 bindings))
        tempnames (map (comp gensym name) names)
        binds (map vector names vals)
        resets (reverse (map vector names tempnames))]
    (cljc.compiler/confirm-bindings &env names)
    `(let [~@(interleave tempnames names)]
       (try
        ~@(map
           (fn [[k v]] (list 'set! k v))
           binds)
        ~@body
        (finally
         ~@(map
            (fn [[k v]] (list 'set! k v))
            resets))))))

(defmacro condp
  "Takes a binary predicate, an expression, and a set of clauses.
  Each clause can take the form of either:

  test-expr result-expr

  test-expr :>> result-fn

  Note :>> is an ordinary keyword.

  For each clause, (pred test-expr expr) is evaluated. If it returns
  logical true, the clause is a match. If a binary clause matches, the
  result-expr is returned, if a ternary clause matches, its result-fn,
  which must be a unary function, is called with the result of the
  predicate as its argument, the result of that call being the return
  value of condp. A single default expression can follow the clauses,
  and its value will be returned if no clause matches. If no default
  expression is provided and no clause matches, an
  IllegalArgumentException is thrown."
  {:added "1.0"}

  [pred expr & clauses]
  (let [gpred (gensym "pred__")
        gexpr (gensym "expr__")
        emit (fn emit [pred expr args]
               (let [[[a b c :as clause] more]
                       (split-at (if (= :>> (second args)) 3 2) args)
                       n (count clause)]
                 (cond
                  (= 0 n) `(throw (Exception. (core/str "No matching clause: " ~expr)))
                  (= 1 n) a
                  (= 2 n) `(if (~pred ~a ~expr)
                             ~b
                             ~(emit pred expr more))
                  :else `(if-let [p# (~pred ~a ~expr)]
                           (~c p#)
                           ~(emit pred expr more)))))
        gres (gensym "res__")]
    `(let [~gpred ~pred
           ~gexpr ~expr]
       ~(emit gpred gexpr clauses))))

(defmacro deftype [t fields & impls]
  (let [adorn-params (fn [[_ & meths]]
                       (let [meths (if (vector? (first meths))
                                     (list meths)
                                     meths)]
                         (map (fn [[args & body]]
                                (cons (vary-meta args assoc :cljc.compiler/fields fields)
                                      body))
                              meths)))
        ;;reshape for extend-type
        dt->et (fn [specs]
                 (loop [ret [] s specs]
                   (if (seq s)
                     (recur (-> ret
                                (conj (first s))
                                (into
                                 (reduce (fn [v [f sigs]]
                                           (conj v (cons f (mapcat adorn-params sigs))))
                                         []
                                         (group-by first (take-while seq? (next s))))))
                            (drop-while seq? (next s)))
                     ret)))
        [fpps pmasks] nil]
    (let [val (gensym "val")]
      `(do
	 (deftype* ~t ~fields ~pmasks)
	 (defn ~t ~fields
	   (let [~val (~'c* "alloc_value (PTABLE_NAME (~{sym}), sizeof (deftype_t) + sizeof (value_t*) * ~{str})" ~t ~(count fields))]
	     ~@(map-indexed (fn [i fld]
			      (list 'c* "DEFTYPE_SET_FIELD (~{}, ~{str}, ~{})" val i fld))
			    fields)
	     ~val))
	 ~@(if (seq impls)
	     (list `(extend-type ~(with-meta t {:skip-protocol-flag fpps}) ~@(dt->et impls)))
	     ())
	 ~t))))

(defn- unmeta [v]
  (vec (map #(with-meta % nil) v)))

(defn- emit-defrecord
   "Do not use this directly - use defrecord"
  [env tagname rname hinted-base-fields impls]
  (let [base-fields (unmeta hinted-base-fields)
	hinted-meta-ext-fields (conj hinted-base-fields '__meta '__extmap)
	hinted-fields (conj hinted-meta-ext-fields (with-meta '__hash {:mutable true}))
	meta-ext-fields (unmeta hinted-meta-ext-fields)
	fields (unmeta hinted-fields)
	adorn-params (fn [sig]
                       (cons (vary-meta (second sig) assoc :cljc.compiler/fields hinted-fields)
                             (nnext sig)))
        ;;reshape for extend-type
        dt->et (fn [specs]
                 (loop [ret [] s specs]
                   (if (seq s)
                     (recur (-> ret
                                (conj (first s))
                                (into
                                 (reduce (fn [v [f sigs]]
                                           (conj v (cons f (map adorn-params sigs))))
                                         []
                                         (group-by first (take-while seq? (next s))))))
                            (drop-while seq? (next s)))
                     ret)))]
    (let [gs (gensym)
          ksym (gensym "k")
	  impls (concat
		 impls
		 ['IRecord
		  'IHash
		  `(~'-hash [this#] (caching-hash this# ~'hash-imap ~'__hash))
		  'IEquiv
		  `(~'-equiv [this# other#]
			     (if (and (has-type? other# ~rname)
				      (equiv-map this# other#))
			       true
			       false))
		  'IMeta
		  `(~'-meta [this#] ~'__meta)
		  'IWithMeta
		  `(~'-with-meta [this# ~gs] (new ~tagname ~@(replace {'__meta gs} (butlast fields))))
		  'ILookup
		  `(~'-lookup [this# k#] (-lookup this# k# nil))
		  `(~'-lookup [this# ~ksym else#]
         (cond
           ~@(mapcat (fn [f] [`(identical? ~ksym ~(keyword f)) f]) base-fields)
           :else (get ~'__extmap ~ksym else#)))
		  'ICounted
		  `(~'-count [this#] (+ ~(count base-fields) (count ~'__extmap)))
		  'ICollection
		  `(~'-conj [this# entry#]
      		       (if (vector? entry#)
      			 (-assoc this# (-nth entry# 0) (-nth entry# 1))
      			 (reduce -conj
      				 this#
      				 entry#)))
		  'IAssociative
		  `(~'-assoc [this# k# ~gs]
                     (condp identical? k#
                       ~@(mapcat (fn [fld]
                                   [(keyword fld) (list* `new tagname (replace {fld gs} (butlast fields)))])
                                 base-fields)
                       (new ~tagname ~@(remove #{'__extmap '__hash} fields) (assoc ~'__extmap k# ~gs))))
		  'IMap
		  `(~'-dissoc [this# k#] (if (contains? #{~@(map keyword base-fields)} k#)
                                            (dissoc (with-meta (into {} this#) ~'__meta) k#)
                                            (new ~tagname ~@(remove #{'__extmap '__hash} fields)
                                                 (not-empty (dissoc ~'__extmap k#)))))
		  'ISeqable
		  `(~'-seq [this#] (seq (concat [~@(map #(list `vector (keyword %) %) base-fields)]
                                              ~'__extmap)))
		  'IPrintable
		  `(~'-pr-seq [this# opts#]
			      (let [pr-pair# (fn [keyval# pair-opts#] (pr-sequential pr-seq "" " " "" pair-opts# keyval#))]
				(pr-sequential
				 pr-pair# (core/str "#" ~(name rname) "{") ", " "}" opts#
				 (concat [~@(map #(list `vector (keyword %) %) base-fields)]
					 ~'__extmap))))
		  ])
          [fpps pmasks] nil]
      (let [val (gensym "val")
	    num-base-fields (count base-fields)]
	`(do
	   (~'deftype* ~(with-meta tagname {:defrecord true}) ~hinted-fields ~pmasks)
	   (defn ~tagname
	     (~base-fields
	      (let [~val (~'c* "alloc_value (PTABLE_NAME (~{sym}), sizeof (deftype_t) + sizeof (value_t*) * ~{str})"
			       ~tagname ~(count fields))]
		~@(map-indexed (fn [i fld]
				 (list 'c* "DEFTYPE_SET_FIELD (~{}, ~{str}, ~{})" val i fld))
			       base-fields)
		~@(map (fn [i]
			 (list 'c* "DEFTYPE_SET_FIELD (~{}, ~{str}, value_nil)" val i))
		       (range num-base-fields (count fields)))
		~val))
	     (~meta-ext-fields
	      (let [~val (~tagname ~@base-fields)]
		(~'c* "DEFTYPE_SET_FIELD (~{}, ~{str}, ~{})" ~val ~num-base-fields ~'__meta)
		(~'c* "DEFTYPE_SET_FIELD (~{}, ~{str}, ~{})" ~val ~(core/inc num-base-fields) ~'__extmap)
		~val)))
	   (extend-type ~(with-meta tagname {:skip-protocol-flag fpps}) ~@(dt->et impls)))))))

(defn- build-positional-factory
  [rsym rname fields]
  (let [fn-name (symbol (core/str '-> rsym))]
    `(defn ~fn-name
       [~@fields]
       (new ~rsym ~@fields))))

(defn- build-map-factory
  [rsym rname fields]
  (let [fn-name (symbol (core/str 'map-> rsym))
	ms (gensym)
	ks (map keyword fields)
	getters (map (fn [k] `(~k ~ms)) ks)]
    `(defn ~fn-name
       [~ms]
       (new ~rsym ~@getters nil (dissoc ~ms ~@ks)))))

(defmacro defrecord [rsym fields & impls]
  (let [r (:name (cljc.compiler/resolve-var (dissoc &env :locals) rsym))]
    `(let []
       ~(emit-defrecord &env rsym r fields impls)
       ~(build-positional-factory rsym r fields)
       ~(build-map-factory rsym r fields)
       ~rsym)))

(defmacro math-op [op x y]
  `(let [x# ~x
         y# ~y]
     (if (and (integer? x#) (integer? y#))
       (~'c* ~(core/str "make_integer (integer_get (~{}) " (name op) " integer_get (~{}))") x# y#)
       (~'c* ~(core/str "make_float (float_get (~{}) " (name op) " float_get (~{}))") (float x#) (float y#)))))

(defmacro math-op-as-bool [op x y]
  `(let [x# ~x
         y# ~y]
     (if (and (integer? x#) (integer? y#))
       (~'c* ~(core/str "make_boolean (integer_get (~{}) " (name op) " integer_get (~{}))") x# y#)
       (~'c* ~(core/str "make_boolean (float_get (~{}) " (name op) " float_get (~{}))") (float x#) (float y#)))))

(defmacro aset [a i v]
  `(let [v# ~v]
     (~'c* "array_set (~{}, integer_get (~{}), ~{})" ~a ~i v#)
     v#))

(defmacro +
  ([] 0)
  ([x] x)
  ([x y] `(math-op + ~x ~y))
  ([x y & more] `(+ (+ ~x ~y) ~@more)))

(defmacro -
  ([x] `(- 0 ~x))
  ([x y] `(math-op - ~x ~y))
  ([x y & more] `(- (- ~x ~y) ~@more)))

(defmacro *
  ([] 1)
  ([x] x)
  ([x y] `(math-op * ~x ~y))  
  ([x y & more] `(* (* ~x ~y) ~@more)))

(defmacro zero?
  [val]
  (bool-expr `(let [x# ~val]
        	(if (nil? x#)
        	  ~'false
                  (math-op-as-bool == x# 0)))))

(defmacro <
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool < ~x ~y)))  
  ([x y & more] `(and (< ~x ~y) (< ~y ~@more))))

(defmacro >
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool > ~x ~y)))  
  ([x y & more] `(and (> ~x ~y) (> ~y ~@more))))

(defmacro <=
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool <= ~x ~y)))  
  ([x y & more] `(and (<= ~x ~y) (<= ~y ~@more))))

(defmacro >=
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool >= ~x ~y)))  
  ([x y & more] `(and (>= ~x ~y) (>= ~y ~@more))))

(defmacro mod [num div]
  (list 'c* "make_integer (integer_get(~{}) % integer_get(~{}))" num div))

(defmacro bit-not [x]
  (list 'c* "make_integer (~ (integer_get (~{})))" x))

(defmacro bit-and
  ([x y]
     (list 'c* "make_integer (integer_get (~{}) & integer_get (~{}))" x y))
  ([x y & more] `(bit-and (bit-and ~x ~y) ~@more)))

(defmacro bit-or
  ([x y]
     (list 'c* "make_integer (integer_get (~{}) | integer_get (~{}))" x y))
  ([x y & more] `(bit-or (bit-or ~x ~y) ~@more)))

(defmacro bit-xor
  ([x y]
     (list 'c* "make_integer (integer_get (~{}) ^ integer_get (~{}))" x y))
  ([x y & more] `(bit-xor (bit-xor ~x ~y) ~@more)))

(defmacro bit-and-not
  ([x y]
     (list 'c* "make_integer (integer_get (~{}) & ~integer_get (~{}))" x y))
  ([x y & more] `(bit-and-not (bit-and-not ~x ~y) ~@more)))

(defmacro bit-clear [x n]
  ;; FIXME: If the value of n is negative or is greater than or equal to
  ;;        sizeof(long)*8, left shift behavior is undefined. ()
  (list 'c* "make_integer ((integer_get (~{})) & ~(1ul << integer_get (~{})))" x n))

(defmacro bit-flip [x n]
  ;; FIXME: see bit-clear
  (list 'c* "make_integer ((integer_get (~{})) ^ (1ul << integer_get (~{})))" x n))

(defmacro bit-test [x n]
  ;; FIXME: see bit-clear
  (list 'c* "make_boolean (((integer_get (~{})) & (1ul << integer_get (~{}))) != 0)" x n))

(defmacro bit-shift-left [x n]
  ;; FIXME: If the value of n is negative or is greater than or equal to
  ;;        sizeof(long)*8, the behavior is undefined.
  ;;        If x has nonnegative value, and x * 2^n isn't representable as long,
  ;;        the behavior is undefined.
  (list 'c* "make_integer (integer_get (~{}) << integer_get (~{}))" x n))

(defmacro bit-shift-right [x n]
  ;; FIXME: If the value of n is negative or is greater than or equal to
  ;;        sizeof(long)*8, the behavior is undefined.
  ;;        If x has a negative value, the resulting value is
  ;;        implementation-definded.
  (list 'c* "make_integer (integer_get (~{}) >> integer_get (~{}))" x n))

(defmacro bit-shift-right-zero-fill [x n]
  ;; FIXME: If the value of n is negative or is greater than or equal to
  ;;        sizeof(long)*8, right shift behavior is undefined.
  (list 'c* "make_integer ((long)((unsigned long)integer_get (~{}) >> integer_get (~{})))" x n))

(defmacro bit-set [x n]
  ;; FIXME: see bit-clear
  (list 'c* "make_integer (integer_get (~{}) | (1ul << integer_get (~{})))" x n))

;; internal
(defmacro mask [hash shift]
  (list 'c* "make_integer (((integer_get (~{}) >> integer_get (~{})) & 0x01f)) " hash shift))

;; internal
(defmacro bitpos [hash shift]
  (list 'c* "make_integer ((1 << integer_get (~{})))" `(mask ~hash ~shift)))

;;internal
(defmacro bit-count [num]
  (list 'c* "make_integer (__builtin_popcountll(integer_get (~{})))" num))

;;internal
(defmacro bit-index [bitmap bitpos]
  (list 'c* "make_integer (__builtin_popcountll(integer_get (~{}) & (integer_get (~{}) - 1)))" bitmap bitpos))

;; internal
(defmacro caching-hash [coll hash-fn hash-key]
  `(let [h# ~hash-key]
     (if-not (nil? h#)
       h#
       (let [h# (~hash-fn ~coll)]
         (set! ~hash-key h#)
         h#))))

(defmacro ^{:private true} assert-args [fnname & pairs]
  `(do (when-not ~(first pairs)
         (throw (IllegalArgumentException.
                  ~(core/str fnname " requires " (second pairs)))))
     ~(let [more (nnext pairs)]
        (when more
          (list* `assert-args fnname more)))))

(defmacro try
  "(try expr* catch-clause* finally-clause?)

   Special Form

   catch-clause => (catch protoname name expr*)
   finally-clause => (finally expr*)

  Catches and handles exceptions."
  [& forms]
  (let [catch? #(and (list? %) (= (first %) 'catch))
        [body catches] (split-with (complement catch?) forms)
        [catches fin] (split-with catch? catches)
        e (gensym "e")]
    (assert (every? #(clojure.core/> (count %) 2) catches) "catch block must specify a prototype and a name")
    (if (seq catches)
      `(~'try*
        ~@body
        (catch ~e
            (cond
             ~@(mapcat
                (fn [[_ type name & cb]]
                  (let [type (:name (cljc.compiler/resolve-var (dissoc &env :locals) type))]
                    `[(has-type? ~e ~type) (let [~name ~e] ~@cb)]))
                catches)
             true (throw ~e)))
        ~@fin)
      `(~'try*
        ~@body
        ~@fin))))

(defmacro assert
  "Evaluates expr and throws an exception if it does not evaluate to
  logical true."
  ([x]
     (when *assert*
       `(when-not ~x
          (throw (cljc.core/Exception. "Assert failed")))))
  ([x message]
     (when *assert*
       `(when-not ~x
          (throw (cljc.core/Exception.
                  (cljc.core/str "Assert failed: " ~message)))))))

(defmacro doseq
  "Repeatedly executes body (presumably for side-effects) with
  bindings and filtering as provided by \"for\".  Does not retain
  the head of the sequence. Returns nil."
  [seq-exprs & body]
  (assert-args doseq
     (vector? seq-exprs) "a vector for its binding"
     (even? (count seq-exprs)) "an even number of forms in binding vector")
  (let [step (fn step [recform exprs]
               (if-not exprs
                 [true `(do ~@body)]
                 (let [k (first exprs)
                       v (second exprs)

                       seqsym (when-not (keyword? k) (gensym))
                       recform (if (keyword? k) recform `(recur (first ~seqsym) ~seqsym))
                       steppair (step recform (nnext exprs))
                       needrec (steppair 0)
                       subform (steppair 1)]
                   (cond
                     (= k :let) [needrec `(let ~v ~subform)]
                     (= k :while) [false `(when ~v
                                            ~subform
                                            ~@(when needrec [recform]))]
                     (= k :when) [false `(if ~v
                                           (do
                                             ~subform
                                             ~@(when needrec [recform]))
                                           ~recform)]
                     :else [true `(let [~seqsym (seq ~v)]
                                    (when ~seqsym
                                      (loop [~k (first ~seqsym) ~seqsym ~seqsym]
                                       ~subform
                                       (when-let [~seqsym (next ~seqsym)]
                                        ~@(when needrec [recform])))))]))))]
    (nth (step nil (seq seq-exprs)) 1)))

(defmacro alength [array]
  (list 'c* "make_integer (array_length (~{}))" array))

(defmacro aclone [array]
  `(let [a# ~array
         c# (~'c* "make_array (array_length (~{}))" a#)]
     (~'c* "memcpy (((array_t*)~{})->elems, ((array_t*)~{})->elems, sizeof (value_t*) * array_length (~{}))" c# a# a#)
     c#))

(defmacro amap
  "Maps an expression across an array a, using an index named idx, and
  return value named ret, initialized to a clone of a, then setting 
  each element of ret to the evaluation of expr, returning the new 
  array ret."
  [a idx ret expr]
  `(let [a# ~a
         ~ret (aclone a#)]
     (loop  [~idx 0]
       (if (< ~idx  (alength a#))
         (do
           (aset ~ret ~idx ~expr)
           (recur (inc ~idx)))
         ~ret))))

(defmacro areduce
  "Reduces an expression across an array a, using an index named idx,
  and return value named ret, initialized to init, setting ret to the 
  evaluation of expr at each step, returning ret."
  [a idx ret init expr]
  `(let [a# ~a]
     (loop  [~idx 0 ~ret ~init]
       (if (< ~idx  (alength a#))
         (recur (inc ~idx) ~expr)
         ~ret))))

;; FIXME: we need these for the `for` macro to work
(defmacro .nth [coll idx & rest]
  `(-nth ~coll ~idx ~@rest))
(defmacro unchecked-inc [x]
  `(inc ~x))
