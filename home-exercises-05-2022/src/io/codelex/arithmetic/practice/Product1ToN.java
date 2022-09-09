package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int productOfInt = 1; //It is the same as factorial N
        for(int i = 1; i <= 10; i++) {
            productOfInt *= i;
        }
        System.out.println(productOfInt);
    }
}
