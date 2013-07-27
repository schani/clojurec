[
[:compound __mbstate_t "sizeof (__mbstate_t)"]
[:compound __darwin_pthread_attr_t "sizeof (__darwin_pthread_attr_t)"]
[:compound __darwin_pthread_cond_t "sizeof (__darwin_pthread_cond_t)"]
[:compound __darwin_pthread_condattr_t "sizeof (__darwin_pthread_condattr_t)"]
[:compound __darwin_pthread_mutex_t "sizeof (__darwin_pthread_mutex_t)"]
[:compound __darwin_pthread_mutexattr_t "sizeof (__darwin_pthread_mutexattr_t)"]
[:compound __darwin_pthread_once_t "sizeof (__darwin_pthread_once_t)"]
[:compound __darwin_pthread_rwlock_t "sizeof (__darwin_pthread_rwlock_t)"]
[:compound __darwin_pthread_rwlockattr_t "sizeof (__darwin_pthread_rwlockattr_t)"]
[:function _OSSwapInt16 [:unsigned-short :unsigned-short]]
[:function _OSSwapInt32 [:unsigned-int :unsigned-int]]
[:function _OSSwapInt64 [:unsigned-long-long :unsigned-long-long]]
[:compound fd_set "sizeof (fd_set)"]
;;FIXME: const struct fd_set * in __darwin_fd_isset
[:function __assert_rtn [:void :c-string-const :c-string-const :int :c-string-const]]
[:compound _RuneEntry "sizeof (_RuneEntry)"]
[:compound _RuneRange "sizeof (_RuneRange)"]
[:compound _RuneCharClass "sizeof (_RuneCharClass)"]
[:compound _RuneLocale "sizeof (_RuneLocale)"]
[:function ___runetype [:unsigned-long :int]]
[:function ___tolower [:int :int]]
[:function ___toupper [:int :int]]
[:function isascii [:int :int]]
[:function __maskrune [:int :int :unsigned-long]]
[:function __istype [:int :int :unsigned-long]]
[:function __isctype [:int :int :unsigned-long]]
[:function __toupper [:int :int]]
[:function __tolower [:int :int]]
[:function __wcwidth [:int :int]]
[:function isalnum [:int :int]]
[:function isalpha [:int :int]]
[:function isblank [:int :int]]
[:function iscntrl [:int :int]]
[:function isdigit [:int :int]]
[:function isgraph [:int :int]]
[:function islower [:int :int]]
[:function isprint [:int :int]]
[:function ispunct [:int :int]]
[:function isspace [:int :int]]
[:function isupper [:int :int]]
[:function isxdigit [:int :int]]
[:function toascii [:int :int]]
[:function tolower [:int :int]]
[:function toupper [:int :int]]
[:function digittoint [:int :int]]
[:function ishexnumber [:int :int]]
[:function isideogram [:int :int]]
[:function isnumber [:int :int]]
[:function isphonogram [:int :int]]
[:function isrune [:int :int]]
[:function isspecial [:int :int]]
;;FIXME: int * in __error
;;FIXME: struct lconv * in localeconv
;;FIXME: char * in setlocale
[:function __math_errhandling [:int]]
[:function __fpclassifyf [:int :float]]
[:function __fpclassifyd [:int :double]]
[:function __fpclassifyl [:int :long-double]]
[:function __inline_isfinitef [:int :float]]
[:function __inline_isfinited [:int :double]]
[:function __inline_isfinitel [:int :long-double]]
[:function __inline_isinff [:int :float]]
[:function __inline_isinfd [:int :double]]
[:function __inline_isinfl [:int :long-double]]
[:function __inline_isnanf [:int :float]]
[:function __inline_isnand [:int :double]]
[:function __inline_isnanl [:int :long-double]]
[:function __inline_isnormalf [:int :float]]
[:function __inline_isnormald [:int :double]]
[:function __inline_isnormall [:int :long-double]]
[:function __inline_signbitf [:int :float]]
[:function __inline_signbitd [:int :double]]
[:function __inline_signbitl [:int :long-double]]
[:function __inline_isfinitef [:int :float]]
[:function __inline_isfinited [:int :double]]
[:function __inline_isfinitel [:int :long-double]]
[:function __inline_isinff [:int :float]]
[:function __inline_isinfd [:int :double]]
[:function __inline_isinfl [:int :long-double]]
[:function __inline_isnanf [:int :float]]
[:function __inline_isnand [:int :double]]
[:function __inline_isnanl [:int :long-double]]
[:function __inline_signbitf [:int :float]]
[:function __inline_signbitd [:int :double]]
[:function __inline_signbitl [:int :long-double]]
[:function __inline_isnormalf [:int :float]]
[:function __inline_isnormald [:int :double]]
[:function __inline_isnormall [:int :long-double]]
[:function acosf [:float :float]]
[:function acos [:double :double]]
[:function acosl [:long-double :long-double]]
[:function asinf [:float :float]]
[:function asin [:double :double]]
[:function asinl [:long-double :long-double]]
[:function atanf [:float :float]]
[:function atan [:double :double]]
[:function atanl [:long-double :long-double]]
[:function atan2f [:float :float :float]]
[:function atan2 [:double :double :double]]
[:function atan2l [:long-double :long-double :long-double]]
[:function cosf [:float :float]]
[:function cos [:double :double]]
[:function cosl [:long-double :long-double]]
[:function sinf [:float :float]]
[:function sin [:double :double]]
[:function sinl [:long-double :long-double]]
[:function tanf [:float :float]]
[:function tan [:double :double]]
[:function tanl [:long-double :long-double]]
[:function acoshf [:float :float]]
[:function acosh [:double :double]]
[:function acoshl [:long-double :long-double]]
[:function asinhf [:float :float]]
[:function asinh [:double :double]]
[:function asinhl [:long-double :long-double]]
[:function atanhf [:float :float]]
[:function atanh [:double :double]]
[:function atanhl [:long-double :long-double]]
[:function coshf [:float :float]]
[:function cosh [:double :double]]
[:function coshl [:long-double :long-double]]
[:function sinhf [:float :float]]
[:function sinh [:double :double]]
[:function sinhl [:long-double :long-double]]
[:function tanhf [:float :float]]
[:function tanh [:double :double]]
[:function tanhl [:long-double :long-double]]
[:function expf [:float :float]]
[:function exp [:double :double]]
[:function expl [:long-double :long-double]]
[:function exp2f [:float :float]]
[:function exp2 [:double :double]]
[:function exp2l [:long-double :long-double]]
[:function expm1f [:float :float]]
[:function expm1 [:double :double]]
[:function expm1l [:long-double :long-double]]
[:function logf [:float :float]]
[:function log [:double :double]]
[:function logl [:long-double :long-double]]
[:function log10f [:float :float]]
[:function log10 [:double :double]]
[:function log10l [:long-double :long-double]]
[:function log2f [:float :float]]
[:function log2 [:double :double]]
[:function log2l [:long-double :long-double]]
[:function log1pf [:float :float]]
[:function log1p [:double :double]]
[:function log1pl [:long-double :long-double]]
[:function logbf [:float :float]]
[:function logb [:double :double]]
[:function logbl [:long-double :long-double]]
;;FIXME: float * in modff
;;FIXME: double * in modf
;;FIXME: long double * in modfl
[:function ldexpf [:float :float :int]]
[:function ldexp [:double :double :int]]
[:function ldexpl [:long-double :long-double :int]]
;;FIXME: int * in frexpf
;;FIXME: int * in frexp
;;FIXME: int * in frexpl
[:function ilogbf [:int :float]]
[:function ilogb [:int :double]]
[:function ilogbl [:int :long-double]]
[:function scalbnf [:float :float :int]]
[:function scalbn [:double :double :int]]
[:function scalbnl [:long-double :long-double :int]]
[:function scalblnf [:float :float :long]]
[:function scalbln [:double :double :long]]
[:function scalblnl [:long-double :long-double :long]]
[:function fabsf [:float :float]]
[:function fabs [:double :double]]
[:function fabsl [:long-double :long-double]]
[:function cbrtf [:float :float]]
[:function cbrt [:double :double]]
[:function cbrtl [:long-double :long-double]]
[:function hypotf [:float :float :float]]
[:function hypot [:double :double :double]]
[:function hypotl [:long-double :long-double :long-double]]
[:function powf [:float :float :float]]
[:function pow [:double :double :double]]
[:function powl [:long-double :long-double :long-double]]
[:function sqrtf [:float :float]]
[:function sqrt [:double :double]]
[:function sqrtl [:long-double :long-double]]
[:function erff [:float :float]]
[:function erf [:double :double]]
[:function erfl [:long-double :long-double]]
[:function erfcf [:float :float]]
[:function erfc [:double :double]]
[:function erfcl [:long-double :long-double]]
[:function lgammaf [:float :float]]
[:function lgamma [:double :double]]
[:function lgammal [:long-double :long-double]]
[:function tgammaf [:float :float]]
[:function tgamma [:double :double]]
[:function tgammal [:long-double :long-double]]
[:function ceilf [:float :float]]
[:function ceil [:double :double]]
[:function ceill [:long-double :long-double]]
[:function floorf [:float :float]]
[:function floor [:double :double]]
[:function floorl [:long-double :long-double]]
[:function nearbyintf [:float :float]]
[:function nearbyint [:double :double]]
[:function nearbyintl [:long-double :long-double]]
[:function rintf [:float :float]]
[:function rint [:double :double]]
[:function rintl [:long-double :long-double]]
[:function lrintf [:long :float]]
[:function lrint [:long :double]]
[:function lrintl [:long :long-double]]
[:function roundf [:float :float]]
[:function round [:double :double]]
[:function roundl [:long-double :long-double]]
[:function lroundf [:long :float]]
[:function lround [:long :double]]
[:function lroundl [:long :long-double]]
[:function llrintf [:long-long :float]]
[:function llrint [:long-long :double]]
[:function llrintl [:long-long :long-double]]
[:function llroundf [:long-long :float]]
[:function llround [:long-long :double]]
[:function llroundl [:long-long :long-double]]
[:function truncf [:float :float]]
[:function trunc [:double :double]]
[:function truncl [:long-double :long-double]]
[:function fmodf [:float :float :float]]
[:function fmod [:double :double :double]]
[:function fmodl [:long-double :long-double :long-double]]
[:function remainderf [:float :float :float]]
[:function remainder [:double :double :double]]
[:function remainderl [:long-double :long-double :long-double]]
;;FIXME: int * in remquof
;;FIXME: int * in remquo
;;FIXME: int * in remquol
[:function copysignf [:float :float :float]]
[:function copysign [:double :double :double]]
[:function copysignl [:long-double :long-double :long-double]]
[:function nanf [:float :c-string-const]]
[:function nan [:double :c-string-const]]
[:function nanl [:long-double :c-string-const]]
[:function nextafterf [:float :float :float]]
[:function nextafter [:double :double :double]]
[:function nextafterl [:long-double :long-double :long-double]]
[:function nexttoward [:double :double :long-double]]
[:function nexttowardf [:float :float :long-double]]
[:function nexttowardl [:long-double :long-double :long-double]]
[:function fdimf [:float :float :float]]
[:function fdim [:double :double :double]]
[:function fdiml [:long-double :long-double :long-double]]
[:function fmaxf [:float :float :float]]
[:function fmax [:double :double :double]]
[:function fmaxl [:long-double :long-double :long-double]]
[:function fminf [:float :float :float]]
[:function fmin [:double :double :double]]
[:function fminl [:long-double :long-double :long-double]]
[:function fmaf [:float :float :float :float]]
[:function fma [:double :double :double :double]]
[:function fmal [:long-double :long-double :long-double :long-double]]
[:function __inff [:float]]
[:function __inf [:double]]
[:function __infl [:long-double]]
[:function __nan [:float]]
[:function j0 [:double :double]]
[:function j1 [:double :double]]
[:function jn [:double :int :double]]
[:function y0 [:double :double]]
[:function y1 [:double :double]]
[:function yn [:double :int :double]]
[:function scalb [:double :double :double]]
[:function rinttol [:long :double]]
[:function roundtol [:long :double]]
[:function drem [:double :double :double]]
[:function finite [:int :double]]
[:function gamma [:double :double]]
[:function significand [:double :double]]
;;FIXME: struct exception * in matherr
;;FIXME: jmp_buf in setjmp
;;FIXME: jmp_buf in longjmp
;;FIXME: jmp_buf in _setjmp
;;FIXME: jmp_buf in _longjmp
;;FIXME: sigjmp_buf in sigsetjmp
;;FIXME: sigjmp_buf in siglongjmp
[:function longjmperror [:void]]
[:compound __darwin_fp_control_t "sizeof (__darwin_fp_control_t)"]
[:compound __darwin_fp_status_t "sizeof (__darwin_fp_status_t)"]
[:compound stack_t "sizeof (stack_t)"]
[:compound ucontext_t "sizeof (ucontext_t)"]
[:compound siginfo_t "sizeof (siginfo_t)"]
;;FIXME: void (*)(int) in signal
[:function raise [:int :int]]
;;FIXME: void (*)(int) in bsd_signal
[:function kill [:int :int :int]]
[:function killpg [:int :int :int]]
;;FIXME: pthread_t in pthread_kill
;;FIXME: const sigset_t * in pthread_sigmask
;;FIXME: const struct sigaction *restrict in sigaction
;;FIXME: sigset_t * in sigaddset
;;FIXME: const stack_t *restrict in sigaltstack
;;FIXME: sigset_t * in sigdelset
;;FIXME: sigset_t * in sigemptyset
;;FIXME: sigset_t * in sigfillset
[:function sighold [:int :int]]
[:function sigignore [:int :int]]
[:function siginterrupt [:int :int :int]]
;;FIXME: const sigset_t * in sigismember
[:function sigpause [:int :int]]
;;FIXME: sigset_t * in sigpending
;;FIXME: const sigset_t *restrict in sigprocmask
[:function sigrelse [:int :int]]
;;FIXME: void (*)(int) in sigset
;;FIXME: const sigset_t * in sigsuspend
;;FIXME: const sigset_t *restrict in sigwait
[:function psignal [:void :unsigned-int :c-string-const]]
[:function sigblock [:int :int]]
[:function sigsetmask [:int :int]]
;;FIXME: struct sigvec * in sigvec
[:function __sigbits [:int :int]]
[:compound FILE "sizeof (FILE)"]
;;FIXME: FILE * in clearerr
;;FIXME: FILE * in fclose
;;FIXME: FILE * in feof
;;FIXME: FILE * in ferror
;;FIXME: FILE * in fflush
;;FIXME: FILE * in fgetc
;;FIXME: FILE *restrict in fgetpos
;;FIXME: char * in fgets
;;FIXME: FILE * in fopen
;;FIXME: variadic fprintf
;;FIXME: FILE * in fputc
;;FIXME: FILE *restrict in fputs
;;FIXME: void *restrict in fread
;;FIXME: FILE * in freopen
;;FIXME: variadic fscanf
;;FIXME: FILE * in fseek
;;FIXME: FILE * in fsetpos
;;FIXME: FILE * in ftell
;;FIXME: const void *restrict in fwrite
;;FIXME: FILE * in getc
[:function getchar [:int]]
;;FIXME: char * in gets
[:function perror [:void :c-string-const]]
;;FIXME: variadic printf
;;FIXME: FILE * in putc
[:function putchar [:int :int]]
[:function puts [:int :c-string-const]]
[:function remove [:int :c-string-const]]
[:function rename [:int :c-string-const :c-string-const]]
;;FIXME: FILE * in rewind
;;FIXME: variadic scanf
;;FIXME: FILE *restrict in setbuf
;;FIXME: FILE *restrict in setvbuf
;;FIXME: variadic sprintf
;;FIXME: variadic sscanf
;;FIXME: FILE * in tmpfile
;;FIXME: char * in tmpnam
;;FIXME: FILE * in ungetc
;;FIXME: FILE *restrict in vfprintf
;;FIXME: va_list in vprintf
;;FIXME: char *restrict in vsprintf
;;FIXME: char * in ctermid
;;FIXME: FILE * in fdopen
;;FIXME: FILE * in fileno
;;FIXME: FILE * in pclose
;;FIXME: FILE * in popen
;;FIXME: FILE * in __srget
;;FIXME: FILE * in __svfscanf
;;FIXME: FILE * in __swbuf
;;FIXME: FILE * in __sputc
;;FIXME: FILE * in flockfile
;;FIXME: FILE * in ftrylockfile
;;FIXME: FILE * in funlockfile
;;FIXME: FILE * in getc_unlocked
[:function getchar_unlocked [:int]]
;;FIXME: FILE * in putc_unlocked
[:function putchar_unlocked [:int :int]]
;;FIXME: FILE * in getw
;;FIXME: FILE * in putw
;;FIXME: char * in tempnam
;;FIXME: FILE * in fseeko
;;FIXME: FILE * in ftello
;;FIXME: variadic snprintf
;;FIXME: FILE *restrict in vfscanf
;;FIXME: va_list in vscanf
;;FIXME: char *restrict in vsnprintf
;;FIXME: va_list in vsscanf
;;FIXME: variadic dprintf
;;FIXME: va_list in vdprintf
;;FIXME: char **restrict in getdelim
;;FIXME: char **restrict in getline
;;FIXME: variadic asprintf
;;FIXME: char * in ctermid_r
;;FIXME: char * in fgetln
[:function fmtcheck [:c-string-const :c-string-const :c-string-const]]
;;FIXME: FILE * in fpurge
;;FIXME: FILE * in setbuffer
;;FIXME: FILE * in setlinebuf
;;FIXME: char ** in vasprintf
;;FIXME: FILE * in zopen
;;FIXME: FILE * in funopen
;;FIXME: variadic __sprintf_chk
;;FIXME: variadic __snprintf_chk
;;FIXME: char *restrict in __vsprintf_chk
;;FIXME: char *restrict in __vsnprintf_chk
[:function getpriority [:int :int :unsigned-int]]
[:function getiopolicy_np [:int :int :int]]
;;FIXME: struct rlimit * in getrlimit
;;FIXME: struct rusage * in getrusage
[:function setpriority [:int :int :unsigned-int :int]]
[:function setiopolicy_np [:int :int :int :int]]
;;FIXME: const struct rlimit * in setrlimit
;;FIXME: int * in wait
;;FIXME: int * in waitpid
;;FIXME: idtype_t in waitid
;;FIXME: int * in wait3
;;FIXME: int * in wait4
;;FIXME: void * in alloca
[:compound div_t "sizeof (div_t)"]
[:compound ldiv_t "sizeof (ldiv_t)"]
[:compound lldiv_t "sizeof (lldiv_t)"]
[:function abort [:void]]
[:function abs [:int :int]]
;;FIXME: void (*)(void) in atexit
[:function atof [:double :c-string-const]]
[:function atoi [:int :c-string-const]]
[:function atol [:long :c-string-const]]
[:function atoll [:long-long :c-string-const]]
;;FIXME: void * in bsearch
;;FIXME: void * in calloc
[:function div [Foundation/div_t :int :int]]
[:function exit [:void :int]]
;;FIXME: void * in free
;;FIXME: char * in getenv
[:function labs [:long :long]]
[:function ldiv [Foundation/ldiv_t :long :long]]
[:function llabs [:long-long :long-long]]
[:function lldiv [Foundation/lldiv_t :long-long :long-long]]
;;FIXME: void * in malloc
[:function mblen [:int :c-string-const :unsigned-long]]
;;FIXME: wchar_t *restrict in mbstowcs
;;FIXME: wchar_t *restrict in mbtowc
;;FIXME: void ** in posix_memalign
;;FIXME: void * in qsort
[:function rand [:int]]
;;FIXME: void * in realloc
[:function srand [:void :unsigned-int]]
;;FIXME: char ** in strtod
;;FIXME: char ** in strtof
;;FIXME: char ** in strtol
;;FIXME: char ** in strtold
;;FIXME: char ** in strtoll
;;FIXME: char ** in strtoul
;;FIXME: char ** in strtoull
[:function system [:int :c-string-const]]
;;FIXME: char *restrict in wcstombs
;;FIXME: char * in wctomb
[:function _Exit [:void :int]]
[:function a64l [:long :c-string-const]]
[:function drand48 [:double]]
;;FIXME: char * in ecvt
;;FIXME: unsigned short [3] in erand48
;;FIXME: char * in fcvt
;;FIXME: char * in gcvt
;;FIXME: char ** in getsubopt
[:function grantpt [:int :int]]
;;FIXME: char * in initstate
;;FIXME: unsigned short [3] in jrand48
;;FIXME: char * in l64a
;;FIXME: unsigned short [7] in lcong48
[:function lrand48 [:long]]
;;FIXME: char * in mktemp
;;FIXME: char * in mkstemp
[:function mrand48 [:long]]
;;FIXME: unsigned short [3] in nrand48
[:function posix_openpt [:int :int]]
;;FIXME: char * in ptsname
;;FIXME: char * in putenv
[:function random [:long]]
;;FIXME: unsigned int * in rand_r
;;FIXME: char * in realpath
;;FIXME: unsigned short * in seed48
[:function setenv [:int :c-string-const :c-string-const :int]]
[:function setkey [:void :c-string-const]]
;;FIXME: char * in setstate
[:function srand48 [:void :long]]
[:function srandom [:void :unsigned-int]]
[:function unlockpt [:int :int]]
[:function unsetenv [:int :c-string-const]]
[:function arc4random [:unsigned-int]]
;;FIXME: unsigned char * in arc4random_addrandom
;;FIXME: void * in arc4random_buf
[:function arc4random_stir [:void]]
[:function arc4random_uniform [:unsigned-int :unsigned-int]]
;;FIXME: void (^)(void) in atexit_b
;;FIXME: void * in bsearch_b
;;FIXME: char * in cgetcap
[:function cgetclose [:int]]
;;FIXME: char ** in cgetent
;;FIXME: char ** in cgetfirst
[:function cgetmatch [:int :c-string-const :c-string-const]]
;;FIXME: char ** in cgetnext
;;FIXME: char * in cgetnum
[:function cgetset [:int :c-string-const]]
;;FIXME: char * in cgetstr
;;FIXME: char * in cgetustr
[:function daemon [:int :int :int]]
;;FIXME: char * in devname
;;FIXME: char * in devname_r
;;FIXME: char * in getbsize
;;FIXME: double [] in getloadavg
[:function getprogname [:c-string-const]]
;;FIXME: void * in heapsort
;;FIXME: void * in heapsort_b
;;FIXME: void * in mergesort
;;FIXME: void * in mergesort_b
;;FIXME: void * in psort
;;FIXME: void * in psort_b
;;FIXME: void * in psort_r
;;FIXME: void * in qsort_b
;;FIXME: void * in qsort_r
;;FIXME: const unsigned char ** in radixsort
[:function setprogname [:void :c-string-const]]
;;FIXME: const unsigned char ** in sradixsort
[:function sranddev [:void]]
[:function srandomdev [:void]]
;;FIXME: void * in reallocf
;;FIXME: char ** in strtoq
;;FIXME: char ** in strtouq
;;FIXME: void * in valloc
;;FIXME: void * in memchr
;;FIXME: const void * in memcmp
;;FIXME: void * in memcpy
;;FIXME: void * in memmove
;;FIXME: void * in memset
;;FIXME: char * in strcat
;;FIXME: char * in strchr
[:function strcmp [:int :c-string-const :c-string-const]]
[:function strcoll [:int :c-string-const :c-string-const]]
;;FIXME: char * in strcpy
[:function strcspn [:unsigned-long :c-string-const :c-string-const]]
;;FIXME: char * in strerror
[:function strlen [:unsigned-long :c-string-const]]
;;FIXME: char * in strncat
[:function strncmp [:int :c-string-const :c-string-const :unsigned-long]]
;;FIXME: char * in strncpy
;;FIXME: char * in strpbrk
;;FIXME: char * in strrchr
[:function strspn [:unsigned-long :c-string-const :c-string-const]]
;;FIXME: char * in strstr
;;FIXME: char * in strtok
;;FIXME: char * in strxfrm
;;FIXME: char * in strtok_r
;;FIXME: char * in strerror_r
;;FIXME: char * in strdup
;;FIXME: void * in memccpy
;;FIXME: char * in stpcpy
;;FIXME: char * in stpncpy
;;FIXME: char * in strndup
[:function strnlen [:unsigned-long :c-string-const :unsigned-long]]
;;FIXME: char * in strsignal
;;FIXME: void * in memmem
;;FIXME: void * in memset_pattern4
;;FIXME: void * in memset_pattern8
;;FIXME: void * in memset_pattern16
;;FIXME: char * in strcasestr
;;FIXME: char * in strnstr
;;FIXME: char * in strlcat
;;FIXME: char * in strlcpy
;;FIXME: char * in strmode
;;FIXME: char * in strsep
;;FIXME: const void *restrict in swab
;;FIXME: const void * in bcmp
;;FIXME: const void * in bcopy
;;FIXME: void * in bzero
;;FIXME: char * in index
;;FIXME: char * in rindex
[:function ffs [:int :int]]
[:function strcasecmp [:int :c-string-const :c-string-const]]
[:function strncasecmp [:int :c-string-const :c-string-const :unsigned-long]]
[:function ffsl [:int :long]]
[:function fls [:int :int]]
[:function flsl [:int :long]]
;;FIXME: void * in __inline_memcpy_chk
;;FIXME: void * in __inline_memmove_chk
;;FIXME: void * in __inline_memset_chk
;;FIXME: char * in __inline_strcpy_chk
;;FIXME: char * in __inline_stpcpy_chk
;;FIXME: char * in __inline_stpncpy_chk
;;FIXME: char * in __inline_strncpy_chk
;;FIXME: char * in __inline_strcat_chk
;;FIXME: char * in __inline_strncat_chk
;;FIXME: char * in asctime
[:function clock [:unsigned-long]]
;;FIXME: char * in ctime
[:function difftime [:double :long :long]]
;;FIXME: struct tm * in getdate
;;FIXME: struct tm * in gmtime
;;FIXME: struct tm * in localtime
;;FIXME: struct tm * in mktime
;;FIXME: char *restrict in strftime
;;FIXME: char * in strptime
;;FIXME: time_t * in time
[:function tzset [:void]]
;;FIXME: char * in asctime_r
;;FIXME: char * in ctime_r
;;FIXME: struct tm * in gmtime_r
;;FIXME: struct tm * in localtime_r
[:function posix2time [:long :long]]
[:function tzsetwall [:void]]
[:function time2posix [:long :long]]
;;FIXME: struct tm *const in timelocal
;;FIXME: struct tm *const in timegm
;;FIXME: const struct timespec * in nanosleep
[:function imaxabs [:long :long]]
[:compound imaxdiv_t "sizeof (imaxdiv_t)"]
[:function imaxdiv [Foundation/imaxdiv_t :long :long]]
;;FIXME: char **restrict in strtoimax
;;FIXME: char **restrict in strtoumax
;;FIXME: const wchar_t *restrict in wcstoimax
;;FIXME: const wchar_t *restrict in wcstoumax
;;FIXME: void * in _Block_copy
;;FIXME: const void * in _Block_release
;;FIXME: void * in _Block_object_assign
;;FIXME: const void * in _Block_object_dispose
[:compound wide "sizeof (wide)"]
[:compound UnsignedWide "sizeof (UnsignedWide)"]
[:compound Float80 "sizeof (Float80)"]
[:compound Float96 "sizeof (Float96)"]
[:compound Float32Point "sizeof (Float32Point)"]
[:compound ProcessSerialNumber "sizeof (ProcessSerialNumber)"]
[:compound Point "sizeof (Point)"]
[:compound Rect "sizeof (Rect)"]
[:compound FixedPoint "sizeof (FixedPoint)"]
[:compound FixedRect "sizeof (FixedRect)"]
[:compound TimeRecord "sizeof (TimeRecord)"]
[:compound NumVersion "sizeof (NumVersion)"]
[:compound NumVersionVariant "sizeof (NumVersionVariant)"]
[:compound VersRec "sizeof (VersRec)"]
[:function Debugger [:void]]
;;FIXME: ConstStr255Param in DebugStr
[:function SysBreak [:void]]
;;FIXME: ConstStr255Param in SysBreakStr
;;FIXME: ConstStr255Param in SysBreakFunc
[:compound CFRange "sizeof (CFRange)"]
[:function CFRangeMake [Foundation/CFRange :long :long]]
[:function __CFRangeMake [Foundation/CFRange :long :long]]
[:function CFNullGetTypeID [:unsigned-long]]
[:compound CFAllocatorContext "sizeof (CFAllocatorContext)"]
[:function CFAllocatorGetTypeID [:unsigned-long]]
;;FIXME: CFAllocatorRef in CFAllocatorSetDefault
;;FIXME: CFAllocatorRef in CFAllocatorGetDefault
;;FIXME: CFAllocatorRef in CFAllocatorCreate
;;FIXME: void * in CFAllocatorAllocate
;;FIXME: void * in CFAllocatorReallocate
;;FIXME: CFAllocatorRef in CFAllocatorDeallocate
;;FIXME: CFAllocatorRef in CFAllocatorGetPreferredSizeForSize
;;FIXME: CFAllocatorRef in CFAllocatorGetContext
;;FIXME: CFTypeRef in CFGetTypeID
;;FIXME: CFStringRef in CFCopyTypeIDDescription
;;FIXME: CFTypeRef in CFRetain
;;FIXME: CFTypeRef in CFRelease
;;FIXME: CFTypeRef in CFGetRetainCount
;;FIXME: CFTypeRef in CFMakeCollectable
;;FIXME: CFTypeRef in CFEqual
;;FIXME: CFTypeRef in CFHash
;;FIXME: CFStringRef in CFCopyDescription
;;FIXME: CFAllocatorRef in CFGetAllocator
[:compound CFArrayCallBacks "sizeof (CFArrayCallBacks)"]
[:function CFArrayGetTypeID [:unsigned-long]]
;;FIXME: CFArrayRef in CFArrayCreate
;;FIXME: CFArrayRef in CFArrayCreateCopy
;;FIXME: CFMutableArrayRef in CFArrayCreateMutable
;;FIXME: CFMutableArrayRef in CFArrayCreateMutableCopy
;;FIXME: CFArrayRef in CFArrayGetCount
;;FIXME: CFArrayRef in CFArrayGetCountOfValue
;;FIXME: CFArrayRef in CFArrayContainsValue
;;FIXME: const void * in CFArrayGetValueAtIndex
;;FIXME: CFArrayRef in CFArrayGetValues
;;FIXME: CFArrayRef in CFArrayApplyFunction
;;FIXME: CFArrayRef in CFArrayGetFirstIndexOfValue
;;FIXME: CFArrayRef in CFArrayGetLastIndexOfValue
;;FIXME: CFArrayRef in CFArrayBSearchValues
;;FIXME: CFMutableArrayRef in CFArrayAppendValue
;;FIXME: CFMutableArrayRef in CFArrayInsertValueAtIndex
;;FIXME: CFMutableArrayRef in CFArraySetValueAtIndex
;;FIXME: CFMutableArrayRef in CFArrayRemoveValueAtIndex
;;FIXME: CFMutableArrayRef in CFArrayRemoveAllValues
;;FIXME: CFMutableArrayRef in CFArrayReplaceValues
;;FIXME: CFMutableArrayRef in CFArrayExchangeValuesAtIndices
;;FIXME: CFMutableArrayRef in CFArraySortValues
;;FIXME: CFMutableArrayRef in CFArrayAppendArray
[:compound CFBagCallBacks "sizeof (CFBagCallBacks)"]
[:function CFBagGetTypeID [:unsigned-long]]
;;FIXME: CFBagRef in CFBagCreate
;;FIXME: CFBagRef in CFBagCreateCopy
;;FIXME: CFMutableBagRef in CFBagCreateMutable
;;FIXME: CFMutableBagRef in CFBagCreateMutableCopy
;;FIXME: CFBagRef in CFBagGetCount
;;FIXME: CFBagRef in CFBagGetCountOfValue
;;FIXME: CFBagRef in CFBagContainsValue
;;FIXME: const void * in CFBagGetValue
;;FIXME: CFBagRef in CFBagGetValueIfPresent
;;FIXME: CFBagRef in CFBagGetValues
;;FIXME: CFBagRef in CFBagApplyFunction
;;FIXME: CFMutableBagRef in CFBagAddValue
;;FIXME: CFMutableBagRef in CFBagReplaceValue
;;FIXME: CFMutableBagRef in CFBagSetValue
;;FIXME: CFMutableBagRef in CFBagRemoveValue
;;FIXME: CFMutableBagRef in CFBagRemoveAllValues
[:compound CFBinaryHeapCompareContext "sizeof (CFBinaryHeapCompareContext)"]
[:compound CFBinaryHeapCallBacks "sizeof (CFBinaryHeapCallBacks)"]
[:function CFBinaryHeapGetTypeID [:unsigned-long]]
;;FIXME: CFBinaryHeapRef in CFBinaryHeapCreate
;;FIXME: CFBinaryHeapRef in CFBinaryHeapCreateCopy
;;FIXME: CFBinaryHeapRef in CFBinaryHeapGetCount
;;FIXME: CFBinaryHeapRef in CFBinaryHeapGetCountOfValue
;;FIXME: CFBinaryHeapRef in CFBinaryHeapContainsValue
;;FIXME: const void * in CFBinaryHeapGetMinimum
;;FIXME: CFBinaryHeapRef in CFBinaryHeapGetMinimumIfPresent
;;FIXME: CFBinaryHeapRef in CFBinaryHeapGetValues
;;FIXME: CFBinaryHeapRef in CFBinaryHeapApplyFunction
;;FIXME: CFBinaryHeapRef in CFBinaryHeapAddValue
;;FIXME: CFBinaryHeapRef in CFBinaryHeapRemoveMinimumValue
;;FIXME: CFBinaryHeapRef in CFBinaryHeapRemoveAllValues
[:function CFBitVectorGetTypeID [:unsigned-long]]
;;FIXME: CFBitVectorRef in CFBitVectorCreate
;;FIXME: CFBitVectorRef in CFBitVectorCreateCopy
;;FIXME: CFMutableBitVectorRef in CFBitVectorCreateMutable
;;FIXME: CFMutableBitVectorRef in CFBitVectorCreateMutableCopy
;;FIXME: CFBitVectorRef in CFBitVectorGetCount
;;FIXME: CFBitVectorRef in CFBitVectorGetCountOfBit
;;FIXME: CFBitVectorRef in CFBitVectorContainsBit
;;FIXME: CFBitVectorRef in CFBitVectorGetBitAtIndex
;;FIXME: CFBitVectorRef in CFBitVectorGetBits
;;FIXME: CFBitVectorRef in CFBitVectorGetFirstIndexOfBit
;;FIXME: CFBitVectorRef in CFBitVectorGetLastIndexOfBit
;;FIXME: CFMutableBitVectorRef in CFBitVectorSetCount
;;FIXME: CFMutableBitVectorRef in CFBitVectorFlipBitAtIndex
;;FIXME: CFMutableBitVectorRef in CFBitVectorFlipBits
;;FIXME: CFMutableBitVectorRef in CFBitVectorSetBitAtIndex
;;FIXME: CFMutableBitVectorRef in CFBitVectorSetBits
;;FIXME: CFMutableBitVectorRef in CFBitVectorSetAllBits
;;FIXME: const volatile void * in OSReadSwapInt16
;;FIXME: const volatile void * in OSReadSwapInt32
;;FIXME: const volatile void * in OSReadSwapInt64
;;FIXME: volatile void * in OSWriteSwapInt16
;;FIXME: volatile void * in OSWriteSwapInt32
;;FIXME: volatile void * in OSWriteSwapInt64
[:function OSHostByteOrder [:int]]
;;FIXME: const volatile void * in _OSReadInt16
;;FIXME: const volatile void * in _OSReadInt32
;;FIXME: const volatile void * in _OSReadInt64
;;FIXME: volatile void * in _OSWriteInt16
;;FIXME: volatile void * in _OSWriteInt32
;;FIXME: volatile void * in _OSWriteInt64
[:function CFByteOrderGetCurrent [:long]]
[:function CFSwapInt16 [:unsigned-short :unsigned-short]]
[:function CFSwapInt32 [:unsigned-int :unsigned-int]]
[:function CFSwapInt64 [:unsigned-long-long :unsigned-long-long]]
[:function CFSwapInt16BigToHost [:unsigned-short :unsigned-short]]
[:function CFSwapInt32BigToHost [:unsigned-int :unsigned-int]]
[:function CFSwapInt64BigToHost [:unsigned-long-long :unsigned-long-long]]
[:function CFSwapInt16HostToBig [:unsigned-short :unsigned-short]]
[:function CFSwapInt32HostToBig [:unsigned-int :unsigned-int]]
[:function CFSwapInt64HostToBig [:unsigned-long-long :unsigned-long-long]]
[:function CFSwapInt16LittleToHost [:unsigned-short :unsigned-short]]
[:function CFSwapInt32LittleToHost [:unsigned-int :unsigned-int]]
[:function CFSwapInt64LittleToHost [:unsigned-long-long :unsigned-long-long]]
[:function CFSwapInt16HostToLittle [:unsigned-short :unsigned-short]]
[:function CFSwapInt32HostToLittle [:unsigned-int :unsigned-int]]
[:function CFSwapInt64HostToLittle [:unsigned-long-long :unsigned-long-long]]
[:compound CFSwappedFloat32 "sizeof (CFSwappedFloat32)"]
[:compound CFSwappedFloat64 "sizeof (CFSwappedFloat64)"]
[:function CFConvertFloat32HostToSwapped [Foundation/CFSwappedFloat32 :float]]
[:function CFConvertFloat32SwappedToHost [:float Foundation/CFSwappedFloat32]]
[:function CFConvertFloat64HostToSwapped [Foundation/CFSwappedFloat64 :double]]
[:function CFConvertFloat64SwappedToHost [:double Foundation/CFSwappedFloat64]]
[:function CFConvertFloatHostToSwapped [Foundation/CFSwappedFloat32 :float]]
[:function CFConvertFloatSwappedToHost [:float Foundation/CFSwappedFloat32]]
[:function CFConvertDoubleHostToSwapped [Foundation/CFSwappedFloat64 :double]]
[:function CFConvertDoubleSwappedToHost [:double Foundation/CFSwappedFloat64]]
[:compound CFDictionaryKeyCallBacks "sizeof (CFDictionaryKeyCallBacks)"]
[:compound CFDictionaryValueCallBacks "sizeof (CFDictionaryValueCallBacks)"]
[:function CFDictionaryGetTypeID [:unsigned-long]]
;;FIXME: CFDictionaryRef in CFDictionaryCreate
;;FIXME: CFDictionaryRef in CFDictionaryCreateCopy
;;FIXME: CFMutableDictionaryRef in CFDictionaryCreateMutable
;;FIXME: CFMutableDictionaryRef in CFDictionaryCreateMutableCopy
;;FIXME: CFDictionaryRef in CFDictionaryGetCount
;;FIXME: CFDictionaryRef in CFDictionaryGetCountOfKey
;;FIXME: CFDictionaryRef in CFDictionaryGetCountOfValue
;;FIXME: CFDictionaryRef in CFDictionaryContainsKey
;;FIXME: CFDictionaryRef in CFDictionaryContainsValue
;;FIXME: const void * in CFDictionaryGetValue
;;FIXME: CFDictionaryRef in CFDictionaryGetValueIfPresent
;;FIXME: CFDictionaryRef in CFDictionaryGetKeysAndValues
;;FIXME: CFDictionaryRef in CFDictionaryApplyFunction
;;FIXME: CFMutableDictionaryRef in CFDictionaryAddValue
;;FIXME: CFMutableDictionaryRef in CFDictionarySetValue
;;FIXME: CFMutableDictionaryRef in CFDictionaryReplaceValue
;;FIXME: CFMutableDictionaryRef in CFDictionaryRemoveValue
;;FIXME: CFMutableDictionaryRef in CFDictionaryRemoveAllValues
[:function CFLocaleGetTypeID [:unsigned-long]]
;;FIXME: CFLocaleRef in CFLocaleGetSystem
;;FIXME: CFLocaleRef in CFLocaleCopyCurrent
;;FIXME: CFArrayRef in CFLocaleCopyAvailableLocaleIdentifiers
;;FIXME: CFArrayRef in CFLocaleCopyISOLanguageCodes
;;FIXME: CFArrayRef in CFLocaleCopyISOCountryCodes
;;FIXME: CFArrayRef in CFLocaleCopyISOCurrencyCodes
;;FIXME: CFArrayRef in CFLocaleCopyCommonISOCurrencyCodes
;;FIXME: CFArrayRef in CFLocaleCopyPreferredLanguages
;;FIXME: CFStringRef in CFLocaleCreateCanonicalLanguageIdentifierFromString
;;FIXME: CFStringRef in CFLocaleCreateCanonicalLocaleIdentifierFromString
;;FIXME: CFStringRef in CFLocaleCreateCanonicalLocaleIdentifierFromScriptManagerCodes
;;FIXME: CFStringRef in CFLocaleCreateLocaleIdentifierFromWindowsLocaleCode
;;FIXME: CFStringRef in CFLocaleGetWindowsLocaleCodeFromLocaleIdentifier
;;FIXME: CFLocaleLanguageDirection in CFLocaleGetLanguageCharacterDirection
;;FIXME: CFLocaleLanguageDirection in CFLocaleGetLanguageLineDirection
;;FIXME: CFDictionaryRef in CFLocaleCreateComponentsFromLocaleIdentifier
;;FIXME: CFStringRef in CFLocaleCreateLocaleIdentifierFromComponents
;;FIXME: CFLocaleRef in CFLocaleCreate
;;FIXME: CFLocaleRef in CFLocaleCreateCopy
;;FIXME: CFStringRef in CFLocaleGetIdentifier
;;FIXME: CFTypeRef in CFLocaleGetValue
;;FIXME: CFStringRef in CFLocaleCopyDisplayNameForPropertyValue
[:function CFAbsoluteTimeGetCurrent [:double]]
[:function CFDateGetTypeID [:unsigned-long]]
;;FIXME: CFDateRef in CFDateCreate
;;FIXME: CFDateRef in CFDateGetAbsoluteTime
;;FIXME: CFDateRef in CFDateGetTimeIntervalSinceDate
;;FIXME: CFComparisonResult in CFDateCompare
[:compound CFGregorianDate "sizeof (CFGregorianDate)"]
[:compound CFGregorianUnits "sizeof (CFGregorianUnits)"]
[:function CFGregorianDateIsValid [:unsigned-char Foundation/CFGregorianDate :unsigned-long]]
;;FIXME: CFTimeZoneRef in CFGregorianDateGetAbsoluteTime
;;FIXME: CFTimeZoneRef in CFAbsoluteTimeGetGregorianDate
;;FIXME: CFTimeZoneRef in CFAbsoluteTimeAddGregorianUnits
;;FIXME: CFTimeZoneRef in CFAbsoluteTimeGetDifferenceAsGregorianUnits
;;FIXME: CFTimeZoneRef in CFAbsoluteTimeGetDayOfWeek
;;FIXME: CFTimeZoneRef in CFAbsoluteTimeGetDayOfYear
;;FIXME: CFTimeZoneRef in CFAbsoluteTimeGetWeekOfYear
[:function CFDataGetTypeID [:unsigned-long]]
;;FIXME: CFDataRef in CFDataCreate
;;FIXME: CFDataRef in CFDataCreateWithBytesNoCopy
;;FIXME: CFDataRef in CFDataCreateCopy
;;FIXME: CFMutableDataRef in CFDataCreateMutable
;;FIXME: CFMutableDataRef in CFDataCreateMutableCopy
;;FIXME: CFDataRef in CFDataGetLength
;;FIXME: const UInt8 * in CFDataGetBytePtr
;;FIXME: UInt8 * in CFDataGetMutableBytePtr
;;FIXME: CFDataRef in CFDataGetBytes
;;FIXME: CFMutableDataRef in CFDataSetLength
;;FIXME: CFMutableDataRef in CFDataIncreaseLength
;;FIXME: CFMutableDataRef in CFDataAppendBytes
;;FIXME: CFMutableDataRef in CFDataReplaceBytes
;;FIXME: CFMutableDataRef in CFDataDeleteBytes
;;FIXME: CFDataRef in CFDataFind
[:function CFCharacterSetGetTypeID [:unsigned-long]]
;;FIXME: CFCharacterSetRef in CFCharacterSetGetPredefined
;;FIXME: CFCharacterSetRef in CFCharacterSetCreateWithCharactersInRange
;;FIXME: CFCharacterSetRef in CFCharacterSetCreateWithCharactersInString
;;FIXME: CFCharacterSetRef in CFCharacterSetCreateWithBitmapRepresentation
;;FIXME: CFCharacterSetRef in CFCharacterSetCreateInvertedSet
;;FIXME: CFCharacterSetRef in CFCharacterSetIsSupersetOfSet
;;FIXME: CFCharacterSetRef in CFCharacterSetHasMemberInPlane
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetCreateMutable
;;FIXME: CFCharacterSetRef in CFCharacterSetCreateCopy
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetCreateMutableCopy
;;FIXME: CFCharacterSetRef in CFCharacterSetIsCharacterMember
;;FIXME: CFCharacterSetRef in CFCharacterSetIsLongCharacterMember
;;FIXME: CFDataRef in CFCharacterSetCreateBitmapRepresentation
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetAddCharactersInRange
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetRemoveCharactersInRange
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetAddCharactersInString
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetRemoveCharactersInString
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetUnion
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetIntersect
;;FIXME: CFMutableCharacterSetRef in CFCharacterSetInvert
[:function CFStringGetTypeID [:unsigned-long]]
;;FIXME: CFStringRef in CFStringCreateWithPascalString
;;FIXME: CFStringRef in CFStringCreateWithCString
;;FIXME: CFStringRef in CFStringCreateWithBytes
;;FIXME: CFStringRef in CFStringCreateWithCharacters
;;FIXME: CFStringRef in CFStringCreateWithPascalStringNoCopy
;;FIXME: CFStringRef in CFStringCreateWithCStringNoCopy
;;FIXME: CFStringRef in CFStringCreateWithBytesNoCopy
;;FIXME: CFStringRef in CFStringCreateWithCharactersNoCopy
;;FIXME: CFStringRef in CFStringCreateWithSubstring
;;FIXME: CFStringRef in CFStringCreateCopy
;;FIXME: variadic CFStringCreateWithFormat
;;FIXME: CFStringRef in CFStringCreateWithFormatAndArguments
;;FIXME: CFMutableStringRef in CFStringCreateMutable
;;FIXME: CFMutableStringRef in CFStringCreateMutableCopy
;;FIXME: CFMutableStringRef in CFStringCreateMutableWithExternalCharactersNoCopy
;;FIXME: CFStringRef in CFStringGetLength
;;FIXME: CFStringRef in CFStringGetCharacterAtIndex
;;FIXME: CFStringRef in CFStringGetCharacters
;;FIXME: CFStringRef in CFStringGetPascalString
;;FIXME: CFStringRef in CFStringGetCString
;;FIXME: ConstStringPtr in CFStringGetPascalStringPtr
;;FIXME: CFStringRef in CFStringGetCStringPtr
;;FIXME: const UniChar * in CFStringGetCharactersPtr
;;FIXME: CFStringRef in CFStringGetBytes
;;FIXME: CFStringRef in CFStringCreateFromExternalRepresentation
;;FIXME: CFDataRef in CFStringCreateExternalRepresentation
;;FIXME: CFStringRef in CFStringGetSmallestEncoding
;;FIXME: CFStringRef in CFStringGetFastestEncoding
[:function CFStringGetSystemEncoding [:unsigned-int]]
[:function CFStringGetMaximumSizeForEncoding [:long :long :unsigned-int]]
;;FIXME: CFStringRef in CFStringGetFileSystemRepresentation
;;FIXME: CFStringRef in CFStringGetMaximumSizeOfFileSystemRepresentation
;;FIXME: CFStringRef in CFStringCreateWithFileSystemRepresentation
;;FIXME: CFComparisonResult in CFStringCompareWithOptionsAndLocale
;;FIXME: CFComparisonResult in CFStringCompareWithOptions
;;FIXME: CFComparisonResult in CFStringCompare
;;FIXME: CFStringRef in CFStringFindWithOptionsAndLocale
;;FIXME: CFStringRef in CFStringFindWithOptions
;;FIXME: CFArrayRef in CFStringCreateArrayWithFindResults
;;FIXME: CFStringRef in CFStringFind
;;FIXME: CFStringRef in CFStringHasPrefix
;;FIXME: CFStringRef in CFStringHasSuffix
;;FIXME: CFStringRef in CFStringGetRangeOfComposedCharactersAtIndex
;;FIXME: CFStringRef in CFStringFindCharacterFromSet
;;FIXME: CFStringRef in CFStringGetLineBounds
;;FIXME: CFStringRef in CFStringGetParagraphBounds
;;FIXME: CFStringRef in CFStringGetHyphenationLocationBeforeIndex
;;FIXME: CFLocaleRef in CFStringIsHyphenationAvailableForLocale
;;FIXME: CFStringRef in CFStringCreateByCombiningStrings
;;FIXME: CFArrayRef in CFStringCreateArrayBySeparatingStrings
;;FIXME: CFStringRef in CFStringGetIntValue
;;FIXME: CFStringRef in CFStringGetDoubleValue
;;FIXME: CFMutableStringRef in CFStringAppend
;;FIXME: CFMutableStringRef in CFStringAppendCharacters
;;FIXME: CFMutableStringRef in CFStringAppendPascalString
;;FIXME: CFMutableStringRef in CFStringAppendCString
;;FIXME: variadic CFStringAppendFormat
;;FIXME: CFMutableStringRef in CFStringAppendFormatAndArguments
;;FIXME: CFMutableStringRef in CFStringInsert
;;FIXME: CFMutableStringRef in CFStringDelete
;;FIXME: CFMutableStringRef in CFStringReplace
;;FIXME: CFMutableStringRef in CFStringReplaceAll
;;FIXME: CFMutableStringRef in CFStringFindAndReplace
;;FIXME: CFMutableStringRef in CFStringSetExternalCharactersNoCopy
;;FIXME: CFMutableStringRef in CFStringPad
;;FIXME: CFMutableStringRef in CFStringTrim
;;FIXME: CFMutableStringRef in CFStringTrimWhitespace
;;FIXME: CFMutableStringRef in CFStringLowercase
;;FIXME: CFMutableStringRef in CFStringUppercase
;;FIXME: CFMutableStringRef in CFStringCapitalize
;;FIXME: CFMutableStringRef in CFStringNormalize
;;FIXME: CFMutableStringRef in CFStringFold
;;FIXME: CFMutableStringRef in CFStringTransform
[:function CFStringIsEncodingAvailable [:unsigned-char :unsigned-int]]
;;FIXME: const CFStringEncoding * in CFStringGetListOfAvailableEncodings
;;FIXME: CFStringRef in CFStringGetNameOfEncoding
[:function CFStringConvertEncodingToNSStringEncoding [:unsigned-long :unsigned-int]]
[:function CFStringConvertNSStringEncodingToEncoding [:unsigned-int :unsigned-long]]
[:function CFStringConvertEncodingToWindowsCodepage [:unsigned-int :unsigned-int]]
[:function CFStringConvertWindowsCodepageToEncoding [:unsigned-int :unsigned-int]]
;;FIXME: CFStringRef in CFStringConvertIANACharSetNameToEncoding
;;FIXME: CFStringRef in CFStringConvertEncodingToIANACharSetName
[:function CFStringGetMostCompatibleMacStringEncoding [:unsigned-int :unsigned-int]]
[:compound CFStringInlineBuffer "sizeof (CFStringInlineBuffer)"]
;;FIXME: CFStringRef in CFStringInitInlineBuffer
;;FIXME: CFStringInlineBuffer * in CFStringGetCharacterFromInlineBuffer
[:function CFStringIsSurrogateHighCharacter [:unsigned-char :unsigned-short]]
[:function CFStringIsSurrogateLowCharacter [:unsigned-char :unsigned-short]]
[:function CFStringGetLongCharacterForSurrogatePair [:unsigned-int :unsigned-short :unsigned-short]]
;;FIXME: UniChar * in CFStringGetSurrogatePairForLongCharacter
;;FIXME: CFTypeRef in CFShow
;;FIXME: CFStringRef in CFShowStr
;;FIXME: CFStringRef in __CFStringMakeConstantString
[:function CFTimeZoneGetTypeID [:unsigned-long]]
;;FIXME: CFTimeZoneRef in CFTimeZoneCopySystem
[:function CFTimeZoneResetSystem [:void]]
;;FIXME: CFTimeZoneRef in CFTimeZoneCopyDefault
;;FIXME: CFTimeZoneRef in CFTimeZoneSetDefault
;;FIXME: CFArrayRef in CFTimeZoneCopyKnownNames
;;FIXME: CFDictionaryRef in CFTimeZoneCopyAbbreviationDictionary
;;FIXME: CFDictionaryRef in CFTimeZoneSetAbbreviationDictionary
;;FIXME: CFTimeZoneRef in CFTimeZoneCreate
;;FIXME: CFTimeZoneRef in CFTimeZoneCreateWithTimeIntervalFromGMT
;;FIXME: CFTimeZoneRef in CFTimeZoneCreateWithName
;;FIXME: CFStringRef in CFTimeZoneGetName
;;FIXME: CFDataRef in CFTimeZoneGetData
;;FIXME: CFTimeZoneRef in CFTimeZoneGetSecondsFromGMT
;;FIXME: CFStringRef in CFTimeZoneCopyAbbreviation
;;FIXME: CFTimeZoneRef in CFTimeZoneIsDaylightSavingTime
;;FIXME: CFTimeZoneRef in CFTimeZoneGetDaylightSavingTimeOffset
;;FIXME: CFTimeZoneRef in CFTimeZoneGetNextDaylightSavingTimeTransition
;;FIXME: CFStringRef in CFTimeZoneCopyLocalizedName
[:function CFCalendarGetTypeID [:unsigned-long]]
;;FIXME: CFCalendarRef in CFCalendarCopyCurrent
;;FIXME: CFCalendarRef in CFCalendarCreateWithIdentifier
;;FIXME: CFStringRef in CFCalendarGetIdentifier
;;FIXME: CFLocaleRef in CFCalendarCopyLocale
;;FIXME: CFCalendarRef in CFCalendarSetLocale
;;FIXME: CFTimeZoneRef in CFCalendarCopyTimeZone
;;FIXME: CFCalendarRef in CFCalendarSetTimeZone
;;FIXME: CFCalendarRef in CFCalendarGetFirstWeekday
;;FIXME: CFCalendarRef in CFCalendarSetFirstWeekday
;;FIXME: CFCalendarRef in CFCalendarGetMinimumDaysInFirstWeek
;;FIXME: CFCalendarRef in CFCalendarSetMinimumDaysInFirstWeek
;;FIXME: CFCalendarRef in CFCalendarGetMinimumRangeOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetMaximumRangeOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetRangeOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetOrdinalityOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetTimeRangeOfUnit
;;FIXME: variadic CFCalendarComposeAbsoluteTime
;;FIXME: variadic CFCalendarDecomposeAbsoluteTime
;;FIXME: variadic CFCalendarAddComponents
;;FIXME: variadic CFCalendarGetComponentDifference
;;FIXME: CFStringRef in CFDateFormatterCreateDateFormatFromTemplate
[:function CFDateFormatterGetTypeID [:unsigned-long]]
;;FIXME: CFDateFormatterRef in CFDateFormatterCreate
;;FIXME: CFLocaleRef in CFDateFormatterGetLocale
;;FIXME: CFDateFormatterStyle in CFDateFormatterGetDateStyle
;;FIXME: CFDateFormatterStyle in CFDateFormatterGetTimeStyle
;;FIXME: CFStringRef in CFDateFormatterGetFormat
;;FIXME: CFDateFormatterRef in CFDateFormatterSetFormat
;;FIXME: CFStringRef in CFDateFormatterCreateStringWithDate
;;FIXME: CFStringRef in CFDateFormatterCreateStringWithAbsoluteTime
;;FIXME: CFDateRef in CFDateFormatterCreateDateFromString
;;FIXME: CFDateFormatterRef in CFDateFormatterGetAbsoluteTimeFromString
;;FIXME: CFDateFormatterRef in CFDateFormatterSetProperty
;;FIXME: CFTypeRef in CFDateFormatterCopyProperty
[:function CFErrorGetTypeID [:unsigned-long]]
;;FIXME: CFErrorRef in CFErrorCreate
;;FIXME: CFErrorRef in CFErrorCreateWithUserInfoKeysAndValues
;;FIXME: CFStringRef in CFErrorGetDomain
;;FIXME: CFErrorRef in CFErrorGetCode
;;FIXME: CFDictionaryRef in CFErrorCopyUserInfo
;;FIXME: CFStringRef in CFErrorCopyDescription
;;FIXME: CFStringRef in CFErrorCopyFailureReason
;;FIXME: CFStringRef in CFErrorCopyRecoverySuggestion
[:function CFBooleanGetTypeID [:unsigned-long]]
;;FIXME: CFBooleanRef in CFBooleanGetValue
[:function CFNumberGetTypeID [:unsigned-long]]
;;FIXME: CFNumberRef in CFNumberCreate
;;FIXME: CFNumberType in CFNumberGetType
;;FIXME: CFNumberRef in CFNumberGetByteSize
;;FIXME: CFNumberRef in CFNumberIsFloatType
;;FIXME: CFNumberRef in CFNumberGetValue
;;FIXME: CFComparisonResult in CFNumberCompare
[:function CFNumberFormatterGetTypeID [:unsigned-long]]
;;FIXME: CFNumberFormatterRef in CFNumberFormatterCreate
;;FIXME: CFLocaleRef in CFNumberFormatterGetLocale
;;FIXME: CFNumberFormatterStyle in CFNumberFormatterGetStyle
;;FIXME: CFStringRef in CFNumberFormatterGetFormat
;;FIXME: CFNumberFormatterRef in CFNumberFormatterSetFormat
;;FIXME: CFStringRef in CFNumberFormatterCreateStringWithNumber
;;FIXME: CFStringRef in CFNumberFormatterCreateStringWithValue
;;FIXME: CFNumberRef in CFNumberFormatterCreateNumberFromString
;;FIXME: CFNumberFormatterRef in CFNumberFormatterGetValueFromString
;;FIXME: CFNumberFormatterRef in CFNumberFormatterSetProperty
;;FIXME: CFTypeRef in CFNumberFormatterCopyProperty
;;FIXME: CFStringRef in CFNumberFormatterGetDecimalInfoForCurrencyCode
;;FIXME: CFPropertyListRef in CFPreferencesCopyAppValue
;;FIXME: CFStringRef in CFPreferencesGetAppBooleanValue
;;FIXME: CFStringRef in CFPreferencesGetAppIntegerValue
;;FIXME: CFStringRef in CFPreferencesSetAppValue
;;FIXME: CFStringRef in CFPreferencesAddSuitePreferencesToApp
;;FIXME: CFStringRef in CFPreferencesRemoveSuitePreferencesFromApp
;;FIXME: CFStringRef in CFPreferencesAppSynchronize
;;FIXME: CFPropertyListRef in CFPreferencesCopyValue
;;FIXME: CFDictionaryRef in CFPreferencesCopyMultiple
;;FIXME: CFStringRef in CFPreferencesSetValue
;;FIXME: CFDictionaryRef in CFPreferencesSetMultiple
;;FIXME: CFStringRef in CFPreferencesSynchronize
;;FIXME: CFArrayRef in CFPreferencesCopyApplicationList
;;FIXME: CFArrayRef in CFPreferencesCopyKeyList
;;FIXME: CFStringRef in CFPreferencesAppValueIsForced
[:function CFURLGetTypeID [:unsigned-long]]
;;FIXME: CFURLRef in CFURLCreateWithBytes
;;FIXME: CFDataRef in CFURLCreateData
;;FIXME: CFURLRef in CFURLCreateWithString
;;FIXME: CFURLRef in CFURLCreateAbsoluteURLWithBytes
;;FIXME: CFURLRef in CFURLCreateWithFileSystemPath
;;FIXME: CFURLRef in CFURLCreateFromFileSystemRepresentation
;;FIXME: CFURLRef in CFURLCreateWithFileSystemPathRelativeToBase
;;FIXME: CFURLRef in CFURLCreateFromFileSystemRepresentationRelativeToBase
;;FIXME: CFURLRef in CFURLGetFileSystemRepresentation
;;FIXME: CFURLRef in CFURLCopyAbsoluteURL
;;FIXME: CFStringRef in CFURLGetString
;;FIXME: CFURLRef in CFURLGetBaseURL
;;FIXME: CFURLRef in CFURLCanBeDecomposed
;;FIXME: CFStringRef in CFURLCopyScheme
;;FIXME: CFStringRef in CFURLCopyNetLocation
;;FIXME: CFStringRef in CFURLCopyPath
;;FIXME: CFStringRef in CFURLCopyStrictPath
;;FIXME: CFStringRef in CFURLCopyFileSystemPath
;;FIXME: CFURLRef in CFURLHasDirectoryPath
;;FIXME: CFStringRef in CFURLCopyResourceSpecifier
;;FIXME: CFStringRef in CFURLCopyHostName
;;FIXME: CFURLRef in CFURLGetPortNumber
;;FIXME: CFStringRef in CFURLCopyUserName
;;FIXME: CFStringRef in CFURLCopyPassword
;;FIXME: CFStringRef in CFURLCopyParameterString
;;FIXME: CFStringRef in CFURLCopyQueryString
;;FIXME: CFStringRef in CFURLCopyFragment
;;FIXME: CFStringRef in CFURLCopyLastPathComponent
;;FIXME: CFStringRef in CFURLCopyPathExtension
;;FIXME: CFURLRef in CFURLCreateCopyAppendingPathComponent
;;FIXME: CFURLRef in CFURLCreateCopyDeletingLastPathComponent
;;FIXME: CFURLRef in CFURLCreateCopyAppendingPathExtension
;;FIXME: CFURLRef in CFURLCreateCopyDeletingPathExtension
;;FIXME: CFURLRef in CFURLGetBytes
;;FIXME: CFURLRef in CFURLGetByteRangeForComponent
;;FIXME: CFStringRef in CFURLCreateStringByReplacingPercentEscapes
;;FIXME: CFStringRef in CFURLCreateStringByReplacingPercentEscapesUsingEncoding
;;FIXME: CFStringRef in CFURLCreateStringByAddingPercentEscapes
;;FIXME: CFURLRef in CFURLCreateFileReferenceURL
;;FIXME: CFURLRef in CFURLCreateFilePathURL
;;FIXME: CFURLRef in CFURLCreateFromFSRef
;;FIXME: CFURLRef in CFURLGetFSRef
;;FIXME: CFURLRef in CFURLCopyResourcePropertyForKey
;;FIXME: CFDictionaryRef in CFURLCopyResourcePropertiesForKeys
;;FIXME: CFURLRef in CFURLSetResourcePropertyForKey
;;FIXME: CFURLRef in CFURLSetResourcePropertiesForKeys
;;FIXME: CFURLRef in CFURLClearResourcePropertyCacheForKey
;;FIXME: CFURLRef in CFURLClearResourcePropertyCache
;;FIXME: CFURLRef in CFURLSetTemporaryResourcePropertyForKey
;;FIXME: CFURLRef in CFURLResourceIsReachable
;;FIXME: CFDataRef in CFURLCreateBookmarkData
;;FIXME: CFURLRef in CFURLCreateByResolvingBookmarkData
;;FIXME: CFDictionaryRef in CFURLCreateResourcePropertiesForKeysFromBookmarkData
;;FIXME: CFTypeRef in CFURLCreateResourcePropertyForKeyFromBookmarkData
;;FIXME: CFDataRef in CFURLCreateBookmarkDataFromFile
;;FIXME: CFDataRef in CFURLWriteBookmarkDataToFile
;;FIXME: CFDataRef in CFURLCreateBookmarkDataFromAliasRecord
;;FIXME: CFURLRef in CFURLStartAccessingSecurityScopedResource
;;FIXME: CFURLRef in CFURLStopAccessingSecurityScopedResource
[:compound mach_port_status_t "sizeof (mach_port_status_t)"]
[:compound mach_port_limits_t "sizeof (mach_port_limits_t)"]
[:compound mach_port_qos_t "sizeof (mach_port_qos_t)"]
[:function CFRunLoopGetTypeID [:unsigned-long]]
;;FIXME: CFRunLoopRef in CFRunLoopGetCurrent
;;FIXME: CFRunLoopRef in CFRunLoopGetMain
;;FIXME: CFStringRef in CFRunLoopCopyCurrentMode
;;FIXME: CFArrayRef in CFRunLoopCopyAllModes
;;FIXME: CFRunLoopRef in CFRunLoopAddCommonMode
;;FIXME: CFRunLoopRef in CFRunLoopGetNextTimerFireDate
[:function CFRunLoopRun [:void]]
;;FIXME: CFStringRef in CFRunLoopRunInMode
;;FIXME: CFRunLoopRef in CFRunLoopIsWaiting
;;FIXME: CFRunLoopRef in CFRunLoopWakeUp
;;FIXME: CFRunLoopRef in CFRunLoopStop
;;FIXME: CFRunLoopRef in CFRunLoopPerformBlock
;;FIXME: CFRunLoopRef in CFRunLoopContainsSource
;;FIXME: CFRunLoopRef in CFRunLoopAddSource
;;FIXME: CFRunLoopRef in CFRunLoopRemoveSource
;;FIXME: CFRunLoopRef in CFRunLoopContainsObserver
;;FIXME: CFRunLoopRef in CFRunLoopAddObserver
;;FIXME: CFRunLoopRef in CFRunLoopRemoveObserver
;;FIXME: CFRunLoopRef in CFRunLoopContainsTimer
;;FIXME: CFRunLoopRef in CFRunLoopAddTimer
;;FIXME: CFRunLoopRef in CFRunLoopRemoveTimer
[:compound CFRunLoopSourceContext "sizeof (CFRunLoopSourceContext)"]
[:compound CFRunLoopSourceContext1 "sizeof (CFRunLoopSourceContext1)"]
[:function CFRunLoopSourceGetTypeID [:unsigned-long]]
;;FIXME: CFRunLoopSourceRef in CFRunLoopSourceCreate
;;FIXME: CFRunLoopSourceRef in CFRunLoopSourceGetOrder
;;FIXME: CFRunLoopSourceRef in CFRunLoopSourceInvalidate
;;FIXME: CFRunLoopSourceRef in CFRunLoopSourceIsValid
;;FIXME: CFRunLoopSourceRef in CFRunLoopSourceGetContext
;;FIXME: CFRunLoopSourceRef in CFRunLoopSourceSignal
[:compound CFRunLoopObserverContext "sizeof (CFRunLoopObserverContext)"]
[:function CFRunLoopObserverGetTypeID [:unsigned-long]]
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverCreate
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverCreateWithHandler
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverGetActivities
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverDoesRepeat
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverGetOrder
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverInvalidate
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverIsValid
;;FIXME: CFRunLoopObserverRef in CFRunLoopObserverGetContext
[:compound CFRunLoopTimerContext "sizeof (CFRunLoopTimerContext)"]
[:function CFRunLoopTimerGetTypeID [:unsigned-long]]
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerCreate
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerCreateWithHandler
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerGetNextFireDate
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerSetNextFireDate
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerGetInterval
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerDoesRepeat
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerGetOrder
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerInvalidate
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerIsValid
;;FIXME: CFRunLoopTimerRef in CFRunLoopTimerGetContext
[:compound CFSocketSignature "sizeof (CFSocketSignature)"]
[:compound CFSocketContext "sizeof (CFSocketContext)"]
[:function CFSocketGetTypeID [:unsigned-long]]
;;FIXME: CFSocketRef in CFSocketCreate
;;FIXME: CFSocketRef in CFSocketCreateWithNative
;;FIXME: CFSocketRef in CFSocketCreateWithSocketSignature
;;FIXME: CFSocketRef in CFSocketCreateConnectedToSocketSignature
;;FIXME: CFSocketError in CFSocketSetAddress
;;FIXME: CFSocketError in CFSocketConnectToAddress
;;FIXME: CFSocketRef in CFSocketInvalidate
;;FIXME: CFSocketRef in CFSocketIsValid
;;FIXME: CFDataRef in CFSocketCopyAddress
;;FIXME: CFDataRef in CFSocketCopyPeerAddress
;;FIXME: CFSocketRef in CFSocketGetContext
;;FIXME: CFSocketRef in CFSocketGetNative
;;FIXME: CFRunLoopSourceRef in CFSocketCreateRunLoopSource
;;FIXME: CFSocketRef in CFSocketGetSocketFlags
;;FIXME: CFSocketRef in CFSocketSetSocketFlags
;;FIXME: CFSocketRef in CFSocketDisableCallBacks
;;FIXME: CFSocketRef in CFSocketEnableCallBacks
;;FIXME: CFSocketError in CFSocketSendData
;;FIXME: CFSocketError in CFSocketRegisterValue
;;FIXME: CFSocketError in CFSocketCopyRegisteredValue
;;FIXME: CFSocketError in CFSocketRegisterSocketSignature
;;FIXME: CFSocketError in CFSocketCopyRegisteredSocketSignature
;;FIXME: CFSocketError in CFSocketUnregister
[:function CFSocketSetDefaultNameRegistryPortNumber [:void :unsigned-short]]
[:function CFSocketGetDefaultNameRegistryPortNumber [:unsigned-short]]
[:compound CFStreamClientContext "sizeof (CFStreamClientContext)"]
[:function CFReadStreamGetTypeID [:unsigned-long]]
[:function CFWriteStreamGetTypeID [:unsigned-long]]
;;FIXME: CFReadStreamRef in CFReadStreamCreateWithBytesNoCopy
;;FIXME: CFWriteStreamRef in CFWriteStreamCreateWithBuffer
;;FIXME: CFWriteStreamRef in CFWriteStreamCreateWithAllocatedBuffers
;;FIXME: CFReadStreamRef in CFReadStreamCreateWithFile
;;FIXME: CFWriteStreamRef in CFWriteStreamCreateWithFile
;;FIXME: CFAllocatorRef in CFStreamCreateBoundPair
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithSocket
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithSocketToHost
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithPeerSocketSignature
;;FIXME: CFStreamStatus in CFReadStreamGetStatus
;;FIXME: CFStreamStatus in CFWriteStreamGetStatus
;;FIXME: CFErrorRef in CFReadStreamCopyError
;;FIXME: CFErrorRef in CFWriteStreamCopyError
;;FIXME: CFReadStreamRef in CFReadStreamOpen
;;FIXME: CFWriteStreamRef in CFWriteStreamOpen
;;FIXME: CFReadStreamRef in CFReadStreamClose
;;FIXME: CFWriteStreamRef in CFWriteStreamClose
;;FIXME: CFReadStreamRef in CFReadStreamHasBytesAvailable
;;FIXME: CFReadStreamRef in CFReadStreamRead
;;FIXME: const UInt8 * in CFReadStreamGetBuffer
;;FIXME: CFWriteStreamRef in CFWriteStreamCanAcceptBytes
;;FIXME: CFWriteStreamRef in CFWriteStreamWrite
;;FIXME: CFTypeRef in CFReadStreamCopyProperty
;;FIXME: CFTypeRef in CFWriteStreamCopyProperty
;;FIXME: CFReadStreamRef in CFReadStreamSetProperty
;;FIXME: CFWriteStreamRef in CFWriteStreamSetProperty
;;FIXME: CFReadStreamRef in CFReadStreamSetClient
;;FIXME: CFWriteStreamRef in CFWriteStreamSetClient
;;FIXME: CFReadStreamRef in CFReadStreamScheduleWithRunLoop
;;FIXME: CFWriteStreamRef in CFWriteStreamScheduleWithRunLoop
;;FIXME: CFReadStreamRef in CFReadStreamUnscheduleFromRunLoop
;;FIXME: CFWriteStreamRef in CFWriteStreamUnscheduleFromRunLoop
[:compound CFStreamError "sizeof (CFStreamError)"]
;;FIXME: CFReadStreamRef in CFReadStreamGetError
;;FIXME: CFWriteStreamRef in CFWriteStreamGetError
;;FIXME: CFPropertyListRef in CFPropertyListCreateFromXMLData
;;FIXME: CFDataRef in CFPropertyListCreateXMLData
;;FIXME: CFPropertyListRef in CFPropertyListCreateDeepCopy
;;FIXME: CFPropertyListRef in CFPropertyListIsValid
;;FIXME: CFPropertyListRef in CFPropertyListWriteToStream
;;FIXME: CFPropertyListRef in CFPropertyListCreateFromStream
;;FIXME: CFPropertyListRef in CFPropertyListCreateWithData
;;FIXME: CFPropertyListRef in CFPropertyListCreateWithStream
;;FIXME: CFPropertyListRef in CFPropertyListWrite
;;FIXME: CFDataRef in CFPropertyListCreateData
[:compound CFSetCallBacks "sizeof (CFSetCallBacks)"]
[:function CFSetGetTypeID [:unsigned-long]]
;;FIXME: CFSetRef in CFSetCreate
;;FIXME: CFSetRef in CFSetCreateCopy
;;FIXME: CFMutableSetRef in CFSetCreateMutable
;;FIXME: CFMutableSetRef in CFSetCreateMutableCopy
;;FIXME: CFSetRef in CFSetGetCount
;;FIXME: CFSetRef in CFSetGetCountOfValue
;;FIXME: CFSetRef in CFSetContainsValue
;;FIXME: const void * in CFSetGetValue
;;FIXME: CFSetRef in CFSetGetValueIfPresent
;;FIXME: CFSetRef in CFSetGetValues
;;FIXME: CFSetRef in CFSetApplyFunction
;;FIXME: CFMutableSetRef in CFSetAddValue
;;FIXME: CFMutableSetRef in CFSetReplaceValue
;;FIXME: CFMutableSetRef in CFSetSetValue
;;FIXME: CFMutableSetRef in CFSetRemoveValue
;;FIXME: CFMutableSetRef in CFSetRemoveAllValues
[:compound CFTreeContext "sizeof (CFTreeContext)"]
[:function CFTreeGetTypeID [:unsigned-long]]
;;FIXME: CFTreeRef in CFTreeCreate
;;FIXME: CFTreeRef in CFTreeGetParent
;;FIXME: CFTreeRef in CFTreeGetNextSibling
;;FIXME: CFTreeRef in CFTreeGetFirstChild
;;FIXME: CFTreeRef in CFTreeGetContext
;;FIXME: CFTreeRef in CFTreeGetChildCount
;;FIXME: CFTreeRef in CFTreeGetChildAtIndex
;;FIXME: CFTreeRef in CFTreeGetChildren
;;FIXME: CFTreeRef in CFTreeApplyFunctionToChildren
;;FIXME: CFTreeRef in CFTreeFindRoot
;;FIXME: CFTreeRef in CFTreeSetContext
;;FIXME: CFTreeRef in CFTreePrependChild
;;FIXME: CFTreeRef in CFTreeAppendChild
;;FIXME: CFTreeRef in CFTreeInsertSibling
;;FIXME: CFTreeRef in CFTreeRemove
;;FIXME: CFTreeRef in CFTreeRemoveAllChildren
;;FIXME: CFTreeRef in CFTreeSortChildren
;;FIXME: CFAllocatorRef in CFURLCreateDataAndPropertiesFromResource
;;FIXME: CFURLRef in CFURLWriteDataAndPropertiesToResource
;;FIXME: CFURLRef in CFURLDestroyResource
;;FIXME: CFTypeRef in CFURLCreatePropertyFromResource
[:compound CFUUIDBytes "sizeof (CFUUIDBytes)"]
[:function CFUUIDGetTypeID [:unsigned-long]]
;;FIXME: CFUUIDRef in CFUUIDCreate
;;FIXME: CFUUIDRef in CFUUIDCreateWithBytes
;;FIXME: CFUUIDRef in CFUUIDCreateFromString
;;FIXME: CFStringRef in CFUUIDCreateString
;;FIXME: CFUUIDRef in CFUUIDGetConstantUUIDWithBytes
;;FIXME: CFUUIDRef in CFUUIDGetUUIDBytes
;;FIXME: CFUUIDRef in CFUUIDCreateFromUUIDBytes
;;FIXME: CFURLRef in CFCopyHomeDirectoryURL
;;FIXME: CFBundleRef in CFBundleGetMainBundle
;;FIXME: CFBundleRef in CFBundleGetBundleWithIdentifier
;;FIXME: CFArrayRef in CFBundleGetAllBundles
[:function CFBundleGetTypeID [:unsigned-long]]
;;FIXME: CFBundleRef in CFBundleCreate
;;FIXME: CFArrayRef in CFBundleCreateBundlesFromDirectory
;;FIXME: CFURLRef in CFBundleCopyBundleURL
;;FIXME: CFTypeRef in CFBundleGetValueForInfoDictionaryKey
;;FIXME: CFDictionaryRef in CFBundleGetInfoDictionary
;;FIXME: CFDictionaryRef in CFBundleGetLocalInfoDictionary
;;FIXME: CFBundleRef in CFBundleGetPackageInfo
;;FIXME: CFStringRef in CFBundleGetIdentifier
;;FIXME: CFBundleRef in CFBundleGetVersionNumber
;;FIXME: CFStringRef in CFBundleGetDevelopmentRegion
;;FIXME: CFURLRef in CFBundleCopySupportFilesDirectoryURL
;;FIXME: CFURLRef in CFBundleCopyResourcesDirectoryURL
;;FIXME: CFURLRef in CFBundleCopyPrivateFrameworksURL
;;FIXME: CFURLRef in CFBundleCopySharedFrameworksURL
;;FIXME: CFURLRef in CFBundleCopySharedSupportURL
;;FIXME: CFURLRef in CFBundleCopyBuiltInPlugInsURL
;;FIXME: CFDictionaryRef in CFBundleCopyInfoDictionaryInDirectory
;;FIXME: CFURLRef in CFBundleGetPackageInfoInDirectory
;;FIXME: CFURLRef in CFBundleCopyResourceURL
;;FIXME: CFArrayRef in CFBundleCopyResourceURLsOfType
;;FIXME: CFStringRef in CFBundleCopyLocalizedString
;;FIXME: CFURLRef in CFBundleCopyResourceURLInDirectory
;;FIXME: CFArrayRef in CFBundleCopyResourceURLsOfTypeInDirectory
;;FIXME: CFArrayRef in CFBundleCopyBundleLocalizations
;;FIXME: CFArrayRef in CFBundleCopyPreferredLocalizationsFromArray
;;FIXME: CFArrayRef in CFBundleCopyLocalizationsForPreferences
;;FIXME: CFURLRef in CFBundleCopyResourceURLForLocalization
;;FIXME: CFArrayRef in CFBundleCopyResourceURLsOfTypeForLocalization
;;FIXME: CFDictionaryRef in CFBundleCopyInfoDictionaryForURL
;;FIXME: CFArrayRef in CFBundleCopyLocalizationsForURL
;;FIXME: CFArrayRef in CFBundleCopyExecutableArchitecturesForURL
;;FIXME: CFURLRef in CFBundleCopyExecutableURL
;;FIXME: CFArrayRef in CFBundleCopyExecutableArchitectures
;;FIXME: CFBundleRef in CFBundlePreflightExecutable
;;FIXME: CFBundleRef in CFBundleLoadExecutableAndReturnError
;;FIXME: CFBundleRef in CFBundleLoadExecutable
;;FIXME: CFBundleRef in CFBundleIsExecutableLoaded
;;FIXME: CFBundleRef in CFBundleUnloadExecutable
;;FIXME: void * in CFBundleGetFunctionPointerForName
;;FIXME: CFBundleRef in CFBundleGetFunctionPointersForNames
;;FIXME: void * in CFBundleGetDataPointerForName
;;FIXME: CFBundleRef in CFBundleGetDataPointersForNames
;;FIXME: CFURLRef in CFBundleCopyAuxiliaryExecutableURL
;;FIXME: CFPlugInRef in CFBundleGetPlugIn
;;FIXME: CFBundleRef in CFBundleOpenBundleResourceMap
;;FIXME: CFBundleRef in CFBundleOpenBundleResourceFiles
;;FIXME: CFBundleRef in CFBundleCloseBundleResourceMap
[:function _exit [:void :int]]
[:function access [:int :c-string-const :int]]
[:function alarm [:unsigned-int :unsigned-int]]
[:function chdir [:int :c-string-const]]
[:function chown [:int :c-string-const :unsigned-int :unsigned-int]]
[:function close [:int :int]]
[:function dup [:int :int]]
[:function dup2 [:int :int :int]]
;;FIXME: variadic execl
;;FIXME: variadic execle
;;FIXME: variadic execlp
;;FIXME: char *const * in execv
;;FIXME: char *const * in execve
;;FIXME: char *const * in execvp
[:function fork [:int]]
[:function fpathconf [:long :int :int]]
;;FIXME: char * in getcwd
[:function getegid [:unsigned-int]]
[:function geteuid [:unsigned-int]]
[:function getgid [:unsigned-int]]
;;FIXME: gid_t [] in getgroups
;;FIXME: char * in getlogin
[:function getpgrp [:int]]
[:function getpid [:int]]
[:function getppid [:int]]
[:function getuid [:unsigned-int]]
[:function isatty [:int :int]]
[:function link [:int :c-string-const :c-string-const]]
[:function lseek [:long-long :int :long-long :int]]
[:function pathconf [:long :c-string-const :int]]
[:function pause [:int]]
;;FIXME: int [2] in pipe
;;FIXME: void * in read
[:function rmdir [:int :c-string-const]]
[:function setgid [:int :unsigned-int]]
[:function setpgid [:int :int :int]]
[:function setsid [:int]]
[:function setuid [:int :unsigned-int]]
[:function sleep [:unsigned-int :unsigned-int]]
[:function sysconf [:long :int]]
[:function tcgetpgrp [:int :int]]
[:function tcsetpgrp [:int :int :int]]
;;FIXME: char * in ttyname
;;FIXME: char * in ttyname_r
[:function unlink [:int :c-string-const]]
;;FIXME: const void * in write
;;FIXME: char * in confstr
;;FIXME: char *const [] in getopt
;;FIXME: void * in brk
[:function chroot [:int :c-string-const]]
;;FIXME: char * in crypt
;;FIXME: char * in encrypt
[:function fchdir [:int :int]]
[:function gethostid [:long]]
[:function getpgid [:int :int]]
[:function getsid [:int :int]]
[:function getdtablesize [:int]]
[:function getpagesize [:int]]
;;FIXME: char * in getpass
;;FIXME: char * in getwd
[:function lchown [:int :c-string-const :unsigned-int :unsigned-int]]
[:function lockf [:int :int :int :long-long]]
[:function nice [:int :int]]
;;FIXME: void * in pread
;;FIXME: const void * in pwrite
;;FIXME: void * in sbrk
[:function setpgrp [:int]]
[:function setregid [:int :unsigned-int :unsigned-int]]
[:function setreuid [:int :unsigned-int :unsigned-int]]
;;FIXME: const void *restrict in swab
[:function sync [:void]]
[:function truncate [:int :c-string-const :long-long]]
[:function ualarm [:unsigned-int :unsigned-int :unsigned-int]]
[:function usleep [:int :unsigned-int]]
[:function vfork [:int]]
[:function fsync [:int :int]]
[:function ftruncate [:int :int :long-long]]
;;FIXME: char * in getlogin_r
[:function fchown [:int :int :unsigned-int :unsigned-int]]
;;FIXME: char * in gethostname
;;FIXME: char *restrict in readlink
[:function setegid [:int :unsigned-int]]
[:function seteuid [:int :unsigned-int]]
[:function symlink [:int :c-string-const :c-string-const]]
;;FIXME: fd_set *restrict in pselect
;;FIXME: fd_set *restrict in select
[:function _Exit [:void :int]]
;;FIXME: const struct accessx_descriptor * in accessx_np
[:function acct [:int :c-string-const]]
;;FIXME: char * in add_profil
[:function endusershell [:void]]
;;FIXME: char *const * in execvP
;;FIXME: char * in fflagstostr
;;FIXME: char * in getdomainname
;;FIXME: int * in getgrouplist
;;FIXME: uuid_t in gethostuuid
;;FIXME: const void * in getmode
;;FIXME: uid_t * in getpeereid
;;FIXME: int * in getsgroups_np
;;FIXME: char * in getusershell
;;FIXME: int * in getwgroups_np
[:function initgroups [:int :c-string-const :int]]
[:function iruserok [:int :unsigned-long :int :c-string-const :c-string-const]]
;;FIXME: const void * in iruserok_sa
[:function issetugid [:int]]
;;FIXME: char * in mkdtemp
[:function mknod [:int :c-string-const :unsigned-short :int]]
[:function mkpath_np [:int :c-string-const :unsigned-short]]
;;FIXME: char * in mkstemp
;;FIXME: char * in mkstemps
;;FIXME: char * in mktemp
;;FIXME: void * in nfssvc
;;FIXME: char * in profil
[:function pthread_setugid_np [:int :unsigned-int :unsigned-int]]
;;FIXME: uid_t * in pthread_getugid_np
;;FIXME: char ** in rcmd
;;FIXME: char ** in rcmd_af
[:function reboot [:int :int]]
[:function revoke [:int :c-string-const]]
;;FIXME: int * in rresvport
;;FIXME: int * in rresvport_af
[:function ruserok [:int :c-string-const :int :c-string-const :c-string-const]]
[:function setdomainname [:int :c-string-const :int]]
;;FIXME: const gid_t * in setgroups
[:function sethostid [:void :long]]
[:function sethostname [:int :c-string-const :int]]
[:function setkey [:void :c-string-const]]
[:function setlogin [:int :c-string-const]]
;;FIXME: void * in setmode
[:function setrgid [:int :unsigned-int]]
[:function setruid [:int :unsigned-int]]
;;FIXME: const uuid_t in setsgroups_np
[:function setusershell [:void]]
;;FIXME: const uuid_t in setwgroups_np
;;FIXME: char ** in strtofflags
[:function swapon [:int :c-string-const]]
;;FIXME: variadic syscall
[:function ttyslot [:int]]
[:function undelete [:int :c-string-const]]
[:function unwhiteout [:int :c-string-const]]
;;FIXME: void * in valloc
;;FIXME: char ** in getsubopt
;;FIXME: void * in fgetattrlist
;;FIXME: void * in fsetattrlist
;;FIXME: void * in getattrlist
;;FIXME: void * in setattrlist
[:function exchangedata [:int :c-string-const :c-string-const :unsigned-int]]
;;FIXME: void * in getdirentriesattr
;;FIXME: struct fssearchblock * in searchfs
;;FIXME: void * in fsctl
;;FIXME: void * in ffsctl
[:function fsync_volume_np [:int :int :int]]
[:function sync_volume_np [:int :c-string-const :int]]
[:compound fsignatures_t "sizeof (fsignatures_t)"]
[:compound fstore_t "sizeof (fstore_t)"]
[:compound fbootstraptransfer_t "sizeof (fbootstraptransfer_t)"]
;;FIXME: variadic open
[:function creat [:int :c-string-const :unsigned-short]]
;;FIXME: variadic fcntl
;;FIXME: filesec_t in openx_np
;;FIXME: variadic open_dprotected_np
[:function flock [:int :int :int]]
;;FIXME: filesec_t in filesec_init
;;FIXME: filesec_t in filesec_dup
;;FIXME: filesec_t in filesec_free
;;FIXME: filesec_t in filesec_get_property
;;FIXME: filesec_t in filesec_query_property
;;FIXME: filesec_t in filesec_set_property
;;FIXME: filesec_t in filesec_unset_property
[:function sel_getName [:c-string-const :selector]]
[:function sel_registerName [:selector :c-string-const]]
[:function object_getClassName [:c-string-const :id]]
;;FIXME: void * in object_getIndexedIvars
[:function sel_isMapped [Boolean :selector]]
[:function sel_getUid [:selector :c-string-const]]
[:function NSStringFromSelector [:id :selector]]
[:function NSSelectorFromString [:selector :id]]
[:function NSStringFromClass [:id :id]]
[:function NSClassFromString [:id :id]]
[:function NSStringFromProtocol [:id :id]]
[:function NSProtocolFromString [:id :id]]
;;FIXME: NSUInteger * in NSGetSizeAndAlignment
;;FIXME: variadic NSLog
;;FIXME: va_list in NSLogv
[:compound NSZone "sizeof (NSZone)"]
;;FIXME: NSZone * in NSDefaultMallocZone
;;FIXME: NSZone * in NSCreateZone
;;FIXME: NSZone * in NSRecycleZone
;;FIXME: NSZone * in NSSetZoneName
;;FIXME: NSZone * in NSZoneName
;;FIXME: NSZone * in NSZoneFromPointer
;;FIXME: void * in NSZoneMalloc
;;FIXME: void * in NSZoneCalloc
;;FIXME: void * in NSZoneRealloc
;;FIXME: NSZone * in NSZoneFree
;;FIXME: void * in NSAllocateCollectable
;;FIXME: void * in NSReallocateCollectable
;;FIXME: CFTypeRef in NSMakeCollectable
;;FIXME: CFTypeRef in NSMakeCollectable
[:function NSPageSize [:unsigned-long]]
[:function NSLogPageSize [:unsigned-long]]
[:function NSRoundUpToMultipleOfPageSize [:unsigned-long :unsigned-long]]
[:function NSRoundDownToMultipleOfPageSize [:unsigned-long :unsigned-long]]
;;FIXME: void * in NSAllocateMemoryPages
;;FIXME: void * in NSDeallocateMemoryPages
;;FIXME: const void * in NSCopyMemoryPages
[:function NSRealMemoryAvailable [:unsigned-long]]
[:selector [0 :load] [:void]]
[:selector [0 :initialize] [:void]]
[:selector [0 :init] [:id]]
[:selector [0 :new] [:id]]
;;FIXME: NSZone * in allocWithZone:
[:selector [0 :alloc] [:id]]
[:selector [0 :dealloc] [:void]]
[:selector [0 :finalize] [:void]]
[:selector [0 :copy] [:id]]
[:selector [0 :mutableCopy] [:id]]
;;FIXME: NSZone * in copyWithZone:
;;FIXME: NSZone * in mutableCopyWithZone:
[:selector [0 :superclass] [:id]]
[:selector [0 :class] [:id]]
[:selector [1 :instancesRespondToSelector] [Boolean :selector]]
[:selector [1 :conformsToProtocol] [Boolean :id]]
;;FIXME: IMP in methodForSelector:
;;FIXME: IMP in instanceMethodForSelector:
[:selector [1 :doesNotRecognizeSelector] [:void :selector]]
[:selector [1 :forwardingTargetForSelector] [:id :selector]]
[:selector [1 :forwardInvocation] [:void :id]]
[:selector [1 :methodSignatureForSelector] [:id :selector]]
[:selector [1 :instanceMethodSignatureForSelector] [:id :selector]]
[:selector [0 :allowsWeakReference] [Boolean]]
[:selector [0 :retainWeakReference] [Boolean]]
[:selector [0 :description] [:id]]
[:selector [1 :isSubclassOfClass] [Boolean :id]]
[:selector [1 :resolveClassMethod] [Boolean :selector]]
[:selector [1 :resolveInstanceMethod] [Boolean :selector]]
;;FIXME: NSZone * in NSAllocateObject
[:function NSDeallocateObject [:void :id]]
;;FIXME: NSZone * in NSCopyObject
;;FIXME: NSZone * in NSShouldRetainWithZone
[:function NSIncrementExtraRefCount [:void :id]]
[:function NSDecrementExtraRefCountWasZero [Boolean :id]]
[:function NSExtraRefCount [:unsigned-long :id]]
;;FIXME: CFTypeRef in CFBridgingRetain
;;FIXME: CFTypeRef in CFBridgingRelease
[:function _dispatch_object_validate [:void :id]]
;;FIXME: variadic dispatch_debug
;;FIXME: va_list in dispatch_debugv
[:function dispatch_retain [:void :id]]
[:function dispatch_release [:void :id]]
;;FIXME: void * in dispatch_get_context
;;FIXME: void * in dispatch_set_context
;;FIXME: dispatch_function_t in dispatch_set_finalizer_f
[:function dispatch_suspend [:void :id]]
[:function dispatch_resume [:void :id]]
[:compound time_value_t "sizeof (time_value_t)"]
[:compound mach_timespec_t "sizeof (mach_timespec_t)"]
[:function dispatch_time [:unsigned-long-long :unsigned-long-long :long-long]]
;;FIXME: const struct timespec * in dispatch_walltime
;;FIXME: dispatch_block_t in dispatch_async
;;FIXME: void * in dispatch_async_f
;;FIXME: dispatch_block_t in dispatch_sync
;;FIXME: void * in dispatch_sync_f
;;FIXME: void (^)(size_t) in dispatch_apply
;;FIXME: void * in dispatch_apply_f
[:function dispatch_get_current_queue [:id]]
[:function dispatch_get_global_queue [:id :long :unsigned-long]]
[:function dispatch_queue_create [:id :c-string-const :id]]
[:function dispatch_queue_get_label [:c-string-const :id]]
[:function dispatch_set_target_queue [:void :id :id]]
[:function dispatch_main [:void]]
;;FIXME: dispatch_block_t in dispatch_after
;;FIXME: void * in dispatch_after_f
;;FIXME: dispatch_block_t in dispatch_barrier_async
;;FIXME: void * in dispatch_barrier_async_f
;;FIXME: dispatch_block_t in dispatch_barrier_sync
;;FIXME: void * in dispatch_barrier_sync_f
;;FIXME: const void * in dispatch_queue_set_specific
;;FIXME: void * in dispatch_queue_get_specific
;;FIXME: void * in dispatch_get_specific
[:compound mach_msg_type_descriptor_t "sizeof (mach_msg_type_descriptor_t)"]
[:compound mach_msg_port_descriptor_t "sizeof (mach_msg_port_descriptor_t)"]
[:compound mach_msg_ool_descriptor32_t "sizeof (mach_msg_ool_descriptor32_t)"]
[:compound mach_msg_ool_descriptor64_t "sizeof (mach_msg_ool_descriptor64_t)"]
[:compound mach_msg_ool_descriptor_t "sizeof (mach_msg_ool_descriptor_t)"]
[:compound mach_msg_ool_ports_descriptor32_t "sizeof (mach_msg_ool_ports_descriptor32_t)"]
[:compound mach_msg_ool_ports_descriptor64_t "sizeof (mach_msg_ool_ports_descriptor64_t)"]
[:compound mach_msg_ool_ports_descriptor_t "sizeof (mach_msg_ool_ports_descriptor_t)"]
[:compound mach_msg_descriptor_t "sizeof (mach_msg_descriptor_t)"]
[:compound mach_msg_body_t "sizeof (mach_msg_body_t)"]
[:compound mach_msg_header_t "sizeof (mach_msg_header_t)"]
[:compound mach_msg_base_t "sizeof (mach_msg_base_t)"]
[:compound mach_msg_trailer_t "sizeof (mach_msg_trailer_t)"]
[:compound mach_msg_seqno_trailer_t "sizeof (mach_msg_seqno_trailer_t)"]
[:compound security_token_t "sizeof (security_token_t)"]
[:compound mach_msg_security_trailer_t "sizeof (mach_msg_security_trailer_t)"]
[:compound audit_token_t "sizeof (audit_token_t)"]
[:compound mach_msg_audit_trailer_t "sizeof (mach_msg_audit_trailer_t)"]
[:compound mach_msg_context_trailer_t "sizeof (mach_msg_context_trailer_t)"]
[:compound msg_labels_t "sizeof (msg_labels_t)"]
[:compound mach_msg_mac_trailer_t "sizeof (mach_msg_mac_trailer_t)"]
[:compound mach_msg_empty_send_t "sizeof (mach_msg_empty_send_t)"]
[:compound mach_msg_empty_rcv_t "sizeof (mach_msg_empty_rcv_t)"]
[:compound mach_msg_empty_t "sizeof (mach_msg_empty_t)"]
;;FIXME: mach_msg_header_t * in mach_msg_overwrite
;;FIXME: mach_msg_header_t * in mach_msg
;;FIXME: dispatch_source_type_t in dispatch_source_create
;;FIXME: dispatch_block_t in dispatch_source_set_event_handler
;;FIXME: dispatch_function_t in dispatch_source_set_event_handler_f
;;FIXME: dispatch_block_t in dispatch_source_set_cancel_handler
;;FIXME: dispatch_function_t in dispatch_source_set_cancel_handler_f
[:function dispatch_source_cancel [:void :id]]
[:function dispatch_source_testcancel [:long :id]]
[:function dispatch_source_get_handle [:unsigned-long :id]]
[:function dispatch_source_get_mask [:unsigned-long :id]]
[:function dispatch_source_get_data [:unsigned-long :id]]
[:function dispatch_source_merge_data [:void :id :unsigned-long]]
[:function dispatch_source_set_timer [:void :id :unsigned-long-long :unsigned-long-long :unsigned-long-long]]
;;FIXME: dispatch_block_t in dispatch_source_set_registration_handler
;;FIXME: dispatch_function_t in dispatch_source_set_registration_handler_f
[:function dispatch_group_create [:id]]
;;FIXME: dispatch_block_t in dispatch_group_async
;;FIXME: void * in dispatch_group_async_f
[:function dispatch_group_wait [:long :id :unsigned-long-long]]
;;FIXME: dispatch_block_t in dispatch_group_notify
;;FIXME: void * in dispatch_group_notify_f
[:function dispatch_group_enter [:void :id]]
[:function dispatch_group_leave [:void :id]]
[:function dispatch_semaphore_create [:id :long]]
[:function dispatch_semaphore_wait [:long :id :unsigned-long-long]]
[:function dispatch_semaphore_signal [:long :id]]
;;FIXME: dispatch_once_t * in dispatch_once
;;FIXME: dispatch_once_t * in _dispatch_once
;;FIXME: dispatch_once_t * in dispatch_once_f
;;FIXME: dispatch_once_t * in _dispatch_once_f
;;FIXME: const void * in dispatch_data_create
[:function dispatch_data_get_size [:unsigned-long :id]]
;;FIXME: const void ** in dispatch_data_create_map
[:function dispatch_data_create_concat [:id :id :id]]
[:function dispatch_data_create_subrange [:id :id :unsigned-long :unsigned-long]]
;;FIXME: dispatch_data_applier_t in dispatch_data_apply
;;FIXME: size_t * in dispatch_data_copy_region
;;FIXME: void (^)(dispatch_data_t, int) in dispatch_read
;;FIXME: void (^)(dispatch_data_t, int) in dispatch_write
;;FIXME: void (^)(int) in dispatch_io_create
;;FIXME: void (^)(int) in dispatch_io_create_with_path
;;FIXME: void (^)(int) in dispatch_io_create_with_io
;;FIXME: dispatch_io_handler_t in dispatch_io_read
;;FIXME: dispatch_io_handler_t in dispatch_io_write
[:function dispatch_io_close [:void :id :unsigned-long]]
;;FIXME: dispatch_block_t in dispatch_io_barrier
[:function dispatch_io_get_descriptor [:int :id]]
[:function dispatch_io_set_high_water [:void :id :unsigned-long]]
[:function dispatch_io_set_low_water [:void :id :unsigned-long]]
[:function dispatch_io_set_interval [:void :id :unsigned-long-long :unsigned-long]]
[:compound CFMessagePortContext "sizeof (CFMessagePortContext)"]
[:function CFMessagePortGetTypeID [:unsigned-long]]
;;FIXME: CFMessagePortRef in CFMessagePortCreateLocal
;;FIXME: CFMessagePortRef in CFMessagePortCreateRemote
;;FIXME: CFMessagePortRef in CFMessagePortIsRemote
;;FIXME: CFStringRef in CFMessagePortGetName
;;FIXME: CFMessagePortRef in CFMessagePortSetName
;;FIXME: CFMessagePortRef in CFMessagePortGetContext
;;FIXME: CFMessagePortRef in CFMessagePortInvalidate
;;FIXME: CFMessagePortRef in CFMessagePortIsValid
;;FIXME: CFMessagePortInvalidationCallBack in CFMessagePortGetInvalidationCallBack
;;FIXME: CFMessagePortRef in CFMessagePortSetInvalidationCallBack
;;FIXME: CFMessagePortRef in CFMessagePortSendRequest
;;FIXME: CFRunLoopSourceRef in CFMessagePortCreateRunLoopSource
;;FIXME: CFMessagePortRef in CFMessagePortSetDispatchQueue
[:function CFPlugInGetTypeID [:unsigned-long]]
;;FIXME: CFPlugInRef in CFPlugInCreate
;;FIXME: CFBundleRef in CFPlugInGetBundle
;;FIXME: CFPlugInRef in CFPlugInSetLoadOnDemand
;;FIXME: CFPlugInRef in CFPlugInIsLoadOnDemand
;;FIXME: CFArrayRef in CFPlugInFindFactoriesForPlugInType
;;FIXME: CFArrayRef in CFPlugInFindFactoriesForPlugInTypeInPlugIn
;;FIXME: void * in CFPlugInInstanceCreate
;;FIXME: CFUUIDRef in CFPlugInRegisterFactoryFunction
;;FIXME: CFUUIDRef in CFPlugInRegisterFactoryFunctionByName
;;FIXME: CFUUIDRef in CFPlugInUnregisterFactory
;;FIXME: CFUUIDRef in CFPlugInRegisterPlugInType
;;FIXME: CFUUIDRef in CFPlugInUnregisterPlugInType
;;FIXME: CFUUIDRef in CFPlugInAddInstanceForFactory
;;FIXME: CFUUIDRef in CFPlugInRemoveInstanceForFactory
;;FIXME: CFPlugInInstanceRef in CFPlugInInstanceGetInterfaceFunctionTable
;;FIXME: CFStringRef in CFPlugInInstanceGetFactoryName
;;FIXME: void * in CFPlugInInstanceGetInstanceData
[:function CFPlugInInstanceGetTypeID [:unsigned-long]]
;;FIXME: CFPlugInInstanceRef in CFPlugInInstanceCreateWithInstanceDataSize
[:function CFAttributedStringGetTypeID [:unsigned-long]]
;;FIXME: CFAttributedStringRef in CFAttributedStringCreate
;;FIXME: CFAttributedStringRef in CFAttributedStringCreateWithSubstring
;;FIXME: CFAttributedStringRef in CFAttributedStringCreateCopy
;;FIXME: CFStringRef in CFAttributedStringGetString
;;FIXME: CFAttributedStringRef in CFAttributedStringGetLength
;;FIXME: CFDictionaryRef in CFAttributedStringGetAttributes
;;FIXME: CFTypeRef in CFAttributedStringGetAttribute
;;FIXME: CFDictionaryRef in CFAttributedStringGetAttributesAndLongestEffectiveRange
;;FIXME: CFTypeRef in CFAttributedStringGetAttributeAndLongestEffectiveRange
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringCreateMutableCopy
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringCreateMutable
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringReplaceString
;;FIXME: CFMutableStringRef in CFAttributedStringGetMutableString
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringSetAttributes
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringSetAttribute
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringRemoveAttribute
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringReplaceAttributedString
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringBeginEditing
;;FIXME: CFMutableAttributedStringRef in CFAttributedStringEndEditing
[:function CFNotificationCenterGetTypeID [:unsigned-long]]
;;FIXME: CFNotificationCenterRef in CFNotificationCenterGetLocalCenter
;;FIXME: CFNotificationCenterRef in CFNotificationCenterGetDistributedCenter
;;FIXME: CFNotificationCenterRef in CFNotificationCenterGetDarwinNotifyCenter
;;FIXME: CFNotificationCenterRef in CFNotificationCenterAddObserver
;;FIXME: CFNotificationCenterRef in CFNotificationCenterRemoveObserver
;;FIXME: CFNotificationCenterRef in CFNotificationCenterRemoveEveryObserver
;;FIXME: CFNotificationCenterRef in CFNotificationCenterPostNotification
;;FIXME: CFNotificationCenterRef in CFNotificationCenterPostNotificationWithOptions
[:function CFURLEnumeratorGetTypeID [:unsigned-long]]
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorCreateForDirectoryURL
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorCreateForMountedVolumes
;;FIXME: CFURLEnumeratorResult in CFURLEnumeratorGetNextURL
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorSkipDescendents
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorGetDescendentLevel
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorGetSourceDidChange
[:compound guid_t "sizeof (guid_t)"]
[:compound ntsid_t "sizeof (ntsid_t)"]
;;FIXME: acl_t in acl_dup
;;FIXME: void * in acl_free
;;FIXME: acl_t in acl_init
;;FIXME: acl_entry_t in acl_copy_entry
;;FIXME: acl_t * in acl_create_entry
;;FIXME: acl_t * in acl_create_entry_np
;;FIXME: acl_t in acl_delete_entry
;;FIXME: acl_t in acl_get_entry
;;FIXME: acl_t in acl_valid
;;FIXME: acl_type_t in acl_valid_fd_np
;;FIXME: acl_type_t in acl_valid_file_np
;;FIXME: acl_type_t in acl_valid_link_np
;;FIXME: acl_permset_t in acl_add_perm
;;FIXME: acl_t * in acl_calc_mask
;;FIXME: acl_permset_t in acl_clear_perms
;;FIXME: acl_permset_t in acl_delete_perm
;;FIXME: acl_permset_t in acl_get_perm_np
;;FIXME: acl_entry_t in acl_get_permset
;;FIXME: acl_entry_t in acl_set_permset
;;FIXME: acl_permset_mask_t * in acl_maximal_permset_mask_np
;;FIXME: acl_entry_t in acl_get_permset_mask_np
;;FIXME: acl_entry_t in acl_set_permset_mask_np
;;FIXME: acl_flagset_t in acl_add_flag_np
;;FIXME: acl_flagset_t in acl_clear_flags_np
;;FIXME: acl_flagset_t in acl_delete_flag_np
;;FIXME: acl_flagset_t in acl_get_flag_np
;;FIXME: void * in acl_get_flagset_np
;;FIXME: void * in acl_set_flagset_np
;;FIXME: void * in acl_get_qualifier
;;FIXME: acl_entry_t in acl_get_tag_type
;;FIXME: acl_entry_t in acl_set_qualifier
;;FIXME: acl_entry_t in acl_set_tag_type
[:function acl_delete_def_file [:int :c-string-const]]
;;FIXME: acl_t in acl_get_fd
;;FIXME: acl_t in acl_get_fd_np
;;FIXME: acl_t in acl_get_file
;;FIXME: acl_t in acl_get_link_np
;;FIXME: acl_t in acl_set_fd
;;FIXME: acl_t in acl_set_fd_np
;;FIXME: acl_type_t in acl_set_file
;;FIXME: acl_type_t in acl_set_link_np
;;FIXME: void * in acl_copy_ext
;;FIXME: void * in acl_copy_ext_native
;;FIXME: acl_t in acl_copy_int
;;FIXME: acl_t in acl_copy_int_native
;;FIXME: acl_t in acl_from_text
;;FIXME: acl_t in acl_size
;;FIXME: char * in acl_to_text
[:function CFFileSecurityGetTypeID [:unsigned-long]]
;;FIXME: CFFileSecurityRef in CFFileSecurityCreate
;;FIXME: CFFileSecurityRef in CFFileSecurityCreateCopy
;;FIXME: CFFileSecurityRef in CFFileSecurityCopyOwnerUUID
;;FIXME: CFFileSecurityRef in CFFileSecuritySetOwnerUUID
;;FIXME: CFFileSecurityRef in CFFileSecurityCopyGroupUUID
;;FIXME: CFFileSecurityRef in CFFileSecuritySetGroupUUID
;;FIXME: CFFileSecurityRef in CFFileSecurityCopyAccessControlList
;;FIXME: CFFileSecurityRef in CFFileSecuritySetAccessControlList
;;FIXME: CFFileSecurityRef in CFFileSecurityGetOwner
;;FIXME: CFFileSecurityRef in CFFileSecuritySetOwner
;;FIXME: CFFileSecurityRef in CFFileSecurityGetGroup
;;FIXME: CFFileSecurityRef in CFFileSecuritySetGroup
;;FIXME: CFFileSecurityRef in CFFileSecurityGetMode
;;FIXME: CFFileSecurityRef in CFFileSecuritySetMode
;;FIXME: CFFileSecurityRef in CFFileSecurityClearProperties
[:compound CFMachPortContext "sizeof (CFMachPortContext)"]
[:function CFMachPortGetTypeID [:unsigned-long]]
;;FIXME: CFMachPortRef in CFMachPortCreate
;;FIXME: CFMachPortRef in CFMachPortCreateWithPort
;;FIXME: CFMachPortRef in CFMachPortGetPort
;;FIXME: CFMachPortRef in CFMachPortGetContext
;;FIXME: CFMachPortRef in CFMachPortInvalidate
;;FIXME: CFMachPortRef in CFMachPortIsValid
;;FIXME: CFMachPortInvalidationCallBack in CFMachPortGetInvalidationCallBack
;;FIXME: CFMachPortRef in CFMachPortSetInvalidationCallBack
;;FIXME: CFRunLoopSourceRef in CFMachPortCreateRunLoopSource
;;FIXME: CFStringRef in CFStringTokenizerCopyBestStringLanguage
[:function CFStringTokenizerGetTypeID [:unsigned-long]]
;;FIXME: CFStringTokenizerRef in CFStringTokenizerCreate
;;FIXME: CFStringTokenizerRef in CFStringTokenizerSetString
;;FIXME: CFStringTokenizerTokenType in CFStringTokenizerGoToTokenAtIndex
;;FIXME: CFStringTokenizerTokenType in CFStringTokenizerAdvanceToNextToken
;;FIXME: CFStringTokenizerRef in CFStringTokenizerGetCurrentTokenRange
;;FIXME: CFTypeRef in CFStringTokenizerCopyCurrentTokenAttribute
;;FIXME: CFStringTokenizerRef in CFStringTokenizerGetCurrentSubTokens
[:compound CFFileDescriptorContext "sizeof (CFFileDescriptorContext)"]
[:function CFFileDescriptorGetTypeID [:unsigned-long]]
;;FIXME: CFFileDescriptorRef in CFFileDescriptorCreate
;;FIXME: CFFileDescriptorRef in CFFileDescriptorGetNativeDescriptor
;;FIXME: CFFileDescriptorRef in CFFileDescriptorGetContext
;;FIXME: CFFileDescriptorRef in CFFileDescriptorEnableCallBacks
;;FIXME: CFFileDescriptorRef in CFFileDescriptorDisableCallBacks
;;FIXME: CFFileDescriptorRef in CFFileDescriptorInvalidate
;;FIXME: CFFileDescriptorRef in CFFileDescriptorIsValid
;;FIXME: CFRunLoopSourceRef in CFFileDescriptorCreateRunLoopSource
[:function CFUserNotificationGetTypeID [:unsigned-long]]
;;FIXME: CFUserNotificationRef in CFUserNotificationCreate
;;FIXME: CFUserNotificationRef in CFUserNotificationReceiveResponse
;;FIXME: CFStringRef in CFUserNotificationGetResponseValue
;;FIXME: CFDictionaryRef in CFUserNotificationGetResponseDictionary
;;FIXME: CFUserNotificationRef in CFUserNotificationUpdate
;;FIXME: CFUserNotificationRef in CFUserNotificationCancel
;;FIXME: CFRunLoopSourceRef in CFUserNotificationCreateRunLoopSource
;;FIXME: CFURLRef in CFUserNotificationDisplayNotice
;;FIXME: CFURLRef in CFUserNotificationDisplayAlert
[:function CFUserNotificationCheckBoxChecked [:unsigned-long :long]]
[:function CFUserNotificationSecureTextField [:unsigned-long :long]]
[:function CFUserNotificationPopUpSelection [:unsigned-long :long]]
[:compound CFXMLElementInfo "sizeof (CFXMLElementInfo)"]
[:compound CFXMLProcessingInstructionInfo "sizeof (CFXMLProcessingInstructionInfo)"]
[:compound CFXMLDocumentInfo "sizeof (CFXMLDocumentInfo)"]
[:compound CFXMLExternalID "sizeof (CFXMLExternalID)"]
[:compound CFXMLDocumentTypeInfo "sizeof (CFXMLDocumentTypeInfo)"]
[:compound CFXMLNotationInfo "sizeof (CFXMLNotationInfo)"]
[:compound CFXMLElementTypeDeclarationInfo "sizeof (CFXMLElementTypeDeclarationInfo)"]
[:compound CFXMLAttributeDeclarationInfo "sizeof (CFXMLAttributeDeclarationInfo)"]
[:compound CFXMLAttributeListDeclarationInfo "sizeof (CFXMLAttributeListDeclarationInfo)"]
[:compound CFXMLEntityInfo "sizeof (CFXMLEntityInfo)"]
[:compound CFXMLEntityReferenceInfo "sizeof (CFXMLEntityReferenceInfo)"]
[:function CFXMLNodeGetTypeID [:unsigned-long]]
;;FIXME: CFXMLNodeRef in CFXMLNodeCreate
;;FIXME: CFXMLNodeRef in CFXMLNodeCreateCopy
;;FIXME: CFXMLNodeTypeCode in CFXMLNodeGetTypeCode
;;FIXME: CFStringRef in CFXMLNodeGetString
;;FIXME: const void * in CFXMLNodeGetInfoPtr
;;FIXME: CFXMLNodeRef in CFXMLNodeGetVersion
;;FIXME: CFXMLTreeRef in CFXMLTreeCreateWithNode
;;FIXME: CFXMLNodeRef in CFXMLTreeGetNode
[:compound CFXMLParserCallBacks "sizeof (CFXMLParserCallBacks)"]
[:compound CFXMLParserContext "sizeof (CFXMLParserContext)"]
[:function CFXMLParserGetTypeID [:unsigned-long]]
;;FIXME: CFXMLParserRef in CFXMLParserCreate
;;FIXME: CFXMLParserRef in CFXMLParserCreateWithDataFromURL
;;FIXME: CFXMLParserRef in CFXMLParserGetContext
;;FIXME: CFXMLParserRef in CFXMLParserGetCallBacks
;;FIXME: CFURLRef in CFXMLParserGetSourceURL
;;FIXME: CFXMLParserRef in CFXMLParserGetLocation
;;FIXME: CFXMLParserRef in CFXMLParserGetLineNumber
;;FIXME: void * in CFXMLParserGetDocument
;;FIXME: CFXMLParserStatusCode in CFXMLParserGetStatusCode
;;FIXME: CFStringRef in CFXMLParserCopyErrorDescription
;;FIXME: CFXMLParserRef in CFXMLParserAbort
;;FIXME: CFXMLParserRef in CFXMLParserParse
;;FIXME: CFXMLTreeRef in CFXMLTreeCreateFromData
;;FIXME: CFXMLTreeRef in CFXMLTreeCreateFromDataWithError
;;FIXME: CFXMLTreeRef in CFXMLTreeCreateWithDataFromURL
;;FIXME: CFDataRef in CFXMLTreeCreateXMLData
;;FIXME: CFStringRef in CFXMLCreateStringByEscapingEntities
;;FIXME: CFStringRef in CFXMLCreateStringByUnescapingEntities
[:compound NSFastEnumerationState "sizeof (NSFastEnumerationState)"]
[:selector [0 :nextObject] [:id]]
;;FIXME: void * in getValue:
[:selector [0 :objCType] [:c-string-const]]
[:selector [0 :charValue] [:char]]
[:selector [0 :unsignedCharValue] [:unsigned-char]]
[:selector [0 :shortValue] [:short]]
[:selector [0 :unsignedShortValue] [:unsigned-short]]
[:selector [0 :intValue] [:int]]
[:selector [0 :unsignedIntValue] [:unsigned-int]]
[:selector [0 :longValue] [:long]]
[:selector [0 :unsignedLongValue] [:unsigned-long]]
[:selector [0 :longLongValue] [:long-long]]
[:selector [0 :unsignedLongLongValue] [:unsigned-long-long]]
[:selector [0 :floatValue] [:float]]
[:selector [0 :doubleValue] [:double]]
[:selector [0 :boolValue] [Boolean]]
[:selector [0 :integerValue] [:long]]
[:selector [0 :unsignedIntegerValue] [:unsigned-long]]
[:selector [0 :stringValue] [:id]]
;;FIXME: NSComparisonResult in compare:
[:selector [1 :isEqualToNumber] [Boolean :id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:compound NSRange "sizeof (NSRange)"]
[:function NSMakeRange [Foundation/NSRange :unsigned-long :unsigned-long]]
[:function NSMaxRange [:unsigned-long Foundation/NSRange]]
[:function NSLocationInRange [Boolean :unsigned-long Foundation/NSRange]]
[:function NSEqualRanges [Boolean Foundation/NSRange Foundation/NSRange]]
[:function NSUnionRange [Foundation/NSRange Foundation/NSRange Foundation/NSRange]]
[:function NSIntersectionRange [Foundation/NSRange Foundation/NSRange Foundation/NSRange]]
[:function NSStringFromRange [:id Foundation/NSRange]]
[:function NSRangeFromString [Foundation/NSRange :id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [1 :objectAtIndex] [:id :unsigned-long]]
[:selector [1 :addObject] [:void :id]]
[:selector [2 :insertObject :atIndex] [:void :id :unsigned-long]]
[:selector [0 :removeLastObject] [:void]]
[:selector [1 :removeObjectAtIndex] [:void :unsigned-long]]
[:selector [2 :replaceObjectAtIndex :withObject] [:void :unsigned-long :id]]
[:selector [1 :addObject] [:void :id]]
[:selector [1 :addObject] [:void :id]]
[:selector [0 :drain] [:void]]
[:selector [0 :mainBundle] [:id]]
[:selector [1 :bundleWithPath] [:id :id]]
[:selector [1 :initWithPath] [:id :id]]
[:selector [1 :bundleWithURL] [:id :id]]
[:selector [1 :initWithURL] [:id :id]]
[:selector [1 :bundleForClass] [:id :id]]
[:selector [1 :bundleWithIdentifier] [:id :id]]
[:selector [0 :allBundles] [:id]]
[:selector [0 :allFrameworks] [:id]]
[:selector [0 :load] [Boolean]]
[:selector [0 :isLoaded] [Boolean]]
[:selector [0 :unload] [Boolean]]
;;FIXME: NSError ** in preflightAndReturnError:
;;FIXME: NSError ** in loadAndReturnError:
[:selector [0 :bundleURL] [:id]]
[:selector [0 :resourceURL] [:id]]
[:selector [0 :executableURL] [:id]]
[:selector [1 :URLForAuxiliaryExecutable] [:id :id]]
[:selector [0 :privateFrameworksURL] [:id]]
[:selector [0 :sharedFrameworksURL] [:id]]
[:selector [0 :sharedSupportURL] [:id]]
[:selector [0 :builtInPlugInsURL] [:id]]
[:selector [0 :appStoreReceiptURL] [:id]]
[:selector [0 :bundlePath] [:id]]
[:selector [0 :resourcePath] [:id]]
[:selector [0 :executablePath] [:id]]
[:selector [1 :pathForAuxiliaryExecutable] [:id :id]]
[:selector [0 :privateFrameworksPath] [:id]]
[:selector [0 :sharedFrameworksPath] [:id]]
[:selector [0 :sharedSupportPath] [:id]]
[:selector [0 :builtInPlugInsPath] [:id]]
[:selector [4 :URLForResource :withExtension :subdirectory :inBundleWithURL] [:id :id :id :id :id]]
[:selector [3 :URLsForResourcesWithExtension :subdirectory :inBundleWithURL] [:id :id :id :id]]
[:selector [2 :URLForResource :withExtension] [:id :id :id]]
[:selector [3 :URLForResource :withExtension :subdirectory] [:id :id :id :id]]
[:selector [4 :URLForResource :withExtension :subdirectory :localization] [:id :id :id :id :id]]
[:selector [2 :URLsForResourcesWithExtension :subdirectory] [:id :id :id]]
[:selector [3 :URLsForResourcesWithExtension :subdirectory :localization] [:id :id :id :id]]
[:selector [3 :pathForResource :ofType :inDirectory] [:id :id :id :id]]
[:selector [2 :pathsForResourcesOfType :inDirectory] [:id :id :id]]
[:selector [2 :pathForResource :ofType] [:id :id :id]]
[:selector [3 :pathForResource :ofType :inDirectory] [:id :id :id :id]]
[:selector [4 :pathForResource :ofType :inDirectory :forLocalization] [:id :id :id :id :id]]
[:selector [2 :pathsForResourcesOfType :inDirectory] [:id :id :id]]
[:selector [3 :pathsForResourcesOfType :inDirectory :forLocalization] [:id :id :id :id]]
[:selector [3 :localizedStringForKey :value :table] [:id :id :id :id]]
[:selector [0 :bundleIdentifier] [:id]]
[:selector [0 :infoDictionary] [:id]]
[:selector [0 :localizedInfoDictionary] [:id]]
[:selector [1 :objectForInfoDictionaryKey] [:id :id]]
[:selector [1 :classNamed] [:id :id]]
[:selector [0 :principalClass] [:id]]
[:selector [0 :localizations] [:id]]
[:selector [0 :preferredLocalizations] [:id]]
[:selector [0 :developmentLocalization] [:id]]
[:selector [1 :preferredLocalizationsFromArray] [:id :id]]
[:selector [2 :preferredLocalizationsFromArray :forPreferences] [:id :id :id]]
[:selector [0 :executableArchitectures] [:id]]
[:function NSHostByteOrder [:long]]
[:function NSSwapShort [:unsigned-short :unsigned-short]]
[:function NSSwapInt [:unsigned-int :unsigned-int]]
[:function NSSwapLong [:unsigned-long :unsigned-long]]
[:function NSSwapLongLong [:unsigned-long-long :unsigned-long-long]]
[:function NSSwapBigShortToHost [:unsigned-short :unsigned-short]]
[:function NSSwapBigIntToHost [:unsigned-int :unsigned-int]]
[:function NSSwapBigLongToHost [:unsigned-long :unsigned-long]]
[:function NSSwapBigLongLongToHost [:unsigned-long-long :unsigned-long-long]]
[:function NSSwapHostShortToBig [:unsigned-short :unsigned-short]]
[:function NSSwapHostIntToBig [:unsigned-int :unsigned-int]]
[:function NSSwapHostLongToBig [:unsigned-long :unsigned-long]]
[:function NSSwapHostLongLongToBig [:unsigned-long-long :unsigned-long-long]]
[:function NSSwapLittleShortToHost [:unsigned-short :unsigned-short]]
[:function NSSwapLittleIntToHost [:unsigned-int :unsigned-int]]
[:function NSSwapLittleLongToHost [:unsigned-long :unsigned-long]]
[:function NSSwapLittleLongLongToHost [:unsigned-long-long :unsigned-long-long]]
[:function NSSwapHostShortToLittle [:unsigned-short :unsigned-short]]
[:function NSSwapHostIntToLittle [:unsigned-int :unsigned-int]]
[:function NSSwapHostLongToLittle [:unsigned-long :unsigned-long]]
[:function NSSwapHostLongLongToLittle [:unsigned-long-long :unsigned-long-long]]
[:compound NSSwappedFloat "sizeof (NSSwappedFloat)"]
[:compound NSSwappedDouble "sizeof (NSSwappedDouble)"]
[:function NSConvertHostFloatToSwapped [Foundation/NSSwappedFloat :float]]
[:function NSConvertSwappedFloatToHost [:float Foundation/NSSwappedFloat]]
[:function NSConvertHostDoubleToSwapped [Foundation/NSSwappedDouble :double]]
[:function NSConvertSwappedDoubleToHost [:double Foundation/NSSwappedDouble]]
[:function NSSwapFloat [Foundation/NSSwappedFloat Foundation/NSSwappedFloat]]
[:function NSSwapDouble [Foundation/NSSwappedDouble Foundation/NSSwappedDouble]]
[:function NSSwapBigDoubleToHost [:double Foundation/NSSwappedDouble]]
[:function NSSwapBigFloatToHost [:float Foundation/NSSwappedFloat]]
[:function NSSwapHostDoubleToBig [Foundation/NSSwappedDouble :double]]
[:function NSSwapHostFloatToBig [Foundation/NSSwappedFloat :float]]
[:function NSSwapLittleDoubleToHost [:double Foundation/NSSwappedDouble]]
[:function NSSwapLittleFloatToHost [:float Foundation/NSSwappedFloat]]
[:function NSSwapHostDoubleToLittle [Foundation/NSSwappedDouble :double]]
[:function NSSwapHostFloatToLittle [Foundation/NSSwappedFloat :float]]
[:selector [0 :timeIntervalSinceReferenceDate] [:double]]
[:selector [0 :currentCalendar] [:id]]
[:selector [0 :autoupdatingCurrentCalendar] [:id]]
[:selector [1 :initWithCalendarIdentifier] [:id :id]]
[:selector [0 :calendarIdentifier] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :locale] [:id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [0 :timeZone] [:id]]
[:selector [1 :setFirstWeekday] [:void :unsigned-long]]
[:selector [0 :firstWeekday] [:unsigned-long]]
[:selector [1 :setMinimumDaysInFirstWeek] [:void :unsigned-long]]
[:selector [0 :minimumDaysInFirstWeek] [:unsigned-long]]
;;FIXME: NSCalendarUnit in minimumRangeOfUnit:
;;FIXME: NSCalendarUnit in maximumRangeOfUnit:
;;FIXME: NSCalendarUnit in rangeOfUnit:inUnit:forDate:
;;FIXME: NSCalendarUnit in ordinalityOfUnit:inUnit:forDate:
;;FIXME: NSCalendarUnit in rangeOfUnit:startDate:interval:forDate:
[:selector [1 :dateFromComponents] [:id :id]]
[:selector [2 :components :fromDate] [:id :unsigned-long :id]]
[:selector [3 :dateByAddingComponents :toDate :options] [:id :id :id :unsigned-long]]
[:selector [4 :components :fromDate :toDate :options] [:id :unsigned-long :id :id :unsigned-long]]
[:selector [0 :calendar] [:id]]
[:selector [0 :timeZone] [:id]]
[:selector [0 :era] [:long]]
[:selector [0 :year] [:long]]
[:selector [0 :month] [:long]]
[:selector [0 :day] [:long]]
[:selector [0 :hour] [:long]]
[:selector [0 :minute] [:long]]
[:selector [0 :second] [:long]]
[:selector [0 :week] [:long]]
[:selector [0 :weekday] [:long]]
[:selector [0 :weekdayOrdinal] [:long]]
[:selector [0 :quarter] [:long]]
[:selector [0 :weekOfMonth] [:long]]
[:selector [0 :weekOfYear] [:long]]
[:selector [0 :yearForWeekOfYear] [:long]]
[:selector [0 :isLeapMonth] [Boolean]]
[:selector [1 :setCalendar] [:void :id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [1 :setEra] [:void :long]]
[:selector [1 :setYear] [:void :long]]
[:selector [1 :setMonth] [:void :long]]
[:selector [1 :setDay] [:void :long]]
[:selector [1 :setHour] [:void :long]]
[:selector [1 :setMinute] [:void :long]]
[:selector [1 :setSecond] [:void :long]]
[:selector [1 :setWeek] [:void :long]]
[:selector [1 :setWeekday] [:void :long]]
[:selector [1 :setWeekdayOrdinal] [:void :long]]
[:selector [1 :setQuarter] [:void :long]]
[:selector [1 :setWeekOfMonth] [:void :long]]
[:selector [1 :setWeekOfYear] [:void :long]]
[:selector [1 :setYearForWeekOfYear] [:void :long]]
[:selector [1 :setLeapMonth] [:void Boolean]]
[:selector [0 :date] [:id]]
[:selector [0 :length] [:unsigned-long]]
[:selector [1 :characterAtIndex] [:unsigned-short :unsigned-long]]
[:selector [2 :replaceCharactersInRange :withString] [:void Foundation/NSRange :id]]
[:selector [0 :controlCharacterSet] [:id]]
[:selector [0 :whitespaceCharacterSet] [:id]]
[:selector [0 :whitespaceAndNewlineCharacterSet] [:id]]
[:selector [0 :decimalDigitCharacterSet] [:id]]
[:selector [0 :letterCharacterSet] [:id]]
[:selector [0 :lowercaseLetterCharacterSet] [:id]]
[:selector [0 :uppercaseLetterCharacterSet] [:id]]
[:selector [0 :nonBaseCharacterSet] [:id]]
[:selector [0 :alphanumericCharacterSet] [:id]]
[:selector [0 :decomposableCharacterSet] [:id]]
[:selector [0 :illegalCharacterSet] [:id]]
[:selector [0 :punctuationCharacterSet] [:id]]
[:selector [0 :capitalizedLetterCharacterSet] [:id]]
[:selector [0 :symbolCharacterSet] [:id]]
[:selector [0 :newlineCharacterSet] [:id]]
[:selector [1 :characterSetWithRange] [:id Foundation/NSRange]]
[:selector [1 :characterSetWithCharactersInString] [:id :id]]
[:selector [1 :characterSetWithBitmapRepresentation] [:id :id]]
[:selector [1 :characterSetWithContentsOfFile] [:id :id]]
[:selector [1 :characterIsMember] [Boolean :unsigned-short]]
[:selector [0 :bitmapRepresentation] [:id]]
[:selector [0 :invertedSet] [:id]]
[:selector [1 :longCharacterIsMember] [Boolean :unsigned-int]]
[:selector [1 :isSupersetOfSet] [Boolean :id]]
[:selector [1 :hasMemberInPlane] [Boolean :unsigned-char]]
[:selector [1 :addCharactersInRange] [:void Foundation/NSRange]]
[:selector [1 :removeCharactersInRange] [:void Foundation/NSRange]]
[:selector [1 :addCharactersInString] [:void :id]]
[:selector [1 :removeCharactersInString] [:void :id]]
[:selector [1 :formUnionWithCharacterSet] [:void :id]]
[:selector [1 :formIntersectionWithCharacterSet] [:void :id]]
[:selector [0 :invert] [:void]]
;;FIXME: const void * in encodeValueOfObjCType:at:
[:selector [1 :encodeDataObject] [:void :id]]
;;FIXME: void * in decodeValueOfObjCType:at:
[:selector [0 :decodeDataObject] [:id]]
[:selector [1 :versionForClassName] [:long :id]]
[:function NXReadNSObjectFromCoder [:id :id]]
[:selector [0 :length] [:unsigned-long]]
;;FIXME: const void * in bytes
;;FIXME: void * in mutableBytes
[:selector [1 :setLength] [:void :unsigned-long]]
[:selector [1 :stringForObjectValue] [:id :id]]
[:selector [2 :attributedStringForObjectValue :withDefaultAttributes] [:id :id :id]]
[:selector [1 :editingStringForObjectValue] [:id :id]]
;;FIXME: id * in getObjectValue:forString:errorDescription:
;;FIXME: NSString ** in isPartialStringValid:newEditingString:errorDescription:
;;FIXME: NSString ** in isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:
;;FIXME: id * in getObjectValue:forString:range:error:
[:selector [1 :stringFromDate] [:id :id]]
[:selector [1 :dateFromString] [:id :id]]
;;FIXME: NSDateFormatterStyle in localizedStringFromDate:dateStyle:timeStyle:
[:selector [3 :dateFormatFromTemplate :options :locale] [:id :id :unsigned-long :id]]
[:selector [0 :dateFormat] [:id]]
;;FIXME: NSDateFormatterStyle in dateStyle
;;FIXME: NSDateFormatterStyle in setDateStyle:
;;FIXME: NSDateFormatterStyle in timeStyle
;;FIXME: NSDateFormatterStyle in setTimeStyle:
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :generatesCalendarDates] [Boolean]]
[:selector [1 :setGeneratesCalendarDates] [:void Boolean]]
;;FIXME: NSDateFormatterBehavior in formatterBehavior
;;FIXME: NSDateFormatterBehavior in setFormatterBehavior:
;;FIXME: NSDateFormatterBehavior in defaultFormatterBehavior
;;FIXME: NSDateFormatterBehavior in setDefaultFormatterBehavior:
[:selector [1 :setDateFormat] [:void :id]]
[:selector [0 :timeZone] [:id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [0 :calendar] [:id]]
[:selector [1 :setCalendar] [:void :id]]
[:selector [0 :isLenient] [Boolean]]
[:selector [1 :setLenient] [:void Boolean]]
[:selector [0 :twoDigitStartDate] [:id]]
[:selector [1 :setTwoDigitStartDate] [:void :id]]
[:selector [0 :defaultDate] [:id]]
[:selector [1 :setDefaultDate] [:void :id]]
[:selector [0 :eraSymbols] [:id]]
[:selector [1 :setEraSymbols] [:void :id]]
[:selector [0 :monthSymbols] [:id]]
[:selector [1 :setMonthSymbols] [:void :id]]
[:selector [0 :shortMonthSymbols] [:id]]
[:selector [1 :setShortMonthSymbols] [:void :id]]
[:selector [0 :weekdaySymbols] [:id]]
[:selector [1 :setWeekdaySymbols] [:void :id]]
[:selector [0 :shortWeekdaySymbols] [:id]]
[:selector [1 :setShortWeekdaySymbols] [:void :id]]
[:selector [0 :AMSymbol] [:id]]
[:selector [1 :setAMSymbol] [:void :id]]
[:selector [0 :PMSymbol] [:id]]
[:selector [1 :setPMSymbol] [:void :id]]
[:selector [0 :longEraSymbols] [:id]]
[:selector [1 :setLongEraSymbols] [:void :id]]
[:selector [0 :veryShortMonthSymbols] [:id]]
[:selector [1 :setVeryShortMonthSymbols] [:void :id]]
[:selector [0 :standaloneMonthSymbols] [:id]]
[:selector [1 :setStandaloneMonthSymbols] [:void :id]]
[:selector [0 :shortStandaloneMonthSymbols] [:id]]
[:selector [1 :setShortStandaloneMonthSymbols] [:void :id]]
[:selector [0 :veryShortStandaloneMonthSymbols] [:id]]
[:selector [1 :setVeryShortStandaloneMonthSymbols] [:void :id]]
[:selector [0 :veryShortWeekdaySymbols] [:id]]
[:selector [1 :setVeryShortWeekdaySymbols] [:void :id]]
[:selector [0 :standaloneWeekdaySymbols] [:id]]
[:selector [1 :setStandaloneWeekdaySymbols] [:void :id]]
[:selector [0 :shortStandaloneWeekdaySymbols] [:id]]
[:selector [1 :setShortStandaloneWeekdaySymbols] [:void :id]]
[:selector [0 :veryShortStandaloneWeekdaySymbols] [:id]]
[:selector [1 :setVeryShortStandaloneWeekdaySymbols] [:void :id]]
[:selector [0 :quarterSymbols] [:id]]
[:selector [1 :setQuarterSymbols] [:void :id]]
[:selector [0 :shortQuarterSymbols] [:id]]
[:selector [1 :setShortQuarterSymbols] [:void :id]]
[:selector [0 :standaloneQuarterSymbols] [:id]]
[:selector [1 :setStandaloneQuarterSymbols] [:void :id]]
[:selector [0 :shortStandaloneQuarterSymbols] [:id]]
[:selector [1 :setShortStandaloneQuarterSymbols] [:void :id]]
[:selector [0 :gregorianStartDate] [:id]]
[:selector [1 :setGregorianStartDate] [:void :id]]
[:selector [0 :doesRelativeDateFormatting] [Boolean]]
[:selector [1 :setDoesRelativeDateFormatting] [:void Boolean]]
[:compound NSDecimal "sizeof (NSDecimal)"]
;;FIXME: const NSDecimal * in NSDecimalIsNotANumber
;;FIXME: NSDecimal * in NSDecimalCopy
;;FIXME: NSDecimal * in NSDecimalCompact
;;FIXME: NSComparisonResult in NSDecimalCompare
;;FIXME: NSDecimal * in NSDecimalRound
;;FIXME: NSCalculationError in NSDecimalNormalize
;;FIXME: NSCalculationError in NSDecimalAdd
;;FIXME: NSCalculationError in NSDecimalSubtract
;;FIXME: NSCalculationError in NSDecimalMultiply
;;FIXME: NSCalculationError in NSDecimalDivide
;;FIXME: NSCalculationError in NSDecimalPower
;;FIXME: NSCalculationError in NSDecimalMultiplyByPowerOf10
;;FIXME: const NSDecimal * in NSDecimalString
[:selector [0 :string] [:id]]
[:selector [0 :scanLocation] [:unsigned-long]]
[:selector [1 :setScanLocation] [:void :unsigned-long]]
[:selector [1 :setCharactersToBeSkipped] [:void :id]]
[:selector [1 :setCaseSensitive] [:void Boolean]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [0 :keyEnumerator] [:id]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [3 :initWithMantissa :exponent :isNegative] [:id :unsigned-long-long :short Boolean]]
[:selector [1 :initWithDecimal] [:id Foundation/NSDecimal]]
[:selector [1 :initWithString] [:id :id]]
[:selector [2 :initWithString :locale] [:id :id :id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [0 :decimalValue] [Foundation/NSDecimal]]
[:selector [3 :decimalNumberWithMantissa :exponent :isNegative] [:id :unsigned-long-long :short Boolean]]
[:selector [1 :decimalNumberWithDecimal] [:id Foundation/NSDecimal]]
[:selector [1 :decimalNumberWithString] [:id :id]]
[:selector [2 :decimalNumberWithString :locale] [:id :id :id]]
[:selector [0 :zero] [:id]]
[:selector [0 :one] [:id]]
[:selector [0 :minimumDecimalNumber] [:id]]
[:selector [0 :maximumDecimalNumber] [:id]]
[:selector [0 :notANumber] [:id]]
[:selector [1 :decimalNumberByAdding] [:id :id]]
[:selector [2 :decimalNumberByAdding :withBehavior] [:id :id :id]]
[:selector [1 :decimalNumberBySubtracting] [:id :id]]
[:selector [2 :decimalNumberBySubtracting :withBehavior] [:id :id :id]]
[:selector [1 :decimalNumberByMultiplyingBy] [:id :id]]
[:selector [2 :decimalNumberByMultiplyingBy :withBehavior] [:id :id :id]]
[:selector [1 :decimalNumberByDividingBy] [:id :id]]
[:selector [2 :decimalNumberByDividingBy :withBehavior] [:id :id :id]]
[:selector [1 :decimalNumberByRaisingToPower] [:id :unsigned-long]]
[:selector [2 :decimalNumberByRaisingToPower :withBehavior] [:id :unsigned-long :id]]
[:selector [1 :decimalNumberByMultiplyingByPowerOf10] [:id :short]]
[:selector [2 :decimalNumberByMultiplyingByPowerOf10 :withBehavior] [:id :short :id]]
[:selector [1 :decimalNumberByRoundingAccordingToBehavior] [:id :id]]
;;FIXME: NSComparisonResult in compare:
[:selector [1 :setDefaultBehavior] [:void :id]]
[:selector [0 :defaultBehavior] [:id]]
[:selector [0 :objCType] [:c-string-const]]
[:selector [0 :doubleValue] [:double]]
[:selector [0 :defaultDecimalNumberHandler] [:id]]
;;FIXME: NSRoundingMode in initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:
;;FIXME: NSRoundingMode in decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:
[:selector [3 :initWithDomain :code :userInfo] [:id :id :long :id]]
[:selector [3 :errorWithDomain :code :userInfo] [:id :id :long :id]]
[:selector [0 :domain] [:id]]
[:selector [0 :code] [:long]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :localizedDescription] [:id]]
[:selector [0 :localizedFailureReason] [:id]]
[:selector [0 :localizedRecoverySuggestion] [:id]]
[:selector [0 :localizedRecoveryOptions] [:id]]
[:selector [0 :recoveryAttempter] [:id]]
[:selector [0 :helpAnchor] [:id]]
[:selector [3 :exceptionWithName :reason :userInfo] [:id :id :id :id]]
[:selector [3 :initWithName :reason :userInfo] [:id :id :id :id]]
[:selector [0 :name] [:id]]
[:selector [0 :reason] [:id]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :callStackReturnAddresses] [:id]]
[:selector [0 :callStackSymbols] [:id]]
[:selector [0 :raise] [:void]]
;;FIXME: NSUncaughtExceptionHandler * in NSGetUncaughtExceptionHandler
;;FIXME: NSUncaughtExceptionHandler * in NSSetUncaughtExceptionHandler
[:selector [0 :currentHandler] [:id]]
;;FIXME: variadic handleFailureInMethod:object:file:lineNumber:description:
;;FIXME: variadic handleFailureInFunction:file:lineNumber:description:
[:selector [0 :availableData] [:id]]
[:selector [0 :readDataToEndOfFile] [:id]]
[:selector [1 :readDataOfLength] [:id :unsigned-long]]
[:selector [1 :writeData] [:void :id]]
[:selector [0 :offsetInFile] [:unsigned-long-long]]
[:selector [0 :seekToEndOfFile] [:unsigned-long-long]]
[:selector [1 :seekToFileOffset] [:void :unsigned-long-long]]
[:selector [1 :truncateFileAtOffset] [:void :unsigned-long-long]]
[:selector [0 :synchronizeFile] [:void]]
[:selector [0 :closeFile] [:void]]
[:selector [0 :fileHandleForReading] [:id]]
[:selector [0 :fileHandleForWriting] [:id]]
[:selector [0 :init] [:id]]
[:selector [0 :pipe] [:id]]
[:function NSUserName [:id]]
[:function NSFullUserName [:id]]
[:function NSHomeDirectory [:id]]
[:function NSHomeDirectoryForUser [:id :id]]
[:function NSTemporaryDirectory [:id]]
[:function NSOpenStepRootDirectory [:id]]
;;FIXME: NSSearchPathDirectory in NSSearchPathForDirectoriesInDomains
[:selector [0 :defaultManager] [:id]]
;;FIXME: NSVolumeEnumerationOptions in mountedVolumeURLsIncludingResourceValuesForKeys:options:
;;FIXME: NSDirectoryEnumerationOptions in contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:
;;FIXME: NSSearchPathDirectory in URLsForDirectory:inDomains:
;;FIXME: NSSearchPathDirectory in URLForDirectory:inDomain:appropriateForURL:create:error:
;;FIXME: NSError ** in createDirectoryAtURL:withIntermediateDirectories:attributes:error:
;;FIXME: NSError ** in createSymbolicLinkAtURL:withDestinationURL:error:
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
;;FIXME: NSError ** in setAttributes:ofItemAtPath:error:
;;FIXME: NSError ** in createDirectoryAtPath:withIntermediateDirectories:attributes:error:
;;FIXME: NSError ** in contentsOfDirectoryAtPath:error:
;;FIXME: NSError ** in subpathsOfDirectoryAtPath:error:
;;FIXME: NSError ** in attributesOfItemAtPath:error:
;;FIXME: NSError ** in attributesOfFileSystemForPath:error:
;;FIXME: NSError ** in createSymbolicLinkAtPath:withDestinationPath:error:
;;FIXME: NSError ** in destinationOfSymbolicLinkAtPath:error:
;;FIXME: NSError ** in copyItemAtPath:toPath:error:
;;FIXME: NSError ** in moveItemAtPath:toPath:error:
;;FIXME: NSError ** in linkItemAtPath:toPath:error:
;;FIXME: NSError ** in removeItemAtPath:error:
;;FIXME: NSError ** in copyItemAtURL:toURL:error:
;;FIXME: NSError ** in moveItemAtURL:toURL:error:
;;FIXME: NSError ** in linkItemAtURL:toURL:error:
;;FIXME: NSError ** in removeItemAtURL:error:
;;FIXME: NSURL ** in trashItemAtURL:resultingItemURL:error:
[:selector [2 :fileAttributesAtPath :traverseLink] [:id :id Boolean]]
[:selector [2 :changeFileAttributes :atPath] [Boolean :id :id]]
[:selector [1 :directoryContentsAtPath] [:id :id]]
[:selector [1 :fileSystemAttributesAtPath] [:id :id]]
[:selector [1 :pathContentOfSymbolicLinkAtPath] [:id :id]]
[:selector [2 :createSymbolicLinkAtPath :pathContent] [Boolean :id :id]]
[:selector [2 :createDirectoryAtPath :attributes] [Boolean :id :id]]
[:selector [3 :linkPath :toPath :handler] [Boolean :id :id :id]]
[:selector [3 :copyPath :toPath :handler] [Boolean :id :id :id]]
[:selector [3 :movePath :toPath :handler] [Boolean :id :id :id]]
[:selector [2 :removeFileAtPath :handler] [Boolean :id :id]]
[:selector [0 :currentDirectoryPath] [:id]]
[:selector [1 :changeCurrentDirectoryPath] [Boolean :id]]
[:selector [1 :fileExistsAtPath] [Boolean :id]]
;;FIXME: BOOL * in fileExistsAtPath:isDirectory:
[:selector [1 :isReadableFileAtPath] [Boolean :id]]
[:selector [1 :isWritableFileAtPath] [Boolean :id]]
[:selector [1 :isExecutableFileAtPath] [Boolean :id]]
[:selector [1 :isDeletableFileAtPath] [Boolean :id]]
[:selector [2 :contentsEqualAtPath :andPath] [Boolean :id :id]]
[:selector [1 :displayNameAtPath] [:id :id]]
[:selector [1 :componentsToDisplayForPath] [:id :id]]
[:selector [1 :enumeratorAtPath] [:id :id]]
;;FIXME: NSDirectoryEnumerationOptions in enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:
[:selector [1 :subpathsAtPath] [:id :id]]
[:selector [1 :contentsAtPath] [:id :id]]
[:selector [3 :createFileAtPath :contents :attributes] [Boolean :id :id :id]]
[:selector [1 :fileSystemRepresentationWithPath] [:c-string-const :id]]
[:selector [2 :stringWithFileSystemRepresentation :length] [:id :c-string-const :unsigned-long]]
;;FIXME: NSFileManagerItemReplacementOptions in replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:
;;FIXME: NSError ** in setUbiquitous:itemAtURL:destinationURL:error:
[:selector [1 :isUbiquitousItemAtURL] [Boolean :id]]
;;FIXME: NSError ** in startDownloadingUbiquitousItemAtURL:error:
;;FIXME: NSError ** in evictUbiquitousItemAtURL:error:
[:selector [1 :URLForUbiquityContainerIdentifier] [:id :id]]
;;FIXME: NSDate ** in URLForPublishingUbiquitousItemAtURL:expirationDate:error:
[:selector [0 :ubiquityIdentityToken] [:id]]
[:selector [1 :containerURLForSecurityApplicationGroupIdentifier] [:id :id]]
[:selector [0 :fileAttributes] [:id]]
[:selector [0 :directoryAttributes] [:id]]
[:selector [0 :skipDescendents] [:void]]
[:selector [0 :level] [:unsigned-long]]
[:selector [0 :skipDescendants] [:void]]
[:selector [1 :initWithOptions] [:id :unsigned-long]]
[:selector [1 :pointerFunctionsWithOptions] [:id :unsigned-long]]
;;FIXME: NSUInteger (*)(const void *, NSUInteger (*)(const void *)) in hashFunction
;;FIXME: NSUInteger (*)(const void *, NSUInteger (*)(const void *)) in setHashFunction:
;;FIXME: BOOL (*)(const void *, const void *, NSUInteger (*)(const void *)) in isEqualFunction
;;FIXME: BOOL (*)(const void *, const void *, NSUInteger (*)(const void *)) in setIsEqualFunction:
;;FIXME: NSUInteger (*)(const void *) in sizeFunction
;;FIXME: NSUInteger (*)(const void *) in setSizeFunction:
;;FIXME: NSString *(*)(const void *) in descriptionFunction
;;FIXME: NSString *(*)(const void *) in setDescriptionFunction:
;;FIXME: void (*)(const void *, NSUInteger (*)(const void *)) in relinquishFunction
;;FIXME: void (*)(const void *, NSUInteger (*)(const void *)) in setRelinquishFunction:
;;FIXME: void *(*)(const void *, NSUInteger (*)(const void *), BOOL) in acquireFunction
;;FIXME: void *(*)(const void *, NSUInteger (*)(const void *), BOOL) in setAcquireFunction:
[:selector [0 :usesStrongWriteBarrier] [Boolean]]
[:selector [1 :setUsesStrongWriteBarrier] [:void Boolean]]
[:selector [0 :usesWeakReadAndWriteBarriers] [Boolean]]
[:selector [1 :setUsesWeakReadAndWriteBarriers] [:void Boolean]]
[:selector [2 :initWithOptions :capacity] [:id :unsigned-long :unsigned-long]]
[:selector [2 :initWithPointerFunctions :capacity] [:id :id :unsigned-long]]
[:selector [1 :hashTableWithOptions] [:id :unsigned-long]]
[:selector [0 :hashTableWithWeakObjects] [:id]]
[:selector [0 :weakObjectsHashTable] [:id]]
[:selector [0 :pointerFunctions] [:id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [1 :member] [:id :id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [1 :addObject] [:void :id]]
[:selector [1 :removeObject] [:void :id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [0 :allObjects] [:id]]
[:selector [0 :anyObject] [:id]]
[:selector [1 :containsObject] [Boolean :id]]
[:selector [1 :intersectsHashTable] [Boolean :id]]
[:selector [1 :isEqualToHashTable] [Boolean :id]]
[:selector [1 :isSubsetOfHashTable] [Boolean :id]]
[:selector [1 :intersectHashTable] [:void :id]]
[:selector [1 :unionHashTable] [:void :id]]
[:selector [1 :minusHashTable] [:void :id]]
[:selector [0 :setRepresentation] [:id]]
[:compound NSHashEnumerator "sizeof (NSHashEnumerator)"]
[:function NSFreeHashTable [:void :id]]
[:function NSResetHashTable [:void :id]]
[:function NSCompareHashTables [Boolean :id :id]]
;;FIXME: NSZone * in NSCopyHashTableWithZone
;;FIXME: void * in NSHashGet
;;FIXME: const void * in NSHashInsert
;;FIXME: const void * in NSHashInsertKnownAbsent
;;FIXME: void * in NSHashInsertIfAbsent
;;FIXME: const void * in NSHashRemove
[:function NSEnumerateHashTable [Foundation/NSHashEnumerator :id]]
;;FIXME: void * in NSNextHashEnumeratorItem
;;FIXME: NSHashEnumerator * in NSEndHashTableEnumeration
[:function NSCountHashTable [:unsigned-long :id]]
[:function NSStringFromHashTable [:id :id]]
[:function NSAllHashTableObjects [:id :id]]
[:compound NSHashTableCallBacks "sizeof (NSHashTableCallBacks)"]
;;FIXME: NSZone * in NSCreateHashTableWithZone
[:function NSCreateHashTable [:id Foundation/NSHashTableCallBacks :unsigned-long]]
[:selector [1 :initWithProperties] [:id :id]]
[:selector [1 :cookieWithProperties] [:id :id]]
[:selector [1 :requestHeaderFieldsWithCookies] [:id :id]]
[:selector [2 :cookiesWithResponseHeaderFields :forURL] [:id :id :id]]
[:selector [0 :properties] [:id]]
[:selector [0 :version] [:unsigned-long]]
[:selector [0 :name] [:id]]
[:selector [0 :value] [:id]]
[:selector [0 :expiresDate] [:id]]
[:selector [0 :isSessionOnly] [Boolean]]
[:selector [0 :domain] [:id]]
[:selector [0 :path] [:id]]
[:selector [0 :isSecure] [Boolean]]
[:selector [0 :isHTTPOnly] [Boolean]]
[:selector [0 :comment] [:id]]
[:selector [0 :commentURL] [:id]]
[:selector [0 :portList] [:id]]
[:selector [0 :sharedHTTPCookieStorage] [:id]]
[:selector [0 :cookies] [:id]]
[:selector [1 :setCookie] [:void :id]]
[:selector [1 :deleteCookie] [:void :id]]
[:selector [1 :cookiesForURL] [:id :id]]
[:selector [3 :setCookies :forURL :mainDocumentURL] [:void :id :id :id]]
;;FIXME: NSHTTPCookieAcceptPolicy in cookieAcceptPolicy
;;FIXME: NSHTTPCookieAcceptPolicy in setCookieAcceptPolicy:
[:selector [1 :sortedCookiesUsingDescriptors] [:id :id]]
[:selector [1 :indexPathWithIndex] [:id :unsigned-long]]
;;FIXME: const NSUInteger [] in indexPathWithIndexes:length:
[:selector [1 :initWithIndex] [:id :unsigned-long]]
;;FIXME: const NSUInteger [] in initWithIndexes:length:
[:selector [1 :indexPathByAddingIndex] [:id :unsigned-long]]
[:selector [0 :indexPathByRemovingLastIndex] [:id]]
[:selector [1 :indexAtPosition] [:unsigned-long :unsigned-long]]
[:selector [0 :length] [:unsigned-long]]
;;FIXME: NSUInteger * in getIndexes:
;;FIXME: NSComparisonResult in compare:
[:selector [0 :indexSet] [:id]]
[:selector [1 :indexSetWithIndex] [:id :unsigned-long]]
[:selector [1 :indexSetWithIndexesInRange] [:id Foundation/NSRange]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithIndex] [:id :unsigned-long]]
[:selector [1 :initWithIndexesInRange] [:id Foundation/NSRange]]
[:selector [1 :initWithIndexSet] [:id :id]]
[:selector [1 :isEqualToIndexSet] [Boolean :id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [0 :firstIndex] [:unsigned-long]]
[:selector [0 :lastIndex] [:unsigned-long]]
[:selector [1 :indexGreaterThanIndex] [:unsigned-long :unsigned-long]]
[:selector [1 :indexLessThanIndex] [:unsigned-long :unsigned-long]]
[:selector [1 :indexGreaterThanOrEqualToIndex] [:unsigned-long :unsigned-long]]
[:selector [1 :indexLessThanOrEqualToIndex] [:unsigned-long :unsigned-long]]
;;FIXME: NSUInteger * in getIndexes:maxCount:inIndexRange:
[:selector [1 :countOfIndexesInRange] [:unsigned-long Foundation/NSRange]]
[:selector [1 :containsIndex] [Boolean :unsigned-long]]
[:selector [1 :containsIndexesInRange] [Boolean Foundation/NSRange]]
[:selector [1 :containsIndexes] [Boolean :id]]
[:selector [1 :intersectsIndexesInRange] [Boolean Foundation/NSRange]]
;;FIXME: void (^)(NSUInteger, BOOL *) in enumerateIndexesUsingBlock:
;;FIXME: void (^)(NSUInteger, BOOL *) in enumerateIndexesWithOptions:usingBlock:
;;FIXME: void (^)(NSUInteger, BOOL *) in enumerateIndexesInRange:options:usingBlock:
;;FIXME: BOOL (^)(NSUInteger, BOOL *) in indexPassingTest:
;;FIXME: BOOL (^)(NSUInteger, BOOL *) in indexWithOptions:passingTest:
;;FIXME: BOOL (^)(NSUInteger, BOOL *) in indexInRange:options:passingTest:
;;FIXME: BOOL (^)(NSUInteger, BOOL *) in indexesPassingTest:
;;FIXME: BOOL (^)(NSUInteger, BOOL *) in indexesWithOptions:passingTest:
;;FIXME: BOOL (^)(NSUInteger, BOOL *) in indexesInRange:options:passingTest:
;;FIXME: void (^)(NSRange, BOOL *) in enumerateRangesUsingBlock:
;;FIXME: void (^)(NSRange, BOOL *) in enumerateRangesWithOptions:usingBlock:
;;FIXME: void (^)(NSRange, BOOL *) in enumerateRangesInRange:options:usingBlock:
[:selector [1 :addIndexes] [:void :id]]
[:selector [1 :removeIndexes] [:void :id]]
[:selector [0 :removeAllIndexes] [:void]]
[:selector [1 :addIndex] [:void :unsigned-long]]
[:selector [1 :removeIndex] [:void :unsigned-long]]
[:selector [1 :addIndexesInRange] [:void Foundation/NSRange]]
[:selector [1 :removeIndexesInRange] [:void Foundation/NSRange]]
[:selector [2 :shiftIndexesStartingAtIndex :by] [:void :unsigned-long :long]]
[:selector [1 :invocationWithMethodSignature] [:id :id]]
[:selector [0 :methodSignature] [:id]]
[:selector [0 :retainArguments] [:void]]
[:selector [0 :argumentsRetained] [Boolean]]
[:selector [0 :target] [:id]]
[:selector [1 :setTarget] [:void :id]]
[:selector [0 :selector] [:selector]]
[:selector [1 :setSelector] [:void :selector]]
;;FIXME: void * in getReturnValue:
;;FIXME: void * in setReturnValue:
;;FIXME: void * in getArgument:atIndex:
;;FIXME: void * in setArgument:atIndex:
[:selector [0 :invoke] [:void]]
[:selector [1 :invokeWithTarget] [:void :id]]
[:selector [1 :isValidJSONObject] [Boolean :id]]
;;FIXME: NSJSONWritingOptions in dataWithJSONObject:options:error:
;;FIXME: NSJSONReadingOptions in JSONObjectWithData:options:error:
;;FIXME: NSJSONWritingOptions in writeJSONObject:toStream:options:error:
;;FIXME: NSJSONReadingOptions in JSONObjectWithStream:options:error:
[:selector [0 :count] [:unsigned-long]]
[:selector [1 :objectAtIndex] [:id :unsigned-long]]
[:selector [1 :indexOfObject] [:unsigned-long :id]]
[:selector [2 :insertObject :atIndex] [:void :id :unsigned-long]]
[:selector [1 :removeObjectAtIndex] [:void :unsigned-long]]
[:selector [2 :replaceObjectAtIndex :withObject] [:void :unsigned-long :id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [1 :member] [:id :id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [1 :addObject] [:void :id]]
[:selector [1 :removeObject] [:void :id]]
[:selector [1 :initWithCapacity] [:id :unsigned-long]]
[:selector [1 :initWithArray] [:id :id]]
[:selector [1 :initWithSet] [:id :id]]
[:selector [1 :countForObject] [:unsigned-long :id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [1 :addObject] [:void :id]]
[:selector [1 :removeObject] [:void :id]]
;;FIXME: NSPropertyListFormat in propertyList:isValidForFormat:
;;FIXME: NSPropertyListFormat in dataWithPropertyList:format:options:error:
;;FIXME: NSPropertyListFormat in writePropertyList:toStream:format:options:error:
;;FIXME: NSPropertyListFormat * in propertyListWithData:options:format:error:
;;FIXME: NSPropertyListFormat * in propertyListWithStream:options:format:error:
;;FIXME: NSPropertyListFormat in dataFromPropertyList:format:errorDescription:
;;FIXME: NSPropertyListMutabilityOptions in propertyListFromData:mutabilityOption:format:errorDescription:
[:compound CGPoint "sizeof (CGPoint)"]
[:compound CGSize "sizeof (CGSize)"]
[:compound CGRect "sizeof (CGRect)"]
[:function CGPointMake [Foundation/CGPoint :double :double]]
[:function CGSizeMake [Foundation/CGSize :double :double]]
[:function CGRectMake [Foundation/CGRect :double :double :double :double]]
[:function CGRectGetMinX [:double Foundation/CGRect]]
[:function CGRectGetMidX [:double Foundation/CGRect]]
[:function CGRectGetMaxX [:double Foundation/CGRect]]
[:function CGRectGetMinY [:double Foundation/CGRect]]
[:function CGRectGetMidY [:double Foundation/CGRect]]
[:function CGRectGetMaxY [:double Foundation/CGRect]]
[:function CGRectGetWidth [:double Foundation/CGRect]]
[:function CGRectGetHeight [:double Foundation/CGRect]]
[:function CGPointEqualToPoint [Boolean Foundation/CGPoint Foundation/CGPoint]]
[:function CGSizeEqualToSize [Boolean Foundation/CGSize Foundation/CGSize]]
[:function CGRectEqualToRect [Boolean Foundation/CGRect Foundation/CGRect]]
[:function CGRectStandardize [Foundation/CGRect Foundation/CGRect]]
[:function CGRectIsEmpty [Boolean Foundation/CGRect]]
[:function CGRectIsNull [Boolean Foundation/CGRect]]
[:function CGRectIsInfinite [Boolean Foundation/CGRect]]
[:function CGRectInset [Foundation/CGRect Foundation/CGRect :double :double]]
[:function CGRectIntegral [Foundation/CGRect Foundation/CGRect]]
[:function CGRectUnion [Foundation/CGRect Foundation/CGRect Foundation/CGRect]]
[:function CGRectIntersection [Foundation/CGRect Foundation/CGRect Foundation/CGRect]]
[:function CGRectOffset [Foundation/CGRect Foundation/CGRect :double :double]]
;;FIXME: CGRect * in CGRectDivide
[:function CGRectContainsPoint [Boolean Foundation/CGRect Foundation/CGPoint]]
[:function CGRectContainsRect [Boolean Foundation/CGRect Foundation/CGRect]]
[:function CGRectIntersectsRect [Boolean Foundation/CGRect Foundation/CGRect]]
;;FIXME: CFDictionaryRef in CGPointCreateDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGPointMakeWithDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGSizeCreateDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGSizeMakeWithDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGRectCreateDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGRectMakeWithDictionaryRepresentation
[:function CGPointMake [Foundation/CGPoint :double :double]]
[:function CGSizeMake [Foundation/CGSize :double :double]]
[:function CGRectMake [Foundation/CGRect :double :double :double :double]]
[:function __CGPointEqualToPoint [Boolean Foundation/CGPoint Foundation/CGPoint]]
[:function __CGSizeEqualToSize [Boolean Foundation/CGSize Foundation/CGSize]]
;;FIXME: NSPoint in NSMakePoint
;;FIXME: NSSize in NSMakeSize
;;FIXME: NSRect in NSMakeRect
;;FIXME: NSRect in NSMaxX
;;FIXME: NSRect in NSMaxY
;;FIXME: NSRect in NSMidX
;;FIXME: NSRect in NSMidY
;;FIXME: NSRect in NSMinX
;;FIXME: NSRect in NSMinY
;;FIXME: NSRect in NSWidth
;;FIXME: NSRect in NSHeight
;;FIXME: NSRect in NSRectFromCGRect
;;FIXME: NSRect in NSRectToCGRect
;;FIXME: NSPoint in NSPointFromCGPoint
;;FIXME: NSPoint in NSPointToCGPoint
;;FIXME: NSSize in NSSizeFromCGSize
;;FIXME: NSSize in NSSizeToCGSize
;;FIXME: NSPoint in NSEqualPoints
;;FIXME: NSSize in NSEqualSizes
;;FIXME: NSRect in NSEqualRects
;;FIXME: NSRect in NSIsEmptyRect
;;FIXME: NSRect in NSInsetRect
;;FIXME: NSRect in NSIntegralRect
;;FIXME: NSRect in NSIntegralRectWithOptions
;;FIXME: NSRect in NSUnionRect
;;FIXME: NSRect in NSIntersectionRect
;;FIXME: NSRect in NSOffsetRect
;;FIXME: NSRect in NSDivideRect
;;FIXME: NSPoint in NSPointInRect
;;FIXME: NSPoint in NSMouseInRect
;;FIXME: NSRect in NSContainsRect
;;FIXME: NSRect in NSIntersectsRect
;;FIXME: NSPoint in NSStringFromPoint
;;FIXME: NSSize in NSStringFromSize
;;FIXME: NSRect in NSStringFromRect
;;FIXME: NSPoint in NSPointFromString
;;FIXME: NSSize in NSSizeFromString
;;FIXME: NSRect in NSRectFromString
[:selector [1 :archivedDataWithRootObject] [:id :id]]
[:selector [2 :archiveRootObject :toFile] [Boolean :id :id]]
[:selector [1 :initForWritingWithMutableData] [:id :id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
;;FIXME: NSPropertyListFormat in setOutputFormat:
;;FIXME: NSPropertyListFormat in outputFormat
[:selector [0 :finishEncoding] [:void]]
[:selector [2 :setClassName :forClass] [:void :id :id]]
[:selector [2 :setClassName :forClass] [:void :id :id]]
[:selector [1 :classNameForClass] [:id :id]]
[:selector [1 :classNameForClass] [:id :id]]
[:selector [2 :encodeObject :forKey] [:void :id :id]]
[:selector [2 :encodeConditionalObject :forKey] [:void :id :id]]
[:selector [2 :encodeBool :forKey] [:void Boolean :id]]
[:selector [2 :encodeInt :forKey] [:void :int :id]]
[:selector [2 :encodeInt32 :forKey] [:void :int :id]]
[:selector [2 :encodeInt64 :forKey] [:void :long-long :id]]
[:selector [2 :encodeFloat :forKey] [:void :float :id]]
[:selector [2 :encodeDouble :forKey] [:void :double :id]]
;;FIXME: const uint8_t * in encodeBytes:length:forKey:
[:selector [1 :unarchiveObjectWithData] [:id :id]]
[:selector [1 :unarchiveObjectWithFile] [:id :id]]
[:selector [1 :initForReadingWithData] [:id :id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [0 :finishDecoding] [:void]]
[:selector [2 :setClass :forClassName] [:void :id :id]]
[:selector [2 :setClass :forClassName] [:void :id :id]]
[:selector [1 :classForClassName] [:id :id]]
[:selector [1 :classForClassName] [:id :id]]
[:selector [1 :containsValueForKey] [Boolean :id]]
[:selector [1 :decodeObjectForKey] [:id :id]]
[:selector [1 :decodeBoolForKey] [Boolean :id]]
[:selector [1 :decodeIntForKey] [:int :id]]
[:selector [1 :decodeInt32ForKey] [:int :id]]
[:selector [1 :decodeInt64ForKey] [:long-long :id]]
[:selector [1 :decodeFloatForKey] [:float :id]]
[:selector [1 :decodeDoubleForKey] [:double :id]]
;;FIXME: const uint8_t * in decodeBytesForKey:returnedLength:
[:selector [1 :objectForKey] [:id :id]]
[:selector [2 :displayNameForKey :value] [:id :id :id]]
[:selector [0 :tryLock] [Boolean]]
[:selector [1 :lockBeforeDate] [Boolean :id]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [1 :initWithCondition] [:id :long]]
[:selector [0 :condition] [:long]]
[:selector [1 :lockWhenCondition] [:void :long]]
[:selector [0 :tryLock] [Boolean]]
[:selector [1 :tryLockWhenCondition] [Boolean :long]]
[:selector [1 :unlockWithCondition] [:void :long]]
[:selector [1 :lockBeforeDate] [Boolean :id]]
[:selector [2 :lockWhenCondition :beforeDate] [Boolean :long :id]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [0 :tryLock] [Boolean]]
[:selector [1 :lockBeforeDate] [Boolean :id]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [0 :wait] [:void]]
[:selector [1 :waitUntilDate] [Boolean :id]]
[:selector [0 :signal] [:void]]
[:selector [0 :broadcast] [:void]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [3 :initWithKeyOptions :valueOptions :capacity] [:id :unsigned-long :unsigned-long :unsigned-long]]
[:selector [3 :initWithKeyPointerFunctions :valuePointerFunctions :capacity] [:id :id :id :unsigned-long]]
[:selector [2 :mapTableWithKeyOptions :valueOptions] [:id :unsigned-long :unsigned-long]]
[:selector [0 :mapTableWithStrongToStrongObjects] [:id]]
[:selector [0 :mapTableWithWeakToStrongObjects] [:id]]
[:selector [0 :mapTableWithStrongToWeakObjects] [:id]]
[:selector [0 :mapTableWithWeakToWeakObjects] [:id]]
[:selector [0 :strongToStrongObjectsMapTable] [:id]]
[:selector [0 :weakToStrongObjectsMapTable] [:id]]
[:selector [0 :strongToWeakObjectsMapTable] [:id]]
[:selector [0 :weakToWeakObjectsMapTable] [:id]]
[:selector [0 :keyPointerFunctions] [:id]]
[:selector [0 :valuePointerFunctions] [:id]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [0 :keyEnumerator] [:id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [0 :dictionaryRepresentation] [:id]]
[:compound NSMapEnumerator "sizeof (NSMapEnumerator)"]
[:function NSFreeMapTable [:void :id]]
[:function NSResetMapTable [:void :id]]
[:function NSCompareMapTables [Boolean :id :id]]
;;FIXME: NSZone * in NSCopyMapTableWithZone
;;FIXME: const void * in NSMapMember
;;FIXME: void * in NSMapGet
;;FIXME: const void * in NSMapInsert
;;FIXME: const void * in NSMapInsertKnownAbsent
;;FIXME: void * in NSMapInsertIfAbsent
;;FIXME: const void * in NSMapRemove
[:function NSEnumerateMapTable [Foundation/NSMapEnumerator :id]]
;;FIXME: NSMapEnumerator * in NSNextMapEnumeratorPair
;;FIXME: NSMapEnumerator * in NSEndMapTableEnumeration
[:function NSCountMapTable [:unsigned-long :id]]
[:function NSStringFromMapTable [:id :id]]
[:function NSAllMapTableKeys [:id :id]]
[:function NSAllMapTableValues [:id :id]]
[:compound NSMapTableKeyCallBacks "sizeof (NSMapTableKeyCallBacks)"]
[:compound NSMapTableValueCallBacks "sizeof (NSMapTableValueCallBacks)"]
;;FIXME: NSZone * in NSCreateMapTableWithZone
[:function NSCreateMapTable [:id Foundation/NSMapTableKeyCallBacks Foundation/NSMapTableValueCallBacks :unsigned-long]]
[:selector [1 :signatureWithObjCTypes] [:id :c-string-const]]
[:selector [0 :numberOfArguments] [:unsigned-long]]
[:selector [1 :getArgumentTypeAtIndex] [:c-string-const :unsigned-long]]
[:selector [0 :frameLength] [:unsigned-long]]
[:selector [0 :isOneway] [Boolean]]
[:selector [0 :methodReturnType] [:c-string-const]]
[:selector [0 :methodReturnLength] [:unsigned-long]]
[:selector [0 :name] [:id]]
[:selector [0 :object] [:id]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :defaultCenter] [:id]]
[:selector [4 :addObserver :selector :name :object] [:void :id :selector :id :id]]
[:selector [1 :postNotification] [:void :id]]
[:selector [2 :postNotificationName :object] [:void :id :id]]
[:selector [3 :postNotificationName :object :userInfo] [:void :id :id :id]]
[:selector [1 :removeObserver] [:void :id]]
[:selector [3 :removeObserver :name :object] [:void :id :id :id]]
;;FIXME: void (^)(NSNotification *) in addObserverForName:object:queue:usingBlock:
[:selector [0 :defaultQueue] [:id]]
[:selector [1 :initWithNotificationCenter] [:id :id]]
;;FIXME: NSPostingStyle in enqueueNotification:postingStyle:
;;FIXME: NSPostingStyle in enqueueNotification:postingStyle:coalesceMask:forModes:
[:selector [2 :dequeueNotificationsMatching :coalesceMask] [:void :id :unsigned-long]]
[:selector [0 :null] [:id]]
;;FIXME: id * in getObjectValue:forString:range:error:
[:selector [1 :stringFromNumber] [:id :id]]
[:selector [1 :numberFromString] [:id :id]]
;;FIXME: NSNumberFormatterStyle in localizedStringFromNumber:numberStyle:
;;FIXME: NSNumberFormatterStyle in numberStyle
;;FIXME: NSNumberFormatterStyle in setNumberStyle:
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :generatesDecimalNumbers] [Boolean]]
[:selector [1 :setGeneratesDecimalNumbers] [:void Boolean]]
;;FIXME: NSNumberFormatterBehavior in formatterBehavior
;;FIXME: NSNumberFormatterBehavior in setFormatterBehavior:
;;FIXME: NSNumberFormatterBehavior in defaultFormatterBehavior
;;FIXME: NSNumberFormatterBehavior in setDefaultFormatterBehavior:
[:selector [0 :negativeFormat] [:id]]
[:selector [1 :setNegativeFormat] [:void :id]]
[:selector [0 :textAttributesForNegativeValues] [:id]]
[:selector [1 :setTextAttributesForNegativeValues] [:void :id]]
[:selector [0 :positiveFormat] [:id]]
[:selector [1 :setPositiveFormat] [:void :id]]
[:selector [0 :textAttributesForPositiveValues] [:id]]
[:selector [1 :setTextAttributesForPositiveValues] [:void :id]]
[:selector [0 :allowsFloats] [Boolean]]
[:selector [1 :setAllowsFloats] [:void Boolean]]
[:selector [0 :decimalSeparator] [:id]]
[:selector [1 :setDecimalSeparator] [:void :id]]
[:selector [0 :alwaysShowsDecimalSeparator] [Boolean]]
[:selector [1 :setAlwaysShowsDecimalSeparator] [:void Boolean]]
[:selector [0 :currencyDecimalSeparator] [:id]]
[:selector [1 :setCurrencyDecimalSeparator] [:void :id]]
[:selector [0 :usesGroupingSeparator] [Boolean]]
[:selector [1 :setUsesGroupingSeparator] [:void Boolean]]
[:selector [0 :groupingSeparator] [:id]]
[:selector [1 :setGroupingSeparator] [:void :id]]
[:selector [0 :zeroSymbol] [:id]]
[:selector [1 :setZeroSymbol] [:void :id]]
[:selector [0 :textAttributesForZero] [:id]]
[:selector [1 :setTextAttributesForZero] [:void :id]]
[:selector [0 :nilSymbol] [:id]]
[:selector [1 :setNilSymbol] [:void :id]]
[:selector [0 :textAttributesForNil] [:id]]
[:selector [1 :setTextAttributesForNil] [:void :id]]
[:selector [0 :notANumberSymbol] [:id]]
[:selector [1 :setNotANumberSymbol] [:void :id]]
[:selector [0 :textAttributesForNotANumber] [:id]]
[:selector [1 :setTextAttributesForNotANumber] [:void :id]]
[:selector [0 :positiveInfinitySymbol] [:id]]
[:selector [1 :setPositiveInfinitySymbol] [:void :id]]
[:selector [0 :textAttributesForPositiveInfinity] [:id]]
[:selector [1 :setTextAttributesForPositiveInfinity] [:void :id]]
[:selector [0 :negativeInfinitySymbol] [:id]]
[:selector [1 :setNegativeInfinitySymbol] [:void :id]]
[:selector [0 :textAttributesForNegativeInfinity] [:id]]
[:selector [1 :setTextAttributesForNegativeInfinity] [:void :id]]
[:selector [0 :positivePrefix] [:id]]
[:selector [1 :setPositivePrefix] [:void :id]]
[:selector [0 :positiveSuffix] [:id]]
[:selector [1 :setPositiveSuffix] [:void :id]]
[:selector [0 :negativePrefix] [:id]]
[:selector [1 :setNegativePrefix] [:void :id]]
[:selector [0 :negativeSuffix] [:id]]
[:selector [1 :setNegativeSuffix] [:void :id]]
[:selector [0 :currencyCode] [:id]]
[:selector [1 :setCurrencyCode] [:void :id]]
[:selector [0 :currencySymbol] [:id]]
[:selector [1 :setCurrencySymbol] [:void :id]]
[:selector [0 :internationalCurrencySymbol] [:id]]
[:selector [1 :setInternationalCurrencySymbol] [:void :id]]
[:selector [0 :percentSymbol] [:id]]
[:selector [1 :setPercentSymbol] [:void :id]]
[:selector [0 :perMillSymbol] [:id]]
[:selector [1 :setPerMillSymbol] [:void :id]]
[:selector [0 :minusSign] [:id]]
[:selector [1 :setMinusSign] [:void :id]]
[:selector [0 :plusSign] [:id]]
[:selector [1 :setPlusSign] [:void :id]]
[:selector [0 :exponentSymbol] [:id]]
[:selector [1 :setExponentSymbol] [:void :id]]
[:selector [0 :groupingSize] [:unsigned-long]]
[:selector [1 :setGroupingSize] [:void :unsigned-long]]
[:selector [0 :secondaryGroupingSize] [:unsigned-long]]
[:selector [1 :setSecondaryGroupingSize] [:void :unsigned-long]]
[:selector [0 :multiplier] [:id]]
[:selector [1 :setMultiplier] [:void :id]]
[:selector [0 :formatWidth] [:unsigned-long]]
[:selector [1 :setFormatWidth] [:void :unsigned-long]]
[:selector [0 :paddingCharacter] [:id]]
[:selector [1 :setPaddingCharacter] [:void :id]]
;;FIXME: NSNumberFormatterPadPosition in paddingPosition
;;FIXME: NSNumberFormatterPadPosition in setPaddingPosition:
;;FIXME: NSNumberFormatterRoundingMode in roundingMode
;;FIXME: NSNumberFormatterRoundingMode in setRoundingMode:
[:selector [0 :roundingIncrement] [:id]]
[:selector [1 :setRoundingIncrement] [:void :id]]
[:selector [0 :minimumIntegerDigits] [:unsigned-long]]
[:selector [1 :setMinimumIntegerDigits] [:void :unsigned-long]]
[:selector [0 :maximumIntegerDigits] [:unsigned-long]]
[:selector [1 :setMaximumIntegerDigits] [:void :unsigned-long]]
[:selector [0 :minimumFractionDigits] [:unsigned-long]]
[:selector [1 :setMinimumFractionDigits] [:void :unsigned-long]]
[:selector [0 :maximumFractionDigits] [:unsigned-long]]
[:selector [1 :setMaximumFractionDigits] [:void :unsigned-long]]
[:selector [0 :minimum] [:id]]
[:selector [1 :setMinimum] [:void :id]]
[:selector [0 :maximum] [:id]]
[:selector [1 :setMaximum] [:void :id]]
[:selector [0 :currencyGroupingSeparator] [:id]]
[:selector [1 :setCurrencyGroupingSeparator] [:void :id]]
[:selector [0 :isLenient] [Boolean]]
[:selector [1 :setLenient] [:void Boolean]]
[:selector [0 :usesSignificantDigits] [Boolean]]
[:selector [1 :setUsesSignificantDigits] [:void Boolean]]
[:selector [0 :minimumSignificantDigits] [:unsigned-long]]
[:selector [1 :setMinimumSignificantDigits] [:void :unsigned-long]]
[:selector [0 :maximumSignificantDigits] [:unsigned-long]]
[:selector [1 :setMaximumSignificantDigits] [:void :unsigned-long]]
[:selector [0 :isPartialStringValidationEnabled] [Boolean]]
[:selector [1 :setPartialStringValidationEnabled] [:void Boolean]]
[:selector [0 :init] [:id]]
[:selector [0 :start] [:void]]
[:selector [0 :main] [:void]]
[:selector [0 :isCancelled] [Boolean]]
[:selector [0 :cancel] [:void]]
[:selector [0 :isExecuting] [Boolean]]
[:selector [0 :isFinished] [Boolean]]
[:selector [0 :isConcurrent] [Boolean]]
[:selector [0 :isReady] [Boolean]]
[:selector [1 :addDependency] [:void :id]]
[:selector [1 :removeDependency] [:void :id]]
[:selector [0 :dependencies] [:id]]
;;FIXME: NSOperationQueuePriority in queuePriority
;;FIXME: NSOperationQueuePriority in setQueuePriority:
;;FIXME: void (^)(void) in completionBlock
;;FIXME: void (^)(void) in setCompletionBlock:
[:selector [0 :waitUntilFinished] [:void]]
[:selector [0 :threadPriority] [:double]]
[:selector [1 :setThreadPriority] [:void :double]]
;;FIXME: void (^)(void) in blockOperationWithBlock:
;;FIXME: void (^)(void) in addExecutionBlock:
[:selector [0 :executionBlocks] [:id]]
[:selector [3 :initWithTarget :selector :object] [:id :id :selector :id]]
[:selector [1 :initWithInvocation] [:id :id]]
[:selector [0 :invocation] [:id]]
[:selector [0 :result] [:id]]
[:selector [1 :addOperation] [:void :id]]
[:selector [2 :addOperations :waitUntilFinished] [:void :id Boolean]]
;;FIXME: void (^)(void) in addOperationWithBlock:
[:selector [0 :operations] [:id]]
[:selector [0 :operationCount] [:unsigned-long]]
[:selector [0 :maxConcurrentOperationCount] [:long]]
[:selector [1 :setMaxConcurrentOperationCount] [:void :long]]
[:selector [1 :setSuspended] [:void Boolean]]
[:selector [0 :isSuspended] [Boolean]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [0 :cancelAllOperations] [:void]]
[:selector [0 :waitUntilAllOperationsAreFinished] [:void]]
[:selector [0 :currentQueue] [:id]]
[:selector [0 :mainQueue] [:id]]
[:selector [0 :dominantScript] [:id]]
[:selector [0 :languageMap] [:id]]
[:selector [1 :initWithOptions] [:id :unsigned-long]]
[:selector [1 :initWithPointerFunctions] [:id :id]]
[:selector [1 :pointerArrayWithOptions] [:id :unsigned-long]]
[:selector [1 :pointerArrayWithPointerFunctions] [:id :id]]
[:selector [0 :pointerFunctions] [:id]]
;;FIXME: void * in pointerAtIndex:
;;FIXME: void * in addPointer:
[:selector [1 :removePointerAtIndex] [:void :unsigned-long]]
;;FIXME: void * in insertPointer:atIndex:
;;FIXME: void * in replacePointerAtIndex:withPointer:
[:selector [0 :compact] [:void]]
[:selector [0 :count] [:unsigned-long]]
[:selector [1 :setCount] [:void :unsigned-long]]
[:selector [0 :port] [:id]]
[:selector [0 :invalidate] [:void]]
[:selector [0 :isValid] [Boolean]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
[:selector [0 :reservedSpaceLength] [:unsigned-long]]
[:selector [4 :sendBeforeDate :components :from :reserved] [Boolean :id :id :id :unsigned-long]]
[:selector [5 :sendBeforeDate :msgid :components :from :reserved] [Boolean :id :unsigned-long :id :id :unsigned-long]]
[:selector [3 :addConnection :toRunLoop :forMode] [:void :id :id :id]]
[:selector [3 :removeConnection :fromRunLoop :forMode] [:void :id :id :id]]
[:selector [1 :portWithMachPort] [:id :unsigned-int]]
[:selector [1 :initWithMachPort] [:id :unsigned-int]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [2 :portWithMachPort :options] [:id :unsigned-int :unsigned-long]]
[:selector [2 :initWithMachPort :options] [:id :unsigned-int :unsigned-long]]
[:selector [0 :machPort] [:unsigned-int]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithTCPPort] [:id :unsigned-short]]
[:selector [4 :initWithProtocolFamily :socketType :protocol :address] [:id :int :int :int :id]]
[:selector [4 :initWithProtocolFamily :socketType :protocol :socket] [:id :int :int :int :int]]
[:selector [2 :initRemoteWithTCPPort :host] [:id :unsigned-short :id]]
[:selector [4 :initRemoteWithProtocolFamily :socketType :protocol :address] [:id :int :int :int :id]]
[:selector [0 :protocolFamily] [:int]]
[:selector [0 :socketType] [:int]]
[:selector [0 :protocol] [:int]]
[:selector [0 :address] [:id]]
[:selector [0 :socket] [:int]]
[:selector [0 :processInfo] [:id]]
[:selector [0 :environment] [:id]]
[:selector [0 :arguments] [:id]]
[:selector [0 :hostName] [:id]]
[:selector [0 :processName] [:id]]
[:selector [0 :processIdentifier] [:int]]
[:selector [1 :setProcessName] [:void :id]]
[:selector [0 :globallyUniqueString] [:id]]
[:selector [0 :operatingSystem] [:unsigned-long]]
[:selector [0 :operatingSystemName] [:id]]
[:selector [0 :operatingSystemVersionString] [:id]]
[:selector [0 :processorCount] [:unsigned-long]]
[:selector [0 :activeProcessorCount] [:unsigned-long]]
[:selector [0 :physicalMemory] [:unsigned-long-long]]
[:selector [0 :systemUptime] [:double]]
[:selector [0 :disableSuddenTermination] [:void]]
[:selector [0 :enableSuddenTermination] [:void]]
[:selector [1 :disableAutomaticTermination] [:void :id]]
[:selector [1 :enableAutomaticTermination] [:void :id]]
[:selector [1 :setAutomaticTerminationSupportEnabled] [:void Boolean]]
[:selector [0 :automaticTerminationSupportEnabled] [Boolean]]
[:selector [0 :alloc] [:id]]
;;FIXME: NSZone * in allocWithZone:
[:selector [0 :class] [:id]]
[:selector [1 :forwardInvocation] [:void :id]]
[:selector [1 :methodSignatureForSelector] [:id :selector]]
[:selector [0 :dealloc] [:void]]
[:selector [0 :finalize] [:void]]
[:selector [0 :description] [:id]]
[:selector [0 :debugDescription] [:id]]
[:selector [1 :respondsToSelector] [Boolean :selector]]
[:selector [0 :allowsWeakReference] [Boolean]]
[:selector [0 :retainWeakReference] [Boolean]]
;;FIXME: NSTextCheckingType in resultType
[:selector [0 :range] [Foundation/NSRange]]
;;FIXME: NSRegularExpressionOptions in regularExpressionWithPattern:options:error:
;;FIXME: NSRegularExpressionOptions in initWithPattern:options:error:
[:selector [1 :escapedPatternForString] [:id :id]]
[:selector [0 :pattern] [:id]]
;;FIXME: NSRegularExpressionOptions in options
[:selector [0 :numberOfCaptureGroups] [:unsigned-long]]
;;FIXME: NSTextCheckingTypes in dataDetectorWithTypes:error:
;;FIXME: NSTextCheckingTypes in initWithTypes:error:
[:selector [0 :checkingTypes] [:id]]
[:selector [0 :currentRunLoop] [:id]]
[:selector [0 :mainRunLoop] [:id]]
[:selector [0 :currentMode] [:id]]
;;FIXME: CFRunLoopRef in getCFRunLoop
[:selector [2 :addTimer :forMode] [:void :id :id]]
[:selector [2 :addPort :forMode] [:void :id :id]]
[:selector [2 :removePort :forMode] [:void :id :id]]
[:selector [1 :limitDateForMode] [:id :id]]
[:selector [2 :acceptInputForMode :beforeDate] [:void :id :id]]
[:selector [2 :sortDescriptorWithKey :ascending] [:id :id Boolean]]
[:selector [3 :sortDescriptorWithKey :ascending :selector] [:id :id Boolean :selector]]
[:selector [2 :initWithKey :ascending] [:id :id Boolean]]
[:selector [3 :initWithKey :ascending :selector] [:id :id Boolean :selector]]
[:selector [0 :key] [:id]]
[:selector [0 :ascending] [Boolean]]
[:selector [0 :selector] [:selector]]
;;FIXME: NSComparator in sortDescriptorWithKey:ascending:comparator:
;;FIXME: NSComparator in initWithKey:ascending:comparator:
;;FIXME: NSComparator in comparator
;;FIXME: NSComparisonResult in compareObject:toObject:
[:selector [0 :reversedSortDescriptor] [:id]]
[:selector [0 :open] [:void]]
[:selector [0 :close] [:void]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [1 :propertyForKey] [:id :id]]
[:selector [2 :setProperty :forKey] [Boolean :id :id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
;;FIXME: NSStreamStatus in streamStatus
[:selector [0 :streamError] [:id]]
;;FIXME: uint8_t * in read:maxLength:
;;FIXME: uint8_t ** in getBuffer:length:
[:selector [0 :hasBytesAvailable] [Boolean]]
;;FIXME: const uint8_t * in write:maxLength:
[:selector [0 :hasSpaceAvailable] [Boolean]]
[:selector [0 :currentThread] [:id]]
[:selector [3 :detachNewThreadSelector :toTarget :withObject] [:void :selector :id :id]]
[:selector [0 :isMultiThreaded] [Boolean]]
[:selector [0 :threadDictionary] [:id]]
[:selector [1 :sleepUntilDate] [:void :id]]
[:selector [1 :sleepForTimeInterval] [:void :double]]
[:selector [0 :exit] [:void]]
[:selector [0 :threadPriority] [:double]]
[:selector [1 :setThreadPriority] [Boolean :double]]
[:selector [0 :threadPriority] [:double]]
[:selector [1 :setThreadPriority] [:void :double]]
[:selector [0 :callStackReturnAddresses] [:id]]
[:selector [0 :callStackSymbols] [:id]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [0 :stackSize] [:unsigned-long]]
[:selector [1 :setStackSize] [:void :unsigned-long]]
[:selector [0 :isMainThread] [Boolean]]
[:selector [0 :isMainThread] [Boolean]]
[:selector [0 :mainThread] [:id]]
[:selector [0 :init] [:id]]
[:selector [3 :initWithTarget :selector :object] [:id :id :selector :id]]
[:selector [0 :isExecuting] [Boolean]]
[:selector [0 :isFinished] [Boolean]]
[:selector [0 :isCancelled] [Boolean]]
[:selector [0 :cancel] [:void]]
[:selector [0 :start] [:void]]
[:selector [0 :main] [:void]]
[:selector [0 :name] [:id]]
[:selector [0 :data] [:id]]
[:selector [1 :secondsFromGMTForDate] [:long :id]]
[:selector [1 :abbreviationForDate] [:id :id]]
[:selector [1 :isDaylightSavingTimeForDate] [Boolean :id]]
[:selector [1 :daylightSavingTimeOffsetForDate] [:double :id]]
[:selector [1 :nextDaylightSavingTimeTransitionAfterDate] [:id :id]]
[:selector [3 :timerWithTimeInterval :invocation :repeats] [:id :double :id Boolean]]
[:selector [3 :scheduledTimerWithTimeInterval :invocation :repeats] [:id :double :id Boolean]]
[:selector [5 :timerWithTimeInterval :target :selector :userInfo :repeats] [:id :double :id :selector :id Boolean]]
[:selector [5 :scheduledTimerWithTimeInterval :target :selector :userInfo :repeats] [:id :double :id :selector :id Boolean]]
[:selector [6 :initWithFireDate :interval :target :selector :userInfo :repeats] [:id :id :double :id :selector :id Boolean]]
[:selector [0 :fire] [:void]]
[:selector [0 :fireDate] [:id]]
[:selector [1 :setFireDate] [:void :id]]
[:selector [0 :timeInterval] [:double]]
[:selector [0 :invalidate] [:void]]
[:selector [0 :isValid] [Boolean]]
[:selector [0 :userInfo] [:id]]
[:selector [1 :registerURLHandleClass] [:void :id]]
[:selector [1 :URLHandleClassForURL] [:id :id]]
;;FIXME: NSURLHandleStatus in status
[:selector [0 :failureReason] [:id]]
[:selector [1 :addClient] [:void :id]]
[:selector [1 :removeClient] [:void :id]]
[:selector [0 :loadInBackground] [:void]]
[:selector [0 :cancelLoadInBackground] [:void]]
[:selector [0 :resourceData] [:id]]
[:selector [0 :availableResourceData] [:id]]
[:selector [0 :expectedResourceDataSize] [:long-long]]
[:selector [0 :flushCachedData] [:void]]
[:selector [1 :backgroundLoadDidFailWithReason] [:void :id]]
[:selector [2 :didLoadBytes :loadComplete] [:void :id Boolean]]
[:selector [1 :canInitWithURL] [Boolean :id]]
[:selector [1 :cachedHandleForURL] [:id :id]]
[:selector [2 :initWithURL :cached] [:id :id Boolean]]
[:selector [1 :propertyForKey] [:id :id]]
[:selector [1 :propertyForKeyIfAvailable] [:id :id]]
[:selector [2 :writeProperty :forKey] [Boolean :id :id]]
[:selector [1 :writeData] [Boolean :id]]
[:selector [0 :loadInForeground] [:id]]
[:selector [0 :beginLoadInBackground] [:void]]
[:selector [0 :endLoadInBackground] [:void]]
[:selector [3 :initWithScheme :host :path] [:id :id :id :id]]
[:selector [2 :initFileURLWithPath :isDirectory] [:id :id Boolean]]
[:selector [1 :initFileURLWithPath] [:id :id]]
[:selector [2 :fileURLWithPath :isDirectory] [:id :id Boolean]]
[:selector [1 :fileURLWithPath] [:id :id]]
[:selector [1 :initWithString] [:id :id]]
[:selector [2 :initWithString :relativeToURL] [:id :id :id]]
[:selector [1 :URLWithString] [:id :id]]
[:selector [2 :URLWithString :relativeToURL] [:id :id :id]]
[:selector [0 :absoluteString] [:id]]
[:selector [0 :relativeString] [:id]]
[:selector [0 :baseURL] [:id]]
[:selector [0 :absoluteURL] [:id]]
[:selector [0 :scheme] [:id]]
[:selector [0 :resourceSpecifier] [:id]]
[:selector [0 :host] [:id]]
[:selector [0 :port] [:id]]
[:selector [0 :user] [:id]]
[:selector [0 :password] [:id]]
[:selector [0 :path] [:id]]
[:selector [0 :fragment] [:id]]
[:selector [0 :parameterString] [:id]]
[:selector [0 :query] [:id]]
[:selector [0 :relativePath] [:id]]
[:selector [0 :isFileURL] [Boolean]]
[:selector [0 :standardizedURL] [:id]]
;;FIXME: NSError ** in checkResourceIsReachableAndReturnError:
[:selector [0 :isFileReferenceURL] [Boolean]]
[:selector [0 :fileReferenceURL] [:id]]
[:selector [0 :filePathURL] [:id]]
;;FIXME: id * in getResourceValue:forKey:error:
;;FIXME: NSError ** in resourceValuesForKeys:error:
;;FIXME: NSError ** in setResourceValue:forKey:error:
;;FIXME: NSError ** in setResourceValues:error:
;;FIXME: NSURLBookmarkCreationOptions in bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:
;;FIXME: NSURLBookmarkResolutionOptions in initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:
;;FIXME: NSURLBookmarkResolutionOptions in URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:
[:selector [2 :resourceValuesForKeys :fromBookmarkData] [:id :id :id]]
;;FIXME: NSError ** in writeBookmarkData:toURL:options:error:
;;FIXME: NSError ** in bookmarkDataWithContentsOfURL:error:
[:selector [0 :startAccessingSecurityScopedResource] [Boolean]]
[:selector [0 :stopAccessingSecurityScopedResource] [:void]]
[:selector [6 :initWithProtectionSpace :proposedCredential :previousFailureCount :failureResponse :error :sender] [:id :id :id :long :id :id :id]]
[:selector [2 :initWithAuthenticationChallenge :sender] [:id :id :id]]
[:selector [0 :protectionSpace] [:id]]
[:selector [0 :proposedCredential] [:id]]
[:selector [0 :previousFailureCount] [:long]]
[:selector [0 :failureResponse] [:id]]
[:selector [0 :error] [:id]]
[:selector [0 :sender] [:id]]
[:selector [2 :initWithResponse :data] [:id :id :id]]
[:selector [4 :initWithResponse :data :userInfo :storagePolicy] [:id :id :id :id :unsigned-long]]
[:selector [0 :response] [:id]]
[:selector [0 :data] [:id]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :storagePolicy] [:unsigned-long]]
[:selector [0 :sharedURLCache] [:id]]
[:selector [1 :setSharedURLCache] [:void :id]]
[:selector [3 :initWithMemoryCapacity :diskCapacity :diskPath] [:id :unsigned-long :unsigned-long :id]]
[:selector [1 :cachedResponseForRequest] [:id :id]]
[:selector [2 :storeCachedResponse :forRequest] [:void :id :id]]
[:selector [1 :removeCachedResponseForRequest] [:void :id]]
[:selector [0 :removeAllCachedResponses] [:void]]
[:selector [0 :memoryCapacity] [:unsigned-long]]
[:selector [0 :diskCapacity] [:unsigned-long]]
[:selector [1 :setMemoryCapacity] [:void :unsigned-long]]
[:selector [1 :setDiskCapacity] [:void :unsigned-long]]
[:selector [0 :currentMemoryUsage] [:unsigned-long]]
[:selector [0 :currentDiskUsage] [:unsigned-long]]
[:selector [3 :initWithRequest :delegate :startImmediately] [:id :id :id Boolean]]
[:selector [2 :initWithRequest :delegate] [:id :id :id]]
[:selector [2 :connectionWithRequest :delegate] [:id :id :id]]
[:selector [0 :originalRequest] [:id]]
[:selector [0 :currentRequest] [:id]]
[:selector [0 :start] [:void]]
[:selector [0 :cancel] [:void]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :unscheduleFromRunLoop :forMode] [:void :id :id]]
[:selector [1 :setDelegateQueue] [:void :id]]
[:selector [1 :canHandleRequest] [Boolean :id]]
[:compound CSSM_DATA "sizeof (CSSM_DATA)"]
[:compound CSSM_GUID "sizeof (CSSM_GUID)"]
[:compound CSSM_VERSION "sizeof (CSSM_VERSION)"]
[:compound CSSM_SUBSERVICE_UID "sizeof (CSSM_SUBSERVICE_UID)"]
[:compound CSSM_NET_ADDRESS "sizeof (CSSM_NET_ADDRESS)"]
[:compound CSSM_CRYPTO_DATA "sizeof (CSSM_CRYPTO_DATA)"]
[:compound CSSM_LIST "sizeof (CSSM_LIST)"]
[:compound CSSM_LIST_ELEMENT "sizeof (CSSM_LIST_ELEMENT)"]
[:compound CSSM_TUPLE "sizeof (CSSM_TUPLE)"]
[:compound CSSM_TUPLEGROUP "sizeof (CSSM_TUPLEGROUP)"]
[:compound CSSM_SAMPLE "sizeof (CSSM_SAMPLE)"]
[:compound CSSM_SAMPLEGROUP "sizeof (CSSM_SAMPLEGROUP)"]
[:compound CSSM_MEMORY_FUNCS "sizeof (CSSM_MEMORY_FUNCS)"]
[:compound CSSM_ENCODED_CERT "sizeof (CSSM_ENCODED_CERT)"]
[:compound CSSM_PARSED_CERT "sizeof (CSSM_PARSED_CERT)"]
[:compound CSSM_CERT_PAIR "sizeof (CSSM_CERT_PAIR)"]
[:compound CSSM_CERTGROUP "sizeof (CSSM_CERTGROUP)"]
[:compound CSSM_BASE_CERTS "sizeof (CSSM_BASE_CERTS)"]
[:compound CSSM_ACCESS_CREDENTIALS "sizeof (CSSM_ACCESS_CREDENTIALS)"]
[:compound CSSM_AUTHORIZATIONGROUP "sizeof (CSSM_AUTHORIZATIONGROUP)"]
[:compound CSSM_ACL_VALIDITY_PERIOD "sizeof (CSSM_ACL_VALIDITY_PERIOD)"]
[:compound CSSM_ACL_ENTRY_PROTOTYPE "sizeof (CSSM_ACL_ENTRY_PROTOTYPE)"]
[:compound CSSM_ACL_OWNER_PROTOTYPE "sizeof (CSSM_ACL_OWNER_PROTOTYPE)"]
[:compound CSSM_ACL_ENTRY_INPUT "sizeof (CSSM_ACL_ENTRY_INPUT)"]
[:compound CSSM_RESOURCE_CONTROL_CONTEXT "sizeof (CSSM_RESOURCE_CONTROL_CONTEXT)"]
[:compound CSSM_ACL_ENTRY_INFO "sizeof (CSSM_ACL_ENTRY_INFO)"]
[:compound CSSM_ACL_EDIT "sizeof (CSSM_ACL_EDIT)"]
[:compound CSSM_FUNC_NAME_ADDR "sizeof (CSSM_FUNC_NAME_ADDR)"]
[:compound CSSM_DATE "sizeof (CSSM_DATE)"]
[:compound CSSM_RANGE "sizeof (CSSM_RANGE)"]
[:compound CSSM_QUERY_SIZE_DATA "sizeof (CSSM_QUERY_SIZE_DATA)"]
[:compound CSSM_KEY_SIZE "sizeof (CSSM_KEY_SIZE)"]
[:compound CSSM_KEYHEADER "sizeof (CSSM_KEYHEADER)"]
[:compound CSSM_KEY "sizeof (CSSM_KEY)"]
[:compound CSSM_DL_DB_HANDLE "sizeof (CSSM_DL_DB_HANDLE)"]
[:compound CSSM_CONTEXT_ATTRIBUTE "sizeof (CSSM_CONTEXT_ATTRIBUTE)"]
[:compound CSSM_CONTEXT "sizeof (CSSM_CONTEXT)"]
[:compound CSSM_PKCS1_OAEP_PARAMS "sizeof (CSSM_PKCS1_OAEP_PARAMS)"]
[:compound CSSM_CSP_OPERATIONAL_STATISTICS "sizeof (CSSM_CSP_OPERATIONAL_STATISTICS)"]
[:compound CSSM_PKCS5_PBKDF1_PARAMS "sizeof (CSSM_PKCS5_PBKDF1_PARAMS)"]
[:compound CSSM_PKCS5_PBKDF2_PARAMS "sizeof (CSSM_PKCS5_PBKDF2_PARAMS)"]
[:compound CSSM_KEA_DERIVE_PARAMS "sizeof (CSSM_KEA_DERIVE_PARAMS)"]
[:compound CSSM_TP_AUTHORITY_ID "sizeof (CSSM_TP_AUTHORITY_ID)"]
[:compound CSSM_FIELD "sizeof (CSSM_FIELD)"]
[:compound CSSM_TP_POLICYINFO "sizeof (CSSM_TP_POLICYINFO)"]
[:compound CSSM_DL_DB_LIST "sizeof (CSSM_DL_DB_LIST)"]
[:compound CSSM_TP_CALLERAUTH_CONTEXT "sizeof (CSSM_TP_CALLERAUTH_CONTEXT)"]
[:compound CSSM_ENCODED_CRL "sizeof (CSSM_ENCODED_CRL)"]
[:compound CSSM_PARSED_CRL "sizeof (CSSM_PARSED_CRL)"]
[:compound CSSM_CRL_PAIR "sizeof (CSSM_CRL_PAIR)"]
[:compound CSSM_CRLGROUP "sizeof (CSSM_CRLGROUP)"]
[:compound CSSM_FIELDGROUP "sizeof (CSSM_FIELDGROUP)"]
[:compound CSSM_EVIDENCE "sizeof (CSSM_EVIDENCE)"]
[:compound CSSM_TP_VERIFY_CONTEXT "sizeof (CSSM_TP_VERIFY_CONTEXT)"]
[:compound CSSM_TP_VERIFY_CONTEXT_RESULT "sizeof (CSSM_TP_VERIFY_CONTEXT_RESULT)"]
[:compound CSSM_TP_REQUEST_SET "sizeof (CSSM_TP_REQUEST_SET)"]
[:compound CSSM_TP_RESULT_SET "sizeof (CSSM_TP_RESULT_SET)"]
[:compound CSSM_TP_CONFIRM_RESPONSE "sizeof (CSSM_TP_CONFIRM_RESPONSE)"]
[:compound CSSM_TP_CERTISSUE_INPUT "sizeof (CSSM_TP_CERTISSUE_INPUT)"]
[:compound CSSM_TP_CERTISSUE_OUTPUT "sizeof (CSSM_TP_CERTISSUE_OUTPUT)"]
[:compound CSSM_TP_CERTCHANGE_INPUT "sizeof (CSSM_TP_CERTCHANGE_INPUT)"]
[:compound CSSM_TP_CERTCHANGE_OUTPUT "sizeof (CSSM_TP_CERTCHANGE_OUTPUT)"]
[:compound CSSM_TP_CERTVERIFY_INPUT "sizeof (CSSM_TP_CERTVERIFY_INPUT)"]
[:compound CSSM_TP_CERTVERIFY_OUTPUT "sizeof (CSSM_TP_CERTVERIFY_OUTPUT)"]
[:compound CSSM_TP_CERTNOTARIZE_INPUT "sizeof (CSSM_TP_CERTNOTARIZE_INPUT)"]
[:compound CSSM_TP_CERTNOTARIZE_OUTPUT "sizeof (CSSM_TP_CERTNOTARIZE_OUTPUT)"]
[:compound CSSM_TP_CERTRECLAIM_INPUT "sizeof (CSSM_TP_CERTRECLAIM_INPUT)"]
[:compound CSSM_TP_CERTRECLAIM_OUTPUT "sizeof (CSSM_TP_CERTRECLAIM_OUTPUT)"]
[:compound CSSM_TP_CRLISSUE_INPUT "sizeof (CSSM_TP_CRLISSUE_INPUT)"]
[:compound CSSM_TP_CRLISSUE_OUTPUT "sizeof (CSSM_TP_CRLISSUE_OUTPUT)"]
[:compound CSSM_CERT_BUNDLE_HEADER "sizeof (CSSM_CERT_BUNDLE_HEADER)"]
[:compound CSSM_CERT_BUNDLE "sizeof (CSSM_CERT_BUNDLE)"]
[:compound CSSM_DB_ATTRIBUTE_INFO "sizeof (CSSM_DB_ATTRIBUTE_INFO)"]
[:compound CSSM_DB_ATTRIBUTE_DATA "sizeof (CSSM_DB_ATTRIBUTE_DATA)"]
[:compound CSSM_DB_RECORD_ATTRIBUTE_INFO "sizeof (CSSM_DB_RECORD_ATTRIBUTE_INFO)"]
[:compound CSSM_DB_RECORD_ATTRIBUTE_DATA "sizeof (CSSM_DB_RECORD_ATTRIBUTE_DATA)"]
[:compound CSSM_DB_PARSING_MODULE_INFO "sizeof (CSSM_DB_PARSING_MODULE_INFO)"]
[:compound CSSM_DB_INDEX_INFO "sizeof (CSSM_DB_INDEX_INFO)"]
[:compound CSSM_DB_UNIQUE_RECORD "sizeof (CSSM_DB_UNIQUE_RECORD)"]
[:compound CSSM_DB_RECORD_INDEX_INFO "sizeof (CSSM_DB_RECORD_INDEX_INFO)"]
[:compound CSSM_DBINFO "sizeof (CSSM_DBINFO)"]
[:compound CSSM_SELECTION_PREDICATE "sizeof (CSSM_SELECTION_PREDICATE)"]
[:compound CSSM_QUERY_LIMITS "sizeof (CSSM_QUERY_LIMITS)"]
[:compound CSSM_QUERY "sizeof (CSSM_QUERY)"]
[:compound CSSM_NAME_LIST "sizeof (CSSM_NAME_LIST)"]
[:compound CSSM_DB_SCHEMA_ATTRIBUTE_INFO "sizeof (CSSM_DB_SCHEMA_ATTRIBUTE_INFO)"]
[:compound CSSM_DB_SCHEMA_INDEX_INFO "sizeof (CSSM_DB_SCHEMA_INDEX_INFO)"]
[:compound CSSM_X509_ALGORITHM_IDENTIFIER "sizeof (CSSM_X509_ALGORITHM_IDENTIFIER)"]
[:compound CSSM_X509_TYPE_VALUE_PAIR "sizeof (CSSM_X509_TYPE_VALUE_PAIR)"]
[:compound CSSM_X509_RDN "sizeof (CSSM_X509_RDN)"]
[:compound CSSM_X509_NAME "sizeof (CSSM_X509_NAME)"]
[:compound CSSM_X509_SUBJECT_PUBLIC_KEY_INFO "sizeof (CSSM_X509_SUBJECT_PUBLIC_KEY_INFO)"]
[:compound CSSM_X509_TIME "sizeof (CSSM_X509_TIME)"]
[:compound CSSM_X509_VALIDITY "sizeof (CSSM_X509_VALIDITY)"]
[:compound CSSM_X509EXT_BASICCONSTRAINTS "sizeof (CSSM_X509EXT_BASICCONSTRAINTS)"]
[:compound CSSM_X509EXT_TAGandVALUE "sizeof (CSSM_X509EXT_TAGandVALUE)"]
[:compound CSSM_X509EXT_PAIR "sizeof (CSSM_X509EXT_PAIR)"]
[:compound CSSM_X509_EXTENSION "sizeof (CSSM_X509_EXTENSION)"]
[:compound CSSM_X509_EXTENSIONS "sizeof (CSSM_X509_EXTENSIONS)"]
[:compound CSSM_X509_TBS_CERTIFICATE "sizeof (CSSM_X509_TBS_CERTIFICATE)"]
[:compound CSSM_X509_SIGNATURE "sizeof (CSSM_X509_SIGNATURE)"]
[:compound CSSM_X509_SIGNED_CERTIFICATE "sizeof (CSSM_X509_SIGNED_CERTIFICATE)"]
[:compound CSSM_X509EXT_POLICYQUALIFIERINFO "sizeof (CSSM_X509EXT_POLICYQUALIFIERINFO)"]
[:compound CSSM_X509EXT_POLICYQUALIFIERS "sizeof (CSSM_X509EXT_POLICYQUALIFIERS)"]
[:compound CSSM_X509EXT_POLICYINFO "sizeof (CSSM_X509EXT_POLICYINFO)"]
[:compound CSSM_X509_REVOKED_CERT_ENTRY "sizeof (CSSM_X509_REVOKED_CERT_ENTRY)"]
[:compound CSSM_X509_REVOKED_CERT_LIST "sizeof (CSSM_X509_REVOKED_CERT_LIST)"]
[:compound CSSM_X509_TBS_CERTLIST "sizeof (CSSM_X509_TBS_CERTLIST)"]
[:compound CSSM_X509_SIGNED_CRL "sizeof (CSSM_X509_SIGNED_CRL)"]
[:compound CE_OtherName "sizeof (CE_OtherName)"]
[:compound CE_GeneralName "sizeof (CE_GeneralName)"]
[:compound CE_GeneralNames "sizeof (CE_GeneralNames)"]
[:compound CE_AuthorityKeyID "sizeof (CE_AuthorityKeyID)"]
[:compound CE_ExtendedKeyUsage "sizeof (CE_ExtendedKeyUsage)"]
[:compound CE_BasicConstraints "sizeof (CE_BasicConstraints)"]
[:compound CE_PolicyQualifierInfo "sizeof (CE_PolicyQualifierInfo)"]
[:compound CE_PolicyInformation "sizeof (CE_PolicyInformation)"]
[:compound CE_CertPolicies "sizeof (CE_CertPolicies)"]
[:compound CE_DistributionPointName "sizeof (CE_DistributionPointName)"]
[:compound CE_CRLDistributionPoint "sizeof (CE_CRLDistributionPoint)"]
[:compound CE_CRLDistPointsSyntax "sizeof (CE_CRLDistPointsSyntax)"]
[:compound CE_AccessDescription "sizeof (CE_AccessDescription)"]
[:compound CE_AuthorityInfoAccess "sizeof (CE_AuthorityInfoAccess)"]
[:compound CE_SemanticsInformation "sizeof (CE_SemanticsInformation)"]
[:compound CE_QC_Statement "sizeof (CE_QC_Statement)"]
[:compound CE_QC_Statements "sizeof (CE_QC_Statements)"]
[:compound CE_IssuingDistributionPoint "sizeof (CE_IssuingDistributionPoint)"]
[:compound CE_GeneralSubtree "sizeof (CE_GeneralSubtree)"]
[:compound CE_GeneralSubtrees "sizeof (CE_GeneralSubtrees)"]
[:compound CE_NameConstraints "sizeof (CE_NameConstraints)"]
[:compound CE_PolicyMapping "sizeof (CE_PolicyMapping)"]
[:compound CE_PolicyMappings "sizeof (CE_PolicyMappings)"]
[:compound CE_PolicyConstraints "sizeof (CE_PolicyConstraints)"]
[:compound CE_Data "sizeof (CE_Data)"]
[:compound CE_DataAndType "sizeof (CE_DataAndType)"]
[:compound CSSM_ACL_PROCESS_SUBJECT_SELECTOR "sizeof (CSSM_ACL_PROCESS_SUBJECT_SELECTOR)"]
[:compound CSSM_ACL_KEYCHAIN_PROMPT_SELECTOR "sizeof (CSSM_ACL_KEYCHAIN_PROMPT_SELECTOR)"]
[:compound CSSM_APPLEDL_OPEN_PARAMETERS "sizeof (CSSM_APPLEDL_OPEN_PARAMETERS)"]
[:compound CSSM_APPLECSPDL_DB_SETTINGS_PARAMETERS "sizeof (CSSM_APPLECSPDL_DB_SETTINGS_PARAMETERS)"]
[:compound CSSM_APPLECSPDL_DB_IS_LOCKED_PARAMETERS "sizeof (CSSM_APPLECSPDL_DB_IS_LOCKED_PARAMETERS)"]
[:compound CSSM_APPLECSPDL_DB_CHANGE_PASSWORD_PARAMETERS "sizeof (CSSM_APPLECSPDL_DB_CHANGE_PASSWORD_PARAMETERS)"]
[:compound CSSM_APPLE_TP_NAME_OID "sizeof (CSSM_APPLE_TP_NAME_OID)"]
[:compound CSSM_APPLE_TP_CERT_REQUEST "sizeof (CSSM_APPLE_TP_CERT_REQUEST)"]
[:compound CSSM_APPLE_TP_SSL_OPTIONS "sizeof (CSSM_APPLE_TP_SSL_OPTIONS)"]
[:compound CSSM_APPLE_TP_CRL_OPTIONS "sizeof (CSSM_APPLE_TP_CRL_OPTIONS)"]
[:compound CSSM_APPLE_TP_SMIME_OPTIONS "sizeof (CSSM_APPLE_TP_SMIME_OPTIONS)"]
[:compound CSSM_APPLE_TP_ACTION_DATA "sizeof (CSSM_APPLE_TP_ACTION_DATA)"]
[:compound CSSM_TP_APPLE_EVIDENCE_INFO "sizeof (CSSM_TP_APPLE_EVIDENCE_INFO)"]
[:compound CSSM_TP_APPLE_EVIDENCE_HEADER "sizeof (CSSM_TP_APPLE_EVIDENCE_HEADER)"]
[:compound CSSM_APPLE_CL_CSR_REQUEST "sizeof (CSSM_APPLE_CL_CSR_REQUEST)"]
[:function cssmPerror [:void :c-string-const :int]]
;;FIXME: const CSSM_OID * in cssmOidToAlg
;;FIXME: const CSSM_OID * in cssmAlgToOid
[:compound CSSM_MANAGER_EVENT_NOTIFICATION "sizeof (CSSM_MANAGER_EVENT_NOTIFICATION)"]
;;FIXME: const CSSM_VERSION * in CSSM_Init
[:function CSSM_Terminate [:int]]
;;FIXME: const CSSM_GUID * in CSSM_ModuleLoad
;;FIXME: const CSSM_GUID * in CSSM_ModuleUnload
;;FIXME: const CSSM_GUID * in CSSM_Introduce
;;FIXME: const CSSM_GUID * in CSSM_Unintroduce
;;FIXME: const CSSM_GUID * in CSSM_ModuleAttach
[:function CSSM_ModuleDetach [:int :long]]
[:function CSSM_SetPrivilege [:int :unsigned-long-long]]
;;FIXME: CSSM_PRIVILEGE * in CSSM_GetPrivilege
;;FIXME: CSSM_GUID_PTR in CSSM_GetModuleGUIDFromHandle
;;FIXME: CSSM_SUBSERVICE_UID_PTR in CSSM_GetSubserviceUIDFromHandle
;;FIXME: uint32 * in CSSM_ListAttachedModuleManagers
;;FIXME: CSSM_API_MEMORY_FUNCS_PTR in CSSM_GetAPIMemoryFunctions
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_CreateSignatureContext
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_CreateSymmetricContext
;;FIXME: CSSM_CC_HANDLE * in CSSM_CSP_CreateDigestContext
;;FIXME: const CSSM_KEY * in CSSM_CSP_CreateMacContext
;;FIXME: const CSSM_CRYPTO_DATA * in CSSM_CSP_CreateRandomGenContext
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_CreateAsymmetricContext
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_CreateDeriveKeyContext
;;FIXME: const CSSM_CRYPTO_DATA * in CSSM_CSP_CreateKeyGenContext
;;FIXME: const CSSM_KEY * in CSSM_CSP_CreatePassThroughContext
;;FIXME: CSSM_CONTEXT_PTR * in CSSM_GetContext
;;FIXME: CSSM_CONTEXT_PTR in CSSM_FreeContext
;;FIXME: const CSSM_CONTEXT * in CSSM_SetContext
[:function CSSM_DeleteContext [:int :unsigned-long-long]]
;;FIXME: const CSSM_CONTEXT * in CSSM_GetContextAttribute
;;FIXME: const CSSM_CONTEXT_ATTRIBUTE * in CSSM_UpdateContextAttributes
;;FIXME: const CSSM_CONTEXT_ATTRIBUTE * in CSSM_DeleteContextAttributes
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_Login
[:function CSSM_CSP_Logout [:int :long]]
;;FIXME: const CSSM_STRING * in CSSM_CSP_GetLoginAcl
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_ChangeLoginAcl
;;FIXME: const CSSM_KEY * in CSSM_GetKeyAcl
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_ChangeKeyAcl
;;FIXME: const CSSM_KEY * in CSSM_GetKeyOwner
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_ChangeKeyOwner
;;FIXME: CSSM_ACL_OWNER_PROTOTYPE_PTR in CSSM_CSP_GetLoginOwner
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_CSP_ChangeLoginOwner
;;FIXME: const CSSM_DATA * in CSSM_SignData
[:function CSSM_SignDataInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_SignDataUpdate
;;FIXME: CSSM_DATA_PTR in CSSM_SignDataFinal
;;FIXME: const CSSM_DATA * in CSSM_VerifyData
[:function CSSM_VerifyDataInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_VerifyDataUpdate
;;FIXME: const CSSM_DATA * in CSSM_VerifyDataFinal
;;FIXME: const CSSM_DATA * in CSSM_DigestData
[:function CSSM_DigestDataInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_DigestDataUpdate
;;FIXME: CSSM_CC_HANDLE * in CSSM_DigestDataClone
;;FIXME: CSSM_DATA_PTR in CSSM_DigestDataFinal
;;FIXME: const CSSM_DATA * in CSSM_GenerateMac
[:function CSSM_GenerateMacInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_GenerateMacUpdate
;;FIXME: CSSM_DATA_PTR in CSSM_GenerateMacFinal
;;FIXME: const CSSM_DATA * in CSSM_VerifyMac
[:function CSSM_VerifyMacInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_VerifyMacUpdate
;;FIXME: const CSSM_DATA * in CSSM_VerifyMacFinal
;;FIXME: CSSM_QUERY_SIZE_DATA_PTR in CSSM_QuerySize
;;FIXME: const CSSM_DATA * in CSSM_EncryptData
;;FIXME: const CSSM_DATA * in CSSM_EncryptDataP
[:function CSSM_EncryptDataInit [:int :unsigned-long-long]]
[:function CSSM_EncryptDataInitP [:int :unsigned-long-long :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_EncryptDataUpdate
;;FIXME: CSSM_DATA_PTR in CSSM_EncryptDataFinal
;;FIXME: const CSSM_DATA * in CSSM_DecryptData
;;FIXME: const CSSM_DATA * in CSSM_DecryptDataP
[:function CSSM_DecryptDataInit [:int :unsigned-long-long]]
[:function CSSM_DecryptDataInitP [:int :unsigned-long-long :unsigned-long-long]]
;;FIXME: const CSSM_DATA * in CSSM_DecryptDataUpdate
;;FIXME: CSSM_DATA_PTR in CSSM_DecryptDataFinal
;;FIXME: const CSSM_KEY * in CSSM_QueryKeySizeInBits
;;FIXME: const CSSM_DATA * in CSSM_GenerateKey
;;FIXME: const CSSM_DATA * in CSSM_GenerateKeyP
;;FIXME: const CSSM_DATA * in CSSM_GenerateKeyPair
;;FIXME: const CSSM_DATA * in CSSM_GenerateKeyPairP
;;FIXME: CSSM_DATA_PTR in CSSM_GenerateRandom
;;FIXME: const CSSM_KEY * in CSSM_CSP_ObtainPrivateKeyFromPublicKey
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_WrapKey
;;FIXME: const CSSM_KEY * in CSSM_UnwrapKey
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_WrapKeyP
;;FIXME: const CSSM_KEY * in CSSM_UnwrapKeyP
;;FIXME: CSSM_DATA_PTR in CSSM_DeriveKey
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_FreeKey
;;FIXME: CSSM_DATA_PTR in CSSM_GenerateAlgorithmParams
;;FIXME: CSSM_CSP_OPERATIONAL_STATISTICS * in CSSM_CSP_GetOperationalStatistics
;;FIXME: CSSM_DATA * in CSSM_GetTimeValue
;;FIXME: CSSM_DATA_PTR in CSSM_RetrieveUniqueId
;;FIXME: CSSM_DATA_PTR in CSSM_RetrieveCounter
;;FIXME: const CSSM_DATA * in CSSM_VerifyDevice
;;FIXME: const void * in CSSM_CSP_PassThrough
;;FIXME: const CSSM_TP_AUTHORITY_ID * in CSSM_TP_SubmitCredRequest
;;FIXME: const CSSM_DATA * in CSSM_TP_RetrieveCredResult
;;FIXME: const CSSM_DATA * in CSSM_TP_ConfirmCredResult
;;FIXME: const CSSM_DATA * in CSSM_TP_ReceiveConfirmation
;;FIXME: const CSSM_CERTGROUP * in CSSM_TP_CertReclaimKey
[:function CSSM_TP_CertReclaimAbort [:int :long :unsigned-long-long]]
;;FIXME: const CSSM_TP_AUTHORITY_ID * in CSSM_TP_FormRequest
;;FIXME: const CSSM_DATA * in CSSM_TP_FormSubmit
;;FIXME: const CSSM_CERTGROUP * in CSSM_TP_CertGroupVerify
;;FIXME: const CSSM_FIELD * in CSSM_TP_CertCreateTemplate
;;FIXME: const CSSM_DATA * in CSSM_TP_CertGetAllTemplateFields
;;FIXME: const CSSM_DATA * in CSSM_TP_CertSign
;;FIXME: const CSSM_ENCODED_CRL * in CSSM_TP_CrlVerify
;;FIXME: const CSSM_FIELD * in CSSM_TP_CrlCreateTemplate
;;FIXME: const CSSM_DATA * in CSSM_TP_CertRevoke
;;FIXME: const CSSM_DATA * in CSSM_TP_CertRemoveFromCrlTemplate
;;FIXME: const CSSM_ENCODED_CRL * in CSSM_TP_CrlSign
;;FIXME: const CSSM_ENCODED_CRL * in CSSM_TP_ApplyCrlToDb
;;FIXME: const CSSM_DL_DB_LIST * in CSSM_TP_CertGroupConstruct
;;FIXME: const CSSM_DL_DB_LIST * in CSSM_TP_CertGroupPrune
;;FIXME: const CSSM_CERTGROUP * in CSSM_TP_CertGroupToTupleGroup
;;FIXME: const CSSM_TUPLEGROUP * in CSSM_TP_TupleGroupToCertGroup
;;FIXME: const CSSM_DL_DB_LIST * in CSSM_TP_PassThrough
;;FIXME: const CSSM_TUPLEGROUP * in CSSM_AC_AuthCompute
;;FIXME: const CSSM_DL_DB_LIST * in CSSM_AC_PassThrough
;;FIXME: const CSSM_FIELD * in CSSM_CL_CertCreateTemplate
;;FIXME: const CSSM_DATA * in CSSM_CL_CertGetAllTemplateFields
;;FIXME: const CSSM_DATA * in CSSM_CL_CertSign
;;FIXME: const CSSM_DATA * in CSSM_CL_CertVerify
;;FIXME: const CSSM_DATA * in CSSM_CL_CertVerifyWithKey
;;FIXME: const CSSM_DATA * in CSSM_CL_CertGetFirstFieldValue
;;FIXME: CSSM_DATA_PTR * in CSSM_CL_CertGetNextFieldValue
[:function CSSM_CL_CertAbortQuery [:int :long :long]]
;;FIXME: const CSSM_DATA * in CSSM_CL_CertGetKeyInfo
;;FIXME: const CSSM_DATA * in CSSM_CL_CertGetAllFields
;;FIXME: CSSM_FIELD_PTR * in CSSM_CL_FreeFields
;;FIXME: const CSSM_OID * in CSSM_CL_FreeFieldValue
;;FIXME: const CSSM_DATA * in CSSM_CL_CertCache
;;FIXME: const CSSM_OID * in CSSM_CL_CertGetFirstCachedFieldValue
;;FIXME: CSSM_DATA_PTR * in CSSM_CL_CertGetNextCachedFieldValue
[:function CSSM_CL_CertAbortCache [:int :long :long]]
;;FIXME: const CSSM_CERTGROUP * in CSSM_CL_CertGroupToSignedBundle
;;FIXME: const CSSM_CERT_BUNDLE * in CSSM_CL_CertGroupFromVerifiedBundle
;;FIXME: uint32 * in CSSM_CL_CertDescribeFormat
;;FIXME: const CSSM_FIELD * in CSSM_CL_CrlCreateTemplate
;;FIXME: const CSSM_FIELD * in CSSM_CL_CrlSetFields
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlAddCert
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlRemoveCert
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlSign
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlVerify
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlVerifyWithKey
;;FIXME: const CSSM_DATA * in CSSM_CL_IsCertInCrl
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlGetFirstFieldValue
;;FIXME: CSSM_DATA_PTR * in CSSM_CL_CrlGetNextFieldValue
[:function CSSM_CL_CrlAbortQuery [:int :long :long]]
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlGetAllFields
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlCache
;;FIXME: const CSSM_DATA * in CSSM_CL_IsCertInCachedCrl
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlGetFirstCachedFieldValue
;;FIXME: CSSM_DATA_PTR * in CSSM_CL_CrlGetNextCachedFieldValue
;;FIXME: const CSSM_DATA * in CSSM_CL_CrlGetAllCachedRecordFields
[:function CSSM_CL_CrlAbortCache [:int :long :long]]
;;FIXME: uint32 * in CSSM_CL_CrlDescribeFormat
;;FIXME: const void * in CSSM_CL_PassThrough
;;FIXME: const CSSM_NET_ADDRESS * in CSSM_DL_DbOpen
[:function CSSM_DL_DbClose [:int Foundation/CSSM_DL_DB_HANDLE]]
;;FIXME: const CSSM_NET_ADDRESS * in CSSM_DL_DbCreate
;;FIXME: const CSSM_NET_ADDRESS * in CSSM_DL_DbDelete
;;FIXME: const CSSM_DB_SCHEMA_ATTRIBUTE_INFO * in CSSM_DL_CreateRelation
[:function CSSM_DL_DestroyRelation [:int Foundation/CSSM_DL_DB_HANDLE :unsigned-int]]
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_DL_Authenticate
;;FIXME: const CSSM_STRING * in CSSM_DL_GetDbAcl
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_DL_ChangeDbAcl
;;FIXME: CSSM_ACL_OWNER_PROTOTYPE_PTR in CSSM_DL_GetDbOwner
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_DL_ChangeDbOwner
;;FIXME: CSSM_NAME_LIST_PTR * in CSSM_DL_GetDbNames
;;FIXME: char ** in CSSM_DL_GetDbNameFromHandle
;;FIXME: CSSM_NAME_LIST_PTR in CSSM_DL_FreeNameList
;;FIXME: const CSSM_DB_RECORD_ATTRIBUTE_DATA * in CSSM_DL_DataInsert
;;FIXME: const CSSM_DB_UNIQUE_RECORD * in CSSM_DL_DataDelete
;;FIXME: CSSM_DB_UNIQUE_RECORD_PTR in CSSM_DL_DataModify
;;FIXME: const CSSM_QUERY * in CSSM_DL_DataGetFirst
;;FIXME: CSSM_DB_RECORD_ATTRIBUTE_DATA_PTR in CSSM_DL_DataGetNext
[:function CSSM_DL_DataAbortQuery [:int Foundation/CSSM_DL_DB_HANDLE :long]]
;;FIXME: const CSSM_DB_UNIQUE_RECORD * in CSSM_DL_DataGetFromUniqueRecordId
;;FIXME: CSSM_DB_UNIQUE_RECORD_PTR in CSSM_DL_FreeUniqueRecord
;;FIXME: const void * in CSSM_DL_PassThrough
[:compound CSSM_SPI_AC_FUNCS "sizeof (CSSM_SPI_AC_FUNCS)"]
[:compound CSSM_SPI_CL_FUNCS "sizeof (CSSM_SPI_CL_FUNCS)"]
[:compound CSSM_MODULE_FUNCS "sizeof (CSSM_MODULE_FUNCS)"]
[:compound CSSM_UPCALLS "sizeof (CSSM_UPCALLS)"]
;;FIXME: const CSSM_GUID * in CSSM_SPI_ModuleLoad
;;FIXME: const CSSM_GUID * in CSSM_SPI_ModuleUnload
;;FIXME: const CSSM_GUID * in CSSM_SPI_ModuleAttach
[:function CSSM_SPI_ModuleDetach [:int :long]]
[:compound CSSM_SPI_CSP_FUNCS "sizeof (CSSM_SPI_CSP_FUNCS)"]
[:compound CSSM_SPI_DL_FUNCS "sizeof (CSSM_SPI_DL_FUNCS)"]
[:compound CSSM_KR_NAME "sizeof (CSSM_KR_NAME)"]
[:compound CSSM_KR_PROFILE "sizeof (CSSM_KR_PROFILE)"]
[:compound CSSM_KR_WRAPPEDPRODUCT_INFO "sizeof (CSSM_KR_WRAPPEDPRODUCT_INFO)"]
[:compound CSSM_KRSUBSERVICE "sizeof (CSSM_KRSUBSERVICE)"]
[:compound CSSM_KR_POLICY_LIST_ITEM "sizeof (CSSM_KR_POLICY_LIST_ITEM)"]
[:compound CSSM_KR_POLICY_INFO "sizeof (CSSM_KR_POLICY_INFO)"]
;;FIXME: const CSSM_DATA * in CSSM_KR_SetEnterpriseRecoveryPolicy
;;FIXME: CSSM_CC_HANDLE * in CSSM_KR_CreateRecoveryRegistrationContext
;;FIXME: const CSSM_KR_PROFILE * in CSSM_KR_CreateRecoveryEnablementContext
;;FIXME: const CSSM_KR_PROFILE * in CSSM_KR_CreateRecoveryRequestContext
;;FIXME: CSSM_KR_POLICY_FLAGS * in CSSM_KR_GetPolicyInfo
;;FIXME: const CSSM_DATA * in CSSM_KR_RegistrationRequest
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_KR_RegistrationRetrieve
;;FIXME: const CSSM_DATA * in CSSM_KR_GenerateRecoveryFields
;;FIXME: const CSSM_DATA * in CSSM_KR_ProcessRecoveryFields
;;FIXME: const CSSM_DATA * in CSSM_KR_RecoveryRequest
;;FIXME: const CSSM_ACCESS_CREDENTIALS * in CSSM_KR_RecoveryRetrieve
;;FIXME: const CSSM_RESOURCE_CONTROL_CONTEXT * in CSSM_KR_GetRecoveredObject
[:function CSSM_KR_RecoveryRequestAbort [:int :unsigned-int :long]]
;;FIXME: CSSM_KR_POLICY_INFO_PTR * in CSSM_KR_QueryPolicyInfo
;;FIXME: const void * in CSSM_KR_PassThrough
[:compound CSSM_SPI_KR_FUNCS "sizeof (CSSM_SPI_KR_FUNCS)"]
[:compound CSSM_SPI_TP_FUNCS "sizeof (CSSM_SPI_TP_FUNCS)"]
[:compound CSSM_STATE_FUNCS "sizeof (CSSM_STATE_FUNCS)"]
[:compound CSSM_MANAGER_REGISTRATION_INFO "sizeof (CSSM_MANAGER_REGISTRATION_INFO)"]
;;FIXME: const CSSM_GUID * in ModuleManagerAuthenticate
[:compound MDS_FUNCS "sizeof (MDS_FUNCS)"]
;;FIXME: const CSSM_GUID * in MDS_Initialize
[:function MDS_Terminate [:int :long]]
[:function MDS_Install [:int :long]]
[:function MDS_Uninstall [:int :long]]
[:compound SecAsn1Template "sizeof (SecAsn1Template)"]
[:compound SecKeychainAttribute "sizeof (SecKeychainAttribute)"]
[:compound SecKeychainAttributeList "sizeof (SecKeychainAttributeList)"]
[:compound SecKeychainAttributeInfo "sizeof (SecKeychainAttributeInfo)"]
;;FIXME: CFStringRef in SecCopyErrorMessageString
[:function SecAccessGetTypeID [:unsigned-long]]
;;FIXME: CFStringRef in SecAccessCreate
;;FIXME: const CSSM_ACL_OWNER_PROTOTYPE * in SecAccessCreateFromOwnerAndACL
;;FIXME: SecAccessRef in SecAccessCreateWithOwnerAndACL
;;FIXME: SecAccessRef in SecAccessGetOwnerAndACL
;;FIXME: SecAccessRef in SecAccessCopyOwnerAndACL
;;FIXME: SecAccessRef in SecAccessCopyACLList
;;FIXME: SecAccessRef in SecAccessCopySelectedACLList
;;FIXME: CFArrayRef in SecAccessCopyMatchingACLList
[:function SecACLGetTypeID [:unsigned-long]]
;;FIXME: SecAccessRef in SecACLCreateFromSimpleContents
;;FIXME: SecAccessRef in SecACLCreateWithSimpleContents
;;FIXME: SecACLRef in SecACLRemove
;;FIXME: SecACLRef in SecACLCopySimpleContents
;;FIXME: SecACLRef in SecACLCopyContents
;;FIXME: SecACLRef in SecACLSetSimpleContents
;;FIXME: SecACLRef in SecACLSetContents
;;FIXME: SecACLRef in SecACLGetAuthorizations
;;FIXME: CFArrayRef in SecACLCopyAuthorizations
;;FIXME: SecACLRef in SecACLSetAuthorizations
;;FIXME: SecACLRef in SecACLUpdateAuthorizations
[:function SecCertificateGetTypeID [:unsigned-long]]
;;FIXME: const CSSM_DATA * in SecCertificateCreateFromData
;;FIXME: SecCertificateRef in SecCertificateCreateWithData
;;FIXME: SecCertificateRef in SecCertificateAddToKeychain
;;FIXME: SecCertificateRef in SecCertificateGetData
;;FIXME: CFDataRef in SecCertificateCopyData
;;FIXME: SecCertificateRef in SecCertificateGetType
;;FIXME: SecCertificateRef in SecCertificateGetSubject
;;FIXME: SecCertificateRef in SecCertificateGetIssuer
;;FIXME: SecCertificateRef in SecCertificateGetCLHandle
;;FIXME: SecCertificateRef in SecCertificateGetAlgorithmID
;;FIXME: SecCertificateRef in SecCertificateCopyPublicKey
;;FIXME: SecCertificateRef in SecCertificateCopyCommonName
;;FIXME: CFStringRef in SecCertificateCopySubjectSummary
;;FIXME: SecCertificateRef in SecCertificateCopyEmailAddresses
;;FIXME: CFStringRef in SecCertificateCopyPreference
;;FIXME: SecCertificateRef in SecCertificateCopyPreferred
;;FIXME: SecCertificateRef in SecCertificateSetPreference
;;FIXME: SecCertificateRef in SecCertificateSetPreferred
;;FIXME: CFDictionaryRef in SecCertificateCopyValues
;;FIXME: CFStringRef in SecCertificateCopyLongDescription
;;FIXME: CFStringRef in SecCertificateCopyShortDescription
;;FIXME: CFDataRef in SecCertificateCopySerialNumber
;;FIXME: CFDataRef in SecCertificateCopyNormalizedIssuerContent
;;FIXME: CFDataRef in SecCertificateCopyNormalizedSubjectContent
[:function SecIdentityGetTypeID [:unsigned-long]]
;;FIXME: CFTypeRef in SecIdentityCreateWithCertificate
;;FIXME: SecIdentityRef in SecIdentityCopyCertificate
;;FIXME: SecIdentityRef in SecIdentityCopyPrivateKey
;;FIXME: CFStringRef in SecIdentityCopyPreference
;;FIXME: SecIdentityRef in SecIdentityCopyPreferred
;;FIXME: SecIdentityRef in SecIdentitySetPreference
;;FIXME: SecIdentityRef in SecIdentitySetPreferred
;;FIXME: CFStringRef in SecIdentityCopySystemIdentity
;;FIXME: CFStringRef in SecIdentitySetSystemIdentity
[:function SecIdentitySearchGetTypeID [:unsigned-long]]
;;FIXME: CFTypeRef in SecIdentitySearchCreate
;;FIXME: SecIdentitySearchRef in SecIdentitySearchCopyNext
;;FIXME: CFDictionaryRef in SecItemCopyMatching
;;FIXME: CFDictionaryRef in SecItemAdd
;;FIXME: CFDictionaryRef in SecItemUpdate
;;FIXME: CFDictionaryRef in SecItemDelete
[:function SecKeyGetTypeID [:unsigned-long]]
;;FIXME: SecKeychainRef in SecKeyCreatePair
;;FIXME: SecKeychainRef in SecKeyGenerate
;;FIXME: SecKeyRef in SecKeyGetCSSMKey
;;FIXME: SecKeyRef in SecKeyGetCSPHandle
;;FIXME: SecKeyRef in SecKeyGetCredentials
;;FIXME: SecKeyRef in SecKeyGetBlockSize
;;FIXME: SecKeyRef in SecKeyGenerateSymmetric
;;FIXME: SecKeyRef in SecKeyCreateFromData
;;FIXME: CFDictionaryRef in SecKeyGeneratePair
;;FIXME: CFDictionaryRef in SecKeyGeneratePairAsync
;;FIXME: SecKeyRef in SecKeyDeriveFromPassword
;;FIXME: CFDataRef in SecKeyWrapSymmetric
;;FIXME: SecKeyRef in SecKeyUnwrapSymmetric
[:compound SecKeychainSettings "sizeof (SecKeychainSettings)"]
[:compound SecKeychainCallbackInfo "sizeof (SecKeychainCallbackInfo)"]
[:function SecKeychainGetTypeID [:unsigned-long]]
;;FIXME: UInt32 * in SecKeychainGetVersion
;;FIXME: SecKeychainRef * in SecKeychainOpen
;;FIXME: const void * in SecKeychainCreate
;;FIXME: SecKeychainRef in SecKeychainDelete
;;FIXME: SecKeychainRef in SecKeychainSetSettings
;;FIXME: SecKeychainRef in SecKeychainCopySettings
;;FIXME: SecKeychainRef in SecKeychainUnlock
;;FIXME: SecKeychainRef in SecKeychainLock
[:function SecKeychainLockAll [:int]]
;;FIXME: SecKeychainRef * in SecKeychainCopyDefault
;;FIXME: SecKeychainRef in SecKeychainSetDefault
;;FIXME: CFArrayRef * in SecKeychainCopySearchList
;;FIXME: CFArrayRef in SecKeychainSetSearchList
;;FIXME: SecPreferencesDomain in SecKeychainCopyDomainDefault
;;FIXME: SecPreferencesDomain in SecKeychainSetDomainDefault
;;FIXME: SecPreferencesDomain in SecKeychainCopyDomainSearchList
;;FIXME: SecPreferencesDomain in SecKeychainSetDomainSearchList
;;FIXME: SecPreferencesDomain in SecKeychainSetPreferenceDomain
;;FIXME: SecPreferencesDomain * in SecKeychainGetPreferenceDomain
;;FIXME: SecKeychainRef in SecKeychainGetStatus
;;FIXME: SecKeychainRef in SecKeychainGetPath
;;FIXME: SecKeychainRef in SecKeychainAttributeInfoForItemID
;;FIXME: SecKeychainAttributeInfo * in SecKeychainFreeAttributeInfo
;;FIXME: SecKeychainCallback in SecKeychainAddCallback
;;FIXME: SecKeychainCallback in SecKeychainRemoveCallback
;;FIXME: SecKeychainRef in SecKeychainAddInternetPassword
;;FIXME: CFTypeRef in SecKeychainFindInternetPassword
;;FIXME: SecKeychainRef in SecKeychainAddGenericPassword
;;FIXME: CFTypeRef in SecKeychainFindGenericPassword
[:function SecKeychainSetUserInteractionAllowed [:int :unsigned-char]]
;;FIXME: Boolean * in SecKeychainGetUserInteractionAllowed
;;FIXME: SecKeychainRef in SecKeychainGetCSPHandle
;;FIXME: SecKeychainRef in SecKeychainGetDLDBHandle
;;FIXME: SecKeychainRef in SecKeychainCopyAccess
;;FIXME: SecKeychainRef in SecKeychainSetAccess
[:function SecKeychainItemGetTypeID [:unsigned-long]]
;;FIXME: SecKeychainItemRef in SecKeychainItemModifyAttributesAndData
;;FIXME: SecKeychainAttributeList * in SecKeychainItemCreateFromContent
;;FIXME: SecKeychainItemRef in SecKeychainItemModifyContent
;;FIXME: SecKeychainItemRef in SecKeychainItemCopyContent
;;FIXME: SecKeychainAttributeList * in SecKeychainItemFreeContent
;;FIXME: SecKeychainItemRef in SecKeychainItemCopyAttributesAndData
;;FIXME: SecKeychainAttributeList * in SecKeychainItemFreeAttributesAndData
;;FIXME: SecKeychainItemRef in SecKeychainItemDelete
;;FIXME: SecKeychainItemRef in SecKeychainItemCopyKeychain
;;FIXME: SecKeychainItemRef in SecKeychainItemCreateCopy
;;FIXME: SecKeychainItemRef in SecKeychainItemCreatePersistentReference
;;FIXME: CFDataRef in SecKeychainItemCopyFromPersistentReference
;;FIXME: SecKeychainItemRef in SecKeychainItemGetDLDBHandle
;;FIXME: SecKeychainItemRef in SecKeychainItemGetUniqueRecordID
;;FIXME: SecKeychainItemRef in SecKeychainItemCopyAccess
;;FIXME: SecKeychainItemRef in SecKeychainItemSetAccess
[:function SecKeychainSearchGetTypeID [:unsigned-long]]
;;FIXME: CFTypeRef in SecKeychainSearchCreateFromAttributes
;;FIXME: SecKeychainSearchRef in SecKeychainSearchCopyNext
[:function SecPolicyGetTypeID [:unsigned-long]]
;;FIXME: SecPolicyRef in SecPolicyGetOID
;;FIXME: SecPolicyRef in SecPolicyGetValue
;;FIXME: CFDictionaryRef in SecPolicyCopyProperties
;;FIXME: SecPolicyRef in SecPolicySetValue
;;FIXME: SecPolicyRef in SecPolicySetProperties
;;FIXME: SecPolicyRef in SecPolicyGetTPHandle
;;FIXME: SecPolicyRef in SecPolicyCreateBasicX509
;;FIXME: SecPolicyRef in SecPolicyCreateSSL
;;FIXME: SecPolicyRef in SecPolicyCreateWithOID
[:function SecPolicySearchGetTypeID [:unsigned-long]]
;;FIXME: const CSSM_OID * in SecPolicySearchCreate
;;FIXME: SecPolicySearchRef in SecPolicySearchCopyNext
[:function SecTrustGetTypeID [:unsigned-long]]
;;FIXME: CFArrayRef in SecTrustCreateWithCertificates
;;FIXME: SecTrustRef in SecTrustSetPolicies
;;FIXME: SecTrustRef in SecTrustSetOptions
;;FIXME: SecTrustRef in SecTrustSetParameters
;;FIXME: SecTrustRef in SecTrustSetAnchorCertificates
;;FIXME: SecTrustRef in SecTrustSetAnchorCertificatesOnly
;;FIXME: SecTrustRef in SecTrustSetKeychains
;;FIXME: SecTrustRef in SecTrustSetVerifyDate
;;FIXME: SecTrustRef in SecTrustGetVerifyTime
;;FIXME: SecTrustRef in SecTrustEvaluate
;;FIXME: SecTrustRef in SecTrustEvaluateAsync
;;FIXME: SecTrustRef in SecTrustGetResult
;;FIXME: SecTrustRef in SecTrustGetCssmResult
;;FIXME: SecTrustRef in SecTrustGetCssmResultCode
;;FIXME: SecTrustRef in SecTrustGetTrustResult
;;FIXME: SecTrustRef in SecTrustGetTPHandle
;;FIXME: SecTrustRef in SecTrustCopyPolicies
;;FIXME: SecTrustRef in SecTrustCopyCustomAnchorCertificates
;;FIXME: CFArrayRef * in SecTrustCopyAnchorCertificates
;;FIXME: SecKeyRef in SecTrustCopyPublicKey
;;FIXME: SecTrustRef in SecTrustGetCertificateCount
;;FIXME: SecCertificateRef in SecTrustGetCertificateAtIndex
;;FIXME: CFArrayRef in SecTrustCopyProperties
[:function SecTrustedApplicationGetTypeID [:unsigned-long]]
;;FIXME: SecTrustedApplicationRef * in SecTrustedApplicationCreateFromPath
;;FIXME: SecTrustedApplicationRef in SecTrustedApplicationCopyData
;;FIXME: SecTrustedApplicationRef in SecTrustedApplicationSetData
;;FIXME: SecCertificateRef in SecTrustSettingsCopyTrustSettings
;;FIXME: SecCertificateRef in SecTrustSettingsSetTrustSettings
;;FIXME: SecCertificateRef in SecTrustSettingsRemoveTrustSettings
;;FIXME: CFArrayRef * in SecTrustSettingsCopyCertificates
;;FIXME: SecCertificateRef in SecTrustSettingsCopyModificationDate
;;FIXME: CFDataRef * in SecTrustSettingsCreateExternalRepresentation
;;FIXME: CFDataRef in SecTrustSettingsImportExternalRepresentation
[:compound SecKeyImportExportParameters "sizeof (SecKeyImportExportParameters)"]
[:compound SecItemImportExportKeyParameters "sizeof (SecItemImportExportKeyParameters)"]
;;FIXME: CFTypeRef in SecKeychainItemExport
;;FIXME: CFTypeRef in SecItemExport
;;FIXME: CFDataRef in SecKeychainItemImport
;;FIXME: CFDataRef in SecItemImport
;;FIXME: CFDataRef in SecPKCS12Import
[:function SecStaticCodeGetTypeID [:unsigned-long]]
;;FIXME: CFURLRef in SecStaticCodeCreateWithPath
;;FIXME: CFURLRef in SecStaticCodeCreateWithPathAndAttributes
;;FIXME: SecStaticCodeRef in SecStaticCodeCheckValidity
;;FIXME: SecStaticCodeRef in SecStaticCodeCheckValidityWithErrors
[:function SecCodeGetTypeID [:unsigned-long]]
;;FIXME: SecCodeRef * in SecCodeCopySelf
;;FIXME: SecCodeRef in SecCodeCopyStaticCode
;;FIXME: SecCodeRef in SecCodeCopyHost
;;FIXME: SecCodeRef in SecCodeCopyGuestWithAttributes
;;FIXME: SecCodeRef in SecCodeCheckValidity
;;FIXME: SecCodeRef in SecCodeCheckValidityWithErrors
;;FIXME: SecStaticCodeRef in SecCodeCopyPath
;;FIXME: SecStaticCodeRef in SecCodeCopyDesignatedRequirement
;;FIXME: SecStaticCodeRef in SecCodeCopySigningInformation
;;FIXME: SecStaticCodeRef in SecCodeMapMemory
;;FIXME: CFURLRef in SecHostCreateGuest
[:function SecHostRemoveGuest [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function SecHostSelectGuest [:int :unsigned-int :unsigned-int]]
;;FIXME: SecGuestRef * in SecHostSelectedGuest
;;FIXME: CFDictionaryRef in SecHostSetGuestStatus
[:function SecHostSetHostingPort [:int :unsigned-int :unsigned-int]]
[:function SecRequirementGetTypeID [:unsigned-long]]
;;FIXME: CFDataRef in SecRequirementCreateWithData
;;FIXME: CFStringRef in SecRequirementCreateWithString
;;FIXME: CFStringRef in SecRequirementCreateWithStringAndErrors
;;FIXME: SecRequirementRef in SecRequirementCopyData
;;FIXME: SecRequirementRef in SecRequirementCopyString
[:function SecTaskGetTypeID [:unsigned-long]]
;;FIXME: SecTaskRef in SecTaskCreateWithAuditToken
;;FIXME: SecTaskRef in SecTaskCreateFromSelf
;;FIXME: CFTypeRef in SecTaskCopyValueForEntitlement
;;FIXME: CFDictionaryRef in SecTaskCopyValuesForEntitlements
[:compound AuthorizationItem "sizeof (AuthorizationItem)"]
[:compound AuthorizationItemSet "sizeof (AuthorizationItemSet)"]
[:compound AuthorizationExternalForm "sizeof (AuthorizationExternalForm)"]
;;FIXME: const AuthorizationRights * in AuthorizationCreate
;;FIXME: AuthorizationRef in AuthorizationFree
;;FIXME: AuthorizationRef in AuthorizationCopyRights
;;FIXME: AuthorizationRef in AuthorizationCopyRightsAsync
;;FIXME: AuthorizationRef in AuthorizationCopyInfo
;;FIXME: AuthorizationRef in AuthorizationMakeExternalForm
;;FIXME: const AuthorizationExternalForm * in AuthorizationCreateFromExternalForm
;;FIXME: AuthorizationItemSet * in AuthorizationFreeItemSet
;;FIXME: AuthorizationRef in AuthorizationExecuteWithPrivileges
;;FIXME: AuthorizationRef * in AuthorizationCopyPrivilegedReference
;;FIXME: CFDictionaryRef * in AuthorizationRightGet
;;FIXME: AuthorizationRef in AuthorizationRightSet
;;FIXME: AuthorizationRef in AuthorizationRightRemove
[:function CMSDecoderGetTypeID [:unsigned-long]]
;;FIXME: CMSDecoderRef * in CMSDecoderCreate
;;FIXME: CMSDecoderRef in CMSDecoderUpdateMessage
;;FIXME: CMSDecoderRef in CMSDecoderFinalizeMessage
;;FIXME: CMSDecoderRef in CMSDecoderSetDetachedContent
;;FIXME: CMSDecoderRef in CMSDecoderCopyDetachedContent
;;FIXME: CMSDecoderRef in CMSDecoderSetSearchKeychain
;;FIXME: CMSDecoderRef in CMSDecoderGetNumSigners
;;FIXME: CMSDecoderRef in CMSDecoderCopySignerStatus
;;FIXME: CMSDecoderRef in CMSDecoderCopySignerEmailAddress
;;FIXME: CMSDecoderRef in CMSDecoderCopySignerCert
;;FIXME: CMSDecoderRef in CMSDecoderIsContentEncrypted
;;FIXME: CMSDecoderRef in CMSDecoderCopyEncapsulatedContentType
;;FIXME: CMSDecoderRef in CMSDecoderCopyAllCerts
;;FIXME: CMSDecoderRef in CMSDecoderCopyContent
;;FIXME: CMSDecoderRef in CMSDecoderCopySignerSigningTime
;;FIXME: CMSDecoderRef in CMSDecoderCopySignerTimestamp
;;FIXME: CMSDecoderRef in CMSDecoderCopySignerTimestampCertificates
[:function CMSEncoderGetTypeID [:unsigned-long]]
;;FIXME: CMSEncoderRef * in CMSEncoderCreate
;;FIXME: CMSEncoderRef in CMSEncoderAddSigners
;;FIXME: CMSEncoderRef in CMSEncoderCopySigners
;;FIXME: CMSEncoderRef in CMSEncoderAddRecipients
;;FIXME: CMSEncoderRef in CMSEncoderCopyRecipients
;;FIXME: CMSEncoderRef in CMSEncoderSetHasDetachedContent
;;FIXME: CMSEncoderRef in CMSEncoderGetHasDetachedContent
;;FIXME: CMSEncoderRef in CMSEncoderSetEncapsulatedContentType
;;FIXME: CMSEncoderRef in CMSEncoderSetEncapsulatedContentTypeOID
;;FIXME: CMSEncoderRef in CMSEncoderCopyEncapsulatedContentType
;;FIXME: CMSEncoderRef in CMSEncoderAddSupportingCerts
;;FIXME: CMSEncoderRef in CMSEncoderCopySupportingCerts
;;FIXME: CMSEncoderRef in CMSEncoderAddSignedAttributes
;;FIXME: CMSEncoderRef in CMSEncoderSetCertificateChainMode
;;FIXME: CMSEncoderRef in CMSEncoderGetCertificateChainMode
;;FIXME: CMSEncoderRef in CMSEncoderUpdateContent
;;FIXME: CMSEncoderRef in CMSEncoderCopyEncodedContent
;;FIXME: CFTypeRef in CMSEncode
;;FIXME: CFTypeRef in CMSEncodeContent
;;FIXME: CMSEncoderRef in CMSEncoderCopySignerTimestamp
[:function SSLContextGetTypeID [:unsigned-long]]
;;FIXME: SSLContextRef in SSLCreateContext
;;FIXME: SSLContextRef * in SSLNewContext
;;FIXME: SSLContextRef in SSLDisposeContext
;;FIXME: SSLContextRef in SSLGetSessionState
;;FIXME: SSLContextRef in SSLSetSessionOption
;;FIXME: SSLContextRef in SSLGetSessionOption
;;FIXME: SSLContextRef in SSLSetIOFuncs
;;FIXME: SSLContextRef in SSLSetProtocolVersionMin
;;FIXME: SSLContextRef in SSLGetProtocolVersionMin
;;FIXME: SSLContextRef in SSLSetProtocolVersionMax
;;FIXME: SSLContextRef in SSLGetProtocolVersionMax
;;FIXME: SSLContextRef in SSLSetProtocolVersionEnabled
;;FIXME: SSLContextRef in SSLGetProtocolVersionEnabled
;;FIXME: SSLContextRef in SSLSetProtocolVersion
;;FIXME: SSLContextRef in SSLGetProtocolVersion
;;FIXME: SSLContextRef in SSLSetCertificate
;;FIXME: SSLContextRef in SSLSetConnection
;;FIXME: SSLContextRef in SSLGetConnection
;;FIXME: SSLContextRef in SSLSetPeerDomainName
;;FIXME: SSLContextRef in SSLGetPeerDomainNameLength
;;FIXME: SSLContextRef in SSLGetPeerDomainName
;;FIXME: SSLContextRef in SSLSetDatagramHelloCookie
;;FIXME: SSLContextRef in SSLSetMaxDatagramRecordSize
;;FIXME: SSLContextRef in SSLGetMaxDatagramRecordSize
;;FIXME: SSLContextRef in SSLGetNegotiatedProtocolVersion
;;FIXME: SSLContextRef in SSLGetNumberSupportedCiphers
;;FIXME: SSLContextRef in SSLGetSupportedCiphers
;;FIXME: SSLContextRef in SSLSetEnabledCiphers
;;FIXME: SSLContextRef in SSLGetNumberEnabledCiphers
;;FIXME: SSLContextRef in SSLGetEnabledCiphers
;;FIXME: SSLContextRef in SSLSetEnableCertVerify
;;FIXME: SSLContextRef in SSLGetEnableCertVerify
;;FIXME: SSLContextRef in SSLSetAllowsExpiredCerts
;;FIXME: SSLContextRef in SSLGetAllowsExpiredCerts
;;FIXME: SSLContextRef in SSLSetAllowsExpiredRoots
;;FIXME: SSLContextRef in SSLGetAllowsExpiredRoots
;;FIXME: SSLContextRef in SSLSetAllowsAnyRoot
;;FIXME: SSLContextRef in SSLGetAllowsAnyRoot
;;FIXME: SSLContextRef in SSLSetTrustedRoots
;;FIXME: SSLContextRef in SSLCopyTrustedRoots
;;FIXME: SSLContextRef in SSLCopyPeerCertificates
;;FIXME: SSLContextRef in SSLCopyPeerTrust
;;FIXME: SSLContextRef in SSLSetPeerID
;;FIXME: SSLContextRef in SSLGetPeerID
;;FIXME: SSLContextRef in SSLGetNegotiatedCipher
;;FIXME: SSLContextRef in SSLSetEncryptionCertificate
;;FIXME: SSLContextRef in SSLSetClientSideAuthenticate
;;FIXME: SSLContextRef in SSLAddDistinguishedName
;;FIXME: SSLContextRef in SSLSetCertificateAuthorities
;;FIXME: SSLContextRef in SSLCopyCertificateAuthorities
;;FIXME: SSLContextRef in SSLCopyDistinguishedNames
;;FIXME: SSLContextRef in SSLGetClientCertificateState
;;FIXME: SSLContextRef in SSLSetDiffieHellmanParams
;;FIXME: SSLContextRef in SSLGetDiffieHellmanParams
;;FIXME: SSLContextRef in SSLSetRsaBlinding
;;FIXME: SSLContextRef in SSLGetRsaBlinding
;;FIXME: SSLContextRef in SSLHandshake
;;FIXME: SSLContextRef in SSLWrite
;;FIXME: SSLContextRef in SSLRead
;;FIXME: SSLContextRef in SSLGetBufferedReadSize
;;FIXME: SSLContextRef in SSLGetDatagramWriteSize
;;FIXME: SSLContextRef in SSLClose
[:function SecTransformGetTypeID [:unsigned-long]]
[:function SecGroupTransformGetTypeID [:unsigned-long]]
;;FIXME: SecTransformRef in SecTransformCreateFromExternalRepresentation
;;FIXME: CFDictionaryRef in SecTransformCopyExternalRepresentation
;;FIXME: SecGroupTransformRef in SecTransformCreateGroupTransform
;;FIXME: SecGroupTransformRef in SecTransformConnectTransforms
;;FIXME: SecTransformRef in SecTransformSetAttribute
;;FIXME: CFTypeRef in SecTransformGetAttribute
;;FIXME: SecTransformRef in SecTransformFindByName
;;FIXME: CFTypeRef in SecTransformExecute
;;FIXME: SecTransformRef in SecTransformExecuteAsync
;;FIXME: CFErrorRef in SecTransformSetAttributeAction
;;FIXME: CFErrorRef in SecTransformSetDataAction
;;FIXME: CFErrorRef in SecTransformSetTransformAction
;;FIXME: CFTypeRef in SecTranformCustomGetAttribute
;;FIXME: CFTypeRef in SecTransformCustomGetAttribute
;;FIXME: CFTypeRef in SecTransformCustomSetAttribute
;;FIXME: CFTypeRef in SecTransformPushbackAttribute
;;FIXME: CFStringRef in SecTransformRegister
;;FIXME: SecTransformRef in SecTransformCreate
;;FIXME: CFTypeRef in SecTransformNoData
;;FIXME: SecTransformRef in SecEncodeTransformCreate
;;FIXME: SecTransformRef in SecDecodeTransformCreate
;;FIXME: SecTransformRef in SecDigestTransformCreate
[:function SecDigestTransformGetTypeID [:unsigned-long]]
;;FIXME: SecTransformRef in SecEncryptTransformCreate
;;FIXME: SecTransformRef in SecDecryptTransformCreate
[:function SecDecryptTransformGetTypeID [:unsigned-long]]
[:function SecEncryptTransformGetTypeID [:unsigned-long]]
;;FIXME: SecTransformRef in SecSignTransformCreate
;;FIXME: SecTransformRef in SecVerifyTransformCreate
;;FIXME: SecTransformRef in SecTransformCreateReadTransformWithReadStream
;;FIXME: NSURLCredentialPersistence in persistence
[:selector [0 :sharedCredentialStorage] [:id]]
[:selector [1 :credentialsForProtectionSpace] [:id :id]]
[:selector [0 :allCredentials] [:id]]
[:selector [2 :setCredential :forProtectionSpace] [:void :id :id]]
[:selector [2 :removeCredential :forProtectionSpace] [:void :id :id]]
[:selector [1 :defaultCredentialForProtectionSpace] [:id :id]]
[:selector [2 :setDefaultCredential :forProtectionSpace] [:void :id :id]]
[:compound CustomBadgeResource "sizeof (CustomBadgeResource)"]
[:compound RoutingResourceEntry "sizeof (RoutingResourceEntry)"]
[:compound FileInfo "sizeof (FileInfo)"]
[:compound FolderInfo "sizeof (FolderInfo)"]
[:compound ExtendedFileInfo "sizeof (ExtendedFileInfo)"]
[:compound ExtendedFolderInfo "sizeof (ExtendedFolderInfo)"]
[:compound FInfo "sizeof (FInfo)"]
[:compound FXInfo "sizeof (FXInfo)"]
[:compound DInfo "sizeof (DInfo)"]
[:compound DXInfo "sizeof (DXInfo)"]
[:function FixRatio [:int :short :short]]
[:function FixMul [:int :int :int]]
[:function FixRound [:short :int]]
[:function Fix2Frac [:int :int]]
[:function Fix2Long [:int :int]]
[:function Long2Fix [:int :int]]
[:function Frac2Fix [:int :int]]
[:function FracMul [:int :int :int]]
[:function FixDiv [:int :int :int]]
[:function FracDiv [:int :int :int]]
[:function FracSqrt [:int :int]]
[:function FracSin [:int :int]]
[:function FracCos [:int :int]]
[:function FixATan2 [:int :int :int]]
[:function Frac2X [:double :int]]
[:function Fix2X [:double :int]]
[:function X2Fix [:int :double]]
[:function X2Frac [:int :double]]
;;FIXME: const wide * in WideCompare
;;FIXME: wide * in WideAdd
;;FIXME: wide * in WideSubtract
;;FIXME: wide * in WideNegate
;;FIXME: wide * in WideShift
;;FIXME: const wide * in WideSquareRoot
;;FIXME: wide * in WideMultiply
;;FIXME: const wide * in WideDivide
;;FIXME: wide * in WideWideDivide
;;FIXME: wide * in WideBitShift
[:function UnsignedFixedMulDiv [:unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
[:compound OffPair "sizeof (OffPair)"]
[:compound Intl0Rec "sizeof (Intl0Rec)"]
[:compound Intl1Rec "sizeof (Intl1Rec)"]
[:compound Itl1ExtRec "sizeof (Itl1ExtRec)"]
[:compound UntokenTable "sizeof (UntokenTable)"]
[:compound WideChar "sizeof (WideChar)"]
[:compound WideCharArr "sizeof (WideCharArr)"]
[:compound NumberParts "sizeof (NumberParts)"]
[:compound Itl4Rec "sizeof (Itl4Rec)"]
[:compound NItl4Rec "sizeof (NItl4Rec)"]
[:compound TableDirectoryRecord "sizeof (TableDirectoryRecord)"]
[:compound Itl5Record "sizeof (Itl5Record)"]
[:compound RuleBasedTrslRecord "sizeof (RuleBasedTrslRecord)"]
[:compound ItlcRecord "sizeof (ItlcRecord)"]
[:compound ItlbRecord "sizeof (ItlbRecord)"]
[:compound ItlbExtRecord "sizeof (ItlbExtRecord)"]
[:compound TokenRec "sizeof (TokenRec)"]
[:compound TokenBlock "sizeof (TokenBlock)"]
[:function GetScriptManagerVariable [:long :short]]
[:function SetScriptManagerVariable [:short :short :long]]
[:function SysError [:void :short]]
[:compound UTCDateTime "sizeof (UTCDateTime)"]
[:compound LocalDateTime "sizeof (LocalDateTime)"]
[:compound TextEncodingRun "sizeof (TextEncodingRun)"]
[:compound ScriptCodeRun "sizeof (ScriptCodeRun)"]
[:compound TECInfo "sizeof (TECInfo)"]
[:function CreateTextEncoding [:unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
[:function GetTextEncodingBase [:unsigned-int :unsigned-int]]
[:function GetTextEncodingVariant [:unsigned-int :unsigned-int]]
[:function GetTextEncodingFormat [:unsigned-int :unsigned-int]]
[:function ResolveDefaultTextEncoding [:unsigned-int :unsigned-int]]
;;FIXME: ByteCount * in GetTextEncodingName
;;FIXME: TECInfoHandle * in TECGetInfo
;;FIXME: ConstStr255Param in UpgradeScriptInfoToTextEncoding
;;FIXME: ScriptCode * in RevertTextEncodingToScriptInfo
;;FIXME: TextEncoding * in GetTextEncodingFromScriptInfo
;;FIXME: ScriptCode * in GetScriptInfoFromTextEncoding
;;FIXME: TextEncoding * in NearestMacTextEncodings
;;FIXME: const UniChar * in UCGetCharProperty
[:function UCIsSurrogateHighCharacter [:unsigned-char :unsigned-short]]
[:function UCIsSurrogateLowCharacter [:unsigned-char :unsigned-short]]
[:function UCGetUnicodeScalarValueForSurrogatePair [:unsigned-int :unsigned-short :unsigned-short]]
[:compound RoutineRecord "sizeof (RoutineRecord)"]
[:compound RoutineDescriptor "sizeof (RoutineDescriptor)"]
[:compound MixedModeStateRecord "sizeof (MixedModeStateRecord)"]
;;FIXME: CollectionFlattenUPP in NewCollectionFlattenUPP
;;FIXME: CollectionExceptionUPP in NewCollectionExceptionUPP
;;FIXME: CollectionFlattenUPP in DisposeCollectionFlattenUPP
;;FIXME: CollectionExceptionUPP in DisposeCollectionExceptionUPP
;;FIXME: void * in InvokeCollectionFlattenUPP
;;FIXME: Collection in InvokeCollectionExceptionUPP
;;FIXME: Collection in NewCollection
;;FIXME: Collection in DisposeCollection
;;FIXME: Collection in CloneCollection
;;FIXME: Collection in CountCollectionOwners
;;FIXME: Collection in RetainCollection
;;FIXME: Collection in ReleaseCollection
;;FIXME: Collection in GetCollectionRetainCount
;;FIXME: Collection in CopyCollection
;;FIXME: Collection in GetCollectionDefaultAttributes
;;FIXME: Collection in SetCollectionDefaultAttributes
;;FIXME: Collection in CountCollectionItems
;;FIXME: Collection in AddCollectionItem
;;FIXME: Collection in GetCollectionItem
;;FIXME: Collection in RemoveCollectionItem
;;FIXME: Collection in SetCollectionItemInfo
;;FIXME: Collection in GetCollectionItemInfo
;;FIXME: Collection in ReplaceIndexedCollectionItem
;;FIXME: Collection in GetIndexedCollectionItem
;;FIXME: Collection in RemoveIndexedCollectionItem
;;FIXME: Collection in SetIndexedCollectionItemInfo
;;FIXME: Collection in GetIndexedCollectionItemInfo
;;FIXME: Collection in CollectionTagExists
;;FIXME: Collection in CountCollectionTags
;;FIXME: Collection in GetIndexedCollectionTag
;;FIXME: Collection in CountTaggedCollectionItems
;;FIXME: Collection in GetTaggedCollectionItem
;;FIXME: Collection in GetTaggedCollectionItemInfo
;;FIXME: Collection in PurgeCollection
;;FIXME: Collection in PurgeCollectionTag
;;FIXME: Collection in EmptyCollection
;;FIXME: Collection in FlattenCollection
;;FIXME: Collection in FlattenPartialCollection
;;FIXME: Collection in UnflattenCollection
;;FIXME: CollectionExceptionUPP in GetCollectionExceptionProc
;;FIXME: Collection in SetCollectionExceptionProc
;;FIXME: Collection in GetNewCollection
;;FIXME: Collection in AddCollectionItemHdl
;;FIXME: Collection in GetCollectionItemHdl
;;FIXME: Collection in ReplaceIndexedCollectionItemHdl
;;FIXME: Collection in GetIndexedCollectionItemHdl
;;FIXME: Collection in FlattenCollectionToHdl
;;FIXME: Collection in UnflattenCollectionFromHdl
[:compound BigEndianUInt32 "sizeof (BigEndianUInt32)"]
[:compound BigEndianLong "sizeof (BigEndianLong)"]
[:compound BigEndianUnsignedLong "sizeof (BigEndianUnsignedLong)"]
[:compound BigEndianShort "sizeof (BigEndianShort)"]
[:compound BigEndianUnsignedShort "sizeof (BigEndianUnsignedShort)"]
[:compound BigEndianFixed "sizeof (BigEndianFixed)"]
[:compound BigEndianUnsignedFixed "sizeof (BigEndianUnsignedFixed)"]
[:compound BigEndianOSType "sizeof (BigEndianOSType)"]
;;FIXME: CoreEndianFlipProc in CoreEndianInstallFlipper
;;FIXME: CoreEndianFlipProc * in CoreEndianGetFlipper
;;FIXME: void * in CoreEndianFlipData
;;FIXME: SInt32 * in Gestalt
[:function NewGestaltValue [:short :unsigned-int :int]]
[:function ReplaceGestaltValue [:short :unsigned-int :int]]
[:function SetGestaltValue [:short :unsigned-int :int]]
[:function DeleteGestaltValue [:short :unsigned-int]]
;;FIXME: SelectorFunctionUPP in NewSelectorFunctionUPP
;;FIXME: SelectorFunctionUPP in DisposeSelectorFunctionUPP
;;FIXME: SInt32 * in InvokeSelectorFunctionUPP
[:function MemError [:short]]
[:function LMGetMemErr [:short]]
[:function LMSetMemErr [:void :short]]
;;FIXME: Handle in NewHandle
;;FIXME: Handle in NewHandleClear
;;FIXME: Handle in RecoverHandle
;;FIXME: Ptr in NewPtr
;;FIXME: Ptr in NewPtrClear
;;FIXME: Handle in NewEmptyHandle
;;FIXME: Handle in HLock
;;FIXME: Handle in HLockHi
;;FIXME: Handle in HUnlock
;;FIXME: Handle in TempNewHandle
;;FIXME: Ptr in DisposePtr
;;FIXME: Ptr in GetPtrSize
;;FIXME: Ptr in SetPtrSize
;;FIXME: Handle in DisposeHandle
;;FIXME: Handle in SetHandleSize
;;FIXME: Handle in GetHandleSize
;;FIXME: Handle in ReallocateHandle
;;FIXME: Handle in EmptyHandle
;;FIXME: Handle in HSetRBit
;;FIXME: Handle in HClrRBit
;;FIXME: Handle in HGetState
;;FIXME: Handle in HSetState
;;FIXME: Handle * in HandToHand
;;FIXME: const void * in PtrToXHand
;;FIXME: const void * in PtrToHand
;;FIXME: Handle in HandAndHand
;;FIXME: const void * in PtrAndHand
[:function IsHeapValid [:unsigned-char]]
;;FIXME: Handle in IsHandleValid
;;FIXME: Ptr in IsPointerValid
[:function S64Max [:long-long]]
[:function S64Min [:long-long]]
[:function S64Add [:long-long :long-long :long-long]]
[:function S64Subtract [:long-long :long-long :long-long]]
[:function S64Negate [:long-long :long-long]]
[:function S64Multiply [:long-long :long-long :long-long]]
[:function S64Mod [:long-long :long-long :long-long]]
;;FIXME: SInt64 * in S64Divide
[:function S64Div [:long-long :long-long :long-long]]
[:function S64Set [:long-long :int]]
[:function S64SetU [:long-long :unsigned-int]]
[:function S32Set [:int :long-long]]
[:function S64And [:unsigned-char :long-long :long-long]]
[:function S64Or [:unsigned-char :long-long :long-long]]
[:function S64Eor [:unsigned-char :long-long :long-long]]
[:function S64Not [:unsigned-char :long-long]]
[:function S64Compare [:int :long-long :long-long]]
[:function S64BitwiseAnd [:long-long :long-long :long-long]]
[:function S64BitwiseOr [:long-long :long-long :long-long]]
[:function S64BitwiseEor [:long-long :long-long :long-long]]
[:function S64BitwiseNot [:long-long :long-long]]
[:function S64ShiftRight [:long-long :long-long :unsigned-int]]
[:function S64ShiftLeft [:long-long :long-long :unsigned-int]]
[:function SInt64ToLongDouble [:long-double :long-long]]
[:function LongDoubleToSInt64 [:long-long :long-double]]
[:function U64Max [:unsigned-long-long]]
[:function U64Add [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Subtract [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Multiply [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Mod [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
;;FIXME: UInt64 * in U64Divide
[:function U64Div [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Set [:unsigned-long-long :int]]
[:function U64SetU [:unsigned-long-long :unsigned-int]]
[:function U32SetU [:unsigned-int :unsigned-long-long]]
[:function U64And [:unsigned-char :unsigned-long-long :unsigned-long-long]]
[:function U64Or [:unsigned-char :unsigned-long-long :unsigned-long-long]]
[:function U64Eor [:unsigned-char :unsigned-long-long :unsigned-long-long]]
[:function U64Not [:unsigned-char :unsigned-long-long]]
[:function U64Compare [:int :unsigned-long-long :unsigned-long-long]]
[:function U64BitwiseAnd [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64BitwiseOr [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64BitwiseEor [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64BitwiseNot [:unsigned-long-long :unsigned-long-long]]
[:function U64ShiftRight [:unsigned-long-long :unsigned-long-long :unsigned-int]]
[:function U64ShiftLeft [:unsigned-long-long :unsigned-long-long :unsigned-int]]
[:function UInt64ToLongDouble [:long-double :unsigned-long-long]]
[:function LongDoubleToUInt64 [:unsigned-long-long :long-double]]
[:function UInt64ToSInt64 [:long-long :unsigned-long-long]]
[:function SInt64ToUInt64 [:unsigned-long-long :long-long]]
[:function SInt64ToWide [Foundation/wide :long-long]]
[:function WideToSInt64 [:long-long Foundation/wide]]
[:function UInt64ToUnsignedWide [Foundation/UnsignedWide :unsigned-long-long]]
[:function UnsignedWideToUInt64 [:unsigned-long-long Foundation/UnsignedWide]]
;;FIXME: CFURLRef in CSBackupSetItemExcluded
;;FIXME: CFURLRef in CSBackupIsItemExcluded
;;FIXME: CFURLRef in CSDiskSpaceStartRecovery
;;FIXME: CFUUIDRef in CSDiskSpaceCancelRecovery
;;FIXME: CFURLRef in CSDiskSpaceGetRecoveryEstimate
[:compound DateCacheRecord "sizeof (DateCacheRecord)"]
[:compound DateTimeRec "sizeof (DateTimeRec)"]
[:compound LongDateCvt "sizeof (LongDateCvt)"]
[:compound LongDateRec "sizeof (LongDateRec)"]
[:compound TogglePB "sizeof (TogglePB)"]
;;FIXME: const UTCDateTime * in UCConvertUTCDateTimeToCFAbsoluteTime
;;FIXME: CFAbsoluteTime * in UCConvertSecondsToCFAbsoluteTime
;;FIXME: CFAbsoluteTime * in UCConvertLongDateTimeToCFAbsoluteTime
;;FIXME: UTCDateTime * in UCConvertCFAbsoluteTimeToUTCDateTime
;;FIXME: UInt32 * in UCConvertCFAbsoluteTimeToSeconds
;;FIXME: LongDateTime * in UCConvertCFAbsoluteTimeToLongDateTime
[:compound QElem "sizeof (QElem)"]
[:compound QHdr "sizeof (QHdr)"]
[:compound MachineLocation "sizeof (MachineLocation)"]
[:function IsMetric [:unsigned-char]]
;;FIXME: unsigned long * in Delay
;;FIXME: QElemPtr in Enqueue
;;FIXME: QElemPtr in Dequeue
;;FIXME: MachineLocation * in ReadLocation
[:function TickCount [:unsigned-int]]
;;FIXME: CFStringRef in CSCopyUserName
;;FIXME: CFStringRef in CSCopyMachineName
;;FIXME: DeferredTaskUPP in NewDeferredTaskUPP
;;FIXME: DeferredTaskUPP in DisposeDeferredTaskUPP
;;FIXME: DeferredTaskUPP in InvokeDeferredTaskUPP
[:compound DeferredTask "sizeof (DeferredTask)"]
[:compound vm_statistics_data_t "sizeof (vm_statistics_data_t)"]
[:compound vm_statistics64_data_t "sizeof (vm_statistics64_data_t)"]
[:compound vm_extmod_statistics_data_t "sizeof (vm_extmod_statistics_data_t)"]
[:compound host_basic_info_data_t "sizeof (host_basic_info_data_t)"]
[:compound host_sched_info_data_t "sizeof (host_sched_info_data_t)"]
[:compound kernel_resource_sizes_data_t "sizeof (kernel_resource_sizes_data_t)"]
[:compound host_priority_info_data_t "sizeof (host_priority_info_data_t)"]
[:compound host_load_info_data_t "sizeof (host_load_info_data_t)"]
[:compound host_cpu_load_info_data_t "sizeof (host_cpu_load_info_data_t)"]
[:compound memory_object_behave_info_data_t "sizeof (memory_object_behave_info_data_t)"]
[:compound memory_object_perf_info_data_t "sizeof (memory_object_perf_info_data_t)"]
[:compound memory_object_attr_info_data_t "sizeof (memory_object_attr_info_data_t)"]
[:compound x86_state_hdr_t "sizeof (x86_state_hdr_t)"]
[:compound i386_thread_state_t "sizeof (i386_thread_state_t)"]
[:compound x86_thread_state32_t "sizeof (x86_thread_state32_t)"]
[:compound i386_float_state_t "sizeof (i386_float_state_t)"]
[:compound x86_float_state32_t "sizeof (x86_float_state32_t)"]
[:compound x86_avx_state32_t "sizeof (x86_avx_state32_t)"]
[:compound i386_exception_state_t "sizeof (i386_exception_state_t)"]
[:compound x86_exception_state32_t "sizeof (x86_exception_state32_t)"]
[:compound x86_debug_state32_t "sizeof (x86_debug_state32_t)"]
[:compound x86_thread_state64_t "sizeof (x86_thread_state64_t)"]
[:compound x86_float_state64_t "sizeof (x86_float_state64_t)"]
[:compound x86_avx_state64_t "sizeof (x86_avx_state64_t)"]
[:compound x86_exception_state64_t "sizeof (x86_exception_state64_t)"]
[:compound x86_debug_state64_t "sizeof (x86_debug_state64_t)"]
[:compound x86_thread_state_t "sizeof (x86_thread_state_t)"]
[:compound x86_float_state_t "sizeof (x86_float_state_t)"]
[:compound x86_exception_state_t "sizeof (x86_exception_state_t)"]
[:compound x86_debug_state_t "sizeof (x86_debug_state_t)"]
[:compound processor_basic_info_data_t "sizeof (processor_basic_info_data_t)"]
[:compound processor_cpu_load_info_data_t "sizeof (processor_cpu_load_info_data_t)"]
[:compound processor_set_basic_info_data_t "sizeof (processor_set_basic_info_data_t)"]
[:compound processor_set_load_info_data_t "sizeof (processor_set_load_info_data_t)"]
[:compound policy_timeshare_base_data_t "sizeof (policy_timeshare_base_data_t)"]
[:compound policy_timeshare_limit_data_t "sizeof (policy_timeshare_limit_data_t)"]
[:compound policy_timeshare_info_data_t "sizeof (policy_timeshare_info_data_t)"]
[:compound policy_rr_base_data_t "sizeof (policy_rr_base_data_t)"]
[:compound policy_rr_limit_data_t "sizeof (policy_rr_limit_data_t)"]
[:compound policy_rr_info_data_t "sizeof (policy_rr_info_data_t)"]
[:compound policy_fifo_base_data_t "sizeof (policy_fifo_base_data_t)"]
[:compound policy_fifo_limit_data_t "sizeof (policy_fifo_limit_data_t)"]
[:compound policy_fifo_info_data_t "sizeof (policy_fifo_info_data_t)"]
[:compound policy_base_data_t "sizeof (policy_base_data_t)"]
[:compound policy_limit_data_t "sizeof (policy_limit_data_t)"]
[:compound policy_info_data_t "sizeof (policy_info_data_t)"]
[:compound task_basic_info_32_data_t "sizeof (task_basic_info_32_data_t)"]
[:compound task_basic_info_64_data_t "sizeof (task_basic_info_64_data_t)"]
[:compound task_basic_info_data_t "sizeof (task_basic_info_data_t)"]
[:compound task_events_info_data_t "sizeof (task_events_info_data_t)"]
[:compound task_thread_times_info_data_t "sizeof (task_thread_times_info_data_t)"]
[:compound task_absolutetime_info_data_t "sizeof (task_absolutetime_info_data_t)"]
[:compound task_kernelmemory_info_data_t "sizeof (task_kernelmemory_info_data_t)"]
[:compound task_affinity_tag_info_data_t "sizeof (task_affinity_tag_info_data_t)"]
[:compound task_dyld_info_data_t "sizeof (task_dyld_info_data_t)"]
[:compound task_extmod_info_data_t "sizeof (task_extmod_info_data_t)"]
[:compound mach_task_basic_info_data_t "sizeof (mach_task_basic_info_data_t)"]
[:compound task_category_policy_data_t "sizeof (task_category_policy_data_t)"]
[:compound thread_basic_info_data_t "sizeof (thread_basic_info_data_t)"]
[:compound thread_identifier_info_data_t "sizeof (thread_identifier_info_data_t)"]
[:compound thread_standard_policy_data_t "sizeof (thread_standard_policy_data_t)"]
[:compound thread_extended_policy_data_t "sizeof (thread_extended_policy_data_t)"]
[:compound thread_time_constraint_policy_data_t "sizeof (thread_time_constraint_policy_data_t)"]
[:compound thread_precedence_policy_data_t "sizeof (thread_precedence_policy_data_t)"]
[:compound thread_affinity_policy_data_t "sizeof (thread_affinity_policy_data_t)"]
[:compound thread_background_policy_data_t "sizeof (thread_background_policy_data_t)"]
[:compound vm_region_basic_info_data_64_t "sizeof (vm_region_basic_info_data_64_t)"]
[:compound vm_region_basic_info_data_t "sizeof (vm_region_basic_info_data_t)"]
[:compound vm_region_extended_info_data_t "sizeof (vm_region_extended_info_data_t)"]
[:compound vm_region_top_info_data_t "sizeof (vm_region_top_info_data_t)"]
[:compound vm_region_submap_info_data_t "sizeof (vm_region_submap_info_data_t)"]
[:compound vm_region_submap_info_data_64_t "sizeof (vm_region_submap_info_data_64_t)"]
[:compound vm_region_submap_short_info_data_64_t "sizeof (vm_region_submap_short_info_data_64_t)"]
[:compound vm_page_info_basic_data_t "sizeof (vm_page_info_basic_data_t)"]
[:compound kmod_reference_t "sizeof (kmod_reference_t)"]
[:compound kmod_info_t "sizeof (kmod_info_t)"]
[:compound kmod_info_32_v1_t "sizeof (kmod_info_32_v1_t)"]
[:compound kmod_info_64_v1_t "sizeof (kmod_info_64_v1_t)"]
[:function mach_host_self [:unsigned-int]]
[:function mach_thread_self [:unsigned-int]]
;;FIXME: vm_size_t * in host_page_size
;;FIXME: mach_timespec_t * in clock_sleep_trap
;;FIXME: mach_vm_offset_t * in _kernelrpc_mach_vm_allocate_trap
[:function _kernelrpc_mach_vm_deallocate_trap [:int :unsigned-int :unsigned-long-long :unsigned-long-long]]
[:function _kernelrpc_mach_vm_protect_trap [:int :unsigned-int :unsigned-long-long :unsigned-long-long :unsigned-int :int]]
;;FIXME: mach_port_name_t * in _kernelrpc_mach_port_allocate_trap
[:function _kernelrpc_mach_port_destroy_trap [:int :unsigned-int :unsigned-int]]
[:function _kernelrpc_mach_port_deallocate_trap [:int :unsigned-int :unsigned-int]]
[:function _kernelrpc_mach_port_mod_refs_trap [:int :unsigned-int :unsigned-int :unsigned-int :int]]
[:function _kernelrpc_mach_port_move_member_trap [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function _kernelrpc_mach_port_insert_right_trap [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
[:function _kernelrpc_mach_port_insert_member_trap [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function _kernelrpc_mach_port_extract_member_trap [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function macx_swapon [:int :unsigned-long-long :int :int :int]]
[:function macx_swapoff [:int :unsigned-long-long :int]]
[:function macx_triggers [:int :int :int :int :unsigned-int]]
[:function macx_backing_store_suspend [:int :unsigned-int]]
[:function macx_backing_store_recovery [:int :int]]
[:function swtch_pri [:unsigned-int :int]]
[:function swtch [:unsigned-int]]
[:function thread_switch [:int :unsigned-int :int :unsigned-int]]
[:function task_self_trap [:unsigned-int]]
;;FIXME: mach_port_name_t * in task_for_pid
;;FIXME: mach_port_name_t * in task_name_for_pid
;;FIXME: int * in pid_for_task
[:compound IOPhysicalRange "sizeof (IOPhysicalRange)"]
[:compound IOVirtualRange "sizeof (IOVirtualRange)"]
[:compound IONamedValue "sizeof (IONamedValue)"]
[:compound OSNotificationHeader "sizeof (OSNotificationHeader)"]
[:compound IOServiceInterestContent "sizeof (IOServiceInterestContent)"]
[:compound IOAsyncCompletionContent "sizeof (IOAsyncCompletionContent)"]
;;FIXME: mach_port_t * in IOMasterPort
;;FIXME: IONotificationPortRef in IONotificationPortCreate
;;FIXME: IONotificationPortRef in IONotificationPortDestroy
;;FIXME: CFRunLoopSourceRef in IONotificationPortGetRunLoopSource
;;FIXME: IONotificationPortRef in IONotificationPortGetMachPort
;;FIXME: IONotificationPortRef in IONotificationPortSetDispatchQueue
;;FIXME: void * in IODispatchCalloutFromMessage
;;FIXME: mach_port_t * in IOCreateReceivePort
[:function IOObjectRelease [:int :unsigned-int]]
[:function IOObjectRetain [:int :unsigned-int]]
;;FIXME: io_name_t in IOObjectGetClass
;;FIXME: CFStringRef in IOObjectCopyClass
;;FIXME: CFStringRef in IOObjectCopySuperclassForClass
;;FIXME: CFStringRef in IOObjectCopyBundleIdentifierForClass
;;FIXME: const io_name_t in IOObjectConformsTo
[:function IOObjectIsEqualTo [:unsigned-int :unsigned-int :unsigned-int]]
[:function IOObjectGetKernelRetainCount [:unsigned-int :unsigned-int]]
[:function IOObjectGetUserRetainCount [:unsigned-int :unsigned-int]]
[:function IOObjectGetRetainCount [:unsigned-int :unsigned-int]]
[:function IOIteratorNext [:unsigned-int :unsigned-int]]
[:function IOIteratorReset [:void :unsigned-int]]
[:function IOIteratorIsValid [:unsigned-int :unsigned-int]]
;;FIXME: CFDictionaryRef in IOServiceGetMatchingService
;;FIXME: CFDictionaryRef in IOServiceGetMatchingServices
;;FIXME: const io_name_t in IOServiceAddNotification
;;FIXME: IONotificationPortRef in IOServiceAddMatchingNotification
;;FIXME: IONotificationPortRef in IOServiceAddInterestNotification
;;FIXME: CFDictionaryRef in IOServiceMatchPropertyTable
;;FIXME: uint32_t * in IOServiceGetBusyState
;;FIXME: mach_timespec_t * in IOServiceWaitQuiet
;;FIXME: uint32_t * in IOKitGetBusyState
;;FIXME: mach_timespec_t * in IOKitWaitQuiet
;;FIXME: io_connect_t * in IOServiceOpen
[:function IOServiceRequestProbe [:int :unsigned-int :unsigned-int]]
[:function IOServiceClose [:int :unsigned-int]]
[:function IOConnectAddRef [:int :unsigned-int]]
[:function IOConnectRelease [:int :unsigned-int]]
;;FIXME: io_service_t * in IOConnectGetService
[:function IOConnectSetNotificationPort [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-long]]
;;FIXME: mach_vm_address_t * in IOConnectMapMemory
;;FIXME: mach_vm_address_t * in IOConnectMapMemory64
[:function IOConnectUnmapMemory [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-long-long]]
[:function IOConnectUnmapMemory64 [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-long-long]]
;;FIXME: CFTypeRef in IOConnectSetCFProperties
;;FIXME: CFStringRef in IOConnectSetCFProperty
;;FIXME: const uint64_t * in IOConnectCallMethod
;;FIXME: uint64_t * in IOConnectCallAsyncMethod
;;FIXME: const void * in IOConnectCallStructMethod
;;FIXME: uint64_t * in IOConnectCallAsyncStructMethod
;;FIXME: const uint64_t * in IOConnectCallScalarMethod
;;FIXME: uint64_t * in IOConnectCallAsyncScalarMethod
[:function IOConnectTrap0 [:int :unsigned-int :unsigned-int]]
[:function IOConnectTrap1 [:int :unsigned-int :unsigned-int :unsigned-long]]
[:function IOConnectTrap2 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long]]
[:function IOConnectTrap3 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectTrap4 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectTrap5 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectTrap6 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectAddClient [:int :unsigned-int :unsigned-int]]
[:function IORegistryGetRootEntry [:unsigned-int :unsigned-int]]
;;FIXME: const io_string_t in IORegistryEntryFromPath
;;FIXME: const io_name_t in IORegistryCreateIterator
;;FIXME: const io_name_t in IORegistryEntryCreateIterator
[:function IORegistryIteratorEnterEntry [:int :unsigned-int]]
[:function IORegistryIteratorExitEntry [:int :unsigned-int]]
;;FIXME: io_name_t in IORegistryEntryGetName
;;FIXME: const io_name_t in IORegistryEntryGetNameInPlane
;;FIXME: const io_name_t in IORegistryEntryGetLocationInPlane
;;FIXME: const io_name_t in IORegistryEntryGetPath
;;FIXME: uint64_t * in IORegistryEntryGetRegistryEntryID
;;FIXME: CFMutableDictionaryRef * in IORegistryEntryCreateCFProperties
;;FIXME: CFTypeRef in IORegistryEntryCreateCFProperty
;;FIXME: CFTypeRef in IORegistryEntrySearchCFProperty
;;FIXME: const io_name_t in IORegistryEntryGetProperty
;;FIXME: CFTypeRef in IORegistryEntrySetCFProperties
;;FIXME: CFStringRef in IORegistryEntrySetCFProperty
;;FIXME: const io_name_t in IORegistryEntryGetChildIterator
;;FIXME: const io_name_t in IORegistryEntryGetChildEntry
;;FIXME: const io_name_t in IORegistryEntryGetParentIterator
;;FIXME: const io_name_t in IORegistryEntryGetParentEntry
;;FIXME: const io_name_t in IORegistryEntryInPlane
;;FIXME: CFMutableDictionaryRef in IOServiceMatching
;;FIXME: CFMutableDictionaryRef in IOServiceNameMatching
;;FIXME: CFMutableDictionaryRef in IOBSDNameMatching
;;FIXME: CFMutableDictionaryRef in IOOpenFirmwarePathMatching
;;FIXME: CFMutableDictionaryRef in IORegistryEntryIDMatching
;;FIXME: const io_name_t in IOServiceOFPathToBSDName
;;FIXME: mach_msg_header_t * in OSGetNotificationFromMessage
[:function IOCatalogueSendData [:int :unsigned-int :unsigned-int :c-string-const :unsigned-int]]
;;FIXME: io_name_t in IOCatalogueTerminate
;;FIXME: char ** in IOCatalogueGetData
;;FIXME: io_name_t in IOCatalogueModuleLoaded
[:function IOCatalogueReset [:int :unsigned-int :unsigned-int]]
[:function DASessionGetTypeID [:unsigned-long]]
;;FIXME: DASessionRef in DASessionCreate
;;FIXME: DASessionRef in DASessionScheduleWithRunLoop
;;FIXME: DASessionRef in DASessionUnscheduleFromRunLoop
;;FIXME: DASessionRef in DASessionSetDispatchQueue
[:function DAApprovalSessionGetTypeID [:unsigned-long]]
;;FIXME: DAApprovalSessionRef in DAApprovalSessionCreate
;;FIXME: DAApprovalSessionRef in DAApprovalSessionScheduleWithRunLoop
;;FIXME: DAApprovalSessionRef in DAApprovalSessionUnscheduleFromRunLoop
[:function DADiskGetTypeID [:unsigned-long]]
;;FIXME: DADiskRef in DADiskCreateFromBSDName
;;FIXME: DADiskRef in DADiskCreateFromIOMedia
;;FIXME: DADiskRef in DADiskCreateFromVolumePath
;;FIXME: DADiskRef in DADiskGetBSDName
;;FIXME: DADiskRef in DADiskCopyIOMedia
;;FIXME: CFDictionaryRef in DADiskCopyDescription
;;FIXME: DADiskRef in DADiskCopyWholeDisk
[:compound HFSUniStr255 "sizeof (HFSUniStr255)"]
[:compound FSRef "sizeof (FSRef)"]
[:compound CatPositionRec "sizeof (CatPositionRec)"]
[:compound FSSpec "sizeof (FSSpec)"]
[:compound ParamBlockRec "sizeof (ParamBlockRec)"]
[:compound FSPermissionInfo "sizeof (FSPermissionInfo)"]
[:compound FSCatalogInfo "sizeof (FSCatalogInfo)"]
[:compound FSRefParam "sizeof (FSRefParam)"]
[:compound FSRefForkIOParam "sizeof (FSRefForkIOParam)"]
[:compound FSSearchParams "sizeof (FSSearchParams)"]
[:compound FSCatalogBulkParam "sizeof (FSCatalogBulkParam)"]
[:compound FSForkIOParam "sizeof (FSForkIOParam)"]
[:compound FSForkInfo "sizeof (FSForkInfo)"]
[:compound FSForkCBInfoParam "sizeof (FSForkCBInfoParam)"]
[:compound FSRangeLockParam "sizeof (FSRangeLockParam)"]
[:compound FSVolumeInfo "sizeof (FSVolumeInfo)"]
[:compound FSVolumeInfoParam "sizeof (FSVolumeInfoParam)"]
[:compound GetVolParmsInfoBuffer "sizeof (GetVolParmsInfoBuffer)"]
[:compound VolMountInfoHeader "sizeof (VolMountInfoHeader)"]
[:compound VolumeMountInfoHeader "sizeof (VolumeMountInfoHeader)"]
[:compound AFPVolMountInfo "sizeof (AFPVolMountInfo)"]
[:compound AFPXVolMountInfo "sizeof (AFPXVolMountInfo)"]
[:compound AFPTagData "sizeof (AFPTagData)"]
[:compound AFPAlternateAddress "sizeof (AFPAlternateAddress)"]
;;FIXME: IOCompletionUPP in NewIOCompletionUPP
;;FIXME: IOCompletionUPP in DisposeIOCompletionUPP
;;FIXME: ParmBlkPtr in InvokeIOCompletionUPP
;;FIXME: const FSRef * in FSMakeFSRefUnicode
;;FIXME: FSRefParam * in PBMakeFSRefUnicodeSync
;;FIXME: FSRefParam * in PBMakeFSRefUnicodeAsync
;;FIXME: const FSRef * in FSCompareFSRefs
;;FIXME: FSRefParam * in PBCompareFSRefsSync
;;FIXME: FSRefParam * in PBCompareFSRefsAsync
;;FIXME: const FSRef * in FSCreateFileUnicode
;;FIXME: FSRefParam * in PBCreateFileUnicodeSync
;;FIXME: FSRefParam * in PBCreateFileUnicodeAsync
;;FIXME: const FSRef * in FSCreateDirectoryUnicode
;;FIXME: FSRefParam * in PBCreateDirectoryUnicodeSync
;;FIXME: FSRefParam * in PBCreateDirectoryUnicodeAsync
;;FIXME: const FSRef * in FSDeleteObject
;;FIXME: FSRefParam * in PBDeleteObjectSync
;;FIXME: FSRefParam * in PBDeleteObjectAsync
;;FIXME: const FSRef * in FSUnlinkObject
;;FIXME: FSRefParam * in PBUnlinkObjectSync
;;FIXME: FSRefParam * in PBUnlinkObjectAsync
;;FIXME: const FSRef * in FSMoveObject
;;FIXME: FSRefParam * in PBMoveObjectSync
;;FIXME: FSRefParam * in PBMoveObjectAsync
;;FIXME: const FSRef * in FSExchangeObjects
;;FIXME: FSRefParam * in PBExchangeObjectsSync
;;FIXME: FSRefParam * in PBExchangeObjectsAsync
;;FIXME: const FSRef * in FSReplaceObject
;;FIXME: CFStringRef in FSPathReplaceObject
;;FIXME: const FSRef * in FSGetTemporaryDirectoryForReplaceObject
;;FIXME: char * in FSPathGetTemporaryDirectoryForReplaceObject
;;FIXME: const FSRef * in FSRenameUnicode
;;FIXME: FSRefParam * in PBRenameUnicodeSync
;;FIXME: FSRefParam * in PBRenameUnicodeAsync
;;FIXME: const FSRef * in FSGetCatalogInfo
;;FIXME: FSRefParam * in PBGetCatalogInfoSync
;;FIXME: FSRefParam * in PBGetCatalogInfoAsync
;;FIXME: const FSRef * in FSSetCatalogInfo
;;FIXME: FSRefParam * in PBSetCatalogInfoSync
;;FIXME: FSRefParam * in PBSetCatalogInfoAsync
;;FIXME: const FSRef * in FSOpenIterator
;;FIXME: FSCatalogBulkParam * in PBOpenIteratorSync
;;FIXME: FSCatalogBulkParam * in PBOpenIteratorAsync
;;FIXME: FSIterator in FSCloseIterator
;;FIXME: FSCatalogBulkParam * in PBCloseIteratorSync
;;FIXME: FSCatalogBulkParam * in PBCloseIteratorAsync
;;FIXME: FSIterator in FSGetCatalogInfoBulk
;;FIXME: FSCatalogBulkParam * in PBGetCatalogInfoBulkSync
;;FIXME: FSCatalogBulkParam * in PBGetCatalogInfoBulkAsync
;;FIXME: FSIterator in FSCatalogSearch
;;FIXME: FSCatalogBulkParam * in PBCatalogSearchSync
;;FIXME: FSCatalogBulkParam * in PBCatalogSearchAsync
;;FIXME: const FSRef * in FSCreateFileAndOpenForkUnicode
;;FIXME: FSRefForkIOParamPtr in PBCreateFileAndOpenForkUnicodeSync
;;FIXME: FSRefForkIOParamPtr in PBCreateFileAndOpenForkUnicodeAsync
;;FIXME: const FSRef * in FSCreateFork
;;FIXME: FSForkIOParam * in PBCreateForkSync
;;FIXME: FSForkIOParam * in PBCreateForkAsync
;;FIXME: const FSRef * in FSDeleteFork
;;FIXME: FSForkIOParam * in PBDeleteForkSync
;;FIXME: FSForkIOParam * in PBDeleteForkAsync
;;FIXME: const FSRef * in FSIterateForks
;;FIXME: FSForkIOParam * in PBIterateForksSync
;;FIXME: FSForkIOParam * in PBIterateForksAsync
;;FIXME: const FSRef * in FSOpenFork
;;FIXME: FSForkIOParam * in PBOpenForkSync
;;FIXME: FSForkIOParam * in PBOpenForkAsync
;;FIXME: void * in FSReadFork
;;FIXME: FSForkIOParam * in PBReadForkSync
;;FIXME: FSForkIOParam * in PBReadForkAsync
;;FIXME: const void * in FSWriteFork
;;FIXME: FSForkIOParam * in PBWriteForkSync
;;FIXME: FSForkIOParam * in PBWriteForkAsync
;;FIXME: SInt64 * in FSGetForkPosition
;;FIXME: FSForkIOParam * in PBGetForkPositionSync
;;FIXME: FSForkIOParam * in PBGetForkPositionAsync
[:function FSSetForkPosition [:short :int :unsigned-short :long-long]]
;;FIXME: FSForkIOParam * in PBSetForkPositionSync
;;FIXME: FSForkIOParam * in PBSetForkPositionAsync
;;FIXME: SInt64 * in FSGetForkSize
;;FIXME: FSForkIOParam * in PBGetForkSizeSync
;;FIXME: FSForkIOParam * in PBGetForkSizeAsync
[:function FSSetForkSize [:short :int :unsigned-short :long-long]]
;;FIXME: FSForkIOParam * in PBSetForkSizeSync
;;FIXME: FSForkIOParam * in PBSetForkSizeAsync
;;FIXME: UInt64 * in FSAllocateFork
;;FIXME: FSForkIOParam * in PBAllocateForkSync
;;FIXME: FSForkIOParam * in PBAllocateForkAsync
[:function FSFlushFork [:short :int]]
;;FIXME: FSForkIOParam * in PBFlushForkSync
;;FIXME: FSForkIOParam * in PBFlushForkAsync
[:function FSCloseFork [:short :int]]
;;FIXME: FSForkIOParam * in PBCloseForkSync
;;FIXME: FSForkIOParam * in PBCloseForkAsync
;;FIXME: short * in FSGetForkCBInfo
;;FIXME: FSForkCBInfoParam * in PBGetForkCBInfoSync
;;FIXME: FSForkCBInfoParam * in PBGetForkCBInfoAsync
;;FIXME: UInt64 * in FSLockRange
;;FIXME: FSRangeLockParamPtr in PBXLockRangeSync
;;FIXME: FSRangeLockParamPtr in PBXLockRangeAsync
;;FIXME: UInt64 * in FSUnlockRange
;;FIXME: FSRangeLockParamPtr in PBXUnlockRangeSync
;;FIXME: FSRangeLockParamPtr in PBXUnlockRangeAsync
;;FIXME: FSVolumeRefNum * in FSGetVolumeInfo
;;FIXME: FSVolumeInfoParam * in PBGetVolumeInfoSync
;;FIXME: FSVolumeInfoParam * in PBGetVolumeInfoAsync
;;FIXME: const FSVolumeInfo * in FSSetVolumeInfo
;;FIXME: FSVolumeInfoParam * in PBSetVolumeInfoSync
;;FIXME: FSVolumeInfoParam * in PBSetVolumeInfoAsync
;;FIXME: HFSUniStr255 * in FSGetDataForkName
;;FIXME: HFSUniStr255 * in FSGetResourceForkName
;;FIXME: const FSRef * in FSRefMakePath
;;FIXME: const UInt8 * in FSPathMakeRef
;;FIXME: const UInt8 * in FSPathMakeRefWithOptions
;;FIXME: const FSRef * in FSIsFSRefValid
;;FIXME: const FSRef * in FNNotify
;;FIXME: const UInt8 * in FNNotifyByPath
[:function FNNotifyAll [:int :unsigned-int :unsigned-int]]
;;FIXME: FNSubscriptionUPP in NewFNSubscriptionUPP
;;FIXME: FNSubscriptionUPP in DisposeFNSubscriptionUPP
;;FIXME: void * in InvokeFNSubscriptionUPP
;;FIXME: const FSRef * in FNSubscribe
;;FIXME: const UInt8 * in FNSubscribeByPath
;;FIXME: FNSubscriptionRef in FNUnsubscribe
;;FIXME: FNSubscriptionRef in FNGetDirectoryForSubscription
;;FIXME: FSVolumeMountUPP in NewFSVolumeMountUPP
;;FIXME: FSVolumeUnmountUPP in NewFSVolumeUnmountUPP
;;FIXME: FSVolumeEjectUPP in NewFSVolumeEjectUPP
;;FIXME: FSVolumeMountUPP in DisposeFSVolumeMountUPP
;;FIXME: FSVolumeUnmountUPP in DisposeFSVolumeUnmountUPP
;;FIXME: FSVolumeEjectUPP in DisposeFSVolumeEjectUPP
;;FIXME: FSVolumeOperation in InvokeFSVolumeMountUPP
;;FIXME: FSVolumeOperation in InvokeFSVolumeUnmountUPP
;;FIXME: FSVolumeOperation in InvokeFSVolumeEjectUPP
;;FIXME: FSVolumeOperation * in FSCreateVolumeOperation
;;FIXME: FSVolumeOperation in FSDisposeVolumeOperation
;;FIXME: CFStringRef in FSMountLocalVolumeSync
;;FIXME: CFStringRef in FSMountLocalVolumeAsync
;;FIXME: CFURLRef in FSMountServerVolumeSync
;;FIXME: CFURLRef in FSMountServerVolumeAsync
;;FIXME: FSVolumeOperation in FSGetAsyncMountStatus
;;FIXME: pid_t * in FSUnmountVolumeSync
;;FIXME: FSVolumeOperation in FSUnmountVolumeAsync
;;FIXME: FSVolumeOperation in FSGetAsyncUnmountStatus
;;FIXME: FSVolumeOperation in FSCancelVolumeOperation
;;FIXME: pid_t * in FSEjectVolumeSync
;;FIXME: FSVolumeOperation in FSEjectVolumeAsync
;;FIXME: FSVolumeOperation in FSGetAsyncEjectStatus
;;FIXME: CFStringRef * in FSCopyDiskIDForVolume
;;FIXME: CFURLRef * in FSCopyURLForVolume
;;FIXME: CFStringRef in FSGetVolumeForDiskID
;;FIXME: DADiskRef * in FSCopyDADiskForVolume
;;FIXME: DADiskRef in FSGetVolumeForDADisk
[:compound FSFileOperationClientContext "sizeof (FSFileOperationClientContext)"]
;;FIXME: const FSRef * in FSCopyObjectSync
;;FIXME: const FSRef * in FSMoveObjectSync
;;FIXME: const FSRef * in FSMoveObjectToTrashSync
;;FIXME: CFStringRef in FSPathCopyObjectSync
;;FIXME: CFStringRef in FSPathMoveObjectSync
;;FIXME: char ** in FSPathMoveObjectToTrashSync
[:function FSFileOperationGetTypeID [:unsigned-long]]
;;FIXME: FSFileOperationRef in FSFileOperationCreate
;;FIXME: FSFileOperationRef in FSFileOperationScheduleWithRunLoop
;;FIXME: FSFileOperationRef in FSFileOperationUnscheduleFromRunLoop
;;FIXME: FSFileOperationRef in FSCopyObjectAsync
;;FIXME: FSFileOperationRef in FSMoveObjectAsync
;;FIXME: FSFileOperationRef in FSMoveObjectToTrashAsync
;;FIXME: FSFileOperationRef in FSPathCopyObjectAsync
;;FIXME: FSFileOperationRef in FSPathMoveObjectAsync
;;FIXME: FSFileOperationRef in FSPathMoveObjectToTrashAsync
;;FIXME: FSFileOperationRef in FSFileOperationCancel
;;FIXME: FSFileOperationRef in FSFileOperationCopyStatus
;;FIXME: FSFileOperationRef in FSPathFileOperationCopyStatus
;;FIXME: CFStringRef in FSCreateStringFromHFSUniStr
;;FIXME: CFStringRef in FSGetHFSUniStrFromString
[:function FSFileSecurityGetTypeID [:unsigned-long]]
;;FIXME: FSFileSecurityRef in FSFileSecurityCreate
;;FIXME: FSFileSecurityRef in FSFileSecurityCreateWithFSPermissionInfo
;;FIXME: FSFileSecurityRef in FSFileSecurityRefCreateCopy
;;FIXME: FSFileSecurityRef in FSFileSecurityGetOwnerUUID
;;FIXME: FSFileSecurityRef in FSFileSecuritySetOwnerUUID
;;FIXME: FSFileSecurityRef in FSFileSecurityGetGroupUUID
;;FIXME: FSFileSecurityRef in FSFileSecuritySetGroupUUID
;;FIXME: FSFileSecurityRef in FSFileSecurityCopyAccessControlList
;;FIXME: FSFileSecurityRef in FSFileSecuritySetAccessControlList
;;FIXME: FSFileSecurityRef in FSFileSecurityGetOwner
;;FIXME: FSFileSecurityRef in FSFileSecuritySetOwner
;;FIXME: FSFileSecurityRef in FSFileSecurityGetGroup
;;FIXME: FSFileSecurityRef in FSFileSecuritySetGroup
;;FIXME: FSFileSecurityRef in FSFileSecurityGetMode
;;FIXME: FSFileSecurityRef in FSFileSecuritySetMode
;;FIXME: GetVolParmsInfoBuffer * in FSGetVolumeParms
;;FIXME: ByteCount * in FSGetVolumeMountInfoSize
;;FIXME: BytePtr in FSGetVolumeMountInfo
;;FIXME: BytePtr in FSVolumeMount
[:function FSFlushVolume [:int :short]]
;;FIXME: FSRefParamPtr in PBFlushVolumeSync
;;FIXME: FSRefParamPtr in PBFlushVolumeAsync
;;FIXME: FSRefParamPtr in PBFSCopyFileSync
;;FIXME: FSRefParamPtr in PBFSCopyFileAsync
;;FIXME: FSRefPtr in FSResolveNodeID
;;FIXME: FSRefParamPtr in PBFSResolveNodeIDSync
;;FIXME: FSRefParamPtr in PBFSResolveNodeIDAsync
;;FIXME: ResErrUPP in NewResErrUPP
;;FIXME: ResErrUPP in DisposeResErrUPP
;;FIXME: ResErrUPP in InvokeResErrUPP
[:function CloseResFile [:void :int]]
[:function ResError [:short]]
[:function CurResFile [:int]]
;;FIXME: Handle in HomeResFile
[:function UseResFile [:void :int]]
[:function CountTypes [:short]]
[:function Count1Types [:short]]
;;FIXME: ResType * in GetIndType
;;FIXME: ResType * in Get1IndType
[:function SetResLoad [:void :unsigned-char]]
[:function CountResources [:short :unsigned-int]]
[:function Count1Resources [:short :unsigned-int]]
;;FIXME: Handle in GetIndResource
;;FIXME: Handle in Get1IndResource
;;FIXME: Handle in GetResource
;;FIXME: Handle in Get1Resource
;;FIXME: Handle in GetNamedResource
;;FIXME: Handle in Get1NamedResource
;;FIXME: Handle in LoadResource
;;FIXME: Handle in ReleaseResource
;;FIXME: Handle in DetachResource
[:function UniqueID [:short :unsigned-int]]
[:function Unique1ID [:short :unsigned-int]]
;;FIXME: Handle in GetResAttrs
;;FIXME: Handle in GetResInfo
;;FIXME: Handle in SetResInfo
;;FIXME: Handle in AddResource
;;FIXME: Handle in GetResourceSizeOnDisk
;;FIXME: Handle in GetMaxResourceSize
;;FIXME: Handle in SetResAttrs
;;FIXME: Handle in ChangedResource
;;FIXME: Handle in RemoveResource
[:function UpdateResFile [:void :int]]
;;FIXME: Handle in WriteResource
[:function SetResPurge [:void :unsigned-char]]
[:function GetResFileAttrs [:short :int]]
[:function SetResFileAttrs [:void :int :short]]
;;FIXME: Handle in ReadPartialResource
;;FIXME: Handle in WritePartialResource
;;FIXME: Handle in SetResourceSize
;;FIXME: Handle in GetNextFOND
[:function InsertResourceFile [:short :int :short]]
[:function DetachResourceFile [:short :int]]
;;FIXME: ResFileRefNum * in GetTopResourceFile
;;FIXME: ResFileRefNum * in GetNextResourceFile
;;FIXME: const FSRef * in FSOpenResFile
;;FIXME: const FSRef * in FSCreateResFile
;;FIXME: const FSRef * in FSResourceFileAlreadyOpen
;;FIXME: const FSRef * in FSOpenOrphanResFile
;;FIXME: const FSRef * in FSCreateResourceFile
;;FIXME: const FSRef * in FSCreateResourceFork
;;FIXME: const FSRef * in FSOpenResourceFile
[:compound ComponentDescription "sizeof (ComponentDescription)"]
[:compound ResourceSpec "sizeof (ResourceSpec)"]
[:compound ComponentResource "sizeof (ComponentResource)"]
[:compound ComponentPlatformInfo "sizeof (ComponentPlatformInfo)"]
[:compound ComponentResourceExtension "sizeof (ComponentResourceExtension)"]
[:compound ComponentPlatformInfoArray "sizeof (ComponentPlatformInfoArray)"]
[:compound ExtComponentResource "sizeof (ExtComponentResource)"]
[:compound ComponentAliasResource "sizeof (ComponentAliasResource)"]
[:compound ComponentParameters "sizeof (ComponentParameters)"]
[:compound ComponentRecord "sizeof (ComponentRecord)"]
[:compound ComponentInstanceRecord "sizeof (ComponentInstanceRecord)"]
[:compound RegisteredComponentRecord "sizeof (RegisteredComponentRecord)"]
[:compound RegisteredComponentInstanceRecord "sizeof (RegisteredComponentInstanceRecord)"]
[:function CSSetComponentsThreadMode [:void :unsigned-int]]
[:function CSGetComponentsThreadMode [:unsigned-int]]
[:compound ComponentMPWorkFunctionHeaderRecord "sizeof (ComponentMPWorkFunctionHeaderRecord)"]
;;FIXME: ComponentFunctionUPP in NewComponentFunctionUPP
;;FIXME: ComponentFunctionUPP in DisposeComponentFunctionUPP
;;FIXME: Component in RegisterComponent
;;FIXME: Component in RegisterComponentResource
;;FIXME: Component in UnregisterComponent
;;FIXME: Component in FindNextComponent
;;FIXME: ComponentDescription * in CountComponents
;;FIXME: Component in GetComponentInfo
[:function GetComponentListModSeed [:int]]
[:function GetComponentTypeModSeed [:int :unsigned-int]]
;;FIXME: Component in OpenAComponent
;;FIXME: ComponentInstance in OpenComponent
;;FIXME: ComponentInstance in CloseComponent
;;FIXME: ComponentInstance in GetComponentInstanceError
;;FIXME: Component in ResolveComponentAlias
;;FIXME: Component in GetComponentPublicResource
;;FIXME: ComponentDescription * in GetComponentPublicResourceList
;;FIXME: Component in GetComponentPublicIndString
;;FIXME: ComponentInstance in SetComponentInstanceError
;;FIXME: Component in GetComponentRefcon
;;FIXME: Component in SetComponentRefcon
;;FIXME: Component in OpenComponentResFile
;;FIXME: Component in OpenAComponentResFile
[:function CloseComponentResFile [:short :int]]
;;FIXME: Component in GetComponentResource
;;FIXME: Component in GetComponentIndString
;;FIXME: Handle in GetComponentInstanceStorage
;;FIXME: ComponentInstance in SetComponentInstanceStorage
;;FIXME: Component in CountComponentInstances
;;FIXME: ComponentParameters * in CallComponentFunction
;;FIXME: Handle in CallComponentFunctionWithStorage
;;FIXME: Handle in CallComponentFunctionWithStorageProcInfo
;;FIXME: ComponentParameters * in DelegateComponentCall
;;FIXME: Component in SetDefaultComponent
;;FIXME: ComponentInstance in OpenDefaultComponent
;;FIXME: ComponentInstance * in OpenADefaultComponent
;;FIXME: Component in CaptureComponent
;;FIXME: Component in UncaptureComponent
[:function RegisterComponentResourceFile [:int :short :short]]
;;FIXME: const FSRef * in RegisterComponentFileRef
;;FIXME: const FSRef * in RegisterComponentFileRefEntries
;;FIXME: ComponentInstance in CallComponentOpen
;;FIXME: ComponentInstance in CallComponentClose
;;FIXME: ComponentInstance in CallComponentCanDo
;;FIXME: ComponentInstance in CallComponentVersion
;;FIXME: ComponentInstance in CallComponentRegister
;;FIXME: ComponentInstance in CallComponentTarget
;;FIXME: ComponentInstance in CallComponentUnregister
;;FIXME: ComponentInstance in CallComponentGetMPWorkFunction
;;FIXME: ComponentInstance in CallComponentGetPublicResource
;;FIXME: ComponentParameters * in CallComponentDispatch
;;FIXME: ComponentMPWorkFunctionUPP in NewComponentMPWorkFunctionUPP
;;FIXME: ComponentRoutineUPP in NewComponentRoutineUPP
;;FIXME: GetMissingComponentResourceUPP in NewGetMissingComponentResourceUPP
;;FIXME: ComponentMPWorkFunctionUPP in DisposeComponentMPWorkFunctionUPP
;;FIXME: ComponentRoutineUPP in DisposeComponentRoutineUPP
;;FIXME: GetMissingComponentResourceUPP in DisposeGetMissingComponentResourceUPP
;;FIXME: void * in InvokeComponentMPWorkFunctionUPP
;;FIXME: ComponentParameters * in InvokeComponentRoutineUPP
;;FIXME: Component in InvokeGetMissingComponentResourceUPP
[:function MPProcessors [:unsigned-long]]
[:function MPProcessorsScheduled [:unsigned-long]]
;;FIXME: TaskProc in MPCreateTask
;;FIXME: MPTaskID in MPTerminateTask
;;FIXME: MPTaskID in MPSetTaskWeight
;;FIXME: MPTaskID in MPTaskIsPreemptive
[:function MPExit [:void :int]]
[:function MPYield [:void]]
;;FIXME: MPTaskID in MPCurrentTaskID
;;FIXME: MPTaskID in MPSetTaskType
;;FIXME: TaskStorageIndex * in MPAllocateTaskStorageIndex
[:function MPDeallocateTaskStorageIndex [:int :unsigned-long]]
;;FIXME: TaskStorageValue in MPSetTaskStorageValue
;;FIXME: TaskStorageValue in MPGetTaskStorageValue
;;FIXME: MPQueueID * in MPCreateQueue
;;FIXME: MPQueueID in MPDeleteQueue
;;FIXME: MPQueueID in MPNotifyQueue
;;FIXME: MPQueueID in MPWaitOnQueue
;;FIXME: MPQueueID in MPSetQueueReserve
;;FIXME: MPSemaphoreID * in MPCreateSemaphore
;;FIXME: MPSemaphoreID in MPDeleteSemaphore
;;FIXME: MPSemaphoreID in MPSignalSemaphore
;;FIXME: MPSemaphoreID in MPWaitOnSemaphore
;;FIXME: MPCriticalRegionID * in MPCreateCriticalRegion
;;FIXME: MPCriticalRegionID in MPDeleteCriticalRegion
;;FIXME: MPCriticalRegionID in MPEnterCriticalRegion
;;FIXME: MPCriticalRegionID in MPExitCriticalRegion
;;FIXME: MPEventID * in MPCreateEvent
;;FIXME: MPEventID in MPDeleteEvent
;;FIXME: MPEventID in MPSetEvent
;;FIXME: MPEventID in MPWaitForEvent
;;FIXME: MPNotificationID * in MPCreateNotification
;;FIXME: MPNotificationID in MPDeleteNotification
;;FIXME: MPNotificationID in MPModifyNotification
;;FIXME: MPNotificationID in MPModifyNotificationParameters
;;FIXME: MPNotificationID in MPCauseNotification
;;FIXME: AbsoluteTime * in MPDelayUntil
;;FIXME: MPTimerID * in MPCreateTimer
;;FIXME: MPTimerID in MPDeleteTimer
;;FIXME: MPTimerID in MPSetTimerNotify
;;FIXME: MPTimerID in MPArmTimer
;;FIXME: MPTimerID in MPCancelTimer
;;FIXME: LogicalAddress in MPAllocateAligned
;;FIXME: LogicalAddress in MPAllocate
;;FIXME: LogicalAddress in MPFree
;;FIXME: LogicalAddress in MPGetAllocatedBlockSize
;;FIXME: LogicalAddress in MPBlockCopy
;;FIXME: LogicalAddress in MPBlockClear
[:compound MPTaskInfoVersion2 "sizeof (MPTaskInfoVersion2)"]
[:compound MPTaskInfo "sizeof (MPTaskInfo)"]
;;FIXME: MPTaskID in MPSetExceptionHandler
;;FIXME: MPTaskID in MPDisposeTaskException
;;FIXME: MPTaskID in MPExtractTaskState
;;FIXME: MPTaskID in MPSetTaskState
;;FIXME: MPTaskID in MPThrowException
;;FIXME: MPQueueID in MPRegisterDebugger
;;FIXME: MPQueueID in MPUnregisterDebugger
;;FIXME: void * in MPRemoteCall
;;FIXME: void * in MPRemoteCallCFM
[:function _MPIsFullyInitialized [:unsigned-char]]
;;FIXME: const char ** in _MPLibraryVersion
[:function _MPLibraryIsCompatible [:unsigned-char :c-string-const :unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
[:compound AliasRecord "sizeof (AliasRecord)"]
[:compound FSAliasInfo "sizeof (FSAliasInfo)"]
;;FIXME: const FSRef * in FSNewAlias
;;FIXME: const FSRef * in FSNewAliasMinimal
;;FIXME: const FSRef * in FSIsAliasFile
;;FIXME: const FSRef * in FSResolveAliasWithMountFlags
;;FIXME: const FSRef * in FSResolveAlias
;;FIXME: FSRef * in FSResolveAliasFileWithMountFlags
;;FIXME: FSRef * in FSResolveAliasFile
;;FIXME: FSRef * in FSFollowFinderAlias
;;FIXME: const FSRef * in FSUpdateAlias
;;FIXME: const FSRef * in FSNewAliasUnicode
;;FIXME: const FSRef * in FSNewAliasMinimalUnicode
;;FIXME: AliasHandle * in FSNewAliasFromPath
;;FIXME: const FSRef * in FSMatchAliasBulk
;;FIXME: AliasHandle in FSCopyAliasInfo
;;FIXME: AliasHandle in GetAliasSize
;;FIXME: AliasHandle in GetAliasUserType
;;FIXME: AliasHandle in SetAliasUserType
;;FIXME: const AliasRecord * in GetAliasSizeFromPtr
;;FIXME: const AliasRecord * in GetAliasUserTypeFromPtr
;;FIXME: AliasPtr in SetAliasUserTypeWithPtr
[:compound LocaleAndVariant "sizeof (LocaleAndVariant)"]
;;FIXME: LocaleRef * in LocaleRefFromLangOrRegionCode
;;FIXME: const char [] in LocaleRefFromLocaleString
;;FIXME: LocaleRef in LocaleRefGetPartString
;;FIXME: const char [] in LocaleStringToLangAndRegionCodes
;;FIXME: ItemCount * in LocaleOperationCountLocales
;;FIXME: ItemCount * in LocaleOperationGetLocales
;;FIXME: LocaleRef in LocaleGetName
;;FIXME: LocaleRef in LocaleCountNames
;;FIXME: LocaleRef in LocaleGetIndName
;;FIXME: LocaleRef in LocaleOperationGetName
;;FIXME: ItemCount * in LocaleOperationCountNames
;;FIXME: UniCharCount * in LocaleOperationGetIndName
;;FIXME: void * in DebugAssert
[:function TaskLevel [:unsigned-int]]
;;FIXME: ConstStr255Param in NewDebugComponent
;;FIXME: ConstStr255Param in NewDebugOption
[:function DisposeDebugComponent [:int :unsigned-int]]
;;FIXME: OSType * in GetDebugComponentInfo
;;FIXME: SInt32 * in GetDebugOptionInfo
[:function SetDebugOptionValue [:int :unsigned-int :int :unsigned-char]]
;;FIXME: DebugAssertOutputHandlerUPP in InstallDebugAssertOutputHandler
[:function GetMacOSStatusErrorString [:c-string-const :int]]
[:function GetMacOSStatusCommentString [:c-string-const :int]]
;;FIXME: DebugComponentCallbackUPP in NewDebugComponentCallbackUPP
;;FIXME: DebugAssertOutputHandlerUPP in NewDebugAssertOutputHandlerUPP
;;FIXME: DebugComponentCallbackUPP in DisposeDebugComponentCallbackUPP
;;FIXME: DebugAssertOutputHandlerUPP in DisposeDebugAssertOutputHandlerUPP
;;FIXME: Boolean * in InvokeDebugComponentCallbackUPP
;;FIXME: void * in InvokeDebugAssertOutputHandlerUPP
;;FIXME: ConstStr255Param in PLstrcmp
;;FIXME: ConstStr255Param in PLstrncmp
;;FIXME: StringPtr in PLstrcpy
;;FIXME: StringPtr in PLstrncpy
;;FIXME: StringPtr in PLstrcat
;;FIXME: StringPtr in PLstrncat
;;FIXME: Ptr in PLstrchr
;;FIXME: Ptr in PLstrrchr
;;FIXME: Ptr in PLstrpbrk
;;FIXME: ConstStr255Param in PLstrspn
;;FIXME: Ptr in PLstrstr
;;FIXME: ConstStr255Param in PLstrlen
;;FIXME: ConstStr255Param in PLpos
;;FIXME: UInt32 * in CompareAndSwap
;;FIXME: UInt8 * in TestAndClear
;;FIXME: UInt8 * in TestAndSet
;;FIXME: SInt8 * in IncrementAtomic8
;;FIXME: SInt8 * in DecrementAtomic8
;;FIXME: SInt8 * in AddAtomic8
;;FIXME: UInt8 * in BitAndAtomic8
;;FIXME: UInt8 * in BitOrAtomic8
;;FIXME: UInt8 * in BitXorAtomic8
;;FIXME: SInt16 * in IncrementAtomic16
;;FIXME: SInt16 * in DecrementAtomic16
;;FIXME: SInt16 * in AddAtomic16
;;FIXME: UInt16 * in BitAndAtomic16
;;FIXME: UInt16 * in BitOrAtomic16
;;FIXME: UInt16 * in BitXorAtomic16
;;FIXME: SInt32 * in IncrementAtomic
;;FIXME: SInt32 * in DecrementAtomic
;;FIXME: SInt32 * in AddAtomic
;;FIXME: UInt32 * in BitAndAtomic
;;FIXME: UInt32 * in BitOrAtomic
;;FIXME: UInt32 * in BitXorAtomic
[:function _mm_empty [:void]]
;;FIXME: __m64 in _mm_cvtsi32_si64
;;FIXME: __m64 in _mm_cvtsi64_si32
;;FIXME: __m64 in _mm_cvtsi64_m64
;;FIXME: __m64 in _mm_cvtm64_si64
;;FIXME: __m64 in _mm_packs_pi16
;;FIXME: __m64 in _mm_packs_pi32
;;FIXME: __m64 in _mm_packs_pu16
;;FIXME: __m64 in _mm_unpackhi_pi8
;;FIXME: __m64 in _mm_unpackhi_pi16
;;FIXME: __m64 in _mm_unpackhi_pi32
;;FIXME: __m64 in _mm_unpacklo_pi8
;;FIXME: __m64 in _mm_unpacklo_pi16
;;FIXME: __m64 in _mm_unpacklo_pi32
;;FIXME: __m64 in _mm_add_pi8
;;FIXME: __m64 in _mm_add_pi16
;;FIXME: __m64 in _mm_add_pi32
;;FIXME: __m64 in _mm_adds_pi8
;;FIXME: __m64 in _mm_adds_pi16
;;FIXME: __m64 in _mm_adds_pu8
;;FIXME: __m64 in _mm_adds_pu16
;;FIXME: __m64 in _mm_sub_pi8
;;FIXME: __m64 in _mm_sub_pi16
;;FIXME: __m64 in _mm_sub_pi32
;;FIXME: __m64 in _mm_subs_pi8
;;FIXME: __m64 in _mm_subs_pi16
;;FIXME: __m64 in _mm_subs_pu8
;;FIXME: __m64 in _mm_subs_pu16
;;FIXME: __m64 in _mm_madd_pi16
;;FIXME: __m64 in _mm_mulhi_pi16
;;FIXME: __m64 in _mm_mullo_pi16
;;FIXME: __m64 in _mm_sll_pi16
;;FIXME: __m64 in _mm_slli_pi16
;;FIXME: __m64 in _mm_sll_pi32
;;FIXME: __m64 in _mm_slli_pi32
;;FIXME: __m64 in _mm_sll_si64
;;FIXME: __m64 in _mm_slli_si64
;;FIXME: __m64 in _mm_sra_pi16
;;FIXME: __m64 in _mm_srai_pi16
;;FIXME: __m64 in _mm_sra_pi32
;;FIXME: __m64 in _mm_srai_pi32
;;FIXME: __m64 in _mm_srl_pi16
;;FIXME: __m64 in _mm_srli_pi16
;;FIXME: __m64 in _mm_srl_pi32
;;FIXME: __m64 in _mm_srli_pi32
;;FIXME: __m64 in _mm_srl_si64
;;FIXME: __m64 in _mm_srli_si64
;;FIXME: __m64 in _mm_and_si64
;;FIXME: __m64 in _mm_andnot_si64
;;FIXME: __m64 in _mm_or_si64
;;FIXME: __m64 in _mm_xor_si64
;;FIXME: __m64 in _mm_cmpeq_pi8
;;FIXME: __m64 in _mm_cmpeq_pi16
;;FIXME: __m64 in _mm_cmpeq_pi32
;;FIXME: __m64 in _mm_cmpgt_pi8
;;FIXME: __m64 in _mm_cmpgt_pi16
;;FIXME: __m64 in _mm_cmpgt_pi32
;;FIXME: __m64 in _mm_setzero_si64
;;FIXME: __m64 in _mm_set_pi32
;;FIXME: __m64 in _mm_set_pi16
;;FIXME: __m64 in _mm_set_pi8
;;FIXME: __m64 in _mm_set1_pi32
;;FIXME: __m64 in _mm_set1_pi16
;;FIXME: __m64 in _mm_set1_pi8
;;FIXME: __m64 in _mm_setr_pi32
;;FIXME: __m64 in _mm_setr_pi16
;;FIXME: __m64 in _mm_setr_pi8
;;FIXME: void ** in posix_memalign
;;FIXME: void * in _mm_malloc
;;FIXME: void * in _mm_free
;;FIXME: __m128 in _mm_add_ss
;;FIXME: __m128 in _mm_add_ps
;;FIXME: __m128 in _mm_sub_ss
;;FIXME: __m128 in _mm_sub_ps
;;FIXME: __m128 in _mm_mul_ss
;;FIXME: __m128 in _mm_mul_ps
;;FIXME: __m128 in _mm_div_ss
;;FIXME: __m128 in _mm_div_ps
;;FIXME: __m128 in _mm_sqrt_ss
;;FIXME: __m128 in _mm_sqrt_ps
;;FIXME: __m128 in _mm_rcp_ss
;;FIXME: __m128 in _mm_rcp_ps
;;FIXME: __m128 in _mm_rsqrt_ss
;;FIXME: __m128 in _mm_rsqrt_ps
;;FIXME: __m128 in _mm_min_ss
;;FIXME: __m128 in _mm_min_ps
;;FIXME: __m128 in _mm_max_ss
;;FIXME: __m128 in _mm_max_ps
;;FIXME: __m128 in _mm_and_ps
;;FIXME: __m128 in _mm_andnot_ps
;;FIXME: __m128 in _mm_or_ps
;;FIXME: __m128 in _mm_xor_ps
;;FIXME: __m128 in _mm_cmpeq_ss
;;FIXME: __m128 in _mm_cmpeq_ps
;;FIXME: __m128 in _mm_cmplt_ss
;;FIXME: __m128 in _mm_cmplt_ps
;;FIXME: __m128 in _mm_cmple_ss
;;FIXME: __m128 in _mm_cmple_ps
;;FIXME: __m128 in _mm_cmpgt_ss
;;FIXME: __m128 in _mm_cmpgt_ps
;;FIXME: __m128 in _mm_cmpge_ss
;;FIXME: __m128 in _mm_cmpge_ps
;;FIXME: __m128 in _mm_cmpneq_ss
;;FIXME: __m128 in _mm_cmpneq_ps
;;FIXME: __m128 in _mm_cmpnlt_ss
;;FIXME: __m128 in _mm_cmpnlt_ps
;;FIXME: __m128 in _mm_cmpnle_ss
;;FIXME: __m128 in _mm_cmpnle_ps
;;FIXME: __m128 in _mm_cmpngt_ss
;;FIXME: __m128 in _mm_cmpngt_ps
;;FIXME: __m128 in _mm_cmpnge_ss
;;FIXME: __m128 in _mm_cmpnge_ps
;;FIXME: __m128 in _mm_cmpord_ss
;;FIXME: __m128 in _mm_cmpord_ps
;;FIXME: __m128 in _mm_cmpunord_ss
;;FIXME: __m128 in _mm_cmpunord_ps
;;FIXME: __m128 in _mm_comieq_ss
;;FIXME: __m128 in _mm_comilt_ss
;;FIXME: __m128 in _mm_comile_ss
;;FIXME: __m128 in _mm_comigt_ss
;;FIXME: __m128 in _mm_comige_ss
;;FIXME: __m128 in _mm_comineq_ss
;;FIXME: __m128 in _mm_ucomieq_ss
;;FIXME: __m128 in _mm_ucomilt_ss
;;FIXME: __m128 in _mm_ucomile_ss
;;FIXME: __m128 in _mm_ucomigt_ss
;;FIXME: __m128 in _mm_ucomige_ss
;;FIXME: __m128 in _mm_ucomineq_ss
;;FIXME: __m128 in _mm_cvtss_si32
;;FIXME: __m128 in _mm_cvt_ss2si
;;FIXME: __m128 in _mm_cvtss_si64
;;FIXME: __m64 in _mm_cvtps_pi32
;;FIXME: __m64 in _mm_cvt_ps2pi
;;FIXME: __m128 in _mm_cvttss_si32
;;FIXME: __m128 in _mm_cvtt_ss2si
;;FIXME: __m128 in _mm_cvttss_si64
;;FIXME: __m64 in _mm_cvttps_pi32
;;FIXME: __m64 in _mm_cvtt_ps2pi
;;FIXME: __m128 in _mm_cvtsi32_ss
;;FIXME: __m128 in _mm_cvt_si2ss
;;FIXME: __m128 in _mm_cvtsi64_ss
;;FIXME: __m128 in _mm_cvtpi32_ps
;;FIXME: __m128 in _mm_cvt_pi2ps
;;FIXME: __m128 in _mm_cvtss_f32
;;FIXME: __m128 in _mm_loadh_pi
;;FIXME: __m128 in _mm_loadl_pi
;;FIXME: __m128 in _mm_load_ss
;;FIXME: __m128 in _mm_load1_ps
;;FIXME: __m128 in _mm_load_ps
;;FIXME: __m128 in _mm_loadu_ps
;;FIXME: __m128 in _mm_loadr_ps
;;FIXME: __m128 in _mm_set_ss
;;FIXME: __m128 in _mm_set1_ps
;;FIXME: __m128 in _mm_set_ps1
;;FIXME: __m128 in _mm_set_ps
;;FIXME: __m128 in _mm_setr_ps
;;FIXME: __m128 in _mm_setzero_ps
;;FIXME: __m64 * in _mm_storeh_pi
;;FIXME: __m64 * in _mm_storel_pi
;;FIXME: float * in _mm_store_ss
;;FIXME: float * in _mm_storeu_ps
;;FIXME: float * in _mm_store1_ps
;;FIXME: float * in _mm_store_ps1
;;FIXME: float * in _mm_store_ps
;;FIXME: float * in _mm_storer_ps
;;FIXME: __m64 * in _mm_stream_pi
;;FIXME: float * in _mm_stream_ps
[:function _mm_sfence [:void]]
;;FIXME: __m64 in _mm_extract_pi16
;;FIXME: __m64 in _mm_insert_pi16
;;FIXME: __m64 in _mm_max_pi16
;;FIXME: __m64 in _mm_max_pu8
;;FIXME: __m64 in _mm_min_pi16
;;FIXME: __m64 in _mm_min_pu8
;;FIXME: __m64 in _mm_movemask_pi8
;;FIXME: __m64 in _mm_mulhi_pu16
;;FIXME: __m64 in _mm_maskmove_si64
;;FIXME: __m64 in _mm_avg_pu8
;;FIXME: __m64 in _mm_avg_pu16
;;FIXME: __m64 in _mm_sad_pu8
[:function _mm_getcsr [:unsigned-int]]
[:function _mm_setcsr [:void :unsigned-int]]
;;FIXME: __m128 in _mm_unpackhi_ps
;;FIXME: __m128 in _mm_unpacklo_ps
;;FIXME: __m128 in _mm_move_ss
;;FIXME: __m128 in _mm_movehl_ps
;;FIXME: __m128 in _mm_movelh_ps
;;FIXME: __m128 in _mm_cvtpi16_ps
;;FIXME: __m128 in _mm_cvtpu16_ps
;;FIXME: __m128 in _mm_cvtpi8_ps
;;FIXME: __m128 in _mm_cvtpu8_ps
;;FIXME: __m128 in _mm_cvtpi32x2_ps
;;FIXME: __m64 in _mm_cvtps_pi16
;;FIXME: __m64 in _mm_cvtps_pi8
;;FIXME: __m128 in _mm_movemask_ps
;;FIXME: __m128d in _mm_add_sd
;;FIXME: __m128d in _mm_add_pd
;;FIXME: __m128d in _mm_sub_sd
;;FIXME: __m128d in _mm_sub_pd
;;FIXME: __m128d in _mm_mul_sd
;;FIXME: __m128d in _mm_mul_pd
;;FIXME: __m128d in _mm_div_sd
;;FIXME: __m128d in _mm_div_pd
;;FIXME: __m128d in _mm_sqrt_sd
;;FIXME: __m128d in _mm_sqrt_pd
;;FIXME: __m128d in _mm_min_sd
;;FIXME: __m128d in _mm_min_pd
;;FIXME: __m128d in _mm_max_sd
;;FIXME: __m128d in _mm_max_pd
;;FIXME: __m128d in _mm_and_pd
;;FIXME: __m128d in _mm_andnot_pd
;;FIXME: __m128d in _mm_or_pd
;;FIXME: __m128d in _mm_xor_pd
;;FIXME: __m128d in _mm_cmpeq_pd
;;FIXME: __m128d in _mm_cmplt_pd
;;FIXME: __m128d in _mm_cmple_pd
;;FIXME: __m128d in _mm_cmpgt_pd
;;FIXME: __m128d in _mm_cmpge_pd
;;FIXME: __m128d in _mm_cmpord_pd
;;FIXME: __m128d in _mm_cmpunord_pd
;;FIXME: __m128d in _mm_cmpneq_pd
;;FIXME: __m128d in _mm_cmpnlt_pd
;;FIXME: __m128d in _mm_cmpnle_pd
;;FIXME: __m128d in _mm_cmpngt_pd
;;FIXME: __m128d in _mm_cmpnge_pd
;;FIXME: __m128d in _mm_cmpeq_sd
;;FIXME: __m128d in _mm_cmplt_sd
;;FIXME: __m128d in _mm_cmple_sd
;;FIXME: __m128d in _mm_cmpgt_sd
;;FIXME: __m128d in _mm_cmpge_sd
;;FIXME: __m128d in _mm_cmpord_sd
;;FIXME: __m128d in _mm_cmpunord_sd
;;FIXME: __m128d in _mm_cmpneq_sd
;;FIXME: __m128d in _mm_cmpnlt_sd
;;FIXME: __m128d in _mm_cmpnle_sd
;;FIXME: __m128d in _mm_cmpngt_sd
;;FIXME: __m128d in _mm_cmpnge_sd
;;FIXME: __m128d in _mm_comieq_sd
;;FIXME: __m128d in _mm_comilt_sd
;;FIXME: __m128d in _mm_comile_sd
;;FIXME: __m128d in _mm_comigt_sd
;;FIXME: __m128d in _mm_comige_sd
;;FIXME: __m128d in _mm_comineq_sd
;;FIXME: __m128d in _mm_ucomieq_sd
;;FIXME: __m128d in _mm_ucomilt_sd
;;FIXME: __m128d in _mm_ucomile_sd
;;FIXME: __m128d in _mm_ucomigt_sd
;;FIXME: __m128d in _mm_ucomige_sd
;;FIXME: __m128d in _mm_ucomineq_sd
;;FIXME: __m128 in _mm_cvtpd_ps
;;FIXME: __m128d in _mm_cvtps_pd
;;FIXME: __m128d in _mm_cvtepi32_pd
;;FIXME: __m128i in _mm_cvtpd_epi32
;;FIXME: __m128d in _mm_cvtsd_si32
;;FIXME: __m128 in _mm_cvtsd_ss
;;FIXME: __m128d in _mm_cvtsi32_sd
;;FIXME: __m128d in _mm_cvtss_sd
;;FIXME: __m128i in _mm_cvttpd_epi32
;;FIXME: __m128d in _mm_cvttsd_si32
;;FIXME: __m64 in _mm_cvtpd_pi32
;;FIXME: __m64 in _mm_cvttpd_pi32
;;FIXME: __m128d in _mm_cvtpi32_pd
;;FIXME: __m128d in _mm_cvtsd_f64
;;FIXME: __m128d in _mm_load_pd
;;FIXME: __m128d in _mm_load1_pd
;;FIXME: __m128d in _mm_loadr_pd
;;FIXME: __m128d in _mm_loadu_pd
;;FIXME: __m128d in _mm_load_sd
;;FIXME: __m128d in _mm_loadh_pd
;;FIXME: __m128d in _mm_loadl_pd
;;FIXME: __m128d in _mm_set_sd
;;FIXME: __m128d in _mm_set1_pd
;;FIXME: __m128d in _mm_set_pd
;;FIXME: __m128d in _mm_setr_pd
;;FIXME: __m128d in _mm_setzero_pd
;;FIXME: __m128d in _mm_move_sd
;;FIXME: double * in _mm_store_sd
;;FIXME: double * in _mm_store1_pd
;;FIXME: double * in _mm_store_pd
;;FIXME: double * in _mm_storeu_pd
;;FIXME: double * in _mm_storer_pd
;;FIXME: double * in _mm_storeh_pd
;;FIXME: double * in _mm_storel_pd
;;FIXME: __m128i in _mm_add_epi8
;;FIXME: __m128i in _mm_add_epi16
;;FIXME: __m128i in _mm_add_epi32
;;FIXME: __m64 in _mm_add_si64
;;FIXME: __m128i in _mm_add_epi64
;;FIXME: __m128i in _mm_adds_epi8
;;FIXME: __m128i in _mm_adds_epi16
;;FIXME: __m128i in _mm_adds_epu8
;;FIXME: __m128i in _mm_adds_epu16
;;FIXME: __m128i in _mm_avg_epu8
;;FIXME: __m128i in _mm_avg_epu16
;;FIXME: __m128i in _mm_madd_epi16
;;FIXME: __m128i in _mm_max_epi16
;;FIXME: __m128i in _mm_max_epu8
;;FIXME: __m128i in _mm_min_epi16
;;FIXME: __m128i in _mm_min_epu8
;;FIXME: __m128i in _mm_mulhi_epi16
;;FIXME: __m128i in _mm_mulhi_epu16
;;FIXME: __m128i in _mm_mullo_epi16
;;FIXME: __m64 in _mm_mul_su32
;;FIXME: __m128i in _mm_mul_epu32
;;FIXME: __m128i in _mm_sad_epu8
;;FIXME: __m128i in _mm_sub_epi8
;;FIXME: __m128i in _mm_sub_epi16
;;FIXME: __m128i in _mm_sub_epi32
;;FIXME: __m64 in _mm_sub_si64
;;FIXME: __m128i in _mm_sub_epi64
;;FIXME: __m128i in _mm_subs_epi8
;;FIXME: __m128i in _mm_subs_epi16
;;FIXME: __m128i in _mm_subs_epu8
;;FIXME: __m128i in _mm_subs_epu16
;;FIXME: __m128i in _mm_and_si128
;;FIXME: __m128i in _mm_andnot_si128
;;FIXME: __m128i in _mm_or_si128
;;FIXME: __m128i in _mm_xor_si128
;;FIXME: __m128i in _mm_slli_epi16
;;FIXME: __m128i in _mm_sll_epi16
;;FIXME: __m128i in _mm_slli_epi32
;;FIXME: __m128i in _mm_sll_epi32
;;FIXME: __m128i in _mm_slli_epi64
;;FIXME: __m128i in _mm_sll_epi64
;;FIXME: __m128i in _mm_srai_epi16
;;FIXME: __m128i in _mm_sra_epi16
;;FIXME: __m128i in _mm_srai_epi32
;;FIXME: __m128i in _mm_sra_epi32
;;FIXME: __m128i in _mm_srli_epi16
;;FIXME: __m128i in _mm_srl_epi16
;;FIXME: __m128i in _mm_srli_epi32
;;FIXME: __m128i in _mm_srl_epi32
;;FIXME: __m128i in _mm_srli_epi64
;;FIXME: __m128i in _mm_srl_epi64
;;FIXME: __m128i in _mm_cmpeq_epi8
;;FIXME: __m128i in _mm_cmpeq_epi16
;;FIXME: __m128i in _mm_cmpeq_epi32
;;FIXME: __m128i in _mm_cmpgt_epi8
;;FIXME: __m128i in _mm_cmpgt_epi16
;;FIXME: __m128i in _mm_cmpgt_epi32
;;FIXME: __m128i in _mm_cmplt_epi8
;;FIXME: __m128i in _mm_cmplt_epi16
;;FIXME: __m128i in _mm_cmplt_epi32
;;FIXME: __m128d in _mm_cvtsi64_sd
;;FIXME: __m128d in _mm_cvtsd_si64
;;FIXME: __m128d in _mm_cvttsd_si64
;;FIXME: __m128 in _mm_cvtepi32_ps
;;FIXME: __m128i in _mm_cvtps_epi32
;;FIXME: __m128i in _mm_cvttps_epi32
;;FIXME: __m128i in _mm_cvtsi32_si128
;;FIXME: __m128i in _mm_cvtsi64_si128
;;FIXME: __m128i in _mm_cvtsi128_si32
;;FIXME: __m128i in _mm_cvtsi128_si64
;;FIXME: __m128i in _mm_load_si128
;;FIXME: __m128i in _mm_loadu_si128
;;FIXME: __m128i in _mm_loadl_epi64
;;FIXME: __m128i in _mm_set_epi64x
;;FIXME: __m128i in _mm_set_epi64
;;FIXME: __m128i in _mm_set_epi32
;;FIXME: __m128i in _mm_set_epi16
;;FIXME: __m128i in _mm_set_epi8
;;FIXME: __m128i in _mm_set1_epi64x
;;FIXME: __m128i in _mm_set1_epi64
;;FIXME: __m128i in _mm_set1_epi32
;;FIXME: __m128i in _mm_set1_epi16
;;FIXME: __m128i in _mm_set1_epi8
;;FIXME: __m128i in _mm_setr_epi64
;;FIXME: __m128i in _mm_setr_epi32
;;FIXME: __m128i in _mm_setr_epi16
;;FIXME: __m128i in _mm_setr_epi8
;;FIXME: __m128i in _mm_setzero_si128
;;FIXME: __m128i * in _mm_store_si128
;;FIXME: __m128i * in _mm_storeu_si128
;;FIXME: __m128i in _mm_maskmoveu_si128
;;FIXME: __m128i * in _mm_storel_epi64
;;FIXME: double * in _mm_stream_pd
;;FIXME: __m128i * in _mm_stream_si128
;;FIXME: int * in _mm_stream_si32
;;FIXME: const void * in _mm_clflush
[:function _mm_lfence [:void]]
[:function _mm_mfence [:void]]
;;FIXME: __m128i in _mm_packs_epi16
;;FIXME: __m128i in _mm_packs_epi32
;;FIXME: __m128i in _mm_packus_epi16
;;FIXME: __m128i in _mm_extract_epi16
;;FIXME: __m128i in _mm_insert_epi16
;;FIXME: __m128i in _mm_movemask_epi8
;;FIXME: __m128i in _mm_unpackhi_epi8
;;FIXME: __m128i in _mm_unpackhi_epi16
;;FIXME: __m128i in _mm_unpackhi_epi32
;;FIXME: __m128i in _mm_unpackhi_epi64
;;FIXME: __m128i in _mm_unpacklo_epi8
;;FIXME: __m128i in _mm_unpacklo_epi16
;;FIXME: __m128i in _mm_unpacklo_epi32
;;FIXME: __m128i in _mm_unpacklo_epi64
;;FIXME: __m64 in _mm_movepi64_pi64
;;FIXME: __m128i in _mm_movpi64_pi64
;;FIXME: __m128i in _mm_move_epi64
;;FIXME: __m128d in _mm_unpackhi_pd
;;FIXME: __m128d in _mm_unpacklo_pd
;;FIXME: __m128d in _mm_movemask_pd
;;FIXME: __m128 in _mm_castpd_ps
;;FIXME: __m128i in _mm_castpd_si128
;;FIXME: __m128d in _mm_castps_pd
;;FIXME: __m128i in _mm_castps_si128
;;FIXME: __m128 in _mm_castsi128_ps
;;FIXME: __m128d in _mm_castsi128_pd
[:function _mm_pause [:void]]
[:compound MachineInformationPowerPC "sizeof (MachineInformationPowerPC)"]
[:compound RegisterInformationPowerPC "sizeof (RegisterInformationPowerPC)"]
[:compound FPUInformationPowerPC "sizeof (FPUInformationPowerPC)"]
[:compound Vector128 "sizeof (Vector128)"]
[:compound VectorInformationPowerPC "sizeof (VectorInformationPowerPC)"]
[:compound MemoryExceptionInformation "sizeof (MemoryExceptionInformation)"]
[:compound ExceptionInfo "sizeof (ExceptionInfo)"]
[:compound ExceptionInformationPowerPC "sizeof (ExceptionInformationPowerPC)"]
[:compound Vector128Intel "sizeof (Vector128Intel)"]
[:compound MachineInformationIntel64 "sizeof (MachineInformationIntel64)"]
[:compound RegisterInformationIntel64 "sizeof (RegisterInformationIntel64)"]
[:compound FPUInformationIntel64 "sizeof (FPUInformationIntel64)"]
[:compound VectorInformationIntel64 "sizeof (VectorInformationIntel64)"]
[:compound ExceptionInformation "sizeof (ExceptionInformation)"]
;;FIXME: ExceptionHandlerUPP in NewExceptionHandlerUPP
;;FIXME: ExceptionHandlerUPP in DisposeExceptionHandlerUPP
;;FIXME: ExceptionInformation * in InvokeExceptionHandlerUPP
;;FIXME: ExceptionHandlerTPP in InstallExceptionHandler
;;FIXME: AbsoluteTime in UpTime
;;FIXME: Nanoseconds in AbsoluteToNanoseconds
;;FIXME: AbsoluteTime in AbsoluteToDuration
;;FIXME: AbsoluteTime in NanosecondsToAbsolute
;;FIXME: AbsoluteTime in DurationToAbsolute
;;FIXME: AbsoluteTime in AddAbsoluteToAbsolute
;;FIXME: AbsoluteTime in SubAbsoluteFromAbsolute
;;FIXME: AbsoluteTime in AddNanosecondsToAbsolute
;;FIXME: AbsoluteTime in AddDurationToAbsolute
;;FIXME: AbsoluteTime in SubNanosecondsFromAbsolute
;;FIXME: AbsoluteTime in SubDurationFromAbsolute
;;FIXME: Nanoseconds in AbsoluteDeltaToNanoseconds
;;FIXME: AbsoluteTime in AbsoluteDeltaToDuration
;;FIXME: Nanoseconds in DurationToNanoseconds
;;FIXME: Nanoseconds in NanosecondsToDuration
[:compound NumFormatString "sizeof (NumFormatString)"]
[:compound FVector "sizeof (FVector)"]
;;FIXME: char * in numtostring
;;FIXME: Handle in Munger
;;FIXME: const void * in BitTst
;;FIXME: void * in BitSet
;;FIXME: void * in BitClr
[:function BitAnd [:long :long :long]]
[:function BitOr [:long :long :long]]
[:function BitXor [:long :long :long]]
[:function BitNot [:long :long]]
[:function BitShift [:long :long :short]]
[:compound UCKeyStateRecord "sizeof (UCKeyStateRecord)"]
[:compound UCKeyStateEntryTerminal "sizeof (UCKeyStateEntryTerminal)"]
[:compound UCKeyStateEntryRange "sizeof (UCKeyStateEntryRange)"]
[:compound UCKeyboardTypeHeader "sizeof (UCKeyboardTypeHeader)"]
[:compound UCKeyboardLayout "sizeof (UCKeyboardLayout)"]
[:compound UCKeyLayoutFeatureInfo "sizeof (UCKeyLayoutFeatureInfo)"]
[:compound UCKeyModifiersToTableNum "sizeof (UCKeyModifiersToTableNum)"]
[:compound UCKeyToCharTableIndex "sizeof (UCKeyToCharTableIndex)"]
[:compound UCKeyStateRecordsIndex "sizeof (UCKeyStateRecordsIndex)"]
[:compound UCKeyStateTerminators "sizeof (UCKeyStateTerminators)"]
[:compound UCKeySequenceDataIndex "sizeof (UCKeySequenceDataIndex)"]
;;FIXME: IndexToUCStringUPP in NewIndexToUCStringUPP
;;FIXME: IndexToUCStringUPP in DisposeIndexToUCStringUPP
;;FIXME: void * in InvokeIndexToUCStringUPP
;;FIXME: const UCKeyboardLayout * in UCKeyTranslate
;;FIXME: LocaleRef in UCCreateCollator
;;FIXME: CollatorRef in UCGetCollationKey
;;FIXME: const UCCollationValue * in UCCompareCollationKeys
;;FIXME: CollatorRef in UCCompareText
;;FIXME: CollatorRef * in UCDisposeCollator
;;FIXME: const UniChar * in UCCompareTextDefault
;;FIXME: const UniChar * in UCCompareTextNoLocale
;;FIXME: LocaleRef in UCCreateTextBreakLocator
;;FIXME: TextBreakLocatorRef in UCFindTextBreak
;;FIXME: TextBreakLocatorRef * in UCDisposeTextBreakLocator
;;FIXME: LocaleRef in UCTypeSelectCreateSelector
;;FIXME: UCTypeSelectRef in UCTypeSelectFlushSelectorData
;;FIXME: UCTypeSelectRef * in UCTypeSelectReleaseSelector
;;FIXME: UCTypeSelectRef in UCTypeSelectWouldResetBuffer
;;FIXME: UCTypeSelectRef in UCTypeSelectAddKeyToSelector
;;FIXME: UCTypeSelectRef in UCTypeSelectCompare
;;FIXME: UCTypeSelectRef in UCTypeSelectFindItem
;;FIXME: UCTypeSelectRef in UCTypeSelectWalkList
[:function compound [:double :double :double]]
[:function annuity [:double :double :double]]
;;FIXME: double_t * in randomx
[:function relation [:short :double :double]]
[:compound decimal "sizeof (decimal)"]
[:compound decform "sizeof (decform)"]
;;FIXME: const decform * in num2dec
;;FIXME: const decimal * in dec2num
;;FIXME: const decform * in dec2str
;;FIXME: short * in str2dec
;;FIXME: const decimal * in dec2f
;;FIXME: const decimal * in dec2s
;;FIXME: const decimal * in dec2l
[:function relationl [:short :long-double :long-double]]
;;FIXME: const decform * in num2decl
;;FIXME: const decimal * in dec2numl
;;FIXME: const extended80 * in x80tod
;;FIXME: const double * in dtox80
;;FIXME: const extended80 * in x80told
;;FIXME: const long double * in ldtox80
[:compound fenv_t "sizeof (fenv_t)"]
[:function feclearexcept [:int :int]]
;;FIXME: fexcept_t * in fegetexceptflag
[:function feraiseexcept [:int :int]]
;;FIXME: const fexcept_t * in fesetexceptflag
[:function fetestexcept [:int :int]]
[:function fegetround [:int]]
[:function fesetround [:int :int]]
;;FIXME: fenv_t * in fegetenv
;;FIXME: fenv_t * in feholdexcept
;;FIXME: const fenv_t * in fesetenv
;;FIXME: const fenv_t * in feupdateenv
[:compound TECConversionInfo "sizeof (TECConversionInfo)"]
;;FIXME: ItemCount * in TECCountAvailableTextEncodings
;;FIXME: TextEncoding [] in TECGetAvailableTextEncodings
;;FIXME: ItemCount * in TECCountDirectTextEncodingConversions
;;FIXME: TECConversionInfo [] in TECGetDirectTextEncodingConversions
;;FIXME: ItemCount * in TECCountDestinationTextEncodings
;;FIXME: TextEncoding [] in TECGetDestinationTextEncodings
;;FIXME: Str255 in TECGetTextEncodingInternetName
;;FIXME: TextEncoding * in TECGetTextEncodingFromInternetName
;;FIXME: TECObjectRef * in TECCreateConverter
;;FIXME: TECObjectRef * in TECCreateConverterFromPath
;;FIXME: TECObjectRef in TECDisposeConverter
;;FIXME: TECObjectRef in TECClearConverterContextInfo
;;FIXME: TECObjectRef in TECConvertText
;;FIXME: TECObjectRef in TECFlushText
;;FIXME: ItemCount * in TECCountSubTextEncodings
;;FIXME: TextEncoding [] in TECGetSubTextEncodings
;;FIXME: TECObjectRef in TECGetEncodingList
;;FIXME: TECObjectRef * in TECCreateOneToManyConverter
;;FIXME: TECObjectRef in TECConvertTextToMultipleEncodings
;;FIXME: TECObjectRef in TECFlushMultipleEncodings
;;FIXME: ItemCount * in TECCountWebTextEncodings
;;FIXME: TextEncoding [] in TECGetWebTextEncodings
;;FIXME: ItemCount * in TECCountMailTextEncodings
;;FIXME: TextEncoding [] in TECGetMailTextEncodings
;;FIXME: ItemCount * in TECCountAvailableSniffers
;;FIXME: TextEncoding [] in TECGetAvailableSniffers
;;FIXME: TECSnifferObjectRef * in TECCreateSniffer
;;FIXME: TECSnifferObjectRef in TECSniffTextEncoding
;;FIXME: TECSnifferObjectRef in TECDisposeSniffer
;;FIXME: TECSnifferObjectRef in TECClearSnifferContextInfo
;;FIXME: TECObjectRef in TECSetBasicOptions
;;FIXME: CFStringRef * in TECCopyTextEncodingInternetNameAndMIB
;;FIXME: TextEncoding * in TECGetTextEncodingFromInternetNameOrMIB
[:compound UnicodeMapping "sizeof (UnicodeMapping)"]
;;FIXME: UnicodeToTextFallbackUPP in NewUnicodeToTextFallbackUPP
;;FIXME: UnicodeToTextFallbackUPP in DisposeUnicodeToTextFallbackUPP
;;FIXME: UniChar * in InvokeUnicodeToTextFallbackUPP
;;FIXME: ConstUnicodeMappingPtr in CreateTextToUnicodeInfo
;;FIXME: TextToUnicodeInfo * in CreateTextToUnicodeInfoByEncoding
;;FIXME: ConstUnicodeMappingPtr in CreateUnicodeToTextInfo
;;FIXME: UnicodeToTextInfo * in CreateUnicodeToTextInfoByEncoding
;;FIXME: const UnicodeMapping [] in CreateUnicodeToTextRunInfo
;;FIXME: const TextEncoding [] in CreateUnicodeToTextRunInfoByEncoding
;;FIXME: const ScriptCode [] in CreateUnicodeToTextRunInfoByScriptCode
;;FIXME: TextToUnicodeInfo in ChangeTextToUnicodeInfo
;;FIXME: UnicodeToTextInfo in ChangeUnicodeToTextInfo
;;FIXME: TextToUnicodeInfo * in DisposeTextToUnicodeInfo
;;FIXME: UnicodeToTextInfo * in DisposeUnicodeToTextInfo
;;FIXME: UnicodeToTextRunInfo * in DisposeUnicodeToTextRunInfo
;;FIXME: TextToUnicodeInfo in ConvertFromTextToUnicode
;;FIXME: UnicodeToTextInfo in ConvertFromUnicodeToText
;;FIXME: UnicodeToTextRunInfo in ConvertFromUnicodeToTextRun
;;FIXME: UnicodeToTextRunInfo in ConvertFromUnicodeToScriptCodeRun
;;FIXME: ConstTextToUnicodeInfo in TruncateForTextToUnicode
;;FIXME: ConstUnicodeToTextInfo in TruncateForUnicodeToText
;;FIXME: TextToUnicodeInfo in ConvertFromPStringToUnicode
;;FIXME: UnicodeToTextInfo in ConvertFromUnicodeToPString
;;FIXME: ConstUnicodeMappingPtr in CountUnicodeMappings
;;FIXME: ConstUnicodeMappingPtr in QueryUnicodeMappings
;;FIXME: UnicodeToTextInfo in SetFallbackUnicodeToText
;;FIXME: UnicodeToTextRunInfo in SetFallbackUnicodeToTextRun
;;FIXME: TextToUnicodeInfo in ResetTextToUnicodeInfo
;;FIXME: UnicodeToTextInfo in ResetUnicodeToTextInfo
;;FIXME: UnicodeToTextRunInfo in ResetUnicodeToTextRunInfo
[:compound SchedulerInfoRec "sizeof (SchedulerInfoRec)"]
;;FIXME: ThreadEntryUPP in NewThreadEntryUPP
;;FIXME: ThreadSchedulerUPP in NewThreadSchedulerUPP
;;FIXME: ThreadSwitchUPP in NewThreadSwitchUPP
;;FIXME: ThreadTerminationUPP in NewThreadTerminationUPP
;;FIXME: DebuggerNewThreadUPP in NewDebuggerNewThreadUPP
;;FIXME: DebuggerDisposeThreadUPP in NewDebuggerDisposeThreadUPP
;;FIXME: DebuggerThreadSchedulerUPP in NewDebuggerThreadSchedulerUPP
;;FIXME: ThreadEntryUPP in DisposeThreadEntryUPP
;;FIXME: ThreadSchedulerUPP in DisposeThreadSchedulerUPP
;;FIXME: ThreadSwitchUPP in DisposeThreadSwitchUPP
;;FIXME: ThreadTerminationUPP in DisposeThreadTerminationUPP
;;FIXME: DebuggerNewThreadUPP in DisposeDebuggerNewThreadUPP
;;FIXME: DebuggerDisposeThreadUPP in DisposeDebuggerDisposeThreadUPP
;;FIXME: DebuggerThreadSchedulerUPP in DisposeDebuggerThreadSchedulerUPP
;;FIXME: voidPtr in InvokeThreadEntryUPP
;;FIXME: SchedulerInfoRecPtr in InvokeThreadSchedulerUPP
;;FIXME: void * in InvokeThreadSwitchUPP
;;FIXME: void * in InvokeThreadTerminationUPP
;;FIXME: DebuggerNewThreadUPP in InvokeDebuggerNewThreadUPP
;;FIXME: DebuggerDisposeThreadUPP in InvokeDebuggerDisposeThreadUPP
;;FIXME: SchedulerInfoRecPtr in InvokeDebuggerThreadSchedulerUPP
;;FIXME: ThreadEntryTPP in NewThread
;;FIXME: ThreadSchedulerTPP in SetThreadScheduler
;;FIXME: ThreadSwitchTPP in SetThreadSwitcher
;;FIXME: ThreadTerminationTPP in SetThreadTerminator
;;FIXME: DebuggerNewThreadTPP in SetDebuggerNotificationProcs
[:function CreateThreadPool [:short :unsigned-int :short :long]]
;;FIXME: Size * in GetDefaultThreadStackSize
;;FIXME: ByteCount * in ThreadCurrentStackSpace
;;FIXME: void * in DisposeThread
[:function YieldToThread [:short :unsigned-long]]
[:function YieldToAnyThread [:short]]
;;FIXME: ThreadID * in GetCurrentThread
;;FIXME: ThreadState * in GetThreadState
[:function SetThreadState [:short :unsigned-long :unsigned-short :unsigned-long]]
[:function SetThreadStateEndCritical [:short :unsigned-long :unsigned-short :unsigned-long]]
[:function ThreadBeginCritical [:short]]
[:function ThreadEndCritical [:short]]
;;FIXME: ThreadTaskRef * in GetThreadCurrentTaskRef
;;FIXME: ThreadTaskRef in GetThreadStateGivenTaskRef
;;FIXME: ThreadTaskRef in SetThreadReadyGivenTaskRef
;;FIXME: FSVolumeRefNum * in FindFolder
[:function ReleaseFolder [:short :short :unsigned-int]]
;;FIXME: FSRef * in FSFindFolder
[:compound FolderDesc "sizeof (FolderDesc)"]
[:compound FolderRouting "sizeof (FolderRouting)"]
;;FIXME: ConstStrFileNameParam in AddFolderDescriptor
;;FIXME: UInt32 * in GetFolderTypes
[:function RemoveFolderDescriptor [:short :unsigned-int]]
;;FIXME: FSVolumeRefNum * in GetFolderNameUnicode
[:function InvalidateFolderDescriptorCache [:short :short :int]]
;;FIXME: FolderType * in IdentifyFolder
;;FIXME: const FSRef * in FSDetermineIfRefIsEnclosedByFolder
;;FIXME: const UInt8 * in DetermineIfPathIsEnclosedByFolder
;;FIXME: FolderManagerNotificationUPP in NewFolderManagerNotificationUPP
;;FIXME: FolderManagerNotificationUPP in DisposeFolderManagerNotificationUPP
;;FIXME: void * in InvokeFolderManagerNotificationUPP
;;FIXME: UnsignedWide * in Microseconds
[:compound TMTask "sizeof (TMTask)"]
;;FIXME: QElemPtr in InsTime
;;FIXME: QElemPtr in InsXTime
;;FIXME: QElemPtr in PrimeTime
;;FIXME: QElemPtr in RmvTime
;;FIXME: QElemPtr in InstallTimeTask
;;FIXME: QElemPtr in InstallXTimeTask
;;FIXME: QElemPtr in PrimeTimeTask
;;FIXME: QElemPtr in RemoveTimeTask
;;FIXME: TimerUPP in NewTimerUPP
;;FIXME: TimerUPP in DisposeTimerUPP
;;FIXME: TMTaskPtr in InvokeTimerUPP
;;FIXME: MPCoherenceID in MPGetNextCpuID
;;FIXME: MPProcessID in MPGetNextTaskID
[:compound MPQueueInfo "sizeof (MPQueueInfo)"]
[:compound MPSemaphoreInfo "sizeof (MPSemaphoreInfo)"]
[:compound MPEventInfo "sizeof (MPEventInfo)"]
[:compound MPCriticalRegionInfo "sizeof (MPCriticalRegionInfo)"]
[:compound MPNotificationInfo "sizeof (MPNotificationInfo)"]
[:compound MPAddressSpaceInfo "sizeof (MPAddressSpaceInfo)"]
[:function LMGetBootDrive [:short]]
[:function LMSetBootDrive [:void :short]]
[:function LMGetApFontID [:short]]
[:function LMSetApFontID [:void :short]]
[:function LMGetSysMap [:short]]
[:function LMSetSysMap [:void :short]]
[:function LMGetResLoad [:unsigned-char]]
[:function LMSetResLoad [:void :unsigned-char]]
[:function LMGetResErr [:short]]
[:function LMSetResErr [:void :short]]
[:function LMGetTmpResLoad [:unsigned-char]]
[:function LMSetTmpResLoad [:void :unsigned-char]]
;;FIXME: Ptr in LMGetIntlSpec
;;FIXME: Ptr in LMSetIntlSpec
[:function LMSetSysFontFam [:void :short]]
[:function LMGetSysFontSize [:short]]
[:function LMSetSysFontSize [:void :short]]
[:compound AVLTreeStruct "sizeof (AVLTreeStruct)"]
;;FIXME: AVLCompareItemsUPP in NewAVLCompareItemsUPP
;;FIXME: AVLItemSizeUPP in NewAVLItemSizeUPP
;;FIXME: AVLDisposeItemUPP in NewAVLDisposeItemUPP
;;FIXME: AVLWalkUPP in NewAVLWalkUPP
;;FIXME: AVLCompareItemsUPP in DisposeAVLCompareItemsUPP
;;FIXME: AVLItemSizeUPP in DisposeAVLItemSizeUPP
;;FIXME: AVLDisposeItemUPP in DisposeAVLDisposeItemUPP
;;FIXME: AVLWalkUPP in DisposeAVLWalkUPP
;;FIXME: AVLTreePtr in InvokeAVLCompareItemsUPP
;;FIXME: AVLTreePtr in InvokeAVLItemSizeUPP
;;FIXME: AVLTreePtr in InvokeAVLDisposeItemUPP
;;FIXME: AVLTreePtr in InvokeAVLWalkUPP
[:compound PEFContainerHeader "sizeof (PEFContainerHeader)"]
[:compound PEFSectionHeader "sizeof (PEFSectionHeader)"]
[:compound PEFLoaderInfoHeader "sizeof (PEFLoaderInfoHeader)"]
[:compound PEFImportedLibrary "sizeof (PEFImportedLibrary)"]
[:compound PEFImportedSymbol "sizeof (PEFImportedSymbol)"]
[:compound PEFExportedSymbolHashSlot "sizeof (PEFExportedSymbolHashSlot)"]
[:compound PEFSplitHashWord "sizeof (PEFSplitHashWord)"]
[:compound PEFExportedSymbolKey "sizeof (PEFExportedSymbolKey)"]
[:compound PEFExportedSymbol "sizeof (PEFExportedSymbol)"]
[:compound PEFLoaderRelocationHeader "sizeof (PEFLoaderRelocationHeader)"]
[:compound XLibContainerHeader "sizeof (XLibContainerHeader)"]
[:compound XLibExportedSymbol "sizeof (XLibExportedSymbol)"]
[:compound HFSExtentKey "sizeof (HFSExtentKey)"]
[:compound HFSPlusExtentKey "sizeof (HFSPlusExtentKey)"]
[:compound HFSExtentDescriptor "sizeof (HFSExtentDescriptor)"]
[:compound HFSPlusExtentDescriptor "sizeof (HFSPlusExtentDescriptor)"]
[:compound FndrFileInfo "sizeof (FndrFileInfo)"]
[:compound FndrDirInfo "sizeof (FndrDirInfo)"]
[:compound FndrOpaqueInfo "sizeof (FndrOpaqueInfo)"]
[:compound HFSPlusForkData "sizeof (HFSPlusForkData)"]
[:compound HFSPlusBSDInfo "sizeof (HFSPlusBSDInfo)"]
[:compound HFSCatalogKey "sizeof (HFSCatalogKey)"]
[:compound HFSPlusCatalogKey "sizeof (HFSPlusCatalogKey)"]
[:compound HFSCatalogFolder "sizeof (HFSCatalogFolder)"]
[:compound HFSPlusCatalogFolder "sizeof (HFSPlusCatalogFolder)"]
[:compound HFSCatalogFile "sizeof (HFSCatalogFile)"]
[:compound HFSPlusCatalogFile "sizeof (HFSPlusCatalogFile)"]
[:compound HFSCatalogThread "sizeof (HFSCatalogThread)"]
[:compound HFSPlusCatalogThread "sizeof (HFSPlusCatalogThread)"]
[:compound HFSPlusAttrForkData "sizeof (HFSPlusAttrForkData)"]
[:compound HFSPlusAttrExtents "sizeof (HFSPlusAttrExtents)"]
[:compound HFSPlusAttrData "sizeof (HFSPlusAttrData)"]
[:compound HFSPlusAttrInlineData "sizeof (HFSPlusAttrInlineData)"]
[:compound HFSPlusAttrRecord "sizeof (HFSPlusAttrRecord)"]
[:compound HFSPlusAttrKey "sizeof (HFSPlusAttrKey)"]
[:compound HFSMasterDirectoryBlock "sizeof (HFSMasterDirectoryBlock)"]
[:compound HFSPlusVolumeHeader "sizeof (HFSPlusVolumeHeader)"]
[:compound BTreeKey "sizeof (BTreeKey)"]
[:compound BTNodeDescriptor "sizeof (BTNodeDescriptor)"]
[:compound BTHeaderRec "sizeof (BTHeaderRec)"]
;;FIXME: uuid_t in uuid_clear
;;FIXME: const uuid_t in uuid_compare
;;FIXME: uuid_t in uuid_copy
;;FIXME: uuid_t in uuid_generate
;;FIXME: uuid_t in uuid_generate_random
;;FIXME: uuid_t in uuid_generate_time
;;FIXME: const uuid_t in uuid_is_null
;;FIXME: const uuid_string_t in uuid_parse
;;FIXME: const uuid_t in uuid_unparse
;;FIXME: const uuid_t in uuid_unparse_lower
;;FIXME: const uuid_t in uuid_unparse_upper
[:compound JournalInfoBlock "sizeof (JournalInfoBlock)"]
[:compound ChunkHeader "sizeof (ChunkHeader)"]
[:compound ContainerChunk "sizeof (ContainerChunk)"]
[:compound FormatVersionChunk "sizeof (FormatVersionChunk)"]
[:compound CommonChunk "sizeof (CommonChunk)"]
[:compound ExtCommonChunk "sizeof (ExtCommonChunk)"]
[:compound SoundDataChunk "sizeof (SoundDataChunk)"]
[:compound Marker "sizeof (Marker)"]
[:compound MarkerChunk "sizeof (MarkerChunk)"]
[:compound AIFFLoop "sizeof (AIFFLoop)"]
[:compound InstrumentChunk "sizeof (InstrumentChunk)"]
[:compound MIDIDataChunk "sizeof (MIDIDataChunk)"]
[:compound AudioRecordingChunk "sizeof (AudioRecordingChunk)"]
[:compound ApplicationSpecificChunk "sizeof (ApplicationSpecificChunk)"]
[:compound Comment "sizeof (Comment)"]
[:compound CommentsChunk "sizeof (CommentsChunk)"]
[:compound TextChunk "sizeof (TextChunk)"]
[:compound TextEncodingRec "sizeof (TextEncodingRec)"]
[:compound TECEncodingsListRec "sizeof (TECEncodingsListRec)"]
[:compound TECSubTextEncodingRec "sizeof (TECSubTextEncodingRec)"]
[:compound TECSubTextEncodingsRec "sizeof (TECSubTextEncodingsRec)"]
[:compound TECEncodingPairRec "sizeof (TECEncodingPairRec)"]
[:compound TECEncodingPairs "sizeof (TECEncodingPairs)"]
[:compound TECEncodingPairsRec "sizeof (TECEncodingPairsRec)"]
[:compound TECLocaleListToEncodingListRec "sizeof (TECLocaleListToEncodingListRec)"]
[:compound TECLocaleToEncodingsListRec "sizeof (TECLocaleToEncodingsListRec)"]
[:compound TECInternetNameRec "sizeof (TECInternetNameRec)"]
[:compound TECInternetNamesRec "sizeof (TECInternetNamesRec)"]
[:compound TECBufferContextRec "sizeof (TECBufferContextRec)"]
[:compound TECPluginStateRec "sizeof (TECPluginStateRec)"]
[:compound TECConverterContextRec "sizeof (TECConverterContextRec)"]
[:compound TECSnifferContextRec "sizeof (TECSnifferContextRec)"]
[:compound TECPluginDispatchTable "sizeof (TECPluginDispatchTable)"]
[:compound FSEventStreamContext "sizeof (FSEventStreamContext)"]
;;FIXME: FSEventStreamRef in FSEventStreamCreate
;;FIXME: FSEventStreamRef in FSEventStreamCreateRelativeToDevice
;;FIXME: ConstFSEventStreamRef in FSEventStreamGetLatestEventId
;;FIXME: ConstFSEventStreamRef in FSEventStreamGetDeviceBeingWatched
;;FIXME: CFArrayRef in FSEventStreamCopyPathsBeingWatched
[:function FSEventsGetCurrentEventId [:unsigned-long-long]]
;;FIXME: CFUUIDRef in FSEventsCopyUUIDForDevice
[:function FSEventsGetLastEventIdForDeviceBeforeTime [:unsigned-long-long :int :double]]
[:function FSEventsPurgeEventsForDeviceUpToEventId [:unsigned-char :int :unsigned-long-long]]
;;FIXME: FSEventStreamRef in FSEventStreamRetain
;;FIXME: FSEventStreamRef in FSEventStreamRelease
;;FIXME: FSEventStreamRef in FSEventStreamScheduleWithRunLoop
;;FIXME: FSEventStreamRef in FSEventStreamUnscheduleFromRunLoop
;;FIXME: FSEventStreamRef in FSEventStreamSetDispatchQueue
;;FIXME: FSEventStreamRef in FSEventStreamInvalidate
;;FIXME: FSEventStreamRef in FSEventStreamStart
;;FIXME: FSEventStreamRef in FSEventStreamFlushAsync
;;FIXME: FSEventStreamRef in FSEventStreamFlushSync
;;FIXME: FSEventStreamRef in FSEventStreamStop
;;FIXME: ConstFSEventStreamRef in FSEventStreamShow
;;FIXME: CFStringRef in FSEventStreamCopyDescription
[:compound AEDesc "sizeof (AEDesc)"]
[:compound AEKeyDesc "sizeof (AEKeyDesc)"]
[:compound AEArrayData "sizeof (AEArrayData)"]
;;FIXME: AECoerceDescUPP in NewAECoerceDescUPP
;;FIXME: AECoercePtrUPP in NewAECoercePtrUPP
;;FIXME: AECoerceDescUPP in DisposeAECoerceDescUPP
;;FIXME: AECoercePtrUPP in DisposeAECoercePtrUPP
;;FIXME: const AEDesc * in InvokeAECoerceDescUPP
;;FIXME: const void * in InvokeAECoercePtrUPP
;;FIXME: AECoercionHandlerUPP in AEInstallCoercionHandler
;;FIXME: AECoercionHandlerUPP in AERemoveCoercionHandler
;;FIXME: AECoercionHandlerUPP * in AEGetCoercionHandler
;;FIXME: const void * in AECoercePtr
;;FIXME: const AEDesc * in AECoerceDesc
;;FIXME: AEDesc * in AEInitializeDesc
;;FIXME: const void * in AECreateDesc
;;FIXME: AEDesc * in AEDisposeDesc
;;FIXME: const AEDesc * in AEDuplicateDesc
;;FIXME: const void * in AECreateDescFromExternalPtr
;;FIXME: const AEDesc * in AECompareDesc
;;FIXME: const void * in AECreateList
;;FIXME: const AEDescList * in AECountItems
;;FIXME: AEDescList * in AEPutPtr
;;FIXME: AEDescList * in AEPutDesc
;;FIXME: const AEDescList * in AEGetNthPtr
;;FIXME: const AEDescList * in AEGetNthDesc
;;FIXME: const AEDescList * in AESizeOfNthItem
;;FIXME: const AEDescList * in AEGetArray
;;FIXME: AEDescList * in AEPutArray
;;FIXME: AEDescList * in AEDeleteItem
;;FIXME: const AEDesc * in AECheckIsRecord
;;FIXME: const AEAddressDesc * in AECreateAppleEvent
;;FIXME: AppleEvent * in AEPutParamPtr
;;FIXME: AppleEvent * in AEPutParamDesc
;;FIXME: const AppleEvent * in AEGetParamPtr
;;FIXME: const AppleEvent * in AEGetParamDesc
;;FIXME: const AppleEvent * in AESizeOfParam
;;FIXME: AppleEvent * in AEDeleteParam
;;FIXME: const AppleEvent * in AEGetAttributePtr
;;FIXME: const AppleEvent * in AEGetAttributeDesc
;;FIXME: const AppleEvent * in AESizeOfAttribute
;;FIXME: AppleEvent * in AEPutAttributePtr
;;FIXME: AppleEvent * in AEPutAttributeDesc
;;FIXME: const AEDesc * in AESizeOfFlattenedDesc
;;FIXME: const AEDesc * in AEFlattenDesc
;;FIXME: const void * in AEUnflattenDesc
;;FIXME: const AEDesc * in AEGetDescData
;;FIXME: const AEDesc * in AEGetDescDataSize
;;FIXME: const void * in AEReplaceDescData
;;FIXME: const AEDesc * in AEGetDescDataRange
;;FIXME: AEDisposeExternalUPP in NewAEDisposeExternalUPP
;;FIXME: AEEventHandlerUPP in NewAEEventHandlerUPP
;;FIXME: AEDisposeExternalUPP in DisposeAEDisposeExternalUPP
;;FIXME: AEEventHandlerUPP in DisposeAEEventHandlerUPP
;;FIXME: const void * in InvokeAEDisposeExternalUPP
;;FIXME: const AppleEvent * in InvokeAEEventHandlerUPP
;;FIXME: AEEventHandlerUPP in AEInstallEventHandler
;;FIXME: AEEventHandlerUPP in AERemoveEventHandler
;;FIXME: AEEventHandlerUPP * in AEGetEventHandler
;;FIXME: AEEventHandlerUPP in AEInstallSpecialHandler
;;FIXME: AEEventHandlerUPP in AERemoveSpecialHandler
;;FIXME: AEEventHandlerUPP * in AEGetSpecialHandler
;;FIXME: long * in AEManagerInfo
[:compound AERemoteProcessResolverContext "sizeof (AERemoteProcessResolverContext)"]
;;FIXME: AERemoteProcessResolverRef in AECreateRemoteProcessResolver
;;FIXME: AERemoteProcessResolverRef in AEDisposeRemoteProcessResolver
;;FIXME: CFArrayRef in AERemoteProcessResolverGetProcesses
;;FIXME: AERemoteProcessResolverRef in AERemoteProcessResolverScheduleWithRunLoop
;;FIXME: AEDesc * in CreateOffsetDescriptor
;;FIXME: AEDesc * in CreateCompDescriptor
;;FIXME: AEDescList * in CreateLogicalDescriptor
;;FIXME: AEDesc * in CreateObjSpecifier
;;FIXME: AEDesc * in CreateRangeDescriptor
[:compound ccntTokenRecord "sizeof (ccntTokenRecord)"]
;;FIXME: OSLAccessorUPP in NewOSLAccessorUPP
;;FIXME: OSLCompareUPP in NewOSLCompareUPP
;;FIXME: OSLCountUPP in NewOSLCountUPP
;;FIXME: OSLDisposeTokenUPP in NewOSLDisposeTokenUPP
;;FIXME: OSLGetMarkTokenUPP in NewOSLGetMarkTokenUPP
;;FIXME: OSLGetErrDescUPP in NewOSLGetErrDescUPP
;;FIXME: OSLMarkUPP in NewOSLMarkUPP
;;FIXME: OSLAdjustMarksUPP in NewOSLAdjustMarksUPP
;;FIXME: OSLAccessorUPP in DisposeOSLAccessorUPP
;;FIXME: OSLCompareUPP in DisposeOSLCompareUPP
;;FIXME: OSLCountUPP in DisposeOSLCountUPP
;;FIXME: OSLDisposeTokenUPP in DisposeOSLDisposeTokenUPP
;;FIXME: OSLGetMarkTokenUPP in DisposeOSLGetMarkTokenUPP
;;FIXME: OSLGetErrDescUPP in DisposeOSLGetErrDescUPP
;;FIXME: OSLMarkUPP in DisposeOSLMarkUPP
;;FIXME: OSLAdjustMarksUPP in DisposeOSLAdjustMarksUPP
;;FIXME: const AEDesc * in InvokeOSLAccessorUPP
;;FIXME: const AEDesc * in InvokeOSLCompareUPP
;;FIXME: const AEDesc * in InvokeOSLCountUPP
;;FIXME: AEDesc * in InvokeOSLDisposeTokenUPP
;;FIXME: const AEDesc * in InvokeOSLGetMarkTokenUPP
;;FIXME: AEDesc ** in InvokeOSLGetErrDescUPP
;;FIXME: const AEDesc * in InvokeOSLMarkUPP
;;FIXME: const AEDesc * in InvokeOSLAdjustMarksUPP
[:function AEObjectInit [:short]]
;;FIXME: OSLCompareUPP in AESetObjectCallbacks
;;FIXME: const AEDesc * in AEResolve
;;FIXME: OSLAccessorUPP in AEInstallObjectAccessor
;;FIXME: OSLAccessorUPP in AERemoveObjectAccessor
;;FIXME: OSLAccessorUPP * in AEGetObjectAccessor
;;FIXME: AEDesc * in AEDisposeToken
;;FIXME: const AEDesc * in AECallObjectAccessor
[:compound TextRange "sizeof (TextRange)"]
[:compound TextRangeArray "sizeof (TextRangeArray)"]
[:compound OffsetArray "sizeof (OffsetArray)"]
[:compound WritingCode "sizeof (WritingCode)"]
[:compound IntlText "sizeof (IntlText)"]
[:compound TScriptingSizeResource "sizeof (TScriptingSizeResource)"]
[:compound AEBuildError "sizeof (AEBuildError)"]
;;FIXME: variadic AEBuildDesc
;;FIXME: AEDesc * in vAEBuildDesc
;;FIXME: variadic AEBuildParameters
;;FIXME: AppleEvent * in vAEBuildParameters
;;FIXME: variadic AEBuildAppleEvent
;;FIXME: const void * in vAEBuildAppleEvent
;;FIXME: const AEDesc * in AEPrintDescToHandle
;;FIXME: AEStreamRef in AEStreamOpen
;;FIXME: AEStreamRef in AEStreamClose
;;FIXME: AEStreamRef in AEStreamOpenDesc
;;FIXME: AEStreamRef in AEStreamWriteData
;;FIXME: AEStreamRef in AEStreamCloseDesc
;;FIXME: AEStreamRef in AEStreamWriteDesc
;;FIXME: AEStreamRef in AEStreamWriteAEDesc
;;FIXME: AEStreamRef in AEStreamOpenList
;;FIXME: AEStreamRef in AEStreamCloseList
;;FIXME: AEStreamRef in AEStreamOpenRecord
;;FIXME: AEStreamRef in AEStreamSetRecordType
;;FIXME: AEStreamRef in AEStreamCloseRecord
;;FIXME: AEStreamRef in AEStreamWriteKeyDesc
;;FIXME: AEStreamRef in AEStreamOpenKeyDesc
;;FIXME: AEStreamRef in AEStreamWriteKey
;;FIXME: AEStreamRef in AEStreamCreateEvent
;;FIXME: AEStreamRef in AEStreamOpenEvent
;;FIXME: AEStreamRef in AEStreamOptionalParam
[:function AEGetRegisteredMachPort [:unsigned-int]]
;;FIXME: mach_msg_header_t * in AEDecodeMessage
;;FIXME: mach_msg_header_t * in AEProcessMessage
;;FIXME: const AppleEvent * in AESendMessage
[:function CSIdentityAuthorityGetTypeID [:unsigned-long]]
;;FIXME: CSIdentityAuthorityRef in CSGetDefaultIdentityAuthority
;;FIXME: CSIdentityAuthorityRef in CSGetLocalIdentityAuthority
;;FIXME: CSIdentityAuthorityRef in CSGetManagedIdentityAuthority
;;FIXME: CFStringRef in CSIdentityAuthorityCopyLocalizedName
[:function CSIdentityGetTypeID [:unsigned-long]]
;;FIXME: CSIdentityRef in CSIdentityCreate
;;FIXME: CSIdentityRef in CSIdentityCreateCopy
;;FIXME: CSIdentityRef in CSIdentityGetClass
;;FIXME: CSIdentityAuthorityRef in CSIdentityGetAuthority
;;FIXME: CFUUIDRef in CSIdentityGetUUID
;;FIXME: CFStringRef in CSIdentityGetFullName
;;FIXME: CSIdentityRef in CSIdentityGetPosixID
;;FIXME: CFStringRef in CSIdentityGetPosixName
;;FIXME: CFStringRef in CSIdentityGetEmailAddress
;;FIXME: CFURLRef in CSIdentityGetImageURL
;;FIXME: CFDataRef in CSIdentityGetImageData
;;FIXME: CFStringRef in CSIdentityGetImageDataType
;;FIXME: CFArrayRef in CSIdentityGetAliases
;;FIXME: CSIdentityRef in CSIdentityIsMemberOfGroup
;;FIXME: CSIdentityRef in CSIdentityIsHidden
;;FIXME: CFDataRef in CSIdentityCreatePersistentReference
;;FIXME: CSIdentityRef in CSIdentityIsEnabled
;;FIXME: CSIdentityRef in CSIdentityAuthenticateUsingPassword
;;FIXME: SecCertificateRef in CSIdentityGetCertificate
;;FIXME: CSIdentityQueryRef in CSIdentityCreateGroupMembershipQuery
;;FIXME: CSIdentityRef in CSIdentitySetFullName
;;FIXME: CSIdentityRef in CSIdentitySetEmailAddress
;;FIXME: CSIdentityRef in CSIdentitySetImageURL
;;FIXME: CSIdentityRef in CSIdentitySetImageData
;;FIXME: CSIdentityRef in CSIdentityAddAlias
;;FIXME: CSIdentityRef in CSIdentityRemoveAlias
;;FIXME: CSIdentityRef in CSIdentityAddMember
;;FIXME: CSIdentityRef in CSIdentityRemoveMember
;;FIXME: CSIdentityRef in CSIdentitySetIsEnabled
;;FIXME: CSIdentityRef in CSIdentitySetPassword
;;FIXME: CSIdentityRef in CSIdentitySetCertificate
;;FIXME: CSIdentityRef in CSIdentityDelete
;;FIXME: CSIdentityRef in CSIdentityCommit
[:compound CSIdentityClientContext "sizeof (CSIdentityClientContext)"]
;;FIXME: CSIdentityRef in CSIdentityCommitAsynchronously
;;FIXME: CSIdentityRef in CSIdentityIsCommitting
;;FIXME: CSIdentityRef in CSIdentityRemoveClient
[:function CSIdentityQueryGetTypeID [:unsigned-long]]
;;FIXME: CSIdentityQueryRef in CSIdentityQueryCreate
;;FIXME: CSIdentityQueryRef in CSIdentityQueryCreateForName
;;FIXME: CSIdentityQueryRef in CSIdentityQueryCreateForUUID
;;FIXME: CSIdentityQueryRef in CSIdentityQueryCreateForPosixID
;;FIXME: CSIdentityQueryRef in CSIdentityQueryCreateForPersistentReference
;;FIXME: CSIdentityQueryRef in CSIdentityQueryCreateForCurrentUser
;;FIXME: CFArrayRef in CSIdentityQueryCopyResults
;;FIXME: CSIdentityQueryRef in CSIdentityQueryExecute
[:compound CSIdentityQueryClientContext "sizeof (CSIdentityQueryClientContext)"]
;;FIXME: CSIdentityQueryRef in CSIdentityQueryExecuteAsynchronously
;;FIXME: CSIdentityQueryRef in CSIdentityQueryStop
[:compound IconFamilyElement "sizeof (IconFamilyElement)"]
[:compound IconFamilyResource "sizeof (IconFamilyResource)"]
[:compound SleepQRec "sizeof (SleepQRec)"]
;;FIXME: SleepQUPP in NewSleepQUPP
;;FIXME: SleepQUPP in DisposeSleepQUPP
;;FIXME: SleepQRecPtr in InvokeSleepQUPP
[:function GetCPUSpeed [:long]]
;;FIXME: SleepQRecPtr in SleepQInstall
;;FIXME: SleepQRecPtr in SleepQRemove
[:function MaximumProcessorSpeed [:short]]
[:function MinimumProcessorSpeed [:short]]
[:function CurrentProcessorSpeed [:short]]
[:function BatteryCount [:short]]
[:function UpdateSystemActivity [:short :unsigned-char]]
[:compound KCCallbackInfo "sizeof (KCCallbackInfo)"]
;;FIXME: UInt32 * in KCGetKeychainManagerVersion
[:function KCSetInteractionAllowed [:int :unsigned-char]]
[:function KCIsInteractionAllowed [:unsigned-char]]
;;FIXME: FSRef * in KCMakeKCRefFromFSRef
;;FIXME: AliasHandle in KCMakeKCRefFromAlias
;;FIXME: KCRef in KCMakeAliasFromKCRef
;;FIXME: KCRef * in KCReleaseKeychain
;;FIXME: KCRef * in KCGetDefaultKeychain
;;FIXME: KCRef in KCSetDefaultKeychain
;;FIXME: KCRef in KCGetStatus
;;FIXME: KCItemRef in KCGetKeychain
;;FIXME: KCRef in KCGetKeychainName
[:function KCCountKeychains [:unsigned-short]]
;;FIXME: KCRef * in KCGetIndKeychain
;;FIXME: KCCallbackUPP in NewKCCallbackUPP
;;FIXME: KCCallbackUPP in DisposeKCCallbackUPP
;;FIXME: KCCallbackInfo * in InvokeKCCallbackUPP
;;FIXME: AFPServerSignature * in KCFindAppleSharePassword
;;FIXME: ConstStringPtr in KCFindInternetPassword
;;FIXME: ConstStringPtr in KCFindInternetPasswordWithPath
;;FIXME: ConstStringPtr in KCFindGenericPassword
;;FIXME: KCCallbackUPP in KCAddCallback
;;FIXME: KCCallbackUPP in KCRemoveCallback
;;FIXME: const void * in KCNewItem
;;FIXME: KCItemRef in KCSetAttribute
;;FIXME: KCItemRef in KCGetAttribute
;;FIXME: KCItemRef in KCSetData
;;FIXME: KCItemRef in KCUpdateItem
;;FIXME: KCItemRef * in KCReleaseItem
;;FIXME: KCItemRef in KCCopyItem
;;FIXME: KCRef in KCFindFirstItem
;;FIXME: KCSearchRef in KCFindNextItem
;;FIXME: KCSearchRef * in KCReleaseSearch
;;FIXME: KCItemRef in KCDeleteItem
;;FIXME: KCItemRef in KCGetData
;;FIXME: KCRef in KCLock
;;FIXME: KCRef in kcgetkeychainname
;;FIXME: AFPServerSignature * in kcfindapplesharepassword
;;FIXME: void * in kcfindinternetpassword
;;FIXME: void * in kcfindinternetpasswordwithpath
;;FIXME: void * in kcfindgenericpassword
;;FIXME: SystemSoundCompletionUPP in NewSystemSoundCompletionUPP
;;FIXME: SystemSoundCompletionUPP in DisposeSystemSoundCompletionUPP
;;FIXME: void * in InvokeSystemSoundCompletionUPP
[:function AlertSoundPlay [:void]]
[:function AlertSoundPlayCustomSound [:void :unsigned-int]]
[:function SystemSoundPlay [:void :unsigned-int]]
;;FIXME: const FSRef * in SystemSoundGetActionID
[:function SystemSoundRemoveActionID [:int :unsigned-int]]
;;FIXME: CFRunLoopRef in SystemSoundSetCompletionRoutine
[:function SystemSoundRemoveCompletionRoutine [:void :unsigned-int]]
[:compound WSClientContext "sizeof (WSClientContext)"]
;;FIXME: WSTypeID in WSGetWSTypeIDFromCFType
;;FIXME: WSTypeID in WSGetCFTypeIDFromWSTypeID
[:function WSMethodInvocationGetTypeID [:unsigned-long]]
;;FIXME: WSMethodInvocationRef in WSMethodInvocationCreate
;;FIXME: WSMethodInvocationRef in WSMethodInvocationCreateFromSerialization
;;FIXME: CFDataRef in WSMethodInvocationCopySerialization
;;FIXME: WSMethodInvocationRef in WSMethodInvocationSetParameters
;;FIXME: CFDictionaryRef in WSMethodInvocationCopyParameters
;;FIXME: WSMethodInvocationRef in WSMethodInvocationSetProperty
;;FIXME: CFTypeRef in WSMethodInvocationCopyProperty
;;FIXME: CFDictionaryRef in WSMethodInvocationInvoke
;;FIXME: WSMethodInvocationRef in WSMethodInvocationSetCallBack
;;FIXME: WSMethodInvocationRef in WSMethodInvocationScheduleWithRunLoop
;;FIXME: WSMethodInvocationRef in WSMethodInvocationUnscheduleFromRunLoop
;;FIXME: CFDictionaryRef in WSMethodResultIsFault
;;FIXME: WSMethodInvocationRef in WSMethodInvocationAddSerializationOverride
;;FIXME: WSMethodInvocationRef in WSMethodInvocationAddDeserializationOverride
[:function WSProtocolHandlerGetTypeID [:unsigned-long]]
;;FIXME: WSProtocolHandlerRef in WSProtocolHandlerCreate
;;FIXME: CFDictionaryRef in WSProtocolHandlerCopyRequestDictionary
;;FIXME: CFDictionaryRef in WSProtocolHandlerCopyReplyDictionary
;;FIXME: CFDataRef in WSProtocolHandlerCopyReplyDocument
;;FIXME: CFDataRef in WSProtocolHandlerCopyFaultDocument
;;FIXME: CFDataRef in WSProtocolHandlerCopyRequestDocument
;;FIXME: CFTypeRef in WSProtocolHandlerCopyProperty
;;FIXME: WSProtocolHandlerRef in WSProtocolHandlerSetProperty
;;FIXME: WSProtocolHandlerRef in WSProtocolHandlerSetSerializationOverride
;;FIXME: WSProtocolHandlerRef in WSProtocolHandlerSetDeserializationOverride
[:compound CFHostClientContext "sizeof (CFHostClientContext)"]
[:function CFHostGetTypeID [:unsigned-long]]
;;FIXME: CFHostRef in CFHostCreateWithName
;;FIXME: CFHostRef in CFHostCreateWithAddress
;;FIXME: CFHostRef in CFHostCreateCopy
;;FIXME: CFHostRef in CFHostStartInfoResolution
;;FIXME: CFArrayRef in CFHostGetAddressing
;;FIXME: CFArrayRef in CFHostGetNames
;;FIXME: CFDataRef in CFHostGetReachability
;;FIXME: CFHostRef in CFHostCancelInfoResolution
;;FIXME: CFHostRef in CFHostSetClient
;;FIXME: CFHostRef in CFHostScheduleWithRunLoop
;;FIXME: CFHostRef in CFHostUnscheduleFromRunLoop
[:compound CFNetServiceClientContext "sizeof (CFNetServiceClientContext)"]
[:function CFNetServiceGetTypeID [:unsigned-long]]
[:function CFNetServiceMonitorGetTypeID [:unsigned-long]]
[:function CFNetServiceBrowserGetTypeID [:unsigned-long]]
;;FIXME: CFNetServiceRef in CFNetServiceCreate
;;FIXME: CFNetServiceRef in CFNetServiceCreateCopy
;;FIXME: CFStringRef in CFNetServiceGetDomain
;;FIXME: CFStringRef in CFNetServiceGetType
;;FIXME: CFStringRef in CFNetServiceGetName
;;FIXME: CFNetServiceRef in CFNetServiceRegisterWithOptions
;;FIXME: CFNetServiceRef in CFNetServiceResolveWithTimeout
;;FIXME: CFNetServiceRef in CFNetServiceCancel
;;FIXME: CFStringRef in CFNetServiceGetTargetHost
;;FIXME: CFNetServiceRef in CFNetServiceGetPortNumber
;;FIXME: CFArrayRef in CFNetServiceGetAddressing
;;FIXME: CFDataRef in CFNetServiceGetTXTData
;;FIXME: CFNetServiceRef in CFNetServiceSetTXTData
;;FIXME: CFDictionaryRef in CFNetServiceCreateDictionaryWithTXTData
;;FIXME: CFDataRef in CFNetServiceCreateTXTDataWithDictionary
;;FIXME: CFNetServiceRef in CFNetServiceSetClient
;;FIXME: CFNetServiceRef in CFNetServiceScheduleWithRunLoop
;;FIXME: CFNetServiceRef in CFNetServiceUnscheduleFromRunLoop
;;FIXME: CFNetServiceMonitorRef in CFNetServiceMonitorCreate
;;FIXME: CFNetServiceMonitorRef in CFNetServiceMonitorInvalidate
;;FIXME: CFNetServiceMonitorRef in CFNetServiceMonitorStart
;;FIXME: CFNetServiceMonitorRef in CFNetServiceMonitorStop
;;FIXME: CFNetServiceMonitorRef in CFNetServiceMonitorScheduleWithRunLoop
;;FIXME: CFNetServiceMonitorRef in CFNetServiceMonitorUnscheduleFromRunLoop
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserCreate
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserInvalidate
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserSearchForDomains
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserSearchForServices
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserStopSearch
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserScheduleWithRunLoop
;;FIXME: CFNetServiceBrowserRef in CFNetServiceBrowserUnscheduleFromRunLoop
;;FIXME: CFNetServiceRef in CFNetServiceRegister
;;FIXME: CFNetServiceRef in CFNetServiceResolve
;;FIXME: CFStringRef in CFNetServiceGetProtocolSpecificInformation
;;FIXME: CFNetServiceRef in CFNetServiceSetProtocolSpecificInformation
;;FIXME: const CFStreamError * in CFSocketStreamSOCKSGetErrorSubdomain
;;FIXME: const CFStreamError * in CFSocketStreamSOCKSGetError
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithSocketToCFHost
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithSocketToNetService
;;FIXME: CFReadStreamRef in CFSocketStreamPairSetSecurityProtocol
;;FIXME: CFReadStreamRef in CFReadStreamCreateWithFTPURL
;;FIXME: CFAllocatorRef in CFFTPCreateParsedResourceListing
;;FIXME: CFWriteStreamRef in CFWriteStreamCreateWithFTPURL
[:function CFHTTPMessageGetTypeID [:unsigned-long]]
;;FIXME: CFHTTPMessageRef in CFHTTPMessageCreateRequest
;;FIXME: CFHTTPMessageRef in CFHTTPMessageCreateResponse
;;FIXME: CFHTTPMessageRef in CFHTTPMessageCreateEmpty
;;FIXME: CFHTTPMessageRef in CFHTTPMessageCreateCopy
;;FIXME: CFHTTPMessageRef in CFHTTPMessageIsRequest
;;FIXME: CFStringRef in CFHTTPMessageCopyVersion
;;FIXME: CFDataRef in CFHTTPMessageCopyBody
;;FIXME: CFHTTPMessageRef in CFHTTPMessageSetBody
;;FIXME: CFStringRef in CFHTTPMessageCopyHeaderFieldValue
;;FIXME: CFDictionaryRef in CFHTTPMessageCopyAllHeaderFields
;;FIXME: CFHTTPMessageRef in CFHTTPMessageSetHeaderFieldValue
;;FIXME: CFHTTPMessageRef in CFHTTPMessageAppendBytes
;;FIXME: CFHTTPMessageRef in CFHTTPMessageIsHeaderComplete
;;FIXME: CFDataRef in CFHTTPMessageCopySerializedMessage
;;FIXME: CFURLRef in CFHTTPMessageCopyRequestURL
;;FIXME: CFStringRef in CFHTTPMessageCopyRequestMethod
;;FIXME: CFHTTPMessageRef in CFHTTPMessageAddAuthentication
;;FIXME: CFHTTPMessageRef in CFHTTPMessageGetResponseStatusCode
;;FIXME: CFStringRef in CFHTTPMessageCopyResponseStatusLine
;;FIXME: CFReadStreamRef in CFReadStreamCreateForHTTPRequest
;;FIXME: CFReadStreamRef in CFReadStreamCreateForStreamedHTTPRequest
;;FIXME: CFReadStreamRef in CFHTTPReadStreamSetRedirectsAutomatically
;;FIXME: CFReadStreamRef in CFHTTPReadStreamSetProxy
[:function CFHTTPAuthenticationGetTypeID [:unsigned-long]]
;;FIXME: CFHTTPAuthenticationRef in CFHTTPAuthenticationCreateFromResponse
;;FIXME: CFHTTPAuthenticationRef in CFHTTPAuthenticationIsValid
;;FIXME: CFHTTPAuthenticationRef in CFHTTPAuthenticationAppliesToRequest
;;FIXME: CFHTTPAuthenticationRef in CFHTTPAuthenticationRequiresOrderedRequests
;;FIXME: CFHTTPMessageRef in CFHTTPMessageApplyCredentials
;;FIXME: CFHTTPMessageRef in CFHTTPMessageApplyCredentialDictionary
;;FIXME: CFStringRef in CFHTTPAuthenticationCopyRealm
;;FIXME: CFArrayRef in CFHTTPAuthenticationCopyDomains
;;FIXME: CFStringRef in CFHTTPAuthenticationCopyMethod
;;FIXME: CFHTTPAuthenticationRef in CFHTTPAuthenticationRequiresUserNameAndPassword
;;FIXME: CFHTTPAuthenticationRef in CFHTTPAuthenticationRequiresAccountDomain
;;FIXME: CFNetDiagnosticRef in CFNetDiagnosticCreateWithStreams
;;FIXME: CFNetDiagnosticRef in CFNetDiagnosticCreateWithURL
;;FIXME: CFNetDiagnosticRef in CFNetDiagnosticSetName
;;FIXME: CFNetDiagnosticRef in CFNetDiagnosticDiagnoseProblemInteractively
;;FIXME: CFNetDiagnosticRef in CFNetDiagnosticCopyNetworkStatusPassively
;;FIXME: CFDictionaryRef in CFNetworkCopySystemProxySettings
;;FIXME: CFArrayRef in CFNetworkCopyProxiesForURL
;;FIXME: CFArrayRef in CFNetworkCopyProxiesForAutoConfigurationScript
;;FIXME: CFRunLoopSourceRef in CFNetworkExecuteProxyAutoConfigurationScript
;;FIXME: CFRunLoopSourceRef in CFNetworkExecuteProxyAutoConfigurationURL
;;FIXME: IconRef in GetIconRefOwners
;;FIXME: IconRef in AcquireIconRef
;;FIXME: IconRef in ReleaseIconRef
;;FIXME: IconRef * in GetIconRef
;;FIXME: IconRef * in GetIconRefFromFolder
;;FIXME: const FSRef * in GetIconRefFromFileInfo
;;FIXME: CFStringRef in GetIconRefFromTypeInfo
;;FIXME: const IconFamilyResource * in GetIconRefFromIconFamilyPtr
;;FIXME: Component in GetIconRefFromComponent
;;FIXME: IconFamilyHandle in RegisterIconRefFromIconFamily
;;FIXME: const FSRef * in RegisterIconRefFromFSRef
[:function UnregisterIconRef [:short :unsigned-int :unsigned-int]]
;;FIXME: IconRef in UpdateIconRef
;;FIXME: IconRef in OverrideIconRef
;;FIXME: IconRef in RemoveIconRefOverride
;;FIXME: IconRef in CompositeIconRef
;;FIXME: IconRef in IsIconRefComposite
;;FIXME: IconRef in IsValidIconRef
;;FIXME: IconRef in IsDataAvailableInIconRef
[:function SetCustomIconsEnabled [:short :short :unsigned-char]]
;;FIXME: Boolean * in GetCustomIconsEnabled
;;FIXME: const FSRef * in ReadIconFromFSRef
[:compound LSItemInfoRecord "sizeof (LSItemInfoRecord)"]
[:function LSInit [:int :unsigned-int]]
[:function LSTerm [:int]]
;;FIXME: const FSRef * in LSCopyItemInfoForRef
;;FIXME: CFURLRef in LSCopyItemInfoForURL
;;FIXME: const UniChar [] in LSGetExtensionInfo
;;FIXME: const FSRef * in LSCopyDisplayNameForRef
;;FIXME: CFURLRef in LSCopyDisplayNameForURL
;;FIXME: const FSRef * in LSSetExtensionHiddenForRef
;;FIXME: CFURLRef in LSSetExtensionHiddenForURL
;;FIXME: const FSRef * in LSCopyKindStringForRef
;;FIXME: CFURLRef in LSCopyKindStringForURL
;;FIXME: CFStringRef in LSCopyKindStringForTypeInfo
;;FIXME: CFStringRef in LSCopyKindStringForMIMEType
;;FIXME: const FSRef * in LSGetApplicationForItem
;;FIXME: CFStringRef in LSGetApplicationForInfo
;;FIXME: CFStringRef in LSCopyApplicationForMIMEType
;;FIXME: CFURLRef in LSGetApplicationForURL
;;FIXME: CFStringRef in LSFindApplicationForInfo
;;FIXME: const FSRef * in LSCanRefAcceptItem
;;FIXME: CFURLRef in LSCanURLAcceptURL
;;FIXME: CFURLRef in LSRegisterURL
;;FIXME: const FSRef * in LSRegisterFSRef
;;FIXME: CFArrayRef in LSCopyApplicationURLsForURL
;;FIXME: const FSRef * in LSCopyItemAttribute
;;FIXME: const FSRef * in LSCopyItemAttributes
;;FIXME: const FSRef * in LSSetItemAttribute
;;FIXME: CFStringRef in LSCopyDefaultRoleHandlerForContentType
;;FIXME: CFArrayRef in LSCopyAllRoleHandlersForContentType
;;FIXME: CFStringRef in LSSetDefaultRoleHandlerForContentType
;;FIXME: CFStringRef in LSGetHandlerOptionsForContentType
;;FIXME: CFStringRef in LSSetHandlerOptionsForContentType
;;FIXME: CFStringRef in LSCopyDefaultHandlerForURLScheme
;;FIXME: CFArrayRef in LSCopyAllHandlersForURLScheme
;;FIXME: CFStringRef in LSSetDefaultHandlerForURLScheme
[:compound LSLaunchFSRefSpec "sizeof (LSLaunchFSRefSpec)"]
[:compound LSLaunchURLSpec "sizeof (LSLaunchURLSpec)"]
;;FIXME: const FSRef * in LSOpenFSRef
;;FIXME: CFURLRef in LSOpenCFURLRef
;;FIXME: const LSLaunchFSRefSpec * in LSOpenFromRefSpec
;;FIXME: const LSLaunchURLSpec * in LSOpenFromURLSpec
[:compound LSApplicationParameters "sizeof (LSApplicationParameters)"]
;;FIXME: const LSApplicationParameters * in LSOpenApplication
;;FIXME: const FSRef * in LSOpenItemsWithRole
;;FIXME: CFArrayRef in LSOpenURLsWithRole
[:function LSSharedFileListGetTypeID [:unsigned-long]]
[:function LSSharedFileListItemGetTypeID [:unsigned-long]]
;;FIXME: LSSharedFileListRef in LSSharedFileListCreate
;;FIXME: LSSharedFileListRef in LSSharedFileListSetAuthorization
;;FIXME: LSSharedFileListRef in LSSharedFileListAddObserver
;;FIXME: LSSharedFileListRef in LSSharedFileListRemoveObserver
;;FIXME: LSSharedFileListRef in LSSharedFileListGetSeedValue
;;FIXME: CFTypeRef in LSSharedFileListCopyProperty
;;FIXME: LSSharedFileListRef in LSSharedFileListSetProperty
;;FIXME: CFArrayRef in LSSharedFileListCopySnapshot
;;FIXME: LSSharedFileListItemRef in LSSharedFileListInsertItemURL
;;FIXME: LSSharedFileListItemRef in LSSharedFileListInsertItemFSRef
;;FIXME: LSSharedFileListRef in LSSharedFileListItemMove
;;FIXME: LSSharedFileListRef in LSSharedFileListItemRemove
;;FIXME: LSSharedFileListRef in LSSharedFileListRemoveAllItems
;;FIXME: LSSharedFileListItemRef in LSSharedFileListItemGetID
;;FIXME: IconRef in LSSharedFileListItemCopyIconRef
;;FIXME: CFStringRef in LSSharedFileListItemCopyDisplayName
;;FIXME: LSSharedFileListItemRef in LSSharedFileListItemResolve
;;FIXME: CFTypeRef in LSSharedFileListItemCopyProperty
;;FIXME: LSSharedFileListItemRef in LSSharedFileListItemSetProperty
;;FIXME: CFStringRef in UTTypeCreatePreferredIdentifierForTag
;;FIXME: CFArrayRef in UTTypeCreateAllIdentifiersForTag
;;FIXME: CFStringRef in UTTypeCopyPreferredTagWithClass
;;FIXME: CFStringRef in UTTypeEqual
;;FIXME: CFStringRef in UTTypeConformsTo
;;FIXME: CFStringRef in UTTypeCopyDescription
;;FIXME: CFDictionaryRef in UTTypeCopyDeclaration
;;FIXME: CFURLRef in UTTypeCopyDeclaringBundleURL
;;FIXME: CFStringRef in UTCreateStringForOSType
;;FIXME: CFStringRef in UTGetOSTypeFromString
[:function SKDocumentGetTypeID [:unsigned-long]]
;;FIXME: SKDocumentRef in SKDocumentCreateWithURL
;;FIXME: CFURLRef in SKDocumentCopyURL
;;FIXME: SKDocumentRef in SKDocumentCreate
;;FIXME: CFStringRef in SKDocumentGetSchemeName
;;FIXME: CFStringRef in SKDocumentGetName
;;FIXME: SKDocumentRef in SKDocumentGetParent
[:function SKIndexGetTypeID [:unsigned-long]]
[:function SKIndexDocumentIteratorGetTypeID [:unsigned-long]]
;;FIXME: SKIndexRef in SKIndexCreateWithURL
;;FIXME: SKIndexRef in SKIndexOpenWithURL
;;FIXME: SKIndexRef in SKIndexCreateWithMutableData
;;FIXME: SKIndexRef in SKIndexOpenWithData
;;FIXME: SKIndexRef in SKIndexOpenWithMutableData
;;FIXME: SKIndexRef in SKIndexFlush
;;FIXME: SKIndexRef in SKIndexSetMaximumBytesBeforeFlush
;;FIXME: SKIndexRef in SKIndexGetMaximumBytesBeforeFlush
;;FIXME: SKIndexRef in SKIndexCompact
;;FIXME: SKIndexType in SKIndexGetIndexType
;;FIXME: CFDictionaryRef in SKIndexGetAnalysisProperties
;;FIXME: SKIndexRef in SKIndexGetDocumentCount
;;FIXME: SKIndexRef in SKIndexClose
;;FIXME: SKIndexRef in SKIndexAddDocumentWithText
;;FIXME: SKIndexRef in SKIndexAddDocument
;;FIXME: SKIndexRef in SKIndexRemoveDocument
;;FIXME: CFDictionaryRef in SKIndexCopyDocumentProperties
;;FIXME: SKIndexRef in SKIndexSetDocumentProperties
;;FIXME: SKDocumentIndexState in SKIndexGetDocumentState
;;FIXME: SKIndexRef in SKIndexGetDocumentID
;;FIXME: SKDocumentRef in SKIndexCopyDocumentForDocumentID
;;FIXME: SKIndexRef in SKIndexRenameDocument
;;FIXME: SKIndexRef in SKIndexMoveDocument
;;FIXME: SKIndexDocumentIteratorRef in SKIndexDocumentIteratorCreate
;;FIXME: SKDocumentRef in SKIndexDocumentIteratorCopyNext
;;FIXME: SKIndexRef in SKIndexGetMaximumDocumentID
;;FIXME: SKIndexRef in SKIndexGetDocumentTermCount
;;FIXME: CFArrayRef in SKIndexCopyTermIDArrayForDocumentID
;;FIXME: SKIndexRef in SKIndexGetDocumentTermFrequency
;;FIXME: SKIndexRef in SKIndexGetMaximumTermID
;;FIXME: SKIndexRef in SKIndexGetTermDocumentCount
;;FIXME: CFArrayRef in SKIndexCopyDocumentIDArrayForTermID
;;FIXME: CFStringRef in SKIndexCopyTermStringForTermID
;;FIXME: SKIndexRef in SKIndexGetTermIDForTermString
[:function SKLoadDefaultExtractorPlugIns [:void]]
[:function SKSearchGetTypeID [:unsigned-long]]
;;FIXME: SKSearchRef in SKSearchCreate
;;FIXME: SKSearchRef in SKSearchCancel
;;FIXME: SKSearchRef in SKSearchFindMatches
;;FIXME: SKIndexRef in SKIndexCopyInfoForDocumentIDs
;;FIXME: SKIndexRef in SKIndexCopyDocumentRefsForDocumentIDs
;;FIXME: SKIndexRef in SKIndexCopyDocumentURLsForDocumentIDs
[:function SKSearchGroupGetTypeID [:unsigned-long]]
[:function SKSearchResultsGetTypeID [:unsigned-long]]
;;FIXME: SKSearchGroupRef in SKSearchGroupCreate
;;FIXME: CFArrayRef in SKSearchGroupCopyIndexes
;;FIXME: SKSearchResultsRef in SKSearchResultsCreateWithQuery
;;FIXME: SKSearchResultsRef in SKSearchResultsCreateWithDocuments
;;FIXME: SKSearchResultsRef in SKSearchResultsGetCount
;;FIXME: SKSearchResultsRef in SKSearchResultsGetInfoInRange
;;FIXME: CFArrayRef in SKSearchResultsCopyMatchingTerms
[:function SKSummaryGetTypeID [:unsigned-long]]
;;FIXME: SKSummaryRef in SKSummaryCreateWithString
;;FIXME: SKSummaryRef in SKSummaryGetSentenceCount
;;FIXME: SKSummaryRef in SKSummaryGetParagraphCount
;;FIXME: CFStringRef in SKSummaryCopySentenceAtIndex
;;FIXME: CFStringRef in SKSummaryCopyParagraphAtIndex
;;FIXME: CFStringRef in SKSummaryCopySentenceSummaryString
;;FIXME: CFStringRef in SKSummaryCopyParagraphSummaryString
;;FIXME: SKSummaryRef in SKSummaryGetSentenceSummaryInfo
;;FIXME: SKSummaryRef in SKSummaryGetParagraphSummaryInfo
[:function MDItemGetTypeID [:unsigned-long]]
;;FIXME: MDItemRef in MDItemCreate
;;FIXME: MDItemRef in MDItemCreateWithURL
;;FIXME: CFArrayRef in MDItemsCreateWithURLs
;;FIXME: CFTypeRef in MDItemCopyAttribute
;;FIXME: CFDictionaryRef in MDItemCopyAttributes
;;FIXME: variadic MDItemCopyAttributeList
;;FIXME: CFArrayRef in MDItemCopyAttributeNames
;;FIXME: CFArrayRef in MDItemsCopyAttributes
;;FIXME: variadic __MDItemCopyAttributesEllipsis1
[:function MDQueryGetTypeID [:unsigned-long]]
;;FIXME: MDQueryRef in MDQueryCreate
;;FIXME: MDQueryRef in MDQueryCreateSubset
;;FIXME: MDQueryRef in MDQueryCreateForItems
;;FIXME: CFStringRef in MDQueryCopyQueryString
;;FIXME: CFArrayRef in MDQueryCopyValueListAttributes
;;FIXME: CFArrayRef in MDQueryCopySortingAttributes
[:compound MDQueryBatchingParams "sizeof (MDQueryBatchingParams)"]
;;FIXME: MDQueryRef in MDQueryGetBatchingParameters
;;FIXME: MDQueryRef in MDQuerySetBatchingParameters
;;FIXME: MDQueryRef in MDQuerySetCreateResultFunction
;;FIXME: MDQueryRef in MDQuerySetCreateValueFunction
;;FIXME: MDQueryRef in MDQuerySetDispatchQueue
;;FIXME: MDQueryRef in MDQueryExecute
;;FIXME: MDQueryRef in MDQueryStop
;;FIXME: MDQueryRef in MDQueryDisableUpdates
;;FIXME: MDQueryRef in MDQueryEnableUpdates
;;FIXME: MDQueryRef in MDQueryIsGatheringComplete
;;FIXME: MDQueryRef in MDQueryGetResultCount
;;FIXME: const void * in MDQueryGetResultAtIndex
;;FIXME: MDQueryRef in MDQueryGetIndexOfResult
;;FIXME: void * in MDQueryGetAttributeValueOfResultAtIndex
;;FIXME: CFArrayRef in MDQueryCopyValuesOfAttribute
;;FIXME: MDQueryRef in MDQueryGetCountOfResultsWithAttributeValue
;;FIXME: MDQueryRef in MDQuerySetSortOrder
;;FIXME: MDQueryRef in MDQuerySetSortOptionFlagsForAttribute
;;FIXME: MDQueryRef in MDQueryGetSortOptionFlagsForAttribute
;;FIXME: MDQueryRef in MDQuerySetSortComparator
;;FIXME: MDQueryRef in MDQuerySetSortComparatorBlock
;;FIXME: MDQueryRef in MDQuerySetSearchScope
;;FIXME: MDQueryRef in MDQuerySetMaxCount
[:function MDLabelGetTypeID [:unsigned-long]]
;;FIXME: CFArrayRef in MDItemCopyLabels
;;FIXME: MDItemRef in MDItemSetLabel
;;FIXME: MDItemRef in MDItemRemoveLabel
;;FIXME: MDLabelRef in MDLabelCreate
;;FIXME: CFTypeRef in MDLabelCopyAttribute
;;FIXME: CFStringRef in MDLabelCopyAttributeName
;;FIXME: MDLabelRef in MDLabelDelete
;;FIXME: MDLabelRef in MDLabelSetAttributes
;;FIXME: CFArrayRef in MDCopyLabelKinds
;;FIXME: CFArrayRef in MDCopyLabelsMatchingExpression
;;FIXME: CFArrayRef in MDCopyLabelsWithKind
;;FIXME: MDLabelRef in MDCopyLabelWithUUID
;;FIXME: CFDictionaryRef in MDSchemaCopyAttributesForContentType
;;FIXME: CFDictionaryRef in MDSchemaCopyMetaAttributesForAttribute
;;FIXME: CFArrayRef in MDSchemaCopyAllAttributes
;;FIXME: CFStringRef in MDSchemaCopyDisplayNameForAttribute
;;FIXME: CFStringRef in MDSchemaCopyDisplayDescriptionForAttribute
;;FIXME: DCSDictionaryRef in DCSGetTermRangeInString
;;FIXME: CFStringRef in DCSCopyTextDefinition
[:selector [5 :initWithHost :port :protocol :realm :authenticationMethod] [:id :id :long :id :id :id]]
[:selector [5 :initWithProxyHost :port :type :realm :authenticationMethod] [:id :id :long :id :id :id]]
[:selector [0 :realm] [:id]]
[:selector [0 :receivesCredentialSecurely] [Boolean]]
[:selector [0 :isProxy] [Boolean]]
[:selector [0 :host] [:id]]
[:selector [0 :port] [:long]]
[:selector [0 :proxyType] [:id]]
[:selector [0 :protocol] [:id]]
[:selector [0 :authenticationMethod] [:id]]
[:selector [3 :initWithRequest :cachedResponse :client] [:id :id :id :id]]
[:selector [0 :client] [:id]]
[:selector [0 :request] [:id]]
[:selector [0 :cachedResponse] [:id]]
[:selector [1 :canInitWithRequest] [Boolean :id]]
[:selector [1 :canonicalRequestForRequest] [:id :id]]
[:selector [2 :requestIsCacheEquivalent :toRequest] [Boolean :id :id]]
[:selector [0 :startLoading] [:void]]
[:selector [0 :stopLoading] [:void]]
[:selector [2 :propertyForKey :inRequest] [:id :id :id]]
[:selector [3 :setProperty :forKey :inRequest] [:void :id :id :id]]
[:selector [2 :removePropertyForKey :inRequest] [:void :id :id]]
[:selector [1 :registerClass] [Boolean :id]]
[:selector [1 :unregisterClass] [:void :id]]
[:selector [1 :requestWithURL] [:id :id]]
[:selector [3 :requestWithURL :cachePolicy :timeoutInterval] [:id :id :unsigned-long :double]]
[:selector [1 :initWithURL] [:id :id]]
[:selector [3 :initWithURL :cachePolicy :timeoutInterval] [:id :id :unsigned-long :double]]
[:selector [0 :URL] [:id]]
[:selector [0 :cachePolicy] [:unsigned-long]]
[:selector [0 :timeoutInterval] [:double]]
[:selector [0 :mainDocumentURL] [:id]]
[:selector [0 :networkServiceType] [:unsigned-long]]
[:selector [0 :allowsCellularAccess] [Boolean]]
[:selector [1 :setURL] [:void :id]]
[:selector [1 :setCachePolicy] [:void :unsigned-long]]
[:selector [1 :setTimeoutInterval] [:void :double]]
[:selector [1 :setMainDocumentURL] [:void :id]]
[:selector [1 :setNetworkServiceType] [:void :unsigned-long]]
[:selector [1 :setAllowsCellularAccess] [:void Boolean]]
[:selector [4 :initWithURL :MIMEType :expectedContentLength :textEncodingName] [:id :id :id :long :id]]
[:selector [0 :URL] [:id]]
[:selector [0 :MIMEType] [:id]]
[:selector [0 :expectedContentLength] [:long-long]]
[:selector [0 :textEncodingName] [:id]]
[:selector [0 :suggestedFilename] [:id]]
[:selector [4 :initWithURL :statusCode :HTTPVersion :headerFields] [:id :id :long :id :id]]
[:selector [0 :statusCode] [:long]]
[:selector [0 :allHeaderFields] [:id]]
[:selector [1 :localizedStringForStatusCode] [:id :long]]
[:selector [0 :standardUserDefaults] [:id]]
[:selector [0 :resetStandardUserDefaults] [:void]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithUser] [:id :id]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [1 :stringForKey] [:id :id]]
[:selector [1 :arrayForKey] [:id :id]]
[:selector [1 :dictionaryForKey] [:id :id]]
[:selector [1 :dataForKey] [:id :id]]
[:selector [1 :stringArrayForKey] [:id :id]]
[:selector [1 :integerForKey] [:long :id]]
[:selector [1 :floatForKey] [:float :id]]
[:selector [1 :doubleForKey] [:double :id]]
[:selector [1 :boolForKey] [Boolean :id]]
[:selector [1 :URLForKey] [:id :id]]
[:selector [2 :setInteger :forKey] [:void :long :id]]
[:selector [2 :setFloat :forKey] [:void :float :id]]
[:selector [2 :setDouble :forKey] [:void :double :id]]
[:selector [2 :setBool :forKey] [:void Boolean :id]]
[:selector [2 :setURL :forKey] [:void :id :id]]
[:selector [1 :registerDefaults] [:void :id]]
[:selector [1 :addSuiteNamed] [:void :id]]
[:selector [1 :removeSuiteNamed] [:void :id]]
[:selector [0 :dictionaryRepresentation] [:id]]
[:selector [0 :volatileDomainNames] [:id]]
[:selector [1 :volatileDomainForName] [:id :id]]
[:selector [2 :setVolatileDomain :forName] [:void :id :id]]
[:selector [1 :removeVolatileDomainForName] [:void :id]]
[:selector [0 :persistentDomainNames] [:id]]
[:selector [1 :persistentDomainForName] [:id :id]]
[:selector [2 :setPersistentDomain :forName] [:void :id :id]]
[:selector [1 :removePersistentDomainForName] [:void :id]]
[:selector [0 :synchronize] [Boolean]]
[:selector [1 :objectIsForcedForKey] [Boolean :id]]
[:selector [2 :objectIsForcedForKey :inDomain] [Boolean :id :id]]
[:selector [2 :setValueTransformer :forName] [:void :id :id]]
[:selector [1 :valueTransformerForName] [:id :id]]
[:selector [0 :valueTransformerNames] [:id]]
[:selector [0 :transformedValueClass] [:id]]
[:selector [0 :allowsReverseTransformation] [Boolean]]
[:selector [1 :transformedValue] [:id :id]]
[:selector [1 :reverseTransformedValue] [:id :id]]
[:selector [1 :initWithContentsOfURL] [:id :id]]
[:selector [1 :initWithData] [:id :id]]
[:selector [1 :initWithStream] [:id :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [1 :setShouldProcessNamespaces] [:void Boolean]]
[:selector [1 :setShouldReportNamespacePrefixes] [:void Boolean]]
[:selector [1 :setShouldResolveExternalEntities] [:void Boolean]]
[:selector [0 :shouldProcessNamespaces] [Boolean]]
[:selector [0 :shouldReportNamespacePrefixes] [Boolean]]
[:selector [0 :shouldResolveExternalEntities] [Boolean]]
[:selector [0 :parse] [Boolean]]
[:selector [0 :abortParsing] [:void]]
[:selector [0 :parserError] [:id]]
[:selector [0 :string] [:id]]
;;FIXME: NSRangePointer in attributesAtIndex:effectiveRange:
[:selector [2 :replaceCharactersInRange :withString] [:void Foundation/NSRange :id]]
[:selector [2 :setAttributes :range] [:void :id Foundation/NSRange]]
;;FIXME: NSByteCountFormatterCountStyle in stringFromByteCount:countStyle:
[:selector [1 :stringFromByteCount] [:id :long-long]]
;;FIXME: NSByteCountFormatterUnits in allowedUnits
;;FIXME: NSByteCountFormatterUnits in setAllowedUnits:
;;FIXME: NSByteCountFormatterCountStyle in countStyle
;;FIXME: NSByteCountFormatterCountStyle in setCountStyle:
[:selector [0 :allowsNonnumericFormatting] [Boolean]]
[:selector [1 :setAllowsNonnumericFormatting] [:void Boolean]]
[:selector [0 :includesUnit] [Boolean]]
[:selector [1 :setIncludesUnit] [:void Boolean]]
[:selector [0 :includesCount] [Boolean]]
[:selector [1 :setIncludesCount] [:void Boolean]]
[:selector [0 :includesActualByteCount] [Boolean]]
[:selector [1 :setIncludesActualByteCount] [:void Boolean]]
[:selector [0 :isAdaptive] [Boolean]]
[:selector [1 :setAdaptive] [:void Boolean]]
[:selector [0 :zeroPadsFractionDigits] [Boolean]]
[:selector [1 :setZeroPadsFractionDigits] [:void Boolean]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [3 :setObject :forKey :cost] [:void :id :id :unsigned-long]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [1 :setTotalCostLimit] [:void :unsigned-long]]
[:selector [0 :totalCostLimit] [:unsigned-long]]
[:selector [1 :setCountLimit] [:void :unsigned-long]]
[:selector [0 :countLimit] [:unsigned-long]]
[:selector [0 :evictsObjectsWithDiscardedContent] [Boolean]]
[:selector [1 :setEvictsObjectsWithDiscardedContent] [:void Boolean]]
[:selector [2 :predicateWithFormat :argumentArray] [:id :id :id]]
;;FIXME: variadic predicateWithFormat:
;;FIXME: va_list in predicateWithFormat:arguments:
[:selector [1 :predicateWithValue] [:id Boolean]]
;;FIXME: BOOL (^)(id, NSDictionary *) in predicateWithBlock:
[:selector [0 :predicateFormat] [:id]]
[:selector [1 :predicateWithSubstitutionVariables] [:id :id]]
[:selector [1 :evaluateWithObject] [Boolean :id]]
[:selector [2 :evaluateWithObject :substitutionVariables] [Boolean :id :id]]
;;FIXME: NSComparisonPredicateModifier in predicateWithLeftExpression:rightExpression:modifier:type:options:
[:selector [3 :predicateWithLeftExpression :rightExpression :customSelector] [:id :id :id :selector]]
;;FIXME: NSComparisonPredicateModifier in initWithLeftExpression:rightExpression:modifier:type:options:
[:selector [3 :initWithLeftExpression :rightExpression :customSelector] [:id :id :id :selector]]
;;FIXME: NSPredicateOperatorType in predicateOperatorType
;;FIXME: NSComparisonPredicateModifier in comparisonPredicateModifier
[:selector [0 :leftExpression] [:id]]
[:selector [0 :rightExpression] [:id]]
[:selector [0 :customSelector] [:selector]]
;;FIXME: NSComparisonPredicateOptions in options
;;FIXME: NSCompoundPredicateType in initWithType:subpredicates:
;;FIXME: NSCompoundPredicateType in compoundPredicateType
[:selector [0 :subpredicates] [:id]]
[:selector [1 :andPredicateWithSubpredicates] [:id :id]]
[:selector [1 :orPredicateWithSubpredicates] [:id :id]]
[:selector [1 :notPredicateWithSubpredicate] [:id :id]]
[:selector [2 :expressionWithFormat :argumentArray] [:id :id :id]]
;;FIXME: variadic expressionWithFormat:
;;FIXME: va_list in expressionWithFormat:arguments:
[:selector [1 :expressionForConstantValue] [:id :id]]
[:selector [0 :expressionForEvaluatedObject] [:id]]
[:selector [1 :expressionForVariable] [:id :id]]
[:selector [1 :expressionForKeyPath] [:id :id]]
[:selector [2 :expressionForFunction :arguments] [:id :id :id]]
[:selector [1 :expressionForAggregate] [:id :id]]
[:selector [2 :expressionForUnionSet :with] [:id :id :id]]
[:selector [2 :expressionForIntersectSet :with] [:id :id :id]]
[:selector [2 :expressionForMinusSet :with] [:id :id :id]]
[:selector [3 :expressionForSubquery :usingIteratorVariable :predicate] [:id :id :id :id]]
[:selector [3 :expressionForFunction :selectorName :arguments] [:id :id :id :id]]
;;FIXME: id (^)(id, NSArray *, NSMutableDictionary *) in expressionForBlock:arguments:
;;FIXME: NSExpressionType in initWithExpressionType:
;;FIXME: NSExpressionType in expressionType
[:selector [0 :constantValue] [:id]]
[:selector [0 :keyPath] [:id]]
[:selector [0 :function] [:id]]
[:selector [0 :variable] [:id]]
[:selector [0 :operand] [:id]]
[:selector [0 :arguments] [:id]]
[:selector [0 :collection] [:id]]
[:selector [0 :predicate] [:id]]
[:selector [0 :leftExpression] [:id]]
[:selector [0 :rightExpression] [:id]]
;;FIXME: id (^)(id, NSArray *, NSMutableDictionary *) in expressionBlock
[:selector [2 :expressionValueWithObject :context] [:id :id :id]]
[:selector [1 :addFilePresenter] [:void :id]]
[:selector [1 :removeFilePresenter] [:void :id]]
[:selector [0 :filePresenters] [:id]]
[:selector [1 :initWithFilePresenter] [:id :id]]
;;FIXME: NSFileCoordinatorReadingOptions in coordinateReadingItemAtURL:options:error:byAccessor:
;;FIXME: NSFileCoordinatorWritingOptions in coordinateWritingItemAtURL:options:error:byAccessor:
;;FIXME: NSFileCoordinatorReadingOptions in coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:
;;FIXME: NSFileCoordinatorWritingOptions in coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:
;;FIXME: NSFileCoordinatorReadingOptions in prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:
[:selector [2 :itemAtURL :willMoveToURL] [:void :id :id]]
[:selector [2 :itemAtURL :didMoveToURL] [:void :id :id]]
[:selector [0 :cancel] [:void]]
[:selector [1 :currentVersionOfItemAtURL] [:id :id]]
[:selector [1 :otherVersionsOfItemAtURL] [:id :id]]
[:selector [1 :unresolvedConflictVersionsOfItemAtURL] [:id :id]]
[:selector [2 :versionOfItemAtURL :forPersistentIdentifier] [:id :id :id]]
;;FIXME: NSFileVersionAddingOptions in addVersionOfItemAtURL:withContentsOfURL:options:error:
[:selector [1 :temporaryDirectoryURLForNewVersionOfItemAtURL] [:id :id]]
;;FIXME: NSFileVersionReplacingOptions in replaceItemAtURL:options:error:
;;FIXME: NSError ** in removeAndReturnError:
;;FIXME: NSError ** in removeOtherVersionsOfItemAtURL:error:
[:selector [0 :URL] [:id]]
[:selector [0 :localizedName] [:id]]
[:selector [0 :localizedNameOfSavingComputer] [:id]]
[:selector [0 :modificationDate] [:id]]
[:selector [0 :persistentIdentifier] [:id]]
[:selector [0 :isConflict] [Boolean]]
[:selector [0 :isResolved] [Boolean]]
[:selector [1 :setResolved] [:void Boolean]]
[:selector [0 :isDiscardable] [Boolean]]
[:selector [1 :setDiscardable] [:void Boolean]]
;;FIXME: NSFileWrapperReadingOptions in initWithURL:options:error:
[:selector [1 :initDirectoryWithFileWrappers] [:id :id]]
[:selector [1 :initRegularFileWithContents] [:id :id]]
[:selector [1 :initSymbolicLinkWithDestinationURL] [:id :id]]
[:selector [1 :initWithSerializedRepresentation] [:id :id]]
[:selector [0 :isDirectory] [Boolean]]
[:selector [0 :isRegularFile] [Boolean]]
[:selector [0 :isSymbolicLink] [Boolean]]
[:selector [1 :setPreferredFilename] [:void :id]]
[:selector [0 :preferredFilename] [:id]]
[:selector [1 :setFilename] [:void :id]]
[:selector [0 :filename] [:id]]
[:selector [1 :setFileAttributes] [:void :id]]
[:selector [0 :fileAttributes] [:id]]
[:selector [1 :matchesContentsOfURL] [Boolean :id]]
;;FIXME: NSFileWrapperReadingOptions in readFromURL:options:error:
;;FIXME: NSFileWrapperWritingOptions in writeToURL:options:originalContentsURL:error:
[:selector [0 :serializedRepresentation] [:id]]
[:selector [1 :addFileWrapper] [:id :id]]
[:selector [2 :addRegularFileWithContents :preferredFilename] [:id :id :id]]
[:selector [1 :removeFileWrapper] [:void :id]]
[:selector [0 :fileWrappers] [:id]]
[:selector [1 :keyForFileWrapper] [:id :id]]
[:selector [0 :regularFileContents] [:id]]
[:selector [0 :symbolicLinkDestinationURL] [:id]]
[:selector [2 :initWithTagSchemes :options] [:id :id :unsigned-long]]
[:selector [0 :tagSchemes] [:id]]
[:selector [1 :setString] [:void :id]]
[:selector [0 :string] [:id]]
[:selector [1 :availableTagSchemesForLanguage] [:id :id]]
[:selector [2 :setOrthography :range] [:void :id Foundation/NSRange]]
;;FIXME: NSRangePointer in orthographyAtIndex:effectiveRange:
[:selector [2 :stringEditedInRange :changeInLength] [:void Foundation/NSRange :long]]
;;FIXME: NSLinguisticTaggerOptions in enumerateTagsInRange:scheme:options:usingBlock:
[:selector [1 :sentenceRangeForRange] [Foundation/NSRange Foundation/NSRange]]
;;FIXME: NSRangePointer in tagAtIndex:scheme:tokenRange:sentenceRange:
;;FIXME: NSLinguisticTaggerOptions in tagsInRange:scheme:options:tokenRanges:
;;FIXME: NSRangePointer in possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:
[:selector [0 :init] [:id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :predicate] [:id]]
[:selector [1 :setPredicate] [:void :id]]
[:selector [0 :sortDescriptors] [:id]]
[:selector [1 :setSortDescriptors] [:void :id]]
[:selector [0 :valueListAttributes] [:id]]
[:selector [1 :setValueListAttributes] [:void :id]]
[:selector [0 :groupingAttributes] [:id]]
[:selector [1 :setGroupingAttributes] [:void :id]]
[:selector [0 :notificationBatchingInterval] [:double]]
[:selector [1 :setNotificationBatchingInterval] [:void :double]]
[:selector [0 :searchScopes] [:id]]
[:selector [1 :setSearchScopes] [:void :id]]
[:selector [0 :startQuery] [Boolean]]
[:selector [0 :stopQuery] [:void]]
[:selector [0 :isStarted] [Boolean]]
[:selector [0 :isGathering] [Boolean]]
[:selector [0 :isStopped] [Boolean]]
[:selector [0 :disableUpdates] [:void]]
[:selector [0 :enableUpdates] [:void]]
[:selector [0 :resultCount] [:unsigned-long]]
[:selector [1 :resultAtIndex] [:id :unsigned-long]]
[:selector [0 :results] [:id]]
[:selector [1 :indexOfResult] [:unsigned-long :id]]
[:selector [0 :valueLists] [:id]]
[:selector [0 :groupedResults] [:id]]
[:selector [2 :valueOfAttribute :forResultAtIndex] [:id :id :unsigned-long]]
[:selector [1 :valueForAttribute] [:id :id]]
[:selector [1 :valuesForAttributes] [:id :id]]
[:selector [0 :attributes] [:id]]
[:selector [0 :attribute] [:id]]
[:selector [0 :value] [:id]]
[:selector [0 :count] [:unsigned-long]]
[:selector [0 :attribute] [:id]]
[:selector [0 :value] [:id]]
[:selector [0 :subgroups] [:id]]
[:selector [0 :resultCount] [:unsigned-long]]
[:selector [1 :resultAtIndex] [:id :unsigned-long]]
[:selector [0 :results] [:id]]
[:selector [4 :initWithDomain :type :name :port] [:id :id :id :id :int]]
[:selector [3 :initWithDomain :type :name] [:id :id :id :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
[:selector [0 :domain] [:id]]
[:selector [0 :type] [:id]]
[:selector [0 :name] [:id]]
[:selector [0 :addresses] [:id]]
[:selector [0 :port] [:long]]
[:selector [0 :publish] [:void]]
;;FIXME: NSNetServiceOptions in publishWithOptions:
[:selector [0 :resolve] [:void]]
[:selector [0 :stop] [:void]]
[:selector [1 :dictionaryFromTXTRecordData] [:id :id]]
[:selector [1 :dataFromTXTRecordDictionary] [:id :id]]
[:selector [0 :hostName] [:id]]
[:selector [1 :resolveWithTimeout] [:void :double]]
;;FIXME: NSInputStream ** in getInputStream:outputStream:
[:selector [1 :setTXTRecordData] [Boolean :id]]
[:selector [0 :TXTRecordData] [:id]]
[:selector [0 :startMonitoring] [:void]]
[:selector [0 :stopMonitoring] [:void]]
[:selector [0 :init] [:id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
[:selector [0 :searchForBrowsableDomains] [:void]]
[:selector [0 :searchForRegistrationDomains] [:void]]
[:selector [2 :searchForServicesOfType :inDomain] [:void :id :id]]
[:selector [0 :stop] [:void]]
[:selector [0 :defaultStore] [:id]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [1 :stringForKey] [:id :id]]
[:selector [1 :arrayForKey] [:id :id]]
[:selector [1 :dictionaryForKey] [:id :id]]
[:selector [1 :dataForKey] [:id :id]]
[:selector [1 :longLongForKey] [:long-long :id]]
[:selector [1 :doubleForKey] [:double :id]]
[:selector [1 :boolForKey] [Boolean :id]]
[:selector [2 :setString :forKey] [:void :id :id]]
[:selector [2 :setData :forKey] [:void :id :id]]
[:selector [2 :setArray :forKey] [:void :id :id]]
[:selector [2 :setDictionary :forKey] [:void :id :id]]
[:selector [2 :setLongLong :forKey] [:void :long-long :id]]
[:selector [2 :setDouble :forKey] [:void :double :id]]
[:selector [2 :setBool :forKey] [:void Boolean :id]]
[:selector [0 :dictionaryRepresentation] [:id]]
[:selector [0 :synchronize] [Boolean]]
[:selector [0 :beginUndoGrouping] [:void]]
[:selector [0 :endUndoGrouping] [:void]]
[:selector [0 :groupingLevel] [:long]]
[:selector [0 :disableUndoRegistration] [:void]]
[:selector [0 :enableUndoRegistration] [:void]]
[:selector [0 :isUndoRegistrationEnabled] [Boolean]]
[:selector [0 :groupsByEvent] [Boolean]]
[:selector [1 :setGroupsByEvent] [:void Boolean]]
[:selector [1 :setLevelsOfUndo] [:void :unsigned-long]]
[:selector [0 :levelsOfUndo] [:unsigned-long]]
[:selector [1 :setRunLoopModes] [:void :id]]
[:selector [0 :runLoopModes] [:id]]
[:selector [0 :undo] [:void]]
[:selector [0 :redo] [:void]]
[:selector [0 :undoNestedGroup] [:void]]
[:selector [0 :canUndo] [Boolean]]
[:selector [0 :canRedo] [Boolean]]
[:selector [0 :isUndoing] [Boolean]]
[:selector [0 :isRedoing] [Boolean]]
[:selector [0 :removeAllActions] [:void]]
[:selector [1 :removeAllActionsWithTarget] [:void :id]]
[:selector [3 :registerUndoWithTarget :selector :object] [:void :id :selector :id]]
[:selector [1 :prepareWithInvocationTarget] [:id :id]]
[:selector [1 :setActionIsDiscardable] [:void Boolean]]
[:selector [0 :undoActionIsDiscardable] [Boolean]]
[:selector [0 :redoActionIsDiscardable] [Boolean]]
[:selector [0 :undoActionName] [:id]]
[:selector [0 :redoActionName] [:id]]
[:selector [1 :setActionName] [:void :id]]
[:selector [0 :undoMenuItemTitle] [:id]]
[:selector [0 :redoMenuItemTitle] [:id]]
[:selector [1 :undoMenuTitleForUndoActionName] [:id :id]]
[:selector [1 :redoMenuTitleForUndoActionName] [:id :id]]
[:selector [0 :UUID] [:id]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithUUIDString] [:id :id]]
;;FIXME: const uuid_t in initWithUUIDBytes:
;;FIXME: uuid_t in getUUIDBytes:
[:selector [0 :UUIDString] [:id]]
[:selector [1 :initForWritingWithMutableData] [:id :id]]
[:selector [0 :archiverData] [:id]]
[:selector [1 :encodeRootObject] [:void :id]]
[:selector [1 :encodeConditionalObject] [:void :id]]
[:selector [1 :archivedDataWithRootObject] [:id :id]]
[:selector [2 :archiveRootObject :toFile] [Boolean :id :id]]
[:selector [2 :encodeClassName :intoClassName] [:void :id :id]]
[:selector [1 :classNameEncodedForTrueClassName] [:id :id]]
[:selector [2 :replaceObject :withObject] [:void :id :id]]
[:selector [1 :initForReadingWithData] [:id :id]]
;;FIXME: NSZone * in setObjectZone:
;;FIXME: NSZone * in objectZone
[:selector [0 :isAtEnd] [Boolean]]
[:selector [0 :systemVersion] [:unsigned-int]]
[:selector [1 :unarchiveObjectWithData] [:id :id]]
[:selector [1 :unarchiveObjectWithFile] [:id :id]]
[:selector [2 :decodeClassName :asClassName] [:void :id :id]]
[:selector [2 :decodeClassName :asClassName] [:void :id :id]]
[:selector [1 :classNameDecodedForArchiveClassName] [:id :id]]
[:selector [1 :classNameDecodedForArchiveClassName] [:id :id]]
[:selector [2 :replaceObject :withObject] [:void :id :id]]
[:selector [0 :calendarDate] [:id]]
[:selector [3 :dateWithString :calendarFormat :locale] [:id :id :id :id]]
[:selector [2 :dateWithString :calendarFormat] [:id :id :id]]
[:selector [7 :dateWithYear :month :day :hour :minute :second :timeZone] [:id :long :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long :id]]
[:selector [6 :dateByAddingYears :months :days :hours :minutes :seconds] [:id :long :long :long :long :long :long]]
[:selector [0 :dayOfCommonEra] [:long]]
[:selector [0 :dayOfMonth] [:long]]
[:selector [0 :dayOfWeek] [:long]]
[:selector [0 :dayOfYear] [:long]]
[:selector [0 :hourOfDay] [:long]]
[:selector [0 :minuteOfHour] [:long]]
[:selector [0 :monthOfYear] [:long]]
[:selector [0 :secondOfMinute] [:long]]
[:selector [0 :yearOfCommonEra] [:long]]
[:selector [0 :calendarFormat] [:id]]
[:selector [2 :descriptionWithCalendarFormat :locale] [:id :id :id]]
[:selector [1 :descriptionWithCalendarFormat] [:id :id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [0 :timeZone] [:id]]
[:selector [3 :initWithString :calendarFormat :locale] [:id :id :id :id]]
[:selector [2 :initWithString :calendarFormat] [:id :id :id]]
[:selector [1 :initWithString] [:id :id]]
[:selector [7 :initWithYear :month :day :hour :minute :second :timeZone] [:id :long :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long :id]]
[:selector [1 :setCalendarFormat] [:void :id]]
[:selector [1 :setTimeZone] [:void :id]]
;;FIXME: NSInteger * in years:months:days:hours:minutes:seconds:sinceDate:
[:selector [0 :statistics] [:id]]
[:selector [0 :allConnections] [:id]]
[:selector [0 :defaultConnection] [:id]]
[:selector [2 :connectionWithRegisteredName :host] [:id :id :id]]
[:selector [3 :connectionWithRegisteredName :host :usingNameServer] [:id :id :id :id]]
[:selector [2 :rootProxyForConnectionWithRegisteredName :host] [:id :id :id]]
[:selector [3 :rootProxyForConnectionWithRegisteredName :host :usingNameServer] [:id :id :id :id]]
[:selector [3 :serviceConnectionWithName :rootObject :usingNameServer] [:id :id :id :id]]
[:selector [2 :serviceConnectionWithName :rootObject] [:id :id :id]]
[:selector [1 :setRequestTimeout] [:void :double]]
[:selector [0 :requestTimeout] [:double]]
[:selector [1 :setReplyTimeout] [:void :double]]
[:selector [0 :replyTimeout] [:double]]
[:selector [1 :setRootObject] [:void :id]]
[:selector [0 :rootObject] [:id]]
[:selector [0 :rootProxy] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setIndependentConversationQueueing] [:void Boolean]]
[:selector [0 :independentConversationQueueing] [Boolean]]
[:selector [0 :isValid] [Boolean]]
[:selector [0 :invalidate] [:void]]
[:selector [1 :addRequestMode] [:void :id]]
[:selector [1 :removeRequestMode] [:void :id]]
[:selector [0 :requestModes] [:id]]
[:selector [1 :registerName] [Boolean :id]]
[:selector [2 :registerName :withNameServer] [Boolean :id :id]]
[:selector [2 :connectionWithReceivePort :sendPort] [:id :id :id]]
[:selector [0 :currentConversation] [:id]]
[:selector [2 :initWithReceivePort :sendPort] [:id :id :id]]
[:selector [0 :sendPort] [:id]]
[:selector [0 :receivePort] [:id]]
[:selector [0 :enableMultipleThreads] [:void]]
[:selector [0 :multipleThreadsEnabled] [Boolean]]
[:selector [1 :addRunLoop] [:void :id]]
[:selector [1 :removeRunLoop] [:void :id]]
[:selector [0 :runInNewThread] [:void]]
[:selector [0 :remoteObjects] [:id]]
[:selector [0 :localObjects] [:id]]
[:selector [1 :dispatchWithComponents] [:void :id]]
[:selector [0 :invocation] [:id]]
[:selector [0 :connection] [:id]]
[:selector [0 :conversation] [:id]]
[:selector [1 :replyWithException] [:void :id]]
[:selector [2 :proxyWithTarget :connection] [:id :id :id]]
[:selector [2 :initWithTarget :connection] [:id :id :id]]
[:selector [2 :proxyWithLocal :connection] [:id :id :id]]
[:selector [2 :initWithLocal :connection] [:id :id :id]]
[:selector [1 :setProtocolForProxy] [:void :id]]
[:selector [0 :connectionForProxy] [:id]]
[:selector [1 :notificationCenterForType] [:id :id]]
[:selector [0 :defaultCenter] [:id]]
;;FIXME: NSNotificationSuspensionBehavior in addObserver:selector:name:object:suspensionBehavior:
[:selector [4 :postNotificationName :object :userInfo :deliverImmediately] [:void :id :id :id Boolean]]
[:selector [4 :postNotificationName :object :userInfo :options] [:void :id :id :id :unsigned-long]]
[:selector [1 :setSuspended] [:void Boolean]]
[:selector [0 :suspended] [Boolean]]
[:selector [4 :addObserver :selector :name :object] [:void :id :selector :id :id]]
[:selector [2 :postNotificationName :object] [:void :id :id]]
[:selector [3 :postNotificationName :object :userInfo] [:void :id :id :id]]
[:selector [3 :removeObserver :name :object] [:void :id :id :id]]
[:selector [0 :isBycopy] [Boolean]]
[:selector [0 :isByref] [Boolean]]
[:selector [1 :encodePortObject] [:void :id]]
[:selector [0 :decodePortObject] [:id]]
[:selector [0 :connection] [:id]]
[:selector [3 :portCoderWithReceivePort :sendPort :components] [:id :id :id :id]]
[:selector [3 :initWithReceivePort :sendPort :components] [:id :id :id :id]]
[:selector [0 :dispatch] [:void]]
[:selector [3 :initWithSendPort :receivePort :components] [:id :id :id :id]]
[:selector [0 :components] [:id]]
[:selector [0 :receivePort] [:id]]
[:selector [0 :sendPort] [:id]]
[:selector [1 :sendBeforeDate] [Boolean :id]]
[:selector [0 :msgid] [:unsigned-int]]
[:selector [1 :setMsgid] [:void :unsigned-int]]
[:selector [0 :systemDefaultPortNameServer] [:id]]
[:selector [1 :portForName] [:id :id]]
[:selector [2 :portForName :host] [:id :id :id]]
[:selector [2 :registerPort :name] [Boolean :id :id]]
[:selector [1 :removePortForName] [Boolean :id]]
[:selector [0 :sharedInstance] [:id]]
[:selector [1 :portForName] [:id :id]]
[:selector [2 :portForName :host] [:id :id :id]]
[:selector [2 :registerPort :name] [Boolean :id :id]]
[:selector [1 :servicePortWithName] [:id :id]]
[:selector [0 :sharedInstance] [:id]]
[:selector [1 :portForName] [:id :id]]
[:selector [2 :portForName :host] [:id :id :id]]
[:selector [0 :sharedInstance] [:id]]
[:selector [1 :portForName] [:id :id]]
[:selector [2 :portForName :host] [:id :id :id]]
[:selector [2 :registerPort :name] [Boolean :id :id]]
[:selector [1 :removePortForName] [Boolean :id]]
[:selector [3 :portForName :host :nameServerPortNumber] [:id :id :id :unsigned-short]]
[:selector [3 :registerPort :name :nameServerPortNumber] [Boolean :id :id :unsigned-short]]
[:selector [1 :setDefaultNameServerPortNumber] [:void :unsigned-short]]
[:selector [0 :defaultNameServerPortNumber] [:unsigned-short]]
[:selector [0 :protocol] [:id]]
[:selector [0 :target] [:id]]
[:selector [0 :init] [:id]]
[:selector [1 :setLaunchPath] [:void :id]]
[:selector [1 :setArguments] [:void :id]]
[:selector [1 :setEnvironment] [:void :id]]
[:selector [1 :setCurrentDirectoryPath] [:void :id]]
[:selector [1 :setStandardInput] [:void :id]]
[:selector [1 :setStandardOutput] [:void :id]]
[:selector [1 :setStandardError] [:void :id]]
[:selector [0 :launchPath] [:id]]
[:selector [0 :arguments] [:id]]
[:selector [0 :environment] [:id]]
[:selector [0 :currentDirectoryPath] [:id]]
[:selector [0 :standardInput] [:id]]
[:selector [0 :standardOutput] [:id]]
[:selector [0 :standardError] [:id]]
[:selector [0 :launch] [:void]]
[:selector [0 :interrupt] [:void]]
[:selector [0 :terminate] [:void]]
[:selector [0 :suspend] [Boolean]]
[:selector [0 :resume] [Boolean]]
[:selector [0 :processIdentifier] [:int]]
[:selector [0 :isRunning] [Boolean]]
[:selector [0 :terminationStatus] [:int]]
;;FIXME: NSTaskTerminationReason in terminationReason
;;FIXME: void (^)(NSTask *) in terminationHandler
;;FIXME: void (^)(NSTask *) in setTerminationHandler:
;;FIXME: NSXMLNodeKind in initWithKind:
;;FIXME: NSXMLNodeKind in initWithKind:options:
[:selector [0 :document] [:id]]
[:selector [1 :documentWithRootElement] [:id :id]]
[:selector [1 :elementWithName] [:id :id]]
[:selector [2 :elementWithName :URI] [:id :id :id]]
[:selector [2 :elementWithName :stringValue] [:id :id :id]]
[:selector [3 :elementWithName :children :attributes] [:id :id :id :id]]
[:selector [2 :attributeWithName :stringValue] [:id :id :id]]
[:selector [3 :attributeWithName :URI :stringValue] [:id :id :id :id]]
[:selector [2 :namespaceWithName :stringValue] [:id :id :id]]
[:selector [2 :processingInstructionWithName :stringValue] [:id :id :id]]
[:selector [1 :commentWithStringValue] [:id :id]]
[:selector [1 :textWithStringValue] [:id :id]]
[:selector [1 :DTDNodeWithXMLString] [:id :id]]
;;FIXME: NSXMLNodeKind in kind
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [1 :setObjectValue] [:void :id]]
[:selector [0 :objectValue] [:id]]
[:selector [1 :setStringValue] [:void :id]]
[:selector [2 :setStringValue :resolvingEntities] [:void :id Boolean]]
[:selector [0 :stringValue] [:id]]
[:selector [0 :index] [:unsigned-long]]
[:selector [0 :level] [:unsigned-long]]
[:selector [0 :rootDocument] [:id]]
[:selector [0 :parent] [:id]]
[:selector [0 :childCount] [:unsigned-long]]
[:selector [0 :children] [:id]]
[:selector [1 :childAtIndex] [:id :unsigned-long]]
[:selector [0 :previousSibling] [:id]]
[:selector [0 :nextSibling] [:id]]
[:selector [0 :previousNode] [:id]]
[:selector [0 :nextNode] [:id]]
[:selector [0 :detach] [:void]]
[:selector [0 :XPath] [:id]]
[:selector [0 :localName] [:id]]
[:selector [0 :prefix] [:id]]
[:selector [1 :setURI] [:void :id]]
[:selector [0 :URI] [:id]]
[:selector [1 :localNameForName] [:id :id]]
[:selector [1 :prefixForName] [:id :id]]
[:selector [1 :predefinedNamespaceForPrefix] [:id :id]]
[:selector [0 :description] [:id]]
[:selector [0 :XMLString] [:id]]
[:selector [1 :XMLStringWithOptions] [:id :unsigned-long]]
[:selector [1 :canonicalXMLStringPreservingComments] [:id Boolean]]
;;FIXME: NSError ** in nodesForXPath:error:
;;FIXME: NSError ** in objectsForXQuery:constants:error:
;;FIXME: NSError ** in objectsForXQuery:error:
;;FIXME: NSError ** in initWithContentsOfURL:options:error:
;;FIXME: NSError ** in initWithData:options:error:
[:selector [1 :setPublicID] [:void :id]]
[:selector [0 :publicID] [:id]]
[:selector [1 :setSystemID] [:void :id]]
[:selector [0 :systemID] [:id]]
[:selector [2 :insertChild :atIndex] [:void :id :unsigned-long]]
[:selector [2 :insertChildren :atIndex] [:void :id :unsigned-long]]
[:selector [1 :removeChildAtIndex] [:void :unsigned-long]]
[:selector [1 :setChildren] [:void :id]]
[:selector [1 :addChild] [:void :id]]
[:selector [2 :replaceChildAtIndex :withNode] [:void :unsigned-long :id]]
[:selector [1 :entityDeclarationForName] [:id :id]]
[:selector [1 :notationDeclarationForName] [:id :id]]
[:selector [1 :elementDeclarationForName] [:id :id]]
[:selector [2 :attributeDeclarationForName :elementName] [:id :id :id]]
[:selector [1 :predefinedEntityDeclarationForName] [:id :id]]
[:selector [1 :initWithXMLString] [:id :id]]
;;FIXME: NSXMLDTDNodeKind in setDTDKind:
;;FIXME: NSXMLDTDNodeKind in DTDKind
[:selector [0 :isExternal] [Boolean]]
[:selector [1 :setPublicID] [:void :id]]
[:selector [0 :publicID] [:id]]
[:selector [1 :setSystemID] [:void :id]]
[:selector [0 :systemID] [:id]]
[:selector [1 :setNotationName] [:void :id]]
[:selector [0 :notationName] [:id]]
;;FIXME: NSError ** in initWithXMLString:options:error:
;;FIXME: NSError ** in initWithContentsOfURL:options:error:
;;FIXME: NSError ** in initWithData:options:error:
[:selector [1 :initWithRootElement] [:id :id]]
[:selector [1 :replacementClassForClass] [:id :id]]
[:selector [1 :setCharacterEncoding] [:void :id]]
[:selector [0 :characterEncoding] [:id]]
[:selector [1 :setVersion] [:void :id]]
[:selector [0 :version] [:id]]
[:selector [1 :setStandalone] [:void Boolean]]
[:selector [0 :isStandalone] [Boolean]]
;;FIXME: NSXMLDocumentContentKind in setDocumentContentKind:
;;FIXME: NSXMLDocumentContentKind in documentContentKind
[:selector [1 :setMIMEType] [:void :id]]
[:selector [0 :MIMEType] [:id]]
[:selector [1 :setDTD] [:void :id]]
[:selector [0 :DTD] [:id]]
[:selector [1 :setRootElement] [:void :id]]
[:selector [0 :rootElement] [:id]]
[:selector [2 :insertChild :atIndex] [:void :id :unsigned-long]]
[:selector [2 :insertChildren :atIndex] [:void :id :unsigned-long]]
[:selector [1 :removeChildAtIndex] [:void :unsigned-long]]
[:selector [1 :setChildren] [:void :id]]
[:selector [1 :addChild] [:void :id]]
[:selector [2 :replaceChildAtIndex :withNode] [:void :unsigned-long :id]]
[:selector [0 :XMLData] [:id]]
[:selector [1 :XMLDataWithOptions] [:id :unsigned-long]]
;;FIXME: NSError ** in objectByApplyingXSLT:arguments:error:
;;FIXME: NSError ** in objectByApplyingXSLTString:arguments:error:
;;FIXME: NSError ** in objectByApplyingXSLTAtURL:arguments:error:
;;FIXME: NSError ** in validateAndReturnError:
[:selector [1 :initWithName] [:id :id]]
[:selector [2 :initWithName :URI] [:id :id :id]]
[:selector [2 :initWithName :stringValue] [:id :id :id]]
;;FIXME: NSError ** in initWithXMLString:error:
[:selector [1 :elementsForName] [:id :id]]
[:selector [2 :elementsForLocalName :URI] [:id :id :id]]
[:selector [1 :addAttribute] [:void :id]]
[:selector [1 :removeAttributeForName] [:void :id]]
[:selector [1 :setAttributes] [:void :id]]
[:selector [1 :setAttributesWithDictionary] [:void :id]]
[:selector [0 :attributes] [:id]]
[:selector [1 :attributeForName] [:id :id]]
[:selector [2 :attributeForLocalName :URI] [:id :id :id]]
[:selector [1 :addNamespace] [:void :id]]
[:selector [1 :removeNamespaceForPrefix] [:void :id]]
[:selector [1 :setNamespaces] [:void :id]]
[:selector [0 :namespaces] [:id]]
[:selector [1 :namespaceForPrefix] [:id :id]]
[:selector [1 :resolveNamespaceForName] [:id :id]]
[:selector [1 :resolvePrefixForNamespaceURI] [:id :id]]
[:selector [2 :insertChild :atIndex] [:void :id :unsigned-long]]
[:selector [2 :insertChildren :atIndex] [:void :id :unsigned-long]]
[:selector [1 :removeChildAtIndex] [:void :unsigned-long]]
[:selector [1 :setChildren] [:void :id]]
[:selector [1 :addChild] [:void :id]]
[:selector [2 :replaceChildAtIndex :withNode] [:void :unsigned-long :id]]
[:selector [1 :normalizeAdjacentTextNodesPreservingCDATA] [:void Boolean]]
[:selector [1 :canResumeDownloadDecodedWithEncodingMIMEType] [Boolean :id]]
[:selector [2 :initWithRequest :delegate] [:id :id :id]]
[:selector [3 :initWithResumeData :delegate :path] [:id :id :id :id]]
[:selector [0 :cancel] [:void]]
[:selector [2 :setDestination :allowOverwrite] [:void :id Boolean]]
[:selector [0 :request] [:id]]
[:selector [0 :resumeData] [:id]]
[:selector [1 :setDeletesFileUponFailure] [:void Boolean]]
[:selector [0 :deletesFileUponFailure] [Boolean]]
[:compound CGAffineTransform "sizeof (CGAffineTransform)"]
[:function CGAffineTransformMake [Foundation/CGAffineTransform :double :double :double :double :double :double]]
[:function CGAffineTransformMakeTranslation [Foundation/CGAffineTransform :double :double]]
[:function CGAffineTransformMakeScale [Foundation/CGAffineTransform :double :double]]
[:function CGAffineTransformMakeRotation [Foundation/CGAffineTransform :double]]
[:function CGAffineTransformIsIdentity [Boolean Foundation/CGAffineTransform]]
[:function CGAffineTransformTranslate [Foundation/CGAffineTransform Foundation/CGAffineTransform :double :double]]
[:function CGAffineTransformScale [Foundation/CGAffineTransform Foundation/CGAffineTransform :double :double]]
[:function CGAffineTransformRotate [Foundation/CGAffineTransform Foundation/CGAffineTransform :double]]
[:function CGAffineTransformInvert [Foundation/CGAffineTransform Foundation/CGAffineTransform]]
[:function CGAffineTransformConcat [Foundation/CGAffineTransform Foundation/CGAffineTransform Foundation/CGAffineTransform]]
[:function CGAffineTransformEqualToTransform [Boolean Foundation/CGAffineTransform Foundation/CGAffineTransform]]
[:function CGPointApplyAffineTransform [Foundation/CGPoint Foundation/CGPoint Foundation/CGAffineTransform]]
[:function CGSizeApplyAffineTransform [Foundation/CGSize Foundation/CGSize Foundation/CGAffineTransform]]
[:function CGRectApplyAffineTransform [Foundation/CGRect Foundation/CGRect Foundation/CGAffineTransform]]
[:function __CGAffineTransformMake [Foundation/CGAffineTransform :double :double :double :double :double :double]]
[:function __CGPointApplyAffineTransform [Foundation/CGPoint Foundation/CGPoint Foundation/CGAffineTransform]]
[:function __CGSizeApplyAffineTransform [Foundation/CGSize Foundation/CGSize Foundation/CGAffineTransform]]
[:compound NSAffineTransformStruct "sizeof (NSAffineTransformStruct)"]
[:selector [0 :transform] [:id]]
[:selector [1 :initWithTransform] [:id :id]]
[:selector [2 :translateXBy :yBy] [:void :double :double]]
[:selector [1 :rotateByDegrees] [:void :double]]
[:selector [1 :rotateByRadians] [:void :double]]
[:selector [1 :scaleBy] [:void :double]]
[:selector [2 :scaleXBy :yBy] [:void :double :double]]
[:selector [0 :invert] [:void]]
[:selector [1 :appendTransform] [:void :id]]
[:selector [1 :prependTransform] [:void :id]]
;;FIXME: NSPoint in transformPoint:
;;FIXME: NSSize in transformSize:
[:selector [0 :transformStruct] [Foundation/NSAffineTransformStruct]]
[:selector [1 :setTransformStruct] [:void Foundation/NSAffineTransformStruct]]
[:compound SFNTLookupBinarySearchHeader "sizeof (SFNTLookupBinarySearchHeader)"]
[:compound SFNTLookupArrayHeader "sizeof (SFNTLookupArrayHeader)"]
[:compound SFNTLookupTrimmedArrayHeader "sizeof (SFNTLookupTrimmedArrayHeader)"]
[:compound SFNTLookupSegment "sizeof (SFNTLookupSegment)"]
[:compound SFNTLookupSegmentHeader "sizeof (SFNTLookupSegmentHeader)"]
[:compound SFNTLookupSingle "sizeof (SFNTLookupSingle)"]
[:compound SFNTLookupSingleHeader "sizeof (SFNTLookupSingleHeader)"]
[:compound SFNTLookupFormatSpecificHeader "sizeof (SFNTLookupFormatSpecificHeader)"]
[:compound SFNTLookupTable "sizeof (SFNTLookupTable)"]
[:compound STHeader "sizeof (STHeader)"]
[:compound STClassTable "sizeof (STClassTable)"]
[:compound STEntryZero "sizeof (STEntryZero)"]
[:compound STEntryOne "sizeof (STEntryOne)"]
[:compound STEntryTwo "sizeof (STEntryTwo)"]
[:compound STXHeader "sizeof (STXHeader)"]
[:compound STXEntryZero "sizeof (STXEntryZero)"]
[:compound STXEntryOne "sizeof (STXEntryOne)"]
[:compound STXEntryTwo "sizeof (STXEntryTwo)"]
[:compound LcarCaretClassEntry "sizeof (LcarCaretClassEntry)"]
[:compound LcarCaretTable "sizeof (LcarCaretTable)"]
[:compound JustPCDecompositionAction "sizeof (JustPCDecompositionAction)"]
[:compound JustPCConditionalAddAction "sizeof (JustPCConditionalAddAction)"]
[:compound JustPCDuctilityAction "sizeof (JustPCDuctilityAction)"]
[:compound JustPCGlyphRepeatAddAction "sizeof (JustPCGlyphRepeatAddAction)"]
[:compound JustPCActionSubrecord "sizeof (JustPCActionSubrecord)"]
[:compound JustPCAction "sizeof (JustPCAction)"]
[:compound JustWidthDeltaEntry "sizeof (JustWidthDeltaEntry)"]
[:compound JustWidthDeltaGroup "sizeof (JustWidthDeltaGroup)"]
[:compound JustPostcompTable "sizeof (JustPostcompTable)"]
[:compound JustDirectionTable "sizeof (JustDirectionTable)"]
[:compound JustTable "sizeof (JustTable)"]
[:compound OpbdSideValues "sizeof (OpbdSideValues)"]
[:compound OpbdTable "sizeof (OpbdTable)"]
[:compound MortRearrangementSubtable "sizeof (MortRearrangementSubtable)"]
[:compound MortContextualSubtable "sizeof (MortContextualSubtable)"]
[:compound MortLigatureSubtable "sizeof (MortLigatureSubtable)"]
[:compound MortSwashSubtable "sizeof (MortSwashSubtable)"]
[:compound MortInsertionSubtable "sizeof (MortInsertionSubtable)"]
[:compound MortSpecificSubtable "sizeof (MortSpecificSubtable)"]
[:compound MortSubtable "sizeof (MortSubtable)"]
[:compound MortFeatureEntry "sizeof (MortFeatureEntry)"]
[:compound MortChain "sizeof (MortChain)"]
[:compound MortTable "sizeof (MortTable)"]
[:compound MorxRearrangementSubtable "sizeof (MorxRearrangementSubtable)"]
[:compound MorxContextualSubtable "sizeof (MorxContextualSubtable)"]
[:compound MorxLigatureSubtable "sizeof (MorxLigatureSubtable)"]
[:compound MorxInsertionSubtable "sizeof (MorxInsertionSubtable)"]
[:compound MorxSpecificSubtable "sizeof (MorxSpecificSubtable)"]
[:compound MorxSubtable "sizeof (MorxSubtable)"]
[:compound MorxChain "sizeof (MorxChain)"]
[:compound MorxTable "sizeof (MorxTable)"]
[:compound PropTable "sizeof (PropTable)"]
[:compound PropLookupSegment "sizeof (PropLookupSegment)"]
[:compound PropLookupSingle "sizeof (PropLookupSingle)"]
[:compound TrakTableEntry "sizeof (TrakTableEntry)"]
[:compound TrakTableData "sizeof (TrakTableData)"]
[:compound TrakTable "sizeof (TrakTable)"]
[:compound KernVersion0Header "sizeof (KernVersion0Header)"]
[:compound KernTableHeader "sizeof (KernTableHeader)"]
[:compound KernKerningPair "sizeof (KernKerningPair)"]
[:compound KernOrderedListEntry "sizeof (KernOrderedListEntry)"]
[:compound KernOrderedListHeader "sizeof (KernOrderedListHeader)"]
[:compound KernStateHeader "sizeof (KernStateHeader)"]
[:compound KernStateEntry "sizeof (KernStateEntry)"]
[:compound KernOffsetTable "sizeof (KernOffsetTable)"]
[:compound KernSimpleArrayHeader "sizeof (KernSimpleArrayHeader)"]
[:compound KernIndexArrayHeader "sizeof (KernIndexArrayHeader)"]
[:compound KernFormatSpecificHeader "sizeof (KernFormatSpecificHeader)"]
[:compound KernVersion0SubtableHeader "sizeof (KernVersion0SubtableHeader)"]
[:compound KernSubtableHeader "sizeof (KernSubtableHeader)"]
[:compound KerxTableHeader "sizeof (KerxTableHeader)"]
[:compound KerxKerningPair "sizeof (KerxKerningPair)"]
[:compound KerxOrderedListEntry "sizeof (KerxOrderedListEntry)"]
[:compound KerxOrderedListHeader "sizeof (KerxOrderedListHeader)"]
[:compound KerxStateHeader "sizeof (KerxStateHeader)"]
[:compound KerxStateEntry "sizeof (KerxStateEntry)"]
[:compound KerxControlPointHeader "sizeof (KerxControlPointHeader)"]
[:compound KerxControlPointEntry "sizeof (KerxControlPointEntry)"]
[:compound KerxControlPointAction "sizeof (KerxControlPointAction)"]
[:compound KerxAnchorPointAction "sizeof (KerxAnchorPointAction)"]
[:compound KerxCoordinateAction "sizeof (KerxCoordinateAction)"]
[:compound KerxOffsetTable "sizeof (KerxOffsetTable)"]
[:compound KerxSimpleArrayHeader "sizeof (KerxSimpleArrayHeader)"]
[:compound KerxIndexArrayHeader "sizeof (KerxIndexArrayHeader)"]
[:compound KerxFormatSpecificHeader "sizeof (KerxFormatSpecificHeader)"]
[:compound KerxSubtableHeader "sizeof (KerxSubtableHeader)"]
[:compound BslnFormat0Part "sizeof (BslnFormat0Part)"]
[:compound BslnFormat1Part "sizeof (BslnFormat1Part)"]
[:compound BslnFormat2Part "sizeof (BslnFormat2Part)"]
[:compound BslnFormat3Part "sizeof (BslnFormat3Part)"]
[:compound BslnFormatUnion "sizeof (BslnFormatUnion)"]
[:compound BslnTable "sizeof (BslnTable)"]
[:compound ALMXHeader "sizeof (ALMXHeader)"]
[:compound ALMXGlyphEntry "sizeof (ALMXGlyphEntry)"]
[:compound ROTAHeader "sizeof (ROTAHeader)"]
[:compound ROTAGlyphEntry "sizeof (ROTAGlyphEntry)"]
[:compound AnchorPoint "sizeof (AnchorPoint)"]
[:compound AnchorPointTable "sizeof (AnchorPointTable)"]
[:compound AnkrTable "sizeof (AnkrTable)"]
[:compound ATSFSSpec "sizeof (ATSFSSpec)"]
[:compound FMFontFamilyInstance "sizeof (FMFontFamilyInstance)"]
[:compound FMFontFamilyIterator "sizeof (FMFontFamilyIterator)"]
[:compound FMFontIterator "sizeof (FMFontIterator)"]
[:compound FMFontFamilyInstanceIterator "sizeof (FMFontFamilyInstanceIterator)"]
;;FIXME: FMFontFamilyCallbackFilterUPP in NewFMFontFamilyCallbackFilterUPP
;;FIXME: FMFontCallbackFilterUPP in NewFMFontCallbackFilterUPP
;;FIXME: FMFontFamilyCallbackFilterUPP in DisposeFMFontFamilyCallbackFilterUPP
;;FIXME: FMFontCallbackFilterUPP in DisposeFMFontCallbackFilterUPP
;;FIXME: void * in InvokeFMFontFamilyCallbackFilterUPP
;;FIXME: void * in InvokeFMFontCallbackFilterUPP
[:compound FMFontDirectoryFilter "sizeof (FMFontDirectoryFilter)"]
[:compound FMFilter "sizeof (FMFilter)"]
[:compound ATSFontMetrics "sizeof (ATSFontMetrics)"]
[:compound ATSUCurvePath "sizeof (ATSUCurvePath)"]
[:compound ATSUCurvePaths "sizeof (ATSUCurvePaths)"]
[:compound ATSGlyphIdealMetrics "sizeof (ATSGlyphIdealMetrics)"]
[:compound ATSGlyphScreenMetrics "sizeof (ATSGlyphScreenMetrics)"]
[:compound ATSLayoutRecord "sizeof (ATSLayoutRecord)"]
[:compound ATSTrapezoid "sizeof (ATSTrapezoid)"]
[:compound ATSJustWidthDeltaEntryOverride "sizeof (ATSJustWidthDeltaEntryOverride)"]
;;FIXME: ATSUDirectLayoutOperationOverrideUPP in NewATSUDirectLayoutOperationOverrideUPP
;;FIXME: ATSUDirectLayoutOperationOverrideUPP in DisposeATSUDirectLayoutOperationOverrideUPP
;;FIXME: ATSULineRef in InvokeATSUDirectLayoutOperationOverrideUPP
[:compound ATSULayoutOperationOverrideSpecifier "sizeof (ATSULayoutOperationOverrideSpecifier)"]
[:compound sfntDirectoryEntry "sizeof (sfntDirectoryEntry)"]
[:compound sfntDirectory "sizeof (sfntDirectory)"]
[:compound sfntCMapSubHeader "sizeof (sfntCMapSubHeader)"]
[:compound sfntCMapExtendedSubHeader "sizeof (sfntCMapExtendedSubHeader)"]
[:compound sfntCMapEncoding "sizeof (sfntCMapEncoding)"]
[:compound sfntCMapHeader "sizeof (sfntCMapHeader)"]
[:compound sfntNameRecord "sizeof (sfntNameRecord)"]
[:compound sfntNameHeader "sizeof (sfntNameHeader)"]
[:compound sfntVariationAxis "sizeof (sfntVariationAxis)"]
[:compound sfntInstance "sizeof (sfntInstance)"]
[:compound sfntVariationHeader "sizeof (sfntVariationHeader)"]
[:compound sfntFontDescriptor "sizeof (sfntFontDescriptor)"]
[:compound sfntDescriptorHeader "sizeof (sfntDescriptorHeader)"]
[:compound sfntFeatureName "sizeof (sfntFeatureName)"]
[:compound sfntFontFeatureSetting "sizeof (sfntFontFeatureSetting)"]
[:compound sfntFontRunFeature "sizeof (sfntFontRunFeature)"]
[:compound sfntFeatureHeader "sizeof (sfntFeatureHeader)"]
[:compound FontVariation "sizeof (FontVariation)"]
[:compound ATSFontFilter "sizeof (ATSFontFilter)"]
[:function ATSGetGeneration [:unsigned-int]]
;;FIXME: const FSRef * in ATSFontActivateFromFileReference
;;FIXME: LogicalAddress in ATSFontActivateFromMemory
;;FIXME: void * in ATSFontDeactivate
;;FIXME: const FSRef * in ATSFontGetContainerFromFileReference
;;FIXME: ATSFontContainerRef * in ATSFontGetContainer
[:function ATSFontSetEnabled [:int :unsigned-int :unsigned-int :unsigned-char]]
[:function ATSFontIsEnabled [:unsigned-char :unsigned-int]]
;;FIXME: ATSFontFamilyApplierFunction in ATSFontFamilyApplyFunction
;;FIXME: const ATSFontFilter * in ATSFontFamilyIteratorCreate
;;FIXME: ATSFontFamilyIterator * in ATSFontFamilyIteratorRelease
;;FIXME: const ATSFontFilter * in ATSFontFamilyIteratorReset
;;FIXME: ATSFontFamilyIterator in ATSFontFamilyIteratorNext
;;FIXME: CFStringRef in ATSFontFamilyFindFromName
[:function ATSFontFamilyGetGeneration [:unsigned-int :unsigned-int]]
;;FIXME: CFStringRef * in ATSFontFamilyGetName
[:function ATSFontFamilyGetEncoding [:unsigned-int :unsigned-int]]
;;FIXME: ATSFontApplierFunction in ATSFontApplyFunction
;;FIXME: const ATSFontFilter * in ATSFontIteratorCreate
;;FIXME: ATSFontIterator * in ATSFontIteratorRelease
;;FIXME: const ATSFontFilter * in ATSFontIteratorReset
;;FIXME: ATSFontIterator in ATSFontIteratorNext
;;FIXME: CFStringRef in ATSFontFindFromName
;;FIXME: CFStringRef in ATSFontFindFromPostScriptName
;;FIXME: ATSFontRef [] in ATSFontFindFromContainer
[:function ATSFontGetGeneration [:unsigned-int :unsigned-int]]
;;FIXME: CFStringRef * in ATSFontGetName
;;FIXME: CFStringRef * in ATSFontGetPostScriptName
;;FIXME: void * in ATSFontGetTableDirectory
;;FIXME: void * in ATSFontGetTable
;;FIXME: ATSFontMetrics * in ATSFontGetHorizontalMetrics
;;FIXME: ATSFontMetrics * in ATSFontGetVerticalMetrics
;;FIXME: ConstStr255Param in ATSFontFamilyFindFromQuickDrawName
;;FIXME: Str255 in ATSFontFamilyGetQuickDrawName
;;FIXME: FSRef * in ATSFontGetFileReference
;;FIXME: void * in ATSFontGetFontFamilyResource
;;FIXME: ATSFontNotifyAction in ATSFontNotify
;;FIXME: ATSNotificationCallback in ATSFontNotificationSubscribe
;;FIXME: ATSFontNotificationRef in ATSFontNotificationUnsubscribe
[:compound ATSFontQuerySourceContext "sizeof (ATSFontQuerySourceContext)"]
;;FIXME: CFRunLoopSourceRef in ATSCreateFontQueryRunLoopSource
[:function ATSFontSetGlobalAutoActivationSetting [:int :unsigned-int]]
[:function ATSFontGetGlobalAutoActivationSetting [:unsigned-int]]
;;FIXME: CFURLRef in ATSFontSetAutoActivationSettingForApplication
;;FIXME: CFURLRef in ATSFontGetAutoActivationSettingForApplication
[:compound CGDataProviderSequentialCallbacks "sizeof (CGDataProviderSequentialCallbacks)"]
[:compound CGDataProviderDirectCallbacks "sizeof (CGDataProviderDirectCallbacks)"]
[:function CGDataProviderGetTypeID [:unsigned-long]]
;;FIXME: CGDataProviderRef in CGDataProviderCreateSequential
;;FIXME: CGDataProviderRef in CGDataProviderCreateDirect
;;FIXME: CGDataProviderRef in CGDataProviderCreateWithData
;;FIXME: CGDataProviderRef in CGDataProviderCreateWithCFData
;;FIXME: CGDataProviderRef in CGDataProviderCreateWithURL
;;FIXME: CGDataProviderRef in CGDataProviderCreateWithFilename
;;FIXME: CGDataProviderRef in CGDataProviderRetain
;;FIXME: CGDataProviderRef in CGDataProviderRelease
;;FIXME: CFDataRef in CGDataProviderCopyData
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateDeviceGray
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateDeviceRGB
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateDeviceCMYK
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateCalibratedGray
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateCalibratedRGB
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateLab
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateWithICCProfile
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateICCBased
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateIndexed
;;FIXME: CGColorSpaceRef in CGColorSpaceCreatePattern
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateWithPlatformColorSpace
;;FIXME: CGColorSpaceRef in CGColorSpaceCreateWithName
;;FIXME: CGColorSpaceRef in CGColorSpaceRetain
;;FIXME: CGColorSpaceRef in CGColorSpaceRelease
;;FIXME: CFStringRef in CGColorSpaceCopyName
[:function CGColorSpaceGetTypeID [:unsigned-long]]
;;FIXME: CGColorSpaceRef in CGColorSpaceGetNumberOfComponents
;;FIXME: CGColorSpaceModel in CGColorSpaceGetModel
;;FIXME: CGColorSpaceRef in CGColorSpaceGetBaseColorSpace
;;FIXME: CGColorSpaceRef in CGColorSpaceGetColorTableCount
;;FIXME: CGColorSpaceRef in CGColorSpaceGetColorTable
;;FIXME: CFDataRef in CGColorSpaceCopyICCProfile
[:compound CGPatternCallbacks "sizeof (CGPatternCallbacks)"]
[:function CGPatternGetTypeID [:unsigned-long]]
;;FIXME: CGPatternRef in CGPatternCreate
;;FIXME: CGPatternRef in CGPatternRetain
;;FIXME: CGPatternRef in CGPatternRelease
;;FIXME: CGColorRef in CGColorCreate
;;FIXME: CGColorRef in CGColorCreateGenericGray
;;FIXME: CGColorRef in CGColorCreateGenericRGB
;;FIXME: CGColorRef in CGColorCreateGenericCMYK
;;FIXME: CGColorRef in CGColorGetConstantColor
;;FIXME: CGColorRef in CGColorCreateWithPattern
;;FIXME: CGColorRef in CGColorCreateCopy
;;FIXME: CGColorRef in CGColorCreateCopyWithAlpha
;;FIXME: CGColorRef in CGColorRetain
;;FIXME: CGColorRef in CGColorRelease
;;FIXME: CGColorRef in CGColorEqualToColor
;;FIXME: CGColorRef in CGColorGetNumberOfComponents
;;FIXME: const CGFloat * in CGColorGetComponents
;;FIXME: CGColorRef in CGColorGetAlpha
;;FIXME: CGColorSpaceRef in CGColorGetColorSpace
;;FIXME: CGPatternRef in CGColorGetPattern
[:function CGColorGetTypeID [:unsigned-long]]
[:function CGFontGetTypeID [:unsigned-long]]
;;FIXME: CGFontRef in CGFontCreateWithPlatformFont
;;FIXME: CGFontRef in CGFontCreateWithDataProvider
;;FIXME: CGFontRef in CGFontCreateWithFontName
;;FIXME: CGFontRef in CGFontCreateCopyWithVariations
;;FIXME: CGFontRef in CGFontRetain
;;FIXME: CGFontRef in CGFontRelease
;;FIXME: CGFontRef in CGFontGetNumberOfGlyphs
;;FIXME: CGFontRef in CGFontGetUnitsPerEm
;;FIXME: CFStringRef in CGFontCopyPostScriptName
;;FIXME: CFStringRef in CGFontCopyFullName
;;FIXME: CGFontRef in CGFontGetAscent
;;FIXME: CGFontRef in CGFontGetDescent
;;FIXME: CGFontRef in CGFontGetLeading
;;FIXME: CGFontRef in CGFontGetCapHeight
;;FIXME: CGFontRef in CGFontGetXHeight
;;FIXME: CGFontRef in CGFontGetFontBBox
;;FIXME: CGFontRef in CGFontGetItalicAngle
;;FIXME: CGFontRef in CGFontGetStemV
;;FIXME: CFArrayRef in CGFontCopyVariationAxes
;;FIXME: CFDictionaryRef in CGFontCopyVariations
;;FIXME: CGFontRef in CGFontGetGlyphAdvances
;;FIXME: CGFontRef in CGFontGetGlyphBBoxes
;;FIXME: CGFontRef in CGFontGetGlyphWithGlyphName
;;FIXME: CFStringRef in CGFontCopyGlyphNameForGlyph
;;FIXME: CGFontRef in CGFontCanCreatePostScriptSubset
;;FIXME: CFDataRef in CGFontCreatePostScriptSubset
;;FIXME: CFDataRef in CGFontCreatePostScriptEncoding
;;FIXME: CFArrayRef in CGFontCopyTableTags
;;FIXME: CFDataRef in CGFontCopyTableForTag
[:function CGGradientGetTypeID [:unsigned-long]]
;;FIXME: CGGradientRef in CGGradientCreateWithColorComponents
;;FIXME: CGGradientRef in CGGradientCreateWithColors
;;FIXME: CGGradientRef in CGGradientRetain
;;FIXME: CGGradientRef in CGGradientRelease
[:function CGImageGetTypeID [:unsigned-long]]
;;FIXME: CGImageRef in CGImageCreate
;;FIXME: CGImageRef in CGImageMaskCreate
;;FIXME: CGImageRef in CGImageCreateCopy
;;FIXME: CGImageRef in CGImageCreateWithJPEGDataProvider
;;FIXME: CGImageRef in CGImageCreateWithPNGDataProvider
;;FIXME: CGImageRef in CGImageCreateWithImageInRect
;;FIXME: CGImageRef in CGImageCreateWithMask
;;FIXME: CGImageRef in CGImageCreateWithMaskingColors
;;FIXME: CGImageRef in CGImageCreateCopyWithColorSpace
;;FIXME: CGImageRef in CGImageRetain
;;FIXME: CGImageRef in CGImageRelease
;;FIXME: CGImageRef in CGImageIsMask
;;FIXME: CGImageRef in CGImageGetWidth
;;FIXME: CGImageRef in CGImageGetHeight
;;FIXME: CGImageRef in CGImageGetBitsPerComponent
;;FIXME: CGImageRef in CGImageGetBitsPerPixel
;;FIXME: CGImageRef in CGImageGetBytesPerRow
;;FIXME: CGColorSpaceRef in CGImageGetColorSpace
;;FIXME: CGImageAlphaInfo in CGImageGetAlphaInfo
;;FIXME: CGDataProviderRef in CGImageGetDataProvider
;;FIXME: const CGFloat * in CGImageGetDecode
;;FIXME: CGImageRef in CGImageGetShouldInterpolate
;;FIXME: CGColorRenderingIntent in CGImageGetRenderingIntent
;;FIXME: CGImageRef in CGImageGetBitmapInfo
[:function CGPathGetTypeID [:unsigned-long]]
;;FIXME: CGMutablePathRef in CGPathCreateMutable
;;FIXME: CGPathRef in CGPathCreateCopy
;;FIXME: CGPathRef in CGPathCreateCopyByTransformingPath
;;FIXME: CGMutablePathRef in CGPathCreateMutableCopy
;;FIXME: CGMutablePathRef in CGPathCreateMutableCopyByTransformingPath
;;FIXME: CGPathRef in CGPathCreateWithRect
;;FIXME: CGPathRef in CGPathCreateWithEllipseInRect
;;FIXME: CGPathRef in CGPathCreateCopyByDashingPath
;;FIXME: CGPathRef in CGPathCreateCopyByStrokingPath
;;FIXME: CGPathRef in CGPathRetain
;;FIXME: CGPathRef in CGPathRelease
;;FIXME: CGPathRef in CGPathEqualToPath
;;FIXME: CGMutablePathRef in CGPathMoveToPoint
;;FIXME: CGMutablePathRef in CGPathAddLineToPoint
;;FIXME: CGMutablePathRef in CGPathAddQuadCurveToPoint
;;FIXME: CGMutablePathRef in CGPathAddCurveToPoint
;;FIXME: CGMutablePathRef in CGPathCloseSubpath
;;FIXME: CGMutablePathRef in CGPathAddRect
;;FIXME: CGMutablePathRef in CGPathAddRects
;;FIXME: CGMutablePathRef in CGPathAddLines
;;FIXME: CGMutablePathRef in CGPathAddEllipseInRect
;;FIXME: CGMutablePathRef in CGPathAddRelativeArc
;;FIXME: CGMutablePathRef in CGPathAddArc
;;FIXME: CGMutablePathRef in CGPathAddArcToPoint
;;FIXME: CGMutablePathRef in CGPathAddPath
;;FIXME: CGPathRef in CGPathIsEmpty
;;FIXME: CGPathRef in CGPathIsRect
;;FIXME: CGPathRef in CGPathGetCurrentPoint
;;FIXME: CGPathRef in CGPathGetBoundingBox
;;FIXME: CGPathRef in CGPathGetPathBoundingBox
;;FIXME: CGPathRef in CGPathContainsPoint
[:compound CGPathElement "sizeof (CGPathElement)"]
;;FIXME: CGPathRef in CGPathApply
;;FIXME: CGPDFObjectType in CGPDFObjectGetType
;;FIXME: CGPDFObjectRef in CGPDFObjectGetValue
;;FIXME: CGPDFDictionaryRef in CGPDFStreamGetDictionary
;;FIXME: CFDataRef in CGPDFStreamCopyData
;;FIXME: CGPDFStringRef in CGPDFStringGetLength
;;FIXME: const unsigned char * in CGPDFStringGetBytePtr
;;FIXME: CFStringRef in CGPDFStringCopyTextString
;;FIXME: CFDateRef in CGPDFStringCopyDate
;;FIXME: CGPDFArrayRef in CGPDFArrayGetCount
;;FIXME: CGPDFArrayRef in CGPDFArrayGetObject
;;FIXME: CGPDFArrayRef in CGPDFArrayGetNull
;;FIXME: CGPDFArrayRef in CGPDFArrayGetBoolean
;;FIXME: CGPDFArrayRef in CGPDFArrayGetInteger
;;FIXME: CGPDFArrayRef in CGPDFArrayGetNumber
;;FIXME: CGPDFArrayRef in CGPDFArrayGetName
;;FIXME: CGPDFArrayRef in CGPDFArrayGetString
;;FIXME: CGPDFArrayRef in CGPDFArrayGetArray
;;FIXME: CGPDFArrayRef in CGPDFArrayGetDictionary
;;FIXME: CGPDFArrayRef in CGPDFArrayGetStream
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetCount
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetObject
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetBoolean
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetInteger
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetNumber
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetName
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetString
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetArray
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetDictionary
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryGetStream
;;FIXME: CGPDFDictionaryRef in CGPDFDictionaryApplyFunction
;;FIXME: CGPDFPageRef in CGPDFPageRetain
;;FIXME: CGPDFPageRef in CGPDFPageRelease
;;FIXME: CGPDFDocumentRef in CGPDFPageGetDocument
;;FIXME: CGPDFPageRef in CGPDFPageGetPageNumber
;;FIXME: CGPDFPageRef in CGPDFPageGetBoxRect
;;FIXME: CGPDFPageRef in CGPDFPageGetRotationAngle
;;FIXME: CGPDFPageRef in CGPDFPageGetDrawingTransform
;;FIXME: CGPDFDictionaryRef in CGPDFPageGetDictionary
[:function CGPDFPageGetTypeID [:unsigned-long]]
;;FIXME: CGPDFDocumentRef in CGPDFDocumentCreateWithProvider
;;FIXME: CGPDFDocumentRef in CGPDFDocumentCreateWithURL
;;FIXME: CGPDFDocumentRef in CGPDFDocumentRetain
;;FIXME: CGPDFDocumentRef in CGPDFDocumentRelease
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetVersion
;;FIXME: CGPDFDocumentRef in CGPDFDocumentIsEncrypted
;;FIXME: CGPDFDocumentRef in CGPDFDocumentUnlockWithPassword
;;FIXME: CGPDFDocumentRef in CGPDFDocumentIsUnlocked
;;FIXME: CGPDFDocumentRef in CGPDFDocumentAllowsPrinting
;;FIXME: CGPDFDocumentRef in CGPDFDocumentAllowsCopying
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetNumberOfPages
;;FIXME: CGPDFPageRef in CGPDFDocumentGetPage
;;FIXME: CGPDFDictionaryRef in CGPDFDocumentGetCatalog
;;FIXME: CGPDFDictionaryRef in CGPDFDocumentGetInfo
;;FIXME: CGPDFArrayRef in CGPDFDocumentGetID
[:function CGPDFDocumentGetTypeID [:unsigned-long]]
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetMediaBox
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetCropBox
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetBleedBox
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetTrimBox
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetArtBox
;;FIXME: CGPDFDocumentRef in CGPDFDocumentGetRotationAngle
[:compound CGFunctionCallbacks "sizeof (CGFunctionCallbacks)"]
[:function CGFunctionGetTypeID [:unsigned-long]]
;;FIXME: CGFunctionRef in CGFunctionCreate
;;FIXME: CGFunctionRef in CGFunctionRetain
;;FIXME: CGFunctionRef in CGFunctionRelease
[:function CGShadingGetTypeID [:unsigned-long]]
;;FIXME: CGShadingRef in CGShadingCreateAxial
;;FIXME: CGShadingRef in CGShadingCreateRadial
;;FIXME: CGShadingRef in CGShadingRetain
;;FIXME: CGShadingRef in CGShadingRelease
[:function CGContextGetTypeID [:unsigned-long]]
;;FIXME: CGContextRef in CGContextSaveGState
;;FIXME: CGContextRef in CGContextRestoreGState
;;FIXME: CGContextRef in CGContextScaleCTM
;;FIXME: CGContextRef in CGContextTranslateCTM
;;FIXME: CGContextRef in CGContextRotateCTM
;;FIXME: CGContextRef in CGContextConcatCTM
;;FIXME: CGContextRef in CGContextGetCTM
;;FIXME: CGContextRef in CGContextSetLineWidth
;;FIXME: CGContextRef in CGContextSetLineCap
;;FIXME: CGContextRef in CGContextSetLineJoin
;;FIXME: CGContextRef in CGContextSetMiterLimit
;;FIXME: CGContextRef in CGContextSetLineDash
;;FIXME: CGContextRef in CGContextSetFlatness
;;FIXME: CGContextRef in CGContextSetAlpha
;;FIXME: CGContextRef in CGContextSetBlendMode
;;FIXME: CGContextRef in CGContextBeginPath
;;FIXME: CGContextRef in CGContextMoveToPoint
;;FIXME: CGContextRef in CGContextAddLineToPoint
;;FIXME: CGContextRef in CGContextAddCurveToPoint
;;FIXME: CGContextRef in CGContextAddQuadCurveToPoint
;;FIXME: CGContextRef in CGContextClosePath
;;FIXME: CGContextRef in CGContextAddRect
;;FIXME: CGContextRef in CGContextAddRects
;;FIXME: CGContextRef in CGContextAddLines
;;FIXME: CGContextRef in CGContextAddEllipseInRect
;;FIXME: CGContextRef in CGContextAddArc
;;FIXME: CGContextRef in CGContextAddArcToPoint
;;FIXME: CGContextRef in CGContextAddPath
;;FIXME: CGContextRef in CGContextReplacePathWithStrokedPath
;;FIXME: CGContextRef in CGContextIsPathEmpty
;;FIXME: CGContextRef in CGContextGetPathCurrentPoint
;;FIXME: CGContextRef in CGContextGetPathBoundingBox
;;FIXME: CGPathRef in CGContextCopyPath
;;FIXME: CGContextRef in CGContextPathContainsPoint
;;FIXME: CGContextRef in CGContextDrawPath
;;FIXME: CGContextRef in CGContextFillPath
;;FIXME: CGContextRef in CGContextEOFillPath
;;FIXME: CGContextRef in CGContextStrokePath
;;FIXME: CGContextRef in CGContextFillRect
;;FIXME: CGContextRef in CGContextFillRects
;;FIXME: CGContextRef in CGContextStrokeRect
;;FIXME: CGContextRef in CGContextStrokeRectWithWidth
;;FIXME: CGContextRef in CGContextClearRect
;;FIXME: CGContextRef in CGContextFillEllipseInRect
;;FIXME: CGContextRef in CGContextStrokeEllipseInRect
;;FIXME: CGContextRef in CGContextStrokeLineSegments
;;FIXME: CGContextRef in CGContextClip
;;FIXME: CGContextRef in CGContextEOClip
;;FIXME: CGContextRef in CGContextClipToMask
;;FIXME: CGContextRef in CGContextGetClipBoundingBox
;;FIXME: CGContextRef in CGContextClipToRect
;;FIXME: CGContextRef in CGContextClipToRects
;;FIXME: CGContextRef in CGContextSetFillColorWithColor
;;FIXME: CGContextRef in CGContextSetStrokeColorWithColor
;;FIXME: CGContextRef in CGContextSetFillColorSpace
;;FIXME: CGContextRef in CGContextSetStrokeColorSpace
;;FIXME: CGContextRef in CGContextSetFillColor
;;FIXME: CGContextRef in CGContextSetStrokeColor
;;FIXME: CGContextRef in CGContextSetFillPattern
;;FIXME: CGContextRef in CGContextSetStrokePattern
;;FIXME: CGContextRef in CGContextSetPatternPhase
;;FIXME: CGContextRef in CGContextSetGrayFillColor
;;FIXME: CGContextRef in CGContextSetGrayStrokeColor
;;FIXME: CGContextRef in CGContextSetRGBFillColor
;;FIXME: CGContextRef in CGContextSetRGBStrokeColor
;;FIXME: CGContextRef in CGContextSetCMYKFillColor
;;FIXME: CGContextRef in CGContextSetCMYKStrokeColor
;;FIXME: CGContextRef in CGContextSetRenderingIntent
;;FIXME: CGContextRef in CGContextDrawImage
;;FIXME: CGContextRef in CGContextDrawTiledImage
;;FIXME: CGInterpolationQuality in CGContextGetInterpolationQuality
;;FIXME: CGContextRef in CGContextSetInterpolationQuality
;;FIXME: CGContextRef in CGContextSetShadowWithColor
;;FIXME: CGContextRef in CGContextSetShadow
;;FIXME: CGContextRef in CGContextDrawLinearGradient
;;FIXME: CGContextRef in CGContextDrawRadialGradient
;;FIXME: CGContextRef in CGContextDrawShading
;;FIXME: CGContextRef in CGContextSetCharacterSpacing
;;FIXME: CGContextRef in CGContextSetTextPosition
;;FIXME: CGContextRef in CGContextGetTextPosition
;;FIXME: CGContextRef in CGContextSetTextMatrix
;;FIXME: CGContextRef in CGContextGetTextMatrix
;;FIXME: CGContextRef in CGContextSetTextDrawingMode
;;FIXME: CGContextRef in CGContextSetFont
;;FIXME: CGContextRef in CGContextSetFontSize
;;FIXME: CGContextRef in CGContextSelectFont
;;FIXME: CGContextRef in CGContextShowGlyphsAtPositions
;;FIXME: CGContextRef in CGContextShowText
;;FIXME: CGContextRef in CGContextShowTextAtPoint
;;FIXME: CGContextRef in CGContextShowGlyphs
;;FIXME: CGContextRef in CGContextShowGlyphsAtPoint
;;FIXME: CGContextRef in CGContextShowGlyphsWithAdvances
;;FIXME: CGContextRef in CGContextDrawPDFPage
;;FIXME: CGContextRef in CGContextDrawPDFDocument
;;FIXME: CGContextRef in CGContextBeginPage
;;FIXME: CGContextRef in CGContextEndPage
;;FIXME: CGContextRef in CGContextRetain
;;FIXME: CGContextRef in CGContextRelease
;;FIXME: CGContextRef in CGContextFlush
;;FIXME: CGContextRef in CGContextSynchronize
;;FIXME: CGContextRef in CGContextSetShouldAntialias
;;FIXME: CGContextRef in CGContextSetAllowsAntialiasing
;;FIXME: CGContextRef in CGContextSetShouldSmoothFonts
;;FIXME: CGContextRef in CGContextSetAllowsFontSmoothing
;;FIXME: CGContextRef in CGContextSetShouldSubpixelPositionFonts
;;FIXME: CGContextRef in CGContextSetAllowsFontSubpixelPositioning
;;FIXME: CGContextRef in CGContextSetShouldSubpixelQuantizeFonts
;;FIXME: CGContextRef in CGContextSetAllowsFontSubpixelQuantization
;;FIXME: CGContextRef in CGContextBeginTransparencyLayer
;;FIXME: CGContextRef in CGContextBeginTransparencyLayerWithRect
;;FIXME: CGContextRef in CGContextEndTransparencyLayer
;;FIXME: CGContextRef in CGContextGetUserSpaceToDeviceSpaceTransform
;;FIXME: CGContextRef in CGContextConvertPointToDeviceSpace
;;FIXME: CGContextRef in CGContextConvertPointToUserSpace
;;FIXME: CGContextRef in CGContextConvertSizeToDeviceSpace
;;FIXME: CGContextRef in CGContextConvertSizeToUserSpace
;;FIXME: CGContextRef in CGContextConvertRectToDeviceSpace
;;FIXME: CGContextRef in CGContextConvertRectToUserSpace
;;FIXME: CGContextRef in CGBitmapContextCreateWithData
;;FIXME: CGContextRef in CGBitmapContextCreate
;;FIXME: void * in CGBitmapContextGetData
;;FIXME: CGContextRef in CGBitmapContextGetWidth
;;FIXME: CGContextRef in CGBitmapContextGetHeight
;;FIXME: CGContextRef in CGBitmapContextGetBitsPerComponent
;;FIXME: CGContextRef in CGBitmapContextGetBitsPerPixel
;;FIXME: CGContextRef in CGBitmapContextGetBytesPerRow
;;FIXME: CGColorSpaceRef in CGBitmapContextGetColorSpace
;;FIXME: CGImageAlphaInfo in CGBitmapContextGetAlphaInfo
;;FIXME: CGContextRef in CGBitmapContextGetBitmapInfo
;;FIXME: CGImageRef in CGBitmapContextCreateImage
[:compound CGDataConsumerCallbacks "sizeof (CGDataConsumerCallbacks)"]
[:function CGDataConsumerGetTypeID [:unsigned-long]]
;;FIXME: CGDataConsumerRef in CGDataConsumerCreate
;;FIXME: CGDataConsumerRef in CGDataConsumerCreateWithURL
;;FIXME: CGDataConsumerRef in CGDataConsumerCreateWithCFData
;;FIXME: CGDataConsumerRef in CGDataConsumerRetain
;;FIXME: CGDataConsumerRef in CGDataConsumerRelease
;;FIXME: CGLayerRef in CGLayerCreateWithContext
;;FIXME: CGLayerRef in CGLayerRetain
;;FIXME: CGLayerRef in CGLayerRelease
;;FIXME: CGLayerRef in CGLayerGetSize
;;FIXME: CGContextRef in CGLayerGetContext
;;FIXME: CGContextRef in CGContextDrawLayerInRect
;;FIXME: CGContextRef in CGContextDrawLayerAtPoint
[:function CGLayerGetTypeID [:unsigned-long]]
;;FIXME: CGPDFContentStreamRef in CGPDFContentStreamCreateWithPage
;;FIXME: CGPDFContentStreamRef in CGPDFContentStreamCreateWithStream
;;FIXME: CGPDFContentStreamRef in CGPDFContentStreamRetain
;;FIXME: CGPDFContentStreamRef in CGPDFContentStreamRelease
;;FIXME: CFArrayRef in CGPDFContentStreamGetStreams
;;FIXME: CGPDFObjectRef in CGPDFContentStreamGetResource
;;FIXME: CGContextRef in CGPDFContextCreate
;;FIXME: CGContextRef in CGPDFContextCreateWithURL
;;FIXME: CGContextRef in CGPDFContextClose
;;FIXME: CGContextRef in CGPDFContextBeginPage
;;FIXME: CGContextRef in CGPDFContextEndPage
;;FIXME: CGContextRef in CGPDFContextAddDocumentMetadata
;;FIXME: CGContextRef in CGPDFContextSetURLForRect
;;FIXME: CGContextRef in CGPDFContextAddDestinationAtPoint
;;FIXME: CGContextRef in CGPDFContextSetDestinationForRect
;;FIXME: CGPDFScannerRef in CGPDFScannerCreate
;;FIXME: CGPDFScannerRef in CGPDFScannerRetain
;;FIXME: CGPDFScannerRef in CGPDFScannerRelease
;;FIXME: CGPDFScannerRef in CGPDFScannerScan
;;FIXME: CGPDFContentStreamRef in CGPDFScannerGetContentStream
;;FIXME: CGPDFScannerRef in CGPDFScannerPopObject
;;FIXME: CGPDFScannerRef in CGPDFScannerPopBoolean
;;FIXME: CGPDFScannerRef in CGPDFScannerPopInteger
;;FIXME: CGPDFScannerRef in CGPDFScannerPopNumber
;;FIXME: CGPDFScannerRef in CGPDFScannerPopName
;;FIXME: CGPDFScannerRef in CGPDFScannerPopString
;;FIXME: CGPDFScannerRef in CGPDFScannerPopArray
;;FIXME: CGPDFScannerRef in CGPDFScannerPopDictionary
;;FIXME: CGPDFScannerRef in CGPDFScannerPopStream
;;FIXME: CGPDFOperatorTableRef in CGPDFOperatorTableCreate
;;FIXME: CGPDFOperatorTableRef in CGPDFOperatorTableRetain
;;FIXME: CGPDFOperatorTableRef in CGPDFOperatorTableRelease
;;FIXME: CGPDFOperatorTableRef in CGPDFOperatorTableSetCallback
[:function CGMainDisplayID [:unsigned-int]]
;;FIXME: CGDirectDisplayID * in CGGetDisplaysWithPoint
;;FIXME: CGDirectDisplayID * in CGGetDisplaysWithRect
;;FIXME: CGDirectDisplayID * in CGGetDisplaysWithOpenGLDisplayMask
;;FIXME: CGDirectDisplayID * in CGGetActiveDisplayList
;;FIXME: CGDirectDisplayID * in CGGetOnlineDisplayList
[:function CGDisplayIDToOpenGLDisplayMask [:unsigned-int :unsigned-int]]
[:function CGOpenGLDisplayMaskToDisplayID [:unsigned-int :unsigned-int]]
[:function CGDisplayBounds [Foundation/CGRect :unsigned-int]]
[:function CGDisplayPixelsWide [:unsigned-long :unsigned-int]]
[:function CGDisplayPixelsHigh [:unsigned-long :unsigned-int]]
;;FIXME: CFArrayRef in CGDisplayCopyAllDisplayModes
;;FIXME: CGDisplayModeRef in CGDisplayCopyDisplayMode
;;FIXME: CGDisplayModeRef in CGDisplaySetDisplayMode
;;FIXME: CGDisplayModeRef in CGDisplayModeGetWidth
;;FIXME: CGDisplayModeRef in CGDisplayModeGetHeight
;;FIXME: CFStringRef in CGDisplayModeCopyPixelEncoding
;;FIXME: CGDisplayModeRef in CGDisplayModeGetRefreshRate
;;FIXME: CGDisplayModeRef in CGDisplayModeGetIOFlags
;;FIXME: CGDisplayModeRef in CGDisplayModeGetIODisplayModeID
;;FIXME: CGDisplayModeRef in CGDisplayModeIsUsableForDesktopGUI
[:function CGDisplayModeGetTypeID [:unsigned-long]]
;;FIXME: CGDisplayModeRef in CGDisplayModeRetain
;;FIXME: CGDisplayModeRef in CGDisplayModeRelease
;;FIXME: CGDisplayModeRef in CGDisplayModeGetPixelWidth
;;FIXME: CGDisplayModeRef in CGDisplayModeGetPixelHeight
[:function CGSetDisplayTransferByFormula [:int :unsigned-int :float :float :float :float :float :float :float :float :float]]
;;FIXME: CGGammaValue * in CGGetDisplayTransferByFormula
[:function CGDisplayGammaTableCapacity [:unsigned-int :unsigned-int]]
;;FIXME: const CGGammaValue * in CGSetDisplayTransferByTable
;;FIXME: CGGammaValue * in CGGetDisplayTransferByTable
;;FIXME: const uint8_t * in CGSetDisplayTransferByByteTable
[:function CGDisplayRestoreColorSyncSettings [:void]]
[:function CGDisplayIsCaptured [:unsigned-int :unsigned-int]]
[:function CGDisplayCapture [:int :unsigned-int]]
[:function CGDisplayCaptureWithOptions [:int :unsigned-int :unsigned-int]]
[:function CGDisplayRelease [:int :unsigned-int]]
[:function CGCaptureAllDisplays [:int]]
[:function CGCaptureAllDisplaysWithOptions [:int :unsigned-int]]
[:function CGReleaseAllDisplays [:int]]
[:function CGShieldingWindowID [:unsigned-int :unsigned-int]]
[:function CGShieldingWindowLevel [:int]]
;;FIXME: CGImageRef in CGDisplayCreateImage
;;FIXME: CGImageRef in CGDisplayCreateImageForRect
[:function CGDisplayHideCursor [:int :unsigned-int]]
[:function CGDisplayShowCursor [:int :unsigned-int]]
[:function CGDisplayMoveCursorToPoint [:int :unsigned-int Foundation/CGPoint]]
;;FIXME: int32_t * in CGGetLastMouseDelta
;;FIXME: CGContextRef in CGDisplayGetDrawingContext
;;FIXME: CFArrayRef in CGDisplayAvailableModes
;;FIXME: CFDictionaryRef in CGDisplayBestModeForParameters
;;FIXME: CFDictionaryRef in CGDisplayBestModeForParametersAndRefreshRate
;;FIXME: CFDictionaryRef in CGDisplayBestModeForParametersAndRefreshRateWithProperty
;;FIXME: CFDictionaryRef in CGDisplayCurrentMode
;;FIXME: CFDictionaryRef in CGDisplaySwitchToMode
[:function CGDisplayCanSetPalette [:unsigned-int :unsigned-int]]
;;FIXME: CGDirectPaletteRef in CGDisplaySetPalette
[:function CGDisplayWaitForBeamPositionOutsideLines [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function CGDisplayBeamPosition [:unsigned-int :unsigned-int]]
[:compound CGDeviceColor "sizeof (CGDeviceColor)"]
[:compound CGDeviceByteColor "sizeof (CGDeviceByteColor)"]
;;FIXME: CGDirectPaletteRef in CGPaletteCreateDefaultColorPalette
;;FIXME: CGDirectPaletteRef in CGPaletteCreateWithDisplay
;;FIXME: CGDirectPaletteRef in CGPaletteCreateWithCapacity
;;FIXME: CGDirectPaletteRef in CGPaletteCreateWithSamples
;;FIXME: CGDirectPaletteRef in CGPaletteCreateWithByteSamples
;;FIXME: CGDirectPaletteRef in CGPaletteRelease
;;FIXME: CGDirectPaletteRef in CGPaletteGetColorAtIndex
;;FIXME: CGDirectPaletteRef in CGPaletteGetIndexForColor
;;FIXME: CGDirectPaletteRef in CGPaletteGetNumberOfSamples
;;FIXME: CGDirectPaletteRef in CGPaletteSetColorAtIndex
;;FIXME: CGDirectPaletteRef in CGPaletteCreateCopy
;;FIXME: CGDirectPaletteRef in CGPaletteIsEqualToPalette
;;FIXME: CGDirectPaletteRef in CGPaletteCreateFromPaletteBlendedWithColor
;;FIXME: CGDisplayConfigRef * in CGBeginDisplayConfiguration
;;FIXME: CGDisplayConfigRef in CGConfigureDisplayOrigin
;;FIXME: CGDisplayConfigRef in CGConfigureDisplayWithDisplayMode
;;FIXME: CGDisplayConfigRef in CGConfigureDisplayStereoOperation
;;FIXME: CGDisplayConfigRef in CGConfigureDisplayMirrorOfDisplay
;;FIXME: CGDisplayConfigRef in CGCancelDisplayConfiguration
;;FIXME: CGDisplayConfigRef in CGCompleteDisplayConfiguration
[:function CGRestorePermanentDisplayConfiguration [:void]]
;;FIXME: CGDisplayReconfigurationCallBack in CGDisplayRegisterReconfigurationCallback
;;FIXME: CGDisplayReconfigurationCallBack in CGDisplayRemoveReconfigurationCallback
[:function CGDisplaySetStereoOperation [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
[:function CGDisplayIsActive [:unsigned-int :unsigned-int]]
[:function CGDisplayIsAsleep [:unsigned-int :unsigned-int]]
[:function CGDisplayIsOnline [:unsigned-int :unsigned-int]]
[:function CGDisplayIsMain [:unsigned-int :unsigned-int]]
[:function CGDisplayIsBuiltin [:unsigned-int :unsigned-int]]
[:function CGDisplayIsInMirrorSet [:unsigned-int :unsigned-int]]
[:function CGDisplayIsAlwaysInMirrorSet [:unsigned-int :unsigned-int]]
[:function CGDisplayIsInHWMirrorSet [:unsigned-int :unsigned-int]]
[:function CGDisplayMirrorsDisplay [:unsigned-int :unsigned-int]]
[:function CGDisplayUsesOpenGLAcceleration [:unsigned-int :unsigned-int]]
[:function CGDisplayIsStereo [:unsigned-int :unsigned-int]]
[:function CGDisplayPrimaryDisplay [:unsigned-int :unsigned-int]]
[:function CGDisplayUnitNumber [:unsigned-int :unsigned-int]]
[:function CGDisplayVendorNumber [:unsigned-int :unsigned-int]]
[:function CGDisplayModelNumber [:unsigned-int :unsigned-int]]
[:function CGDisplaySerialNumber [:unsigned-int :unsigned-int]]
[:function CGDisplayIOServicePort [:unsigned-int :unsigned-int]]
[:function CGDisplayScreenSize [Foundation/CGSize :unsigned-int]]
[:function CGDisplayRotation [:double :unsigned-int]]
;;FIXME: CGColorSpaceRef in CGDisplayCopyColorSpace
;;FIXME: CGDisplayConfigRef in CGConfigureDisplayMode
;;FIXME: CGDisplayConfigRef in CGConfigureDisplayFadeEffect
;;FIXME: CGDisplayFadeReservationToken * in CGAcquireDisplayFadeReservation
[:function CGReleaseDisplayFadeReservation [:int :unsigned-int]]
[:function CGDisplayFade [:int :unsigned-int :float :float :float :float :float :float :unsigned-int]]
[:function CGDisplayFadeOperationInProgress [:unsigned-int]]
[:function mlockall [:int :int]]
[:function munlockall [:int]]
;;FIXME: const void * in mlock
;;FIXME: void * in mmap
;;FIXME: void * in mprotect
;;FIXME: void * in msync
;;FIXME: const void * in munlock
;;FIXME: void * in munmap
;;FIXME: variadic shm_open
[:function shm_unlink [:int :c-string-const]]
;;FIXME: void * in posix_madvise
;;FIXME: void * in madvise
;;FIXME: const void * in mincore
;;FIXME: void * in minherit
[:compound au_tid_t "sizeof (au_tid_t)"]
[:compound au_tid_addr_t "sizeof (au_tid_addr_t)"]
[:compound au_mask_t "sizeof (au_mask_t)"]
[:compound auditinfo_t "sizeof (auditinfo_t)"]
[:compound auditinfo_addr_t "sizeof (auditinfo_addr_t)"]
[:compound auditpinfo_t "sizeof (auditpinfo_t)"]
[:compound auditpinfo_addr_t "sizeof (auditpinfo_addr_t)"]
[:compound au_session_t "sizeof (au_session_t)"]
[:compound token_t "sizeof (token_t)"]
[:compound au_qctrl_t "sizeof (au_qctrl_t)"]
[:compound au_stat_t "sizeof (au_stat_t)"]
[:compound au_fstat_t "sizeof (au_fstat_t)"]
[:compound au_evclass_map_t "sizeof (au_evclass_map_t)"]
;;FIXME: const void * in audit
;;FIXME: void * in auditon
[:function auditctl [:int :c-string-const]]
;;FIXME: au_id_t * in getauid
;;FIXME: const au_id_t * in setauid
;;FIXME: struct auditinfo_addr * in getaudit_addr
;;FIXME: const struct auditinfo_addr * in setaudit_addr
;;FIXME: struct auditinfo * in getaudit
;;FIXME: const struct auditinfo * in setaudit
[:function audit_session_self [:unsigned-int]]
[:function audit_session_join [:int :unsigned-int]]
;;FIXME: mach_port_name_t * in audit_session_port
[:function _xpc_object_validate [:void :id]]
[:function xpc_endpoint_create [:id :id]]
[:function xpc_connection_create [:id :c-string-const :id]]
[:function xpc_connection_create_mach_service [:id :c-string-const :id :unsigned-long-long]]
[:function xpc_connection_create_from_endpoint [:id :id]]
[:function xpc_connection_set_target_queue [:void :id :id]]
;;FIXME: xpc_handler_t in xpc_connection_set_event_handler
[:function xpc_connection_suspend [:void :id]]
[:function xpc_connection_resume [:void :id]]
[:function xpc_connection_send_message [:void :id :id]]
;;FIXME: dispatch_block_t in xpc_connection_send_barrier
;;FIXME: xpc_handler_t in xpc_connection_send_message_with_reply
[:function xpc_connection_send_message_with_reply_sync [:id :id :id]]
[:function xpc_connection_cancel [:void :id]]
[:function xpc_connection_get_name [:c-string-const :id]]
[:function xpc_connection_get_euid [:unsigned-int :id]]
[:function xpc_connection_get_egid [:unsigned-int :id]]
[:function xpc_connection_get_pid [:int :id]]
[:function xpc_connection_get_asid [:int :id]]
;;FIXME: void * in xpc_connection_set_context
;;FIXME: void * in xpc_connection_get_context
;;FIXME: xpc_finalizer_t in xpc_connection_set_finalizer_f
[:function xpc_debugger_api_misuse_info [:c-string-const]]
[:function xpc_retain [:id :id]]
[:function xpc_release [:void :id]]
;;FIXME: xpc_type_t in xpc_get_type
[:function xpc_copy [:id :id]]
[:function xpc_equal [Boolean :id :id]]
[:function xpc_hash [:unsigned-long :id]]
;;FIXME: char * in xpc_copy_description
[:function xpc_null_create [:id]]
[:function xpc_bool_create [:id Boolean]]
[:function xpc_bool_get_value [Boolean :id]]
[:function xpc_int64_create [:id :long-long]]
[:function xpc_int64_get_value [:long-long :id]]
[:function xpc_uint64_create [:id :unsigned-long-long]]
[:function xpc_uint64_get_value [:unsigned-long-long :id]]
[:function xpc_double_create [:id :double]]
[:function xpc_double_get_value [:double :id]]
[:function xpc_date_create [:id :long-long]]
[:function xpc_date_create_from_current [:id]]
[:function xpc_date_get_value [:long-long :id]]
;;FIXME: const void * in xpc_data_create
[:function xpc_data_create_with_dispatch_data [:id :id]]
[:function xpc_data_get_length [:unsigned-long :id]]
;;FIXME: const void * in xpc_data_get_bytes_ptr
;;FIXME: void * in xpc_data_get_bytes
[:function xpc_string_create [:id :c-string-const]]
;;FIXME: variadic xpc_string_create_with_format
;;FIXME: va_list in xpc_string_create_with_format_and_arguments
[:function xpc_string_get_length [:unsigned-long :id]]
[:function xpc_string_get_string_ptr [:c-string-const :id]]
;;FIXME: const uuid_t in xpc_uuid_create
;;FIXME: const uint8_t * in xpc_uuid_get_bytes
[:function xpc_fd_create [:id :int]]
[:function xpc_fd_dup [:int :id]]
;;FIXME: void * in xpc_shmem_create
;;FIXME: void ** in xpc_shmem_map
;;FIXME: const xpc_object_t * in xpc_array_create
[:function xpc_array_set_value [:void :id :unsigned-long :id]]
[:function xpc_array_append_value [:void :id :id]]
[:function xpc_array_get_count [:unsigned-long :id]]
[:function xpc_array_get_value [:id :id :unsigned-long]]
;;FIXME: xpc_array_applier_t in xpc_array_apply
[:function xpc_array_set_bool [:void :id :unsigned-long Boolean]]
[:function xpc_array_set_int64 [:void :id :unsigned-long :long-long]]
[:function xpc_array_set_uint64 [:void :id :unsigned-long :unsigned-long-long]]
[:function xpc_array_set_double [:void :id :unsigned-long :double]]
[:function xpc_array_set_date [:void :id :unsigned-long :long-long]]
;;FIXME: const void * in xpc_array_set_data
[:function xpc_array_set_string [:void :id :unsigned-long :c-string-const]]
;;FIXME: const uuid_t in xpc_array_set_uuid
[:function xpc_array_set_fd [:void :id :unsigned-long :int]]
[:function xpc_array_set_connection [:void :id :unsigned-long :id]]
[:function xpc_array_get_bool [Boolean :id :unsigned-long]]
[:function xpc_array_get_int64 [:long-long :id :unsigned-long]]
[:function xpc_array_get_uint64 [:unsigned-long-long :id :unsigned-long]]
[:function xpc_array_get_double [:double :id :unsigned-long]]
[:function xpc_array_get_date [:long-long :id :unsigned-long]]
;;FIXME: const void * in xpc_array_get_data
[:function xpc_array_get_string [:c-string-const :id :unsigned-long]]
;;FIXME: const uint8_t * in xpc_array_get_uuid
[:function xpc_array_dup_fd [:int :id :unsigned-long]]
[:function xpc_array_create_connection [:id :id :unsigned-long]]
;;FIXME: const char *const * in xpc_dictionary_create
[:function xpc_dictionary_create_reply [:id :id]]
[:function xpc_dictionary_set_value [:void :id :c-string-const :id]]
[:function xpc_dictionary_get_value [:id :id :c-string-const]]
[:function xpc_dictionary_get_count [:unsigned-long :id]]
;;FIXME: xpc_dictionary_applier_t in xpc_dictionary_apply
[:function xpc_dictionary_get_remote_connection [:id :id]]
[:function xpc_dictionary_set_bool [:void :id :c-string-const Boolean]]
[:function xpc_dictionary_set_int64 [:void :id :c-string-const :long-long]]
[:function xpc_dictionary_set_uint64 [:void :id :c-string-const :unsigned-long-long]]
[:function xpc_dictionary_set_double [:void :id :c-string-const :double]]
[:function xpc_dictionary_set_date [:void :id :c-string-const :long-long]]
;;FIXME: const void * in xpc_dictionary_set_data
[:function xpc_dictionary_set_string [:void :id :c-string-const :c-string-const]]
;;FIXME: const uuid_t in xpc_dictionary_set_uuid
[:function xpc_dictionary_set_fd [:void :id :c-string-const :int]]
[:function xpc_dictionary_set_connection [:void :id :c-string-const :id]]
[:function xpc_dictionary_get_bool [Boolean :id :c-string-const]]
[:function xpc_dictionary_get_int64 [:long-long :id :c-string-const]]
[:function xpc_dictionary_get_uint64 [:unsigned-long-long :id :c-string-const]]
[:function xpc_dictionary_get_double [:double :id :c-string-const]]
[:function xpc_dictionary_get_date [:long-long :id :c-string-const]]
;;FIXME: const void * in xpc_dictionary_get_data
[:function xpc_dictionary_get_string [:c-string-const :id :c-string-const]]
;;FIXME: const uint8_t * in xpc_dictionary_get_uuid
[:function xpc_dictionary_dup_fd [:int :id :c-string-const]]
[:function xpc_dictionary_create_connection [:id :id :c-string-const]]
;;FIXME: xpc_connection_handler_t in xpc_main
[:function xpc_transaction_begin [:void]]
[:function xpc_transaction_end [:void]]
;;FIXME: xpc_handler_t in xpc_set_event_stream_handler
[:function IOSurfaceGetTypeID [:unsigned-long]]
;;FIXME: IOSurfaceRef in IOSurfaceCreate
;;FIXME: IOSurfaceRef in IOSurfaceLookup
;;FIXME: IOSurfaceRef in IOSurfaceGetID
;;FIXME: IOSurfaceRef in IOSurfaceLock
;;FIXME: IOSurfaceRef in IOSurfaceUnlock
;;FIXME: IOSurfaceRef in IOSurfaceGetAllocSize
;;FIXME: IOSurfaceRef in IOSurfaceGetWidth
;;FIXME: IOSurfaceRef in IOSurfaceGetHeight
;;FIXME: IOSurfaceRef in IOSurfaceGetBytesPerElement
;;FIXME: IOSurfaceRef in IOSurfaceGetBytesPerRow
;;FIXME: void * in IOSurfaceGetBaseAddress
;;FIXME: IOSurfaceRef in IOSurfaceGetElementWidth
;;FIXME: IOSurfaceRef in IOSurfaceGetElementHeight
;;FIXME: IOSurfaceRef in IOSurfaceGetPixelFormat
;;FIXME: IOSurfaceRef in IOSurfaceGetSeed
;;FIXME: IOSurfaceRef in IOSurfaceGetPlaneCount
;;FIXME: IOSurfaceRef in IOSurfaceGetWidthOfPlane
;;FIXME: IOSurfaceRef in IOSurfaceGetHeightOfPlane
;;FIXME: IOSurfaceRef in IOSurfaceGetBytesPerElementOfPlane
;;FIXME: IOSurfaceRef in IOSurfaceGetBytesPerRowOfPlane
;;FIXME: void * in IOSurfaceGetBaseAddressOfPlane
;;FIXME: IOSurfaceRef in IOSurfaceGetElementWidthOfPlane
;;FIXME: IOSurfaceRef in IOSurfaceGetElementHeightOfPlane
;;FIXME: IOSurfaceRef in IOSurfaceSetValue
;;FIXME: CFTypeRef in IOSurfaceCopyValue
;;FIXME: IOSurfaceRef in IOSurfaceRemoveValue
;;FIXME: IOSurfaceRef in IOSurfaceCreateMachPort
;;FIXME: IOSurfaceRef in IOSurfaceLookupFromMachPort
;;FIXME: IOSurfaceRef in IOSurfaceCreateXPCObject
;;FIXME: IOSurfaceRef in IOSurfaceLookupFromXPCObject
;;FIXME: CFStringRef in IOSurfaceGetPropertyMaximum
;;FIXME: CFStringRef in IOSurfaceGetPropertyAlignment
;;FIXME: CFStringRef in IOSurfaceAlignProperty
;;FIXME: IOSurfaceRef in IOSurfaceIncrementUseCount
;;FIXME: IOSurfaceRef in IOSurfaceDecrementUseCount
;;FIXME: IOSurfaceRef in IOSurfaceGetUseCount
;;FIXME: IOSurfaceRef in IOSurfaceIsInUse
[:function CGDisplayStreamUpdateGetTypeID [:unsigned-long]]
;;FIXME: const CGRect * in CGDisplayStreamUpdateGetRects
;;FIXME: CGDisplayStreamUpdateRef in CGDisplayStreamUpdateCreateMergedUpdate
;;FIXME: CGDisplayStreamUpdateRef in CGDisplayStreamUpdateGetMovedRectsDelta
;;FIXME: CGDisplayStreamUpdateRef in CGDisplayStreamUpdateGetDropCount
[:function CGDisplayStreamGetTypeID [:unsigned-long]]
;;FIXME: CGDisplayStreamRef in CGDisplayStreamCreate
;;FIXME: CGDisplayStreamRef in CGDisplayStreamCreateWithDispatchQueue
;;FIXME: CGDisplayStreamRef in CGDisplayStreamStart
;;FIXME: CGDisplayStreamRef in CGDisplayStreamStop
;;FIXME: CFRunLoopSourceRef in CGDisplayStreamGetRunLoopSource
;;FIXME: CGScreenRefreshCallback in CGRegisterScreenRefreshCallback
;;FIXME: CGScreenRefreshCallback in CGUnregisterScreenRefreshCallback
;;FIXME: CGRect ** in CGWaitForScreenRefreshRects
[:compound CGScreenUpdateMoveDelta "sizeof (CGScreenUpdateMoveDelta)"]
;;FIXME: CGScreenUpdateMoveCallback in CGScreenRegisterMoveCallback
;;FIXME: CGScreenUpdateMoveCallback in CGScreenUnregisterMoveCallback
;;FIXME: CGScreenUpdateOperation * in CGWaitForScreenUpdateRects
;;FIXME: CGRect * in CGReleaseScreenRefreshRects
[:function CGCursorIsVisible [:unsigned-int]]
[:function CGCursorIsDrawnInFramebuffer [:unsigned-int]]
[:function CGWarpMouseCursorPosition [:int Foundation/CGPoint]]
[:function CGAssociateMouseAndMouseCursorPosition [:int :unsigned-int]]
;;FIXME: CFMachPortRef in CGWindowServerCreateServerPort
[:function CGEnableEventStateCombining [:int :unsigned-int]]
[:function CGInhibitLocalEvents [:int :unsigned-int]]
;;FIXME: variadic CGPostMouseEvent
;;FIXME: variadic CGPostScrollWheelEvent
[:function CGPostKeyboardEvent [:int :unsigned-short :unsigned-short :unsigned-int]]
[:function CGSetLocalEventsFilterDuringSuppressionState [:int :unsigned-int :unsigned-int]]
[:function CGSetLocalEventsSuppressionInterval [:int :double]]
;;FIXME: CFMachPortRef in CGWindowServerCFMachPort
;;FIXME: volatile int32_t * in OSAtomicAdd32
;;FIXME: volatile int32_t * in OSAtomicAdd32Barrier
;;FIXME: volatile int32_t * in OSAtomicIncrement32
;;FIXME: volatile int32_t * in OSAtomicIncrement32Barrier
;;FIXME: volatile int32_t * in OSAtomicDecrement32
;;FIXME: volatile int32_t * in OSAtomicDecrement32Barrier
;;FIXME: volatile int64_t * in OSAtomicAdd64
;;FIXME: volatile int64_t * in OSAtomicAdd64Barrier
;;FIXME: volatile int64_t * in OSAtomicIncrement64
;;FIXME: volatile int64_t * in OSAtomicIncrement64Barrier
;;FIXME: volatile int64_t * in OSAtomicDecrement64
;;FIXME: volatile int64_t * in OSAtomicDecrement64Barrier
;;FIXME: volatile uint32_t * in OSAtomicOr32
;;FIXME: volatile uint32_t * in OSAtomicOr32Barrier
;;FIXME: volatile uint32_t * in OSAtomicOr32Orig
;;FIXME: volatile uint32_t * in OSAtomicOr32OrigBarrier
;;FIXME: volatile uint32_t * in OSAtomicAnd32
;;FIXME: volatile uint32_t * in OSAtomicAnd32Barrier
;;FIXME: volatile uint32_t * in OSAtomicAnd32Orig
;;FIXME: volatile uint32_t * in OSAtomicAnd32OrigBarrier
;;FIXME: volatile uint32_t * in OSAtomicXor32
;;FIXME: volatile uint32_t * in OSAtomicXor32Barrier
;;FIXME: volatile uint32_t * in OSAtomicXor32Orig
;;FIXME: volatile uint32_t * in OSAtomicXor32OrigBarrier
;;FIXME: volatile int32_t * in OSAtomicCompareAndSwap32
;;FIXME: volatile int32_t * in OSAtomicCompareAndSwap32Barrier
;;FIXME: void * in OSAtomicCompareAndSwapPtr
;;FIXME: void * in OSAtomicCompareAndSwapPtrBarrier
;;FIXME: volatile int * in OSAtomicCompareAndSwapInt
;;FIXME: volatile int * in OSAtomicCompareAndSwapIntBarrier
;;FIXME: volatile long * in OSAtomicCompareAndSwapLong
;;FIXME: volatile long * in OSAtomicCompareAndSwapLongBarrier
;;FIXME: volatile int64_t * in OSAtomicCompareAndSwap64
;;FIXME: volatile int64_t * in OSAtomicCompareAndSwap64Barrier
;;FIXME: volatile void * in OSAtomicTestAndSet
;;FIXME: volatile void * in OSAtomicTestAndSetBarrier
;;FIXME: volatile void * in OSAtomicTestAndClear
;;FIXME: volatile void * in OSAtomicTestAndClearBarrier
;;FIXME: volatile OSSpinLock * in OSSpinLockTry
;;FIXME: volatile OSSpinLock * in OSSpinLockLock
;;FIXME: volatile OSSpinLock * in OSSpinLockUnlock
;;FIXME: OSQueueHead * in OSAtomicEnqueue
;;FIXME: void * in OSAtomicDequeue
;;FIXME: OSFifoQueueHead * in OSAtomicFifoEnqueue
;;FIXME: void * in OSAtomicFifoDequeue
[:function OSMemoryBarrier [:void]]
[:compound IOPixelInformation "sizeof (IOPixelInformation)"]
[:compound IODisplayModeInformation "sizeof (IODisplayModeInformation)"]
[:compound IOFramebufferInformation "sizeof (IOFramebufferInformation)"]
[:compound IOColorEntry "sizeof (IOColorEntry)"]
[:compound IODetailedTimingInformationV1 "sizeof (IODetailedTimingInformationV1)"]
[:compound IODetailedTimingInformationV2 "sizeof (IODetailedTimingInformationV2)"]
[:compound IODetailedTimingInformation "sizeof (IODetailedTimingInformation)"]
[:compound IOTimingInformation "sizeof (IOTimingInformation)"]
[:compound IOFBDisplayModeDescription "sizeof (IOFBDisplayModeDescription)"]
[:compound IODisplayTimingRange "sizeof (IODisplayTimingRange)"]
[:compound IODisplayScalerInformation "sizeof (IODisplayScalerInformation)"]
[:compound IOGPoint "sizeof (IOGPoint)"]
[:compound IOGSize "sizeof (IOGSize)"]
[:compound IOGBounds "sizeof (IOGBounds)"]
[:compound IOHardwareCursorDescriptor "sizeof (IOHardwareCursorDescriptor)"]
[:compound IOHardwareCursorInfo "sizeof (IOHardwareCursorInfo)"]
[:compound IOFBDPLinkConfig "sizeof (IOFBDPLinkConfig)"]
[:compound NXKeyMapping "sizeof (NXKeyMapping)"]
[:compound NXMouseScaling "sizeof (NXMouseScaling)"]
[:compound IOFixedPoint32 "sizeof (IOFixedPoint32)"]
[:compound NXEventSystemDevice "sizeof (NXEventSystemDevice)"]
[:compound NXEventSystemDeviceList "sizeof (NXEventSystemDeviceList)"]
[:compound NXPoint "sizeof (NXPoint)"]
[:compound NXSize "sizeof (NXSize)"]
[:compound NXTabletPointData "sizeof (NXTabletPointData)"]
[:compound NXTabletProximityData "sizeof (NXTabletProximityData)"]
[:compound NXEventData "sizeof (NXEventData)"]
[:compound NXEvent "sizeof (NXEvent)"]
[:compound CGEventTapInformation "sizeof (CGEventTapInformation)"]
[:function CGEventGetTypeID [:unsigned-long]]
;;FIXME: CGEventRef in CGEventCreate
;;FIXME: CFDataRef in CGEventCreateData
;;FIXME: CGEventRef in CGEventCreateFromData
;;FIXME: CGEventRef in CGEventCreateMouseEvent
;;FIXME: CGEventRef in CGEventCreateKeyboardEvent
;;FIXME: variadic CGEventCreateScrollWheelEvent
;;FIXME: CGEventRef in CGEventCreateCopy
;;FIXME: CGEventSourceRef in CGEventCreateSourceFromEvent
;;FIXME: CGEventRef in CGEventSetSource
;;FIXME: CGEventRef in CGEventGetType
;;FIXME: CGEventRef in CGEventSetType
;;FIXME: CGEventRef in CGEventGetTimestamp
;;FIXME: CGEventRef in CGEventSetTimestamp
;;FIXME: CGEventRef in CGEventGetLocation
;;FIXME: CGEventRef in CGEventGetUnflippedLocation
;;FIXME: CGEventRef in CGEventSetLocation
;;FIXME: CGEventRef in CGEventGetFlags
;;FIXME: CGEventRef in CGEventSetFlags
;;FIXME: CGEventRef in CGEventKeyboardGetUnicodeString
;;FIXME: CGEventRef in CGEventKeyboardSetUnicodeString
;;FIXME: CGEventRef in CGEventGetIntegerValueField
;;FIXME: CGEventRef in CGEventSetIntegerValueField
;;FIXME: CGEventRef in CGEventGetDoubleValueField
;;FIXME: CGEventRef in CGEventSetDoubleValueField
;;FIXME: CFMachPortRef in CGEventTapCreate
;;FIXME: CFMachPortRef in CGEventTapCreateForPSN
;;FIXME: CFMachPortRef in CGEventTapEnable
;;FIXME: CFMachPortRef in CGEventTapIsEnabled
;;FIXME: CGEventTapProxy in CGEventTapPostEvent
;;FIXME: CGEventRef in CGEventPost
;;FIXME: void * in CGEventPostToPSN
;;FIXME: CGEventTapInformation [] in CGGetEventTapList
[:function CGEventSourceGetTypeID [:unsigned-long]]
;;FIXME: CGEventSourceRef in CGEventSourceCreate
;;FIXME: CGEventSourceRef in CGEventSourceGetKeyboardType
;;FIXME: CGEventSourceRef in CGEventSourceSetKeyboardType
;;FIXME: CGEventSourceRef in CGEventSourceGetPixelsPerLine
;;FIXME: CGEventSourceRef in CGEventSourceSetPixelsPerLine
;;FIXME: CGEventSourceRef in CGEventSourceGetSourceStateID
[:function CGEventSourceButtonState [Boolean :unsigned-int :unsigned-int]]
[:function CGEventSourceKeyState [Boolean :unsigned-int :unsigned-short]]
[:function CGEventSourceFlagsState [:unsigned-long-long :unsigned-int]]
[:function CGEventSourceSecondsSinceLastEventType [:double :unsigned-int :unsigned-int]]
[:function CGEventSourceCounterForEventType [:unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: CGEventSourceRef in CGEventSourceSetUserData
;;FIXME: CGEventSourceRef in CGEventSourceGetUserData
;;FIXME: CGEventSourceRef in CGEventSourceSetLocalEventsFilterDuringSuppressionState
;;FIXME: CGEventSourceRef in CGEventSourceGetLocalEventsFilterDuringSuppressionState
;;FIXME: CGEventSourceRef in CGEventSourceSetLocalEventsSuppressionInterval
;;FIXME: CGEventSourceRef in CGEventSourceGetLocalEventsSuppressionInterval
;;FIXME: CGContextRef in CGGLContextCreate
;;FIXME: CGContextRef in CGGLContextUpdateViewportSize
[:compound CGPSConverterCallbacks "sizeof (CGPSConverterCallbacks)"]
;;FIXME: CGPSConverterRef in CGPSConverterCreate
;;FIXME: CGPSConverterRef in CGPSConverterConvert
;;FIXME: CGPSConverterRef in CGPSConverterAbort
;;FIXME: CGPSConverterRef in CGPSConverterIsConverting
[:function CGPSConverterGetTypeID [:unsigned-long]]
;;FIXME: CFDictionaryRef in CGSessionCopyCurrentDictionary
;;FIXME: CFArrayRef in CGWindowListCopyWindowInfo
;;FIXME: CFArrayRef in CGWindowListCreate
;;FIXME: CFArrayRef in CGWindowListCreateDescriptionFromArray
;;FIXME: CGImageRef in CGWindowListCreateImage
;;FIXME: CGImageRef in CGWindowListCreateImageFromArray
[:function CGWindowLevelForKey [:int :int]]
[:compound CMDateTime "sizeof (CMDateTime)"]
[:compound CMFixedXYColor "sizeof (CMFixedXYColor)"]
[:compound CMFixedXYZColor "sizeof (CMFixedXYZColor)"]
[:compound CMXYZColor "sizeof (CMXYZColor)"]
[:compound CM2Header "sizeof (CM2Header)"]
[:compound CM4Header "sizeof (CM4Header)"]
[:compound CMTagRecord "sizeof (CMTagRecord)"]
[:compound CMTagElemTable "sizeof (CMTagElemTable)"]
[:compound CM2Profile "sizeof (CM2Profile)"]
[:compound CMAdaptationMatrixType "sizeof (CMAdaptationMatrixType)"]
[:compound CMCurveType "sizeof (CMCurveType)"]
[:compound CMDataType "sizeof (CMDataType)"]
[:compound CMDateTimeType "sizeof (CMDateTimeType)"]
[:compound CMLut16Type "sizeof (CMLut16Type)"]
[:compound CMLut8Type "sizeof (CMLut8Type)"]
[:compound CMMultiFunctLutType "sizeof (CMMultiFunctLutType)"]
[:compound CMMultiFunctLutA2BType "sizeof (CMMultiFunctLutA2BType)"]
[:compound CMMultiFunctLutB2AType "sizeof (CMMultiFunctLutB2AType)"]
[:compound CMMultiFunctCLUTType "sizeof (CMMultiFunctCLUTType)"]
[:compound CMMeasurementType "sizeof (CMMeasurementType)"]
[:compound CMNamedColorType "sizeof (CMNamedColorType)"]
[:compound CMNamedColor2EntryType "sizeof (CMNamedColor2EntryType)"]
[:compound CMNamedColor2Type "sizeof (CMNamedColor2Type)"]
[:compound CMNativeDisplayInfo "sizeof (CMNativeDisplayInfo)"]
[:compound CMNativeDisplayInfoType "sizeof (CMNativeDisplayInfoType)"]
[:compound CMParametricCurveType "sizeof (CMParametricCurveType)"]
[:compound CMTextDescriptionType "sizeof (CMTextDescriptionType)"]
[:compound CMTextType "sizeof (CMTextType)"]
[:compound CMUnicodeTextType "sizeof (CMUnicodeTextType)"]
[:compound CMScreeningChannelRec "sizeof (CMScreeningChannelRec)"]
[:compound CMScreeningType "sizeof (CMScreeningType)"]
[:compound CMSignatureType "sizeof (CMSignatureType)"]
[:compound CMS15Fixed16ArrayType "sizeof (CMS15Fixed16ArrayType)"]
[:compound CMU16Fixed16ArrayType "sizeof (CMU16Fixed16ArrayType)"]
[:compound CMUInt8ArrayType "sizeof (CMUInt8ArrayType)"]
[:compound CMUInt16ArrayType "sizeof (CMUInt16ArrayType)"]
[:compound CMUInt32ArrayType "sizeof (CMUInt32ArrayType)"]
[:compound CMUInt64ArrayType "sizeof (CMUInt64ArrayType)"]
[:compound CMViewingConditionsType "sizeof (CMViewingConditionsType)"]
[:compound CMXYZType "sizeof (CMXYZType)"]
[:compound CMProfileSequenceDescType "sizeof (CMProfileSequenceDescType)"]
[:compound CMUcrBgType "sizeof (CMUcrBgType)"]
[:compound CMIntentCRDVMSize "sizeof (CMIntentCRDVMSize)"]
[:compound CMPS2CRDVMSizeType "sizeof (CMPS2CRDVMSizeType)"]
[:compound CMVideoCardGammaTable "sizeof (CMVideoCardGammaTable)"]
[:compound CMVideoCardGammaFormula "sizeof (CMVideoCardGammaFormula)"]
[:compound CMVideoCardGamma "sizeof (CMVideoCardGamma)"]
[:compound CMVideoCardGammaType "sizeof (CMVideoCardGammaType)"]
[:compound CMMakeAndModel "sizeof (CMMakeAndModel)"]
[:compound CMMakeAndModelType "sizeof (CMMakeAndModelType)"]
[:compound CMMultiLocalizedUniCodeEntryRec "sizeof (CMMultiLocalizedUniCodeEntryRec)"]
[:compound CMMultiLocalizedUniCodeType "sizeof (CMMultiLocalizedUniCodeType)"]
;;FIXME: CMFlattenUPP in NewCMFlattenUPP
;;FIXME: long * in InvokeCMFlattenUPP
;;FIXME: CMFlattenUPP in DisposeCMFlattenUPP
;;FIXME: CMBitmapCallBackUPP in NewCMBitmapCallBackUPP
;;FIXME: void * in InvokeCMBitmapCallBackUPP
;;FIXME: CMBitmapCallBackUPP in DisposeCMBitmapCallBackUPP
;;FIXME: CMConcatCallBackUPP in NewCMConcatCallBackUPP
;;FIXME: void * in InvokeCMConcatCallBackUPP
;;FIXME: CMConcatCallBackUPP in DisposeCMConcatCallBackUPP
[:compound CMAppleProfileHeader "sizeof (CMAppleProfileHeader)"]
[:compound CMConcatProfileSet "sizeof (CMConcatProfileSet)"]
[:compound NCMConcatProfileSpec "sizeof (NCMConcatProfileSpec)"]
[:compound NCMConcatProfileSet "sizeof (NCMConcatProfileSet)"]
[:compound CMRGBColor "sizeof (CMRGBColor)"]
[:compound CMCMYKColor "sizeof (CMCMYKColor)"]
[:compound CMCMYColor "sizeof (CMCMYColor)"]
[:compound CMHLSColor "sizeof (CMHLSColor)"]
[:compound CMHSVColor "sizeof (CMHSVColor)"]
[:compound CMLabColor "sizeof (CMLabColor)"]
[:compound CMLuvColor "sizeof (CMLuvColor)"]
[:compound CMYxyColor "sizeof (CMYxyColor)"]
[:compound CMGrayColor "sizeof (CMGrayColor)"]
[:compound CMMultichannel5Color "sizeof (CMMultichannel5Color)"]
[:compound CMMultichannel6Color "sizeof (CMMultichannel6Color)"]
[:compound CMMultichannel7Color "sizeof (CMMultichannel7Color)"]
[:compound CMMultichannel8Color "sizeof (CMMultichannel8Color)"]
[:compound CMNamedColor "sizeof (CMNamedColor)"]
[:compound CMColor "sizeof (CMColor)"]
[:compound CMMInfo "sizeof (CMMInfo)"]
[:compound CMBitmap "sizeof (CMBitmap)"]
[:compound CMHandleLocation "sizeof (CMHandleLocation)"]
[:compound CMPathLocation "sizeof (CMPathLocation)"]
[:compound CMBufferLocation "sizeof (CMBufferLocation)"]
[:compound CMProfLoc "sizeof (CMProfLoc)"]
[:compound CMProfileLocation "sizeof (CMProfileLocation)"]
[:compound CMProfileIterateData "sizeof (CMProfileIterateData)"]
;;FIXME: CMProfileIterateUPP in NewCMProfileIterateUPP
;;FIXME: CMProfileIterateData * in InvokeCMProfileIterateUPP
;;FIXME: CMProfileIterateUPP in DisposeCMProfileIterateUPP
;;FIXME: CMMIterateUPP in NewCMMIterateUPP
;;FIXME: CMMInfo * in InvokeCMMIterateUPP
;;FIXME: CMMIterateUPP in DisposeCMMIterateUPP
;;FIXME: CMProfileRef * in CMNewProfile
;;FIXME: CMProfileRef * in NCWNewLinkProfile
;;FIXME: CMProfileRef in CMMakeProfile
;;FIXME: CMProfileRef * in CMOpenProfile
;;FIXME: CMProfileRef in CMCloseProfile
;;FIXME: CMProfileRef in CMUpdateProfile
;;FIXME: CMProfileRef * in CMCopyProfile
;;FIXME: CMProfileRef in CMValidateProfile
;;FIXME: CMProfileRef in NCMGetProfileLocation
;;FIXME: CFDataRef in CMProfileCopyICCData
;;FIXME: CMProfileRef in CMGetProfileHeader
;;FIXME: CMProfileRef in CMSetProfileHeader
;;FIXME: CMProfileRef in CMCloneProfileRef
;;FIXME: CMProfileRef in CMGetProfileRefCount
;;FIXME: CMProfileRef in CMProfileModified
;;FIXME: CMProfileRef in CMGetProfileMD5
;;FIXME: CMProfileRef in CMCountProfileElements
;;FIXME: CMProfileRef in CMProfileElementExists
;;FIXME: CMProfileRef in CMGetProfileElement
;;FIXME: CMProfileRef in CMSetProfileElement
;;FIXME: CMProfileRef in CMSetProfileElementSize
;;FIXME: CMProfileRef in CMSetProfileElementReference
;;FIXME: CMProfileRef in CMGetPartialProfileElement
;;FIXME: CMProfileRef in CMSetPartialProfileElement
;;FIXME: CMProfileRef in CMGetIndProfileElementInfo
;;FIXME: CMProfileRef in CMGetIndProfileElement
;;FIXME: CMProfileRef in CMRemoveProfileElement
;;FIXME: CMProfileRef in CMGetProfileDescriptions
;;FIXME: CMProfileRef in CMSetProfileDescriptions
;;FIXME: CMProfileRef in CMCopyProfileLocalizedStringDictionary
;;FIXME: CMProfileRef in CMSetProfileLocalizedStringDictionary
;;FIXME: CMProfileRef in CMCopyProfileLocalizedString
;;FIXME: CMProfileRef in CMCopyProfileDescriptionString
;;FIXME: CMProfileRef in CMGetNamedColorInfo
;;FIXME: CMProfileRef in CMGetNamedColorValue
;;FIXME: CMProfileRef in CMGetIndNamedColorValue
;;FIXME: CMProfileRef in CMGetNamedColorIndex
;;FIXME: CMProfileRef in CMGetNamedColorName
;;FIXME: CMWorldRef * in NCWNewColorWorld
;;FIXME: CMWorldRef * in NCWConcatColorWorld
;;FIXME: CMWorldRef in CWDisposeColorWorld
;;FIXME: CMWorldRef in CWMatchColors
;;FIXME: CMWorldRef in CWCheckColors
;;FIXME: CMWorldRef in CWMatchBitmap
;;FIXME: CMWorldRef in CWCheckBitmap
;;FIXME: CMWorldRef in CWGetCMMSignature
;;FIXME: CMWorldRef in CWFillLookupTexture
;;FIXME: CMProfileRef * in CMGetSystemProfile
;;FIXME: CMProfileRef * in CMGetDefaultProfileBySpace
;;FIXME: CMProfileRef * in CMGetDefaultProfileByUse
;;FIXME: CMProfileRef * in CMGetProfileByAVID
;;FIXME: CMProfileRef in CMSetProfileByAVID
;;FIXME: CMVideoCardGamma * in CMGetGammaByAVID
;;FIXME: CMVideoCardGamma * in CMSetGammaByAVID
;;FIXME: CMProfileIterateUPP in CMIterateColorSyncFolder
;;FIXME: CMMIterateUPP in CMIterateCMMInfo
;;FIXME: UInt32 * in CMGetColorSyncVersion
[:function CMLaunchControlPanel [:int :unsigned-int]]
;;FIXME: CMProfileRef in CMGetPS2ColorSpace
;;FIXME: CMProfileRef in CMGetPS2ColorRenderingIntent
;;FIXME: CMProfileRef in CMGetPS2ColorRendering
;;FIXME: CMProfileRef in CMGetPS2ColorRenderingVMSize
[:compound CMFloatBitmap "sizeof (CMFloatBitmap)"]
;;FIXME: float * in CMFloatBitmapMakeChunky
;;FIXME: const CMFloatBitmap * in CMConvertXYZFloatBitmap
;;FIXME: const CMFloatBitmap * in CMConvertRGBFloatBitmap
;;FIXME: CMWorldRef in CMMatchFloatBitmap
;;FIXME: CMWorldRef in CWColorWorldSetProperty
;;FIXME: const void * in CWColorWorldGetProperty
;;FIXME: CMWorldRef in CMM_ConcatColorWorld
;;FIXME: CMWorldRef in CMM_MatchColors
;;FIXME: CMWorldRef in CMM_CheckColors
;;FIXME: CMProfileRef in CMM_ValidateProfile
;;FIXME: CMWorldRef in CMM_MatchBitmap
;;FIXME: CMWorldRef in CMM_CheckBitmap
;;FIXME: CMWorldRef in CMM_MatchFloatBitmap
;;FIXME: CMProfileRef in CMM_CreateLinkProfile
;;FIXME: CFTypeRef in CMM_GetProperty
[:compound CMDeviceScope "sizeof (CMDeviceScope)"]
[:compound CMDeviceProfileScope "sizeof (CMDeviceProfileScope)"]
[:compound CMDeviceInfo "sizeof (CMDeviceInfo)"]
[:compound CMDeviceProfileInfo "sizeof (CMDeviceProfileInfo)"]
[:compound NCMDeviceProfileInfo "sizeof (NCMDeviceProfileInfo)"]
[:compound CMDeviceProfileArray "sizeof (CMDeviceProfileArray)"]
;;FIXME: CFDictionaryRef in CMRegisterColorDevice
[:function CMUnregisterColorDevice [:int :unsigned-int :unsigned-int]]
[:function CMSetDefaultDevice [:int :unsigned-int :unsigned-int]]
;;FIXME: CMDeviceID * in CMGetDefaultDevice
;;FIXME: const CMDeviceProfileArray * in CMSetDeviceFactoryProfiles
;;FIXME: CMDeviceProfileID * in CMGetDeviceFactoryProfiles
[:function CMSetDeviceDefaultProfileID [:int :unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: CMDeviceProfileID * in CMGetDeviceDefaultProfileID
;;FIXME: const CMDeviceProfileScope * in CMSetDeviceProfile
;;FIXME: CMProfileLocation * in CMGetDeviceProfile
[:function CMSetDeviceState [:int :unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: CMDeviceState * in CMGetDeviceState
;;FIXME: CMDeviceInfo * in CMGetDeviceInfo
;;FIXME: CMIterateDeviceInfoProcPtr in CMIterateColorDevices
;;FIXME: CMIterateDeviceProfileProcPtr in CMIterateDeviceProfiles
[:compound BitMap "sizeof (BitMap)"]
[:compound RGBColor "sizeof (RGBColor)"]
[:compound ColorSpec "sizeof (ColorSpec)"]
[:compound ColorTable "sizeof (ColorTable)"]
[:compound PixMap "sizeof (PixMap)"]
[:compound Pattern "sizeof (Pattern)"]
[:compound PixPat "sizeof (PixPat)"]
[:compound GDevice "sizeof (GDevice)"]
[:compound Picture "sizeof (Picture)"]
[:compound OpenCPicParams "sizeof (OpenCPicParams)"]
[:compound FontInfo "sizeof (FontInfo)"]
;;FIXME: RegionToRectsUPP in NewRegionToRectsUPP
;;FIXME: RegionToRectsUPP in DisposeRegionToRectsUPP
;;FIXME: RgnHandle in InvokeRegionToRectsUPP
;;FIXME: DragGrayRgnUPP in NewDragGrayRgnUPP
;;FIXME: ColorSearchUPP in NewColorSearchUPP
;;FIXME: ColorComplementUPP in NewColorComplementUPP
;;FIXME: DragGrayRgnUPP in DisposeDragGrayRgnUPP
;;FIXME: ColorSearchUPP in DisposeColorSearchUPP
;;FIXME: ColorComplementUPP in DisposeColorComplementUPP
;;FIXME: DragGrayRgnUPP in InvokeDragGrayRgnUPP
;;FIXME: RGBColor * in InvokeColorSearchUPP
;;FIXME: RGBColor * in InvokeColorComplementUPP
[:compound VDGammaRecord "sizeof (VDGammaRecord)"]
[:compound MacPolygon "sizeof (MacPolygon)"]
;;FIXME: QDTextUPP in NewQDTextUPP
;;FIXME: QDLineUPP in NewQDLineUPP
;;FIXME: QDRectUPP in NewQDRectUPP
;;FIXME: QDRRectUPP in NewQDRRectUPP
;;FIXME: QDOvalUPP in NewQDOvalUPP
;;FIXME: QDArcUPP in NewQDArcUPP
;;FIXME: QDPolyUPP in NewQDPolyUPP
;;FIXME: QDRgnUPP in NewQDRgnUPP
;;FIXME: QDBitsUPP in NewQDBitsUPP
;;FIXME: QDCommentUPP in NewQDCommentUPP
;;FIXME: QDTxMeasUPP in NewQDTxMeasUPP
;;FIXME: QDGetPicUPP in NewQDGetPicUPP
;;FIXME: QDPutPicUPP in NewQDPutPicUPP
;;FIXME: QDOpcodeUPP in NewQDOpcodeUPP
;;FIXME: QDStdGlyphsUPP in NewQDStdGlyphsUPP
;;FIXME: QDJShieldCursorUPP in NewQDJShieldCursorUPP
;;FIXME: QDPrinterStatusUPP in NewQDPrinterStatusUPP
;;FIXME: QDTextUPP in DisposeQDTextUPP
;;FIXME: QDLineUPP in DisposeQDLineUPP
;;FIXME: QDRectUPP in DisposeQDRectUPP
;;FIXME: QDRRectUPP in DisposeQDRRectUPP
;;FIXME: QDOvalUPP in DisposeQDOvalUPP
;;FIXME: QDArcUPP in DisposeQDArcUPP
;;FIXME: QDPolyUPP in DisposeQDPolyUPP
;;FIXME: QDRgnUPP in DisposeQDRgnUPP
;;FIXME: QDBitsUPP in DisposeQDBitsUPP
;;FIXME: QDCommentUPP in DisposeQDCommentUPP
;;FIXME: QDTxMeasUPP in DisposeQDTxMeasUPP
;;FIXME: QDGetPicUPP in DisposeQDGetPicUPP
;;FIXME: QDPutPicUPP in DisposeQDPutPicUPP
;;FIXME: QDOpcodeUPP in DisposeQDOpcodeUPP
;;FIXME: QDStdGlyphsUPP in DisposeQDStdGlyphsUPP
;;FIXME: QDJShieldCursorUPP in DisposeQDJShieldCursorUPP
;;FIXME: QDPrinterStatusUPP in DisposeQDPrinterStatusUPP
;;FIXME: const void * in InvokeQDTextUPP
;;FIXME: QDLineUPP in InvokeQDLineUPP
;;FIXME: const Rect * in InvokeQDRectUPP
;;FIXME: const Rect * in InvokeQDRRectUPP
;;FIXME: const Rect * in InvokeQDOvalUPP
;;FIXME: const Rect * in InvokeQDArcUPP
;;FIXME: PolyHandle in InvokeQDPolyUPP
;;FIXME: RgnHandle in InvokeQDRgnUPP
;;FIXME: const BitMap * in InvokeQDBitsUPP
;;FIXME: Handle in InvokeQDCommentUPP
;;FIXME: const void * in InvokeQDTxMeasUPP
;;FIXME: void * in InvokeQDGetPicUPP
;;FIXME: const void * in InvokeQDPutPicUPP
;;FIXME: const Rect * in InvokeQDOpcodeUPP
;;FIXME: void * in InvokeQDStdGlyphsUPP
;;FIXME: QDJShieldCursorUPP in InvokeQDJShieldCursorUPP
;;FIXME: CGrafPtr in InvokeQDPrinterStatusUPP
[:compound CQDProcs "sizeof (CQDProcs)"]
[:compound GrafPort "sizeof (GrafPort)"]
[:compound FontRec "sizeof (FontRec)"]
[:compound FMInput "sizeof (FMInput)"]
[:compound FamRec "sizeof (FamRec)"]
[:compound AsscEntry "sizeof (AsscEntry)"]
[:compound FontAssoc "sizeof (FontAssoc)"]
[:compound StyleTable "sizeof (StyleTable)"]
[:compound NameTable "sizeof (NameTable)"]
[:compound KernPair "sizeof (KernPair)"]
[:compound KernEntry "sizeof (KernEntry)"]
[:compound KernTable "sizeof (KernTable)"]
[:compound ATSUAttributeInfo "sizeof (ATSUAttributeInfo)"]
[:compound ATSUCaret "sizeof (ATSUCaret)"]
[:compound ATSUTab "sizeof (ATSUTab)"]
[:compound ATSURGBAlphaColor "sizeof (ATSURGBAlphaColor)"]
[:compound ATSUGlyphSelector "sizeof (ATSUGlyphSelector)"]
[:compound ATSUGlyphInfo "sizeof (ATSUGlyphInfo)"]
[:compound ATSUGlyphInfoArray "sizeof (ATSUGlyphInfoArray)"]
;;FIXME: RedrawBackgroundUPP in NewRedrawBackgroundUPP
;;FIXME: RedrawBackgroundUPP in DisposeRedrawBackgroundUPP
;;FIXME: ATSUTextLayout in InvokeRedrawBackgroundUPP
[:compound ATSUBackgroundData "sizeof (ATSUBackgroundData)"]
[:compound ATSUUnhighlightData "sizeof (ATSUUnhighlightData)"]
;;FIXME: ATSUStyle * in ATSUCreateStyle
;;FIXME: ATSUStyle in ATSUDisposeStyle
;;FIXME: ATSUStyle in ATSUSetAttributes
;;FIXME: ConstUniCharArrayPtr in ATSUCreateTextLayoutWithTextPtr
;;FIXME: ATSUTextLayout in ATSUClearLayoutCache
;;FIXME: ATSUTextLayout in ATSUDisposeTextLayout
;;FIXME: ATSUTextLayout in ATSUSetTextLayoutRefCon
;;FIXME: ATSUTextLayout in ATSUTextMoved
;;FIXME: ATSUTextLayout in ATSUSetLayoutControls
;;FIXME: ATSUTextLayout in ATSUSetRunStyle
;;FIXME: ATSUTextLayout in ATSUMatchFontsToText
;;FIXME: ATSUTextLayout in ATSUSetTransientFontMatching
;;FIXME: ATSUTextLayout in ATSUDrawText
;;FIXME: ATSUTextLayout in ATSUGetGlyphBounds
;;FIXME: ATSUTextLayout in ATSUPositionToOffset
;;FIXME: ATSUStyle in ATSUSetFontFeatures
;;FIXME: ATSQuadraticNewPathUPP in NewATSQuadraticNewPathUPP
;;FIXME: ATSQuadraticNewPathUPP in DisposeATSQuadraticNewPathUPP
;;FIXME: void * in InvokeATSQuadraticNewPathUPP
;;FIXME: ATSQuadraticLineUPP in NewATSQuadraticLineUPP
;;FIXME: ATSQuadraticLineUPP in DisposeATSQuadraticLineUPP
;;FIXME: const Float32Point * in InvokeATSQuadraticLineUPP
;;FIXME: ATSQuadraticCurveUPP in NewATSQuadraticCurveUPP
;;FIXME: ATSQuadraticCurveUPP in DisposeATSQuadraticCurveUPP
;;FIXME: const Float32Point * in InvokeATSQuadraticCurveUPP
;;FIXME: ATSQuadraticClosePathUPP in NewATSQuadraticClosePathUPP
;;FIXME: ATSQuadraticClosePathUPP in DisposeATSQuadraticClosePathUPP
;;FIXME: void * in InvokeATSQuadraticClosePathUPP
;;FIXME: ATSCubicMoveToUPP in NewATSCubicMoveToUPP
;;FIXME: ATSCubicMoveToUPP in DisposeATSCubicMoveToUPP
;;FIXME: const Float32Point * in InvokeATSCubicMoveToUPP
;;FIXME: ATSCubicLineToUPP in NewATSCubicLineToUPP
;;FIXME: ATSCubicLineToUPP in DisposeATSCubicLineToUPP
;;FIXME: const Float32Point * in InvokeATSCubicLineToUPP
;;FIXME: ATSCubicCurveToUPP in NewATSCubicCurveToUPP
;;FIXME: ATSCubicCurveToUPP in DisposeATSCubicCurveToUPP
;;FIXME: const Float32Point * in InvokeATSCubicCurveToUPP
;;FIXME: ATSCubicClosePathUPP in NewATSCubicClosePathUPP
;;FIXME: ATSCubicClosePathUPP in DisposeATSCubicClosePathUPP
;;FIXME: void * in InvokeATSCubicClosePathUPP
[:compound ATSUStyleRunInfo "sizeof (ATSUStyleRunInfo)"]
[:compound ATSFlatDataMainHeaderBlock "sizeof (ATSFlatDataMainHeaderBlock)"]
[:compound ATSFlatDataTextLayoutDataHeader "sizeof (ATSFlatDataTextLayoutDataHeader)"]
[:compound ATSFlatDataTextLayoutHeader "sizeof (ATSFlatDataTextLayoutHeader)"]
[:compound ATSFlatDataLayoutControlsDataHeader "sizeof (ATSFlatDataLayoutControlsDataHeader)"]
[:compound ATSFlatDataLineInfoData "sizeof (ATSFlatDataLineInfoData)"]
[:compound ATSFlatDataLineInfoHeader "sizeof (ATSFlatDataLineInfoHeader)"]
[:compound ATSFlatDataStyleRunDataHeader "sizeof (ATSFlatDataStyleRunDataHeader)"]
[:compound ATSFlatDataStyleListStyleDataHeader "sizeof (ATSFlatDataStyleListStyleDataHeader)"]
[:compound ATSFlatDataStyleListHeader "sizeof (ATSFlatDataStyleListHeader)"]
[:compound ATSFlatDataStyleListFeatureData "sizeof (ATSFlatDataStyleListFeatureData)"]
[:compound ATSFlatDataStyleListVariationData "sizeof (ATSFlatDataStyleListVariationData)"]
[:compound ATSFlatDataFontNameDataHeader "sizeof (ATSFlatDataFontNameDataHeader)"]
[:compound ATSFlatDataFontSpecRawNameData "sizeof (ATSFlatDataFontSpecRawNameData)"]
[:compound ATSFlatDataFontSpecRawNameDataHeader "sizeof (ATSFlatDataFontSpecRawNameDataHeader)"]
;;FIXME: ATSULineRef in ATSUDirectGetLayoutDataArrayPtrFromLineRef
;;FIXME: ATSULineRef in ATSUDirectReleaseLayoutDataArrayPtr
[:function HIShapeGetTypeID [:unsigned-long]]
;;FIXME: HIShapeRef in HIShapeCreateEmpty
;;FIXME: HIShapeRef in HIShapeCreateWithQDRgn
;;FIXME: HIShapeRef in HIShapeCreateWithRect
;;FIXME: HIShapeRef in HIShapeCreateCopy
;;FIXME: HIShapeRef in HIShapeCreateIntersection
;;FIXME: HIShapeRef in HIShapeCreateDifference
;;FIXME: HIShapeRef in HIShapeCreateUnion
;;FIXME: HIShapeRef in HIShapeCreateXor
;;FIXME: HIShapeRef in HIShapeIsEmpty
;;FIXME: HIShapeRef in HIShapeIsRectangular
;;FIXME: HIShapeRef in HIShapeContainsPoint
;;FIXME: HIShapeRef in HIShapeIntersectsRect
;;FIXME: CGRect * in HIShapeGetBounds
;;FIXME: HIShapeRef in HIShapeGetAsQDRgn
;;FIXME: HIShapeRef in HIShapeReplacePathInCGContext
;;FIXME: HIShapeRef in HIShapeEnumerate
;;FIXME: HIMutableShapeRef in HIShapeCreateMutable
;;FIXME: HIMutableShapeRef in HIShapeCreateMutableCopy
;;FIXME: HIMutableShapeRef in HIShapeCreateMutableWithRect
;;FIXME: HIMutableShapeRef in HIShapeSetEmpty
;;FIXME: HIMutableShapeRef in HIShapeSetWithShape
;;FIXME: HIShapeRef in HIShapeIntersect
;;FIXME: HIShapeRef in HIShapeDifference
;;FIXME: HIShapeRef in HIShapeUnion
;;FIXME: HIShapeRef in HIShapeXor
;;FIXME: HIMutableShapeRef in HIShapeOffset
;;FIXME: HIMutableShapeRef in HIShapeInset
;;FIXME: HIMutableShapeRef in HIShapeUnionWithRect
;;FIXME: IconActionUPP in NewIconActionUPP
;;FIXME: IconGetterUPP in NewIconGetterUPP
;;FIXME: IconActionUPP in DisposeIconActionUPP
;;FIXME: IconGetterUPP in DisposeIconGetterUPP
;;FIXME: Handle * in InvokeIconActionUPP
;;FIXME: Handle in InvokeIconGetterUPP
;;FIXME: IconRef in IconRefToIconFamily
;;FIXME: IconFamilyHandle in SetIconFamilyData
;;FIXME: IconFamilyHandle in GetIconFamilyData
;;FIXME: CGContextRef in PlotIconRefInContext
;;FIXME: const CGPoint * in IconRefContainsCGPoint
;;FIXME: const CGRect * in IconRefIntersectsCGRect
;;FIXME: HIShapeRef in IconRefToHIShape
;;FIXME: IconRef in IsIconRefMaskEmpty
;;FIXME: IconRef in GetIconRefVariant
[:compound ICFontRecord "sizeof (ICFontRecord)"]
[:compound ICCharTable "sizeof (ICCharTable)"]
[:compound ICAppSpec "sizeof (ICAppSpec)"]
[:compound ICAppSpecList "sizeof (ICAppSpecList)"]
[:compound ICFileSpec "sizeof (ICFileSpec)"]
[:compound ICMapEntry "sizeof (ICMapEntry)"]
[:compound ICServiceEntry "sizeof (ICServiceEntry)"]
[:compound ICServices "sizeof (ICServices)"]
;;FIXME: ICInstance * in ICStart
;;FIXME: ICInstance in ICStop
;;FIXME: ICInstance in ICGetVersion
;;FIXME: ICInstance in ICGetConfigName
;;FIXME: ICInstance in ICGetSeed
;;FIXME: ICInstance in ICGetPerm
;;FIXME: ICInstance in ICBegin
;;FIXME: ICInstance in ICGetPref
;;FIXME: ICInstance in ICSetPref
;;FIXME: ICInstance in ICFindPrefHandle
;;FIXME: ICInstance in ICGetPrefHandle
;;FIXME: ICInstance in ICSetPrefHandle
;;FIXME: ICInstance in ICCountPref
;;FIXME: ICInstance in ICGetIndPref
;;FIXME: ICInstance in ICDeletePref
;;FIXME: ICInstance in ICEnd
;;FIXME: ICInstance in ICGetDefaultPref
;;FIXME: ICInstance in ICEditPreferences
;;FIXME: ICInstance in ICLaunchURL
;;FIXME: ICInstance in ICParseURL
;;FIXME: ICInstance in ICCreateGURLEvent
;;FIXME: ICInstance in ICSendGURLEvent
;;FIXME: ICInstance in ICMapFilename
;;FIXME: ICInstance in ICMapTypeCreator
;;FIXME: ICInstance in ICMapEntriesFilename
;;FIXME: ICInstance in ICMapEntriesTypeCreator
;;FIXME: ICInstance in ICCountMapEntries
;;FIXME: ICInstance in ICGetIndMapEntry
;;FIXME: ICInstance in ICGetMapEntry
;;FIXME: ICInstance in ICSetMapEntry
;;FIXME: ICInstance in ICDeleteMapEntry
;;FIXME: ICInstance in ICAddMapEntry
;;FIXME: ICInstance in ICGetCurrentProfile
;;FIXME: ICInstance in ICSetCurrentProfile
;;FIXME: ICInstance in ICCountProfiles
;;FIXME: ICInstance in ICGetIndProfile
;;FIXME: ICInstance in ICGetProfileName
;;FIXME: ICInstance in ICSetProfileName
;;FIXME: ICInstance in ICAddProfile
;;FIXME: ICInstance in ICDeleteProfile
[:compound AppParameters "sizeof (AppParameters)"]
[:compound LaunchParamBlockRec "sizeof (LaunchParamBlockRec)"]
[:compound ProcessInfoRec "sizeof (ProcessInfoRec)"]
[:compound ProcessInfoExtendedRec "sizeof (ProcessInfoExtendedRec)"]
[:compound SizeResourceRec "sizeof (SizeResourceRec)"]
;;FIXME: LaunchPBPtr in LaunchApplication
;;FIXME: ProcessSerialNumber * in GetCurrentProcess
;;FIXME: ProcessSerialNumber * in GetFrontProcess
;;FIXME: ProcessSerialNumber * in GetNextProcess
;;FIXME: const ProcessSerialNumber * in GetProcessInformation
;;FIXME: CFDictionaryRef in ProcessInformationCopyDictionary
;;FIXME: const ProcessSerialNumber * in SetFrontProcess
;;FIXME: const ProcessSerialNumber * in SetFrontProcessWithOptions
;;FIXME: const ProcessSerialNumber * in WakeUpProcess
;;FIXME: const ProcessSerialNumber * in SameProcess
[:function ExitToShell [:void]]
;;FIXME: const ProcessSerialNumber * in KillProcess
;;FIXME: const ProcessSerialNumber * in GetProcessBundleLocation
;;FIXME: const ProcessSerialNumber * in CopyProcessName
;;FIXME: const ProcessSerialNumber * in GetProcessPID
;;FIXME: ProcessSerialNumber * in GetProcessForPID
;;FIXME: const ProcessSerialNumber * in IsProcessVisible
;;FIXME: const ProcessSerialNumber * in ShowHideProcess
;;FIXME: const ProcessSerialNumber * in TransformProcessType
[:function PasteboardGetTypeID [:unsigned-long]]
;;FIXME: CFStringRef in PasteboardCreate
;;FIXME: PasteboardRef in PasteboardSynchronize
;;FIXME: PasteboardRef in PasteboardClear
;;FIXME: PasteboardRef in PasteboardCopyName
;;FIXME: PasteboardRef in PasteboardGetItemCount
;;FIXME: PasteboardRef in PasteboardGetItemIdentifier
;;FIXME: PasteboardRef in PasteboardCopyItemFlavors
;;FIXME: PasteboardRef in PasteboardGetItemFlavorFlags
;;FIXME: PasteboardRef in PasteboardCopyItemFlavorData
;;FIXME: PasteboardRef in PasteboardPutItemFlavor
;;FIXME: PasteboardRef in PasteboardCopyPasteLocation
;;FIXME: PasteboardRef in PasteboardSetPasteLocation
;;FIXME: PasteboardRef in PasteboardSetPromiseKeeper
;;FIXME: PasteboardRef in PasteboardResolvePromises
[:function TranslationGetTypeID [:unsigned-long]]
;;FIXME: CFStringRef in TranslationCreate
;;FIXME: CFArrayRef in TranslationCreateWithSourceArray
;;FIXME: TranslationRef in TranslationPerformForData
;;FIXME: TranslationRef in TranslationPerformForFile
;;FIXME: TranslationRef in TranslationPerformForURL
;;FIXME: TranslationRef in TranslationCopySourceType
;;FIXME: TranslationRef in TranslationCopyDestinationType
;;FIXME: TranslationRef in TranslationGetTranslationFlags
[:function AXAPIEnabled [:unsigned-char]]
[:function AXIsProcessTrusted [:unsigned-char]]
;;FIXME: CFStringRef in AXMakeProcessTrusted
[:function AXUIElementGetTypeID [:unsigned-long]]
;;FIXME: AXUIElementRef in AXUIElementCopyAttributeNames
;;FIXME: AXUIElementRef in AXUIElementCopyAttributeValue
;;FIXME: AXUIElementRef in AXUIElementGetAttributeValueCount
;;FIXME: AXUIElementRef in AXUIElementCopyAttributeValues
;;FIXME: AXUIElementRef in AXUIElementIsAttributeSettable
;;FIXME: AXUIElementRef in AXUIElementSetAttributeValue
;;FIXME: AXUIElementRef in AXUIElementCopyMultipleAttributeValues
;;FIXME: AXUIElementRef in AXUIElementCopyParameterizedAttributeNames
;;FIXME: AXUIElementRef in AXUIElementCopyParameterizedAttributeValue
;;FIXME: AXUIElementRef in AXUIElementCopyActionNames
;;FIXME: AXUIElementRef in AXUIElementCopyActionDescription
;;FIXME: AXUIElementRef in AXUIElementPerformAction
;;FIXME: AXUIElementRef in AXUIElementCopyElementAtPosition
;;FIXME: AXUIElementRef in AXUIElementCreateApplication
;;FIXME: AXUIElementRef in AXUIElementCreateSystemWide
;;FIXME: AXUIElementRef in AXUIElementGetPid
;;FIXME: AXUIElementRef in AXUIElementSetMessagingTimeout
;;FIXME: AXUIElementRef in AXUIElementPostKeyboardEvent
[:function AXObserverGetTypeID [:unsigned-long]]
;;FIXME: AXObserverCallback in AXObserverCreate
;;FIXME: AXObserverRef in AXObserverAddNotification
;;FIXME: AXObserverRef in AXObserverRemoveNotification
;;FIXME: CFRunLoopSourceRef in AXObserverGetRunLoopSource
[:function AXValueGetTypeID [:unsigned-long]]
;;FIXME: AXValueRef in AXValueCreate
;;FIXME: AXValueType in AXValueGetType
;;FIXME: AXValueRef in AXValueGetValue
[:function UAZoomEnabled [:unsigned-char]]
;;FIXME: const CGRect * in UAZoomChangeFocus
[:function ColorSyncProfileGetTypeID [:unsigned-long]]
;;FIXME: ColorSyncProfileRef in ColorSyncProfileCreate
;;FIXME: ColorSyncProfileRef in ColorSyncProfileCreateWithURL
;;FIXME: ColorSyncProfileRef in ColorSyncProfileCreateWithName
;;FIXME: ColorSyncProfileRef in ColorSyncProfileCreateWithDisplayID
;;FIXME: ColorSyncProfileRef in ColorSyncProfileCreateDeviceProfile
;;FIXME: ColorSyncMutableProfileRef in ColorSyncProfileCreateMutable
;;FIXME: ColorSyncMutableProfileRef in ColorSyncProfileCreateMutableCopy
;;FIXME: ColorSyncProfileRef in ColorSyncProfileCreateLink
;;FIXME: ColorSyncProfileRef in ColorSyncProfileVerify
;;FIXME: CFErrorRef * in ColorSyncProfileEstimateGammaWithDisplayID
;;FIXME: ColorSyncProfileRef in ColorSyncProfileEstimateGamma
[:compound ColorSyncMD5 "sizeof (ColorSyncMD5)"]
;;FIXME: ColorSyncProfileRef in ColorSyncProfileGetMD5
;;FIXME: CFDataRef in ColorSyncProfileCopyData
;;FIXME: CFURLRef in ColorSyncProfileGetURL
;;FIXME: CFDataRef in ColorSyncProfileCopyHeader
;;FIXME: ColorSyncMutableProfileRef in ColorSyncProfileSetHeader
;;FIXME: CFStringRef in ColorSyncProfileCopyDescriptionString
;;FIXME: CFArrayRef in ColorSyncProfileCopyTagSignatures
;;FIXME: ColorSyncProfileRef in ColorSyncProfileContainsTag
;;FIXME: CFDataRef in ColorSyncProfileCopyTag
;;FIXME: ColorSyncMutableProfileRef in ColorSyncProfileSetTag
;;FIXME: ColorSyncMutableProfileRef in ColorSyncProfileRemoveTag
;;FIXME: ColorSyncProfileRef in ColorSyncProfileGetDisplayTransferFormulaFromVCGT
;;FIXME: CFDataRef in ColorSyncProfileCreateDisplayTransferTablesFromVCGT
;;FIXME: ColorSyncProfileIterateCallback in ColorSyncIterateInstalledProfiles
[:function ColorSyncTransformGetTypeID [:unsigned-long]]
;;FIXME: ColorSyncTransformRef in ColorSyncTransformCreate
;;FIXME: CFTypeRef in ColorSyncTransformCopyProperty
;;FIXME: ColorSyncTransformRef in ColorSyncTransformSetProperty
;;FIXME: ColorSyncTransformRef in ColorSyncTransformConvert
[:function ColorSyncCMMGetTypeID [:unsigned-long]]
;;FIXME: ColorSyncCMMRef in ColorSyncCMMCreate
;;FIXME: CFBundleRef in ColorSyncCMMGetBundle
;;FIXME: CFStringRef in ColorSyncCMMCopyLocalizedName
;;FIXME: CFStringRef in ColorSyncCMMCopyCMMIdentifier
;;FIXME: ColorSyncCMMIterateCallback in ColorSyncIterateInstalledCMMs
;;FIXME: CFStringRef in ColorSyncRegisterDevice
;;FIXME: CFStringRef in ColorSyncUnregisterDevice
;;FIXME: CFStringRef in ColorSyncDeviceSetCustomProfiles
;;FIXME: CFDictionaryRef in ColorSyncDeviceCopyDeviceInfo
;;FIXME: ColorSyncDeviceProfileIterateCallback in ColorSyncIterateDeviceProfiles
;;FIXME: CFUUIDRef in CGDisplayCreateUUIDFromDisplayID
;;FIXME: CFUUIDRef in CGDisplayGetDisplayIDFromUUID
[:compound PMRect "sizeof (PMRect)"]
[:compound PMResolution "sizeof (PMResolution)"]
[:compound PMLanguageInfo "sizeof (PMLanguageInfo)"]
;;FIXME: PMObject in PMRetain
;;FIXME: PMObject in PMRelease
;;FIXME: PMPrintSession * in PMCreateSession
;;FIXME: PMPrintSession in PMSessionError
;;FIXME: PMPrintSession in PMSessionSetError
;;FIXME: PMPrintSession in PMSessionBeginCGDocumentNoDialog
;;FIXME: PMPrintSession in PMSessionEndDocumentNoDialog
;;FIXME: PMPrintSession in PMSessionBeginPageNoDialog
;;FIXME: PMPrintSession in PMSessionEndPageNoDialog
;;FIXME: PMPrintSession in PMSessionGetCGGraphicsContext
;;FIXME: PMPrintSession in PMSessionGetDestinationType
;;FIXME: PMPrintSession in PMSessionCopyDestinationFormat
;;FIXME: PMPrintSession in PMSessionCopyDestinationLocation
;;FIXME: PMPrintSession in PMSessionSetDestination
;;FIXME: PMPrintSession in PMSessionCopyOutputFormatList
;;FIXME: PMPrintSession in PMSessionCreatePageFormatList
;;FIXME: PMPrintSession in PMSessionCreatePrinterList
;;FIXME: PMPrintSession in PMSessionGetCurrentPrinter
;;FIXME: PMPrintSession in PMSessionSetCurrentPMPrinter
;;FIXME: PMPrintSession in PMSessionGetDataFromSession
;;FIXME: PMPrintSession in PMSessionSetDataInSession
;;FIXME: PMPageFormat * in PMCreatePageFormat
;;FIXME: PMPrintSession in PMSessionDefaultPageFormat
;;FIXME: PMPrintSession in PMSessionValidatePageFormat
;;FIXME: PMPageFormat in PMCopyPageFormat
;;FIXME: PMPageFormat * in PMCreatePageFormatWithPMPaper
;;FIXME: PMPageFormat in PMPageFormatCreateDataRepresentation
;;FIXME: CFDataRef in PMPageFormatCreateWithDataRepresentation
;;FIXME: PMPageFormat in PMGetAdjustedPageRect
;;FIXME: PMPageFormat in PMGetAdjustedPaperRect
;;FIXME: PMPageFormat in PMGetOrientation
;;FIXME: PMPageFormat in PMGetPageFormatExtendedData
;;FIXME: PMPageFormat in PMPageFormatGetPrinterID
;;FIXME: PMPageFormat in PMGetScale
;;FIXME: PMPageFormat in PMGetUnadjustedPageRect
;;FIXME: PMPageFormat in PMGetUnadjustedPaperRect
;;FIXME: PMPageFormat in PMSetOrientation
;;FIXME: PMPageFormat in PMSetPageFormatExtendedData
;;FIXME: PMPageFormat in PMSetScale
;;FIXME: PMPrintSettings * in PMCreatePrintSettings
;;FIXME: PMPrintSession in PMSessionDefaultPrintSettings
;;FIXME: PMPrintSession in PMSessionValidatePrintSettings
;;FIXME: PMPrintSettings in PMCopyPrintSettings
;;FIXME: PMPrintSettings in PMPrintSettingsCreateDataRepresentation
;;FIXME: CFDataRef in PMPrintSettingsCreateWithDataRepresentation
;;FIXME: PMPrintSettings in PMGetCollate
;;FIXME: PMPrintSettings in PMGetCopies
;;FIXME: PMPrintSettings in PMGetDuplex
;;FIXME: PMPrintSettings in PMGetFirstPage
;;FIXME: PMPrintSettings in PMGetLastPage
;;FIXME: PMPrintSettings in PMGetPageRange
;;FIXME: PMPrintSettings in PMPrintSettingsGetJobName
;;FIXME: PMPrintSettings in PMPrintSettingsGetValue
;;FIXME: PMPrintSettings in PMSetCollate
;;FIXME: PMPrintSettings in PMSetCopies
;;FIXME: PMPrintSettings in PMSetDuplex
;;FIXME: PMPrintSettings in PMSetFirstPage
;;FIXME: PMPrintSettings in PMSetLastPage
;;FIXME: PMPrintSettings in PMSetPageRange
;;FIXME: PMPrintSettings in PMPrintSettingsSetJobName
;;FIXME: PMPrintSettings in PMPrintSettingsSetValue
;;FIXME: PMPrintSettings in PMPrintSettingsCopyAsDictionary
;;FIXME: PMPrintSettings in PMPrintSettingsCopyKeys
;;FIXME: PMPrinter * in PMCreateGenericPrinter
;;FIXME: PMServer in PMServerCreatePrinterList
;;FIXME: PMServer in PMServerLaunchPrinterBrowser
;;FIXME: PMPrinter in PMPrinterCreateFromPrinterID
;;FIXME: PMPrinter in PMPrinterCopyDescriptionURL
;;FIXME: PMPrinter in PMPrinterCopyDeviceURI
;;FIXME: PMPrinter in PMPrinterCopyHostName
;;FIXME: PMPrinter in PMPrinterCopyPresets
;;FIXME: PMPrinter in PMPrinterGetCommInfo
;;FIXME: CFStringRef in PMPrinterGetID
;;FIXME: CFStringRef in PMPrinterGetLocation
;;FIXME: PMPrinter in PMPrinterGetDriverCreator
;;FIXME: PMPrinter in PMPrinterGetDriverReleaseInfo
;;FIXME: PMPrinter in PMPrinterGetPrinterResolutionCount
;;FIXME: PMPrinter in PMPrinterGetIndexedPrinterResolution
;;FIXME: PMPrinter in PMPrinterGetOutputResolution
;;FIXME: PMPrinter in PMPrinterSetOutputResolution
;;FIXME: PMPrinter in PMPrinterGetLanguageInfo
;;FIXME: PMPrinter in PMPrinterGetMakeAndModelName
;;FIXME: PMPrinter in PMPrinterGetMimeTypes
;;FIXME: CFStringRef in PMPrinterGetName
;;FIXME: PMPrinter in PMPrinterGetPaperList
;;FIXME: PMPrinter in PMPrinterGetState
;;FIXME: PMPrinter in PMPrinterIsDefault
;;FIXME: PMPrinter in PMPrinterIsFavorite
;;FIXME: PMPrinter in PMPrinterIsPostScriptCapable
;;FIXME: PMPrinter in PMPrinterIsPostScriptPrinter
;;FIXME: PMPrinter in PMPrinterIsRemote
;;FIXME: PMPrinter in PMPrinterSetDefault
;;FIXME: PMPreset in PMPresetCopyName
;;FIXME: PMPreset in PMPresetCreatePrintSettings
;;FIXME: PMPreset in PMPresetGetAttributes
;;FIXME: PMPageFormat in PMGetPageFormatPaper
;;FIXME: PMPrinter in PMPaperCreateCustom
;;FIXME: PMPaper in PMPaperGetWidth
;;FIXME: PMPaper in PMPaperGetHeight
;;FIXME: PMPaper in PMPaperGetMargins
;;FIXME: PMPaper in PMPaperGetID
;;FIXME: PMPaper in PMPaperGetPPDPaperName
;;FIXME: PMPaper in PMPaperCreateLocalizedName
;;FIXME: PMPaper in PMPaperGetPrinterID
;;FIXME: PMPaper in PMPaperIsCustom
;;FIXME: CFArrayRef * in PMWorkflowCopyItems
;;FIXME: CFURLRef in PMWorkflowSubmitPDFWithOptions
;;FIXME: CFURLRef in PMWorkflowSubmitPDFWithSettings
;;FIXME: PMPrinter in PMPrinterPrintWithProvider
;;FIXME: PMPrinter in PMPrinterPrintWithFile
;;FIXME: PMPrinter in PMPrinterWritePostScriptToURL
;;FIXME: PMPrintSettings in PMPrintSettingsToOptions
;;FIXME: PMPrintSettings in PMPrintSettingsToOptionsWithPrinterAndPageFormat
;;FIXME: PMPrinter in PMPrinterSendCommand
;;FIXME: PMPrinter in PMPrinterCopyState
;;FIXME: CFArrayRef * in PMCopyAvailablePPDs
;;FIXME: CFURLRef in PMCopyLocalizedPPD
;;FIXME: CFURLRef in PMCopyPPDData
;;FIXME: CGImageRef in PMCGImageCreateWithEPSDataProvider
;;FIXME: PMPageFormat in PMFlattenPageFormatToCFData
;;FIXME: PMPageFormat in PMFlattenPageFormatToURL
;;FIXME: CFDataRef in PMUnflattenPageFormatWithCFData
;;FIXME: CFURLRef in PMUnflattenPageFormatWithURL
;;FIXME: PMPrintSettings in PMFlattenPrintSettingsToCFData
;;FIXME: PMPrintSettings in PMFlattenPrintSettingsToURL
;;FIXME: CFDataRef in PMUnflattenPrintSettingsWithCFData
;;FIXME: CFURLRef in PMUnflattenPrintSettingsWithURL
;;FIXME: PMPrintSettings in PMGetPrintSettingsExtendedData
;;FIXME: PMPrintSettings in PMSetPrintSettingsExtendedData
;;FIXME: PMPaper in PMPaperGetName
;;FIXME: PMPrinter in PMPrinterCreatePaperInfoListForMenu
[:compound DCMDictionaryHeader "sizeof (DCMDictionaryHeader)"]
[:compound LAMorphemeRec "sizeof (LAMorphemeRec)"]
[:compound LAMorphemesArray "sizeof (LAMorphemesArray)"]
[:compound MorphemeTextRange "sizeof (MorphemeTextRange)"]
[:compound HomographDicInfoRec "sizeof (HomographDicInfoRec)"]
[:compound SpeechChannelRecord "sizeof (SpeechChannelRecord)"]
[:compound VoiceSpec "sizeof (VoiceSpec)"]
[:compound VoiceDescription "sizeof (VoiceDescription)"]
[:compound VoiceFileInfo "sizeof (VoiceFileInfo)"]
[:compound SpeechStatusInfo "sizeof (SpeechStatusInfo)"]
[:compound SpeechErrorInfo "sizeof (SpeechErrorInfo)"]
[:compound SpeechVersionInfo "sizeof (SpeechVersionInfo)"]
[:compound PhonemeInfo "sizeof (PhonemeInfo)"]
[:compound PhonemeDescriptor "sizeof (PhonemeDescriptor)"]
[:compound SpeechXtndData "sizeof (SpeechXtndData)"]
[:compound DelimiterInfo "sizeof (DelimiterInfo)"]
;;FIXME: SpeechTextDoneUPP in NewSpeechTextDoneUPP
;;FIXME: SpeechDoneUPP in NewSpeechDoneUPP
;;FIXME: SpeechSyncUPP in NewSpeechSyncUPP
;;FIXME: SpeechErrorUPP in NewSpeechErrorUPP
;;FIXME: SpeechPhonemeUPP in NewSpeechPhonemeUPP
;;FIXME: SpeechWordUPP in NewSpeechWordUPP
;;FIXME: SpeechTextDoneUPP in DisposeSpeechTextDoneUPP
;;FIXME: SpeechDoneUPP in DisposeSpeechDoneUPP
;;FIXME: SpeechSyncUPP in DisposeSpeechSyncUPP
;;FIXME: SpeechErrorUPP in DisposeSpeechErrorUPP
;;FIXME: SpeechPhonemeUPP in DisposeSpeechPhonemeUPP
;;FIXME: SpeechWordUPP in DisposeSpeechWordUPP
;;FIXME: SpeechChannel in InvokeSpeechTextDoneUPP
;;FIXME: SpeechChannel in InvokeSpeechDoneUPP
;;FIXME: SpeechChannel in InvokeSpeechSyncUPP
;;FIXME: SpeechChannel in InvokeSpeechErrorUPP
;;FIXME: SpeechChannel in InvokeSpeechPhonemeUPP
;;FIXME: SpeechChannel in InvokeSpeechWordUPP
[:function SpeechManagerVersion [Foundation/NumVersion]]
;;FIXME: VoiceSpec * in MakeVoiceSpec
;;FIXME: SInt16 * in CountVoices
;;FIXME: VoiceSpec * in GetIndVoice
;;FIXME: const VoiceSpec * in GetVoiceDescription
;;FIXME: const VoiceSpec * in GetVoiceInfo
;;FIXME: VoiceSpec * in NewSpeechChannel
;;FIXME: SpeechChannel in DisposeSpeechChannel
;;FIXME: ConstStr255Param in SpeakString
;;FIXME: SpeechChannel in SpeakText
;;FIXME: SpeechChannel in SpeakBuffer
;;FIXME: SpeechChannel in StopSpeech
;;FIXME: SpeechChannel in StopSpeechAt
;;FIXME: SpeechChannel in PauseSpeechAt
;;FIXME: SpeechChannel in ContinueSpeech
[:function SpeechBusy [:short]]
[:function SpeechBusySystemWide [:short]]
;;FIXME: SpeechChannel in SetSpeechRate
;;FIXME: SpeechChannel in GetSpeechRate
;;FIXME: SpeechChannel in SetSpeechPitch
;;FIXME: SpeechChannel in GetSpeechPitch
;;FIXME: SpeechChannel in SetSpeechInfo
;;FIXME: SpeechChannel in GetSpeechInfo
;;FIXME: SpeechChannel in TextToPhonemes
;;FIXME: SpeechChannel in UseDictionary
;;FIXME: SpeechChannel in SpeakCFString
;;FIXME: SpeechChannel in UseSpeechDictionary
;;FIXME: SpeechChannel in CopyPhonemesFromText
;;FIXME: SpeechChannel in CopySpeechProperty
;;FIXME: SpeechChannel in SetSpeechProperty
;;FIXME: CFURLRef in SpeechSynthesisRegisterModuleURL
;;FIXME: CFURLRef in SpeechSynthesisUnregisterModuleURL
[:function CTFontDescriptorGetTypeID [:unsigned-long]]
;;FIXME: CTFontDescriptorRef in CTFontDescriptorCreateWithNameAndSize
;;FIXME: CTFontDescriptorRef in CTFontDescriptorCreateWithAttributes
;;FIXME: CTFontDescriptorRef in CTFontDescriptorCreateCopyWithAttributes
;;FIXME: CTFontDescriptorRef in CTFontDescriptorCreateCopyWithVariation
;;FIXME: CTFontDescriptorRef in CTFontDescriptorCreateCopyWithFeature
;;FIXME: CFArrayRef in CTFontDescriptorCreateMatchingFontDescriptors
;;FIXME: CTFontDescriptorRef in CTFontDescriptorCreateMatchingFontDescriptor
;;FIXME: CFDictionaryRef in CTFontDescriptorCopyAttributes
;;FIXME: CFTypeRef in CTFontDescriptorCopyAttribute
;;FIXME: CFTypeRef in CTFontDescriptorCopyLocalizedAttribute
[:function CTFontGetTypeID [:unsigned-long]]
;;FIXME: CTFontRef in CTFontCreateWithName
;;FIXME: CTFontRef in CTFontCreateWithFontDescriptor
;;FIXME: CTFontRef in CTFontCreateWithNameAndOptions
;;FIXME: CTFontRef in CTFontCreateWithFontDescriptorAndOptions
;;FIXME: CTFontRef in CTFontCreateUIFontForLanguage
;;FIXME: CTFontRef in CTFontCreateCopyWithAttributes
;;FIXME: CTFontRef in CTFontCreateCopyWithSymbolicTraits
;;FIXME: CTFontRef in CTFontCreateCopyWithFamily
;;FIXME: CTFontRef in CTFontCreateForString
;;FIXME: CTFontDescriptorRef in CTFontCopyFontDescriptor
;;FIXME: CFTypeRef in CTFontCopyAttribute
;;FIXME: CTFontRef in CTFontGetSize
;;FIXME: CTFontRef in CTFontGetMatrix
;;FIXME: CTFontSymbolicTraits in CTFontGetSymbolicTraits
;;FIXME: CFDictionaryRef in CTFontCopyTraits
;;FIXME: CFStringRef in CTFontCopyPostScriptName
;;FIXME: CFStringRef in CTFontCopyFamilyName
;;FIXME: CFStringRef in CTFontCopyFullName
;;FIXME: CFStringRef in CTFontCopyDisplayName
;;FIXME: CFStringRef in CTFontCopyName
;;FIXME: CFStringRef in CTFontCopyLocalizedName
;;FIXME: CFCharacterSetRef in CTFontCopyCharacterSet
;;FIXME: CTFontRef in CTFontGetStringEncoding
;;FIXME: CFArrayRef in CTFontCopySupportedLanguages
;;FIXME: CTFontRef in CTFontGetGlyphsForCharacters
;;FIXME: CTFontRef in CTFontGetAscent
;;FIXME: CTFontRef in CTFontGetDescent
;;FIXME: CTFontRef in CTFontGetLeading
;;FIXME: CTFontRef in CTFontGetUnitsPerEm
;;FIXME: CTFontRef in CTFontGetGlyphCount
;;FIXME: CTFontRef in CTFontGetBoundingBox
;;FIXME: CTFontRef in CTFontGetUnderlinePosition
;;FIXME: CTFontRef in CTFontGetUnderlineThickness
;;FIXME: CTFontRef in CTFontGetSlantAngle
;;FIXME: CTFontRef in CTFontGetCapHeight
;;FIXME: CTFontRef in CTFontGetXHeight
;;FIXME: CTFontRef in CTFontGetGlyphWithName
;;FIXME: CTFontRef in CTFontGetBoundingRectsForGlyphs
;;FIXME: CTFontRef in CTFontGetOpticalBoundsForGlyphs
;;FIXME: CTFontRef in CTFontGetAdvancesForGlyphs
;;FIXME: CTFontRef in CTFontGetVerticalTranslationsForGlyphs
;;FIXME: CGPathRef in CTFontCreatePathForGlyph
;;FIXME: CFArrayRef in CTFontCopyVariationAxes
;;FIXME: CFDictionaryRef in CTFontCopyVariation
;;FIXME: CFArrayRef in CTFontCopyFeatures
;;FIXME: CFArrayRef in CTFontCopyFeatureSettings
;;FIXME: CGFontRef in CTFontCopyGraphicsFont
;;FIXME: CTFontRef in CTFontCreateWithGraphicsFont
;;FIXME: CTFontRef in CTFontGetPlatformFont
;;FIXME: CTFontRef in CTFontCreateWithPlatformFont
;;FIXME: CTFontRef in CTFontCreateWithQuickdrawInstance
;;FIXME: CFArrayRef in CTFontCopyAvailableTables
;;FIXME: CFDataRef in CTFontCopyTable
;;FIXME: CTFontRef in CTFontDrawGlyphs
;;FIXME: CTFontRef in CTFontGetLigatureCaretPositions
;;FIXME: CFArrayRef in CTFontCopyDefaultCascadeListForLanguages
[:function CTFontCollectionGetTypeID [:unsigned-long]]
;;FIXME: CTFontCollectionRef in CTFontCollectionCreateFromAvailableFonts
;;FIXME: CTFontCollectionRef in CTFontCollectionCreateWithFontDescriptors
;;FIXME: CTFontCollectionRef in CTFontCollectionCreateCopyWithFontDescriptors
;;FIXME: CTMutableFontCollectionRef in CTFontCollectionCreateMutableCopy
;;FIXME: CFArrayRef in CTFontCollectionCopyQueryDescriptors
;;FIXME: CTMutableFontCollectionRef in CTFontCollectionSetQueryDescriptors
;;FIXME: CFArrayRef in CTFontCollectionCopyExclusionDescriptors
;;FIXME: CTMutableFontCollectionRef in CTFontCollectionSetExclusionDescriptors
;;FIXME: CFArrayRef in CTFontCollectionCreateMatchingFontDescriptors
;;FIXME: CFArrayRef in CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback
;;FIXME: CFArrayRef in CTFontCollectionCreateMatchingFontDescriptorsWithOptions
;;FIXME: CFArrayRef in CTFontCollectionCreateMatchingFontDescriptorsForFamily
;;FIXME: CFArrayRef in CTFontCollectionCopyFontAttribute
;;FIXME: CFArrayRef in CTFontCollectionCopyFontAttributes
;;FIXME: CFArrayRef in CTFontManagerCopyAvailablePostScriptNames
;;FIXME: CFArrayRef in CTFontManagerCopyAvailableFontFamilyNames
;;FIXME: CFArrayRef in CTFontManagerCopyAvailableFontURLs
;;FIXME: CFComparisonResult in CTFontManagerCompareFontFamilyNames
;;FIXME: CFArrayRef in CTFontManagerCreateFontDescriptorsFromURL
;;FIXME: CTFontDescriptorRef in CTFontManagerCreateFontDescriptorFromData
;;FIXME: CFURLRef in CTFontManagerRegisterFontsForURL
;;FIXME: CFURLRef in CTFontManagerUnregisterFontsForURL
;;FIXME: CGFontRef in CTFontManagerRegisterGraphicsFont
;;FIXME: CGFontRef in CTFontManagerUnregisterGraphicsFont
;;FIXME: CFArrayRef in CTFontManagerRegisterFontsForURLs
;;FIXME: CFArrayRef in CTFontManagerUnregisterFontsForURLs
;;FIXME: CFArrayRef in CTFontManagerEnableFontDescriptors
;;FIXME: CTFontManagerScope in CTFontManagerGetScopeForURL
;;FIXME: CFURLRef in CTFontManagerIsSupportedFont
;;FIXME: CFRunLoopSourceRef in CTFontManagerCreateFontRequestRunLoopSource
;;FIXME: CFStringRef in CTFontManagerSetAutoActivationSetting
;;FIXME: CTFontManagerAutoActivationSetting in CTFontManagerGetAutoActivationSetting
[:function CTFrameGetTypeID [:unsigned-long]]
;;FIXME: CTFrameRef in CTFrameGetStringRange
;;FIXME: CTFrameRef in CTFrameGetVisibleStringRange
;;FIXME: CGPathRef in CTFrameGetPath
;;FIXME: CFDictionaryRef in CTFrameGetFrameAttributes
;;FIXME: CFArrayRef in CTFrameGetLines
;;FIXME: CTFrameRef in CTFrameGetLineOrigins
;;FIXME: CTFrameRef in CTFrameDraw
[:function CTLineGetTypeID [:unsigned-long]]
;;FIXME: CTLineRef in CTLineCreateWithAttributedString
;;FIXME: CTLineRef in CTLineCreateTruncatedLine
;;FIXME: CTLineRef in CTLineCreateJustifiedLine
;;FIXME: CTLineRef in CTLineGetGlyphCount
;;FIXME: CFArrayRef in CTLineGetGlyphRuns
;;FIXME: CTLineRef in CTLineGetStringRange
;;FIXME: CTLineRef in CTLineGetPenOffsetForFlush
;;FIXME: CTLineRef in CTLineDraw
;;FIXME: CTLineRef in CTLineGetTypographicBounds
;;FIXME: CTLineRef in CTLineGetBoundsWithOptions
;;FIXME: CTLineRef in CTLineGetTrailingWhitespaceWidth
;;FIXME: CTLineRef in CTLineGetImageBounds
;;FIXME: CTLineRef in CTLineGetStringIndexForPosition
;;FIXME: CTLineRef in CTLineGetOffsetForStringIndex
[:function CTTypesetterGetTypeID [:unsigned-long]]
;;FIXME: CTTypesetterRef in CTTypesetterCreateWithAttributedString
;;FIXME: CTTypesetterRef in CTTypesetterCreateWithAttributedStringAndOptions
;;FIXME: CTLineRef in CTTypesetterCreateLineWithOffset
;;FIXME: CTLineRef in CTTypesetterCreateLine
;;FIXME: CTTypesetterRef in CTTypesetterSuggestLineBreakWithOffset
;;FIXME: CTTypesetterRef in CTTypesetterSuggestLineBreak
;;FIXME: CTTypesetterRef in CTTypesetterSuggestClusterBreakWithOffset
;;FIXME: CTTypesetterRef in CTTypesetterSuggestClusterBreak
[:function CTFramesetterGetTypeID [:unsigned-long]]
;;FIXME: CTFramesetterRef in CTFramesetterCreateWithAttributedString
;;FIXME: CTFrameRef in CTFramesetterCreateFrame
;;FIXME: CTTypesetterRef in CTFramesetterGetTypesetter
;;FIXME: CTFramesetterRef in CTFramesetterSuggestFrameSizeWithConstraints
[:function CTGlyphInfoGetTypeID [:unsigned-long]]
;;FIXME: CTGlyphInfoRef in CTGlyphInfoCreateWithGlyphName
;;FIXME: CTGlyphInfoRef in CTGlyphInfoCreateWithGlyph
;;FIXME: CTGlyphInfoRef in CTGlyphInfoCreateWithCharacterIdentifier
;;FIXME: CFStringRef in CTGlyphInfoGetGlyphName
;;FIXME: CTGlyphInfoRef in CTGlyphInfoGetCharacterIdentifier
;;FIXME: CTCharacterCollection in CTGlyphInfoGetCharacterCollection
[:function CTParagraphStyleGetTypeID [:unsigned-long]]
[:compound CTParagraphStyleSetting "sizeof (CTParagraphStyleSetting)"]
;;FIXME: CTParagraphStyleRef in CTParagraphStyleCreate
;;FIXME: CTParagraphStyleRef in CTParagraphStyleCreateCopy
;;FIXME: CTParagraphStyleRef in CTParagraphStyleGetValueForSpecifier
[:function CTRunGetTypeID [:unsigned-long]]
;;FIXME: CTRunRef in CTRunGetGlyphCount
;;FIXME: CFDictionaryRef in CTRunGetAttributes
;;FIXME: CTRunStatus in CTRunGetStatus
;;FIXME: const CGGlyph * in CTRunGetGlyphsPtr
;;FIXME: CTRunRef in CTRunGetGlyphs
;;FIXME: const CGPoint * in CTRunGetPositionsPtr
;;FIXME: CTRunRef in CTRunGetPositions
;;FIXME: const CGSize * in CTRunGetAdvancesPtr
;;FIXME: CTRunRef in CTRunGetAdvances
;;FIXME: const CFIndex * in CTRunGetStringIndicesPtr
;;FIXME: CTRunRef in CTRunGetStringIndices
;;FIXME: CTRunRef in CTRunGetStringRange
;;FIXME: CTRunRef in CTRunGetTypographicBounds
;;FIXME: CTRunRef in CTRunGetImageBounds
;;FIXME: CTRunRef in CTRunGetTextMatrix
;;FIXME: CTRunRef in CTRunDraw
[:function CTTextTabGetTypeID [:unsigned-long]]
;;FIXME: CTTextTabRef in CTTextTabCreate
;;FIXME: CTTextAlignment in CTTextTabGetAlignment
;;FIXME: CTTextTabRef in CTTextTabGetLocation
;;FIXME: CFDictionaryRef in CTTextTabGetOptions
[:function CTGetCoreTextVersion [:unsigned-int]]
[:function CGImageMetadataGetTypeID [:unsigned-long]]
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataCreateMutable
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataCreateMutableCopy
[:function CGImageMetadataTagGetTypeID [:unsigned-long]]
;;FIXME: CGImageMetadataTagRef in CGImageMetadataTagCreate
;;FIXME: CFStringRef in CGImageMetadataTagCopyNamespace
;;FIXME: CFStringRef in CGImageMetadataTagCopyPrefix
;;FIXME: CFStringRef in CGImageMetadataTagCopyName
;;FIXME: CFTypeRef in CGImageMetadataTagCopyValue
;;FIXME: CGImageMetadataType in CGImageMetadataTagGetType
;;FIXME: CFArrayRef in CGImageMetadataTagCopyQualifiers
;;FIXME: CFArrayRef in CGImageMetadataCopyTags
;;FIXME: CGImageMetadataTagRef in CGImageMetadataCopyTagWithPath
;;FIXME: CFStringRef in CGImageMetadataCopyStringValueWithPath
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataRegisterNamespaceForPrefix
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataSetTagWithPath
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataSetValueWithPath
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataRemoveTagWithPath
;;FIXME: CGImageMetadataRef in CGImageMetadataEnumerateTagsUsingBlock
;;FIXME: CGImageMetadataTagRef in CGImageMetadataCopyTagMatchingImageProperty
;;FIXME: CGMutableImageMetadataRef in CGImageMetadataSetValueMatchingImageProperty
;;FIXME: CFDataRef in CGImageMetadataCreateXMPData
;;FIXME: CGImageMetadataRef in CGImageMetadataCreateFromXMPData
[:function CGImageSourceGetTypeID [:unsigned-long]]
;;FIXME: CFArrayRef in CGImageSourceCopyTypeIdentifiers
;;FIXME: CGImageSourceRef in CGImageSourceCreateWithDataProvider
;;FIXME: CGImageSourceRef in CGImageSourceCreateWithData
;;FIXME: CGImageSourceRef in CGImageSourceCreateWithURL
;;FIXME: CFStringRef in CGImageSourceGetType
;;FIXME: CGImageSourceRef in CGImageSourceGetCount
;;FIXME: CFDictionaryRef in CGImageSourceCopyProperties
;;FIXME: CFDictionaryRef in CGImageSourceCopyPropertiesAtIndex
;;FIXME: CGImageMetadataRef in CGImageSourceCopyMetadataAtIndex
;;FIXME: CGImageRef in CGImageSourceCreateImageAtIndex
;;FIXME: CGImageRef in CGImageSourceCreateThumbnailAtIndex
;;FIXME: CGImageSourceRef in CGImageSourceCreateIncremental
;;FIXME: CGImageSourceRef in CGImageSourceUpdateData
;;FIXME: CGImageSourceRef in CGImageSourceUpdateDataProvider
;;FIXME: CGImageSourceStatus in CGImageSourceGetStatus
;;FIXME: CGImageSourceStatus in CGImageSourceGetStatusAtIndex
[:function CGImageDestinationGetTypeID [:unsigned-long]]
;;FIXME: CFArrayRef in CGImageDestinationCopyTypeIdentifiers
;;FIXME: CGImageDestinationRef in CGImageDestinationCreateWithDataConsumer
;;FIXME: CGImageDestinationRef in CGImageDestinationCreateWithData
;;FIXME: CGImageDestinationRef in CGImageDestinationCreateWithURL
;;FIXME: CGImageDestinationRef in CGImageDestinationSetProperties
;;FIXME: CGImageDestinationRef in CGImageDestinationAddImage
;;FIXME: CGImageDestinationRef in CGImageDestinationAddImageFromSource
;;FIXME: CGImageDestinationRef in CGImageDestinationFinalize
;;FIXME: CGImageDestinationRef in CGImageDestinationAddImageAndMetadata
;;FIXME: CGImageDestinationRef in CGImageDestinationCopyImageSource
[:selector [0 :nullDescriptor] [:id]]
;;FIXME: const void * in descriptorWithDescriptorType:bytes:length:
[:selector [2 :descriptorWithDescriptorType :data] [:id :unsigned-int :id]]
[:selector [1 :descriptorWithBoolean] [:id :unsigned-char]]
[:selector [1 :descriptorWithEnumCode] [:id :unsigned-int]]
[:selector [1 :descriptorWithInt32] [:id :int]]
[:selector [1 :descriptorWithTypeCode] [:id :unsigned-int]]
[:selector [1 :descriptorWithString] [:id :id]]
[:selector [5 :appleEventWithEventClass :eventID :targetDescriptor :returnID :transactionID] [:id :unsigned-int :unsigned-int :id :short :int]]
[:selector [0 :listDescriptor] [:id]]
[:selector [0 :recordDescriptor] [:id]]
;;FIXME: const AEDesc * in initWithAEDescNoCopy:
;;FIXME: const void * in initWithDescriptorType:bytes:length:
[:selector [2 :initWithDescriptorType :data] [:id :unsigned-int :id]]
[:selector [5 :initWithEventClass :eventID :targetDescriptor :returnID :transactionID] [:id :unsigned-int :unsigned-int :id :short :int]]
[:selector [0 :initListDescriptor] [:id]]
[:selector [0 :initRecordDescriptor] [:id]]
;;FIXME: const AEDesc * in aeDesc
[:selector [0 :descriptorType] [:unsigned-int]]
[:selector [0 :data] [:id]]
[:selector [0 :booleanValue] [:unsigned-char]]
[:selector [0 :enumCodeValue] [:unsigned-int]]
[:selector [0 :int32Value] [:int]]
[:selector [0 :typeCodeValue] [:unsigned-int]]
[:selector [0 :stringValue] [:id]]
[:selector [0 :eventClass] [:unsigned-int]]
[:selector [0 :eventID] [:unsigned-int]]
[:selector [0 :returnID] [:short]]
[:selector [0 :transactionID] [:int]]
[:selector [2 :setParamDescriptor :forKeyword] [:void :id :unsigned-int]]
[:selector [1 :paramDescriptorForKeyword] [:id :unsigned-int]]
[:selector [1 :removeParamDescriptorWithKeyword] [:void :unsigned-int]]
[:selector [2 :setAttributeDescriptor :forKeyword] [:void :id :unsigned-int]]
[:selector [1 :attributeDescriptorForKeyword] [:id :unsigned-int]]
[:selector [0 :numberOfItems] [:long]]
[:selector [2 :insertDescriptor :atIndex] [:void :id :long]]
[:selector [1 :descriptorAtIndex] [:id :long]]
[:selector [1 :removeDescriptorAtIndex] [:void :long]]
[:selector [2 :setDescriptor :forKeyword] [:void :id :unsigned-int]]
[:selector [1 :descriptorForKeyword] [:id :unsigned-int]]
[:selector [1 :removeDescriptorWithKeyword] [:void :unsigned-int]]
[:selector [1 :keywordForDescriptorAtIndex] [:unsigned-int :long]]
[:selector [1 :coerceToDescriptorType] [:id :unsigned-int]]
[:selector [0 :sharedAppleEventManager] [:id]]
[:selector [4 :setEventHandler :andSelector :forEventClass :andEventID] [:void :id :selector :unsigned-int :unsigned-int]]
[:selector [2 :removeEventHandlerForEventClass :andEventID] [:void :unsigned-int :unsigned-int]]
;;FIXME: const AppleEvent * in dispatchRawAppleEvent:withRawReply:handlerRefCon:
[:selector [0 :currentAppleEvent] [:id]]
[:selector [0 :currentReplyAppleEvent] [:id]]
;;FIXME: NSAppleEventManagerSuspensionID in suspendCurrentAppleEvent
;;FIXME: NSAppleEventManagerSuspensionID in appleEventForSuspensionID:
;;FIXME: NSAppleEventManagerSuspensionID in replyAppleEventForSuspensionID:
;;FIXME: NSAppleEventManagerSuspensionID in setCurrentAppleEventAndReplyEventWithSuspensionID:
;;FIXME: NSAppleEventManagerSuspensionID in resumeWithSuspensionID:
;;FIXME: NSDictionary ** in initWithContentsOfURL:error:
[:selector [1 :initWithSource] [:id :id]]
[:selector [0 :source] [:id]]
[:selector [0 :isCompiled] [Boolean]]
;;FIXME: NSDictionary ** in compileAndReturnError:
;;FIXME: NSDictionary ** in executeAndReturnError:
;;FIXME: NSDictionary ** in executeAppleEvent:error:
[:selector [2 :registerClassDescription :forClass] [:void :id :id]]
[:selector [0 :invalidateClassDescriptionCache] [:void]]
[:selector [1 :classDescriptionForClass] [:id :id]]
[:selector [0 :attributeKeys] [:id]]
[:selector [0 :toOneRelationshipKeys] [:id]]
[:selector [0 :toManyRelationshipKeys] [:id]]
[:selector [1 :inverseForRelationshipKey] [:id :id]]
[:selector [1 :lockWithPath] [:id :id]]
[:selector [1 :initWithPath] [:id :id]]
[:selector [0 :tryLock] [Boolean]]
[:selector [0 :unlock] [:void]]
[:selector [0 :breakLock] [:void]]
[:selector [0 :lockDate] [:id]]
[:selector [0 :defaultCollector] [:id]]
[:selector [0 :isCollecting] [Boolean]]
[:selector [0 :disable] [:void]]
[:selector [0 :enable] [:void]]
[:selector [0 :isEnabled] [Boolean]]
[:selector [0 :collectIfNeeded] [:void]]
[:selector [0 :collectExhaustively] [:void]]
;;FIXME: const void * in disableCollectorForPointer:
;;FIXME: const void * in enableCollectorForPointer:
;;FIXME: NSZone * in zone
[:function NSFileTypeForHFSTypeCode [:id :unsigned-int]]
[:function NSHFSTypeCodeFromFileType [:unsigned-int :id]]
[:function NSHFSTypeOfFile [:id :id]]
[:selector [0 :currentHost] [:id]]
[:selector [1 :hostWithName] [:id :id]]
[:selector [1 :hostWithAddress] [:id :id]]
[:selector [1 :isEqualToHost] [Boolean :id]]
[:selector [0 :name] [:id]]
[:selector [0 :names] [:id]]
[:selector [0 :address] [:id]]
[:selector [0 :addresses] [:id]]
[:selector [0 :localizedName] [:id]]
[:selector [1 :setHostCacheEnabled] [:void Boolean]]
[:selector [0 :isHostCacheEnabled] [Boolean]]
[:selector [0 :flushHostCache] [:void]]
[:selector [1 :classDescriptionForClass] [:id :id]]
[:selector [3 :initWithSuiteName :className :dictionary] [:id :id :id :id]]
[:selector [0 :suiteName] [:id]]
[:selector [0 :className] [:id]]
[:selector [0 :implementationClassName] [:id]]
[:selector [0 :superclassDescription] [:id]]
[:selector [0 :appleEventCode] [:unsigned-int]]
[:selector [1 :matchesAppleEventCode] [Boolean :unsigned-int]]
[:selector [1 :supportsCommand] [Boolean :id]]
[:selector [1 :selectorForCommand] [:selector :id]]
[:selector [1 :typeForKey] [:id :id]]
[:selector [1 :classDescriptionForKey] [:id :id]]
[:selector [1 :appleEventCodeForKey] [:unsigned-int :id]]
[:selector [1 :keyWithAppleEventCode] [:id :unsigned-int]]
[:selector [0 :defaultSubcontainerAttributeKey] [:id]]
[:selector [1 :isLocationRequiredToCreateForKey] [Boolean :id]]
[:selector [1 :hasPropertyForKey] [Boolean :id]]
[:selector [1 :hasOrderedToManyRelationshipForKey] [Boolean :id]]
[:selector [1 :hasReadablePropertyForKey] [Boolean :id]]
[:selector [1 :hasWritablePropertyForKey] [Boolean :id]]
[:selector [0 :sharedCoercionHandler] [:id]]
[:selector [2 :coerceValue :toClass] [:id :id :id]]
[:selector [4 :registerCoercer :selector :toConvertFromClass :toClass] [:void :id :selector :id :id]]
[:selector [1 :initWithCommandDescription] [:id :id]]
[:selector [0 :commandDescription] [:id]]
[:selector [1 :setDirectParameter] [:void :id]]
[:selector [0 :directParameter] [:id]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :receiversSpecifier] [:id]]
[:selector [0 :evaluatedReceivers] [:id]]
[:selector [1 :setArguments] [:void :id]]
[:selector [0 :arguments] [:id]]
[:selector [0 :evaluatedArguments] [:id]]
[:selector [0 :isWellFormed] [Boolean]]
[:selector [0 :performDefaultImplementation] [:id]]
[:selector [0 :executeCommand] [:id]]
[:selector [1 :setScriptErrorNumber] [:void :int]]
[:selector [1 :setScriptErrorOffendingObjectDescriptor] [:void :id]]
[:selector [1 :setScriptErrorExpectedTypeDescriptor] [:void :id]]
[:selector [1 :setScriptErrorString] [:void :id]]
[:selector [0 :scriptErrorNumber] [:int]]
[:selector [0 :scriptErrorOffendingObjectDescriptor] [:id]]
[:selector [0 :scriptErrorExpectedTypeDescriptor] [:id]]
[:selector [0 :scriptErrorString] [:id]]
[:selector [0 :currentCommand] [:id]]
[:selector [0 :appleEvent] [:id]]
[:selector [0 :suspendExecution] [:void]]
[:selector [1 :resumeExecutionWithResult] [:void :id]]
[:selector [3 :initWithSuiteName :commandName :dictionary] [:id :id :id :id]]
[:selector [0 :suiteName] [:id]]
[:selector [0 :commandName] [:id]]
[:selector [0 :appleEventClassCode] [:unsigned-int]]
[:selector [0 :appleEventCode] [:unsigned-int]]
[:selector [0 :commandClassName] [:id]]
[:selector [0 :returnType] [:id]]
[:selector [0 :appleEventCodeForReturnType] [:unsigned-int]]
[:selector [0 :argumentNames] [:id]]
[:selector [1 :typeForArgumentWithName] [:id :id]]
[:selector [1 :appleEventCodeForArgumentWithName] [:unsigned-int :id]]
[:selector [1 :isOptionalArgumentWithName] [Boolean :id]]
[:selector [0 :createCommandInstance] [:id]]
;;FIXME: NSZone * in createCommandInstanceWithZone:
[:selector [0 :sharedScriptExecutionContext] [:id]]
[:selector [0 :topLevelObject] [:id]]
[:selector [1 :setTopLevelObject] [:void :id]]
[:selector [0 :objectBeingTested] [:id]]
[:selector [1 :setObjectBeingTested] [:void :id]]
[:selector [0 :rangeContainerObject] [:id]]
[:selector [1 :setRangeContainerObject] [:void :id]]
[:selector [1 :objectSpecifierWithDescriptor] [:id :id]]
[:selector [2 :initWithContainerSpecifier :key] [:id :id :id]]
[:selector [3 :initWithContainerClassDescription :containerSpecifier :key] [:id :id :id :id]]
[:selector [0 :childSpecifier] [:id]]
[:selector [1 :setChildSpecifier] [:void :id]]
[:selector [0 :containerSpecifier] [:id]]
[:selector [1 :setContainerSpecifier] [:void :id]]
[:selector [0 :containerIsObjectBeingTested] [Boolean]]
[:selector [1 :setContainerIsObjectBeingTested] [:void Boolean]]
[:selector [0 :containerIsRangeContainerObject] [Boolean]]
[:selector [1 :setContainerIsRangeContainerObject] [:void Boolean]]
[:selector [0 :key] [:id]]
[:selector [1 :setKey] [:void :id]]
[:selector [0 :containerClassDescription] [:id]]
[:selector [1 :setContainerClassDescription] [:void :id]]
[:selector [0 :keyClassDescription] [:id]]
;;FIXME: NSInteger * in indicesOfObjectsByEvaluatingWithContainer:count:
[:selector [1 :objectsByEvaluatingWithContainers] [:id :id]]
[:selector [0 :objectsByEvaluatingSpecifier] [:id]]
[:selector [0 :evaluationErrorNumber] [:long]]
[:selector [1 :setEvaluationErrorNumber] [:void :long]]
[:selector [0 :evaluationErrorSpecifier] [:id]]
[:selector [0 :descriptor] [:id]]
[:selector [4 :initWithContainerClassDescription :containerSpecifier :key :index] [:id :id :id :id :long]]
[:selector [0 :index] [:long]]
[:selector [1 :setIndex] [:void :long]]
[:selector [4 :initWithContainerClassDescription :containerSpecifier :key :name] [:id :id :id :id :id]]
[:selector [0 :name] [:id]]
[:selector [1 :setName] [:void :id]]
;;FIXME: NSInsertionPosition in initWithPosition:objectSpecifier:
;;FIXME: NSInsertionPosition in position
[:selector [0 :objectSpecifier] [:id]]
[:selector [1 :setInsertionClassDescription] [:void :id]]
[:selector [0 :evaluate] [:void]]
[:selector [0 :insertionContainer] [:id]]
[:selector [0 :insertionKey] [:id]]
[:selector [0 :insertionIndex] [:long]]
[:selector [0 :insertionReplaces] [Boolean]]
[:selector [5 :initWithContainerClassDescription :containerSpecifier :key :startSpecifier :endSpecifier] [:id :id :id :id :id :id]]
[:selector [0 :startSpecifier] [:id]]
[:selector [1 :setStartSpecifier] [:void :id]]
[:selector [0 :endSpecifier] [:id]]
[:selector [1 :setEndSpecifier] [:void :id]]
;;FIXME: NSRelativePosition in initWithContainerClassDescription:containerSpecifier:key:relativePosition:baseSpecifier:
;;FIXME: NSRelativePosition in relativePosition
;;FIXME: NSRelativePosition in setRelativePosition:
[:selector [0 :baseSpecifier] [:id]]
[:selector [1 :setBaseSpecifier] [:void :id]]
[:selector [4 :initWithContainerClassDescription :containerSpecifier :key :uniqueID] [:id :id :id :id :id]]
[:selector [0 :uniqueID] [:id]]
[:selector [1 :setUniqueID] [:void :id]]
[:selector [4 :initWithContainerClassDescription :containerSpecifier :key :test] [:id :id :id :id :id]]
[:selector [0 :test] [:id]]
[:selector [1 :setTest] [:void :id]]
;;FIXME: NSWhoseSubelementIdentifier in startSubelementIdentifier
;;FIXME: NSWhoseSubelementIdentifier in setStartSubelementIdentifier:
[:selector [0 :startSubelementIndex] [:long]]
[:selector [1 :setStartSubelementIndex] [:void :long]]
;;FIXME: NSWhoseSubelementIdentifier in endSubelementIdentifier
;;FIXME: NSWhoseSubelementIdentifier in setEndSubelementIdentifier:
[:selector [0 :endSubelementIndex] [:long]]
[:selector [1 :setEndSubelementIndex] [:void :long]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
;;FIXME: NSSaveOptions in saveOptions
[:selector [0 :createClassDescription] [:id]]
[:selector [0 :resolvedKeyDictionary] [:id]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
;;FIXME: NSSaveOptions in saveOptions
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
[:selector [0 :sharedScriptSuiteRegistry] [:id]]
[:selector [1 :setSharedScriptSuiteRegistry] [:void :id]]
[:selector [1 :loadSuitesFromBundle] [:void :id]]
[:selector [2 :loadSuiteWithDictionary :fromBundle] [:void :id :id]]
[:selector [1 :registerClassDescription] [:void :id]]
[:selector [1 :registerCommandDescription] [:void :id]]
[:selector [0 :suiteNames] [:id]]
[:selector [1 :appleEventCodeForSuite] [:unsigned-int :id]]
[:selector [1 :bundleForSuite] [:id :id]]
[:selector [1 :classDescriptionsInSuite] [:id :id]]
[:selector [1 :commandDescriptionsInSuite] [:id :id]]
[:selector [1 :suiteForAppleEventCode] [:id :unsigned-int]]
[:selector [1 :classDescriptionWithAppleEventCode] [:id :unsigned-int]]
[:selector [2 :commandDescriptionWithAppleEventClass :andAppleEventCode] [:id :unsigned-int :unsigned-int]]
[:selector [1 :aeteResource] [:id :id]]
[:selector [0 :isTrue] [Boolean]]
[:selector [1 :initAndTestWithTests] [:id :id]]
[:selector [1 :initOrTestWithTests] [:id :id]]
[:selector [1 :initNotTestWithTest] [:id :id]]
;;FIXME: NSTestComparisonOperation in initWithObjectSpecifier:comparisonOperator:testObject:
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [2 :registerLanguage :byVendor] [Boolean :id :id]]
[:selector [2 :isWordInUserDictionaries :caseSensitive] [Boolean :id Boolean]]
[:selector [0 :run] [:void]]
[:selector [0 :title] [:id]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :subtitle] [:id]]
[:selector [1 :setSubtitle] [:void :id]]
[:selector [0 :informativeText] [:id]]
[:selector [1 :setInformativeText] [:void :id]]
[:selector [0 :actionButtonTitle] [:id]]
[:selector [1 :setActionButtonTitle] [:void :id]]
[:selector [0 :userInfo] [:id]]
[:selector [1 :setUserInfo] [:void :id]]
[:selector [0 :deliveryDate] [:id]]
[:selector [1 :setDeliveryDate] [:void :id]]
[:selector [0 :deliveryTimeZone] [:id]]
[:selector [1 :setDeliveryTimeZone] [:void :id]]
[:selector [0 :deliveryRepeatInterval] [:id]]
[:selector [1 :setDeliveryRepeatInterval] [:void :id]]
[:selector [0 :actualDeliveryDate] [:id]]
[:selector [0 :isPresented] [Boolean]]
[:selector [0 :isRemote] [Boolean]]
[:selector [0 :soundName] [:id]]
[:selector [1 :setSoundName] [:void :id]]
[:selector [0 :hasActionButton] [Boolean]]
[:selector [1 :setHasActionButton] [:void Boolean]]
;;FIXME: NSUserNotificationActivationType in activationType
[:selector [0 :otherButtonTitle] [:id]]
[:selector [1 :setOtherButtonTitle] [:void :id]]
[:selector [0 :defaultUserNotificationCenter] [:id]]
[:selector [1 :scheduleNotification] [:void :id]]
[:selector [1 :removeScheduledNotification] [:void :id]]
[:selector [1 :deliverNotification] [:void :id]]
[:selector [1 :removeDeliveredNotification] [:void :id]]
[:selector [0 :removeAllDeliveredNotifications] [:void]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :scheduledNotifications] [:id]]
[:selector [1 :setScheduledNotifications] [:void :id]]
[:selector [0 :deliveredNotifications] [:id]]
;;FIXME: NSError ** in initWithURL:error:
[:selector [0 :scriptURL] [:id]]
;;FIXME: NSUserScriptTaskCompletionHandler in executeWithCompletionHandler:
[:selector [0 :standardInput] [:id]]
[:selector [1 :setStandardInput] [:void :id]]
[:selector [0 :standardOutput] [:id]]
[:selector [1 :setStandardOutput] [:void :id]]
[:selector [0 :standardError] [:id]]
[:selector [1 :setStandardError] [:void :id]]
;;FIXME: NSUserUnixTaskCompletionHandler in executeWithArguments:completionHandler:
;;FIXME: NSUserAppleScriptTaskCompletionHandler in executeWithAppleEvent:completionHandler:
[:selector [0 :variables] [:id]]
[:selector [1 :setVariables] [:void :id]]
;;FIXME: NSUserAutomatorTaskCompletionHandler in executeWithInput:completionHandler:
[:selector [1 :initWithServiceName] [:id :id]]
;;FIXME: NSXPCConnectionOptions in initWithMachServiceName:options:
[:selector [1 :initWithListenerEndpoint] [:id :id]]
[:selector [0 :remoteObjectProxy] [:id]]
;;FIXME: void (^)(NSError *) in remoteObjectProxyWithErrorHandler:
[:selector [0 :resume] [:void]]
[:selector [0 :suspend] [:void]]
[:selector [0 :invalidate] [:void]]
[:selector [0 :serviceName] [:id]]
[:selector [0 :endpoint] [:id]]
[:selector [0 :exportedInterface] [:id]]
[:selector [1 :setExportedInterface] [:void :id]]
[:selector [0 :exportedObject] [:id]]
[:selector [1 :setExportedObject] [:void :id]]
[:selector [0 :remoteObjectInterface] [:id]]
[:selector [1 :setRemoteObjectInterface] [:void :id]]
;;FIXME: void (^)(void) in interruptionHandler
;;FIXME: void (^)(void) in setInterruptionHandler:
;;FIXME: void (^)(void) in invalidationHandler
;;FIXME: void (^)(void) in setInvalidationHandler:
[:selector [0 :auditSessionIdentifier] [:int]]
[:selector [0 :processIdentifier] [:int]]
[:selector [0 :effectiveUserIdentifier] [:unsigned-int]]
[:selector [0 :effectiveGroupIdentifier] [:unsigned-int]]
[:selector [0 :serviceListener] [:id]]
[:selector [0 :anonymousListener] [:id]]
[:selector [1 :initWithMachServiceName] [:id :id]]
[:selector [0 :endpoint] [:id]]
[:selector [0 :resume] [:void]]
[:selector [0 :suspend] [:void]]
[:selector [0 :invalidate] [:void]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [1 :interfaceWithProtocol] [:id :id]]
[:selector [4 :setClasses :forSelector :argumentIndex :ofReply] [:void :id :selector :unsigned-long Boolean]]
[:selector [3 :classesForSelector :argumentIndex :ofReply] [:id :selector :unsigned-long Boolean]]
[:selector [4 :setInterface :forSelector :argumentIndex :ofReply] [:void :id :selector :unsigned-long Boolean]]
[:selector [3 :interfaceForSelector :argumentIndex :ofReply] [:id :selector :unsigned-long Boolean]]
[:selector [0 :protocol] [:id]]
[:selector [1 :setProtocol] [:void :id]]
]
