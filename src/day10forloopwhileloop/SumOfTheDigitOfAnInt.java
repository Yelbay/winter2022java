package day10forloopwhileloop;

public class SumOfTheDigitOfAnInt {
    public static void main(String[] args) {
        int n=753;
        int sumOfDigits=0;
        for (int i = n; i >0 ;i/=10 ) {
            sumOfDigits+=i%10;
        }
        System.out.println(sumOfDigits);
    }
}
