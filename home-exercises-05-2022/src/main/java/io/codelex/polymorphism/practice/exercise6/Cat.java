package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(Food food) {
        foodEaten += food.getQuantity();
    }

    @Override
    public String toString() {
        return animalType + "[" + animalName + ", " + breed + ", "
                + animalWeight + ", " + livingRegion + ", " + foodEaten + "]";
    }

}
