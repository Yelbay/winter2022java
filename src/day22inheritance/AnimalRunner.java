package day22inheritance;

public class AnimalRunner {
    public static void main(String[] args) {
        /*
        1) To make a class child of another class we use "extend' keyword
        2) We create parent*child relationship:
        a)To prevent repetition
        b)To make maintenance easy
        c) To make classes atomic
        3) Child classes can use the methods of parent classes,but parents can not use child class method
         */



      Dog dog1=new Dog();
      dog1.bark();
      dog1.eat();
      dog1.drink();
      dog1.feedBabyByMilk();

        System.out.println("======");
        Cat cat1=new Cat();
        cat1.meow();
        cat1.eat();
        cat1.drink();
         cat1.feedBabyByMilk();

        System.out.println("=====");


        Bird bird1 =new Bird();
        bird1.tweet();
        bird1.eat();
        bird1.drink();

        System.out.println("======");

        Animal animal1=new Animal();
        animal1.drink();
        animal1.eat();



    }
}
