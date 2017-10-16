package lab.c1Sort;

public class stol implements IComparable<stol> {
    private int value;

    public stol(int value) {
        this.value = value;
    }

    public int getvalue() {
        return this.value;
    }

    @Override
    public int compareTo(stol o) {
        if (this.value == o.getvalue()) {
            return 0;
        }

        return this.value > o.getvalue() ? 1 : -1;
    }
}
