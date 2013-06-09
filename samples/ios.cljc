(ns cljc.user
  (:require [cljc.objc :as objc]))

(§subclass MyAppDelegate
           (:subclasses NSObject)
           (:implements [UIApplicationDelegate])
           (:fields [window viewController])

           ^{:type Boolean} (§ self :application ^{:type (§ UIApplication)} app
                                    :didFinishLaunchingWithOptions ^{:type (§ NSDictionary)} opts)
           (let [win (§ (§ UIWindow) alloc)
                 win (c* "make_objc_object ([objc_object_get (~{}) initWithFrame: [[UIScreen mainScreen] bounds]])" win)
                 vc (§ (§ (§ UIViewController) :alloc) :init)
                 vc-view (§ vc :view)
                 view (c* "make_objc_object ([[UILabel alloc] initWithFrame: CGRectMake(10, 10, 300, 300)])")]
             (set! window win)
             (set! viewController vc)
             (§ view :setClipsToBounds true)
             (§ view :setText "Hello, ClojureC!")
             (§ vc-view :addSubview view)
             (§ window :addSubview vc-view)
             (§ window :makeKeyAndVisible)
             true))
