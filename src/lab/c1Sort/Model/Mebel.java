package lab.c1Sort.Model;

import lab.c1Sort.Interface.IComparable;

public abstract class Mebel implements IComparable<Mebel> {
    protected int value;

    public int getvalue() {
        return this.value;
    }

    @Override
    public int compareTo(Mebel o) {
        if (this.value == o.getvalue()) {
            return 0;
        }

        return this.value > o.getvalue() ? 1 : -1;
    }
}
