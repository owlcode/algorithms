package c1Sort;

public interface HeapInterface <T extends Comparable<T>> {
    public void put(T item);
    public T pop();
}