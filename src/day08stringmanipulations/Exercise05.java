package day08stringmanipulations;

public class Exercise05 {
    public static void main(String[] args) {
        String str1="Ali Kahya";
        System.out.println(str1.length());//13
        //verilen str1 in son harfini yazdirin
        System.out.println(str1.charAt(str1.length()-1));
        String str2="";

        System.out.println(str2.length());
        String str3=null;
        System.out.println(str3.length());//NullPointerException errror gibi kirmizi yazi cikar

        //null pointer olusturdugumuz fakat sonra kullanacagimiz bir stringi isaretlemek icin kullanilir.
         //ben bu degiskeni olusturdum fakat deger atamadim demek.

    }
}
