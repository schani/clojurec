## Android Notes

 Note: these are very preliminary instructions.  They *will* change!

### NDK Version

 These instructions have *only* been tested with Android NDK r8b and
the latest SDK r20.  Please make sure you have both the SDK and the
NDK fully installed before starting.  Instructions are at:
http://developer.android.com


### Boehm GC:

 Android requires a custom build of the Boehm-Damers-Weiser garbage
collector library.  There's an included script that does most of
the work at building it as an armv7 static lib.  It does perform
some basic error checking.

    cd run/android
    wget http://www.hpl.hp.com/personal/Hans_Boehm/gc/gc_source/gc-7.2c.tar.gz
    tar -xvzf gc-7.2c.tar.gz
    ANDROID_NDK=<NDK INSTALL PATH> ./bootstrap.sh

where <NDK INSTALL PATH> is where you installed the NDK.  For example, my
NDK is installed under "/Users/aking/Android/android-ndk-r8b", so the
command I use is:

    ANDROID_NDK=/Users/aking/Android/android-ndk-r8b ./bootstrap.sh
    
The generated arm7 libgc static lib (and headers) are installed under
libgc.android in the same directory.


### Building:

 Building for Android is currently a two step process.  The first step requires
creating the cljc.c file through clojurec.core.  One way of doing this is by 
starting a repl, switching to the clojurec.core ns and
executing the 'for Android build' expression in the comment block at the end of
src/clj/clojurec/core.clj.  If all goes well, this will spit out newly
created cljc.c file.  I do this step with emacs and swank.

  Step 2 is just to run 'build.sh' in the run/android directory.  This will
run ndk-build, then 'ant debug' and finally, it'll attempt to install it
onto your Android device.  If all goes well, you should see the following
in your 'adb logcat':

    I/ActivityManager(  357): Start proc com.example.clojurec for activity com.example.clojurec/android.app.NativeActivity: pid=10688 uid=10073 gids={1028}
    I/dalvikvm(10688): Turning on JNI app bug workarounds for target SDK version 9...
    I/clojurec(10688): Starting up ClojureC base...
    I/fputs   (10688): Hi From Android ClojureC!
    I/fputs   (10688): 5.000000
    I/clojurec(10688): Done starting up ClojureC base.


### Misc.

The very first time you attempt to build, you *will* need to run:

    android update project -p ../android
    
So that the Android build system can setup the required paths.


