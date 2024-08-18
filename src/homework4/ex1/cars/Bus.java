package homework4.ex1.cars;

public class Bus extends Vehicle{
    private int maxPassengerCapacity;

    public Bus(int length, int height, double width, int maxPassengerCapacity) {
        super(length, height, width);
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }
}
