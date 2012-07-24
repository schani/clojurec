(ns cljc.core
  (:refer-clojure :exclude [-> ->> .. amap and areduce alength aclone assert binding bound-fn case comment cond condp
                            declare definline definterface defmethod defmulti defn defn- defonce
                            defprotocol defrecord defstruct deftype delay doseq dosync dotimes doto
                            extend-protocol extend-type fn float float? for future gen-class gen-interface
                            if-let if-not import int integer? io! lazy-cat lazy-seq let letfn locking loop
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

(defmacro integer? [x]
  `(has-type? ~x "Integer"))

(defmacro float? [x]
  `(has-type? ~x "Float"))

(defmacro int [x]
  `(if (float? ~x)
     (~'c* "make_integer (float_get (~{}))" ~x)
     ~x))

(defmacro float [x]
  `(if (integer? ~x)
     (~'c* "make_float (integer_get (~{}))" ~x)
     ~x))

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
                                              (fn ~@meths))))
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

(defmacro math-op [op x y int-case float-case]
  `(if (and (integer? ~x) (integer? ~y))
     (~'c* ~(core/str "make_integer (" int-case (name op) int-case ")") ~x  ~y)
     (~'c* ~(core/str "make_float (" float-case (name op) float-case ")") (float ~x)  (float ~y))))

(defmacro math-op-as-bool [op x y int-case float-case]
  `(if (and (integer? ~x) (integer? ~y))
     (~'c* ~(core/str "make_boolean (" int-case (name op) int-case ")") ~x  ~y)
     (~'c* ~(core/str "make_boolean (" float-case (name op) float-case ")") (float ~x)  (float ~y))))

(defmacro +
  ([] 0)
  ([x] x)
  ([x y] `(math-op + ~x ~y "integer_get (~{})" "float_get (~{})"))
  ([x y & more] `(+ (+ ~x ~y) ~@more)))

(defmacro -
  ([x] `(- ~x 0))
  ([x y] `(math-op - ~x ~y "integer_get (~{})" "float_get (~{})"))
  ([x y & more] `(- (- ~x ~y) ~@more)))

(defmacro *
  ([] 1)
  ([x] x)
  ([x y] `(math-op * ~x ~y "integer_get (~{})" "float_get (~{})"))  
  ([x y & more] `(* (* ~x ~y) ~@more)))

(defmacro zero?
  [val]
  (bool-expr `(let [x# ~val]
        	(if (nil? x#)
        	  ~'false
                  (math-op-as-bool == x# 0 "integer_get (~{})" "float_get (~{})")))))

(defmacro <
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool < ~x ~y "integer_get (~{})" "float_get (~{})")))  
  ([x y & more] `(and (< ~x ~y) (< ~y ~@more))))

(defmacro >
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool > ~x ~y "integer_get (~{})" "float_get (~{})")))  
  ([x y & more] `(and (> ~x ~y) (> ~y ~@more))))

(defmacro <=
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool <= ~x ~y "integer_get (~{})" "float_get (~{})")))  
  ([x y & more] `(and (<= ~x ~y) (<= ~y ~@more))))

(defmacro >=
  ([x] true)
  ([x y] (bool-expr `(math-op-as-bool >= ~x ~y "integer_get (~{})" "float_get (~{})")))  
  ([x y & more] `(and (>= ~x ~y) (>= ~y ~@more))))

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
