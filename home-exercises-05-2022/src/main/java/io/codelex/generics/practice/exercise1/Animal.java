package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    private int age;

    private int weight;

    private String livingRegion;

    private List<Animal> animalList;

    public Animal(int age, int weight, String livingRegion) {
        this.age = age;
        this.weight = weight;
        this.livingRegion = livingRegion;
        this.animalList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "{age=" + age +
                ", weight=" + weight +
                ", livingRegion='" + livingRegion + '\'' +
                '}';
    }

    public void add(int i, Animal el) {
        animalList.add(i, el);
    }

    public Animal get(int i) {
        return animalList.get(i);
    }
}
