package io.codelex.classesandobjects.practice.gaugeandodometer;

public class FuelGaugeTest {
    public static void main(String[] args) {
        Odometer odometer = new Odometer(10000);
        FuelGauge fuelGauge = new FuelGauge(10);
        int count = 0;

        while (fuelGauge.fuel < 70) {
            fuelGauge.addingFuel();
        }
        fuelGauge.currentFuelAmount();

        while (fuelGauge.fuel > 0) {
            odometer.incrementingOdometer();
            count++;
            if (count % 10 == 0) {
                fuelGauge.fuelBuring();
            }
            odometer.currentMileage();
            fuelGauge.currentFuelAmount();
        }


    }
}
