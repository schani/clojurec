;;; -*- clojure -*-

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

(comment
(deftype Cons [first rest]
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest))

  ISeqable
  (-seq [coll] coll))

(deftype EmptyList
  ISeq
  (-first [coll] nil)
  (-rest [coll] nil)

  ISeqable
  (-seq [coll] nil))
)

;;(def cljc.core.List/EMPTY (EmptyList.))
