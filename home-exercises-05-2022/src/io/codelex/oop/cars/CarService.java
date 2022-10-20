package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CarService {
    List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    public List<Car> listOfCars() {
        return this.cars;
    }

    public void carsWithV12Engine() {
        cars.stream()
                .filter(car -> car.engineType.equals(EngineType.V12))
                .forEach(System.out::println);
    }

    public void carsProducedBefore1999() {
        cars.stream()
                .filter(car -> car.yearOfManufacture < 1999)
                .forEach(System.out::println);
    }

    public Car mostExpesniveCar() {
        return cars.stream()
                .max(Comparator.comparing(car -> car.price))
                .orElseThrow(NoSuchElementException::new);
    }

    public Car cheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(car -> car.price))
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Car> carsWithAtLeast3Manufactuers() {
        return cars.stream()
                .filter(car -> car.manufacturers.size() >= 3)
                .toList();
    }

    public List<Car> sortedCars(String order) {
        if (order.equals("ascending")) {
            return cars.stream()
                    .sorted(Comparator.comparing(Car::getName))
                    .toList();
        } else {
            return cars.stream()
                    .sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
                    .toList();

        }
    }

    public boolean isCarOnTheList(String carName) {
        for (Car car : cars) {
            return car.name.equalsIgnoreCase(carName);
        }
        return false;
    }

    public List<Car> carsOfManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.manufacturers.contains(manufacturer))
                .toList();
    }

    public List<Car> carsOfManufacturerEstablishmentYearFromTheGiven(int year, Operators operator) {
        if (operator.equals(Operators.MORE_THAN)) {
            return cars.stream()
                    .filter(car -> car.manufacturers.stream()
                            .anyMatch(manufacturer -> manufacturer.yearOfEstablishment > year))
                    .toList();
        } else if (operator.equals(Operators.LESS_THAN)) {
            return cars.stream()
                    .filter(car -> car.manufacturers.stream()
                            .anyMatch(manufacturer -> manufacturer.yearOfEstablishment < year))
                    .toList();
        } else if (operator.equals(Operators.EQUALS)) {
            return cars.stream()
                    .filter(car -> car.manufacturers.stream()
                            .anyMatch(manufacturer -> manufacturer.yearOfEstablishment == year))
                    .toList();
        } else if (operator.equals(Operators.NOT_EQUALS)) {
            return cars.stream()
                    .filter(car -> car.manufacturers.stream()
                            .anyMatch(manufacturer -> manufacturer.yearOfEstablishment != year))
                    .toList();
        } else if (operator.equals(Operators.LESS_OR_EQUALS_THAN)) {
            return cars.stream()
                    .filter(car -> car.manufacturers.stream()
                            .anyMatch(manufacturer -> manufacturer.yearOfEstablishment <= year))
                    .toList();
        } else if (operator.equals(Operators.MORE_OR_EQUALS_THAN)) {
            return cars.stream()
                    .filter(car -> car.manufacturers.stream()
                            .anyMatch(manufacturer -> manufacturer.yearOfEstablishment >= year))
                    .toList();
        }
        return null;
    }
}
