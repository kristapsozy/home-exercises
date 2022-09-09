package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class InputStringToUpperCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a text:");
        String input = in.nextLine();
        System.out.println("You entered: " + input.toUpperCase());


    }
}
