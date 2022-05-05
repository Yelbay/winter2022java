package day03typecastingwrapperscanner;

import java.util.Scanner;



        public class PerimeterAndAreaOfRectangle {
            public static void main(String[] args) {
                //Type a code for calculating perimeter and area of a rectangle.
                // Take width and length of rectangle from user
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the width and length of rectangle..");
                int width = scan.nextInt();
                int length = scan.nextInt();
                System.out.println("The area of rectangle: " + width*length);
                System.out.println("The perimeter of rectangle: " + 2*(width+length));
            }
        }

