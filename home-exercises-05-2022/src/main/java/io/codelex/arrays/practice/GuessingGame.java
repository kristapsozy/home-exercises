package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static Random ran;
    public static final int MOVE_LIMIT = 12;

    public static void main(String[] args) {
        String words[] = {"target", "game", "resources", "practise"};
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        String wordToGuess = words[ran.nextInt(0, words.length)];
        System.out.println(wordToGuess);
        StringBuilder hiddenWord = new StringBuilder(wordToGuess.replaceAll("[a-z]", "_"));
        StringBuilder misses = new StringBuilder("");
        String guess = "";
        int count = 0;


        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Word: " + hiddenWord);
            System.out.println("Misses: " + misses);
            guess = in.nextLine();
            System.out.println("Guess: " + guess);
            if (wordToGuess.contains(guess) && hiddenWord.toString().contains(guess)) {
                int index = wordToGuess.lastIndexOf(guess);
                hiddenWord.setCharAt(index, guess.charAt(0));
            } else if (wordToGuess.contains(guess)) {
                int index = wordToGuess.indexOf(guess);
                hiddenWord.setCharAt(index, guess.charAt(0));
            } else {
                misses.append(guess);
            }
            if (hiddenWord.toString().equals(wordToGuess)) {
                System.out.println("Word: " + hiddenWord);
                System.out.println("Misses: " + misses);
                System.out.println("You win!");
                break;
            }
            count++;
            if (count == MOVE_LIMIT) {
                System.out.println("You lost!");
                break;
            }
        }
    }
}
