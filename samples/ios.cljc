(ns cljc.user
  (:require [cljc.objc :as objc]))

(§subclass MyAppDelegate
           (:subclasses NSObject)
           (:implements [UIApplicationDelegate])
           (:fields [label
                     nextCount])

           ^{:type Boolean} (§ self :application ^{:type (§ UIApplication)} app
                                    :didFinishLaunchingWithOptions ^{:type (§ NSDictionary)} opts)
           (let [window (§ (§ UIWindow) alloc)
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
             (c* "[objc_object_get (~{}) addTarget: objc_object_get (~{}) action: @selector (buttonTapped) forControlEvents: UIControlEventTouchUpInside]"
                 button self)

             (§ view :addSubview label)
             (§ view :addSubview button)

             (§ window :addSubview view)
             (§ window :makeKeyAndVisible)

             true)

           ^{:type void} (§ self :buttonTapped)
           (let [text (str nextCount)]
             (set! nextCount (inc nextCount))
             (§ label :setText text)
             self))
