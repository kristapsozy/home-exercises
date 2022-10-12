package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO - search for StreamsExerciseTest and make all tests pass
 */
public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(n -> (int) Math.sqrt(n)).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(u -> u.getAge()).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(user -> user.getAge()).toList().stream().distinct().toList();
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream().limit(2).toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(user -> user.getAge() > 25).count();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(str -> str.toUpperCase()).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().mapToInt(i -> i.intValue()).sum();
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream().skip(2).toList();
    }

    public static List<String> getFirstNames(List<String> names) {

        return names.stream().map(name -> name.substring(0, name.indexOf(" "))).toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream().map(c -> c.split("")).flatMap(Arrays::stream).distinct().toList();
    }


    public static String separateNamesByComma(List<User> users) {
        return users.stream().map(user -> String.valueOf(user.getName())).collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToDouble(user -> user.getAge()).average().getAsDouble();
    }

    public static Integer getMaxAge(List<User> users) {

        return users.stream().max(Comparator.comparing(user -> user.getAge())).get().getAge();
    }

    public static Integer getMinAge(List<User> users) {

        return users.stream().min(Comparator.comparing(user -> user.getAge())).get().getAge();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale,
                Collectors.mapping(user -> user, Collectors.toList())));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {

        return users.stream().collect(Collectors.groupingBy(User::getAge,
                Collectors.mapping(user -> user, Collectors.toList())));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale,
                Collectors.groupingBy(User::getAge,
                        Collectors.mapping(user -> user, Collectors.toList()))));

    }

    public static Map<Boolean, Long> countGender(List<User> users) {

        return users.stream().collect(Collectors.groupingBy(User::isMale,
                Collectors.mapping(user -> user, Collectors.counting())));
    }

    public static boolean anyMatch(List<User> users, int age) {

        return users.stream().anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {

        return users.stream().anyMatch(user -> user.getAge() != age);
    }

    public static Optional<User> findAny(List<User> users, String name) {

        return users.stream().filter(user -> user.getName().equals(name)).findFirst();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(user -> user.getAge())).toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();

    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return IntStream.rangeClosed(2, 100).boxed().filter(i -> isPrime(i)).limit(10).toList();
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random().ints(0, 1000).limit(10).boxed().toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
    }
}
