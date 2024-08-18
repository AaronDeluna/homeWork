package homework4.ex1;

import homework4.ex1.cars.Vehicle;

public class CarWash {
    /**
     * Стоимость услуг
     */
    private static final int TARIFF_FOR_LARGE_VEHICLES = 4000;
    private static final int TARIFF_FOR_SMALL_SIZES = 2000;

    private static final int LENGTH = 6;
    private static final int HEIGHT = 2;
    private static final double WIDTH = 2;

    public int washVehicle(Vehicle vehicle) {
        vehicle.setClean(true);
        if (vehicle.getLength() > LENGTH || vehicle.getHeight() > HEIGHT || vehicle.getWidth() > WIDTH) {
            return TARIFF_FOR_LARGE_VEHICLES;
        }

        return TARIFF_FOR_SMALL_SIZES;
    }

    public int washVehicles(Vehicle[] vehicles) {
        int totalPrice = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLength() > LENGTH || vehicle.getHeight() > HEIGHT || vehicle.getWidth() > WIDTH) {
                totalPrice += TARIFF_FOR_LARGE_VEHICLES;
            } else {
                totalPrice += TARIFF_FOR_SMALL_SIZES;
            }
        }

        return totalPrice;
    }
}
