#include <assert.h>
#include <stdio.h>
#include <gc.h>

#define assert_not_reached()	(assert (0))

typedef struct ptable ptable_t;

typedef struct {
	ptable_t *ptable;
} value_t;

#define VALUE_NIL	((value_t*)0)
#define VALUE_NONE	((value_t*)-1)

typedef struct {
} environment_t;

typedef value_t* (*function_t) (int nargs, environment_t *env, value_t *arg1, value_t *arg2, value_t *arg3, value_t *argrest);

typedef struct {
	value_t val;
	function_t fn;
	environment_t *env;
} closure_t;

typedef struct {
	int num;		/* the protocol number, or -1 for termination */
	closure_t **vtable;
} ptable_entry_t;

struct ptable {
	int type;
	ptable_entry_t entries [0];
};

#define PROTOCOL_IFn	1

#define MEMBER_IFn_invoke	0

#define TYPE_Closure	1

static closure_t*
get_protocol (value_t *val, int protocol_num, int fn_index)
{
	ptable_t *ptable = val->ptable;
	int i;
	for (i = 0; ptable->entries [i].num >= 0; ++i)
		if (ptable->entries [i].num == protocol_num)
			return ptable->entries [i].vtable [fn_index];
	assert_not_reached ();
	return (closure_t*)VALUE_NIL;
}

#define FUNCALL0(c)			((c)->fn (0, (c)->env, VALUE_NONE, VALUE_NONE, VALUE_NONE, VALUE_NONE))
#define FUNCALL1(c,a1)			((c)->fn (1, (c)->env, (a1), VALUE_NONE, VALUE_NONE, VALUE_NONE))
#define FUNCALL2(c,a1,a2)		((c)->fn (2, (c)->env, (a1), (a2), VALUE_NONE, VALUE_NONE))
#define FUNCALL3(c,a1,a2,a3)		((c)->fn (3, (c)->env, (a1), (a2), (a3), VALUE_NONE))
#define FUNCALLn(c,n,a1,a2,a3,ar)	((c)->fn ((n), (c)->env, (a1), (a2), (a3), (ar)))

static value_t*
invoke0 (value_t *f)
{
	return FUNCALL1 (get_protocol (f, PROTOCOL_IFn, MEMBER_IFn_invoke), f);
}

static value_t*
invoke1 (value_t *f, value_t *a1)
{
	return FUNCALL2 (get_protocol (f, PROTOCOL_IFn, MEMBER_IFn_invoke), f, a1);
}

static value_t*
invoke2 (value_t *f, value_t *a1, value_t *a2)
{
	return FUNCALL3 (get_protocol (f, PROTOCOL_IFn, MEMBER_IFn_invoke), f, a1, a2);
}

static value_t*
invoken (value_t *f, int nargs, value_t *a1, value_t *a2, value_t *ar)
{
	return FUNCALLn (get_protocol (f, PROTOCOL_IFn, MEMBER_IFn_invoke), nargs + 1, f, a1, a2, ar);
}

#define FN_NAME(n)	FN_ ## n
#define VAR_NAME(n)	VAR_ ## n

static ptable_t*
alloc_ptable (int type, int num_entries)
{
	ptable_t *ptable = GC_malloc (sizeof (ptable_t) + num_entries * sizeof (ptable_entry_t) + sizeof (int));
	ptable->type = type;
	ptable->entries [num_entries].num = -1;
	return ptable;
}

static closure_t**
alloc_vtable (int num_fns)
{
	return GC_malloc (sizeof (closure_t*) * num_fns);
}

static void
set_ptable_entry (ptable_t *ptable, int index, int protocol_num, closure_t **vtable)
{
	ptable->entries [index].num = protocol_num;
	ptable->entries [index].vtable = vtable;
}

static void
set_vtable_entry (closure_t **vtable, int index, closure_t *closure)
{
	vtable [index] = closure;
}

static value_t*
Closure_IFn_invoke (int nargs, environment_t *env, value_t *arg1, value_t *arg2, value_t *arg3, value_t *argrest)
{
	closure_t *c = (closure_t*)arg1;

	assert (nargs >= 1);
	assert (arg1->ptable->type == TYPE_Closure);
	assert (argrest == VALUE_NONE);

	return c->fn (nargs - 1, c->env, arg2, arg3, VALUE_NONE, VALUE_NONE);
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

		closure_t **vtable = alloc_vtable (1);
		set_vtable_entry (vtable, MEMBER_IFn_invoke, invoke);

		ptable_t *ptable = alloc_ptable (TYPE_Closure, 1);
		set_ptable_entry (ptable, 0, PROTOCOL_IFn, vtable);

		closure_ptable = ptable;
	}

	return closure_ptable;
}

static value_t*
make_closure (function_t fn, environment_t *env)
{
	closure_t *closure = GC_malloc (sizeof (closure_t));
	closure->val.ptable = closure_ptable ();
	closure->fn = fn;
	closure->env = env;
	return &closure->val;
}

static value_t*
cljc_user_print (int nargs, environment_t *env, value_t *arg1, value_t *arg2, value_t *arg3, value_t *argrest)
{
	assert (nargs == 1);

	if (arg1 == VALUE_NIL) {
		printf ("nil");
	} else {
		switch (arg1->ptable->type) {
			case TYPE_Closure: {
				closure_t *c = (closure_t*)arg1;
				printf ("#<closure@%p:%p>", c->fn, c->env);
				break;
			}
			default:
				assert_not_reached ();
		}
	}
	printf ("\n");
	return VALUE_NIL;
}

static value_t *VAR_NAME (cljc_DOT_user_DOT_print) = VALUE_NIL;

static void
cljc_init (void)
{
	GC_INIT ();

	VAR_NAME (cljc_DOT_user_DOT_print) = make_closure (cljc_user_print, NULL);
}
