package homework3.immutableCity;

import java.util.Arrays;

public final class City {
    private String cityName;
    private House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public House getHouse(int index) {
        if (index >= 0 && index < houses.length) {
            return new House(houses[index]);
        }
        return null;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
