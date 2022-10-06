package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            int numerator = 0;
            try {
                numerator = scanner.nextInt();
            } catch (InputMismatchException e) {
                String input = scanner.nextLine();
                if (input.startsWith("q") || input.startsWith("Q")) {
                    System.exit(0);
                }
            }

            System.out.println("Enter the divisor");
            int divisor = scanner.nextInt();
            System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
        }
    }
}
