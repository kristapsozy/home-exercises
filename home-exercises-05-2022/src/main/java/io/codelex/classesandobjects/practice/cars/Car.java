package io.codelex.classesandobjects.practice.cars;

public class Car {
    private double startKilometers;
    private double endKilometers;
    private double liters;
    private static final double HIGH_CONSUMPTION = 15.00;
    private static final double LOW_CONSUMPTION = 5.00;

    public double getStartKilometers() {
        return startKilometers;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
        this.endKilometers = startKilometers;
        this.liters = 0;

    }

    public double calculateConsumption() {
        return (liters * 100) / (endKilometers - startKilometers);
    }

    public boolean gasHog() {
        return calculateConsumption() > HIGH_CONSUMPTION;
    }

    public boolean economyCar() {
        return calculateConsumption() < LOW_CONSUMPTION;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
