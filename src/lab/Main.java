package lab;

import lab.c1Sort.*;

import java.util.ArrayList;
import java.util.List;

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

        InsertSort<krzeslo> insertSort = new InsertSort<>();
        BubbleSort<IComparable> bubbleSort = new BubbleSort<>();
        List<IComparable> list;

        Out.std("InsertSort");
        list = new ArrayList<>();

        IComparable<krzeslo> k = new krzeslo(9);
        IComparable<stol> s = new stol(1);

        list.add(new krzeslo(9));
        list.add(new stol(1));
        list.add(new ComparableObject(4));

        System.out.println(s.compareTo(s));
        Out.std(insertSort.sort(list));

        Out.std("BubbleSort");
        list = new ArrayList<>();

        list.add(new ComparableObject(9));
        list.add(new ComparableObject(1));
        list.add(new ComparableObject(4));

        Out.std(bubbleSort.sort(list));
    }
}
