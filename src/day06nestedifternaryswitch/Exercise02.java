package day06nestedifternaryswitch;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
         char chart='9';
         String result=(chart>='a'&& chart<='z')?"lovercase":(
                 (chart>='A'&& chart<='Z')?"uppercase": "This is not letter");
        System.out.println(result);

    }
}
