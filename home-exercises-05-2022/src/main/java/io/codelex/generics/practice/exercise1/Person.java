package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private int age;
    private String name;

    private List<Person> personList;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.personList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void add(int i, Person el) {
        personList.add(i, el);
    }

    public Person get(int i) {
        return personList.get(i);
    }
}
