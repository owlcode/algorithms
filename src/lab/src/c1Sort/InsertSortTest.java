package c1Sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InsertSortTest {
    @Test
    public void shouldNotChangeIfSorted() {
        // Arrange
        InsertSort<ComparableObject> insertSort = new InsertSort<>();
        List<ComparableObject> list = new ArrayList<>();
        List<ComparableObject> sortedList = new ArrayList<>();

        ComparableObject a = new ComparableObject(1);
        ComparableObject b = new ComparableObject(2);
        ComparableObject c = new ComparableObject(3);

        list.add(a);
        list.add(b);
        list.add(c);

        // Act
        sortedList.add(a);
        sortedList.add(b);
        sortedList.add(c);

        // Assert
        assertArrayEquals(sortedList.toArray(), insertSort.sort(list).toArray());
    }

    @Test
    public void sort() {
        // Arrange
        InsertSort<ComparableObject> insertSort = new InsertSort<>();
        List<ComparableObject> list = new ArrayList<>();
        List<ComparableObject> sortedList = new ArrayList<>();

        ComparableObject a = new ComparableObject(1);
        ComparableObject b = new ComparableObject(2);
        ComparableObject c = new ComparableObject(3);

        list.add(c);
        list.add(a);
        list.add(b);

        // Act
        sortedList.add(a);
        sortedList.add(b);
        sortedList.add(c);

        // Assert
        assertArrayEquals(sortedList.toArray(), insertSort.sort(list).toArray());
    }
}