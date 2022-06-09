package day18arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {
        /*
Ask user to enter a letter
If the letter exists in the list convert it to "Got it"
otherwise, add the element user entered into the list
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a letter please");
        String letter=scan.next().toUpperCase();
        ArrayList<String> list=new ArrayList<>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        System.out.println(list);
        if(list.contains(letter)){
            list.set(list.indexOf(letter),"Got it");
        }else{
            list.add(letter);
        }
        System.out.println(list);
    }
}
