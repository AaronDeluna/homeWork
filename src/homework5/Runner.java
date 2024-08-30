package homework5;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    private static final int COUNTRY_NAME = 0;
    private static final int DONATION_FROM_COUNTRY = 1;

    public static void main(String[] args) throws FileNotFoundException {
        ex1();
        System.out.println("---------------------");
    }

    private static void ex1() {
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        BigDecimal[] totalSums = new BigDecimal[countries.length];

        Arrays.fill(totalSums, BigDecimal.ZERO);

        String filename = "donation.csv";
        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));

        while (scanner.hasNext()) {
            String[] donationInfo = scanner.nextLine().split(";");

            for (int i = 0; i < countries.length; i++) {
                if (countries[i].equals(donationInfo[COUNTRY_NAME])) {
                    try {
                        BigDecimal donationSum = new BigDecimal(
                                donationInfo[DONATION_FROM_COUNTRY].replace(',', '.')
                        );
                        totalSums[i] = totalSums[i].add(donationSum);
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }

        scanner.close();

        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i] + " - " + totalSums[i]);
        }
    }

    private static void ex2() {

        //Сделать компьютерного шпиона
        //Смысл задания - отслеживать действия реального объекта и записывать их в лог
        //Создать компьютер:
        //1. Компьютер хранит в себе пользователя, который вошел в компьютер
        //2. Компьютер умеет:
        //2.1. Делать вход пользователя (на вход имя пользователя).
        // Изменяет пользователя, который зашел в компьютер
        //2.2 Делать выход пользователя. Удаляет пользователя из системы
        //2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        //Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        //Сделать так, чтобы при вызове методов компьютерного шпиона:
        //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        //2. При выходе делалась запись в comp.log "Пользователь вышел"
        //3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
    }
}
