package day10forloopwhileloop;

public class Palindrome {
    public static void main(String[] args) {
        /*3.Example:Type code to check if a given String is Palindrome.
                  String: anna  Reversed String: anna  */
        String s = "12321";
        String reversedS = "";
        //Find the reverse
        for (int i = s.length() - 1; i > -1; i--) {
            reversedS += s.charAt(i);
        }
        if (s.equals(reversedS) ) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }
         /*3.Example:Type code to check if a given intiger is Palindrome.
                Integer=12321  palindrome question about the String so convert int to String*/
        int num=12322;
        String stringFromNum=String.valueOf(num);
        String reversedNum="";

        for (int i=stringFromNum.length()-1;i>-1;i--){
            reversedNum+=stringFromNum.charAt(i);
        }
      if (reversedNum.equals(stringFromNum)){
          System.out.println("Palindrome");
      }else {
          System.out.println("Not palindrome");
      }

    }
}