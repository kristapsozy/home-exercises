package io.codelex.flowcontrol.practice;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        int[] arr = {num1, num2, num3};
        Arrays.sort(arr);
        System.out.println("Max number is: " + arr[arr.length-1]);


        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
    }

}
