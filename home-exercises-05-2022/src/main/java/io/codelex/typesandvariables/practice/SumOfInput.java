package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while(count <4) {
            System.out.println("Please enter single digit number:");
            int input = in.nextInt();
            sum += input;
            count++;
        }
        System.out.println("Input sum is: "+sum);
    }
}
