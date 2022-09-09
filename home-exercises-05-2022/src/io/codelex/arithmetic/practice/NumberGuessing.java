package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = (int)Math.round(Math.random()*100);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int guess = in.nextInt();
        if(guess == answer) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (guess < answer) {
            System.out.println("Sorry, you are too low.  I was thinking of " + answer + ".");
        } else {
            System.out.println("Sorry, you are too high.  I was thinking of " + answer +".");
        }
    }
}
