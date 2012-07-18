#!/bin/sh

echo "Preparing Boehm GC for iOS Device..."

# TODO: check if XCODE_HOME is already set - and it it's valid!
XCODE_HOME=/Applications/Xcode.app

DEVROOT=$XCODE_HOME/Contents/Developer/Platforms/iPhoneOS.platform/Developer
SDK_LIB=$DEVROOT/SDKs/iPhoneOS5.1.sdk
export PATH="$DEVROOT/usr/bin:$PATH"
export CC="$DEVROOT/usr/bin/clang -arch armv7 -isysroot $DEVROOT/SDKs/iPhoneOS5.1.sdk"
export CXX="$DEVROOT/usr/bin/clang++ -arch armv7 -isysroot $DEVROOT/SDKs/iPhoneOS5.1.sdk"

mkdir libgc.ios
cd gc-7.2

CFLAGS="-arch armv7" 
LDFLAGS="-arch armv7" 
./configure --host=arm-apple-darwin10 --enable-static --disable-shared --prefix=`pwd`/../libgc.ios
make install

# TODO: Build Simulator Library next and combine into a fat lib

echo "Preparing Boehm GC for iOS Simulator (TODO)..."
