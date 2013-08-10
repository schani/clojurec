#!/bin/sh

make
./binder UIKit parse-sources/UIKit.m -arch i386 -miphoneos-version-min=6.0 -isysroot /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator6.1.sdk -framework UIKit
