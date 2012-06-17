(ns cljc.core
  (:refer-clojure :exclude [-> ->> .. amap and areduce alength aclone assert binding bound-fn case comment cond condp
                            declare definline definterface defmethod defmulti defn defn- defonce
                            defprotocol defrecord defstruct deftype delay doseq dosync dotimes doto
                            extend-protocol extend-type fn for future gen-class gen-interface
                            if-let if-not import io! lazy-cat lazy-seq let letfn locking loop
                            memfn ns or proxy proxy-super pvalues refer-clojure reify sync time
                            when when-first when-let when-not while with-bindings with-in-str
                            with-loading-context with-local-vars with-open with-out-str with-precision with-redefs
                            satisfies? identical? true? false? nil? str get

                            aget aset
                            + - * / < <= > >= == zero? pos? neg? inc dec max min mod
                            bit-and bit-and-not bit-clear bit-flip bit-not bit-or bit-set
                            bit-test bit-shift-left bit-shift-right bit-xor]))

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

(defmacro has-type? [val t]
  (bool-expr `(let [x# ~val]
		(if (nil? x#)
		  ~'false
		  (~'c* ~(core/str "(make_boolean (~{}->ptable->type == TYPE_" (core/str t) "))") x#)))))

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
			 `(let [~vtable (~'c* ~(core/str "make_vtable_value (alloc_vtable (PROTOCOL_VTABLE_SIZE (" psym ")))"))]
			    ~@(map (fn [[name [args & body]]]
				     `(~'c* ~(core/str "set_vtable_entry (((vtable_value_t*)~{})->vtable, MEMBER_NAME (" (cljc.compiler/munge name) "), (closure_t*)~{})")
					  ~vtable
					  (fn ~name ~args
					    (let ~(apply vector
							 (apply concat
								(map-indexed (fn [i field]
									       `[~field (~'c* ~(core/str "DEFTYPE_GET_FIELD (~{}, " i ")") ~(first args))])
									     fields)))
					      ~@body))))
				   sigs)
			    (~'c* ~(core/str "extend_ptable (PTABLE_NAME (" t "), PROTOCOL_NAME (" psym "), ((vtable_value_t*)~{})->vtable)") ~vtable))))]
    (concat '(do) (map assign-impls impl-map))))

(defmacro deftype [t fields & impls]
  (let [adorn-params (fn [sig]
                       (cons (vary-meta (second sig) assoc :cljc.compiler/fields fields)
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
                     ret)))
        r (:name (cljc.compiler/resolve-var (dissoc &env :locals) t))
        [fpps pmasks] nil]
    (if (seq impls)
      `(do
         (deftype* ~t ~fields ~pmasks)
         (extend-type ~(with-meta t {:skip-protocol-flag fpps}) ~@(dt->et impls))
         ~t)
      `(do
         (deftype* ~t ~fields ~pmasks)
         ~t))))

(defmacro +
  ([] 0)
  ([x] x)
  ([x y] (list 'c* "make_integer ((integer_get (~{}) + integer_get (~{})))" x y))
  ([x y & more] `(+ (+ ~x ~y) ~@more)))

(defmacro <
  ([x] true)
  ([x y] (bool-expr (list 'c* "make_boolean (integer_get (~{}) < integer_get (~{}))" x y)))
  ([x y & more] `(and (< ~x ~y) (< ~y ~@more))))
