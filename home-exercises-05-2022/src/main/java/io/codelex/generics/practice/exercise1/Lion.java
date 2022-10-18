package io.codelex.generics.practice.exercise1;

public class Lion extends Animal {
    public Lion(int age, int weight, String livingRegion) {
        super(age, weight, livingRegion);
    }

    @Override
    public String toString() {
        return "Lion" + super.toString();
    }
}
