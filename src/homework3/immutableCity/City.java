package homework3.immutableCity;

import java.util.Arrays;

public final class City {
    private String cityName;
    private House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
