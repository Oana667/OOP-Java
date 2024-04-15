package Ex3;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount>{
    private String owner;
    private double balance;

    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount){
        if(this.balance >= amount)
            this.balance=balance-amount;
        else
            System.out.println("Insufficient founds");
    }

    public BankAccount(String qwner, double balance) {
        this.owner = qwner;
        this.balance = balance;
    }

    public BankAccount() {
    }

    public String getQwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setQwner(String qwner) {
        this.owner = qwner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, balance);
    }
    @Override
    public String toString(){
        return "owner("+ owner +") has the balance=" + balance ;
    }

    @Override
    public int compareTo(BankAccount o) {
        return Double.compare(this.balance,o.balance);
    }
}