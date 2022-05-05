package day03typecastingwrapperscanner;

public class ExplicitNarrowing {
    public static void main(String[] args) {
        //Explicit Narrowing  byte<short<int<long Big Box to small Box is called Explicit Narroving


        int num1= 10;
        short num2=(short)num1;
        System.out.println("num2:" + num2);
        byte num3=(byte)num2;
        System.out.println("num3: " + num3);
        double num4=87.3;
        int num5=(int)num4;
        System.out.println("num5 :"  + num5);
        int num6=24;
        int num7=4;
        System.out.println("num6/num7:" );




    }
}
