;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns cljc.reader
  #_(:require [goog.string :as gstring]))


(defprotocol PushbackReader
  (read-char [reader] "Returns the next char from the Reader,
nil if the end of stream has been reached")
  (unread [reader ch] "Push back a single character on to the stream"))

(deftype StringPushbackReader [s buffer ^:mutable idx ^:mutable bidx]
  PushbackReader
  (read-char [reader]
    (if (zero? bidx)
      (if (= (count s) idx)
        nil
        (do
          (set! idx (inc idx))
          (nth s idx)))
      (do
        (set! bidx (dec bidx))
        (aget buffer bidx))))
  (unread [reader ch]
    (aset buffer bidx ch)
    (set! bidx (inc bidx))))

(defn push-back-reader [s]
  "Creates a StringPushbackReader from a given string"
  (StringPushbackReader. s (make-array 1024) -1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; predicates
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn- ^boolean whitespace?
  "Checks whether a given character is whitespace"
  [ch]
  (cljc.string/blank-char? ch)
  #_(or #_(gcljc.string/isBreakingWhitespace ch)
      (= " " ch)
      (= \n ch)
      (= \r ch)
      (= \t ch)
      (= \, ch)))

(defn- ^boolean numeric?
  "Checks whether a given character is numeric"
  [ch]
  (or (= \0 ch)
      (= \1 ch)
      (= \2 ch)
      (= \3 ch)
      (= \4 ch)
      (= \5 ch)
      (= \6 ch)
      (= \7 ch)
      (= \8 ch)
      (= \9 ch)))

(defn- ^boolean comment-prefix?
  "Checks whether the character begins a comment."
  [ch]
  (= \; ch))

(defn- ^boolean number-literal?
  "Checks whether the reader is at the start of a number literal"
  [reader initch]
  (or (numeric? initch)
      (and (or (= \+ initch) (= \- initch))
           (numeric? (let [next-ch (read-char reader)]
                       (unread reader next-ch)
                       next-ch)))))

(declare read macros dispatch-macros)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; read helpers
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


; later will do e.g. line numbers...
(defn reader-error
  [rdr & msg]
  (throw (Exception. (apply str msg))))

(defn ^boolean macro-terminating? [ch]
  (and (not (= ch "#"))
       (not (= ch \'))
       (not (= ch ":"))
       (macros ch)))

(defn read-token
  [rdr initch]
  (loop [sb (sb-make (str initch))
         ch (read-char rdr)]
    (if (or (nil? ch)
            (whitespace? ch)
            (macro-terminating? ch))
      (do (unread rdr ch) (-to-string sb))
      (recur (-append! sb (str ch)) (read-char rdr)))))

(defn skip-line
  "Advances the reader to the end of a line. Returns the reader"
  [reader _]
  (loop []
    (let [ch (read-char reader)]
      (if (or (= ch \n) (= ch \r) (nil? ch))
        reader
        (recur)))))

(def int-pattern (re-pattern "([-+]?)(?:(0)|([1-9][0-9]*)|0[xX]([0-9A-Fa-f]+)|0([0-7]+)|([1-9][0-9]?)[rR]([0-9A-Za-z]+)|0[0-9]+)(N)?"))
(def ratio-pattern (re-pattern "([-+]?[0-9]+)/([0-9]+)"))
(def float-pattern (re-pattern "([-+]?[0-9]+(\\.[0-9]*)?([eE][-+]?[0-9]+)?)(M)?"))
(def symbol-pattern (re-pattern "[:]?([^0-9/].*/)?([^0-9/][^/]*)"))

(defn- re-find*
  [re s]
  (let [[matches] (re-seq re s)]
    (when-not (nil? matches)
      (if (== (count matches) 1)
        (nth matches 0)
        matches))))

(defn- match-int
  [s]
  (let [groups (re-find* int-pattern s)
        group3 (nth groups 2)]
    (if-not (or (nil? group3)
                (< (count group3) 1))
      0
      (let [negate (if (= "-" (nth groups 1)) -1 1)
            a (cond
               (nth groups 3) (array (nth groups 3) 10)
               (nth groups 4) (array (nth groups 4) 16)
               (nth groups 5) (array (nth groups 5) 8)
               (nth groups 7) (array (nth groups 7) (cljc.string/parse-integer (nth groups 7)))
               :default (array nil nil))
            n (nth a 0)
            radix (nth a 1)]
        (if (nil? n)
          nil
                                        ; TODO radix
          #_(* negate (cljc.string/parse-integer n radix))
          (* negate (cljc.string/parse-integer n)))))))


 (defn- match-ratio
   [s]
   (let [groups (re-find* ratio-pattern s)
         numinator (nth groups 1)
         denominator (nth groups 2)]
     (/ (cljc.string/parse-integer numinator) (cljc.string/parse-integer denominator))))

 (defn- match-float
   ; TODO probably need extension of underlying strtod
   [s]
   (let [groups (re-find* float-pattern s)
         group1 (nth groups 0)]
    (if-not (or (nil? group1)
            (< (count group1) 1))
      (cljc.string/parse-float s)))
   #_(js/parseFloat s))

 (defn- re-matches*
   [re s]
   ; why are the matches in a double seq?
   (let [[matches] (re-seq re s)]
     (when (and (not (nil? matches))
                (= (nth matches 0) s))
       (if (== (count matches) 1)
         (nth matches 0)
         matches))))

 (defn- match-number
   [s]
   (cond
    (re-matches* int-pattern s) (match-int s)
    (re-matches* ratio-pattern s) (match-ratio s)
    (re-matches* float-pattern s) (match-float s)))

 (defn escape-char-map [c]
   (cond
    (= c \t) "\t"
    (= c \r) "\r"
    (= c \n) "\n"
    (= c \\) \\
    (= c \") \"
    (= c \b) "\b"
    (= c \f) "\f"
    :else nil))

 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 ;; unicode
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

 (defn read-2-chars [reader]
   (-to-string
     (sb-make
      (str
       (read-char reader)
       (read-char reader)))))

 (defn read-4-chars [reader]
   (-to-string
    (sb-make
     (str
      (read-char reader)
      (read-char reader)
      (read-char reader)
      (read-char reader)))))

 (def unicode-2-pattern (re-pattern "[0-9A-Fa-f]{2}"))
 (def unicode-4-pattern (re-pattern "[0-9A-Fa-f]{4}"))

 (defn validate-unicode-escape [unicode-pattern reader escape-char unicode-str]
   (if (re-matches unicode-pattern unicode-str)
     unicode-str
     (reader-error reader "Unexpected unicode escape \\" escape-char unicode-str)))

 (defn make-unicode-char [code-str]
   "TODO UNICODE"
     #_(let [code (cljc.string/parse-integer code-str 16)]
       (.fromCharCode js/String code)))

 (defn escape-char
   [buffer reader]
   (let [ch (read-char reader)
         mapresult (escape-char-map ch)]
     (if mapresult
       mapresult
       (cond
         (= ch \x)
         (->> (read-2-chars reader)
           (validate-unicode-escape unicode-2-pattern reader ch)
           (make-unicode-char))

         (= ch \u)
         (->> (read-4-chars reader)
           (validate-unicode-escape unicode-4-pattern reader ch)
           (make-unicode-char))

         (numeric? ch)
         "TODO NUMERIC"
         #_(.fromCharCode js/String ch)

         :else
         (reader-error reader "Unexpected unicode escape \\" ch )))))

 (defn read-past
   "Read until first character that doesn't match pred, returning
    char."
   [pred rdr]
   (loop [ch (read-char rdr)]
     (if (and ch (pred ch))
       (recur (read-char rdr))
       ch)))

 (defn read-delimited-list
   [delim rdr recursive?]
   (loop [a (transient [])]
     (let [ch (read-past whitespace? rdr)]
       (when-not ch (reader-error rdr "EOF while reading"))
       (if (= delim ch)
         (persistent! a)
         (if-let [macrofn (macros ch)]
           (let [mret (macrofn rdr ch)]
             (recur (if (= mret rdr) a (conj! a mret))))
           (do
             (unread rdr ch)
             (let [o (read rdr true nil recursive?)]
               (recur (if (= o rdr) a (conj! a o))))))))))

 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 ;; data structure readers
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

 (defn not-implemented
   [rdr ch]
   (reader-error rdr "Reader for " ch " not implemented yet"))

 (declare maybe-read-tagged-type)

 (defn read-dispatch
   [rdr _]
   (let [ch (read-char rdr)
         dm (dispatch-macros ch)]
     (if dm
       (dm rdr _)
       (if-let [obj (maybe-read-tagged-type rdr ch)]
         obj
         (reader-error rdr "No dispatch macro for " ch)))))

 (defn read-unmatched-delimiter
   [rdr ch]
   (reader-error rdr "Unmatched delimiter " ch))

 (defn read-list
   [rdr _]
   (apply list (read-delimited-list \) rdr true)))

 (def read-comment skip-line)

 (defn read-vector
   [rdr _]
   (read-delimited-list \] rdr true))

 (defn read-map
   [rdr _]
   (let [l (read-delimited-list \} rdr true)]
     (when (odd? (count l))
       (reader-error rdr "Map literal must contain an even number of forms"))
     (apply hash-map l)))

 (defn read-number
   [reader initch]
   (loop [buffer (sb-make (str initch))
          ch (read-char reader)]
     (if (or (nil? ch) (whitespace? ch) (macros ch))
       (do
         (unread reader ch)
         (let [s (-to-string buffer)]
           (or (match-number s)
               (reader-error reader "Invalid number format [" s "]"))))
       (recur (do (-append! buffer (str ch))) (read-char reader)))))

 (defn read-string*
   [reader _]
   (loop [buffer (sb-make)
          ch (read-char reader)]
     (cond
      (nil? ch) (reader-error reader "EOF while reading")
      (= "\\" ch) (recur (do (-append! buffer (str (escape-char buffer reader))))
                         (read-char reader))
      (= \" ch) (-to-string buffer)
      :default (recur (do (-append! buffer (str ch))) (read-char reader)))))

 (defn special-symbols [t not-found]
   (cond
    (= t "nil") nil
    (= t "true") true
    (= t "false") false
    :else not-found))

 (defn- contains
   ([s t] (not (nil? (cljc.string/index-of s t)))))

 (defn read-symbol
   [reader initch]
   (let [token (read-token reader initch)]
     (if (contains token "/")
       (symbol (subs token 0 (cljc.string/index-of token "/"))
               (subs token (inc (cljc.string/index-of token "/")) (count token)))
       (special-symbols token (symbol token)))))

 (defn read-keyword
   [reader initch]
   (let [token (read-token reader (read-char reader))
         a (re-matches* symbol-pattern token)
         token (nth a 0)
         ns (nth a 1)
         name (nth a 2)]
     (if (or (and (not (empty? ns)) ; was js undefined?
                  (= (subs ns (- (count ns) 2) (count ns)) ":/"))
             (= (nth name (dec (count name))) ":")
             (not (neg? (cljc.string/index-of token "::" 1))))
       (reader-error reader "Invalid token: " token)
       (if (and (not (empty? ns)) (> (count ns) 0))
         (keyword (subs ns 0 (cljc.string/index-of ns "/")) name)
         (keyword token)))))

 (defn desugar-meta
   [f]
   (cond
    (symbol? f) {:tag f}
    (string? f) {:tag f}
    (keyword? f) {f true}
    :else f))

 (defn wrapping-reader
   [sym]
   (fn [rdr _]
     (list sym (read rdr true nil true))))

 (defn throwing-reader
   [msg]
   (fn [rdr _]
     (reader-error rdr msg)))

 (defn read-meta
   [rdr _]
   (let [m (desugar-meta (read rdr true nil true))]
     (when-not (map? m)
       (reader-error rdr "Metadata must be Symbol,Keyword,String or Map"))
     (let [o (read rdr true nil true)]
       (if (satisfies? IWithMeta o)
         (with-meta o (merge (meta o) m))
         (reader-error rdr "Metadata can only be applied to IWithMetas")))))

 (defn read-set
   [rdr _]
   (set (read-delimited-list \} rdr true)))

 (defn read-regex
   [rdr ch]
   (-> (read-string* rdr ch) re-pattern))

 (defn read-discard
   [rdr _]
   (read rdr true nil true)
   rdr)

 (defn macros [c]
   (cond
    (= c \") read-string*
    (= c \:) read-keyword
    (= c \;) not-implemented ;; never hit this
    (= c \') (wrapping-reader 'quote)
    (= c \@) (wrapping-reader 'deref)
    (= c \^) read-meta
    (= c \`) not-implemented
    (= c \~) not-implemented
    (= c \() read-list
    (= c \)) read-unmatched-delimiter
    (= c \[) read-vector
    (= c \]) read-unmatched-delimiter
    (= c \{) read-map
    (= c \}) read-unmatched-delimiter
    (= c \\) read-char
    (= c \#) read-dispatch
    :else nil))

 ;; omitted by design: var reader, eval reader
 (defn dispatch-macros [s]
   (cond
    (= s \{) read-set
    (= s \<) (throwing-reader "Unreadable form")
    (= s \") read-regex
    (= s \!) read-comment
    (= s \_) read-discard
    :else nil))

 (defn read
   "Reads the first object from a PushbackReader. Returns the object read.
    If EOF, throws if eof-is-error is true. Otherwise returns sentinel."
   [reader eof-is-error sentinel is-recursive]
   (let [ch (read-char reader)]
     (cond
      (nil? ch) (if eof-is-error (reader-error reader "EOF while reading") sentinel)
      (whitespace? ch) (recur reader eof-is-error sentinel is-recursive)
      (comment-prefix? ch) (recur (read-comment reader ch) eof-is-error sentinel is-recursive)
      :else (let [f (macros ch)
                  res
                  (cond
                   f (f reader ch)
                   (number-literal? reader ch) (read-number reader ch)
                   :else (read-symbol reader ch))]
      (if (= res reader)
        (recur reader eof-is-error sentinel is-recursive)
        res)))))

 (defn read-string
   "Reads one object from the string s"
   [s]
   (let [r (push-back-reader s)]
     (read r true nil false)))


 ;; read instances

 (defn ^:private zero-fill-right-and-truncate [s width]
   (cond (= width (count s)) s
         (< width (count s)) (subs s 0 width)
         :else (loop [b (sb-make s)]
                 (if (< (-count b) width) ; TODO getLength
                   (recur (-append! b "0"))
                   (-to-string b)))))

 (defn ^:private divisible?
   [num div]
   (zero? (mod num div)))

 (defn ^:private indivisible?
   [num div]
     (not (divisible? num div)))

 (defn ^:private leap-year?
   [year]
   (and (divisible? year 4)
        (or (indivisible? year 100)
            (divisible? year 400))))

 (def ^:private days-in-month
   (let [dim-norm [nil 31 28 31 30 31 30 31 31 30 31 30 31]
         dim-leap [nil 31 29 31 30 31 30 31 31 30 31 30 31]]
     (fn [month leap-year?]
       (get (if leap-year? dim-leap dim-norm) month))))

 (def ^:private timestamp-regex #"(\d\d\d\d)(?:-(\d\d)(?:-(\d\d)(?:[T](\d\d)(?::(\d\d)(?::(\d\d)(?:[.](\d+))?)?)?)?)?)?(?:[Z]|([-+])(\d\d):(\d\d))?")

 (defn ^:private parse-int [s]
   (cljc.string/parse-integer s)
   #_(let [n (cljc.string/parse-integer s)]
    (if-not (js/isNaN n)
      n)))

(defn ^:private check [low n high msg]
  (when-not (<= low n high)
    (reader-error nil (str msg " Failed:  " low "<=" n "<=" high)))
  n)

(defn parse-and-validate-timestamp [s]
  (let [[_ years months days hours minutes seconds fraction offset-sign offset-hours offset-minutes :as v]
        (re-matches timestamp-regex s)]
    (if-not v
      (reader-error nil (str "Unrecognized date/time syntax: " s))
      (let [years (parse-int years)
            months (or (parse-int months) 1)
            days (or (parse-int days) 1)
            hours (or (parse-int hours) 0)
            minutes (or (parse-int minutes) 0)
            seconds (or (parse-int seconds) 0)
            fraction (or (parse-int (zero-fill-right-and-truncate fraction 3)) 0)
            offset-sign (if (= offset-sign "-") -1 1)
            offset-hours (or (parse-int offset-hours) 0)
            offset-minutes (or (parse-int offset-minutes) 0)
            offset (* offset-sign (+ (* offset-hours 60) offset-minutes))]
        [years
         (check 1 months 12 "timestamp month field must be in range 1..12")
         (check 1 days (days-in-month months (leap-year? years)) "timestamp day field must be in range 1..last day in month")
         (check 0 hours 23 "timestamp hour field must be in range 0..23")
         (check 0 minutes 59 "timestamp minute field must be in range 0..59")
         (check 0 seconds (if (= minutes 59) 60 59) "timestamp second field must be in range 0..60")
         (check 0 fraction 999 "timestamp millisecond field must be in range 0..999")
         offset]))))

(defn parse-timestamp
  [ts]
  (if-let [[years months days hours minutes seconds ms offset]
           (parse-and-validate-timestamp ts)]
    [years months days hours minutes seconds ms offset]
    #_(js/Date.
     (- (.UTC js/Date years (dec months) days hours minutes seconds ms)
        (* offset 60 1000)))
    (reader-error nil (str "Unrecognized date/time syntax: " ts))))

(defn ^:private read-date
  [s]
  (if (string? s)
    (parse-timestamp s)
    (reader-error nil "Instance literal expects a string for its timestamp.")))


(defn ^:private read-queue
  [elems]
  (if (vector? elems)
    #_(into cljc.core.PersistentQueue/EMPTY elems)
    (into '() elems)
    (reader-error nil "Queue literal expects a vector for its elements.")))


(defn ^:private read-uuid
  [uuid]
  (if (string? uuid)
    (UUID. uuid)
    (reader-error nil "UUID literal expects a string as its representation.")))

(def *tag-table* (atom {"inst"  read-date
                        "uuid"  read-uuid
                        "queue" read-queue}))

(def *default-data-reader-fn*
  (atom nil))

(defn maybe-read-tagged-type
  [rdr initch]
  (let [tag (read-symbol rdr initch)
        pfn (get @*tag-table* (str tag))
        dfn @*default-data-reader-fn*]
    (cond
     pfn (pfn (read rdr true nil false))
     dfn (dfn tag (read rdr true nil false))
     :else (reader-error rdr
                         "Could not find tag parser for " (str tag)
                         " in " (pr-str (keys @*tag-table*))))))

(defn register-tag-parser!
  [tag f]
  (let [tag (str tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* assoc tag f)
    old-parser))

(defn deregister-tag-parser!
  [tag]
  (let [tag (str tag)
        old-parser (get @*tag-table* tag)]
    (swap! *tag-table* dissoc tag)
    old-parser))

(defn register-default-tag-parser!
  [f]
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] f))
    old-parser))

(defn deregister-default-tag-parser!
  []
  (let [old-parser @*default-data-reader-fn*]
    (swap! *default-data-reader-fn* (fn [_] nil))
    old-parser))
