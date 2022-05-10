package day08stringmanipulations;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        //kullanicidan bir cumle ve bir harf isteyin,
        //harfin cumlede var olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");

        char krk=scan.next().charAt(0);
        int index=cumle.indexOf(krk);
        if (index==(-1)){
            System.out.println("yok");
        }else
            System.out.println("var");

    }
}
