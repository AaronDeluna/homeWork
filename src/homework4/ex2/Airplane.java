package homework4.ex2;

import homework4.ex2.exceptions.FlyException;

public class Airplane implements Flyable{
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
        System.out.println("Самолет летит");
    }
}
