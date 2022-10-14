package io.codelex.tests.joining;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoiningTest {

    @Test
    void testWithFiveIntegers() {
        Joiner<String> joiner = new Joiner<>("+");
        String result = joiner.join(1, 2, 6, 4, 2);
        Assertions.assertEquals("1+2+6+4+2", result);
    }

    @Test
    void testWithThreeStrings() {
        Joiner<String> joiner = new Joiner<>("-");
        String result = joiner.join("Mouse", "Monitor", "School");
        Assertions.assertEquals("Mouse-Monitor-School", result);
    }
}
