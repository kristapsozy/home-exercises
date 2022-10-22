package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("/ by zero");
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("/ by zero");
        }

    }

    public static void methodC() throws ArithmeticException {
        try {
            int result = 2 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("/ by zero");
        }
    }
}
