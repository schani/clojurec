#include <assert.h>
#include <stdio.h>
#include <inttypes.h>
#include <stdbool.h>
#include <string.h>
#include <gc.h>
#include <stdlib.h>
#include <setjmp.h>
#include <math.h>
#include <pthread.h>

#ifdef HAVE_OBJC
#import <AppKit/AppKit.h>
#else
#include <glib.h>
#endif

#include "khash.h"

#include "cljc.h"
