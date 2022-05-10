package day08stringmanipulations;

import java.util.Locale;

public class Exercise02 {
    public static void main(String[] args) {
        //charAt(istenenIndex) method'u istedigimiz index'deki karakteri bize verir
        String name="Techproeducation";
        System.out.println(name.charAt(0));
        //index 0 dan baslar
        System.out.println(name.charAt(5));
        System.out.println(name.charAt(12));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(""+ name.toLowerCase(Locale.ROOT).charAt(0)+
                name.toUpperCase(Locale.ROOT).charAt(9));



    }
}
