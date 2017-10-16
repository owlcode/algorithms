package lab.c1Sort;

public class krzeslo implements IComparable<krzeslo> {
    private int value;

    public krzeslo(int value) {
        this.value = value;
    }

    public int getvalue() {
        return this.value;
    }

    @Override
    public int compareTo(krzeslo o) {
        if (this.value == o.getvalue()) {
            return 0;
        }

        return this.value > o.getvalue() ? 1 : -1;
    }
}
