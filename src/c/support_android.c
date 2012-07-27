#include <stdio.h>
#include <string.h>
#include <glib.h>

#include <android/log.h>

#define LOGI(...)  __android_log_print(ANDROID_LOG_INFO,"support",__VA_ARGS__)
#define LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,"support",__VA_ARGS__)

int
printf(const gchar *format, ...)
{
    va_list args;
    va_start(args, format);
    __android_log_vprint(ANDROID_LOG_INFO,"printf", format, args);
    va_end(args);
}

int
fputs(const char* d, FILE *stream)
{
    __android_log_print(ANDROID_LOG_INFO,"fputs", d);    
}

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
    outbuf[0] = c;
    return 1;
}

gunichar
g_utf8_get_char (const gchar *p)
{
    return *p;
}

// Don't know what this does - but required for it to compile with the
// glib.h header.  TODO: remove the glib.h header
const gchar * const g_utf8_skip = {0};

gchar *
g_utf8_strchr(const gchar *p, gssize len, gunichar c)
{
    LOGI("HI********8");
    return strchr(p, c);
}

glong
g_utf8_strlen(const gchar *p, gssize max)
{
   return strlen(p);
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
