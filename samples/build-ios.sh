#!/bin/sh

LEIN=lein

cd ..
echo Compiling cljc.core
"$LEIN" run -c src/cljc/cljc/core.cljc cljc.core run run -m --framework UIKit
echo Compiling cljc.objc
"$LEIN" run -c src/cljc/cljc/objc.cljc cljc.objc run run -m --framework UIKit
echo Compiling cljc.user
"$LEIN" run -c samples/ios.cljc cljc.user run run -m --framework UIKit
echo Generating driver
"$LEIN" run -D cljc.user MyAppDelegate run
echo Opening XCode project
open run/ClojureCApp/ClojureCApp.xcodeproj
