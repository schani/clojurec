#import <Foundation/Foundation.h>

@interface TestClass : NSObject {
}

+ (BOOL) testBool: (BOOL) val;

+ (char) testChar: (char) c;

+ (signed char) testSignedChar: (signed char) sc;
+ (unsigned char) testUnsignedChar: (unsigned char) uc;
+ (short) testShort: (short) s;
+ (unsigned short) testUnsignedShort: (unsigned short) us;
+ (int) testInt: (int) i;
+ (unsigned int) testUnsignedInt: (unsigned int) ui;
+ (long) testLong: (long) l;
+ (unsigned long) testUnsignedLong: (unsigned long) ul;
+ (long long) testLongLong: (long long) ll;
+ (unsigned long long) testUnsignedLongLong: (unsigned long long) ull;

+ (float) testFloat: (float) f;
+ (double) testDouble: (double) d;

@end
