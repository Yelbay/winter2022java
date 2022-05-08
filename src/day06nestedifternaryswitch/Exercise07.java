package day06nestedifternaryswitch;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {


        /*If the user pressed 1, 2, 3 the program will print the number that is pressed;
        otherwise, program will print "Not allowed".*/

    Scanner scan=new Scanner(System.in);
        System.out.println("please press the number");
        int num= scan.nextInt();
        switch (num){
            case 1:
                System.out.println(num+"  is Allowed");
                break;
            case  2:
                System.out.println(num+ "  is Allowed");
                break;
            case 3:
                System.out.println(num+ "  is Allowed");
                break;
            default:
            System.out.println(num+  " is Not Allowed");
        }


    }
}
