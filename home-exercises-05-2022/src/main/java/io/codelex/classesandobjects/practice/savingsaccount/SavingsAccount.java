package io.codelex.classesandobjects.practice.savingsaccount;

public class SavingsAccount {
    private double annualInterestRates;
    private double savingsAccountBalance;
    private double totalDeposit;
    private double totalWithdrawal;
    private double totalInterestEarned;

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

    public double getTotalDeposit() {
        return totalDeposit;
    }

    public double getTotalWithdrawal() {
        return totalWithdrawal;
    }

    public double getTotalInterestEarned() {
        return totalInterestEarned;
    }
}

