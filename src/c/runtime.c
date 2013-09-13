#include <assert.h>
#include <stdio.h>
#include <inttypes.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>
#include <setjmp.h>
#include <math.h>
#include <pthread.h>
#ifndef HAVE_OBJC
#include <glib.h>
#include <pcre.h>
#endif

#include "gc-khash.h"

#include "cljc.h"

void*
cljc_calloc_uncollectable (size_t count, size_t size)
{
	size_t total = count * size;
	void *p = GC_malloc_uncollectable (total);
	memset (p, 0, total);
	return p;
}

value_t *value_nil = NULL;
value_t *value_true = VALUE_NONE;
value_t *value_false = VALUE_NONE;

static int next_protocol = FIRST_PROTOCOL;

int
register_protocol (void)
{
	return next_protocol++;
}

static int next_type = FIRST_TYPE;

int
register_type (void)
{
	return next_type++;
}

KHASH_MAP_INIT_STR (FIELDS, int);
static khash_t(FIELDS) *field_hash = NULL;
static int next_field = FIRST_FIELD;

int
register_field (const char *name)
{
	khiter_t iter;
	int ret;

	if (field_hash == NULL) {
		field_hash = kh_init (FIELDS);
		assert (field_hash != NULL);
	}

	iter = kh_put (FIELDS, field_hash, name, &ret);
	if (ret != 0)
		kh_value (field_hash, iter) = next_field++;
	return kh_value (field_hash, iter);
}

closure_t**
ptable_get_vtable (ptable_t *ptable, int protocol_num)
{
	int i;
	for (i = 0; ptable->entries [i].num >= 0; ++i)
		if (ptable->entries [i].num == protocol_num)
			return ptable->entries [i].vtable;
	return NULL;
}

closure_t*
get_protocol (value_t *val, int protocol_num, int fn_index)
{
	closure_t **vtable = ptable_get_vtable (val->ptable, protocol_num);
	assert (vtable != NULL);
	return vtable [fn_index];
}

bool
value_satisfies_protocol (value_t *val, int protocol_num)
{
	return ptable_get_vtable (val->ptable, protocol_num) != NULL;
}

value_t*
protcall0 (value_t *target, int protocol_num, int fn_index)
{
	return FUNCALL1 (get_protocol (target, protocol_num, fn_index), target);
}

value_t*
protcall1 (value_t *target, int protocol_num, int fn_index, value_t *a1)
{
	return FUNCALL2 (get_protocol (target, protocol_num, fn_index), target, a1);
}

value_t*
protcall2 (value_t *target, int protocol_num, int fn_index, value_t *a1, value_t *a2)
{
	return FUNCALL3 (get_protocol (target, protocol_num, fn_index), target, a1, a2);
}

value_t*
protcalln (value_t *target, int protocol_num, int fn_index, int nargs, value_t *a1, value_t *a2, value_t **ar)
{
	return FUNCALLn (get_protocol (target, protocol_num, fn_index), nargs + 1, target, a1, a2, ar);
}

value_t*
invoke0 (value_t *f)
{
	return FUNCALL1 (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), f);
}

value_t*
invoke1 (value_t *f, value_t *a1)
{
	return FUNCALL2 (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), f, a1);
}

value_t*
invoke2 (value_t *f, value_t *a1, value_t *a2)
{
	return FUNCALL3 (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), f, a1, a2);
}

value_t*
invoken (value_t *f, int nargs, value_t *a1, value_t *a2, value_t **ar)
{
	return FUNCALLn (get_protocol (f, PROTOCOL_cljc_DOT_core_SLASH_IFn, MEMBER__invoke), nargs + 1, f, a1, a2, ar);
}

ptable_t*
alloc_ptable (int type, value_t *constructor, field_access_fn_t field_access_fn)
{
	ptable_t *ptable = GC_malloc (sizeof (ptable_t));
	ptable->type = type;
	ptable->constructor = constructor;
	ptable->field_access_fn = field_access_fn;
	ptable->entries = &empty_ptable_entry;
	return ptable;
}

closure_t**
alloc_vtable (int num_fns)
{
	return GC_malloc (sizeof (closure_t*) * num_fns);
}

void
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

void
set_vtable_entry (closure_t **vtable, int index, closure_t *closure)
{
	vtable [index] = closure;
}

value_t*
get_field (value_t *val, int field)
{
	field_access_fn_t fn = val->ptable->field_access_fn;
	assert (fn != NULL);
	return fn (val, field, VALUE_NONE);
}

value_t*
set_field (value_t *val, int field, value_t *new_val)
{
	field_access_fn_t fn = val->ptable->field_access_fn;
	assert (fn != NULL);
	return fn (val, field, new_val);
}

environment_t*
alloc_env (environment_t *up, int num_bindings)
{
	environment_t *env = GC_malloc (sizeof (environment_t) + num_bindings * sizeof (value_t*));
	env->up = up;
	env->num_bindings = num_bindings;
	return env;
}

environment_t*
copy_env (environment_t *env)
{
	size_t size = sizeof (environment_t) + env->num_bindings * sizeof (value_t*);
	environment_t *new_env = GC_malloc (size);
	memcpy (new_env, env, size);
	return new_env;
}

void
env_set (environment_t *env, int index, value_t *val)
{
	env->bindings [index] = val;
}

environment_t*
env_up (environment_t *env, int num_ups)
{
	int i;
	for (i = 0; i < num_ups; ++i)
		env = env->up;
	return env;
}

value_t*
env_fetch (environment_t *env, int num_ups, int index)
{
	env = env_up (env, num_ups);
	assert (index < env->num_bindings);
	return env->bindings [index];
}

value_t* VAR_NAME (cljc_DOT_core_SLASH_Cons);
value_t* VAR_NAME (cljc_DOT_core_SLASH_first);
value_t* VAR_NAME (cljc_DOT_core_SLASH_next);
value_t* VAR_NAME (cljc_DOT_core_SLASH_count);

#define SEQ_FIRST(c)	FUNCALL1 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_first), (c))
#define SEQ_NEXT(c)	FUNCALL1 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_next), (c))
#define SEQ_COUNT(c)	integer_get (FUNCALL1 ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_count), (c)))

value_t*
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

value_t*
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

value_t*
make_closure (function_t fn, environment_t *env)
{
	closure_t *closure = (closure_t*) alloc_value (closure_ptable (), sizeof (closure_t));
	closure->fn = fn;
	closure->env = env;
	return &closure->val;
}

ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Nil) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Closure) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Integer) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Float) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Boolean) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Array) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Character) = NULL;
#ifndef HAVE_OBJC
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_String) = NULL;
#endif
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Symbol) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Keyword) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer) = NULL;
ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Compound) = NULL;

value_t*
make_integer (long long x)
{
	cljc_integer_t *integer = (cljc_integer_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Integer), sizeof (cljc_integer_t));
	integer->x = x;
	return &integer->val;
}

long long
integer_get (value_t *v)
{
	cljc_integer_t *i = (cljc_integer_t*)v;
	assert (v->ptable->type == TYPE_Integer);
	return i->x;
}

value_t*
make_float (double x)
{
	floating_t *f = (floating_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Float), sizeof (floating_t));
	f->x = x;
	return &f->val;
}

double
float_get (value_t *v)
{
	floating_t *f = (floating_t*)v;
	assert (v->ptable->type == TYPE_Float);
	return f->x;
}

double
number_get (value_t *v)
{
	if (v->ptable->type == TYPE_Integer)
		return integer_get (v);
	return float_get (v);
}

long long
number_get_as_integer (value_t *v)
{
	if (v->ptable->type == TYPE_Integer)
		return integer_get (v);
	return (long long) float_get (v);
}

value_t*
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

value_t*
make_array (long len)
{
	return make_array_from (len, NULL);
}

long
array_length (value_t *v)
{
	array_t *a = (array_t*)v;
	assert (v->ptable->type == TYPE_Array);
	return a->len;
}

value_t*
array_get (value_t *v, long index)
{
	array_t *a = (array_t*)v;
	assert (v->ptable->type == TYPE_Array);
	assert (index >= 0 && index < a->len);
	return a->elems [index];
}

void
array_set (value_t *v, long index, value_t *x)
{
	array_t *a = (array_t*)v;
	assert (v->ptable->type == TYPE_Array);
	assert (index >= 0 && index < a->len);
	a->elems [index] = x;
}

value_t*
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

value_t*
make_character (cljc_unichar_t c)
{
	character_t *ch = (character_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Character), sizeof (character_t));
	ch->c = c;
	return &ch->val;
}

cljc_unichar_t
character_get (value_t *v)
{
	character_t *c = (character_t*)v;
	assert (v->ptable->type == TYPE_Character);
	return c->c;
}

#ifndef HAVE_OBJC
value_t*
make_string (char *utf8)
{
	string_t *s = (string_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_String), sizeof (string_t));
	s->utf8 = utf8;
	return &s->val;
}

value_t*
make_string_from_unichar (cljc_unichar_t c)
{
	char *buf = GC_malloc (7);
	string_t *s = (string_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_String), sizeof (string_t));
	buf [g_unichar_to_utf8 (c, buf)] = '\0';
	s->utf8 = buf;
	return &s->val;
}

value_t*
make_string_with_size (long bytes)
{
	char *buf = GC_malloc (bytes + 1);
	buf [0] = '\0';
	return make_string (buf);
}

value_t*
make_string_from_buf (const char *start, const char *end)
{
	assert (start <= end);

	size_t len = end - start;
	char *copy = GC_malloc (len + 1);
	string_t *s = (string_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_String), sizeof (string_t));
	memcpy (copy, start, len);
	copy [len] = '\0';
	s->utf8 = copy;
	return &s->val;
}

value_t*
make_string_copy (const char *utf8)
{
	size_t len = strlen (utf8);
	value_t *s = make_string_from_buf (utf8, utf8 + len);
	return s;
}

value_t*
make_string_copy_free (char *utf8)
{
	value_t *s = make_string_copy (utf8);
	free (utf8);
	return s;
}

const char*
string_get_utf8 (value_t *v)
{
	string_t *s = (string_t*)v;
	assert (v->ptable->type == TYPE_String);
	return s->utf8;
}
#endif

/**
 *  MurmurHash3 was created by Austin Appleby  in 2008. The cannonical
 *  implementations are in C++ and placed in the public.
 *
 *    https://sites.google.com/site/murmurhash/
 *
 */
uint32_t
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

uint32_t
string_hash_code (const char *utf8)
{
        size_t len;
        len = strlen (utf8);
        return hashmurmur3_32(utf8, len);
}

value_t* // was static symbol_t*
make_symbol (const char *utf8)
{
	symbol_t *sym = (symbol_t*)alloc_value_retired (PTABLE_NAME (cljc_DOT_core_SLASH_Symbol), sizeof (symbol_t));
	sym->utf8 = utf8;
	return &sym->val;
}

KHASH_MAP_INIT_STR (SYMBOLS, symbol_t*);
static khash_t(SYMBOLS) *symbol_hash = NULL;

value_t*
intern_symbol (const char *utf8, bool copy)
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

const char*
symbol_get_utf8 (value_t *v)
{
	symbol_t *s = (symbol_t*)v;
	assert (v->ptable->type == TYPE_Symbol);
	return s->utf8;
}

value_t*
make_keyword (const char *utf8)
{
	keyword_t *kw = (keyword_t*)alloc_value_retired (PTABLE_NAME (cljc_DOT_core_SLASH_Keyword), sizeof (keyword_t));
	kw->utf8 = utf8;
	return &kw->val;
}

KHASH_MAP_INIT_STR (KEYWORDS, keyword_t*);
static khash_t(KEYWORDS) *keyword_hash = NULL;

value_t*
intern_keyword (const char *utf8, bool copy)
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

const char*
keyword_get_utf8 (value_t *v)
{
	keyword_t *k = (keyword_t*)v;
	assert (v->ptable->type == TYPE_Keyword);
	return k->utf8;
}

#ifndef HAVE_OBJC
static value_t*
extract_name (const char *utf8)
{
	const char *ptr = g_utf8_strrchr (utf8, -1, '/');
	if (ptr != NULL)
		return make_string (g_utf8_next_char (ptr));
	return make_string (utf8);
}

static value_t*
extract_namespace (const char *utf8)
{
	const char *ptr = g_utf8_strrchr (utf8, -1, '/');
	if (ptr != NULL)
		return make_string_from_buf (utf8, ptr);
	return value_nil;
}

value_t*
keyword_get_name (value_t *v)
{
	return extract_name (keyword_get_utf8 (v));
}

value_t*
keyword_get_namespace (value_t *v)
{
	return extract_namespace (keyword_get_utf8 (v));
}

value_t*
symbol_get_name (value_t *v)
{
	return extract_name (symbol_get_utf8 (v));
}

value_t*
symbol_get_namespace (value_t *v)
{
	return extract_namespace (symbol_get_utf8 (v));
}
#endif

value_t*
make_raw_pointer (void *ptr)
{
	raw_pointer_t *p = (raw_pointer_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer), sizeof (raw_pointer_t));
	p->ptr = ptr;
	return &p->val;
}

void*
raw_pointer_get (value_t *v)
{
	raw_pointer_t *p = (raw_pointer_t*)v;
	assert (v->ptable->type == TYPE_RawPointer);
	return p->ptr;
}

value_t*
make_compound (const char *name, size_t size, void *data_ptr)
{
	compound_t *c = (compound_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Compound), sizeof (compound_t) + size);
	c->name = name;
	c->size = size;
	if (data_ptr)
		memcpy (c->data, data_ptr, size);
	else
		memset (c->data, 0, size);
	return &c->val;
}

const char*
compound_get_name (value_t *v)
{
	compound_t *c = (compound_t*)v;
	assert (v->ptable->type == TYPE_Compound);
	return c->name;
}

void*
compound_get_data_ptr (value_t *v)
{
	compound_t *c = (compound_t*)v;
	assert (v->ptable->type == TYPE_Compound);
	return c->data;
}

void*
compound_get_data_ptr_guarded (value_t *v, const char *name)
{
	if (strcmp (name, compound_get_name (v)) != 0)
		assert (false);
	return compound_get_data_ptr (v);
}

value_t*
make_boolean (bool x)
{
	if (x)
		return value_true;
	return value_false;
}

long
identity_hash_code (value_t *v)
{
	/* FIXME: this won't work with a moving GC */
	return (long)v;
}

value_t*
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
			cljc_integer_t *i = (cljc_integer_t*)arg1;
			printf ("%lld", i->x);
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
#ifndef HAVE_OBJC
		case TYPE_String:
			printf ("%s", string_get_utf8 (arg1));
			break;
#endif
		default:
			assert_not_reached ();
	}
	printf ("\n");
	return value_nil;
}

value_t *VAR_NAME (cljc_DOT_core_SLASH_print) = VALUE_NONE;

bool
truth (value_t *v)
{
	if (v == value_nil)
		return false;
	if (v == value_false)
		return false;
	return true;
}

value_t*
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

value_t *VAR_NAME (cljc_DOT_core_SLASH_apply) = VALUE_NONE;

value_t *current_exception = VALUE_NONE;
jmp_buf *topmost_jmp_buf = NULL;

value_t*
throw_exception (value_t *exception)
{
	assert (current_exception == VALUE_NONE);
	current_exception = exception;
	_longjmp (*topmost_jmp_buf, 1);
	assert_not_reached ();
	return value_nil;
}

value_t*
get_exception (void)
{
	value_t *exception = current_exception;
	assert (exception != VALUE_NONE);
	current_exception = VALUE_NONE;
	return exception;
}

void
rethrow_exception (void)
{
	throw_exception (get_exception ());
}

value_t*
assert_not_recur (value_t *val)
{
	assert (val != VALUE_RECUR);
	return val;
}

#ifndef HAVE_OBJC
char*
slurp_file (const char *filename)
{
	char *contents;
	if (!g_file_get_contents (filename, &contents, NULL, NULL))
		assert_not_reached ();
	return contents;
}

long
strchr_offset (const char *str, cljc_unichar_t c)
{
	char *p = g_utf8_strchr (str, -1, c);
	if (p == NULL)
		return -1;
	return p - str;
}

value_t*
string_index_of (value_t *haystack, value_t *needle, value_t *offset)
{
	// FIXME: adjust for string length caching when available.
	long long c_off = integer_get (offset);
	if (c_off > LONG_MAX)
		return value_nil;
	if (c_off < 0)
		c_off = 0;

	const gchar *c_hay = g_utf8_normalize (string_get_utf8 (haystack),
					       -1,
					       G_NORMALIZE_DEFAULT_COMPOSE);
	const gchar *c_needle = g_utf8_normalize (string_get_utf8 (needle),
						  -1,
						  G_NORMALIZE_DEFAULT_COMPOSE);
	glong hay_len = -1;
	const gchar *start;
	if (c_off == 0)
		start = c_hay;
	else {
		hay_len = g_utf8_strlen (c_hay, -1);
		if (c_off >= hay_len) {
			// Match Java's semantics for an empty needle.
			if (g_utf8_strlen (c_needle, -1) == 0)
				return make_integer (hay_len);
			else
				return value_nil;
		}
		// FIXME: step backwards if c_off is in the last 1/4 of string.
		start = g_utf8_offset_to_pointer (c_hay, c_off);
	}

	const gchar *target = g_strstr_len (start, -1, c_needle);
	if (target != NULL)
		return make_integer (g_utf8_pointer_to_offset (c_hay, target));

	if (hay_len < 0)
		hay_len = g_utf8_strlen (c_hay, -1);
	// Match Java's semantics for an empty needle.
	if (g_utf8_strlen (c_needle, -1) == 0)
		return make_integer (hay_len);
	else
		return value_nil;
}

////////////////////////////////////////////////////////////
/// Regular expressions
///
/// Q: (When) should we use pcre_study()?
///
/// Q: Is PCRE_INFO_CAPTURECOUNT expensive?  If so, capture it at
/// pcre_compile() time?

value_t*
pcre_pattern (value_t* pattern_str)
{
	int offset;
	const char *errmsg;
	const char *c_str = string_get_utf8 (pattern_str);
	pcre *re = pcre_compile (c_str, PCRE_UTF8, &errmsg, &offset, NULL);
	if (re != NULL)
		return make_raw_pointer (re);
	value_t* result = make_array (2);
	array_set (result, 0, make_string_copy (errmsg));
	array_set (result, 1, make_integer (offset));
	return result;
}

value_t*
pcre_match_offsets (value_t* re, value_t* s, value_t *offset)
{
	pcre *c_re = raw_pointer_get (re);
	const char *c_str = string_get_utf8 (s);
	const size_t c_strlen = strlen (c_str);
	if (!c_strlen)
		return value_nil;
	const long long c_offset = integer_get (offset);
	if (c_offset > INT_MAX)
		return make_integer (PCRE_ERROR_BADOFFSET);
	int rc, capture_count;
	rc = pcre_fullinfo (c_re, NULL, PCRE_INFO_CAPTURECOUNT, &capture_count);
	size_t match_offsets_n = (capture_count + 1) * 3; // FIXME: overflow.
	int *match_offsets = GC_malloc (match_offsets_n * sizeof (int));
	rc = pcre_exec (raw_pointer_get (re),
			NULL, // extra
			c_str,
			c_strlen,
			c_offset,
			0, // options
			match_offsets,
			match_offsets_n);
	if (rc == PCRE_ERROR_NOMATCH)
		return value_nil;
	if (rc < 0)
		return make_integer (rc);
	value_t *result = make_array (rc * 2);
	for(int i = 0; i < rc * 2; i++) // FIXME: overflow.
		array_set (result, i, make_integer (match_offsets[i]));
	return result;
}

#endif

value_t* VAR_NAME (cljc_DOT_core_SLASH_Nil) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Closure) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Integer) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Float) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Boolean) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Array) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Character) = VALUE_NONE;
#ifndef HAVE_OBJC
value_t* VAR_NAME (cljc_DOT_core_SLASH_String) = VALUE_NONE;
#endif
value_t* VAR_NAME (cljc_DOT_core_SLASH_Symbol) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Keyword) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_RawPointer) = VALUE_NONE;
value_t* VAR_NAME (cljc_DOT_core_SLASH_Compound) = VALUE_NONE;

void
cljc_init (void)
{
	GC_INIT ();

#ifndef HAVE_OBJC
        pcre_malloc = GC_malloc;
        pcre_free = GC_free;
#endif

	VAR_NAME (cljc_DOT_core_SLASH_Nil) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Nil) = alloc_ptable (TYPE_Nil, VAR_NAME (cljc_DOT_core_SLASH_Nil), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Closure) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Closure) = closure_ptable ();
	closure_ptable ()->constructor = VAR_NAME (cljc_DOT_core_SLASH_Closure);

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

#ifndef HAVE_OBJC
	VAR_NAME (cljc_DOT_core_SLASH_String) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_String) = alloc_ptable (TYPE_String, VAR_NAME (cljc_DOT_core_SLASH_String), NULL);
#endif

	VAR_NAME (cljc_DOT_core_SLASH_Symbol) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Symbol) = alloc_ptable (TYPE_Symbol, VAR_NAME (cljc_DOT_core_SLASH_Symbol), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Keyword) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Keyword) = alloc_ptable (TYPE_Keyword, VAR_NAME (cljc_DOT_core_SLASH_Keyword), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_RawPointer) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer) = alloc_ptable (TYPE_RawPointer, VAR_NAME (cljc_DOT_core_SLASH_RawPointer), NULL);

	VAR_NAME (cljc_DOT_core_SLASH_Compound) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_Compound) = alloc_ptable (TYPE_Compound, VAR_NAME (cljc_DOT_core_SLASH_Compound), NULL);

	value_nil = alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Nil), sizeof (value_t));

	value_true = alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Boolean), sizeof (value_t));
	value_false = alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_Boolean), sizeof (value_t));

	VAR_NAME (cljc_DOT_core_SLASH_print) = make_closure (cljc_core_print, NULL);
	VAR_NAME (cljc_DOT_core_SLASH_apply) = make_closure (cljc_core_apply, NULL);

#ifdef HAVE_OBJC
	cljc_objc_init ();
#endif
}
