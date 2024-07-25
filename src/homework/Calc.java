package homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");
        String operation = scanner.nextLine();
        double b = scanner.nextDouble();

        if (operation.equals("+")) {
            System.out.printf("%s + %s = %s", a, b, a + b);
        } else if (operation.equals("-")) {
            System.out.printf("%s - %s = %s", a, b, a - b);
        } else if (operation.equals("*")) {
            System.out.printf("%s * %s = %s", a, b, a * b);
        } else if (operation.equals("/")) {
            System.out.printf("%s / %s = %s", a, b, a / b);
        } else {
            System.out.println("Ошибка");
        }

        scanner.close();
    }
}
