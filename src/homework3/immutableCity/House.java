package homework3.immutableCity;

public class House {
    private String streetName;
    private int houseNumber;

    public House(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public House(House house) {
        this.streetName = house.streetName;
        this.houseNumber = house.houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
