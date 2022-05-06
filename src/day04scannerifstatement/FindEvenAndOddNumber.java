package day04scannerifstatement;

import java.util.Scanner;

public class FindEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter an integer to check for it is odd or even");
        int num = scan.nextInt();
        if (num % 2==0){
            System.out.println("even");}
            if (num % 2 !=0){
                System.out.println("odd");}

        }


    }

