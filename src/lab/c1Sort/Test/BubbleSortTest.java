package lab.c1Sort.Test;

import lab.c1Sort.*;
import lab.c1Sort.Model.ComparableObject;
import lab.c1Sort.Model.Krzeslo;
import lab.c1Sort.Model.Mebel;
import lab.c1Sort.Model.Stol;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

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

    @Test
    public void shouldSortMebel() {
        // Arrange
        BubbleSort<Mebel> bubbleSort = new BubbleSort<>();
        List<Mebel> list = new ArrayList<>();
        List<Mebel> sortedList = new ArrayList<>();

        Mebel a = new Krzeslo(54);
        Mebel b = new Krzeslo(12);
        Mebel c = new Stol(43);
        Mebel d = new Stol(27);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        sortedList.add(b);
        sortedList.add(d);
        sortedList.add(c);
        sortedList.add(a);

        assertArrayEquals(sortedList.toArray(), bubbleSort.sort(list).toArray());
    }

}