package day11dowhileloop;

import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
///Q1)Write a program to print numbers from 1 to 5 on the console by using do-while loop.


        int i = 1;
        do {
            System.out.println(i);
            i++;


        } while (i < 6);
        System.out.println("========");

        //2) Write a program to print numbers from 10 to 3 on the console by using do-while loop.
        int k = 10;
        do {
            System.out.print(k);

            k--;
        } while (k > 2);


        System.out.println("======");
//3)Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
//by using do-while loop.
        int j = 1;
        do {
            if (j % 5 == 0)
                System.out.println(j);
            j++;
        } while (j < 100);
        //4)Write a program to print letters from c to m on the console by using do-while loop.

        char ch = 'c';

        do {
            System.out.println(ch);
            ch++;


        } while (ch <= 'm');
        System.out.println("======");

        //Q5)Ask user to enter a number.
        //If the number is divisible by 10 then print "Won!" on the console
        //otherwise ask user to enter another number.
        //Use do-while loop.
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        do {
            System.out.println("Enter your number");
            number = scanner.nextInt();
            if (number % 10 == 0) {
                System.out.println("won");
            }
        } while (number % 10 != 0);


     //Ask user to enter a name.
     //If the name contains the letter ‘a’ then print "Won!" on the console
     //otherwise ask user to enter another name.
     //Use do-while loop.

        /*
         //2.Way:
        //Java created contains() method to check if a spesific character exists in a string or not
        boolean isContain = str.contains("X");
        if(isContain){
            System.out.println("The character exists in the string");
        } else {
            System.out.println("The character does not exists..");
        }
         *//*Ask user to enter a name.
        If the name contains the letter ‘a’ then print "Won!" on the console
        otherwise ask user to enter another name.
                Use do-while loop.*/
        Scanner scan=new Scanner(System.in);
        String s="";
      do {

            System.out.println("Enter a name");
            s=scan.next().toLowerCase();
            if (s.contains("a")){
                System.out.println("Won!");
            }
        }while (s.indexOf('a')<0);
        System.out.println("=========");


    }
    }




