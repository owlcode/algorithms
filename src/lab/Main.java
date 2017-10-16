package lab;

import lab.c1Sort.*;

public class Main {
    public static void main(String[] args) {
        Main.sortingLab();
        Main.heapSort();
    }

    private static void heapSort() {
//        HeapSort heapSort = new HeapSort();
//        double[] input = new double[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
//
//        Out.std("HeapSort\n");
//        Out.std(input);
//        Out.std(heapSort.sort(input));
    }

    private static void sortingLab() {
        Out.std("Cwiczenie 1 - 2017\n");
        Out.std("InsertSort (l. obiektów, czas w milisekundach) \n");
        int[] cases = new int[]{4000, 7000, 10000, 20000, 30000, 40000, 50000, 70000};

        for (int i = 0; i < cases.length; i++) {
            Out.std(cases[i] + "\t");
            Out.std(SortTimeTester.insertSortRandomValuesDuration(cases[i]));
            Out.std(" \n");
        }

        Out.std("BubbleSort (l. obiektów, czas w milisekundach) \n");
        for (int i = 0; i < cases.length; i++) {
            Out.std(cases[i] + "\t");
            Out.std(SortTimeTester.bubbleSortRandomValuesDuration(cases[i]));
            Out.std("\n");
        }
    }
}
