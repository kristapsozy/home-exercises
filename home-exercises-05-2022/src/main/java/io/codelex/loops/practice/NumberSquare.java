package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Min?");
        int min = in.nextInt();
        System.out.println("Max?");
        int max = in.nextInt();

        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            } for (int j = min; j<i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

