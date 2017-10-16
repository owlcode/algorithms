package lab.c1Sort;

import lab.c1Sort.Interface.IListSorter;
import lab.c1Sort.Model.Krzeslo;
import lab.c1Sort.Model.Mebel;
import lab.c1Sort.Model.Stol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SortTimeTester {
    public static long insertSortRandomValuesDuration(int size) {
        InsertSort<Mebel> insertSort = new InsertSort<>();
        return SortTimeTester.sort(insertSort, size);
    }

    public static long bubbleSortRandomValuesDuration(int size) {
        BubbleSort<Mebel> bubbleSort = new BubbleSort<>();
        return SortTimeTester.sort(bubbleSort, size);
    }

    private static long sort(IListSorter sorter, int size) {
        List<Mebel> list = new ArrayList<Mebel>();

        for (int i = 0; i < size; i++) {
            list.add(SortTimeTester.generateRandomEntity());
        }

        long start = System.nanoTime();

        sorter.sort(list);

        return TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS);
    }

    private static Mebel generateRandomEntity() {
        Random generator = new Random();

        if (generator.nextBoolean()) {
            return new Krzeslo(generator.nextInt());
        } else {
            return new Stol(generator.nextInt());
        }
    }
}
