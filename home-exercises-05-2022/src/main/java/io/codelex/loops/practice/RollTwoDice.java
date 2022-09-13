package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Desired sum: ");
        int desiredSum = in.nextInt();
        while(true) {
            int num1 = ran.nextInt(1,7);
            int num2 = ran.nextInt(1,7);
            int newSum = num1 + num2;
            System.out.println(num1 + " and " + num2 + " = " + newSum);
            if(newSum == desiredSum) {
                break;
            }

        }

    }
}
