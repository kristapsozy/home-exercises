package io.codelex.collections.examples.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> list = new ArrayList<>();

        //TODO: Add 10 values to list
        list.add("Phone");
        list.add("PC");
        list.add("Printer");
        list.add("Mouse");
        list.add("Keyboard");
        list.add("Speaker");
        list.add("Camera");
        list.add("Charger");
        list.add("Light");
        list.add("Case");

        //TODO: Add new value at 5th position

        list.set(4, "Wind");

        //TODO: Change value at last position (Calculate last position programmatically)
        list.set(list.size() - 1, "Photo");

        //TODO: Sort your list in alphabetical order
        Collections.sort(list);

        //TODO: Check if your list contains "Foobar" element
        System.out.println(list.contains("Foobar"));

        //TODO: Print each element of list using loop
        for (String item : list) {
            System.out.println(item);
        }
    }

}
