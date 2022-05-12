package day11dowhileloop;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        int numB=4;
        do {
            System.out.print(numB);
            numB++;
        }while(numB<3);



        Scanner scan = new Scanner(System.in);
        String password = "";

        do {
            System.out.println("Enter your password");
            password = scan.nextLine();

            if(password.equals("password")) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }while(!(password.equals("password")));
    }
}
