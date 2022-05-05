package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter three digit number");
        int number=scan.nextInt();

        int sum=0;
        int digit=number%10;
        System.out.println(digit);
        sum+=digit;
        System.out.println(sum);

        number/=10;
        System.out.println(number);
        number/=10;
        System.out.println(number);











    }
}
