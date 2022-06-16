package day14staticarraysforeachloop;

public class Try {
    public static void main(String[] args) {
//array da sayilarin sum ini bulma

        int x[] = {3, 5, 7};
        int a = 0;
        int sum = 0;
        while (a < x.length) {
            sum =sum + x[a];
            a++;
        }
        System.out.println(sum);
    }
}

