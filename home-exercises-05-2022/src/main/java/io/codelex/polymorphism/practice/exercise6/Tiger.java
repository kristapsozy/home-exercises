package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {
    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!");
    }

    @Override
    public void eatFood(Food food) {
        if (food.getClass().getSimpleName().equals("Vegetable")) {
            System.out.println("Tigers are not eating that type of food!");
        } else {
            foodEaten += food.getQuantity();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
