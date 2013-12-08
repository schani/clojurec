#ifndef HAVE_IOS
#define kcalloc		cljc_calloc_uncollectable
#define kmalloc		GC_malloc_uncollectable
#define krealloc	GC_realloc
#define kfree		GC_free
#endif

#include "khash.h"
