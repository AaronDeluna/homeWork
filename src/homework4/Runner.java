package homework4;

import homework4.ex1.CarWash;
import homework4.ex1.cars.Bus;
import homework4.ex1.cars.PassengerCar;
import homework4.ex2.Airplane;
import homework4.ex2.Duck;
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

        System.out.printf("За мойку машин заплатит мерия: %s" +
                "\nЗа мойку автобусов: %s", totalPriceForCar, totalPriceForBus);
    }

    public static void ex2() {
        Duck duck1 = new Duck(false);

        try {
            duck1.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Duck duck2 = new Duck(true);

        try {
            duck2.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Самолет

        Airplane airplane1 = new Airplane(10);

        try {
            airplane1.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Airplane airplane2 = new Airplane(-1);

        try {
            airplane2.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ex3() {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        MakingSound[] makingSounds = new MakingSound[4];
        makingSounds[0] = human;
        makingSounds[1] = builder;
        makingSounds[2] = driver;
        makingSounds[3] = bird;

        for (MakingSound makingSound : makingSounds) {
            makingSound.makeSound();
        }
    }

    public static void ex4() {
        //Готово в папке ex4 - Runner
    }
}