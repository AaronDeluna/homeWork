package homework4.ex4.alive.herbivores;

import homework4.ex4.alive.Alive;
import homework4.ex4.alive.exceptions.CannotRunException;

public abstract class Herbivore extends Alive {

    public Herbivore(double weight) {
        super(weight);
    }

    public void canRun() throws CannotRunException {
        if (!this.isAlive()) {
            throw new CannotRunException("Ошибка: Животное не может бегать");
        }
    }
}
