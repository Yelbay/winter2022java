package day09forloops;

public class Exercise03 {
    public static void main(String[] args) {
        //Soru 2) 10 ile 30 arsindaki sayilari aralarinda virgul olarak ayni satirda yazdirin
        for( int i=10; i<=30;i++){
            System.out.print(i+",");
        }
        System.out.println();
  //ustteki ornekte 30 dan sonrayada virgul koyuyor alttaki ornekte 30 dan sonraya virgul koymamak icin
        for (int e=10; e<=29; e++ ){
            System.out.print(e+",");
        }
        System.out.println(30);
    }
}
