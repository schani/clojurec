;;; -*- clojure -*-

(ns cljc.core)

(defprotocol* IFn
  (-invoke [& args]))

(defprotocol* ISeq
  (-first [coll])
  (-rest [coll]))

(deftype* Cons [first rest]
  ISeq
  (-first [coll] first)
  (-rest [coll] (if (nil? rest) () rest)))

(deftype* EmptyList
  ISeq
  (-first [coll] nil)
  (-rest [coll] nil))

(def cljc.core.List/EMPTY (EmptyList.))
