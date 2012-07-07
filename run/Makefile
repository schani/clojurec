cljc : cljc.c Makefile
	gcc -Wall -g -O0 -o cljc cljc.c -Ilibgc/include -Llibgc/lib -lgc `pkg-config --cflags --libs glib-2.0`

clean :
	rm -f cljc
