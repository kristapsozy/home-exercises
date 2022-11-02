package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    public String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }


    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }
}
