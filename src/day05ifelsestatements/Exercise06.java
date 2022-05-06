package day05ifelsestatements;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {


        /*ask user to type the weather

        Scanner scan= new Scanner(System.in);
        System.out.println("Please tell us the weather if it is 'sunny' or 'rainy'");
        String weather=scan.next();

        //when we compare two strings we use equals() method
        if(weather.equalsIgnoreCase("sunny")){
            System.out.println("we can go shopping");

        }else{
            System.out.println("we can not go out today");


        }

        // if i have more than $100 then i can buy a headphone*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Please tell us your amount");
        int amountOfMoney=scan.nextInt();

        if (amountOfMoney >=100) {
            System.out.println("I can  buy a headphone");
        } else {
            System.out.println("I cannot buy a headphone");
        }
    }
}
