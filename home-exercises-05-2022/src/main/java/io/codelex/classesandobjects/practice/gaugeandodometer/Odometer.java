package io.codelex.classesandobjects.practice.gaugeandodometer;

public class Odometer {
    int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public void currentMileage() {
        System.out.println("Current mileage is: " + this.mileage + " km");
    }

    public void incrementingOdometer() {
        if (mileage < 1000000) {
            this.mileage++;
        } else {
            this.mileage = 0;
        }
    }


}
