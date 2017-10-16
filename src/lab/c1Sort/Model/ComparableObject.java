package lab.c1Sort.Model;

import lab.c1Sort.Interface.IComparable;

public class ComparableObject implements IComparable<ComparableObject> {
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
