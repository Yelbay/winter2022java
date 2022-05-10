package day09forloops;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {

        // 10 defa java guzeldir yazdir
        /*


        for( int i= 1; i<=10;i++) {
            System.out.println(i +".Java Guzeldir");}

            for(int e=1; e<=11; e++){
                System.out.println("merhaba");

            }
               */
         /*for (int i=1; i<=10;i++){
             System.out.println(i+"Java Guzeldir");

         }
       */
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ".Java Guzeldir");

        }
        for (int i = 10; i < 31; i++) {
            System.out.print(i + (","));
        }
        for (int i = 100; i > 50; i--) {
            System.out.print(i + ",");

        }
        System.out.println(50);//son rakama virgul koymamak icin
        //kullanicidan 100'den kucuk bir tam sayi isteyin
        //1'den baslayarak girilen sayiya kadar (sayi dahil) 3 un kati olan sayilari yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter an intiger");
        double num=scan.nextDouble();
        int no=(int) num;
        if (num<0){
            System.out.println("please enter pozitif number");
        } else if(no!=num){
            System.out.println("please enter an intiger");
        }else{
            for (int i= 1; i<=num;i++){
                if(i%3==0){
                    System.out.println(i+" ");
                }

        }

}
}
    }





