package lab;

import lab.c1Sort.*;

public class Main {
    private static int[] testCases;

    public static void main(String[] args) {
        Main.testCases = new int[]{4000, 7000, 10000, 20000, 30000, 40000, 50000, 70000};
        Main.insertSort();
        Main.bubbleSort();
    }

    private static void insertSort() {
        Out.std("InsertSort (l. obiektów, średni, pesymistyczny, optymistyczny) \n");

        for (int i = 0; i < testCases.length; i++) {
            Out.std(testCases[i] + "\t");
            Out.std(SortTimeTester.insertSortRandomValuesDuration(testCases[i]) + "\t");
            Out.std(SortTimeTester.insertSortPesimisticValuesDuration(testCases[i]) + "\t");
            Out.std(SortTimeTester.insertSortOptimisticValuesDuration(testCases[i]) + "\t");
            Out.std("\n");
        }
    }

    private static void bubbleSort() {
        Out.std("BubbleSort (l. obiektów, czas w milisekundach) \n");
        for (int i = 0; i < testCases.length; i++) {
            Out.std(testCases[i] + "\t");
            Out.std(SortTimeTester.bubbleSortRandomValuesDuration(testCases[i]) + "\t");
            Out.std(SortTimeTester.bubbleSortPesimisticValuesDuration(testCases[i]) + "\t");
            Out.std(SortTimeTester.bubbleSortOptimisticValuesDuration(testCases[i]) + "\t");
            Out.std("\n");
        }
    }
}
