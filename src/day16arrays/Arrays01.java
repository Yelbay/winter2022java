package day16arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Put each word to an array as an element
        String words="I go to school";
        String array[]=words.split(" ");//[I, go, to, school]
        System.out.println(Arrays.toString(array));
        String name="Sevval#Mustafa#Suat#Fatmanur";//[Sevval, Mustafa, Suat, Fatmanur]
       String nameArray[]=name.split("#");
        System.out.println(Arrays.toString(nameArray));

        String sentence="Learn Java earn money";
        String arrSentence[]=sentence.split(" ");//[Learn, Java, earn, money]
        System.out.println(Arrays.toString(arrSentence));
        String wrds="I go to school and I talk to friends and I talk to teachers";
        String arrWords[]=wrds.split("and");
        System.out.println(Arrays.toString(arrWords));//[I go to school ,  I talk to friends ,  I talk to teachers]
    }
}
