package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double totalSales;

    private double commissionRates;


    public Commission(String eName,
                      String eAddress,
                      String ePhone,
                      String socSecNumber,
                      double rate,
                      double commissionRates) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRates = commissionRates;
    }

    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double pay() {
        double payment = super.pay() + totalSales * commissionRates;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\ntotal sales: " + totalSales;
        return result;
    }
}


