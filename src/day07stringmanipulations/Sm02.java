package day07stringmanipulations;

public class Sm02 {
    public static void main(String[] args) {

        String str="Ali Can";
        String newStr=str.concat("!...").concat("  ").concat("Congrats..");
        System.out.println(newStr);
        //you can do concatenation by using +sign,you can use concat method
        boolean isLast=str.endsWith("Canli");
        System.out.println(isLast);//false
        boolean isFirst=str.startsWith("Al");
        System.out.println(isFirst);
        boolean isFourth=str.startsWith("C",4);
        System.out.println(isFourth);
String newStr2=str.concat("!"+" Bravoo!");
        System.out.println(newStr2);

String newStr02=str.replaceFirst("Ali","Cem");
        System.out.println( newStr02);
        String newStr03=str.replace("A","L");
        System.out.println( newStr03);
      String newStr04= str.replace('i','r');
        System.out.println(newStr04);

         /*
        11)concat()
        12)endsWith()
        13)startsWith(with 1 parameter)
        14)startsWith/with 2 parameters)

         */

    }
}
