## iOS Notes

 Note: these are very preliminary instructions.  They *will* change!

### Boehm GC:

 iOS requires a custom build of the Boehm-Damers-Weiser garbage
collector library.  There's an included script that does most of
the work at building it as an armv7 static lib.  The script does
need more work (error checking!) - and it will be extended to build
iOS Simulator libs as well (packaged as fat libs).

Currently, libgc tries to pull in a current crt lib which isn't
supported under iOS.  To work around this, the following needs
to be done once (for now):

    cd /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneOS.platform/Developer/SDKs/iPhoneOS5.1.sdk/usr/lib
    ln -s crt1.3.1.o crt1.10.6.o

After the above is done, do the following:

    cd run/ios
    wget http://www.hpl.hp.com/personal/Hans_Boehm/gc/gc_source/gc-7.2c.tar.gz
    tar -xvzf gc-7.2c.tar.gz
    ./bootstrap.sh

Note: 'bootstrap.sh' assumes that your running the latest stable release
of Xcode and that it's installed under /Applications/Xcode.app.  If it's
not installed there, please update the 'XCODE_HOME' var in bootstrap.sh.

The generated arm7 libgc static lib (and headers) are installed under
libgc.ios in the same directory.


### Building:

 Building for iOS is currently a two step process.  The first step requires
creating the cljc.c and cljc.m files through clojurec.core.  One way of
doing this is by starting a repl, switching to the clojurec.core ns and
executing the 'for iOS build' expression in the comment block at the end of
src/clj/clojurec/core.clj.  If all goes well, this will spit out newly
created cljc.(m|c) files.  I do this step with emacs and swank.

  Step 2 is loading up the sample Xcode project under run/ios.  Select
an iOS Device target (note: simulator GC libraries aren't yet included)
and then press the 'Run' button to compile, link and run the 'app' on
your iOS device.  In the debug window, you should see displayed:

    Hi from iOS ClojureC!
    (+ 2.0 3) == 5.000000
    The END

