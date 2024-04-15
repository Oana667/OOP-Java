package Ex1;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner,double balance){
        this.owner=owner;
        this.balance=balance;
    }


    public void withdraw(double amount){
        this.balance-=amount;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof BankAccount){
           BankAccount a=(BankAccount) obj;
           return balance==a.balance;
       }
        return false;
    }

    public int hashCode(){
        return (int) (owner.hashCode()+ balance);
    }
}
