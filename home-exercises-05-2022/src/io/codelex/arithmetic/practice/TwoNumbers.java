package io.codelex.arithmetic.practice;

public class TwoNumbers {
    static void twoNumbersSumOrDifferenceIsFifteen(int x, int y) {
        if ((x | y) == 15 | (x + y) == 15 | Math.abs(x-y) == 15) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        twoNumbersSumOrDifferenceIsFifteen(30,45);
    }
}
