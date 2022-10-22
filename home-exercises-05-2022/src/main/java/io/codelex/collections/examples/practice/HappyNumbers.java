package io.codelex.collections.examples.practice;

import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = in.nextInt();

        if (isHappyNumber(number)) {
            System.out.println("Number is happy");
        } else {
            System.out.println("Number is not happy");
        }
    }

    public static boolean isHappyNumber(int number) {
        int sum = number;
        int newSum;
        while (sum > 9) {
            newSum = sum;
            sum = 0;
            while (newSum > 0) {
                int num = newSum % 10;
                sum += num * num;
                newSum /= 10;
            }
        }
        if (sum == 1) {
            return true;
        }
        return false;
    }

}
