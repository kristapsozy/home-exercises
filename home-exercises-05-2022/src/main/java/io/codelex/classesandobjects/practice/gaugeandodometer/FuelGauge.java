package io.codelex.classesandobjects.practice.gaugeandodometer;

public class FuelGauge {

    private double fuel;

    FuelGauge(double fuel) {
        this.fuel = fuel;
    }


    public void currentFuelAmount() {
        System.out.println("Current fuel amount is: " + this.fuel + " liters");
    }

    public void addingFuel() {
        if (this.fuel < 70) {
            this.fuel++;
        }
    }

    public void fuelBuring() {
        if (this.fuel > 0) {
            this.fuel--;
        }
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
