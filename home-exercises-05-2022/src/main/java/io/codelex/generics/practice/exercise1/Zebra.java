package io.codelex.generics.practice.exercise1;

public class Zebra extends Animal {
    public Zebra(int age, int weight, String livingRegion) {
        super(age, weight, livingRegion);
    }

    @Override
    public String toString() {
        return "Zebra" + super.toString();
    }
}
