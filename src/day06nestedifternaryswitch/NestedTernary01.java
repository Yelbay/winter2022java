package day06nestedifternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*Write a program to check if a year is leap year or not.
        		If the year is divisible by 100 then it must be divisible by 400.
        		If a year is not divisible by 100 then it must be divisible by 4.

         */

        int year = 1800;


                         // (condition)         ?       (Ternary 1)                                                : (Ternary 2);

        String isLeap= ( year%100==0)      ?      (  year%400==0 ?   "Leap year "      : "Not leap year") :( year%4==0? "Leap year": "Not leap year"    ) ;
        System.out.println(isLeap);


    }
}
