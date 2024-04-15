package Ex3;

import java.util.Set;
import java.util.TreeSet;

public class Bank {
    private final Set<BankAccount>bankAccounts;
    public Bank(){
        this.bankAccounts= new TreeSet<>();
    }
    public void  addAccount(String owner,double balance){
        this.bankAccounts.add(new BankAccount(owner,balance));

    }
    public void printAccounts(){
        this.bankAccounts.forEach(System.out::println);

    }
    public void printAccounts(double minBalance,double maxBalance){
        this.bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getBalance()>=minBalance && bankAccount.getBalance()<=maxBalance)
                .forEach(System.out::println);
    }
    public BankAccount getAccount(String owner){
        return bankAccounts.stream()
                .filter(bankAccount -> bankAccount.getQwner().equals(owner))
                .findFirst()
                .orElse(null);
    }
}
