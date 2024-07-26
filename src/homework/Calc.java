package homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String operation = scanner.next();
        System.out.println("Введите второе число: ");
        double b = scanner.nextDouble();

        switch (operation) {
            case "+" -> System.out.printf("%s + %s = %s", a, b, a + b);
            case "-" -> System.out.printf("%s - %s = %s", a, b, a - b);
            case "*" -> System.out.printf("%s * %s = %s", a, b, a * b);
            case "/" -> System.out.printf("%s / %s = %s", a, b, a / b);
            default -> System.out.println("Ошибка");
        }

        scanner.close();
    }
}
