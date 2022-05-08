package day06nestedifternaryswitch;

public class ExerciseTernary03 {
    public static void main(String[] args) {
        /*
        //        Type code to check the password
        //        If it has more than 8 characters, initial should be 'i'
        //        If it has no more than 8 characters initial should be 'K'
        //        Solve the task by using nested-ternary
        //     */
        //
        //    //length() method returns the number of characters in a String.
        //    //For example "Ali Can".length() ==> 7
       String pwd="Ka1b3c7";

      String isValid=(pwd.length()>8)?(pwd.charAt(0)=='i'?"valid password": " invalid"):(pwd.charAt(0)=='K'? "valid": "  invalid");
        System.out.println(isValid);
    }
}
