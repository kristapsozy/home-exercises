package io.codelex.tests.partof;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PartOfApp {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percentage = partOf(names, name -> name.length() > 4);
        System.out.println(percentage);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent);

    }

    public static <T> double partOf(List<T> list, Predicate<T> function) {
        double matching = list.stream().filter(function).count();
        return matching / list.size();
    }
}
