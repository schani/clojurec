#include <assert.h>
#include <inttypes.h>
#include <stdbool.h>
#include <setjmp.h>

#import <Foundation/Foundation.h>

#include "khash.h"

#include "cljc.h"

#ifdef HAVE_OBJC

ptable_t* PTABLE_NAME (cljc_DOT_core_SLASH_ObjCSelector) = NULL;
value_t* VAR_NAME (cljc_DOT_core_SLASH_ObjCSelector) = VALUE_NONE;

static ptable_t* objc_class_ptable (Class class);

static ptable_t*
objc_class_alloc_ptable (Class class)
{
	static value_t *constructor = NULL;

	Class superclass = [class superclass];
	ptable_t *ptable;

	if (constructor == NULL)
		constructor = make_closure (NULL, NULL);

	ptable = alloc_ptable (TYPE_ObjCObject, constructor, NULL);
	if (superclass != nil) {
		ptable_t *sc_ptable = objc_class_ptable (superclass);
		ptable_entry_t *entry;
		for (entry = sc_ptable->entries; entry->num >= 0; ++entry)
			extend_ptable (ptable, entry->num, entry->vtable);
	}
	return ptable;
}

#define class_hash_func(key)	(khint32_t)(key)
KHASH_INIT(CLASSES, Class, ptable_t*, 1, class_hash_func, kh_int_hash_equal);
static khash_t(CLASSES) *class_hash = NULL;

static ptable_t*
objc_class_ptable (Class class)
{
	khiter_t iter;
	int ret;

	if (class_hash == NULL) {
		class_hash = kh_init (CLASSES);
		assert (class_hash != NULL);
	}
	assert (class_hash != NULL);

	iter = kh_put (CLASSES, class_hash, class, &ret);
	if (ret != 0)
		kh_value (class_hash, iter) = objc_class_alloc_ptable (class);
	return kh_value (class_hash, iter);
}

void
objc_class_extend_ptable (Class class, int protocol_num, closure_t **vtable)
{
	ptable_t *ptable = objc_class_ptable (class);
	closure_t **old_vtable = ptable_get_vtable (ptable, protocol_num);
	khiter_t iter;

	extend_ptable (ptable, protocol_num, vtable);

	for (iter = kh_begin (class_hash); iter != kh_end (class_hash); ++iter) {
		Class subclass;
		ptable_t *sub_ptable;
		closure_t **sub_vtable;
		if (!kh_exist (class_hash, iter))
			continue;
		subclass = kh_key (class_hash, iter);
		if (![subclass isSubclassOfClass: class])
			continue;
		sub_ptable = kh_value (class_hash, iter);
		sub_vtable = ptable_get_vtable (sub_ptable, protocol_num);
		assert (old_vtable == NULL || sub_vtable != NULL);
		if (old_vtable == NULL || sub_vtable == old_vtable)
			extend_ptable (sub_ptable, protocol_num, vtable);
	}
}

value_t*
make_objc_object (id obj)
{
	objc_object_t *o = (objc_object_t*) alloc_value (objc_class_ptable ([obj class]), sizeof (objc_object_t));
	/* FIXME: release in finalizer! */
	o->obj = [obj retain];
	return &o->val;
}

value_t*
make_objc_selector (SEL sel)
{
	objc_selector_t *s = (objc_selector_t*) alloc_value (PTABLE_NAME (cljc_DOT_core_SLASH_ObjCSelector),
							     sizeof (objc_selector_t));
	s->sel = sel;
	return &s->val;
}

id
objc_object_get (value_t *obj)
{
	objc_object_t *o = (objc_object_t*)obj;
	assert (obj->ptable->type == TYPE_ObjCObject);
	return o->obj;
}

SEL
objc_selector_get (value_t *sel)
{
	objc_selector_t *s = (objc_selector_t*)sel;
	assert (sel->ptable->type == TYPE_ObjCSelector);
	return s->sel;
}

value_t*
make_string (char *utf8)
{
	return make_objc_object ([NSString stringWithUTF8String: utf8]);
}

value_t*
make_string_from_unichar (cljc_unichar_t c)
{
	return make_objc_object ([NSString stringWithCharacters: &c length: 1]);
}

value_t*
make_string_from_buf (const char *start, const char *end)
{
	NSString *s = [[NSString alloc] initWithBytes: start
					       length: end - start
					     encoding: NSUTF8StringEncoding];
	value_t *v = make_objc_object (s);
	[s release];
	return v;
}

const char*
string_get_utf8 (value_t *v)
{
	NSString *s = objc_object_get (v);
	return [s UTF8String];
}

/*
 * FIXME: This doesn't handle unicode.  We'll probably have to
 * implement keyword and symbol interning using NSString's in NSSet's,
 * then use NSString's methods for the extraction.
 */
static value_t*
extract_name (const char *utf8)
{
	const char *ptr = strrchr (utf8, '/');
	if (ptr != NULL)
		return make_string ((char*)ptr + 1);
	return make_string ((char*)utf8);
}

static value_t*
extract_namespace (const char *utf8)
{
	const char *ptr = strrchr (utf8, '/');
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

static id
convert_to_objc_object (value_t *val)
{
	switch (val->ptable->type) {
		case TYPE_Nil:
			return nil;
		case TYPE_Closure:
			assert_not_reached ();
		case TYPE_Integer:
			return [NSNumber numberWithLong: integer_get (val)];
		case TYPE_Float:
			return [NSNumber numberWithDouble: float_get (val)];
		case TYPE_Boolean:
			return [NSNumber numberWithBool: truth (val)];
		case TYPE_Array:
			assert_not_reached ();
			return nil;
		case TYPE_Character:
			assert_not_reached ();
			return nil;
		case TYPE_ObjCObject:
			return objc_object_get (val);
		default:
			assert_not_reached ();
			return nil;
	}
}

static value_t*
convert_from_objc_object (id obj)
{
	Class class = [obj class];

	if ([class isSubclassOfClass: [NSNumber class]]) {
		const char *type = [obj objCType];
		if (*type == 'f' || *type == 'd')
			return make_float ([obj doubleValue]);
		if (*type == 'B')
			return make_boolean ([obj boolValue]);
		return make_integer ([obj longValue]);
	}

	return make_objc_object (obj);
}

value_t*
objc_object_send_message (int nargs, closure_t *closure, value_t *obj, value_t *sel, value_t *arg1, value_t **argrest)
{
	int i;
	id target;
	SEL selector;
	NSMethodSignature *signature;
	NSInvocation *invocation;
	const char *return_type;

	assert (nargs >= 2);

	target = objc_object_get (obj);
	selector = objc_selector_get (sel);

	signature = [target methodSignatureForSelector: selector];
	assert ([signature numberOfArguments] == nargs);
	invocation = [NSInvocation invocationWithMethodSignature: signature];

	[invocation setTarget: target];
	[invocation setSelector: selector];

	for (i = 2; i < nargs; ++i) {
		value_t *arg = (i == 2) ? arg1 : argrest [i - 3];
		const char *type = [signature getArgumentTypeAtIndex: i];
		switch (*type) {
			case 'c': {
				char data = 0;
				if (arg->ptable->type == TYPE_Character)
					data = character_get (arg);
				else if (arg->ptable->type == TYPE_Integer)
					data = integer_get (arg);
				else
					assert_not_reached ();
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'i': {
				int data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 's': {
				short data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'l': {
				long data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'q': {
				long long data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'C': {
				unsigned char data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'I': {
				unsigned int data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'S': {
				unsigned short data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'L': {
				unsigned long data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'Q': {
				unsigned long long data = integer_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'f': {
				float data = number_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'd': {
				double data = number_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case 'B': {
				_Bool data = truth (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case '*': {
				const char *data = string_get_utf8 (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case '@': {
				id data = convert_to_objc_object (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			case ':': {
				SEL data = objc_selector_get (arg);
				[invocation setArgument: &data atIndex: i];
				break;
			}
			default:
				assert_not_reached ();
		}
	}

	[invocation invoke];

	return_type = [signature methodReturnType];
	switch (*return_type) {
		case 'c': {
			char data;
			[invocation getReturnValue: &data];
			return make_character (data);
		}
		case 'i': {
			int data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 's': {
			short data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'l': {
			long data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'q': {
			long long data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'C': {
			unsigned char data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'I': {
			unsigned int data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'S': {
			unsigned short data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'L': {
			unsigned long data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'Q': {
			unsigned long long data;
			[invocation getReturnValue: &data];
			return make_integer (data);
		}
		case 'f': {
			float data;
			[invocation getReturnValue: &data];
			return make_float (data);
		}
		case 'd': {
			double data;
			[invocation getReturnValue: &data];
			return make_float (data);
		}
		case 'B': {
			_Bool data;
			[invocation getReturnValue: &data];
			return make_boolean (data);
		}
		case '*': {
			char *data;
			[invocation getReturnValue: &data];
			return make_string (data);
		}
		case '@': {
			id data;
			[invocation getReturnValue: &data];
			return convert_from_objc_object (data);
		}
		case ':': {
			SEL data;
			[invocation getReturnValue: &data];
			return make_objc_selector (data);
		}
		case 'v':
			return value_nil;
		default:
			assert_not_reached ();
			return value_nil;
	}
}

void
cljc_objc_init (void)
{
	VAR_NAME (cljc_DOT_core_SLASH_ObjCSelector) = make_closure (NULL, NULL);
	PTABLE_NAME (cljc_DOT_core_SLASH_ObjCSelector) = alloc_ptable (TYPE_ObjCSelector, VAR_NAME (cljc_DOT_core_SLASH_ObjCSelector), NULL);
}

#endif
