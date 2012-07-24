;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(set! *warn-on-reflection* true)

(ns cljc.compiler
  (:refer-clojure :exclude [munge macroexpand-1])
  (:require [clojure.java.io :as io]
	    [clojure.set :as set]
            [clojure.string :as string])
  (:import java.lang.StringBuilder))

(declare resolve-var)
(declare resolve-existing-var)
(declare warning)
(def ^:dynamic *cljs-warn-on-undeclared* false)
(declare confirm-bindings)
(declare munge)
(declare ^:dynamic *cljs-file*)
(require 'cljc.core)

(def js-reserved
  #{"abstract" "break" "byte" "case"
    "catch" "char" "class" "const" "continue"
    "debugger" "default" "delete" "do" "double"
    "else" "enum" "export" "extends" "final"
    "finally" "float" "for" "function" "goto" "if"
    "implements" "import" "in" "instanceof" "int"
    "interface" "let" "long" "native" "new"
    "package" "private" "protected" "public"
    "return" "short" "static" "super" "switch"
    "synchronized" "this" "throw" "throws"
    "transient" "try" "typeof" "var" "void"
    "volatile" "while" "with" "yield" "methods"})

(def cljs-reserved-file-names #{"deps.cljs"})

(defonce namespaces (atom '{}))
(defonce num-protocols (atom 0))
(defonce num-types (atom 0))
(defonce protocols-init '{cljc.core {cljc.core/IFn {:name cljc_DOT_core_SLASH_IFn, :methods ((-invoke [f & args]))}}})
(defonce protocols (atom protocols-init))
(defonce declarations (atom []))
(defonce defined-fields (atom #{}))

(defn reset-namespaces! []
  (reset! namespaces {})
  (reset! num-protocols 0)
  (reset! num-types 0)
  (reset! protocols protocols-init)
  (reset! declarations [])
  (reset! defined-fields #{}))

(def ^:dynamic *cljs-ns* 'cljc.user)
(def ^:dynamic *cljs-file* nil)
(def ^:dynamic *cljs-warn-on-redef* true)
(def ^:dynamic *cljs-warn-on-dynamic* true)
(def ^:dynamic *cljs-warn-on-fn-var* true)
(def ^:dynamic *cljs-warn-fn-arity* true)
(def ^:dynamic *unchecked-if* (atom false))
(def ^:dynamic *cljs-static-fns* false)
(def ^:dynamic *position* nil)

(defmacro ^:private debug-prn
  [& args]
  `(.println System/err (str ~@args)))

(defn warning [env s]
  (binding [*out* *err*]
    (println
     (str s (when (:line env)
       (str " at line " (:line env) " " *cljs-file*))))))

(defn munge [s]
  (let [ss (string/replace (str s) "." "_DOT_")
        ms (if (.contains ss "]")
             (let [idx (inc (.lastIndexOf ss "]"))]
               (str (subs ss 0 idx)
                    (clojure.lang.Compiler/munge (subs ss idx))))
             (clojure.lang.Compiler/munge ss))
        ms (if (js-reserved ms) (str ms "$") ms)]
    (if (symbol? s)
      (symbol ms)
      ms)))

(defn confirm-var-exists [env prefix suffix]
  (when *cljs-warn-on-undeclared*
    (let [crnt-ns (-> env :ns :name)]
      (when (= prefix crnt-ns)
        (when-not (-> @namespaces crnt-ns :defs suffix)
          (warning env
            (str "WARNING: Use of undeclared Var " prefix "/" suffix)))))))

(defn resolve-ns-alias [env name]
  (let [sym (symbol name)]
    (get (:requires (:ns env)) sym sym)))

(defn core-name?
  "Is sym visible from core in the current compilation namespace?"
  [env sym]
  (and (get (:defs (@namespaces 'cljc.core)) sym)
       (not (contains? (-> env :ns :excludes) sym))))

(defn js-var [sym]
  (let [parts (string/split (name sym) #"\.")
        first (first parts)
        step (fn [part] (str "['" part "']"))]
    (apply str first (map step (rest parts)))))

(defn resolve-existing-var [env sym]
  (if (= (namespace sym) "js")
    {:name (js-var sym) :ns 'js}
    (let [s (str sym)
          lb (-> env :locals sym)]
      (cond
       lb lb

       (namespace sym)
       (let [ns (namespace sym)
             ns (if (= "clojure.core" ns) "cljc.core" ns)
             full-ns (resolve-ns-alias env ns)
	     full-sym (symbol (str full-ns) (str (name sym)))]
         (confirm-var-exists env full-ns (symbol (name sym)))
         (merge (get-in @namespaces [full-ns :defs (symbol (name sym))])
           {:name (munge full-sym)
            :name-sym full-sym
            :ns full-ns}))

       (.contains s ".")
       (let [idx (.indexOf s ".")
             prefix (symbol (subs s 0 idx))
             suffix (subs s idx)
             lb (-> env :locals prefix)]
         (if lb
           {:name (munge (symbol (str (:name lb) suffix)))
            :name-sym (symbol (str (:name lb) suffix))}
           (do
             (confirm-var-exists env prefix (symbol suffix))
             (merge (get-in @namespaces [prefix :defs (symbol suffix)])
              {:name (munge (symbol (str prefix) suffix))
               :name-sym (symbol (str prefix) suffix)
               :ns prefix}))))

       (get-in @namespaces [(-> env :ns :name) :uses sym])
       (let [full-ns (get-in @namespaces [(-> env :ns :name) :uses sym])
	     full-sym (symbol (str full-ns) (str sym))]
         (merge
          (get-in @namespaces [full-ns :defs sym])
          {:name (munge full-sym)
           :name-sym full-sym
           :ns (-> env :ns :name)}))

       :else
       (let [full-ns (if (core-name? env sym)
                       'cljc.core
                       (-> env :ns :name))
	     full-sym (symbol (str full-ns) (str sym))]
         (confirm-var-exists env full-ns sym)
         (merge (get-in @namespaces [full-ns :defs sym])
           {:name (munge full-sym)
            :name-sym full-sym
            :ns full-ns}))))))

(defn resolve-var [env sym]
  (if (= (namespace sym) "js")
    {:name (js-var sym)}
    (let [s (str sym)
          lb (-> env :locals sym)]
      (cond
       lb lb

       (namespace sym)
       (let [ns (namespace sym)
             ns (if (= "clojure.core" ns) "cljc.core" ns)]
         {:name (munge (symbol (str (resolve-ns-alias env ns)) (name sym)))})

       (.contains s ".")
       (let [idx (.indexOf s ".")
             prefix (symbol (subs s 0 idx))
             suffix (subs s idx)
             lb (-> env :locals prefix)]
         (if lb
           {:name (munge (symbol (str (:name lb) suffix)))}
           {:name (munge sym)}))

       (get-in @namespaces [(-> env :ns :name) :uses sym])
       (let [full-ns (get-in @namespaces [(-> env :ns :name) :uses sym])]
         (merge
          (get-in @namespaces [full-ns :defs sym])
          {:name (munge (symbol (str full-ns) (name sym)))}))

       :else
       (let [s (str (if (core-name? env sym)
                      'cljc.core
                      (-> env :ns :name))
                    "/" (munge (name sym)))]
         {:name (munge (symbol s))})))))

(defn confirm-bindings [env names]
  (doseq [name names]
    (let [env (merge env {:ns (@namespaces *cljs-ns*)})
          ev (resolve-existing-var env name)]
      (when (and *cljs-warn-on-dynamic*
                 ev (not (-> ev :dynamic)))
        (warning env
          (str "WARNING: " (:name-sym ev) " not declared ^:dynamic"))))))

(def ^:dynamic *env-stack* nil)
(def ^:dynamic *gthis-ups* nil)

(defn- comma-sep [xs]
  (interpose "," xs))

(defn- escape-char [^Character c]
  (let [cp (.hashCode c)]
    (case cp
      ; Handle printable escapes before ASCII
      34 "\\\""
      39 "\\'"
      92 "\\\\"
      ; Handle non-printable escapes
      8 "\\b"
      12 "\\f"
      10 "\\n"
      13 "\\r"
      9 "\\t"
      (if (< 31 cp 127)
        c ; Print simple ASCII characters
        (format "\\u%04X" cp))))) ; Any other character is Unicode

(defn- escape-string [^CharSequence s]
  (let [sb (StringBuilder. (count s))]
    (doseq [c s]
      (.append sb (escape-char c)))
    (.toString sb)))

(defn- wrap-in-double-quotes [x]
  (str \" x \"))

(defmulti emit :op)

(defn emits [& xs]
  (doseq [x xs]
    (cond
      (nil? x) nil
      (map? x) (emit x)
      (seq? x) (apply emits x)
      (fn? x)  (x)
      :else (do
              (let [s (print-str x)]
                (when *position*
                  (swap! *position* (fn [[line column]]
                                      [line (+ column (count s))])))
                (print s)))))
  nil)

(defn ^String emit-str [expr]
  (with-out-str (emit expr)))

(defn emitln [& xs]
  (apply emits xs)
  ;; Prints column-aligned line number comments; good test of *position*.
  ;(when *position*
  ;  (let [[line column] @*position*]
  ;    (print (apply str (concat (repeat (- 120 column) \space) ["// " (inc line)])))))
  (println)
  (when *position*
    (swap! *position* (fn [[line column]]
                        [(inc line) 0])))
  nil)

(defmulti emit-constant class)
(defmethod emit-constant nil [x] (emits "value_nil"))
;; FIXME: allocate these only once, not every time!
(defmethod emit-constant Long [x] (emits "make_integer (" x "L)"))
(defmethod emit-constant Integer [x] (emits "make_integer (" x "L)")) ; reader puts Integers in metadata
(defmethod emit-constant Character [x] (emits "make_character ((gunichar)'" (escape-char x) "')"))
(defmethod emit-constant Float [x] (emits "make_float (" x ")"))
(defmethod emit-constant Double [x] (emits "make_float (" x ")"))
(defmethod emit-constant String [x]
  (emits "make_string (" (wrap-in-double-quotes (escape-string x)) ")"))
(defmethod emit-constant Boolean [x] (emits (if x "value_true" "value_false")))

(defmethod emit-constant java.util.regex.Pattern [x]
  (let [[_ flags pattern] (re-find #"^(?:\(\?([idmsux]*)\))?(.*)" (str x))]
    (emits \/ (.replaceAll (re-matcher #"/" pattern) "\\\\/") \/ flags)))

(defmethod emit-constant clojure.lang.Keyword [x]
           (emits \" "\\uFDD0" \'
                  (if (namespace x)
                    (str (namespace x) "/") "")
                  (name x)
                  \"))

(defmethod emit-constant clojure.lang.Symbol [x]
           (emits \" "\\uFDD1" \'
                  (if (namespace x)
                    (str (namespace x) "/") "")
                  (name x)
                  \"))

(defn- emit-meta-constant [x & body]
  ;; FIXME: implement
  (emits body))

(defmethod emit-constant clojure.lang.PersistentList$EmptyList [x]
  (emits "VAR_NAME (cljc_DOT_core_DOT_List_SLASH_EMPTY)"))

(defmethod emit-constant clojure.lang.PersistentList [x]
  (emit-meta-constant x
		      (emits "FUNCALL2 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_Cons), ")
		      (emit-constant (first x))
		      (emits ", ")
		      (emit-constant (rest x))
		      (emits ")")))

(defmethod emit-constant clojure.lang.Cons [x]
  (emit-meta-constant x
    (concat ["cljs.core.list("]
            (comma-sep (map #(fn [] (emit-constant %)) x))
            [")"])))

(defn- persistent-vector-emit-seq [items]
  (let [emit-conj
        (fn emit-conj [xs]
          (if (empty? xs)
            (list "VAR_NAME (cljc_DOT_core_DOT_PersistentVector_SLASH_EMPTY)")
            (lazy-seq
             (concat ["FUNCALL2 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH__conj), "]
                     (emit-conj (rest xs))
                     [", " (first xs) ")"]))))]
    (emit-conj (reverse items))))

(defmethod emit-constant clojure.lang.IPersistentVector [x]
  (emit-meta-constant x
    (persistent-vector-emit-seq (map #(fn [] (emit-constant %)) x))))

(defmethod emit-constant clojure.lang.IPersistentMap [x]
  (emit-meta-constant x
    (concat ["cljs.core.hash_map("]
            (comma-sep (map #(fn [] (emit-constant %))
                            (apply concat x)))
            [")"])))

(defmethod emit-constant clojure.lang.PersistentHashSet [x]
  (emit-meta-constant x
    (concat ["cljs.core.set(["]
            (comma-sep (map #(fn [] (emit-constant %)) x))
            ["])"])))

(defn emit-block
  [context statements ret]
  (when statements
    (emits statements))
  (emit ret))

(defmacro emit-wrap [env & body]
  `(let [env# ~env]
     (when (= :return (:context env#)) (emits "return "))
     ~@body
     (when-not (= :expr (:context env#)) (emitln ";"))))

(defmethod emit :no-op
  [m] (emits ";"))

(defn some-indexed [pred coll]
  (loop [coll coll
         i 0]
    (if (empty? coll)
      nil
      (if-let [result (pred i (first coll))]
        result
        (recur (rest coll) (inc i))))))

(defn env-stack-lookup [name]
  (some-indexed (fn [up level]
		  (some-indexed (fn [i n]
				  (if (= name n)
				    [up i]
				    false))
				level))
		*env-stack*))

(defmethod emit :var
  [{:keys [info env] :as arg}]
  (let [name (:name info)
	field (:field info)
	local (:local info)]
    (emit-wrap env
	       (cond
		local (let [[num-ups index] (env-stack-lookup name)]
			(assert (and num-ups index))
			(emits "/* " name " */ env_fetch (env, " num-ups ", " index ")"))
		field (do
			(assert *gthis-ups*)
			(emits "/* " name " */ DEFTYPE_GET_FIELD (env_fetch (env, " *gthis-ups* ", 0), " (:index info) ")"))
		:else (emits "VAR_NAME (" name ")")))))

(defmethod emit :meta
  [{:keys [expr meta env]}]
  (emit-wrap env
    (emits "cljs.core.with_meta(" expr "," meta ")")))

(def ^:private array-map-threshold 16)
(def ^:private obj-map-threshold 32)

(defmethod emit :map
  [{:keys [env simple-keys? keys vals]}]
  (emit-wrap env
    (cond
      (and simple-keys? (<= (count keys) obj-map-threshold))
      (emits "cljs.core.ObjMap.fromObject(["
             (comma-sep keys) ; keys
             "],{"
             (comma-sep (map (fn [k v]
                               (with-out-str (emit k) (print ":") (emit v)))
                             keys vals)) ; js obj
             "})")

      (<= (count keys) array-map-threshold)
      (emits "cljs.core.PersistentArrayMap.fromArrays(["
             (comma-sep keys)
             "],["
             (comma-sep vals)
             "])")

      :else
      (emits "cljs.core.PersistentHashMap.fromArrays(["
             (comma-sep keys)
             "],["
             (comma-sep vals)
             "])"))))

(defmethod emit :vector
  [{:keys [items env]}]
  (emit-wrap env
    (emits (persistent-vector-emit-seq items))))

(defmethod emit :set
  [{:keys [items env]}]
  (emit-wrap env
    (emits "cljs.core.set(["
           (comma-sep items) "])")))

(defmethod emit :constant
  [{:keys [form env]}]
  (when-not (= :statement (:context env))
    (emit-wrap env (emit-constant form))))

(defn get-tag [e]
  (or (-> e :tag)
      (-> e :info :tag)))

(defn infer-tag [e]
  (if-let [tag (get-tag e)]
    tag
    (case (:op e)
      :let (infer-tag (:ret e))
      :if (let [then-tag (infer-tag (:then e))
                else-tag (infer-tag (:else e))]
            (when (= then-tag else-tag)
              then-tag))
      :constant (case (:form e)
                  true 'boolean
                  false 'boolean
                  nil)
      nil)))

(defn safe-test? [e]
  (let [tag (infer-tag e)]
    (or (= tag 'boolean)
        (when (= (:op e) :constant)
          (let [form (:form e)]
            (not (or (and (string? form) (= form ""))
                     (and (number? form) (zero? form)))))))))

(defmethod emit :if
  [{:keys [test then else env]}]
  (let [context (:context env)]
    (if (= :expr context)
      (emits "(truth (" test ") ? " then " : " else ")")
      (do
        (emitln "if (truth (" test ")) {")
        (emitln then)
        (emitln "} else {")
        (emitln else)
        (emitln "}")))))

(defmethod emit :throw
  [{:keys [throw env]}]
  (if (= :expr (:context env))
    (emits "(function(){throw " throw "})()")
    (emitln "throw " throw ";")))

(defn emit-comment
  "Emit a nicely formatted comment string."
  [doc jsdoc]
  (let [docs (when doc [doc])
        docs (if jsdoc (concat docs jsdoc) docs)
        docs (remove nil? docs)]
    (letfn [(print-comment-lines [e] (doseq [next-line (string/split-lines e)]
                                       (emitln "* " (string/trim next-line))))]
      (when (seq docs)
        (emitln "/**")
        (doseq [e docs]
          (when e
            (print-comment-lines e)))
        (emitln "*/")))))

(defmacro emit-declaration [& body]
  `(swap! declarations conj (with-out-str ~@body)))

(defmethod emit :def
  [{:keys [name init env]}]
  (if init
    (do
      (emit-declaration
       (emitln "static value_t *VAR_NAME (" name ") = VALUE_NONE;"))
      (let [expr (= :expr (:context env))]
        (when expr
          (emits "("))
        (emits "VAR_NAME (" name ") = " init)
        (if expr
            (emits ")")
            (emitln ";"))))
    (do
      (emit-declaration
       (emitln "static value_t *VAR_NAME (" name ");"))
      (emitln ";"))))

(comment
(defmethod emit :def
  [{:keys [name init env doc export]}]
  (if init
    (do
      (emit-comment doc (:jsdoc init))
      (emits name)
      (emits " = " init)
      (when-not (= :expr (:context env)) (emitln ";"))
      (when export
        (emitln "goog.exportSymbol('" export "', " name ");")))
    (emitln "void 0;")))
)

(defn emit-apply-to
  [{:keys [name params env]}]
  (let [arglist (gensym "arglist__")
        delegate-name (str name "__delegate")]
    (emitln "(function (" arglist "){")
    (doseq [[i param] (map-indexed vector (butlast params))]
      (emits "var " param " = cljs.core.first(")
      (dotimes [_ i] (emits "cljs.core.next("))
      (emits arglist ")")
      (dotimes [_ i] (emits ")"))
      (emitln ";"))
    (if (< 1 (count params))
      (do
        (emits "var " (last params) " = cljs.core.rest(")
        (dotimes [_ (- (count params) 2)] (emits "cljs.core.next("))
        (emits arglist)
        (dotimes [_ (- (count params) 2)] (emits ")"))
        (emitln ");")
        (emitln "return " delegate-name "(" (string/join ", " params) ");"))
      (do
        (emits "var " (last params) " = ")
        (emits "cljs.core.seq(" arglist ");")
        (emitln ";")
        (emitln "return " delegate-name "(" (string/join ", " params) ");")))
    (emits "})")))

(defn emit-in-new-env [bindings variadic reset-gthis-ups val-inits num-non-args rest-val-init emitter]
  (if (seq bindings)
    (let [num-vals (count bindings)
	  num-direct-vals (if variadic
			    (dec num-vals)
			    num-vals)]
      (binding [*env-stack* (cons bindings *env-stack*)
		*gthis-ups* (if reset-gthis-ups
			      0
			      (and *gthis-ups* (inc *gthis-ups*)))]
	(emitln "environment_t *new_env = alloc_env (env, " num-vals ");")
	(emitln "{")
	(when rest-val-init
	  (emitln "value_t *rest = " rest-val-init ";"))
	(emitln "environment_t *env = new_env;")
	(loop [indexes (range num-direct-vals)
	       val-inits val-inits]
	  (when (seq indexes)
	    (let [index (first indexes)]
	      (if (seq val-inits)
		(do
		  (emitln "env_set (new_env, " index ", " (first val-inits) ");")
		  (recur (rest indexes) (rest val-inits)))
		(do
		  (emitln "env_set (new_env, " index ", ARG_FIRST (rest));")
		  (emitln "rest = ARG_NEXT (rest);")
		  (recur (rest indexes) nil))))))
	(when variadic
	  (letfn [(emit-cons-inits [inits tail]
				   (if (seq inits)
				     (do
				       (emits "ARG_CONS (" (first inits) ", ")
				       (emit-cons-inits (rest inits) tail)
				       (emits ")"))
				     (emits tail)))]
	    (assert rest-val-init)
	    (emitln "switch (nargs) {")
	    (loop [val-inits (drop num-direct-vals val-inits)]
	      (emitln "case " (- (+ num-direct-vals (count val-inits)) num-non-args) ":")
	      (emits "env_set (new_env, " num-direct-vals ", ")
	      (emit-cons-inits val-inits "ARG_NIL")
	      (emitln "); break;")
	      (when (seq val-inits)
		(recur (drop-last val-inits))))
	    (emitln "default:")
	    (emitln "env_set (new_env, " num-direct-vals ", ")
	    (emit-cons-inits (drop num-direct-vals val-inits) "rest")
	    (emitln "); break;")
	    (emitln "}")))
	(emitter)
	(emitln "}")))
    (emitter)))

(defmacro with-new-env [bindings & body]
  `(let [bindings# ~bindings]
     (emit-in-new-env (map :name bindings#)
		      false
		      false
		      (map :init bindings#)
                      0
		      nil
		      (fn []
			~@body))))

(defn emit-fn-method
  [{:keys [params statements ret recurs has-gthis]} variadic [fn-name fn-init]]
  (emit-in-new-env (concat (if fn-name [fn-name] []) params)
		   variadic
		   has-gthis
		   (concat (if fn-init [fn-init] []) (map #(str "arg" %) (range 3)))
                   (if fn-name 1 0)
		   (if (or variadic (> (count params) 3))
		     "argrest")
		   (fn []
		     (when recurs
		       (emitln "while (1) {"))
		     (emit-block :return statements ret)
		     (when recurs
		       (emitln "break;")
		       (emitln "}")))))

(defmethod emit :fn
  [{:keys [name env methods variadic]}]
  (when-not (= :statement (:context env))
    (let [cname (gensym)
          return (= :return (:context env))]
      (when return
        (emits "return "))
      (emits "make_closure (FN_NAME (" cname "), env)")
      (when return
        (emitln ";"))
      (emit-declaration
       (emitln "static value_t* FN_NAME (" cname ") (int nargs, closure_t *closure, value_t *arg0, value_t *arg1, value_t *arg2, value_t *argrest) {")
       (emitln "environment_t *env = closure->env;")
       (when name
         (emitln "value_t *this_fn = &closure->val;"))
       (if (= 1 (count methods))
         (do
           (when-not variadic
             (emitln "assert (nargs == " (count (:params (first methods))) ");")
             (emitln "{"))
           (emit-fn-method (first methods) variadic (when name [name "this_fn"]))
           (when-not variadic
             (emitln "}")))
         (do
           (emitln "switch (nargs) {")
           (doseq [meth methods]
             (if (:variadic meth)
               (emitln "default: {")
               (emitln "case " (count (:params meth)) ": {"))
             (emit-fn-method meth (:variadic meth) (when name [name "this_fn"]))
             (emitln "}")
             (emitln "break;"))
           (when-not variadic
             (emitln "default: assert_not_reached ();"))
           (emitln "}")))
       (emitln "}")))))

(defmethod emit :do
  [{:keys [statements ret env]}]
  (let [context (:context env)]
    (when (and statements (= :expr context)) (emits "(function (){"))
    ;(when statements (emitln "{"))
    (emit-block context statements ret)
    ;(when statements (emits "}"))
    (when (and statements (= :expr context)) (emits "})()"))))

(defmethod emit :try*
  [{:keys [env try catch name finally]}]
  (let [context (:context env)
        subcontext (if (= :expr context) :return context)]
    (if (or name finally)
      (do
        (when (= :expr context) (emits "(function (){"))
        (emits "try{")
        (let [{:keys [statements ret]} try]
          (emit-block subcontext statements ret))
        (emits "}")
        (when name
          (emits "catch (" name "){")
          (when catch
            (let [{:keys [statements ret]} catch]
              (emit-block subcontext statements ret)))
          (emits "}"))
        (when finally
          (let [{:keys [statements ret]} finally]
            (assert (not= :constant (:op ret)) "finally block cannot contain constant")
            (emits "finally {")
            (emit-block subcontext statements ret)
            (emits "}")))
        (when (= :expr context) (emits "})()")))
      (let [{:keys [statements ret]} try]
        (when (and statements (= :expr context)) (emits "(function (){"))
        (emit-block subcontext statements ret)
        (when (and statements (= :expr context)) (emits "})()"))))))

(defmethod emit :let
  [{:keys [bindings statements ret env loop]}]
  (let [context (:context env)]
    (if (= :expr context)
      (let [fn-name (munge (gensym :let-fn))]
	(emits "(" fn-name " (env))")
	(emit-declaration
	 (emitln "value_t* " fn-name " (environment_t *env) {")
	 (with-new-env bindings
	   (when loop
	     (emitln "for (;;) {"))
	   (emit-block :return statements ret)
	   (when loop
	     (emitln "break;")
	     (emitln "}")))
	 (emitln "}")))
      (do
	(emitln "{")
	(with-new-env bindings
	  (when loop
	    (emitln "for (;;) {"))
	  (emit-block context statements ret)
	  (when loop
	    (emitln "break;")
	    (emitln "}")))
	(emitln "}")))))

(defmethod emit :recur
  [{:keys [frame exprs env]}]
  (let [temps (vec (take (count exprs) (repeatedly gensym)))
        names (:names frame)]
    (emitln "{")
    (dotimes [i (count exprs)]
      (emitln "value_t *" (temps i) " = " (exprs i) ";"))
    (dotimes [i (count exprs)]
      (let [[num-ups index] (env-stack-lookup (names i))]
	(emitln "env_set (env_up (env, " num-ups "), " index ", " (temps i) ");")))
    (emitln "continue;")
    (emitln "}")))

(defmethod emit :letfn
  [{:keys [bindings statements ret env]}]
  (let [context (:context env)]
    (when (= :expr context) (emits "(function (){"))
    (doseq [{:keys [name init]} bindings]
      (emitln "var " name " = " init ";"))
    (emit-block (if (= :expr context) :return context) statements ret)
    (when (= :expr context) (emits "})()"))))

(defn- emit-arglist [args num-register-args]
  (let [arity (count args)
	register-args (take 2 args)
	rest-args (drop 2 args)]
    (when-not (empty? rest-args)
      (emits ", " arity))
    (when-not (empty? register-args)
      (emits ", " (comma-sep register-args)))
    (when-not (empty? rest-args)
      (emits ", ")
      (letfn [(emit-rest [as]
		 (if (seq as)
		   (do
		     (emits "ARG_CONS (" (first as) ", ")
		     (emit-rest (rest as))
		     (emits ")"))
		   (emits "ARG_NIL")))]
	(emit-rest rest-args)))))

(defmethod emit :invoke
  [{:keys [f args env] :as expr}]
  (let [arity (count args)]
    (emit-wrap env
               (emits "invoke")
               (emits (if (< arity 3) arity "n"))
               (emits " (" f)
	       (emit-arglist args 2)
	       (emits ")"))))

(comment
(defmethod emit :invoke
  [{:keys [f args env] :as expr}]
  (let [info (:info f)
        fn? (and *cljs-static-fns*
                 (not (:dynamic info))
                 (:fn-var info))
        opt-not? (and (= (:name-sym info) 'cljc.core/not)
                      (= (infer-tag (first (:args expr))) 'boolean))
        ns (:ns info)
        js? (= ns 'js)
        goog? (when ns
                (or (= ns 'goog)
                    (when-let [ns-str (str ns)]
                      (= (get (string/split ns-str #"\.") 0 nil) "goog"))))
        keyword? (and (= (-> f :op) :constant)
                      (keyword? (-> f :form)))
        [f variadic-invoke]
        (if fn?
          (let [arity (count args)
                variadic? (:variadic info)
                mps (:method-params info)
                mfa (:max-fixed-arity info)]
            (cond
             ;; if only one method, no renaming needed
             (and (not variadic?)
                  (= (count mps) 1))
             [f nil]

             ;; direct dispatch to variadic case
             (and variadic? (> arity mfa))
             [(update-in f [:info :name]
                             (fn [name] (symbol (str name ".cljs$lang$arity$variadic"))))
              {:max-fixed-arity mfa}]

             ;; direct dispatch to specific arity case
             :else
             (let [arities (map count mps)]
               (if (some #{arity} arities)
                 [(update-in f [:info :name]
                             (fn [name] (symbol (str name ".cljs$lang$arity$" arity)))) nil]
                 [f nil]))))
          [f nil])]
    (emit-wrap env
      (cond
       opt-not?
       (emits "!(" (first args) ")")

       keyword?
       (emits "(new cljs.core.Keyword(" f ")).call(" (comma-sep (cons "null" args)) ")")
       
       variadic-invoke
       (let [mfa (:max-fixed-arity variadic-invoke)]
        (emits f "(" (comma-sep (take mfa args))
               (when-not (zero? mfa) ",")
               "cljs.core.array_seq([" (comma-sep (drop mfa args)) "], 0))"))
       
       (or fn? js? goog?)
       (emits f "(" (comma-sep args)  ")")
       
       :else
       (emits f ".call(" (comma-sep (cons "null" args)) ")")))))
)

(defmethod emit :new
  [{:keys [ctor args env]}]
  (emit-wrap env
             (emits "(new " ctor "("
                    (comma-sep args)
                    "))")))

(defmethod emit :set!
  [{:keys [target val env]}]
  (let [info (:info target)]
    (emit-wrap env
	       (if (:field info)
		 (emits "DEFTYPE_SET_FIELD (env_fetch (env, " *gthis-ups* ", 0), " (:index info) ", " val ")")
		 (emits target " = " val)))))

(defmethod emit :ns
  [{:keys [name requires uses requires-macros env]}]
  nil)

(defmethod emit :defprotocol*
  [{:keys [p index methods]}]
  (emit-declaration
   (emitln "#define PROTOCOL_" (str p) " (FIRST_PROTOCOL + " index ")")
   (emitln "#define PROTOCOL_VTABLE_SIZE_" (str p) " " (count methods))
   (doseq [[i method] (map-indexed #(vector %1 (first %2)) methods)]
     (emitln "#define MEMBER_" (str (munge method) " " i)))))

(defmethod emit :deftype*
  [{:keys [t fields pmasks index form]}]
  ;; FIXME: this is very unatomic!
  (let [first-field-num (count @defined-fields)
	new-fields (set/difference (set fields) @defined-fields)]
    (swap! defined-fields set/union new-fields)
    (emit-declaration
     (emitln "#define TYPE_" (str t) " (FIRST_TYPE + " index ")")
     (emitln "static ptable_t* PTABLE_NAME (" t ") = NULL;")
     (doseq [[i field] (map vector (range first-field-num (+ first-field-num (count new-fields))) new-fields)]
       (emitln "#define FIELD_" (munge field) " (FIRST_FIELD + " i ")"))
     (emitln "static value_t* GET_FIELD_FN_NAME (" t ") (value_t *val, int field) {")
     (emitln "deftype_t *dt = (deftype_t*)val;")
     (emitln "assert (val->ptable->type == TYPE_NAME (" t "));")
     (emitln "switch (field) {")
     (doseq [[i field] (map-indexed vector fields)]
       (emitln "case FIELD_NAME (" (munge field) "): return dt->fields [" i "];"))
     (emitln "default: assert_not_reached ();")
     (emitln "}")
     (emitln "return value_nil;")
     (emitln "}"))
    (do
      (emitln "PTABLE_NAME (" t ") = alloc_ptable (TYPE_NAME (" t "), GET_FIELD_FN_NAME (" t "));"))))

(defmethod emit :defrecord*
  [{:keys [t fields pmasks]}]
  (let [fields (concat (map munge fields) '[__meta __extmap])]
    (emitln "")
    (emitln "/**")
    (emitln "* @constructor")
    (doseq [fld fields]
      (emitln "* @param {*} " fld))
    (emitln "* @param {*=} __meta ")
    (emitln "* @param {*=} __extmap")
    (emitln "*/")
    (emitln t " = (function (" (comma-sep (map str fields)) "){")
    (doseq [fld fields]
      (emitln "this." fld " = " fld ";"))
    (doseq [[pno pmask] pmasks]
      (emitln "this.cljs$lang$protocol_mask$partition" pno "$ = " pmask ";"))
    (emitln "if(arguments.length>" (- (count fields) 2) "){")
    (emitln "this.__meta = __meta;")
    (emitln "this.__extmap = __extmap;")
    (emitln "} else {")
    (emits "this.__meta=")
    (emit-constant nil)
    (emitln ";")
    (emits "this.__extmap=")
    (emit-constant nil)
    (emitln ";")
    (emitln "}")
    (emitln "})")))

(defn lookup-protocol [method]
  (some (fn [[ns protocols]]
	  (some (fn [[p {:keys [name methods]}]]
		  (when (some #(= method (munge %)) (map first methods))
		    name))
		protocols))
	@protocols))

(defmethod emit :dot
  [{:keys [target field method args form env]}]
  (emit-wrap env
	     (if field
	       (emits "get_field (" target ", FIELD_NAME (" field "))")
	       (let [protocol (lookup-protocol method)
		     arity (count args)]
		 (assert protocol (str "No protocol found for method " method " in " form))
		 (emits "protcall" (if (< arity 3) arity "n") " (" target ", PROTOCOL_NAME (" (str protocol) "), MEMBER_NAME (" (str (munge method)) ")")
		 (emit-arglist args 2)
		 (emits ")")))))

(defmulti emit-c-arg (fn [type env arg] type))
(defmethod emit-c-arg :expr [_ env arg]
  (emits arg))
(defmethod emit-c-arg :str [_ env arg]
  (emits (str arg)))
(defmethod emit-c-arg :sym [_ env arg]
  (emits (munge (:name (resolve-var (dissoc env :locals) arg)))))

(defmethod emit :c
  [{:keys [env code segs args]}]
  (emit-wrap env
             (if code
               (emits code)
	       (loop [segs segs
		      args args]
		 (emits (first segs))
		 (when (seq args)
		   (emit-c-arg (second segs) env (first args))
		   (recur (rest (rest segs))
			  (rest args)))))))

(declare analyze analyze-symbol analyze-seq)

(def specials '#{if def fn* do let* loop* letfn* throw try* recur new set! ns defprotocol* deftype* defrecord* . c* & quote})

(def ^:dynamic *recur-frames* nil)
(def ^:dynamic *loop-lets* nil)

(defmacro disallowing-recur [& body]
  `(binding [*recur-frames* (cons nil *recur-frames*)] ~@body))

(defn analyze-block
  "returns {:statements .. :ret ..}"
  [env exprs]
  (let [statements (disallowing-recur
                     (seq (map #(analyze (assoc env :context :statement) %) (butlast exprs))))
        ret (if (<= (count exprs) 1)
              (analyze env (first exprs))
              (analyze (assoc env :context (if (= :statement (:context env)) :statement :return)) (last exprs)))]
    {:statements statements :ret ret}))

(defmulti parse (fn [op & rest] op))

(defmethod parse 'if
  [op env [_ test then else :as form] name]
  (let [test-expr (disallowing-recur (analyze (assoc env :context :expr) test))
        then-expr (analyze env then)
        else-expr (analyze env else)]
    {:env env :op :if :form form
     :test test-expr :then then-expr :else else-expr
     :unchecked @*unchecked-if*
     :children [test-expr then-expr else-expr]}))

(defmethod parse 'throw
  [op env [_ throw :as form] name]
  (let [throw-expr (disallowing-recur (analyze (assoc env :context :expr) throw))]
    {:env env :op :throw :form form
     :throw throw-expr
     :children [throw-expr]}))

(defn- block-children [{:keys [statements ret]}]
  (conj (vec statements) ret))

(defmethod parse 'try*
  [op env [_ & body :as form] name]
  (let [body (vec body)
        catchenv (update-in env [:context] #(if (= :expr %) :return %))
        tail (peek body)
        fblock (when (and (seq? tail) (= 'finally (first tail)))
                  (rest tail))
        finally (when fblock
                  (analyze-block
                   (assoc env :context :statement)
                   fblock))
        body (if finally (pop body) body)
        tail (peek body)
        cblock (when (and (seq? tail)
                          (= 'catch (first tail)))
                 (rest tail))
        name (first cblock)
        locals (:locals catchenv)
        mname (when name (munge name))
        locals (if name
                 (assoc locals name {:name mname})
                 locals)
        catch (when cblock
                (analyze-block (assoc catchenv :locals locals) (rest cblock)))
        body (if name (pop body) body)
        try (when body
              (analyze-block (if (or name finally) catchenv env) body))]
    (when name (assert (not (namespace name)) "Can't qualify symbol in catch"))
    {:env env :op :try* :form form
     :try try
     :finally finally
     :name mname
     :catch catch
     :children (vec (mapcat block-children
                            [try catch finally]))}))

(defmethod parse 'def
  [op env form name]
  (let [pfn (fn
              ([_ sym] {:sym sym})
              ([_ sym init] {:sym sym :init init})
              ([_ sym doc init] {:sym sym :doc doc :init init}))
        args (apply pfn form)
        sym (:sym args)
        tag (-> sym meta :tag)
        protocol (-> sym meta :protocol)
        dynamic (-> sym meta :dynamic)
        ns-name (-> env :ns :name)]
    (assert (not (namespace sym)) "Can't def ns-qualified name")
    (let [env (if (or (and (not= ns-name 'cljc.core)
                           (core-name? env sym))
                      (get-in @namespaces [ns-name :uses sym]))
                (let [ev (resolve-existing-var (dissoc env :locals) sym)]
                  (when *cljs-warn-on-redef*
                    (warning env
                      (str "WARNING: " sym " already refers to: " (symbol (str (:ns ev)) (str sym))
                           " being replaced by: " (symbol (str ns-name) (str sym)))))
                  (swap! namespaces update-in [ns-name :excludes] conj sym)
                  (update-in env [:ns :excludes] conj sym))
                env)
          name (munge (:name (resolve-var (dissoc env :locals) sym)))
          init-expr (when (contains? args :init)
                      (disallowing-recur
                       (analyze (assoc env :context :expr) (:init args) sym)))
          fn-var? (and init-expr (= (:op init-expr) :fn))
          export-as (when-let [export-val (-> sym meta :export)]
                      (if (= true export-val) name export-val))
          doc (or (:doc args) (-> sym meta :doc))]
      (when-let [v (get-in @namespaces [ns-name :defs sym])]
        (when (and *cljs-warn-on-fn-var*
                   (not (-> sym meta :declared))
                   (and (:fn-var v) (not fn-var?)))
          (warning env
            (str "WARNING: " (symbol (str ns-name) (str sym))
                 " no longer fn, references are stale"))))
      (swap! namespaces update-in [ns-name :defs sym]
             (fn [m]
               (let [m (assoc (or m {}) :name name)]
                 (merge m
                   (when tag {:tag tag})
                   (when dynamic {:dynamic true})
                   (when-let [line (:line env)]
                     {:file *cljs-file* :line line})
                   (when protocol
                     {:protocol protocol})
                   (when-let [protocol-symbol (-> sym meta :protocol-symbol)]
                     {:protocol-symbol protocol-symbol})
                   (when fn-var?
                     {:fn-var true
                      :variadic (:variadic init-expr)
                      :max-fixed-arity (:max-fixed-arity init-expr)
                      :method-params (map (fn [m]
                                            (:params m))
                                          (:methods init-expr))})))))
      (merge {:env env :op :def :form form
              :name name :doc doc :init init-expr}
             (when tag {:tag tag})
             (when dynamic {:dynamic true})
             (when export-as {:export export-as})
             (when init-expr {:children [init-expr]})))))

(defn- analyze-fn-method [env locals meth]
  (letfn [(uniqify [[p & r]]
            (when p
              (cons (if (some #{p} r) (gensym (str p)) p)
                    (uniqify r))))]
   (let [params (first meth)
         fields (-> params meta ::fields)
         variadic (boolean (some '#{&} params))
         params (uniqify (remove '#{&} params))
         fixed-arity (count (if variadic (butlast params) params))
         body (next meth)
         locals (reduce (fn [m [i fld]]
                          (assoc m fld
                                 {:index i
				  :name fld
                                  :field true
                                  :mutable (-> fld meta :mutable)}))
                        locals (map-indexed vector fields))
         locals (reduce (fn [m name] (assoc m name {:name (munge name) :local true})) locals params)
         recur-frame {:names (vec (map munge params)) :flag (atom nil)}
         block (binding [*recur-frames* (cons recur-frame *recur-frames*)]
                 (analyze-block (assoc env :context :return :locals locals) body))]
     (merge {:env env :variadic variadic :params (map munge params) :max-fixed-arity fixed-arity
             :has-gthis (boolean fields) :recurs @(:flag recur-frame)}
            block))))

(defmethod parse 'fn*
  [op env [_ & args :as form] name]
  (let [[name meths] (if (symbol? (first args))
                       [(first args) (next args)]
                       [name (seq args)])
        ;;turn (fn [] ...) into (fn ([]...))
        meths (if (vector? (first meths)) (list meths) meths)
        mname (when name (munge name))
        locals (:locals env)
        locals (if name (assoc locals name {:name mname}) locals)
        menv (if (> (count meths) 1) (assoc env :context :expr) env)
        methods (map #(analyze-fn-method menv locals %) meths)
        max-fixed-arity (apply max (map :max-fixed-arity methods))
        variadic (boolean (some :variadic methods))
        locals (if name (assoc locals name {:name mname :fn-var true
					    :local true
                                            :variadic variadic
                                            :max-fixed-arity max-fixed-arity
                                            :method-params (map :params methods)}))
        methods (if name
                  ;; a second pass with knowledge of our function-ness/arity
                  ;; lets us optimize self calls
                  (map #(analyze-fn-method menv locals %) meths)
                  methods)]
    ;;todo - validate unique arities, at most one variadic, variadic takes max required args
    {:env env :op :fn :form form :name mname :methods methods :variadic variadic
     :recur-frames *recur-frames* :loop-lets *loop-lets*
     :jsdoc [(when variadic "@param {...*} var_args")]
     :max-fixed-arity max-fixed-arity
     :children (vec (mapcat block-children
                            methods))}))

(defmethod parse 'letfn*
  [op env [_ bindings & exprs :as form] name]
  (assert (and (vector? bindings) (even? (count bindings))) "bindings must be vector of even number of elements")
  (let [n->fexpr (into {} (map (juxt first second) (partition 2 bindings)))
        names    (keys n->fexpr)
        n->gsym  (into {} (map (juxt identity #(gensym (str (munge %) "__"))) names))
        gsym->n  (into {} (map (juxt n->gsym identity) names))
        context  (:context env)
        bes      (reduce (fn [bes n]
                           (let [g (n->gsym n)]
                             (conj bes {:name  g
                                        :tag   (-> n meta :tag)
                                        :local true})))
                         []
                         names)
        meth-env (reduce (fn [env be]
                           (let [n (gsym->n (be :name))]
                             (assoc-in env [:locals n] be)))
                         (assoc env :context :expr)
                         bes)
        [meth-env finits]
        (reduce (fn [[env finits] n]
                  (let [finit (analyze meth-env (n->fexpr n))
                        be (-> (get-in env [:locals n])
                               (assoc :init finit))]
                    [(assoc-in env [:locals n] be)
                     (conj finits finit)]))
                [meth-env []]
                names)
        {:keys [statements ret]}
        (analyze-block (assoc meth-env :context (if (= :expr context) :return context)) exprs)
        bes (vec (map #(get-in meth-env [:locals %]) names))]
    {:env env :op :letfn :bindings bes :statements statements :ret ret :form form
     :children (into (vec (map :init bes))
                     (conj (vec statements) ret))}))

(defmethod parse 'do
  [op env [_ & exprs :as form] _]
  (let [block (analyze-block env exprs)]
    (merge {:env env :op :do :form form :children (block-children block)} block)))

(defn analyze-let
  [encl-env [_ bindings & exprs :as form] is-loop]
  (assert (and (vector? bindings) (even? (count bindings))) "bindings must be vector of even number of elements")
  (let [context (:context encl-env)
        [bes env]
        (disallowing-recur
         (loop [bes []
                env (assoc encl-env :context :expr)
                bindings (seq (partition 2 bindings))]
           (if-let [[name init] (first bindings)]
             (do
               (assert (not (or (namespace name) (.contains (str name) "."))) (str "Invalid local name: " name))
               (let [init-expr (analyze env init)
                     be {:name (gensym (str (munge name) "__"))
                         :init init-expr
                         :tag (or (-> name meta :tag)
                                  (-> init-expr :tag))
                         :local true}]
                 (recur (conj bes be)
                        (assoc-in env [:locals name] be)
                        (next bindings))))
             [bes env])))
        recur-frame (when is-loop {:names (vec (map :name bes)) :flag (atom nil)})
        {:keys [statements ret]}
        (binding [*recur-frames* (if recur-frame (cons recur-frame *recur-frames*) *recur-frames*)
                  *loop-lets* (cond
                               is-loop (or *loop-lets* ())
                               *loop-lets* (cons {:names (vec (map :name bes))} *loop-lets*))]
          (analyze-block (assoc env :context (if (= :expr context) :return context)) exprs))]
    {:env encl-env :op :let :loop is-loop
     :bindings bes :statements statements :ret ret :form form
     :children (into (vec (map :init bes))
                     (conj (vec statements) ret))}))

(defmethod parse 'let*
  [op encl-env form _]
  (analyze-let encl-env form false))

(defmethod parse 'loop*
  [op encl-env form _]
  (analyze-let encl-env form true))

(defmethod parse 'recur
  [op env [_ & exprs :as form] _]
  (let [context (:context env)
        frame (first *recur-frames*)
        exprs (disallowing-recur (vec (map #(analyze (assoc env :context :expr) %) exprs)))]
    (assert frame "Can't recur here")
    (assert (= (count exprs) (count (:names frame))) "recur argument count mismatch")
    (reset! (:flag frame) true)
    (assoc {:env env :op :recur :form form}
      :frame frame
      :exprs exprs
      :children exprs)))

(defmethod parse 'quote
  [_ env [_ x] _]
  {:op :constant :env env :form x})

(defmethod parse 'new
  [_ env [_ ctor & args :as form] _]
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         ctorexpr (analyze enve ctor)
         argexprs (vec (map #(analyze enve %) args))
         known-num-fields (:num-fields (resolve-existing-var env ctor))
         argc (count args)]
     (when (and known-num-fields (not= known-num-fields argc))
       (warning env
         (str "WARNING: Wrong number of args (" argc ") passed to " ctor)))
     
     {:env env :op :new :form form :ctor ctorexpr :args argexprs
      :children (into [ctorexpr] argexprs)})))

(defmethod parse 'set!
  [_ env [_ target val alt :as form] _]
  (let [[target val] (if alt
                       ;; (set! o -prop val)
                       [`(. ~target ~val) alt]
                       [target val])]
    (disallowing-recur
     (let [enve (assoc env :context :expr)
           targetexpr (cond
                       ;; TODO: proper resolve
                       (= target '*unchecked-if*)
                       (do
                         (reset! *unchecked-if* val)
                         ::set-unchecked-if)

                       (symbol? target)
                       (do
                         (let [local (-> env :locals target)]
                           (assert (or (nil? local)
                                       (and (:field local)
                                            (:mutable local)))
                                   "Can't set! local var or non-mutable field"))
                         (analyze-symbol enve target))

                       :else
                       (when (seq? target)
                         (let [targetexpr (analyze-seq enve target nil)]
                           (when (:field targetexpr)
                             targetexpr))))
           valexpr (analyze enve val)]
       (assert targetexpr "set! target must be a field or a symbol naming a var")
       (cond
        (= targetexpr ::set-unchecked-if) {:env env :op :no-op}
        :else {:env env :op :set! :form form :target targetexpr :val valexpr
               :children [targetexpr valexpr]})))))

(defn ns->relpath [s]
  (str (string/replace (munge s) \. \/) ".cljs"))

(declare analyze-file)

(defn analyze-deps [deps]
  (doseq [dep deps]
    (when-not (:defs (@namespaces dep))
      (let [relpath (ns->relpath dep)]
        (when (io/resource relpath)
          (analyze-file relpath))))))

(defmethod parse 'ns
  [_ env [_ name & args :as form] _]
  (let [docstring (if (string? (first args)) (first args) nil)
        args      (if docstring (next args) args)
        excludes
        (reduce (fn [s [k exclude xs]]
                  (if (= k :refer-clojure)
                    (do
                      (assert (= exclude :exclude) "Only [:refer-clojure :exclude [names]] form supported")
                      (assert (not (seq s)) "Only one :refer-clojure form is allowed per namespace definition")
                      (into s xs))
                    s))
                #{} args)
        deps (atom #{})
        valid-forms (atom #{:use :use-macros :require :require-macros})
        {uses :use requires :require uses-macros :use-macros requires-macros :require-macros :as params}
        (reduce (fn [m [k & libs]]
                  (assert (#{:use :use-macros :require :require-macros} k)
                          "Only :refer-clojure, :require, :require-macros, :use and :use-macros libspecs supported")
                  (assert (@valid-forms k)
                          (str "Only one " k " form is allowed per namespace definition"))
                  (swap! valid-forms disj k)
                  (assoc m k (into {}
                                   (mapcat (fn [[lib kw expr]]
                                             (swap! deps conj lib)
                                             (case k
                                               (:require :require-macros)
                                               (do (assert (and expr (= :as kw))
                                                           "Only (:require [lib.ns :as alias]*) form of :require / :require-macros is supported")
                                                   [[expr lib]])
                                               (:use :use-macros)
                                               (do (assert (and expr (= :only kw))
                                                           "Only (:use [lib.ns :only [names]]*) form of :use / :use-macros is supported")
                                                   (map vector expr (repeat lib)))))
                                           libs))))
                {} (remove (fn [[r]] (= r :refer-clojure)) args))]
    (when (seq @deps)
      (analyze-deps @deps))
    (set! *cljs-ns* name)
    (require 'cljc.core)
    (doseq [nsym (concat (vals requires-macros) (vals uses-macros))]
      (clojure.core/require nsym))
    (swap! namespaces #(-> %
                           (assoc-in [name :name] name)
                           (assoc-in [name :excludes] excludes)
                           (assoc-in [name :uses] uses)
                           (assoc-in [name :requires] requires)
                           (assoc-in [name :uses-macros] uses-macros)
                           (assoc-in [name :requires-macros]
                                     (into {} (map (fn [[alias nsym]]
                                                     [alias (find-ns nsym)])
                                                   requires-macros)))))
    {:env env :op :ns :form form :name name :uses uses :requires requires
     :uses-macros uses-macros :requires-macros requires-macros :excludes excludes}))

(defmethod parse 'defprotocol*
  [_ env [_ psym & methods :as form] _]
  (let [p (munge (:name (resolve-var (dissoc env :locals) psym)))
	ns-name (-> env :ns :name)
	index (dec (swap! num-protocols inc))]
    (swap! protocols
           (fn [protocols]
             (update-in protocols [ns-name psym]
                        (fn [m]
                          {:name p
			   :methods methods}))))
    {:env env
     :op :defprotocol*
     :as form
     :p p
     :index index
     :methods methods}))

(defmethod parse 'deftype*
  [_ env [_ tsym fields pmasks :as form] _]
  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))
	index (dec (swap! num-types inc))]
    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {})
                       :name t
		       :fields fields
                       :num-fields (count fields))]
               (if-let [line (:line env)]
                 (-> m
                     (assoc :file *cljs-file*)
                     (assoc :line line))
                 m))))
    {:env env :op :deftype* :as form :t t :fields fields :pmasks pmasks :index index}))

(defmethod parse 'defrecord*
  [_ env [_ tsym fields pmasks :as form] _]
  (let [t (munge (:name (resolve-var (dissoc env :locals) tsym)))]
    (swap! namespaces update-in [(-> env :ns :name) :defs tsym]
           (fn [m]
             (let [m (assoc (or m {}) :name t)]
               (if-let [line (:line env)]
                 (-> m
                     (assoc :file *cljs-file*)
                     (assoc :line line))
                 m))))
    {:env env :op :defrecord* :form form :t t :fields fields :pmasks pmasks}))

;; dot accessor code

(def ^:private property-symbol? #(boolean (and (symbol? %) (re-matches #"^-.*" (name %)))))

(defn- munge-not-reserved [meth]
  (if-not (js-reserved (str meth))
    (munge meth)
    meth))

(defn- clean-symbol
  [sym]
  (symbol
   (if (property-symbol? sym)
     (-> sym name (.substring 1) munge-not-reserved)
     (-> sym name munge-not-reserved))))

(defn- classify-dot-form
  [[target member args]]
  [(cond (nil? target) ::error
         :default      ::expr)
   (cond (property-symbol? member) ::property
	 (symbol? member)          ::symbol
         (seq? member)             ::list
         :default                  ::error)
   (cond (nil? args) ()
         :default    ::expr)])

(defmulti build-dot-form #(classify-dot-form %))

;; (. o -p)
;; (. (...) -p)
(defmethod build-dot-form [::expr ::property ()]
  [[target prop _]]
  {:dot-action ::access :target target :field (clean-symbol prop)})

(defn- build-method-call
  "Builds the intermediate method call map used to reason about the parsed form during
  compilation."
  [target meth args]
  (if (symbol? meth)
    {:dot-action ::call :target target :method (munge-not-reserved meth) :args args}
    {:dot-action ::call :target target :method (munge-not-reserved (first meth)) :args args}))

;; (. o m 1 2)
(defmethod build-dot-form [::expr ::symbol ::expr]
  [[target meth args]]
  (build-method-call target meth args))

;; (. o m)
(defmethod build-dot-form [::expr ::symbol ()]
  [[target meth args]]
  (build-method-call target meth args))

;; (. o (m))
;; (. o (m 1 2))
(defmethod build-dot-form [::expr ::list ()]
  [[target meth-expr _]]
  (build-method-call target (first meth-expr) (rest meth-expr)))

(defmethod build-dot-form :default
  [dot-form]
  (throw (Error. (str "Unknown dot form of " (list* '. dot-form) " with classification " (classify-dot-form dot-form)))))

(defmethod parse '.
  [_ env [_ target & [field & member+] :as form] _]
  (disallowing-recur
   (let [{:keys [dot-action target method field args]} (build-dot-form [target field member+])
         enve        (assoc env :context :expr)
         targetexpr  (analyze enve target)]
     (case dot-action
           ::access {:env env :op :dot :form form
                     :target targetexpr
                     :field field
                     :children [targetexpr]
                     :tag (-> form meta :tag)}
           ::call   (let [argexprs (map #(analyze enve %) args)]
                      {:env env :op :dot :form form
                       :target targetexpr
                       :method method
                       :args argexprs
                       :children (into [targetexpr] argexprs)
                       :tag (-> form meta :tag)})))))

(defmulti parse-c-expr (fn [type _ _] type))
(defmethod parse-c-expr :expr [_ env form]
	   (analyze env form))
(defmethod parse-c-expr :str [_ _ form]
	   form)
(defmethod parse-c-expr :sym [_ _ form]
	   form)

(defmethod parse 'c*
  [op env [_ jsform & args :as form] _]
  (assert (string? jsform))
  (if args
    (disallowing-recur
     (let [enve (assoc env :context :expr)
	   [segs argexprs]
	   (loop [^String s jsform
		  args args
		  segs []
		  argexprs []]
	     (let [idx (.indexOf s "~{")]
	       (if (= -1 idx)
		 [(conj segs s) argexprs]
		 (let [end (.indexOf s "}" idx)
		       type-str (subs s (+ 2 idx) end)
		       type (if (zero? (count type-str)) :expr (keyword type-str))
		       prefix (subs s 0 idx)
		       suffix (subs s (inc end))]
		   (recur suffix
			  (rest args)
			  (conj segs prefix type)
			  (conj argexprs (parse-c-expr type enve (first args))))))))]
       {:env env :op :c :segs segs :args argexprs
        :tag (-> form meta :tag) :form form :children argexprs}))
    (let [interp (fn interp [^String s]
                   (let [idx (.indexOf s "~{")]
                     (if (= -1 idx)
                       (list s)
                       (let [end (.indexOf s "}" idx)
                             inner (:name (resolve-existing-var env (symbol (subs s (+ 2 idx) end))))]
                         (cons (subs s 0 idx) (cons inner (interp (subs s (inc end)))))))))]
      {:env env :op :c :form form :code (apply str (interp jsform))
       :tag (-> form meta :tag)})))

(defn parse-invoke
  [env [f & args :as form]]
  (disallowing-recur
   (let [enve (assoc env :context :expr)
         fexpr (analyze enve f)
         argexprs (vec (map #(analyze enve %) args))
         argc (count args)]
     (if (and *cljs-warn-fn-arity* (-> fexpr :info :fn-var))
       (let [{:keys [variadic max-fixed-arity method-params name]} (:info fexpr)]
         (when (and (not (some #{argc} (map count method-params)))
                    (or (not variadic)
                        (and variadic (< argc max-fixed-arity))))
           (warning env
             (str "WARNING: Wrong number of args (" argc ") passed to " name)))))
     {:env env :op :invoke :form form :f fexpr :args argexprs
      :tag (or (-> fexpr :info :tag) (-> form meta :tag)) :children (into [fexpr] argexprs)})))

(defn analyze-symbol
  "Finds the var associated with sym"
  [env sym]
  (let [ret {:env env :form sym}
        lb (-> env :locals sym)]
    (if lb
      (assoc ret :op :var :info lb)
      (assoc ret :op :var :info (resolve-existing-var env sym)))))

(defn get-expander [sym env]
  (let [mvar
        (when-not (or (-> env :locals sym)        ;locals hide macros
                      (and (or (-> env :ns :excludes sym)
                               (get-in @namespaces [(-> env :ns :name) :excludes sym]))
                           (not (or (-> env :ns :uses-macros sym)
                                    (get-in @namespaces [(-> env :ns :name) :uses-macros sym])))))
          (if-let [nstr (namespace sym)]
            (when-let [ns (cond
                           (= "clojure.core" nstr) (find-ns 'cljc.core)
                           (.contains nstr ".") (find-ns (symbol nstr))
                           :else
                           (-> env :ns :requires-macros (get (symbol nstr))))]
              (.findInternedVar ^clojure.lang.Namespace ns (symbol (name sym))))
            (if-let [nsym (-> env :ns :uses-macros sym)]
              (.findInternedVar ^clojure.lang.Namespace (find-ns nsym) sym)
              (.findInternedVar ^clojure.lang.Namespace (find-ns 'cljc.core) sym))))]
    (when (and mvar (.isMacro ^clojure.lang.Var mvar))
      @mvar)))

(defn macroexpand-1 [env form]
  (let [op (first form)]
    (if (specials op)
      form
      (if-let [mac (and (symbol? op) (get-expander op env))]
        (binding [*ns* *cljs-ns*]
          (apply mac form env (rest form)))
        (if (symbol? op)
          (let [opname (str op)]
            (cond
             (= (first opname) \.) (let [[target & args] (next form)]
                                     (with-meta (list* '. target (symbol (subs opname 1)) args)
                                       (meta form)))
             (= (last opname) \.) (with-meta
                                    (list* 'new (symbol (subs opname 0 (dec (count opname)))) (next form))
                                    (meta form))
             :else form))
          form)))))

(defn analyze-seq
  [env form name]
  (let [env (assoc env :line
                   (or (-> form meta :line)
                       (:line env)))]
    (let [op (first form)]
      (assert (not (nil? op)) "Can't call nil")
      (let [mform (macroexpand-1 env form)]
        (if (identical? form mform)
          (if (specials op)
            (parse op env form name)
            (parse-invoke env form))
          (analyze env mform name))))))

(declare analyze-wrap-meta)

(defn analyze-map
  [env form name]
  (let [expr-env (assoc env :context :expr)
        simple-keys? (every? #(or (string? %) (keyword? %))
                             (keys form))
        ks (disallowing-recur (vec (map #(analyze expr-env % name) (keys form))))
        vs (disallowing-recur (vec (map #(analyze expr-env % name) (vals form))))]
    (analyze-wrap-meta {:op :map :env env :form form
                        :keys ks :vals vs :simple-keys? simple-keys?
                        :children (vec (interleave ks vs))}
                       name)))

(defn analyze-vector
  [env form name]
  (let [expr-env (assoc env :context :expr)
        items (disallowing-recur (vec (map #(analyze expr-env % name) form)))]
    (analyze-wrap-meta {:op :vector :env env :form form :items items :children items} name)))

(defn analyze-set
  [env form name]
  (let [expr-env (assoc env :context :expr)
        items (disallowing-recur (vec (map #(analyze expr-env % name) form)))]
    (analyze-wrap-meta {:op :set :env env :form form :items items :children items} name)))

(defn analyze-wrap-meta [expr name]
  (let [form (:form expr)]
    (if (meta form)
      (let [env (:env expr) ; take on expr's context ourselves
            expr (assoc-in expr [:env :context] :expr) ; change expr to :expr
            meta-expr (analyze-map (:env expr) (meta form) name)]
        {:op :meta :env env :form form
         :meta meta-expr :expr expr :children [meta-expr expr]})
      expr)))

(defn analyze
  "Given an environment, a map containing {:locals (mapping of names to bindings), :context
  (one of :statement, :expr, :return), :ns (a symbol naming the
  compilation ns)}, and form, returns an expression object (a map
  containing at least :form, :op and :env keys). If expr has any (immediately)
  nested exprs, must have :children [exprs...] entry. This will
  facilitate code walking without knowing the details of the op set."
  ([env form] (analyze env form nil))
  ([env form name]
     (let [form (if (instance? clojure.lang.LazySeq form)
                  (or (seq form) ())
                  form)]
       (cond
        (symbol? form) (analyze-symbol env form)
        (and (seq? form) (seq form)) (analyze-seq env form name)
        (map? form) (analyze-map env form name)
        (vector? form) (analyze-vector env form name)
        (set? form) (analyze-set env form name)
        :else {:op :constant :env env :form form}))))

(defn analyze-file
  [f]
  (let [res (if (= \/ (first f)) f (io/resource f))]
    (assert res (str "Can't find " f " in classpath"))
    (binding [*cljs-ns* 'cljs.user
              *cljs-file* (.getPath ^java.net.URL res)]
      (with-open [r (io/reader res)]
        (let [env {:ns (@namespaces *cljs-ns*) :context :statement :locals {}}
              pbr (clojure.lang.LineNumberingPushbackReader. r)
              eof (Object.)]
          (loop [asts []
		 r (read pbr false eof false)]
            (let [env (assoc env :ns (@namespaces *cljs-ns*))]
              (if (identical? eof r)
		asts
                (recur (conj asts (analyze env r))
		       (read pbr false eof false))))))))))

(defn forms-seq
  "Seq of forms in a Clojure or ClojureScript file."
  ([f]
     (forms-seq f (clojure.lang.LineNumberingPushbackReader. (io/reader f))))
  ([f ^java.io.PushbackReader rdr]
     (if-let [form (read rdr nil nil)]
       (lazy-seq (cons form (forms-seq f rdr)))
       (.close rdr))))

(defn rename-to-js
  "Change the file extension from .cljs to .js. Takes a File or a
  String. Always returns a String."
  [file-str]
  (clojure.string/replace file-str #".cljs$" ".js"))

(defn mkdirs
  "Create all parent directories for the passed file."
  [^java.io.File f]
  (.mkdirs (.getParentFile (.getCanonicalFile f))))

(defmacro with-core-cljs
  "Ensure that core.cljs has been loaded."
  [& body]
  `(do ;(when-not (:defs (get @namespaces 'cljc.core))
         ;(analyze-file "cljs/core.cljs"))
       ~@body))

(defn compile-file* [src dest]
  (with-core-cljs
    (with-open [out ^java.io.Writer (io/make-writer dest {})]
      (binding [*out* out
                *cljs-ns* 'cljs.user
                *cljs-file* (.getPath ^java.io.File src)
                *position* (atom [0 0])]
        (loop [forms (forms-seq src)
               ns-name nil
               deps nil]
          (if (seq forms)
            (let [env {:ns (@namespaces *cljs-ns*) :context :statement :locals {}}
                  ast (analyze env (first forms))]
              (do (emit ast)
                  (if (= (:op ast) :ns)
                    (recur (rest forms) (:name ast) (merge (:uses ast) (:requires ast)))
                    (recur (rest forms) ns-name deps))))
            {:ns (or ns-name 'cljs.user)
             :provides [ns-name]
             :requires (if (= ns-name 'cljc.core) (set (vals deps)) (conj (set (vals deps)) 'cljc.core))
             :file dest}))))))

(defn requires-compilation?
  "Return true if the src file requires compilation."
  [^java.io.File src ^java.io.File dest]
  (or (not (.exists dest))
      (> (.lastModified src) (.lastModified dest))))

(defn compile-file
  "Compiles src to a file of the same name, but with a .js extension,
   in the src file's directory.

   With dest argument, write file to provided location. If the dest
   argument is a file outside the source tree, missing parent
   directories will be created. The src file will only be compiled if
   the dest file has an older modification time.

   Both src and dest may be either a String or a File.

   Returns a map containing {:ns .. :provides .. :requires .. :file ..}.
   If the file was not compiled returns only {:file ...}"
  ([src]
     (let [dest (rename-to-js src)]
       (compile-file src dest)))
  ([src dest]
     (let [src-file (io/file src)
           dest-file (io/file dest)]
       (if (.exists src-file)
         (if (requires-compilation? src-file dest-file)
           (do (mkdirs dest-file)
               (compile-file* src-file dest-file))
           {:file dest-file})
         (throw (java.io.FileNotFoundException. (str "The file " src " does not exist.")))))))

(comment
  ;; flex compile-file
  (do
    (compile-file "/tmp/hello.cljs" "/tmp/something.js")
    (slurp "/tmp/hello.js")

    (compile-file "/tmp/somescript.cljs")
    (slurp "/tmp/somescript.js")))

(defn path-seq
  [file-str]
  (->> java.io.File/separator
       java.util.regex.Pattern/quote
       re-pattern
       (string/split file-str)))

(defn to-path
  ([parts]
     (to-path parts java.io.File/separator))
  ([parts sep]
     (apply str (interpose sep parts))))

(defn to-target-file
  "Given the source root directory, the output target directory and
  file under the source root, produce the target file."
  [^java.io.File dir ^String target ^java.io.File file]
  (let [dir-path (path-seq (.getAbsolutePath dir))
        file-path (path-seq (.getAbsolutePath file))
        relative-path (drop (count dir-path) file-path)
        parents (butlast relative-path)
        parent-file (java.io.File. ^String (to-path (cons target parents)))]
    (java.io.File. parent-file ^String (rename-to-js (last relative-path)))))

(defn cljs-files-in
  "Return a sequence of all .cljs files in the given directory."
  [dir]
  (filter #(let [name (.getName ^java.io.File %)]
             (and (.endsWith name ".cljs")
                  (not= \. (first name))
                  (not (contains? cljs-reserved-file-names name))))
          (file-seq dir)))

(defn compile-root
  "Looks recursively in src-dir for .cljs files and compiles them to
   .js files. If target-dir is provided, output will go into this
   directory mirroring the source directory structure. Returns a list
   of maps containing information about each file which was compiled
   in dependency order."
  ([src-dir]
     (compile-root src-dir "out"))
  ([src-dir target-dir]
     (let [src-dir-file (io/file src-dir)]
       (loop [cljs-files (cljs-files-in src-dir-file)
              output-files []]
         (if (seq cljs-files)
           (let [cljs-file (first cljs-files)
                 output-file ^java.io.File (to-target-file src-dir-file target-dir cljs-file)
                 ns-info (compile-file cljs-file output-file)]
             (recur (rest cljs-files) (conj output-files (assoc ns-info :file-name (.getPath output-file)))))
           output-files)))))

(comment
  ;; compile-root
  ;; If you have a standard project layout with all file in src
  (compile-root "src")
  ;; will produce a mirrored directory structure under "out" but all
  ;; files will be compiled to js.
  )

(comment

;;the new way - use the REPL!!
(require '[cljs.compiler :as comp])
(def repl-env (comp/repl-env))
(comp/repl repl-env)
;having problems?, try verbose mode
(comp/repl repl-env :verbose true)
;don't forget to check for uses of undeclared vars
(comp/repl repl-env :warn-on-undeclared true)

(test-stuff)
(+ 1 2 3)
([ 1 2 3 4] 2)
({:a 1 :b 2} :a)
({1 1 2 2} 1)
(#{1 2 3} 2)
(:b {:a 1 :b 2})
('b '{:a 1 b 2})

(extend-type number ISeq (-seq [x] x))
(seq 42)
;(aset cljc.core.ISeq "number" true)
;(aget cljc.core.ISeq "number")
(satisfies? ISeq 42)
(extend-type nil ISeq (-seq [x] x))
(satisfies? ISeq nil)
(seq nil)

(extend-type default ISeq (-seq [x] x))
(satisfies? ISeq true)
(seq true)

(test-stuff)

(array-seq [])
(defn f [& etc] etc)
(f)

(in-ns 'cljs.core)
;;hack on core


(deftype Foo [a] IMeta (-meta [_] (fn [] a)))
((-meta (Foo. 42)))

;;OLD way, don't you want to use the REPL?
(in-ns 'cljs.compiler)
(import '[javax.script ScriptEngineManager])
(def jse (-> (ScriptEngineManager.) (.getEngineByName "JavaScript")))
(.eval jse cljs.compiler/bootjs)
(def envx {:ns (@namespaces 'cljs.user) :context :expr :locals '{ethel {:name ethel__123 :init nil}}})
(analyze envx nil)
(analyze envx 42)
(analyze envx "foo")
(analyze envx 'fred)
(analyze envx 'fred.x)
(analyze envx 'ethel)
(analyze envx 'ethel.x)
(analyze envx 'my.ns/fred)
(analyze envx 'your.ns.fred)
(analyze envx '(if test then else))
(analyze envx '(if test then))
(analyze envx '(and fred ethel))
(analyze (assoc envx :context :statement) '(def test "fortytwo" 42))
(analyze (assoc envx :context :expr) '(fn* ^{::fields [a b c]} [x y] a y x))
(analyze (assoc envx :context :statement) '(let* [a 1 b 2] a))
(analyze (assoc envx :context :statement) '(defprotocol P (bar [a]) (baz [b c])))
(analyze (assoc envx :context :statement) '(. x y))
(analyze envx '(fn foo [x] (let [x 42] (js* "~{x}['foobar']"))))

(analyze envx '(ns fred (:require [your.ns :as yn]) (:require-macros [clojure.core :as core])))
(defmacro js [form]
  `(emit (analyze {:ns (@namespaces 'cljs.user) :context :statement :locals {}} '~form)))

(defn jscapture [form]
  "just grabs the js, doesn't print it"
  (with-out-str
    (emit (analyze {:ns (@namespaces 'cljs.user) :context :expr :locals {}} form))))

(defn jseval [form]
  (let [js (jscapture form)]
    ;;(prn js)
    (.eval jse (str "print(" js ")"))))

;; from closure.clj
(optimize (jscapture '(defn foo [x y] (if true 46 (recur 1 x)))))

(js (if a b c))
(js (def x 42))
(js (defn foo [a b] a))
(js (do 1 2 3))
(js (let [a 1 b 2 a b] a))

(js (ns fred (:require [your.ns :as yn]) (:require-macros [cljs.core :as core])))

(js (def foo? (fn* ^{::fields [a? b c]} [x y] (if true a? (recur 1 x)))))
(js (def foo (fn* ^{::fields [a b c]} [x y] (if true a (recur 1 x)))))
(js (defn foo [x y] (if true x y)))
(jseval '(defn foo [x y] (if true x y)))
(js (defn foo [x y] (if true 46 (recur 1 x))))
(jseval '(defn foo [x y] (if true 46 (recur 1 x))))
(jseval '(foo 1 2))
(js (and fred ethel))
(jseval '(ns fred (:require [your.ns :as yn]) (:require-macros [cljs.core :as core])))
(js (def x 42))
(jseval '(def x 42))
(jseval 'x)
(jseval '(if 42 1 2))
(jseval '(or 1 2))
(jseval '(fn* [x y] (if true 46 (recur 1 x))))
(.eval jse "print(test)")
(.eval jse "print(cljs.user.Foo)")
(.eval jse  "print(cljs.user.Foo = function (){\n}\n)")
(js (def fred 42))
(js (deftype* Foo [a b-foo c]))
(jseval '(deftype* Foo [a b-foo c]))
(jseval '(. (new Foo 1 2 3) b-foo))
(js (. (new Foo 1 2 3) b))
(.eval jse "print(new cljs.user.Foo(1, 42, 3).b)")
(.eval jse "(function (x, ys){return Array.prototype.slice.call(arguments, 1);})(1,2)[0]")

(macroexpand-1 '(cljs.core/deftype Foo [a b c] Fred (fred [x] a) (fred [x y] b) (ethel [x] c) Ethel (foo [] d)))
(-> (macroexpand-1 '(cljs.core/deftype Foo [a b c] Fred (fred [x] a) (fred [x y] b) (ethel [x] c) Ethel (foo [] d)))
    last last last first meta)

(macroexpand-1 '(cljs.core/extend-type Foo Fred (fred ([x] a) ([x y] b)) (ethel ([x] c)) Ethel (foo ([] d))))
(js (new foo.Bar 65))
(js (defprotocol P (bar [a]) (baz [b c])))
(js (. x y))
(js (. "fred" (y)))
(js (. x y 42 43))
(js (.. a b c d))
(js (. x (y 42 43)))
(js (fn [x] x))
(js (fn ([t] t) ([x y] y) ([ a b & zs] b)))

(js (. (fn foo ([t] t) ([x y] y) ([a b & zs] b)) call nil 1 2))
(js (fn foo
      ([t] t)
      ([x y] y)
      ([ a b & zs] b)))

(js ((fn foo
       ([t] (foo t nil))
       ([x y] y)
       ([ a b & zs] b)) 1 2 3))


(jseval '((fn foo ([t] t) ([x y] y) ([ a b & zs] zs)) 12 13 14 15))

(js (defn foo [this] this))

(js (defn foo [a b c & ys] ys))
(js ((fn [x & ys] ys) 1 2 3 4))
(jseval '((fn [x & ys] ys) 1 2 3 4))
(js (cljs.core/deftype Foo [a b c] Fred (fred [x] a) (fred [x y] a)  (ethel [x] c) Ethel (foo [] d)))
(jseval '(cljs.core/deftype Foo [a b c] Fred (fred [x] a) (fred [x y] a)  (ethel [x] c) Ethel (foo [] d)))

(js (do
           (defprotocol Proto (foo [this]))
           (deftype Type [a] Proto (foo [this] a))
           (foo (new Type 42))))

(jseval '(do
           (defprotocol P-roto (foo? [this]))
           (deftype T-ype [a] P-roto (foo? [this] a))
           (foo? (new T-ype 42))))

(js (def x (fn foo [x] (let [x 42] (js* "~{x}['foobar']")))))
(js (let [a 1 b 2 a b] a))

(doseq [e '[nil true false 42 "fred" fred ethel my.ns/fred your.ns.fred
            (if test then "fooelse")
            (def x 45)
            (do x y y)
            (fn* [x y] x y x)
            (fn* [x y] (if true 46 (recur 1 x)))
            (let* [a 1 b 2 a a] a b)
            (do "do1")
            (loop* [x 1 y 2] (if true 42 (do (recur 43 44))))
            (my.foo 1 2 3)
            (let* [a 1 b 2 c 3] (set! y.s.d b) (new fred.Ethel a b c))
            (let [x (do 1 2 3)] x)
            ]]
  (->> e (analyze envx) emit)
  (newline)))
