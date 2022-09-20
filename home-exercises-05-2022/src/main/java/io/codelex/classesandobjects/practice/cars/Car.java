package io.codelex.classesandobjects.practice.cars;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;

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
        return calculateConsumption() > 15.00;
    }

    public boolean economyCar() {
        return calculateConsumption() < 5.00;
    }

    public void fillUp(int mileage, double liters) {
        this.endKilometers = mileage;
        this.liters = liters;
    }
}
