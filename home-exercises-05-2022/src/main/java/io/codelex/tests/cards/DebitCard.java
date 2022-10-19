package io.codelex.tests.cards;

public class DebitCard extends Card {
    public DebitCard(String cardNumber, String ownersFullName, String CCVCode, double balance) {
        super(cardNumber, ownersFullName, CCVCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        if (balance + amount > 10000) {
            System.out.println("Warning: Too much money");
        } else {
            balance += amount;
        }
    }

    @Override
    public void takeMoney(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
        } else {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }
}
