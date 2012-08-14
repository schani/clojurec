# ClojureC

This is compiler for the Clojure programming language that targets C as a backend.

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

Note that ClojureC is still in its experimental phase, so please don't expect a polish experience, yet.

### From the command line

ClojureC provides a very simple command line compiler interface.  Let's say you have the following in the file `/tmp/echo.cljc`:

    (ns cljc.user)
    (defn main [& args]
      (doseq [arg args]
        (pr arg "\n")))

Then if you do the following in the `clojurec` directory

    lein run /tmp/echo.cljc run/cljc.c cljc.user/main
    cd run
    make

you should have a `cljc` executable in the `run` directory that acts a little like `echo`.

### From the REPL

The easiest way to play around with ClojureC interactively is in the namespace `clojurec.core-test`.  For example:

    (core-run '(pr (+ 1 2)))
    => [3]

## Mobile Platform Notes

### Android
  See the README.md file in "clojurec/run/android".

### iOS 
  See the README.md file in "clojurec/run/ios".
