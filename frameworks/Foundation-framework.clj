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
;;FIXME: const struct fd_set *
;;FIXME: const char *
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
;;FIXME: int *
;;FIXME: struct lconv *
;;FIXME: char *
[:function __math_errhandling [:int]]
[:function __fpclassifyf [:int :float]]
[:function __fpclassifyd [:int :double]]
;;FIXME: long double
[:function __inline_isfinitef [:int :float]]
[:function __inline_isfinited [:int :double]]
;;FIXME: long double
[:function __inline_isinff [:int :float]]
[:function __inline_isinfd [:int :double]]
;;FIXME: long double
[:function __inline_isnanf [:int :float]]
[:function __inline_isnand [:int :double]]
;;FIXME: long double
[:function __inline_isnormalf [:int :float]]
[:function __inline_isnormald [:int :double]]
;;FIXME: long double
[:function __inline_signbitf [:int :float]]
[:function __inline_signbitd [:int :double]]
;;FIXME: long double
[:function __inline_isfinitef [:int :float]]
[:function __inline_isfinited [:int :double]]
;;FIXME: long double
[:function __inline_isinff [:int :float]]
[:function __inline_isinfd [:int :double]]
;;FIXME: long double
[:function __inline_isnanf [:int :float]]
[:function __inline_isnand [:int :double]]
;;FIXME: long double
[:function __inline_signbitf [:int :float]]
[:function __inline_signbitd [:int :double]]
;;FIXME: long double
[:function __inline_isnormalf [:int :float]]
[:function __inline_isnormald [:int :double]]
;;FIXME: long double
[:function acosf [:float :float]]
[:function acos [:double :double]]
;;FIXME: long double
[:function asinf [:float :float]]
[:function asin [:double :double]]
;;FIXME: long double
[:function atanf [:float :float]]
[:function atan [:double :double]]
;;FIXME: long double
[:function atan2f [:float :float :float]]
[:function atan2 [:double :double :double]]
;;FIXME: long double
[:function cosf [:float :float]]
[:function cos [:double :double]]
;;FIXME: long double
[:function sinf [:float :float]]
[:function sin [:double :double]]
;;FIXME: long double
[:function tanf [:float :float]]
[:function tan [:double :double]]
;;FIXME: long double
[:function acoshf [:float :float]]
[:function acosh [:double :double]]
;;FIXME: long double
[:function asinhf [:float :float]]
[:function asinh [:double :double]]
;;FIXME: long double
[:function atanhf [:float :float]]
[:function atanh [:double :double]]
;;FIXME: long double
[:function coshf [:float :float]]
[:function cosh [:double :double]]
;;FIXME: long double
[:function sinhf [:float :float]]
[:function sinh [:double :double]]
;;FIXME: long double
[:function tanhf [:float :float]]
[:function tanh [:double :double]]
;;FIXME: long double
[:function expf [:float :float]]
[:function exp [:double :double]]
;;FIXME: long double
[:function exp2f [:float :float]]
[:function exp2 [:double :double]]
;;FIXME: long double
[:function expm1f [:float :float]]
[:function expm1 [:double :double]]
;;FIXME: long double
[:function logf [:float :float]]
[:function log [:double :double]]
;;FIXME: long double
[:function log10f [:float :float]]
[:function log10 [:double :double]]
;;FIXME: long double
[:function log2f [:float :float]]
[:function log2 [:double :double]]
;;FIXME: long double
[:function log1pf [:float :float]]
[:function log1p [:double :double]]
;;FIXME: long double
[:function logbf [:float :float]]
[:function logb [:double :double]]
;;FIXME: long double
;;FIXME: float *
;;FIXME: double *
;;FIXME: long double
[:function ldexpf [:float :float :int]]
[:function ldexp [:double :double :int]]
;;FIXME: long double
;;FIXME: int *
;;FIXME: int *
;;FIXME: long double
[:function ilogbf [:int :float]]
[:function ilogb [:int :double]]
;;FIXME: long double
[:function scalbnf [:float :float :int]]
[:function scalbn [:double :double :int]]
;;FIXME: long double
[:function scalblnf [:float :float :long]]
[:function scalbln [:double :double :long]]
;;FIXME: long double
[:function fabsf [:float :float]]
[:function fabs [:double :double]]
;;FIXME: long double
[:function cbrtf [:float :float]]
[:function cbrt [:double :double]]
;;FIXME: long double
[:function hypotf [:float :float :float]]
[:function hypot [:double :double :double]]
;;FIXME: long double
[:function powf [:float :float :float]]
[:function pow [:double :double :double]]
;;FIXME: long double
[:function sqrtf [:float :float]]
[:function sqrt [:double :double]]
;;FIXME: long double
[:function erff [:float :float]]
[:function erf [:double :double]]
;;FIXME: long double
[:function erfcf [:float :float]]
[:function erfc [:double :double]]
;;FIXME: long double
[:function lgammaf [:float :float]]
[:function lgamma [:double :double]]
;;FIXME: long double
[:function tgammaf [:float :float]]
[:function tgamma [:double :double]]
;;FIXME: long double
[:function ceilf [:float :float]]
[:function ceil [:double :double]]
;;FIXME: long double
[:function floorf [:float :float]]
[:function floor [:double :double]]
;;FIXME: long double
[:function nearbyintf [:float :float]]
[:function nearbyint [:double :double]]
;;FIXME: long double
[:function rintf [:float :float]]
[:function rint [:double :double]]
;;FIXME: long double
[:function lrintf [:long :float]]
[:function lrint [:long :double]]
;;FIXME: long double
[:function roundf [:float :float]]
[:function round [:double :double]]
;;FIXME: long double
[:function lroundf [:long :float]]
[:function lround [:long :double]]
;;FIXME: long double
[:function llrintf [:long-long :float]]
[:function llrint [:long-long :double]]
;;FIXME: long double
[:function llroundf [:long-long :float]]
[:function llround [:long-long :double]]
;;FIXME: long double
[:function truncf [:float :float]]
[:function trunc [:double :double]]
;;FIXME: long double
[:function fmodf [:float :float :float]]
[:function fmod [:double :double :double]]
;;FIXME: long double
[:function remainderf [:float :float :float]]
[:function remainder [:double :double :double]]
;;FIXME: long double
;;FIXME: int *
;;FIXME: int *
;;FIXME: long double
[:function copysignf [:float :float :float]]
[:function copysign [:double :double :double]]
;;FIXME: long double
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: long double
[:function nextafterf [:float :float :float]]
[:function nextafter [:double :double :double]]
;;FIXME: long double
;;FIXME: long double
;;FIXME: long double
;;FIXME: long double
[:function fdimf [:float :float :float]]
[:function fdim [:double :double :double]]
;;FIXME: long double
[:function fmaxf [:float :float :float]]
[:function fmax [:double :double :double]]
;;FIXME: long double
[:function fminf [:float :float :float]]
[:function fmin [:double :double :double]]
;;FIXME: long double
[:function fmaf [:float :float :float :float]]
[:function fma [:double :double :double :double]]
;;FIXME: long double
[:function __inff [:float]]
[:function __inf [:double]]
;;FIXME: long double
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
;;FIXME: struct exception *
;;FIXME: int [37]
;;FIXME: int [37]
;;FIXME: int [37]
;;FIXME: int [37]
;;FIXME: int [38]
;;FIXME: int [38]
[:function longjmperror [:void]]
[:compound __darwin_fp_control_t "sizeof (__darwin_fp_control_t)"]
[:compound __darwin_fp_status_t "sizeof (__darwin_fp_status_t)"]
[:compound stack_t "sizeof (stack_t)"]
[:compound ucontext_t "sizeof (ucontext_t)"]
[:compound siginfo_t "sizeof (siginfo_t)"]
;;FIXME: void (*)(int)
[:function raise [:int :int]]
;;FIXME: void (*)(int)
[:function kill [:int :int :int]]
[:function killpg [:int :int :int]]
;;FIXME: struct _opaque_pthread_t *
;;FIXME: const sigset_t *
;;FIXME: const struct sigaction *restrict
;;FIXME: sigset_t *
;;FIXME: const stack_t *restrict
;;FIXME: sigset_t *
;;FIXME: sigset_t *
;;FIXME: sigset_t *
[:function sighold [:int :int]]
[:function sigignore [:int :int]]
[:function siginterrupt [:int :int :int]]
;;FIXME: const sigset_t *
[:function sigpause [:int :int]]
;;FIXME: sigset_t *
;;FIXME: const sigset_t *restrict
[:function sigrelse [:int :int]]
;;FIXME: void (*)(int)
;;FIXME: const sigset_t *
;;FIXME: const sigset_t *restrict
;;FIXME: const char *
[:function sigblock [:int :int]]
[:function sigsetmask [:int :int]]
;;FIXME: struct sigvec *
[:function __sigbits [:int :int]]
[:compound FILE "sizeof (FILE)"]
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *restrict
;;FIXME: char *
;;FIXME: FILE *
;;FIXME: FILE *restrict
;;FIXME: FILE *
;;FIXME: const char *restrict
;;FIXME: void *restrict
;;FIXME: FILE *
;;FIXME: FILE *restrict
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: const void *restrict
;;FIXME: FILE *
[:function getchar [:int]]
;;FIXME: char *
;;FIXME: const char *
;;FIXME: const char *restrict
;;FIXME: FILE *
[:function putchar [:int :int]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: FILE *
;;FIXME: const char *restrict
;;FIXME: FILE *restrict
;;FIXME: FILE *restrict
;;FIXME: char *restrict
;;FIXME: const char *restrict
;;FIXME: FILE *
;;FIXME: char *
;;FIXME: FILE *
;;FIXME: FILE *restrict
;;FIXME: const char *restrict
;;FIXME: char *restrict
;;FIXME: char *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
[:function getchar_unlocked [:int]]
;;FIXME: FILE *
[:function putchar_unlocked [:int :int]]
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: char *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: char *restrict
;;FIXME: FILE *restrict
;;FIXME: const char *restrict
;;FIXME: char *restrict
;;FIXME: const char *restrict
;;FIXME: const char *restrict
;;FIXME: const char *restrict
;;FIXME: char **restrict
;;FIXME: char **restrict
;;FIXME: char **
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: char **
;;FIXME: FILE *
;;FIXME: FILE *
;;FIXME: char *restrict
;;FIXME: char *restrict
;;FIXME: char *restrict
;;FIXME: char *restrict
[:function getpriority [:int :int :unsigned-int]]
[:function getiopolicy_np [:int :int :int]]
;;FIXME: struct rlimit *
;;FIXME: struct rusage *
[:function setpriority [:int :int :unsigned-int :int]]
[:function setiopolicy_np [:int :int :int :int]]
;;FIXME: const struct rlimit *
;;FIXME: int *
;;FIXME: int *
;;FIXME: int *
;;FIXME: int *
;;FIXME: void *
[:compound div_t "sizeof (div_t)"]
[:compound ldiv_t "sizeof (ldiv_t)"]
[:compound lldiv_t "sizeof (lldiv_t)"]
[:function abort [:void]]
[:function abs [:int :int]]
;;FIXME: void (*)(void)
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
;;FIXME: void *
[:function div [Foundation/div_t :int :int]]
[:function exit [:void :int]]
;;FIXME: void *
;;FIXME: char *
[:function labs [:long :long]]
[:function ldiv [Foundation/ldiv_t :long :long]]
[:function llabs [:long-long :long-long]]
[:function lldiv [Foundation/lldiv_t :long-long :long-long]]
;;FIXME: void *
;;FIXME: const char *
;;FIXME: wchar_t *restrict
;;FIXME: wchar_t *restrict
;;FIXME: void **
;;FIXME: void *
[:function rand [:int]]
;;FIXME: void *
[:function srand [:void :unsigned-int]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: long double
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: char *restrict
;;FIXME: char *
[:function _Exit [:void :int]]
;;FIXME: const char *
[:function drand48 [:double]]
;;FIXME: char *
;;FIXME: unsigned short [3]
;;FIXME: char *
;;FIXME: char *
;;FIXME: char **
[:function grantpt [:int :int]]
;;FIXME: char *
;;FIXME: unsigned short [3]
;;FIXME: char *
;;FIXME: unsigned short [7]
[:function lrand48 [:long]]
;;FIXME: char *
;;FIXME: char *
[:function mrand48 [:long]]
;;FIXME: unsigned short [3]
[:function posix_openpt [:int :int]]
;;FIXME: char *
;;FIXME: char *
[:function random [:long]]
;;FIXME: unsigned int *
;;FIXME: char *
;;FIXME: unsigned short *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: char *
[:function srand48 [:void :long]]
[:function srandom [:void :unsigned-int]]
[:function unlockpt [:int :int]]
;;FIXME: const char *
[:function arc4random [:unsigned-int]]
;;FIXME: unsigned char *
;;FIXME: void *
[:function arc4random_stir [:void]]
[:function arc4random_uniform [:unsigned-int :unsigned-int]]
;;FIXME: void (^)(void)
;;FIXME: void *
;;FIXME: char *
[:function cgetclose [:int]]
;;FIXME: char **
;;FIXME: char **
;;FIXME: const char *
;;FIXME: char **
;;FIXME: char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: char *
[:function daemon [:int :int :int]]
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: double []
;;FIXME: const char *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const unsigned char **
;;FIXME: const char *
;;FIXME: const unsigned char **
[:function sranddev [:void]]
[:function srandomdev [:void]]
;;FIXME: void *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: void *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: const void *restrict
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: char *
;;FIXME: char *
[:function ffs [:int :int]]
;;FIXME: const char *
;;FIXME: const char *
[:function ffsl [:int :long]]
[:function fls [:int :int]]
[:function flsl [:int :long]]
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
[:function clock [:unsigned-long]]
;;FIXME: char *
[:function difftime [:double :long :long]]
;;FIXME: struct tm *
;;FIXME: struct tm *
;;FIXME: struct tm *
;;FIXME: struct tm *
;;FIXME: char *restrict
;;FIXME: char *
;;FIXME: time_t *
[:function tzset [:void]]
;;FIXME: char *
;;FIXME: char *
;;FIXME: struct tm *
;;FIXME: struct tm *
[:function posix2time [:long :long]]
[:function tzsetwall [:void]]
[:function time2posix [:long :long]]
;;FIXME: struct tm *const
;;FIXME: struct tm *const
;;FIXME: const struct timespec *
[:function imaxabs [:long :long]]
[:compound imaxdiv_t "sizeof (imaxdiv_t)"]
[:function imaxdiv [Foundation/imaxdiv_t :long :long]]
;;FIXME: const char *restrict
;;FIXME: const char *restrict
;;FIXME: const wchar_t *restrict
;;FIXME: const wchar_t *restrict
;;FIXME: void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const void *
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
;;FIXME: const unsigned char *
[:function SysBreak [:void]]
;;FIXME: const unsigned char *
;;FIXME: const unsigned char *
[:compound CFRange "sizeof (CFRange)"]
[:function CFRangeMake [Foundation/CFRange :long :long]]
[:function __CFRangeMake [Foundation/CFRange :long :long]]
[:function CFNullGetTypeID [:unsigned-long]]
[:compound CFAllocatorContext "sizeof (CFAllocatorContext)"]
[:function CFAllocatorGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFAllocator *
[:compound CFArrayCallBacks "sizeof (CFArrayCallBacks)"]
[:function CFArrayGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const void *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
;;FIXME: struct __CFArray *
[:compound CFBagCallBacks "sizeof (CFBagCallBacks)"]
[:function CFBagGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFBag *
;;FIXME: const struct __CFBag *
;;FIXME: struct __CFBag *
;;FIXME: struct __CFBag *
;;FIXME: const struct __CFBag *
;;FIXME: const struct __CFBag *
;;FIXME: const struct __CFBag *
;;FIXME: const void *
;;FIXME: const struct __CFBag *
;;FIXME: const struct __CFBag *
;;FIXME: const struct __CFBag *
;;FIXME: struct __CFBag *
;;FIXME: struct __CFBag *
;;FIXME: struct __CFBag *
;;FIXME: struct __CFBag *
;;FIXME: struct __CFBag *
[:compound CFBinaryHeapCompareContext "sizeof (CFBinaryHeapCompareContext)"]
[:compound CFBinaryHeapCallBacks "sizeof (CFBinaryHeapCallBacks)"]
[:function CFBinaryHeapGetTypeID [:unsigned-long]]
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: const void *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
;;FIXME: struct __CFBinaryHeap *
[:function CFBitVectorGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: const struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: struct __CFBitVector *
;;FIXME: const volatile void *
;;FIXME: const volatile void *
;;FIXME: const volatile void *
;;FIXME: volatile void *
;;FIXME: volatile void *
;;FIXME: volatile void *
[:function OSHostByteOrder [:int]]
;;FIXME: const volatile void *
;;FIXME: const volatile void *
;;FIXME: const volatile void *
;;FIXME: volatile void *
;;FIXME: volatile void *
;;FIXME: volatile void *
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
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
[:function CFLocaleGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFLocale *
;;FIXME: const struct __CFLocale *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFLocale *
;;FIXME: const struct __CFLocale *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const struct __CFString *
[:function CFAbsoluteTimeGetCurrent [:double]]
[:function CFDateGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFDate *
;;FIXME: const struct __CFDate *
;;FIXME: const struct __CFDate *
[:compound CFGregorianDate "sizeof (CFGregorianDate)"]
[:compound CFGregorianUnits "sizeof (CFGregorianUnits)"]
[:function CFGregorianDateIsValid [:unsigned-char Foundation/CFGregorianDate :unsigned-long]]
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
[:function CFDataGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const UInt8 *
;;FIXME: UInt8 *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: struct __CFData *
;;FIXME: const struct __CFData *
[:function CFCharacterSetGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
;;FIXME: struct __CFCharacterSet *
[:function CFStringGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const unsigned char *
;;FIXME: const char *
;;FIXME: const UniChar *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function CFStringGetSystemEncoding [:unsigned-int]]
[:function CFStringGetMaximumSizeForEncoding [:long :long :unsigned-int]]
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFLocale *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFString *
[:function CFStringIsEncodingAvailable [:unsigned-char :unsigned-int]]
;;FIXME: const CFStringEncoding *
;;FIXME: const struct __CFString *
[:function CFStringConvertEncodingToNSStringEncoding [:unsigned-long :unsigned-int]]
[:function CFStringConvertNSStringEncodingToEncoding [:unsigned-int :unsigned-long]]
[:function CFStringConvertEncodingToWindowsCodepage [:unsigned-int :unsigned-int]]
[:function CFStringConvertWindowsCodepageToEncoding [:unsigned-int :unsigned-int]]
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function CFStringGetMostCompatibleMacStringEncoding [:unsigned-int :unsigned-int]]
[:compound CFStringInlineBuffer "sizeof (CFStringInlineBuffer)"]
;;FIXME: const struct __CFString *
;;FIXME: CFStringInlineBuffer *
[:function CFStringIsSurrogateHighCharacter [:unsigned-char :unsigned-short]]
[:function CFStringIsSurrogateLowCharacter [:unsigned-char :unsigned-short]]
[:function CFStringGetLongCharacterForSurrogatePair [:unsigned-int :unsigned-short :unsigned-short]]
;;FIXME: UniChar *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function CFTimeZoneGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFTimeZone *
[:function CFTimeZoneResetSystem [:void]]
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFTimeZone *
;;FIXME: const struct __CFString *
[:function CFCalendarGetTypeID [:unsigned-long]]
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFLocale *
;;FIXME: struct __CFCalendar *
;;FIXME: const struct __CFTimeZone *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: struct __CFCalendar *
;;FIXME: const struct __CFString *
[:function CFDateFormatterGetTypeID [:unsigned-long]]
;;FIXME: struct __CFDateFormatter *
;;FIXME: const struct __CFLocale *
;;FIXME: enum CFDateFormatterStyle
;;FIXME: enum CFDateFormatterStyle
;;FIXME: const struct __CFString *
;;FIXME: struct __CFDateFormatter *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDate *
;;FIXME: struct __CFDateFormatter *
;;FIXME: struct __CFDateFormatter *
;;FIXME: const void *
[:function CFErrorGetTypeID [:unsigned-long]]
;;FIXME: struct __CFError *
;;FIXME: struct __CFError *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFError *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function CFBooleanGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFBoolean *
[:function CFNumberGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFNumber *
;;FIXME: const struct __CFNumber *
;;FIXME: const struct __CFNumber *
;;FIXME: const struct __CFNumber *
[:function CFNumberFormatterGetTypeID [:unsigned-long]]
;;FIXME: struct __CFNumberFormatter *
;;FIXME: const struct __CFLocale *
;;FIXME: enum CFNumberFormatterStyle
;;FIXME: const struct __CFString *
;;FIXME: struct __CFNumberFormatter *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFNumber *
;;FIXME: struct __CFNumberFormatter *
;;FIXME: struct __CFNumberFormatter *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
[:function CFURLGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFDictionary *
;;FIXME: const void *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
[:compound mach_port_status_t "sizeof (mach_port_status_t)"]
[:compound mach_port_limits_t "sizeof (mach_port_limits_t)"]
[:compound mach_port_qos_t "sizeof (mach_port_qos_t)"]
[:function CFRunLoopGetTypeID [:unsigned-long]]
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
[:function CFRunLoopRun [:void]]
;;FIXME: const struct __CFString *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
;;FIXME: struct __CFRunLoop *
[:compound CFRunLoopSourceContext "sizeof (CFRunLoopSourceContext)"]
[:compound CFRunLoopSourceContext1 "sizeof (CFRunLoopSourceContext1)"]
[:function CFRunLoopSourceGetTypeID [:unsigned-long]]
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFRunLoopSource *
[:compound CFRunLoopObserverContext "sizeof (CFRunLoopObserverContext)"]
[:function CFRunLoopObserverGetTypeID [:unsigned-long]]
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
;;FIXME: struct __CFRunLoopObserver *
[:compound CFRunLoopTimerContext "sizeof (CFRunLoopTimerContext)"]
[:function CFRunLoopTimerGetTypeID [:unsigned-long]]
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
;;FIXME: struct __CFRunLoopTimer *
[:compound CFSocketSignature "sizeof (CFSocketSignature)"]
[:compound CFSocketContext "sizeof (CFSocketContext)"]
[:function CFSocketGetTypeID [:unsigned-long]]
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: enum CFSocketError
;;FIXME: enum CFSocketError
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: struct __CFSocket *
;;FIXME: enum CFSocketError
;;FIXME: enum CFSocketError
;;FIXME: enum CFSocketError
;;FIXME: enum CFSocketError
;;FIXME: enum CFSocketError
;;FIXME: enum CFSocketError
[:function CFSocketSetDefaultNameRegistryPortNumber [:void :unsigned-short]]
[:function CFSocketGetDefaultNameRegistryPortNumber [:unsigned-short]]
[:compound CFStreamClientContext "sizeof (CFStreamClientContext)"]
[:function CFReadStreamGetTypeID [:unsigned-long]]
[:function CFWriteStreamGetTypeID [:unsigned-long]]
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: struct __CFError *
;;FIXME: struct __CFError *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFReadStream *
;;FIXME: const UInt8 *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
[:compound CFStreamError "sizeof (CFStreamError)"]
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFWriteStream *
;;FIXME: const void *
;;FIXME: const struct __CFData *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const struct __CFData *
[:compound CFSetCallBacks "sizeof (CFSetCallBacks)"]
[:function CFSetGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFSet *
;;FIXME: const struct __CFSet *
;;FIXME: struct __CFSet *
;;FIXME: struct __CFSet *
;;FIXME: const struct __CFSet *
;;FIXME: const struct __CFSet *
;;FIXME: const struct __CFSet *
;;FIXME: const void *
;;FIXME: const struct __CFSet *
;;FIXME: const struct __CFSet *
;;FIXME: const struct __CFSet *
;;FIXME: struct __CFSet *
;;FIXME: struct __CFSet *
;;FIXME: struct __CFSet *
;;FIXME: struct __CFSet *
;;FIXME: struct __CFSet *
[:compound CFTreeContext "sizeof (CFTreeContext)"]
[:function CFTreeGetTypeID [:unsigned-long]]
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const void *
[:compound CFUUIDBytes "sizeof (CFUUIDBytes)"]
[:function CFUUIDGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFURL *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFArray *
[:function CFBundleGetTypeID [:unsigned-long]]
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFURL *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: void *
;;FIXME: struct __CFBundle *
;;FIXME: void *
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFURL *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
[:function _exit [:void :int]]
;;FIXME: const char *
[:function alarm [:unsigned-int :unsigned-int]]
;;FIXME: const char *
;;FIXME: const char *
[:function close [:int :int]]
[:function dup [:int :int]]
[:function dup2 [:int :int :int]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
[:function fork [:int]]
[:function fpathconf [:long :int :int]]
;;FIXME: char *
[:function getegid [:unsigned-int]]
[:function geteuid [:unsigned-int]]
[:function getgid [:unsigned-int]]
;;FIXME: gid_t []
;;FIXME: char *
[:function getpgrp [:int]]
[:function getpid [:int]]
[:function getppid [:int]]
[:function getuid [:unsigned-int]]
[:function isatty [:int :int]]
;;FIXME: const char *
[:function lseek [:long-long :int :long-long :int]]
;;FIXME: const char *
[:function pause [:int]]
;;FIXME: int [2]
;;FIXME: void *
;;FIXME: const char *
[:function setgid [:int :unsigned-int]]
[:function setpgid [:int :int :int]]
[:function setsid [:int]]
[:function setuid [:int :unsigned-int]]
[:function sleep [:unsigned-int :unsigned-int]]
[:function sysconf [:long :int]]
[:function tcgetpgrp [:int :int]]
[:function tcsetpgrp [:int :int :int]]
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: const void *
;;FIXME: char *
;;FIXME: char *const []
;;FIXME: void *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: char *
[:function fchdir [:int :int]]
[:function gethostid [:long]]
[:function getpgid [:int :int]]
[:function getsid [:int :int]]
[:function getdtablesize [:int]]
[:function getpagesize [:int]]
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
[:function lockf [:int :int :int :long-long]]
[:function nice [:int :int]]
;;FIXME: void *
;;FIXME: const void *
;;FIXME: void *
[:function setpgrp [:int]]
[:function setregid [:int :unsigned-int :unsigned-int]]
[:function setreuid [:int :unsigned-int :unsigned-int]]
;;FIXME: const void *restrict
[:function sync [:void]]
;;FIXME: const char *
[:function ualarm [:unsigned-int :unsigned-int :unsigned-int]]
[:function usleep [:int :unsigned-int]]
[:function vfork [:int]]
[:function fsync [:int :int]]
[:function ftruncate [:int :int :long-long]]
;;FIXME: char *
[:function fchown [:int :int :unsigned-int :unsigned-int]]
;;FIXME: char *
;;FIXME: const char *restrict
[:function setegid [:int :unsigned-int]]
[:function seteuid [:int :unsigned-int]]
;;FIXME: const char *
;;FIXME: fd_set *restrict
;;FIXME: fd_set *restrict
[:function _Exit [:void :int]]
;;FIXME: const struct accessx_descriptor *
;;FIXME: const char *
;;FIXME: char *
[:function endusershell [:void]]
;;FIXME: const char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: const char *
;;FIXME: unsigned char [16]
;;FIXME: const void *
;;FIXME: uid_t *
;;FIXME: int *
;;FIXME: char *
;;FIXME: int *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const void *
[:function issetugid [:int]]
;;FIXME: char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: void *
;;FIXME: char *
[:function pthread_setugid_np [:int :unsigned-int :unsigned-int]]
;;FIXME: uid_t *
;;FIXME: char **
;;FIXME: char **
[:function reboot [:int :int]]
;;FIXME: const char *
;;FIXME: int *
;;FIXME: int *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const gid_t *
[:function sethostid [:void :long]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
[:function setrgid [:int :unsigned-int]]
[:function setruid [:int :unsigned-int]]
;;FIXME: unsigned char const[16]
[:function setusershell [:void]]
;;FIXME: unsigned char const[16]
;;FIXME: char **
;;FIXME: const char *
[:function syscall [:int :int]]
[:function ttyslot [:int]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
;;FIXME: char **
;;FIXME: void *
;;FIXME: void *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
[:function fsync_volume_np [:int :int :int]]
;;FIXME: const char *
[:compound fsignatures_t "sizeof (fsignatures_t)"]
[:compound fstore_t "sizeof (fstore_t)"]
[:compound fbootstraptransfer_t "sizeof (fbootstraptransfer_t)"]
;;FIXME: const char *
;;FIXME: const char *
[:function fcntl [:int :int :int]]
;;FIXME: const char *
;;FIXME: const char *
[:function flock [:int :int :int]]
;;FIXME: struct _filesec *
;;FIXME: struct _filesec *
;;FIXME: struct _filesec *
;;FIXME: struct _filesec *
;;FIXME: struct _filesec *
;;FIXME: struct _filesec *
;;FIXME: struct _filesec *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
[:function sel_isMapped [Boolean :selector]]
;;FIXME: const char *
[:function NSStringFromSelector [:id :selector]]
[:function NSSelectorFromString [:selector :id]]
[:function NSStringFromClass [:id :id]]
[:function NSClassFromString [:id :id]]
[:function NSStringFromProtocol [:id :id]]
[:function NSProtocolFromString [:id :id]]
;;FIXME: const char *
[:function NSLog [:void :id]]
;;FIXME: struct __va_list_tag [1]
[:compound NSZone "sizeof (NSZone)"]
;;FIXME: NSZone *
;;FIXME: NSZone *
;;FIXME: NSZone *
;;FIXME: NSZone *
;;FIXME: NSZone *
;;FIXME: NSZone *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: NSZone *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: const void *
[:function NSPageSize [:unsigned-long]]
[:function NSLogPageSize [:unsigned-long]]
[:function NSRoundUpToMultipleOfPageSize [:unsigned-long :unsigned-long]]
[:function NSRoundDownToMultipleOfPageSize [:unsigned-long :unsigned-long]]
;;FIXME: void *
;;FIXME: void *
;;FIXME: const void *
[:function NSRealMemoryAvailable [:unsigned-long]]
[:selector [0 :load] [:void]]
[:selector [0 :initialize] [:void]]
[:selector [0 :init] [:id]]
[:selector [0 :new] [:id]]
;;FIXME: NSZone *
[:selector [0 :alloc] [:id]]
[:selector [0 :dealloc] [:void]]
[:selector [0 :finalize] [:void]]
[:selector [0 :copy] [:id]]
[:selector [0 :mutableCopy] [:id]]
;;FIXME: NSZone *
;;FIXME: NSZone *
[:selector [0 :superclass] [:id]]
[:selector [0 :class] [:id]]
[:selector [1 :instancesRespondToSelector] [Boolean :selector]]
[:selector [1 :conformsToProtocol] [Boolean :id]]
;;FIXME: id (*)(id, SEL *, ...)
;;FIXME: id (*)(id, SEL *, ...)
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
;;FIXME: NSZone *
[:function NSDeallocateObject [:void :id]]
;;FIXME: NSZone *
;;FIXME: NSZone *
[:function NSIncrementExtraRefCount [:void :id]]
[:function NSDecrementExtraRefCountWasZero [Boolean :id]]
[:function NSExtraRefCount [:unsigned-long :id]]
;;FIXME: const void *
;;FIXME: const void *
[:function _dispatch_object_validate [:void :id]]
;;FIXME: const char *
;;FIXME: const char *
[:function dispatch_retain [:void :id]]
[:function dispatch_release [:void :id]]
;;FIXME: void *
;;FIXME: void *
;;FIXME: void (*)(void *)
[:function dispatch_suspend [:void :id]]
[:function dispatch_resume [:void :id]]
[:compound time_value_t "sizeof (time_value_t)"]
[:compound mach_timespec_t "sizeof (mach_timespec_t)"]
[:function dispatch_time [:unsigned-long-long :unsigned-long-long :long-long]]
;;FIXME: const struct timespec *
;;FIXME: void (^)(void)
;;FIXME: void *
;;FIXME: void (^)(void)
;;FIXME: void *
;;FIXME: void (^)(size_t)
;;FIXME: void *
[:function dispatch_get_current_queue [:id]]
[:function dispatch_get_global_queue [:id :long :unsigned-long]]
;;FIXME: const char *
;;FIXME: const char *
[:function dispatch_set_target_queue [:void :id :id]]
[:function dispatch_main [:void]]
;;FIXME: void (^)(void)
;;FIXME: void *
;;FIXME: void (^)(void)
;;FIXME: void *
;;FIXME: void (^)(void)
;;FIXME: void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: void *
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
;;FIXME: mach_msg_header_t *
;;FIXME: mach_msg_header_t *
;;FIXME: const struct dispatch_source_type_s *
;;FIXME: void (^)(void)
;;FIXME: void (*)(void *)
;;FIXME: void (^)(void)
;;FIXME: void (*)(void *)
[:function dispatch_source_cancel [:void :id]]
[:function dispatch_source_testcancel [:long :id]]
[:function dispatch_source_get_handle [:unsigned-long :id]]
[:function dispatch_source_get_mask [:unsigned-long :id]]
[:function dispatch_source_get_data [:unsigned-long :id]]
[:function dispatch_source_merge_data [:void :id :unsigned-long]]
[:function dispatch_source_set_timer [:void :id :unsigned-long-long :unsigned-long-long :unsigned-long-long]]
;;FIXME: void (^)(void)
;;FIXME: void (*)(void *)
[:function dispatch_group_create [:id]]
;;FIXME: void (^)(void)
;;FIXME: void *
[:function dispatch_group_wait [:long :id :unsigned-long-long]]
;;FIXME: void (^)(void)
;;FIXME: void *
[:function dispatch_group_enter [:void :id]]
[:function dispatch_group_leave [:void :id]]
[:function dispatch_semaphore_create [:id :long]]
[:function dispatch_semaphore_wait [:long :id :unsigned-long-long]]
[:function dispatch_semaphore_signal [:long :id]]
;;FIXME: dispatch_once_t *
;;FIXME: dispatch_once_t *
;;FIXME: dispatch_once_t *
;;FIXME: dispatch_once_t *
;;FIXME: const void *
[:function dispatch_data_get_size [:unsigned-long :id]]
;;FIXME: const void **
[:function dispatch_data_create_concat [:id :id :id]]
[:function dispatch_data_create_subrange [:id :id :unsigned-long :unsigned-long]]
;;FIXME: _Bool (^)(NSObject<OS_dispatch_data> *, unsigned long, const void *, unsigned long)
;;FIXME: size_t *
;;FIXME: void (^)(dispatch_data_t, int)
;;FIXME: void (^)(dispatch_data_t, int)
;;FIXME: void (^)(int)
;;FIXME: const char *
;;FIXME: void (^)(int)
;;FIXME: void (^)(_Bool, NSObject<OS_dispatch_data> *, int)
;;FIXME: void (^)(_Bool, NSObject<OS_dispatch_data> *, int)
[:function dispatch_io_close [:void :id :unsigned-long]]
;;FIXME: void (^)(void)
[:function dispatch_io_get_descriptor [:int :id]]
[:function dispatch_io_set_high_water [:void :id :unsigned-long]]
[:function dispatch_io_set_low_water [:void :id :unsigned-long]]
[:function dispatch_io_set_interval [:void :id :unsigned-long-long :unsigned-long]]
[:compound CFMessagePortContext "sizeof (CFMessagePortContext)"]
[:function CFMessagePortGetTypeID [:unsigned-long]]
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFMessagePort *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFMessagePort *
;;FIXME: void (*)(struct __CFMessagePort *, void *)
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFMessagePort *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFMessagePort *
[:function CFPlugInGetTypeID [:unsigned-long]]
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: void *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
;;FIXME: struct __CFPlugInInstance *
;;FIXME: const struct __CFString *
;;FIXME: void *
[:function CFPlugInInstanceGetTypeID [:unsigned-long]]
;;FIXME: struct __CFPlugInInstance *
[:function CFAttributedStringGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFAttributedString *
;;FIXME: const struct __CFAttributedString *
;;FIXME: const struct __CFAttributedString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFAttributedString *
;;FIXME: const struct __CFDictionary *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: const void *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
;;FIXME: struct __CFAttributedString *
[:function CFNotificationCenterGetTypeID [:unsigned-long]]
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
;;FIXME: struct __CFNotificationCenter *
[:function CFURLEnumeratorGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFURLEnumerator *
;;FIXME: const struct __CFURLEnumerator *
;;FIXME: const struct __CFURLEnumerator *
;;FIXME: const struct __CFURLEnumerator *
;;FIXME: const struct __CFURLEnumerator *
[:compound guid_t "sizeof (guid_t)"]
[:compound ntsid_t "sizeof (ntsid_t)"]
;;FIXME: struct _acl *
;;FIXME: void *
;;FIXME: struct _acl *
;;FIXME: struct _acl_entry *
;;FIXME: acl_t *
;;FIXME: acl_t *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: struct _acl_permset *
;;FIXME: acl_t *
;;FIXME: struct _acl_permset *
;;FIXME: struct _acl_permset *
;;FIXME: struct _acl_permset *
;;FIXME: struct _acl_entry *
;;FIXME: struct _acl_entry *
;;FIXME: acl_permset_mask_t *
;;FIXME: struct _acl_entry *
;;FIXME: struct _acl_entry *
;;FIXME: struct _acl_flagset *
;;FIXME: struct _acl_flagset *
;;FIXME: struct _acl_flagset *
;;FIXME: struct _acl_flagset *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: struct _acl_entry *
;;FIXME: struct _acl_entry *
;;FIXME: struct _acl_entry *
;;FIXME: const char *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
;;FIXME: void *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: struct _acl *
;;FIXME: char *
[:function CFFileSecurityGetTypeID [:unsigned-long]]
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
;;FIXME: struct __CFFileSecurity *
[:compound CFMachPortContext "sizeof (CFMachPortContext)"]
[:function CFMachPortGetTypeID [:unsigned-long]]
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: void (*)(struct __CFMachPort *, void *)
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: const struct __CFString *
[:function CFStringTokenizerGetTypeID [:unsigned-long]]
;;FIXME: struct __CFStringTokenizer *
;;FIXME: struct __CFStringTokenizer *
;;FIXME: struct __CFStringTokenizer *
;;FIXME: const void *
;;FIXME: struct __CFStringTokenizer *
[:compound CFFileDescriptorContext "sizeof (CFFileDescriptorContext)"]
[:function CFFileDescriptorGetTypeID [:unsigned-long]]
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFFileDescriptor *
;;FIXME: struct __CFRunLoopSource *
[:function CFUserNotificationGetTypeID [:unsigned-long]]
;;FIXME: struct __CFUserNotification *
;;FIXME: struct __CFUserNotification *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __CFUserNotification *
;;FIXME: struct __CFUserNotification *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
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
;;FIXME: const struct __CFXMLNode *
;;FIXME: const struct __CFXMLNode *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const struct __CFXMLNode *
;;FIXME: struct __CFTree *
;;FIXME: const struct __CFXMLNode *
[:compound CFXMLParserCallBacks "sizeof (CFXMLParserCallBacks)"]
[:compound CFXMLParserContext "sizeof (CFXMLParserContext)"]
[:function CFXMLParserGetTypeID [:unsigned-long]]
;;FIXME: struct __CFXMLParser *
;;FIXME: struct __CFXMLParser *
;;FIXME: struct __CFXMLParser *
;;FIXME: struct __CFXMLParser *
;;FIXME: const struct __CFURL *
;;FIXME: struct __CFXMLParser *
;;FIXME: struct __CFXMLParser *
;;FIXME: void *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFXMLParser *
;;FIXME: struct __CFXMLParser *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: struct __CFTree *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:compound NSFastEnumerationState "sizeof (NSFastEnumerationState)"]
[:selector [0 :nextObject] [:id]]
;;FIXME: void *
;;FIXME: const char *
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
;;FIXME: enum NSComparisonResult
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
;;FIXME: NSError **
;;FIXME: NSError **
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
;;FIXME: const char *
[:selector [1 :encodeDataObject] [:void :id]]
;;FIXME: const char *
[:selector [0 :decodeDataObject] [:id]]
[:selector [1 :versionForClassName] [:long :id]]
[:function NXReadNSObjectFromCoder [:id :id]]
[:selector [0 :length] [:unsigned-long]]
;;FIXME: const void *
;;FIXME: void *
[:selector [1 :setLength] [:void :unsigned-long]]
[:selector [1 :stringForObjectValue] [:id :id]]
[:selector [2 :attributedStringForObjectValue :withDefaultAttributes] [:id :id :id]]
[:selector [1 :editingStringForObjectValue] [:id :id]]
;;FIXME: id *
;;FIXME: NSString **
;;FIXME: NSString **
;;FIXME: id *
[:selector [1 :stringFromDate] [:id :id]]
[:selector [1 :dateFromString] [:id :id]]
[:selector [3 :dateFormatFromTemplate :options :locale] [:id :id :unsigned-long :id]]
[:selector [0 :dateFormat] [:id]]
;;FIXME: enum NSDateFormatterStyle
;;FIXME: enum NSDateFormatterStyle
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :generatesCalendarDates] [Boolean]]
[:selector [1 :setGeneratesCalendarDates] [:void Boolean]]
;;FIXME: enum NSDateFormatterBehavior
;;FIXME: enum NSDateFormatterBehavior
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
;;FIXME: const NSDecimal *
;;FIXME: NSDecimal *
;;FIXME: NSDecimal *
;;FIXME: enum NSComparisonResult
;;FIXME: NSDecimal *
;;FIXME: enum NSCalculationError
;;FIXME: enum NSCalculationError
;;FIXME: enum NSCalculationError
;;FIXME: enum NSCalculationError
;;FIXME: enum NSCalculationError
;;FIXME: enum NSCalculationError
;;FIXME: enum NSCalculationError
;;FIXME: const NSDecimal *
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
;;FIXME: enum NSComparisonResult
[:selector [1 :setDefaultBehavior] [:void :id]]
[:selector [0 :defaultBehavior] [:id]]
;;FIXME: const char *
[:selector [0 :doubleValue] [:double]]
[:selector [0 :defaultDecimalNumberHandler] [:id]]
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
;;FIXME: NSUncaughtExceptionHandler *
;;FIXME: NSUncaughtExceptionHandler *
[:selector [0 :currentHandler] [:id]]
[:selector [5 :handleFailureInMethod :object :file :lineNumber :description] [:void :selector :id :id :long :id]]
[:selector [4 :handleFailureInFunction :file :lineNumber :description] [:void :id :id :long :id]]
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
[:selector [0 :defaultManager] [:id]]
;;FIXME: NSError **
;;FIXME: NSError **
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSURL **
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
;;FIXME: BOOL *
[:selector [1 :isReadableFileAtPath] [Boolean :id]]
[:selector [1 :isWritableFileAtPath] [Boolean :id]]
[:selector [1 :isExecutableFileAtPath] [Boolean :id]]
[:selector [1 :isDeletableFileAtPath] [Boolean :id]]
[:selector [2 :contentsEqualAtPath :andPath] [Boolean :id :id]]
[:selector [1 :displayNameAtPath] [:id :id]]
[:selector [1 :componentsToDisplayForPath] [:id :id]]
[:selector [1 :enumeratorAtPath] [:id :id]]
[:selector [1 :subpathsAtPath] [:id :id]]
[:selector [1 :contentsAtPath] [:id :id]]
[:selector [3 :createFileAtPath :contents :attributes] [Boolean :id :id :id]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: NSError **
[:selector [1 :isUbiquitousItemAtURL] [Boolean :id]]
;;FIXME: NSError **
;;FIXME: NSError **
[:selector [1 :URLForUbiquityContainerIdentifier] [:id :id]]
;;FIXME: NSDate **
[:selector [0 :ubiquityIdentityToken] [:id]]
[:selector [1 :containerURLForSecurityApplicationGroupIdentifier] [:id :id]]
[:selector [0 :fileAttributes] [:id]]
[:selector [0 :directoryAttributes] [:id]]
[:selector [0 :skipDescendents] [:void]]
[:selector [0 :level] [:unsigned-long]]
[:selector [0 :skipDescendants] [:void]]
[:selector [1 :initWithOptions] [:id :unsigned-long]]
[:selector [1 :pointerFunctionsWithOptions] [:id :unsigned-long]]
;;FIXME: NSUInteger (*)(const void *, NSUInteger (*)(const void *))
;;FIXME: NSUInteger (*)(const void *, NSUInteger (*)(const void *))
;;FIXME: BOOL (*)(const void *, const void *, NSUInteger (*)(const void *))
;;FIXME: BOOL (*)(const void *, const void *, NSUInteger (*)(const void *))
;;FIXME: NSUInteger (*)(const void *)
;;FIXME: NSUInteger (*)(const void *)
;;FIXME: NSString *(*)(const void *)
;;FIXME: NSString *(*)(const void *)
;;FIXME: void (*)(const void *, NSUInteger (*)(const void *))
;;FIXME: void (*)(const void *, NSUInteger (*)(const void *))
;;FIXME: void *(*)(const void *, NSUInteger (*)(const void *), BOOL)
;;FIXME: void *(*)(const void *, NSUInteger (*)(const void *), BOOL)
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
;;FIXME: NSZone *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const void *
[:function NSEnumerateHashTable [Foundation/NSHashEnumerator :id]]
;;FIXME: void *
;;FIXME: NSHashEnumerator *
[:function NSCountHashTable [:unsigned-long :id]]
[:function NSStringFromHashTable [:id :id]]
[:function NSAllHashTableObjects [:id :id]]
[:compound NSHashTableCallBacks "sizeof (NSHashTableCallBacks)"]
;;FIXME: NSZone *
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
;;FIXME: enum NSHTTPCookieAcceptPolicy
[:selector [1 :sortedCookiesUsingDescriptors] [:id :id]]
[:selector [1 :indexPathWithIndex] [:id :unsigned-long]]
;;FIXME: const NSUInteger []
[:selector [1 :initWithIndex] [:id :unsigned-long]]
;;FIXME: const NSUInteger []
[:selector [1 :indexPathByAddingIndex] [:id :unsigned-long]]
[:selector [0 :indexPathByRemovingLastIndex] [:id]]
[:selector [1 :indexAtPosition] [:unsigned-long :unsigned-long]]
[:selector [0 :length] [:unsigned-long]]
;;FIXME: NSUInteger *
;;FIXME: enum NSComparisonResult
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
;;FIXME: NSUInteger *
[:selector [1 :countOfIndexesInRange] [:unsigned-long Foundation/NSRange]]
[:selector [1 :containsIndex] [Boolean :unsigned-long]]
[:selector [1 :containsIndexesInRange] [Boolean Foundation/NSRange]]
[:selector [1 :containsIndexes] [Boolean :id]]
[:selector [1 :intersectsIndexesInRange] [Boolean Foundation/NSRange]]
;;FIXME: void (^)(NSUInteger, BOOL *)
;;FIXME: void (^)(NSUInteger, BOOL *)
;;FIXME: void (^)(NSUInteger, BOOL *)
;;FIXME: BOOL (^)(NSUInteger, BOOL *)
;;FIXME: BOOL (^)(NSUInteger, BOOL *)
;;FIXME: BOOL (^)(NSUInteger, BOOL *)
;;FIXME: BOOL (^)(NSUInteger, BOOL *)
;;FIXME: BOOL (^)(NSUInteger, BOOL *)
;;FIXME: BOOL (^)(NSUInteger, BOOL *)
;;FIXME: void (^)(NSRange, BOOL *)
;;FIXME: void (^)(NSRange, BOOL *)
;;FIXME: void (^)(NSRange, BOOL *)
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
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
[:selector [0 :invoke] [:void]]
[:selector [1 :invokeWithTarget] [:void :id]]
[:selector [1 :isValidJSONObject] [Boolean :id]]
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
;;FIXME: NSPropertyListFormat *
;;FIXME: NSPropertyListFormat *
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
;;FIXME: CGRect *
[:function CGRectContainsPoint [Boolean Foundation/CGRect Foundation/CGPoint]]
[:function CGRectContainsRect [Boolean Foundation/CGRect Foundation/CGRect]]
[:function CGRectIntersectsRect [Boolean Foundation/CGRect Foundation/CGRect]]
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
[:function CGPointMake [Foundation/CGPoint :double :double]]
[:function CGSizeMake [Foundation/CGSize :double :double]]
[:function CGRectMake [Foundation/CGRect :double :double :double :double]]
[:function __CGPointEqualToPoint [Boolean Foundation/CGPoint Foundation/CGPoint]]
[:function __CGSizeEqualToSize [Boolean Foundation/CGSize Foundation/CGSize]]
;;FIXME: struct CGPoint
;;FIXME: struct CGSize
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGPoint
;;FIXME: struct CGPoint
;;FIXME: struct CGSize
;;FIXME: struct CGSize
;;FIXME: struct CGPoint
;;FIXME: struct CGSize
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGPoint
;;FIXME: struct CGPoint
;;FIXME: struct CGRect
;;FIXME: struct CGRect
;;FIXME: struct CGPoint
;;FIXME: struct CGSize
;;FIXME: struct CGRect
;;FIXME: struct CGPoint
;;FIXME: struct CGSize
;;FIXME: struct CGRect
[:selector [1 :archivedDataWithRootObject] [:id :id]]
[:selector [2 :archiveRootObject :toFile] [Boolean :id :id]]
[:selector [1 :initForWritingWithMutableData] [:id :id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [0 :delegate] [:id]]
;;FIXME: enum NSPropertyListFormat
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
;;FIXME: const uint8_t *
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
;;FIXME: const uint8_t *
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
;;FIXME: NSZone *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const void *
[:function NSEnumerateMapTable [Foundation/NSMapEnumerator :id]]
;;FIXME: NSMapEnumerator *
;;FIXME: NSMapEnumerator *
[:function NSCountMapTable [:unsigned-long :id]]
[:function NSStringFromMapTable [:id :id]]
[:function NSAllMapTableKeys [:id :id]]
[:function NSAllMapTableValues [:id :id]]
[:compound NSMapTableKeyCallBacks "sizeof (NSMapTableKeyCallBacks)"]
[:compound NSMapTableValueCallBacks "sizeof (NSMapTableValueCallBacks)"]
;;FIXME: NSZone *
[:function NSCreateMapTable [:id Foundation/NSMapTableKeyCallBacks Foundation/NSMapTableValueCallBacks :unsigned-long]]
;;FIXME: const char *
[:selector [0 :numberOfArguments] [:unsigned-long]]
;;FIXME: const char *
[:selector [0 :frameLength] [:unsigned-long]]
[:selector [0 :isOneway] [Boolean]]
;;FIXME: const char *
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
;;FIXME: void (^)(NSNotification *)
[:selector [0 :defaultQueue] [:id]]
[:selector [1 :initWithNotificationCenter] [:id :id]]
[:selector [2 :dequeueNotificationsMatching :coalesceMask] [:void :id :unsigned-long]]
[:selector [0 :null] [:id]]
;;FIXME: id *
[:selector [1 :stringFromNumber] [:id :id]]
[:selector [1 :numberFromString] [:id :id]]
;;FIXME: enum NSNumberFormatterStyle
[:selector [0 :locale] [:id]]
[:selector [1 :setLocale] [:void :id]]
[:selector [0 :generatesDecimalNumbers] [Boolean]]
[:selector [1 :setGeneratesDecimalNumbers] [:void Boolean]]
;;FIXME: enum NSNumberFormatterBehavior
;;FIXME: enum NSNumberFormatterBehavior
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
;;FIXME: enum NSNumberFormatterPadPosition
;;FIXME: enum NSNumberFormatterRoundingMode
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
;;FIXME: enum NSOperationQueuePriority
;;FIXME: void (^)(void)
;;FIXME: void (^)(void)
[:selector [0 :waitUntilFinished] [:void]]
[:selector [0 :threadPriority] [:double]]
[:selector [1 :setThreadPriority] [:void :double]]
;;FIXME: void (^)(void)
;;FIXME: void (^)(void)
[:selector [0 :executionBlocks] [:id]]
[:selector [3 :initWithTarget :selector :object] [:id :id :selector :id]]
[:selector [1 :initWithInvocation] [:id :id]]
[:selector [0 :invocation] [:id]]
[:selector [0 :result] [:id]]
[:selector [1 :addOperation] [:void :id]]
[:selector [2 :addOperations :waitUntilFinished] [:void :id Boolean]]
;;FIXME: void (^)(void)
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
;;FIXME: void *
;;FIXME: void *
[:selector [1 :removePointerAtIndex] [:void :unsigned-long]]
;;FIXME: void *
;;FIXME: void *
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
;;FIXME: NSZone *
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
[:selector [0 :range] [Foundation/NSRange]]
[:selector [1 :escapedPatternForString] [:id :id]]
[:selector [0 :pattern] [:id]]
[:selector [0 :numberOfCaptureGroups] [:unsigned-long]]
[:selector [0 :checkingTypes] [:id]]
[:selector [0 :currentRunLoop] [:id]]
[:selector [0 :mainRunLoop] [:id]]
[:selector [0 :currentMode] [:id]]
;;FIXME: struct __CFRunLoop *
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
;;FIXME: enum NSComparisonResult (^)(id, id)
;;FIXME: enum NSComparisonResult (^)(id, id)
;;FIXME: enum NSComparisonResult (^)(id, id)
;;FIXME: enum NSComparisonResult
[:selector [0 :reversedSortDescriptor] [:id]]
[:selector [0 :open] [:void]]
[:selector [0 :close] [:void]]
[:selector [0 :delegate] [:id]]
[:selector [1 :setDelegate] [:void :id]]
[:selector [1 :propertyForKey] [:id :id]]
[:selector [2 :setProperty :forKey] [Boolean :id :id]]
[:selector [2 :scheduleInRunLoop :forMode] [:void :id :id]]
[:selector [2 :removeFromRunLoop :forMode] [:void :id :id]]
;;FIXME: enum NSStreamStatus
[:selector [0 :streamError] [:id]]
;;FIXME: uint8_t *
;;FIXME: uint8_t **
[:selector [0 :hasBytesAvailable] [Boolean]]
;;FIXME: const uint8_t *
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
;;FIXME: NSError **
[:selector [0 :isFileReferenceURL] [Boolean]]
[:selector [0 :fileReferenceURL] [:id]]
[:selector [0 :filePathURL] [:id]]
;;FIXME: id *
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
[:selector [2 :resourceValuesForKeys :fromBookmarkData] [:id :id :id]]
;;FIXME: NSError **
;;FIXME: NSError **
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
;;FIXME: const char *
;;FIXME: const CSSM_OID *
;;FIXME: const CSSM_OID *
[:compound CSSM_MANAGER_EVENT_NOTIFICATION "sizeof (CSSM_MANAGER_EVENT_NOTIFICATION)"]
;;FIXME: const CSSM_VERSION *
[:function CSSM_Terminate [:int]]
;;FIXME: const CSSM_GUID *
;;FIXME: const CSSM_GUID *
;;FIXME: const CSSM_GUID *
;;FIXME: const CSSM_GUID *
;;FIXME: const CSSM_GUID *
[:function CSSM_ModuleDetach [:int :long]]
[:function CSSM_SetPrivilege [:int :unsigned-long-long]]
;;FIXME: CSSM_PRIVILEGE *
;;FIXME: struct cssm_guid *
;;FIXME: struct cssm_subservice_uid *
;;FIXME: uint32 *
;;FIXME: struct cssm_memory_funcs *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: CSSM_CC_HANDLE *
;;FIXME: const CSSM_KEY *
;;FIXME: const CSSM_CRYPTO_DATA *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_CRYPTO_DATA *
;;FIXME: const CSSM_KEY *
;;FIXME: CSSM_CONTEXT_PTR *
;;FIXME: struct cssm_context *
;;FIXME: const CSSM_CONTEXT *
[:function CSSM_DeleteContext [:int :unsigned-long-long]]
;;FIXME: const CSSM_CONTEXT *
;;FIXME: const CSSM_CONTEXT_ATTRIBUTE *
;;FIXME: const CSSM_CONTEXT_ATTRIBUTE *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
[:function CSSM_CSP_Logout [:int :long]]
;;FIXME: const CSSM_STRING *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_KEY *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_KEY *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: struct cssm_acl_owner_prototype *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_DATA *
[:function CSSM_SignDataInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_DATA *
[:function CSSM_VerifyDataInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
[:function CSSM_DigestDataInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: CSSM_CC_HANDLE *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_DATA *
[:function CSSM_GenerateMacInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_DATA *
[:function CSSM_VerifyMacInit [:int :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: struct cssm_query_size_data *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
[:function CSSM_EncryptDataInit [:int :unsigned-long-long]]
[:function CSSM_EncryptDataInitP [:int :unsigned-long-long :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
[:function CSSM_DecryptDataInit [:int :unsigned-long-long]]
[:function CSSM_DecryptDataInitP [:int :unsigned-long-long :unsigned-long-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_KEY *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_KEY *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_KEY *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_KEY *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: struct cssm_data *
;;FIXME: CSSM_CSP_OPERATIONAL_STATISTICS *
;;FIXME: CSSM_DATA *
;;FIXME: struct cssm_data *
;;FIXME: struct cssm_data *
;;FIXME: const CSSM_DATA *
;;FIXME: const void *
;;FIXME: const CSSM_TP_AUTHORITY_ID *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_CERTGROUP *
[:function CSSM_TP_CertReclaimAbort [:int :long :unsigned-long-long]]
;;FIXME: const CSSM_TP_AUTHORITY_ID *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_CERTGROUP *
;;FIXME: const CSSM_FIELD *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_ENCODED_CRL *
;;FIXME: const CSSM_FIELD *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_ENCODED_CRL *
;;FIXME: const CSSM_ENCODED_CRL *
;;FIXME: const CSSM_DL_DB_LIST *
;;FIXME: const CSSM_DL_DB_LIST *
;;FIXME: const CSSM_CERTGROUP *
;;FIXME: const CSSM_TUPLEGROUP *
;;FIXME: const CSSM_DL_DB_LIST *
;;FIXME: const CSSM_TUPLEGROUP *
;;FIXME: const CSSM_DL_DB_LIST *
;;FIXME: const CSSM_FIELD *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: CSSM_DATA_PTR *
[:function CSSM_CL_CertAbortQuery [:int :long :long]]
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: CSSM_FIELD_PTR *
;;FIXME: const CSSM_OID *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_OID *
;;FIXME: CSSM_DATA_PTR *
[:function CSSM_CL_CertAbortCache [:int :long :long]]
;;FIXME: const CSSM_CERTGROUP *
;;FIXME: const CSSM_CERT_BUNDLE *
;;FIXME: uint32 *
;;FIXME: const CSSM_FIELD *
;;FIXME: const CSSM_FIELD *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: CSSM_DATA_PTR *
[:function CSSM_CL_CrlAbortQuery [:int :long :long]]
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: CSSM_DATA_PTR *
;;FIXME: const CSSM_DATA *
[:function CSSM_CL_CrlAbortCache [:int :long :long]]
;;FIXME: uint32 *
;;FIXME: const void *
;;FIXME: const char *
[:function CSSM_DL_DbClose [:int Foundation/CSSM_DL_DB_HANDLE]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
[:function CSSM_DL_DestroyRelation [:int Foundation/CSSM_DL_DB_HANDLE :unsigned-int]]
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_STRING *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: struct cssm_acl_owner_prototype *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: CSSM_NAME_LIST_PTR *
;;FIXME: char **
;;FIXME: struct cssm_name_list *
;;FIXME: const CSSM_DB_RECORD_ATTRIBUTE_DATA *
;;FIXME: const CSSM_DB_UNIQUE_RECORD *
;;FIXME: struct cssm_db_unique_record *
;;FIXME: const CSSM_QUERY *
;;FIXME: struct cssm_db_record_attribute_data *
[:function CSSM_DL_DataAbortQuery [:int Foundation/CSSM_DL_DB_HANDLE :long]]
;;FIXME: const CSSM_DB_UNIQUE_RECORD *
;;FIXME: struct cssm_db_unique_record *
;;FIXME: const void *
[:compound CSSM_SPI_AC_FUNCS "sizeof (CSSM_SPI_AC_FUNCS)"]
[:compound CSSM_SPI_CL_FUNCS "sizeof (CSSM_SPI_CL_FUNCS)"]
[:compound CSSM_MODULE_FUNCS "sizeof (CSSM_MODULE_FUNCS)"]
[:compound CSSM_UPCALLS "sizeof (CSSM_UPCALLS)"]
;;FIXME: const CSSM_GUID *
;;FIXME: const CSSM_GUID *
;;FIXME: const CSSM_GUID *
[:function CSSM_SPI_ModuleDetach [:int :long]]
[:compound CSSM_SPI_CSP_FUNCS "sizeof (CSSM_SPI_CSP_FUNCS)"]
[:compound CSSM_SPI_DL_FUNCS "sizeof (CSSM_SPI_DL_FUNCS)"]
[:compound CSSM_KR_NAME "sizeof (CSSM_KR_NAME)"]
[:compound CSSM_KR_PROFILE "sizeof (CSSM_KR_PROFILE)"]
[:compound CSSM_KR_WRAPPEDPRODUCT_INFO "sizeof (CSSM_KR_WRAPPEDPRODUCT_INFO)"]
[:compound CSSM_KRSUBSERVICE "sizeof (CSSM_KRSUBSERVICE)"]
[:compound CSSM_KR_POLICY_LIST_ITEM "sizeof (CSSM_KR_POLICY_LIST_ITEM)"]
[:compound CSSM_KR_POLICY_INFO "sizeof (CSSM_KR_POLICY_INFO)"]
;;FIXME: const CSSM_DATA *
;;FIXME: CSSM_CC_HANDLE *
;;FIXME: const CSSM_KR_PROFILE *
;;FIXME: const CSSM_KR_PROFILE *
;;FIXME: CSSM_KR_POLICY_FLAGS *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_DATA *
;;FIXME: const CSSM_ACCESS_CREDENTIALS *
;;FIXME: const CSSM_RESOURCE_CONTROL_CONTEXT *
[:function CSSM_KR_RecoveryRequestAbort [:int :unsigned-int :long]]
;;FIXME: CSSM_KR_POLICY_INFO_PTR *
;;FIXME: const void *
[:compound CSSM_SPI_KR_FUNCS "sizeof (CSSM_SPI_KR_FUNCS)"]
[:compound CSSM_SPI_TP_FUNCS "sizeof (CSSM_SPI_TP_FUNCS)"]
[:compound CSSM_STATE_FUNCS "sizeof (CSSM_STATE_FUNCS)"]
[:compound CSSM_MANAGER_REGISTRATION_INFO "sizeof (CSSM_MANAGER_REGISTRATION_INFO)"]
;;FIXME: const CSSM_GUID *
[:compound MDS_FUNCS "sizeof (MDS_FUNCS)"]
;;FIXME: const CSSM_GUID *
[:function MDS_Terminate [:int :long]]
[:function MDS_Install [:int :long]]
[:function MDS_Uninstall [:int :long]]
[:compound SecAsn1Template "sizeof (SecAsn1Template)"]
[:compound SecKeychainAttribute "sizeof (SecKeychainAttribute)"]
[:compound SecKeychainAttributeList "sizeof (SecKeychainAttributeList)"]
[:compound SecKeychainAttributeInfo "sizeof (SecKeychainAttributeInfo)"]
;;FIXME: const struct __CFString *
[:function SecAccessGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFString *
;;FIXME: const CSSM_ACL_OWNER_PROTOTYPE *
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: const struct __CFArray *
[:function SecACLGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: struct OpaqueSecAccessRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: const struct __CFArray *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
[:function SecCertificateGetTypeID [:unsigned-long]]
;;FIXME: const CSSM_DATA *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: const struct __CFString *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: const struct __CFString *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
[:function SecIdentityGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: struct OpaqueSecIdentityRef *
;;FIXME: struct OpaqueSecIdentityRef *
;;FIXME: const struct __CFString *
;;FIXME: struct OpaqueSecIdentityRef *
;;FIXME: struct OpaqueSecIdentityRef *
;;FIXME: struct OpaqueSecIdentityRef *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function SecIdentitySearchGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: struct OpaqueSecIdentitySearchRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
[:function SecKeyGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaqueSecKeyRef *
[:compound SecKeychainSettings "sizeof (SecKeychainSettings)"]
[:compound SecKeychainCallbackInfo "sizeof (SecKeychainCallbackInfo)"]
[:function SecKeychainGetTypeID [:unsigned-long]]
;;FIXME: UInt32 *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
[:function SecKeychainLockAll [:int]]
;;FIXME: SecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: CFArrayRef *
;;FIXME: const struct __CFArray *
;;FIXME: SecPreferencesDomain *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: SecKeychainAttributeInfo *
;;FIXME: int (*)(unsigned int, struct SecKeychainCallbackInfo *, void *)
;;FIXME: int (*)(unsigned int, struct SecKeychainCallbackInfo *, void *)
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: const void *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: const void *
[:function SecKeychainSetUserInteractionAllowed [:int :unsigned-char]]
;;FIXME: Boolean *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
[:function SecKeychainItemGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: SecKeychainAttributeList *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: SecKeychainAttributeList *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: SecKeychainAttributeList *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
[:function SecKeychainSearchGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: struct OpaqueSecKeychainSearchRef *
[:function SecPolicyGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: struct OpaqueSecPolicyRef *
;;FIXME: struct OpaqueSecPolicyRef *
[:function SecPolicySearchGetTypeID [:unsigned-long]]
;;FIXME: const CSSM_OID *
;;FIXME: struct OpaquePolicySearchRef *
[:function SecTrustGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFArray *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: CFArrayRef *
;;FIXME: struct OpaqueSecKeyRef *
;;FIXME: struct OpaqueSecTrustRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: const struct __CFArray *
[:function SecTrustedApplicationGetTypeID [:unsigned-long]]
;;FIXME: const char *
;;FIXME: struct OpaqueSecTrustedApplicationRef *
;;FIXME: struct OpaqueSecTrustedApplicationRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: CFArrayRef *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: CFDataRef *
;;FIXME: const struct __CFData *
[:compound SecKeyImportExportParameters "sizeof (SecKeyImportExportParameters)"]
[:compound SecItemImportExportKeyParameters "sizeof (SecItemImportExportKeyParameters)"]
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
[:function SecStaticCodeGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __SecCode *
;;FIXME: const struct __SecCode *
[:function SecCodeGetTypeID [:unsigned-long]]
;;FIXME: SecCodeRef *
;;FIXME: struct __SecCode *
;;FIXME: struct __SecCode *
;;FIXME: struct __SecCode *
;;FIXME: struct __SecCode *
;;FIXME: struct __SecCode *
;;FIXME: const struct __SecCode *
;;FIXME: const struct __SecCode *
;;FIXME: const struct __SecCode *
;;FIXME: const struct __SecCode *
;;FIXME: const struct __CFURL *
[:function SecHostRemoveGuest [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function SecHostSelectGuest [:int :unsigned-int :unsigned-int]]
;;FIXME: SecGuestRef *
;;FIXME: const struct __CFDictionary *
[:function SecHostSetHostingPort [:int :unsigned-int :unsigned-int]]
[:function SecRequirementGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct __SecRequirement *
;;FIXME: struct __SecRequirement *
[:function SecTaskGetTypeID [:unsigned-long]]
;;FIXME: struct __SecTask *
;;FIXME: struct __SecTask *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
[:compound AuthorizationItem "sizeof (AuthorizationItem)"]
[:compound AuthorizationItemSet "sizeof (AuthorizationItemSet)"]
[:compound AuthorizationExternalForm "sizeof (AuthorizationExternalForm)"]
;;FIXME: const AuthorizationRights *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: const AuthorizationExternalForm *
;;FIXME: AuthorizationItemSet *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: AuthorizationRef *
;;FIXME: const char *
;;FIXME: const struct AuthorizationOpaqueRef *
;;FIXME: const struct AuthorizationOpaqueRef *
[:function CMSDecoderGetTypeID [:unsigned-long]]
;;FIXME: CMSDecoderRef *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
;;FIXME: struct _CMSDecoder *
[:function CMSEncoderGetTypeID [:unsigned-long]]
;;FIXME: CMSEncoderRef *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: struct _CMSEncoder *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: struct _CMSEncoder *
[:function SSLContextGetTypeID [:unsigned-long]]
;;FIXME: struct SSLContext *
;;FIXME: SSLContextRef *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
;;FIXME: struct SSLContext *
[:function SecTransformGetTypeID [:unsigned-long]]
[:function SecGroupTransformGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: struct __CFError *
;;FIXME: struct __CFError *
;;FIXME: struct __CFError *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
[:function SecDigestTransformGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: const void *
[:function SecDecryptTransformGetTypeID [:unsigned-long]]
[:function SecEncryptTransformGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: enum NSURLCredentialPersistence
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
;;FIXME: const wide *
;;FIXME: wide *
;;FIXME: wide *
;;FIXME: wide *
;;FIXME: wide *
;;FIXME: const wide *
;;FIXME: wide *
;;FIXME: const wide *
;;FIXME: wide *
;;FIXME: wide *
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
;;FIXME: ByteCount *
;;FIXME: TECInfoHandle *
;;FIXME: const unsigned char *
;;FIXME: ScriptCode *
;;FIXME: TextEncoding *
;;FIXME: ScriptCode *
;;FIXME: TextEncoding *
;;FIXME: const UniChar *
[:function UCIsSurrogateHighCharacter [:unsigned-char :unsigned-short]]
[:function UCIsSurrogateLowCharacter [:unsigned-char :unsigned-short]]
[:function UCGetUnicodeScalarValueForSurrogatePair [:unsigned-int :unsigned-short :unsigned-short]]
[:compound RoutineRecord "sizeof (RoutineRecord)"]
[:compound RoutineDescriptor "sizeof (RoutineDescriptor)"]
[:compound MixedModeStateRecord "sizeof (MixedModeStateRecord)"]
;;FIXME: short (*)(int, void *, void *)
;;FIXME: short (*)(struct OpaqueCollection *, short)
;;FIXME: short (*)(int, void *, void *)
;;FIXME: short (*)(struct OpaqueCollection *, short)
;;FIXME: void *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: short (*)(struct OpaqueCollection *, short)
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
;;FIXME: struct OpaqueCollection *
[:compound BigEndianUInt32 "sizeof (BigEndianUInt32)"]
[:compound BigEndianLong "sizeof (BigEndianLong)"]
[:compound BigEndianUnsignedLong "sizeof (BigEndianUnsignedLong)"]
[:compound BigEndianShort "sizeof (BigEndianShort)"]
[:compound BigEndianUnsignedShort "sizeof (BigEndianUnsignedShort)"]
[:compound BigEndianFixed "sizeof (BigEndianFixed)"]
[:compound BigEndianUnsignedFixed "sizeof (BigEndianUnsignedFixed)"]
[:compound BigEndianOSType "sizeof (BigEndianOSType)"]
;;FIXME: int (*)(unsigned int, unsigned int, short, void *, unsigned long, unsigned char, void *)
;;FIXME: CoreEndianFlipProc *
;;FIXME: void *
;;FIXME: SInt32 *
[:function NewGestaltValue [:short :unsigned-int :int]]
[:function ReplaceGestaltValue [:short :unsigned-int :int]]
[:function SetGestaltValue [:short :unsigned-int :int]]
[:function DeleteGestaltValue [:short :unsigned-int]]
;;FIXME: short (*)(unsigned int, int *)
;;FIXME: short (*)(unsigned int, int *)
;;FIXME: SInt32 *
[:function MemError [:short]]
[:function LMGetMemErr [:short]]
[:function LMSetMemErr [:void :short]]
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char *
;;FIXME: char *
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: Handle *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: char **
;;FIXME: const void *
[:function IsHeapValid [:unsigned-char]]
;;FIXME: char **
;;FIXME: char *
[:function S64Max [:long-long]]
[:function S64Min [:long-long]]
[:function S64Add [:long-long :long-long :long-long]]
[:function S64Subtract [:long-long :long-long :long-long]]
[:function S64Negate [:long-long :long-long]]
[:function S64Multiply [:long-long :long-long :long-long]]
[:function S64Mod [:long-long :long-long :long-long]]
;;FIXME: SInt64 *
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
;;FIXME: long double
;;FIXME: long double
[:function U64Max [:unsigned-long-long]]
[:function U64Add [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Subtract [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Multiply [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
[:function U64Mod [:unsigned-long-long :unsigned-long-long :unsigned-long-long]]
;;FIXME: UInt64 *
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
;;FIXME: long double
;;FIXME: long double
[:function UInt64ToSInt64 [:long-long :unsigned-long-long]]
[:function SInt64ToUInt64 [:unsigned-long-long :long-long]]
[:function SInt64ToWide [Foundation/wide :long-long]]
[:function WideToSInt64 [:long-long Foundation/wide]]
[:function UInt64ToUnsignedWide [Foundation/UnsignedWide :unsigned-long-long]]
[:function UnsignedWideToUInt64 [:unsigned-long-long Foundation/UnsignedWide]]
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFURL *
[:compound DateCacheRecord "sizeof (DateCacheRecord)"]
[:compound DateTimeRec "sizeof (DateTimeRec)"]
[:compound LongDateCvt "sizeof (LongDateCvt)"]
[:compound LongDateRec "sizeof (LongDateRec)"]
[:compound TogglePB "sizeof (TogglePB)"]
;;FIXME: const UTCDateTime *
;;FIXME: CFAbsoluteTime *
;;FIXME: CFAbsoluteTime *
;;FIXME: UTCDateTime *
;;FIXME: UInt32 *
;;FIXME: LongDateTime *
[:compound QElem "sizeof (QElem)"]
[:compound QHdr "sizeof (QHdr)"]
[:compound MachineLocation "sizeof (MachineLocation)"]
[:function IsMetric [:unsigned-char]]
;;FIXME: unsigned long *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: MachineLocation *
[:function TickCount [:unsigned-int]]
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: void (*)(long)
;;FIXME: void (*)(long)
;;FIXME: void (*)(long)
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
;;FIXME: vm_size_t *
;;FIXME: mach_timespec_t *
;;FIXME: mach_vm_offset_t *
[:function _kernelrpc_mach_vm_deallocate_trap [:int :unsigned-int :unsigned-long-long :unsigned-long-long]]
[:function _kernelrpc_mach_vm_protect_trap [:int :unsigned-int :unsigned-long-long :unsigned-long-long :unsigned-int :int]]
;;FIXME: mach_port_name_t *
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
;;FIXME: mach_port_name_t *
;;FIXME: mach_port_name_t *
;;FIXME: int *
[:compound IOPhysicalRange "sizeof (IOPhysicalRange)"]
[:compound IOVirtualRange "sizeof (IOVirtualRange)"]
[:compound IONamedValue "sizeof (IONamedValue)"]
[:compound OSNotificationHeader "sizeof (OSNotificationHeader)"]
[:compound IOServiceInterestContent "sizeof (IOServiceInterestContent)"]
[:compound IOAsyncCompletionContent "sizeof (IOAsyncCompletionContent)"]
;;FIXME: mach_port_t *
;;FIXME: struct IONotificationPort *
;;FIXME: struct IONotificationPort *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct IONotificationPort *
;;FIXME: struct IONotificationPort *
;;FIXME: void *
;;FIXME: mach_port_t *
[:function IOObjectRelease [:int :unsigned-int]]
[:function IOObjectRetain [:int :unsigned-int]]
;;FIXME: char [128]
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: char const[128]
[:function IOObjectIsEqualTo [:unsigned-int :unsigned-int :unsigned-int]]
[:function IOObjectGetKernelRetainCount [:unsigned-int :unsigned-int]]
[:function IOObjectGetUserRetainCount [:unsigned-int :unsigned-int]]
[:function IOObjectGetRetainCount [:unsigned-int :unsigned-int]]
[:function IOIteratorNext [:unsigned-int :unsigned-int]]
[:function IOIteratorReset [:void :unsigned-int]]
[:function IOIteratorIsValid [:unsigned-int :unsigned-int]]
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: char const[128]
;;FIXME: struct IONotificationPort *
;;FIXME: struct IONotificationPort *
;;FIXME: const struct __CFDictionary *
;;FIXME: uint32_t *
;;FIXME: mach_timespec_t *
;;FIXME: uint32_t *
;;FIXME: mach_timespec_t *
;;FIXME: io_connect_t *
[:function IOServiceRequestProbe [:int :unsigned-int :unsigned-int]]
[:function IOServiceClose [:int :unsigned-int]]
[:function IOConnectAddRef [:int :unsigned-int]]
[:function IOConnectRelease [:int :unsigned-int]]
;;FIXME: io_service_t *
[:function IOConnectSetNotificationPort [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-long]]
;;FIXME: mach_vm_address_t *
;;FIXME: mach_vm_address_t *
[:function IOConnectUnmapMemory [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-long-long]]
[:function IOConnectUnmapMemory64 [:int :unsigned-int :unsigned-int :unsigned-int :unsigned-long-long]]
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const uint64_t *
;;FIXME: uint64_t *
;;FIXME: const void *
;;FIXME: uint64_t *
;;FIXME: const uint64_t *
;;FIXME: uint64_t *
[:function IOConnectTrap0 [:int :unsigned-int :unsigned-int]]
[:function IOConnectTrap1 [:int :unsigned-int :unsigned-int :unsigned-long]]
[:function IOConnectTrap2 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long]]
[:function IOConnectTrap3 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectTrap4 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectTrap5 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectTrap6 [:int :unsigned-int :unsigned-int :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long :unsigned-long]]
[:function IOConnectAddClient [:int :unsigned-int :unsigned-int]]
[:function IORegistryGetRootEntry [:unsigned-int :unsigned-int]]
;;FIXME: char const[512]
;;FIXME: char const[128]
;;FIXME: char const[128]
[:function IORegistryIteratorEnterEntry [:int :unsigned-int]]
[:function IORegistryIteratorExitEntry [:int :unsigned-int]]
;;FIXME: char [128]
;;FIXME: char const[128]
;;FIXME: char const[128]
;;FIXME: char const[128]
;;FIXME: uint64_t *
;;FIXME: CFMutableDictionaryRef *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: char const[128]
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: char const[128]
;;FIXME: char const[128]
;;FIXME: char const[128]
;;FIXME: char const[128]
;;FIXME: char const[128]
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: struct __CFDictionary *
;;FIXME: char const[128]
;;FIXME: mach_msg_header_t *
;;FIXME: const char *
;;FIXME: char [128]
;;FIXME: char **
;;FIXME: char [128]
[:function IOCatalogueReset [:int :unsigned-int :unsigned-int]]
[:function DASessionGetTypeID [:unsigned-long]]
;;FIXME: struct __DASession *
;;FIXME: struct __DASession *
;;FIXME: struct __DASession *
;;FIXME: struct __DASession *
[:function DAApprovalSessionGetTypeID [:unsigned-long]]
;;FIXME: struct __DASession *
;;FIXME: struct __DASession *
;;FIXME: struct __DASession *
[:function DADiskGetTypeID [:unsigned-long]]
;;FIXME: struct __DADisk *
;;FIXME: struct __DADisk *
;;FIXME: struct __DADisk *
;;FIXME: const char *
;;FIXME: struct __DADisk *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __DADisk *
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
;;FIXME: void (*)(void *)
;;FIXME: void (*)(void *)
;;FIXME: void *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: const char *
;;FIXME: const FSRef *
;;FIXME: const char *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSRefParam *
;;FIXME: FSRefParam *
;;FIXME: const FSRef *
;;FIXME: FSCatalogBulkParam *
;;FIXME: FSCatalogBulkParam *
;;FIXME: struct OpaqueFSIterator *
;;FIXME: FSCatalogBulkParam *
;;FIXME: FSCatalogBulkParam *
;;FIXME: struct OpaqueFSIterator *
;;FIXME: FSCatalogBulkParam *
;;FIXME: FSCatalogBulkParam *
;;FIXME: struct OpaqueFSIterator *
;;FIXME: FSCatalogBulkParam *
;;FIXME: FSCatalogBulkParam *
;;FIXME: const FSRef *
;;FIXME: struct FSRefForkIOParam *
;;FIXME: struct FSRefForkIOParam *
;;FIXME: const FSRef *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: const FSRef *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: const FSRef *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: const FSRef *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: void *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: const void *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: SInt64 *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
[:function FSSetForkPosition [:short :int :unsigned-short :long-long]]
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: SInt64 *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
[:function FSSetForkSize [:short :int :unsigned-short :long-long]]
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: UInt64 *
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
[:function FSFlushFork [:short :int]]
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
[:function FSCloseFork [:short :int]]
;;FIXME: FSForkIOParam *
;;FIXME: FSForkIOParam *
;;FIXME: short *
;;FIXME: FSForkCBInfoParam *
;;FIXME: FSForkCBInfoParam *
;;FIXME: UInt64 *
;;FIXME: struct FSRangeLockParam *
;;FIXME: struct FSRangeLockParam *
;;FIXME: UInt64 *
;;FIXME: struct FSRangeLockParam *
;;FIXME: struct FSRangeLockParam *
;;FIXME: FSVolumeRefNum *
;;FIXME: FSVolumeInfoParam *
;;FIXME: FSVolumeInfoParam *
;;FIXME: const FSVolumeInfo *
;;FIXME: FSVolumeInfoParam *
;;FIXME: FSVolumeInfoParam *
;;FIXME: HFSUniStr255 *
;;FIXME: HFSUniStr255 *
;;FIXME: const FSRef *
;;FIXME: const UInt8 *
;;FIXME: const UInt8 *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const UInt8 *
[:function FNNotifyAll [:int :unsigned-int :unsigned-int]]
;;FIXME: void (*)(unsigned int, unsigned int, void *, struct OpaqueFNSubscriptionRef *)
;;FIXME: void (*)(unsigned int, unsigned int, void *, struct OpaqueFNSubscriptionRef *)
;;FIXME: void *
;;FIXME: const FSRef *
;;FIXME: const UInt8 *
;;FIXME: struct OpaqueFNSubscriptionRef *
;;FIXME: struct OpaqueFNSubscriptionRef *
;;FIXME: void (*)(struct OpaqueFSVolumeOperation *, void *, int, short)
;;FIXME: void (*)(struct OpaqueFSVolumeOperation *, void *, int, short, int)
;;FIXME: void (*)(struct OpaqueFSVolumeOperation *, void *, int, short, int)
;;FIXME: void (*)(struct OpaqueFSVolumeOperation *, void *, int, short)
;;FIXME: void (*)(struct OpaqueFSVolumeOperation *, void *, int, short, int)
;;FIXME: void (*)(struct OpaqueFSVolumeOperation *, void *, int, short, int)
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: FSVolumeOperation *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: pid_t *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: pid_t *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: struct OpaqueFSVolumeOperation *
;;FIXME: CFStringRef *
;;FIXME: CFURLRef *
;;FIXME: const struct __CFString *
;;FIXME: DADiskRef *
;;FIXME: struct __DADisk *
[:compound FSFileOperationClientContext "sizeof (FSFileOperationClientContext)"]
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
[:function FSFileOperationGetTypeID [:unsigned-long]]
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: struct __FSFileOperation *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function FSFileSecurityGetTypeID [:unsigned-long]]
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: struct __FSFileSecurity *
;;FIXME: GetVolParmsInfoBuffer *
;;FIXME: ByteCount *
;;FIXME: unsigned char *
;;FIXME: unsigned char *
[:function FSFlushVolume [:int :short]]
;;FIXME: struct FSRefParam *
;;FIXME: struct FSRefParam *
;;FIXME: struct FSRefParam *
;;FIXME: struct FSRefParam *
;;FIXME: struct FSRef *
;;FIXME: struct FSRefParam *
;;FIXME: struct FSRefParam *
;;FIXME: void (*)(short)
;;FIXME: void (*)(short)
;;FIXME: void (*)(short)
[:function CloseResFile [:void :int]]
[:function ResError [:short]]
[:function CurResFile [:int]]
;;FIXME: char **
[:function UseResFile [:void :int]]
[:function CountTypes [:short]]
[:function Count1Types [:short]]
;;FIXME: ResType *
;;FIXME: ResType *
[:function SetResLoad [:void :unsigned-char]]
[:function CountResources [:short :unsigned-int]]
[:function Count1Resources [:short :unsigned-int]]
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
[:function UniqueID [:short :unsigned-int]]
[:function Unique1ID [:short :unsigned-int]]
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
[:function UpdateResFile [:void :int]]
;;FIXME: char **
[:function SetResPurge [:void :unsigned-char]]
[:function GetResFileAttrs [:short :int]]
[:function SetResFileAttrs [:void :int :short]]
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
;;FIXME: char **
[:function InsertResourceFile [:short :int :short]]
[:function DetachResourceFile [:short :int]]
;;FIXME: ResFileRefNum *
;;FIXME: ResFileRefNum *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
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
;;FIXME: long (*)()
;;FIXME: long (*)()
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: ComponentDescription *
;;FIXME: struct ComponentRecord *
[:function GetComponentListModSeed [:int]]
[:function GetComponentTypeModSeed [:int :unsigned-int]]
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: ComponentDescription *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
[:function CloseComponentResFile [:short :int]]
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: char **
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentRecord *
;;FIXME: ComponentParameters *
;;FIXME: char **
;;FIXME: char **
;;FIXME: ComponentParameters *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: ComponentInstance *
;;FIXME: struct ComponentRecord *
;;FIXME: struct ComponentRecord *
[:function RegisterComponentResourceFile [:int :short :short]]
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: struct ComponentInstanceRecord *
;;FIXME: ComponentParameters *
;;FIXME: int (*)(void *, struct ComponentMPWorkFunctionHeaderRecord *)
;;FIXME: int (*)(struct ComponentParameters *, char **)
;;FIXME: short (*)(struct ComponentRecord *, unsigned int, short, void *, char ***)
;;FIXME: int (*)(void *, struct ComponentMPWorkFunctionHeaderRecord *)
;;FIXME: int (*)(struct ComponentParameters *, char **)
;;FIXME: short (*)(struct ComponentRecord *, unsigned int, short, void *, char ***)
;;FIXME: void *
;;FIXME: ComponentParameters *
;;FIXME: struct ComponentRecord *
[:function MPProcessors [:unsigned-long]]
[:function MPProcessorsScheduled [:unsigned-long]]
;;FIXME: int (*)(void *)
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
[:function MPExit [:void :int]]
[:function MPYield [:void]]
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: TaskStorageIndex *
[:function MPDeallocateTaskStorageIndex [:int :unsigned-long]]
;;FIXME: void *
;;FIXME: void *
;;FIXME: MPQueueID *
;;FIXME: struct OpaqueMPQueueID *
;;FIXME: struct OpaqueMPQueueID *
;;FIXME: struct OpaqueMPQueueID *
;;FIXME: struct OpaqueMPQueueID *
;;FIXME: MPSemaphoreID *
;;FIXME: struct OpaqueMPSemaphoreID *
;;FIXME: struct OpaqueMPSemaphoreID *
;;FIXME: struct OpaqueMPSemaphoreID *
;;FIXME: MPCriticalRegionID *
;;FIXME: struct OpaqueMPCriticalRegionID *
;;FIXME: struct OpaqueMPCriticalRegionID *
;;FIXME: struct OpaqueMPCriticalRegionID *
;;FIXME: MPEventID *
;;FIXME: struct OpaqueMPEventID *
;;FIXME: struct OpaqueMPEventID *
;;FIXME: struct OpaqueMPEventID *
;;FIXME: MPNotificationID *
;;FIXME: struct OpaqueMPNotificationID *
;;FIXME: struct OpaqueMPNotificationID *
;;FIXME: struct OpaqueMPNotificationID *
;;FIXME: struct OpaqueMPNotificationID *
;;FIXME: AbsoluteTime *
;;FIXME: MPTimerID *
;;FIXME: struct OpaqueMPTimerID *
;;FIXME: struct OpaqueMPTimerID *
;;FIXME: struct OpaqueMPTimerID *
;;FIXME: struct OpaqueMPTimerID *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
[:compound MPTaskInfoVersion2 "sizeof (MPTaskInfoVersion2)"]
[:compound MPTaskInfo "sizeof (MPTaskInfo)"]
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPTaskID *
;;FIXME: struct OpaqueMPQueueID *
;;FIXME: struct OpaqueMPQueueID *
;;FIXME: void *
;;FIXME: void *
[:function _MPIsFullyInitialized [:unsigned-char]]
;;FIXME: const char **
;;FIXME: const char *
[:compound AliasRecord "sizeof (AliasRecord)"]
[:compound FSAliasInfo "sizeof (FSAliasInfo)"]
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: FSRef *
;;FIXME: FSRef *
;;FIXME: FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const char *
;;FIXME: const FSRef *
;;FIXME: struct AliasRecord **
;;FIXME: struct AliasRecord **
;;FIXME: struct AliasRecord **
;;FIXME: struct AliasRecord **
;;FIXME: const AliasRecord *
;;FIXME: const AliasRecord *
;;FIXME: struct AliasRecord *
[:compound LocaleAndVariant "sizeof (LocaleAndVariant)"]
;;FIXME: LocaleRef *
;;FIXME: const char []
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: const char []
;;FIXME: ItemCount *
;;FIXME: ItemCount *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: ItemCount *
;;FIXME: UniCharCount *
;;FIXME: const char *
[:function TaskLevel [:unsigned-int]]
;;FIXME: const unsigned char *
;;FIXME: const unsigned char *
[:function DisposeDebugComponent [:int :unsigned-int]]
;;FIXME: OSType *
;;FIXME: SInt32 *
[:function SetDebugOptionValue [:int :unsigned-int :int :unsigned-char]]
;;FIXME: void (*)(unsigned int, unsigned int, const char *, const char *, const char *, const char *, long, void *, const unsigned char *)
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void (*)(int, unsigned int, unsigned char *)
;;FIXME: void (*)(unsigned int, unsigned int, const char *, const char *, const char *, const char *, long, void *, const unsigned char *)
;;FIXME: void (*)(int, unsigned int, unsigned char *)
;;FIXME: void (*)(unsigned int, unsigned int, const char *, const char *, const char *, const char *, long, void *, const unsigned char *)
;;FIXME: Boolean *
;;FIXME: const char *
;;FIXME: const unsigned char *
;;FIXME: const unsigned char *
;;FIXME: unsigned char *
;;FIXME: unsigned char *
;;FIXME: unsigned char *
;;FIXME: unsigned char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: char *
;;FIXME: const unsigned char *
;;FIXME: char *
;;FIXME: const unsigned char *
;;FIXME: const unsigned char *
;;FIXME: UInt32 *
;;FIXME: UInt8 *
;;FIXME: UInt8 *
;;FIXME: SInt8 *
;;FIXME: SInt8 *
;;FIXME: SInt8 *
;;FIXME: UInt8 *
;;FIXME: UInt8 *
;;FIXME: UInt8 *
;;FIXME: SInt16 *
;;FIXME: SInt16 *
;;FIXME: SInt16 *
;;FIXME: UInt16 *
;;FIXME: UInt16 *
;;FIXME: UInt16 *
;;FIXME: SInt32 *
;;FIXME: SInt32 *
;;FIXME: SInt32 *
;;FIXME: UInt32 *
;;FIXME: UInt32 *
;;FIXME: UInt32 *
[:function _mm_empty [:void]]
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: void **
;;FIXME: void *
;;FIXME: void *
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __m64 *
;;FIXME: __m64 *
;;FIXME: float *
;;FIXME: float *
;;FIXME: float *
;;FIXME: float *
;;FIXME: float *
;;FIXME: float *
;;FIXME: __m64 *
;;FIXME: float *
[:function _mm_sfence [:void]]
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
[:function _mm_getcsr [:unsigned-int]]
[:function _mm_setcsr [:void :unsigned-int]]
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: double *
;;FIXME: double *
;;FIXME: double *
;;FIXME: double *
;;FIXME: double *
;;FIXME: double *
;;FIXME: double *
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __m128i *
;;FIXME: __m128i *
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __m128i *
;;FIXME: double *
;;FIXME: __m128i *
;;FIXME: int *
;;FIXME: const void *
[:function _mm_lfence [:void]]
[:function _mm_mfence [:void]]
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(1 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
;;FIXME: __attribute__((__vector_size__(2 * sizeof(long long)))) long long
;;FIXME: __attribute__((__vector_size__(4 * sizeof(float)))) float
;;FIXME: __attribute__((__vector_size__(2 * sizeof(double)))) double
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
;;FIXME: int (*)(struct ExceptionInformation *)
;;FIXME: int (*)(struct ExceptionInformation *)
;;FIXME: ExceptionInformation *
;;FIXME: int (*)(struct ExceptionInformation *)
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
;;FIXME: struct UnsignedWide
[:compound NumFormatString "sizeof (NumFormatString)"]
[:compound FVector "sizeof (FVector)"]
;;FIXME: char *
;;FIXME: char **
;;FIXME: const void *
;;FIXME: void *
;;FIXME: void *
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
;;FIXME: unsigned char (*)(unsigned int, void *, void *, const struct __CFString **, unsigned short *)
;;FIXME: unsigned char (*)(unsigned int, void *, void *, const struct __CFString **, unsigned short *)
;;FIXME: void *
;;FIXME: const UCKeyboardLayout *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: struct OpaqueCollatorRef *
;;FIXME: const UCCollationValue *
;;FIXME: struct OpaqueCollatorRef *
;;FIXME: CollatorRef *
;;FIXME: const UniChar *
;;FIXME: const UniChar *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: struct OpaqueTextBreakLocatorRef *
;;FIXME: TextBreakLocatorRef *
;;FIXME: struct OpaqueLocaleRef *
;;FIXME: struct OpaqueUCTypeSelectRef *
;;FIXME: UCTypeSelectRef *
;;FIXME: struct OpaqueUCTypeSelectRef *
;;FIXME: struct OpaqueUCTypeSelectRef *
;;FIXME: struct OpaqueUCTypeSelectRef *
;;FIXME: struct OpaqueUCTypeSelectRef *
;;FIXME: struct OpaqueUCTypeSelectRef *
[:function compound [:double :double :double]]
[:function annuity [:double :double :double]]
;;FIXME: double_t *
[:function relation [:short :double :double]]
[:compound decimal "sizeof (decimal)"]
[:compound decform "sizeof (decform)"]
;;FIXME: const decform *
;;FIXME: const decimal *
;;FIXME: const decform *
;;FIXME: const char *
;;FIXME: const decimal *
;;FIXME: const decimal *
;;FIXME: const decimal *
;;FIXME: long double
;;FIXME: const decform *
;;FIXME: long double
;;FIXME: const extended80 *
;;FIXME: const double *
;;FIXME: const extended80 *
;;FIXME: const long double *
[:compound fenv_t "sizeof (fenv_t)"]
[:function feclearexcept [:int :int]]
;;FIXME: fexcept_t *
[:function feraiseexcept [:int :int]]
;;FIXME: const fexcept_t *
[:function fetestexcept [:int :int]]
[:function fegetround [:int]]
[:function fesetround [:int :int]]
;;FIXME: fenv_t *
;;FIXME: fenv_t *
;;FIXME: const fenv_t *
;;FIXME: const fenv_t *
[:compound TECConversionInfo "sizeof (TECConversionInfo)"]
;;FIXME: ItemCount *
;;FIXME: TextEncoding []
;;FIXME: ItemCount *
;;FIXME: TECConversionInfo []
;;FIXME: ItemCount *
;;FIXME: TextEncoding []
;;FIXME: unsigned char [256]
;;FIXME: TextEncoding *
;;FIXME: TECObjectRef *
;;FIXME: TECObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: ItemCount *
;;FIXME: TextEncoding []
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: TECObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: ItemCount *
;;FIXME: TextEncoding []
;;FIXME: ItemCount *
;;FIXME: TextEncoding []
;;FIXME: ItemCount *
;;FIXME: TextEncoding []
;;FIXME: TECSnifferObjectRef *
;;FIXME: struct OpaqueTECSnifferObjectRef *
;;FIXME: struct OpaqueTECSnifferObjectRef *
;;FIXME: struct OpaqueTECSnifferObjectRef *
;;FIXME: struct OpaqueTECObjectRef *
;;FIXME: CFStringRef *
;;FIXME: TextEncoding *
[:compound UnicodeMapping "sizeof (UnicodeMapping)"]
;;FIXME: int (*)(unsigned short *, unsigned long, unsigned long *, unsigned char *, unsigned long, unsigned long *, void *, const struct UnicodeMapping *)
;;FIXME: int (*)(unsigned short *, unsigned long, unsigned long *, unsigned char *, unsigned long, unsigned long *, void *, const struct UnicodeMapping *)
;;FIXME: UniChar *
;;FIXME: const struct UnicodeMapping *
;;FIXME: TextToUnicodeInfo *
;;FIXME: const struct UnicodeMapping *
;;FIXME: UnicodeToTextInfo *
;;FIXME: const UnicodeMapping []
;;FIXME: const TextEncoding []
;;FIXME: const ScriptCode []
;;FIXME: struct OpaqueTextToUnicodeInfo *
;;FIXME: struct OpaqueUnicodeToTextInfo *
;;FIXME: TextToUnicodeInfo *
;;FIXME: UnicodeToTextInfo *
;;FIXME: UnicodeToTextRunInfo *
;;FIXME: struct OpaqueTextToUnicodeInfo *
;;FIXME: struct OpaqueUnicodeToTextInfo *
;;FIXME: struct OpaqueUnicodeToTextRunInfo *
;;FIXME: struct OpaqueUnicodeToTextRunInfo *
;;FIXME: struct OpaqueTextToUnicodeInfo *const
;;FIXME: struct OpaqueUnicodeToTextInfo *const
;;FIXME: struct OpaqueTextToUnicodeInfo *
;;FIXME: struct OpaqueUnicodeToTextInfo *
;;FIXME: const struct UnicodeMapping *
;;FIXME: const struct UnicodeMapping *
;;FIXME: struct OpaqueUnicodeToTextInfo *
;;FIXME: struct OpaqueUnicodeToTextRunInfo *
;;FIXME: struct OpaqueTextToUnicodeInfo *
;;FIXME: struct OpaqueUnicodeToTextInfo *
;;FIXME: struct OpaqueUnicodeToTextRunInfo *
[:compound SchedulerInfoRec "sizeof (SchedulerInfoRec)"]
;;FIXME: void *(*)(void *)
;;FIXME: unsigned long (*)(struct SchedulerInfoRec *)
;;FIXME: void (*)(unsigned long, void *)
;;FIXME: void (*)(unsigned long, void *)
;;FIXME: void (*)(unsigned long)
;;FIXME: void (*)(unsigned long)
;;FIXME: unsigned long (*)(struct SchedulerInfoRec *)
;;FIXME: void *(*)(void *)
;;FIXME: unsigned long (*)(struct SchedulerInfoRec *)
;;FIXME: void (*)(unsigned long, void *)
;;FIXME: void (*)(unsigned long, void *)
;;FIXME: void (*)(unsigned long)
;;FIXME: void (*)(unsigned long)
;;FIXME: unsigned long (*)(struct SchedulerInfoRec *)
;;FIXME: void *
;;FIXME: struct SchedulerInfoRec *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void (*)(unsigned long)
;;FIXME: void (*)(unsigned long)
;;FIXME: struct SchedulerInfoRec *
;;FIXME: void *(*)(void *)
;;FIXME: unsigned long (*)(struct SchedulerInfoRec *)
;;FIXME: void (*)(unsigned long, void *)
;;FIXME: void (*)(unsigned long, void *)
;;FIXME: void (*)(unsigned long)
[:function CreateThreadPool [:short :unsigned-int :short :long]]
;;FIXME: Size *
;;FIXME: ByteCount *
;;FIXME: void *
[:function YieldToThread [:short :unsigned-long]]
[:function YieldToAnyThread [:short]]
;;FIXME: ThreadID *
;;FIXME: ThreadState *
[:function SetThreadState [:short :unsigned-long :unsigned-short :unsigned-long]]
[:function SetThreadStateEndCritical [:short :unsigned-long :unsigned-short :unsigned-long]]
[:function ThreadBeginCritical [:short]]
[:function ThreadEndCritical [:short]]
;;FIXME: ThreadTaskRef *
;;FIXME: void *
;;FIXME: void *
;;FIXME: FSVolumeRefNum *
[:function ReleaseFolder [:short :short :unsigned-int]]
;;FIXME: FSRef *
[:compound FolderDesc "sizeof (FolderDesc)"]
[:compound FolderRouting "sizeof (FolderRouting)"]
;;FIXME: const unsigned char *
;;FIXME: UInt32 *
[:function RemoveFolderDescriptor [:short :unsigned-int]]
;;FIXME: FSVolumeRefNum *
[:function InvalidateFolderDescriptorCache [:short :short :int]]
;;FIXME: FolderType *
;;FIXME: const FSRef *
;;FIXME: const UInt8 *
;;FIXME: int (*)(unsigned int, void *, void *)
;;FIXME: int (*)(unsigned int, void *, void *)
;;FIXME: void *
;;FIXME: UnsignedWide *
[:compound TMTask "sizeof (TMTask)"]
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: struct QElem *
;;FIXME: void (*)(struct TMTask *)
;;FIXME: void (*)(struct TMTask *)
;;FIXME: struct TMTask *
;;FIXME: struct OpaqueMPCoherenceID *
;;FIXME: struct OpaqueMPProcessID *
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
;;FIXME: char *
;;FIXME: char *
[:function LMSetSysFontFam [:void :short]]
[:function LMGetSysFontSize [:short]]
[:function LMSetSysFontSize [:void :short]]
[:compound AVLTreeStruct "sizeof (AVLTreeStruct)"]
;;FIXME: int (*)(struct AVLTreeStruct *, const void *, const void *, unsigned short)
;;FIXME: unsigned long (*)(struct AVLTreeStruct *, const void *)
;;FIXME: void (*)(struct AVLTreeStruct *, const void *)
;;FIXME: short (*)(struct AVLTreeStruct *, const void *, unsigned short, unsigned short, unsigned int, int, void *)
;;FIXME: int (*)(struct AVLTreeStruct *, const void *, const void *, unsigned short)
;;FIXME: unsigned long (*)(struct AVLTreeStruct *, const void *)
;;FIXME: void (*)(struct AVLTreeStruct *, const void *)
;;FIXME: short (*)(struct AVLTreeStruct *, const void *, unsigned short, unsigned short, unsigned int, int, void *)
;;FIXME: struct AVLTreeStruct *
;;FIXME: struct AVLTreeStruct *
;;FIXME: struct AVLTreeStruct *
;;FIXME: struct AVLTreeStruct *
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
;;FIXME: unsigned char [16]
;;FIXME: unsigned char const[16]
;;FIXME: unsigned char [16]
;;FIXME: unsigned char [16]
;;FIXME: unsigned char [16]
;;FIXME: unsigned char [16]
;;FIXME: unsigned char const[16]
;;FIXME: char const[37]
;;FIXME: unsigned char const[16]
;;FIXME: unsigned char const[16]
;;FIXME: unsigned char const[16]
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
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: const struct __FSEventStream *
;;FIXME: const struct __FSEventStream *
;;FIXME: const struct __CFArray *
[:function FSEventsGetCurrentEventId [:unsigned-long-long]]
;;FIXME: const struct __CFUUID *
[:function FSEventsGetLastEventIdForDeviceBeforeTime [:unsigned-long-long :int :double]]
[:function FSEventsPurgeEventsForDeviceUpToEventId [:unsigned-char :int :unsigned-long-long]]
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: struct __FSEventStream *
;;FIXME: const struct __FSEventStream *
;;FIXME: const struct __CFString *
[:compound AEDesc "sizeof (AEDesc)"]
[:compound AEKeyDesc "sizeof (AEKeyDesc)"]
[:compound AEArrayData "sizeof (AEArrayData)"]
;;FIXME: short (*)(const struct AEDesc *, unsigned int, void *, struct AEDesc *)
;;FIXME: short (*)(unsigned int, const void *, long, unsigned int, void *, struct AEDesc *)
;;FIXME: short (*)(const struct AEDesc *, unsigned int, void *, struct AEDesc *)
;;FIXME: short (*)(unsigned int, const void *, long, unsigned int, void *, struct AEDesc *)
;;FIXME: const AEDesc *
;;FIXME: const void *
;;FIXME: short (*)(const struct AEDesc *, unsigned int, void *, struct AEDesc *)
;;FIXME: short (*)(const struct AEDesc *, unsigned int, void *, struct AEDesc *)
;;FIXME: AECoercionHandlerUPP *
;;FIXME: const void *
;;FIXME: const AEDesc *
;;FIXME: AEDesc *
;;FIXME: const void *
;;FIXME: AEDesc *
;;FIXME: const AEDesc *
;;FIXME: const void *
;;FIXME: const AEDesc *
;;FIXME: const void *
;;FIXME: const AEDescList *
;;FIXME: AEDescList *
;;FIXME: AEDescList *
;;FIXME: const AEDescList *
;;FIXME: const AEDescList *
;;FIXME: const AEDescList *
;;FIXME: const AEDescList *
;;FIXME: AEDescList *
;;FIXME: AEDescList *
;;FIXME: const AEDesc *
;;FIXME: const AEAddressDesc *
;;FIXME: AppleEvent *
;;FIXME: AppleEvent *
;;FIXME: const AppleEvent *
;;FIXME: const AppleEvent *
;;FIXME: const AppleEvent *
;;FIXME: AppleEvent *
;;FIXME: const AppleEvent *
;;FIXME: const AppleEvent *
;;FIXME: const AppleEvent *
;;FIXME: AppleEvent *
;;FIXME: AppleEvent *
;;FIXME: const AEDesc *
;;FIXME: const AEDesc *
;;FIXME: const void *
;;FIXME: const AEDesc *
;;FIXME: const AEDesc *
;;FIXME: const void *
;;FIXME: const AEDesc *
;;FIXME: void (*)(const void *, long, void *)
;;FIXME: short (*)(const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: void (*)(const void *, long, void *)
;;FIXME: short (*)(const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: const void *
;;FIXME: const AppleEvent *
;;FIXME: short (*)(const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: short (*)(const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: AEEventHandlerUPP *
;;FIXME: short (*)(const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: short (*)(const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: AEEventHandlerUPP *
;;FIXME: long *
[:compound AERemoteProcessResolverContext "sizeof (AERemoteProcessResolverContext)"]
;;FIXME: struct AERemoteProcessResolver *
;;FIXME: struct AERemoteProcessResolver *
;;FIXME: const struct __CFArray *
;;FIXME: struct AERemoteProcessResolver *
;;FIXME: AEDesc *
;;FIXME: AEDesc *
;;FIXME: AEDescList *
;;FIXME: AEDesc *
;;FIXME: AEDesc *
[:compound ccntTokenRecord "sizeof (ccntTokenRecord)"]
;;FIXME: short (*)(unsigned int, const struct AEDesc *, unsigned int, unsigned int, const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: short (*)(unsigned int, const struct AEDesc *, const struct AEDesc *, unsigned char *)
;;FIXME: short (*)(unsigned int, unsigned int, const struct AEDesc *, long *)
;;FIXME: short (*)(struct AEDesc *)
;;FIXME: short (*)(const struct AEDesc *, unsigned int, struct AEDesc *)
;;FIXME: short (*)(struct AEDesc **)
;;FIXME: short (*)(const struct AEDesc *, const struct AEDesc *, long)
;;FIXME: short (*)(long, long, const struct AEDesc *)
;;FIXME: short (*)(unsigned int, const struct AEDesc *, unsigned int, unsigned int, const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: short (*)(unsigned int, const struct AEDesc *, const struct AEDesc *, unsigned char *)
;;FIXME: short (*)(unsigned int, unsigned int, const struct AEDesc *, long *)
;;FIXME: short (*)(struct AEDesc *)
;;FIXME: short (*)(const struct AEDesc *, unsigned int, struct AEDesc *)
;;FIXME: short (*)(struct AEDesc **)
;;FIXME: short (*)(const struct AEDesc *, const struct AEDesc *, long)
;;FIXME: short (*)(long, long, const struct AEDesc *)
;;FIXME: const AEDesc *
;;FIXME: const AEDesc *
;;FIXME: const AEDesc *
;;FIXME: AEDesc *
;;FIXME: const AEDesc *
;;FIXME: AEDesc **
;;FIXME: const AEDesc *
;;FIXME: const AEDesc *
[:function AEObjectInit [:short]]
;;FIXME: short (*)(unsigned int, const struct AEDesc *, const struct AEDesc *, unsigned char *)
;;FIXME: const AEDesc *
;;FIXME: short (*)(unsigned int, const struct AEDesc *, unsigned int, unsigned int, const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: short (*)(unsigned int, const struct AEDesc *, unsigned int, unsigned int, const struct AEDesc *, struct AEDesc *, void *)
;;FIXME: OSLAccessorUPP *
;;FIXME: AEDesc *
;;FIXME: const AEDesc *
[:compound TextRange "sizeof (TextRange)"]
[:compound TextRangeArray "sizeof (TextRangeArray)"]
[:compound OffsetArray "sizeof (OffsetArray)"]
[:compound WritingCode "sizeof (WritingCode)"]
[:compound IntlText "sizeof (IntlText)"]
[:compound TScriptingSizeResource "sizeof (TScriptingSizeResource)"]
[:compound AEBuildError "sizeof (AEBuildError)"]
;;FIXME: AEDesc *
;;FIXME: AEDesc *
;;FIXME: AppleEvent *
;;FIXME: AppleEvent *
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: const AEDesc *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
;;FIXME: struct OpaqueAEStreamRef *
[:function AEGetRegisteredMachPort [:unsigned-int]]
;;FIXME: mach_msg_header_t *
;;FIXME: mach_msg_header_t *
;;FIXME: const AppleEvent *
[:function CSIdentityAuthorityGetTypeID [:unsigned-long]]
;;FIXME: struct __CSIdentityAuthority *
;;FIXME: struct __CSIdentityAuthority *
;;FIXME: struct __CSIdentityAuthority *
;;FIXME: const struct __CFString *
[:function CSIdentityGetTypeID [:unsigned-long]]
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentityAuthority *
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFString *
;;FIXME: struct __CSIdentity *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: const struct __CFData *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct OpaqueSecCertificateRef *
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
[:compound CSIdentityClientContext "sizeof (CSIdentityClientContext)"]
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
;;FIXME: struct __CSIdentity *
[:function CSIdentityQueryGetTypeID [:unsigned-long]]
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentityQuery *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CSIdentityQuery *
[:compound CSIdentityQueryClientContext "sizeof (CSIdentityQueryClientContext)"]
;;FIXME: struct __CSIdentityQuery *
;;FIXME: struct __CSIdentityQuery *
[:compound IconFamilyElement "sizeof (IconFamilyElement)"]
[:compound IconFamilyResource "sizeof (IconFamilyResource)"]
[:compound SleepQRec "sizeof (SleepQRec)"]
;;FIXME: long (*)(long, struct SleepQRec *)
;;FIXME: long (*)(long, struct SleepQRec *)
;;FIXME: struct SleepQRec *
[:function GetCPUSpeed [:long]]
;;FIXME: struct SleepQRec *
;;FIXME: struct SleepQRec *
[:function MaximumProcessorSpeed [:short]]
[:function MinimumProcessorSpeed [:short]]
[:function CurrentProcessorSpeed [:short]]
[:function BatteryCount [:short]]
[:function UpdateSystemActivity [:short :unsigned-char]]
[:compound KCCallbackInfo "sizeof (KCCallbackInfo)"]
;;FIXME: UInt32 *
[:function KCSetInteractionAllowed [:int :unsigned-char]]
[:function KCIsInteractionAllowed [:unsigned-char]]
;;FIXME: FSRef *
;;FIXME: struct AliasRecord **
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: KCRef *
;;FIXME: KCRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainRef *
[:function KCCountKeychains [:unsigned-short]]
;;FIXME: KCRef *
;;FIXME: int (*)(unsigned short, struct KCCallbackInfo *, void *)
;;FIXME: int (*)(unsigned short, struct KCCallbackInfo *, void *)
;;FIXME: KCCallbackInfo *
;;FIXME: AFPServerSignature *
;;FIXME: const unsigned char *
;;FIXME: const unsigned char *
;;FIXME: const unsigned char *
;;FIXME: int (*)(unsigned short, struct KCCallbackInfo *, void *)
;;FIXME: int (*)(unsigned short, struct KCCallbackInfo *, void *)
;;FIXME: const void *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: KCItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainSearchRef *
;;FIXME: KCSearchRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainItemRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: struct OpaqueSecKeychainRef *
;;FIXME: AFPServerSignature *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: int (*)(unsigned int, void *)
;;FIXME: int (*)(unsigned int, void *)
;;FIXME: void *
[:function AlertSoundPlay [:void]]
[:function AlertSoundPlayCustomSound [:void :unsigned-int]]
[:function SystemSoundPlay [:void :unsigned-int]]
;;FIXME: const FSRef *
[:function SystemSoundRemoveActionID [:int :unsigned-int]]
;;FIXME: struct __CFRunLoop *
[:function SystemSoundRemoveCompletionRoutine [:void :unsigned-int]]
[:compound WSClientContext "sizeof (WSClientContext)"]
[:function WSMethodInvocationGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct OpaqueWSMethodInvocationRef *
;;FIXME: struct OpaqueWSMethodInvocationRef *
[:function WSProtocolHandlerGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueWSProtocolHandlerRef *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const void *
;;FIXME: struct OpaqueWSProtocolHandlerRef *
;;FIXME: struct OpaqueWSProtocolHandlerRef *
;;FIXME: struct OpaqueWSProtocolHandlerRef *
[:compound CFHostClientContext "sizeof (CFHostClientContext)"]
[:function CFHostGetTypeID [:unsigned-long]]
;;FIXME: struct __CFHost *
;;FIXME: struct __CFHost *
;;FIXME: struct __CFHost *
;;FIXME: struct __CFHost *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFHost *
;;FIXME: struct __CFHost *
;;FIXME: struct __CFHost *
;;FIXME: struct __CFHost *
[:compound CFNetServiceClientContext "sizeof (CFNetServiceClientContext)"]
[:function CFNetServiceGetTypeID [:unsigned-long]]
[:function CFNetServiceMonitorGetTypeID [:unsigned-long]]
[:function CFNetServiceBrowserGetTypeID [:unsigned-long]]
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetService *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetService *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFNetService *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFNetService *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetServiceMonitor *
;;FIXME: struct __CFNetServiceMonitor *
;;FIXME: struct __CFNetServiceMonitor *
;;FIXME: struct __CFNetServiceMonitor *
;;FIXME: struct __CFNetServiceMonitor *
;;FIXME: struct __CFNetServiceMonitor *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetServiceBrowser *
;;FIXME: struct __CFNetService *
;;FIXME: struct __CFNetService *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFNetService *
;;FIXME: const CFStreamError *
;;FIXME: const CFStreamError *
;;FIXME: const struct __CFAllocator *
;;FIXME: const struct __CFAllocator *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFReadStream *
;;FIXME: const struct __CFAllocator *
;;FIXME: struct __CFWriteStream *
[:function CFHTTPMessageGetTypeID [:unsigned-long]]
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFData *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: const struct __CFString *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFReadStream *
;;FIXME: struct __CFReadStream *
[:function CFHTTPAuthenticationGetTypeID [:unsigned-long]]
;;FIXME: struct _CFHTTPAuthentication *
;;FIXME: struct _CFHTTPAuthentication *
;;FIXME: struct _CFHTTPAuthentication *
;;FIXME: struct _CFHTTPAuthentication *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: struct __CFHTTPMessage *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: struct _CFHTTPAuthentication *
;;FIXME: struct _CFHTTPAuthentication *
;;FIXME: struct __CFNetDiagnostic *
;;FIXME: struct __CFNetDiagnostic *
;;FIXME: struct __CFNetDiagnostic *
;;FIXME: struct __CFNetDiagnostic *
;;FIXME: struct __CFNetDiagnostic *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: IconRef *
;;FIXME: IconRef *
;;FIXME: const FSRef *
;;FIXME: const struct __CFString *
;;FIXME: const IconFamilyResource *
;;FIXME: struct ComponentRecord *
;;FIXME: struct IconFamilyResource **
;;FIXME: const FSRef *
[:function UnregisterIconRef [:short :unsigned-int :unsigned-int]]
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
[:function SetCustomIconsEnabled [:short :short :unsigned-char]]
;;FIXME: Boolean *
;;FIXME: const FSRef *
[:compound LSItemInfoRecord "sizeof (LSItemInfoRecord)"]
[:function LSInit [:int :unsigned-int]]
[:function LSTerm [:int]]
;;FIXME: const FSRef *
;;FIXME: const struct __CFURL *
;;FIXME: const UniChar []
;;FIXME: const FSRef *
;;FIXME: const struct __CFURL *
;;FIXME: const FSRef *
;;FIXME: const struct __CFURL *
;;FIXME: const FSRef *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const FSRef *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const FSRef *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: const FSRef *
;;FIXME: const struct __CFArray *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const FSRef *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
[:compound LSLaunchFSRefSpec "sizeof (LSLaunchFSRefSpec)"]
[:compound LSLaunchURLSpec "sizeof (LSLaunchURLSpec)"]
;;FIXME: const FSRef *
;;FIXME: const struct __CFURL *
;;FIXME: const LSLaunchFSRefSpec *
;;FIXME: const LSLaunchURLSpec *
[:compound LSApplicationParameters "sizeof (LSApplicationParameters)"]
;;FIXME: const LSApplicationParameters *
;;FIXME: const FSRef *
;;FIXME: const struct __CFArray *
[:function LSSharedFileListGetTypeID [:unsigned-long]]
[:function LSSharedFileListItemGetTypeID [:unsigned-long]]
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: const void *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: const struct __CFArray *
;;FIXME: struct OpaqueLSSharedFileListItemRef *
;;FIXME: struct OpaqueLSSharedFileListItemRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListRef *
;;FIXME: struct OpaqueLSSharedFileListItemRef *
;;FIXME: struct OpaqueIconRef *
;;FIXME: const struct __CFString *
;;FIXME: struct OpaqueLSSharedFileListItemRef *
;;FIXME: const void *
;;FIXME: struct OpaqueLSSharedFileListItemRef *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
[:function SKDocumentGetTypeID [:unsigned-long]]
;;FIXME: const void *
;;FIXME: const struct __CFURL *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const void *
[:function SKIndexGetTypeID [:unsigned-long]]
[:function SKIndexDocumentIteratorGetTypeID [:unsigned-long]]
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: enum SKIndexType
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct __SKIndex *
;;FIXME: enum SKDocumentIndexState
;;FIXME: struct __SKIndex *
;;FIXME: const void *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndexDocumentIterator *
;;FIXME: const void *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: const struct __CFArray *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: struct __SKIndex *
[:function SKLoadDefaultExtractorPlugIns [:void]]
[:function SKSearchGetTypeID [:unsigned-long]]
;;FIXME: struct __SKSearch *
;;FIXME: struct __SKSearch *
;;FIXME: struct __SKSearch *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
;;FIXME: struct __SKIndex *
[:function SKSearchGroupGetTypeID [:unsigned-long]]
[:function SKSearchResultsGetTypeID [:unsigned-long]]
;;FIXME: struct __SKSearchGroup *
;;FIXME: const struct __CFArray *
;;FIXME: struct __SKSearchResults *
;;FIXME: struct __SKSearchResults *
;;FIXME: struct __SKSearchResults *
;;FIXME: struct __SKSearchResults *
;;FIXME: const struct __CFArray *
[:function SKSummaryGetTypeID [:unsigned-long]]
;;FIXME: struct __SKSummary *
;;FIXME: struct __SKSummary *
;;FIXME: struct __SKSummary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct __SKSummary *
;;FIXME: struct __SKSummary *
[:function MDItemGetTypeID [:unsigned-long]]
;;FIXME: struct __MDItem *
;;FIXME: struct __MDItem *
;;FIXME: const struct __CFArray *
;;FIXME: const void *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFDictionary *
[:function MDQueryGetTypeID [:unsigned-long]]
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
[:compound MDQueryBatchingParams "sizeof (MDQueryBatchingParams)"]
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: const void *
;;FIXME: struct __MDQuery *
;;FIXME: void *
;;FIXME: const struct __CFArray *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
;;FIXME: struct __MDQuery *
[:function MDLabelGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFArray *
;;FIXME: struct __MDItem *
;;FIXME: struct __MDItem *
;;FIXME: struct __MDLabel *
;;FIXME: const void *
;;FIXME: const struct __CFString *
;;FIXME: struct __MDLabel *
;;FIXME: struct __MDLabel *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct __MDLabel *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __DCSDictionary *
;;FIXME: const struct __CFString *
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
;;FIXME: struct _NSRange *
[:selector [2 :replaceCharactersInRange :withString] [:void Foundation/NSRange :id]]
[:selector [2 :setAttributes :range] [:void :id Foundation/NSRange]]
[:selector [1 :stringFromByteCount] [:id :long-long]]
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
[:selector [1 :predicateWithFormat] [:id :id]]
;;FIXME: struct __va_list_tag [1]
[:selector [1 :predicateWithValue] [:id Boolean]]
;;FIXME: BOOL (^)(id, NSDictionary *)
[:selector [0 :predicateFormat] [:id]]
[:selector [1 :predicateWithSubstitutionVariables] [:id :id]]
[:selector [1 :evaluateWithObject] [Boolean :id]]
[:selector [2 :evaluateWithObject :substitutionVariables] [Boolean :id :id]]
[:selector [3 :predicateWithLeftExpression :rightExpression :customSelector] [:id :id :id :selector]]
[:selector [3 :initWithLeftExpression :rightExpression :customSelector] [:id :id :id :selector]]
;;FIXME: enum NSPredicateOperatorType
;;FIXME: enum NSComparisonPredicateModifier
[:selector [0 :leftExpression] [:id]]
[:selector [0 :rightExpression] [:id]]
[:selector [0 :customSelector] [:selector]]
;;FIXME: enum NSComparisonPredicateOptions
;;FIXME: enum NSCompoundPredicateType
[:selector [0 :subpredicates] [:id]]
[:selector [1 :andPredicateWithSubpredicates] [:id :id]]
[:selector [1 :orPredicateWithSubpredicates] [:id :id]]
[:selector [1 :notPredicateWithSubpredicate] [:id :id]]
[:selector [2 :expressionWithFormat :argumentArray] [:id :id :id]]
[:selector [1 :expressionWithFormat] [:id :id]]
;;FIXME: struct __va_list_tag [1]
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
;;FIXME: id (^)(id, NSArray *, NSMutableDictionary *)
;;FIXME: enum NSExpressionType
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
;;FIXME: id (^)(id, NSArray *, NSMutableDictionary *)
[:selector [2 :expressionValueWithObject :context] [:id :id :id]]
[:selector [1 :addFilePresenter] [:void :id]]
[:selector [1 :removeFilePresenter] [:void :id]]
[:selector [0 :filePresenters] [:id]]
[:selector [1 :initWithFilePresenter] [:id :id]]
[:selector [2 :itemAtURL :willMoveToURL] [:void :id :id]]
[:selector [2 :itemAtURL :didMoveToURL] [:void :id :id]]
[:selector [0 :cancel] [:void]]
[:selector [1 :currentVersionOfItemAtURL] [:id :id]]
[:selector [1 :otherVersionsOfItemAtURL] [:id :id]]
[:selector [1 :unresolvedConflictVersionsOfItemAtURL] [:id :id]]
[:selector [2 :versionOfItemAtURL :forPersistentIdentifier] [:id :id :id]]
[:selector [1 :temporaryDirectoryURLForNewVersionOfItemAtURL] [:id :id]]
;;FIXME: NSError **
;;FIXME: NSError **
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
;;FIXME: struct _NSRange *
[:selector [2 :stringEditedInRange :changeInLength] [:void Foundation/NSRange :long]]
[:selector [1 :sentenceRangeForRange] [Foundation/NSRange Foundation/NSRange]]
;;FIXME: struct _NSRange *
;;FIXME: struct _NSRange *
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
[:selector [0 :resolve] [:void]]
[:selector [0 :stop] [:void]]
[:selector [1 :dictionaryFromTXTRecordData] [:id :id]]
[:selector [1 :dataFromTXTRecordDictionary] [:id :id]]
[:selector [0 :hostName] [:id]]
[:selector [1 :resolveWithTimeout] [:void :double]]
;;FIXME: NSInputStream **
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
;;FIXME: unsigned char const[16]
;;FIXME: unsigned char [16]
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
;;FIXME: NSZone *
;;FIXME: NSZone *
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
;;FIXME: NSInteger *
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
;;FIXME: enum NSTaskTerminationReason
;;FIXME: void (^)(NSTask *)
;;FIXME: void (^)(NSTask *)
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
;;FIXME: enum NSXMLNodeKind
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
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
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
;;FIXME: enum NSXMLDTDNodeKind
[:selector [0 :isExternal] [Boolean]]
[:selector [1 :setPublicID] [:void :id]]
[:selector [0 :publicID] [:id]]
[:selector [1 :setSystemID] [:void :id]]
[:selector [0 :systemID] [:id]]
[:selector [1 :setNotationName] [:void :id]]
[:selector [0 :notationName] [:id]]
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
[:selector [1 :initWithRootElement] [:id :id]]
[:selector [1 :replacementClassForClass] [:id :id]]
[:selector [1 :setCharacterEncoding] [:void :id]]
[:selector [0 :characterEncoding] [:id]]
[:selector [1 :setVersion] [:void :id]]
[:selector [0 :version] [:id]]
[:selector [1 :setStandalone] [:void Boolean]]
[:selector [0 :isStandalone] [Boolean]]
;;FIXME: enum NSXMLDocumentContentKind
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
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
;;FIXME: NSError **
[:selector [1 :initWithName] [:id :id]]
[:selector [2 :initWithName :URI] [:id :id :id]]
[:selector [2 :initWithName :stringValue] [:id :id :id]]
;;FIXME: NSError **
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
;;FIXME: struct CGPoint
;;FIXME: struct CGSize
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
;;FIXME: int (*)(short, void *)
;;FIXME: int (*)(unsigned int, void *)
;;FIXME: int (*)(short, void *)
;;FIXME: int (*)(unsigned int, void *)
;;FIXME: void *
;;FIXME: void *
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
;;FIXME: int (*)(unsigned int, struct ATSGlyphVector *, void *, void *, unsigned int *)
;;FIXME: int (*)(unsigned int, struct ATSGlyphVector *, void *, void *, unsigned int *)
;;FIXME: struct ATSGlyphVector *
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
;;FIXME: const FSRef *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const FSRef *
;;FIXME: ATSFontContainerRef *
[:function ATSFontSetEnabled [:int :unsigned-int :unsigned-int :unsigned-char]]
[:function ATSFontIsEnabled [:unsigned-char :unsigned-int]]
;;FIXME: int (*)(unsigned int, void *)
;;FIXME: const ATSFontFilter *
;;FIXME: ATSFontFamilyIterator *
;;FIXME: const ATSFontFilter *
;;FIXME: struct ATSFontFamilyIterator_ *
;;FIXME: const struct __CFString *
[:function ATSFontFamilyGetGeneration [:unsigned-int :unsigned-int]]
;;FIXME: CFStringRef *
[:function ATSFontFamilyGetEncoding [:unsigned-int :unsigned-int]]
;;FIXME: int (*)(unsigned int, void *)
;;FIXME: const ATSFontFilter *
;;FIXME: ATSFontIterator *
;;FIXME: const ATSFontFilter *
;;FIXME: struct ATSFontIterator_ *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: ATSFontRef []
[:function ATSFontGetGeneration [:unsigned-int :unsigned-int]]
;;FIXME: CFStringRef *
;;FIXME: CFStringRef *
;;FIXME: void *
;;FIXME: void *
;;FIXME: ATSFontMetrics *
;;FIXME: ATSFontMetrics *
;;FIXME: const unsigned char *
;;FIXME: unsigned char [256]
;;FIXME: FSRef *
;;FIXME: void *
;;FIXME: void (*)(struct ATSFontNotificationInfoRef_ *, void *)
;;FIXME: struct ATSFontNotificationRef_ *
[:compound ATSFontQuerySourceContext "sizeof (ATSFontQuerySourceContext)"]
;;FIXME: struct __CFRunLoopSource *
[:function ATSFontSetGlobalAutoActivationSetting [:int :unsigned-int]]
[:function ATSFontGetGlobalAutoActivationSetting [:unsigned-int]]
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
[:compound CGDataProviderSequentialCallbacks "sizeof (CGDataProviderSequentialCallbacks)"]
[:compound CGDataProviderDirectCallbacks "sizeof (CGDataProviderDirectCallbacks)"]
[:function CGDataProviderGetTypeID [:unsigned-long]]
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: struct CGDataProvider *
;;FIXME: const struct __CFData *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: const struct __CFString *
[:function CGColorSpaceGetTypeID [:unsigned-long]]
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGColorSpace *
;;FIXME: const struct __CFData *
[:compound CGPatternCallbacks "sizeof (CGPatternCallbacks)"]
[:function CGPatternGetTypeID [:unsigned-long]]
;;FIXME: struct CGPattern *
;;FIXME: struct CGPattern *
;;FIXME: struct CGPattern *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: struct CGColor *
;;FIXME: const CGFloat *
;;FIXME: struct CGColor *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGPattern *
[:function CGColorGetTypeID [:unsigned-long]]
[:function CGFontGetTypeID [:unsigned-long]]
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFDictionary *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: const struct __CFString *
;;FIXME: struct CGFont *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFData *
[:function CGGradientGetTypeID [:unsigned-long]]
;;FIXME: struct CGGradient *
;;FIXME: struct CGGradient *
;;FIXME: struct CGGradient *
;;FIXME: struct CGGradient *
[:function CGImageGetTypeID [:unsigned-long]]
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGDataProvider *
;;FIXME: const CGFloat *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
[:function CGPathGetTypeID [:unsigned-long]]
;;FIXME: struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
;;FIXME: const struct CGPath *
[:compound CGPathElement "sizeof (CGPathElement)"]
;;FIXME: const struct CGPath *
;;FIXME: union CGPDFObject *
;;FIXME: struct CGPDFDictionary *
;;FIXME: const struct __CFData *
;;FIXME: struct CGPDFString *
;;FIXME: const unsigned char *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDate *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFArray *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFDictionary *
[:function CGPDFPageGetTypeID [:unsigned-long]]
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFPage *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFDictionary *
;;FIXME: struct CGPDFArray *
[:function CGPDFDocumentGetTypeID [:unsigned-long]]
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
;;FIXME: struct CGPDFDocument *
[:compound CGFunctionCallbacks "sizeof (CGFunctionCallbacks)"]
[:function CGFunctionGetTypeID [:unsigned-long]]
;;FIXME: struct CGFunction *
;;FIXME: struct CGFunction *
;;FIXME: struct CGFunction *
[:function CGShadingGetTypeID [:unsigned-long]]
;;FIXME: struct CGShading *
;;FIXME: struct CGShading *
;;FIXME: struct CGShading *
;;FIXME: struct CGShading *
[:function CGContextGetTypeID [:unsigned-long]]
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: const struct CGPath *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: void *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGColorSpace *
;;FIXME: struct CGContext *
;;FIXME: struct CGImage *
[:compound CGDataConsumerCallbacks "sizeof (CGDataConsumerCallbacks)"]
[:function CGDataConsumerGetTypeID [:unsigned-long]]
;;FIXME: struct CGDataConsumer *
;;FIXME: struct CGDataConsumer *
;;FIXME: struct CGDataConsumer *
;;FIXME: struct CGDataConsumer *
;;FIXME: struct CGDataConsumer *
;;FIXME: struct CGLayer *
;;FIXME: struct CGLayer *
;;FIXME: struct CGLayer *
;;FIXME: struct CGLayer *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
[:function CGLayerGetTypeID [:unsigned-long]]
;;FIXME: struct CGPDFContentStream *
;;FIXME: struct CGPDFContentStream *
;;FIXME: struct CGPDFContentStream *
;;FIXME: struct CGPDFContentStream *
;;FIXME: const struct __CFArray *
;;FIXME: union CGPDFObject *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFContentStream *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFScanner *
;;FIXME: struct CGPDFOperatorTable *
;;FIXME: struct CGPDFOperatorTable *
;;FIXME: struct CGPDFOperatorTable *
;;FIXME: struct CGPDFOperatorTable *
[:function CGMainDisplayID [:unsigned-int]]
;;FIXME: CGDirectDisplayID *
;;FIXME: CGDirectDisplayID *
;;FIXME: CGDirectDisplayID *
;;FIXME: CGDirectDisplayID *
;;FIXME: CGDirectDisplayID *
[:function CGDisplayIDToOpenGLDisplayMask [:unsigned-int :unsigned-int]]
[:function CGOpenGLDisplayMaskToDisplayID [:unsigned-int :unsigned-int]]
[:function CGDisplayBounds [Foundation/CGRect :unsigned-int]]
[:function CGDisplayPixelsWide [:unsigned-long :unsigned-int]]
[:function CGDisplayPixelsHigh [:unsigned-long :unsigned-int]]
;;FIXME: const struct __CFArray *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: const struct __CFString *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
[:function CGDisplayModeGetTypeID [:unsigned-long]]
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
;;FIXME: struct CGDisplayMode *
[:function CGSetDisplayTransferByFormula [:int :unsigned-int :float :float :float :float :float :float :float :float :float]]
;;FIXME: CGGammaValue *
[:function CGDisplayGammaTableCapacity [:unsigned-int :unsigned-int]]
;;FIXME: const CGGammaValue *
;;FIXME: CGGammaValue *
;;FIXME: const uint8_t *
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
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
[:function CGDisplayHideCursor [:int :unsigned-int]]
[:function CGDisplayShowCursor [:int :unsigned-int]]
[:function CGDisplayMoveCursorToPoint [:int :unsigned-int Foundation/CGPoint]]
;;FIXME: int32_t *
;;FIXME: struct CGContext *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
[:function CGDisplayCanSetPalette [:unsigned-int :unsigned-int]]
;;FIXME: struct _CGDirectPaletteRef *
[:function CGDisplayWaitForBeamPositionOutsideLines [:int :unsigned-int :unsigned-int :unsigned-int]]
[:function CGDisplayBeamPosition [:unsigned-int :unsigned-int]]
[:compound CGDeviceColor "sizeof (CGDeviceColor)"]
[:compound CGDeviceByteColor "sizeof (CGDeviceByteColor)"]
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: struct _CGDirectPaletteRef *
;;FIXME: CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
[:function CGRestorePermanentDisplayConfiguration [:void]]
;;FIXME: void (*)(unsigned int, unsigned int, void *)
;;FIXME: void (*)(unsigned int, unsigned int, void *)
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
;;FIXME: struct CGColorSpace *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: struct _CGDisplayConfigRef *
;;FIXME: CGDisplayFadeReservationToken *
[:function CGReleaseDisplayFadeReservation [:int :unsigned-int]]
[:function CGDisplayFade [:int :unsigned-int :float :float :float :float :float :float :unsigned-int]]
[:function CGDisplayFadeOperationInProgress [:unsigned-int]]
[:function mlockall [:int :int]]
[:function munlockall [:int]]
;;FIXME: const void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: void *
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
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const char *
;;FIXME: au_id_t *
;;FIXME: const au_id_t *
;;FIXME: struct auditinfo_addr *
;;FIXME: const struct auditinfo_addr *
;;FIXME: struct auditinfo *
;;FIXME: const struct auditinfo *
[:function audit_session_self [:unsigned-int]]
[:function audit_session_join [:int :unsigned-int]]
;;FIXME: mach_port_name_t *
[:function _xpc_object_validate [:void :id]]
[:function xpc_endpoint_create [:id :id]]
;;FIXME: const char *
;;FIXME: const char *
[:function xpc_connection_create_from_endpoint [:id :id]]
[:function xpc_connection_set_target_queue [:void :id :id]]
;;FIXME: void (^)(NSObject<OS_xpc_object> *)
[:function xpc_connection_suspend [:void :id]]
[:function xpc_connection_resume [:void :id]]
[:function xpc_connection_send_message [:void :id :id]]
;;FIXME: void (^)(void)
;;FIXME: void (^)(NSObject<OS_xpc_object> *)
[:function xpc_connection_send_message_with_reply_sync [:id :id :id]]
[:function xpc_connection_cancel [:void :id]]
;;FIXME: const char *
[:function xpc_connection_get_euid [:unsigned-int :id]]
[:function xpc_connection_get_egid [:unsigned-int :id]]
[:function xpc_connection_get_pid [:int :id]]
[:function xpc_connection_get_asid [:int :id]]
;;FIXME: void *
;;FIXME: void *
;;FIXME: void (*)(void *)
;;FIXME: const char *
[:function xpc_retain [:id :id]]
[:function xpc_release [:void :id]]
;;FIXME: const struct _xpc_type_s *
[:function xpc_copy [:id :id]]
[:function xpc_equal [Boolean :id :id]]
[:function xpc_hash [:unsigned-long :id]]
;;FIXME: char *
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
;;FIXME: const void *
[:function xpc_data_create_with_dispatch_data [:id :id]]
[:function xpc_data_get_length [:unsigned-long :id]]
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
[:function xpc_string_get_length [:unsigned-long :id]]
;;FIXME: const char *
;;FIXME: unsigned char const[16]
;;FIXME: const uint8_t *
[:function xpc_fd_create [:id :int]]
[:function xpc_fd_dup [:int :id]]
;;FIXME: void *
;;FIXME: void **
;;FIXME: const xpc_object_t *
[:function xpc_array_set_value [:void :id :unsigned-long :id]]
[:function xpc_array_append_value [:void :id :id]]
[:function xpc_array_get_count [:unsigned-long :id]]
[:function xpc_array_get_value [:id :id :unsigned-long]]
;;FIXME: _Bool (^)(unsigned long, NSObject<OS_xpc_object> *)
[:function xpc_array_set_bool [:void :id :unsigned-long Boolean]]
[:function xpc_array_set_int64 [:void :id :unsigned-long :long-long]]
[:function xpc_array_set_uint64 [:void :id :unsigned-long :unsigned-long-long]]
[:function xpc_array_set_double [:void :id :unsigned-long :double]]
[:function xpc_array_set_date [:void :id :unsigned-long :long-long]]
;;FIXME: const void *
;;FIXME: const char *
;;FIXME: unsigned char const[16]
[:function xpc_array_set_fd [:void :id :unsigned-long :int]]
[:function xpc_array_set_connection [:void :id :unsigned-long :id]]
[:function xpc_array_get_bool [Boolean :id :unsigned-long]]
[:function xpc_array_get_int64 [:long-long :id :unsigned-long]]
[:function xpc_array_get_uint64 [:unsigned-long-long :id :unsigned-long]]
[:function xpc_array_get_double [:double :id :unsigned-long]]
[:function xpc_array_get_date [:long-long :id :unsigned-long]]
;;FIXME: const void *
;;FIXME: const char *
;;FIXME: const uint8_t *
[:function xpc_array_dup_fd [:int :id :unsigned-long]]
[:function xpc_array_create_connection [:id :id :unsigned-long]]
;;FIXME: const char *const *
[:function xpc_dictionary_create_reply [:id :id]]
;;FIXME: const char *
;;FIXME: const char *
[:function xpc_dictionary_get_count [:unsigned-long :id]]
;;FIXME: _Bool (^)(const char *, NSObject<OS_xpc_object> *)
[:function xpc_dictionary_get_remote_connection [:id :id]]
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: const void *
;;FIXME: const char *
;;FIXME: const uint8_t *
;;FIXME: const char *
;;FIXME: const char *
;;FIXME: void (*)(NSObject<OS_xpc_object> *)
[:function xpc_transaction_begin [:void]]
[:function xpc_transaction_end [:void]]
;;FIXME: const char *
[:function IOSurfaceGetTypeID [:unsigned-long]]
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: void *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: void *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: const void *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
;;FIXME: struct __IOSurface *
[:function CGDisplayStreamUpdateGetTypeID [:unsigned-long]]
;;FIXME: const CGRect *
;;FIXME: const struct CGDisplayStreamUpdate *
;;FIXME: const struct CGDisplayStreamUpdate *
;;FIXME: const struct CGDisplayStreamUpdate *
[:function CGDisplayStreamGetTypeID [:unsigned-long]]
;;FIXME: struct CGDisplayStream *
;;FIXME: struct CGDisplayStream *
;;FIXME: struct CGDisplayStream *
;;FIXME: struct CGDisplayStream *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: void (*)(unsigned int, const struct CGRect *, void *)
;;FIXME: void (*)(unsigned int, const struct CGRect *, void *)
;;FIXME: CGRect **
[:compound CGScreenUpdateMoveDelta "sizeof (CGScreenUpdateMoveDelta)"]
;;FIXME: void (*)(struct CGScreenUpdateMoveDelta, unsigned long, const struct CGRect *, void *)
;;FIXME: void (*)(struct CGScreenUpdateMoveDelta, unsigned long, const struct CGRect *, void *)
;;FIXME: CGScreenUpdateOperation *
;;FIXME: CGRect *
[:function CGCursorIsVisible [:unsigned-int]]
[:function CGCursorIsDrawnInFramebuffer [:unsigned-int]]
[:function CGWarpMouseCursorPosition [:int Foundation/CGPoint]]
[:function CGAssociateMouseAndMouseCursorPosition [:int :unsigned-int]]
;;FIXME: struct __CFMachPort *
[:function CGEnableEventStateCombining [:int :unsigned-int]]
[:function CGInhibitLocalEvents [:int :unsigned-int]]
[:function CGPostMouseEvent [:int Foundation/CGPoint :unsigned-int :unsigned-int :unsigned-int]]
[:function CGPostScrollWheelEvent [:int :unsigned-int :int]]
[:function CGPostKeyboardEvent [:int :unsigned-short :unsigned-short :unsigned-int]]
[:function CGSetLocalEventsFilterDuringSuppressionState [:int :unsigned-int :unsigned-int]]
[:function CGSetLocalEventsSuppressionInterval [:int :double]]
;;FIXME: struct __CFMachPort *
;;FIXME: volatile int32_t *
;;FIXME: volatile int32_t *
;;FIXME: volatile int32_t *
;;FIXME: volatile int32_t *
;;FIXME: volatile int32_t *
;;FIXME: volatile int32_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile uint32_t *
;;FIXME: volatile int32_t *
;;FIXME: volatile int32_t *
;;FIXME: void *
;;FIXME: void *
;;FIXME: volatile int *
;;FIXME: volatile int *
;;FIXME: volatile long *
;;FIXME: volatile long *
;;FIXME: volatile int64_t *
;;FIXME: volatile int64_t *
;;FIXME: volatile void *
;;FIXME: volatile void *
;;FIXME: volatile void *
;;FIXME: volatile void *
;;FIXME: volatile OSSpinLock *
;;FIXME: volatile OSSpinLock *
;;FIXME: volatile OSSpinLock *
;;FIXME: OSQueueHead *
;;FIXME: void *
;;FIXME: OSFifoQueueHead *
;;FIXME: void *
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
;;FIXME: struct __CGEvent *
;;FIXME: const struct __CFData *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CGEvent *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CFMachPort *
;;FIXME: struct __CGEventTapProxy *
;;FIXME: struct __CGEvent *
;;FIXME: void *
;;FIXME: CGEventTapInformation []
[:function CGEventSourceGetTypeID [:unsigned-long]]
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
[:function CGEventSourceButtonState [Boolean :unsigned-int :unsigned-int]]
[:function CGEventSourceKeyState [Boolean :unsigned-int :unsigned-short]]
[:function CGEventSourceFlagsState [:unsigned-long-long :unsigned-int]]
[:function CGEventSourceSecondsSinceLastEventType [:double :unsigned-int :unsigned-int]]
[:function CGEventSourceCounterForEventType [:unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct __CGEventSource *
;;FIXME: struct CGContext *
;;FIXME: struct CGContext *
[:compound CGPSConverterCallbacks "sizeof (CGPSConverterCallbacks)"]
;;FIXME: struct CGPSConverter *
;;FIXME: struct CGPSConverter *
;;FIXME: struct CGPSConverter *
;;FIXME: struct CGPSConverter *
[:function CGPSConverterGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
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
;;FIXME: short (*)(int, long *, void *, void *)
;;FIXME: long *
;;FIXME: short (*)(int, long *, void *, void *)
;;FIXME: unsigned char (*)(int, void *)
;;FIXME: void *
;;FIXME: unsigned char (*)(int, void *)
;;FIXME: unsigned char (*)(int, void *)
;;FIXME: void *
;;FIXME: unsigned char (*)(int, void *)
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
;;FIXME: short (*)(struct CMProfileIterateData *, void *)
;;FIXME: CMProfileIterateData *
;;FIXME: short (*)(struct CMProfileIterateData *, void *)
;;FIXME: short (*)(struct CMMInfo *, void *)
;;FIXME: CMMInfo *
;;FIXME: short (*)(struct CMMInfo *, void *)
;;FIXME: CMProfileRef *
;;FIXME: CMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: CMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: CMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: CMWorldRef *
;;FIXME: CMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: CMProfileRef *
;;FIXME: CMProfileRef *
;;FIXME: CMProfileRef *
;;FIXME: CMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: CMVideoCardGamma *
;;FIXME: CMVideoCardGamma *
;;FIXME: short (*)(struct CMProfileIterateData *, void *)
;;FIXME: short (*)(struct CMMInfo *, void *)
;;FIXME: UInt32 *
[:function CMLaunchControlPanel [:int :unsigned-int]]
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMProfileRef *
[:compound CMFloatBitmap "sizeof (CMFloatBitmap)"]
;;FIXME: float *
;;FIXME: const CMFloatBitmap *
;;FIXME: const CMFloatBitmap *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: const void *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMWorldRef *
;;FIXME: struct OpaqueCMProfileRef *
;;FIXME: const void *
[:compound CMDeviceScope "sizeof (CMDeviceScope)"]
[:compound CMDeviceProfileScope "sizeof (CMDeviceProfileScope)"]
[:compound CMDeviceInfo "sizeof (CMDeviceInfo)"]
[:compound CMDeviceProfileInfo "sizeof (CMDeviceProfileInfo)"]
[:compound NCMDeviceProfileInfo "sizeof (NCMDeviceProfileInfo)"]
[:compound CMDeviceProfileArray "sizeof (CMDeviceProfileArray)"]
;;FIXME: const struct __CFDictionary *
[:function CMUnregisterColorDevice [:int :unsigned-int :unsigned-int]]
[:function CMSetDefaultDevice [:int :unsigned-int :unsigned-int]]
;;FIXME: CMDeviceID *
;;FIXME: const CMDeviceProfileArray *
;;FIXME: CMDeviceProfileID *
[:function CMSetDeviceDefaultProfileID [:int :unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: CMDeviceProfileID *
;;FIXME: const CMDeviceProfileScope *
;;FIXME: CMProfileLocation *
[:function CMSetDeviceState [:int :unsigned-int :unsigned-int :unsigned-int]]
;;FIXME: CMDeviceState *
;;FIXME: CMDeviceInfo *
;;FIXME: short (*)(const struct CMDeviceInfo *, void *)
;;FIXME: short (*)(const struct CMDeviceInfo *, const struct NCMDeviceProfileInfo *, void *)
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
;;FIXME: int (*)(unsigned short, struct OpaqueRgnHandle *, const struct Rect *, void *)
;;FIXME: int (*)(unsigned short, struct OpaqueRgnHandle *, const struct Rect *, void *)
;;FIXME: struct OpaqueRgnHandle *
;;FIXME: void (*)(void)
;;FIXME: unsigned char (*)(struct RGBColor *, long *)
;;FIXME: unsigned char (*)(struct RGBColor *)
;;FIXME: void (*)(void)
;;FIXME: unsigned char (*)(struct RGBColor *, long *)
;;FIXME: unsigned char (*)(struct RGBColor *)
;;FIXME: void (*)(void)
;;FIXME: RGBColor *
;;FIXME: RGBColor *
[:compound VDGammaRecord "sizeof (VDGammaRecord)"]
[:compound MacPolygon "sizeof (MacPolygon)"]
;;FIXME: void (*)(short, const void *, struct Point, struct Point)
;;FIXME: void (*)(struct Point)
;;FIXME: void (*)(signed char, const struct Rect *)
;;FIXME: void (*)(signed char, const struct Rect *, short, short)
;;FIXME: void (*)(signed char, const struct Rect *)
;;FIXME: void (*)(signed char, const struct Rect *, short, short)
;;FIXME: void (*)(signed char, struct MacPolygon **)
;;FIXME: void (*)(signed char, struct OpaqueRgnHandle *)
;;FIXME: void (*)(const struct BitMap *, const struct Rect *, const struct Rect *, short, struct OpaqueRgnHandle *)
;;FIXME: void (*)(short, short, char **)
;;FIXME: short (*)(short, const void *, struct Point *, struct Point *, struct FontInfo *)
;;FIXME: void (*)(void *, short)
;;FIXME: void (*)(const void *, short)
;;FIXME: void (*)(const struct Rect *, const struct Rect *, unsigned short, short)
;;FIXME: int (*)(void *, unsigned long)
;;FIXME: void (*)(short, short, short, short)
;;FIXME: int (*)(int, struct OpaqueGrafPtr *, void *)
;;FIXME: void (*)(short, const void *, struct Point, struct Point)
;;FIXME: void (*)(struct Point)
;;FIXME: void (*)(signed char, const struct Rect *)
;;FIXME: void (*)(signed char, const struct Rect *, short, short)
;;FIXME: void (*)(signed char, const struct Rect *)
;;FIXME: void (*)(signed char, const struct Rect *, short, short)
;;FIXME: void (*)(signed char, struct MacPolygon **)
;;FIXME: void (*)(signed char, struct OpaqueRgnHandle *)
;;FIXME: void (*)(const struct BitMap *, const struct Rect *, const struct Rect *, short, struct OpaqueRgnHandle *)
;;FIXME: void (*)(short, short, char **)
;;FIXME: short (*)(short, const void *, struct Point *, struct Point *, struct FontInfo *)
;;FIXME: void (*)(void *, short)
;;FIXME: void (*)(const void *, short)
;;FIXME: void (*)(const struct Rect *, const struct Rect *, unsigned short, short)
;;FIXME: int (*)(void *, unsigned long)
;;FIXME: void (*)(short, short, short, short)
;;FIXME: int (*)(int, struct OpaqueGrafPtr *, void *)
;;FIXME: const void *
;;FIXME: void (*)(struct Point)
;;FIXME: const Rect *
;;FIXME: const Rect *
;;FIXME: const Rect *
;;FIXME: const Rect *
;;FIXME: struct MacPolygon **
;;FIXME: struct OpaqueRgnHandle *
;;FIXME: const BitMap *
;;FIXME: char **
;;FIXME: const void *
;;FIXME: void *
;;FIXME: const void *
;;FIXME: const Rect *
;;FIXME: void *
;;FIXME: void (*)(short, short, short, short)
;;FIXME: struct OpaqueGrafPtr *
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
;;FIXME: unsigned char (*)(struct OpaqueATSUTextLayout *, unsigned long, unsigned long, struct ATSTrapezoid *, unsigned long)
;;FIXME: unsigned char (*)(struct OpaqueATSUTextLayout *, unsigned long, unsigned long, struct ATSTrapezoid *, unsigned long)
;;FIXME: struct OpaqueATSUTextLayout *
[:compound ATSUBackgroundData "sizeof (ATSUBackgroundData)"]
[:compound ATSUUnhighlightData "sizeof (ATSUUnhighlightData)"]
;;FIXME: ATSUStyle *
;;FIXME: struct OpaqueATSUStyle *
;;FIXME: struct OpaqueATSUStyle *
;;FIXME: const unsigned short *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUTextLayout *
;;FIXME: struct OpaqueATSUStyle *
;;FIXME: int (*)(void *)
;;FIXME: int (*)(void *)
;;FIXME: void *
;;FIXME: int (*)(const struct Float32Point *, const struct Float32Point *, void *)
;;FIXME: int (*)(const struct Float32Point *, const struct Float32Point *, void *)
;;FIXME: const Float32Point *
;;FIXME: int (*)(const struct Float32Point *, const struct Float32Point *, const struct Float32Point *, void *)
;;FIXME: int (*)(const struct Float32Point *, const struct Float32Point *, const struct Float32Point *, void *)
;;FIXME: const Float32Point *
;;FIXME: int (*)(void *)
;;FIXME: int (*)(void *)
;;FIXME: void *
;;FIXME: int (*)(const struct Float32Point *, void *)
;;FIXME: int (*)(const struct Float32Point *, void *)
;;FIXME: const Float32Point *
;;FIXME: int (*)(const struct Float32Point *, void *)
;;FIXME: int (*)(const struct Float32Point *, void *)
;;FIXME: const Float32Point *
;;FIXME: int (*)(const struct Float32Point *, const struct Float32Point *, const struct Float32Point *, void *)
;;FIXME: int (*)(const struct Float32Point *, const struct Float32Point *, const struct Float32Point *, void *)
;;FIXME: const Float32Point *
;;FIXME: int (*)(void *)
;;FIXME: int (*)(void *)
;;FIXME: void *
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
;;FIXME: struct ATSGlyphVector *
;;FIXME: struct ATSGlyphVector *
[:function HIShapeGetTypeID [:unsigned-long]]
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: CGRect *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: const struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: struct __HIShape *
;;FIXME: short (*)(unsigned int, char ***, void *)
;;FIXME: char **(*)(unsigned int, void *)
;;FIXME: short (*)(unsigned int, char ***, void *)
;;FIXME: char **(*)(unsigned int, void *)
;;FIXME: Handle *
;;FIXME: char **
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct IconFamilyResource **
;;FIXME: struct IconFamilyResource **
;;FIXME: struct CGContext *
;;FIXME: const CGPoint *
;;FIXME: const CGRect *
;;FIXME: const struct __HIShape *
;;FIXME: struct OpaqueIconRef *
;;FIXME: struct OpaqueIconRef *
[:compound ICFontRecord "sizeof (ICFontRecord)"]
[:compound ICCharTable "sizeof (ICCharTable)"]
[:compound ICAppSpec "sizeof (ICAppSpec)"]
[:compound ICAppSpecList "sizeof (ICAppSpecList)"]
[:compound ICFileSpec "sizeof (ICFileSpec)"]
[:compound ICMapEntry "sizeof (ICMapEntry)"]
[:compound ICServiceEntry "sizeof (ICServiceEntry)"]
[:compound ICServices "sizeof (ICServices)"]
;;FIXME: ICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
;;FIXME: struct OpaqueICInstance *
[:compound AppParameters "sizeof (AppParameters)"]
[:compound LaunchParamBlockRec "sizeof (LaunchParamBlockRec)"]
[:compound ProcessInfoRec "sizeof (ProcessInfoRec)"]
[:compound ProcessInfoExtendedRec "sizeof (ProcessInfoExtendedRec)"]
[:compound SizeResourceRec "sizeof (SizeResourceRec)"]
;;FIXME: struct LaunchParamBlockRec *
;;FIXME: ProcessSerialNumber *
;;FIXME: ProcessSerialNumber *
;;FIXME: ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const struct __CFDictionary *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
[:function ExitToShell [:void]]
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
;;FIXME: const ProcessSerialNumber *
[:function PasteboardGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFString *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
;;FIXME: struct OpaquePasteboardRef *
[:function TranslationGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: struct OpaqueTranslationRef *
;;FIXME: struct OpaqueTranslationRef *
;;FIXME: struct OpaqueTranslationRef *
;;FIXME: struct OpaqueTranslationRef *
;;FIXME: struct OpaqueTranslationRef *
;;FIXME: struct OpaqueTranslationRef *
[:function AXAPIEnabled [:unsigned-char]]
[:function AXIsProcessTrusted [:unsigned-char]]
;;FIXME: const struct __CFString *
[:function AXUIElementGetTypeID [:unsigned-long]]
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
;;FIXME: const struct __AXUIElement *
[:function AXObserverGetTypeID [:unsigned-long]]
;;FIXME: void (*)(struct __AXObserver *, const struct __AXUIElement *, const struct __CFString *, void *)
;;FIXME: struct __AXObserver *
;;FIXME: struct __AXObserver *
;;FIXME: struct __CFRunLoopSource *
[:function AXValueGetTypeID [:unsigned-long]]
;;FIXME: const struct __AXValue *
;;FIXME: enum AXValueType
;;FIXME: const struct __AXValue *
[:function UAZoomEnabled [:unsigned-char]]
;;FIXME: const CGRect *
[:function ColorSyncProfileGetTypeID [:unsigned-long]]
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: struct ColorSyncProfile *
;;FIXME: struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: CFErrorRef *
;;FIXME: const struct ColorSyncProfile *
[:compound ColorSyncMD5 "sizeof (ColorSyncMD5)"]
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFData *
;;FIXME: struct ColorSyncProfile *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFArray *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct __CFData *
;;FIXME: struct ColorSyncProfile *
;;FIXME: struct ColorSyncProfile *
;;FIXME: const struct ColorSyncProfile *
;;FIXME: const struct __CFData *
;;FIXME: _Bool (*)(const struct __CFDictionary *, void *)
[:function ColorSyncTransformGetTypeID [:unsigned-long]]
;;FIXME: struct ColorSyncTransform *
;;FIXME: const void *
;;FIXME: struct ColorSyncTransform *
;;FIXME: struct ColorSyncTransform *
[:function ColorSyncCMMGetTypeID [:unsigned-long]]
;;FIXME: struct ColorSyncCMM *
;;FIXME: struct __CFBundle *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: _Bool (*)(struct ColorSyncCMM *, void *)
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFDictionary *
;;FIXME: _Bool (*)(const struct __CFDictionary *, void *)
;;FIXME: const struct __CFUUID *
;;FIXME: const struct __CFUUID *
[:compound PMRect "sizeof (PMRect)"]
[:compound PMResolution "sizeof (PMResolution)"]
[:compound PMLanguageInfo "sizeof (PMLanguageInfo)"]
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: PMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: PMPageFormat *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: PMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: PMPrintSettings *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSession *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: const struct __CFData *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: PMPrinter *
;;FIXME: struct OpaquePMServer *
;;FIXME: struct OpaquePMServer *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: const struct __CFString *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPreset *
;;FIXME: struct OpaquePMPreset *
;;FIXME: struct OpaquePMPreset *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPaper *
;;FIXME: CFArrayRef *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: struct OpaquePMPrinter *
;;FIXME: CFArrayRef *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: struct CGImage *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: struct OpaquePMPageFormat *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CFURL *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPrintSettings *
;;FIXME: struct OpaquePMPaper *
;;FIXME: struct OpaquePMPrinter *
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
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, const void **, unsigned long *, int *)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, unsigned int)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, short, long)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, short)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, unsigned long, unsigned short)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, const void **, unsigned long *, int *)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, unsigned int)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, short, long)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, short)
;;FIXME: void (*)(struct SpeechChannelRecord *, void *, unsigned long, unsigned short)
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
[:function SpeechManagerVersion [Foundation/NumVersion]]
;;FIXME: VoiceSpec *
;;FIXME: SInt16 *
;;FIXME: VoiceSpec *
;;FIXME: const VoiceSpec *
;;FIXME: const VoiceSpec *
;;FIXME: VoiceSpec *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: const unsigned char *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
[:function SpeechBusy [:short]]
[:function SpeechBusySystemWide [:short]]
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: struct SpeechChannelRecord *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
[:function CTFontDescriptorGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CFDictionary *
;;FIXME: const void *
;;FIXME: const void *
[:function CTFontGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const void *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFCharacterSet *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct CGPath *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct CGFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFData *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CTFont *
;;FIXME: const struct __CFArray *
[:function CTFontCollectionGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTFontCollection *
;;FIXME: const struct __CTFontCollection *
;;FIXME: const struct __CTFontCollection *
;;FIXME: struct __CTFontCollection *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CTFontCollection *
;;FIXME: const struct __CFArray *
;;FIXME: struct __CTFontCollection *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CTFontDescriptor *
;;FIXME: const struct __CFURL *
;;FIXME: const struct __CFURL *
;;FIXME: struct CGFont *
;;FIXME: struct CGFont *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFURL *
;;FIXME: struct __CFRunLoopSource *
;;FIXME: const struct __CFString *
[:function CTFrameGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTFrame *
;;FIXME: const struct __CTFrame *
;;FIXME: const struct CGPath *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CTFrame *
;;FIXME: const struct __CTFrame *
[:function CTLineGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
[:function CTTypesetterGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTTypesetter *
;;FIXME: const struct __CTTypesetter *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTLine *
;;FIXME: const struct __CTTypesetter *
;;FIXME: const struct __CTTypesetter *
;;FIXME: const struct __CTTypesetter *
;;FIXME: const struct __CTTypesetter *
[:function CTFramesetterGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTFramesetter *
;;FIXME: const struct __CTFrame *
;;FIXME: const struct __CTTypesetter *
;;FIXME: const struct __CTFramesetter *
[:function CTGlyphInfoGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTGlyphInfo *
;;FIXME: const struct __CTGlyphInfo *
;;FIXME: const struct __CTGlyphInfo *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CTGlyphInfo *
[:function CTParagraphStyleGetTypeID [:unsigned-long]]
[:compound CTParagraphStyleSetting "sizeof (CTParagraphStyleSetting)"]
;;FIXME: const struct __CTParagraphStyle *
;;FIXME: const struct __CTParagraphStyle *
;;FIXME: const struct __CTParagraphStyle *
[:function CTRunGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTRun *
;;FIXME: const struct __CFDictionary *
;;FIXME: const CGGlyph *
;;FIXME: const struct __CTRun *
;;FIXME: const CGPoint *
;;FIXME: const struct __CTRun *
;;FIXME: const CGSize *
;;FIXME: const struct __CTRun *
;;FIXME: const CFIndex *
;;FIXME: const struct __CTRun *
;;FIXME: const struct __CTRun *
;;FIXME: const struct __CTRun *
;;FIXME: const struct __CTRun *
;;FIXME: const struct __CTRun *
;;FIXME: const struct __CTRun *
[:function CTTextTabGetTypeID [:unsigned-long]]
;;FIXME: const struct __CTTextTab *
;;FIXME: const struct __CTTextTab *
;;FIXME: const struct __CFDictionary *
[:function CTGetCoreTextVersion [:unsigned-int]]
[:function CGImageMetadataGetTypeID [:unsigned-long]]
;;FIXME: struct CGImageMetadata *
;;FIXME: struct CGImageMetadata *
[:function CGImageMetadataTagGetTypeID [:unsigned-long]]
;;FIXME: struct CGImageMetadataTag *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const struct __CFString *
;;FIXME: const void *
;;FIXME: const struct __CFArray *
;;FIXME: const struct __CFArray *
;;FIXME: struct CGImageMetadataTag *
;;FIXME: const struct __CFString *
;;FIXME: struct CGImageMetadata *
;;FIXME: struct CGImageMetadata *
;;FIXME: struct CGImageMetadata *
;;FIXME: struct CGImageMetadata *
;;FIXME: const struct CGImageMetadata *
;;FIXME: struct CGImageMetadataTag *
;;FIXME: struct CGImageMetadata *
;;FIXME: const struct __CFData *
;;FIXME: const struct CGImageMetadata *
[:function CGImageSourceGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFArray *
;;FIXME: struct CGImageSource *
;;FIXME: struct CGImageSource *
;;FIXME: struct CGImageSource *
;;FIXME: const struct __CFString *
;;FIXME: struct CGImageSource *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct __CFDictionary *
;;FIXME: const struct CGImageMetadata *
;;FIXME: struct CGImage *
;;FIXME: struct CGImage *
;;FIXME: struct CGImageSource *
;;FIXME: struct CGImageSource *
;;FIXME: struct CGImageSource *
[:function CGImageDestinationGetTypeID [:unsigned-long]]
;;FIXME: const struct __CFArray *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
;;FIXME: struct CGImageDestination *
[:selector [0 :nullDescriptor] [:id]]
;;FIXME: const void *
[:selector [2 :descriptorWithDescriptorType :data] [:id :unsigned-int :id]]
[:selector [1 :descriptorWithBoolean] [:id :unsigned-char]]
[:selector [1 :descriptorWithEnumCode] [:id :unsigned-int]]
[:selector [1 :descriptorWithInt32] [:id :int]]
[:selector [1 :descriptorWithTypeCode] [:id :unsigned-int]]
[:selector [1 :descriptorWithString] [:id :id]]
[:selector [5 :appleEventWithEventClass :eventID :targetDescriptor :returnID :transactionID] [:id :unsigned-int :unsigned-int :id :short :int]]
[:selector [0 :listDescriptor] [:id]]
[:selector [0 :recordDescriptor] [:id]]
;;FIXME: const AEDesc *
;;FIXME: const void *
[:selector [2 :initWithDescriptorType :data] [:id :unsigned-int :id]]
[:selector [5 :initWithEventClass :eventID :targetDescriptor :returnID :transactionID] [:id :unsigned-int :unsigned-int :id :short :int]]
[:selector [0 :initListDescriptor] [:id]]
[:selector [0 :initRecordDescriptor] [:id]]
;;FIXME: const AEDesc *
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
;;FIXME: const AppleEvent *
[:selector [0 :currentAppleEvent] [:id]]
[:selector [0 :currentReplyAppleEvent] [:id]]
;;FIXME: const struct __NSAppleEventManagerSuspension *
;;FIXME: const struct __NSAppleEventManagerSuspension *
;;FIXME: const struct __NSAppleEventManagerSuspension *
;;FIXME: const struct __NSAppleEventManagerSuspension *
;;FIXME: const struct __NSAppleEventManagerSuspension *
;;FIXME: NSDictionary **
[:selector [1 :initWithSource] [:id :id]]
[:selector [0 :source] [:id]]
[:selector [0 :isCompiled] [Boolean]]
;;FIXME: NSDictionary **
;;FIXME: NSDictionary **
;;FIXME: NSDictionary **
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
;;FIXME: const void *
;;FIXME: const void *
;;FIXME: NSZone *
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
;;FIXME: NSZone *
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
;;FIXME: NSInteger *
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
;;FIXME: enum NSInsertionPosition
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
;;FIXME: enum NSRelativePosition
[:selector [0 :baseSpecifier] [:id]]
[:selector [1 :setBaseSpecifier] [:void :id]]
[:selector [4 :initWithContainerClassDescription :containerSpecifier :key :uniqueID] [:id :id :id :id :id]]
[:selector [0 :uniqueID] [:id]]
[:selector [1 :setUniqueID] [:void :id]]
[:selector [4 :initWithContainerClassDescription :containerSpecifier :key :test] [:id :id :id :id :id]]
[:selector [0 :test] [:id]]
[:selector [1 :setTest] [:void :id]]
;;FIXME: enum NSWhoseSubelementIdentifier
[:selector [0 :startSubelementIndex] [:long]]
[:selector [1 :setStartSubelementIndex] [:void :long]]
;;FIXME: enum NSWhoseSubelementIdentifier
[:selector [0 :endSubelementIndex] [:long]]
[:selector [1 :setEndSubelementIndex] [:void :long]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
;;FIXME: enum NSSaveOptions
[:selector [0 :createClassDescription] [:id]]
[:selector [0 :resolvedKeyDictionary] [:id]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
[:selector [1 :setReceiversSpecifier] [:void :id]]
[:selector [0 :keySpecifier] [:id]]
;;FIXME: enum NSSaveOptions
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
;;FIXME: NSError **
[:selector [0 :scriptURL] [:id]]
;;FIXME: void (^)(NSError *)
[:selector [0 :standardInput] [:id]]
[:selector [1 :setStandardInput] [:void :id]]
[:selector [0 :standardOutput] [:id]]
[:selector [1 :setStandardOutput] [:void :id]]
[:selector [0 :standardError] [:id]]
[:selector [1 :setStandardError] [:void :id]]
;;FIXME: void (^)(NSError *)
;;FIXME: void (^)(NSAppleEventDescriptor *, NSError *)
[:selector [0 :variables] [:id]]
[:selector [1 :setVariables] [:void :id]]
;;FIXME: void (^)(id, NSError *)
[:selector [1 :initWithServiceName] [:id :id]]
[:selector [1 :initWithListenerEndpoint] [:id :id]]
[:selector [0 :remoteObjectProxy] [:id]]
;;FIXME: void (^)(NSError *)
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
;;FIXME: void (^)(void)
;;FIXME: void (^)(void)
;;FIXME: void (^)(void)
;;FIXME: void (^)(void)
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
