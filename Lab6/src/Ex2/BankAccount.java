package Ex2;

import java.util.Objects;

class BankAccount {
    private String owner;
    public double balance;


    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getter() {
        return this.owner;
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
    public String toString() {
        return "owner(" + owner + ") has the balance=" + balance;
    }
}
