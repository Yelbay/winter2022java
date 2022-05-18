package day12constructorsmethodoverloading;

import java.util.Scanner;

public class MethodCreationFindSquare {
    public static void main(String[] args) {
        //kullanicidan iki sayi isteyin,sayilarin kare ve kuplerini toplayan iki ayri method olusturun

        //kullaniciya us sorun 2 yazarsa karelerini 3 yazarsa kuplerini toplayin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double num1= scan.nextDouble();
        double num2=scan.nextDouble();
        System.out.println("eger kareler toplamini istiyorsaniz 2 kupler toplamini istiyorsaniz 3 e basiniz");
        int tercih= scan.nextInt();
        switch(tercih){
            case 2:
                kareToplami(num1,num2);
                break;
            case 3:
                kuplerToplami(num1,num2);

                break;
            default:
                System.out.println("Lutfen istenen tercihlerden birini yapin");



        }
    }

    public static void kuplerToplami(double num1, double num2) {
       double  kuplerToplami= num1*num1*num1+num2*num2*num2;
        System.out.println("Girilen sayilarin kupler toplami= "+kuplerToplami);

    }

    public static void kareToplami(double num1, double num2) {
        double kareToplami= num1*num1+num2*num2;
        System.out.println("Girilen sayinin kareler toplami= "+kareToplami);
    }
}
