(ns sample.metacircular)

; WIP, reader not yet implemented in cljc
; otherwise works already, also in clojure

(def serror println)
(def display println)

(def car first)
(def cdr rest)
(defn cadr [seq] (car (cdr seq)))
(defn cddr [seq] (cdr (cdr seq)))
(defn caadr [seq] (car (car (cdr seq))))
(defn caddr [seq] (car (cdr (cdr seq))))
(defn cdadr [seq] (cdr (car (cdr seq))))
(defn cdddr [seq] (cdr (cdr (cdr seq))))
(defn cadddr [seq] (car (cdr (cdr (cdr seq)))))


(defn tagged-list? [exp tag]
  (if (seq? exp)
    (= (car exp) tag)
    false))

(defn assignment? [exp]
  (tagged-list? exp 'set!))
(defn assignment-variable [exp] (cadr exp))
(defn assignment-value [exp] (caddr exp))


(defn lambda? [exp]
  (tagged-list? exp 'lambda))
(defn lambda-parameters [exp] (cadr exp))
(defn lambda-body [exp] (cddr exp))

(defn make-lambda [parameters body]
  (cons 'lambda (cons parameters body)))

(defn definition? [exp]
  (tagged-list? exp 'define))
(defn definition-variable [exp]
  (if (symbol? (cadr exp))
    (cadr exp)
    (caadr exp)))
(defn definition-value [exp]
  (if (symbol? (cadr exp))
    (caddr exp)
    (make-lambda (cdadr exp) ; formal parameters
                 (cddr exp)))) ; body

(defn begin? [exp] (tagged-list? exp 'begin))
(defn begin-actions [exp] (cdr exp))
(defn last-exp? [seq] (empty? (cdr seq)))
(defn first-exp [seq] (car seq))
(defn rest-exps [seq] (cdr seq))

(defn make-begin [seq]
  (list 'begin seq))

(defn sequence->exp [seq]
  (cond (empty? seq) seq
        (last-exp? seq) (first-exp seq)
        :else (make-begin seq)))


(defn variable? [exp]
  (symbol? exp))

(defn self-evaluating? [exp]
  (cond (number? exp) true
        (string? exp) true
        :else false))

(defn quoted? [exp]
  (tagged-list? exp 'quote))

(defn text-of-quotation [exp]
  (cdr exp))

(defn application? [exp] (list? exp))
(defn operator [exp] (car exp))
(defn operands [exp] (cdr exp))
(defn no-operands? [ops] (empty? ops))
(defn first-operand [ops] (car ops))
(defn rest-operands [ops] (cdr ops))




(defn cond? [exp] (tagged-list? exp 'cond))
(defn cond-clauses [exp] (cdr exp))
(defn cond-predicate [clause] (car clause))
(defn cond-else-clause? [clause] (= (cond-predicate clause) 'else))
(defn cond-actions [clause] (cdr clause))
(declare expand-clauses)
(defn cond->if [exp]
  (expand-clauses (cond-clauses exp)))

(declare make-if)
(defn expand-clauses [clauses]
  (if (empty? clauses)
    'false
    (let [first (car clauses)
          rest (cdr clauses)]
      (if (cond-else-clause? first)
        (if (empty? rest)
          (sequence->exp (cond-actions first))
          (serror "ELSE clause isn't last -- COND->IF"
                 clauses))
        (make-if (cond-predicate first)
                 (sequence->exp (cond-actions first))
                 (expand-clauses rest))))))


(declare seval)
(defn list-of-values [exps env]
  (if (no-operands? exps) '()
      (cons (seval (first-operand exps) env)
            (list-of-values (rest-operands exps) env))))

(defn if? [exp] (tagged-list? exp 'if))
(defn if-predicate [exp] (cadr exp))
(defn if-consequent [exp] (caddr exp))
(defn if-alternative [exp]
  (if (not (empty? (cdddr exp)))
    (cadddr exp)
    'false))

(defn make-if [predicate consequent alternative]
  (list 'if predicate consequent alternative))

(defn true? [x]
  (not= x false))

(defn false? [x]
  (= x false))

(defn eval-if [exp env]
  (if (true? (seval (if-predicate exp) env))
    (seval (if-consequent exp) env)
    (seval (if-alternative exp) env)))

(defn eval-sequence [exps env]
  (cond (last-exp? exps) (seval (first-exp exps) env)
        :else (do (seval (first-exp exps) env)
                  (eval-sequence (rest-exps exps) env))))

(declare set-variable-value!)
(defn eval-assignment [exp env]
  (set-variable-value! (assignment-variable exp)
                       (seval (assignment-value exp) env)
                       env)
  'ok)

(declare define-variable!)
(defn eval-definition [exp env]
  (define-variable! (definition-variable exp)
    (seval (definition-value exp) env)
    env)
  'ok)

(defn make-procedure [parameters body env]
  (list 'procedure parameters body env))
(defn compound-procedure? [p]
  (tagged-list? p 'procedure))
(defn procedure-parameters [p] (cadr p))
(defn procedure-body [p] (caddr p))
(defn procedure-environment [p] (cadddr p))

(defn enclosing-environment [env] (cdr env))
(defn first-frame [env] (car env))
(def the-empty-environment '())

(defn make-frame [variables values]
  (cons variables values))

(defn frame-variables [frame] (car frame))
(defn frame-values [frame] (cdr frame))


(defn extend-environment [vars vals base-env]
  (swap! base-env
         #(if (= (count vars) (count vals))
            (cons (make-frame vars vals) %)
            (if (< (count vars) (count vals))
              (serror "Too many arguments supplied" vars vals)
              (serror "Too few arguments supplied" vars vals))))
  base-env)

(defn lookup-variable-value [var env]
  (defn env-loop [env]
    (defn scan [vars vals]
      (cond (empty? vars) (env-loop (enclosing-environment env))
            (= var (car vars)) (car vals)
            :else (scan (cdr vars) (cdr vals))))
    (if (= env the-empty-environment)
      (serror "Unbound variable" var)
      (let [frame (first-frame env)]
        (scan (frame-variables frame)
              (frame-values frame)))))
  (env-loop @env))

(defn define-variable! [var val env]
  (defn scan [vars vals]
    (cond (empty? vars) (cons (list var) (list val))
          (= var (car vars)) (cons vars (cons val (cdr vals)))
          :else (let [[nvars & nvals] (scan (cdr vars) (cdr vals))]
                  (cons (cons (car vars) nvars)
                        (cons (car vals) nvals)))))
  (swap! env (fn [old] (let [frame (first-frame old)
                            others (enclosing-environment old)]
                        (cons (scan (frame-variables frame)
                                    (frame-values frame)) others)))))

(defn set-variable-value! [var val env]
  (defn env-loop [env]
    (defn scan [vars vals]
      (cond (empty? vars) nil
            (= var (car vars)) (cons vars (cons val (cdr vals)))
            :else (let [[nvars & nvals] (scan (cdr vars) (cdr vals))]
                    (cons (cons (car vars) nvars)
                          (cons (car vals) nvals)))))
    (if (= env the-empty-environment)
      (serror "Unbound variable -- SET!" var)
      (let [frame (first-frame env)
            others (enclosing-environment env)
            nframe (scan (frame-variables frame)
                         (frame-values frame))]
        (if nframe
          (cons nframe others)
          (cons frame (env-loop (enclosing-environment env)))))))
  (swap! env env-loop))



(defn primitive-procedure? [proc]
  (tagged-list? proc 'primitive))

(defn primitive-implementation [proc] (cadr proc))


(declare the-global-environment)
(defn print-env ; ugly hack to allow debugging from REPL
  ([] (print-env @the-global-environment))
  ([elem]
     (if-not (= elem the-global-environment)
       (if (seq? elem)
         (do (print "(")
             (doall (map print-env elem))
             (print ")"))
         (print (str elem " "))))))

(declare seval sapply)
(def primitive-procedures
  (list (list 'car car)
        (list 'cdr cdr)
        (list 'cons cons)
        (list 'null? empty?)
        (list '+ +)
        (list '* *)
        (list 'env print-env)
        (list 'eval #(seval % the-global-environment))
        (list 'apply #(sapply % the-global-environment))))



(defn primitive-procedure-names []
  (map car primitive-procedures))

(defn primitive-procedure-objects []
  (map (fn [proc] (list 'primitive (cadr proc)))
       primitive-procedures))

(def apply-in-underlying-scheme apply)
(defn apply-primitive-procedure [proc args]
  (apply-in-underlying-scheme
   (primitive-implementation proc) args))

(defn setup-environment []
  (let [initial-env (extend-environment (primitive-procedure-names)
                                        (primitive-procedure-objects)
                                        (atom the-empty-environment))]
    (define-variable! 'true true initial-env)
    (define-variable! 'false false initial-env)
    initial-env))
(def the-global-environment (setup-environment))


(def input-prompt ";;; M-Eval input:")
(def output-prompt ";;; M-Eval value:")

(defn prompt-for-input [string]
  (newline) (newline) (display string) (newline))
(defn announce-output [string]
  (newline) (display string) (newline))

(defn user-print [object]
  (if (compound-procedure? object)
    (display (list 'compound-procedure
                   (procedure-parameters object)
                   (procedure-body object)
                   '<procedure-env>))
    (display object)))

(defn read []
  (read-line)
  (list '+ 1000 (list '* 5 4) 4))

(defn driver-loop []
  (prompt-for-input input-prompt)
  (let [input (read)
        output (seval input the-global-environment)]
    (announce-output output-prompt)
    (user-print output)
    (if (not= 'quit input) (driver-loop))))



(declare sapply)
(defn seval [exp env]
  (println "eval: " exp)
  (cond (self-evaluating? exp) exp
        (variable? exp) (lookup-variable-value exp env)
        (quoted? exp) (text-of-quotation exp)
        (assignment? exp) (eval-assignment exp env)
        (definition? exp) (eval-definition exp env)
        (if? exp) (eval-if exp env)
        (lambda? exp) (make-procedure (lambda-parameters exp)
                                      (lambda-body exp)
                                      env)
        (begin? exp) (eval-sequence (begin-actions exp) env)
        (cond? exp) (seval (cond->if exp) env)
        (application? exp) (sapply (seval (operator exp) env)
                                   (list-of-values (operands exp) env))
        :else (serror "Unknown expression type -- EVAL" exp)))


(defn sapply [procedure arguments]
  (cond (primitive-procedure? procedure) (apply-primitive-procedure procedure arguments)
        (compound-procedure? procedure) (eval-sequence (procedure-body procedure)
                                                       (extend-environment
                                                        (procedure-parameters procedure)
                                                        arguments
                                                        (procedure-environment procedure)))
        :else (serror "Unknown procedure type -- APPLY" procedure)))


(defn -main [& args]
  (driver-loop))
