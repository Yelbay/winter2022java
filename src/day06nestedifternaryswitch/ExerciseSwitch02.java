package day06nestedifternaryswitch;

import java.util.Scanner;

public class ExerciseSwitch02 {
    public static void main(String[] args) {
        //Write a Java program user will choose answer among A, B, C, or D.
        //If the answer is true, output will be “True.” If the answer is false, output will be
        //“False”. Correct answer is ‘C’ for the multiple option question.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please choose your answer ");
        char answer=scan.next().toLowerCase().charAt(0);
        switch (answer){
            case 'a':
            case'b':
            case'd':
                System.out.println("False");
                break;
            case 'c':
                System.out.println("True");
                break;
            default:
                System.out.println("Choose answer among A, B, C, or D");

        }
    }
}
