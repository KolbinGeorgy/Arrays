package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) { //подсчет суммы всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calcAverageSum(int[] sales) {// подсчет средней суммы продаж в месяц
        long averageSum = calculateSum(sales) / sales.length;
        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverageSum(int[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего

        double averageSum = calcAverageSum(sales);
        int belowAverageSale = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            if (sale < averageSum) {
                belowAverageSale += 1; // следующий рассматриваемый месяц имеет номер на 1 больше
            }
        }
        return belowAverageSale;

    }

    public int aboveAverageSum(int[] sales) {// подсчет кол-ва месяцев, в которых продажи были выше среднего
        double averageSum = calcAverageSum(sales);
        int aboveAverageSale = 0;
        for (int sale : sales) {
            if (sale > averageSum) {
                aboveAverageSale += 1;
            }
        }
        return aboveAverageSale;
    }

}