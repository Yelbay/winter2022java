package day05ifelsestatements;

import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= scan.nextInt();
        if(age>=18 && age<=65){
            System.out.println("You should work");



        }
        else{
            System.out.println("No need to work");
        }
    }
}
