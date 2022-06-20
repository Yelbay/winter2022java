package day23inheritance;

public class Practice01 {
public Practice01(){
    System.out.println("A");
}
public Practice01(int a){
    System.out.println("B");

}

}
class Practice02 extends Practice01{

    public Practice02(){
        super(12);//bu keywordu kullandigimiz icin practice 01 dan int olan calisti.eger koymasaydik default olan calisiyor
        System.out.println("C");
    }
public Practice02(int a){
    System.out.println("E");


}
    }


    class Practice03 extends Practice02{
        public Practice03(String s){
            super(11);
            System.out.println("D");
        }

    }
    class Runner{
        public static void main(String []args){
           Practice03 obj1=new Practice03("Woow");

    }
}