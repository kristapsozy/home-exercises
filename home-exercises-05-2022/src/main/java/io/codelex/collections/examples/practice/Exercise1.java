package io.codelex.collections.examples.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {

        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("BMW");
        list.add("Mercedes");
        list.add("VolksWagen");
        list.add("Mercedes");
        list.add("Tesla");

        for (String car : list) {
            System.out.println(car);
        }

        //todo - replace array with a HashSet and print out the results
        Set<String> set = new HashSet<>();
        set.add("Audi");
        set.add("BMW");
        set.add("BMW");
        set.add("Mercedes");
        set.add("VolksWagen");
        set.add("Mercedes");
        set.add("Tesla");

        for (String car : set) {
            System.out.println(car);
        }


        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> map = new HashMap<>();
        map.put("Audi", "Germany");
        map.put("BMW", "Germany");
        map.put("BMW", "Germany");
        map.put("Mercedes", "Germany");
        map.put("VolksWagen", "Germany");
        map.put("Mercedes", "Germany");
        map.put("Tesla", "USA");

        map.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " " + entry.getValue()));
    }
}
