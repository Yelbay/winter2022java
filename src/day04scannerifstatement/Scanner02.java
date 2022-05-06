package day04scannerifstatement;

import java.util.Scanner;


        public class Scanner02 {
            public static void main(String[] args) {
        /*
   Get the firstname, middle name, lastname, SSN from user then print them like the following
   Ali Mert Can
   123456789
*/
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your first name...");
                String firstName = scan.next(); //nextLine() takes all the String, next() just takes the first word.
                System.out.println("Enter you middle name...");
                String middleName = scan.next();
                System.out.println("Enter your last name...");
                String lastName = scan.next();
                System.out.println("Enter your SSN id...");
                String ssnId = scan.next();
                System.out.println(firstName + " " + middleName + " " + lastName );
                System.out.println(ssnId);



    }
}
