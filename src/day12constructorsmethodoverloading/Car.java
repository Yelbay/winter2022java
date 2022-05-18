package day12constructorsmethodoverloading;
public class Car {
    /*
         1) Constructors are used to create objects from a class
         2) Java puts default constructors inside every class
         3)Default constructors does not have any parameter inside the constructor paranthesis
         (Default constructors are invisible)
         4) Constructor names must match with class name
         HOw to create a constructur?
         1) Type access modifier
         2) Type the class name as constructor name
         3) open-close paranthesis
         4) open-close curly brace
         Interview QUESTION
         WHAT ARE THE DIFFERENCES Between "constructors" and "methods"
     */
    //That constructor is the same with default constructor, it is very simple
    String make;
    String model;
    double price;
    int year;
    //if we create any constructor is the same with default constructor ,it is very simple
    public Car(){
    }
    public Car(String make, String model, double price, int year){
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }
    public Car(String make,String model){

    }


    public static void main(String[] args) {
        Car c1 = new Car();
        //Class     obj name              keyword       Constructor
        c1.make = "Honda";
        c1.model = "Civic";
        c1.price = 10000;
        c1.year = 2016;
        Car c2 = new Car();
        c2.make = "Mercedes";
        c2.model = "AMG";
        c2.price = 30000;
        c2.year = 2020;
        Car c3 = new Car("BMW", "M3", 70000, 2021);

        Car c4 = new Car("Volvo", "v60", 10000, 2000);
        Car c5 = new Car("Tofas", "Sahin");
    }

    public String run(){
        return "I started to run";

    }
}
