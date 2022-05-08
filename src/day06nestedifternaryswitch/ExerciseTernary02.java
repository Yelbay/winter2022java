package day06nestedifternaryswitch;

import java.util.Scanner;

public class ExerciseTernary02 {
    public static void main(String[] args) {
        //1)kullanicidan bir tam sayi alin tek veya cift oldugunu yazdirin
        // condition  ? (Ternary1      ):(Ternary2);
        Scanner scan = new Scanner(System.in);
        //1)System.out.println("Please enter a number");
        //int num=scan.nextInt();

        //System.out.println((num %2==0 ) ? ("even number"):("odd number"));
        //2)Leap Year Program in Java
        // A leap year is an year that
        //is divisible by 4, but not by 100
        //or is divisible by 400


        System.out.print("Enter the Year: ");
        int year = scan.nextInt();

        int check = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ?4 : 0;

        if (check==4){
        System.out.println("Leap year");
    }else{
        System.out.println("Not Leap year");
    }

        }
}






