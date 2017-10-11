package lab.c1Sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void sort() {
        // Arrange
        BubbleSort<ComparableObject> bubbleSort = new BubbleSort<>();
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
        assertArrayEquals(sortedList.toArray(), bubbleSort.sort(list).toArray());
    }

}