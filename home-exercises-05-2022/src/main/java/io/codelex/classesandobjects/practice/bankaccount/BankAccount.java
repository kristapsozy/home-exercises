package io.codelex.classesandobjects.practice.bankaccount;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        //todo
    }

    public final void withdraw(double amount) {
        //todo
    }

    @Override
    public String toString() {
        if (balance < 0) {
            return name + ", -$" + Math.abs(Math.round(balance * 100.0) / 100.0);
        } else {
            return name + ", $" + Math.round(balance * 100.0) / 100.0;
        }
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}
