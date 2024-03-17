package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long allSales(long[] sales) {
        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        return total;
    }

    public double averageSales(long[] sales) {
        double average = allSales(sales) / sales.length;
        return average;
    }

    public int lessMonth(long[] sales) {
        int count = 0;
        double averegeSum = averageSales(sales);
        for (long sale : sales) {
            if (sale < averegeSum) {
                count++;
            }
        }
        return count;
    }
    public int higherMonth(long[] sales) {
        int count = 0;
        double averegeSum = averageSales(sales);
        for (long sale : sales) {
            if (sale > averegeSum) {
                count++;
            }
        }
        return count;
    }
}

