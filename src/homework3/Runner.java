package homework3;

import homework3.immutable.city.City;
import homework3.immutable.city.House;
import homework3.phone.factory.factory.IphoneFactory;
import homework3.phone.factory.factory.SamsungFactory;
import homework3.phone.factory.phone.Iphone;
import homework3.phone.factory.phone.Samsung;
import homework3.pyramid.Pyramid1;

public class Runner {
    public static void main(String[] args) {
        //В этом дз уже будет проверятся наличие корректных модификаторов доступа
        //у классов, атрибутов, методов
        ex2();
        System.out.println("-------------------");
        ex3();
        System.out.println("-------------------");
        ex4();
    }

    public static void ex1() {
        //Готово !
    }

    public static void ex2() {
        Samsung samsung = SamsungFactory.createSamsung();
        Iphone iphone = IphoneFactory.createIphone();

        samsung.takePhoto();
        iphone.takePhoto();
        iphone.printProcessorInfo();
    }

    public static void ex3() {
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    /**
     * Для продвинутых
     */
    public static void ex4() {
        House[] houses = {
                new House("Ленина", 32),
                new House("Победа", 78)
        };
        City city = new City("Москва", houses);
        System.out.println(city);
    }
}