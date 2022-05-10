package day08stringmanipulations;

import java.util.Scanner;

public class ExerciseSm01 {
    public static void main(String[] args) {

        //Print the first and last character of the String on the console
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String str=scan.nextLine();
        /*char firstCharacter=str.charAt(0);
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(""+firstCharacter+lastCharacter);
        ///substring.method
        String fCh=str.substring(0,1);
        String lCh=str.substring(str.length()-1,str.length());
        System.out.println(fCh+lCh);*/
//indexOf() method
       //type a code to get initials of the first and the last name
        String initialOfFirstName=str.substring(0,1);
        int indexOfLastName=str.indexOf(" ")+1;
        String initialOfLastName=str.substring(indexOfLastName,indexOfLastName+1);
        System.out.println(initialOfFirstName+initialOfLastName);
        System.out.println("====");




    }
}
