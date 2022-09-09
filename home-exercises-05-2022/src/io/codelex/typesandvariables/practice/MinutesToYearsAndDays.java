package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutesInDay = 60*24;
        int minutesInYear = minutesInDay*365;

        System.out.println("Please enter minutes: ");
        int input = in.nextInt();
        int years = input / minutesInYear;
        int remainingMinutes = input % minutesInYear;
        int days = remainingMinutes / minutesInDay;

        System.out.println("It's approximately " + years + " years and " + days + " days.");


    }
}
