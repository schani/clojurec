all : binder

binder : binder.c Makefile
	clang -O0 -g -Wall -o binder -L/usr/local/lib -lclang binder.c `pkg-config --cflags --libs glib-2.0`
