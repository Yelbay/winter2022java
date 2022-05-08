package day06nestedifternaryswitch;

import java.util.Scanner;

public class ExerciseTernary01 {
    public static void main(String[] args) {
        //Ask the user enter an integer and choose the bigger one.
       Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        double num1=scan.nextDouble();
        System.out.println("please enter second number");
        double num2=scan.nextDouble();
        System.out.println(num1>num2? num2 : num1);
    }
}
