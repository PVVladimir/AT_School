package at.school;

public class StocksOfBuckwheat {
    public static void main(String[] args) {
        final int numberOfDaysToSurvive = 12;
        final int storageCostMonthKilogram = 100;
        final int eatPerMonthKilogramAvg = 6;
        // int stocksOfBuckwheat = 100;
        int stocksOfBuckwheat = numberOfDaysToSurvive * eatPerMonthKilogramAvg;
        int buckwheatStorageCosts = stocksOfBuckwheat * storageCostMonthKilogram;
        for (; stocksOfBuckwheat > 0; ) {
            stocksOfBuckwheat -= eatPerMonthKilogramAvg;
            buckwheatStorageCosts += stocksOfBuckwheat * storageCostMonthKilogram;
        }
        System.out.println("Василий потратит " + buckwheatStorageCosts + " руб. на хранение гречки");
    }
}
