package io.codelex.collections.examples.practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    private static final String file = "src/main/java/io/codelex/collections/examples/lear.txt";

    public static void main(String[] args) throws IOException {
        StringBuilder sb = readFile(file);
        String text = String.valueOf(sb);
        Map<String, Integer> map = new HashMap<>();
        map.put("Lines", text.split("\n").length);
        map.put("Words", text.split(" ").length);
        map.put("Chars", text.replaceAll(" ", "").split("").length);

        map.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " = " + entry.getValue()));
    }

    public static StringBuilder readFile(String file) throws IOException {
        File txtFile = new File(file);
        Path path = Path.of(txtFile.getAbsolutePath());
        Scanner scanner = new Scanner(path);
        StringBuilder sb = new StringBuilder();

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
            sb.append("\n");

        }
        return sb;
    }

}
