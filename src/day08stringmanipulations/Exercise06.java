package day08stringmanipulations;

public class Exercise06 {
    public static void main(String[] args) {

        String str="calisirsaniz, java ogrenmek cok kolay";
            //indexOf() verilen string'de istenen karakterin kullanildigi ilk indexi bulur ilk karakter 0 dan baslar
        System.out.println(str.indexOf('a'));// 1
        System.out.println(str.indexOf("a"));// 1
        System.out.println(str.indexOf('s'));//4
        int index=str.indexOf("r");
        System.out.println(index);
        System.out.println(str.indexOf("c"));//0
        System.out.println(str.indexOf("q"));//-1
        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf('a',11));//15)11 karakter silerek sonraki a nin degerini(15) soyleyeck



    }
}
