package homework4.ex4;

import homework4.ex4.alive.herbivores.Elephant;
import homework4.ex4.alive.herbivores.Rabbit;
import homework4.ex4.alive.predators.Tiger;
import homework4.ex4.alive.predators.Wolf;

public class Runner {
    public static void main(String[] args) {

        Tiger tiger = new Tiger(300);
        Wolf wolf = new Wolf(50);
        Rabbit rabbit = new Rabbit(2);
        Elephant elephant = new Elephant(2000);

        try {
            rabbit.rabbitRun();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            wolf.attackLivingBeing(rabbit);
            System.out.println("Волк ест кролика");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attackLivingBeing(wolf);
            System.out.println("Тигр ест волка");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            tiger.attackLivingBeing(elephant);
            System.out.println("Тигр пытается съесть слона");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            elephant.elephantRun();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            rabbit.rabbitRun();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
