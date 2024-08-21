package homework4.ex4.alive.herbivores;

import homework4.ex4.alive.exception.CannotRunException;

public class Elephant extends Herbivore {

    public Elephant(double weight) {
        super(weight);
    }

    public void elephantRun() throws CannotRunException {
       super.canRun();
       System.out.println("Слон медленно бежит");
    }
}
