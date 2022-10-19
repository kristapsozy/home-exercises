package io.codelex.tests.cards;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String ownersFullName, String CCVCode, double balance) {
        super(cardNumber, ownersFullName, CCVCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        balance += amount;
    }

    @Override
    public void takeMoney(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
            if (balance < 100) {
                System.out.println("Warning: Low funds");
            }
        } else {
            throw new NotEnoughFundsException("Not enough funds!");
        }

    }
}
