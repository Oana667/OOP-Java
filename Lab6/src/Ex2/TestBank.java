package Ex2;

import java.util.ArrayList;

public class TestBank {
    public static void main(String[]args){

        Bank bank= new Bank();
        bank.addAccount("Oana",45.5);
        bank.addAccount("Lily",456.98);
        bank.addAccount("Ana",2944.2);
        bank.addAccount("Jon",24.65);
        bank.addAccount("Maria",456.32);
        bank.printAccounts();
        bank.printAccounts(20,500);
    }
}