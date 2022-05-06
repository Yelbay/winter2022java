package day04scannerifstatement;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease enter your age");
        int age=scan.nextInt();
        if (age>=18 && age<=65){
        System.out.println("You should work");
    }else if(age>=65){
        System.out.println("You are retired");
        }else{
            System.out.println("No need to work");
        }
        System.out.println("=======");
       




    }
}
