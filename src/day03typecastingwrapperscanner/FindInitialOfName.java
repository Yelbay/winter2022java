package day03typecastingwrapperscanner;

import java.util.Scanner;

public class FindInitialOfName {
    public static void main(String[] args) {
        /*Print the Intiger of users name*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        char initial=scan.next().charAt(0);
        System.out.println("Initial of your name: " + initial);


    }
}
