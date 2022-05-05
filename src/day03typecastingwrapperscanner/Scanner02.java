package day03typecastingwrapperscanner;
import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //To get String data from user use nextLine() method

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your fullname");

        String fullName = scan.nextLine();

        System.out.println("The user's name is " + fullName);
    }
}
