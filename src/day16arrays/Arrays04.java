package day16arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {
        //1)Get string from user and type code to find the number of words in a String.
       //2)Count how many words starts with "a".(Make code case-sensitive)
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a String");
        String sentence= scan.nextLine();
        String sentenceArray[]=sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("The number of words in the giving string is:"+ sentenceArray.length);
        int counter=0;
        for (String w:sentenceArray) {
            if (w.startsWith("a")){
                counter++;

            }

        }
        System.out.println("The number of words which starts with 'a' is:" +counter);

        System.out.println("=========");


    }
}
