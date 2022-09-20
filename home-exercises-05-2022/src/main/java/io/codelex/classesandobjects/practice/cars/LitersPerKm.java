package io.codelex.classesandobjects.practice.cars;

import java.util.Scanner;

public class LitersPerKm {
    public static void main(String[] args) {
        Car car = getCarData();

        Scanner scan = new Scanner(System.in);
        System.out.println("Fill up, enter milage: ");
        int mileage = scan.nextInt();
        System.out.println("Fill up, enter liters: ");
        double liters = scan.nextDouble();

        car.fillUp(mileage, liters);
        System.out.println("Kilometers per liter are " + car.calculateConsumption());


    }

    private static Car getCarData() {
        Scanner scan = new Scanner(System.in);
        double startKilometers;
        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();
        return new Car(startKilometers);
    }
}