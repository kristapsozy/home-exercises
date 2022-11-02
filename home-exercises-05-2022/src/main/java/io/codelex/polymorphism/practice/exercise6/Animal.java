package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    public String animalName;
    public String animalType;
    public Double animalWeight;
    public int foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();

    public abstract void eatFood(Food food);

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + animalWeight + ", " + foodEaten + "]";
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }
}
