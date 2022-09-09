package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input distance in meters:");
        int meters = in.nextInt();

        System.out.println("Please input time taken in hours:");
        int hours = in.nextInt();

        System.out.println("Please input time taken in minutes::");
        int minutes = in.nextInt();

        System.out.println("Please input time taken in seconds:");
        int seconds = in.nextInt();

        int totalTimeInSeconds = (hours*60*60)+(minutes*60) + seconds;

        double speedMetersInSeconds = (double) meters / (double) totalTimeInSeconds;
        double speedKmInHour = speedMetersInSeconds * 3.6;
        double speedMilesInHour = speedKmInHour * 0.62137119223733;
        System.out.println("Your speed in meters/second is: " +speedMetersInSeconds);
        System.out.println("Your speed in km/h is: " +speedKmInHour);
        System.out.println("Your speed in miles/h is: " +speedMilesInHour);
    }
}
