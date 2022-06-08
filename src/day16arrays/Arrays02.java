package day16arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String name= "FatmaSeher";
        String nameArray[]=name.split("");
        System.out.println(Arrays.toString(nameArray));//[F, a, t, m, a, S, e, h, e, r]
        //Please split this name into a char array
        char array[]=name.toCharArray();
        System.out.println("Char array==>"+ Arrays.toString(array));//Char array==>[F, a, t, m, a, S, e, h, e, r]
    }
}
