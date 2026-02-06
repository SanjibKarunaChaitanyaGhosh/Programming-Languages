/* 

1 . Constants
2 . Variables
3 . Data Types 

*/

/*  1. What is Single Character Constant ?

    A single Character constant contains a single character enlosed within a pair of single qoute marks.

    '5' , 'x'

    2. What is Sring Constants ?

    A string is a sequesnce of character enclosed between double quotes.

    "Hello Java"
*/

// Data types

/*
1. Primitive 

    1. Numeric
        1. Integer
            1. Byte (1 byte)
            2. Short(2 bytes)
            3. Int (4 bytes)
            4. Long (8 Bytes)

        2. Floating Points
            1. Float(4 byte)
            2. Double (8 Bytes)

    2. Non-Numeric
        1. Character
        2. Boolean

2. Non-Primitive

    1. Classes
    2. Interface
    3. Arrays

*/

class student
{
    public static void main(String arg[])
    {
        char c ='x';
        byte b=50;
        short s=1996;
        int i=1234567;
        long l=99999999999L;
        float f=3.14F;
        double d= 0.0000000987;


        System.out.println("Today we are Learning about Varibales");

        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);

        System.out.println(i+" "+l);

    }
}
