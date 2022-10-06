package io.codelex.arithmetic.practice;

public class HourlyCalculator {
    static void hourlyEmployeesPayCalculator(double basePay, int hoursWorked) {
        if (basePay < 8.00) {
            System.out.println("Error: Minimum wage is $8.00 an hour.");
        } else if (hoursWorked > 60) {
            System.out.println("Error: Hours are greater than 60.");
        } else {
            if (hoursWorked > 40) {
                int extraHours = hoursWorked - 40;
                double totalPay = (40 * basePay) + ((double) extraHours * basePay * 1.5);
                System.out.printf("Total pay: $%.2f", totalPay);
            } else {
                System.out.printf("Total pay: $%.2f", basePay * hoursWorked);
            }
        }
    }

    public static void main(String[] args) {
        hourlyEmployeesPayCalculator(8.2,47);
    }
}
