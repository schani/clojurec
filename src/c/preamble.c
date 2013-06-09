#include <assert.h>
#include <stdio.h>
#include <inttypes.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>
#include <setjmp.h>
#include <math.h>
#include <pthread.h>

#ifdef HAVE_OBJC
#ifdef HAVE_IOS
#import <UIKit/UIKit.h>
#else
#import <AppKit/AppKit.h>
#endif
#else
#include <glib.h>
#endif

#include "khash.h"

#include "cljc.h"
