package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Pii Pii");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            foodEaten += food.getQuantity();
        } else {
            System.out.println("Mouses are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
