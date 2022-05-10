package day08stringmanipulations;

public class Exercise04 {
    public static void main(String[] args) {
        String str1="ali";
        String str2="Can";
        String str3="Ali can";
        String str4=(str1 +" "+ str2);
        System.out.println(str3==str4);//false
        System.out.println(str3.equalsIgnoreCase(str4));//true
        //length() verilen stringteki karakter sayisini dondurur
        String a="Cennet";
        String b="Yelbay";

        System.out.println(a.length()==b.length());

    }
}
