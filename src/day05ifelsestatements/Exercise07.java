package day05ifelsestatements;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        // if a weekday i am working ,if weekend day i am not working
        Scanner scan=new Scanner(System.in);
        System.out.println("Please tell us a day ");
        String day=scan.next();

        if( day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday")
        ||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")
                ||day.equalsIgnoreCase("Friday")){
            System.out.println("I have to work");





        }else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println("I am not working");

        }else{
            System.out.println("This is not a day");
        }
    }
}
