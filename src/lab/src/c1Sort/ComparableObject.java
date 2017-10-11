package c1Sort;

public class ComparableObject implements Comparable<ComparableObject> {
    private int value;

    public ComparableObject(int value) {
        this.value = value;
    }

    public int getvalue() {
        return this.value;
    }

    @Override
    public int compareTo(ComparableObject o) {
        if (this.value == o.getvalue()) {
            return 0;
        }

        return this.value > o.getvalue() ? 1 : -1;
    }
}
