package day03typecastingwrapperscanner;

public class TypeCasting01 {
    public static void main(String[] args) {

//Type Casting: Converting small data type to large data type or converting large data type to small data type is called "Type Casting"
    // byte <, short<, int<, long<, float<, double
//How to convert small data type to large data type: Auto Widening
        byte b = 47;// 47 is in byte data type
        int i = b;// 47 is in int data type

        //How to convert large data type to small data type: Explicit Narrowing
        double d = 1.2;
        short s = (short)d;
        System.out.println(s);
        //Convert short 257 to byte?
        short r = 257;
        byte y = (byte)r;
        System.out.println(y);// 1  257%256=remainder is 1 so get result 1

        double d1=2.5;
        int i1=(int) d1;
        System.out.println(i1);



    }


}