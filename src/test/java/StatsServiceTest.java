package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15; // 180 / 12
        long actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8; // месяц с последним максимумом 20 — индекс 7 +1
        int actual = service.findMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9; // месяц с последним минимумом 7 — индекс 8 +1
        int actual = service.findMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsBelowAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.countMonthsAboveAverage(sales);
        assertEquals(expected, actual);
    }
}