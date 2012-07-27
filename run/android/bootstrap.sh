#!/bin/sh

## Make sure that the ndk environment var is set
if [ -z "$ANDROID_NDK" ] 
then
    echo "You must set ANDROID_NDK shell variable first to point at where your Android NDK is installed!"
    exit -1
fi

echo "Preparing Boehm GC for Android Device..."

if [ ! -d "gc-7.2" ]
then
    echo "You have not yet untarred/zipped libgc!"
    exit -1
fi

# Update the config* files to handle android
cp patches/config.* gc-7.2
cp patches/config.* gc-7.2/libatomic_ops

export SYS_ROOT="$ANDROID_NDK/platforms/android-14/arch-arm/"
export PATH="$ANDROID_NDK/toolchains/arm-linux-androideabi-4.6/prebuilt/darwin-x86/bin/:$PATH"

export CC="arm-linux-androideabi-gcc --sysroot=$SYS_ROOT"
export CXX="arm-linux-androideabi-g++ --sysroot=$SYS_ROOT"
export LD="arm-linux-androideabi-ld"
export AR="arm-linux-androideabi-ar"
export RANLIB="arm-linux-androideabi-ranlib"
export STRIP="arm-linux-androideabi-strip"

mkdir libgc.android
cd gc-7.2

export CFLAGS="-DIGNORE_DYNAMIC_LOADING -DPLATFORM_ANDROID" 
export LDFLAGS="-DIGNORE_DYNAMIC_LOADING -DPLATFORM_ANDROID" 

./configure --host=arm-linux-androideabi --enable-static --disable-shared --prefix=`pwd`/../libgc.android LIBS="-lc -lgcc"
make install



