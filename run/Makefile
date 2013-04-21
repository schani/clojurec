cljc : cljc.c Makefile ../src/c/cljc.h ../src/c/runtime.c
	gcc -Wall -Wno-unused-variable -Wno-unused-value -Wno-unused-function -I../src/c -Ithirdparty/klib -g -O0 -o cljc cljc.c ../src/c/runtime.c `pkg-config --cflags bdw-gc` `pkg-config --libs bdw-gc` `pkg-config --cflags --libs glib-2.0` -lm

clean :
	rm -f cljc
