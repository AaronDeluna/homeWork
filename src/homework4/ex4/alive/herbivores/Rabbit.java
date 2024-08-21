package homework4.ex4.alive.herbivores;

import homework4.ex4.alive.exceptions.CannotRunException;

public class Rabbit extends Herbivore {

    public Rabbit(double weight) {
        super(weight);
    }

    public void rabbitRun() throws CannotRunException {
        super.canRun();
        System.out.println("Кролик быстро бежит");
    }
}
