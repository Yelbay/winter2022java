package day08stringmanipulations;

public class Exercise03 {
    public static void main(String[] args) {


    int a=10;
    int b=a+0;
        System.out.println(a==b);//true
        System.out.println();
        System.out.println();
        String str1="Ali";
        String str2="Can";
        String str3="Ali Can";
        String str4=(str1 +" "+ str2);
        System.out.println(str3==str4);//False cunku bu string kullanildiginda esittir isereti yerine
        // equalignorecase kullanilir
        System.out.println(str3.equalsIgnoreCase(str4));//true



    }

}
