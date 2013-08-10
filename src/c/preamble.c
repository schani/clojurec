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
#import <objc/objc-runtime.h>
#ifdef HAVE_IOS
#import <UIKit/UIKit.h>
#else
#import <AppKit/AppKit.h>
#endif
#else
#include <glib.h>
#include <pcre.h>
#endif

#include "gc-khash.h"

#include "cljc.h"
