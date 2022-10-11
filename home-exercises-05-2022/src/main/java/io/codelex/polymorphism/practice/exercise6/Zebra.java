package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Brrrrr");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            foodEaten += food.getQuantity();
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
