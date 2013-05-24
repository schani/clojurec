all : cljc

PACKAGES := bdw-gc glib-2.0

include Makefile.common

CC := gcc
c_sources := $(shell echo *.c)
sources := $(c_sources)
objs := runtime.o $(c_sources:.c=.o)

cljc : $(objs)
	$(CC) -o $@ $(objs) `pkg-config --libs $(PACKAGES)` -lm
