package io.codelex.collections.examples.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListOfNames {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter name: ");
            String name = in.nextLine();
            if (name.equals("")) {
                break;
            }
            set.add(name);

        }
        System.out.print("Unique name list contains: ");
        for (String name : set) {
            System.out.print(name + " ");
        }
    }
}
