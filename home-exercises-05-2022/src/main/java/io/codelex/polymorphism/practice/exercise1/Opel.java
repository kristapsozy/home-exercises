package io.codelex.polymorphism.practice.exercise1;

public class Opel implements CarWithBoost {

    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 4;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 4;
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
    public void useNitrousOxideEngine() {
        currentSpeed += 32;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    public Integer getCurrentSpeed() {
        return currentSpeed;
    }
}
