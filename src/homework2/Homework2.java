package homework2;

import homework2.office.Office;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        System.out.println("_______________");
        ex2();
        System.out.println("_______________");
        ex3();
        System.out.println("_______________");
        ex5();
    }

    public static void ex1() {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0, words[i].length());
            if (i < words.length - 1) {
                result += "-";
            }
        }

        System.out.println(result);
    }

    public static void ex2() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
            leftDownToRightUpSum += arrayOfNumbers[i][arrayOfNumbers.length - 1 - i];
        }

        System.out.println(leftUpToRightDownSum);
        System.out.println(leftDownToRightUpSum);
    }

    public static void ex3() {
        Random random = new Random(1);
        int number = 0;
        int count = 0;

        while (number != 999) {
            number = random.nextInt(1000);
            count++;
        }

        System.out.printf("Число 999 получилось сгенерировать с %s попытки\n", count);
    }

    public static void ex4() {
        //Создать пакет office.
        //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
        //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
        //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
        //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
        //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
        //Охранник обладает именем. Просит выдать ему аванс.
        //В офисе есть метод рабочий день:
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        //Создать класс Runner, в котором:
        //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
        //Секретаря.
        //Создать офис
        //Запустить рабочий день в офисе
    }

    /**
     * Для продвинутых
     */
    public static void ex5() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
