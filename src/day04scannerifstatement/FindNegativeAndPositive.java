package day04scannerifstatement;

import java.util.Scanner;

public class FindNegativeAndPositive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check it is positivity");

        int num= scan.nextInt();
        if(num>0){
            System.out.println("Positive");
            if (num<0){
                System.out.println("Negative");
                if (num==0){
                    System.out.println("Neuter");

                }
            }
        }
    }
}
