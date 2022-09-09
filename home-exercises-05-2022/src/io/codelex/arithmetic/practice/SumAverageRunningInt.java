package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;
        int count = 0;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
            count++;
        }
        double average = (double) sum / (double) count;
        System.out.println("The sum of "+lowerBound+" to " +upperBound+" is "+ sum);
        System.out.println("The average is " + average);
    }
}
