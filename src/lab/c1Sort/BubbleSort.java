package lab.c1Sort;

import java.util.List;

public class BubbleSort<T extends Comparable> {
    public List<T> sort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < (list.size() - i); j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    T temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}
