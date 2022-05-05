package day03typecastingwrapperscanner;

import java.util.Scanner;

public class ConcatUsersName {
    public static void main(String[] args) {

        /* Getting the user's name : if the user has two or more names, use nexLine instead of next()

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scan.nextLine();
        System.out.println("Please enter  your surname");
        String surname=scan.nextLine();
        System.out.println("Your name: "  + name + " " + surname);

    }
}
