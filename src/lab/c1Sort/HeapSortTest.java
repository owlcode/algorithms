package lab.c1Sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeapSortTest {
    @Test
    public void shouldNotChangeSortedArray() throws Exception {
        HeapSort heapSort = new HeapSort();
        double[] testCase = new double[]{0.21, 0.32, 0.23};

        assertArrayEquals(testCase, heapSort.sort(testCase), 2);
    }

    @Test
    public void shouldSortFiveElementArray() {
        HeapSort heapSort = new HeapSort();
        double[] testCase = new double[]{43, 11, 88, 54, 30};

        assertArrayEquals(heapSort.sort(testCase), new double[]{11, 30, 43, 54, 88}, 2);
    }

    @Test
    public void shouldSortThreeElementArray() {
        HeapSort heapSort = new HeapSort();
        double[] testCase = new double[]{2, 1, 3};

        assertArrayEquals(heapSort.sort(testCase), new double[]{1, 2, 3}, 3);
    }

    @Test
    public void shouldSortFourElementArray() {
        HeapSort heapSort = new HeapSort();
        double[] testCase = new double[]{10.5, 2, 1, 4};

        assertArrayEquals(heapSort.sort(testCase), new double[]{1, 2, 4, 10.5}, 3);
    }

    @Test
    public void shouldSortSixElementArray() {
        HeapSort heapSort = new HeapSort();
        double[] testCase = new double[]{1.1234, 4.323, 0.54, 19293.04, 5.66, 2.0};

        assertArrayEquals(heapSort.sort(testCase), new double[]{0.54, 1.1234, 2.0, 4.323, 5.66, 19293.04}, 5);
    }

}