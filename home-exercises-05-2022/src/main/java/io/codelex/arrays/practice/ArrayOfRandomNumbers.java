package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        Random ran = new Random();
        int myArr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            myArr[i] = ran.nextInt(1, 101);
        }
        int arrCopy[] = myArr.clone();
        myArr[myArr.length - 1] = -7;
        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(arrCopy));
    }
}
