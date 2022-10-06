package io.codelex.exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter a number: ");
            double d = getInput();
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number.");
        }
    }

    static double getInput() throws NonPositiveNumberException {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        if (d < 0) {
            throw new NonPositiveNumberException();
        }
        return d;
    }
}
