package io.codelex.collections.examples.practice;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.*;

public class Histogram {
    private static final String file = "src/main/java/io/codelex/collections/examples/practice/examscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {

        List<Integer> list = readFileToIntegerList();

        Map<String, String> histogram = new LinkedHashMap<>();
        histogram.put("00-09", "*".repeat(getRangeCount(list, 0, 9)));
        histogram.put("10-19", "*".repeat(getRangeCount(list, 10, 19)));
        histogram.put("20-29", "*".repeat(getRangeCount(list, 20, 29)));
        histogram.put("30-39", "*".repeat(getRangeCount(list, 30, 39)));
        histogram.put("40-49", "*".repeat(getRangeCount(list, 40, 49)));
        histogram.put("50-59", "*".repeat(getRangeCount(list, 50, 59)));
        histogram.put("60-69", "*".repeat(getRangeCount(list, 60, 69)));
        histogram.put("70-79", "*".repeat(getRangeCount(list, 70, 79)));
        histogram.put("80-89", "*".repeat(getRangeCount(list, 80, 89)));
        histogram.put("90-99", "*".repeat(getRangeCount(list, 90, 99)));
        histogram.put("100", "*".repeat(getRangeCount(list, 100, 100)));

        histogram.forEach((key, value) -> System.out.printf("%5s: %s\n", key, value));

    }

    public static int getRangeCount(List<Integer> list, int start, int end) {
        return (int) list.stream().filter(number -> number >= start && number <= end).count();
    }

    public static List<Integer> readFileToIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        File txtFile = new File(file);
        Path path = Path.of(txtFile.getAbsolutePath());
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            list.add(Integer.parseInt(scanner.nextLine()));
        }
        return list;
    }

}
