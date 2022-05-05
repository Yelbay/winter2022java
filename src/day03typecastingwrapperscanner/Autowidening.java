package day03typecastingwrapperscanner;

public class Autowidening {
    public static void main(String[] args) {
        // byte<short<int<long  Auto widening from small to big
        byte num1= 44;
        short num2=num1;
        System.out.println("num2:"  + num1);
        int num3= 55;
        double num4= num3;
        System.out.println("num4:"  + num3);
    }
}
