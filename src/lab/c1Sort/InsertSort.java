package lab.c1Sort;

import lab.c1Sort.Interface.IComparable;
import lab.c1Sort.Interface.IListSorter;

import java.util.List;

public class InsertSort<T extends IComparable> implements IListSorter<T> {

    public List<T> sort(List<T> list) {
        int n = list.size();

        for (int i = 1; i < n; ++i) {
            T key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }

        return list;
    }
}
