package io.codelex.tests.filereadingandwriting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterApp {

    private static final String PATH_TO_APP = "/Users/kristapsozols/home-exercises/home-exercises" +
            "/home-exercises-05-2022/src/main/java/io/codelex/tests/filereadingandwriting/";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + "text.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + "newtext.txt"));

        String line;
        List<String> fileContent = new ArrayList<>();
        while ((line = in.readLine()) != null) {
            fileContent.add(line);
        }

        while (!fileContent.isEmpty()) {
            out.write(fileContent.get(fileContent.size() - 1) + "\n");
            fileContent.remove(fileContent.size() - 1);
        }
        in.close();
        out.close();

    }
}
