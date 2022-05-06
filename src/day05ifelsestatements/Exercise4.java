package day05ifelsestatements;

public class Exercise4 {
    public static void main(String[] args) {
        //I will buy a Pc I have cash money,I also have debit card
        boolean cashMoney=false;
        boolean debitCard=false;
        if(cashMoney || debitCard){
            System.out.println("I can bu a PC");

        }else{
            System.out.println("I cannot buy a PC");
        }



    }
}
