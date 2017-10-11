package c1Sort;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> implements HeapInterface<T> {
    protected final List<T> heap;
    private static int N;

    public Heap() {
        this.heap = new ArrayList<T>();
    }

    public List<T> getHeap() {
        return this.heap;
    }

    @Override
    public void put(T item) {
        this.heap.add(item);
        sort(this.heap);
    }

    @Override
    public T pop() {
        T i = this.heap.get(0);
        this.heap.remove(0);
        sort(this.heap);
        return i;
    }

    @Override
    public String toString() {
        return this.heap.toString();
    }

    void sort(List<T> arr) {
        heapify(arr);
        for (int i = N; i > 0; i--) {
            swap(arr, 0, i);
            N = N - 1;
            maxheap(arr, 0);
        }
    }

    /* Function to build a heap */
    void heapify(List<T> arr) {
        N = arr.size() - 1;
        for (int i = N / 2; i >= 0; i--)
            maxheap(arr, i);
    }

    /* Function to swap largest element in heap */
    void maxheap(List<T> arr, int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr.get(left).compareTo(arr.get(i)) > 0)
            max = left;
        if (right <= N && arr.get(right).compareTo(arr.get(max)) > 0)
            max = right;

        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }

    void swap(List<T> arr, int i, int j) {
        T tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }
}
