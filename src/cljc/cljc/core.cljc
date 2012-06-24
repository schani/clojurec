;;; -*- clojure -*-

(ns cljc.core.List)

(def EMPTY nil)

(ns cljc.core)

(comment
(defprotocol IFn
  (-invoke [& args]))
)

(defprotocol ISeq
  (-first [coll])
  (-rest [coll]))

(defprotocol ISeqable
  (-seq [o]))

(deftype Cons [first rest]
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
    (-seq coll)))
