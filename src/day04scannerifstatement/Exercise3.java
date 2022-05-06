package day04scannerifstatement;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of the rectangle");
        int length = scan.nextInt();

        System.out.println("Please enter width of the rectangle");
        int width = scan.nextInt();
        if (length==width){
            System.out.println("square");
        }
        else{
            System.out.println("Not square");
        }

        {

        }

    }
}