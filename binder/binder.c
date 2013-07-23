#include <clang-c/Index.h>
#include <glib.h>

static GHashTable *type_name_hash_table;

static void
register_type_name (const char *name, const char *cljc_name)
{
	if (!type_name_hash_table)
		type_name_hash_table = g_hash_table_new (g_str_hash, g_str_equal);
	g_hash_table_insert (type_name_hash_table, (gpointer)name, (gpointer)cljc_name);
}

static void
register_compound (const char *name)
{
	register_type_name (g_strdup (name), g_strdup_printf ("Foundation/%s", name));
}

static const char*
cljc_name_for_type_name (const char *name)
{
	if (!type_name_hash_table)
		return NULL;
	const char *cljc_name = g_hash_table_lookup (type_name_hash_table, name);
	return cljc_name;
}

static const char*
cljc_name_for_type (CXCursor cursor, CXType type)
{
	CXString spelling_cxstring = clang_getTypeSpelling (type);
	const char *spelling = clang_getCString (spelling_cxstring);
	const char *registered_name = cljc_name_for_type_name (spelling);
	clang_disposeString (spelling_cxstring);
	if (registered_name)
		return registered_name;

	switch (type.kind) {
		case CXType_Void:
			return ":void";
		case CXType_UShort:
			return ":unsigned-short";
		case CXType_UInt:
			return ":unsigned-int";
		case CXType_ULong:
			return ":unsigned-long";
		case CXType_ULongLong:
			return ":unsigned-long-long";
		case CXType_Char_S:
			return ":char";
		case CXType_SChar:
			return ":signed-char";
		case CXType_Short:
			return ":short";
		case CXType_Int:
			return ":int";
		case CXType_Long:
			return ":long";
		case CXType_LongLong:
			return ":long-long";
		case CXType_Float:
			return ":float";
		case CXType_Double:
			return ":double";
		case CXType_ObjCId:
			return ":id";
		case CXType_ObjCClass:
			return ":id"; /* FIXME: print actual type */
		case CXType_ObjCSel:
			return ":selector";
		case CXType_ObjCObjectPointer:
			return ":id"; /* FIXME: get actual type */
		case CXType_UChar:
			return ":unsigned-char";
		case CXType_Typedef:
			return cljc_name_for_type (cursor, clang_getCanonicalType (type));
		case CXType_Enum: {
			CXCursor referenced;
			CXType enum_type;
			if (clang_isReference (cursor.kind))
				referenced = clang_getCursorReferenced (cursor);
			else
				referenced = cursor;
			if (referenced.kind == CXCursor_TypedefDecl)
				enum_type = clang_getTypedefDeclUnderlyingType (referenced);
			else
				enum_type = clang_getEnumDeclIntegerType (referenced);
			if (enum_type.kind == CXType_Invalid)
				return NULL; /* FIXME: this means we're doing something wrong */
			return cljc_name_for_type (referenced, enum_type);
		}
		case CXType_Char16:
		case CXType_Char32:
		case CXType_UInt128:
		case CXType_WChar:
		case CXType_Int128:
		case CXType_LongDouble:
		case CXType_NullPtr:
		case CXType_Overload:
		case CXType_Dependent:
		case CXType_Complex:
		case CXType_Pointer:
		case CXType_BlockPointer:
		case CXType_LValueReference:
		case CXType_RValueReference:
		case CXType_Record:
		case CXType_ObjCInterface:
		case CXType_FunctionNoProto:
		case CXType_FunctionProto:
		case CXType_ConstantArray:
		case CXType_Vector:
		case CXType_Unexposed:
		case CXType_Bool:
		case CXType_Char_U:
			return NULL;
		default:
			g_assert_not_reached ();
	}
}

static enum CXChildVisitResult
get_first_child_visitor_func (CXCursor cursor, CXCursor parent, CXClientData client_data)
{
	CXCursor *result = (CXCursor*)client_data;
	*result = cursor;
	return CXChildVisit_Break;
}

static enum CXChildVisitResult
visitor_func (CXCursor cursor, CXCursor parent, CXClientData client_data)
{
	enum CXCursorKind kind = clang_getCursorKind (cursor);
	switch (kind) {
		case CXCursor_ObjCInterfaceDecl:
			//printf ("@interface %s\n", clang_getCString (clang_getCursorSpelling (cursor)));
			return CXChildVisit_Recurse;
		case CXCursor_TypedefDecl: {
			CXType type = clang_getTypedefDeclUnderlyingType (cursor);
			if (type.kind == CXType_Unexposed) {
				CXString type_spelling_cxstring = clang_getTypeSpelling (type);
				const char *type_spelling = clang_getCString (type_spelling_cxstring);
				if (g_str_has_prefix (type_spelling, "struct ") || g_str_has_prefix (type_spelling, "union ")) {
					CXString spelling_cxstring = clang_getCursorSpelling (cursor);
					const char *spelling = clang_getCString (spelling_cxstring);
					g_assert (!cljc_name_for_type_name (spelling));
					register_compound (spelling);
					printf ("[:compound %s \"sizeof (%s)\"]\n", spelling, spelling);
					clang_disposeString (spelling_cxstring);
				}
				clang_disposeString (type_spelling_cxstring);
			}
			return CXChildVisit_Continue;
		}
		case CXCursor_FunctionDecl:
		case CXCursor_ObjCInstanceMethodDecl:
		case CXCursor_ObjCClassMethodDecl: {
			gboolean is_function = kind == CXCursor_FunctionDecl;
			CXString spelling_cxstring = clang_getCursorSpelling (cursor);
			const char *spelling = clang_getCString (spelling_cxstring);
			int num_args = clang_Cursor_getNumArguments (cursor);
			CXCursor result_cursor;
			clang_visitChildren (cursor, get_first_child_visitor_func, &result_cursor);
			gboolean have_types = cljc_name_for_type (result_cursor, clang_getCursorResultType (cursor)) != NULL;
			if (have_types) {
				for (int i = 0; i < num_args; ++i) {
					CXCursor arg_cursor = clang_Cursor_getArgument (cursor, i);
					if (cljc_name_for_type (arg_cursor, clang_getCursorType (arg_cursor)) == NULL) {
						have_types = FALSE;
						break;
					}
				}
			}
			if (have_types) {
				if (is_function)
					printf ("[:function %s", spelling);
				else {
					printf ("[:selector [%d", num_args);
					if (num_args == 0) {
						printf (" :%s", spelling);
					} else {
						char **parts = g_strsplit (spelling, ":", 0);
						for (int i = 0; i < num_args; ++i)
							printf (" :%s", parts [i]);
						g_strfreev (parts);
					}
					printf ("]");
				}
				printf (" [%s", cljc_name_for_type (result_cursor, clang_getCursorResultType (cursor)));
				for (int i = 0; i < num_args; ++i) {
					CXCursor arg_cursor = clang_Cursor_getArgument (cursor, i);
					printf (" %s", cljc_name_for_type (arg_cursor, clang_getCursorType (arg_cursor)));
				}
				printf ("]]\n");
			}
			clang_disposeString (spelling_cxstring);
			return CXChildVisit_Continue;
		}
		default:
			break;
	}
	return CXChildVisit_Continue;
}

int
main (int argc, const char *argv[])
{
	CXIndex Index = clang_createIndex(0, 0);
	CXTranslationUnit TU = clang_parseTranslationUnit(Index, 0,
							  argv, argc, 0, 0, CXTranslationUnit_None);
	for (unsigned I = 0, N = clang_getNumDiagnostics(TU); I != N; ++I) {
		CXDiagnostic Diag = clang_getDiagnostic(TU, I);
		CXString String = clang_formatDiagnostic(Diag,
							 clang_defaultDiagnosticDisplayOptions());
		fprintf(stderr, "%s\n", clang_getCString(String));
		clang_disposeString(String);
	}
	CXCursor cursor = clang_getTranslationUnitCursor (TU);

	register_type_name ("BOOL", "Boolean");
	register_type_name ("_Bool", "Boolean");

	printf ("[\n");
	clang_visitChildren (cursor, visitor_func, NULL);
	printf ("]\n");
	clang_disposeTranslationUnit(TU);
	clang_disposeIndex(Index);
	return 0;
}
