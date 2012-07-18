#import <stdio.h>
#import <string.h>
#import <glib.h>

gchar*
g_strdup(const gchar *str)
{
    return strdup(str);
}

gchar*
g_strndup(const gchar *str, gsize n)
{
    return strndup(str, n);
}

gchar*
g_strdup_printf(const gchar *format, ...)
{
    gchar *buffer = NULL;
    va_list args;

    va_start(args, format);
    vasprintf(&buffer, format, args);
    va_end(args);

    return buffer;
}


gint
g_unichar_to_utf8 (gunichar c, gchar *outbuf)
{
    NSString *nstr = [[[NSString alloc] initWithCharacters:&c length:1] UTF8String];
    if(outbuf)
    {
        [nstr getCString:outbuf maxLength:6 encoding:NSUTF8StringEncoding];
    }
    int len = [nstr length];
    [nstr release];
    return len;
}

gunichar
g_utf8_get_char (const gchar *p)
{
    return *p;
}

// Don't know what this does - but required for it to compile with the
// glib.h header.  TODO: remove the glib.h header for iOS
const gchar * const g_utf8_skip = {0};

gchar *
g_utf8_strchr(const gchar *p, gssize len, gunichar c)
{
    //  TODO: maybe [[NSString rangeOfCharacterFromSet
    //                [NSCharacterSet characterSetWithChacractersInString:[NSString stringWithCharacters:c length:1]]]
    return strchr(p, c);
}

glong
g_utf8_strlen(const gchar *p, gssize max)
{
    return [[NSString stringWithUTF8String:p] length];
//   return strlen(p);
}

gchar*
g_utf8_offset_to_pointer(const gchar *str, glong offset)
{
    return (gchar*)offset;
}

gboolean
g_file_get_contents(const gchar *filename, gchar **contents, gsize *len, GError **error)
{
    return 0;
}
