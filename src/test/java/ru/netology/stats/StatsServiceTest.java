package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumOfAllSales() {  // сумма всех продаж
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageMonthlySales() { // средняя сумма всех продаж
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxMonthNumber() { // номер месяца с максимальными продажами нумеруются с 1
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void minMonthNumber() {  // номер месяца с минимальными продажами нумеруются с 1
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 9;
        int actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void numberOfMonthsBelowAverage() {  // количество месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberBelowAverage = 5;
        int actualNumberBelowAverage = service.quantityMinSales(sales);

        Assertions.assertEquals(expectedNumberBelowAverage, actualNumberBelowAverage);
    }

    @Test
    public void numberOfMonthsAboveAverage() { // количество месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberAboveAverage = 5;
        int actualNumberAboveAverage = service.quantityMaxSales(sales);

        Assertions.assertEquals(expectedNumberAboveAverage, actualNumberAboveAverage);
    }
}