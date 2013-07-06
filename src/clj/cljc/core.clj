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

(defmacro have-same-type? [x y]
  (bool-expr (list 'c* "(make_boolean (~{}->ptable->type == ~{}->ptable->type))" x y)))

(defmacro integer? [x]
  `(has-type? ~x "Integer"))

(defmacro float? [x]
  `(has-type? ~x "Float"))

(defmacro float [x]
  `(let [x# ~x]
     (if (integer? x#)
       (~'c* "make_float (integer_get (~{}))" x#)
       x#)))

(defmacro reify [& impls]
  (let [t      (gensym "t")
        meta-sym (gensym "meta")
        this-sym (gensym "_")
        locals (keys (:locals &env))]
    `(do
       (pthread-once
         (deftype ~t [~@locals ~meta-sym]
           IWithMeta
           (~'-with-meta [~this-sym ~meta-sym]
             (new ~t ~@locals ~meta-sym))
           IMeta
           (~'-meta [~this-sym] ~meta-sym)
           ~@impls))
       (new ~t ~@locals nil))))

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
	extend-maker (cond
                      (symbol? tsym)
                      (let [t (first (resolve tsym))]
                        (fn [psym]
                          (core/str "extend_ptable (PTABLE_NAME (" t "), PROTOCOL_NAME (" psym "), RAW_POINTER_GET (~{}, closure_t**))")))

                      (and (list? tsym) (= (count tsym) 2) (= (first tsym) '§))
                      (fn [psym]
                        (core/str "objc_class_extend_ptable ([" (second tsym) " class], PROTOCOL_NAME (" psym "), RAW_POINTER_GET (~{}, closure_t**))"))

                      :else
                      (throw (Error. (core/str "Cannot resolve type " tsym))))
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
			    (~'c* ~(extend-maker psym) ~vtable))))]
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

(defmacro delay [& body]
  "Takes a body of expressions and yields a Delay object that will
  invoke the body only the first time it is forced (with force or deref/@), and
  will cache the result and return it on all subsequent force
  calls."
  `(new cljc.core/Delay (atom {:done false, :value nil}) (fn [] ~@body)))

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
                  (= 0 n) `(throw (cljc.core/Exception. (core/str "No matching clause: " ~expr)))
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

(defmacro case [e & clauses]
  (let [default (if (odd? (count clauses))
                  (last clauses)
                  `(throw (cljc.core/Exception. (core/str "No matching clause: " ~e))))
        assoc-test (fn assoc-test [m test expr]
                         (if (contains? m test)
                           (throw (clojure.core/IllegalArgumentException.
                                   (core/str "Duplicate case test constant '"
                                             test "'"
                                             (when (:line &env)
                                               (core/str " on line " (:line &env) " "
                                                         cljc.compiler/*cljs-file*)))))
                           (assoc m test expr)))
        pairs (reduce (fn [m [test expr]]
                        (if (seq? test)
                          (reduce #(assoc-test %1 %2 expr) m test)
                          (assoc-test m test expr)))
                      {} (partition 2 clauses))]
   `(cond
     ~@(mapcat (fn [[m c]] `((cljc.core/= ~m ~e) ~c)) pairs)
     :else ~default)))

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
         (~'deftype-ptable* ~t)
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
	   (~'deftype-ptable* ~tagname)
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

(defmacro number-as-float [n]
  `(let [n# ~n]
     (if (integer? n#)
       (~'c* "make_float ((double)integer_get (~{}))" n#)
       n#)))

(defmacro /
  ([x] `(/ 1 ~x))
  ([x y] (list 'c* "make_float (float_get (~{}) / float_get (~{}))" `(number-as-float ~x) `(number-as-float ~y)))
  ([x y & more] `(/ (/ ~x ~y) ~@more)))

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
  `(let [num# ~num
         div# ~div]
     (if (or (float? num#) (float? div#))
       (~'c* "make_float (fmod (float_get (~{}), float_get (~{})))" (number-as-float num#) (number-as-float div#))
       (~'c* "make_integer (integer_get(~{}) % integer_get(~{}))" num# div#))))

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
  (list 'c* "make_integer ((integer_get (~{})) & ~(1ull << integer_get (~{})))" x n))

(defmacro bit-flip [x n]
  ;; FIXME: see bit-clear
  (list 'c* "make_integer ((integer_get (~{})) ^ (1ull << integer_get (~{})))" x n))

(defmacro bit-test [x n]
  ;; FIXME: see bit-clear
  (list 'c* "make_boolean (((integer_get (~{})) & (1ull << integer_get (~{}))) != 0)" x n))

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
  (list 'c* "make_integer (integer_get (~{}) | (1ull << integer_get (~{})))" x n))

;; internal
(defmacro mask [hash shift]
  (list 'c* "make_integer (((integer_get (~{}) >> integer_get (~{})) & 0x01f)) " hash shift))

;; internal
(defmacro bitpos [hash shift]
  (list 'c* "make_integer ((1ull << integer_get (~{})))" `(mask ~hash ~shift)))

;;internal
(defmacro bit-count [num]
  (list 'c* "make_integer (__builtin_popcountll(integer_get (~{})))" num))

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

(defmacro dotimes
  "bindings => name n

  Repeatedly executes body (presumably for side-effects) with name
  bound to integers from 0 through n-1."
  [bindings & body]
  (let [i (first bindings)
        n (second bindings)]
    `(let [n# ~n]
       (loop [~i 0]
         (when (< ~i n#)
           ~@body
           (recur (inc ~i)))))))

(defn ^:private check-valid-options
  "Throws an exception if the given option map contains keys not listed
  as valid, else returns nil."
  [options & valid-keys]
  (when (seq (apply disj (apply hash-set (keys options)) valid-keys))
    (throw
     (apply core/str "Only these options are valid: "
	    (first valid-keys)
	    (map #(core/str ", " %) (rest valid-keys))))))

(defmacro defmulti
  "Creates a new multimethod with the associated dispatch function.
  The docstring and attribute-map are optional.

  Options are key-value pairs and may be one of:
    :default    the default dispatch value, defaults to :default
    :hierarchy  the isa? hierarchy to use for dispatching
                defaults to the global hierarchy"
  [mm-name & options]
  (let [docstring   (if (core/string? (first options))
                      (first options)
                      nil)
        options     (if (core/string? (first options))
                      (next options)
                      options)
        m           (if (map? (first options))
                      (first options)
                      {})
        options     (if (map? (first options))
                      (next options)
                      options)
        dispatch-fn (first options)
        options     (next options)
        m           (if docstring
                      (assoc m :doc docstring)
                      m)
        m           (if (meta mm-name)
                      (conj (meta mm-name) m)
                      m)]
    (when (= (count options) 1)
      (throw "The syntax for defmulti has changed. Example: (defmulti name dispatch-fn :default dispatch-value)"))
    (let [options   (apply hash-map options)
          default   (core/get options :default :default)]
      (check-valid-options options :default :hierarchy)
      `(def ~(with-meta mm-name m)
         (let [method-table# (atom {})
               prefer-table# (atom {})
               method-cache# (atom {})
               cached-hierarchy# (atom {})
               hierarchy# (get ~options :hierarchy cljc.core/global-hierarchy)]
           (cljc.core/MultiFn. ~(name mm-name) ~dispatch-fn ~default hierarchy#
                               method-table# prefer-table# method-cache# cached-hierarchy#))))))

(defmacro defmethod
  "Creates and installs a new method of multimethod associated with dispatch-value. "
  [multifn dispatch-val & fn-tail]
  `(-add-method ~(with-meta multifn {:tag 'cljc.core/MultiFn}) ~dispatch-val (fn ~@fn-tail)))

(defmacro pthread-once [& body]
  (let [once (gensym "once")]
    `(do
       (~'c-decl* "static pthread_once_t ~{str} = PTHREAD_ONCE_INIT;" ~once)
       (defn ~once []
         ~@body)
       (~'c-decl* "static void once_func_~{str} (void) { invoke0 (~{}); }" ~once ~once)
       (~'c* "pthread_once (&~{str}, once_func_~{str});" ~once ~once)
       nil)))

;; FIXME: we need these for the `for` macro to work
(defmacro .nth [coll idx & rest]
  `(-nth ~coll ~idx ~@rest))
(defmacro unchecked-inc [x]
  `(inc ~x))

;;; Objective-C
(def ^:private to-objc-converters
  {:id "objc_convert_to_objc_object (~{})"
   :selector "objc_selector_get (~{})"
   :float "((float) number_get (~{}))"
   :double "number_get (~{})"
   ;; FIXME: potential data loss - char is not a wide character
   :char "(char) character_get (~{})"
   ;; FIXME: more potential data loss when casting down to smaller integers
   :signed-char "((signed char) number_get_as_integer (~{}))"
   :unsigned-char "((unsigned char) number_get_as_integer (~{}))"
   :short "((short) number_get_as_integer (~{}))"
   :unsigned-short "((unsigned short) number_get_as_integer (~{}))"
   :int "((int) number_get_as_integer (~{}))"
   :unsigned-int "((unsigned int) number_get_as_integer (~{}))"
   :long "((long) number_get_as_integer (~{}))"
   :unsigned-long "((unsigned long) number_get_as_integer (~{}))"
   :long-long "number_get_as_integer (~{})"
   :unsigned-long-long "((unsigned long long) number_get_as_integer (~{}))"
   'Boolean "truth (~{})"})
(defn- to-objc-converter [type]
  (let [converter (to-objc-converters type)]
    (when-not converter
      (throw (Error. (core/str "Unknown C type " type))))
    converter))

(def ^:private from-objc-converters
  {:void "%s"
   :id "make_objc_object (%s)"
   :selector "make_objc_selector (%s)"
   :float "make_float (%s)"
   :double "make_float (%s)"
   :char "make_character ((cljc_unichar_t) %s)"
   :signed-char "make_integer ((long long) %s)"
   :unsigned-char "make_integer ((long long) %s)"
   :short "make_integer ((long long) %s)"
   :unsigned-short "make_integer ((long long) %s)"
   ; FIXME: We're potentially losing data in some of these unsigned conversions.
   :int "make_integer ((long long) %s)"
   :unsigned-int "make_integer ((long long) %s)"
   :long "make_integer ((long long) %s)"
   :unsigned-long "make_integer ((long long) %s)"
   :long-long "make_integer ((long long) %s)"
   :unsigned-long-long "make_integer ((long long) %s)"
   'Boolean "make_boolean (%s)"})
(defn- from-objc-converter [type]
  (let [converter (from-objc-converters type)]
    (when-not converter
      (throw (Error. (core/str "Unknown C type " type))))
    converter))

(defn- types-for-selector [selector]
  (let [typess (@cljc.compiler/objc-selectors selector)]
    (and (= (count typess) 1) (first typess))))

(defn- selector-string [selector]
  (let [num-args (first selector)
        selector-kws (rest selector)]
    (if (core/zero? num-args)
      (name (first selector-kws))
      (apply core/str (map #(core/str (name %) ":") selector-kws)))))

(defn- make-msg-send [selector target args]
  (let [types (types-for-selector selector)
        selector-kws (rest selector)
        num-args (first selector)]
    (if types
      (let [result-type (first types)
            arg-types (rest types)]
        (assert (= num-args (count arg-types) (count args)))
        (if (core/zero? num-args)
          (list 'c* (core/format (from-objc-converter result-type)
                                 (core/str "[objc_object_get (~{}) "
                                           (name (first selector-kws))
                                           "]"))
                target)
          (apply list 'c* (core/format (from-objc-converter result-type)
                                       (core/str "[objc_object_get (~{}) "
                                                 (apply core/str (map (fn [sel-kw type]
                                                                        (core/str (name sel-kw) ": " (to-objc-converter type)))
                                                                      selector-kws arg-types))
                                                 "]"))
                 target args)))
      (let [selector-str (selector-string selector)]
        (if (core/zero? num-args)
          (list 'cljc.objc/objc-msg-send target (list 'c* (core/str "make_objc_selector (@selector (" selector-str "))")))
          (apply list 'cljc.objc/objc-msg-send target (list 'c* (core/str "make_objc_selector (@selector (" selector-str "))")) args))))))

(defn- deconstruct-msg-form [ys]
  [(cons (quot (count ys) 2) (take-nth 2 ys))
   (take-nth 2 (rest ys))])

(defmacro §selector [& ys]
  (let [[selector _] (deconstruct-msg-form ys)
        selector-str (selector-string selector)]
    (list 'c* (core/str "make_objc_selector (@selector (" selector-str "))"))))

(defmacro § [x & ys]
  (if (empty? ys)
    (if (symbol? x)
      (list 'c* (core/str "make_objc_object ([" (core/str x) " class])"))
      (throw (clojure.core/IllegalArgumentException. "Sole argument to § must be a symbol denoting an Objective-C class.")))
    (let [[selector args] (deconstruct-msg-form ys)]
      (make-msg-send selector x args))))

(def ^:private objc-self-name-var '_cljc-objc-self_)
(def ^:private objc-class-name-var '_cljc-objc-self-class_)

(defmacro §super [& ys]
  (let [[selector args] (deconstruct-msg-form ys)
        types (types-for-selector selector)]
    (when-not types
      (throw (clojure.core/IllegalArgumentException. "super call must have type information.")))
    (let [result-type (first types)
          arg-types (rest types)]
      (apply list 'c* (core/format (from-objc-converter result-type)
                                   (core/str "objc_msgSendSuper (&(struct objc_super) { objc_object_get (~{}), objc_object_get (~{}) }, "
                                             "@selector (" (selector-string selector) ")"
                                             (apply core/str (map #(core/str ", " (to-objc-converter %)) arg-types))
                                             ")"))
             objc-self-name-var objc-class-name-var
             args))))

(defn- objc-type [type]
  (cond
   (core/nil? type) "value_t*"
   (= type 'Boolean) "BOOL"
   (= type :void) "void"
   (= type :id) "id"
   (and (list? type) (= (first type) '§)) (core/str (second type) "*")
   :else (throw (Error. (core/str "Unknown type " type)))))

(defn- method-prototype [signature]
  (let [type (:type (meta signature))
        signature (drop 2 signature)
        signature-str (if (= (count signature) 1)
                        (name (first signature))
                        (let [arg-pairs (partition 2 signature)]
                          (apply core/str (map (fn [[sel-part arg]]
                                                 (core/str " " (name sel-part) ":(" (objc-type (:type (meta arg))) ")" arg))
                                          arg-pairs))))]
    (core/str "-(" (objc-type type) ")" signature-str)))

(defn- class-interface [class-name superclass interfaces fields methods]
  (let [interfaces-str (if (empty? interfaces)
                         ""
                         (core/str "<" (apply core/str (interpose "," interfaces)) ">"))
        fields-str (if (empty? fields)
                     ""
                     (core/str "{\n@public\n" (apply core/str (map #(core/str "value_t *" % ";\n") fields)) "}\n"))
        method-strs (->> methods
                         (map first)
                         (map method-prototype))]
    (core/str "@interface " class-name ":" superclass interfaces-str
              fields-str
              (apply core/str (map #(core/str % ";\n") method-strs))
              "@end\n")))

(defn- convert-from-objc [type expr]
  (cond (or (symbol? type) (keyword? type))
        (core/case type
          Boolean
          (core/str "make_boolean (" expr ")")

          :id
          (core/str "make_objc_object (" expr ")")

          (throw (Error. (core/str "Unknown type " type))))

        (core/nil? type)
        expr

        (and (seq? type) (= (first type) '§))
        (core/str "make_objc_object (" expr ")")

        :else
        (throw (Error. (core/str "Unknown type " type)))))

(defn- convert-to-objc [type expr]
  (cond (or (symbol? type) (keyword? type))
        (core/case type
          :void
          (core/str "")

          :id
          (core/str "objc_object_get (" expr ")")

          Boolean
          (core/str "truth (" expr ")")

          (throw (Error. (core/str "Unknown type " type))))

        (core/nil? type)
        expr

        (and (seq? type) (= (first type) '§))
        (core/str "(" (second type) "*)objc_object_get (" expr ")")

        :else
        (throw (Error. (core/str "Unknown type " type)))))

(defn- method-funcall [signature]
  (let [signature (drop 2 signature)
        args (map second (partition 2 signature))
        arity (count args)]
    (core/str "FUNCALL" (if (core/< arity 3)
                          (core/inc arity)
                          "n")
              " ((closure_t*)~{}, "
              (convert-from-objc :id "self")
              (apply core/str (map (fn [arg]
                                     (core/str ", " (convert-from-objc (:type (meta arg)) arg)))
                                   (take 2 args)))
              (if (core/>= arity 3)
                (core/str "(value_t*[]) {"
                          (apply core/str (map (fn [arg]
                                                 (core/str (convert-from-objc (:type (meta arg)) arg) ", "))
                                               (drop 2 args)))
                          "}")
                "")
              ")")))

(defn- class-implementation [class-name fields methods]
  (let [method-strs (map (fn [[signature body]]
                           (let [type (:type (meta signature))]
                             (core/str (method-prototype signature) " {\n"
                                       "value_t *result = " (method-funcall signature) ";\n"
                                       "return " (convert-to-objc type "result") ";\n"
                                       "}\n")))
                         methods)]
    (core/str "@implementation " class-name "\n"
              (apply core/str method-strs)
              "@end\n")))

(defmacro §subclass [class-name & args]
  (let [attributes (->> args
                        (filter #(keyword? (first %)))
                        (apply concat)
                        (apply hash-map))
        fields (:fields attributes)
        methods (loop [args args
                       methods []]
                  (let [args (drop-while #(not (= (first %) '§)) args)]
                    (if (empty? args)
                      methods
                      (recur (drop 2 args)
                             (conj methods (concat (take 2 args) [(gensym class-name)]))))))
        method-defs (map (fn [[signature body name]]
                           (let [name (with-meta name {:private true})
                                 self-arg (second signature)
                                 args (map second (partition 2 (drop 2 signature)))
                                 args (cons self-arg args)
                                 args (with-meta (vec args) {:cljc.compiler/objc-class class-name
                                                             :cljc.compiler/objc-fields fields})
                                 body (list 'let [objc-class-name-var
                                                  (list 'c* (core/str "make_objc_object ([" class-name " class])"))
                                                  objc-self-name-var
                                                  self-arg]
                                            body)]
                             (list 'def name (list 'fn args body))))
                         methods)
        method-def-names (map #(nth % 2) methods)
        interface (class-interface class-name
                                   (:subclasses attributes)
                                   (:implements attributes)
                                   fields
                                   methods)
        implementation (class-implementation class-name
                                             fields
                                             methods)]
    (concat ['do
             (list 'c-decl* interface)]
            method-defs
            [(apply list 'c-decl* implementation method-def-names)])))

;; FIXME: Clojure 1.6 will hopefully have reader conditions, so this
;; won't be necessary anymore.  If not, figure out a better name.
(defmacro if-objc [consequent & alternative-opt]
  (if (cljc.compiler/compiling-for-objc)
    consequent
    (if (empty? alternative-opt)
      nil
      (first alternative-opt))))
