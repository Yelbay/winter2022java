package day05ifelsestatements;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("enter your gender");
      char sex= scan.next().toUpperCase().charAt(0);
        if ( sex=='M') {
            if (age >= 65) {
                System.out.println("Hey man you retired");
            } else {
                System.out.println("You can not retired");
            }
        }else if(sex=='F'){
            if (age>=60) {
                System.out.println("You are retired");
            }else{
                System.out.println("you can not retired");

            }




        }


    }


                }


