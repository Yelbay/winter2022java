package day06nestedifternaryswitch;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSwitch01 {
    public static void main(String[] args) {
       /* Type java code by using switch statement.
                A school has following rules for grading system:
        1. For 50 - C 2. For 80 - B. 4. For 100 - A
        Ask user to enter marks and print the corresponding grade.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a mark");
        char marks=scan.next().toLowerCase().charAt(0);
        switch (marks){
            case 'a':
                System.out.println("100");
                break;
            case'b':
                System.out.println("80");
                break;
            case'c':
                System.out.println("50");
                break;
            default:
                System.out.println("Failed");



        }
    }
}
