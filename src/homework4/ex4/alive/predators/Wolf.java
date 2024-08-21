package homework4.ex4.alive.predators;

import homework4.ex4.alive.Alive;
import homework4.ex4.alive.exception.CannotAttackException;

public class Wolf extends Predator {

    public Wolf(double weight) {
        super(weight);
    }

    @Override
    protected void increaseWeight(double additionalWeight) {
        double newWeight = this.getWeight() + additionalWeight;
        this.setWeight(newWeight);
    }
}
