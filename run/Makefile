cljc : cljc.c Makefile
	gcc -Wall -Wno-unused-variable -Wno-unused-value -Wno-unused-function -Ithirdparty/klib -g -O0 -o cljc cljc.c `pkg-config --cflags bdw-gc` `pkg-config --libs bdw-gc` `pkg-config --cflags --libs glib-2.0`

clean :
	rm -f cljc
