package io.codelex.classesandobjects.practice.bankaccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Benson", 17.5);
        BankAccount account1 = new BankAccount("John", -20.123);
        System.out.println(account.toString());
        System.out.println(account1.toString());
    }
}
