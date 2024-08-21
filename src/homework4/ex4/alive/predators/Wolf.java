package homework4.ex4.alive.predators;

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
