package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank(){
        this.accounts= new ArrayList<>();
    }

    public void addAccount(String owner, double balance) {
        accounts.add(new BankAccount(owner, balance));
    }


    public void printAccounts() {
        this.accounts.stream()
                .sorted(Comparator.comparingDouble(BankAccount::getBalance))
                .forEach(System.out::println);
    }

        public void printAccounts(double minBalance, double maxbalance){
        for(BankAccount account: accounts){
            if (account.balance < maxbalance && account.balance> minBalance)
                System.out.println(account.getter()+ " " + account.getBalance());
        }
    }

    public BankAccount getAccount(String owner){
        return accounts.stream()
                .filter(bankAccount -> bankAccount.getter().equals(owner))
                .findFirst()
                .orElse(null);
    }

}
