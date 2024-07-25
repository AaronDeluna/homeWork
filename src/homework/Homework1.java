package homework;

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
        double sausagePrice = 800;
        double hamPrice = 350;
        double neckPrice = 500;

        double sausageCostLessThan1000 = 412;
        double sausageCostBetween1000And2000 = 408;
        double sausageCostMoreThan2000 = 404;

        double hamCost = 275;

        double neckCostLessThan500 = 311;
        double neckCostMoreThan500 = 299;

        int sausageSold = 2000;
        int hamSold = 8511;
        int neckSold = 6988;

        double sausageIncome = sausagePrice * sausageSold;
        double hamIncome = hamPrice * hamSold;
        double neckIncome = neckPrice * neckSold;
        double totalIncome = sausageIncome + hamIncome + neckIncome;

        double sausageCost;
        if (sausageSold < 1000) {
            sausageCost = sausageCostLessThan1000;
        } else if (sausageSold < 2000) {
            sausageCost = sausageCostBetween1000And2000;
        } else {
            sausageCost = sausageCostMoreThan2000;
        }

        double neckCost;
        if (neckSold < 500) {
            neckCost = neckCostLessThan500;
        } else {
            neckCost = neckCostMoreThan500;
        }

        double totalCost = (sausageCost * sausageSold) + (hamCost * hamSold) + (neckCost * neckSold) + 1_000_000;

        double profitBeforeTaxes = totalIncome - totalCost;

        double taxes;
        if (profitBeforeTaxes > 2_000_000) {
            taxes = (1_000_000 * 0.08) + (1_000_000 * 0.10) + ((profitBeforeTaxes - 2_000_000) * 0.13);
        } else if (profitBeforeTaxes > 1_000_000) {
            taxes = (1_000_000 * 0.08) + ((profitBeforeTaxes - 1_000_000) * 0.10);
        } else {
            taxes = profitBeforeTaxes * 0.08;
        }

        double profitAfterTaxes = profitBeforeTaxes - taxes;

        System.out.println("Прибыль после налогов: " + profitAfterTaxes);
    }
}