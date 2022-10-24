package io.codelex.classesandobjects.practice.savingsaccount;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {
        double savingsAccountBalance = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("How much money is in the account?:");
        savingsAccountBalance = in.nextDouble();
        SavingsAccount account = new SavingsAccount(savingsAccountBalance);
        System.out.println("Enter the annual interest rate:");
        account.setAnnualInterestRates(in.nextDouble());
        System.out.println("How long has the account been opened?");
        int accountTime = in.nextInt();
        for (int i = 1; i <= accountTime; i++) {
            System.out.println("Enter amount deposited for month: " + i + ":");
            account.deposit(in.nextDouble());
            System.out.println("Enter amount withdrawn for month: " + i + ":");
            account.withdrawal(in.nextDouble());
            account.addingMonthlyInterestRates();
        }
        System.out.printf("Total deposited: $%.2f", account.getTotalDeposit());
        System.out.printf("Total withdrawn: $%.2f", account.getTotalWithdrawal());
        System.out.printf("Total Interest earned: $%.2f", account.getTotalInterestEarned());
        System.out.printf("Ending balance: $%.2f", account.getSavingsAccountBalance());


    }
}
