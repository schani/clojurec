# ClojureC

This is compiler for the Clojure programming language that targets C as a backend.

## Community and Organization

We use a [Trello board](https://trello.com/board/clojurec/500e79c3b8ec5a3d7f1786d1) to keep track of ideas, proposals, TODOs, bugs and who's doing what.  If you plan to contribute, please do join the board.

Additional documentation for the project can be found at [the wiki](https://github.com/schani/clojurec/wiki).

## Preparations

Before you can run anything make sure you have [GLib 2](http://developer.gnome.org/glib/) and the [Boehm-Demers-Weiser garbage collector](http://www.hpl.hp.com/personal/Hans_Boehm/gc/) installed.  If

    pkg-config --cflags glib-2.0
    pkg-config --cflags bdw-gc

don't report errors you should be good.

Make sure you're using [Leiningen 2](https://github.com/technomancy/leiningen/) - older versions of Leiningen won't work.  Run the testsuite:

    lein test

All tests should pass.


## Mobile Platform Notes

### Android
  See the README.md file in "clojurec/run/android".

### iOS 
  See the README.md file in "clojurec/run/ios".
