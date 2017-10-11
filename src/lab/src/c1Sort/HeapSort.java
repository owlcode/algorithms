package c1Sort;

public class HeapSort implements ListSorter {
    public static void main() {
        Heap<Integer> heap = new Heap<Integer>();
    }

    @Override
    public double[] sort(double[] unsortedVector) {
        Heap<Double> heap = new Heap<Double>();
        double[] sortedVector = new double[unsortedVector.length];

        for (Integer i = 0; i < unsortedVector.length; i++) {
            heap.put(unsortedVector[i]);
        }

        int iterator = 0;
        for(Double i : heap.getHeap()) {
            sortedVector[iterator] = i.doubleValue();
            iterator++;
        }

        return sortedVector;
    }
}
