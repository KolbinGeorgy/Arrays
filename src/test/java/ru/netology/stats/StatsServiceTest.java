package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual;
        actual = service.calculateSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void averageAmountSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual;
        actual = (int) service.calcAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void numberMonthSalesMaxAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual;
        actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void numberMonthSalesMinAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual;
        actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void belowAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual;
        actual = service.belowAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void aboveAverageSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual;
        actual = service.aboveAverageSum(sales);

        Assertions.assertEquals(expected, actual);

    }
}