package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your weight in kg:");
        int weight = in.nextInt();
        System.out.println("Your height in cm:");
        int height = in.nextInt();
        double weightInLbs = (double)weight * 2.20462262185;
        double heightInInch = (double)height * 0.3937007874;
        double bodyMassIndex = weightInLbs * 703 / Math.pow(heightInInch, 2);
        System.out.printf("Your BMI is: %.1f\n",bodyMassIndex);
        if (bodyMassIndex < 18.5) {
            System.out.println("You are underweight.");
        } else if (bodyMassIndex > 25) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You have optimal weight.");
        }

    }
}
