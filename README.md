# ClojureC

This is compiler for the Clojure programming language that targets C as a backend.

## Preparations

Before you can run anything make sure you have GLib 2 installed.  If

    pkg-config --cflags glib-2.0

doesn't report errors you should be good.

Next you'll have to download and compile the Boehm-Demers-Weiser garbage collector:

    cd run
    wget http://www.hpl.hp.com/personal/Hans_Boehm/gc/gc_source/gc-7.2c.tar.gz
    tar -zxvf gc-7.2c.tar.gz
    mkdir libgc
    cd gc-7.2
    ./configure --prefix=`pwd`/../libgc
    make install

Then you should be ready to go.  Make sure you're using [Leiningen 2](https://github.com/technomancy/leiningen/) - older versions of Leiningen won't work.  Run the testsuite:

    lein test

All tests should pass.
