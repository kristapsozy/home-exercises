package io.codelex.polymorphism.practice.exercise1;

public class Mazda implements Car {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 6;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 6;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
