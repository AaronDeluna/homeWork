package homework4.ex1.cars;

public abstract class Vehicle {
    private boolean isClean;
    private int length;
    private int height;
    private double width;

    public Vehicle(int length, int height, double width) {
        this.isClean = false;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
