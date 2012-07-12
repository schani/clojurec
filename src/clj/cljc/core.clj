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
			    ~@(map (fn [[name & meths]]
                                     (let [meths (if (vector? (first meths))
                                                   (list meths)
                                                   meths)]
                                       `(~'c* ~(core/str "set_vtable_entry (((vtable_value_t*)~{})->vtable, MEMBER_NAME (" (cljc.compiler/munge name) "), (closure_t*)~{})")
                                              ~vtable
                                              (fn ~name ~@(map (fn [[args & body]]
                                                                 `(~args
                                                                   (let ~(apply vector
                                                                                (apply concat
                                                                                       (map-indexed (fn [i field]
                                                                                                      `[~field (~'c* ~(core/str "DEFTYPE_GET_FIELD (~{}, " i ")") ~(first args))])
                                                                                                    fields)))
                                                                     ~@body)))
                                                               meths)))))
                                   sigs)
			    (~'c* ~(core/str "extend_ptable (PTABLE_NAME (" t "), PROTOCOL_NAME (" psym "), ((vtable_value_t*)~{})->vtable)") ~vtable))))]
    (concat '(do) (map assign-impls impl-map))))

(defmacro defprotocol [psym & doc+methods]
  (let [p (:name (cljc.compiler/resolve-var (dissoc &env :locals) psym))
        psym (vary-meta psym assoc :protocol-symbol true)
        ns-name (-> &env :ns :name)
        methods (if (core/string? (first doc+methods)) (next doc+methods) doc+methods)
        expand-sig (fn [fname sig]
                     `(~sig
		       ;; FIXME: check satisfies?
		       (. ~(first sig) ~fname ~@(rest sig))))
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
        r (:name (cljc.compiler/resolve-var (dissoc &env :locals) t))
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

(defmacro +
  ([] 0)
  ([x] x)
  ([x y] (list 'c* "make_integer (integer_get (~{}) + integer_get (~{}))" x y))
  ([x y & more] `(+ (+ ~x ~y) ~@more)))

(defmacro -
  ([x] (list 'c* "make_integer (- integer_get (~{}))" x))
  ([x y] (list 'c* "make_integer (integer_get (~{}) - integer_get (~{}))" x y))
  ([x y & more] `(- (- ~x ~y) ~@more)))

(defmacro *
  ([] 1)
  ([x] x)
  ([x y] (list 'c* "make_integer (integer_get (~{}) * integer_get (~{}))" x y))
  ([x y & more] `(* (* ~x ~y) ~@more)))

(defmacro zero?
  [x]
  (list 'c* "make_boolean (integer_get (~{}) == 0)" x))

(defmacro <
  ([x] true)
  ([x y] (bool-expr (list 'c* "make_boolean (integer_get (~{}) < integer_get (~{}))" x y)))
  ([x y & more] `(and (< ~x ~y) (< ~y ~@more))))

(defmacro >
  ([x] true)
  ([x y] (bool-expr (list 'c* "make_boolean (integer_get (~{}) > integer_get (~{}))" x y)))
  ([x y & more] `(and (> ~x ~y) (> ~y ~@more))))

(defmacro <=
  ([x] true)
  ([x y] (bool-expr (list 'c* "make_boolean (integer_get (~{}) <= integer_get (~{}))" x y)))
  ([x y & more] `(and (<= ~x ~y) (<= ~y ~@more))))

(defmacro >=
  ([x] true)
  ([x y] (bool-expr (list 'c* "make_boolean (integer_get (~{}) >= integer_get (~{}))" x y)))
  ([x y & more] `(and (>= ~x ~y) (>= ~y ~@more))))

(defmacro ^{:private true} assert-args [fnname & pairs]
  `(do (when-not ~(first pairs)
         (throw (IllegalArgumentException.
                  ~(core/str fnname " requires " (second pairs)))))
     ~(let [more (nnext pairs)]
        (when more
          (list* `assert-args fnname more)))))

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
