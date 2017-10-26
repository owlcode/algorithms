package lab.c1Sort.Model;

import lab.c1Sort.Interface.IComparable;

public abstract class Mebel implements IComparable<Mebel> {
    protected int value;

    public int getvalue() {
        return value;
    }

    @Override
    public int compareTo(Mebel o) {
        if (value == o.getvalue()) {
            return 0;
        }

        return value > o.getvalue() ? 1 : -1;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
