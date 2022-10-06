package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;
        int count1 = upperBound-lowerBound;
        int count2 = 0;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
            count2++;
        }
        double average1 = (double) sum / (double) count1;
        double average2 = (double) sum / (double) count2;
        System.out.println("The sum of "+lowerBound+" to " +upperBound+" is "+ sum);
        System.out.println("The average is " + average1);
        System.out.println("The average is " + average2);

    }
}
