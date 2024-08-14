package homework3;

import homework3.immutableCity.City;
import homework3.immutableCity.House;
import homework3.phoneFactory.factory.IphoneFactory;
import homework3.phoneFactory.factory.SamsungFactory;
import homework3.phoneFactory.phone.Iphone;
import homework3.phoneFactory.phone.Samsung;
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
        //Зада: Иммутабельный город.
        //
        //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
        //Переопределить вывод в текст - вывод улицы и номера дома
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //1. Создать два дома, создать город с массивом созданных домов
        //2. Сделать так, чтобы у города нельзя было поменять свойства.
        //3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
        // эти изменения не затронут дом находящийся внутри города.
        // Т.е. результат должен соответствовать псевдокоду ниже:

        House[] houses = {
                new House("Ленина", 32),
                new House("Победа", 78)
        };
        City city = new City("Москва", houses);
        System.out.println(city);
        // City city = new City({new House('Lenina', 1)});
        // System.out.println(city);
        //-- City{House{street: Lenina, house: 1}}
        //House house = city.getHouses()[0];
        //house.setStreet('Kotova');
        //System.out.println(house);
        //-- House{street: Kotova, house: 1}
        //System.out.println(city);
        //-- City{House{street: Lenina, house: 1}}

    }
}