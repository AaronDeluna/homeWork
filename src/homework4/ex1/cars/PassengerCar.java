package homework4.ex1.cars;

public class PassengerCar extends Vehicle {
    private boolean hasCruiseControl;

    public PassengerCar(int length, int height, double width, boolean hasCruiseControl) {
        super(length, height, width);
        this.hasCruiseControl = hasCruiseControl;
    }

    public boolean isHasCruiseControl() {
        return hasCruiseControl;
    }

    public void setHasCruiseControl(boolean hasCruiseControl) {
        this.hasCruiseControl = hasCruiseControl;
    }
}
