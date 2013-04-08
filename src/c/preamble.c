#include <assert.h>
#include <stdio.h>
#include <inttypes.h>
#include <stdbool.h>
#include <string.h>
#include <gc.h>
#include <glib.h>
#include <stdlib.h>
#include <setjmp.h>
#include <math.h>

#include "khash.h"

#define assert_not_reached()	(assert (0))

#ifndef MAIN_FUNCTION_NAME
#define MAIN_FUNCTION_NAME main
#endif

static uint32_t hashmurmur3_32(const void *data, size_t nbytes);

typedef struct ptable ptable_t;

typedef struct {
	ptable_t *ptable;
} value_t;

#define VALUE_NONE	((value_t*)-1)
#define VALUE_RECUR	((value_t*)-2)

typedef struct environment {
	struct environment *up;
	int num_bindings;
	value_t *bindings [0];
} environment_t;

typedef struct closure closure_t;

typedef value_t* (*function_t) (int nargs, closure_t *closure, value_t *arg1, value_t *arg2, value_t *arg3, value_t **argrest);

typedef struct {
	value_t val;
	value_t *fields [0];
} deftype_t;

#define DEFTYPE_GET_FIELD(dt,i)		(((deftype_t*)(dt))->fields [(i)])
#define DEFTYPE_SET_FIELD(dt,i,val)	(((deftype_t*)(dt))->fields [(i)] = (val))

struct closure {
	value_t val;
	function_t fn;
	environment_t *env;
};

typedef struct {
	value_t val;
	long x;
} integer_t;

typedef struct {
	value_t val;
	double x;
} floating_t;

typedef struct {
	value_t val;
	long len;
	value_t *elems [0];
} array_t;

typedef struct {
	value_t val;
	gunichar c;
} character_t;

typedef struct {
	value_t val;
	gchar *utf8;
} string_t;

typedef struct {
	value_t val;
	const gchar *utf8;
} symbol_t;

typedef struct {
	value_t val;
	const gchar *utf8;
} keyword_t;

typedef struct {
    value_t val;
    void *ptr;
} raw_pointer_t;

typedef struct {
	int num;		/* the protocol number, or -1 for termination */
	closure_t **vtable;
} ptable_entry_t;

static ptable_entry_t empty_ptable_entry = { -1, NULL };

// new_val == VALUE_NONE to get the current value
typedef value_t* (*field_access_fn_t) (value_t *val, int field, value_t *new_val);

struct ptable {
	int type;
	field_access_fn_t field_access_fn;
	value_t *constructor;
	ptable_entry_t *entries;
};

#define FN_NAME(n)	FN_ ## n
#define VAR_NAME(n)	VAR_ ## n
#define PROTOCOL_NAME(n)	PROTOCOL_ ## n
#define MEMBER_NAME(n)		MEMBER_ ## n
#define PTABLE_NAME(n)		PTABLE_ ## n
#define TYPE_NAME(n)		TYPE_ ## n
#define PROTOCOL_VTABLE_SIZE(n)	PROTOCOL_VTABLE_SIZE_ ## n
#define FIELD_NAME(n)		FIELD_ ## n
#define FIELD_ACCESS_FN_NAME(n)	FIELD_ACCESS_FN_ ## n

#define PROTOCOL_cljc_DOT_core_SLASH_IFn	1
#define FIRST_PROTOCOL				2

#define PROTOCOL_VTABLE_SIZE_cljc_DOT_core_SLASH_IFn	1

#define MEMBER__invoke	0

#define TYPE_Nil	1
#define TYPE_Closure	2
#define TYPE_Integer	3
#define TYPE_Float	4
#define TYPE_Boolean	5
#define TYPE_Array	6
#define TYPE_Character	7
#define TYPE_String	8
#define TYPE_Symbol	9
#define TYPE_Keyword	10
#define TYPE_RawPointer	11
#define FIRST_TYPE	12

#define FIRST_FIELD	1

static value_t *value_nil = NULL;

static closure_t*
get_protocol (value_t *val, int protocol_num, int fn_index)
{
	ptable_t *ptable = val->ptable;
	int i;
	for (i = 0; ptable->entries [i].num >= 0; ++i)
		if (ptable->entries [i].num == protocol_num)
			return ptable->entries [i].vtable [fn_index];
	assert_not_reached ();
	return (closure_t*)value_nil;
}

static bool
value_satisfies_protocol (value_t *val, int protocol_num)
{
	ptable_t *ptable = val->ptable;
	int i;
	for (i = 0; ptable->entries [i].num >= 0; ++i)
		if (ptable->entries [i].num == protocol_num)
			return true;
	return false;
}

#define FUNCALL0(c)			((c)->fn (0, (c), VALUE_NONE, VALUE_NONE, VALUE_NONE, NULL))
#define FUNCALL1(c,a1)			((c)->fn (1, (c), (a1), VALUE_NONE, VALUE_NONE, NULL))
#define FUNCALL2(c,a1,a2)		((c)->fn (2, (c), (a1), (a2), VALUE_NONE, NULL))
#define FUNCALL3(c,a1,a2,a3)		((c)->fn (3, (c), (a1), (a2), (a3), NULL))
#define FUNCALLn(c,n,a1,a2,a3,ar)	((c)->fn ((n), (c), (a1), (a2), (a3), (ar)))

static value_t*
protcall0 (value_t *target, int protocol_num, int fn_index)
{
	return FUNCALL1 (get_protocol (target, protocol_num, fn_index), target);
}

static value_t*
protcall1 (value_t *target, int protocol_num, int fn_index, value_t *a1)
{
	return FUNCALL2 (get_protocol (target, protocol_num, fn_index), target, a1);
}

static value_t*
protcall2 (value_t *target, int protocol_num, int fn_index, value_t *a1, value_t *a2)
{
	return FUNCALL3 (get_protocol (target, protocol_num, fn_index), target, a1, a2);
}

static value_t*
protcalln (value_t *target, int protocol_num, int fn_index, int nargs, value_t *a1, value_t *a2, value_t **ar)
{
	return FUNCALLn (get_protocol (target, protocol_num, fn_index), nargs + 1, target, a1, a2, ar);
}

static value_t*
invoke0 (value_t *f)
{
	return FUNCALL1 (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), f);
}

static value_t*
invoke1 (value_t *f, value_t *a1)
{
	return FUNCALL2 (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), f, a1);
}

static value_t*
invoke2 (value_t *f, value_t *a1, value_t *a2)
{
	return FUNCALL3 (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), f, a1, a2);
}

static value_t*
invoken (value_t *f, int nargs, value_t *a1, value_t *a2, value_t **ar)
{
	return FUNCALLn (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), nargs + 1, f, a1, a2, ar);
}

static ptable_t*
alloc_ptable (int type, value_t *constructor, field_access_fn_t field_access_fn)
{
	ptable_t *ptable = GC_malloc (sizeof (ptable_t));
	ptable->type = type;
	ptable->constructor = constructor;
	ptable->field_access_fn = field_access_fn;
	ptable->entries = &empty_ptable_entry;
	return ptable;
}

static closure_t**
alloc_vtable (int num_fns)
{
	return GC_malloc (sizeof (closure_t*) * num_fns);
}

static void
extend_ptable (ptable_t *ptable, int protocol_num, closure_t **vtable)
{
	int len = 0;
	ptable_entry_t *entry;
	for (entry = ptable->entries; entry->num >= 0; ++entry)
		++len;
	entry = GC_malloc (sizeof (ptable_entry_t) * (len + 2));
	memcpy (entry, ptable->entries, sizeof (ptable_entry_t) * len);
	entry [len].num = protocol_num;
	entry [len].vtable = vtable;
	entry [len + 1].num = -1;
	ptable->entries = entry;
}

static void
set_vtable_entry (closure_t **vtable, int index, closure_t *closure)
{
	vtable [index] = closure;
}

static value_t*
get_field (value_t *val, int field)
{
	field_access_fn_t fn = val->ptable->field_access_fn;
	assert (fn != NULL);
	return fn (val, field, VALUE_NONE);
}

static value_t*
set_field (value_t *val, int field, value_t *new_val)
{
	field_access_fn_t fn = val->ptable->field_access_fn;
	assert (fn != NULL);
	return fn (val, field, new_val);
}

static environment_t*
alloc_env (environment_t *up, int num_bindings)
{
	environment_t *env = GC_malloc (sizeof (environment_t) + num_bindings * sizeof (value_t*));
	env->up = up;
	env->num_bindings = num_bindings;
	return env;
}

static environment_t*
copy_env (environment_t *env)
{
	size_t size = sizeof (environment_t) + env->num_bindings * sizeof (value_t*);
	environment_t *new_env = GC_malloc (size);
	memcpy (new_env, env, size);
	return new_env;
}

static void
env_set (environment_t *env, int index, value_t *val)
{
	env->bindings [index] = val;
}

static environment_t*
env_up (environment_t *env, int num_ups)
{
	int i;
	for (i = 0; i < num_ups; ++i)
		env = env->up;
	return env;
}

static value_t*
env_fetch (environment_t *env, int num_ups, int index)
{
	env = env_up (env, num_ups);
	assert (index < env->num_bindings);
	return env->bindings [index];
}

static value_t* VAR_NAME (cljc_DOT_core_SLASH_Cons);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_first);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_next);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_count);

#define ARG_NIL		VAR_NAME (cljc_DOT_core_DOT_List_SLASH_EMPTY)
#define ARG_CONS(a,d)	FUNCALLn ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_Cons), 4, value_nil, (a), (d), (value_t*[]) { value_nil })
#define SEQ_FIRST(c)	FUNCALL1 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_first), (c))
#define SEQ_NEXT(c)	FUNCALL1 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_next), (c))
#define SEQ_COUNT(c)	integer_get (FUNCALL1 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_count), (c)))

static value_t*
Closure_IFn_invoke (int nargs, closure_t *closure, value_t *arg1, value_t *arg2, value_t *arg3, value_t **argrest)
{
	closure_t *c = (closure_t*)arg1;

	assert (nargs >= 1);
	assert (arg1->ptable->type == TYPE_Closure);

	if (argrest == NULL)
		return c->fn (nargs - 1, c, arg2, arg3, VALUE_NONE, NULL);
	else
		return c->fn (nargs - 1, c, arg2, arg3, argrest [0], argrest + 1);
}

static ptable_t*
closure_ptable (void)
{
	/* FIXME: with multiple threads we might end up with more than
	   one closure ptables. */
	static ptable_t *closure_ptable = NULL;

	if (closure_ptable == NULL) {
		closure_t *invoke = GC_malloc (sizeof (closure_t));
		invoke->val.ptable = NULL;
		invoke->fn = Closure_IFn_invoke;
		invoke->env = NULL;

		closure_t **vtable = alloc_vtable (PROTOCOL_VTABLE_SIZE (cljc_DOT_core_SLASH_IFn));
		set_vtable_entry (vtable, MEMBER__invoke, invoke);

		/* FIXME: we need a constructor */
		ptable_t *ptable = alloc_ptable (TYPE_Closure, VALUE_NONE, NULL);
		extend_ptable (ptable, PROTOCOL_cljc_DOT_core_SLASH_IFn, vtable);

		closure_ptable = ptable;
	}

	return closure_ptable;
}

static value_t*
alloc_value (ptable_t *ptable, size_t size)
{
	value_t *v = GC_malloc (size);
	v->ptable = ptable;
	return v;
}

static value_t*
alloc_value_retired (ptable_t *ptable, size_t size)
{
	value_t *v = calloc (1, size);
	v->ptable = ptable;
	return v;
}

static value_t*
make_closure (function_t fn, environment_t *env)
{
	closure_t *closure = (closure_t*) alloc_value (closure_ptable (), sizeof (closure_t));
	closure->fn = fn;
	closure->env = env;
	return &closure->val;
}

static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Nil) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Integer) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Float) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Boolean) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Array) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Character) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_String) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Symbol) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Keyword) = NULL;
static ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer) = NULL;

static value_t*
make_integer (long x)
{
	integer_t *integer = (integer_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Integer), sizeof (integer_t));
	integer->x = x;
	return &integer->val;
}

static long
integer_get (value_t *v)
{
	integer_t *i = (integer_t*)v;
	assert (v->ptable->type == TYPE_Integer);
	return i->x;
}

static value_t*
make_float (double x)
{
	floating_t *f = (floating_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Float), sizeof (floating_t));
	f->x = x;
	return &f->val;
}

static double
float_get (value_t *v)
{
	floating_t *f = (floating_t*)v;
	assert (v->ptable->type == TYPE_Float);
	return f->x;
}

static value_t*
make_array_from (long len, value_t **src)
{
	array_t *array = (array_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Array),  sizeof (array_t) + len * sizeof (value_t*));
	long i;
	array->len = len;
	if (src) {
		memcpy (array->elems, src, sizeof (value_t*) * len);
	} else {
		for (i = 0; i < len; ++i)
			array->elems [i] = value_nil;
	}
	return &array->val;
}

static value_t*
make_array (long len)
{
	return make_array_from (len, NULL);
}

static long
array_length (value_t *v)
{
	array_t *a = (array_t*)v;
	assert (v->ptable->type == TYPE_Array);
	return a->len;
}

static value_t*
array_get (value_t *v, long index)
{
	array_t *a = (array_t*)v;
	assert (v->ptable->type == TYPE_Array);
	assert (index >= 0 && index < a->len);
	return a->elems [index];
}

static void
array_set (value_t *v, long index, value_t *x)
{
	array_t *a = (array_t*)v;
	assert (v->ptable->type == TYPE_Array);
	assert (index >= 0 && index < a->len);
	a->elems [index] = x;
}

static value_t*
array_copy (value_t *src, long src_pos, value_t *dst, long dst_pos, long len)
{
	array_t *s = (array_t*)src, *d = (array_t*)dst;

	assert (src->ptable->type == TYPE_Array);
	assert (dst->ptable->type == TYPE_Array);
	assert (len >= 0);
	assert (src_pos >= 0 && src_pos <= s->len && src_pos + len <= s->len);
	assert (dst_pos >= 0 && dst_pos <= d->len && dst_pos + len <= d->len);

	memmove(d->elems + dst_pos, s->elems + src_pos, len * sizeof(d->elems[0]));
	return dst;
}

static value_t *sort_comparator;

static int
sort_compare (const void *p1, const void *p2)
{
	value_t *v1 = *(value_t**)p1;
	value_t *v2 = *(value_t**)p2;
	return integer_get (invoke2 (sort_comparator, v1, v2));
}

static void
array_sort_stable (value_t *arr, value_t *comp)
{
	array_t *a = (array_t*)arr;

	assert (arr->ptable->type == TYPE_Array);

	/* FIXME: this is not thread safe! */
	sort_comparator = comp;
	mergesort (a->elems, a->len, sizeof (value_t*), sort_compare);
	sort_comparator = NULL;
}

static value_t*
make_character (gunichar c)
{
	character_t *ch = (character_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Character), sizeof (character_t));
	ch->c = c;
	return &ch->val;
}

static gunichar
character_get (value_t *v)
{
	character_t *c = (character_t*)v;
	assert (v->ptable->type == TYPE_Character);
	return c->c;
}

static value_t*
make_string (gchar *utf8)
{
	string_t *s = (string_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_String), sizeof (string_t));
	s->utf8 = utf8;
	return &s->val;
}

static value_t*
make_string_from_unichar (gunichar c)
{
	gchar *buf = GC_malloc (7);
	string_t *s = (string_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_String), sizeof (string_t));
	buf [g_unichar_to_utf8 (c, buf)] = '\0';
	s->utf8 = buf;
	return &s->val;
}

static value_t*
make_string_with_size (long bytes)
{
	gchar *buf = GC_malloc (bytes + 1);
	buf [0] = '\0';
	return make_string (buf);
}

static value_t*
make_string_from_buf (const gchar *start, const gchar *end)
{
	assert (start <= end);

	size_t len = end - start;
	gchar *copy = GC_malloc (len + 1);
	string_t *s = (string_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_String), sizeof (string_t));
	memcpy (copy, start, len);
	copy [len] = '\0';
	s->utf8 = copy;
	return &s->val;
}

static value_t*
make_string_copy_free (gchar *utf8)
{
	size_t len = strlen (utf8);
	value_t *s = make_string_from_buf (utf8, utf8 + len);
	free (utf8);
	return s;
}

static gchar*
string_get_utf8 (value_t *v)
{
	string_t *s = (string_t*)v;
	assert (v->ptable->type == TYPE_String);
	return s->utf8;
}

static uint32_t
string_hash_code (const gchar *utf8)
{
        size_t len;
        len = strlen (utf8);
        return hashmurmur3_32(utf8, len);
}

static symbol_t*
make_symbol (const gchar *utf8)
{
	symbol_t *sym = (symbol_t*)alloc_value_retired (PTABLE_NAME (cljc_DOT_core_SLASH_Symbol), sizeof (symbol_t));
	sym->utf8 = utf8;
	return sym;
}

KHASH_MAP_INIT_STR (SYMBOLS, symbol_t*);
static khash_t(SYMBOLS) *symbol_hash = NULL;

static value_t*
intern_symbol (const gchar *utf8, bool copy)
{
	khiter_t iter;
	int ret;

	if (symbol_hash == NULL) {
		symbol_hash = kh_init (SYMBOLS);
		assert (symbol_hash != NULL);
	}

	iter = kh_put (SYMBOLS, symbol_hash, utf8, &ret);
	if (ret != 0) {
		symbol_t *sym = make_symbol (copy ? strdup (utf8) : utf8);
		kh_value (symbol_hash, iter) = sym;
	} else {
		assert (strcmp (kh_value (symbol_hash, iter)->utf8, utf8) == 0);
	}
	return &kh_value (symbol_hash, iter)->val;
}

static const gchar*
symbol_get_utf8 (value_t *v)
{
	symbol_t *s = (symbol_t*)v;
	assert (v->ptable->type == TYPE_Symbol);
	return s->utf8;
}

static keyword_t*
make_keyword (const gchar *utf8)
{
	keyword_t *kw = (keyword_t*)alloc_value_retired (PTABLE_NAME (cljc_DOT_core_SLASH_Keyword), sizeof (keyword_t));
	kw->utf8 = utf8;
	return kw;
}

KHASH_MAP_INIT_STR (KEYWORDS, keyword_t*);
static khash_t(KEYWORDS) *keyword_hash = NULL;

static value_t*
intern_keyword (const gchar *utf8, bool copy)
{
	khiter_t iter;
	int ret;

	if (keyword_hash == NULL) {
		keyword_hash = kh_init (KEYWORDS);
		assert (keyword_hash != NULL);
	}

	iter = kh_put (KEYWORDS, keyword_hash, utf8, &ret);
	if (ret != 0) {
		keyword_t *kw = make_keyword (copy ? strdup (utf8) : utf8);
		kh_value (keyword_hash, iter) = kw;
	} else {
		assert (strcmp (kh_value (keyword_hash, iter)->utf8, utf8) == 0);
	}
	return &kh_value (keyword_hash, iter)->val;
}

static const gchar*
keyword_get_utf8 (value_t *v)
{
	keyword_t *k = (keyword_t*)v;
	assert (v->ptable->type == TYPE_Keyword);
	return k->utf8;
}

static value_t*
make_raw_pointer (void *ptr)
{
	raw_pointer_t *p = (raw_pointer_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer), sizeof (raw_pointer_t));
	p->ptr = ptr;
	return &p->val;
}

static void*
raw_pointer_get (value_t *v)
{
	raw_pointer_t *p = (raw_pointer_t*)v;
	assert (v->ptable->type == TYPE_RawPointer);
	return p->ptr;
}

#define RAW_POINTER_GET(v,type)	((type)raw_pointer_get ((v)))

static value_t *value_true = NULL;
static value_t *value_false = NULL;

static value_t*
make_boolean (bool x)
{
	if (x)
		return value_true;
	return value_false;
}

static long
identity_hash_code (value_t *v)
{
	/* FIXME: this won't work with a moving GC */
	return (long)v;
}

static value_t*
cljc_core_print (int nargs, closure_t *closure, value_t *arg1, value_t *arg2, value_t *arg3, value_t **argrest)
{
	assert (nargs == 1);

	switch (arg1->ptable->type) {
		case TYPE_Nil:
			printf ("nil");
			break;
		case TYPE_Closure: {
			closure_t *c = (closure_t*)arg1;
			printf ("#<closure@%p:%p>", c->fn, c->env);
			break;
		}
		case TYPE_Integer: {
			integer_t *i = (integer_t*)arg1;
			printf ("%ld", i->x);
			break;
		}
		case TYPE_Float: {
			floating_t *f = (floating_t*)arg1;
			printf ("%f", f->x);
			break;
		}
		case TYPE_Boolean:
			if (arg1 == value_true) {
				printf ("true");
			} else {
				assert (arg1 == value_false);
				printf ("false");
			}
			break;
		case TYPE_Array: {
			array_t *a = (array_t*)arg1;
			long i;
			printf ("[");
			for (i = 0; i < a->len; ++i) {
				cljc_core_print (1, NULL, a->elems [i], VALUE_NONE, VALUE_NONE, NULL);
				if (i < a->len - 1)
					printf (" ");
			}
			printf ("]");
			break;
		}
		case TYPE_String:
			printf ("%s", string_get_utf8 (arg1));
			break;
		default:
			assert_not_reached ();
	}
	printf ("\n");
	return value_nil;
}

static value_t *VAR_NAME (cljc_DOT_core_SLASH_print) = VALUE_NONE;

static bool
truth (value_t *v)
{
	if (v == value_nil)
		return false;
	if (v == value_false)
		return false;
	return true;
}


/**
 *  MurmurHash3 was created by Austin Appleby  in 2008. The cannonical
 *  implementations are in C++ and placed in the public.
 *
 *    https://sites.google.com/site/murmurhash/
 *
 */
static uint32_t 
hashmurmur3_32(const void *data, size_t nbytes)
{
        if (data == NULL || nbytes == 0) return 0;
        const uint32_t c1 = 0xcc9e2d51;
        const uint32_t c2 = 0x1b873593;

        const int nblocks = nbytes / 4;
        const uint32_t *blocks = (const uint32_t *)(data);
        const uint8_t *tail = (const uint8_t *)(data + (nblocks * 4));

        uint32_t h = 0;

        int i;
        uint32_t k;
        for (i = 0; i < nblocks; i++) {
                k = blocks[i];

                k *= c1;
                k = (k << 15) | (k >> (32 - 15));
                k *= c2;

                h ^= k;
                h = (h << 13) | (h >> (32 - 13));
                h = (h * 5) + 0xe6546b64;
        }

        k = 0;
        switch (nbytes & 3) {
                case 3:
                        k ^= tail[2] << 16;
                case 2:
                        k ^= tail[1] << 8;
                case 1:
                        k ^= tail[0];
                        k *= c1;
                        k = (k << 13) | (k >> (32 - 15));
                        k *= c2;
                        h ^= k;
        };

        h ^= nbytes;

        h ^= h >> 16;
        h *= 0x85ebca6b;
        h ^= h >> 13;
        h *= 0xc2b2ae35;
        h ^= h >> 16;
        return h;
}

static value_t*
cljc_core_apply (int nargs, closure_t *closure, value_t *f, value_t *arg1, value_t *arg2, value_t **argrest)
{
	int ndirect, nrest, nrest_seq;
	value_t *rest_seq;
	value_t **args;
	int i, j;

	assert (nargs > 1);

	switch (nargs) {
		case 2:
			ndirect = 0;
			nrest = 0;
			rest_seq = arg1;
			break;
		case 3:
			ndirect = 1;
			nrest = 0;
			rest_seq = arg2;
			break;
		default:
			ndirect = 2;
			nrest = nargs - 4;
			rest_seq = argrest [nrest];
			break;
	}

	nrest_seq = SEQ_COUNT (rest_seq);

	nargs = ndirect + nrest + nrest_seq;
	args = alloca (sizeof (value_t*) * (nargs > 2 ? nargs : 2));
	args [0] = args [1] = VALUE_NONE;
	i = 0;
	switch (ndirect) {
		case 2: args [1] = arg2; ++i;
		case 1: args [0] = arg1; ++i;
	}
	for (j = 0; j < nrest; ++j)
		args [i++] = argrest [j];
	for (j = 0; j < nrest_seq; ++j) {
		args [i++] = SEQ_FIRST (rest_seq);
		rest_seq = SEQ_NEXT (rest_seq);
	}
	assert (i == nargs);

	return invoken (f, nargs, args [0], args [1], args + 2);
}

static value_t *VAR_NAME (cljc_DOT_core_SLASH_apply) = VALUE_NONE;

static value_t *current_exception = VALUE_NONE;
static jmp_buf *topmost_jmp_buf = NULL;

static value_t*
throw_exception (value_t *exception)
{
	assert (current_exception == VALUE_NONE);
	current_exception = exception;
	_longjmp (*topmost_jmp_buf, 1);
	assert_not_reached ();
	return value_nil;
}

static value_t*
get_exception (void)
{
	value_t *exception = current_exception;
	assert (exception != VALUE_NONE);
	current_exception = VALUE_NONE;
	return exception;
}

static void
rethrow_exception (void)
{
	throw_exception (get_exception ());
}

static value_t*
assert_not_recur (value_t *val)
{
	assert (val != VALUE_RECUR);
	return val;
}

static gchar*
slurp_file (const char *filename)
{
	gchar *contents;
	if (!g_file_get_contents (filename, &contents, NULL, NULL))
		assert_not_reached ();
	return contents;
}

static long
strchr_offset (const gchar *str, gunichar c)
{
	gchar *p = g_utf8_strchr (str, -1, c);
	if (p == NULL)
		return -1;
	return p - str;
}

static value_t* VAR_NAME (cljc_DOT_core_SLASH_Nil);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Integer);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Float);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Boolean);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Array);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Character);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_String);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Symbol);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_Keyword);
static value_t* VAR_NAME (cljc_DOT_core_SLASH_RawPointer);

static void
cljc_init (void)
{
	GC_INIT ();

	VAR_NAME (cljc_DOT_core_SLASH_Nil) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Nil) = alloc_ptable (TYPE_Nil, VAR_NAME (cljc_DOT_core_SLASH_Nil), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Integer) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Integer) = alloc_ptable (TYPE_Integer, VAR_NAME (cljc_DOT_core_SLASH_Integer), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Float) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Float) = alloc_ptable (TYPE_Float, VAR_NAME (cljc_DOT_core_SLASH_Float), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Boolean) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Boolean) = alloc_ptable (TYPE_Boolean, VAR_NAME (cljc_DOT_core_SLASH_Boolean), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Array) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Array) = alloc_ptable (TYPE_Array, VAR_NAME (cljc_DOT_core_SLASH_Array), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Character) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Character) = alloc_ptable (TYPE_Character, VAR_NAME (cljc_DOT_core_SLASH_Character), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_String) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_String) = alloc_ptable (TYPE_String, VAR_NAME (cljc_DOT_core_SLASH_String), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Symbol) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Symbol) = alloc_ptable (TYPE_Symbol, VAR_NAME (cljc_DOT_core_SLASH_Symbol), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Keyword) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Keyword) = alloc_ptable (TYPE_Keyword, VAR_NAME (cljc_DOT_core_SLASH_Keyword), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_RawPointer) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer) = alloc_ptable (TYPE_RawPointer, VAR_NAME (cljc_DOT_core_SLASH_RawPointer), NULL);

	value_nil = alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Nil), sizeof (value_t));

	value_true = alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Boolean), sizeof (value_t));
	value_false = alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Boolean), sizeof (value_t));

	VAR_NAME (cljc_DOT_core_SLASH_print) = make_closure (cljc_core_print, NULL);
	VAR_NAME (cljc_DOT_core_SLASH_apply) = make_closure (cljc_core_apply, NULL);
}

#define BEGIN_MAIN_CODE						\
	jmp_buf main_jmp_buf;					\
	int main_setjmp_result;					\
	topmost_jmp_buf = &main_jmp_buf;			\
	if ((main_setjmp_result = _setjmp (main_jmp_buf))) {	\
	fprintf (stderr, "Error: Uncaught exception.\n");	\
	return 1;						\
	}
#define END_MAIN_CODE				\
	topmost_jmp_buf = NULL
