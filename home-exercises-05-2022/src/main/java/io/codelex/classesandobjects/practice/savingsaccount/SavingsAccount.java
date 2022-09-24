package io.codelex.classesandobjects.practice.savingsaccount;

public class SavingsAccount {
    double annualInterestRates;
    double savingsAccountBalance;
    double totalDeposit;
    double totalWithdrawal;
    double totalInterestEarned;

    public SavingsAccount(double savingsAccountBalance) {
        this.savingsAccountBalance = savingsAccountBalance;
    }

    public void withdrawal(double withdrawalAmount) {
        savingsAccountBalance -= withdrawalAmount;
        totalWithdrawal += withdrawalAmount;
    }

    public void deposit(double depositAmount) {
        savingsAccountBalance += depositAmount;
        totalDeposit += depositAmount;
    }

    public void addingMonthlyInterestRates() {
        savingsAccountBalance += (savingsAccountBalance * annualInterestRates / 12 / 100);
        totalInterestEarned += (savingsAccountBalance * annualInterestRates / 12 / 100);
    }

    public double getAnnualInterestRates() {
        return annualInterestRates;
    }

    public void setAnnualInterestRates(double annualInterestRates) {
        this.annualInterestRates = annualInterestRates;
    }

    public double getSavingsAccountBalance() {
        return savingsAccountBalance;
    }

    public void setSavingsAccountBalance(double savingsAccountBalance) {
        this.savingsAccountBalance = savingsAccountBalance;
    }
}

