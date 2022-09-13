package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Max value?");
        int maxValue = in.nextInt();
        int count = 0;

        for (int i = 1; i <= maxValue; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }
    }
}
