# ClojureC

This is compiler for the Clojure programming language that targets C as a backend.  It is based on ClojureScript and was started off ClojureScript's commit `0e0aa7fdd379649bf87f8fff5c6a64e37fe616a4`.

## Community and Organization

We use a [Trello board](https://trello.com/board/clojurec/500e79c3b8ec5a3d7f1786d1) to keep track of ideas, proposals, TODOs, bugs and who's doing what.  If you plan to contribute, please do join the board.

Additional documentation for the project can be found at [the wiki](https://github.com/schani/clojurec/wiki).

## Preparations

### Submodules

ClojureC includes a submodule.  To fetch it, do

    git submodule init
    git submodule update

### Dependencies

Before you can run anything make sure you have [GLib 2](http://developer.gnome.org/glib/) and the [Boehm-Demers-Weiser garbage collector](http://www.hpl.hp.com/personal/Hans_Boehm/gc/) installed.  If

    pkg-config --cflags glib-2.0
    pkg-config --cflags bdw-gc

don't report errors you should be good.

Make sure you're using [Leiningen 2](https://github.com/technomancy/leiningen/) - older versions of Leiningen won't work.  Run the testsuite:

    lein test

All tests should pass.

## Using ClojureC

Note that ClojureC is still in its experimental phase, so please don't expect a polished experience, yet.

### From the command line

ClojureC provides a very simple command line compiler interface.  Let's say we want to compile `samples/echo.cljc`:

    (ns cljc.user)
    (defn -main [& args]
      (apply println args))

If you do the following in the `clojurec` directory

    lein run -c src/cljc/cljc/core.cljc cljc.core run/c run
    lein run -c samples/echo.cljc cljc.user run/c run
	lein run -d cljc.user/-main run/c
    cd run/c
    make

you should have a `cljc` executable in the `run` directory that acts mostly like `echo`.

### Objective-C bridge

ClojureC features a very rudimentary Objective-C bridge.  Here's an example:

    (ns cljc.user
      (:require [cljc.objc :as objc]))

    (extend-type (§ NSString)
      ICounted
      (-count [self]
        (§ self length)))

    (defn -main [& args]
      (let [app (§ (§ NSApplication) sharedApplication)
            date (§ (§ NSDate) :dateWithTimeIntervalSinceNow 3600)
            locale (§ (§ NSLocale) currentLocale)
            desc (§ date :descriptionWithLocale locale)]
        (println "Hello, NSApplication: `" desc "` has count " (count desc))))

If you have that code in `/tmp/nsdate.cljc`, then this will build and run it:

    lein run -c src/cljc/cljc/core.cljc cljc.core run run
    lein run -c src/cljc/cljc/objc.cljc cljc.objc run run -m
    lein run -c /tmp/nsdate.cljc cljc.user run run -m
	lein run -d cljc.user/-main run -m
	cd run
	make

For a more involved example, see `samples/ios.cljc`.

### iOS sample app

To build the iOS sample app, do

    cd samples
	./build-ios.sh

The last step will open an XCode project that will build and run the iOS app that `build-ios.sh` compiled from `samples/ios.cljc`.

### From the REPL

The easiest way to play around with ClojureC interactively is in the namespace `clojurec.core-test`.  For example:

    (core-run '(pr (+ 1 2)))
    => [3]

## Mobile Platform Notes

### Android
  See the README.md file in "clojurec/run/android".
