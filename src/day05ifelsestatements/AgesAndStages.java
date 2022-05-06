package day05ifelsestatements;

import java.util.Scanner;

public class AgesAndStages {
    public static void main(String[] args) {

         // Type a code,get age from user and decide which stage on it
        //0 - 4 => baby
        //4 - 12 => child
        //12 - 20 => teenager
        //20 - 30 => adult
        //else (not expected age)

        System.out.println("Enter your age:");
        Scanner  scan = new Scanner(System.in);
        int age = scan.nextInt();


        if (age>=0 && age<=4) {
            System.out.println("baby");

        }else if (age>=5 && age<=12){
            System.out.println("child");

        }else if (age>=13 && age<=20){
            System.out.println("teenager");

        }else if(age>=21 && age<=30){
            System.out.println("adult");

        }else{
            System.out.println("Not expected age");
        }



        }








    }

