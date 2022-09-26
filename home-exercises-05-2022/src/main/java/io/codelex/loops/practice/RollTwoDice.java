package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Desired sum: ");
        int desiredSum = in.nextInt();
        while (true) {
            int num1 = rollDice();
            int num2 = rollDice();
            int newSum = num1 + num2;
            System.out.println(num1 + " and " + num2 + " = " + newSum);
            if (newSum == desiredSum) {
                break;
            }

        }

    }

    public static int rollDice() {
        Random ran = new Random();
        return ran.nextInt(1, 7);
    }
}
