package day16arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        /*
Please split the dates and get day, month and the year separately on the console
day
month
year
 */

        String date="25-02-2022";
        String dateArray[]=date.split("-");
        System.out.println(Arrays.toString(dateArray));//
        System.out.println("Day: "+ dateArray[0]);
        System.out.println("Month: "+ dateArray[1]);
        System.out.println("Year: "+ dateArray[2]);
        System.out.println(date.split("-")[0]);
        System.out.println(date.split("-")[1]);
        System.out.println(date.split("-")[2]);
    }
}
