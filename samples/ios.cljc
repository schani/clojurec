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
    (§ control :addTarget action-handler
               :action (§selector :handleAction)
               :forControlEvents events)
    nil))

(§subclass MyAppDelegate
           (:subclasses NSObject)
           (:implements [UIApplicationDelegate])
           (:fields [label
                     nextCount])

           ^{:type Boolean} (§ self :application ^{:type (§ UIApplication)} app
                                    :didFinishLaunchingWithOptions ^{:type (§ NSDictionary)} opts)
           (let [frame (§ (§ (§ UIScreen) :mainScreen) :bounds)
                 window (§ (§ (§ UIWindow) :alloc) :initWithFrame frame)
                 view-controller (§ (§ (§ UIViewController) :alloc) :init)
                 view (§ view-controller :view)
                 button (§ (§ UIButton) :buttonWithType UIKit/UIButtonTypeRoundedRect)]

             (set! nextCount 1)

             (set! label (§ (§ (§ UILabel) :alloc) :initWithFrame (UIKit/CGRectMake 10 10 300 300)))

             (§ label :setClipsToBounds true)
             (§ label :setText "Hello, ClojureC!")
             (§ label :setTextAlignment UIKit/NSTextAlignmentCenter)

             (§ button :setFrame (UIKit/CGRectMake 10 320 300 100))
             (§ button :setTitle "Count!" :forState UIKit/UIControlStateNormal)
             (add-action button UIKit/UIControlEventTouchUpInside
                         (fn []
                           (let [text (str nextCount)]
                             (set! nextCount (inc nextCount))
                             (§ label :setText text))))

             (§ view :addSubview label)
             (§ view :addSubview button)

             (§ window :addSubview view)
             (§ window :makeKeyAndVisible)

             true))
