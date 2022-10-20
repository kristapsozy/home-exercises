package io.codelex.oop.cars;

public class CarTest {
    public static void main(String[] args) {
        Manufacturer shenzen = new Manufacturer("Shenzen", 1998, "China");
        Manufacturer wolf = new Manufacturer("Wolf", 1980, "Germany");
        Manufacturer bengen = new Manufacturer("Bengen", 1973, "Estonia");
        Manufacturer tippo = new Manufacturer("Tippo", 2001, "France");

        Car audi = new Car("Audi", "A4", 20000, 1996, EngineType.V6, shenzen, wolf, bengen);
        Car bmw = new Car("BMW", "M5", 50000, 2021, EngineType.V8, wolf);
        Car fiat = new Car("Fiat", "Punto", 10000, 2010, EngineType.V12, tippo);
        Car tesla = new Car("Tesla", "ModelX", 70000, 2020, EngineType.S4, wolf, shenzen);
        Car opel = new Car("Opel", "Omega", 17000, 2018, EngineType.S4, wolf, shenzen, tippo);

        CarService carService = new CarService();
        carService.addCar(audi);
        carService.addCar(bmw);
        carService.addCar(fiat);
        carService.addCar(tesla);
        carService.removeCar(opel);

        System.out.println(carService.listOfCars());

        carService.carsWithV12Engine();

        carService.carsProducedBefore1999();

        System.out.println(carService.mostExpesniveCar());

        System.out.println(carService.cheapestCar());

        System.out.println(carService.carsWithAtLeast3Manufactuers());

        System.out.println(carService.sortedCars("descending"));

        System.out.println(carService.isCarOnTheList("audi"));

        System.out.println(carService.carsOfManufacturer(wolf));

        System.out.println(carService.carsOfManufacturerEstablishmentYearFromTheGiven(1998, Operators.MORE_THAN));


    }
}
