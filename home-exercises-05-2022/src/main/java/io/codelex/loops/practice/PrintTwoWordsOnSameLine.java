package io.codelex.loops.practice;

import java.util.Scanner;

public class PrintTwoWordsOnSameLine {
    public static final int LINE_LENGTH = 30;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = in.nextLine();

        System.out.println("Enter second word:");
        String word2 = in.nextLine();

        int charCount = (word1 + word2).length();
        String dotString = ".".repeat(LINE_LENGTH - charCount);
        System.out.println(word1 + dotString + word2);

        System.out.print(word1);
        for (int i = 0; i < LINE_LENGTH - charCount; i++) {
            System.out.print(".");
        }
        System.out.print(word2);


    }
}
