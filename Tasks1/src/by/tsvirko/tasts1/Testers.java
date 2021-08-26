package by.tsvirko.tasts1;

import java.util.function.DoubleBinaryOperator;

public class Testers {
    public static void testByte() {
        System.out.println("\n**********TEST BYTE**********");
        byte a = 10;
        byte b = 9 ,c;
        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (byte)(a+b);
        System.out.println(c);

        // subtraction
        c = (byte)(a - b);
        System.out.println(c);

        // multiplication
        c =(byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = (byte)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = (byte)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 18;
        // unary minus
        c = (byte)-a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = (byte)+a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 17;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 17;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a =17;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 17;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = (byte)(a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte)(a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte)(a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c =(byte) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c =(byte) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (byte)(a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -6;
        c = (byte) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 6;
        c = (byte)(a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString((byte)c));

        a = -6;
        c =(byte) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        c = (byte)7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool =true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = (byte)sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (byte)ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("int = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("int = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("int = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);




    }

    public static void testShort() {
        System.out.println("\n**********TEST SHORT**********");
        short a = 11;
        short b = 7 ,c;
        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (short)(a+b);
        System.out.println(c);

        // subtraction
        c = (short)(a - b);
        System.out.println(c);

        // multiplication
        c =(short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = (short)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = (short)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 18;
        // unary minus
        c = (short)-a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = (short)+a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 17;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 17;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a =17;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 17;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = (short)(a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short)(a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short)(a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c =(short) ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c =(short) (a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (short)(a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -6;
        c = (short) (a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 6;
        c = (short)(a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -6;
        c =(short) (a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        c = (short)7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool =true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = (short)ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("int = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("int = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("int = double: c = (short)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);

    }

    public static void testChar() {

        System.out.println("\n**********TEST CHAR**********");
        char a = '2';
        char b = '6' ,c;
        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = (char)(a+b);
        System.out.printf("%s + %s\n", a, b, c);

        // subtraction
        c = (char) (a - b);
        System.out.printf("%s - %s \n", a, b, c);

        // multiplication
        c =(char) (a * b);
        System.out.printf("%s * %s \n", a, b, c);

        // division
        c = (char)(a / b);
        System.out.printf("%s / %s = %s\n", a, b, c);

        // modulus
        c = (char)(a % b);
        System.out.printf("%s %% %s = %s\n", a, b, c);

        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 'e';
        // unary minus
        c = (char)-a;
        System.out.printf("-%s = %s\n", a, c);

        // unary plus
        c = (char)+a;
        System.out.printf("+%s = %s\n", a, c);

        // prefix increment
        a = 'e';
        System.out.printf("++%s = %s\n", a, ++a);

        // postfix increment
        a = 'e';
        System.out.printf("%s++ = %s\n", a, a++);

        // prefix decrement
        a ='e';
        System.out.printf("--%s = %s\n", a, --a);

        // postfix decrement
        a = 'e';
        System.out.printf("%s-- = %s\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = (char)(a & b); // bitwise AND
        System.out.printf("%s & %s = %s\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char)(a | b); // bitwise OR
        System.out.printf("%s | %s = %s\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char)(a ^ b); // bitwise XOR
        System.out.printf("%s ^ %s = %s\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c =(char) ~a; // bitwise unary compliment
        System.out.printf("~%s = %s\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c =(char) (a << 1); // left shift
        System.out.printf("%s << 1 = %s\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = (char)(a >> 1); // right shift
        System.out.printf("%s >> 1 = %s\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = '6';
        c = (char) (a >> 1); // right shift
        System.out.printf("%s >> 1 = %s\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = '6';
        c = (char)(a >>> 1); // zero fill right shift
        System.out.printf("%s >>> 1 = %s\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = '6';
        c =(char) (a >>> 1); // zero fill right shift
        System.out.printf("%s >>> 1 = %s\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        c = (char)7;
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
        System.out.printf("%s -= %s --> c = %s\n", c, a, c -= a);
        System.out.printf("%s *= %s --> c = %s\n", c, a, c *= a);
        System.out.printf("%s /= %s --> c = %s\n", c, a, c /= a);
        System.out.printf("%s %%= %s --> c = %s\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%s |= %s --> c = %s\n", c, a, c |= a);
        System.out.printf("%s &= %s --> c = %s\n", c, a, c &= a);
        System.out.printf("%s ^= %s --> c = %s\n", c, a, c ^= a);
        System.out.printf("%s >>= 1 --> c = %s\n", c, c >>= 1);
        System.out.printf("%s <<= 1 --> c = %s\n", c, c <<= 1);
        System.out.printf("%s >>>= 1 --> c = %s\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%s > %s --> %s\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%s >= %s --> %s\n", a, b, a >= b);

        // less than
        System.out.printf("%s < %s --> %s\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%s <= %s --> %s\n", a, b, a <= b);

        // equal to
        System.out.printf("%s == %s --> %s\n", a, b, a == b);

        // not equal to
        System.out.printf("%s != %s --> %s\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%s > %s) && (%s > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%s > %s) & (%s > 0) --> %s\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%s >= %s) || (%s != 0) --> %s\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%s >= %s) | (%s != 0) --> %s\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%s >= %s) | (%s != 0) --> %s\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%s >= %s) --> %s\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%s > %s ? %s : %s --> %s\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool =true;
        c = (char)bt;
        System.out.printf("int = byte: c = %d --> c = %s\n", bt, c);
        c = (char)sh;
        System.out.printf("int = short: c = %d --> c = %s\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %s\n", ch, c);
        c = (char) l;
        System.out.printf("int = long: c = (char)%d --> c = %s\n", l, c);
        c = (char) f;
        System.out.printf("int = float: c = (char)%f --> c = %s\n", f, c);
        c = (char) d;
        System.out.printf("int = double: c = (char)%f --> c = %s\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);


    }
    public static void testInt() {

        System.out.println("\n**********TEST INT**********");
        int a = 11, b = 3, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = b + a;
        System.out.printf("%d + %d = %d\n", a, b, c);

        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 17;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 15;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 15;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a = 15;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 15;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
    }

    public static void testLong() {
        System.out.println("\n**********TEST LONG**********");
        long a = 101L, b = 7L, c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = b + a;
        System.out.printf("%d + %d = %d\n", a, b, c);

        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 19L;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);

        // prefix increment
        a = 15L;
        System.out.printf("++%d = %d\n", a, ++a);

        // postfix increment
        a = 15L;
        System.out.printf("%d++ = %d\n", a, a++);

        // prefix decrement
        a = 15L;
        System.out.printf("--%d = %d\n", a, --a);

        // postfix decrement
        a = 15L;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = -5L;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = 5L;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = -5L;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        c = 7L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (long)bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = (long)sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = (long)(ch);
        System.out.printf("lng = char: c = '%s' --> c = %d\n", ch, c);
        c = (long) l;
        System.out.printf("long = long: c = (long)%d --> c = %d\n", l, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
       // c = (long)bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n",
                bool);

    }

    public static void testFloat() {
        System.out.println("\n**********TEST FLOAT**********");
        float a = 55.5f;
        float b = 3.7f;
        float c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = b + a;
        System.out.printf("%f + %f = %f\n", a, b, c);

        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 19.2f;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        // prefix increment
        a = 15.5f;
        System.out.printf("++%f = %f\n", a, ++a);

        // postfix increment
        a = 15.5f;
        System.out.printf("%f++ = %f\n", a, a++);

        // prefix decrement
        a = 15.5f;
        System.out.printf("--%f = %f\n", a, --a);

        // postfix decrement
        a = 15.5f;
        System.out.printf("%f-- = %f\n", a, a--);


        /*System.out.println("\n***** Bitwise Operators *****");

        c =   a & b; // bitwise AND
        System.out.printf("%f & %f = %f\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString((float) a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%f | %f = %f\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
*/
       /* a = -5;
        c = a >> 1; // right shift
        System.out.printf("%f >> 1 = %f\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
*/

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
       /* System.out.printf("%f |= %f --> c = %f\n", c, a, c |= a);
        System.out.printf("%e &= %e --> c = %e\n", c, a, c &= a);
        System.out.printf("%e ^= %e --> c = %e\n", c, a, c ^= a);
        System.out.printf("%e >>= 1 --> c = %e\n", c, c >>= 1);
        System.out.printf("%e <<= 1 --> c = %e\n", c, c <<= 1);
        System.out.printf("%e >>>= 1 --> c = %e\n", c, c >>>= 1);
*/

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %b\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c =  ch;
        System.out.printf("float = char: c = '%s' --> c = %f\n", ch, c);
        c = (float) l;
        System.out.printf("float = long: c = (float)%d --> c = %f\n", l, c);
        c = (float) f;
        System.out.printf("float = float: c = (float)%f --> c = %f\n", f, c);
        c = (float) d;
        System.out.printf("float = double: c = (float)%f --> c = %f\n", d, c);
        // c = (long)bool;
        System.out.printf("int = boolean: c = (long)%b --> Compile Error\n",
                bool);
    }

    public static void testDouble() {
        System.out.println("\n**********TEST DOUBLE**********");
        double a = 17.3, b = 7.5;
        double c;

        System.out.println("\n****** Arithmetical Operators *****");

        //addition
        c = b + a;
        System.out.printf("%f + %f = %f\n", a, b, c);

        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);

        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);

        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);

        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 19.1;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);

        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);

        // prefix increment
        a = 15.7;
        System.out.printf("++%f = %f\n", a, ++a);

        // postfix increment
        a = 15.8;
        System.out.printf("%f++ = %f\n", a, a++);

        // prefix decrement
        a = 15.6;
        System.out.printf("--%f = %f\n", a, --a);

        // postfix decrement
        a = 15.9;
        System.out.printf("%f-- = %f\n", a, a--);


        /*System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = -5L;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = 5L;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));

        a = -5L;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(c));
*/

        System.out.println("\n***** Assignment Operators *****");

        c = 7.6;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
       /* System.out.printf("%f |= %f --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
*/

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%s' --> c = %f\n", ch, c);
        c = (double) l;
        System.out.printf("double = long: c = (double)%d --> c = %f\n", l, c);
        c = (double) f;
        System.out.printf("double = float: c = (double)%f --> c = %f\n", f, c);
        c =  d;
        System.out.printf("double = double: c = (double)%f --> c = %f\n", d, c);
        // c = (long)bool;
        System.out.printf("int = boolean: c = (long)%b --> Compile Error\n",
                bool);

    }

    public static void testBoolean() {
        System.out.println("\n**********TEST BOOLEAN**********");
        int a = 11, b = 3, c;

        System.out.println("\n***** Bitwise Operators *****");

        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);


        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);

        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);

        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);

        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);

        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);

        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));

        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));

        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));

        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));

        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));


        System.out.println("\n***** Misc Operators *****");

        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));


        System.out.println("\nType Cast Operator:");

        boolean bool = true;
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);

    }

    public static void testString() {
        System.out.println("\n**********TEST STRING**********");
        String s1 = "Привет ";
        String s2 = "мир!";
        String s3 = s1 + s2;

        System.out.println(s3);


        System.out.println("\n***** Relational Operators *****");

        // equal to
        System.out.printf("%s == %s --> %s\n", s1, s2, s1 == s2);

        // not equal to
        System.out.printf("%s != %s --> %s\n", s1, s2, s1 != s2);

    }
}


