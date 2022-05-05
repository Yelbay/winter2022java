package day03typecastingwrapperscanner;

import java.util.Scanner;

public class CircleAreaAndCircum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius=scan.nextDouble();
        double circumference=2*3.14*radius;
        double area=3.14*radius*radius;

        System.out.println("circumference of circle:" +  circumference);
        System.out.println("area of circle:"  + area);



    }
}
