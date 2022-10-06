package io.codelex.exceptions.practice;

public class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException() {

    }

    public NonPositiveNumberException(String message) {
        super(message);
    }
}
