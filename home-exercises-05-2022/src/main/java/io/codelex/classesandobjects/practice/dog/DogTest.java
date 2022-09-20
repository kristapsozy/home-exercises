package io.codelex.classesandobjects.practice.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", "male", "Lady", "Rocky");
        Dog dog1 = new Dog("Rocky", "male", "Molly", "Sam");
        Dog dog2 = new Dog("Sparky", "male");
        Dog dog3 = new Dog("Buster", "male", "Lady", "Sparky");
        Dog dog4 = new Dog("Sam", "male");
        Dog dog5 = new Dog("Lady", "female");
        Dog dog6 = new Dog("Molly", "female");
        Dog dog7 = new Dog("Coco", "female", "Molly", "Buster");

        System.out.println(dog7.fathersName());
        System.out.println(dog2.fathersName());
        System.out.println(dog7.hasSameMotherAs(dog1));
    }
}
