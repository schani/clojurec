#!/bin/sh

ndk-build

## was C compilation and linking successful?
if [ $? -ne 0 ]
then
    echo "BUILD FAILED!"
    exit -1
fi

ant debug

if [ $? -ne 0 ]
then
    echo "ant FAILED.  Not installing on device!"
    exit -1
fi

adb install -r bin/ClojureC-debug.apk

if [ $? -ne 0 ]
then
    echo "Installation onto device FAILED!"
else
    echo "Installation SUCCESSFULL!"
fi
