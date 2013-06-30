#ifndef __CLJC_CLJC_H__
#define __CLJC_CLJC_H__

#ifdef HAVE_OBJC
typedef unsigned short cljc_unichar_t;
#else
#include <glib.h>

typedef gunichar cljc_unichar_t;
#endif

#ifdef HAVE_IOS
#define GC_malloc malloc
#define GC_INIT()
#else
#include <gc.h>
#endif

#define assert_not_reached()	(assert (0))

#ifndef MAIN_FUNCTION_NAME
#define MAIN_FUNCTION_NAME main
#endif

typedef struct ptable ptable_t;

typedef struct value {
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
} cljc_integer_t;

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
	cljc_unichar_t c;
} character_t;

#ifndef HAVE_OBJC
typedef struct {
	value_t val;
	char *utf8;
} string_t;
#endif

typedef struct {
	value_t val;
	const char *utf8;
} symbol_t;

typedef struct {
	value_t val;
	const char *utf8;
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
#ifndef HAVE_OBJC
#define TYPE_String	8
#endif
#define TYPE_Symbol	9
#define TYPE_Keyword	10
#define TYPE_RawPointer	11
#ifdef HAVE_OBJC
#define TYPE_ObjCObject	12
#define TYPE_ObjCSelector	13
#endif
#define FIRST_TYPE	14

#define FIRST_FIELD	1

#define FUNCALL0(c)			((c)->fn (0, (c), VALUE_NONE, VALUE_NONE, VALUE_NONE, NULL))
#define FUNCALL1(c,a1)			((c)->fn (1, (c), (a1), VALUE_NONE, VALUE_NONE, NULL))
#define FUNCALL2(c,a1,a2)		((c)->fn (2, (c), (a1), (a2), VALUE_NONE, NULL))
#define FUNCALL3(c,a1,a2,a3)		((c)->fn (3, (c), (a1), (a2), (a3), NULL))
#define FUNCALLn(c,n,a1,a2,a3,ar)	((c)->fn ((n), (c), (a1), (a2), (a3), (ar)))

#define ARG_NIL		VAR_NAME (cljc_DOT_core_DOT_List_SLASH_EMPTY)
#define ARG_CONS(a,d)	FUNCALLn ((closure_t*)VAR_NAME (cljc_DOT_core_SLASH_Cons), 4, value_nil, (a), (d), (value_t*[]) { value_nil })

#define RAW_POINTER_GET(v,type)	((type)raw_pointer_get ((v)))

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

extern value_t *value_nil;

extern value_t *value_true;
extern value_t *value_false;

extern value_t *current_exception;
extern jmp_buf *topmost_jmp_buf;

extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Cons);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_first);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_next);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_count);
extern value_t *VAR_NAME (cljc_DOT_core_SLASH_print);
extern value_t *VAR_NAME (cljc_DOT_core_SLASH_apply);

extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Nil);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Closure);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Integer);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Float);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Boolean);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Array);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Character);
#ifndef HAVE_OBJC
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_String);
#endif
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Symbol);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_Keyword);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_RawPointer);

extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Nil);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Closure);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Integer);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Float);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Boolean);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Array);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Character);
#ifndef HAVE_OBJC
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_String);
#endif
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Symbol);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_Keyword);
extern ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_RawPointer);

extern int register_protocol (void);
extern int register_type (void);
extern int register_field (const char *name);

extern closure_t** ptable_get_vtable (ptable_t *ptable, int protocol_num);
extern closure_t* get_protocol (value_t *val, int protocol_num, int fn_index);
extern bool value_satisfies_protocol (value_t *val, int protocol_num);
extern value_t* protcall0 (value_t *target, int protocol_num, int fn_index);
extern value_t* protcall1 (value_t *target, int protocol_num, int fn_index, value_t *a1);
extern value_t* protcall2 (value_t *target, int protocol_num, int fn_index, value_t *a1, value_t *a2);
extern value_t* protcalln (value_t *target, int protocol_num, int fn_index, int nargs, value_t *a1, value_t *a2, value_t **ar);
extern value_t* invoke0 (value_t *f);
extern value_t* invoke1 (value_t *f, value_t *a1);
extern value_t* invoke2 (value_t *f, value_t *a1, value_t *a2);
extern value_t* invoken (value_t *f, int nargs, value_t *a1, value_t *a2, value_t **ar);
extern ptable_t* alloc_ptable (int type, value_t *constructor, field_access_fn_t field_access_fn);
extern closure_t** alloc_vtable (int num_fns);
extern void extend_ptable (ptable_t *ptable, int protocol_num, closure_t **vtable);
extern void set_vtable_entry (closure_t **vtable, int index, closure_t *closure);
extern value_t* get_field (value_t *val, int field);
extern value_t* set_field (value_t *val, int field, value_t *new_val);
extern environment_t* alloc_env (environment_t *up, int num_bindings);
extern environment_t* copy_env (environment_t *env);
extern void env_set (environment_t *env, int index, value_t *val);
extern environment_t* env_up (environment_t *env, int num_ups);
extern value_t* env_fetch (environment_t *env, int num_ups, int index);
extern value_t* Closure_IFn_invoke (int nargs, closure_t *closure, value_t *arg1, value_t *arg2, value_t *arg3, value_t **argrest);
extern value_t* alloc_value (ptable_t *ptable, size_t size);
extern value_t* make_closure (function_t fn, environment_t *env);
extern value_t* make_integer (long x);
extern long integer_get (value_t *v);
extern value_t* make_float (double x);
extern double float_get (value_t *v);
extern double number_get (value_t *v);
extern value_t* make_array_from (long len, value_t **src);
extern value_t* make_array (long len);
extern long array_length (value_t *v);
extern value_t* array_get (value_t *v, long index);
extern void array_set (value_t *v, long index, value_t *x);
extern value_t* array_copy (value_t *src, long src_pos, value_t *dst, long dst_pos, long len);
extern value_t* make_character (cljc_unichar_t c);
extern cljc_unichar_t character_get (value_t *v);
#ifndef HAVE_OBJC
extern value_t* make_string_with_size (long bytes);
extern value_t* make_string_copy (const char *utf8);
extern value_t* make_string_copy_free (char *utf8);
#endif
extern value_t* make_string (char *utf8);
extern value_t* make_string_from_unichar (cljc_unichar_t c);
extern value_t* make_string_from_buf (const char *start, const char *end);
extern const char* string_get_utf8 (value_t *v);
extern uint32_t string_hash_code (const char *utf8);
extern value_t* intern_symbol (const char *utf8, bool copy);
extern const char* symbol_get_utf8 (value_t *v);
extern value_t* symbol_get_name (value_t *v);
extern value_t* symbol_get_namespace (value_t *v);
extern value_t* intern_keyword (const char *utf8, bool copy);
extern const char* keyword_get_utf8 (value_t *v);
extern value_t* keyword_get_name (value_t *v);
extern value_t* keyword_get_namespace (value_t *v);
extern value_t* make_raw_pointer (void *ptr);
extern void* raw_pointer_get (value_t *v);
extern value_t* make_boolean (bool x);
#ifndef HAVE_OBJC
extern value_t* re_pattern (value_t *pattern_str);
extern value_t* re_match_offsets (value_t* re, value_t* s);
#endif
extern long identity_hash_code (value_t *v);
extern value_t* cljc_core_print (int nargs, closure_t *closure, value_t *arg1, value_t *arg2, value_t *arg3, value_t **argrest);
extern bool truth (value_t *v);
extern uint32_t hashmurmur3_32(const void *data, size_t nbytes);
extern value_t* cljc_core_apply (int nargs, closure_t *closure, value_t *f, value_t *arg1, value_t *arg2, value_t **argrest);
extern value_t* throw_exception (value_t *exception);
extern value_t* get_exception (void);
extern void rethrow_exception (void);
extern value_t* assert_not_recur (value_t *val);
#ifndef HAVE_OBJC
extern char* slurp_file (const char *filename);
extern long strchr_offset (const char *str, cljc_unichar_t c);
#endif
extern void cljc_init (void);

/* These will be generated when compiling cljc.core and needed in the driver: */
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_main_exit_value);
extern value_t* VAR_NAME (cljc_DOT_core_SLASH_vector_from_c_string_array);
extern void init_cljc_DOT_core (void);

#if __OBJC__
typedef struct {
	value_t val;
	id obj;
} objc_object_t;

typedef struct {
	value_t val;
	SEL sel;
} objc_selector_t;

extern void objc_class_extend_ptable (Class class, int protocol_num, closure_t **vtable);

extern value_t* make_objc_object (id obj);
extern value_t* make_objc_selector (SEL sel);

extern id objc_object_get (value_t *obj);
extern SEL objc_selector_get (value_t *sel);
#endif

#ifdef HAVE_OBJC
extern value_t* objc_object_send_message (int nargs, closure_t *closure, value_t *obj, value_t *sel, value_t *arg1, value_t **argrest);
extern void cljc_objc_init (void);
#endif

#endif
