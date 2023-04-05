package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sumMonth = 0; // сумма начальная

        for (int i = 0; i < sales.length; i++) {
            sumMonth += sales[i]; // сумма всех продаж
        }

        return sumMonth; // сумма всех продаж
    }

    public int averageSumSales(int[] sales) {
        int sumMonth = 0; // сумма начальная

        for (int i = 0; i < sales.length; i++) {
            sumMonth += sales[i]; // сумма за все месяцы
        }
        int averageSum = sumMonth / sales.length; // средняя сумма

        return averageSum; // средняя сумма всех продаж
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int quantityMinSales(int[] sales) {
        int quantityMin = 0; // количество месяцев, в которых продажи были ниже среднего
        int sumMonth = 0; // сумма начальная

        for (int i = 0; i < sales.length; i++) {
            sumMonth += sales[i]; // сумма за все месяцы
        }
        int averageSum = sumMonth / sales.length; // средняя сумма

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) { // значит, в рассматриваемом i-м месяце продажи были ниже среднего
                quantityMin = quantityMin + 1; // прибавим 1 месяц
            }
        }

        return quantityMin; // количество месяцев, в которых продажи были ниже среднего
    }

    public int quantityMaxSales(int[] sales) {
        int quantityMax = 0; // количество месяцев, в которых продажи были выше среднего
        int sumMonth = 0; // сумма начальная

        for (int i = 0; i < sales.length; i++) {
            sumMonth += sales[i]; // сумма за все месяцы
        }
        int averageSum = sumMonth / sales.length; // средняя сумма

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) { // значит, в рассматриваемом i-м месяце продажи были выше среднего
                quantityMax = quantityMax + 1; // прибавим 1 месяц
            }
        }

        return quantityMax; // количество месяцев, в которых продажи были выше среднего
    }


}