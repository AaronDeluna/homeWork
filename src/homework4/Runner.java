package homework4;

import homework4.ex1.CarWash;
import homework4.ex1.cars.Bus;
import homework4.ex1.cars.PassengerCar;
import homework4.ex2.Airplane;
import homework4.ex2.Duck;
import homework4.ex2.Flyable;
import homework4.ex3.*;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("\n--------------------");
        ex2();
        System.out.println("\n--------------------");
        ex3();
    }

    public static void ex1() {
        PassengerCar[] passengerCars = {
                new PassengerCar(5, 2, 1.8, true),
                new PassengerCar(5, 2, 1.8, true),
                new PassengerCar(5, 2, 1.8, true),
                new PassengerCar(5, 2, 1.8, true)
        };

        Bus[] buses = {
                new Bus(12, 3, 2.3, 20),
                new Bus(12, 3, 2.3, 20),
                new Bus(12, 3, 2.3, 20),
                new Bus(12, 3, 2.3, 20),
                new Bus(12, 3, 2.3, 20)
        };

        CarWash carWash = new CarWash();
        int totalPriceForCar = carWash.washVehicles(passengerCars);
        int totalPriceForBus = carWash.washVehicles(buses);

        System.out.println("За мойку машин заплатит мерия: " + totalPriceForCar);
        System.out.println("За мойку автобусов: " + totalPriceForBus);
    }

    public static void ex2() {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);
        Flyable[] flyables = {duck1, duck2, airplane1, airplane2};
        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void ex3() {
        MakingSound human = new Human();
        MakingSound builder = new Builder();
        MakingSound driver = new Driver();
        MakingSound bird = new Bird();
        MakingSound[] makingSounds = {human, builder, driver, bird};
        for (MakingSound object : makingSounds) {
            System.out.println(object.makeSound());
        }
    }

    public static void ex4() {
        //Готово в папке ex4 - Runner
    }
}