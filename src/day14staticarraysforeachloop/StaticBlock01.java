package day14staticarraysforeachloop;

public class StaticBlock01 {
    //When you click on main method run button,class loader will be activated then it will load the class into the memory
    /*
    Sometimes we need some data just after the class loaded.
    for that kind of scenarios we use 'static block'
    when you use static block it will be executed before "main method", "any other methods","constructors I mean it will be the first execute
      Note: Static Block is used to initialize "static variables" when we want them before everything in the class

        Note: If you have multiple "static blocks" execution order will be from top to down
     */
    static double pi;
    static double eNumber;
    public StaticBlock01(){
        System.out.println("Constructor");
    }
    static {
        System.out.println("First static block ");
        pi = 3.14;
    }
    static{
        System.out.println("Second static block");
        eNumber=2.7;
    }
    public static void main(String[] args) {
        double r=2;
        double area=pi*r*r;

    }
}
