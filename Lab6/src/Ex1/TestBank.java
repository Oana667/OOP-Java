package Ex1;

public class TestBank {
    public static void main(String[]args){

        BankAccount b1 = new BankAccount("Ana",345);
        BankAccount b2 = new BankAccount("Lili",345);
        BankAccount b3 = new BankAccount("Bob",1346.3);

        if(b1.equals(b2))
            System.out.println(b1 + " and " + b2 + " are equal");
        else
            System.out.println(b1 + " and " + b2 + " are not equal");

        if(b1.equals(b3))
            System.out.println(b1 + " and " + b3 + " are equal");
        else
            System.out.println(b1 + " and " + b3 + " are not equal");
    }



}
