package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Welcome to Piglet!");
        do {
            Random ran = new Random();
            int rolledNumber = ran.nextInt(1,7);
            if (rolledNumber == 1) {
                System.out.println("You rolled: " + rolledNumber + "!");
                System.out.println("You got 0 points.");
                break;
            } else {
                System.out.println("You rolled: " + rolledNumber + "!");
                sum += rolledNumber;
            }
            System.out.println("Roll again?");
                String answer = in.nextLine().toLowerCase();
                if(answer.equals("no") | answer.equals("n")) {
                    System.out.println("You got " + sum + " points");
                    break;
                }

        } while(true);
    }
}
