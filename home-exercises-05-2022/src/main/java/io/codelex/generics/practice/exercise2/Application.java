package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("word");
        System.out.println(concatenate(stringList));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        System.out.println(concatenate(integerList));

        List<Object> objectList = new ArrayList<>();
        Object obj = new Object();
        objectList.add(obj);
        System.out.println(concatenate(objectList));


    }

    public static <E> String concatenate(List<E> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        } else if (list.get(0) instanceof Object) {
            result = "Object";
            separator = "-";

        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }
}
