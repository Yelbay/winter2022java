package day06nestedifternaryswitch;

import java.util.Scanner;

public class NestedTernaryExercise {
    public static void main(String[] args) {
        //if employer is female who older then 60 she can retired
        //if employer is male who older then 65 he can retired
        //kod yazimi bittiginde bu test datalarini degistirerek kodlarimizi test edebiliriz
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("Please enter your sex");
        char sex=scan.next().toUpperCase().charAt(0);;

        String result= sex=='F'? (age>=60? "You are retired" :"You can not retired"):
                              (age>=65 ?"You are retired":"You can not retired");
        System.out.println(result);




    }

}
