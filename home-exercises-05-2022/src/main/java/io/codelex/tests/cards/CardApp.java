package io.codelex.tests.cards;

public class CardApp {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("32132132131",
                "John Doe", "012", 1000);

        DebitCard debitCard = new DebitCard("3213213212321",
                "Sara Deer", "092", 1000);

        //creditCard.takeMoney(10001);
        debitCard.takeMoney(900);
        creditCard.addMoney(333);
        System.out.println(debitCard.balance);
        System.out.println(creditCard.balance);
        //creditCard.takeMoney(2000);
        debitCard.addMoney(1000000);

    }
}
