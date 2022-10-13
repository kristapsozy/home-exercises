package io.codelex.generics.practice.exercise1;

public class Elephant extends Animal {

    public Elephant(int age, int weight, String livingRegion) {
        super(age, weight, livingRegion);
    }

    @Override
    public String toString() {
        return "Elephant" + super.toString();
    }
}
