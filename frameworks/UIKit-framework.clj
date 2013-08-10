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
[:enum P_ALL P_PID P_PGID idtype_t]
[:function getpriority [:int :int :unsigned-int]]
[:function getiopolicy_np [:int :int :int]]
;;FIXME: struct rlimit * in getrlimit
;;FIXME: struct rusage * in getrusage
[:function setpriority [:int :int :unsigned-int :int]]
[:function setiopolicy_np [:int :int :int :int]]
;;FIXME: const struct rlimit * in setrlimit
;;FIXME: int * in wait
;;FIXME: int * in waitpid
;;FIXME: siginfo_t * in waitid
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
[:function div [UIKit/div_t :int :int]]
[:function exit [:void :int]]
;;FIXME: void * in free
;;FIXME: char * in getenv
[:function labs [:long :long]]
[:function ldiv [UIKit/ldiv_t :long :long]]
[:function llabs [:long-long :long-long]]
[:function lldiv [UIKit/lldiv_t :long-long :long-long]]
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
[:function imaxabs [:long-long :long-long]]
[:compound imaxdiv_t "sizeof (imaxdiv_t)"]
[:function imaxdiv [UIKit/imaxdiv_t :long-long :long-long]]
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
[:enum noErr nil]
[:enum kNilOptions nil]
[:enum kVariableLengthArray nil]
[:enum kUnknownType nil]
[:compound ProcessSerialNumber "sizeof (ProcessSerialNumber)"]
[:compound Point "sizeof (Point)"]
[:compound Rect "sizeof (Rect)"]
[:compound FixedPoint "sizeof (FixedPoint)"]
[:compound FixedRect "sizeof (FixedRect)"]
[:enum normal bold italic underline outline shadow condense extend nil]
[:compound TimeRecord "sizeof (TimeRecord)"]
[:compound NumVersion "sizeof (NumVersion)"]
[:enum developStage alphaStage betaStage finalStage nil]
[:compound NumVersionVariant "sizeof (NumVersionVariant)"]
[:compound VersRec "sizeof (VersRec)"]
[:function Debugger [:void]]
;;FIXME: ConstStr255Param in DebugStr
[:function SysBreak [:void]]
;;FIXME: ConstStr255Param in SysBreakStr
;;FIXME: ConstStr255Param in SysBreakFunc
[:enum kCFCompareLessThan kCFCompareEqualTo kCFCompareGreaterThan CFComparisonResult]
[:enum kCFNotFound nil]
[:compound CFRange "sizeof (CFRange)"]
[:function CFRangeMake [UIKit/CFRange :long :long]]
[:function __CFRangeMake [UIKit/CFRange :long :long]]
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
[:enum OSUnknownByteOrder OSLittleEndian OSBigEndian nil]
[:function OSHostByteOrder [:int]]
;;FIXME: const volatile void * in _OSReadInt16
;;FIXME: const volatile void * in _OSReadInt32
;;FIXME: const volatile void * in _OSReadInt64
;;FIXME: volatile void * in _OSWriteInt16
;;FIXME: volatile void * in _OSWriteInt32
;;FIXME: volatile void * in _OSWriteInt64
[:enum CFByteOrderUnknown CFByteOrderLittleEndian CFByteOrderBigEndian __CFByteOrder]
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
[:function CFConvertFloat32HostToSwapped [UIKit/CFSwappedFloat32 :float]]
[:function CFConvertFloat32SwappedToHost [:float UIKit/CFSwappedFloat32]]
[:function CFConvertFloat64HostToSwapped [UIKit/CFSwappedFloat64 :double]]
[:function CFConvertFloat64SwappedToHost [:double UIKit/CFSwappedFloat64]]
[:function CFConvertFloatHostToSwapped [UIKit/CFSwappedFloat32 :float]]
[:function CFConvertFloatSwappedToHost [:float UIKit/CFSwappedFloat32]]
[:function CFConvertDoubleHostToSwapped [UIKit/CFSwappedFloat64 :double]]
[:function CFConvertDoubleSwappedToHost [:double UIKit/CFSwappedFloat64]]
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
[:enum kCFLocaleLanguageDirectionUnknown kCFLocaleLanguageDirectionLeftToRight kCFLocaleLanguageDirectionRightToLeft kCFLocaleLanguageDirectionTopToBottom kCFLocaleLanguageDirectionBottomToTop CFLocaleLanguageDirection]
;;FIXME: CFStringRef in CFLocaleGetLanguageCharacterDirection
;;FIXME: CFStringRef in CFLocaleGetLanguageLineDirection
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
;;FIXME: CFDateRef in CFDateCompare
[:compound CFGregorianDate "sizeof (CFGregorianDate)"]
[:compound CFGregorianUnits "sizeof (CFGregorianUnits)"]
[:enum kCFGregorianUnitsYears kCFGregorianUnitsMonths kCFGregorianUnitsDays kCFGregorianUnitsHours kCFGregorianUnitsMinutes kCFGregorianUnitsSeconds kCFGregorianAllUnits CFGregorianUnitFlags]
[:function CFGregorianDateIsValid [:unsigned-char UIKit/CFGregorianDate :unsigned-long]]
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
[:enum kCFDataSearchBackwards kCFDataSearchAnchored CFDataSearchFlags]
;;FIXME: CFDataRef in CFDataFind
[:enum kCFCharacterSetControl kCFCharacterSetWhitespace kCFCharacterSetWhitespaceAndNewline kCFCharacterSetDecimalDigit kCFCharacterSetLetter kCFCharacterSetLowercaseLetter kCFCharacterSetUppercaseLetter kCFCharacterSetNonBase kCFCharacterSetDecomposable kCFCharacterSetAlphaNumeric kCFCharacterSetPunctuation kCFCharacterSetCapitalizedLetter kCFCharacterSetSymbol kCFCharacterSetNewline kCFCharacterSetIllegal CFCharacterSetPredefinedSet]
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
[:enum kCFStringEncodingMacRoman kCFStringEncodingWindowsLatin1 kCFStringEncodingISOLatin1 kCFStringEncodingNextStepLatin kCFStringEncodingASCII kCFStringEncodingUnicode kCFStringEncodingUTF8 kCFStringEncodingNonLossyASCII kCFStringEncodingUTF16 kCFStringEncodingUTF16BE kCFStringEncodingUTF16LE kCFStringEncodingUTF32 kCFStringEncodingUTF32BE kCFStringEncodingUTF32LE CFStringBuiltInEncodings]
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
[:function CFStringGetSystemEncoding [:unsigned-long]]
[:function CFStringGetMaximumSizeForEncoding [:long :long :unsigned-long]]
;;FIXME: CFStringRef in CFStringGetFileSystemRepresentation
;;FIXME: CFStringRef in CFStringGetMaximumSizeOfFileSystemRepresentation
;;FIXME: CFStringRef in CFStringCreateWithFileSystemRepresentation
[:enum kCFCompareCaseInsensitive kCFCompareBackwards kCFCompareAnchored kCFCompareNonliteral kCFCompareLocalized kCFCompareNumerically kCFCompareDiacriticInsensitive kCFCompareWidthInsensitive kCFCompareForcedOrdering CFStringCompareFlags]
;;FIXME: CFStringRef in CFStringCompareWithOptionsAndLocale
;;FIXME: CFStringRef in CFStringCompareWithOptions
;;FIXME: CFStringRef in CFStringCompare
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
[:enum kCFStringNormalizationFormD kCFStringNormalizationFormKD kCFStringNormalizationFormC kCFStringNormalizationFormKC CFStringNormalizationForm]
;;FIXME: CFMutableStringRef in CFStringNormalize
;;FIXME: CFMutableStringRef in CFStringFold
;;FIXME: CFMutableStringRef in CFStringTransform
[:function CFStringIsEncodingAvailable [:unsigned-char :unsigned-long]]
;;FIXME: const CFStringEncoding * in CFStringGetListOfAvailableEncodings
;;FIXME: CFStringRef in CFStringGetNameOfEncoding
[:function CFStringConvertEncodingToNSStringEncoding [:unsigned-long :unsigned-long]]
[:function CFStringConvertNSStringEncodingToEncoding [:unsigned-long :unsigned-long]]
[:function CFStringConvertEncodingToWindowsCodepage [:unsigned-long :unsigned-long]]
[:function CFStringConvertWindowsCodepageToEncoding [:unsigned-long :unsigned-long]]
;;FIXME: CFStringRef in CFStringConvertIANACharSetNameToEncoding
;;FIXME: CFStringRef in CFStringConvertEncodingToIANACharSetName
[:function CFStringGetMostCompatibleMacStringEncoding [:unsigned-long :unsigned-long]]
[:compound CFStringInlineBuffer "sizeof (CFStringInlineBuffer)"]
;;FIXME: CFStringRef in CFStringInitInlineBuffer
;;FIXME: CFStringInlineBuffer * in CFStringGetCharacterFromInlineBuffer
[:function CFStringIsSurrogateHighCharacter [:unsigned-char :unsigned-short]]
[:function CFStringIsSurrogateLowCharacter [:unsigned-char :unsigned-short]]
[:function CFStringGetLongCharacterForSurrogatePair [:unsigned-long :unsigned-short :unsigned-short]]
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
[:enum kCFTimeZoneNameStyleStandard kCFTimeZoneNameStyleShortStandard kCFTimeZoneNameStyleDaylightSaving kCFTimeZoneNameStyleShortDaylightSaving kCFTimeZoneNameStyleGeneric kCFTimeZoneNameStyleShortGeneric CFTimeZoneNameStyle]
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
[:enum kCFCalendarUnitEra kCFCalendarUnitYear kCFCalendarUnitMonth kCFCalendarUnitDay kCFCalendarUnitHour kCFCalendarUnitMinute kCFCalendarUnitSecond kCFCalendarUnitWeek kCFCalendarUnitWeekday kCFCalendarUnitWeekdayOrdinal kCFCalendarUnitQuarter kCFCalendarUnitWeekOfMonth kCFCalendarUnitWeekOfYear kCFCalendarUnitYearForWeekOfYear CFCalendarUnit]
;;FIXME: CFCalendarRef in CFCalendarGetMinimumRangeOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetMaximumRangeOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetRangeOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetOrdinalityOfUnit
;;FIXME: CFCalendarRef in CFCalendarGetTimeRangeOfUnit
;;FIXME: variadic CFCalendarComposeAbsoluteTime
;;FIXME: variadic CFCalendarDecomposeAbsoluteTime
[:enum kCFCalendarComponentsWrap nil]
;;FIXME: variadic CFCalendarAddComponents
;;FIXME: variadic CFCalendarGetComponentDifference
;;FIXME: CFStringRef in CFDateFormatterCreateDateFormatFromTemplate
[:function CFDateFormatterGetTypeID [:unsigned-long]]
[:enum kCFDateFormatterNoStyle kCFDateFormatterShortStyle kCFDateFormatterMediumStyle kCFDateFormatterLongStyle kCFDateFormatterFullStyle CFDateFormatterStyle]
;;FIXME: CFDateFormatterRef in CFDateFormatterCreate
;;FIXME: CFLocaleRef in CFDateFormatterGetLocale
;;FIXME: CFDateFormatterRef in CFDateFormatterGetDateStyle
;;FIXME: CFDateFormatterRef in CFDateFormatterGetTimeStyle
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
[:enum kCFNumberSInt8Type kCFNumberSInt16Type kCFNumberSInt32Type kCFNumberSInt64Type kCFNumberFloat32Type kCFNumberFloat64Type kCFNumberCharType kCFNumberShortType kCFNumberIntType kCFNumberLongType kCFNumberLongLongType kCFNumberFloatType kCFNumberDoubleType kCFNumberCFIndexType kCFNumberNSIntegerType kCFNumberCGFloatType kCFNumberMaxType CFNumberType]
[:function CFNumberGetTypeID [:unsigned-long]]
;;FIXME: CFNumberRef in CFNumberCreate
;;FIXME: CFNumberRef in CFNumberGetType
;;FIXME: CFNumberRef in CFNumberGetByteSize
;;FIXME: CFNumberRef in CFNumberIsFloatType
;;FIXME: CFNumberRef in CFNumberGetValue
;;FIXME: CFNumberRef in CFNumberCompare
[:function CFNumberFormatterGetTypeID [:unsigned-long]]
[:enum kCFNumberFormatterNoStyle kCFNumberFormatterDecimalStyle kCFNumberFormatterCurrencyStyle kCFNumberFormatterPercentStyle kCFNumberFormatterScientificStyle kCFNumberFormatterSpellOutStyle CFNumberFormatterStyle]
;;FIXME: CFNumberFormatterRef in CFNumberFormatterCreate
;;FIXME: CFLocaleRef in CFNumberFormatterGetLocale
;;FIXME: CFNumberFormatterRef in CFNumberFormatterGetStyle
;;FIXME: CFStringRef in CFNumberFormatterGetFormat
;;FIXME: CFNumberFormatterRef in CFNumberFormatterSetFormat
;;FIXME: CFStringRef in CFNumberFormatterCreateStringWithNumber
;;FIXME: CFStringRef in CFNumberFormatterCreateStringWithValue
[:enum kCFNumberFormatterParseIntegersOnly CFNumberFormatterOptionFlags]
;;FIXME: CFNumberRef in CFNumberFormatterCreateNumberFromString
;;FIXME: CFNumberFormatterRef in CFNumberFormatterGetValueFromString
;;FIXME: CFNumberFormatterRef in CFNumberFormatterSetProperty
;;FIXME: CFTypeRef in CFNumberFormatterCopyProperty
[:enum kCFNumberFormatterRoundCeiling kCFNumberFormatterRoundFloor kCFNumberFormatterRoundDown kCFNumberFormatterRoundUp kCFNumberFormatterRoundHalfEven kCFNumberFormatterRoundHalfDown kCFNumberFormatterRoundHalfUp CFNumberFormatterRoundingMode]
[:enum kCFNumberFormatterPadBeforePrefix kCFNumberFormatterPadAfterPrefix kCFNumberFormatterPadBeforeSuffix kCFNumberFormatterPadAfterSuffix CFNumberFormatterPadPosition]
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
[:enum kCFURLPOSIXPathStyle kCFURLHFSPathStyle kCFURLWindowsPathStyle CFURLPathStyle]
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
[:enum kCFURLComponentScheme kCFURLComponentNetLocation kCFURLComponentPath kCFURLComponentResourceSpecifier kCFURLComponentUser kCFURLComponentPassword kCFURLComponentUserInfo kCFURLComponentHost kCFURLComponentPort kCFURLComponentParameterString kCFURLComponentQuery kCFURLComponentFragment CFURLComponentType]
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
[:enum kCFURLBookmarkCreationPreferFileIDResolutionMask kCFURLBookmarkCreationMinimalBookmarkMask kCFURLBookmarkCreationSuitableForBookmarkFile kCFURLBookmarkCreationWithSecurityScope kCFURLBookmarkCreationSecurityScopeAllowOnlyReadAccess CFURLBookmarkCreationOptions]
[:enum kCFBookmarkResolutionWithoutUIMask kCFBookmarkResolutionWithoutMountingMask nil]
[:enum kCFURLBookmarkResolutionWithSecurityScope nil]
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
[:enum kCFRunLoopRunFinished kCFRunLoopRunStopped kCFRunLoopRunTimedOut kCFRunLoopRunHandledSource nil]
[:enum kCFRunLoopEntry kCFRunLoopBeforeTimers kCFRunLoopBeforeSources kCFRunLoopBeforeWaiting kCFRunLoopAfterWaiting kCFRunLoopExit kCFRunLoopAllActivities CFRunLoopActivity]
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
[:enum kCFSocketSuccess kCFSocketError kCFSocketTimeout CFSocketError]
[:compound CFSocketSignature "sizeof (CFSocketSignature)"]
[:enum kCFSocketNoCallBack kCFSocketReadCallBack kCFSocketAcceptCallBack kCFSocketDataCallBack kCFSocketConnectCallBack kCFSocketWriteCallBack CFSocketCallBackType]
[:enum kCFSocketAutomaticallyReenableReadCallBack kCFSocketAutomaticallyReenableAcceptCallBack kCFSocketAutomaticallyReenableDataCallBack kCFSocketAutomaticallyReenableWriteCallBack kCFSocketLeaveErrors kCFSocketCloseOnInvalidate nil]
[:compound CFSocketContext "sizeof (CFSocketContext)"]
[:function CFSocketGetTypeID [:unsigned-long]]
;;FIXME: CFSocketRef in CFSocketCreate
;;FIXME: CFSocketRef in CFSocketCreateWithNative
;;FIXME: CFSocketRef in CFSocketCreateWithSocketSignature
;;FIXME: CFSocketRef in CFSocketCreateConnectedToSocketSignature
;;FIXME: CFSocketRef in CFSocketSetAddress
;;FIXME: CFSocketRef in CFSocketConnectToAddress
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
;;FIXME: CFSocketRef in CFSocketSendData
;;FIXME: const CFSocketSignature * in CFSocketRegisterValue
;;FIXME: const CFSocketSignature * in CFSocketCopyRegisteredValue
;;FIXME: const CFSocketSignature * in CFSocketRegisterSocketSignature
;;FIXME: const CFSocketSignature * in CFSocketCopyRegisteredSocketSignature
;;FIXME: const CFSocketSignature * in CFSocketUnregister
[:function CFSocketSetDefaultNameRegistryPortNumber [:void :unsigned-short]]
[:function CFSocketGetDefaultNameRegistryPortNumber [:unsigned-short]]
[:enum kCFStreamStatusNotOpen kCFStreamStatusOpening kCFStreamStatusOpen kCFStreamStatusReading kCFStreamStatusWriting kCFStreamStatusAtEnd kCFStreamStatusClosed kCFStreamStatusError CFStreamStatus]
[:enum kCFStreamEventNone kCFStreamEventOpenCompleted kCFStreamEventHasBytesAvailable kCFStreamEventCanAcceptBytes kCFStreamEventErrorOccurred kCFStreamEventEndEncountered CFStreamEventType]
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
;;FIXME: CFReadStreamRef in CFReadStreamGetStatus
;;FIXME: CFWriteStreamRef in CFWriteStreamGetStatus
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
[:enum kCFStreamErrorDomainCustom kCFStreamErrorDomainPOSIX kCFStreamErrorDomainMacOSStatus CFStreamErrorDomain]
[:compound CFStreamError "sizeof (CFStreamError)"]
;;FIXME: CFReadStreamRef in CFReadStreamGetError
;;FIXME: CFWriteStreamRef in CFWriteStreamGetError
[:enum kCFPropertyListImmutable kCFPropertyListMutableContainers kCFPropertyListMutableContainersAndLeaves CFPropertyListMutabilityOptions]
;;FIXME: CFPropertyListRef in CFPropertyListCreateFromXMLData
;;FIXME: CFDataRef in CFPropertyListCreateXMLData
;;FIXME: CFPropertyListRef in CFPropertyListCreateDeepCopy
[:enum kCFPropertyListOpenStepFormat kCFPropertyListXMLFormat_v1_0 kCFPropertyListBinaryFormat_v1_0 CFPropertyListFormat]
;;FIXME: CFPropertyListRef in CFPropertyListIsValid
;;FIXME: CFPropertyListRef in CFPropertyListWriteToStream
;;FIXME: CFPropertyListRef in CFPropertyListCreateFromStream
[:enum kCFPropertyListReadCorruptError kCFPropertyListReadUnknownVersionError kCFPropertyListReadStreamError kCFPropertyListWriteStreamError nil]
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
[:enum kCFStringEncodingMacJapanese kCFStringEncodingMacChineseTrad kCFStringEncodingMacKorean kCFStringEncodingMacArabic kCFStringEncodingMacHebrew kCFStringEncodingMacGreek kCFStringEncodingMacCyrillic kCFStringEncodingMacDevanagari kCFStringEncodingMacGurmukhi kCFStringEncodingMacGujarati kCFStringEncodingMacOriya kCFStringEncodingMacBengali kCFStringEncodingMacTamil kCFStringEncodingMacTelugu kCFStringEncodingMacKannada kCFStringEncodingMacMalayalam kCFStringEncodingMacSinhalese kCFStringEncodingMacBurmese kCFStringEncodingMacKhmer kCFStringEncodingMacThai kCFStringEncodingMacLaotian kCFStringEncodingMacGeorgian kCFStringEncodingMacArmenian kCFStringEncodingMacChineseSimp kCFStringEncodingMacTibetan kCFStringEncodingMacMongolian kCFStringEncodingMacEthiopic kCFStringEncodingMacCentralEurRoman kCFStringEncodingMacVietnamese kCFStringEncodingMacExtArabic kCFStringEncodingMacSymbol kCFStringEncodingMacDingbats kCFStringEncodingMacTurkish kCFStringEncodingMacCroatian kCFStringEncodingMacIcelandic kCFStringEncodingMacRomanian kCFStringEncodingMacCeltic kCFStringEncodingMacGaelic kCFStringEncodingMacFarsi kCFStringEncodingMacUkrainian kCFStringEncodingMacInuit kCFStringEncodingMacVT100 kCFStringEncodingMacHFS kCFStringEncodingISOLatin2 kCFStringEncodingISOLatin3 kCFStringEncodingISOLatin4 kCFStringEncodingISOLatinCyrillic kCFStringEncodingISOLatinArabic kCFStringEncodingISOLatinGreek kCFStringEncodingISOLatinHebrew kCFStringEncodingISOLatin5 kCFStringEncodingISOLatin6 kCFStringEncodingISOLatinThai kCFStringEncodingISOLatin7 kCFStringEncodingISOLatin8 kCFStringEncodingISOLatin9 kCFStringEncodingISOLatin10 kCFStringEncodingDOSLatinUS kCFStringEncodingDOSGreek kCFStringEncodingDOSBalticRim kCFStringEncodingDOSLatin1 kCFStringEncodingDOSGreek1 kCFStringEncodingDOSLatin2 kCFStringEncodingDOSCyrillic kCFStringEncodingDOSTurkish kCFStringEncodingDOSPortuguese kCFStringEncodingDOSIcelandic kCFStringEncodingDOSHebrew kCFStringEncodingDOSCanadianFrench kCFStringEncodingDOSArabic kCFStringEncodingDOSNordic kCFStringEncodingDOSRussian kCFStringEncodingDOSGreek2 kCFStringEncodingDOSThai kCFStringEncodingDOSJapanese kCFStringEncodingDOSChineseSimplif kCFStringEncodingDOSKorean kCFStringEncodingDOSChineseTrad kCFStringEncodingWindowsLatin2 kCFStringEncodingWindowsCyrillic kCFStringEncodingWindowsGreek kCFStringEncodingWindowsLatin5 kCFStringEncodingWindowsHebrew kCFStringEncodingWindowsArabic kCFStringEncodingWindowsBalticRim kCFStringEncodingWindowsVietnamese kCFStringEncodingWindowsKoreanJohab kCFStringEncodingANSEL kCFStringEncodingJIS_X0201_76 kCFStringEncodingJIS_X0208_83 kCFStringEncodingJIS_X0208_90 kCFStringEncodingJIS_X0212_90 kCFStringEncodingJIS_C6226_78 kCFStringEncodingShiftJIS_X0213 kCFStringEncodingShiftJIS_X0213_MenKuTen kCFStringEncodingGB_2312_80 kCFStringEncodingGBK_95 kCFStringEncodingGB_18030_2000 kCFStringEncodingKSC_5601_87 kCFStringEncodingKSC_5601_92_Johab kCFStringEncodingCNS_11643_92_P1 kCFStringEncodingCNS_11643_92_P2 kCFStringEncodingCNS_11643_92_P3 kCFStringEncodingISO_2022_JP kCFStringEncodingISO_2022_JP_2 kCFStringEncodingISO_2022_JP_1 kCFStringEncodingISO_2022_JP_3 kCFStringEncodingISO_2022_CN kCFStringEncodingISO_2022_CN_EXT kCFStringEncodingISO_2022_KR kCFStringEncodingEUC_JP kCFStringEncodingEUC_CN kCFStringEncodingEUC_TW kCFStringEncodingEUC_KR kCFStringEncodingShiftJIS kCFStringEncodingKOI8_R kCFStringEncodingBig5 kCFStringEncodingMacRomanLatin1 kCFStringEncodingHZ_GB_2312 kCFStringEncodingBig5_HKSCS_1999 kCFStringEncodingVISCII kCFStringEncodingKOI8_U kCFStringEncodingBig5_E kCFStringEncodingNextStepJapanese kCFStringEncodingEBCDIC_US kCFStringEncodingEBCDIC_CP037 kCFStringEncodingUTF7 kCFStringEncodingUTF7_IMAP kCFStringEncodingShiftJIS_X0213_00 CFStringEncodings]
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
[:enum kCFURLUnknownError kCFURLUnknownSchemeError kCFURLResourceNotFoundError kCFURLResourceAccessViolationError kCFURLRemoteHostUnavailableError kCFURLImproperArgumentsError kCFURLUnknownPropertyKeyError kCFURLPropertyKeyUnavailableError kCFURLTimeoutError CFURLError]
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
[:enum kCFBundleExecutableArchitectureI386 kCFBundleExecutableArchitecturePPC kCFBundleExecutableArchitectureX86_64 kCFBundleExecutableArchitecturePPC64 nil]
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
[:function exchangedata [:int :c-string-const :c-string-const :unsigned-long]]
;;FIXME: void * in getdirentriesattr
;;FIXME: struct fssearchblock * in searchfs
;;FIXME: void * in fsctl
;;FIXME: void * in ffsctl
[:function fsync_volume_np [:int :int :int]]
[:function sync_volume_np [:int :c-string-const :int]]
[:compound fsignatures_t "sizeof (fsignatures_t)"]
[:compound fstore_t "sizeof (fstore_t)"]
[:compound fbootstraptransfer_t "sizeof (fbootstraptransfer_t)"]
[:enum FILESEC_OWNER FILESEC_GROUP FILESEC_UUID FILESEC_MODE FILESEC_ACL FILESEC_GRPUUID FILESEC_ACL_RAW FILESEC_ACL_ALLOCSIZE filesec_property_t]
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
[:enum NSOrderedAscending NSOrderedSame NSOrderedDescending NSComparisonResult]
[:enum NSEnumerationConcurrent NSEnumerationReverse nil]
[:enum NSSortConcurrent NSSortStable nil]
[:enum NSNotFound nil]
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
;;FIXME: CFTypeRef in NSMakeCollectable
;;FIXME: CFTypeRef in NSMakeCollectable
[:function NSPageSize [:unsigned-int]]
[:function NSLogPageSize [:unsigned-int]]
[:function NSRoundUpToMultipleOfPageSize [:unsigned-int :unsigned-int]]
[:function NSRoundDownToMultipleOfPageSize [:unsigned-int :unsigned-int]]
;;FIXME: void * in NSAllocateMemoryPages
;;FIXME: void * in NSDeallocateMemoryPages
;;FIXME: const void * in NSCopyMemoryPages
[:function NSRealMemoryAvailable [:unsigned-int]]
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
[:selector [0 :version] [:int]]
[:selector [1 :setVersion] [:void :int]]
[:selector [0 :classForCoder] [:id]]
[:selector [1 :replacementObjectForCoder] [:id :id]]
[:selector [1 :awakeAfterUsingCoder] [:id :id]]
[:selector [0 :autoContentAccessingProxy] [:id]]
;;FIXME: NSZone * in NSAllocateObject
[:function NSDeallocateObject [:void :id]]
;;FIXME: NSZone * in NSCopyObject
;;FIXME: NSZone * in NSShouldRetainWithZone
[:function NSIncrementExtraRefCount [:void :id]]
[:function NSDecrementExtraRefCountWasZero [Boolean :id]]
[:function NSExtraRefCount [:unsigned-int :id]]
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
[:enum kCFMessagePortSuccess kCFMessagePortSendTimeout kCFMessagePortReceiveTimeout kCFMessagePortIsInvalid kCFMessagePortTransportError kCFMessagePortBecameInvalidError nil]
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
[:enum CFNotificationSuspensionBehaviorDrop CFNotificationSuspensionBehaviorCoalesce CFNotificationSuspensionBehaviorHold CFNotificationSuspensionBehaviorDeliverImmediately CFNotificationSuspensionBehavior]
[:function CFNotificationCenterGetTypeID [:unsigned-long]]
;;FIXME: CFNotificationCenterRef in CFNotificationCenterGetLocalCenter
;;FIXME: CFNotificationCenterRef in CFNotificationCenterGetDarwinNotifyCenter
;;FIXME: CFNotificationCenterRef in CFNotificationCenterAddObserver
;;FIXME: CFNotificationCenterRef in CFNotificationCenterRemoveObserver
;;FIXME: CFNotificationCenterRef in CFNotificationCenterRemoveEveryObserver
;;FIXME: CFNotificationCenterRef in CFNotificationCenterPostNotification
[:enum kCFNotificationDeliverImmediately kCFNotificationPostToAllSessions nil]
;;FIXME: CFNotificationCenterRef in CFNotificationCenterPostNotificationWithOptions
[:function CFURLEnumeratorGetTypeID [:unsigned-long]]
[:enum kCFURLEnumeratorDefaultBehavior kCFURLEnumeratorDescendRecursively kCFURLEnumeratorSkipInvisibles kCFURLEnumeratorGenerateFileReferenceURLs kCFURLEnumeratorSkipPackageContents kCFURLEnumeratorIncludeDirectoriesPreOrder kCFURLEnumeratorIncludeDirectoriesPostOrder CFURLEnumeratorOptions]
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorCreateForDirectoryURL
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorCreateForMountedVolumes
[:enum kCFURLEnumeratorSuccess kCFURLEnumeratorEnd kCFURLEnumeratorError kCFURLEnumeratorDirectoryPostOrderSuccess CFURLEnumeratorResult]
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorGetNextURL
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorSkipDescendents
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorGetDescendentLevel
;;FIXME: CFURLEnumeratorRef in CFURLEnumeratorGetSourceDidChange
[:compound guid_t "sizeof (guid_t)"]
[:compound ntsid_t "sizeof (ntsid_t)"]
[:enum ACL_READ_DATA ACL_LIST_DIRECTORY ACL_WRITE_DATA ACL_ADD_FILE ACL_EXECUTE ACL_SEARCH ACL_DELETE ACL_APPEND_DATA ACL_ADD_SUBDIRECTORY ACL_DELETE_CHILD ACL_READ_ATTRIBUTES ACL_WRITE_ATTRIBUTES ACL_READ_EXTATTRIBUTES ACL_WRITE_EXTATTRIBUTES ACL_READ_SECURITY ACL_WRITE_SECURITY ACL_CHANGE_OWNER acl_perm_t]
[:enum ACL_UNDEFINED_TAG ACL_EXTENDED_ALLOW ACL_EXTENDED_DENY acl_tag_t]
[:enum ACL_TYPE_EXTENDED ACL_TYPE_ACCESS ACL_TYPE_DEFAULT ACL_TYPE_AFS ACL_TYPE_CODA ACL_TYPE_NTFS ACL_TYPE_NWFS acl_type_t]
[:enum ACL_FIRST_ENTRY ACL_NEXT_ENTRY ACL_LAST_ENTRY acl_entry_id_t]
[:enum ACL_FLAG_DEFER_INHERIT ACL_FLAG_NO_INHERIT ACL_ENTRY_INHERITED ACL_ENTRY_FILE_INHERIT ACL_ENTRY_DIRECTORY_INHERIT ACL_ENTRY_LIMIT_INHERIT ACL_ENTRY_ONLY_INHERIT acl_flag_t]
;;FIXME: acl_t in acl_dup
;;FIXME: void * in acl_free
;;FIXME: acl_t in acl_init
;;FIXME: acl_entry_t in acl_copy_entry
;;FIXME: acl_t * in acl_create_entry
;;FIXME: acl_t * in acl_create_entry_np
;;FIXME: acl_t in acl_delete_entry
;;FIXME: acl_t in acl_get_entry
;;FIXME: acl_t in acl_valid
;;FIXME: acl_t in acl_valid_fd_np
;;FIXME: acl_t in acl_valid_file_np
;;FIXME: acl_t in acl_valid_link_np
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
;;FIXME: acl_t in acl_set_file
;;FIXME: acl_t in acl_set_link_np
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
[:enum kCFFileSecurityClearOwner kCFFileSecurityClearGroup kCFFileSecurityClearMode kCFFileSecurityClearOwnerUUID kCFFileSecurityClearGroupUUID kCFFileSecurityClearAccessControlList nil]
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
[:enum kCFStringTokenizerUnitWord kCFStringTokenizerUnitSentence kCFStringTokenizerUnitParagraph kCFStringTokenizerUnitLineBreak kCFStringTokenizerUnitWordBoundary kCFStringTokenizerAttributeLatinTranscription kCFStringTokenizerAttributeLanguage nil]
[:enum kCFStringTokenizerTokenNone kCFStringTokenizerTokenNormal kCFStringTokenizerTokenHasSubTokensMask kCFStringTokenizerTokenHasDerivedSubTokensMask kCFStringTokenizerTokenHasHasNumbersMask kCFStringTokenizerTokenHasNonLettersMask kCFStringTokenizerTokenIsCJWordMask CFStringTokenizerTokenType]
[:function CFStringTokenizerGetTypeID [:unsigned-long]]
;;FIXME: CFStringTokenizerRef in CFStringTokenizerCreate
;;FIXME: CFStringTokenizerRef in CFStringTokenizerSetString
;;FIXME: CFStringTokenizerRef in CFStringTokenizerGoToTokenAtIndex
;;FIXME: CFStringTokenizerRef in CFStringTokenizerAdvanceToNextToken
;;FIXME: CFStringTokenizerRef in CFStringTokenizerGetCurrentTokenRange
;;FIXME: CFTypeRef in CFStringTokenizerCopyCurrentTokenAttribute
;;FIXME: CFStringTokenizerRef in CFStringTokenizerGetCurrentSubTokens
[:enum kCFFileDescriptorReadCallBack kCFFileDescriptorWriteCallBack nil]
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
[:compound NSFastEnumerationState "sizeof (NSFastEnumerationState)"]
[:selector [0 :nextObject] [:id]]
[:selector [0 :allObjects] [:id]]
;;FIXME: void * in getValue:
[:selector [0 :objCType] [:c-string-const]]
;;FIXME: const void * in initWithBytes:objCType:
;;FIXME: const void * in valueWithBytes:objCType:
;;FIXME: const void * in value:withObjCType:
[:selector [1 :valueWithNonretainedObject] [:id :id]]
[:selector [0 :nonretainedObjectValue] [:id]]
;;FIXME: const void * in valueWithPointer:
;;FIXME: void * in pointerValue
[:selector [1 :isEqualToValue] [Boolean :id]]
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
[:selector [0 :integerValue] [:int]]
[:selector [0 :unsignedIntegerValue] [:unsigned-int]]
[:selector [0 :stringValue] [:id]]
[:selector [1 :compare] [UIKit/NSComparisonResult :id]]
[:selector [1 :isEqualToNumber] [Boolean :id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [1 :initWithChar] [:id :char]]
[:selector [1 :initWithUnsignedChar] [:id :unsigned-char]]
[:selector [1 :initWithShort] [:id :short]]
[:selector [1 :initWithUnsignedShort] [:id :unsigned-short]]
[:selector [1 :initWithInt] [:id :int]]
[:selector [1 :initWithUnsignedInt] [:id :unsigned-int]]
[:selector [1 :initWithLong] [:id :long]]
[:selector [1 :initWithUnsignedLong] [:id :unsigned-long]]
[:selector [1 :initWithLongLong] [:id :long-long]]
[:selector [1 :initWithUnsignedLongLong] [:id :unsigned-long-long]]
[:selector [1 :initWithFloat] [:id :float]]
[:selector [1 :initWithDouble] [:id :double]]
[:selector [1 :initWithBool] [:id Boolean]]
[:selector [1 :initWithInteger] [:id :int]]
[:selector [1 :initWithUnsignedInteger] [:id :unsigned-int]]
[:selector [1 :numberWithChar] [:id :char]]
[:selector [1 :numberWithUnsignedChar] [:id :unsigned-char]]
[:selector [1 :numberWithShort] [:id :short]]
[:selector [1 :numberWithUnsignedShort] [:id :unsigned-short]]
[:selector [1 :numberWithInt] [:id :int]]
[:selector [1 :numberWithUnsignedInt] [:id :unsigned-int]]
[:selector [1 :numberWithLong] [:id :long]]
[:selector [1 :numberWithUnsignedLong] [:id :unsigned-long]]
[:selector [1 :numberWithLongLong] [:id :long-long]]
[:selector [1 :numberWithUnsignedLongLong] [:id :unsigned-long-long]]
[:selector [1 :numberWithFloat] [:id :float]]
[:selector [1 :numberWithDouble] [:id :double]]
[:selector [1 :numberWithBool] [:id Boolean]]
[:selector [1 :numberWithInteger] [:id :int]]
[:selector [1 :numberWithUnsignedInteger] [:id :unsigned-int]]
[:compound NSRange "sizeof (NSRange)"]
[:function NSMakeRange [UIKit/NSRange :unsigned-int :unsigned-int]]
[:function NSMaxRange [:unsigned-int UIKit/NSRange]]
[:function NSLocationInRange [Boolean :unsigned-int UIKit/NSRange]]
[:function NSEqualRanges [Boolean UIKit/NSRange UIKit/NSRange]]
[:function NSUnionRange [UIKit/NSRange UIKit/NSRange UIKit/NSRange]]
[:function NSIntersectionRange [UIKit/NSRange UIKit/NSRange UIKit/NSRange]]
[:function NSStringFromRange [:id UIKit/NSRange]]
[:function NSRangeFromString [UIKit/NSRange :id]]
[:selector [1 :valueWithRange] [:id UIKit/NSRange]]
[:selector [0 :rangeValue] [UIKit/NSRange]]
[:selector [0 :count] [:unsigned-int]]
[:selector [1 :objectAtIndex] [:id :unsigned-int]]
[:selector [1 :arrayByAddingObject] [:id :id]]
[:selector [1 :arrayByAddingObjectsFromArray] [:id :id]]
[:selector [1 :componentsJoinedByString] [:id :id]]
[:selector [1 :containsObject] [Boolean :id]]
[:selector [0 :description] [:id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [2 :descriptionWithLocale :indent] [:id :id :unsigned-int]]
[:selector [1 :firstObjectCommonWithArray] [:id :id]]
;;FIXME: id [] in getObjects:range:
[:selector [1 :indexOfObject] [:unsigned-int :id]]
[:selector [2 :indexOfObject :inRange] [:unsigned-int :id UIKit/NSRange]]
[:selector [1 :indexOfObjectIdenticalTo] [:unsigned-int :id]]
[:selector [2 :indexOfObjectIdenticalTo :inRange] [:unsigned-int :id UIKit/NSRange]]
[:selector [1 :isEqualToArray] [Boolean :id]]
[:selector [0 :lastObject] [:id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [0 :reverseObjectEnumerator] [:id]]
[:selector [0 :sortedArrayHint] [:id]]
;;FIXME: NSInteger (*)(id, id, void *) in sortedArrayUsingFunction:context:
;;FIXME: NSInteger (*)(id, id, void *) in sortedArrayUsingFunction:context:hint:
[:selector [1 :sortedArrayUsingSelector] [:id :selector]]
[:selector [1 :subarrayWithRange] [:id UIKit/NSRange]]
[:selector [2 :writeToFile :atomically] [Boolean :id Boolean]]
[:selector [2 :writeToURL :atomically] [Boolean :id Boolean]]
[:selector [1 :makeObjectsPerformSelector] [:void :selector]]
[:selector [2 :makeObjectsPerformSelector :withObject] [:void :selector :id]]
[:selector [1 :objectsAtIndexes] [:id :id]]
[:selector [1 :objectAtIndexedSubscript] [:id :unsigned-int]]
;;FIXME: void (^)(id, NSUInteger, BOOL *) in enumerateObjectsUsingBlock:
;;FIXME: void (^)(id, NSUInteger, BOOL *) in enumerateObjectsWithOptions:usingBlock:
;;FIXME: void (^)(id, NSUInteger, BOOL *) in enumerateObjectsAtIndexes:options:usingBlock:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexOfObjectPassingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexOfObjectWithOptions:passingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexOfObjectAtIndexes:options:passingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexesOfObjectsPassingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexesOfObjectsWithOptions:passingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexesOfObjectsAtIndexes:options:passingTest:
;;FIXME: NSComparator in sortedArrayUsingComparator:
;;FIXME: NSComparator in sortedArrayWithOptions:usingComparator:
[:enum NSBinarySearchingFirstEqual NSBinarySearchingLastEqual NSBinarySearchingInsertionIndex NSBinarySearchingOptions]
;;FIXME: NSComparator in indexOfObject:inSortedRange:options:usingComparator:
[:selector [0 :array] [:id]]
[:selector [1 :arrayWithObject] [:id :id]]
;;FIXME: const id [] in arrayWithObjects:count:
;;FIXME: variadic arrayWithObjects:
[:selector [1 :arrayWithArray] [:id :id]]
;;FIXME: const id [] in initWithObjects:count:
;;FIXME: variadic initWithObjects:
[:selector [1 :initWithArray] [:id :id]]
[:selector [2 :initWithArray :copyItems] [:id :id Boolean]]
[:selector [1 :arrayWithContentsOfFile] [:id :id]]
[:selector [1 :arrayWithContentsOfURL] [:id :id]]
[:selector [1 :initWithContentsOfFile] [:id :id]]
[:selector [1 :initWithContentsOfURL] [:id :id]]
;;FIXME: id [] in getObjects:
[:selector [1 :addObject] [:void :id]]
[:selector [2 :insertObject :atIndex] [:void :id :unsigned-int]]
[:selector [0 :removeLastObject] [:void]]
[:selector [1 :removeObjectAtIndex] [:void :unsigned-int]]
[:selector [2 :replaceObjectAtIndex :withObject] [:void :unsigned-int :id]]
[:selector [1 :addObjectsFromArray] [:void :id]]
[:selector [2 :exchangeObjectAtIndex :withObjectAtIndex] [:void :unsigned-int :unsigned-int]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [2 :removeObject :inRange] [:void :id UIKit/NSRange]]
[:selector [1 :removeObject] [:void :id]]
[:selector [2 :removeObjectIdenticalTo :inRange] [:void :id UIKit/NSRange]]
[:selector [1 :removeObjectIdenticalTo] [:void :id]]
;;FIXME: NSUInteger * in removeObjectsFromIndices:numIndices:
[:selector [1 :removeObjectsInArray] [:void :id]]
[:selector [1 :removeObjectsInRange] [:void UIKit/NSRange]]
[:selector [3 :replaceObjectsInRange :withObjectsFromArray :range] [:void UIKit/NSRange :id UIKit/NSRange]]
[:selector [2 :replaceObjectsInRange :withObjectsFromArray] [:void UIKit/NSRange :id]]
[:selector [1 :setArray] [:void :id]]
;;FIXME: NSInteger (*)(id, id, void *) in sortUsingFunction:context:
[:selector [1 :sortUsingSelector] [:void :selector]]
[:selector [2 :insertObjects :atIndexes] [:void :id :id]]
[:selector [1 :removeObjectsAtIndexes] [:void :id]]
[:selector [2 :replaceObjectsAtIndexes :withObjects] [:void :id :id]]
[:selector [2 :setObject :atIndexedSubscript] [:void :id :unsigned-int]]
;;FIXME: NSComparator in sortUsingComparator:
;;FIXME: NSComparator in sortWithOptions:usingComparator:
[:selector [1 :arrayWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
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
[:enum NSBundleExecutableArchitectureI386 NSBundleExecutableArchitecturePPC NSBundleExecutableArchitectureX86_64 NSBundleExecutableArchitecturePPC64 nil]
[:selector [0 :executableArchitectures] [:id]]
[:enum NS_UnknownByteOrder NS_LittleEndian NS_BigEndian nil]
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
[:function NSConvertHostFloatToSwapped [UIKit/NSSwappedFloat :float]]
[:function NSConvertSwappedFloatToHost [:float UIKit/NSSwappedFloat]]
[:function NSConvertHostDoubleToSwapped [UIKit/NSSwappedDouble :double]]
[:function NSConvertSwappedDoubleToHost [:double UIKit/NSSwappedDouble]]
[:function NSSwapFloat [UIKit/NSSwappedFloat UIKit/NSSwappedFloat]]
[:function NSSwapDouble [UIKit/NSSwappedDouble UIKit/NSSwappedDouble]]
[:function NSSwapBigDoubleToHost [:double UIKit/NSSwappedDouble]]
[:function NSSwapBigFloatToHost [:float UIKit/NSSwappedFloat]]
[:function NSSwapHostDoubleToBig [UIKit/NSSwappedDouble :double]]
[:function NSSwapHostFloatToBig [UIKit/NSSwappedFloat :float]]
[:function NSSwapLittleDoubleToHost [:double UIKit/NSSwappedDouble]]
[:function NSSwapLittleFloatToHost [:float UIKit/NSSwappedFloat]]
[:function NSSwapHostDoubleToLittle [UIKit/NSSwappedDouble :double]]
[:function NSSwapHostFloatToLittle [UIKit/NSSwappedFloat :float]]
[:selector [0 :timeIntervalSinceReferenceDate] [:double]]
[:selector [1 :timeIntervalSinceDate] [:double :id]]
[:selector [0 :timeIntervalSinceNow] [:double]]
[:selector [0 :timeIntervalSince1970] [:double]]
[:selector [1 :addTimeInterval] [:id :double]]
[:selector [1 :dateByAddingTimeInterval] [:id :double]]
[:selector [1 :earlierDate] [:id :id]]
[:selector [1 :laterDate] [:id :id]]
[:selector [1 :compare] [UIKit/NSComparisonResult :id]]
[:selector [1 :isEqualToDate] [Boolean :id]]
[:selector [0 :description] [:id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [0 :timeIntervalSinceReferenceDate] [:double]]
[:selector [0 :date] [:id]]
[:selector [1 :dateWithTimeIntervalSinceNow] [:id :double]]
[:selector [1 :dateWithTimeIntervalSinceReferenceDate] [:id :double]]
[:selector [1 :dateWithTimeIntervalSince1970] [:id :double]]
[:selector [2 :dateWithTimeInterval :sinceDate] [:id :double :id]]
[:selector [0 :distantFuture] [:id]]
[:selector [0 :distantPast] [:id]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithTimeIntervalSinceNow] [:id :double]]
[:selector [1 :initWithTimeIntervalSinceReferenceDate] [:id :double]]
[:selector [1 :initWithTimeIntervalSince1970] [:id :double]]
[:selector [2 :initWithTimeInterval :sinceDate] [:id :double :id]]
[:enum NSEraCalendarUnit NSYearCalendarUnit NSMonthCalendarUnit NSDayCalendarUnit NSHourCalendarUnit NSMinuteCalendarUnit NSSecondCalendarUnit NSWeekCalendarUnit NSWeekdayCalendarUnit NSWeekdayOrdinalCalendarUnit NSQuarterCalendarUnit NSWeekOfMonthCalendarUnit NSWeekOfYearCalendarUnit NSYearForWeekOfYearCalendarUnit NSCalendarCalendarUnit NSTimeZoneCalendarUnit NSCalendarUnit]
[:selector [0 :currentCalendar] [:id]]
[:selector [0 :autoupdatingCurrentCalendar] [:id]]
[:selector [1 :initWithCalendarIdentifier] [:id :id]]
[:selector [0 :calendarIdentifier] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :locale] [:id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [0 :timeZone] [:id]]
[:selector [1 :setFirstWeekday] [:void :unsigned-int]]
[:selector [0 :firstWeekday] [:unsigned-int]]
[:selector [1 :setMinimumDaysInFirstWeek] [:void :unsigned-int]]
[:selector [0 :minimumDaysInFirstWeek] [:unsigned-int]]
[:selector [1 :minimumRangeOfUnit] [UIKit/NSRange UIKit/NSCalendarUnit]]
[:selector [1 :maximumRangeOfUnit] [UIKit/NSRange UIKit/NSCalendarUnit]]
[:selector [3 :rangeOfUnit :inUnit :forDate] [UIKit/NSRange UIKit/NSCalendarUnit UIKit/NSCalendarUnit :id]]
[:selector [3 :ordinalityOfUnit :inUnit :forDate] [:unsigned-int UIKit/NSCalendarUnit UIKit/NSCalendarUnit :id]]
;;FIXME: NSDate ** in rangeOfUnit:startDate:interval:forDate:
[:selector [1 :dateFromComponents] [:id :id]]
[:selector [2 :components :fromDate] [:id :unsigned-int :id]]
[:selector [3 :dateByAddingComponents :toDate :options] [:id :id :id :unsigned-int]]
[:selector [4 :components :fromDate :toDate :options] [:id :unsigned-int :id :id :unsigned-int]]
[:enum NSWrapCalendarComponents nil]
[:enum NSUndefinedDateComponent nil]
[:selector [0 :calendar] [:id]]
[:selector [0 :timeZone] [:id]]
[:selector [0 :era] [:int]]
[:selector [0 :year] [:int]]
[:selector [0 :month] [:int]]
[:selector [0 :day] [:int]]
[:selector [0 :hour] [:int]]
[:selector [0 :minute] [:int]]
[:selector [0 :second] [:int]]
[:selector [0 :week] [:int]]
[:selector [0 :weekday] [:int]]
[:selector [0 :weekdayOrdinal] [:int]]
[:selector [0 :quarter] [:int]]
[:selector [0 :weekOfMonth] [:int]]
[:selector [0 :weekOfYear] [:int]]
[:selector [0 :yearForWeekOfYear] [:int]]
[:selector [0 :isLeapMonth] [Boolean]]
[:selector [1 :setCalendar] [:void :id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [1 :setEra] [:void :int]]
[:selector [1 :setYear] [:void :int]]
[:selector [1 :setMonth] [:void :int]]
[:selector [1 :setDay] [:void :int]]
[:selector [1 :setHour] [:void :int]]
[:selector [1 :setMinute] [:void :int]]
[:selector [1 :setSecond] [:void :int]]
[:selector [1 :setWeek] [:void :int]]
[:selector [1 :setWeekday] [:void :int]]
[:selector [1 :setWeekdayOrdinal] [:void :int]]
[:selector [1 :setQuarter] [:void :int]]
[:selector [1 :setWeekOfMonth] [:void :int]]
[:selector [1 :setWeekOfYear] [:void :int]]
[:selector [1 :setYearForWeekOfYear] [:void :int]]
[:selector [1 :setLeapMonth] [:void Boolean]]
[:selector [0 :date] [:id]]
[:enum NSCaseInsensitiveSearch NSLiteralSearch NSBackwardsSearch NSAnchoredSearch NSNumericSearch NSDiacriticInsensitiveSearch NSWidthInsensitiveSearch NSForcedOrderingSearch NSRegularExpressionSearch NSStringCompareOptions]
[:enum NSASCIIStringEncoding NSNEXTSTEPStringEncoding NSJapaneseEUCStringEncoding NSUTF8StringEncoding NSISOLatin1StringEncoding NSSymbolStringEncoding NSNonLossyASCIIStringEncoding NSShiftJISStringEncoding NSISOLatin2StringEncoding NSUnicodeStringEncoding NSWindowsCP1251StringEncoding NSWindowsCP1252StringEncoding NSWindowsCP1253StringEncoding NSWindowsCP1254StringEncoding NSWindowsCP1250StringEncoding NSISO2022JPStringEncoding NSMacOSRomanStringEncoding NSUTF16StringEncoding NSUTF16BigEndianStringEncoding NSUTF16LittleEndianStringEncoding NSUTF32StringEncoding NSUTF32BigEndianStringEncoding NSUTF32LittleEndianStringEncoding nil]
[:enum NSStringEncodingConversionAllowLossy NSStringEncodingConversionExternalRepresentation NSStringEncodingConversionOptions]
[:selector [0 :length] [:unsigned-int]]
[:selector [1 :characterAtIndex] [:unsigned-short :unsigned-int]]
;;FIXME: unichar * in getCharacters:range:
[:selector [1 :substringFromIndex] [:id :unsigned-int]]
[:selector [1 :substringToIndex] [:id :unsigned-int]]
[:selector [1 :substringWithRange] [:id UIKit/NSRange]]
[:selector [1 :compare] [UIKit/NSComparisonResult :id]]
[:selector [2 :compare :options] [UIKit/NSComparisonResult :id UIKit/NSStringCompareOptions]]
[:selector [3 :compare :options :range] [UIKit/NSComparisonResult :id UIKit/NSStringCompareOptions UIKit/NSRange]]
[:selector [4 :compare :options :range :locale] [UIKit/NSComparisonResult :id UIKit/NSStringCompareOptions UIKit/NSRange :id]]
[:selector [1 :caseInsensitiveCompare] [UIKit/NSComparisonResult :id]]
[:selector [1 :localizedCompare] [UIKit/NSComparisonResult :id]]
[:selector [1 :localizedCaseInsensitiveCompare] [UIKit/NSComparisonResult :id]]
[:selector [1 :localizedStandardCompare] [UIKit/NSComparisonResult :id]]
[:selector [1 :isEqualToString] [Boolean :id]]
[:selector [1 :hasPrefix] [Boolean :id]]
[:selector [1 :hasSuffix] [Boolean :id]]
[:selector [1 :rangeOfString] [UIKit/NSRange :id]]
[:selector [2 :rangeOfString :options] [UIKit/NSRange :id UIKit/NSStringCompareOptions]]
[:selector [3 :rangeOfString :options :range] [UIKit/NSRange :id UIKit/NSStringCompareOptions UIKit/NSRange]]
[:selector [4 :rangeOfString :options :range :locale] [UIKit/NSRange :id UIKit/NSStringCompareOptions UIKit/NSRange :id]]
[:selector [1 :rangeOfCharacterFromSet] [UIKit/NSRange :id]]
[:selector [2 :rangeOfCharacterFromSet :options] [UIKit/NSRange :id UIKit/NSStringCompareOptions]]
[:selector [3 :rangeOfCharacterFromSet :options :range] [UIKit/NSRange :id UIKit/NSStringCompareOptions UIKit/NSRange]]
[:selector [1 :rangeOfComposedCharacterSequenceAtIndex] [UIKit/NSRange :unsigned-int]]
[:selector [1 :rangeOfComposedCharacterSequencesForRange] [UIKit/NSRange UIKit/NSRange]]
[:selector [1 :stringByAppendingString] [:id :id]]
;;FIXME: variadic stringByAppendingFormat:
[:selector [0 :doubleValue] [:double]]
[:selector [0 :floatValue] [:float]]
[:selector [0 :intValue] [:int]]
[:selector [0 :integerValue] [:int]]
[:selector [0 :longLongValue] [:long-long]]
[:selector [0 :boolValue] [Boolean]]
[:selector [1 :componentsSeparatedByString] [:id :id]]
[:selector [1 :componentsSeparatedByCharactersInSet] [:id :id]]
[:selector [2 :commonPrefixWithString :options] [:id :id UIKit/NSStringCompareOptions]]
[:selector [0 :uppercaseString] [:id]]
[:selector [0 :lowercaseString] [:id]]
[:selector [0 :capitalizedString] [:id]]
[:selector [1 :uppercaseStringWithLocale] [:id :id]]
[:selector [1 :lowercaseStringWithLocale] [:id :id]]
[:selector [1 :capitalizedStringWithLocale] [:id :id]]
[:selector [1 :stringByTrimmingCharactersInSet] [:id :id]]
[:selector [3 :stringByPaddingToLength :withString :startingAtIndex] [:id :unsigned-int :id :unsigned-int]]
;;FIXME: NSUInteger * in getLineStart:end:contentsEnd:forRange:
[:selector [1 :lineRangeForRange] [UIKit/NSRange UIKit/NSRange]]
;;FIXME: NSUInteger * in getParagraphStart:end:contentsEnd:forRange:
[:selector [1 :paragraphRangeForRange] [UIKit/NSRange UIKit/NSRange]]
[:enum NSStringEnumerationByLines NSStringEnumerationByParagraphs NSStringEnumerationByComposedCharacterSequences NSStringEnumerationByWords NSStringEnumerationBySentences NSStringEnumerationReverse NSStringEnumerationSubstringNotRequired NSStringEnumerationLocalized NSStringEnumerationOptions]
;;FIXME: void (^)(NSString *, NSRange, NSRange, BOOL *) in enumerateSubstringsInRange:options:usingBlock:
;;FIXME: void (^)(NSString *, BOOL *) in enumerateLinesUsingBlock:
[:selector [0 :description] [:id]]
[:selector [0 :hash] [:unsigned-int]]
[:selector [0 :fastestEncoding] [:unsigned-int]]
[:selector [0 :smallestEncoding] [:unsigned-int]]
[:selector [2 :dataUsingEncoding :allowLossyConversion] [:id :unsigned-int Boolean]]
[:selector [1 :dataUsingEncoding] [:id :unsigned-int]]
[:selector [1 :canBeConvertedToEncoding] [Boolean :unsigned-int]]
[:selector [1 :cStringUsingEncoding] [:c-string-const :unsigned-int]]
;;FIXME: char * in getCString:maxLength:encoding:
;;FIXME: void * in getBytes:maxLength:usedLength:encoding:options:range:remainingRange:
[:selector [1 :maximumLengthOfBytesUsingEncoding] [:unsigned-int :unsigned-int]]
[:selector [1 :lengthOfBytesUsingEncoding] [:unsigned-int :unsigned-int]]
[:selector [0 :decomposedStringWithCanonicalMapping] [:id]]
[:selector [0 :precomposedStringWithCanonicalMapping] [:id]]
[:selector [0 :decomposedStringWithCompatibilityMapping] [:id]]
[:selector [0 :precomposedStringWithCompatibilityMapping] [:id]]
[:selector [2 :stringByFoldingWithOptions :locale] [:id UIKit/NSStringCompareOptions :id]]
[:selector [4 :stringByReplacingOccurrencesOfString :withString :options :range] [:id :id :id UIKit/NSStringCompareOptions UIKit/NSRange]]
[:selector [2 :stringByReplacingOccurrencesOfString :withString] [:id :id :id]]
[:selector [2 :stringByReplacingCharactersInRange :withString] [:id UIKit/NSRange :id]]
[:selector [0 :UTF8String] [:c-string-const]]
[:selector [0 :defaultCStringEncoding] [:unsigned-int]]
;;FIXME: const NSStringEncoding * in availableStringEncodings
[:selector [1 :localizedNameOfStringEncoding] [:id :unsigned-int]]
[:selector [0 :init] [:id]]
;;FIXME: unichar * in initWithCharactersNoCopy:length:freeWhenDone:
;;FIXME: const unichar * in initWithCharacters:length:
[:selector [1 :initWithUTF8String] [:id :c-string-const]]
[:selector [1 :initWithString] [:id :id]]
;;FIXME: variadic initWithFormat:
;;FIXME: va_list in initWithFormat:arguments:
;;FIXME: variadic initWithFormat:locale:
;;FIXME: va_list in initWithFormat:locale:arguments:
[:selector [2 :initWithData :encoding] [:id :id :unsigned-int]]
;;FIXME: const void * in initWithBytes:length:encoding:
;;FIXME: void * in initWithBytesNoCopy:length:encoding:freeWhenDone:
[:selector [0 :string] [:id]]
[:selector [1 :stringWithString] [:id :id]]
;;FIXME: const unichar * in stringWithCharacters:length:
[:selector [1 :stringWithUTF8String] [:id :c-string-const]]
;;FIXME: variadic stringWithFormat:
;;FIXME: variadic localizedStringWithFormat:
[:selector [2 :initWithCString :encoding] [:id :c-string-const :unsigned-int]]
[:selector [2 :stringWithCString :encoding] [:id :c-string-const :unsigned-int]]
;;FIXME: NSError ** in initWithContentsOfURL:encoding:error:
;;FIXME: NSError ** in initWithContentsOfFile:encoding:error:
;;FIXME: NSError ** in stringWithContentsOfURL:encoding:error:
;;FIXME: NSError ** in stringWithContentsOfFile:encoding:error:
;;FIXME: NSStringEncoding * in initWithContentsOfURL:usedEncoding:error:
;;FIXME: NSStringEncoding * in initWithContentsOfFile:usedEncoding:error:
;;FIXME: NSStringEncoding * in stringWithContentsOfURL:usedEncoding:error:
;;FIXME: NSStringEncoding * in stringWithContentsOfFile:usedEncoding:error:
;;FIXME: NSError ** in writeToURL:atomically:encoding:error:
;;FIXME: NSError ** in writeToFile:atomically:encoding:error:
[:selector [2 :replaceCharactersInRange :withString] [:void UIKit/NSRange :id]]
[:selector [2 :insertString :atIndex] [:void :id :unsigned-int]]
[:selector [1 :deleteCharactersInRange] [:void UIKit/NSRange]]
[:selector [1 :appendString] [:void :id]]
;;FIXME: variadic appendFormat:
[:selector [1 :setString] [:void :id]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
[:selector [1 :stringWithCapacity] [:id :unsigned-int]]
[:selector [4 :replaceOccurrencesOfString :withString :options :range] [:unsigned-int :id :id UIKit/NSStringCompareOptions UIKit/NSRange]]
[:selector [0 :propertyList] [:id]]
[:selector [0 :propertyListFromStringsFileFormat] [:id]]
[:selector [0 :cString] [:c-string-const]]
[:selector [0 :lossyCString] [:c-string-const]]
[:selector [0 :cStringLength] [:unsigned-int]]
;;FIXME: char * in getCString:
;;FIXME: char * in getCString:maxLength:
;;FIXME: char * in getCString:maxLength:range:remainingRange:
[:selector [2 :writeToFile :atomically] [Boolean :id Boolean]]
[:selector [2 :writeToURL :atomically] [Boolean :id Boolean]]
[:selector [1 :initWithContentsOfFile] [:id :id]]
[:selector [1 :initWithContentsOfURL] [:id :id]]
[:selector [1 :stringWithContentsOfFile] [:id :id]]
[:selector [1 :stringWithContentsOfURL] [:id :id]]
;;FIXME: char * in initWithCStringNoCopy:length:freeWhenDone:
[:selector [2 :initWithCString :length] [:id :c-string-const :unsigned-int]]
[:selector [1 :initWithCString] [:id :c-string-const]]
[:selector [2 :stringWithCString :length] [:id :c-string-const :unsigned-int]]
[:selector [1 :stringWithCString] [:id :c-string-const]]
;;FIXME: unichar * in getCharacters:
[:enum NSProprietaryStringEncoding nil]
[:enum NSOpenStepUnicodeReservedBase nil]
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
[:selector [1 :characterSetWithRange] [:id UIKit/NSRange]]
[:selector [1 :characterSetWithCharactersInString] [:id :id]]
[:selector [1 :characterSetWithBitmapRepresentation] [:id :id]]
[:selector [1 :characterSetWithContentsOfFile] [:id :id]]
[:selector [1 :characterIsMember] [Boolean :unsigned-short]]
[:selector [0 :bitmapRepresentation] [:id]]
[:selector [0 :invertedSet] [:id]]
[:selector [1 :longCharacterIsMember] [Boolean :unsigned-long]]
[:selector [1 :isSupersetOfSet] [Boolean :id]]
[:selector [1 :hasMemberInPlane] [Boolean :unsigned-char]]
[:selector [1 :addCharactersInRange] [:void UIKit/NSRange]]
[:selector [1 :removeCharactersInRange] [:void UIKit/NSRange]]
[:selector [1 :addCharactersInString] [:void :id]]
[:selector [1 :removeCharactersInString] [:void :id]]
[:selector [1 :formUnionWithCharacterSet] [:void :id]]
[:selector [1 :formIntersectionWithCharacterSet] [:void :id]]
[:selector [0 :invert] [:void]]
;;FIXME: const void * in encodeValueOfObjCType:at:
[:selector [1 :encodeDataObject] [:void :id]]
;;FIXME: void * in decodeValueOfObjCType:at:
[:selector [0 :decodeDataObject] [:id]]
[:selector [1 :versionForClassName] [:int :id]]
[:selector [1 :encodeObject] [:void :id]]
[:selector [1 :encodeRootObject] [:void :id]]
[:selector [1 :encodeBycopyObject] [:void :id]]
[:selector [1 :encodeByrefObject] [:void :id]]
[:selector [1 :encodeConditionalObject] [:void :id]]
;;FIXME: variadic encodeValuesOfObjCTypes:
;;FIXME: const void * in encodeArrayOfObjCType:count:at:
;;FIXME: const void * in encodeBytes:length:
[:selector [0 :decodeObject] [:id]]
;;FIXME: variadic decodeValuesOfObjCTypes:
;;FIXME: void * in decodeArrayOfObjCType:count:at:
;;FIXME: void * in decodeBytesWithReturnedLength:
;;FIXME: NSZone * in setObjectZone:
;;FIXME: NSZone * in objectZone
[:selector [0 :systemVersion] [:unsigned-int]]
[:selector [0 :allowsKeyedCoding] [Boolean]]
[:selector [2 :encodeObject :forKey] [:void :id :id]]
[:selector [2 :encodeConditionalObject :forKey] [:void :id :id]]
[:selector [2 :encodeBool :forKey] [:void Boolean :id]]
[:selector [2 :encodeInt :forKey] [:void :int :id]]
[:selector [2 :encodeInt32 :forKey] [:void :int :id]]
[:selector [2 :encodeInt64 :forKey] [:void :long-long :id]]
[:selector [2 :encodeFloat :forKey] [:void :float :id]]
[:selector [2 :encodeDouble :forKey] [:void :double :id]]
;;FIXME: const uint8_t * in encodeBytes:length:forKey:
[:selector [1 :containsValueForKey] [Boolean :id]]
[:selector [1 :decodeObjectForKey] [:id :id]]
[:selector [1 :decodeBoolForKey] [Boolean :id]]
[:selector [1 :decodeIntForKey] [:int :id]]
[:selector [1 :decodeInt32ForKey] [:int :id]]
[:selector [1 :decodeInt64ForKey] [:long-long :id]]
[:selector [1 :decodeFloatForKey] [:float :id]]
[:selector [1 :decodeDoubleForKey] [:double :id]]
;;FIXME: const uint8_t * in decodeBytesForKey:returnedLength:
[:selector [2 :encodeInteger :forKey] [:void :int :id]]
[:selector [1 :decodeIntegerForKey] [:int :id]]
[:selector [0 :requiresSecureCoding] [Boolean]]
[:selector [2 :decodeObjectOfClass :forKey] [:id :id :id]]
[:selector [2 :decodeObjectOfClasses :forKey] [:id :id :id]]
[:selector [1 :decodePropertyListForKey] [:id :id]]
[:selector [0 :allowedClasses] [:id]]
[:enum NSDataReadingMappedIfSafe NSDataReadingUncached NSDataReadingMappedAlways NSDataReadingMapped NSMappedRead NSUncachedRead NSDataReadingOptions]
[:enum NSDataWritingAtomic NSDataWritingWithoutOverwriting NSDataWritingFileProtectionNone NSDataWritingFileProtectionComplete NSDataWritingFileProtectionCompleteUnlessOpen NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication NSDataWritingFileProtectionMask NSAtomicWrite NSDataWritingOptions]
[:enum NSDataSearchBackwards NSDataSearchAnchored NSDataSearchOptions]
[:selector [0 :length] [:unsigned-int]]
;;FIXME: const void * in bytes
[:selector [0 :description] [:id]]
;;FIXME: void * in getBytes:length:
;;FIXME: void * in getBytes:range:
[:selector [1 :isEqualToData] [Boolean :id]]
[:selector [1 :subdataWithRange] [:id UIKit/NSRange]]
[:selector [2 :writeToFile :atomically] [Boolean :id Boolean]]
[:selector [2 :writeToURL :atomically] [Boolean :id Boolean]]
;;FIXME: NSError ** in writeToFile:options:error:
;;FIXME: NSError ** in writeToURL:options:error:
[:selector [3 :rangeOfData :options :range] [UIKit/NSRange :id UIKit/NSDataSearchOptions UIKit/NSRange]]
[:selector [0 :data] [:id]]
;;FIXME: const void * in dataWithBytes:length:
;;FIXME: void * in dataWithBytesNoCopy:length:
;;FIXME: void * in dataWithBytesNoCopy:length:freeWhenDone:
;;FIXME: NSError ** in dataWithContentsOfFile:options:error:
;;FIXME: NSError ** in dataWithContentsOfURL:options:error:
[:selector [1 :dataWithContentsOfFile] [:id :id]]
[:selector [1 :dataWithContentsOfURL] [:id :id]]
;;FIXME: const void * in initWithBytes:length:
;;FIXME: void * in initWithBytesNoCopy:length:
;;FIXME: void * in initWithBytesNoCopy:length:freeWhenDone:
;;FIXME: NSError ** in initWithContentsOfFile:options:error:
;;FIXME: NSError ** in initWithContentsOfURL:options:error:
[:selector [1 :initWithContentsOfFile] [:id :id]]
[:selector [1 :initWithContentsOfURL] [:id :id]]
[:selector [1 :initWithData] [:id :id]]
[:selector [1 :dataWithData] [:id :id]]
;;FIXME: void * in getBytes:
[:selector [1 :dataWithContentsOfMappedFile] [:id :id]]
[:selector [1 :initWithContentsOfMappedFile] [:id :id]]
;;FIXME: void * in mutableBytes
[:selector [1 :setLength] [:void :unsigned-int]]
;;FIXME: const void * in appendBytes:length:
[:selector [1 :appendData] [:void :id]]
[:selector [1 :increaseLengthBy] [:void :unsigned-int]]
;;FIXME: const void * in replaceBytesInRange:withBytes:
[:selector [1 :resetBytesInRange] [:void UIKit/NSRange]]
[:selector [1 :setData] [:void :id]]
;;FIXME: const void * in replaceBytesInRange:withBytes:length:
[:selector [1 :dataWithCapacity] [:id :unsigned-int]]
[:selector [1 :dataWithLength] [:id :unsigned-int]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithLength] [:id :unsigned-int]]
[:selector [1 :stringForObjectValue] [:id :id]]
[:selector [2 :attributedStringForObjectValue :withDefaultAttributes] [:id :id :id]]
[:selector [1 :editingStringForObjectValue] [:id :id]]
;;FIXME: id * in getObjectValue:forString:errorDescription:
;;FIXME: NSString ** in isPartialStringValid:newEditingString:errorDescription:
;;FIXME: NSString ** in isPartialStringValid:proposedSelectedRange:originalString:originalSelectedRange:errorDescription:
;;FIXME: id * in getObjectValue:forString:range:error:
[:selector [1 :stringFromDate] [:id :id]]
[:selector [1 :dateFromString] [:id :id]]
[:enum NSDateFormatterNoStyle NSDateFormatterShortStyle NSDateFormatterMediumStyle NSDateFormatterLongStyle NSDateFormatterFullStyle NSDateFormatterBehavior]
[:enum NSDateFormatterBehaviorDefault NSDateFormatterBehavior10_4 NSDateFormatterBehavior]
[:selector [3 :localizedStringFromDate :dateStyle :timeStyle] [:id :id UIKit/NSDateFormatterStyle UIKit/NSDateFormatterStyle]]
[:selector [3 :dateFormatFromTemplate :options :locale] [:id :id :unsigned-int :id]]
[:selector [0 :dateFormat] [:id]]
[:selector [0 :dateStyle] [UIKit/NSDateFormatterStyle]]
[:selector [1 :setDateStyle] [:void UIKit/NSDateFormatterStyle]]
[:selector [0 :timeStyle] [UIKit/NSDateFormatterStyle]]
[:selector [1 :setTimeStyle] [:void UIKit/NSDateFormatterStyle]]
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :generatesCalendarDates] [Boolean]]
[:selector [1 :setGeneratesCalendarDates] [:void Boolean]]
[:selector [0 :formatterBehavior] [UIKit/NSDateFormatterBehavior]]
[:selector [1 :setFormatterBehavior] [:void UIKit/NSDateFormatterBehavior]]
[:selector [0 :defaultFormatterBehavior] [UIKit/NSDateFormatterBehavior]]
[:selector [1 :setDefaultFormatterBehavior] [:void UIKit/NSDateFormatterBehavior]]
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
[:enum NSRoundPlain NSRoundDown NSRoundUp NSRoundBankers NSRoundingMode]
[:enum NSCalculationNoError NSCalculationLossOfPrecision NSCalculationUnderflow NSCalculationOverflow NSCalculationDivideByZero NSCalculationError]
[:compound NSDecimal "sizeof (NSDecimal)"]
;;FIXME: const NSDecimal * in NSDecimalIsNotANumber
;;FIXME: NSDecimal * in NSDecimalCopy
;;FIXME: NSDecimal * in NSDecimalCompact
;;FIXME: const NSDecimal * in NSDecimalCompare
;;FIXME: NSDecimal * in NSDecimalRound
;;FIXME: NSDecimal * in NSDecimalNormalize
;;FIXME: NSDecimal * in NSDecimalAdd
;;FIXME: NSDecimal * in NSDecimalSubtract
;;FIXME: NSDecimal * in NSDecimalMultiply
;;FIXME: NSDecimal * in NSDecimalDivide
;;FIXME: NSDecimal * in NSDecimalPower
;;FIXME: NSDecimal * in NSDecimalMultiplyByPowerOf10
;;FIXME: const NSDecimal * in NSDecimalString
[:selector [0 :string] [:id]]
[:selector [0 :scanLocation] [:unsigned-int]]
[:selector [1 :setScanLocation] [:void :unsigned-int]]
[:selector [1 :setCharactersToBeSkipped] [:void :id]]
[:selector [1 :setCaseSensitive] [:void Boolean]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :charactersToBeSkipped] [:id]]
[:selector [0 :caseSensitive] [Boolean]]
[:selector [0 :locale] [:id]]
;;FIXME: int * in scanInt:
;;FIXME: NSInteger * in scanInteger:
;;FIXME: unsigned long long * in scanHexLongLong:
;;FIXME: float * in scanHexFloat:
;;FIXME: double * in scanHexDouble:
;;FIXME: unsigned int * in scanHexInt:
;;FIXME: long long * in scanLongLong:
;;FIXME: float * in scanFloat:
;;FIXME: double * in scanDouble:
;;FIXME: NSString ** in scanString:intoString:
;;FIXME: NSString ** in scanCharactersFromSet:intoString:
;;FIXME: NSString ** in scanUpToString:intoString:
;;FIXME: NSString ** in scanUpToCharactersFromSet:intoString:
[:selector [0 :isAtEnd] [Boolean]]
[:selector [1 :initWithString] [:id :id]]
[:selector [1 :scannerWithString] [:id :id]]
[:selector [1 :localizedScannerWithString] [:id :id]]
[:selector [0 :count] [:unsigned-int]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [0 :keyEnumerator] [:id]]
[:selector [0 :allKeys] [:id]]
[:selector [1 :allKeysForObject] [:id :id]]
[:selector [0 :allValues] [:id]]
[:selector [0 :description] [:id]]
[:selector [0 :descriptionInStringsFileFormat] [:id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [2 :descriptionWithLocale :indent] [:id :id :unsigned-int]]
[:selector [1 :isEqualToDictionary] [Boolean :id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [2 :objectsForKeys :notFoundMarker] [:id :id :id]]
[:selector [2 :writeToFile :atomically] [Boolean :id Boolean]]
[:selector [2 :writeToURL :atomically] [Boolean :id Boolean]]
[:selector [1 :keysSortedByValueUsingSelector] [:id :selector]]
;;FIXME: id [] in getObjects:andKeys:
[:selector [1 :objectForKeyedSubscript] [:id :id]]
;;FIXME: void (^)(id, id, BOOL *) in enumerateKeysAndObjectsUsingBlock:
;;FIXME: void (^)(id, id, BOOL *) in enumerateKeysAndObjectsWithOptions:usingBlock:
;;FIXME: NSComparator in keysSortedByValueUsingComparator:
;;FIXME: NSComparator in keysSortedByValueWithOptions:usingComparator:
;;FIXME: BOOL (^)(id, id, BOOL *) in keysOfEntriesPassingTest:
;;FIXME: BOOL (^)(id, id, BOOL *) in keysOfEntriesWithOptions:passingTest:
[:selector [0 :dictionary] [:id]]
[:selector [2 :dictionaryWithObject :forKey] [:id :id :id]]
;;FIXME: const id [] in dictionaryWithObjects:forKeys:count:
;;FIXME: variadic dictionaryWithObjectsAndKeys:
[:selector [1 :dictionaryWithDictionary] [:id :id]]
[:selector [2 :dictionaryWithObjects :forKeys] [:id :id :id]]
;;FIXME: const id [] in initWithObjects:forKeys:count:
;;FIXME: variadic initWithObjectsAndKeys:
[:selector [1 :initWithDictionary] [:id :id]]
[:selector [2 :initWithDictionary :copyItems] [:id :id Boolean]]
[:selector [2 :initWithObjects :forKeys] [:id :id :id]]
[:selector [1 :dictionaryWithContentsOfFile] [:id :id]]
[:selector [1 :dictionaryWithContentsOfURL] [:id :id]]
[:selector [1 :initWithContentsOfFile] [:id :id]]
[:selector [1 :initWithContentsOfURL] [:id :id]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [1 :addEntriesFromDictionary] [:void :id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [1 :removeObjectsForKeys] [:void :id]]
[:selector [1 :setDictionary] [:void :id]]
[:selector [2 :setObject :forKeyedSubscript] [:void :id :id]]
[:selector [1 :dictionaryWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
[:selector [1 :sharedKeySetForKeys] [:id :id]]
[:selector [1 :dictionaryWithSharedKeySet] [:id :id]]
[:selector [3 :initWithMantissa :exponent :isNegative] [:id :unsigned-long-long :short Boolean]]
[:selector [1 :initWithDecimal] [:id UIKit/NSDecimal]]
[:selector [1 :initWithString] [:id :id]]
[:selector [2 :initWithString :locale] [:id :id :id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [0 :decimalValue] [UIKit/NSDecimal]]
[:selector [3 :decimalNumberWithMantissa :exponent :isNegative] [:id :unsigned-long-long :short Boolean]]
[:selector [1 :decimalNumberWithDecimal] [:id UIKit/NSDecimal]]
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
[:selector [1 :decimalNumberByRaisingToPower] [:id :unsigned-int]]
[:selector [2 :decimalNumberByRaisingToPower :withBehavior] [:id :unsigned-int :id]]
[:selector [1 :decimalNumberByMultiplyingByPowerOf10] [:id :short]]
[:selector [2 :decimalNumberByMultiplyingByPowerOf10 :withBehavior] [:id :short :id]]
[:selector [1 :decimalNumberByRoundingAccordingToBehavior] [:id :id]]
[:selector [1 :compare] [UIKit/NSComparisonResult :id]]
[:selector [1 :setDefaultBehavior] [:void :id]]
[:selector [0 :defaultBehavior] [:id]]
[:selector [0 :objCType] [:c-string-const]]
[:selector [0 :doubleValue] [:double]]
[:selector [0 :defaultDecimalNumberHandler] [:id]]
[:selector [6 :initWithRoundingMode :scale :raiseOnExactness :raiseOnOverflow :raiseOnUnderflow :raiseOnDivideByZero] [:id UIKit/NSRoundingMode :short Boolean Boolean Boolean Boolean]]
[:selector [6 :decimalNumberHandlerWithRoundingMode :scale :raiseOnExactness :raiseOnOverflow :raiseOnUnderflow :raiseOnDivideByZero] [:id UIKit/NSRoundingMode :short Boolean Boolean Boolean Boolean]]
[:selector [0 :decimalValue] [UIKit/NSDecimal]]
;;FIXME: NSDecimal * in scanDecimal:
[:selector [3 :initWithDomain :code :userInfo] [:id :id :int :id]]
[:selector [3 :errorWithDomain :code :userInfo] [:id :id :int :id]]
[:selector [0 :domain] [:id]]
[:selector [0 :code] [:int]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :localizedDescription] [:id]]
[:selector [0 :localizedFailureReason] [:id]]
[:selector [0 :localizedRecoverySuggestion] [:id]]
[:selector [0 :localizedRecoveryOptions] [:id]]
[:selector [0 :recoveryAttempter] [:id]]
[:selector [0 :helpAnchor] [:id]]
;;FIXME: void * in attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:
[:selector [2 :attemptRecoveryFromError :optionIndex] [Boolean :id :unsigned-int]]
[:selector [3 :exceptionWithName :reason :userInfo] [:id :id :id :id]]
[:selector [3 :initWithName :reason :userInfo] [:id :id :id :id]]
[:selector [0 :name] [:id]]
[:selector [0 :reason] [:id]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :callStackReturnAddresses] [:id]]
[:selector [0 :callStackSymbols] [:id]]
[:selector [0 :raise] [:void]]
;;FIXME: variadic raise:format:
;;FIXME: va_list in raise:format:arguments:
;;FIXME: NSUncaughtExceptionHandler * in NSGetUncaughtExceptionHandler
;;FIXME: NSUncaughtExceptionHandler * in NSSetUncaughtExceptionHandler
[:selector [0 :currentHandler] [:id]]
;;FIXME: variadic handleFailureInMethod:object:file:lineNumber:description:
;;FIXME: variadic handleFailureInFunction:file:lineNumber:description:
[:selector [0 :availableData] [:id]]
[:selector [0 :readDataToEndOfFile] [:id]]
[:selector [1 :readDataOfLength] [:id :unsigned-int]]
[:selector [1 :writeData] [:void :id]]
[:selector [0 :offsetInFile] [:unsigned-long-long]]
[:selector [0 :seekToEndOfFile] [:unsigned-long-long]]
[:selector [1 :seekToFileOffset] [:void :unsigned-long-long]]
[:selector [1 :truncateFileAtOffset] [:void :unsigned-long-long]]
[:selector [0 :synchronizeFile] [:void]]
[:selector [0 :closeFile] [:void]]
[:selector [0 :fileHandleWithStandardInput] [:id]]
[:selector [0 :fileHandleWithStandardOutput] [:id]]
[:selector [0 :fileHandleWithStandardError] [:id]]
[:selector [0 :fileHandleWithNullDevice] [:id]]
[:selector [1 :fileHandleForReadingAtPath] [:id :id]]
[:selector [1 :fileHandleForWritingAtPath] [:id :id]]
[:selector [1 :fileHandleForUpdatingAtPath] [:id :id]]
;;FIXME: NSError ** in fileHandleForReadingFromURL:error:
;;FIXME: NSError ** in fileHandleForWritingToURL:error:
;;FIXME: NSError ** in fileHandleForUpdatingURL:error:
[:selector [1 :readInBackgroundAndNotifyForModes] [:void :id]]
[:selector [0 :readInBackgroundAndNotify] [:void]]
[:selector [1 :readToEndOfFileInBackgroundAndNotifyForModes] [:void :id]]
[:selector [0 :readToEndOfFileInBackgroundAndNotify] [:void]]
[:selector [1 :acceptConnectionInBackgroundAndNotifyForModes] [:void :id]]
[:selector [0 :acceptConnectionInBackgroundAndNotify] [:void]]
[:selector [1 :waitForDataInBackgroundAndNotifyForModes] [:void :id]]
[:selector [0 :waitForDataInBackgroundAndNotify] [:void]]
;;FIXME: void (^)(NSFileHandle *) in readabilityHandler
;;FIXME: void (^)(NSFileHandle *) in setReadabilityHandler:
;;FIXME: void (^)(NSFileHandle *) in writeabilityHandler
;;FIXME: void (^)(NSFileHandle *) in setWriteabilityHandler:
[:selector [2 :initWithFileDescriptor :closeOnDealloc] [:id :int Boolean]]
[:selector [1 :initWithFileDescriptor] [:id :int]]
[:selector [0 :fileDescriptor] [:int]]
[:selector [0 :fileHandleForReading] [:id]]
[:selector [0 :fileHandleForWriting] [:id]]
[:selector [0 :init] [:id]]
[:selector [0 :pipe] [:id]]
[:selector [1 :pathWithComponents] [:id :id]]
[:selector [0 :pathComponents] [:id]]
[:selector [0 :isAbsolutePath] [Boolean]]
[:selector [0 :lastPathComponent] [:id]]
[:selector [0 :stringByDeletingLastPathComponent] [:id]]
[:selector [1 :stringByAppendingPathComponent] [:id :id]]
[:selector [0 :pathExtension] [:id]]
[:selector [0 :stringByDeletingPathExtension] [:id]]
[:selector [1 :stringByAppendingPathExtension] [:id :id]]
[:selector [0 :stringByAbbreviatingWithTildeInPath] [:id]]
[:selector [0 :stringByExpandingTildeInPath] [:id]]
[:selector [0 :stringByStandardizingPath] [:id]]
[:selector [0 :stringByResolvingSymlinksInPath] [:id]]
[:selector [1 :stringsByAppendingPaths] [:id :id]]
;;FIXME: NSString ** in completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:
[:selector [0 :fileSystemRepresentation] [:c-string-const]]
;;FIXME: char * in getFileSystemRepresentation:maxLength:
[:selector [1 :pathsMatchingExtensions] [:id :id]]
[:function NSUserName [:id]]
[:function NSFullUserName [:id]]
[:function NSHomeDirectory [:id]]
[:function NSHomeDirectoryForUser [:id :id]]
[:function NSTemporaryDirectory [:id]]
[:function NSOpenStepRootDirectory [:id]]
[:enum NSApplicationDirectory NSDemoApplicationDirectory NSDeveloperApplicationDirectory NSAdminApplicationDirectory NSLibraryDirectory NSDeveloperDirectory NSUserDirectory NSDocumentationDirectory NSDocumentDirectory NSCoreServiceDirectory NSAutosavedInformationDirectory NSDesktopDirectory NSCachesDirectory NSApplicationSupportDirectory NSDownloadsDirectory NSInputMethodsDirectory NSMoviesDirectory NSMusicDirectory NSPicturesDirectory NSPrinterDescriptionDirectory NSSharedPublicDirectory NSPreferencePanesDirectory NSApplicationScriptsDirectory NSItemReplacementDirectory NSAllApplicationsDirectory NSAllLibrariesDirectory NSTrashDirectory NSSearchPathDirectory]
[:enum NSUserDomainMask NSLocalDomainMask NSNetworkDomainMask NSSystemDomainMask NSAllDomainsMask NSSearchPathDomainMask]
[:function NSSearchPathForDirectoriesInDomains [:id UIKit/NSSearchPathDirectory UIKit/NSSearchPathDomainMask Boolean]]
[:enum NSVolumeEnumerationSkipHiddenVolumes NSVolumeEnumerationProduceFileReferenceURLs NSVolumeEnumerationOptions]
[:enum NSDirectoryEnumerationSkipsSubdirectoryDescendants NSDirectoryEnumerationSkipsPackageDescendants NSDirectoryEnumerationSkipsHiddenFiles NSDirectoryEnumerationOptions]
[:enum NSFileManagerItemReplacementUsingNewMetadataOnly NSFileManagerItemReplacementWithoutDeletingBackupItem NSFileManagerItemReplacementOptions]
[:selector [0 :defaultManager] [:id]]
[:selector [2 :mountedVolumeURLsIncludingResourceValuesForKeys :options] [:id :id UIKit/NSVolumeEnumerationOptions]]
;;FIXME: NSError ** in contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:
[:selector [2 :URLsForDirectory :inDomains] [:id UIKit/NSSearchPathDirectory UIKit/NSSearchPathDomainMask]]
;;FIXME: NSError ** in URLForDirectory:inDomain:appropriateForURL:create:error:
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
;;FIXME: BOOL (^)(NSURL *, NSError *) in enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:
[:selector [1 :subpathsAtPath] [:id :id]]
[:selector [1 :contentsAtPath] [:id :id]]
[:selector [3 :createFileAtPath :contents :attributes] [Boolean :id :id :id]]
[:selector [1 :fileSystemRepresentationWithPath] [:c-string-const :id]]
[:selector [2 :stringWithFileSystemRepresentation :length] [:id :c-string-const :unsigned-int]]
;;FIXME: NSURL ** in replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:
;;FIXME: NSError ** in setUbiquitous:itemAtURL:destinationURL:error:
[:selector [1 :isUbiquitousItemAtURL] [Boolean :id]]
;;FIXME: NSError ** in startDownloadingUbiquitousItemAtURL:error:
;;FIXME: NSError ** in evictUbiquitousItemAtURL:error:
[:selector [1 :URLForUbiquityContainerIdentifier] [:id :id]]
;;FIXME: NSDate ** in URLForPublishingUbiquitousItemAtURL:expirationDate:error:
[:selector [0 :ubiquityIdentityToken] [:id]]
[:selector [2 :fileManager :shouldProceedAfterError] [Boolean :id :id]]
[:selector [2 :fileManager :willProcessPath] [:void :id :id]]
[:selector [0 :fileAttributes] [:id]]
[:selector [0 :directoryAttributes] [:id]]
[:selector [0 :skipDescendents] [:void]]
[:selector [0 :level] [:unsigned-int]]
[:selector [0 :skipDescendants] [:void]]
[:selector [0 :fileSize] [:unsigned-long-long]]
[:selector [0 :fileModificationDate] [:id]]
[:selector [0 :fileType] [:id]]
[:selector [0 :filePosixPermissions] [:unsigned-int]]
[:selector [0 :fileOwnerAccountName] [:id]]
[:selector [0 :fileGroupOwnerAccountName] [:id]]
[:selector [0 :fileSystemNumber] [:int]]
[:selector [0 :fileSystemFileNumber] [:unsigned-int]]
[:selector [0 :fileExtensionHidden] [Boolean]]
[:selector [0 :fileHFSCreatorCode] [:unsigned-long]]
[:selector [0 :fileHFSTypeCode] [:unsigned-long]]
[:selector [0 :fileIsImmutable] [Boolean]]
[:selector [0 :fileIsAppendOnly] [Boolean]]
[:selector [0 :fileCreationDate] [:id]]
[:selector [0 :fileOwnerAccountID] [:id]]
[:selector [0 :fileGroupOwnerAccountID] [:id]]
[:enum NSPointerFunctionsStrongMemory NSPointerFunctionsOpaqueMemory NSPointerFunctionsMallocMemory NSPointerFunctionsMachVirtualMemory NSPointerFunctionsWeakMemory NSPointerFunctionsObjectPersonality NSPointerFunctionsOpaquePersonality NSPointerFunctionsObjectPointerPersonality NSPointerFunctionsCStringPersonality NSPointerFunctionsStructPersonality NSPointerFunctionsIntegerPersonality NSPointerFunctionsCopyIn nil]
[:selector [1 :initWithOptions] [:id :unsigned-int]]
[:selector [1 :pointerFunctionsWithOptions] [:id :unsigned-int]]
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
[:enum NSHashTableStrongMemory NSHashTableCopyIn NSHashTableObjectPointerPersonality NSHashTableWeakMemory nil]
[:selector [2 :initWithOptions :capacity] [:id :unsigned-int :unsigned-int]]
[:selector [2 :initWithPointerFunctions :capacity] [:id :id :unsigned-int]]
[:selector [1 :hashTableWithOptions] [:id :unsigned-int]]
[:selector [0 :weakObjectsHashTable] [:id]]
[:selector [0 :pointerFunctions] [:id]]
[:selector [0 :count] [:unsigned-int]]
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
[:selector [1 :initWithProperties] [:id :id]]
[:selector [1 :cookieWithProperties] [:id :id]]
[:selector [1 :requestHeaderFieldsWithCookies] [:id :id]]
[:selector [2 :cookiesWithResponseHeaderFields :forURL] [:id :id :id]]
[:selector [0 :properties] [:id]]
[:selector [0 :version] [:unsigned-int]]
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
[:enum NSHTTPCookieAcceptPolicyAlways NSHTTPCookieAcceptPolicyNever NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain NSHTTPCookieAcceptPolicy]
[:selector [0 :sharedHTTPCookieStorage] [:id]]
[:selector [0 :cookies] [:id]]
[:selector [1 :setCookie] [:void :id]]
[:selector [1 :deleteCookie] [:void :id]]
[:selector [1 :cookiesForURL] [:id :id]]
[:selector [3 :setCookies :forURL :mainDocumentURL] [:void :id :id :id]]
[:selector [0 :cookieAcceptPolicy] [UIKit/NSHTTPCookieAcceptPolicy]]
[:selector [1 :setCookieAcceptPolicy] [:void UIKit/NSHTTPCookieAcceptPolicy]]
[:selector [1 :sortedCookiesUsingDescriptors] [:id :id]]
[:selector [1 :indexPathWithIndex] [:id :unsigned-int]]
;;FIXME: const NSUInteger [] in indexPathWithIndexes:length:
[:selector [1 :initWithIndex] [:id :unsigned-int]]
;;FIXME: const NSUInteger [] in initWithIndexes:length:
[:selector [1 :indexPathByAddingIndex] [:id :unsigned-int]]
[:selector [0 :indexPathByRemovingLastIndex] [:id]]
[:selector [1 :indexAtPosition] [:unsigned-int :unsigned-int]]
[:selector [0 :length] [:unsigned-int]]
;;FIXME: NSUInteger * in getIndexes:
[:selector [1 :compare] [UIKit/NSComparisonResult :id]]
[:selector [0 :indexSet] [:id]]
[:selector [1 :indexSetWithIndex] [:id :unsigned-int]]
[:selector [1 :indexSetWithIndexesInRange] [:id UIKit/NSRange]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithIndex] [:id :unsigned-int]]
[:selector [1 :initWithIndexesInRange] [:id UIKit/NSRange]]
[:selector [1 :initWithIndexSet] [:id :id]]
[:selector [1 :isEqualToIndexSet] [Boolean :id]]
[:selector [0 :count] [:unsigned-int]]
[:selector [0 :firstIndex] [:unsigned-int]]
[:selector [0 :lastIndex] [:unsigned-int]]
[:selector [1 :indexGreaterThanIndex] [:unsigned-int :unsigned-int]]
[:selector [1 :indexLessThanIndex] [:unsigned-int :unsigned-int]]
[:selector [1 :indexGreaterThanOrEqualToIndex] [:unsigned-int :unsigned-int]]
[:selector [1 :indexLessThanOrEqualToIndex] [:unsigned-int :unsigned-int]]
;;FIXME: NSUInteger * in getIndexes:maxCount:inIndexRange:
[:selector [1 :countOfIndexesInRange] [:unsigned-int UIKit/NSRange]]
[:selector [1 :containsIndex] [Boolean :unsigned-int]]
[:selector [1 :containsIndexesInRange] [Boolean UIKit/NSRange]]
[:selector [1 :containsIndexes] [Boolean :id]]
[:selector [1 :intersectsIndexesInRange] [Boolean UIKit/NSRange]]
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
[:selector [1 :addIndex] [:void :unsigned-int]]
[:selector [1 :removeIndex] [:void :unsigned-int]]
[:selector [1 :addIndexesInRange] [:void UIKit/NSRange]]
[:selector [1 :removeIndexesInRange] [:void UIKit/NSRange]]
[:selector [2 :shiftIndexesStartingAtIndex :by] [:void :unsigned-int :int]]
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
[:enum NSJSONReadingMutableContainers NSJSONReadingMutableLeaves NSJSONReadingAllowFragments NSJSONReadingOptions]
[:enum NSJSONWritingPrettyPrinted NSJSONWritingOptions]
[:selector [1 :isValidJSONObject] [Boolean :id]]
;;FIXME: NSError ** in dataWithJSONObject:options:error:
;;FIXME: NSError ** in JSONObjectWithData:options:error:
;;FIXME: NSError ** in writeJSONObject:toStream:options:error:
;;FIXME: NSError ** in JSONObjectWithStream:options:error:
[:selector [0 :count] [:unsigned-int]]
[:selector [1 :objectAtIndex] [:id :unsigned-int]]
[:selector [1 :indexOfObject] [:unsigned-int :id]]
;;FIXME: id [] in getObjects:range:
[:selector [1 :objectsAtIndexes] [:id :id]]
[:selector [0 :firstObject] [:id]]
[:selector [0 :lastObject] [:id]]
[:selector [1 :isEqualToOrderedSet] [Boolean :id]]
[:selector [1 :containsObject] [Boolean :id]]
[:selector [1 :intersectsOrderedSet] [Boolean :id]]
[:selector [1 :intersectsSet] [Boolean :id]]
[:selector [1 :isSubsetOfOrderedSet] [Boolean :id]]
[:selector [1 :isSubsetOfSet] [Boolean :id]]
[:selector [1 :objectAtIndexedSubscript] [:id :unsigned-int]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [0 :reverseObjectEnumerator] [:id]]
[:selector [0 :reversedOrderedSet] [:id]]
[:selector [0 :array] [:id]]
[:selector [0 :set] [:id]]
;;FIXME: void (^)(id, NSUInteger, BOOL *) in enumerateObjectsUsingBlock:
;;FIXME: void (^)(id, NSUInteger, BOOL *) in enumerateObjectsWithOptions:usingBlock:
;;FIXME: void (^)(id, NSUInteger, BOOL *) in enumerateObjectsAtIndexes:options:usingBlock:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexOfObjectPassingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexOfObjectWithOptions:passingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexOfObjectAtIndexes:options:passingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexesOfObjectsPassingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexesOfObjectsWithOptions:passingTest:
;;FIXME: BOOL (^)(id, NSUInteger, BOOL *) in indexesOfObjectsAtIndexes:options:passingTest:
;;FIXME: NSComparator in indexOfObject:inSortedRange:options:usingComparator:
;;FIXME: NSComparator in sortedArrayUsingComparator:
;;FIXME: NSComparator in sortedArrayWithOptions:usingComparator:
[:selector [0 :description] [:id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [2 :descriptionWithLocale :indent] [:id :id :unsigned-int]]
[:selector [0 :orderedSet] [:id]]
[:selector [1 :orderedSetWithObject] [:id :id]]
;;FIXME: const id [] in orderedSetWithObjects:count:
;;FIXME: variadic orderedSetWithObjects:
[:selector [1 :orderedSetWithOrderedSet] [:id :id]]
[:selector [3 :orderedSetWithOrderedSet :range :copyItems] [:id :id UIKit/NSRange Boolean]]
[:selector [1 :orderedSetWithArray] [:id :id]]
[:selector [3 :orderedSetWithArray :range :copyItems] [:id :id UIKit/NSRange Boolean]]
[:selector [1 :orderedSetWithSet] [:id :id]]
[:selector [2 :orderedSetWithSet :copyItems] [:id :id Boolean]]
[:selector [1 :initWithObject] [:id :id]]
;;FIXME: const id [] in initWithObjects:count:
;;FIXME: variadic initWithObjects:
[:selector [1 :initWithOrderedSet] [:id :id]]
[:selector [2 :initWithOrderedSet :copyItems] [:id :id Boolean]]
[:selector [3 :initWithOrderedSet :range :copyItems] [:id :id UIKit/NSRange Boolean]]
[:selector [1 :initWithArray] [:id :id]]
[:selector [2 :initWithArray :copyItems] [:id :id Boolean]]
[:selector [3 :initWithArray :range :copyItems] [:id :id UIKit/NSRange Boolean]]
[:selector [1 :initWithSet] [:id :id]]
[:selector [2 :initWithSet :copyItems] [:id :id Boolean]]
[:selector [2 :insertObject :atIndex] [:void :id :unsigned-int]]
[:selector [1 :removeObjectAtIndex] [:void :unsigned-int]]
[:selector [2 :replaceObjectAtIndex :withObject] [:void :unsigned-int :id]]
[:selector [1 :addObject] [:void :id]]
;;FIXME: const id [] in addObjects:count:
[:selector [1 :addObjectsFromArray] [:void :id]]
[:selector [2 :exchangeObjectAtIndex :withObjectAtIndex] [:void :unsigned-int :unsigned-int]]
[:selector [2 :moveObjectsAtIndexes :toIndex] [:void :id :unsigned-int]]
[:selector [2 :insertObjects :atIndexes] [:void :id :id]]
[:selector [2 :setObject :atIndex] [:void :id :unsigned-int]]
[:selector [2 :setObject :atIndexedSubscript] [:void :id :unsigned-int]]
;;FIXME: const id [] in replaceObjectsInRange:withObjects:count:
[:selector [2 :replaceObjectsAtIndexes :withObjects] [:void :id :id]]
[:selector [1 :removeObjectsInRange] [:void UIKit/NSRange]]
[:selector [1 :removeObjectsAtIndexes] [:void :id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [1 :removeObject] [:void :id]]
[:selector [1 :removeObjectsInArray] [:void :id]]
[:selector [1 :intersectOrderedSet] [:void :id]]
[:selector [1 :minusOrderedSet] [:void :id]]
[:selector [1 :unionOrderedSet] [:void :id]]
[:selector [1 :intersectSet] [:void :id]]
[:selector [1 :minusSet] [:void :id]]
[:selector [1 :unionSet] [:void :id]]
;;FIXME: NSComparator in sortUsingComparator:
;;FIXME: NSComparator in sortWithOptions:usingComparator:
;;FIXME: NSComparator in sortRange:options:usingComparator:
[:selector [1 :orderedSetWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
[:selector [0 :count] [:unsigned-int]]
[:selector [1 :member] [:id :id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [0 :allObjects] [:id]]
[:selector [0 :anyObject] [:id]]
[:selector [1 :containsObject] [Boolean :id]]
[:selector [0 :description] [:id]]
[:selector [1 :descriptionWithLocale] [:id :id]]
[:selector [1 :intersectsSet] [Boolean :id]]
[:selector [1 :isEqualToSet] [Boolean :id]]
[:selector [1 :isSubsetOfSet] [Boolean :id]]
[:selector [1 :makeObjectsPerformSelector] [:void :selector]]
[:selector [2 :makeObjectsPerformSelector :withObject] [:void :selector :id]]
[:selector [1 :setByAddingObject] [:id :id]]
[:selector [1 :setByAddingObjectsFromSet] [:id :id]]
[:selector [1 :setByAddingObjectsFromArray] [:id :id]]
;;FIXME: void (^)(id, BOOL *) in enumerateObjectsUsingBlock:
;;FIXME: void (^)(id, BOOL *) in enumerateObjectsWithOptions:usingBlock:
;;FIXME: BOOL (^)(id, BOOL *) in objectsPassingTest:
;;FIXME: BOOL (^)(id, BOOL *) in objectsWithOptions:passingTest:
[:selector [0 :set] [:id]]
[:selector [1 :setWithObject] [:id :id]]
;;FIXME: const id [] in setWithObjects:count:
;;FIXME: variadic setWithObjects:
[:selector [1 :setWithSet] [:id :id]]
[:selector [1 :setWithArray] [:id :id]]
;;FIXME: const id [] in initWithObjects:count:
;;FIXME: variadic initWithObjects:
[:selector [1 :initWithSet] [:id :id]]
[:selector [2 :initWithSet :copyItems] [:id :id Boolean]]
[:selector [1 :initWithArray] [:id :id]]
[:selector [1 :addObject] [:void :id]]
[:selector [1 :removeObject] [:void :id]]
[:selector [1 :addObjectsFromArray] [:void :id]]
[:selector [1 :intersectSet] [:void :id]]
[:selector [1 :minusSet] [:void :id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [1 :unionSet] [:void :id]]
[:selector [1 :setSet] [:void :id]]
[:selector [1 :setWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithCapacity] [:id :unsigned-int]]
[:selector [1 :initWithArray] [:id :id]]
[:selector [1 :initWithSet] [:id :id]]
[:selector [1 :countForObject] [:unsigned-int :id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [1 :addObject] [:void :id]]
[:selector [1 :removeObject] [:void :id]]
[:selector [0 :accessInstanceVariablesDirectly] [Boolean]]
[:selector [1 :valueForKey] [:id :id]]
[:selector [2 :setValue :forKey] [:void :id :id]]
;;FIXME: id * in validateValue:forKey:error:
[:selector [1 :mutableArrayValueForKey] [:id :id]]
[:selector [1 :mutableOrderedSetValueForKey] [:id :id]]
[:selector [1 :mutableSetValueForKey] [:id :id]]
[:selector [1 :valueForKeyPath] [:id :id]]
[:selector [2 :setValue :forKeyPath] [:void :id :id]]
;;FIXME: id * in validateValue:forKeyPath:error:
[:selector [1 :mutableArrayValueForKeyPath] [:id :id]]
[:selector [1 :mutableOrderedSetValueForKeyPath] [:id :id]]
[:selector [1 :mutableSetValueForKeyPath] [:id :id]]
[:selector [1 :valueForUndefinedKey] [:id :id]]
[:selector [2 :setValue :forUndefinedKey] [:void :id :id]]
[:selector [1 :setNilValueForKey] [:void :id]]
[:selector [1 :dictionaryWithValuesForKeys] [:id :id]]
[:selector [1 :setValuesForKeysWithDictionary] [:void :id]]
[:selector [1 :valueForKey] [:id :id]]
[:selector [2 :setValue :forKey] [:void :id :id]]
[:selector [1 :valueForKey] [:id :id]]
[:selector [2 :setValue :forKey] [:void :id :id]]
[:selector [1 :valueForKey] [:id :id]]
[:selector [2 :setValue :forKey] [:void :id :id]]
[:selector [1 :valueForKey] [:id :id]]
[:selector [2 :setValue :forKey] [:void :id :id]]
[:enum NSKeyValueObservingOptionNew NSKeyValueObservingOptionOld NSKeyValueObservingOptionInitial NSKeyValueObservingOptionPrior NSKeyValueObservingOptions]
[:enum NSKeyValueChangeSetting NSKeyValueChangeInsertion NSKeyValueChangeRemoval NSKeyValueChangeReplacement NSKeyValueChange]
[:enum NSKeyValueUnionSetMutation NSKeyValueMinusSetMutation NSKeyValueIntersectSetMutation NSKeyValueSetSetMutation NSKeyValueSetMutationKind]
;;FIXME: void * in observeValueForKeyPath:ofObject:change:context:
;;FIXME: void * in addObserver:forKeyPath:options:context:
;;FIXME: void * in removeObserver:forKeyPath:context:
[:selector [2 :removeObserver :forKeyPath] [:void :id :id]]
;;FIXME: void * in addObserver:toObjectsAtIndexes:forKeyPath:options:context:
;;FIXME: void * in removeObserver:fromObjectsAtIndexes:forKeyPath:context:
[:selector [3 :removeObserver :fromObjectsAtIndexes :forKeyPath] [:void :id :id :id]]
;;FIXME: void * in addObserver:forKeyPath:options:context:
;;FIXME: void * in removeObserver:forKeyPath:context:
[:selector [2 :removeObserver :forKeyPath] [:void :id :id]]
;;FIXME: void * in addObserver:forKeyPath:options:context:
;;FIXME: void * in removeObserver:forKeyPath:context:
[:selector [2 :removeObserver :forKeyPath] [:void :id :id]]
;;FIXME: void * in addObserver:forKeyPath:options:context:
;;FIXME: void * in removeObserver:forKeyPath:context:
[:selector [2 :removeObserver :forKeyPath] [:void :id :id]]
[:selector [1 :willChangeValueForKey] [:void :id]]
[:selector [1 :didChangeValueForKey] [:void :id]]
[:selector [3 :willChange :valuesAtIndexes :forKey] [:void UIKit/NSKeyValueChange :id :id]]
[:selector [3 :didChange :valuesAtIndexes :forKey] [:void UIKit/NSKeyValueChange :id :id]]
[:selector [3 :willChangeValueForKey :withSetMutation :usingObjects] [:void :id UIKit/NSKeyValueSetMutationKind :id]]
[:selector [3 :didChangeValueForKey :withSetMutation :usingObjects] [:void :id UIKit/NSKeyValueSetMutationKind :id]]
[:selector [1 :keyPathsForValuesAffectingValueForKey] [:id :id]]
[:selector [1 :automaticallyNotifiesObserversForKey] [Boolean :id]]
;;FIXME: void * in setObservationInfo:
;;FIXME: void * in observationInfo
[:enum NSPropertyListImmutable NSPropertyListMutableContainers NSPropertyListMutableContainersAndLeaves NSPropertyListMutabilityOptions]
[:enum NSPropertyListOpenStepFormat NSPropertyListXMLFormat_v1_0 NSPropertyListBinaryFormat_v1_0 NSPropertyListFormat]
[:selector [2 :propertyList :isValidForFormat] [Boolean :id UIKit/NSPropertyListFormat]]
;;FIXME: NSError ** in dataWithPropertyList:format:options:error:
;;FIXME: NSError ** in writePropertyList:toStream:format:options:error:
;;FIXME: NSPropertyListFormat * in propertyListWithData:options:format:error:
;;FIXME: NSPropertyListFormat * in propertyListWithStream:options:format:error:
;;FIXME: NSString ** in dataFromPropertyList:format:errorDescription:
;;FIXME: NSPropertyListFormat * in propertyListFromData:mutabilityOption:format:errorDescription:
[:selector [1 :archivedDataWithRootObject] [:id :id]]
[:selector [2 :archiveRootObject :toFile] [Boolean :id :id]]
[:selector [1 :initForWritingWithMutableData] [:id :id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setOutputFormat] [:void UIKit/NSPropertyListFormat]]
[:selector [0 :outputFormat] [UIKit/NSPropertyListFormat]]
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
[:selector [0 :classForKeyedArchiver] [:id]]
[:selector [1 :replacementObjectForKeyedArchiver] [:id :id]]
[:selector [0 :classFallbacksForKeyedArchiver] [:id]]
[:selector [0 :classForKeyedUnarchiver] [:id]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [2 :displayNameForKey :value] [:id :id :id]]
[:selector [0 :localeIdentifier] [:id]]
[:selector [0 :systemLocale] [:id]]
[:selector [0 :currentLocale] [:id]]
[:selector [0 :autoupdatingCurrentLocale] [:id]]
[:selector [1 :initWithLocaleIdentifier] [:id :id]]
[:selector [0 :availableLocaleIdentifiers] [:id]]
[:selector [0 :ISOLanguageCodes] [:id]]
[:selector [0 :ISOCountryCodes] [:id]]
[:selector [0 :ISOCurrencyCodes] [:id]]
[:selector [0 :commonISOCurrencyCodes] [:id]]
[:selector [0 :preferredLanguages] [:id]]
[:selector [1 :componentsFromLocaleIdentifier] [:id :id]]
[:selector [1 :localeIdentifierFromComponents] [:id :id]]
[:selector [1 :canonicalLocaleIdentifierFromString] [:id :id]]
[:selector [1 :canonicalLanguageIdentifierFromString] [:id :id]]
[:selector [1 :localeIdentifierFromWindowsLocaleCode] [:id :unsigned-int]]
[:selector [1 :windowsLocaleCodeFromLocaleIdentifier] [:unsigned-int :id]]
[:enum NSLocaleLanguageDirectionUnknown NSLocaleLanguageDirectionLeftToRight NSLocaleLanguageDirectionRightToLeft NSLocaleLanguageDirectionTopToBottom NSLocaleLanguageDirectionBottomToTop NSLocaleLanguageDirection]
[:selector [1 :characterDirectionForLanguage] [UIKit/NSLocaleLanguageDirection :id]]
[:selector [1 :lineDirectionForLanguage] [UIKit/NSLocaleLanguageDirection :id]]
[:selector [0 :tryLock] [Boolean]]
[:selector [1 :lockBeforeDate] [Boolean :id]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [1 :initWithCondition] [:id :int]]
[:selector [0 :condition] [:int]]
[:selector [1 :lockWhenCondition] [:void :int]]
[:selector [0 :tryLock] [Boolean]]
[:selector [1 :tryLockWhenCondition] [Boolean :int]]
[:selector [1 :unlockWithCondition] [:void :int]]
[:selector [1 :lockBeforeDate] [Boolean :id]]
[:selector [2 :lockWhenCondition :beforeDate] [Boolean :int :id]]
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
[:enum NSMapTableStrongMemory NSMapTableCopyIn NSMapTableObjectPointerPersonality NSMapTableWeakMemory nil]
[:selector [3 :initWithKeyOptions :valueOptions :capacity] [:id :unsigned-int :unsigned-int :unsigned-int]]
[:selector [3 :initWithKeyPointerFunctions :valuePointerFunctions :capacity] [:id :id :id :unsigned-int]]
[:selector [2 :mapTableWithKeyOptions :valueOptions] [:id :unsigned-int :unsigned-int]]
[:selector [0 :strongToStrongObjectsMapTable] [:id]]
[:selector [0 :weakToStrongObjectsMapTable] [:id]]
[:selector [0 :strongToWeakObjectsMapTable] [:id]]
[:selector [0 :weakToWeakObjectsMapTable] [:id]]
[:selector [0 :keyPointerFunctions] [:id]]
[:selector [0 :valuePointerFunctions] [:id]]
[:selector [1 :objectForKey] [:id :id]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [2 :setObject :forKey] [:void :id :id]]
[:selector [0 :count] [:unsigned-int]]
[:selector [0 :keyEnumerator] [:id]]
[:selector [0 :objectEnumerator] [:id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [0 :dictionaryRepresentation] [:id]]
[:selector [1 :signatureWithObjCTypes] [:id :c-string-const]]
[:selector [0 :numberOfArguments] [:unsigned-int]]
[:selector [1 :getArgumentTypeAtIndex] [:c-string-const :unsigned-int]]
[:selector [0 :frameLength] [:unsigned-int]]
[:selector [0 :isOneway] [Boolean]]
[:selector [0 :methodReturnType] [:c-string-const]]
[:selector [0 :methodReturnLength] [:unsigned-int]]
[:selector [0 :name] [:id]]
[:selector [0 :object] [:id]]
[:selector [0 :userInfo] [:id]]
[:selector [2 :notificationWithName :object] [:id :id :id]]
[:selector [3 :notificationWithName :object :userInfo] [:id :id :id :id]]
[:selector [0 :defaultCenter] [:id]]
[:selector [4 :addObserver :selector :name :object] [:void :id :selector :id :id]]
[:selector [1 :postNotification] [:void :id]]
[:selector [2 :postNotificationName :object] [:void :id :id]]
[:selector [3 :postNotificationName :object :userInfo] [:void :id :id :id]]
[:selector [1 :removeObserver] [:void :id]]
[:selector [3 :removeObserver :name :object] [:void :id :id :id]]
;;FIXME: void (^)(NSNotification *) in addObserverForName:object:queue:usingBlock:
[:enum NSPostWhenIdle NSPostASAP NSPostNow NSPostingStyle]
[:enum NSNotificationNoCoalescing NSNotificationCoalescingOnName NSNotificationCoalescingOnSender NSNotificationCoalescing]
[:selector [0 :defaultQueue] [:id]]
[:selector [1 :initWithNotificationCenter] [:id :id]]
[:selector [2 :enqueueNotification :postingStyle] [:void :id UIKit/NSPostingStyle]]
[:selector [4 :enqueueNotification :postingStyle :coalesceMask :forModes] [:void :id UIKit/NSPostingStyle :unsigned-int :id]]
[:selector [2 :dequeueNotificationsMatching :coalesceMask] [:void :id :unsigned-int]]
[:selector [0 :null] [:id]]
;;FIXME: id * in getObjectValue:forString:range:error:
[:selector [1 :stringFromNumber] [:id :id]]
[:selector [1 :numberFromString] [:id :id]]
[:enum NSNumberFormatterNoStyle NSNumberFormatterDecimalStyle NSNumberFormatterCurrencyStyle NSNumberFormatterPercentStyle NSNumberFormatterScientificStyle NSNumberFormatterSpellOutStyle NSNumberFormatterBehavior]
[:enum NSNumberFormatterBehaviorDefault NSNumberFormatterBehavior10_4 NSNumberFormatterBehavior]
[:selector [2 :localizedStringFromNumber :numberStyle] [:id :id UIKit/NSNumberFormatterStyle]]
[:selector [0 :numberStyle] [UIKit/NSNumberFormatterStyle]]
[:selector [1 :setNumberStyle] [:void UIKit/NSNumberFormatterStyle]]
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :generatesDecimalNumbers] [Boolean]]
[:selector [1 :setGeneratesDecimalNumbers] [:void Boolean]]
[:selector [0 :formatterBehavior] [UIKit/NSNumberFormatterBehavior]]
[:selector [1 :setFormatterBehavior] [:void UIKit/NSNumberFormatterBehavior]]
[:selector [0 :defaultFormatterBehavior] [UIKit/NSNumberFormatterBehavior]]
[:selector [1 :setDefaultFormatterBehavior] [:void UIKit/NSNumberFormatterBehavior]]
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
[:selector [0 :groupingSize] [:unsigned-int]]
[:selector [1 :setGroupingSize] [:void :unsigned-int]]
[:selector [0 :secondaryGroupingSize] [:unsigned-int]]
[:selector [1 :setSecondaryGroupingSize] [:void :unsigned-int]]
[:selector [0 :multiplier] [:id]]
[:selector [1 :setMultiplier] [:void :id]]
[:selector [0 :formatWidth] [:unsigned-int]]
[:selector [1 :setFormatWidth] [:void :unsigned-int]]
[:selector [0 :paddingCharacter] [:id]]
[:selector [1 :setPaddingCharacter] [:void :id]]
[:enum NSNumberFormatterPadBeforePrefix NSNumberFormatterPadAfterPrefix NSNumberFormatterPadBeforeSuffix NSNumberFormatterPadAfterSuffix NSNumberFormatterRoundingMode]
[:enum NSNumberFormatterRoundCeiling NSNumberFormatterRoundFloor NSNumberFormatterRoundDown NSNumberFormatterRoundUp NSNumberFormatterRoundHalfEven NSNumberFormatterRoundHalfDown NSNumberFormatterRoundHalfUp NSNumberFormatterRoundingMode]
[:selector [0 :paddingPosition] [UIKit/NSNumberFormatterPadPosition]]
[:selector [1 :setPaddingPosition] [:void UIKit/NSNumberFormatterPadPosition]]
[:selector [0 :roundingMode] [UIKit/NSNumberFormatterRoundingMode]]
[:selector [1 :setRoundingMode] [:void UIKit/NSNumberFormatterRoundingMode]]
[:selector [0 :roundingIncrement] [:id]]
[:selector [1 :setRoundingIncrement] [:void :id]]
[:selector [0 :minimumIntegerDigits] [:unsigned-int]]
[:selector [1 :setMinimumIntegerDigits] [:void :unsigned-int]]
[:selector [0 :maximumIntegerDigits] [:unsigned-int]]
[:selector [1 :setMaximumIntegerDigits] [:void :unsigned-int]]
[:selector [0 :minimumFractionDigits] [:unsigned-int]]
[:selector [1 :setMinimumFractionDigits] [:void :unsigned-int]]
[:selector [0 :maximumFractionDigits] [:unsigned-int]]
[:selector [1 :setMaximumFractionDigits] [:void :unsigned-int]]
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
[:selector [0 :minimumSignificantDigits] [:unsigned-int]]
[:selector [1 :setMinimumSignificantDigits] [:void :unsigned-int]]
[:selector [0 :maximumSignificantDigits] [:unsigned-int]]
[:selector [1 :setMaximumSignificantDigits] [:void :unsigned-int]]
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
[:enum NSOperationQueuePriorityVeryLow NSOperationQueuePriorityLow NSOperationQueuePriorityNormal NSOperationQueuePriorityHigh NSOperationQueuePriorityVeryHigh NSOperationQueuePriority]
[:selector [0 :queuePriority] [UIKit/NSOperationQueuePriority]]
[:selector [1 :setQueuePriority] [:void UIKit/NSOperationQueuePriority]]
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
[:selector [0 :operationCount] [:unsigned-int]]
[:selector [0 :maxConcurrentOperationCount] [:int]]
[:selector [1 :setMaxConcurrentOperationCount] [:void :int]]
[:enum NSOperationQueueDefaultMaxConcurrentOperationCount nil]
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
[:selector [1 :languagesForScript] [:id :id]]
[:selector [1 :dominantLanguageForScript] [:id :id]]
[:selector [0 :dominantLanguage] [:id]]
[:selector [0 :allScripts] [:id]]
[:selector [0 :allLanguages] [:id]]
[:selector [2 :orthographyWithDominantScript :languageMap] [:id :id :id]]
[:selector [2 :initWithDominantScript :languageMap] [:id :id :id]]
[:selector [1 :initWithOptions] [:id :unsigned-int]]
[:selector [1 :initWithPointerFunctions] [:id :id]]
[:selector [1 :pointerArrayWithOptions] [:id :unsigned-int]]
[:selector [1 :pointerArrayWithPointerFunctions] [:id :id]]
[:selector [0 :pointerFunctions] [:id]]
;;FIXME: void * in pointerAtIndex:
;;FIXME: void * in addPointer:
[:selector [1 :removePointerAtIndex] [:void :unsigned-int]]
;;FIXME: void * in insertPointer:atIndex:
;;FIXME: void * in replacePointerAtIndex:withPointer:
[:selector [0 :compact] [:void]]
[:selector [0 :count] [:unsigned-int]]
[:selector [1 :setCount] [:void :unsigned-int]]
[:selector [0 :strongObjectsPointerArray] [:id]]
[:selector [0 :weakObjectsPointerArray] [:id]]
[:selector [0 :allObjects] [:id]]
[:selector [0 :port] [:id]]
[:selector [0 :invalidate] [:void]]
[:selector [0 :isValid] [Boolean]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
[:selector [0 :reservedSpaceLength] [:unsigned-int]]
[:selector [4 :sendBeforeDate :components :from :reserved] [Boolean :id :id :id :unsigned-int]]
[:selector [5 :sendBeforeDate :msgid :components :from :reserved] [Boolean :id :unsigned-int :id :id :unsigned-int]]
[:selector [1 :portWithMachPort] [:id :unsigned-int]]
[:selector [1 :initWithMachPort] [:id :unsigned-int]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:enum NSMachPortDeallocateNone NSMachPortDeallocateSendRight NSMachPortDeallocateReceiveRight nil]
[:selector [2 :portWithMachPort :options] [:id :unsigned-int :unsigned-int]]
[:selector [2 :initWithMachPort :options] [:id :unsigned-int :unsigned-int]]
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
[:enum NSWindowsNTOperatingSystem NSWindows95OperatingSystem NSSolarisOperatingSystem NSHPUXOperatingSystem NSMACHOperatingSystem NSSunOSOperatingSystem NSOSF1OperatingSystem nil]
[:selector [0 :processInfo] [:id]]
[:selector [0 :environment] [:id]]
[:selector [0 :arguments] [:id]]
[:selector [0 :hostName] [:id]]
[:selector [0 :processName] [:id]]
[:selector [0 :processIdentifier] [:int]]
[:selector [1 :setProcessName] [:void :id]]
[:selector [0 :globallyUniqueString] [:id]]
[:selector [0 :operatingSystem] [:unsigned-int]]
[:selector [0 :operatingSystemName] [:id]]
[:selector [0 :operatingSystemVersionString] [:id]]
[:selector [0 :processorCount] [:unsigned-int]]
[:selector [0 :activeProcessorCount] [:unsigned-int]]
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
[:enum NSTextCheckingTypeOrthography NSTextCheckingTypeSpelling NSTextCheckingTypeGrammar NSTextCheckingTypeDate NSTextCheckingTypeAddress NSTextCheckingTypeLink NSTextCheckingTypeQuote NSTextCheckingTypeDash NSTextCheckingTypeReplacement NSTextCheckingTypeCorrection NSTextCheckingTypeRegularExpression NSTextCheckingTypePhoneNumber NSTextCheckingTypeTransitInformation NSTextCheckingType]
[:enum NSTextCheckingAllSystemTypes NSTextCheckingAllCustomTypes NSTextCheckingAllTypes NSTextCheckingTypes]
[:selector [0 :resultType] [UIKit/NSTextCheckingType]]
[:selector [0 :range] [UIKit/NSRange]]
[:selector [1 :rangeAtIndex] [UIKit/NSRange :unsigned-int]]
[:selector [1 :resultByAdjustingRangesWithOffset] [:id :int]]
[:selector [0 :orthography] [:id]]
[:selector [0 :grammarDetails] [:id]]
[:selector [0 :date] [:id]]
[:selector [0 :timeZone] [:id]]
[:selector [0 :duration] [:double]]
[:selector [0 :components] [:id]]
[:selector [0 :URL] [:id]]
[:selector [0 :replacementString] [:id]]
[:selector [0 :regularExpression] [:id]]
[:selector [0 :phoneNumber] [:id]]
[:selector [0 :addressComponents] [:id]]
[:selector [0 :numberOfRanges] [:unsigned-int]]
[:selector [2 :orthographyCheckingResultWithRange :orthography] [:id UIKit/NSRange :id]]
[:selector [1 :spellCheckingResultWithRange] [:id UIKit/NSRange]]
[:selector [2 :grammarCheckingResultWithRange :details] [:id UIKit/NSRange :id]]
[:selector [2 :dateCheckingResultWithRange :date] [:id UIKit/NSRange :id]]
[:selector [4 :dateCheckingResultWithRange :date :timeZone :duration] [:id UIKit/NSRange :id :id :double]]
[:selector [2 :addressCheckingResultWithRange :components] [:id UIKit/NSRange :id]]
[:selector [2 :linkCheckingResultWithRange :URL] [:id UIKit/NSRange :id]]
[:selector [2 :quoteCheckingResultWithRange :replacementString] [:id UIKit/NSRange :id]]
[:selector [2 :dashCheckingResultWithRange :replacementString] [:id UIKit/NSRange :id]]
[:selector [2 :replacementCheckingResultWithRange :replacementString] [:id UIKit/NSRange :id]]
[:selector [2 :correctionCheckingResultWithRange :replacementString] [:id UIKit/NSRange :id]]
;;FIXME: NSRangePointer in regularExpressionCheckingResultWithRanges:count:regularExpression:
[:selector [2 :phoneNumberCheckingResultWithRange :phoneNumber] [:id UIKit/NSRange :id]]
[:selector [2 :transitInformationCheckingResultWithRange :components] [:id UIKit/NSRange :id]]
[:enum NSRegularExpressionCaseInsensitive NSRegularExpressionAllowCommentsAndWhitespace NSRegularExpressionIgnoreMetacharacters NSRegularExpressionDotMatchesLineSeparators NSRegularExpressionAnchorsMatchLines NSRegularExpressionUseUnixLineSeparators NSRegularExpressionUseUnicodeWordBoundaries NSRegularExpressionOptions]
;;FIXME: NSError ** in regularExpressionWithPattern:options:error:
;;FIXME: NSError ** in initWithPattern:options:error:
[:selector [1 :escapedPatternForString] [:id :id]]
[:selector [0 :pattern] [:id]]
[:selector [0 :options] [UIKit/NSRegularExpressionOptions]]
[:selector [0 :numberOfCaptureGroups] [:unsigned-int]]
[:enum NSMatchingReportProgress NSMatchingReportCompletion NSMatchingAnchored NSMatchingWithTransparentBounds NSMatchingWithoutAnchoringBounds NSMatchingOptions]
[:enum NSMatchingProgress NSMatchingCompleted NSMatchingHitEnd NSMatchingRequiredEnd NSMatchingInternalError NSMatchingFlags]
;;FIXME: void (^)(NSTextCheckingResult *, NSMatchingFlags, BOOL *) in enumerateMatchesInString:options:range:usingBlock:
[:selector [3 :matchesInString :options :range] [:id :id UIKit/NSMatchingOptions UIKit/NSRange]]
[:selector [3 :numberOfMatchesInString :options :range] [:unsigned-int :id UIKit/NSMatchingOptions UIKit/NSRange]]
[:selector [3 :firstMatchInString :options :range] [:id :id UIKit/NSMatchingOptions UIKit/NSRange]]
[:selector [3 :rangeOfFirstMatchInString :options :range] [UIKit/NSRange :id UIKit/NSMatchingOptions UIKit/NSRange]]
[:selector [4 :stringByReplacingMatchesInString :options :range :withTemplate] [:id :id UIKit/NSMatchingOptions UIKit/NSRange :id]]
[:selector [4 :replaceMatchesInString :options :range :withTemplate] [:unsigned-int :id UIKit/NSMatchingOptions UIKit/NSRange :id]]
[:selector [4 :replacementStringForResult :inString :offset :template] [:id :id :id :int :id]]
[:selector [1 :escapedTemplateForString] [:id :id]]
;;FIXME: NSError ** in dataDetectorWithTypes:error:
;;FIXME: NSError ** in initWithTypes:error:
[:selector [0 :checkingTypes] [UIKit/NSTextCheckingTypes]]
[:selector [0 :currentRunLoop] [:id]]
[:selector [0 :mainRunLoop] [:id]]
[:selector [0 :currentMode] [:id]]
;;FIXME: CFRunLoopRef in getCFRunLoop
[:selector [2 :addTimer :forMode] [:void :id :id]]
[:selector [2 :addPort :forMode] [:void :id :id]]
[:selector [2 :removePort :forMode] [:void :id :id]]
[:selector [1 :limitDateForMode] [:id :id]]
[:selector [2 :acceptInputForMode :beforeDate] [:void :id :id]]
[:selector [0 :run] [:void]]
[:selector [1 :runUntilDate] [:void :id]]
[:selector [2 :runMode :beforeDate] [Boolean :id :id]]
[:selector [4 :performSelector :withObject :afterDelay :inModes] [:void :selector :id :double :id]]
[:selector [3 :performSelector :withObject :afterDelay] [:void :selector :id :double]]
[:selector [3 :cancelPreviousPerformRequestsWithTarget :selector :object] [:void :id :selector :id]]
[:selector [1 :cancelPreviousPerformRequestsWithTarget] [:void :id]]
[:selector [5 :performSelector :target :argument :order :modes] [:void :selector :id :id :unsigned-int :id]]
[:selector [3 :cancelPerformSelector :target :argument] [:void :selector :id :id]]
[:selector [1 :cancelPerformSelectorsWithTarget] [:void :id]]
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
[:selector [2 :compareObject :toObject] [UIKit/NSComparisonResult :id :id]]
[:selector [0 :reversedSortDescriptor] [:id]]
[:selector [1 :sortedArrayUsingDescriptors] [:id :id]]
[:selector [1 :sortedArrayUsingDescriptors] [:id :id]]
[:selector [1 :sortUsingDescriptors] [:void :id]]
[:enum NSStreamStatusNotOpen NSStreamStatusOpening NSStreamStatusOpen NSStreamStatusReading NSStreamStatusWriting NSStreamStatusAtEnd NSStreamStatusClosed NSStreamStatusError NSStreamStatus]
[:enum NSStreamEventNone NSStreamEventOpenCompleted NSStreamEventHasBytesAvailable NSStreamEventHasSpaceAvailable NSStreamEventErrorOccurred NSStreamEventEndEncountered NSStreamEvent]
[:selector [0 :open] [:void]]
[:selector [0 :close] [:void]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [1 :propertyForKey] [:id :id]]
[:selector [2 :setProperty :forKey] [Boolean :id :id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
[:selector [0 :streamStatus] [UIKit/NSStreamStatus]]
[:selector [0 :streamError] [:id]]
;;FIXME: uint8_t * in read:maxLength:
;;FIXME: uint8_t ** in getBuffer:length:
[:selector [0 :hasBytesAvailable] [Boolean]]
;;FIXME: const uint8_t * in write:maxLength:
[:selector [0 :hasSpaceAvailable] [Boolean]]
[:selector [1 :initWithData] [:id :id]]
[:selector [1 :initWithFileAtPath] [:id :id]]
[:selector [1 :initWithURL] [:id :id]]
[:selector [1 :inputStreamWithData] [:id :id]]
[:selector [1 :inputStreamWithFileAtPath] [:id :id]]
[:selector [1 :inputStreamWithURL] [:id :id]]
[:selector [0 :initToMemory] [:id]]
;;FIXME: uint8_t * in initToBuffer:capacity:
[:selector [2 :initToFileAtPath :append] [:id :id Boolean]]
[:selector [2 :initWithURL :append] [:id :id Boolean]]
[:selector [0 :outputStreamToMemory] [:id]]
;;FIXME: uint8_t * in outputStreamToBuffer:capacity:
[:selector [2 :outputStreamToFileAtPath :append] [:id :id Boolean]]
[:selector [2 :outputStreamWithURL :append] [:id :id Boolean]]
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
[:selector [0 :stackSize] [:unsigned-int]]
[:selector [1 :setStackSize] [:void :unsigned-int]]
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
[:selector [4 :performSelectorOnMainThread :withObject :waitUntilDone :modes] [:void :selector :id Boolean :id]]
[:selector [3 :performSelectorOnMainThread :withObject :waitUntilDone] [:void :selector :id Boolean]]
[:selector [5 :performSelector :onThread :withObject :waitUntilDone :modes] [:void :selector :id :id Boolean :id]]
[:selector [4 :performSelector :onThread :withObject :waitUntilDone] [:void :selector :id :id Boolean]]
[:selector [2 :performSelectorInBackground :withObject] [:void :selector :id]]
[:selector [0 :name] [:id]]
[:selector [0 :data] [:id]]
[:selector [1 :secondsFromGMTForDate] [:int :id]]
[:selector [1 :abbreviationForDate] [:id :id]]
[:selector [1 :isDaylightSavingTimeForDate] [Boolean :id]]
[:selector [1 :daylightSavingTimeOffsetForDate] [:double :id]]
[:selector [1 :nextDaylightSavingTimeTransitionAfterDate] [:id :id]]
[:selector [0 :systemTimeZone] [:id]]
[:selector [0 :resetSystemTimeZone] [:void]]
[:selector [0 :defaultTimeZone] [:id]]
[:selector [1 :setDefaultTimeZone] [:void :id]]
[:selector [0 :localTimeZone] [:id]]
[:selector [0 :knownTimeZoneNames] [:id]]
[:selector [0 :abbreviationDictionary] [:id]]
[:selector [1 :setAbbreviationDictionary] [:void :id]]
[:selector [0 :timeZoneDataVersion] [:id]]
[:selector [0 :secondsFromGMT] [:int]]
[:selector [0 :abbreviation] [:id]]
[:selector [0 :isDaylightSavingTime] [Boolean]]
[:selector [0 :daylightSavingTimeOffset] [:double]]
[:selector [0 :nextDaylightSavingTimeTransition] [:id]]
[:selector [0 :description] [:id]]
[:selector [1 :isEqualToTimeZone] [Boolean :id]]
[:enum NSTimeZoneNameStyleStandard NSTimeZoneNameStyleShortStandard NSTimeZoneNameStyleDaylightSaving NSTimeZoneNameStyleShortDaylightSaving NSTimeZoneNameStyleGeneric NSTimeZoneNameStyleShortGeneric NSTimeZoneNameStyle]
[:selector [2 :localizedName :locale] [:id UIKit/NSTimeZoneNameStyle :id]]
[:selector [1 :timeZoneWithName] [:id :id]]
[:selector [2 :timeZoneWithName :data] [:id :id :id]]
[:selector [1 :initWithName] [:id :id]]
[:selector [2 :initWithName :data] [:id :id :id]]
[:selector [1 :timeZoneForSecondsFromGMT] [:id :int]]
[:selector [1 :timeZoneWithAbbreviation] [:id :id]]
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
[:enum NSURLBookmarkCreationPreferFileIDResolution NSURLBookmarkCreationMinimalBookmark NSURLBookmarkCreationSuitableForBookmarkFile NSURLBookmarkCreationWithSecurityScope NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess NSURLBookmarkResolutionOptions]
[:enum NSURLBookmarkResolutionWithoutUI NSURLBookmarkResolutionWithoutMounting NSURLBookmarkResolutionWithSecurityScope NSURLBookmarkResolutionOptions]
;;FIXME: NSError ** in bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:
;;FIXME: BOOL * in initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:
;;FIXME: BOOL * in URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:
[:selector [2 :resourceValuesForKeys :fromBookmarkData] [:id :id :id]]
;;FIXME: NSError ** in writeBookmarkData:toURL:options:error:
;;FIXME: NSError ** in bookmarkDataWithContentsOfURL:error:
[:selector [0 :startAccessingSecurityScopedResource] [Boolean]]
[:selector [0 :stopAccessingSecurityScopedResource] [:void]]
[:selector [1 :stringByAddingPercentEscapesUsingEncoding] [:id :unsigned-int]]
[:selector [1 :stringByReplacingPercentEscapesUsingEncoding] [:id :unsigned-int]]
[:selector [1 :fileURLWithPathComponents] [:id :id]]
[:selector [0 :pathComponents] [:id]]
[:selector [0 :lastPathComponent] [:id]]
[:selector [0 :pathExtension] [:id]]
[:selector [1 :URLByAppendingPathComponent] [:id :id]]
[:selector [2 :URLByAppendingPathComponent :isDirectory] [:id :id Boolean]]
[:selector [0 :URLByDeletingLastPathComponent] [:id]]
[:selector [1 :URLByAppendingPathExtension] [:id :id]]
[:selector [0 :URLByDeletingPathExtension] [:id]]
[:selector [0 :URLByStandardizingPath] [:id]]
[:selector [0 :URLByResolvingSymlinksInPath] [:id]]
[:selector [6 :initWithProtectionSpace :proposedCredential :previousFailureCount :failureResponse :error :sender] [:id :id :id :int :id :id :id]]
[:selector [2 :initWithAuthenticationChallenge :sender] [:id :id :id]]
[:selector [0 :protectionSpace] [:id]]
[:selector [0 :proposedCredential] [:id]]
[:selector [0 :previousFailureCount] [:int]]
[:selector [0 :failureResponse] [:id]]
[:selector [0 :error] [:id]]
[:selector [0 :sender] [:id]]
[:enum NSURLCacheStorageAllowed NSURLCacheStorageAllowedInMemoryOnly NSURLCacheStorageNotAllowed nil]
[:selector [2 :initWithResponse :data] [:id :id :id]]
[:selector [4 :initWithResponse :data :userInfo :storagePolicy] [:id :id :id :id :unsigned-int]]
[:selector [0 :response] [:id]]
[:selector [0 :data] [:id]]
[:selector [0 :userInfo] [:id]]
[:selector [0 :storagePolicy] [:unsigned-int]]
[:selector [0 :sharedURLCache] [:id]]
[:selector [1 :setSharedURLCache] [:void :id]]
[:selector [3 :initWithMemoryCapacity :diskCapacity :diskPath] [:id :unsigned-int :unsigned-int :id]]
[:selector [1 :cachedResponseForRequest] [:id :id]]
[:selector [2 :storeCachedResponse :forRequest] [:void :id :id]]
[:selector [1 :removeCachedResponseForRequest] [:void :id]]
[:selector [0 :removeAllCachedResponses] [:void]]
[:selector [0 :memoryCapacity] [:unsigned-int]]
[:selector [0 :diskCapacity] [:unsigned-int]]
[:selector [1 :setMemoryCapacity] [:void :unsigned-int]]
[:selector [1 :setDiskCapacity] [:void :unsigned-int]]
[:selector [0 :currentMemoryUsage] [:unsigned-int]]
[:selector [0 :currentDiskUsage] [:unsigned-int]]
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
;;FIXME: NSURLResponse ** in sendSynchronousRequest:returningResponse:error:
;;FIXME: void (^)(NSURLResponse *, NSData *, NSError *) in sendAsynchronousRequest:queue:completionHandler:
[:enum errSecSuccess errSecUnimplemented errSecParam errSecAllocate errSecNotAvailable errSecDuplicateItem errSecItemNotFound errSecInteractionNotAllowed errSecDecode errSecAuthFailed nil]
[:function SecCertificateGetTypeID [:unsigned-long]]
;;FIXME: SecCertificateRef in SecCertificateCreateWithData
;;FIXME: CFDataRef in SecCertificateCopyData
;;FIXME: CFStringRef in SecCertificateCopySubjectSummary
[:function SecIdentityGetTypeID [:unsigned-long]]
;;FIXME: SecIdentityRef in SecIdentityCopyCertificate
;;FIXME: SecIdentityRef in SecIdentityCopyPrivateKey
;;FIXME: CFDataRef in SecPKCS12Import
;;FIXME: CFDictionaryRef in SecItemCopyMatching
;;FIXME: CFDictionaryRef in SecItemAdd
;;FIXME: CFDictionaryRef in SecItemUpdate
;;FIXME: CFDictionaryRef in SecItemDelete
[:enum kSecPaddingNone kSecPaddingPKCS1 kSecPaddingOAEP kSecPaddingPKCS1MD2 kSecPaddingPKCS1MD5 kSecPaddingPKCS1SHA1 kSecPaddingPKCS1SHA224 kSecPaddingPKCS1SHA256 kSecPaddingPKCS1SHA384 kSecPaddingPKCS1SHA512 nil]
[:function SecKeyGetTypeID [:unsigned-long]]
;;FIXME: CFDictionaryRef in SecKeyGeneratePair
;;FIXME: SecKeyRef in SecKeyRawSign
;;FIXME: SecKeyRef in SecKeyRawVerify
;;FIXME: SecKeyRef in SecKeyEncrypt
;;FIXME: SecKeyRef in SecKeyDecrypt
;;FIXME: SecKeyRef in SecKeyGetBlockSize
[:function SecPolicyGetTypeID [:unsigned-long]]
;;FIXME: SecPolicyRef in SecPolicyCreateBasicX509
;;FIXME: SecPolicyRef in SecPolicyCreateSSL
;;FIXME: SecRandomRef in SecRandomCopyBytes
[:enum kSecTrustResultInvalid kSecTrustResultProceed kSecTrustResultConfirm kSecTrustResultDeny kSecTrustResultUnspecified kSecTrustResultRecoverableTrustFailure kSecTrustResultFatalTrustFailure kSecTrustResultOtherError nil]
[:function SecTrustGetTypeID [:unsigned-long]]
;;FIXME: CFTypeRef in SecTrustCreateWithCertificates
;;FIXME: SecTrustRef in SecTrustSetAnchorCertificates
;;FIXME: SecTrustRef in SecTrustSetAnchorCertificatesOnly
;;FIXME: SecTrustRef in SecTrustSetVerifyDate
;;FIXME: SecTrustRef in SecTrustGetVerifyTime
;;FIXME: SecTrustRef in SecTrustEvaluate
;;FIXME: SecKeyRef in SecTrustCopyPublicKey
;;FIXME: SecTrustRef in SecTrustGetCertificateCount
;;FIXME: SecCertificateRef in SecTrustGetCertificateAtIndex
;;FIXME: CFDataRef in SecTrustCopyExceptions
;;FIXME: SecTrustRef in SecTrustSetExceptions
[:enum NSURLCredentialPersistenceNone NSURLCredentialPersistenceForSession NSURLCredentialPersistencePermanent NSURLCredentialPersistence]
[:selector [0 :persistence] [UIKit/NSURLCredentialPersistence]]
[:selector [3 :initWithUser :password :persistence] [:id :id :id UIKit/NSURLCredentialPersistence]]
[:selector [3 :credentialWithUser :password :persistence] [:id :id :id UIKit/NSURLCredentialPersistence]]
[:selector [0 :user] [:id]]
[:selector [0 :password] [:id]]
[:selector [0 :hasPassword] [Boolean]]
;;FIXME: SecIdentityRef in initWithIdentity:certificates:persistence:
;;FIXME: SecIdentityRef in credentialWithIdentity:certificates:persistence:
;;FIXME: SecIdentityRef in identity
[:selector [0 :certificates] [:id]]
;;FIXME: SecTrustRef in initWithTrust:
;;FIXME: SecTrustRef in credentialForTrust:
[:selector [0 :sharedCredentialStorage] [:id]]
[:selector [1 :credentialsForProtectionSpace] [:id :id]]
[:selector [0 :allCredentials] [:id]]
[:selector [2 :setCredential :forProtectionSpace] [:void :id :id]]
[:selector [2 :removeCredential :forProtectionSpace] [:void :id :id]]
[:selector [1 :defaultCredentialForProtectionSpace] [:id :id]]
[:selector [2 :setDefaultCredential :forProtectionSpace] [:void :id :id]]
[:enum kCFHostErrorHostNotFound kCFHostErrorUnknown kCFSOCKSErrorUnknownClientVersion kCFSOCKSErrorUnsupportedServerVersion kCFSOCKS4ErrorRequestFailed kCFSOCKS4ErrorIdentdFailed kCFSOCKS4ErrorIdConflict kCFSOCKS4ErrorUnknownStatusCode kCFSOCKS5ErrorBadState kCFSOCKS5ErrorBadResponseAddr kCFSOCKS5ErrorBadCredentials kCFSOCKS5ErrorUnsupportedNegotiationMethod kCFSOCKS5ErrorNoAcceptableMethod kCFFTPErrorUnexpectedStatusCode kCFErrorHTTPAuthenticationTypeUnsupported kCFErrorHTTPBadCredentials kCFErrorHTTPConnectionLost kCFErrorHTTPParseFailure kCFErrorHTTPRedirectionLoopDetected kCFErrorHTTPBadURL kCFErrorHTTPProxyConnectionFailure kCFErrorHTTPBadProxyCredentials kCFErrorPACFileError kCFErrorPACFileAuth kCFErrorHTTPSProxyConnectionFailure kCFStreamErrorHTTPSProxyFailureUnexpectedResponseToCONNECTMethod kCFURLErrorUnknown kCFURLErrorCancelled kCFURLErrorBadURL kCFURLErrorTimedOut kCFURLErrorUnsupportedURL kCFURLErrorCannotFindHost kCFURLErrorCannotConnectToHost kCFURLErrorNetworkConnectionLost kCFURLErrorDNSLookupFailed kCFURLErrorHTTPTooManyRedirects kCFURLErrorResourceUnavailable kCFURLErrorNotConnectedToInternet kCFURLErrorRedirectToNonExistentLocation kCFURLErrorBadServerResponse kCFURLErrorUserCancelledAuthentication kCFURLErrorUserAuthenticationRequired kCFURLErrorZeroByteResource kCFURLErrorCannotDecodeRawData kCFURLErrorCannotDecodeContentData kCFURLErrorCannotParseResponse kCFURLErrorInternationalRoamingOff kCFURLErrorCallIsActive kCFURLErrorDataNotAllowed kCFURLErrorRequestBodyStreamExhausted kCFURLErrorFileDoesNotExist kCFURLErrorFileIsDirectory kCFURLErrorNoPermissionsToReadFile kCFURLErrorDataLengthExceedsMaximum kCFURLErrorSecureConnectionFailed kCFURLErrorServerCertificateHasBadDate kCFURLErrorServerCertificateUntrusted kCFURLErrorServerCertificateHasUnknownRoot kCFURLErrorServerCertificateNotYetValid kCFURLErrorClientCertificateRejected kCFURLErrorClientCertificateRequired kCFURLErrorCannotLoadFromNetwork kCFURLErrorCannotCreateFile kCFURLErrorCannotOpenFile kCFURLErrorCannotCloseFile kCFURLErrorCannotWriteToFile kCFURLErrorCannotRemoveFile kCFURLErrorCannotMoveFile kCFURLErrorDownloadDecodingFailedMidStream kCFURLErrorDownloadDecodingFailedToComplete kCFHTTPCookieCannotParseCookieFile kCFNetServiceErrorUnknown kCFNetServiceErrorCollision kCFNetServiceErrorNotFound kCFNetServiceErrorInProgress kCFNetServiceErrorBadArgument kCFNetServiceErrorCancel kCFNetServiceErrorInvalid kCFNetServiceErrorTimeout kCFNetServiceErrorDNSServiceFailure CFNetworkErrors]
[:enum kCFHostAddresses kCFHostNames kCFHostReachability CFHostInfoType]
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
[:enum kCFNetServicesErrorUnknown kCFNetServicesErrorCollision kCFNetServicesErrorNotFound kCFNetServicesErrorInProgress kCFNetServicesErrorBadArgument kCFNetServicesErrorCancel kCFNetServicesErrorInvalid kCFNetServicesErrorTimeout CFNetServicesError]
[:enum kCFNetServiceMonitorTXT CFNetServiceMonitorType]
[:enum kCFNetServiceFlagNoAutoRename nil]
[:enum kCFNetServiceFlagMoreComing kCFNetServiceFlagIsDomain kCFNetServiceFlagIsDefault kCFNetServiceFlagIsRegistrationDomain kCFNetServiceFlagRemove nil]
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
[:enum kCFStreamErrorSOCKSSubDomainNone kCFStreamErrorSOCKSSubDomainVersionCode kCFStreamErrorSOCKS4SubDomainResponse kCFStreamErrorSOCKS5SubDomainUserPass kCFStreamErrorSOCKS5SubDomainMethod kCFStreamErrorSOCKS5SubDomainResponse nil]
[:enum kCFStreamErrorSOCKS5BadResponseAddr kCFStreamErrorSOCKS5BadState kCFStreamErrorSOCKSUnknownClientVersion nil]
[:enum kCFStreamErrorSOCKS4RequestFailed kCFStreamErrorSOCKS4IdentdFailed kCFStreamErrorSOCKS4IdConflict nil]
[:enum kSOCKS5NoAcceptableMethod nil]
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithSocketToCFHost
;;FIXME: CFAllocatorRef in CFStreamCreatePairWithSocketToNetService
[:enum kCFStreamSocketSecurityNone kCFStreamSocketSecuritySSLv2 kCFStreamSocketSecuritySSLv3 kCFStreamSocketSecuritySSLv23 kCFStreamSocketSecurityTLSv1 CFStreamSocketSecurityProtocol]
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
[:enum kCFStreamErrorHTTPParseFailure kCFStreamErrorHTTPRedirectionLoop kCFStreamErrorHTTPBadURL CFStreamErrorHTTP]
;;FIXME: CFReadStreamRef in CFReadStreamCreateForHTTPRequest
;;FIXME: CFReadStreamRef in CFReadStreamCreateForStreamedHTTPRequest
;;FIXME: CFReadStreamRef in CFHTTPReadStreamSetRedirectsAutomatically
;;FIXME: CFReadStreamRef in CFHTTPReadStreamSetProxy
[:enum kCFStreamErrorHTTPAuthenticationTypeUnsupported kCFStreamErrorHTTPAuthenticationBadUserName kCFStreamErrorHTTPAuthenticationBadPassword CFStreamErrorHTTPAuthentication]
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
[:enum kCFNetDiagnosticNoErr kCFNetDiagnosticErr kCFNetDiagnosticConnectionUp kCFNetDiagnosticConnectionIndeterminate kCFNetDiagnosticConnectionDown CFNetDiagnosticStatusValues]
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
[:enum NSURLErrorUnknown NSURLErrorCancelled NSURLErrorBadURL NSURLErrorTimedOut NSURLErrorUnsupportedURL NSURLErrorCannotFindHost NSURLErrorCannotConnectToHost NSURLErrorNetworkConnectionLost NSURLErrorDNSLookupFailed NSURLErrorHTTPTooManyRedirects NSURLErrorResourceUnavailable NSURLErrorNotConnectedToInternet NSURLErrorRedirectToNonExistentLocation NSURLErrorBadServerResponse NSURLErrorUserCancelledAuthentication NSURLErrorUserAuthenticationRequired NSURLErrorZeroByteResource NSURLErrorCannotDecodeRawData NSURLErrorCannotDecodeContentData NSURLErrorCannotParseResponse NSURLErrorFileDoesNotExist NSURLErrorFileIsDirectory NSURLErrorNoPermissionsToReadFile NSURLErrorDataLengthExceedsMaximum NSURLErrorSecureConnectionFailed NSURLErrorServerCertificateHasBadDate NSURLErrorServerCertificateUntrusted NSURLErrorServerCertificateHasUnknownRoot NSURLErrorServerCertificateNotYetValid NSURLErrorClientCertificateRejected NSURLErrorClientCertificateRequired NSURLErrorCannotLoadFromNetwork NSURLErrorCannotCreateFile NSURLErrorCannotOpenFile NSURLErrorCannotCloseFile NSURLErrorCannotWriteToFile NSURLErrorCannotRemoveFile NSURLErrorCannotMoveFile NSURLErrorDownloadDecodingFailedMidStream NSURLErrorDownloadDecodingFailedToComplete NSURLErrorInternationalRoamingOff NSURLErrorCallIsActive NSURLErrorDataNotAllowed NSURLErrorRequestBodyStreamExhausted nil]
[:selector [5 :initWithHost :port :protocol :realm :authenticationMethod] [:id :id :int :id :id :id]]
[:selector [5 :initWithProxyHost :port :type :realm :authenticationMethod] [:id :id :int :id :id :id]]
[:selector [0 :realm] [:id]]
[:selector [0 :receivesCredentialSecurely] [Boolean]]
[:selector [0 :isProxy] [Boolean]]
[:selector [0 :host] [:id]]
[:selector [0 :port] [:int]]
[:selector [0 :proxyType] [:id]]
[:selector [0 :protocol] [:id]]
[:selector [0 :authenticationMethod] [:id]]
[:selector [0 :distinguishedNames] [:id]]
;;FIXME: SecTrustRef in serverTrust
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
[:enum NSURLRequestUseProtocolCachePolicy NSURLRequestReloadIgnoringLocalCacheData NSURLRequestReloadIgnoringLocalAndRemoteCacheData NSURLRequestReloadIgnoringCacheData NSURLRequestReturnCacheDataElseLoad NSURLRequestReturnCacheDataDontLoad NSURLRequestReloadRevalidatingCacheData nil]
[:enum NSURLNetworkServiceTypeDefault NSURLNetworkServiceTypeVoIP NSURLNetworkServiceTypeVideo NSURLNetworkServiceTypeBackground NSURLNetworkServiceTypeVoice nil]
[:selector [1 :requestWithURL] [:id :id]]
[:selector [3 :requestWithURL :cachePolicy :timeoutInterval] [:id :id :unsigned-int :double]]
[:selector [1 :initWithURL] [:id :id]]
[:selector [3 :initWithURL :cachePolicy :timeoutInterval] [:id :id :unsigned-int :double]]
[:selector [0 :URL] [:id]]
[:selector [0 :cachePolicy] [:unsigned-int]]
[:selector [0 :timeoutInterval] [:double]]
[:selector [0 :mainDocumentURL] [:id]]
[:selector [0 :networkServiceType] [:unsigned-int]]
[:selector [0 :allowsCellularAccess] [Boolean]]
[:selector [1 :setURL] [:void :id]]
[:selector [1 :setCachePolicy] [:void :unsigned-int]]
[:selector [1 :setTimeoutInterval] [:void :double]]
[:selector [1 :setMainDocumentURL] [:void :id]]
[:selector [1 :setNetworkServiceType] [:void :unsigned-int]]
[:selector [1 :setAllowsCellularAccess] [:void Boolean]]
[:selector [0 :HTTPMethod] [:id]]
[:selector [0 :allHTTPHeaderFields] [:id]]
[:selector [1 :valueForHTTPHeaderField] [:id :id]]
[:selector [0 :HTTPBody] [:id]]
[:selector [0 :HTTPBodyStream] [:id]]
[:selector [0 :HTTPShouldHandleCookies] [Boolean]]
[:selector [0 :HTTPShouldUsePipelining] [Boolean]]
[:selector [1 :setHTTPMethod] [:void :id]]
[:selector [1 :setAllHTTPHeaderFields] [:void :id]]
[:selector [2 :setValue :forHTTPHeaderField] [:void :id :id]]
[:selector [2 :addValue :forHTTPHeaderField] [:void :id :id]]
[:selector [1 :setHTTPBody] [:void :id]]
[:selector [1 :setHTTPBodyStream] [:void :id]]
[:selector [1 :setHTTPShouldHandleCookies] [:void Boolean]]
[:selector [1 :setHTTPShouldUsePipelining] [:void Boolean]]
[:selector [4 :initWithURL :MIMEType :expectedContentLength :textEncodingName] [:id :id :id :int :id]]
[:selector [0 :URL] [:id]]
[:selector [0 :MIMEType] [:id]]
[:selector [0 :expectedContentLength] [:long-long]]
[:selector [0 :textEncodingName] [:id]]
[:selector [0 :suggestedFilename] [:id]]
[:selector [4 :initWithURL :statusCode :HTTPVersion :headerFields] [:id :id :int :id :id]]
[:selector [0 :statusCode] [:int]]
[:selector [0 :allHeaderFields] [:id]]
[:selector [1 :localizedStringForStatusCode] [:id :int]]
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
[:selector [1 :integerForKey] [:int :id]]
[:selector [1 :floatForKey] [:float :id]]
[:selector [1 :doubleForKey] [:double :id]]
[:selector [1 :boolForKey] [Boolean :id]]
[:selector [1 :URLForKey] [:id :id]]
[:selector [2 :setInteger :forKey] [:void :int :id]]
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
[:selector [0 :publicID] [:id]]
[:selector [0 :systemID] [:id]]
[:selector [0 :lineNumber] [:int]]
[:selector [0 :columnNumber] [:int]]
[:enum NSXMLParserInternalError NSXMLParserOutOfMemoryError NSXMLParserDocumentStartError NSXMLParserEmptyDocumentError NSXMLParserPrematureDocumentEndError NSXMLParserInvalidHexCharacterRefError NSXMLParserInvalidDecimalCharacterRefError NSXMLParserInvalidCharacterRefError NSXMLParserInvalidCharacterError NSXMLParserCharacterRefAtEOFError NSXMLParserCharacterRefInPrologError NSXMLParserCharacterRefInEpilogError NSXMLParserCharacterRefInDTDError NSXMLParserEntityRefAtEOFError NSXMLParserEntityRefInPrologError NSXMLParserEntityRefInEpilogError NSXMLParserEntityRefInDTDError NSXMLParserParsedEntityRefAtEOFError NSXMLParserParsedEntityRefInPrologError NSXMLParserParsedEntityRefInEpilogError NSXMLParserParsedEntityRefInInternalSubsetError NSXMLParserEntityReferenceWithoutNameError NSXMLParserEntityReferenceMissingSemiError NSXMLParserParsedEntityRefNoNameError NSXMLParserParsedEntityRefMissingSemiError NSXMLParserUndeclaredEntityError NSXMLParserUnparsedEntityError NSXMLParserEntityIsExternalError NSXMLParserEntityIsParameterError NSXMLParserUnknownEncodingError NSXMLParserEncodingNotSupportedError NSXMLParserStringNotStartedError NSXMLParserStringNotClosedError NSXMLParserNamespaceDeclarationError NSXMLParserEntityNotStartedError NSXMLParserEntityNotFinishedError NSXMLParserLessThanSymbolInAttributeError NSXMLParserAttributeNotStartedError NSXMLParserAttributeNotFinishedError NSXMLParserAttributeHasNoValueError NSXMLParserAttributeRedefinedError NSXMLParserLiteralNotStartedError NSXMLParserLiteralNotFinishedError NSXMLParserCommentNotFinishedError NSXMLParserProcessingInstructionNotStartedError NSXMLParserProcessingInstructionNotFinishedError NSXMLParserNotationNotStartedError NSXMLParserNotationNotFinishedError NSXMLParserAttributeListNotStartedError NSXMLParserAttributeListNotFinishedError NSXMLParserMixedContentDeclNotStartedError NSXMLParserMixedContentDeclNotFinishedError NSXMLParserElementContentDeclNotStartedError NSXMLParserElementContentDeclNotFinishedError NSXMLParserXMLDeclNotStartedError NSXMLParserXMLDeclNotFinishedError NSXMLParserConditionalSectionNotStartedError NSXMLParserConditionalSectionNotFinishedError NSXMLParserExternalSubsetNotFinishedError NSXMLParserDOCTYPEDeclNotFinishedError NSXMLParserMisplacedCDATAEndStringError NSXMLParserCDATANotFinishedError NSXMLParserMisplacedXMLDeclarationError NSXMLParserSpaceRequiredError NSXMLParserSeparatorRequiredError NSXMLParserNMTOKENRequiredError NSXMLParserNAMERequiredError NSXMLParserPCDATARequiredError NSXMLParserURIRequiredError NSXMLParserPublicIdentifierRequiredError NSXMLParserLTRequiredError NSXMLParserGTRequiredError NSXMLParserLTSlashRequiredError NSXMLParserEqualExpectedError NSXMLParserTagNameMismatchError NSXMLParserUnfinishedTagError NSXMLParserStandaloneValueError NSXMLParserInvalidEncodingNameError NSXMLParserCommentContainsDoubleHyphenError NSXMLParserInvalidEncodingError NSXMLParserExternalStandaloneEntityError NSXMLParserInvalidConditionalSectionError NSXMLParserEntityValueRequiredError NSXMLParserNotWellBalancedError NSXMLParserExtraContentError NSXMLParserInvalidCharacterInEntityError NSXMLParserParsedEntityRefInInternalError NSXMLParserEntityRefLoopError NSXMLParserEntityBoundaryError NSXMLParserInvalidURIError NSXMLParserURIFragmentError NSXMLParserNoDTDError NSXMLParserDelegateAbortedParseError NSXMLParserError]
[:enum NSFileNoSuchFileError NSFileLockingError NSFileReadUnknownError NSFileReadNoPermissionError NSFileReadInvalidFileNameError NSFileReadCorruptFileError NSFileReadNoSuchFileError NSFileReadInapplicableStringEncodingError NSFileReadUnsupportedSchemeError NSFileReadTooLargeError NSFileReadUnknownStringEncodingError NSFileWriteUnknownError NSFileWriteNoPermissionError NSFileWriteInvalidFileNameError NSFileWriteFileExistsError NSFileWriteInapplicableStringEncodingError NSFileWriteUnsupportedSchemeError NSFileWriteOutOfSpaceError NSFileWriteVolumeReadOnlyError NSKeyValueValidationError NSFormattingError NSUserCancelledError NSFeatureUnsupportedError NSExecutableNotLoadableError NSExecutableArchitectureMismatchError NSExecutableRuntimeMismatchError NSExecutableLoadError NSExecutableLinkError NSFileErrorMinimum NSFileErrorMaximum NSValidationErrorMinimum NSValidationErrorMaximum NSExecutableErrorMinimum NSExecutableErrorMaximum NSFormattingErrorMinimum NSFormattingErrorMaximum NSPropertyListReadCorruptError NSPropertyListReadUnknownVersionError NSPropertyListReadStreamError NSPropertyListWriteStreamError NSPropertyListErrorMinimum NSPropertyListErrorMaximum NSXPCConnectionInterrupted NSXPCConnectionInvalid NSXPCConnectionReplyInvalid NSXPCConnectionErrorMinimum NSXPCConnectionErrorMaximum nil]
[:selector [0 :string] [:id]]
;;FIXME: NSRangePointer in attributesAtIndex:effectiveRange:
[:selector [0 :length] [:unsigned-int]]
;;FIXME: NSRangePointer in attribute:atIndex:effectiveRange:
[:selector [1 :attributedSubstringFromRange] [:id UIKit/NSRange]]
;;FIXME: NSRangePointer in attributesAtIndex:longestEffectiveRange:inRange:
;;FIXME: NSRangePointer in attribute:atIndex:longestEffectiveRange:inRange:
[:selector [1 :isEqualToAttributedString] [Boolean :id]]
[:selector [1 :initWithString] [:id :id]]
[:selector [2 :initWithString :attributes] [:id :id :id]]
[:selector [1 :initWithAttributedString] [:id :id]]
[:enum NSAttributedStringEnumerationReverse NSAttributedStringEnumerationLongestEffectiveRangeNotRequired NSAttributedStringEnumerationOptions]
;;FIXME: void (^)(NSDictionary *, NSRange, BOOL *) in enumerateAttributesInRange:options:usingBlock:
;;FIXME: void (^)(id, NSRange, BOOL *) in enumerateAttribute:inRange:options:usingBlock:
[:selector [2 :replaceCharactersInRange :withString] [:void UIKit/NSRange :id]]
[:selector [2 :setAttributes :range] [:void :id UIKit/NSRange]]
[:selector [0 :mutableString] [:id]]
[:selector [3 :addAttribute :value :range] [:void :id :id UIKit/NSRange]]
[:selector [2 :addAttributes :range] [:void :id UIKit/NSRange]]
[:selector [2 :removeAttribute :range] [:void :id UIKit/NSRange]]
[:selector [2 :replaceCharactersInRange :withAttributedString] [:void UIKit/NSRange :id]]
[:selector [2 :insertAttributedString :atIndex] [:void :id :unsigned-int]]
[:selector [1 :appendAttributedString] [:void :id]]
[:selector [1 :deleteCharactersInRange] [:void UIKit/NSRange]]
[:selector [1 :setAttributedString] [:void :id]]
[:selector [0 :beginEditing] [:void]]
[:selector [0 :endEditing] [:void]]
[:enum NSByteCountFormatterUseDefault NSByteCountFormatterUseBytes NSByteCountFormatterUseKB NSByteCountFormatterUseMB NSByteCountFormatterUseGB NSByteCountFormatterUseTB NSByteCountFormatterUsePB NSByteCountFormatterUseEB NSByteCountFormatterUseZB NSByteCountFormatterUseYBOrHigher NSByteCountFormatterUseAll NSByteCountFormatterUnits]
[:enum NSByteCountFormatterCountStyleFile NSByteCountFormatterCountStyleMemory NSByteCountFormatterCountStyleDecimal NSByteCountFormatterCountStyleBinary NSByteCountFormatterCountStyle]
[:selector [2 :stringFromByteCount :countStyle] [:id :long-long UIKit/NSByteCountFormatterCountStyle]]
[:selector [1 :stringFromByteCount] [:id :long-long]]
[:selector [0 :allowedUnits] [UIKit/NSByteCountFormatterUnits]]
[:selector [1 :setAllowedUnits] [:void UIKit/NSByteCountFormatterUnits]]
[:selector [0 :countStyle] [UIKit/NSByteCountFormatterCountStyle]]
[:selector [1 :setCountStyle] [:void UIKit/NSByteCountFormatterCountStyle]]
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
[:selector [3 :setObject :forKey :cost] [:void :id :id :unsigned-int]]
[:selector [1 :removeObjectForKey] [:void :id]]
[:selector [0 :removeAllObjects] [:void]]
[:selector [1 :setTotalCostLimit] [:void :unsigned-int]]
[:selector [0 :totalCostLimit] [:unsigned-int]]
[:selector [1 :setCountLimit] [:void :unsigned-int]]
[:selector [0 :countLimit] [:unsigned-int]]
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
[:selector [1 :filteredArrayUsingPredicate] [:id :id]]
[:selector [1 :filterUsingPredicate] [:void :id]]
[:selector [1 :filteredSetUsingPredicate] [:id :id]]
[:selector [1 :filterUsingPredicate] [:void :id]]
[:enum NSCaseInsensitivePredicateOption NSDiacriticInsensitivePredicateOption NSNormalizedPredicateOption NSComparisonPredicateOptions]
[:enum NSDirectPredicateModifier NSAllPredicateModifier NSAnyPredicateModifier NSComparisonPredicateModifier]
[:enum NSLessThanPredicateOperatorType NSLessThanOrEqualToPredicateOperatorType NSGreaterThanPredicateOperatorType NSGreaterThanOrEqualToPredicateOperatorType NSEqualToPredicateOperatorType NSNotEqualToPredicateOperatorType NSMatchesPredicateOperatorType NSLikePredicateOperatorType NSBeginsWithPredicateOperatorType NSEndsWithPredicateOperatorType NSInPredicateOperatorType NSCustomSelectorPredicateOperatorType NSContainsPredicateOperatorType NSBetweenPredicateOperatorType NSPredicateOperatorType]
[:selector [5 :predicateWithLeftExpression :rightExpression :modifier :type :options] [:id :id :id UIKit/NSComparisonPredicateModifier UIKit/NSPredicateOperatorType UIKit/NSComparisonPredicateOptions]]
[:selector [3 :predicateWithLeftExpression :rightExpression :customSelector] [:id :id :id :selector]]
[:selector [5 :initWithLeftExpression :rightExpression :modifier :type :options] [:id :id :id UIKit/NSComparisonPredicateModifier UIKit/NSPredicateOperatorType UIKit/NSComparisonPredicateOptions]]
[:selector [3 :initWithLeftExpression :rightExpression :customSelector] [:id :id :id :selector]]
[:selector [0 :predicateOperatorType] [UIKit/NSPredicateOperatorType]]
[:selector [0 :comparisonPredicateModifier] [UIKit/NSComparisonPredicateModifier]]
[:selector [0 :leftExpression] [:id]]
[:selector [0 :rightExpression] [:id]]
[:selector [0 :customSelector] [:selector]]
[:selector [0 :options] [UIKit/NSComparisonPredicateOptions]]
[:enum NSNotPredicateType NSAndPredicateType NSOrPredicateType NSCompoundPredicateType]
[:selector [2 :initWithType :subpredicates] [:id UIKit/NSCompoundPredicateType :id]]
[:selector [0 :compoundPredicateType] [UIKit/NSCompoundPredicateType]]
[:selector [0 :subpredicates] [:id]]
[:selector [1 :andPredicateWithSubpredicates] [:id :id]]
[:selector [1 :orPredicateWithSubpredicates] [:id :id]]
[:selector [1 :notPredicateWithSubpredicate] [:id :id]]
[:enum NSConstantValueExpressionType NSEvaluatedObjectExpressionType NSVariableExpressionType NSKeyPathExpressionType NSFunctionExpressionType NSUnionSetExpressionType NSIntersectSetExpressionType NSMinusSetExpressionType NSSubqueryExpressionType NSAggregateExpressionType NSBlockExpressionType NSExpressionType]
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
[:selector [1 :initWithExpressionType] [:id UIKit/NSExpressionType]]
[:selector [0 :expressionType] [UIKit/NSExpressionType]]
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
[:enum NSFileCoordinatorReadingWithoutChanges NSFileCoordinatorReadingResolvesSymbolicLink NSFileCoordinatorReadingOptions]
[:enum NSFileCoordinatorWritingForDeleting NSFileCoordinatorWritingForMoving NSFileCoordinatorWritingForMerging NSFileCoordinatorWritingForReplacing NSFileCoordinatorWritingOptions]
[:selector [1 :addFilePresenter] [:void :id]]
[:selector [1 :removeFilePresenter] [:void :id]]
[:selector [0 :filePresenters] [:id]]
[:selector [1 :initWithFilePresenter] [:id :id]]
;;FIXME: NSError ** in coordinateReadingItemAtURL:options:error:byAccessor:
;;FIXME: NSError ** in coordinateWritingItemAtURL:options:error:byAccessor:
;;FIXME: NSError ** in coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:
;;FIXME: NSError ** in coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:
;;FIXME: NSError ** in prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:
[:selector [2 :itemAtURL :willMoveToURL] [:void :id :id]]
[:selector [2 :itemAtURL :didMoveToURL] [:void :id :id]]
[:selector [0 :cancel] [:void]]
[:enum NSFileVersionAddingByMoving NSFileVersionAddingOptions]
[:enum NSFileVersionReplacingByMoving NSFileVersionReplacingOptions]
[:selector [1 :currentVersionOfItemAtURL] [:id :id]]
[:selector [1 :otherVersionsOfItemAtURL] [:id :id]]
[:selector [1 :unresolvedConflictVersionsOfItemAtURL] [:id :id]]
[:selector [2 :versionOfItemAtURL :forPersistentIdentifier] [:id :id :id]]
;;FIXME: NSError ** in addVersionOfItemAtURL:withContentsOfURL:options:error:
[:selector [1 :temporaryDirectoryURLForNewVersionOfItemAtURL] [:id :id]]
;;FIXME: NSError ** in replaceItemAtURL:options:error:
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
[:enum NSFileWrapperReadingImmediate NSFileWrapperReadingWithoutMapping NSFileWrapperReadingOptions]
[:enum NSFileWrapperWritingAtomic NSFileWrapperWritingWithNameUpdating NSFileWrapperWritingOptions]
;;FIXME: NSError ** in initWithURL:options:error:
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
;;FIXME: NSError ** in readFromURL:options:error:
;;FIXME: NSError ** in writeToURL:options:originalContentsURL:error:
[:selector [0 :serializedRepresentation] [:id]]
[:selector [1 :addFileWrapper] [:id :id]]
[:selector [2 :addRegularFileWithContents :preferredFilename] [:id :id :id]]
[:selector [1 :removeFileWrapper] [:void :id]]
[:selector [0 :fileWrappers] [:id]]
[:selector [1 :keyForFileWrapper] [:id :id]]
[:selector [0 :regularFileContents] [:id]]
[:selector [0 :symbolicLinkDestinationURL] [:id]]
[:enum NSLinguisticTaggerOmitWords NSLinguisticTaggerOmitPunctuation NSLinguisticTaggerOmitWhitespace NSLinguisticTaggerOmitOther NSLinguisticTaggerJoinNames NSLinguisticTaggerOptions]
[:selector [2 :initWithTagSchemes :options] [:id :id :unsigned-int]]
[:selector [0 :tagSchemes] [:id]]
[:selector [1 :setString] [:void :id]]
[:selector [0 :string] [:id]]
[:selector [1 :availableTagSchemesForLanguage] [:id :id]]
[:selector [2 :setOrthography :range] [:void :id UIKit/NSRange]]
;;FIXME: NSRangePointer in orthographyAtIndex:effectiveRange:
[:selector [2 :stringEditedInRange :changeInLength] [:void UIKit/NSRange :int]]
;;FIXME: void (^)(NSString *, NSRange, NSRange, BOOL *) in enumerateTagsInRange:scheme:options:usingBlock:
[:selector [1 :sentenceRangeForRange] [UIKit/NSRange UIKit/NSRange]]
;;FIXME: NSRangePointer in tagAtIndex:scheme:tokenRange:sentenceRange:
;;FIXME: NSArray ** in tagsInRange:scheme:options:tokenRanges:
;;FIXME: NSRangePointer in possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:
;;FIXME: NSArray ** in linguisticTagsInRange:scheme:options:orthography:tokenRanges:
;;FIXME: void (^)(NSString *, NSRange, NSRange, BOOL *) in enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:
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
[:selector [0 :resultCount] [:unsigned-int]]
[:selector [1 :resultAtIndex] [:id :unsigned-int]]
[:selector [0 :results] [:id]]
[:selector [1 :indexOfResult] [:unsigned-int :id]]
[:selector [0 :valueLists] [:id]]
[:selector [0 :groupedResults] [:id]]
[:selector [2 :valueOfAttribute :forResultAtIndex] [:id :id :unsigned-int]]
[:selector [1 :valueForAttribute] [:id :id]]
[:selector [1 :valuesForAttributes] [:id :id]]
[:selector [0 :attributes] [:id]]
[:selector [0 :attribute] [:id]]
[:selector [0 :value] [:id]]
[:selector [0 :count] [:unsigned-int]]
[:selector [0 :attribute] [:id]]
[:selector [0 :value] [:id]]
[:selector [0 :subgroups] [:id]]
[:selector [0 :resultCount] [:unsigned-int]]
[:selector [1 :resultAtIndex] [:id :unsigned-int]]
[:selector [0 :results] [:id]]
[:enum NSNetServicesUnknownError NSNetServicesCollisionError NSNetServicesNotFoundError NSNetServicesActivityInProgress NSNetServicesBadArgumentError NSNetServicesCancelledError NSNetServicesInvalidError NSNetServicesTimeoutError NSNetServicesError]
[:enum NSNetServiceNoAutoRename NSNetServiceOptions]
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
[:selector [0 :port] [:int]]
[:selector [0 :publish] [:void]]
[:selector [1 :publishWithOptions] [:void UIKit/NSNetServiceOptions]]
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
[:enum NSUbiquitousKeyValueStoreServerChange NSUbiquitousKeyValueStoreInitialSyncChange NSUbiquitousKeyValueStoreQuotaViolationChange NSUbiquitousKeyValueStoreAccountChange nil]
[:enum NSUndoCloseGroupingRunLoopOrdering nil]
[:selector [0 :beginUndoGrouping] [:void]]
[:selector [0 :endUndoGrouping] [:void]]
[:selector [0 :groupingLevel] [:int]]
[:selector [0 :disableUndoRegistration] [:void]]
[:selector [0 :enableUndoRegistration] [:void]]
[:selector [0 :isUndoRegistrationEnabled] [Boolean]]
[:selector [0 :groupsByEvent] [Boolean]]
[:selector [1 :setGroupsByEvent] [:void Boolean]]
[:selector [1 :setLevelsOfUndo] [:void :unsigned-int]]
[:selector [0 :levelsOfUndo] [:unsigned-int]]
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
[:selector [0 :UUID] [:id]]
[:selector [0 :init] [:id]]
[:selector [1 :initWithUUIDString] [:id :id]]
;;FIXME: const uuid_t in initWithUUIDBytes:
;;FIXME: uuid_t in getUUIDBytes:
[:selector [0 :UUIDString] [:id]]
[:selector [0 :timestamp] [:double]]
[:selector [0 :x] [:double]]
[:selector [0 :y] [:double]]
[:selector [0 :z] [:double]]
[:selector [0 :sharedAccelerometer] [:id]]
[:selector [0 :updateInterval] [:double]]
[:selector [1 :setUpdateInterval] [:void :double]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:compound CGAffineTransform "sizeof (CGAffineTransform)"]
[:compound CGPoint "sizeof (CGPoint)"]
[:compound CGSize "sizeof (CGSize)"]
[:compound CGRect "sizeof (CGRect)"]
[:enum CGRectMinXEdge CGRectMinYEdge CGRectMaxXEdge CGRectMaxYEdge CGRectEdge]
[:function CGPointMake [UIKit/CGPoint :float :float]]
[:function CGSizeMake [UIKit/CGSize :float :float]]
[:function CGRectMake [UIKit/CGRect :float :float :float :float]]
[:function CGRectGetMinX [:float UIKit/CGRect]]
[:function CGRectGetMidX [:float UIKit/CGRect]]
[:function CGRectGetMaxX [:float UIKit/CGRect]]
[:function CGRectGetMinY [:float UIKit/CGRect]]
[:function CGRectGetMidY [:float UIKit/CGRect]]
[:function CGRectGetMaxY [:float UIKit/CGRect]]
[:function CGRectGetWidth [:float UIKit/CGRect]]
[:function CGRectGetHeight [:float UIKit/CGRect]]
[:function CGPointEqualToPoint [Boolean UIKit/CGPoint UIKit/CGPoint]]
[:function CGSizeEqualToSize [Boolean UIKit/CGSize UIKit/CGSize]]
[:function CGRectEqualToRect [Boolean UIKit/CGRect UIKit/CGRect]]
[:function CGRectStandardize [UIKit/CGRect UIKit/CGRect]]
[:function CGRectIsEmpty [Boolean UIKit/CGRect]]
[:function CGRectIsNull [Boolean UIKit/CGRect]]
[:function CGRectIsInfinite [Boolean UIKit/CGRect]]
[:function CGRectInset [UIKit/CGRect UIKit/CGRect :float :float]]
[:function CGRectIntegral [UIKit/CGRect UIKit/CGRect]]
[:function CGRectUnion [UIKit/CGRect UIKit/CGRect UIKit/CGRect]]
[:function CGRectIntersection [UIKit/CGRect UIKit/CGRect UIKit/CGRect]]
[:function CGRectOffset [UIKit/CGRect UIKit/CGRect :float :float]]
;;FIXME: CGRect * in CGRectDivide
[:function CGRectContainsPoint [Boolean UIKit/CGRect UIKit/CGPoint]]
[:function CGRectContainsRect [Boolean UIKit/CGRect UIKit/CGRect]]
[:function CGRectIntersectsRect [Boolean UIKit/CGRect UIKit/CGRect]]
;;FIXME: CFDictionaryRef in CGPointCreateDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGPointMakeWithDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGSizeCreateDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGSizeMakeWithDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGRectCreateDictionaryRepresentation
;;FIXME: CFDictionaryRef in CGRectMakeWithDictionaryRepresentation
[:function CGPointMake [UIKit/CGPoint :float :float]]
[:function CGSizeMake [UIKit/CGSize :float :float]]
[:function CGRectMake [UIKit/CGRect :float :float :float :float]]
[:function __CGPointEqualToPoint [Boolean UIKit/CGPoint UIKit/CGPoint]]
[:function __CGSizeEqualToSize [Boolean UIKit/CGSize UIKit/CGSize]]
[:function CGAffineTransformMake [UIKit/CGAffineTransform :float :float :float :float :float :float]]
[:function CGAffineTransformMakeTranslation [UIKit/CGAffineTransform :float :float]]
[:function CGAffineTransformMakeScale [UIKit/CGAffineTransform :float :float]]
[:function CGAffineTransformMakeRotation [UIKit/CGAffineTransform :float]]
[:function CGAffineTransformIsIdentity [Boolean UIKit/CGAffineTransform]]
[:function CGAffineTransformTranslate [UIKit/CGAffineTransform UIKit/CGAffineTransform :float :float]]
[:function CGAffineTransformScale [UIKit/CGAffineTransform UIKit/CGAffineTransform :float :float]]
[:function CGAffineTransformRotate [UIKit/CGAffineTransform UIKit/CGAffineTransform :float]]
[:function CGAffineTransformInvert [UIKit/CGAffineTransform UIKit/CGAffineTransform]]
[:function CGAffineTransformConcat [UIKit/CGAffineTransform UIKit/CGAffineTransform UIKit/CGAffineTransform]]
[:function CGAffineTransformEqualToTransform [Boolean UIKit/CGAffineTransform UIKit/CGAffineTransform]]
[:function CGPointApplyAffineTransform [UIKit/CGPoint UIKit/CGPoint UIKit/CGAffineTransform]]
[:function CGSizeApplyAffineTransform [UIKit/CGSize UIKit/CGSize UIKit/CGAffineTransform]]
[:function CGRectApplyAffineTransform [UIKit/CGRect UIKit/CGRect UIKit/CGAffineTransform]]
[:function __CGAffineTransformMake [UIKit/CGAffineTransform :float :float :float :float :float :float]]
[:function __CGPointApplyAffineTransform [UIKit/CGPoint UIKit/CGPoint UIKit/CGAffineTransform]]
[:function __CGSizeApplyAffineTransform [UIKit/CGSize UIKit/CGSize UIKit/CGAffineTransform]]
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
[:enum kCGRenderingIntentDefault kCGRenderingIntentAbsoluteColorimetric kCGRenderingIntentRelativeColorimetric kCGRenderingIntentPerceptual kCGRenderingIntentSaturation CGColorRenderingIntent]
[:enum kCGColorSpaceModelUnknown kCGColorSpaceModelMonochrome kCGColorSpaceModelRGB kCGColorSpaceModelCMYK kCGColorSpaceModelLab kCGColorSpaceModelDeviceN kCGColorSpaceModelIndexed kCGColorSpaceModelPattern CGColorSpaceModel]
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
;;FIXME: CGColorSpaceRef in CGColorSpaceGetModel
;;FIXME: CGColorSpaceRef in CGColorSpaceGetBaseColorSpace
;;FIXME: CGColorSpaceRef in CGColorSpaceGetColorTableCount
;;FIXME: CGColorSpaceRef in CGColorSpaceGetColorTable
;;FIXME: CFDataRef in CGColorSpaceCopyICCProfile
[:enum kCGPatternTilingNoDistortion kCGPatternTilingConstantSpacingMinimalDistortion kCGPatternTilingConstantSpacing CGPatternTiling]
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
[:enum kCGFontPostScriptFormatType1 kCGFontPostScriptFormatType3 kCGFontPostScriptFormatType42 CGFontPostScriptFormat]
[:enum kCGFontIndexMax kCGFontIndexInvalid kCGGlyphMax nil]
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
[:enum CGGlyphMin CGGlyphMax nil]
[:enum kCGGradientDrawsBeforeStartLocation kCGGradientDrawsAfterEndLocation nil]
[:function CGGradientGetTypeID [:unsigned-long]]
;;FIXME: CGGradientRef in CGGradientCreateWithColorComponents
;;FIXME: CGGradientRef in CGGradientCreateWithColors
;;FIXME: CGGradientRef in CGGradientRetain
;;FIXME: CGGradientRef in CGGradientRelease
[:enum kCGImageAlphaNone kCGImageAlphaPremultipliedLast kCGImageAlphaPremultipliedFirst kCGImageAlphaLast kCGImageAlphaFirst kCGImageAlphaNoneSkipLast kCGImageAlphaNoneSkipFirst kCGImageAlphaOnly CGImageAlphaInfo]
[:enum kCGBitmapAlphaInfoMask kCGBitmapFloatComponents kCGBitmapByteOrderMask kCGBitmapByteOrderDefault kCGBitmapByteOrder16Little kCGBitmapByteOrder32Little kCGBitmapByteOrder16Big kCGBitmapByteOrder32Big nil]
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
;;FIXME: CGImageRef in CGImageGetAlphaInfo
;;FIXME: CGDataProviderRef in CGImageGetDataProvider
;;FIXME: const CGFloat * in CGImageGetDecode
;;FIXME: CGImageRef in CGImageGetShouldInterpolate
;;FIXME: CGImageRef in CGImageGetRenderingIntent
;;FIXME: CGImageRef in CGImageGetBitmapInfo
[:enum kCGLineJoinMiter kCGLineJoinRound kCGLineJoinBevel CGLineJoin]
[:enum kCGLineCapButt kCGLineCapRound kCGLineCapSquare CGLineCap]
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
[:enum kCGPathElementMoveToPoint kCGPathElementAddLineToPoint kCGPathElementAddQuadCurveToPoint kCGPathElementAddCurveToPoint kCGPathElementCloseSubpath CGPathElementType]
[:compound CGPathElement "sizeof (CGPathElement)"]
;;FIXME: CGPathRef in CGPathApply
[:enum kCGPDFObjectTypeNull kCGPDFObjectTypeBoolean kCGPDFObjectTypeInteger kCGPDFObjectTypeReal kCGPDFObjectTypeName kCGPDFObjectTypeString kCGPDFObjectTypeArray kCGPDFObjectTypeDictionary kCGPDFObjectTypeStream CGPDFObjectType]
;;FIXME: CGPDFObjectRef in CGPDFObjectGetType
;;FIXME: CGPDFObjectRef in CGPDFObjectGetValue
[:enum CGPDFDataFormatRaw CGPDFDataFormatJPEGEncoded CGPDFDataFormatJPEG2000 CGPDFDataFormat]
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
[:enum kCGPDFMediaBox kCGPDFCropBox kCGPDFBleedBox kCGPDFTrimBox kCGPDFArtBox CGPDFBox]
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
[:enum kCGPathFill kCGPathEOFill kCGPathStroke kCGPathFillStroke kCGPathEOFillStroke CGPathDrawingMode]
[:enum kCGTextFill kCGTextStroke kCGTextFillStroke kCGTextInvisible kCGTextFillClip kCGTextStrokeClip kCGTextFillStrokeClip kCGTextClip CGTextDrawingMode]
[:enum kCGEncodingFontSpecific kCGEncodingMacRoman CGTextEncoding]
[:enum kCGInterpolationDefault kCGInterpolationNone kCGInterpolationLow kCGInterpolationMedium kCGInterpolationHigh CGInterpolationQuality]
[:enum kCGBlendModeNormal kCGBlendModeMultiply kCGBlendModeScreen kCGBlendModeOverlay kCGBlendModeDarken kCGBlendModeLighten kCGBlendModeColorDodge kCGBlendModeColorBurn kCGBlendModeSoftLight kCGBlendModeHardLight kCGBlendModeDifference kCGBlendModeExclusion kCGBlendModeHue kCGBlendModeSaturation kCGBlendModeColor kCGBlendModeLuminosity kCGBlendModeClear kCGBlendModeCopy kCGBlendModeSourceIn kCGBlendModeSourceOut kCGBlendModeSourceAtop kCGBlendModeDestinationOver kCGBlendModeDestinationIn kCGBlendModeDestinationOut kCGBlendModeDestinationAtop kCGBlendModeXOR kCGBlendModePlusDarker kCGBlendModePlusLighter CGBlendMode]
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
;;FIXME: CGContextRef in CGContextGetInterpolationQuality
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
;;FIXME: CGContextRef in CGBitmapContextGetAlphaInfo
;;FIXME: CGContextRef in CGBitmapContextGetBitmapInfo
;;FIXME: CGImageRef in CGBitmapContextCreateImage
[:compound CGDataConsumerCallbacks "sizeof (CGDataConsumerCallbacks)"]
[:function CGDataConsumerGetTypeID [:unsigned-long]]
;;FIXME: CGDataConsumerRef in CGDataConsumerCreate
;;FIXME: CGDataConsumerRef in CGDataConsumerCreateWithURL
;;FIXME: CGDataConsumerRef in CGDataConsumerCreateWithCFData
;;FIXME: CGDataConsumerRef in CGDataConsumerRetain
;;FIXME: CGDataConsumerRef in CGDataConsumerRelease
[:enum kCGErrorSuccess kCGErrorFailure kCGErrorIllegalArgument kCGErrorInvalidConnection kCGErrorInvalidContext kCGErrorCannotComplete kCGErrorNotImplemented kCGErrorRangeCheck kCGErrorTypeCheck kCGErrorInvalidOperation kCGErrorNoneAvailable _CGError]
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
[:enum UIEventTypeTouches UIEventTypeMotion UIEventTypeRemoteControl UIEventType]
[:enum UIEventSubtypeNone UIEventSubtypeMotionShake UIEventSubtypeRemoteControlPlay UIEventSubtypeRemoteControlPause UIEventSubtypeRemoteControlStop UIEventSubtypeRemoteControlTogglePlayPause UIEventSubtypeRemoteControlNextTrack UIEventSubtypeRemoteControlPreviousTrack UIEventSubtypeRemoteControlBeginSeekingBackward UIEventSubtypeRemoteControlEndSeekingBackward UIEventSubtypeRemoteControlBeginSeekingForward UIEventSubtypeRemoteControlEndSeekingForward UIEventSubtype]
[:selector [0 :allTouches] [:id]]
[:selector [1 :touchesForWindow] [:id :id]]
[:selector [1 :touchesForView] [:id :id]]
[:selector [1 :touchesForGestureRecognizer] [:id :id]]
[:selector [0 :type] [UIKit/UIEventType]]
[:selector [0 :subtype] [UIKit/UIEventSubtype]]
[:selector [0 :timestamp] [:double]]
[:selector [0 :nextResponder] [:id]]
[:selector [0 :canBecomeFirstResponder] [Boolean]]
[:selector [0 :becomeFirstResponder] [Boolean]]
[:selector [0 :canResignFirstResponder] [Boolean]]
[:selector [0 :resignFirstResponder] [Boolean]]
[:selector [0 :isFirstResponder] [Boolean]]
[:selector [2 :touchesBegan :withEvent] [:void :id :id]]
[:selector [2 :touchesMoved :withEvent] [:void :id :id]]
[:selector [2 :touchesEnded :withEvent] [:void :id :id]]
[:selector [2 :touchesCancelled :withEvent] [:void :id :id]]
[:selector [2 :motionBegan :withEvent] [:void UIKit/UIEventSubtype :id]]
[:selector [2 :motionEnded :withEvent] [:void UIKit/UIEventSubtype :id]]
[:selector [2 :motionCancelled :withEvent] [:void UIKit/UIEventSubtype :id]]
[:selector [1 :remoteControlReceivedWithEvent] [:void :id]]
[:selector [2 :canPerformAction :withSender] [Boolean :selector :id]]
[:selector [0 :undoManager] [:id]]
[:selector [1 :cut] [:void :id]]
[:selector [1 :copy] [:void :id]]
[:selector [1 :paste] [:void :id]]
[:selector [1 :select] [:void :id]]
[:selector [1 :selectAll] [:void :id]]
[:selector [1 :delete] [:void :id]]
[:selector [1 :makeTextWritingDirectionLeftToRight] [:void :id]]
[:selector [1 :makeTextWritingDirectionRightToLeft] [:void :id]]
[:selector [1 :toggleBoldface] [:void :id]]
[:selector [1 :toggleItalics] [:void :id]]
[:selector [1 :toggleUnderline] [:void :id]]
[:selector [0 :reloadInputViews] [:void]]
[:selector [0 :inputView] [:id]]
[:selector [0 :inputAccessoryView] [:id]]
;;FIXME: CGColorRef in colorWithCGColor:
[:selector [4 :colorWithRed :green :blue :alpha] [:id :float :float :float :float]]
[:selector [3 :colorWithRed :green :blue] [:id :float :float :float]]
[:selector [1 :colorWithString] [:id :id]]
;;FIXME: CGColorRef in initWithCGColor:
[:selector [0 :numberOfComponents] [:unsigned-long]]
;;FIXME: const CGFloat * in components
[:selector [0 :alpha] [:float]]
;;FIXME: CGColorSpaceRef in colorSpace
[:selector [0 :red] [:float]]
[:selector [0 :green] [:float]]
[:selector [0 :blue] [:float]]
[:selector [0 :stringRepresentation] [:id]]
[:compound CVSMPTETime "sizeof (CVSMPTETime)"]
[:enum kCVSMPTETimeType24 kCVSMPTETimeType25 kCVSMPTETimeType30Drop kCVSMPTETimeType30 kCVSMPTETimeType2997 kCVSMPTETimeType2997Drop kCVSMPTETimeType60 kCVSMPTETimeType5994 nil]
[:enum kCVSMPTETimeValid kCVSMPTETimeRunning nil]
[:enum kCVTimeIsIndefinite nil]
[:compound CVTime "sizeof (CVTime)"]
[:compound CVTimeStamp "sizeof (CVTimeStamp)"]
[:enum kCVTimeStampVideoTimeValid kCVTimeStampHostTimeValid kCVTimeStampSMPTETimeValid kCVTimeStampVideoRefreshPeriodValid kCVTimeStampRateScalarValid kCVTimeStampTopField kCVTimeStampBottomField nil]
[:enum kCVTimeStampVideoHostTimeValid kCVTimeStampIsInterlaced nil]
[:enum kCVReturnSuccess kCVReturnFirst kCVReturnError kCVReturnInvalidArgument kCVReturnAllocationFailed kCVReturnInvalidDisplay kCVReturnDisplayLinkAlreadyRunning kCVReturnDisplayLinkNotRunning kCVReturnDisplayLinkCallbacksNotSet kCVReturnInvalidPixelFormat kCVReturnInvalidSize kCVReturnInvalidPixelBufferAttributes kCVReturnPixelBufferNotOpenGLCompatible kCVReturnWouldExceedAllocationThreshold kCVReturnPoolAllocationFailed kCVReturnInvalidPoolAttributes kCVReturnLast _CVReturn]
[:enum kCVAttachmentMode_ShouldNotPropagate kCVAttachmentMode_ShouldPropagate nil]
;;FIXME: CVBufferRef in CVBufferRetain
;;FIXME: CVBufferRef in CVBufferRelease
;;FIXME: CVBufferRef in CVBufferSetAttachment
;;FIXME: CFTypeRef in CVBufferGetAttachment
;;FIXME: CVBufferRef in CVBufferRemoveAttachment
;;FIXME: CVBufferRef in CVBufferRemoveAllAttachments
;;FIXME: CFDictionaryRef in CVBufferGetAttachments
;;FIXME: CVBufferRef in CVBufferSetAttachments
;;FIXME: CVBufferRef in CVBufferPropagateAttachments
;;FIXME: CVImageBufferRef in CVImageBufferGetEncodedSize
;;FIXME: CVImageBufferRef in CVImageBufferGetDisplaySize
;;FIXME: CVImageBufferRef in CVImageBufferGetCleanRect
;;FIXME: CVImageBufferRef in CVImageBufferIsFlipped
[:enum kCVPixelFormatType_1Monochrome kCVPixelFormatType_2Indexed kCVPixelFormatType_4Indexed kCVPixelFormatType_8Indexed kCVPixelFormatType_1IndexedGray_WhiteIsZero kCVPixelFormatType_2IndexedGray_WhiteIsZero kCVPixelFormatType_4IndexedGray_WhiteIsZero kCVPixelFormatType_8IndexedGray_WhiteIsZero kCVPixelFormatType_16BE555 kCVPixelFormatType_16LE555 kCVPixelFormatType_16LE5551 kCVPixelFormatType_16BE565 kCVPixelFormatType_16LE565 kCVPixelFormatType_24RGB kCVPixelFormatType_24BGR kCVPixelFormatType_32ARGB kCVPixelFormatType_32BGRA kCVPixelFormatType_32ABGR kCVPixelFormatType_32RGBA kCVPixelFormatType_64ARGB kCVPixelFormatType_48RGB kCVPixelFormatType_32AlphaGray kCVPixelFormatType_16Gray kCVPixelFormatType_30RGB kCVPixelFormatType_422YpCbCr8 kCVPixelFormatType_4444YpCbCrA8 kCVPixelFormatType_4444YpCbCrA8R kCVPixelFormatType_4444AYpCbCr8 kCVPixelFormatType_4444AYpCbCr16 kCVPixelFormatType_444YpCbCr8 kCVPixelFormatType_422YpCbCr16 kCVPixelFormatType_422YpCbCr10 kCVPixelFormatType_444YpCbCr10 kCVPixelFormatType_420YpCbCr8Planar kCVPixelFormatType_420YpCbCr8PlanarFullRange kCVPixelFormatType_422YpCbCr_4A_8BiPlanar kCVPixelFormatType_420YpCbCr8BiPlanarVideoRange kCVPixelFormatType_420YpCbCr8BiPlanarFullRange kCVPixelFormatType_422YpCbCr8_yuvs kCVPixelFormatType_422YpCbCr8FullRange kCVPixelFormatType_OneComponent8 kCVPixelFormatType_TwoComponent8 kCVPixelFormatType_OneComponent16Half kCVPixelFormatType_OneComponent32Float kCVPixelFormatType_TwoComponent16Half kCVPixelFormatType_TwoComponent32Float kCVPixelFormatType_64RGBAHalf kCVPixelFormatType_128RGBAFloat nil]
[:enum kCVPixelBufferLock_ReadOnly CVPixelBufferLockFlags]
[:compound CVPlanarComponentInfo "sizeof (CVPlanarComponentInfo)"]
[:compound CVPlanarPixelBufferInfo "sizeof (CVPlanarPixelBufferInfo)"]
[:compound CVPlanarPixelBufferInfo_YCbCrPlanar "sizeof (CVPlanarPixelBufferInfo_YCbCrPlanar)"]
[:compound CVPlanarPixelBufferInfo_YCbCrBiPlanar "sizeof (CVPlanarPixelBufferInfo_YCbCrBiPlanar)"]
[:function CVPixelBufferGetTypeID [:unsigned-long]]
;;FIXME: CVPixelBufferRef in CVPixelBufferRetain
;;FIXME: CVPixelBufferRef in CVPixelBufferRelease
;;FIXME: CFAllocatorRef in CVPixelBufferCreateResolvedAttributesDictionary
;;FIXME: CFAllocatorRef in CVPixelBufferCreate
;;FIXME: CFAllocatorRef in CVPixelBufferCreateWithBytes
;;FIXME: CFAllocatorRef in CVPixelBufferCreateWithPlanarBytes
;;FIXME: CVPixelBufferRef in CVPixelBufferLockBaseAddress
;;FIXME: CVPixelBufferRef in CVPixelBufferUnlockBaseAddress
;;FIXME: CVPixelBufferRef in CVPixelBufferGetWidth
;;FIXME: CVPixelBufferRef in CVPixelBufferGetHeight
;;FIXME: CVPixelBufferRef in CVPixelBufferGetPixelFormatType
;;FIXME: void * in CVPixelBufferGetBaseAddress
;;FIXME: CVPixelBufferRef in CVPixelBufferGetBytesPerRow
;;FIXME: CVPixelBufferRef in CVPixelBufferGetDataSize
;;FIXME: CVPixelBufferRef in CVPixelBufferIsPlanar
;;FIXME: CVPixelBufferRef in CVPixelBufferGetPlaneCount
;;FIXME: CVPixelBufferRef in CVPixelBufferGetWidthOfPlane
;;FIXME: CVPixelBufferRef in CVPixelBufferGetHeightOfPlane
;;FIXME: void * in CVPixelBufferGetBaseAddressOfPlane
;;FIXME: CVPixelBufferRef in CVPixelBufferGetBytesPerRowOfPlane
;;FIXME: CVPixelBufferRef in CVPixelBufferGetExtendedPixels
;;FIXME: CVPixelBufferRef in CVPixelBufferFillExtendedPixels
[:function CVPixelBufferPoolGetTypeID [:unsigned-long]]
;;FIXME: CVPixelBufferPoolRef in CVPixelBufferPoolRetain
;;FIXME: CVPixelBufferPoolRef in CVPixelBufferPoolRelease
;;FIXME: CFAllocatorRef in CVPixelBufferPoolCreate
;;FIXME: CFDictionaryRef in CVPixelBufferPoolGetAttributes
;;FIXME: CFDictionaryRef in CVPixelBufferPoolGetPixelBufferAttributes
;;FIXME: CFAllocatorRef in CVPixelBufferPoolCreatePixelBuffer
;;FIXME: CFAllocatorRef in CVPixelBufferPoolCreatePixelBufferWithAuxAttributes
[:function glActiveTexture [:void :unsigned-int]]
[:function glAttachShader [:void :unsigned-int :unsigned-int]]
;;FIXME: const GLchar * in glBindAttribLocation
[:function glBindBuffer [:void :unsigned-int :unsigned-int]]
[:function glBindFramebuffer [:void :unsigned-int :unsigned-int]]
[:function glBindRenderbuffer [:void :unsigned-int :unsigned-int]]
[:function glBindTexture [:void :unsigned-int :unsigned-int]]
[:function glBlendColor [:void :float :float :float :float]]
[:function glBlendEquation [:void :unsigned-int]]
[:function glBlendEquationSeparate [:void :unsigned-int :unsigned-int]]
[:function glBlendFunc [:void :unsigned-int :unsigned-int]]
[:function glBlendFuncSeparate [:void :unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: const GLvoid * in glBufferData
;;FIXME: const GLvoid * in glBufferSubData
[:function glCheckFramebufferStatus [:unsigned-int :unsigned-int]]
[:function glClear [:void :unsigned-int]]
[:function glClearColor [:void :float :float :float :float]]
[:function glClearDepthf [:void :float]]
[:function glClearStencil [:void :int]]
[:function glColorMask [:void :unsigned-char :unsigned-char :unsigned-char :unsigned-char]]
[:function glCompileShader [:void :unsigned-int]]
;;FIXME: const GLvoid * in glCompressedTexImage2D
;;FIXME: const GLvoid * in glCompressedTexSubImage2D
[:function glCopyTexImage2D [:void :unsigned-int :int :unsigned-int :int :int :int :int :int]]
[:function glCopyTexSubImage2D [:void :unsigned-int :int :int :int :int :int :int :int]]
[:function glCreateProgram [:unsigned-int]]
[:function glCreateShader [:unsigned-int :unsigned-int]]
[:function glCullFace [:void :unsigned-int]]
;;FIXME: const GLuint * in glDeleteBuffers
;;FIXME: const GLuint * in glDeleteFramebuffers
[:function glDeleteProgram [:void :unsigned-int]]
;;FIXME: const GLuint * in glDeleteRenderbuffers
[:function glDeleteShader [:void :unsigned-int]]
;;FIXME: const GLuint * in glDeleteTextures
[:function glDepthFunc [:void :unsigned-int]]
[:function glDepthMask [:void :unsigned-char]]
[:function glDepthRangef [:void :float :float]]
[:function glDetachShader [:void :unsigned-int :unsigned-int]]
[:function glDisable [:void :unsigned-int]]
[:function glDisableVertexAttribArray [:void :unsigned-int]]
[:function glDrawArrays [:void :unsigned-int :int :int]]
;;FIXME: const GLvoid * in glDrawElements
[:function glEnable [:void :unsigned-int]]
[:function glEnableVertexAttribArray [:void :unsigned-int]]
[:function glFinish [:void]]
[:function glFlush [:void]]
[:function glFramebufferRenderbuffer [:void :unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
[:function glFramebufferTexture2D [:void :unsigned-int :unsigned-int :unsigned-int :unsigned-int :int]]
[:function glFrontFace [:void :unsigned-int]]
;;FIXME: GLuint * in glGenBuffers
[:function glGenerateMipmap [:void :unsigned-int]]
;;FIXME: GLuint * in glGenFramebuffers
;;FIXME: GLuint * in glGenRenderbuffers
;;FIXME: GLuint * in glGenTextures
;;FIXME: GLsizei * in glGetActiveAttrib
;;FIXME: GLsizei * in glGetActiveUniform
;;FIXME: GLsizei * in glGetAttachedShaders
;;FIXME: const GLchar * in glGetAttribLocation
;;FIXME: GLboolean * in glGetBooleanv
;;FIXME: GLint * in glGetBufferParameteriv
[:function glGetError [:unsigned-int]]
;;FIXME: GLfloat * in glGetFloatv
;;FIXME: GLint * in glGetFramebufferAttachmentParameteriv
;;FIXME: GLint * in glGetIntegerv
;;FIXME: GLint * in glGetProgramiv
;;FIXME: GLsizei * in glGetProgramInfoLog
;;FIXME: GLint * in glGetRenderbufferParameteriv
;;FIXME: GLint * in glGetShaderiv
;;FIXME: GLsizei * in glGetShaderInfoLog
;;FIXME: GLint * in glGetShaderPrecisionFormat
;;FIXME: GLsizei * in glGetShaderSource
;;FIXME: const GLubyte * in glGetString
;;FIXME: GLfloat * in glGetTexParameterfv
;;FIXME: GLint * in glGetTexParameteriv
;;FIXME: GLfloat * in glGetUniformfv
;;FIXME: GLint * in glGetUniformiv
;;FIXME: const GLchar * in glGetUniformLocation
;;FIXME: GLfloat * in glGetVertexAttribfv
;;FIXME: GLint * in glGetVertexAttribiv
;;FIXME: GLvoid ** in glGetVertexAttribPointerv
[:function glHint [:void :unsigned-int :unsigned-int]]
[:function glIsBuffer [:unsigned-char :unsigned-int]]
[:function glIsEnabled [:unsigned-char :unsigned-int]]
[:function glIsFramebuffer [:unsigned-char :unsigned-int]]
[:function glIsProgram [:unsigned-char :unsigned-int]]
[:function glIsRenderbuffer [:unsigned-char :unsigned-int]]
[:function glIsShader [:unsigned-char :unsigned-int]]
[:function glIsTexture [:unsigned-char :unsigned-int]]
[:function glLineWidth [:void :float]]
[:function glLinkProgram [:void :unsigned-int]]
[:function glPixelStorei [:void :unsigned-int :int]]
[:function glPolygonOffset [:void :float :float]]
;;FIXME: GLvoid * in glReadPixels
[:function glReleaseShaderCompiler [:void]]
[:function glRenderbufferStorage [:void :unsigned-int :unsigned-int :int :int]]
[:function glSampleCoverage [:void :float :unsigned-char]]
[:function glScissor [:void :int :int :int :int]]
;;FIXME: const GLuint * in glShaderBinary
;;FIXME: const GLchar ** in glShaderSource
[:function glStencilFunc [:void :unsigned-int :int :unsigned-int]]
[:function glStencilFuncSeparate [:void :unsigned-int :unsigned-int :int :unsigned-int]]
[:function glStencilMask [:void :unsigned-int]]
[:function glStencilMaskSeparate [:void :unsigned-int :unsigned-int]]
[:function glStencilOp [:void :unsigned-int :unsigned-int :unsigned-int]]
[:function glStencilOpSeparate [:void :unsigned-int :unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: const GLvoid * in glTexImage2D
[:function glTexParameterf [:void :unsigned-int :unsigned-int :float]]
;;FIXME: const GLfloat * in glTexParameterfv
[:function glTexParameteri [:void :unsigned-int :unsigned-int :int]]
;;FIXME: const GLint * in glTexParameteriv
;;FIXME: const GLvoid * in glTexSubImage2D
[:function glUniform1f [:void :int :float]]
;;FIXME: const GLfloat * in glUniform1fv
[:function glUniform1i [:void :int :int]]
;;FIXME: const GLint * in glUniform1iv
[:function glUniform2f [:void :int :float :float]]
;;FIXME: const GLfloat * in glUniform2fv
[:function glUniform2i [:void :int :int :int]]
;;FIXME: const GLint * in glUniform2iv
[:function glUniform3f [:void :int :float :float :float]]
;;FIXME: const GLfloat * in glUniform3fv
[:function glUniform3i [:void :int :int :int :int]]
;;FIXME: const GLint * in glUniform3iv
[:function glUniform4f [:void :int :float :float :float :float]]
;;FIXME: const GLfloat * in glUniform4fv
[:function glUniform4i [:void :int :int :int :int :int]]
;;FIXME: const GLint * in glUniform4iv
;;FIXME: const GLfloat * in glUniformMatrix2fv
;;FIXME: const GLfloat * in glUniformMatrix3fv
;;FIXME: const GLfloat * in glUniformMatrix4fv
[:function glUseProgram [:void :unsigned-int]]
[:function glValidateProgram [:void :unsigned-int]]
[:function glVertexAttrib1f [:void :unsigned-int :float]]
;;FIXME: const GLfloat * in glVertexAttrib1fv
[:function glVertexAttrib2f [:void :unsigned-int :float :float]]
;;FIXME: const GLfloat * in glVertexAttrib2fv
[:function glVertexAttrib3f [:void :unsigned-int :float :float :float]]
;;FIXME: const GLfloat * in glVertexAttrib3fv
[:function glVertexAttrib4f [:void :unsigned-int :float :float :float :float]]
;;FIXME: const GLfloat * in glVertexAttrib4fv
;;FIXME: const GLvoid * in glVertexAttribPointer
[:function glViewport [:void :int :int :int :int]]
[:function glCopyTextureLevelsAPPLE [:void :unsigned-int :unsigned-int :int :int]]
[:function glRenderbufferStorageMultisampleAPPLE [:void :unsigned-int :int :unsigned-int :int :int]]
[:function glResolveMultisampleFramebufferAPPLE [:void]]
;;FIXME: GLsync in glFenceSyncAPPLE
;;FIXME: GLsync in glIsSyncAPPLE
;;FIXME: GLsync in glDeleteSyncAPPLE
;;FIXME: GLsync in glClientWaitSyncAPPLE
;;FIXME: GLsync in glWaitSyncAPPLE
;;FIXME: GLint64 * in glGetInteger64vAPPLE
;;FIXME: GLsync in glGetSyncivAPPLE
;;FIXME: const GLchar * in glLabelObjectEXT
;;FIXME: GLsizei * in glGetObjectLabelEXT
;;FIXME: const GLchar * in glInsertEventMarkerEXT
;;FIXME: const GLchar * in glPushGroupMarkerEXT
[:function glPopGroupMarkerEXT [:void]]
;;FIXME: const GLenum * in glDiscardFramebufferEXT
;;FIXME: GLvoid * in glMapBufferRangeEXT
[:function glFlushMappedBufferRangeEXT [:void :unsigned-int :long :long]]
;;FIXME: GLuint * in glGenQueriesEXT
;;FIXME: const GLuint * in glDeleteQueriesEXT
[:function glIsQueryEXT [:unsigned-char :unsigned-int]]
[:function glBeginQueryEXT [:void :unsigned-int :unsigned-int]]
[:function glEndQueryEXT [:void :unsigned-int]]
;;FIXME: GLint * in glGetQueryivEXT
;;FIXME: GLuint * in glGetQueryObjectuivEXT
[:function glUseProgramStagesEXT [:void :unsigned-int :unsigned-int :unsigned-int]]
[:function glActiveShaderProgramEXT [:void :unsigned-int :unsigned-int]]
;;FIXME: const GLchar ** in glCreateShaderProgramvEXT
[:function glBindProgramPipelineEXT [:void :unsigned-int]]
;;FIXME: const GLuint * in glDeleteProgramPipelinesEXT
;;FIXME: GLuint * in glGenProgramPipelinesEXT
[:function glIsProgramPipelineEXT [:unsigned-char :unsigned-int]]
[:function glProgramParameteriEXT [:void :unsigned-int :unsigned-int :int]]
;;FIXME: GLint * in glGetProgramPipelineivEXT
[:function glValidateProgramPipelineEXT [:void :unsigned-int]]
;;FIXME: GLsizei * in glGetProgramPipelineInfoLogEXT
[:function glProgramUniform1iEXT [:void :unsigned-int :int :int]]
[:function glProgramUniform2iEXT [:void :unsigned-int :int :int :int]]
[:function glProgramUniform3iEXT [:void :unsigned-int :int :int :int :int]]
[:function glProgramUniform4iEXT [:void :unsigned-int :int :int :int :int :int]]
[:function glProgramUniform1fEXT [:void :unsigned-int :int :float]]
[:function glProgramUniform2fEXT [:void :unsigned-int :int :float :float]]
[:function glProgramUniform3fEXT [:void :unsigned-int :int :float :float :float]]
[:function glProgramUniform4fEXT [:void :unsigned-int :int :float :float :float :float]]
;;FIXME: const GLint * in glProgramUniform1ivEXT
;;FIXME: const GLint * in glProgramUniform2ivEXT
;;FIXME: const GLint * in glProgramUniform3ivEXT
;;FIXME: const GLint * in glProgramUniform4ivEXT
;;FIXME: const GLfloat * in glProgramUniform1fvEXT
;;FIXME: const GLfloat * in glProgramUniform2fvEXT
;;FIXME: const GLfloat * in glProgramUniform3fvEXT
;;FIXME: const GLfloat * in glProgramUniform4fvEXT
;;FIXME: const GLfloat * in glProgramUniformMatrix2fvEXT
;;FIXME: const GLfloat * in glProgramUniformMatrix3fvEXT
;;FIXME: const GLfloat * in glProgramUniformMatrix4fvEXT
[:function glTexStorage2DEXT [:void :unsigned-int :int :unsigned-int :int :int]]
;;FIXME: GLvoid ** in glGetBufferPointervOES
;;FIXME: GLvoid * in glMapBufferOES
[:function glUnmapBufferOES [:unsigned-char :unsigned-int]]
[:function glBindVertexArrayOES [:void :unsigned-int]]
;;FIXME: const GLuint * in glDeleteVertexArraysOES
;;FIXME: GLuint * in glGenVertexArraysOES
[:function glIsVertexArrayOES [:unsigned-char :unsigned-int]]
[:function CVOpenGLESTextureGetTypeID [:unsigned-long]]
;;FIXME: CVOpenGLESTextureRef in CVOpenGLESTextureGetTarget
;;FIXME: CVOpenGLESTextureRef in CVOpenGLESTextureGetName
;;FIXME: CVOpenGLESTextureRef in CVOpenGLESTextureIsFlipped
;;FIXME: CVOpenGLESTextureRef in CVOpenGLESTextureGetCleanTexCoords
[:function CVOpenGLESTextureCacheGetTypeID [:unsigned-long]]
;;FIXME: CFAllocatorRef in CVOpenGLESTextureCacheCreate
;;FIXME: CFAllocatorRef in CVOpenGLESTextureCacheCreateTextureFromImage
;;FIXME: CVOpenGLESTextureCacheRef in CVOpenGLESTextureCacheFlush
[:compound CVFillExtendedPixelsCallBackData "sizeof (CVFillExtendedPixelsCallBackData)"]
;;FIXME: CFDictionaryRef in CVPixelFormatDescriptionCreateWithPixelFormatType
;;FIXME: CFArrayRef in CVPixelFormatDescriptionArrayCreateWithAllPixelFormatTypes
;;FIXME: CFDictionaryRef in CVPixelFormatDescriptionRegisterDescriptionWithPixelFormatType
;;FIXME: CGImageRef in imageWithCGImage:
;;FIXME: CGImageRef in imageWithCGImage:options:
;;FIXME: CGLayerRef in imageWithCGLayer:
;;FIXME: CGLayerRef in imageWithCGLayer:options:
;;FIXME: CGColorSpaceRef in imageWithBitmapData:bytesPerRow:size:format:colorSpace:
;;FIXME: CGColorSpaceRef in imageWithTexture:size:flipped:colorSpace:
[:selector [1 :imageWithContentsOfURL] [:id :id]]
[:selector [2 :imageWithContentsOfURL :options] [:id :id :id]]
[:selector [1 :imageWithData] [:id :id]]
[:selector [2 :imageWithData :options] [:id :id :id]]
;;FIXME: CVImageBufferRef in imageWithCVImageBuffer:
;;FIXME: CVImageBufferRef in imageWithCVImageBuffer:options:
;;FIXME: CVPixelBufferRef in imageWithCVPixelBuffer:
;;FIXME: CVPixelBufferRef in imageWithCVPixelBuffer:options:
[:selector [1 :imageWithColor] [:id :id]]
[:selector [0 :emptyImage] [:id]]
;;FIXME: CGImageRef in initWithCGImage:
;;FIXME: CGImageRef in initWithCGImage:options:
;;FIXME: CGLayerRef in initWithCGLayer:
;;FIXME: CGLayerRef in initWithCGLayer:options:
[:selector [1 :initWithData] [:id :id]]
[:selector [2 :initWithData :options] [:id :id :id]]
;;FIXME: CGColorSpaceRef in initWithBitmapData:bytesPerRow:size:format:colorSpace:
;;FIXME: CGColorSpaceRef in initWithTexture:size:flipped:colorSpace:
[:selector [1 :initWithContentsOfURL] [:id :id]]
[:selector [2 :initWithContentsOfURL :options] [:id :id :id]]
;;FIXME: CVImageBufferRef in initWithCVImageBuffer:
;;FIXME: CVImageBufferRef in initWithCVImageBuffer:options:
;;FIXME: CVPixelBufferRef in initWithCVPixelBuffer:
;;FIXME: CVPixelBufferRef in initWithCVPixelBuffer:options:
[:selector [1 :initWithColor] [:id :id]]
[:selector [1 :imageByApplyingTransform] [:id UIKit/CGAffineTransform]]
[:selector [1 :imageByCroppingToRect] [:id UIKit/CGRect]]
[:selector [0 :extent] [UIKit/CGRect]]
[:selector [0 :properties] [:id]]
[:selector [0 :definition] [:id]]
[:selector [0 :url] [:id]]
;;FIXME: CGColorSpaceRef in colorSpace
[:selector [0 :autoAdjustmentFilters] [:id]]
[:selector [1 :autoAdjustmentFiltersWithOptions] [:id :id]]
[:enum kEAGLRenderingAPIOpenGLES1 kEAGLRenderingAPIOpenGLES2 nil]
;;FIXME: unsigned int * in EAGLGetVersion
[:selector [0 :debugLabel] [:id]]
[:selector [1 :setDebugLabel] [:void :id]]
[:selector [1 :initWithAPI] [:id :unsigned-int]]
[:selector [2 :initWithAPI :sharegroup] [:id :unsigned-int :id]]
[:selector [1 :setCurrentContext] [Boolean :id]]
[:selector [0 :currentContext] [:id]]
[:selector [0 :API] [:unsigned-int]]
[:selector [0 :sharegroup] [:id]]
[:selector [0 :debugLabel] [:id]]
[:selector [1 :setDebugLabel] [:void :id]]
;;FIXME: CGContextRef in contextWithCGContext:options:
[:selector [1 :contextWithOptions] [:id :id]]
[:selector [1 :contextWithEAGLContext] [:id :id]]
[:selector [2 :contextWithEAGLContext :options] [:id :id :id]]
[:selector [3 :drawImage :atPoint :fromRect] [:void :id UIKit/CGPoint UIKit/CGRect]]
[:selector [3 :drawImage :inRect :fromRect] [:void :id UIKit/CGRect UIKit/CGRect]]
;;FIXME: CGImageRef in createCGImage:fromRect:
;;FIXME: CGImageRef in createCGImage:fromRect:format:colorSpace:
;;FIXME: CGLayerRef in createCGLayerWithSize:info:
;;FIXME: void * in render:toBitmap:rowBytes:bounds:format:colorSpace:
;;FIXME: CVPixelBufferRef in render:toCVPixelBuffer:
;;FIXME: CVPixelBufferRef in render:toCVPixelBuffer:bounds:colorSpace:
[:selector [0 :reclaimResources] [:void]]
[:selector [0 :clearCaches] [:void]]
[:selector [0 :inputImageMaximumSize] [UIKit/CGSize]]
[:selector [0 :outputImageMaximumSize] [UIKit/CGSize]]
[:selector [0 :name] [:id]]
[:selector [0 :inputKeys] [:id]]
[:selector [0 :outputKeys] [:id]]
[:selector [0 :setDefaults] [:void]]
[:selector [0 :attributes] [:id]]
[:selector [3 :apply :arguments :options] [:id :id :id :id]]
;;FIXME: variadic apply:
[:selector [0 :outputImage] [:id]]
[:selector [1 :filterWithName] [:id :id]]
;;FIXME: variadic filterWithName:keysAndValues:
[:selector [1 :filterNamesInCategory] [:id :id]]
[:selector [1 :filterNamesInCategories] [:id :id]]
[:selector [3 :registerFilterName :constructor :classAttributes] [:void :id :id :id]]
[:selector [1 :localizedNameForFilterName] [:id :id]]
[:selector [1 :localizedNameForCategory] [:id :id]]
[:selector [1 :localizedDescriptionForFilterName] [:id :id]]
[:selector [1 :localizedReferenceDocumentationForFilterName] [:id :id]]
[:selector [2 :serializedXMPFromFilters :inputImageExtent] [:id :id UIKit/CGRect]]
;;FIXME: NSError ** in filterArrayFromSerializedXMP:inputImageExtent:error:
;;FIXME: const CGFloat * in vectorWithValues:count:
[:selector [1 :vectorWithX] [:id :float]]
[:selector [2 :vectorWithX :Y] [:id :float :float]]
[:selector [3 :vectorWithX :Y :Z] [:id :float :float :float]]
[:selector [4 :vectorWithX :Y :Z :W] [:id :float :float :float :float]]
[:selector [1 :vectorWithCGPoint] [:id UIKit/CGPoint]]
[:selector [1 :vectorWithCGRect] [:id UIKit/CGRect]]
[:selector [1 :vectorWithCGAffineTransform] [:id UIKit/CGAffineTransform]]
[:selector [1 :vectorWithString] [:id :id]]
;;FIXME: const CGFloat * in initWithValues:count:
[:selector [1 :initWithX] [:id :float]]
[:selector [2 :initWithX :Y] [:id :float :float]]
[:selector [3 :initWithX :Y :Z] [:id :float :float :float]]
[:selector [4 :initWithX :Y :Z :W] [:id :float :float :float :float]]
[:selector [1 :initWithCGPoint] [:id UIKit/CGPoint]]
[:selector [1 :initWithCGRect] [:id UIKit/CGRect]]
[:selector [1 :initWithCGAffineTransform] [:id UIKit/CGAffineTransform]]
[:selector [1 :initWithString] [:id :id]]
[:selector [1 :valueAtIndex] [:float :unsigned-long]]
[:selector [0 :count] [:unsigned-long]]
[:selector [0 :X] [:float]]
[:selector [0 :Y] [:float]]
[:selector [0 :Z] [:float]]
[:selector [0 :W] [:float]]
[:selector [0 :CGPointValue] [UIKit/CGPoint]]
[:selector [0 :CGRectValue] [UIKit/CGRect]]
[:selector [0 :CGAffineTransformValue] [UIKit/CGAffineTransform]]
[:selector [0 :stringRepresentation] [:id]]
[:selector [3 :detectorOfType :context :options] [:id :id :id :id]]
[:selector [1 :featuresInImage] [:id :id]]
[:selector [2 :featuresInImage :options] [:id :id :id]]
[:selector [0 :type] [:id]]
[:selector [0 :bounds] [UIKit/CGRect]]
[:selector [0 :hasLeftEyePosition] [Boolean]]
[:selector [0 :leftEyePosition] [UIKit/CGPoint]]
[:selector [0 :hasRightEyePosition] [Boolean]]
[:selector [0 :rightEyePosition] [UIKit/CGPoint]]
[:selector [0 :hasMouthPosition] [Boolean]]
[:selector [0 :mouthPosition] [UIKit/CGPoint]]
[:selector [0 :hasTrackingID] [Boolean]]
[:selector [0 :trackingID] [:int]]
[:selector [0 :hasTrackingFrameCount] [Boolean]]
[:selector [0 :trackingFrameCount] [:int]]
[:selector [2 :colorWithWhite :alpha] [:id :float :float]]
[:selector [4 :colorWithHue :saturation :brightness :alpha] [:id :float :float :float :float]]
[:selector [4 :colorWithRed :green :blue :alpha] [:id :float :float :float :float]]
;;FIXME: CGColorRef in colorWithCGColor:
[:selector [1 :colorWithPatternImage] [:id :id]]
[:selector [1 :colorWithCIColor] [:id :id]]
[:selector [2 :initWithWhite :alpha] [:id :float :float]]
[:selector [4 :initWithHue :saturation :brightness :alpha] [:id :float :float :float :float]]
[:selector [4 :initWithRed :green :blue :alpha] [:id :float :float :float :float]]
;;FIXME: CGColorRef in initWithCGColor:
[:selector [1 :initWithPatternImage] [:id :id]]
[:selector [1 :initWithCIColor] [:id :id]]
[:selector [0 :blackColor] [:id]]
[:selector [0 :darkGrayColor] [:id]]
[:selector [0 :lightGrayColor] [:id]]
[:selector [0 :whiteColor] [:id]]
[:selector [0 :grayColor] [:id]]
[:selector [0 :redColor] [:id]]
[:selector [0 :greenColor] [:id]]
[:selector [0 :blueColor] [:id]]
[:selector [0 :cyanColor] [:id]]
[:selector [0 :yellowColor] [:id]]
[:selector [0 :magentaColor] [:id]]
[:selector [0 :orangeColor] [:id]]
[:selector [0 :purpleColor] [:id]]
[:selector [0 :brownColor] [:id]]
[:selector [0 :clearColor] [:id]]
[:selector [0 :set] [:void]]
[:selector [0 :setFill] [:void]]
[:selector [0 :setStroke] [:void]]
;;FIXME: CGFloat * in getWhite:alpha:
;;FIXME: CGFloat * in getHue:saturation:brightness:alpha:
;;FIXME: CGFloat * in getRed:green:blue:alpha:
[:selector [1 :colorWithAlphaComponent] [:id :float]]
;;FIXME: CGColorRef in CGColor
[:selector [0 :CIColor] [:id]]
[:selector [1 :initWithColor] [:id :id]]
[:selector [2 :fontWithName :size] [:id :id :float]]
[:selector [0 :familyNames] [:id]]
[:selector [1 :fontNamesForFamilyName] [:id :id]]
[:selector [1 :systemFontOfSize] [:id :float]]
[:selector [1 :boldSystemFontOfSize] [:id :float]]
[:selector [1 :italicSystemFontOfSize] [:id :float]]
[:selector [1 :fontWithSize] [:id :float]]
[:selector [0 :familyName] [:id]]
[:selector [0 :fontName] [:id]]
[:selector [0 :pointSize] [:float]]
[:selector [0 :ascender] [:float]]
[:selector [0 :descender] [:float]]
[:selector [0 :capHeight] [:float]]
[:selector [0 :xHeight] [:float]]
[:selector [0 :lineHeight] [:float]]
[:selector [0 :leading] [:float]]
[:enum UIBarStyleDefault UIBarStyleBlack UIBarStyleBlackOpaque UIBarStyleBlackTranslucent UIBarStyle]
[:selector [0 :lightTextColor] [:id]]
[:selector [0 :darkTextColor] [:id]]
[:selector [0 :groupTableViewBackgroundColor] [:id]]
[:selector [0 :viewFlipsideBackgroundColor] [:id]]
[:selector [0 :scrollViewTexturedBackgroundColor] [:id]]
[:selector [0 :underPageBackgroundColor] [:id]]
[:selector [0 :labelFontSize] [:float]]
[:selector [0 :buttonFontSize] [:float]]
[:selector [0 :smallSystemFontSize] [:float]]
[:selector [0 :systemFontSize] [:float]]
[:compound UIEdgeInsets "sizeof (UIEdgeInsets)"]
[:compound UIOffset "sizeof (UIOffset)"]
[:function UIEdgeInsetsMake [UIKit/UIEdgeInsets :float :float :float :float]]
[:function UIEdgeInsetsInsetRect [UIKit/CGRect UIKit/CGRect UIKit/UIEdgeInsets]]
[:function UIOffsetMake [UIKit/UIOffset :float :float]]
[:function UIEdgeInsetsEqualToEdgeInsets [Boolean UIKit/UIEdgeInsets UIKit/UIEdgeInsets]]
[:function UIOffsetEqualToOffset [Boolean UIKit/UIOffset UIKit/UIOffset]]
[:function NSStringFromCGPoint [:id UIKit/CGPoint]]
[:function NSStringFromCGSize [:id UIKit/CGSize]]
[:function NSStringFromCGRect [:id UIKit/CGRect]]
[:function NSStringFromCGAffineTransform [:id UIKit/CGAffineTransform]]
[:function NSStringFromUIEdgeInsets [:id UIKit/UIEdgeInsets]]
[:function NSStringFromUIOffset [:id UIKit/UIOffset]]
[:function CGPointFromString [UIKit/CGPoint :id]]
[:function CGSizeFromString [UIKit/CGSize :id]]
[:function CGRectFromString [UIKit/CGRect :id]]
[:function CGAffineTransformFromString [UIKit/CGAffineTransform :id]]
[:function UIEdgeInsetsFromString [UIKit/UIEdgeInsets :id]]
[:function UIOffsetFromString [UIKit/UIOffset :id]]
[:selector [1 :valueWithCGPoint] [:id UIKit/CGPoint]]
[:selector [1 :valueWithCGSize] [:id UIKit/CGSize]]
[:selector [1 :valueWithCGRect] [:id UIKit/CGRect]]
[:selector [1 :valueWithCGAffineTransform] [:id UIKit/CGAffineTransform]]
[:selector [1 :valueWithUIEdgeInsets] [:id UIKit/UIEdgeInsets]]
[:selector [1 :valueWithUIOffset] [:id UIKit/UIOffset]]
[:selector [0 :CGPointValue] [UIKit/CGPoint]]
[:selector [0 :CGSizeValue] [UIKit/CGSize]]
[:selector [0 :CGRectValue] [UIKit/CGRect]]
[:selector [0 :CGAffineTransformValue] [UIKit/CGAffineTransform]]
[:selector [0 :UIEdgeInsetsValue] [UIKit/UIEdgeInsets]]
[:selector [0 :UIOffsetValue] [UIKit/UIOffset]]
[:selector [2 :encodeCGPoint :forKey] [:void UIKit/CGPoint :id]]
[:selector [2 :encodeCGSize :forKey] [:void UIKit/CGSize :id]]
[:selector [2 :encodeCGRect :forKey] [:void UIKit/CGRect :id]]
[:selector [2 :encodeCGAffineTransform :forKey] [:void UIKit/CGAffineTransform :id]]
[:selector [2 :encodeUIEdgeInsets :forKey] [:void UIKit/UIEdgeInsets :id]]
[:selector [2 :encodeUIOffset :forKey] [:void UIKit/UIOffset :id]]
[:selector [1 :decodeCGPointForKey] [UIKit/CGPoint :id]]
[:selector [1 :decodeCGSizeForKey] [UIKit/CGSize :id]]
[:selector [1 :decodeCGRectForKey] [UIKit/CGRect :id]]
[:selector [1 :decodeCGAffineTransformForKey] [UIKit/CGAffineTransform :id]]
[:selector [1 :decodeUIEdgeInsetsForKey] [UIKit/UIEdgeInsets :id]]
[:selector [1 :decodeUIOffsetForKey] [UIKit/UIOffset :id]]
[:enum NSLayoutRelationLessThanOrEqual NSLayoutRelationEqual NSLayoutRelationGreaterThanOrEqual NSLayoutRelation]
[:enum NSLayoutAttributeLeft NSLayoutAttributeRight NSLayoutAttributeTop NSLayoutAttributeBottom NSLayoutAttributeLeading NSLayoutAttributeTrailing NSLayoutAttributeWidth NSLayoutAttributeHeight NSLayoutAttributeCenterX NSLayoutAttributeCenterY NSLayoutAttributeBaseline NSLayoutAttributeNotAnAttribute NSLayoutAttribute]
[:enum NSLayoutFormatAlignAllLeft NSLayoutFormatAlignAllRight NSLayoutFormatAlignAllTop NSLayoutFormatAlignAllBottom NSLayoutFormatAlignAllLeading NSLayoutFormatAlignAllTrailing NSLayoutFormatAlignAllCenterX NSLayoutFormatAlignAllCenterY NSLayoutFormatAlignAllBaseline NSLayoutFormatAlignmentMask NSLayoutFormatDirectionLeadingToTrailing NSLayoutFormatDirectionLeftToRight NSLayoutFormatDirectionRightToLeft NSLayoutFormatDirectionMask NSLayoutFormatOptions]
[:enum UILayoutPriorityRequired UILayoutPriorityDefaultHigh UILayoutPriorityDefaultLow UILayoutPriorityFittingSizeLevel nil]
[:selector [4 :constraintsWithVisualFormat :options :metrics :views] [:id :id UIKit/NSLayoutFormatOptions :id :id]]
;;FIXME: variadic _NSDictionaryOfVariableBindings
[:selector [7 :constraintWithItem :attribute :relatedBy :toItem :attribute :multiplier :constant] [:id :id UIKit/NSLayoutAttribute UIKit/NSLayoutRelation :id UIKit/NSLayoutAttribute :float :float]]
[:selector [1 :setPriority] [:void :float]]
[:selector [0 :priority] [:float]]
[:selector [1 :setShouldBeArchived] [:void Boolean]]
[:selector [0 :shouldBeArchived] [Boolean]]
[:selector [0 :firstItem] [:id]]
[:selector [0 :firstAttribute] [UIKit/NSLayoutAttribute]]
[:selector [0 :relation] [UIKit/NSLayoutRelation]]
[:selector [0 :secondItem] [:id]]
[:selector [0 :secondAttribute] [UIKit/NSLayoutAttribute]]
[:selector [0 :multiplier] [:float]]
[:selector [0 :constant] [:float]]
[:selector [1 :setConstant] [:void :float]]
[:enum UIViewAnimationCurveEaseInOut UIViewAnimationCurveEaseIn UIViewAnimationCurveEaseOut UIViewAnimationCurveLinear UIViewAnimationCurve]
[:enum UIViewContentModeScaleToFill UIViewContentModeScaleAspectFit UIViewContentModeScaleAspectFill UIViewContentModeRedraw UIViewContentModeCenter UIViewContentModeTop UIViewContentModeBottom UIViewContentModeLeft UIViewContentModeRight UIViewContentModeTopLeft UIViewContentModeTopRight UIViewContentModeBottomLeft UIViewContentModeBottomRight UIViewContentMode]
[:enum UIViewAnimationTransitionNone UIViewAnimationTransitionFlipFromLeft UIViewAnimationTransitionFlipFromRight UIViewAnimationTransitionCurlUp UIViewAnimationTransitionCurlDown UIViewAnimationTransition]
[:enum UIViewAutoresizingNone UIViewAutoresizingFlexibleLeftMargin UIViewAutoresizingFlexibleWidth UIViewAutoresizingFlexibleRightMargin UIViewAutoresizingFlexibleTopMargin UIViewAutoresizingFlexibleHeight UIViewAutoresizingFlexibleBottomMargin UIViewAutoresizing]
[:enum UIViewAnimationOptionLayoutSubviews UIViewAnimationOptionAllowUserInteraction UIViewAnimationOptionBeginFromCurrentState UIViewAnimationOptionRepeat UIViewAnimationOptionAutoreverse UIViewAnimationOptionOverrideInheritedDuration UIViewAnimationOptionOverrideInheritedCurve UIViewAnimationOptionAllowAnimatedContent UIViewAnimationOptionShowHideTransitionViews UIViewAnimationOptionCurveEaseInOut UIViewAnimationOptionCurveEaseIn UIViewAnimationOptionCurveEaseOut UIViewAnimationOptionCurveLinear UIViewAnimationOptionTransitionNone UIViewAnimationOptionTransitionFlipFromLeft UIViewAnimationOptionTransitionFlipFromRight UIViewAnimationOptionTransitionCurlUp UIViewAnimationOptionTransitionCurlDown UIViewAnimationOptionTransitionCrossDissolve UIViewAnimationOptionTransitionFlipFromTop UIViewAnimationOptionTransitionFlipFromBottom UIViewAnimationOptions]
[:selector [0 :layerClass] [:id]]
[:selector [1 :initWithFrame] [:id UIKit/CGRect]]
[:selector [0 :isUserInteractionEnabled] [Boolean]]
[:selector [1 :setUserInteractionEnabled] [:void Boolean]]
[:selector [0 :tag] [:int]]
[:selector [1 :setTag] [:void :int]]
[:selector [0 :layer] [:id]]
[:selector [2 :hitTest :withEvent] [:id UIKit/CGPoint :id]]
[:selector [2 :pointInside :withEvent] [Boolean UIKit/CGPoint :id]]
[:selector [2 :convertPoint :toView] [UIKit/CGPoint UIKit/CGPoint :id]]
[:selector [2 :convertPoint :fromView] [UIKit/CGPoint UIKit/CGPoint :id]]
[:selector [2 :convertRect :toView] [UIKit/CGRect UIKit/CGRect :id]]
[:selector [2 :convertRect :fromView] [UIKit/CGRect UIKit/CGRect :id]]
[:selector [1 :sizeThatFits] [UIKit/CGSize UIKit/CGSize]]
[:selector [0 :sizeToFit] [:void]]
[:selector [0 :frame] [UIKit/CGRect]]
[:selector [1 :setFrame] [:void UIKit/CGRect]]
[:selector [0 :bounds] [UIKit/CGRect]]
[:selector [1 :setBounds] [:void UIKit/CGRect]]
[:selector [0 :center] [UIKit/CGPoint]]
[:selector [1 :setCenter] [:void UIKit/CGPoint]]
[:selector [0 :transform] [UIKit/CGAffineTransform]]
[:selector [1 :setTransform] [:void UIKit/CGAffineTransform]]
[:selector [0 :contentScaleFactor] [:float]]
[:selector [1 :setContentScaleFactor] [:void :float]]
[:selector [0 :isMultipleTouchEnabled] [Boolean]]
[:selector [1 :setMultipleTouchEnabled] [:void Boolean]]
[:selector [0 :isExclusiveTouch] [Boolean]]
[:selector [1 :setExclusiveTouch] [:void Boolean]]
[:selector [0 :autoresizesSubviews] [Boolean]]
[:selector [1 :setAutoresizesSubviews] [:void Boolean]]
[:selector [0 :autoresizingMask] [UIKit/UIViewAutoresizing]]
[:selector [1 :setAutoresizingMask] [:void UIKit/UIViewAutoresizing]]
[:selector [0 :removeFromSuperview] [:void]]
[:selector [2 :insertSubview :atIndex] [:void :id :int]]
[:selector [2 :exchangeSubviewAtIndex :withSubviewAtIndex] [:void :int :int]]
[:selector [1 :addSubview] [:void :id]]
[:selector [2 :insertSubview :belowSubview] [:void :id :id]]
[:selector [2 :insertSubview :aboveSubview] [:void :id :id]]
[:selector [1 :bringSubviewToFront] [:void :id]]
[:selector [1 :sendSubviewToBack] [:void :id]]
[:selector [1 :didAddSubview] [:void :id]]
[:selector [1 :willRemoveSubview] [:void :id]]
[:selector [1 :willMoveToSuperview] [:void :id]]
[:selector [0 :didMoveToSuperview] [:void]]
[:selector [1 :willMoveToWindow] [:void :id]]
[:selector [0 :didMoveToWindow] [:void]]
[:selector [1 :isDescendantOfView] [Boolean :id]]
[:selector [1 :viewWithTag] [:id :int]]
[:selector [0 :setNeedsLayout] [:void]]
[:selector [0 :layoutIfNeeded] [:void]]
[:selector [0 :layoutSubviews] [:void]]
[:selector [0 :superview] [:id]]
[:selector [0 :subviews] [:id]]
[:selector [0 :window] [:id]]
[:selector [1 :drawRect] [:void UIKit/CGRect]]
[:selector [0 :setNeedsDisplay] [:void]]
[:selector [1 :setNeedsDisplayInRect] [:void UIKit/CGRect]]
[:selector [0 :clipsToBounds] [Boolean]]
[:selector [1 :setClipsToBounds] [:void Boolean]]
[:selector [0 :backgroundColor] [:id]]
[:selector [1 :setBackgroundColor] [:void :id]]
[:selector [0 :alpha] [:float]]
[:selector [1 :setAlpha] [:void :float]]
[:selector [0 :isOpaque] [Boolean]]
[:selector [1 :setOpaque] [:void Boolean]]
[:selector [0 :clearsContextBeforeDrawing] [Boolean]]
[:selector [1 :setClearsContextBeforeDrawing] [:void Boolean]]
[:selector [0 :isHidden] [Boolean]]
[:selector [1 :setHidden] [:void Boolean]]
[:selector [0 :contentMode] [UIKit/UIViewContentMode]]
[:selector [1 :setContentMode] [:void UIKit/UIViewContentMode]]
[:selector [0 :contentStretch] [UIKit/CGRect]]
[:selector [1 :setContentStretch] [:void UIKit/CGRect]]
;;FIXME: void * in beginAnimations:context:
[:selector [0 :commitAnimations] [:void]]
[:selector [1 :setAnimationDelegate] [:void :id]]
[:selector [1 :setAnimationWillStartSelector] [:void :selector]]
[:selector [1 :setAnimationDidStopSelector] [:void :selector]]
[:selector [1 :setAnimationDuration] [:void :double]]
[:selector [1 :setAnimationDelay] [:void :double]]
[:selector [1 :setAnimationStartDate] [:void :id]]
[:selector [1 :setAnimationCurve] [:void UIKit/UIViewAnimationCurve]]
[:selector [1 :setAnimationRepeatCount] [:void :float]]
[:selector [1 :setAnimationRepeatAutoreverses] [:void Boolean]]
[:selector [1 :setAnimationBeginsFromCurrentState] [:void Boolean]]
[:selector [3 :setAnimationTransition :forView :cache] [:void UIKit/UIViewAnimationTransition :id Boolean]]
[:selector [1 :setAnimationsEnabled] [:void Boolean]]
[:selector [0 :areAnimationsEnabled] [Boolean]]
;;FIXME: void (^)(void) in animateWithDuration:delay:options:animations:completion:
;;FIXME: void (^)(void) in animateWithDuration:animations:completion:
;;FIXME: void (^)(void) in animateWithDuration:animations:
;;FIXME: void (^)(void) in transitionWithView:duration:options:animations:completion:
;;FIXME: void (^)(BOOL) in transitionFromView:toView:duration:options:completion:
[:selector [1 :addGestureRecognizer] [:void :id]]
[:selector [1 :removeGestureRecognizer] [:void :id]]
[:selector [1 :gestureRecognizerShouldBegin] [Boolean :id]]
[:selector [0 :gestureRecognizers] [:id]]
[:selector [1 :setGestureRecognizers] [:void :id]]
[:enum UILayoutConstraintAxisHorizontal UILayoutConstraintAxisVertical UILayoutConstraintAxis]
[:selector [0 :constraints] [:id]]
[:selector [1 :addConstraint] [:void :id]]
[:selector [1 :addConstraints] [:void :id]]
[:selector [1 :removeConstraint] [:void :id]]
[:selector [1 :removeConstraints] [:void :id]]
[:selector [0 :updateConstraintsIfNeeded] [:void]]
[:selector [0 :updateConstraints] [:void]]
[:selector [0 :needsUpdateConstraints] [Boolean]]
[:selector [0 :setNeedsUpdateConstraints] [:void]]
[:selector [0 :translatesAutoresizingMaskIntoConstraints] [Boolean]]
[:selector [1 :setTranslatesAutoresizingMaskIntoConstraints] [:void Boolean]]
[:selector [0 :requiresConstraintBasedLayout] [Boolean]]
[:selector [1 :alignmentRectForFrame] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :frameForAlignmentRect] [UIKit/CGRect UIKit/CGRect]]
[:selector [0 :alignmentRectInsets] [UIKit/UIEdgeInsets]]
[:selector [0 :viewForBaselineLayout] [:id]]
[:selector [0 :intrinsicContentSize] [UIKit/CGSize]]
[:selector [0 :invalidateIntrinsicContentSize] [:void]]
[:selector [1 :contentHuggingPriorityForAxis] [:float UIKit/UILayoutConstraintAxis]]
[:selector [2 :setContentHuggingPriority :forAxis] [:void :float UIKit/UILayoutConstraintAxis]]
[:selector [1 :contentCompressionResistancePriorityForAxis] [:float UIKit/UILayoutConstraintAxis]]
[:selector [2 :setContentCompressionResistancePriority :forAxis] [:void :float UIKit/UILayoutConstraintAxis]]
[:selector [1 :systemLayoutSizeFittingSize] [UIKit/CGSize UIKit/CGSize]]
[:selector [1 :constraintsAffectingLayoutForAxis] [:id UIKit/UILayoutConstraintAxis]]
[:selector [0 :hasAmbiguousLayout] [Boolean]]
[:selector [0 :exerciseAmbiguityInLayout] [:void]]
[:selector [1 :encodeRestorableStateWithCoder] [:void :id]]
[:selector [1 :decodeRestorableStateWithCoder] [:void :id]]
[:selector [0 :restorationIdentifier] [:id]]
[:selector [1 :setRestorationIdentifier] [:void :id]]
[:enum UIScrollViewIndicatorStyleDefault UIScrollViewIndicatorStyleBlack UIScrollViewIndicatorStyleWhite UIScrollViewIndicatorStyle]
[:selector [0 :contentOffset] [UIKit/CGPoint]]
[:selector [1 :setContentOffset] [:void UIKit/CGPoint]]
[:selector [1 :setContentSize] [:void UIKit/CGSize]]
[:selector [0 :contentSize] [UIKit/CGSize]]
[:selector [1 :setContentInset] [:void UIKit/UIEdgeInsets]]
[:selector [0 :contentInset] [UIKit/UIEdgeInsets]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDirectionalLockEnabled] [:void Boolean]]
[:selector [0 :isDirectionalLockEnabled] [Boolean]]
[:selector [0 :bounces] [Boolean]]
[:selector [1 :setBounces] [:void Boolean]]
[:selector [0 :alwaysBounceVertical] [Boolean]]
[:selector [1 :setAlwaysBounceVertical] [:void Boolean]]
[:selector [0 :alwaysBounceHorizontal] [Boolean]]
[:selector [1 :setAlwaysBounceHorizontal] [:void Boolean]]
[:selector [1 :setPagingEnabled] [:void Boolean]]
[:selector [0 :isPagingEnabled] [Boolean]]
[:selector [1 :setScrollEnabled] [:void Boolean]]
[:selector [0 :isScrollEnabled] [Boolean]]
[:selector [1 :setShowsHorizontalScrollIndicator] [:void Boolean]]
[:selector [0 :showsHorizontalScrollIndicator] [Boolean]]
[:selector [0 :showsVerticalScrollIndicator] [Boolean]]
[:selector [1 :setShowsVerticalScrollIndicator] [:void Boolean]]
[:selector [0 :scrollIndicatorInsets] [UIKit/UIEdgeInsets]]
[:selector [1 :setScrollIndicatorInsets] [:void UIKit/UIEdgeInsets]]
[:selector [1 :setIndicatorStyle] [:void UIKit/UIScrollViewIndicatorStyle]]
[:selector [0 :indicatorStyle] [UIKit/UIScrollViewIndicatorStyle]]
[:selector [0 :decelerationRate] [:float]]
[:selector [1 :setDecelerationRate] [:void :float]]
[:selector [2 :setContentOffset :animated] [:void UIKit/CGPoint Boolean]]
[:selector [2 :scrollRectToVisible :animated] [:void UIKit/CGRect Boolean]]
[:selector [0 :flashScrollIndicators] [:void]]
[:selector [0 :isTracking] [Boolean]]
[:selector [0 :isDragging] [Boolean]]
[:selector [0 :isDecelerating] [Boolean]]
[:selector [1 :setDelaysContentTouches] [:void Boolean]]
[:selector [0 :delaysContentTouches] [Boolean]]
[:selector [1 :setCanCancelContentTouches] [:void Boolean]]
[:selector [0 :canCancelContentTouches] [Boolean]]
[:selector [3 :touchesShouldBegin :withEvent :inContentView] [Boolean :id :id :id]]
[:selector [1 :touchesShouldCancelInContentView] [Boolean :id]]
[:selector [0 :minimumZoomScale] [:float]]
[:selector [1 :setMinimumZoomScale] [:void :float]]
[:selector [0 :maximumZoomScale] [:float]]
[:selector [1 :setMaximumZoomScale] [:void :float]]
[:selector [0 :zoomScale] [:float]]
[:selector [1 :setZoomScale] [:void :float]]
[:selector [2 :setZoomScale :animated] [:void :float Boolean]]
[:selector [2 :zoomToRect :animated] [:void UIKit/CGRect Boolean]]
[:selector [0 :bouncesZoom] [Boolean]]
[:selector [1 :setBouncesZoom] [:void Boolean]]
[:selector [0 :isZooming] [Boolean]]
[:selector [0 :isZoomBouncing] [Boolean]]
[:selector [0 :scrollsToTop] [Boolean]]
[:selector [1 :setScrollsToTop] [:void Boolean]]
[:selector [0 :panGestureRecognizer] [:id]]
[:selector [0 :pinchGestureRecognizer] [:id]]
[:enum UIGestureRecognizerStatePossible UIGestureRecognizerStateBegan UIGestureRecognizerStateChanged UIGestureRecognizerStateEnded UIGestureRecognizerStateCancelled UIGestureRecognizerStateFailed UIGestureRecognizerStateRecognized UIGestureRecognizerState]
[:selector [2 :initWithTarget :action] [:id :id :selector]]
[:selector [2 :addTarget :action] [:void :id :selector]]
[:selector [2 :removeTarget :action] [:void :id :selector]]
[:selector [0 :state] [UIKit/UIGestureRecognizerState]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setEnabled] [:void Boolean]]
[:selector [0 :isEnabled] [Boolean]]
[:selector [0 :view] [:id]]
[:selector [0 :cancelsTouchesInView] [Boolean]]
[:selector [1 :setCancelsTouchesInView] [:void Boolean]]
[:selector [0 :delaysTouchesBegan] [Boolean]]
[:selector [1 :setDelaysTouchesBegan] [:void Boolean]]
[:selector [0 :delaysTouchesEnded] [Boolean]]
[:selector [1 :setDelaysTouchesEnded] [:void Boolean]]
[:selector [1 :requireGestureRecognizerToFail] [:void :id]]
[:selector [1 :locationInView] [UIKit/CGPoint :id]]
[:selector [0 :numberOfTouches] [:unsigned-int]]
[:selector [2 :locationOfTouch :inView] [UIKit/CGPoint :unsigned-int :id]]
[:enum UISwipeGestureRecognizerDirectionRight UISwipeGestureRecognizerDirectionLeft UISwipeGestureRecognizerDirectionUp UISwipeGestureRecognizerDirectionDown UISwipeGestureRecognizerDirection]
[:selector [0 :numberOfTouchesRequired] [:unsigned-int]]
[:selector [1 :setNumberOfTouchesRequired] [:void :unsigned-int]]
[:selector [0 :direction] [UIKit/UISwipeGestureRecognizerDirection]]
[:selector [1 :setDirection] [:void UIKit/UISwipeGestureRecognizerDirection]]
[:function CTParagraphStyleGetTypeID [:unsigned-long]]
[:enum kCTTextAlignmentLeft kCTTextAlignmentRight kCTTextAlignmentCenter kCTTextAlignmentJustified kCTTextAlignmentNatural kCTLeftTextAlignment kCTRightTextAlignment kCTCenterTextAlignment kCTJustifiedTextAlignment kCTNaturalTextAlignment CTTextAlignment]
[:enum kCTLineBreakByWordWrapping kCTLineBreakByCharWrapping kCTLineBreakByClipping kCTLineBreakByTruncatingHead kCTLineBreakByTruncatingTail kCTLineBreakByTruncatingMiddle CTLineBreakMode]
[:enum kCTWritingDirectionNatural kCTWritingDirectionLeftToRight kCTWritingDirectionRightToLeft CTWritingDirection]
[:enum kCTParagraphStyleSpecifierAlignment kCTParagraphStyleSpecifierFirstLineHeadIndent kCTParagraphStyleSpecifierHeadIndent kCTParagraphStyleSpecifierTailIndent kCTParagraphStyleSpecifierTabStops kCTParagraphStyleSpecifierDefaultTabInterval kCTParagraphStyleSpecifierLineBreakMode kCTParagraphStyleSpecifierLineHeightMultiple kCTParagraphStyleSpecifierMaximumLineHeight kCTParagraphStyleSpecifierMinimumLineHeight kCTParagraphStyleSpecifierLineSpacing kCTParagraphStyleSpecifierParagraphSpacing kCTParagraphStyleSpecifierParagraphSpacingBefore kCTParagraphStyleSpecifierBaseWritingDirection kCTParagraphStyleSpecifierMaximumLineSpacing kCTParagraphStyleSpecifierMinimumLineSpacing kCTParagraphStyleSpecifierLineSpacingAdjustment kCTParagraphStyleSpecifierLineBoundsOptions kCTParagraphStyleSpecifierCount CTParagraphStyleSpecifier]
[:compound CTParagraphStyleSetting "sizeof (CTParagraphStyleSetting)"]
;;FIXME: CTParagraphStyleRef in CTParagraphStyleCreate
;;FIXME: CTParagraphStyleRef in CTParagraphStyleCreateCopy
;;FIXME: CTParagraphStyleRef in CTParagraphStyleGetValueForSpecifier
[:enum NSTextAlignmentLeft NSTextAlignmentCenter NSTextAlignmentRight NSTextAlignmentJustified NSTextAlignmentNatural NSTextAlignment]
[:function NSTextAlignmentToCTTextAlignment [UIKit/CTTextAlignment UIKit/NSTextAlignment]]
[:function NSTextAlignmentFromCTTextAlignment [UIKit/NSTextAlignment UIKit/CTTextAlignment]]
[:enum NSWritingDirectionNatural NSWritingDirectionLeftToRight NSWritingDirectionRightToLeft NSWritingDirection]
[:enum NSLineBreakByWordWrapping NSLineBreakByCharWrapping NSLineBreakByClipping NSLineBreakByTruncatingHead NSLineBreakByTruncatingTail NSLineBreakByTruncatingMiddle NSLineBreakMode]
[:selector [0 :defaultParagraphStyle] [:id]]
[:selector [1 :defaultWritingDirectionForLanguage] [UIKit/NSWritingDirection :id]]
[:selector [0 :lineSpacing] [:float]]
[:selector [0 :paragraphSpacing] [:float]]
[:selector [0 :alignment] [UIKit/NSTextAlignment]]
[:selector [0 :headIndent] [:float]]
[:selector [0 :tailIndent] [:float]]
[:selector [0 :firstLineHeadIndent] [:float]]
[:selector [0 :minimumLineHeight] [:float]]
[:selector [0 :maximumLineHeight] [:float]]
[:selector [0 :lineBreakMode] [UIKit/NSLineBreakMode]]
[:selector [0 :baseWritingDirection] [UIKit/NSWritingDirection]]
[:selector [0 :lineHeightMultiple] [:float]]
[:selector [0 :paragraphSpacingBefore] [:float]]
[:selector [0 :hyphenationFactor] [:float]]
[:selector [0 :lineSpacing] [:float]]
[:selector [1 :setLineSpacing] [:void :float]]
[:selector [0 :paragraphSpacing] [:float]]
[:selector [1 :setParagraphSpacing] [:void :float]]
[:selector [0 :alignment] [UIKit/NSTextAlignment]]
[:selector [1 :setAlignment] [:void UIKit/NSTextAlignment]]
[:selector [0 :firstLineHeadIndent] [:float]]
[:selector [1 :setFirstLineHeadIndent] [:void :float]]
[:selector [0 :headIndent] [:float]]
[:selector [1 :setHeadIndent] [:void :float]]
[:selector [0 :tailIndent] [:float]]
[:selector [1 :setTailIndent] [:void :float]]
[:selector [0 :lineBreakMode] [UIKit/NSLineBreakMode]]
[:selector [1 :setLineBreakMode] [:void UIKit/NSLineBreakMode]]
[:selector [0 :minimumLineHeight] [:float]]
[:selector [1 :setMinimumLineHeight] [:void :float]]
[:selector [0 :maximumLineHeight] [:float]]
[:selector [1 :setMaximumLineHeight] [:void :float]]
[:selector [0 :baseWritingDirection] [UIKit/NSWritingDirection]]
[:selector [1 :setBaseWritingDirection] [:void UIKit/NSWritingDirection]]
[:selector [0 :lineHeightMultiple] [:float]]
[:selector [1 :setLineHeightMultiple] [:void :float]]
[:selector [0 :paragraphSpacingBefore] [:float]]
[:selector [1 :setParagraphSpacingBefore] [:void :float]]
[:selector [0 :hyphenationFactor] [:float]]
[:selector [1 :setHyphenationFactor] [:void :float]]
[:enum UILineBreakModeWordWrap UILineBreakModeCharacterWrap UILineBreakModeClip UILineBreakModeHeadTruncation UILineBreakModeTailTruncation UILineBreakModeMiddleTruncation nil]
[:enum UITextAlignmentLeft UITextAlignmentCenter UITextAlignmentRight nil]
[:enum UIBaselineAdjustmentAlignBaselines UIBaselineAdjustmentAlignCenters UIBaselineAdjustmentNone UIBaselineAdjustment]
[:selector [1 :sizeWithFont] [UIKit/CGSize :id]]
[:selector [3 :sizeWithFont :forWidth :lineBreakMode] [UIKit/CGSize :id :float UIKit/NSLineBreakMode]]
[:selector [2 :drawAtPoint :withFont] [UIKit/CGSize UIKit/CGPoint :id]]
[:selector [4 :drawAtPoint :forWidth :withFont :lineBreakMode] [UIKit/CGSize UIKit/CGPoint :float :id UIKit/NSLineBreakMode]]
[:selector [2 :sizeWithFont :constrainedToSize] [UIKit/CGSize :id UIKit/CGSize]]
[:selector [3 :sizeWithFont :constrainedToSize :lineBreakMode] [UIKit/CGSize :id UIKit/CGSize UIKit/NSLineBreakMode]]
[:selector [2 :drawInRect :withFont] [UIKit/CGSize UIKit/CGRect :id]]
[:selector [3 :drawInRect :withFont :lineBreakMode] [UIKit/CGSize UIKit/CGRect :id UIKit/NSLineBreakMode]]
[:selector [4 :drawInRect :withFont :lineBreakMode :alignment] [UIKit/CGSize UIKit/CGRect :id UIKit/NSLineBreakMode UIKit/NSTextAlignment]]
;;FIXME: CGFloat * in sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:
[:selector [6 :drawAtPoint :forWidth :withFont :fontSize :lineBreakMode :baselineAdjustment] [UIKit/CGSize UIKit/CGPoint :float :id :float UIKit/NSLineBreakMode UIKit/UIBaselineAdjustment]]
;;FIXME: CGFloat * in drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:
[:enum UITableViewCellStyleDefault UITableViewCellStyleValue1 UITableViewCellStyleValue2 UITableViewCellStyleSubtitle UITableViewCellStyle]
[:enum UITableViewCellSeparatorStyleNone UITableViewCellSeparatorStyleSingleLine UITableViewCellSeparatorStyleSingleLineEtched UITableViewCellSeparatorStyle]
[:enum UITableViewCellSelectionStyleNone UITableViewCellSelectionStyleBlue UITableViewCellSelectionStyleGray UITableViewCellSelectionStyle]
[:enum UITableViewCellEditingStyleNone UITableViewCellEditingStyleDelete UITableViewCellEditingStyleInsert UITableViewCellEditingStyle]
[:enum UITableViewCellAccessoryNone UITableViewCellAccessoryDisclosureIndicator UITableViewCellAccessoryDetailDisclosureButton UITableViewCellAccessoryCheckmark UITableViewCellAccessoryType]
[:enum UITableViewCellStateDefaultMask UITableViewCellStateShowingEditControlMask UITableViewCellStateShowingDeleteConfirmationMask UITableViewCellStateMask]
[:selector [2 :initWithStyle :reuseIdentifier] [:id UIKit/UITableViewCellStyle :id]]
[:selector [0 :imageView] [:id]]
[:selector [0 :textLabel] [:id]]
[:selector [0 :detailTextLabel] [:id]]
[:selector [0 :contentView] [:id]]
[:selector [1 :setBackgroundView] [:void :id]]
[:selector [0 :backgroundView] [:id]]
[:selector [1 :setSelectedBackgroundView] [:void :id]]
[:selector [0 :selectedBackgroundView] [:id]]
[:selector [1 :setMultipleSelectionBackgroundView] [:void :id]]
[:selector [0 :multipleSelectionBackgroundView] [:id]]
[:selector [0 :reuseIdentifier] [:id]]
[:selector [0 :prepareForReuse] [:void]]
[:selector [1 :setSelectionStyle] [:void UIKit/UITableViewCellSelectionStyle]]
[:selector [0 :selectionStyle] [UIKit/UITableViewCellSelectionStyle]]
[:selector [1 :setSelected] [:void Boolean]]
[:selector [0 :isSelected] [Boolean]]
[:selector [0 :isHighlighted] [Boolean]]
[:selector [1 :setHighlighted] [:void Boolean]]
[:selector [2 :setSelected :animated] [:void Boolean Boolean]]
[:selector [2 :setHighlighted :animated] [:void Boolean Boolean]]
[:selector [0 :editingStyle] [UIKit/UITableViewCellEditingStyle]]
[:selector [1 :setShowsReorderControl] [:void Boolean]]
[:selector [0 :showsReorderControl] [Boolean]]
[:selector [1 :setShouldIndentWhileEditing] [:void Boolean]]
[:selector [0 :shouldIndentWhileEditing] [Boolean]]
[:selector [1 :setAccessoryType] [:void UIKit/UITableViewCellAccessoryType]]
[:selector [0 :accessoryType] [UIKit/UITableViewCellAccessoryType]]
[:selector [0 :accessoryView] [:id]]
[:selector [1 :setAccessoryView] [:void :id]]
[:selector [0 :editingAccessoryType] [UIKit/UITableViewCellAccessoryType]]
[:selector [1 :setEditingAccessoryType] [:void UIKit/UITableViewCellAccessoryType]]
[:selector [0 :editingAccessoryView] [:id]]
[:selector [1 :setEditingAccessoryView] [:void :id]]
[:selector [0 :indentationLevel] [:int]]
[:selector [1 :setIndentationLevel] [:void :int]]
[:selector [0 :indentationWidth] [:float]]
[:selector [1 :setIndentationWidth] [:void :float]]
[:selector [0 :isEditing] [Boolean]]
[:selector [1 :setEditing] [:void Boolean]]
[:selector [2 :setEditing :animated] [:void Boolean Boolean]]
[:selector [0 :showingDeleteConfirmation] [Boolean]]
[:selector [1 :willTransitionToState] [:void UIKit/UITableViewCellStateMask]]
[:selector [1 :didTransitionToState] [:void UIKit/UITableViewCellStateMask]]
[:selector [2 :initWithFrame :reuseIdentifier] [:id UIKit/CGRect :id]]
[:selector [0 :text] [:id]]
[:selector [1 :setText] [:void :id]]
[:selector [0 :font] [:id]]
[:selector [1 :setFont] [:void :id]]
[:selector [0 :textAlignment] [UIKit/NSTextAlignment]]
[:selector [1 :setTextAlignment] [:void UIKit/NSTextAlignment]]
[:selector [0 :lineBreakMode] [UIKit/NSLineBreakMode]]
[:selector [1 :setLineBreakMode] [:void UIKit/NSLineBreakMode]]
[:selector [0 :textColor] [:id]]
[:selector [1 :setTextColor] [:void :id]]
[:selector [0 :selectedTextColor] [:id]]
[:selector [1 :setSelectedTextColor] [:void :id]]
[:selector [0 :image] [:id]]
[:selector [1 :setImage] [:void :id]]
[:selector [0 :selectedImage] [:id]]
[:selector [1 :setSelectedImage] [:void :id]]
[:selector [0 :hidesAccessoryWhenEditing] [Boolean]]
[:selector [1 :setHidesAccessoryWhenEditing] [:void Boolean]]
[:selector [0 :target] [:id]]
[:selector [1 :setTarget] [:void :id]]
[:selector [0 :editAction] [:selector]]
[:selector [1 :setEditAction] [:void :selector]]
[:selector [0 :accessoryAction] [:selector]]
[:selector [1 :setAccessoryAction] [:void :selector]]
[:enum UITableViewStylePlain UITableViewStyleGrouped UITableViewStyle]
[:enum UITableViewScrollPositionNone UITableViewScrollPositionTop UITableViewScrollPositionMiddle UITableViewScrollPositionBottom UITableViewScrollPosition]
[:enum UITableViewRowAnimationFade UITableViewRowAnimationRight UITableViewRowAnimationLeft UITableViewRowAnimationTop UITableViewRowAnimationBottom UITableViewRowAnimationNone UITableViewRowAnimationMiddle UITableViewRowAnimationAutomatic UITableViewRowAnimation]
[:selector [2 :initWithFrame :style] [:id UIKit/CGRect UIKit/UITableViewStyle]]
[:selector [0 :style] [UIKit/UITableViewStyle]]
[:selector [0 :dataSource] [:id]]
[:selector [1 :setDataSource] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :rowHeight] [:float]]
[:selector [1 :setRowHeight] [:void :float]]
[:selector [0 :sectionHeaderHeight] [:float]]
[:selector [1 :setSectionHeaderHeight] [:void :float]]
[:selector [1 :setSectionFooterHeight] [:void :float]]
[:selector [0 :sectionFooterHeight] [:float]]
[:selector [0 :backgroundView] [:id]]
[:selector [1 :setBackgroundView] [:void :id]]
[:selector [0 :reloadData] [:void]]
[:selector [0 :reloadSectionIndexTitles] [:void]]
[:selector [0 :numberOfSections] [:int]]
[:selector [1 :numberOfRowsInSection] [:int :int]]
[:selector [1 :rectForSection] [UIKit/CGRect :int]]
[:selector [1 :rectForHeaderInSection] [UIKit/CGRect :int]]
[:selector [1 :rectForFooterInSection] [UIKit/CGRect :int]]
[:selector [1 :rectForRowAtIndexPath] [UIKit/CGRect :id]]
[:selector [1 :indexPathForRowAtPoint] [:id UIKit/CGPoint]]
[:selector [1 :indexPathForCell] [:id :id]]
[:selector [1 :indexPathsForRowsInRect] [:id UIKit/CGRect]]
[:selector [1 :cellForRowAtIndexPath] [:id :id]]
[:selector [0 :visibleCells] [:id]]
[:selector [0 :indexPathsForVisibleRows] [:id]]
[:selector [1 :headerViewForSection] [:id :int]]
[:selector [1 :footerViewForSection] [:id :int]]
[:selector [3 :scrollToRowAtIndexPath :atScrollPosition :animated] [:void :id UIKit/UITableViewScrollPosition Boolean]]
[:selector [2 :scrollToNearestSelectedRowAtScrollPosition :animated] [:void UIKit/UITableViewScrollPosition Boolean]]
[:selector [0 :beginUpdates] [:void]]
[:selector [0 :endUpdates] [:void]]
[:selector [2 :insertSections :withRowAnimation] [:void :id UIKit/UITableViewRowAnimation]]
[:selector [2 :deleteSections :withRowAnimation] [:void :id UIKit/UITableViewRowAnimation]]
[:selector [2 :reloadSections :withRowAnimation] [:void :id UIKit/UITableViewRowAnimation]]
[:selector [2 :moveSection :toSection] [:void :int :int]]
[:selector [2 :insertRowsAtIndexPaths :withRowAnimation] [:void :id UIKit/UITableViewRowAnimation]]
[:selector [2 :deleteRowsAtIndexPaths :withRowAnimation] [:void :id UIKit/UITableViewRowAnimation]]
[:selector [2 :reloadRowsAtIndexPaths :withRowAnimation] [:void :id UIKit/UITableViewRowAnimation]]
[:selector [2 :moveRowAtIndexPath :toIndexPath] [:void :id :id]]
[:selector [1 :setEditing] [:void Boolean]]
[:selector [0 :isEditing] [Boolean]]
[:selector [2 :setEditing :animated] [:void Boolean Boolean]]
[:selector [0 :allowsSelection] [Boolean]]
[:selector [1 :setAllowsSelection] [:void Boolean]]
[:selector [0 :allowsSelectionDuringEditing] [Boolean]]
[:selector [1 :setAllowsSelectionDuringEditing] [:void Boolean]]
[:selector [1 :setAllowsMultipleSelection] [:void Boolean]]
[:selector [0 :allowsMultipleSelection] [Boolean]]
[:selector [1 :setAllowsMultipleSelectionDuringEditing] [:void Boolean]]
[:selector [0 :allowsMultipleSelectionDuringEditing] [Boolean]]
[:selector [0 :indexPathForSelectedRow] [:id]]
[:selector [0 :indexPathsForSelectedRows] [:id]]
[:selector [3 :selectRowAtIndexPath :animated :scrollPosition] [:void :id Boolean UIKit/UITableViewScrollPosition]]
[:selector [2 :deselectRowAtIndexPath :animated] [:void :id Boolean]]
[:selector [1 :setSectionIndexMinimumDisplayRowCount] [:void :int]]
[:selector [0 :sectionIndexMinimumDisplayRowCount] [:int]]
[:selector [0 :sectionIndexColor] [:id]]
[:selector [1 :setSectionIndexColor] [:void :id]]
[:selector [1 :setSectionIndexTrackingBackgroundColor] [:void :id]]
[:selector [0 :sectionIndexTrackingBackgroundColor] [:id]]
[:selector [0 :separatorStyle] [UIKit/UITableViewCellSeparatorStyle]]
[:selector [1 :setSeparatorStyle] [:void UIKit/UITableViewCellSeparatorStyle]]
[:selector [0 :separatorColor] [:id]]
[:selector [1 :setSeparatorColor] [:void :id]]
[:selector [0 :tableHeaderView] [:id]]
[:selector [1 :setTableHeaderView] [:void :id]]
[:selector [0 :tableFooterView] [:id]]
[:selector [1 :setTableFooterView] [:void :id]]
[:selector [1 :dequeueReusableCellWithIdentifier] [:id :id]]
[:selector [2 :dequeueReusableCellWithIdentifier :forIndexPath] [:id :id :id]]
[:selector [1 :dequeueReusableHeaderFooterViewWithIdentifier] [:id :id]]
[:selector [2 :registerNib :forCellReuseIdentifier] [:void :id :id]]
[:selector [2 :registerClass :forCellReuseIdentifier] [:void :id :id]]
[:selector [2 :registerNib :forHeaderFooterViewReuseIdentifier] [:void :id :id]]
[:selector [2 :registerClass :forHeaderFooterViewReuseIdentifier] [:void :id :id]]
[:selector [2 :indexPathForRow :inSection] [:id :int :int]]
[:selector [0 :section] [:int]]
[:selector [0 :row] [:int]]
[:selector [1 :setDataSource] [:void :id]]
[:selector [0 :dataSource] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setShowsSelectionIndicator] [:void Boolean]]
[:selector [0 :showsSelectionIndicator] [Boolean]]
[:selector [0 :numberOfComponents] [:int]]
[:selector [1 :numberOfRowsInComponent] [:int :int]]
[:selector [1 :rowSizeForComponent] [UIKit/CGSize :int]]
[:selector [2 :viewForRow :forComponent] [:id :int :int]]
[:selector [0 :reloadAllComponents] [:void]]
[:selector [1 :reloadComponent] [:void :int]]
[:selector [3 :selectRow :inComponent :animated] [:void :int :int Boolean]]
[:selector [1 :selectedRowInComponent] [:int :int]]
[:enum UIImageOrientationUp UIImageOrientationDown UIImageOrientationLeft UIImageOrientationRight UIImageOrientationUpMirrored UIImageOrientationDownMirrored UIImageOrientationLeftMirrored UIImageOrientationRightMirrored UIImageOrientation]
[:enum UIImageResizingModeTile UIImageResizingModeStretch UIImageResizingMode]
[:selector [1 :imageNamed] [:id :id]]
[:selector [1 :imageWithContentsOfFile] [:id :id]]
[:selector [1 :imageWithData] [:id :id]]
[:selector [2 :imageWithData :scale] [:id :id :float]]
;;FIXME: CGImageRef in imageWithCGImage:
;;FIXME: CGImageRef in imageWithCGImage:scale:orientation:
[:selector [1 :imageWithCIImage] [:id :id]]
[:selector [3 :imageWithCIImage :scale :orientation] [:id :id :float UIKit/UIImageOrientation]]
[:selector [1 :initWithContentsOfFile] [:id :id]]
[:selector [1 :initWithData] [:id :id]]
[:selector [2 :initWithData :scale] [:id :id :float]]
;;FIXME: CGImageRef in initWithCGImage:
;;FIXME: CGImageRef in initWithCGImage:scale:orientation:
[:selector [1 :initWithCIImage] [:id :id]]
[:selector [3 :initWithCIImage :scale :orientation] [:id :id :float UIKit/UIImageOrientation]]
[:selector [0 :size] [UIKit/CGSize]]
;;FIXME: CGImageRef in CGImage
[:selector [0 :CIImage] [:id]]
[:selector [0 :imageOrientation] [UIKit/UIImageOrientation]]
[:selector [0 :scale] [:float]]
[:selector [2 :animatedImageNamed :duration] [:id :id :double]]
[:selector [3 :animatedResizableImageNamed :capInsets :duration] [:id :id UIKit/UIEdgeInsets :double]]
[:selector [4 :animatedResizableImageNamed :capInsets :resizingMode :duration] [:id :id UIKit/UIEdgeInsets UIKit/UIImageResizingMode :double]]
[:selector [2 :animatedImageWithImages :duration] [:id :id :double]]
[:selector [0 :images] [:id]]
[:selector [0 :duration] [:double]]
[:selector [1 :drawAtPoint] [:void UIKit/CGPoint]]
[:selector [3 :drawAtPoint :blendMode :alpha] [:void UIKit/CGPoint UIKit/CGBlendMode :float]]
[:selector [1 :drawInRect] [:void UIKit/CGRect]]
[:selector [3 :drawInRect :blendMode :alpha] [:void UIKit/CGRect UIKit/CGBlendMode :float]]
[:selector [1 :drawAsPatternInRect] [:void UIKit/CGRect]]
[:selector [1 :resizableImageWithCapInsets] [:id UIKit/UIEdgeInsets]]
[:selector [2 :resizableImageWithCapInsets :resizingMode] [:id UIKit/UIEdgeInsets UIKit/UIImageResizingMode]]
[:selector [0 :capInsets] [UIKit/UIEdgeInsets]]
[:selector [0 :resizingMode] [UIKit/UIImageResizingMode]]
[:selector [1 :imageWithAlignmentRectInsets] [:id UIKit/UIEdgeInsets]]
[:selector [0 :alignmentRectInsets] [UIKit/UIEdgeInsets]]
[:selector [2 :stretchableImageWithLeftCapWidth :topCapHeight] [:id :int :int]]
[:selector [0 :leftCapWidth] [:int]]
[:selector [0 :topCapHeight] [:int]]
[:selector [1 :initWithImage] [:id :id]]
[:selector [2 :initWithImage :options] [:id :id :id]]
[:function UIImagePNGRepresentation [:id :id]]
[:function UIImageJPEGRepresentation [:id :id :float]]
[:selector [1 :initWithAccessibilityContainer] [:id :id]]
[:selector [0 :accessibilityContainer] [:id]]
[:selector [1 :setAccessibilityContainer] [:void :id]]
[:selector [0 :isAccessibilityElement] [Boolean]]
[:selector [1 :setIsAccessibilityElement] [:void Boolean]]
[:selector [0 :accessibilityLabel] [:id]]
[:selector [1 :setAccessibilityLabel] [:void :id]]
[:selector [0 :accessibilityHint] [:id]]
[:selector [1 :setAccessibilityHint] [:void :id]]
[:selector [0 :accessibilityValue] [:id]]
[:selector [1 :setAccessibilityValue] [:void :id]]
[:selector [0 :accessibilityFrame] [UIKit/CGRect]]
[:selector [1 :setAccessibilityFrame] [:void UIKit/CGRect]]
[:selector [0 :accessibilityTraits] [:unsigned-long-long]]
[:selector [1 :setAccessibilityTraits] [:void :unsigned-long-long]]
[:enum UIAccessibilityZoomTypeInsertionPoint UIAccessibilityZoomType]
[:function UIAccessibilityZoomFocusChanged [:void UIKit/UIAccessibilityZoomType UIKit/CGRect :id]]
[:function UIAccessibilityRegisterGestureConflictWithZoom [:void]]
[:selector [0 :isAccessibilityElement] [Boolean]]
[:selector [1 :setIsAccessibilityElement] [:void Boolean]]
[:selector [0 :accessibilityLabel] [:id]]
[:selector [1 :setAccessibilityLabel] [:void :id]]
[:selector [0 :accessibilityHint] [:id]]
[:selector [1 :setAccessibilityHint] [:void :id]]
[:selector [0 :accessibilityValue] [:id]]
[:selector [1 :setAccessibilityValue] [:void :id]]
[:selector [0 :accessibilityTraits] [:unsigned-long-long]]
[:selector [1 :setAccessibilityTraits] [:void :unsigned-long-long]]
[:selector [0 :accessibilityFrame] [UIKit/CGRect]]
[:selector [1 :setAccessibilityFrame] [:void UIKit/CGRect]]
[:selector [0 :accessibilityActivationPoint] [UIKit/CGPoint]]
[:selector [1 :setAccessibilityActivationPoint] [:void UIKit/CGPoint]]
[:selector [0 :accessibilityLanguage] [:id]]
[:selector [1 :setAccessibilityLanguage] [:void :id]]
[:selector [0 :accessibilityElementsHidden] [Boolean]]
[:selector [1 :setAccessibilityElementsHidden] [:void Boolean]]
[:selector [0 :accessibilityViewIsModal] [Boolean]]
[:selector [1 :setAccessibilityViewIsModal] [:void Boolean]]
[:selector [0 :shouldGroupAccessibilityChildren] [Boolean]]
[:selector [1 :setShouldGroupAccessibilityChildren] [:void Boolean]]
[:selector [0 :accessibilityElementCount] [:int]]
[:selector [1 :accessibilityElementAtIndex] [:id :int]]
[:selector [1 :indexOfAccessibilityElement] [:int :id]]
[:selector [0 :accessibilityElementDidBecomeFocused] [:void]]
[:selector [0 :accessibilityElementDidLoseFocus] [:void]]
[:selector [0 :accessibilityElementIsFocused] [Boolean]]
[:selector [0 :accessibilityIncrement] [:void]]
[:selector [0 :accessibilityDecrement] [:void]]
[:enum UIAccessibilityScrollDirectionRight UIAccessibilityScrollDirectionLeft UIAccessibilityScrollDirectionUp UIAccessibilityScrollDirectionDown UIAccessibilityScrollDirectionNext UIAccessibilityScrollDirectionPrevious UIAccessibilityScrollDirection]
[:selector [1 :accessibilityScroll] [Boolean UIKit/UIAccessibilityScrollDirection]]
[:selector [0 :accessibilityPerformEscape] [Boolean]]
[:selector [0 :accessibilityPerformMagicTap] [Boolean]]
[:function UIAccessibilityPostNotification [:void :unsigned-int :id]]
[:function UIAccessibilityIsVoiceOverRunning [Boolean]]
[:function UIAccessibilityIsMonoAudioEnabled [Boolean]]
[:function UIAccessibilityIsClosedCaptioningEnabled [Boolean]]
[:function UIAccessibilityIsInvertColorsEnabled [Boolean]]
[:function UIAccessibilityIsGuidedAccessEnabled [Boolean]]
[:enum UIActivityIndicatorViewStyleWhiteLarge UIActivityIndicatorViewStyleWhite UIActivityIndicatorViewStyleGray UIActivityIndicatorViewStyle]
[:selector [1 :initWithActivityIndicatorStyle] [:id UIKit/UIActivityIndicatorViewStyle]]
[:selector [0 :startAnimating] [:void]]
[:selector [0 :stopAnimating] [:void]]
[:selector [0 :isAnimating] [Boolean]]
[:selector [0 :activityIndicatorViewStyle] [UIKit/UIActivityIndicatorViewStyle]]
[:selector [1 :setActivityIndicatorViewStyle] [:void UIKit/UIActivityIndicatorViewStyle]]
[:selector [0 :hidesWhenStopped] [Boolean]]
[:selector [1 :setHidesWhenStopped] [:void Boolean]]
[:selector [0 :color] [:id]]
[:selector [1 :setColor] [:void :id]]
[:selector [0 :activityType] [:id]]
[:selector [0 :activityTitle] [:id]]
[:selector [0 :activityImage] [:id]]
[:selector [1 :canPerformWithActivityItems] [Boolean :id]]
[:selector [1 :prepareWithActivityItems] [:void :id]]
[:selector [0 :activityViewController] [:id]]
[:selector [0 :performActivity] [:void]]
[:selector [1 :activityDidFinish] [:void Boolean]]
[:selector [1 :initWithPlaceholderItem] [:id :id]]
[:selector [0 :item] [:id]]
[:selector [0 :placeholderItem] [:id]]
[:selector [0 :activityType] [:id]]
[:enum UIDeviceOrientationUnknown UIDeviceOrientationPortrait UIDeviceOrientationPortraitUpsideDown UIDeviceOrientationLandscapeLeft UIDeviceOrientationLandscapeRight UIDeviceOrientationFaceUp UIDeviceOrientationFaceDown UIDeviceOrientation]
[:enum UIDeviceBatteryStateUnknown UIDeviceBatteryStateUnplugged UIDeviceBatteryStateCharging UIDeviceBatteryStateFull UIDeviceBatteryState]
[:enum UIUserInterfaceIdiomPhone UIUserInterfaceIdiomPad UIUserInterfaceIdiom]
[:selector [0 :currentDevice] [:id]]
[:selector [0 :name] [:id]]
[:selector [0 :model] [:id]]
[:selector [0 :localizedModel] [:id]]
[:selector [0 :systemName] [:id]]
[:selector [0 :systemVersion] [:id]]
[:selector [0 :orientation] [UIKit/UIDeviceOrientation]]
[:selector [0 :uniqueIdentifier] [:id]]
[:selector [0 :identifierForVendor] [:id]]
[:selector [0 :isGeneratingDeviceOrientationNotifications] [Boolean]]
[:selector [0 :beginGeneratingDeviceOrientationNotifications] [:void]]
[:selector [0 :endGeneratingDeviceOrientationNotifications] [:void]]
[:selector [1 :setBatteryMonitoringEnabled] [:void Boolean]]
[:selector [0 :isBatteryMonitoringEnabled] [Boolean]]
[:selector [0 :batteryState] [UIKit/UIDeviceBatteryState]]
[:selector [0 :batteryLevel] [:float]]
[:selector [0 :isProximityMonitoringEnabled] [Boolean]]
[:selector [1 :setProximityMonitoringEnabled] [:void Boolean]]
[:selector [0 :proximityState] [Boolean]]
[:selector [0 :isMultitaskingSupported] [Boolean]]
[:selector [0 :userInterfaceIdiom] [UIKit/UIUserInterfaceIdiom]]
[:selector [0 :playInputClick] [:void]]
[:enum UIControlEventTouchDown UIControlEventTouchDownRepeat UIControlEventTouchDragInside UIControlEventTouchDragOutside UIControlEventTouchDragEnter UIControlEventTouchDragExit UIControlEventTouchUpInside UIControlEventTouchUpOutside UIControlEventTouchCancel UIControlEventValueChanged UIControlEventEditingDidBegin UIControlEventEditingChanged UIControlEventEditingDidEnd UIControlEventEditingDidEndOnExit UIControlEventAllTouchEvents UIControlEventAllEditingEvents UIControlEventApplicationReserved UIControlEventSystemReserved UIControlEventAllEvents UIControlEvents]
[:enum UIControlContentVerticalAlignmentCenter UIControlContentVerticalAlignmentTop UIControlContentVerticalAlignmentBottom UIControlContentVerticalAlignmentFill UIControlContentVerticalAlignment]
[:enum UIControlContentHorizontalAlignmentCenter UIControlContentHorizontalAlignmentLeft UIControlContentHorizontalAlignmentRight UIControlContentHorizontalAlignmentFill UIControlContentHorizontalAlignment]
[:enum UIControlStateNormal UIControlStateHighlighted UIControlStateDisabled UIControlStateSelected UIControlStateApplication UIControlStateReserved UIControlState]
[:selector [1 :setEnabled] [:void Boolean]]
[:selector [0 :isEnabled] [Boolean]]
[:selector [0 :isSelected] [Boolean]]
[:selector [1 :setSelected] [:void Boolean]]
[:selector [0 :isHighlighted] [Boolean]]
[:selector [1 :setHighlighted] [:void Boolean]]
[:selector [1 :setContentVerticalAlignment] [:void UIKit/UIControlContentVerticalAlignment]]
[:selector [0 :contentVerticalAlignment] [UIKit/UIControlContentVerticalAlignment]]
[:selector [1 :setContentHorizontalAlignment] [:void UIKit/UIControlContentHorizontalAlignment]]
[:selector [0 :contentHorizontalAlignment] [UIKit/UIControlContentHorizontalAlignment]]
[:selector [0 :state] [UIKit/UIControlState]]
[:selector [0 :isTracking] [Boolean]]
[:selector [0 :isTouchInside] [Boolean]]
[:selector [2 :beginTrackingWithTouch :withEvent] [Boolean :id :id]]
[:selector [2 :continueTrackingWithTouch :withEvent] [Boolean :id :id]]
[:selector [2 :endTrackingWithTouch :withEvent] [:void :id :id]]
[:selector [1 :cancelTrackingWithEvent] [:void :id]]
[:selector [3 :addTarget :action :forControlEvents] [:void :id :selector UIKit/UIControlEvents]]
[:selector [3 :removeTarget :action :forControlEvents] [:void :id :selector UIKit/UIControlEvents]]
[:selector [0 :allTargets] [:id]]
[:selector [0 :allControlEvents] [UIKit/UIControlEvents]]
[:selector [2 :actionsForTarget :forControlEvent] [:id :id UIKit/UIControlEvents]]
[:selector [3 :sendAction :to :forEvent] [:void :selector :id :id]]
[:selector [1 :sendActionsForControlEvents] [:void UIKit/UIControlEvents]]
[:enum UITextAutocapitalizationTypeNone UITextAutocapitalizationTypeWords UITextAutocapitalizationTypeSentences UITextAutocapitalizationTypeAllCharacters UITextAutocapitalizationType]
[:enum UITextAutocorrectionTypeDefault UITextAutocorrectionTypeNo UITextAutocorrectionTypeYes UITextAutocorrectionType]
[:enum UITextSpellCheckingTypeDefault UITextSpellCheckingTypeNo UITextSpellCheckingTypeYes UITextSpellCheckingType]
[:enum UIKeyboardTypeDefault UIKeyboardTypeASCIICapable UIKeyboardTypeNumbersAndPunctuation UIKeyboardTypeURL UIKeyboardTypeNumberPad UIKeyboardTypePhonePad UIKeyboardTypeNamePhonePad UIKeyboardTypeEmailAddress UIKeyboardTypeDecimalPad UIKeyboardTypeTwitter UIKeyboardTypeAlphabet UIKeyboardType]
[:enum UIKeyboardAppearanceDefault UIKeyboardAppearanceAlert UIKeyboardAppearance]
[:enum UIReturnKeyDefault UIReturnKeyGo UIReturnKeyGoogle UIReturnKeyJoin UIReturnKeyNext UIReturnKeyRoute UIReturnKeySearch UIReturnKeySend UIReturnKeyYahoo UIReturnKeyDone UIReturnKeyEmergencyCall UIReturnKeyType]
[:enum UITextStorageDirectionForward UITextStorageDirectionBackward UITextStorageDirection]
[:enum UITextLayoutDirectionRight UITextLayoutDirectionLeft UITextLayoutDirectionUp UITextLayoutDirectionDown UITextLayoutDirection]
[:enum UITextWritingDirectionNatural UITextWritingDirectionLeftToRight UITextWritingDirectionRightToLeft UITextWritingDirection]
[:enum UITextGranularityCharacter UITextGranularityWord UITextGranularitySentence UITextGranularityParagraph UITextGranularityLine UITextGranularityDocument UITextGranularity]
[:selector [0 :text] [:id]]
[:selector [0 :alternativeInterpretations] [:id]]
[:selector [0 :isEmpty] [Boolean]]
[:selector [0 :start] [:id]]
[:selector [0 :end] [:id]]
[:selector [0 :rect] [UIKit/CGRect]]
[:selector [0 :writingDirection] [UIKit/UITextWritingDirection]]
[:selector [0 :containsStart] [Boolean]]
[:selector [0 :containsEnd] [Boolean]]
[:selector [0 :isVertical] [Boolean]]
[:selector [1 :initWithTextInput] [:id :id]]
[:selector [0 :currentInputMode] [:id]]
[:selector [0 :activeInputModes] [:id]]
[:selector [0 :primaryLanguage] [:id]]
[:enum UITextBorderStyleNone UITextBorderStyleLine UITextBorderStyleBezel UITextBorderStyleRoundedRect UITextBorderStyle]
[:enum UITextFieldViewModeNever UITextFieldViewModeWhileEditing UITextFieldViewModeUnlessEditing UITextFieldViewModeAlways UITextFieldViewMode]
[:selector [1 :setText] [:void :id]]
[:selector [0 :text] [:id]]
[:selector [0 :attributedText] [:id]]
[:selector [1 :setAttributedText] [:void :id]]
[:selector [0 :textColor] [:id]]
[:selector [1 :setTextColor] [:void :id]]
[:selector [1 :setFont] [:void :id]]
[:selector [0 :font] [:id]]
[:selector [1 :setTextAlignment] [:void UIKit/NSTextAlignment]]
[:selector [0 :textAlignment] [UIKit/NSTextAlignment]]
[:selector [1 :setBorderStyle] [:void UIKit/UITextBorderStyle]]
[:selector [0 :borderStyle] [UIKit/UITextBorderStyle]]
[:selector [1 :setPlaceholder] [:void :id]]
[:selector [0 :placeholder] [:id]]
[:selector [0 :attributedPlaceholder] [:id]]
[:selector [1 :setAttributedPlaceholder] [:void :id]]
[:selector [1 :setClearsOnBeginEditing] [:void Boolean]]
[:selector [0 :clearsOnBeginEditing] [Boolean]]
[:selector [1 :setAdjustsFontSizeToFitWidth] [:void Boolean]]
[:selector [0 :adjustsFontSizeToFitWidth] [Boolean]]
[:selector [1 :setMinimumFontSize] [:void :float]]
[:selector [0 :minimumFontSize] [:float]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [0 :background] [:id]]
[:selector [1 :setBackground] [:void :id]]
[:selector [1 :setDisabledBackground] [:void :id]]
[:selector [0 :disabledBackground] [:id]]
[:selector [0 :isEditing] [Boolean]]
[:selector [0 :allowsEditingTextAttributes] [Boolean]]
[:selector [1 :setAllowsEditingTextAttributes] [:void Boolean]]
[:selector [0 :typingAttributes] [:id]]
[:selector [1 :setTypingAttributes] [:void :id]]
[:selector [1 :setClearButtonMode] [:void UIKit/UITextFieldViewMode]]
[:selector [0 :clearButtonMode] [UIKit/UITextFieldViewMode]]
[:selector [1 :setLeftView] [:void :id]]
[:selector [0 :leftView] [:id]]
[:selector [1 :setLeftViewMode] [:void UIKit/UITextFieldViewMode]]
[:selector [0 :leftViewMode] [UIKit/UITextFieldViewMode]]
[:selector [1 :setRightView] [:void :id]]
[:selector [0 :rightView] [:id]]
[:selector [1 :setRightViewMode] [:void UIKit/UITextFieldViewMode]]
[:selector [0 :rightViewMode] [UIKit/UITextFieldViewMode]]
[:selector [1 :borderRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :textRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :placeholderRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :editingRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :clearButtonRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :leftViewRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :rightViewRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :drawTextInRect] [:void UIKit/CGRect]]
[:selector [1 :drawPlaceholderInRect] [:void UIKit/CGRect]]
[:selector [0 :inputView] [:id]]
[:selector [1 :setInputView] [:void :id]]
[:selector [0 :inputAccessoryView] [:id]]
[:selector [1 :setInputAccessoryView] [:void :id]]
[:selector [0 :clearsOnInsertion] [Boolean]]
[:selector [1 :setClearsOnInsertion] [:void Boolean]]
[:selector [1 :endEditing] [Boolean Boolean]]
[:enum UIActionSheetStyleAutomatic UIActionSheetStyleDefault UIActionSheetStyleBlackTranslucent UIActionSheetStyleBlackOpaque UIActionSheetStyle]
;;FIXME: variadic initWithTitle:delegate:cancelButtonTitle:destructiveButtonTitle:otherButtonTitles:
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :title] [:id]]
[:selector [1 :setActionSheetStyle] [:void UIKit/UIActionSheetStyle]]
[:selector [0 :actionSheetStyle] [UIKit/UIActionSheetStyle]]
[:selector [1 :addButtonWithTitle] [:int :id]]
[:selector [1 :buttonTitleAtIndex] [:id :int]]
[:selector [0 :numberOfButtons] [:int]]
[:selector [1 :setCancelButtonIndex] [:void :int]]
[:selector [0 :cancelButtonIndex] [:int]]
[:selector [0 :destructiveButtonIndex] [:int]]
[:selector [1 :setDestructiveButtonIndex] [:void :int]]
[:selector [0 :firstOtherButtonIndex] [:int]]
[:selector [0 :isVisible] [Boolean]]
[:selector [1 :showFromToolbar] [:void :id]]
[:selector [1 :showFromTabBar] [:void :id]]
[:selector [2 :showFromBarButtonItem :animated] [:void :id Boolean]]
[:selector [3 :showFromRect :inView :animated] [:void UIKit/CGRect :id Boolean]]
[:selector [1 :showInView] [:void :id]]
[:selector [2 :dismissWithClickedButtonIndex :animated] [:void :int Boolean]]
[:enum UIAlertViewStyleDefault UIAlertViewStyleSecureTextInput UIAlertViewStylePlainTextInput UIAlertViewStyleLoginAndPasswordInput UIAlertViewStyle]
;;FIXME: variadic initWithTitle:message:delegate:cancelButtonTitle:otherButtonTitles:
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :title] [:id]]
[:selector [1 :setMessage] [:void :id]]
[:selector [0 :message] [:id]]
[:selector [1 :addButtonWithTitle] [:int :id]]
[:selector [1 :buttonTitleAtIndex] [:id :int]]
[:selector [0 :numberOfButtons] [:int]]
[:selector [1 :setCancelButtonIndex] [:void :int]]
[:selector [0 :cancelButtonIndex] [:int]]
[:selector [0 :firstOtherButtonIndex] [:int]]
[:selector [0 :isVisible] [Boolean]]
[:selector [0 :show] [:void]]
[:selector [2 :dismissWithClickedButtonIndex :animated] [:void :int Boolean]]
[:selector [0 :alertViewStyle] [UIKit/UIAlertViewStyle]]
[:selector [1 :setAlertViewStyle] [:void UIKit/UIAlertViewStyle]]
[:selector [1 :textFieldAtIndex] [:id :int]]
[:enum UIStatusBarStyleDefault UIStatusBarStyleBlackTranslucent UIStatusBarStyleBlackOpaque UIStatusBarStyle]
[:enum UIStatusBarAnimationNone UIStatusBarAnimationFade UIStatusBarAnimationSlide UIStatusBarAnimation]
[:enum UIInterfaceOrientationPortrait UIInterfaceOrientationPortraitUpsideDown UIInterfaceOrientationLandscapeLeft UIInterfaceOrientationLandscapeRight UIInterfaceOrientation]
[:enum UIInterfaceOrientationMaskPortrait UIInterfaceOrientationMaskLandscapeLeft UIInterfaceOrientationMaskLandscapeRight UIInterfaceOrientationMaskPortraitUpsideDown UIInterfaceOrientationMaskLandscape UIInterfaceOrientationMaskAll UIInterfaceOrientationMaskAllButUpsideDown UIInterfaceOrientationMask]
[:enum UIRemoteNotificationTypeNone UIRemoteNotificationTypeBadge UIRemoteNotificationTypeSound UIRemoteNotificationTypeAlert UIRemoteNotificationTypeNewsstandContentAvailability UIRemoteNotificationType]
[:enum UIApplicationStateActive UIApplicationStateInactive UIApplicationStateBackground UIApplicationState]
[:enum UIUserInterfaceLayoutDirectionLeftToRight UIUserInterfaceLayoutDirectionRightToLeft UIUserInterfaceLayoutDirection]
[:selector [0 :sharedApplication] [:id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :beginIgnoringInteractionEvents] [:void]]
[:selector [0 :endIgnoringInteractionEvents] [:void]]
[:selector [0 :isIgnoringInteractionEvents] [Boolean]]
[:selector [0 :isIdleTimerDisabled] [Boolean]]
[:selector [1 :setIdleTimerDisabled] [:void Boolean]]
[:selector [1 :openURL] [Boolean :id]]
[:selector [1 :canOpenURL] [Boolean :id]]
[:selector [1 :sendEvent] [:void :id]]
[:selector [0 :keyWindow] [:id]]
[:selector [0 :windows] [:id]]
[:selector [4 :sendAction :to :from :forEvent] [Boolean :selector :id :id :id]]
[:selector [1 :setNetworkActivityIndicatorVisible] [:void Boolean]]
[:selector [0 :isNetworkActivityIndicatorVisible] [Boolean]]
[:selector [1 :setStatusBarStyle] [:void UIKit/UIStatusBarStyle]]
[:selector [0 :statusBarStyle] [UIKit/UIStatusBarStyle]]
[:selector [2 :setStatusBarStyle :animated] [:void UIKit/UIStatusBarStyle Boolean]]
[:selector [1 :setStatusBarHidden] [:void Boolean]]
[:selector [0 :isStatusBarHidden] [Boolean]]
[:selector [2 :setStatusBarHidden :withAnimation] [:void Boolean UIKit/UIStatusBarAnimation]]
[:selector [1 :setStatusBarOrientation] [:void UIKit/UIInterfaceOrientation]]
[:selector [0 :statusBarOrientation] [UIKit/UIInterfaceOrientation]]
[:selector [2 :setStatusBarOrientation :animated] [:void UIKit/UIInterfaceOrientation Boolean]]
[:selector [1 :supportedInterfaceOrientationsForWindow] [:unsigned-int :id]]
[:selector [0 :statusBarOrientationAnimationDuration] [:double]]
[:selector [0 :statusBarFrame] [UIKit/CGRect]]
[:selector [1 :setApplicationIconBadgeNumber] [:void :int]]
[:selector [0 :applicationIconBadgeNumber] [:int]]
[:selector [0 :applicationSupportsShakeToEdit] [Boolean]]
[:selector [1 :setApplicationSupportsShakeToEdit] [:void Boolean]]
[:selector [0 :applicationState] [UIKit/UIApplicationState]]
[:selector [0 :backgroundTimeRemaining] [:double]]
;;FIXME: void (^)(void) in beginBackgroundTaskWithExpirationHandler:
[:selector [1 :endBackgroundTask] [:void :unsigned-int]]
;;FIXME: void (^)(void) in setKeepAliveTimeout:handler:
[:selector [0 :clearKeepAliveTimeout] [:void]]
[:selector [0 :isProtectedDataAvailable] [Boolean]]
[:selector [0 :userInterfaceLayoutDirection] [UIKit/UIUserInterfaceLayoutDirection]]
[:selector [1 :registerForRemoteNotificationTypes] [:void UIKit/UIRemoteNotificationType]]
[:selector [0 :unregisterForRemoteNotifications] [:void]]
[:selector [0 :enabledRemoteNotificationTypes] [UIKit/UIRemoteNotificationType]]
[:selector [1 :presentLocalNotificationNow] [:void :id]]
[:selector [1 :scheduleLocalNotification] [:void :id]]
[:selector [1 :cancelLocalNotification] [:void :id]]
[:selector [0 :cancelAllLocalNotifications] [:void]]
[:selector [0 :scheduledLocalNotifications] [:id]]
[:selector [1 :setScheduledLocalNotifications] [:void :id]]
[:selector [0 :beginReceivingRemoteControlEvents] [:void]]
[:selector [0 :endReceivingRemoteControlEvents] [:void]]
[:selector [1 :setNewsstandIconImage] [:void :id]]
[:selector [0 :extendStateRestoration] [:void]]
[:selector [0 :completeStateRestoration] [:void]]
[:selector [2 :setStatusBarHidden :animated] [:void Boolean Boolean]]
[:selector [0 :isProximitySensingEnabled] [Boolean]]
[:selector [1 :setProximitySensingEnabled] [:void Boolean]]
;;FIXME: char *[] in UIApplicationMain
[:enum UIModalTransitionStyleCoverVertical UIModalTransitionStyleFlipHorizontal UIModalTransitionStyleCrossDissolve UIModalTransitionStylePartialCurl UIModalTransitionStyle]
[:enum UIModalPresentationFullScreen UIModalPresentationPageSheet UIModalPresentationFormSheet UIModalPresentationCurrentContext UIModalPresentationStyle]
[:selector [2 :initWithNibName :bundle] [:id :id :id]]
[:selector [0 :view] [:id]]
[:selector [1 :setView] [:void :id]]
[:selector [0 :loadView] [:void]]
[:selector [0 :viewWillUnload] [:void]]
[:selector [0 :viewDidUnload] [:void]]
[:selector [0 :viewDidLoad] [:void]]
[:selector [0 :isViewLoaded] [Boolean]]
[:selector [0 :nibName] [:id]]
[:selector [0 :nibBundle] [:id]]
[:selector [0 :storyboard] [:id]]
[:selector [2 :performSegueWithIdentifier :sender] [:void :id :id]]
[:selector [2 :shouldPerformSegueWithIdentifier :sender] [Boolean :id :id]]
[:selector [2 :prepareForSegue :sender] [:void :id :id]]
[:selector [3 :canPerformUnwindSegueAction :fromViewController :withSender] [Boolean :selector :id :id]]
[:selector [3 :viewControllerForUnwindSegueAction :fromViewController :withSender] [:id :selector :id :id]]
[:selector [3 :segueForUnwindingToViewController :fromViewController :identifier] [:id :id :id :id]]
[:selector [1 :viewWillAppear] [:void Boolean]]
[:selector [1 :viewDidAppear] [:void Boolean]]
[:selector [1 :viewWillDisappear] [:void Boolean]]
[:selector [1 :viewDidDisappear] [:void Boolean]]
[:selector [0 :viewWillLayoutSubviews] [:void]]
[:selector [0 :viewDidLayoutSubviews] [:void]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :title] [:id]]
[:selector [0 :didReceiveMemoryWarning] [:void]]
[:selector [0 :parentViewController] [:id]]
[:selector [0 :modalViewController] [:id]]
[:selector [0 :presentedViewController] [:id]]
[:selector [0 :presentingViewController] [:id]]
[:selector [1 :setDefinesPresentationContext] [:void Boolean]]
[:selector [0 :definesPresentationContext] [Boolean]]
[:selector [0 :providesPresentationContextTransitionStyle] [Boolean]]
[:selector [1 :setProvidesPresentationContextTransitionStyle] [:void Boolean]]
[:selector [0 :isBeingPresented] [Boolean]]
[:selector [0 :isBeingDismissed] [Boolean]]
[:selector [0 :isMovingToParentViewController] [Boolean]]
[:selector [0 :isMovingFromParentViewController] [Boolean]]
;;FIXME: void (^)(void) in presentViewController:animated:completion:
;;FIXME: void (^)(void) in dismissViewControllerAnimated:completion:
[:selector [2 :presentModalViewController :animated] [:void :id Boolean]]
[:selector [1 :dismissModalViewControllerAnimated] [:void Boolean]]
[:selector [0 :modalTransitionStyle] [UIKit/UIModalTransitionStyle]]
[:selector [1 :setModalTransitionStyle] [:void UIKit/UIModalTransitionStyle]]
[:selector [0 :modalPresentationStyle] [UIKit/UIModalPresentationStyle]]
[:selector [1 :setModalPresentationStyle] [:void UIKit/UIModalPresentationStyle]]
[:selector [0 :disablesAutomaticKeyboardDismissal] [Boolean]]
[:selector [0 :wantsFullScreenLayout] [Boolean]]
[:selector [1 :setWantsFullScreenLayout] [:void Boolean]]
[:selector [0 :attemptRotationToDeviceOrientation] [:void]]
[:selector [1 :shouldAutorotateToInterfaceOrientation] [Boolean UIKit/UIInterfaceOrientation]]
[:selector [0 :shouldAutorotate] [Boolean]]
[:selector [0 :supportedInterfaceOrientations] [:unsigned-int]]
[:selector [0 :preferredInterfaceOrientationForPresentation] [UIKit/UIInterfaceOrientation]]
[:selector [0 :rotatingHeaderView] [:id]]
[:selector [0 :rotatingFooterView] [:id]]
[:selector [2 :willRotateToInterfaceOrientation :duration] [:void UIKit/UIInterfaceOrientation :double]]
[:selector [1 :didRotateFromInterfaceOrientation] [:void UIKit/UIInterfaceOrientation]]
[:selector [2 :willAnimateRotationToInterfaceOrientation :duration] [:void UIKit/UIInterfaceOrientation :double]]
[:selector [2 :willAnimateFirstHalfOfRotationToInterfaceOrientation :duration] [:void UIKit/UIInterfaceOrientation :double]]
[:selector [1 :didAnimateFirstHalfOfRotationToInterfaceOrientation] [:void UIKit/UIInterfaceOrientation]]
[:selector [2 :willAnimateSecondHalfOfRotationFromInterfaceOrientation :duration] [:void UIKit/UIInterfaceOrientation :double]]
[:selector [0 :interfaceOrientation] [UIKit/UIInterfaceOrientation]]
[:selector [2 :setEditing :animated] [:void Boolean Boolean]]
[:selector [0 :editButtonItem] [:id]]
[:selector [0 :isEditing] [Boolean]]
[:selector [1 :setEditing] [:void Boolean]]
[:selector [0 :searchDisplayController] [:id]]
[:selector [1 :addChildViewController] [:void :id]]
[:selector [0 :removeFromParentViewController] [:void]]
;;FIXME: void (^)(void) in transitionFromViewController:toViewController:duration:options:animations:completion:
[:selector [2 :beginAppearanceTransition :animated] [:void Boolean Boolean]]
[:selector [0 :endAppearanceTransition] [:void]]
[:selector [0 :childViewControllers] [:id]]
[:selector [0 :automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers] [Boolean]]
[:selector [0 :shouldAutomaticallyForwardRotationMethods] [Boolean]]
[:selector [0 :shouldAutomaticallyForwardAppearanceMethods] [Boolean]]
[:selector [1 :willMoveToParentViewController] [:void :id]]
[:selector [1 :didMoveToParentViewController] [:void :id]]
[:selector [1 :encodeRestorableStateWithCoder] [:void :id]]
[:selector [1 :decodeRestorableStateWithCoder] [:void :id]]
[:selector [0 :restorationIdentifier] [:id]]
[:selector [1 :setRestorationIdentifier] [:void :id]]
[:selector [0 :restorationClass] [:id]]
[:selector [1 :setRestorationClass] [:void :id]]
[:selector [0 :updateViewConstraints] [:void]]
[:selector [2 :initWithActivityItems :applicationActivities] [:id :id :id]]
;;FIXME: UIActivityViewControllerCompletionHandler in completionHandler
;;FIXME: UIActivityViewControllerCompletionHandler in setCompletionHandler:
[:selector [0 :excludedActivityTypes] [:id]]
[:selector [1 :setExcludedActivityTypes] [:void :id]]
[:selector [2 :setTitleTextAttributes :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :titleTextAttributesForState] [:id UIKit/UIControlState]]
[:selector [0 :isEnabled] [Boolean]]
[:selector [1 :setEnabled] [:void Boolean]]
[:selector [0 :title] [:id]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :image] [:id]]
[:selector [1 :setImage] [:void :id]]
[:selector [0 :landscapeImagePhone] [:id]]
[:selector [1 :setLandscapeImagePhone] [:void :id]]
[:selector [0 :imageInsets] [UIKit/UIEdgeInsets]]
[:selector [1 :setImageInsets] [:void UIKit/UIEdgeInsets]]
[:selector [0 :landscapeImagePhoneInsets] [UIKit/UIEdgeInsets]]
[:selector [1 :setLandscapeImagePhoneInsets] [:void UIKit/UIEdgeInsets]]
[:selector [0 :tag] [:int]]
[:selector [1 :setTag] [:void :int]]
[:enum UIBarMetricsDefault UIBarMetricsLandscapePhone UIBarMetrics]
[:enum UIBarButtonItemStylePlain UIBarButtonItemStyleBordered UIBarButtonItemStyleDone UIBarButtonItemStyle]
[:enum UIBarButtonSystemItemDone UIBarButtonSystemItemCancel UIBarButtonSystemItemEdit UIBarButtonSystemItemSave UIBarButtonSystemItemAdd UIBarButtonSystemItemFlexibleSpace UIBarButtonSystemItemFixedSpace UIBarButtonSystemItemCompose UIBarButtonSystemItemReply UIBarButtonSystemItemAction UIBarButtonSystemItemOrganize UIBarButtonSystemItemBookmarks UIBarButtonSystemItemSearch UIBarButtonSystemItemRefresh UIBarButtonSystemItemStop UIBarButtonSystemItemCamera UIBarButtonSystemItemTrash UIBarButtonSystemItemPlay UIBarButtonSystemItemPause UIBarButtonSystemItemRewind UIBarButtonSystemItemFastForward UIBarButtonSystemItemUndo UIBarButtonSystemItemRedo UIBarButtonSystemItemPageCurl UIBarButtonSystemItem]
[:selector [4 :initWithImage :style :target :action] [:id :id UIKit/UIBarButtonItemStyle :id :selector]]
[:selector [5 :initWithImage :landscapeImagePhone :style :target :action] [:id :id :id UIKit/UIBarButtonItemStyle :id :selector]]
[:selector [4 :initWithTitle :style :target :action] [:id :id UIKit/UIBarButtonItemStyle :id :selector]]
[:selector [3 :initWithBarButtonSystemItem :target :action] [:id UIKit/UIBarButtonSystemItem :id :selector]]
[:selector [1 :initWithCustomView] [:id :id]]
[:selector [0 :style] [UIKit/UIBarButtonItemStyle]]
[:selector [1 :setStyle] [:void UIKit/UIBarButtonItemStyle]]
[:selector [0 :width] [:float]]
[:selector [1 :setWidth] [:void :float]]
[:selector [0 :possibleTitles] [:id]]
[:selector [1 :setPossibleTitles] [:void :id]]
[:selector [1 :setCustomView] [:void :id]]
[:selector [0 :customView] [:id]]
[:selector [1 :setAction] [:void :selector]]
[:selector [0 :action] [:selector]]
[:selector [0 :target] [:id]]
[:selector [1 :setTarget] [:void :id]]
[:selector [3 :setBackgroundImage :forState :barMetrics] [:void :id UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [2 :backgroundImageForState :barMetrics] [:id UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [4 :setBackgroundImage :forState :style :barMetrics] [:void :id UIKit/UIControlState UIKit/UIBarButtonItemStyle UIKit/UIBarMetrics]]
[:selector [3 :backgroundImageForState :style :barMetrics] [:id UIKit/UIControlState UIKit/UIBarButtonItemStyle UIKit/UIBarMetrics]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [2 :setBackgroundVerticalPositionAdjustment :forBarMetrics] [:void :float UIKit/UIBarMetrics]]
[:selector [1 :backgroundVerticalPositionAdjustmentForBarMetrics] [:float UIKit/UIBarMetrics]]
[:selector [2 :setTitlePositionAdjustment :forBarMetrics] [:void UIKit/UIOffset UIKit/UIBarMetrics]]
[:selector [1 :titlePositionAdjustmentForBarMetrics] [UIKit/UIOffset UIKit/UIBarMetrics]]
[:selector [3 :setBackButtonBackgroundImage :forState :barMetrics] [:void :id UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [2 :backButtonBackgroundImageForState :barMetrics] [:id UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [2 :setBackButtonTitlePositionAdjustment :forBarMetrics] [:void UIKit/UIOffset UIKit/UIBarMetrics]]
[:selector [1 :backButtonTitlePositionAdjustmentForBarMetrics] [UIKit/UIOffset UIKit/UIBarMetrics]]
[:selector [2 :setBackButtonBackgroundVerticalPositionAdjustment :forBarMetrics] [:void :float UIKit/UIBarMetrics]]
[:selector [1 :backButtonBackgroundVerticalPositionAdjustmentForBarMetrics] [:float UIKit/UIBarMetrics]]
[:enum UIRectCornerTopLeft UIRectCornerTopRight UIRectCornerBottomLeft UIRectCornerBottomRight UIRectCornerAllCorners UIRectCorner]
[:selector [0 :bezierPath] [:id]]
[:selector [1 :bezierPathWithRect] [:id UIKit/CGRect]]
[:selector [1 :bezierPathWithOvalInRect] [:id UIKit/CGRect]]
[:selector [2 :bezierPathWithRoundedRect :cornerRadius] [:id UIKit/CGRect :float]]
[:selector [3 :bezierPathWithRoundedRect :byRoundingCorners :cornerRadii] [:id UIKit/CGRect UIKit/UIRectCorner UIKit/CGSize]]
[:selector [5 :bezierPathWithArcCenter :radius :startAngle :endAngle :clockwise] [:id UIKit/CGPoint :float :float :float Boolean]]
;;FIXME: CGPathRef in bezierPathWithCGPath:
[:selector [1 :moveToPoint] [:void UIKit/CGPoint]]
[:selector [1 :addLineToPoint] [:void UIKit/CGPoint]]
[:selector [3 :addCurveToPoint :controlPoint1 :controlPoint2] [:void UIKit/CGPoint UIKit/CGPoint UIKit/CGPoint]]
[:selector [2 :addQuadCurveToPoint :controlPoint] [:void UIKit/CGPoint UIKit/CGPoint]]
[:selector [5 :addArcWithCenter :radius :startAngle :endAngle :clockwise] [:void UIKit/CGPoint :float :float :float Boolean]]
[:selector [0 :closePath] [:void]]
[:selector [0 :removeAllPoints] [:void]]
[:selector [1 :appendPath] [:void :id]]
[:selector [0 :bezierPathByReversingPath] [:id]]
[:selector [1 :applyTransform] [:void UIKit/CGAffineTransform]]
[:selector [1 :containsPoint] [Boolean UIKit/CGPoint]]
;;FIXME: const CGFloat * in setLineDash:count:phase:
;;FIXME: CGFloat * in getLineDash:count:phase:
[:selector [0 :fill] [:void]]
[:selector [0 :stroke] [:void]]
[:selector [2 :fillWithBlendMode :alpha] [:void UIKit/CGBlendMode :float]]
[:selector [2 :strokeWithBlendMode :alpha] [:void UIKit/CGBlendMode :float]]
[:selector [0 :addClip] [:void]]
;;FIXME: CGPathRef in CGPath
;;FIXME: CGPathRef in setCGPath:
[:selector [0 :isEmpty] [Boolean]]
[:selector [0 :bounds] [UIKit/CGRect]]
[:selector [0 :currentPoint] [UIKit/CGPoint]]
[:selector [0 :lineWidth] [:float]]
[:selector [1 :setLineWidth] [:void :float]]
[:selector [0 :lineCapStyle] [UIKit/CGLineCap]]
[:selector [1 :setLineCapStyle] [:void UIKit/CGLineCap]]
[:selector [0 :lineJoinStyle] [UIKit/CGLineJoin]]
[:selector [1 :setLineJoinStyle] [:void UIKit/CGLineJoin]]
[:selector [0 :miterLimit] [:float]]
[:selector [1 :setMiterLimit] [:void :float]]
[:selector [0 :flatness] [:float]]
[:selector [1 :setFlatness] [:void :float]]
[:selector [0 :usesEvenOddFillRule] [Boolean]]
[:selector [1 :setUsesEvenOddFillRule] [:void Boolean]]
[:enum UIButtonTypeCustom UIButtonTypeRoundedRect UIButtonTypeDetailDisclosure UIButtonTypeInfoLight UIButtonTypeInfoDark UIButtonTypeContactAdd UIButtonType]
[:selector [1 :buttonWithType] [:id UIKit/UIButtonType]]
[:selector [0 :contentEdgeInsets] [UIKit/UIEdgeInsets]]
[:selector [1 :setContentEdgeInsets] [:void UIKit/UIEdgeInsets]]
[:selector [0 :titleEdgeInsets] [UIKit/UIEdgeInsets]]
[:selector [1 :setTitleEdgeInsets] [:void UIKit/UIEdgeInsets]]
[:selector [1 :setReversesTitleShadowWhenHighlighted] [:void Boolean]]
[:selector [0 :reversesTitleShadowWhenHighlighted] [Boolean]]
[:selector [1 :setImageEdgeInsets] [:void UIKit/UIEdgeInsets]]
[:selector [0 :imageEdgeInsets] [UIKit/UIEdgeInsets]]
[:selector [0 :adjustsImageWhenHighlighted] [Boolean]]
[:selector [1 :setAdjustsImageWhenHighlighted] [:void Boolean]]
[:selector [0 :adjustsImageWhenDisabled] [Boolean]]
[:selector [1 :setAdjustsImageWhenDisabled] [:void Boolean]]
[:selector [0 :showsTouchWhenHighlighted] [Boolean]]
[:selector [1 :setShowsTouchWhenHighlighted] [:void Boolean]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :tintColor] [:id]]
[:selector [0 :buttonType] [UIKit/UIButtonType]]
[:selector [2 :setTitle :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setTitleColor :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setTitleShadowColor :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setImage :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setBackgroundImage :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setAttributedTitle :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :titleForState] [:id UIKit/UIControlState]]
[:selector [1 :titleColorForState] [:id UIKit/UIControlState]]
[:selector [1 :titleShadowColorForState] [:id UIKit/UIControlState]]
[:selector [1 :imageForState] [:id UIKit/UIControlState]]
[:selector [1 :backgroundImageForState] [:id UIKit/UIControlState]]
[:selector [1 :attributedTitleForState] [:id UIKit/UIControlState]]
[:selector [0 :currentTitle] [:id]]
[:selector [0 :currentTitleColor] [:id]]
[:selector [0 :currentTitleShadowColor] [:id]]
[:selector [0 :currentImage] [:id]]
[:selector [0 :currentBackgroundImage] [:id]]
[:selector [0 :currentAttributedTitle] [:id]]
[:selector [0 :titleLabel] [:id]]
[:selector [0 :imageView] [:id]]
[:selector [1 :backgroundRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :contentRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :titleRectForContentRect] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :imageRectForContentRect] [UIKit/CGRect UIKit/CGRect]]
[:selector [0 :font] [:id]]
[:selector [1 :setFont] [:void :id]]
[:selector [0 :lineBreakMode] [UIKit/NSLineBreakMode]]
[:selector [1 :setLineBreakMode] [:void UIKit/NSLineBreakMode]]
[:selector [0 :titleShadowOffset] [UIKit/CGSize]]
[:selector [1 :setTitleShadowOffset] [:void UIKit/CGSize]]
[:enum UICollectionViewScrollPositionNone UICollectionViewScrollPositionTop UICollectionViewScrollPositionCenteredVertically UICollectionViewScrollPositionBottom UICollectionViewScrollPositionLeft UICollectionViewScrollPositionCenteredHorizontally UICollectionViewScrollPositionRight UICollectionViewScrollPosition]
[:selector [2 :initWithFrame :collectionViewLayout] [:id UIKit/CGRect :id]]
[:selector [2 :registerClass :forCellWithReuseIdentifier] [:void :id :id]]
[:selector [2 :registerNib :forCellWithReuseIdentifier] [:void :id :id]]
[:selector [3 :registerClass :forSupplementaryViewOfKind :withReuseIdentifier] [:void :id :id :id]]
[:selector [3 :registerNib :forSupplementaryViewOfKind :withReuseIdentifier] [:void :id :id :id]]
[:selector [2 :dequeueReusableCellWithReuseIdentifier :forIndexPath] [:id :id :id]]
[:selector [3 :dequeueReusableSupplementaryViewOfKind :withReuseIdentifier :forIndexPath] [:id :id :id :id]]
[:selector [0 :indexPathsForSelectedItems] [:id]]
[:selector [3 :selectItemAtIndexPath :animated :scrollPosition] [:void :id Boolean UIKit/UICollectionViewScrollPosition]]
[:selector [2 :deselectItemAtIndexPath :animated] [:void :id Boolean]]
[:selector [0 :reloadData] [:void]]
[:selector [2 :setCollectionViewLayout :animated] [:void :id Boolean]]
[:selector [0 :numberOfSections] [:int]]
[:selector [1 :numberOfItemsInSection] [:int :int]]
[:selector [1 :layoutAttributesForItemAtIndexPath] [:id :id]]
[:selector [2 :layoutAttributesForSupplementaryElementOfKind :atIndexPath] [:id :id :id]]
[:selector [1 :indexPathForItemAtPoint] [:id UIKit/CGPoint]]
[:selector [1 :indexPathForCell] [:id :id]]
[:selector [1 :cellForItemAtIndexPath] [:id :id]]
[:selector [0 :visibleCells] [:id]]
[:selector [0 :indexPathsForVisibleItems] [:id]]
[:selector [3 :scrollToItemAtIndexPath :atScrollPosition :animated] [:void :id UIKit/UICollectionViewScrollPosition Boolean]]
[:selector [1 :insertSections] [:void :id]]
[:selector [1 :deleteSections] [:void :id]]
[:selector [1 :reloadSections] [:void :id]]
[:selector [2 :moveSection :toSection] [:void :int :int]]
[:selector [1 :insertItemsAtIndexPaths] [:void :id]]
[:selector [1 :deleteItemsAtIndexPaths] [:void :id]]
[:selector [1 :reloadItemsAtIndexPaths] [:void :id]]
[:selector [2 :moveItemAtIndexPath :toIndexPath] [:void :id :id]]
;;FIXME: void (^)(void) in performBatchUpdates:completion:
[:selector [0 :collectionViewLayout] [:id]]
[:selector [1 :setCollectionViewLayout] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :dataSource] [:id]]
[:selector [1 :setDataSource] [:void :id]]
[:selector [0 :backgroundView] [:id]]
[:selector [1 :setBackgroundView] [:void :id]]
[:selector [0 :allowsSelection] [Boolean]]
[:selector [1 :setAllowsSelection] [:void Boolean]]
[:selector [0 :allowsMultipleSelection] [Boolean]]
[:selector [1 :setAllowsMultipleSelection] [:void Boolean]]
[:selector [2 :indexPathForItem :inSection] [:id :int :int]]
[:selector [0 :item] [:int]]
[:selector [0 :prepareForReuse] [:void]]
[:selector [1 :applyLayoutAttributes] [:void :id]]
[:selector [2 :willTransitionFromLayout :toLayout] [:void :id :id]]
[:selector [2 :didTransitionFromLayout :toLayout] [:void :id :id]]
[:selector [0 :reuseIdentifier] [:id]]
[:selector [0 :contentView] [:id]]
[:selector [0 :isSelected] [Boolean]]
[:selector [1 :setSelected] [:void Boolean]]
[:selector [0 :isHighlighted] [Boolean]]
[:selector [1 :setHighlighted] [:void Boolean]]
[:selector [0 :backgroundView] [:id]]
[:selector [1 :setBackgroundView] [:void :id]]
[:selector [0 :selectedBackgroundView] [:id]]
[:selector [1 :setSelectedBackgroundView] [:void :id]]
[:selector [1 :initWithCollectionViewLayout] [:id :id]]
[:selector [0 :collectionView] [:id]]
[:selector [1 :setCollectionView] [:void :id]]
[:selector [0 :clearsSelectionOnViewWillAppear] [Boolean]]
[:selector [1 :setClearsSelectionOnViewWillAppear] [:void Boolean]]
[:function CACurrentMediaTime [:double]]
[:compound CATransform3D "sizeof (CATransform3D)"]
[:function CATransform3DIsIdentity [Boolean UIKit/CATransform3D]]
[:function CATransform3DEqualToTransform [Boolean UIKit/CATransform3D UIKit/CATransform3D]]
[:function CATransform3DMakeTranslation [UIKit/CATransform3D :float :float :float]]
[:function CATransform3DMakeScale [UIKit/CATransform3D :float :float :float]]
[:function CATransform3DMakeRotation [UIKit/CATransform3D :float :float :float :float]]
[:function CATransform3DTranslate [UIKit/CATransform3D UIKit/CATransform3D :float :float :float]]
[:function CATransform3DScale [UIKit/CATransform3D UIKit/CATransform3D :float :float :float]]
[:function CATransform3DRotate [UIKit/CATransform3D UIKit/CATransform3D :float :float :float :float]]
[:function CATransform3DConcat [UIKit/CATransform3D UIKit/CATransform3D UIKit/CATransform3D]]
[:function CATransform3DInvert [UIKit/CATransform3D UIKit/CATransform3D]]
[:function CATransform3DMakeAffineTransform [UIKit/CATransform3D UIKit/CGAffineTransform]]
[:function CATransform3DIsAffine [Boolean UIKit/CATransform3D]]
[:function CATransform3DGetAffineTransform [UIKit/CGAffineTransform UIKit/CATransform3D]]
[:selector [1 :valueWithCATransform3D] [:id UIKit/CATransform3D]]
[:selector [0 :CATransform3DValue] [UIKit/CATransform3D]]
[:enum UICollectionElementCategoryCell UICollectionElementCategorySupplementaryView UICollectionElementCategoryDecorationView UICollectionElementCategory]
[:selector [1 :layoutAttributesForCellWithIndexPath] [:id :id]]
[:selector [2 :layoutAttributesForSupplementaryViewOfKind :withIndexPath] [:id :id :id]]
[:selector [2 :layoutAttributesForDecorationViewOfKind :withIndexPath] [:id :id :id]]
[:selector [0 :frame] [UIKit/CGRect]]
[:selector [1 :setFrame] [:void UIKit/CGRect]]
[:selector [0 :center] [UIKit/CGPoint]]
[:selector [1 :setCenter] [:void UIKit/CGPoint]]
[:selector [0 :size] [UIKit/CGSize]]
[:selector [1 :setSize] [:void UIKit/CGSize]]
[:selector [0 :transform3D] [UIKit/CATransform3D]]
[:selector [1 :setTransform3D] [:void UIKit/CATransform3D]]
[:selector [0 :alpha] [:float]]
[:selector [1 :setAlpha] [:void :float]]
[:selector [0 :zIndex] [:int]]
[:selector [1 :setZIndex] [:void :int]]
[:selector [0 :isHidden] [Boolean]]
[:selector [1 :setHidden] [:void Boolean]]
[:selector [0 :indexPath] [:id]]
[:selector [1 :setIndexPath] [:void :id]]
[:selector [0 :representedElementCategory] [UIKit/UICollectionElementCategory]]
[:selector [0 :representedElementKind] [:id]]
[:enum UICollectionUpdateActionInsert UICollectionUpdateActionDelete UICollectionUpdateActionReload UICollectionUpdateActionMove UICollectionUpdateActionNone UICollectionUpdateAction]
[:selector [0 :indexPathBeforeUpdate] [:id]]
[:selector [0 :indexPathAfterUpdate] [:id]]
[:selector [0 :updateAction] [UIKit/UICollectionUpdateAction]]
[:selector [0 :invalidateLayout] [:void]]
[:selector [2 :registerClass :forDecorationViewOfKind] [:void :id :id]]
[:selector [2 :registerNib :forDecorationViewOfKind] [:void :id :id]]
[:selector [0 :collectionView] [:id]]
[:selector [0 :layoutAttributesClass] [:id]]
[:selector [0 :prepareLayout] [:void]]
[:selector [1 :layoutAttributesForElementsInRect] [:id UIKit/CGRect]]
[:selector [1 :layoutAttributesForItemAtIndexPath] [:id :id]]
[:selector [2 :layoutAttributesForSupplementaryViewOfKind :atIndexPath] [:id :id :id]]
[:selector [2 :layoutAttributesForDecorationViewOfKind :atIndexPath] [:id :id :id]]
[:selector [1 :shouldInvalidateLayoutForBoundsChange] [Boolean UIKit/CGRect]]
[:selector [2 :targetContentOffsetForProposedContentOffset :withScrollingVelocity] [UIKit/CGPoint UIKit/CGPoint UIKit/CGPoint]]
[:selector [0 :collectionViewContentSize] [UIKit/CGSize]]
[:selector [1 :prepareForCollectionViewUpdates] [:void :id]]
[:selector [0 :finalizeCollectionViewUpdates] [:void]]
[:selector [1 :prepareForAnimatedBoundsChange] [:void UIKit/CGRect]]
[:selector [0 :finalizeAnimatedBoundsChange] [:void]]
[:selector [1 :initialLayoutAttributesForAppearingItemAtIndexPath] [:id :id]]
[:selector [1 :finalLayoutAttributesForDisappearingItemAtIndexPath] [:id :id]]
[:selector [2 :initialLayoutAttributesForAppearingSupplementaryElementOfKind :atIndexPath] [:id :id :id]]
[:selector [2 :finalLayoutAttributesForDisappearingSupplementaryElementOfKind :atIndexPath] [:id :id :id]]
[:selector [2 :initialLayoutAttributesForAppearingDecorationElementOfKind :atIndexPath] [:id :id :id]]
[:selector [2 :finalLayoutAttributesForDisappearingDecorationElementOfKind :atIndexPath] [:id :id :id]]
[:enum UICollectionViewScrollDirectionVertical UICollectionViewScrollDirectionHorizontal UICollectionViewScrollDirection]
[:selector [0 :minimumLineSpacing] [:float]]
[:selector [1 :setMinimumLineSpacing] [:void :float]]
[:selector [0 :minimumInteritemSpacing] [:float]]
[:selector [1 :setMinimumInteritemSpacing] [:void :float]]
[:selector [0 :itemSize] [UIKit/CGSize]]
[:selector [1 :setItemSize] [:void UIKit/CGSize]]
[:selector [0 :scrollDirection] [UIKit/UICollectionViewScrollDirection]]
[:selector [1 :setScrollDirection] [:void UIKit/UICollectionViewScrollDirection]]
[:selector [0 :headerReferenceSize] [UIKit/CGSize]]
[:selector [1 :setHeaderReferenceSize] [:void UIKit/CGSize]]
[:selector [0 :footerReferenceSize] [UIKit/CGSize]]
[:selector [1 :setFooterReferenceSize] [:void UIKit/CGSize]]
[:selector [0 :sectionInset] [UIKit/UIEdgeInsets]]
[:selector [1 :setSectionInset] [:void UIKit/UIEdgeInsets]]
[:enum UIDataDetectorTypePhoneNumber UIDataDetectorTypeLink UIDataDetectorTypeAddress UIDataDetectorTypeCalendarEvent UIDataDetectorTypeNone UIDataDetectorTypeAll UIDataDetectorTypes]
[:enum UIDatePickerModeTime UIDatePickerModeDate UIDatePickerModeDateAndTime UIDatePickerModeCountDownTimer UIDatePickerMode]
[:selector [2 :setDate :animated] [:void :id Boolean]]
[:selector [0 :datePickerMode] [UIKit/UIDatePickerMode]]
[:selector [1 :setDatePickerMode] [:void UIKit/UIDatePickerMode]]
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :calendar] [:id]]
[:selector [1 :setCalendar] [:void :id]]
[:selector [0 :timeZone] [:id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [0 :date] [:id]]
[:selector [1 :setDate] [:void :id]]
[:selector [0 :minimumDate] [:id]]
[:selector [1 :setMinimumDate] [:void :id]]
[:selector [0 :maximumDate] [:id]]
[:selector [1 :setMaximumDate] [:void :id]]
[:selector [0 :countDownDuration] [:double]]
[:selector [1 :setCountDownDuration] [:void :double]]
[:selector [0 :minuteInterval] [:int]]
[:selector [1 :setMinuteInterval] [:void :int]]
[:enum UIDocumentChangeDone UIDocumentChangeUndone UIDocumentChangeRedone UIDocumentChangeCleared UIDocumentChangeKind]
[:enum UIDocumentSaveForCreating UIDocumentSaveForOverwriting UIDocumentSaveOperation]
[:enum UIDocumentStateNormal UIDocumentStateClosed UIDocumentStateInConflict UIDocumentStateSavingError UIDocumentStateEditingDisabled UIDocumentState]
[:selector [1 :initWithFileURL] [:id :id]]
[:selector [0 :fileURL] [:id]]
[:selector [0 :localizedName] [:id]]
[:selector [0 :fileType] [:id]]
[:selector [1 :setFileModificationDate] [:void :id]]
[:selector [0 :fileModificationDate] [:id]]
[:selector [0 :documentState] [UIKit/UIDocumentState]]
;;FIXME: void (^)(BOOL) in openWithCompletionHandler:
;;FIXME: void (^)(BOOL) in closeWithCompletionHandler:
;;FIXME: NSError ** in loadFromContents:ofType:error:
;;FIXME: NSError ** in contentsForType:error:
[:selector [0 :disableEditing] [:void]]
[:selector [0 :enableEditing] [:void]]
[:selector [1 :setUndoManager] [:void :id]]
[:selector [0 :undoManager] [:id]]
[:selector [0 :hasUnsavedChanges] [Boolean]]
[:selector [1 :updateChangeCount] [:void UIKit/UIDocumentChangeKind]]
[:selector [1 :changeCountTokenForSaveOperation] [:id UIKit/UIDocumentSaveOperation]]
[:selector [2 :updateChangeCountWithToken :forSaveOperation] [:void :id UIKit/UIDocumentSaveOperation]]
;;FIXME: void (^)(BOOL) in saveToURL:forSaveOperation:completionHandler:
;;FIXME: void (^)(BOOL) in autosaveWithCompletionHandler:
[:selector [0 :savingFileType] [:id]]
[:selector [2 :fileNameExtensionForType :saveOperation] [:id :id UIKit/UIDocumentSaveOperation]]
;;FIXME: NSError ** in writeContents:andAttributes:safelyToURL:forSaveOperation:error:
;;FIXME: NSError ** in writeContents:toURL:forSaveOperation:originalContentsURL:error:
;;FIXME: NSError ** in fileAttributesToWriteToURL:forSaveOperation:error:
;;FIXME: NSError ** in readFromURL:error:
;;FIXME: void (^)(void) in performAsynchronousFileAccessUsingBlock:
[:selector [2 :handleError :userInteractionPermitted] [:void :id Boolean]]
[:selector [2 :finishedHandlingError :recovered] [:void :id Boolean]]
[:selector [1 :userInteractionNoLongerPermittedForError] [:void :id]]
;;FIXME: void (^)(BOOL) in revertToContentsOfURL:completionHandler:
[:selector [1 :interactionControllerWithURL] [:id :id]]
[:selector [3 :presentOptionsMenuFromRect :inView :animated] [Boolean UIKit/CGRect :id Boolean]]
[:selector [2 :presentOptionsMenuFromBarButtonItem :animated] [Boolean :id Boolean]]
[:selector [1 :presentPreviewAnimated] [Boolean Boolean]]
[:selector [3 :presentOpenInMenuFromRect :inView :animated] [Boolean UIKit/CGRect :id Boolean]]
[:selector [2 :presentOpenInMenuFromBarButtonItem :animated] [Boolean :id Boolean]]
[:selector [1 :dismissPreviewAnimated] [:void Boolean]]
[:selector [1 :dismissMenuAnimated] [:void Boolean]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :URL] [:id]]
[:selector [1 :setURL] [:void :id]]
[:selector [0 :UTI] [:id]]
[:selector [1 :setUTI] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [1 :setName] [:void :id]]
[:selector [0 :icons] [:id]]
[:selector [0 :annotation] [:id]]
[:selector [1 :setAnnotation] [:void :id]]
[:selector [0 :gestureRecognizers] [:id]]
;;FIXME: CGContextRef in UIGraphicsGetCurrentContext
;;FIXME: CGContextRef in UIGraphicsPushContext
[:function UIGraphicsPopContext [:void]]
[:function UIRectFillUsingBlendMode [:void UIKit/CGRect UIKit/CGBlendMode]]
[:function UIRectFill [:void UIKit/CGRect]]
[:function UIRectFrameUsingBlendMode [:void UIKit/CGRect UIKit/CGBlendMode]]
[:function UIRectFrame [:void UIKit/CGRect]]
[:function UIRectClip [:void UIKit/CGRect]]
[:function UIGraphicsBeginImageContext [:void UIKit/CGSize]]
[:function UIGraphicsBeginImageContextWithOptions [:void UIKit/CGSize Boolean :float]]
[:function UIGraphicsGetImageFromCurrentImageContext [:id]]
[:function UIGraphicsEndImageContext [:void]]
[:function UIGraphicsBeginPDFContextToFile [Boolean :id UIKit/CGRect :id]]
[:function UIGraphicsBeginPDFContextToData [:void :id UIKit/CGRect :id]]
[:function UIGraphicsEndPDFContext [:void]]
[:function UIGraphicsBeginPDFPage [:void]]
[:function UIGraphicsBeginPDFPageWithInfo [:void UIKit/CGRect :id]]
[:function UIGraphicsGetPDFContextBounds [UIKit/CGRect]]
[:function UIGraphicsSetPDFContextURLForRect [:void :id UIKit/CGRect]]
[:function UIGraphicsAddPDFContextDestinationAtPoint [:void :id UIKit/CGPoint]]
[:function UIGraphicsSetPDFContextDestinationForRect [:void :id UIKit/CGRect]]
[:selector [2 :initWithNavigationBarClass :toolbarClass] [:id :id :id]]
[:selector [1 :initWithRootViewController] [:id :id]]
[:selector [2 :pushViewController :animated] [:void :id Boolean]]
[:selector [1 :popViewControllerAnimated] [:id Boolean]]
[:selector [2 :popToViewController :animated] [:id :id Boolean]]
[:selector [1 :popToRootViewControllerAnimated] [:id Boolean]]
[:selector [0 :topViewController] [:id]]
[:selector [0 :visibleViewController] [:id]]
[:selector [1 :setViewControllers] [:void :id]]
[:selector [0 :viewControllers] [:id]]
[:selector [2 :setViewControllers :animated] [:void :id Boolean]]
[:selector [0 :isNavigationBarHidden] [Boolean]]
[:selector [1 :setNavigationBarHidden] [:void Boolean]]
[:selector [2 :setNavigationBarHidden :animated] [:void Boolean Boolean]]
[:selector [0 :navigationBar] [:id]]
[:selector [0 :isToolbarHidden] [Boolean]]
[:selector [1 :setToolbarHidden] [:void Boolean]]
[:selector [2 :setToolbarHidden :animated] [:void Boolean Boolean]]
[:selector [0 :toolbar] [:id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :navigationItem] [:id]]
[:selector [0 :hidesBottomBarWhenPushed] [Boolean]]
[:selector [1 :setHidesBottomBarWhenPushed] [:void Boolean]]
[:selector [0 :navigationController] [:id]]
[:selector [2 :setToolbarItems :animated] [:void :id Boolean]]
[:selector [0 :toolbarItems] [:id]]
[:selector [1 :setToolbarItems] [:void :id]]
[:enum UIImagePickerControllerSourceTypePhotoLibrary UIImagePickerControllerSourceTypeCamera UIImagePickerControllerSourceTypeSavedPhotosAlbum UIImagePickerControllerSourceType]
[:enum UIImagePickerControllerQualityTypeHigh UIImagePickerControllerQualityTypeMedium UIImagePickerControllerQualityTypeLow UIImagePickerControllerQualityType640x480 UIImagePickerControllerQualityTypeIFrame1280x720 UIImagePickerControllerQualityTypeIFrame960x540 UIImagePickerControllerQualityType]
[:enum UIImagePickerControllerCameraCaptureModePhoto UIImagePickerControllerCameraCaptureModeVideo UIImagePickerControllerCameraCaptureMode]
[:enum UIImagePickerControllerCameraDeviceRear UIImagePickerControllerCameraDeviceFront UIImagePickerControllerCameraDevice]
[:enum UIImagePickerControllerCameraFlashModeOff UIImagePickerControllerCameraFlashModeAuto UIImagePickerControllerCameraFlashModeOn UIImagePickerControllerCameraFlashMode]
[:selector [1 :isSourceTypeAvailable] [Boolean UIKit/UIImagePickerControllerSourceType]]
[:selector [1 :availableMediaTypesForSourceType] [:id UIKit/UIImagePickerControllerSourceType]]
[:selector [1 :isCameraDeviceAvailable] [Boolean UIKit/UIImagePickerControllerCameraDevice]]
[:selector [1 :isFlashAvailableForCameraDevice] [Boolean UIKit/UIImagePickerControllerCameraDevice]]
[:selector [1 :availableCaptureModesForCameraDevice] [:id UIKit/UIImagePickerControllerCameraDevice]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setSourceType] [:void UIKit/UIImagePickerControllerSourceType]]
[:selector [0 :sourceType] [UIKit/UIImagePickerControllerSourceType]]
[:selector [0 :mediaTypes] [:id]]
[:selector [1 :setMediaTypes] [:void :id]]
[:selector [1 :setAllowsEditing] [:void Boolean]]
[:selector [0 :allowsEditing] [Boolean]]
[:selector [1 :setAllowsImageEditing] [:void Boolean]]
[:selector [0 :allowsImageEditing] [Boolean]]
[:selector [1 :setVideoMaximumDuration] [:void :double]]
[:selector [0 :videoMaximumDuration] [:double]]
[:selector [0 :videoQuality] [UIKit/UIImagePickerControllerQualityType]]
[:selector [1 :setVideoQuality] [:void UIKit/UIImagePickerControllerQualityType]]
[:selector [0 :showsCameraControls] [Boolean]]
[:selector [1 :setShowsCameraControls] [:void Boolean]]
[:selector [0 :cameraOverlayView] [:id]]
[:selector [1 :setCameraOverlayView] [:void :id]]
[:selector [0 :cameraViewTransform] [UIKit/CGAffineTransform]]
[:selector [1 :setCameraViewTransform] [:void UIKit/CGAffineTransform]]
[:selector [0 :takePicture] [:void]]
[:selector [0 :startVideoCapture] [Boolean]]
[:selector [0 :stopVideoCapture] [:void]]
[:selector [0 :cameraCaptureMode] [UIKit/UIImagePickerControllerCameraCaptureMode]]
[:selector [1 :setCameraCaptureMode] [:void UIKit/UIImagePickerControllerCameraCaptureMode]]
[:selector [0 :cameraDevice] [UIKit/UIImagePickerControllerCameraDevice]]
[:selector [1 :setCameraDevice] [:void UIKit/UIImagePickerControllerCameraDevice]]
[:selector [0 :cameraFlashMode] [UIKit/UIImagePickerControllerCameraFlashMode]]
[:selector [1 :setCameraFlashMode] [:void UIKit/UIImagePickerControllerCameraFlashMode]]
;;FIXME: void * in UIImageWriteToSavedPhotosAlbum
[:function UIVideoAtPathIsCompatibleWithSavedPhotosAlbum [Boolean :id]]
;;FIXME: void * in UISaveVideoAtPathToSavedPhotosAlbum
[:selector [1 :initWithImage] [:id :id]]
[:selector [2 :initWithImage :highlightedImage] [:id :id :id]]
[:selector [0 :startAnimating] [:void]]
[:selector [0 :stopAnimating] [:void]]
[:selector [0 :isAnimating] [Boolean]]
[:selector [0 :image] [:id]]
[:selector [1 :setImage] [:void :id]]
[:selector [0 :highlightedImage] [:id]]
[:selector [1 :setHighlightedImage] [:void :id]]
[:selector [0 :isUserInteractionEnabled] [Boolean]]
[:selector [1 :setUserInteractionEnabled] [:void Boolean]]
[:selector [0 :isHighlighted] [Boolean]]
[:selector [1 :setHighlighted] [:void Boolean]]
[:selector [0 :animationImages] [:id]]
[:selector [1 :setAnimationImages] [:void :id]]
[:selector [0 :highlightedAnimationImages] [:id]]
[:selector [1 :setHighlightedAnimationImages] [:void :id]]
[:selector [0 :animationDuration] [:double]]
[:selector [1 :setAnimationDuration] [:void :double]]
[:selector [0 :animationRepeatCount] [:int]]
[:selector [1 :setAnimationRepeatCount] [:void :int]]
[:selector [2 :textRectForBounds :limitedToNumberOfLines] [UIKit/CGRect UIKit/CGRect :int]]
[:selector [1 :drawTextInRect] [:void UIKit/CGRect]]
[:selector [0 :text] [:id]]
[:selector [1 :setText] [:void :id]]
[:selector [0 :font] [:id]]
[:selector [1 :setFont] [:void :id]]
[:selector [0 :textColor] [:id]]
[:selector [1 :setTextColor] [:void :id]]
[:selector [0 :shadowColor] [:id]]
[:selector [1 :setShadowColor] [:void :id]]
[:selector [0 :shadowOffset] [UIKit/CGSize]]
[:selector [1 :setShadowOffset] [:void UIKit/CGSize]]
[:selector [0 :textAlignment] [UIKit/NSTextAlignment]]
[:selector [1 :setTextAlignment] [:void UIKit/NSTextAlignment]]
[:selector [0 :lineBreakMode] [UIKit/NSLineBreakMode]]
[:selector [1 :setLineBreakMode] [:void UIKit/NSLineBreakMode]]
[:selector [0 :attributedText] [:id]]
[:selector [1 :setAttributedText] [:void :id]]
[:selector [0 :highlightedTextColor] [:id]]
[:selector [1 :setHighlightedTextColor] [:void :id]]
[:selector [0 :isHighlighted] [Boolean]]
[:selector [1 :setHighlighted] [:void Boolean]]
[:selector [0 :isUserInteractionEnabled] [Boolean]]
[:selector [1 :setUserInteractionEnabled] [:void Boolean]]
[:selector [0 :isEnabled] [Boolean]]
[:selector [1 :setEnabled] [:void Boolean]]
[:selector [0 :numberOfLines] [:int]]
[:selector [1 :setNumberOfLines] [:void :int]]
[:selector [0 :adjustsFontSizeToFitWidth] [Boolean]]
[:selector [1 :setAdjustsFontSizeToFitWidth] [:void Boolean]]
[:selector [0 :adjustsLetterSpacingToFitWidth] [Boolean]]
[:selector [1 :setAdjustsLetterSpacingToFitWidth] [:void Boolean]]
[:selector [0 :minimumFontSize] [:float]]
[:selector [1 :setMinimumFontSize] [:void :float]]
[:selector [0 :baselineAdjustment] [UIKit/UIBaselineAdjustment]]
[:selector [1 :setBaselineAdjustment] [:void UIKit/UIBaselineAdjustment]]
[:selector [0 :minimumScaleFactor] [:float]]
[:selector [1 :setMinimumScaleFactor] [:void :float]]
[:selector [0 :preferredMaxLayoutWidth] [:float]]
[:selector [1 :setPreferredMaxLayoutWidth] [:void :float]]
[:selector [0 :fireDate] [:id]]
[:selector [1 :setFireDate] [:void :id]]
[:selector [0 :timeZone] [:id]]
[:selector [1 :setTimeZone] [:void :id]]
[:selector [0 :repeatInterval] [UIKit/NSCalendarUnit]]
[:selector [1 :setRepeatInterval] [:void UIKit/NSCalendarUnit]]
[:selector [0 :repeatCalendar] [:id]]
[:selector [1 :setRepeatCalendar] [:void :id]]
[:selector [0 :alertBody] [:id]]
[:selector [1 :setAlertBody] [:void :id]]
[:selector [0 :hasAction] [Boolean]]
[:selector [1 :setHasAction] [:void Boolean]]
[:selector [0 :alertAction] [:id]]
[:selector [1 :setAlertAction] [:void :id]]
[:selector [0 :alertLaunchImage] [:id]]
[:selector [1 :setAlertLaunchImage] [:void :id]]
[:selector [0 :soundName] [:id]]
[:selector [1 :setSoundName] [:void :id]]
[:selector [0 :applicationIconBadgeNumber] [:int]]
[:selector [1 :setApplicationIconBadgeNumber] [:void :int]]
[:selector [0 :userInfo] [:id]]
[:selector [1 :setUserInfo] [:void :id]]
[:selector [0 :currentCollation] [:id]]
[:selector [1 :sectionForSectionIndexTitleAtIndex] [:int :int]]
[:selector [2 :sectionForObject :collationStringSelector] [:int :id :selector]]
[:selector [2 :sortedArrayFromArray :collationStringSelector] [:id :id :selector]]
[:selector [0 :sectionTitles] [:id]]
[:selector [0 :sectionIndexTitles] [:id]]
[:selector [0 :numberOfTapsRequired] [:unsigned-int]]
[:selector [1 :setNumberOfTapsRequired] [:void :unsigned-int]]
[:selector [0 :numberOfTouchesRequired] [:unsigned-int]]
[:selector [1 :setNumberOfTouchesRequired] [:void :unsigned-int]]
[:selector [0 :minimumPressDuration] [:double]]
[:selector [1 :setMinimumPressDuration] [:void :double]]
[:selector [0 :allowableMovement] [:float]]
[:selector [1 :setAllowableMovement] [:void :float]]
[:selector [0 :persistentStoreName] [:id]]
[:selector [0 :managedObjectContext] [:id]]
[:selector [0 :managedObjectModel] [:id]]
[:selector [1 :setPersistentStoreOptions] [:void :id]]
[:selector [0 :persistentStoreOptions] [:id]]
[:selector [1 :setModelConfiguration] [:void :id]]
[:selector [0 :modelConfiguration] [:id]]
;;FIXME: NSError ** in configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:
[:selector [1 :persistentStoreTypeForFileType] [:id :id]]
;;FIXME: NSError ** in readAdditionalContentFromURL:error:
;;FIXME: NSError ** in additionalContentForURL:error:
;;FIXME: NSError ** in writeAdditionalContent:toURL:originalContentsURL:error:
[:enum UIMenuControllerArrowDefault UIMenuControllerArrowUp UIMenuControllerArrowDown UIMenuControllerArrowLeft UIMenuControllerArrowRight UIMenuControllerArrowDirection]
[:selector [0 :sharedMenuController] [:id]]
[:selector [2 :setMenuVisible :animated] [:void Boolean Boolean]]
[:selector [2 :setTargetRect :inView] [:void UIKit/CGRect :id]]
[:selector [0 :update] [:void]]
[:selector [0 :isMenuVisible] [Boolean]]
[:selector [1 :setMenuVisible] [:void Boolean]]
[:selector [0 :arrowDirection] [UIKit/UIMenuControllerArrowDirection]]
[:selector [1 :setArrowDirection] [:void UIKit/UIMenuControllerArrowDirection]]
[:selector [0 :menuItems] [:id]]
[:selector [1 :setMenuItems] [:void :id]]
[:selector [0 :menuFrame] [UIKit/CGRect]]
[:selector [2 :initWithTitle :action] [:id :id :selector]]
[:selector [0 :title] [:id]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :action] [:selector]]
[:selector [1 :setAction] [:void :selector]]
[:selector [1 :setBarStyle] [:void UIKit/UIBarStyle]]
[:selector [0 :barStyle] [UIKit/UIBarStyle]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setTranslucent] [:void Boolean]]
[:selector [0 :isTranslucent] [Boolean]]
[:selector [2 :pushNavigationItem :animated] [:void :id Boolean]]
[:selector [1 :popNavigationItemAnimated] [:id Boolean]]
[:selector [0 :topItem] [:id]]
[:selector [0 :backItem] [:id]]
[:selector [1 :setItems] [:void :id]]
[:selector [0 :items] [:id]]
[:selector [2 :setItems :animated] [:void :id Boolean]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [2 :setBackgroundImage :forBarMetrics] [:void :id UIKit/UIBarMetrics]]
[:selector [1 :backgroundImageForBarMetrics] [:id UIKit/UIBarMetrics]]
[:selector [0 :shadowImage] [:id]]
[:selector [1 :setShadowImage] [:void :id]]
[:selector [0 :titleTextAttributes] [:id]]
[:selector [1 :setTitleTextAttributes] [:void :id]]
[:selector [2 :setTitleVerticalPositionAdjustment :forBarMetrics] [:void :float UIKit/UIBarMetrics]]
[:selector [1 :titleVerticalPositionAdjustmentForBarMetrics] [:float UIKit/UIBarMetrics]]
[:selector [1 :initWithTitle] [:id :id]]
[:selector [2 :setHidesBackButton :animated] [:void Boolean Boolean]]
[:selector [2 :setLeftBarButtonItems :animated] [:void :id Boolean]]
[:selector [2 :setRightBarButtonItems :animated] [:void :id Boolean]]
[:selector [2 :setLeftBarButtonItem :animated] [:void :id Boolean]]
[:selector [2 :setRightBarButtonItem :animated] [:void :id Boolean]]
[:selector [0 :title] [:id]]
[:selector [1 :setTitle] [:void :id]]
[:selector [0 :backBarButtonItem] [:id]]
[:selector [1 :setBackBarButtonItem] [:void :id]]
[:selector [0 :titleView] [:id]]
[:selector [1 :setTitleView] [:void :id]]
[:selector [0 :prompt] [:id]]
[:selector [1 :setPrompt] [:void :id]]
[:selector [0 :hidesBackButton] [Boolean]]
[:selector [1 :setHidesBackButton] [:void Boolean]]
[:selector [0 :leftBarButtonItems] [:id]]
[:selector [1 :setLeftBarButtonItems] [:void :id]]
[:selector [0 :rightBarButtonItems] [:id]]
[:selector [1 :setRightBarButtonItems] [:void :id]]
[:selector [0 :leftItemsSupplementBackButton] [Boolean]]
[:selector [1 :setLeftItemsSupplementBackButton] [:void Boolean]]
[:selector [0 :leftBarButtonItem] [:id]]
[:selector [1 :setLeftBarButtonItem] [:void :id]]
[:selector [0 :rightBarButtonItem] [:id]]
[:selector [1 :setRightBarButtonItem] [:void :id]]
[:selector [2 :nibWithNibName :bundle] [:id :id :id]]
[:selector [2 :nibWithData :bundle] [:id :id :id]]
[:selector [2 :instantiateWithOwner :options] [:id :id :id]]
[:selector [3 :loadNibNamed :owner :options] [:id :id :id :id]]
[:selector [0 :awakeFromNib] [:void]]
[:selector [1 :setNumberOfPages] [:void :int]]
[:selector [0 :numberOfPages] [:int]]
[:selector [1 :setCurrentPage] [:void :int]]
[:selector [0 :currentPage] [:int]]
[:selector [1 :setHidesForSinglePage] [:void Boolean]]
[:selector [0 :hidesForSinglePage] [Boolean]]
[:selector [0 :defersCurrentPageDisplay] [Boolean]]
[:selector [1 :setDefersCurrentPageDisplay] [:void Boolean]]
[:selector [0 :updateCurrentPageDisplay] [:void]]
[:selector [1 :sizeForNumberOfPages] [UIKit/CGSize :int]]
[:selector [0 :pageIndicatorTintColor] [:id]]
[:selector [1 :setPageIndicatorTintColor] [:void :id]]
[:selector [0 :currentPageIndicatorTintColor] [:id]]
[:selector [1 :setCurrentPageIndicatorTintColor] [:void :id]]
[:enum UIPageViewControllerNavigationOrientationHorizontal UIPageViewControllerNavigationOrientationVertical UIPageViewControllerNavigationOrientation]
[:enum UIPageViewControllerSpineLocationNone UIPageViewControllerSpineLocationMin UIPageViewControllerSpineLocationMid UIPageViewControllerSpineLocationMax UIPageViewControllerSpineLocation]
[:enum UIPageViewControllerNavigationDirectionForward UIPageViewControllerNavigationDirectionReverse UIPageViewControllerNavigationDirection]
[:enum UIPageViewControllerTransitionStylePageCurl UIPageViewControllerTransitionStyleScroll UIPageViewControllerTransitionStyle]
[:selector [3 :initWithTransitionStyle :navigationOrientation :options] [:id UIKit/UIPageViewControllerTransitionStyle UIKit/UIPageViewControllerNavigationOrientation :id]]
;;FIXME: void (^)(BOOL) in setViewControllers:direction:animated:completion:
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :dataSource] [:id]]
[:selector [1 :setDataSource] [:void :id]]
[:selector [0 :transitionStyle] [UIKit/UIPageViewControllerTransitionStyle]]
[:selector [0 :navigationOrientation] [UIKit/UIPageViewControllerNavigationOrientation]]
[:selector [0 :spineLocation] [UIKit/UIPageViewControllerSpineLocation]]
[:selector [0 :isDoubleSided] [Boolean]]
[:selector [1 :setDoubleSided] [:void Boolean]]
[:selector [0 :gestureRecognizers] [:id]]
[:selector [0 :viewControllers] [:id]]
[:selector [1 :translationInView] [UIKit/CGPoint :id]]
[:selector [2 :setTranslation :inView] [:void UIKit/CGPoint :id]]
[:selector [1 :velocityInView] [UIKit/CGPoint :id]]
[:selector [0 :minimumNumberOfTouches] [:unsigned-int]]
[:selector [1 :setMinimumNumberOfTouches] [:void :unsigned-int]]
[:selector [0 :maximumNumberOfTouches] [:unsigned-int]]
[:selector [1 :setMaximumNumberOfTouches] [:void :unsigned-int]]
[:selector [0 :generalPasteboard] [:id]]
[:selector [2 :pasteboardWithName :create] [:id :id Boolean]]
[:selector [0 :pasteboardWithUniqueName] [:id]]
[:selector [1 :removePasteboardWithName] [:void :id]]
[:selector [0 :pasteboardTypes] [:id]]
[:selector [1 :containsPasteboardTypes] [Boolean :id]]
[:selector [1 :dataForPasteboardType] [:id :id]]
[:selector [1 :valueForPasteboardType] [:id :id]]
[:selector [2 :setValue :forPasteboardType] [:void :id :id]]
[:selector [2 :setData :forPasteboardType] [:void :id :id]]
[:selector [1 :pasteboardTypesForItemSet] [:id :id]]
[:selector [2 :containsPasteboardTypes :inItemSet] [Boolean :id :id]]
[:selector [1 :itemSetWithPasteboardTypes] [:id :id]]
[:selector [2 :valuesForPasteboardType :inItemSet] [:id :id :id]]
[:selector [2 :dataForPasteboardType :inItemSet] [:id :id :id]]
[:selector [1 :addItems] [:void :id]]
[:selector [0 :name] [:id]]
[:selector [0 :isPersistent] [Boolean]]
[:selector [1 :setPersistent] [:void Boolean]]
[:selector [0 :changeCount] [:int]]
[:selector [0 :numberOfItems] [:int]]
[:selector [0 :items] [:id]]
[:selector [1 :setItems] [:void :id]]
[:selector [0 :string] [:id]]
[:selector [1 :setString] [:void :id]]
[:selector [0 :strings] [:id]]
[:selector [1 :setStrings] [:void :id]]
[:selector [0 :URL] [:id]]
[:selector [1 :setURL] [:void :id]]
[:selector [0 :URLs] [:id]]
[:selector [1 :setURLs] [:void :id]]
[:selector [0 :image] [:id]]
[:selector [1 :setImage] [:void :id]]
[:selector [0 :images] [:id]]
[:selector [1 :setImages] [:void :id]]
[:selector [0 :color] [:id]]
[:selector [1 :setColor] [:void :id]]
[:selector [0 :colors] [:id]]
[:selector [1 :setColors] [:void :id]]
[:selector [0 :scale] [:float]]
[:selector [1 :setScale] [:void :float]]
[:selector [0 :velocity] [:float]]
[:enum UIPopoverArrowDirectionUp UIPopoverArrowDirectionDown UIPopoverArrowDirectionLeft UIPopoverArrowDirectionRight UIPopoverArrowDirectionAny UIPopoverArrowDirectionUnknown UIPopoverArrowDirection]
[:selector [1 :initWithContentViewController] [:id :id]]
[:selector [2 :setContentViewController :animated] [:void :id Boolean]]
[:selector [2 :setPopoverContentSize :animated] [:void UIKit/CGSize Boolean]]
[:selector [4 :presentPopoverFromRect :inView :permittedArrowDirections :animated] [:void UIKit/CGRect :id UIKit/UIPopoverArrowDirection Boolean]]
[:selector [3 :presentPopoverFromBarButtonItem :permittedArrowDirections :animated] [:void :id UIKit/UIPopoverArrowDirection Boolean]]
[:selector [1 :dismissPopoverAnimated] [:void Boolean]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :contentViewController] [:id]]
[:selector [1 :setContentViewController] [:void :id]]
[:selector [0 :popoverContentSize] [UIKit/CGSize]]
[:selector [1 :setPopoverContentSize] [:void UIKit/CGSize]]
[:selector [0 :isPopoverVisible] [Boolean]]
[:selector [0 :popoverArrowDirection] [UIKit/UIPopoverArrowDirection]]
[:selector [0 :passthroughViews] [:id]]
[:selector [1 :setPassthroughViews] [:void :id]]
[:selector [0 :popoverLayoutMargins] [UIKit/UIEdgeInsets]]
[:selector [1 :setPopoverLayoutMargins] [:void UIKit/UIEdgeInsets]]
[:selector [0 :popoverBackgroundViewClass] [:id]]
[:selector [1 :setPopoverBackgroundViewClass] [:void :id]]
[:selector [0 :contentSizeForViewInPopover] [UIKit/CGSize]]
[:selector [1 :setContentSizeForViewInPopover] [:void UIKit/CGSize]]
[:selector [0 :isModalInPopover] [Boolean]]
[:selector [1 :setModalInPopover] [:void Boolean]]
[:selector [0 :arrowHeight] [:float]]
[:selector [0 :arrowBase] [:float]]
[:selector [0 :contentViewInsets] [UIKit/UIEdgeInsets]]
[:selector [0 :wantsDefaultContentAppearance] [Boolean]]
[:selector [0 :arrowOffset] [:float]]
[:selector [1 :setArrowOffset] [:void :float]]
[:selector [0 :arrowDirection] [UIKit/UIPopoverArrowDirection]]
[:selector [1 :setArrowDirection] [:void UIKit/UIPopoverArrowDirection]]
[:enum UIPrintingNotAvailableError UIPrintNoContentError UIPrintUnknownImageFormatError UIPrintJobFailedError nil]
[:selector [0 :removeFromPrintPageRenderer] [:void]]
[:selector [1 :rectForPageAtIndex] [UIKit/CGRect :int]]
[:selector [2 :drawInRect :forPageAtIndex] [:void UIKit/CGRect :int]]
[:selector [0 :printPageRenderer] [:id]]
[:selector [0 :maximumContentHeight] [:float]]
[:selector [1 :setMaximumContentHeight] [:void :float]]
[:selector [0 :maximumContentWidth] [:float]]
[:selector [1 :setMaximumContentWidth] [:void :float]]
[:selector [0 :contentInsets] [UIKit/UIEdgeInsets]]
[:selector [1 :setContentInsets] [:void UIKit/UIEdgeInsets]]
[:selector [0 :startPage] [:int]]
[:selector [1 :setStartPage] [:void :int]]
[:selector [0 :pageCount] [:int]]
[:selector [1 :initWithText] [:id :id]]
[:selector [0 :text] [:id]]
[:selector [1 :setText] [:void :id]]
[:selector [0 :font] [:id]]
[:selector [1 :setFont] [:void :id]]
[:selector [0 :color] [:id]]
[:selector [1 :setColor] [:void :id]]
[:selector [0 :textAlignment] [UIKit/NSTextAlignment]]
[:selector [1 :setTextAlignment] [:void UIKit/NSTextAlignment]]
[:selector [1 :initWithMarkupText] [:id :id]]
[:selector [0 :markupText] [:id]]
[:selector [1 :setMarkupText] [:void :id]]
[:selector [0 :view] [:id]]
[:selector [0 :viewPrintFormatter] [:id]]
[:selector [2 :drawRect :forViewPrintFormatter] [:void UIKit/CGRect :id]]
[:enum UIPrintInfoOutputGeneral UIPrintInfoOutputPhoto UIPrintInfoOutputGrayscale UIPrintInfoOutputType]
[:enum UIPrintInfoOrientationPortrait UIPrintInfoOrientationLandscape UIPrintInfoOrientation]
[:enum UIPrintInfoDuplexNone UIPrintInfoDuplexLongEdge UIPrintInfoDuplexShortEdge UIPrintInfoDuplex]
[:selector [0 :printInfo] [:id]]
[:selector [1 :printInfoWithDictionary] [:id :id]]
[:selector [0 :dictionaryRepresentation] [:id]]
[:selector [0 :printerID] [:id]]
[:selector [1 :setPrinterID] [:void :id]]
[:selector [0 :jobName] [:id]]
[:selector [1 :setJobName] [:void :id]]
[:selector [0 :outputType] [UIKit/UIPrintInfoOutputType]]
[:selector [1 :setOutputType] [:void UIKit/UIPrintInfoOutputType]]
[:selector [0 :orientation] [UIKit/UIPrintInfoOrientation]]
[:selector [1 :setOrientation] [:void UIKit/UIPrintInfoOrientation]]
[:selector [0 :duplex] [UIKit/UIPrintInfoDuplex]]
[:selector [1 :setDuplex] [:void UIKit/UIPrintInfoDuplex]]
[:selector [0 :isPrintingAvailable] [Boolean]]
[:selector [0 :printableUTIs] [:id]]
[:selector [1 :canPrintURL] [Boolean :id]]
[:selector [1 :canPrintData] [Boolean :id]]
[:selector [0 :sharedPrintController] [:id]]
;;FIXME: UIPrintInteractionCompletionHandler in presentAnimated:completionHandler:
;;FIXME: UIPrintInteractionCompletionHandler in presentFromRect:inView:animated:completionHandler:
;;FIXME: UIPrintInteractionCompletionHandler in presentFromBarButtonItem:animated:completionHandler:
[:selector [1 :dismissAnimated] [:void Boolean]]
[:selector [0 :printInfo] [:id]]
[:selector [1 :setPrintInfo] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :showsPageRange] [Boolean]]
[:selector [1 :setShowsPageRange] [:void Boolean]]
[:selector [0 :printPaper] [:id]]
[:selector [0 :printPageRenderer] [:id]]
[:selector [1 :setPrintPageRenderer] [:void :id]]
[:selector [0 :printFormatter] [:id]]
[:selector [1 :setPrintFormatter] [:void :id]]
[:selector [0 :printingItem] [:id]]
[:selector [1 :setPrintingItem] [:void :id]]
[:selector [0 :printingItems] [:id]]
[:selector [1 :setPrintingItems] [:void :id]]
[:selector [1 :printFormattersForPageAtIndex] [:id :int]]
[:selector [2 :addPrintFormatter :startingAtPageAtIndex] [:void :id :int]]
[:selector [0 :numberOfPages] [:int]]
[:selector [1 :prepareForDrawingPages] [:void UIKit/NSRange]]
[:selector [2 :drawPageAtIndex :inRect] [:void :int UIKit/CGRect]]
[:selector [2 :drawPrintFormatter :forPageAtIndex] [:void :id :int]]
[:selector [2 :drawHeaderForPageAtIndex :inRect] [:void :int UIKit/CGRect]]
[:selector [2 :drawContentForPageAtIndex :inRect] [:void :int UIKit/CGRect]]
[:selector [2 :drawFooterForPageAtIndex :inRect] [:void :int UIKit/CGRect]]
[:selector [0 :headerHeight] [:float]]
[:selector [1 :setHeaderHeight] [:void :float]]
[:selector [0 :footerHeight] [:float]]
[:selector [1 :setFooterHeight] [:void :float]]
[:selector [0 :paperRect] [UIKit/CGRect]]
[:selector [0 :printableRect] [UIKit/CGRect]]
[:selector [0 :printFormatters] [:id]]
[:selector [1 :setPrintFormatters] [:void :id]]
[:selector [2 :bestPaperForPageSize :withPapersFromArray] [:id UIKit/CGSize :id]]
[:selector [0 :paperSize] [UIKit/CGSize]]
[:selector [0 :printableRect] [UIKit/CGRect]]
[:selector [0 :printRect] [UIKit/CGRect]]
[:enum UIProgressViewStyleDefault UIProgressViewStyleBar UIProgressViewStyle]
[:selector [1 :initWithProgressViewStyle] [:id UIKit/UIProgressViewStyle]]
[:selector [2 :setProgress :animated] [:void :float Boolean]]
[:selector [0 :progressViewStyle] [UIKit/UIProgressViewStyle]]
[:selector [1 :setProgressViewStyle] [:void UIKit/UIProgressViewStyle]]
[:selector [0 :progress] [:float]]
[:selector [1 :setProgress] [:void :float]]
[:selector [0 :progressTintColor] [:id]]
[:selector [1 :setProgressTintColor] [:void :id]]
[:selector [0 :trackTintColor] [:id]]
[:selector [1 :setTrackTintColor] [:void :id]]
[:selector [0 :progressImage] [:id]]
[:selector [1 :setProgressImage] [:void :id]]
[:selector [0 :trackImage] [:id]]
[:selector [1 :setTrackImage] [:void :id]]
[:selector [1 :dictionaryHasDefinitionForTerm] [Boolean :id]]
[:selector [1 :initWithTerm] [:id :id]]
[:selector [0 :init] [:id]]
[:selector [0 :beginRefreshing] [:void]]
[:selector [0 :endRefreshing] [:void]]
[:selector [0 :isRefreshing] [Boolean]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :attributedTitle] [:id]]
[:selector [1 :setAttributedTitle] [:void :id]]
[:selector [0 :rotation] [:float]]
[:selector [1 :setRotation] [:void :float]]
[:selector [0 :velocity] [:float]]
[:enum UIScreenOverscanCompensationScale UIScreenOverscanCompensationInsetBounds UIScreenOverscanCompensationInsetApplicationFrame UIScreenOverscanCompensation]
[:selector [0 :screens] [:id]]
[:selector [0 :mainScreen] [:id]]
[:selector [0 :bounds] [UIKit/CGRect]]
[:selector [0 :applicationFrame] [UIKit/CGRect]]
[:selector [0 :scale] [:float]]
[:selector [0 :availableModes] [:id]]
[:selector [0 :preferredMode] [:id]]
[:selector [0 :currentMode] [:id]]
[:selector [1 :setCurrentMode] [:void :id]]
[:selector [0 :overscanCompensation] [UIKit/UIScreenOverscanCompensation]]
[:selector [1 :setOverscanCompensation] [:void UIKit/UIScreenOverscanCompensation]]
[:selector [0 :mirroredScreen] [:id]]
[:selector [0 :brightness] [:float]]
[:selector [1 :setBrightness] [:void :float]]
[:selector [0 :wantsSoftwareDimming] [Boolean]]
[:selector [1 :setWantsSoftwareDimming] [:void Boolean]]
[:selector [2 :displayLinkWithTarget :selector] [:id :id :selector]]
[:selector [0 :size] [UIKit/CGSize]]
[:selector [0 :pixelAspectRatio] [:float]]
[:enum UISearchBarIconSearch UISearchBarIconClear UISearchBarIconBookmark UISearchBarIconResultsList UISearchBarIcon]
[:selector [0 :barStyle] [UIKit/UIBarStyle]]
[:selector [1 :setBarStyle] [:void UIKit/UIBarStyle]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :text] [:id]]
[:selector [1 :setText] [:void :id]]
[:selector [0 :prompt] [:id]]
[:selector [1 :setPrompt] [:void :id]]
[:selector [0 :placeholder] [:id]]
[:selector [1 :setPlaceholder] [:void :id]]
[:selector [0 :showsBookmarkButton] [Boolean]]
[:selector [1 :setShowsBookmarkButton] [:void Boolean]]
[:selector [0 :showsCancelButton] [Boolean]]
[:selector [1 :setShowsCancelButton] [:void Boolean]]
[:selector [0 :showsSearchResultsButton] [Boolean]]
[:selector [1 :setShowsSearchResultsButton] [:void Boolean]]
[:selector [0 :isSearchResultsButtonSelected] [Boolean]]
[:selector [1 :setSearchResultsButtonSelected] [:void Boolean]]
[:selector [2 :setShowsCancelButton :animated] [:void Boolean Boolean]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :isTranslucent] [Boolean]]
[:selector [1 :setTranslucent] [:void Boolean]]
[:selector [1 :setAutocapitalizationType] [:void UIKit/UITextAutocapitalizationType]]
[:selector [0 :autocapitalizationType] [UIKit/UITextAutocapitalizationType]]
[:selector [0 :autocorrectionType] [UIKit/UITextAutocorrectionType]]
[:selector [1 :setAutocorrectionType] [:void UIKit/UITextAutocorrectionType]]
[:selector [0 :spellCheckingType] [UIKit/UITextSpellCheckingType]]
[:selector [1 :setSpellCheckingType] [:void UIKit/UITextSpellCheckingType]]
[:selector [0 :keyboardType] [UIKit/UIKeyboardType]]
[:selector [1 :setKeyboardType] [:void UIKit/UIKeyboardType]]
[:selector [1 :setScopeButtonTitles] [:void :id]]
[:selector [0 :scopeButtonTitles] [:id]]
[:selector [1 :setSelectedScopeButtonIndex] [:void :int]]
[:selector [0 :selectedScopeButtonIndex] [:int]]
[:selector [0 :showsScopeBar] [Boolean]]
[:selector [1 :setShowsScopeBar] [:void Boolean]]
[:selector [0 :inputAccessoryView] [:id]]
[:selector [1 :setInputAccessoryView] [:void :id]]
[:selector [0 :backgroundImage] [:id]]
[:selector [1 :setBackgroundImage] [:void :id]]
[:selector [0 :scopeBarBackgroundImage] [:id]]
[:selector [1 :setScopeBarBackgroundImage] [:void :id]]
[:selector [2 :setSearchFieldBackgroundImage :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :searchFieldBackgroundImageForState] [:id UIKit/UIControlState]]
[:selector [3 :setImage :forSearchBarIcon :state] [:void :id UIKit/UISearchBarIcon UIKit/UIControlState]]
[:selector [2 :imageForSearchBarIcon :state] [:id UIKit/UISearchBarIcon UIKit/UIControlState]]
[:selector [2 :setScopeBarButtonBackgroundImage :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :scopeBarButtonBackgroundImageForState] [:id UIKit/UIControlState]]
[:selector [3 :setScopeBarButtonDividerImage :forLeftSegmentState :rightSegmentState] [:void :id UIKit/UIControlState UIKit/UIControlState]]
[:selector [2 :scopeBarButtonDividerImageForLeftSegmentState :rightSegmentState] [:id UIKit/UIControlState UIKit/UIControlState]]
[:selector [2 :setScopeBarButtonTitleTextAttributes :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :scopeBarButtonTitleTextAttributesForState] [:id UIKit/UIControlState]]
[:selector [0 :searchFieldBackgroundPositionAdjustment] [UIKit/UIOffset]]
[:selector [1 :setSearchFieldBackgroundPositionAdjustment] [:void UIKit/UIOffset]]
[:selector [0 :searchTextPositionAdjustment] [UIKit/UIOffset]]
[:selector [1 :setSearchTextPositionAdjustment] [:void UIKit/UIOffset]]
[:selector [2 :setPositionAdjustment :forSearchBarIcon] [:void UIKit/UIOffset UIKit/UISearchBarIcon]]
[:selector [1 :positionAdjustmentForSearchBarIcon] [UIKit/UIOffset UIKit/UISearchBarIcon]]
[:selector [2 :initWithSearchBar :contentsController] [:id :id :id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setActive] [:void Boolean]]
[:selector [0 :isActive] [Boolean]]
[:selector [2 :setActive :animated] [:void Boolean Boolean]]
[:selector [0 :searchBar] [:id]]
[:selector [0 :searchContentsController] [:id]]
[:selector [0 :searchResultsTableView] [:id]]
[:selector [0 :searchResultsDataSource] [:id]]
[:selector [1 :setSearchResultsDataSource] [:void :id]]
[:selector [0 :searchResultsDelegate] [:id]]
[:selector [1 :setSearchResultsDelegate] [:void :id]]
[:selector [0 :searchResultsTitle] [:id]]
[:selector [1 :setSearchResultsTitle] [:void :id]]
[:enum UISegmentedControlStylePlain UISegmentedControlStyleBordered UISegmentedControlStyleBar UISegmentedControlStyleBezeled UISegmentedControlStyle]
[:enum UISegmentedControlNoSegment nil]
[:enum UISegmentedControlSegmentAny UISegmentedControlSegmentLeft UISegmentedControlSegmentCenter UISegmentedControlSegmentRight UISegmentedControlSegmentAlone UISegmentedControlSegment]
[:selector [1 :initWithItems] [:id :id]]
[:selector [0 :segmentedControlStyle] [UIKit/UISegmentedControlStyle]]
[:selector [1 :setSegmentedControlStyle] [:void UIKit/UISegmentedControlStyle]]
[:selector [0 :isMomentary] [Boolean]]
[:selector [1 :setMomentary] [:void Boolean]]
[:selector [0 :numberOfSegments] [:unsigned-int]]
[:selector [1 :setApportionsSegmentWidthsByContent] [:void Boolean]]
[:selector [0 :apportionsSegmentWidthsByContent] [Boolean]]
[:selector [3 :insertSegmentWithTitle :atIndex :animated] [:void :id :unsigned-int Boolean]]
[:selector [3 :insertSegmentWithImage :atIndex :animated] [:void :id :unsigned-int Boolean]]
[:selector [2 :removeSegmentAtIndex :animated] [:void :unsigned-int Boolean]]
[:selector [0 :removeAllSegments] [:void]]
[:selector [2 :setTitle :forSegmentAtIndex] [:void :id :unsigned-int]]
[:selector [1 :titleForSegmentAtIndex] [:id :unsigned-int]]
[:selector [2 :setImage :forSegmentAtIndex] [:void :id :unsigned-int]]
[:selector [1 :imageForSegmentAtIndex] [:id :unsigned-int]]
[:selector [2 :setWidth :forSegmentAtIndex] [:void :float :unsigned-int]]
[:selector [1 :widthForSegmentAtIndex] [:float :unsigned-int]]
[:selector [2 :setContentOffset :forSegmentAtIndex] [:void UIKit/CGSize :unsigned-int]]
[:selector [1 :contentOffsetForSegmentAtIndex] [UIKit/CGSize :unsigned-int]]
[:selector [2 :setEnabled :forSegmentAtIndex] [:void Boolean :unsigned-int]]
[:selector [1 :isEnabledForSegmentAtIndex] [Boolean :unsigned-int]]
[:selector [1 :setSelectedSegmentIndex] [:void :int]]
[:selector [0 :selectedSegmentIndex] [:int]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :tintColor] [:id]]
[:selector [3 :setBackgroundImage :forState :barMetrics] [:void :id UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [2 :backgroundImageForState :barMetrics] [:id UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [4 :setDividerImage :forLeftSegmentState :rightSegmentState :barMetrics] [:void :id UIKit/UIControlState UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [3 :dividerImageForLeftSegmentState :rightSegmentState :barMetrics] [:id UIKit/UIControlState UIKit/UIControlState UIKit/UIBarMetrics]]
[:selector [2 :setTitleTextAttributes :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :titleTextAttributesForState] [:id UIKit/UIControlState]]
[:selector [3 :setContentPositionAdjustment :forSegmentType :barMetrics] [:void UIKit/UIOffset UIKit/UISegmentedControlSegment UIKit/UIBarMetrics]]
[:selector [2 :contentPositionAdjustmentForSegmentType :barMetrics] [UIKit/UIOffset UIKit/UISegmentedControlSegment UIKit/UIBarMetrics]]
[:selector [1 :setValue] [:void :float]]
[:selector [0 :value] [:float]]
[:selector [1 :setMinimumValue] [:void :float]]
[:selector [0 :minimumValue] [:float]]
[:selector [1 :setMaximumValue] [:void :float]]
[:selector [0 :maximumValue] [:float]]
[:selector [1 :setMinimumValueImage] [:void :id]]
[:selector [0 :minimumValueImage] [:id]]
[:selector [0 :maximumValueImage] [:id]]
[:selector [1 :setMaximumValueImage] [:void :id]]
[:selector [1 :setContinuous] [:void Boolean]]
[:selector [0 :isContinuous] [Boolean]]
[:selector [1 :setMinimumTrackTintColor] [:void :id]]
[:selector [0 :minimumTrackTintColor] [:id]]
[:selector [1 :setMaximumTrackTintColor] [:void :id]]
[:selector [0 :maximumTrackTintColor] [:id]]
[:selector [0 :thumbTintColor] [:id]]
[:selector [1 :setThumbTintColor] [:void :id]]
[:selector [2 :setValue :animated] [:void :float Boolean]]
[:selector [2 :setThumbImage :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setMinimumTrackImage :forState] [:void :id UIKit/UIControlState]]
[:selector [2 :setMaximumTrackImage :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :thumbImageForState] [:id UIKit/UIControlState]]
[:selector [1 :minimumTrackImageForState] [:id UIKit/UIControlState]]
[:selector [1 :maximumTrackImageForState] [:id UIKit/UIControlState]]
[:selector [0 :currentThumbImage] [:id]]
[:selector [0 :currentMinimumTrackImage] [:id]]
[:selector [0 :currentMaximumTrackImage] [:id]]
[:selector [1 :minimumValueImageRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :maximumValueImageRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [1 :trackRectForBounds] [UIKit/CGRect UIKit/CGRect]]
[:selector [3 :thumbRectForBounds :trackRect :value] [UIKit/CGRect UIKit/CGRect UIKit/CGRect :float]]
[:selector [0 :viewControllers] [:id]]
[:selector [1 :setViewControllers] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :presentsWithGesture] [Boolean]]
[:selector [1 :setPresentsWithGesture] [:void Boolean]]
[:selector [0 :splitViewController] [:id]]
[:selector [2 :setBackgroundImage :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :backgroundImageForState] [:id UIKit/UIControlState]]
[:selector [3 :setDividerImage :forLeftSegmentState :rightSegmentState] [:void :id UIKit/UIControlState UIKit/UIControlState]]
[:selector [2 :dividerImageForLeftSegmentState :rightSegmentState] [:id UIKit/UIControlState UIKit/UIControlState]]
[:selector [2 :setIncrementImage :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :incrementImageForState] [:id UIKit/UIControlState]]
[:selector [2 :setDecrementImage :forState] [:void :id UIKit/UIControlState]]
[:selector [1 :decrementImageForState] [:id UIKit/UIControlState]]
[:selector [0 :isContinuous] [Boolean]]
[:selector [1 :setContinuous] [:void Boolean]]
[:selector [0 :autorepeat] [Boolean]]
[:selector [1 :setAutorepeat] [:void Boolean]]
[:selector [0 :wraps] [Boolean]]
[:selector [1 :setWraps] [:void Boolean]]
[:selector [0 :value] [:double]]
[:selector [1 :setValue] [:void :double]]
[:selector [0 :minimumValue] [:double]]
[:selector [1 :setMinimumValue] [:void :double]]
[:selector [0 :maximumValue] [:double]]
[:selector [1 :setMaximumValue] [:void :double]]
[:selector [0 :stepValue] [:double]]
[:selector [1 :setStepValue] [:void :double]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [2 :storyboardWithName :bundle] [:id :id :id]]
[:selector [0 :instantiateInitialViewController] [:id]]
[:selector [1 :instantiateViewControllerWithIdentifier] [:id :id]]
;;FIXME: void (^)(void) in segueWithIdentifier:source:destination:performHandler:
[:selector [3 :initWithIdentifier :source :destination] [:id :id :id :id]]
[:selector [0 :perform] [:void]]
[:selector [0 :identifier] [:id]]
[:selector [0 :sourceViewController] [:id]]
[:selector [0 :destinationViewController] [:id]]
[:selector [0 :popoverController] [:id]]
[:selector [1 :initWithFrame] [:id UIKit/CGRect]]
[:selector [2 :setOn :animated] [:void Boolean Boolean]]
[:selector [0 :onTintColor] [:id]]
[:selector [1 :setOnTintColor] [:void :id]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :thumbTintColor] [:id]]
[:selector [1 :setThumbTintColor] [:void :id]]
[:selector [0 :onImage] [:id]]
[:selector [1 :setOnImage] [:void :id]]
[:selector [0 :offImage] [:id]]
[:selector [1 :setOffImage] [:void :id]]
[:selector [0 :isOn] [Boolean]]
[:selector [1 :setOn] [:void Boolean]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setItems] [:void :id]]
[:selector [0 :items] [:id]]
[:selector [1 :setSelectedItem] [:void :id]]
[:selector [0 :selectedItem] [:id]]
[:selector [2 :setItems :animated] [:void :id Boolean]]
[:selector [1 :beginCustomizingItems] [:void :id]]
[:selector [1 :endCustomizingAnimated] [Boolean Boolean]]
[:selector [0 :isCustomizing] [Boolean]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :tintColor] [:id]]
[:selector [0 :selectedImageTintColor] [:id]]
[:selector [1 :setSelectedImageTintColor] [:void :id]]
[:selector [0 :backgroundImage] [:id]]
[:selector [1 :setBackgroundImage] [:void :id]]
[:selector [0 :selectionIndicatorImage] [:id]]
[:selector [1 :setSelectionIndicatorImage] [:void :id]]
[:selector [0 :shadowImage] [:id]]
[:selector [1 :setShadowImage] [:void :id]]
[:selector [1 :setViewControllers] [:void :id]]
[:selector [0 :viewControllers] [:id]]
[:selector [2 :setViewControllers :animated] [:void :id Boolean]]
[:selector [1 :setSelectedViewController] [:void :id]]
[:selector [0 :selectedViewController] [:id]]
[:selector [0 :selectedIndex] [:unsigned-int]]
[:selector [1 :setSelectedIndex] [:void :unsigned-int]]
[:selector [0 :moreNavigationController] [:id]]
[:selector [0 :customizableViewControllers] [:id]]
[:selector [1 :setCustomizableViewControllers] [:void :id]]
[:selector [0 :tabBar] [:id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :tabBarItem] [:id]]
[:selector [1 :setTabBarItem] [:void :id]]
[:selector [0 :tabBarController] [:id]]
[:enum UITabBarSystemItemMore UITabBarSystemItemFavorites UITabBarSystemItemFeatured UITabBarSystemItemTopRated UITabBarSystemItemRecents UITabBarSystemItemContacts UITabBarSystemItemHistory UITabBarSystemItemBookmarks UITabBarSystemItemSearch UITabBarSystemItemDownloads UITabBarSystemItemMostRecent UITabBarSystemItemMostViewed UITabBarSystemItem]
[:selector [3 :initWithTitle :image :tag] [:id :id :id :int]]
[:selector [2 :initWithTabBarSystemItem :tag] [:id UIKit/UITabBarSystemItem :int]]
[:selector [0 :badgeValue] [:id]]
[:selector [1 :setBadgeValue] [:void :id]]
[:selector [2 :setFinishedSelectedImage :withFinishedUnselectedImage] [:void :id :id]]
[:selector [0 :finishedSelectedImage] [:id]]
[:selector [0 :finishedUnselectedImage] [:id]]
[:selector [1 :setTitlePositionAdjustment] [:void UIKit/UIOffset]]
[:selector [0 :titlePositionAdjustment] [UIKit/UIOffset]]
[:selector [1 :initWithReuseIdentifier] [:id :id]]
[:selector [0 :prepareForReuse] [:void]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [0 :textLabel] [:id]]
[:selector [0 :detailTextLabel] [:id]]
[:selector [0 :contentView] [:id]]
[:selector [0 :backgroundView] [:id]]
[:selector [1 :setBackgroundView] [:void :id]]
[:selector [0 :reuseIdentifier] [:id]]
[:selector [1 :initWithStyle] [:id UIKit/UITableViewStyle]]
[:selector [0 :tableView] [:id]]
[:selector [1 :setTableView] [:void :id]]
[:selector [0 :clearsSelectionOnViewWillAppear] [Boolean]]
[:selector [1 :setClearsSelectionOnViewWillAppear] [:void Boolean]]
[:selector [0 :refreshControl] [:id]]
[:selector [1 :setRefreshControl] [:void :id]]
[:selector [0 :numberOfTapsRequired] [:unsigned-int]]
[:selector [1 :setNumberOfTapsRequired] [:void :unsigned-int]]
[:selector [0 :numberOfTouchesRequired] [:unsigned-int]]
[:selector [1 :setNumberOfTouchesRequired] [:void :unsigned-int]]
[:selector [5 :rangeOfMisspelledWordInString :range :startingAt :wrap :language] [UIKit/NSRange :id UIKit/NSRange :int Boolean :id]]
[:selector [3 :guessesForWordRange :inString :language] [:id UIKit/NSRange :id :id]]
[:selector [3 :completionsForPartialWordRange :inString :language] [:id UIKit/NSRange :id :id]]
[:selector [1 :ignoreWord] [:void :id]]
[:selector [0 :ignoredWords] [:id]]
[:selector [1 :setIgnoredWords] [:void :id]]
[:selector [1 :learnWord] [:void :id]]
[:selector [1 :hasLearnedWord] [Boolean :id]]
[:selector [1 :unlearnWord] [:void :id]]
[:selector [0 :availableLanguages] [:id]]
[:selector [0 :hasText] [Boolean]]
[:selector [1 :scrollRangeToVisible] [:void UIKit/NSRange]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :text] [:id]]
[:selector [1 :setText] [:void :id]]
[:selector [0 :font] [:id]]
[:selector [1 :setFont] [:void :id]]
[:selector [0 :textColor] [:id]]
[:selector [1 :setTextColor] [:void :id]]
[:selector [0 :textAlignment] [UIKit/NSTextAlignment]]
[:selector [1 :setTextAlignment] [:void UIKit/NSTextAlignment]]
[:selector [0 :selectedRange] [UIKit/NSRange]]
[:selector [1 :setSelectedRange] [:void UIKit/NSRange]]
[:selector [0 :isEditable] [Boolean]]
[:selector [1 :setEditable] [:void Boolean]]
[:selector [0 :dataDetectorTypes] [UIKit/UIDataDetectorTypes]]
[:selector [1 :setDataDetectorTypes] [:void UIKit/UIDataDetectorTypes]]
[:selector [0 :allowsEditingTextAttributes] [Boolean]]
[:selector [1 :setAllowsEditingTextAttributes] [:void Boolean]]
[:selector [0 :attributedText] [:id]]
[:selector [1 :setAttributedText] [:void :id]]
[:selector [0 :typingAttributes] [:id]]
[:selector [1 :setTypingAttributes] [:void :id]]
[:selector [0 :inputView] [:id]]
[:selector [1 :setInputView] [:void :id]]
[:selector [0 :inputAccessoryView] [:id]]
[:selector [1 :setInputAccessoryView] [:void :id]]
[:selector [0 :clearsOnInsertion] [Boolean]]
[:selector [1 :setClearsOnInsertion] [:void Boolean]]
[:enum UIToolbarPositionAny UIToolbarPositionBottom UIToolbarPositionTop UIToolbarPosition]
[:selector [1 :setBarStyle] [:void UIKit/UIBarStyle]]
[:selector [0 :barStyle] [UIKit/UIBarStyle]]
[:selector [1 :setItems] [:void :id]]
[:selector [0 :items] [:id]]
[:selector [0 :isTranslucent] [Boolean]]
[:selector [1 :setTranslucent] [:void Boolean]]
[:selector [2 :setItems :animated] [:void :id Boolean]]
[:selector [0 :tintColor] [:id]]
[:selector [1 :setTintColor] [:void :id]]
[:selector [3 :setBackgroundImage :forToolbarPosition :barMetrics] [:void :id UIKit/UIToolbarPosition UIKit/UIBarMetrics]]
[:selector [2 :backgroundImageForToolbarPosition :barMetrics] [:id UIKit/UIToolbarPosition UIKit/UIBarMetrics]]
[:selector [2 :setShadowImage :forToolbarPosition] [:void :id UIKit/UIToolbarPosition]]
[:selector [1 :shadowImageForToolbarPosition] [:id UIKit/UIToolbarPosition]]
[:enum UITouchPhaseBegan UITouchPhaseMoved UITouchPhaseStationary UITouchPhaseEnded UITouchPhaseCancelled UITouchPhase]
[:selector [1 :locationInView] [UIKit/CGPoint :id]]
[:selector [1 :previousLocationInView] [UIKit/CGPoint :id]]
[:selector [0 :timestamp] [:double]]
[:selector [0 :phase] [UIKit/UITouchPhase]]
[:selector [0 :tapCount] [:unsigned-int]]
[:selector [0 :window] [:id]]
[:selector [0 :view] [:id]]
[:selector [0 :gestureRecognizers] [:id]]
[:selector [1 :canEditVideoAtPath] [Boolean :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :videoPath] [:id]]
[:selector [1 :setVideoPath] [:void :id]]
[:selector [1 :setVideoMaximumDuration] [:void :double]]
[:selector [0 :videoMaximumDuration] [:double]]
[:selector [0 :videoQuality] [UIKit/UIImagePickerControllerQualityType]]
[:selector [1 :setVideoQuality] [:void UIKit/UIImagePickerControllerQualityType]]
[:enum UIWebViewNavigationTypeLinkClicked UIWebViewNavigationTypeFormSubmitted UIWebViewNavigationTypeBackForward UIWebViewNavigationTypeReload UIWebViewNavigationTypeFormResubmitted UIWebViewNavigationTypeOther UIWebViewNavigationType]
[:selector [1 :loadRequest] [:void :id]]
[:selector [2 :loadHTMLString :baseURL] [:void :id :id]]
[:selector [4 :loadData :MIMEType :textEncodingName :baseURL] [:void :id :id :id :id]]
[:selector [0 :reload] [:void]]
[:selector [0 :stopLoading] [:void]]
[:selector [0 :goBack] [:void]]
[:selector [0 :goForward] [:void]]
[:selector [1 :stringByEvaluatingJavaScriptFromString] [:id :id]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :scrollView] [:id]]
[:selector [0 :request] [:id]]
[:selector [0 :canGoBack] [Boolean]]
[:selector [0 :canGoForward] [Boolean]]
[:selector [0 :isLoading] [Boolean]]
[:selector [0 :scalesPageToFit] [Boolean]]
[:selector [1 :setScalesPageToFit] [:void Boolean]]
[:selector [0 :detectsPhoneNumbers] [Boolean]]
[:selector [1 :setDetectsPhoneNumbers] [:void Boolean]]
[:selector [0 :dataDetectorTypes] [UIKit/UIDataDetectorTypes]]
[:selector [1 :setDataDetectorTypes] [:void UIKit/UIDataDetectorTypes]]
[:selector [0 :allowsInlineMediaPlayback] [Boolean]]
[:selector [1 :setAllowsInlineMediaPlayback] [:void Boolean]]
[:selector [0 :mediaPlaybackRequiresUserAction] [Boolean]]
[:selector [1 :setMediaPlaybackRequiresUserAction] [:void Boolean]]
[:selector [0 :mediaPlaybackAllowsAirPlay] [Boolean]]
[:selector [1 :setMediaPlaybackAllowsAirPlay] [:void Boolean]]
[:selector [0 :suppressesIncrementalRendering] [Boolean]]
[:selector [1 :setSuppressesIncrementalRendering] [:void Boolean]]
[:selector [0 :keyboardDisplayRequiresUserAction] [Boolean]]
[:selector [1 :setKeyboardDisplayRequiresUserAction] [:void Boolean]]
[:selector [1 :setScreen] [:void :id]]
[:selector [0 :screen] [:id]]
[:selector [1 :setWindowLevel] [:void :float]]
[:selector [0 :windowLevel] [:float]]
[:selector [0 :isKeyWindow] [Boolean]]
[:selector [0 :becomeKeyWindow] [:void]]
[:selector [0 :resignKeyWindow] [:void]]
[:selector [0 :makeKeyWindow] [:void]]
[:selector [0 :makeKeyAndVisible] [:void]]
[:selector [1 :setRootViewController] [:void :id]]
[:selector [0 :rootViewController] [:id]]
[:selector [1 :sendEvent] [:void :id]]
[:selector [2 :convertPoint :toWindow] [UIKit/CGPoint UIKit/CGPoint :id]]
[:selector [2 :convertPoint :fromWindow] [UIKit/CGPoint UIKit/CGPoint :id]]
[:selector [2 :convertRect :toWindow] [UIKit/CGRect UIKit/CGRect :id]]
[:selector [2 :convertRect :fromWindow] [UIKit/CGRect UIKit/CGRect :id]]
[:enum NSUnderlineStyleNone NSUnderlineStyleSingle nil]
[:selector [0 :shadowOffset] [UIKit/CGSize]]
[:selector [1 :setShadowOffset] [:void UIKit/CGSize]]
[:selector [0 :shadowBlurRadius] [:float]]
[:selector [1 :setShadowBlurRadius] [:void :float]]
[:selector [0 :shadowColor] [:id]]
[:selector [1 :setShadowColor] [:void :id]]
[:selector [0 :minimumScaleFactor] [:float]]
[:selector [1 :setMinimumScaleFactor] [:void :float]]
[:selector [0 :minimumTrackingAdjustment] [:float]]
[:selector [1 :setMinimumTrackingAdjustment] [:void :float]]
[:selector [0 :actualScaleFactor] [:float]]
[:selector [0 :actualTrackingAdjustment] [:float]]
[:selector [0 :totalBounds] [UIKit/CGRect]]
[:selector [0 :size] [UIKit/CGSize]]
[:selector [1 :drawAtPoint] [:void UIKit/CGPoint]]
[:selector [1 :drawInRect] [:void UIKit/CGRect]]
[:enum NSStringDrawingTruncatesLastVisibleLine NSStringDrawingUsesLineFragmentOrigin NSStringDrawingUsesFontLeading NSStringDrawingUsesDeviceMetrics NSStringDrawingOptions]
[:selector [3 :drawWithRect :options :context] [:void UIKit/CGRect UIKit/NSStringDrawingOptions :id]]
[:selector [3 :boundingRectWithSize :options :context] [UIKit/CGRect UIKit/CGSize UIKit/NSStringDrawingOptions :id]]
]
