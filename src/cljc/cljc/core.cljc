;;; -*- clojure -*-

(ns cljc.core.List)

(def EMPTY nil)

(ns cljc.core)

(defn ^boolean not
  "Returns true if x is logical false, false otherwise."
  [x] (if x false true))

(comment
(defprotocol IFn
  (-invoke [& args]))
)

(defprotocol ASeq)

(defprotocol ISeq
  (-first [coll])
  (-rest [coll]))

(defprotocol ISeqable
  (-seq [o]))

(deftype Cons [first rest]
  ASeq
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  ISeqable
  (-seq [coll] coll))

(deftype EmptyList []
  ISeq
  (-first [coll] nil)
  (-rest [coll] nil)

  ISeqable
  (-seq [coll] nil))

(set! cljc.core.List/EMPTY (cljc.core/EmptyList))

(defn ^seq seq
  "Returns a seq on the collection. If the collection is
  empty, returns nil.  (seq nil) returns nil. seq also works on
  Strings."
  [coll]
  (when-not (nil? coll)
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

(defn inc
  "Returns a number one greater than num."
  [x] (cljc.core/+ x 1))

(defn dec
  "Returns a number one less than num."
  [x] (- x 1))
