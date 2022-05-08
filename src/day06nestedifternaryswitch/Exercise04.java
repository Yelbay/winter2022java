package day06nestedifternaryswitch;

public class Exercise04 {
    public static void main(String[] args) {

        char result='B';
        switch (result){
            case  'A':
                System.out.println("85-100");
                break;
            case 'B':
                System.out.println("60-85");
                break;
            case 'C':
                System.out.println("50-60");
                break;
            case 'D':
                System.out.println("Less then 50");
                break;
            default:
            System.out.println("invalid" );
        }

    }
}
