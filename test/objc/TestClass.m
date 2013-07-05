#import "TestClass.h"

@implementation TestClass

+ (BOOL) testBool: (BOOL) b
{
	return !b;
}

+ (char) testChar: (char) c
{
	return c + 1;
}

+ (signed char) testSignedChar: (signed char) sc
{
	return sc + 1;
}

+ (unsigned char) testUnsignedChar: (unsigned char) uc
{
	return uc + 1;
}

+ (short) testShort: (short) s
{
	return s + 1;
}

+ (unsigned short) testUnsignedShort: (unsigned short) us
{
	return us + 1;
}

+ (int) testInt: (int) i
{
	return i + 1;
}

+ (unsigned int) testUnsignedInt: (unsigned int) ui
{
	return ui + 1;
}

+ (long) testLong: (long) l
{
	return l + 1;
}

+ (unsigned long) testUnsignedLong: (unsigned long) ul
{
	return ul + 1;
}

+ (long long) testLongLong: (long long) ll
{
	return ll + 1;
}

+ (unsigned long long) testUnsignedLongLong: (unsigned long long) ull
{
	return ull + 1;
}

+ (float) testFloat: (float) f
{
	return f + 1;
}

+ (double) testDouble: (double) d
{
	return d + 1;
}

@end
