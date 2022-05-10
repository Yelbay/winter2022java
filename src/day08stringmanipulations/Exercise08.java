package day08stringmanipulations;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence=scan.nextLine();
        System.out.println("please enter a word");
        String word=scan.next();
        int index=sentence.indexOf(word);
        if(index<0){
            System.out.println("this word no where in the sentences");


        }else if(sentence.indexOf(word,index+1)<0) {
            System.out.println("there is only one");

        }else{
            System.out.println("There is more than one");
        }
    }
}
