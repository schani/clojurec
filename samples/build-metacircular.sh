#!/bin/sh

LEIN=lein

cd ..

echo Compiling cljc.core
"$LEIN" run -c src/cljc/cljc/core.cljc cljc.core run/c run
if [ $? -ne 0 ] ; then
    exit 1
fi

echo Compiling cljc.reader
"$LEIN" run -c src/cljc/cljc/reader.cljc cljc.reader run/c run
if [ $? -ne 0 ] ; then
    exit 1
fi

echo Compiling sample.metacircular
"$LEIN" run -c samples/metacircular.cljc sample.metacircular run/c run
if [ $? -ne 0 ] ; then
    exit 1
fi

echo Generating driver
"$LEIN" run -d sample.metacircular/-main run/c
if [ $? -ne 0 ] ; then
    exit 1
fi

cd run/c
make
