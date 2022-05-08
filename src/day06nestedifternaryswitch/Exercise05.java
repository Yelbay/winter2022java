package day06nestedifternaryswitch;

public class Exercise05 {
    public static void main(String[] args) {
        //If the number is 2 digit number 10
        //the number is 3 digit 100
        //the number is 4 digit 1000
        //For other option change the number
        int num = 100;
        switch (num) {
            case 10:
                System.out.println("two digit number");
                break;
            case 100:
                System.out.println("Three digit number");
                break;
            case 1000:
                System.out.println("Four digit number");
                break;
            default:
                System.out.println("Change your number");


        }
    }
}

