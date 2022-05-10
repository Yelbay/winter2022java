package day08stringmanipulations;

public class Exercise01 {
    public static void main(String[] args) {
        //String olarak verilen bir degisken+ ile baska bir degisken birlestirilirse java bunlari
        //yan yana ekler.
        String name="Ali";
        String surName="Can";
        System.out.println(name+ " " + surName);
        System.out.println(name.concat("").concat(surName));



    }
}
