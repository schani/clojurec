#!/bin/sh

make
./binder parse-sources/Foundation.m -I /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator6.1.sdk/System/Library/Frameworks/Foundation.framework/Headers
