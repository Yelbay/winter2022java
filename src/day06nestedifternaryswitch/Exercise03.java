package day06nestedifternaryswitch;

public class Exercise03 {
    public static void main(String[] args) {
        //We can not use long double float boolean with Switch Statement.
        int dayNo=3;
        switch(dayNo){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter valid day");
        }

    }
}
