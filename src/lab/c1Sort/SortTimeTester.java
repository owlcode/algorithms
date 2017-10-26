package lab.c1Sort;

import lab.Main;
import lab.Out;
import lab.c1Sort.Interface.IListSorter;
import lab.c1Sort.Model.Krzeslo;
import lab.c1Sort.Model.Mebel;
import lab.c1Sort.Model.Stol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SortTimeTester {
    private static int[] testCases = new int[]{4000, 7000, 10000, 20000, 30000, 40000, 50000, 70000};

    public static void insertSortTestAndPrint() {
        Out.std("InsertSort (l. obiektów, średni, pesymistyczny, optymistyczny) \n");

        for (int testCase : testCases) {
            Out.std(testCase + "\t");
            Out.std(SortTimeTester.insertSortRandomValuesDuration(testCase) + "\t");
            Out.std(SortTimeTester.insertSortPesimisticValuesDuration(testCase) + "\t");
            Out.std(SortTimeTester.insertSortOptimisticValuesDuration(testCase) + "\t");
            Out.std("\n");
        }
    }

    public static void bubbleSortTestAndPrint() {
        Out.std("BubbleSort (l. obiektów, czas w milisekundach) \n");
        for (int testCase : testCases) {
            Out.std(testCase + "\t");
            Out.std(SortTimeTester.bubbleSortRandomValuesDuration(testCase) + "\t");
            Out.std(SortTimeTester.bubbleSortPesimisticValuesDuration(testCase) + "\t");
            Out.std(SortTimeTester.bubbleSortOptimisticValuesDuration(testCase) + "\t");
            Out.std("\n");
        }
    }
    private static long insertSortRandomValuesDuration(int size) {
        InsertSort<Mebel> insertSort = new InsertSort<>();
        return SortTimeTester.generateRandomData(insertSort, size);
    }

    private static long insertSortPesimisticValuesDuration(int size) {
        InsertSort<Mebel> insertSort = new InsertSort<>();
        List<Mebel> list = new ArrayList<Mebel>();

        for (int i = 0; i < size; i++) {
            list.add(SortTimeTester.generateRandomEntity(size - i));
        }

        return SortTimeTester.measureSortTime(insertSort, list);
    }

    private static long insertSortOptimisticValuesDuration(int size) {
        InsertSort<Mebel> insertSort = new InsertSort<>();
        List<Mebel> list = new ArrayList<Mebel>();

        for (int i = 0; i < size; i++) {
            list.add(SortTimeTester.generateRandomEntity(i));
        }

        return SortTimeTester.measureSortTime(insertSort, list);
    }

    private static long bubbleSortPesimisticValuesDuration(int size) {
        InsertSort<Mebel> bubbleSort = new InsertSort<>();
        List<Mebel> list = new ArrayList<Mebel>();

        for (int i = 0; i < size; i++) {
            list.add(SortTimeTester.generateRandomEntity(size - i));
        }

        return SortTimeTester.measureSortTime(bubbleSort, list);
    }

    private static long bubbleSortOptimisticValuesDuration(int size) {
        InsertSort<Mebel> bubbleSort = new InsertSort<>();
        List<Mebel> list = new ArrayList<Mebel>();

        for (int i = 0; i < size; i++) {
            list.add(SortTimeTester.generateRandomEntity(i));
        }

        return SortTimeTester.measureSortTime(bubbleSort, list);
    }

    private static long bubbleSortRandomValuesDuration(int size) {
        BubbleSort<Mebel> bubbleSort = new BubbleSort<>();
        return SortTimeTester.generateRandomData(bubbleSort, size);
    }

    private static long generateRandomData(IListSorter sorter, int size) {
        List<Mebel> list = new ArrayList<Mebel>();

        for (int i = 0; i < size; i++) {
            list.add(SortTimeTester.generateRandomEntity());
        }

        return SortTimeTester.measureSortTime(sorter, list);
    }

    private static Mebel generateRandomEntity() {
        Random generator = new Random();

        if (generator.nextBoolean()) {
            return new Krzeslo(generator.nextInt());
        } else {
            return new Stol(generator.nextInt());
        }
    }

    private static Mebel generateRandomEntity(int n) {
        Random generator = new Random();

        if (generator.nextBoolean()) {
            return new Krzeslo(n);
        } else {
            return new Stol(n);
        }
    }

    private static long measureSortTime(IListSorter sorter, List<Mebel> list) {
        long start = System.nanoTime();

        sorter.sort(list);

        return TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS);
    }
}
