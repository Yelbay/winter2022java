package day04scannerifstatement;


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Type java code by using if statement. When you enter the initial of the day of a week,
        //output should be all possible names of the days.
        //For example; if the initial is ’S’ output should be “Saturday or Sunday”

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the initial of the day");
        String i= scan.next();




        if (i.equalsIgnoreCase("S") ){
            System.out.println("Saturday"+ " " +"Sunday");
        }
            if(i.equalsIgnoreCase("M") ){

            System.out.println("Monday");
            }
            if (i.equalsIgnoreCase("T")){
                System.out.println("Tuesday"+" " +"Thursday"  );
            }
            if(i.equalsIgnoreCase("W")){
            System.out.println("Wednesday");

        }
           if(i.equalsIgnoreCase("F")){
            System.out.println("Friday");
        }
        }

    }

