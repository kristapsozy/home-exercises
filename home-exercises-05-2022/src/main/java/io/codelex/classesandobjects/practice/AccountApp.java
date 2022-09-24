package io.codelex.classesandobjects.practice;

import static io.codelex.classesandobjects.practice.Account.transfer;

public class AccountApp {
    public static void main(String[] args) {
        Account johnAccount = new Account("John", 100.00);
        johnAccount.deposit(20);
        System.out.println(johnAccount.toString());

        Account mattsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        mattsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattsAccount);
        System.out.println(myAccount);

        Account A = new Account("A", 100);
        Account B = new Account("A", 0);
        Account C = new Account("C", 0);

        transfer(A, B, 50);
        transfer(B, C, 25);

        System.out.println(A.balance());
        System.out.println(B.balance());
        System.out.println(C.balance());


    }
}
