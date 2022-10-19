package io.codelex.tests.joining;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {

    private String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public <V> String join(V... values) {
        return Arrays.stream(values)
                .map(v -> String.valueOf(v))
                .collect(Collectors.joining(seperator));
    }
}
