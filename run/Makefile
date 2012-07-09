cljc : cljc.c Makefile
	gcc -Wall -g -O0 -o cljc cljc.c `pkg-config --cflags bdw-gc` `pkg-config --libs bdw-gc` `pkg-config --cflags --libs glib-2.0`

clean :
	rm -f cljc
