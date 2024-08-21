package homework4.ex4.alive.predators;

import homework4.ex4.alive.Alive;
import homework4.ex4.alive.exceptions.CannotAttackException;

public class Tiger extends Predator {

    private static final int COEFFICIENT_WEIGHT = 3;

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public void attackLivingBeing(Alive prey) throws CannotAttackException {
        if (!this.isAlive()) {
            throw new CannotAttackException("Животное не может нападать");
        }

        if (prey.getWeight() > this.getWeight() * 2) {
            this.dies();
        } else {
            double gainedWeight = prey.getWeight() / COEFFICIENT_WEIGHT;
            prey.dies();
            this.increaseWeight(gainedWeight);
        }
    }

    @Override
    protected void increaseWeight(double additionalWeight) {
        double newWeight = this.getWeight() + additionalWeight;
        this.setWeight(newWeight);
    }
}
