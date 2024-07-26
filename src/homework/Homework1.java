package homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
        //Выполнил!
    }

    public static void ex2() {
        String name = "     ПЕтРов Олег Иванович     ";
        name = name.trim().toUpperCase();
        if (name.contains("ОВА")) {
            System.out.printf("Уважаемая %s", name);
        } else if (name.contains("ОВ")) {
            System.out.printf("Уважаемый %s", name);
        } else {
            System.out.printf("Неизвестное лицо %s", name);
        }
        System.out.println();
    }

    public static void ex3() {
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                fuel >= 10
                        && isEngineWork
                        && !hasErrors
                        && isWheelWork1
                        && isWheelWork2
                        && isWheelWork3
                        && isWheelWork4
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replaceFirst("this is", "those are");
        int firstOIndex = simply.indexOf('o');
        int secondOIndex = simply.indexOf('o', firstOIndex + 1);
        System.out.println("Индекс второй буквы 'o': " + secondOIndex);
    }


    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    public static void advanced() {
        // Данные по продуктам
        BigDecimal sausagePrice = new BigDecimal("800");
        BigDecimal hamPrice = new BigDecimal("350");
        BigDecimal neckPrice = new BigDecimal("500");

        BigDecimal sausageCostUnder1000 = new BigDecimal("412");
        BigDecimal sausageCost1000to2000 = new BigDecimal("408");
        BigDecimal sausageCostOver2000 = new BigDecimal("404");

        BigDecimal hamCost = new BigDecimal("275");

        BigDecimal neckCostUnder500 = new BigDecimal("311");
        BigDecimal neckCostOver500 = new BigDecimal("299");

        // Количество проданных продуктов
        int sausageSoldKg = 2000;
        int hamSoldKg = 8511;
        int neckSoldKg = 6988;

        // Доходы
        BigDecimal sausageIncome = sausagePrice.multiply(BigDecimal.valueOf(sausageSoldKg));
        BigDecimal hamIncome = hamPrice.multiply(BigDecimal.valueOf(hamSoldKg));
        BigDecimal neckIncome = neckPrice.multiply(BigDecimal.valueOf(neckSoldKg));

        BigDecimal totalIncome = sausageIncome.add(hamIncome).add(neckIncome);

        // Себестоимость
        BigDecimal sausageCost;
        if (sausageSoldKg < 1000) {
            sausageCost = sausageCostUnder1000;
        } else if (sausageSoldKg < 2000) {
            sausageCost = sausageCost1000to2000;
        } else {
            sausageCost = sausageCostOver2000;
        }

        BigDecimal neckCost;
        if (neckSoldKg < 500) {
            neckCost = neckCostUnder500;
        } else {
            neckCost = neckCostOver500;
        }

        BigDecimal sausageExpense = sausageCost.multiply(BigDecimal.valueOf(sausageSoldKg));
        BigDecimal hamExpense = hamCost.multiply(BigDecimal.valueOf(hamSoldKg));
        BigDecimal neckExpense = neckCost.multiply(BigDecimal.valueOf(neckSoldKg));

        BigDecimal totalExpense = sausageExpense.add(hamExpense).add(neckExpense).add(BigDecimal.valueOf(1_000_000));

        // Прибыль до налогов
        BigDecimal preTaxProfit = totalIncome.subtract(totalExpense);

        // Расчитаем налоги
        BigDecimal tax = calculateTax(preTaxProfit);

        // Прибыль после налогов
        BigDecimal postTaxProfit = preTaxProfit.subtract(tax);

        // Печать результатов
        System.out.printf("Прибыль до налогов: %s руб%n", preTaxProfit.setScale(2, RoundingMode.HALF_UP));
        System.out.printf("Налог: %s руб%n", tax.setScale(2, RoundingMode.HALF_UP));
        System.out.printf("Прибыль после налогов: %s руб%n", postTaxProfit.setScale(2, RoundingMode.HALF_UP));
    }

    private static BigDecimal calculateTax(BigDecimal profit) {
        BigDecimal tax = BigDecimal.ZERO;

        if (profit.compareTo(BigDecimal.valueOf(2_000_000)) > 0) {
            BigDecimal over2M = profit.subtract(BigDecimal.valueOf(2_000_000));
            tax = tax.add(over2M.multiply(BigDecimal.valueOf(0.13)));

            profit = BigDecimal.valueOf(2_000_000);
        }

        if (profit.compareTo(BigDecimal.valueOf(1_000_000)) > 0) {
            BigDecimal over1M = profit.subtract(BigDecimal.valueOf(1_000_000));
            tax = tax.add(over1M.multiply(BigDecimal.valueOf(0.10)));

            profit = BigDecimal.valueOf(1_000_000);
        }

        tax = tax.add(profit.multiply(BigDecimal.valueOf(0.08)));

        return tax;
    }
}