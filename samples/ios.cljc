(ns cljc.user
  (:require [cljc.objc :as objc]))

(§subclass ActionHandler
           (:subclasses NSObject)
           (:fields [handler])

           ^{:type :id} (§ self :initWithHandler h)
           (do
             (§super :init)
             (set! handler h)
             self)

           ^{:type :void} (§ self :handleAction)
           (do
             (handler)
             self))

(defn add-action [control events handler]
  (let [action-handler (§ (§ (§ ActionHandler) :alloc) :initWithHandler handler)]
    (c* "[objc_object_get (~{}) addTarget: objc_object_get (~{}) action: @selector (handleAction) forControlEvents: integer_get (~{})]"
        control action-handler events)
    nil))

(§subclass MyAppDelegate
           (:subclasses NSObject)
           (:implements [UIApplicationDelegate])
           (:fields [label
                     nextCount])

           ^{:type Boolean} (§ self :application ^{:type (§ UIApplication)} app
                                    :didFinishLaunchingWithOptions ^{:type (§ NSDictionary)} opts)
           (let [window (§ (§ UIWindow) :alloc)
                 window (c* "make_objc_object ([objc_object_get (~{}) initWithFrame: [[UIScreen mainScreen] bounds]])" window)
                 view-controller (§ (§ (§ UIViewController) :alloc) :init)
                 view (§ view-controller :view)
                 button (c* "make_objc_object ([UIButton buttonWithType: UIButtonTypeRoundedRect])")]

             (set! nextCount 1)

             (set! label (c* "make_objc_object ([[UILabel alloc] initWithFrame: CGRectMake(10, 10, 300, 300)])"))

             (§ label :setClipsToBounds true)
             (§ label :setText "Hello, ClojureC!")

             (c* "[objc_object_get (~{}) setFrame: CGRectMake (10, 320, 300, 100)]" button)
             (c* "[objc_object_get (~{}) setTitle: objc_object_get (~{}) forState: UIControlStateNormal]" button "Count!")
             (add-action button (c* "make_integer (UIControlEventTouchUpInside)")
                         (fn []
                           (let [text (str nextCount)]
                             (set! nextCount (inc nextCount))
                             (§ label :setText text))))

             (§ view :addSubview label)
             (§ view :addSubview button)

             (§ window :addSubview view)
             (§ window :makeKeyAndVisible)

             true))
