package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public long calculateSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public long calculateAverageSales(long[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    // 3. Номер месяца с максимальными продажами (последний из максимальных)
    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1; // Месяцы нумеруются с 1
    }

    // 4. Номер месяца с минимальными продажами (последний из минимальных)
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(long[] sales) {
        long average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // 6. Количество месяцев с продажами выше среднего
    public int countMonthsAboveAverage(long[] sales) {
        long average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}