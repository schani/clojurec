all : cljc

include Makefile.common

CC := gcc
c_sources := $(shell echo *.c)
sources := $(c_sources)
objs := runtime.o $(c_sources:.c=.o)

cljc : $(objs)
	$(CC) -o $@ $(objs) `pkg-config --libs bdw-gc glib-2.0` -lm
