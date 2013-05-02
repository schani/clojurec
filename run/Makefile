sources := $(shell echo *.c)
objs := runtime.o $(sources:.c=.o)

cljc : $(objs)
	gcc -o $@ $(objs) `pkg-config --libs bdw-gc glib-2.0` -lm

runtime.o : ../src/c/runtime.c
	gcc -Wall -Wno-unused-variable -Wno-unused-value -Wno-unused-function -I../src/c -I../run/thirdparty/klib -g -O0 `pkg-config --cflags bdw-gc glib-2.0` -c $<

%.o : %.c
	gcc -Wall -Wno-unused-variable -Wno-unused-value -Wno-unused-function -I../src/c -I../run/thirdparty/klib -g -O0 `pkg-config --cflags bdw-gc glib-2.0` -c $<

clean :
	rm -f *.o $(filter-out driver.c,$(sources)) *-exports.clj cljc

clean-non-core :
	rm -f $(filter-out cljc_DOT_core.o runtime.o,$(objs)) $(filter-out cljc_DOT_core.c driver.c,$(sources)) cljc
