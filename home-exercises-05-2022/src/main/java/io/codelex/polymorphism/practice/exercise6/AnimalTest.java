package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnimalTest {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        String input = "";
        Food food = new Vegetable(4);

        while (true) {
            input = getInput();
            if (input.equals("End")) {
                break;
            }
            Animal animal = animalFromInput(input);

            animal.makeSound();

            String foodInput = getInput();

            animal.eatFood(foodFromInput(foodInput));

            System.out.println(animal);

            animalList.add(animal);

        }
        String joined = animalList.stream()
                .map(animal -> String.valueOf(animal))
                .collect(Collectors.joining(", "));
        System.out.println(joined);

    }

    public static Animal animalFromInput(String input) {
        String[] inputArr = input.split(" ");
        if (inputArr[0].equals("Cat")) {
            return new Cat(inputArr[1], inputArr[0], Double.parseDouble(inputArr[2]), inputArr[3], inputArr[4]);
        } else if (inputArr[0].equals("Tiger")) {
            return new Tiger(inputArr[1], inputArr[0], Double.parseDouble(inputArr[2]), inputArr[3]);
        } else if (inputArr[0].equals("Mouse")) {
            return new Mouse(inputArr[1], inputArr[0], Double.parseDouble(inputArr[2]), inputArr[3]);
        } else if (inputArr[0].equals("Zebra")) {
            return new Zebra(inputArr[1], inputArr[0], Double.parseDouble(inputArr[2]), inputArr[3]);
        }
        return null;

    }

    public static String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public static Food foodFromInput(String input) {
        String[] inputArr = input.split(" ");
        if (inputArr[0].equals("Vegetable")) {
            return new Vegetable(Integer.parseInt(inputArr[1]));
        }
        return new Meat(Integer.parseInt(inputArr[1]));

    }
}
