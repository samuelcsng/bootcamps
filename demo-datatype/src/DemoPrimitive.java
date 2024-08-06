public class DemoPrimitive {
  public static void main(String[] args) {

    // Declaration & Assignment
    int x = 50;
    // Declaration
    int y;
    // Assignment
    y = -13;
    System.out.println(y);
    // Re-assignment
    y = 9;
    System.out.println(y);

    System.out.println(100);
    System.out.println(x);

    int age = 30;
    // int q=30.5;
    double q = 30.5;
    System.out.println(q);

    double u = 10;
    double i = 10.0;

    // char ->Character
    char c = 'i';
    char c2 = '9';
    char c3 = ' ';
    // char c4=''; // at least one character

    double d1 = 3.3; // by default 3.3 is double value
    double d2 = 3.3d; // "d" is to describe 3.3 is a double value
    // float f1 = 3.3; // 3.3 is double, which is higher than float
    // float is lower level type comparing with double

    float f2 = 3.3f; // assign float value to float variable
    double d3 = 3.3f; // 3.3f is float value, lower value can be assigned to higher type

    int h = 4; // 4 is int value
    long l1 = 4; // long is higher level than int: 4 int value -> 4 long value
    long l2 = 4L; // 4L is long value

    // ***** VIP *****
    // Primitives:
    // byte, short, int, long
    // float, double
    // char
    // boolean
    // ***** VIP *****
    
    // Integer: byte -> short -> int -> long
    byte b1 = 3; // from -128 to 127
    // assign int value to byte variable
    // int value -> byte value (implicitly)

    int i2 = 3;
    // byte b2 = i2; // Java does not allow higher level type to lower level type

    // Assign byte variable to int variable
    int i3 = b1; // OK
    b1 = -128;
    // b1 = -129; // out of range
    b1 = 127;
    // b1 = 128; // out of range

    short s1 = 3; // from -32768 to 32768
    // short vs int
    s1 = -32768;
    // s1 = -32769;
    s1 = 32767;
    // s1 = 32768;

    // s1 = i3; // i3 is higher level type

    int i1 = 3; // from -2.1 billion to 2.1 billion
    long l3 = 3; // from -2^63 to 2^63

    // int i4 = 3L; // explicitly assign long value

    //
    boolean bl = false;
    bl = true;

    boolean result = 3 > 2; // true
    System.out.println(result);
    System.out.println(3 > 2); // true
    System.out.println(2 > 3); // false

    int i9 = 200;
    System.out.println(i9 > 199); // true

    int age2 = 66;
    boolean isElderly = age2 > 65; // event or definition
    System.out.println(isElderly); // true


  }
}
