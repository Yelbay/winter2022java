package day12constructorsmethodoverloading;

public class MethodCreationAdditionAndMultiplication {
    public static void main(String[] args) {
        //Verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun
        // method olusturmak icin 4 adim takip edilir
        //1 adim method call yazalim
        //2, adim methoda argumant yazacakmiyiz karar vermeliyiz
        int sayi1=10;//argumant olusturma
        int sayi2=50;
        ;//1)method call
        //3. adim1. veya 2.adimi yaptiktan sonra javadan yardim alipmethodu olusturma
        System.out.println(toplama(sayi1,sayi2));
        System.out.println(carpma(sayi1,sayi2));
        System.out.println(bolme(sayi1,sayi2));
    }

    public static int bolme(int sayi1, int sayi2) {
       return sayi2/sayi1;
    }

    public static int toplama(int sayi1, int sayi2) {//javadan yardim alarak olustu
        //return type:eger void se return type yapilmaz egerbizden sadace yazdirma istedigi icin void kalabilir
        return sayi1+sayi2;
    }
      public static int carpma(int sayi1,int sayi2){
        return sayi1*sayi2;


}


}
