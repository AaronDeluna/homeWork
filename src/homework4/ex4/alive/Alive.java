package homework4.ex4.alive;

public abstract class Alive {
    private boolean isAlive;
    private double weight;

    public Alive(double weight) {
        this.isAlive = true;
        this.weight = weight;
    }

    public void dies() {
        this.isAlive = false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
