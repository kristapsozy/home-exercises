package io.codelex.polymorphism.practice.exercise6;

public abstract class Felime extends Mammal {
    public Felime(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
