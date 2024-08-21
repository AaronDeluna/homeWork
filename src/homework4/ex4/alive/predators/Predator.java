package homework4.ex4.alive.predators;

import homework4.ex4.alive.Alive;
import homework4.ex4.alive.exception.CannotAttackException;

public abstract class Predator extends Alive {

    public Predator(double weight) {
        super(weight);
    }

    public void attackLivingBeing(Alive prey) throws CannotAttackException {
        if (!this.isAlive()) {
            throw new CannotAttackException("Ошибка: Животное не может нападать");
        }

        if (prey.getWeight() > this.getWeight()) {
            this.dies();
        } else {
            double gainedWeight = prey.getWeight() / 3.0;
            prey.dies();
            this.increaseWeight(gainedWeight);
        }
    }

    protected abstract void increaseWeight(double additionalWeight);
}
