package io.codelex.tests.cards;

public abstract class Card {
    private String cardNumber;
    private String ownersFullName;
    private String CCVCode;
    public double balance;

    public Card(String cardNumber, String ownersFullName, String CCVCode, double balance) {
        this.cardNumber = cardNumber;
        this.ownersFullName = ownersFullName;
        this.CCVCode = CCVCode;
        this.balance = balance;
    }

    public abstract void addMoney(double amount);

    public abstract void takeMoney(double amount);
}
