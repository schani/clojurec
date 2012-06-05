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
