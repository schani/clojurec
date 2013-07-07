# -*- makefile -*-

all : cljc

DEFS := -DHAVE_OBJC=1
PACKAGES := bdw-gc

include ../Makefile.common

CC := clang
objc_sources := $(shell echo *.m)
sources := $(c_sources) $(objc_sources)
objs := runtime.o runtime-objc.o $(objc_sources:.m=.o)

cljc : $(objs) $(EXTRA_OBJS)
	$(CC) -o $@ $(objs) $(EXTRA_OBJS) `pkg-config --libs $(PACKAGES)` -lm -framework AppKit

runtime-objc.o : ../../src/c/runtime-objc.m
	$(CC) $(DEFS) -Wall -Wno-unused-variable -Wno-unused-value -Wno-unused-function -I../../src/c -I../thirdparty/klib -g -O0 `pkg-config --cflags $(PACKAGES)` -c $<

TestClass.o : ../../test/objc/TestClass.m
	$(CC) $(DEFS) -Wall -g -O0 -c $<

%.o : %.m
	$(CC) $(DEFS) -Wall -Wno-unused-variable -Wno-unused-value -Wno-unused-function -I../../src/c -I../thirdparty/klib -g -O0 `pkg-config --cflags $(PACKAGES)` -framework AppKit $(TEST_CFLAGS) -c $<
