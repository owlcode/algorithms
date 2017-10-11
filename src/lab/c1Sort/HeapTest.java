package lab.c1Sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeapTest {
    @Test
    public void shouldTestPuttingElementToHeap() {
        // Arrange
        Integer testCase = 1;
        Heap<Integer> heap = new Heap<Integer>();

        // Act
        heap.put(testCase);

        // Assert
        assertEquals(testCase, heap.getHeap().get(0));
    }

    @Test
    public void shouldSortWhenPuttingElements() {
        // Arrange
        Heap<Integer> heap = new Heap<Integer>();

        // Act
        heap.put(5);
        heap.put(3);
        heap.put(1);

        // Assert
        assertEquals(new Integer(1), heap.pop());
    }

    @Test
    public void shouldSortWhenPutingAndPoping() {
        // Arrange
        Heap<Double> heap = new Heap<Double>();

        // Act
        heap.put(19.0);
        heap.put(3.1);
        heap.put(0.454);

        // Assert
        assertEquals(new Double(0.454), heap.pop(), 4);
        assertEquals(new Double(3.1), heap.pop(), 4);
        assertEquals(new Double(19.0), heap.pop(), 4);
    }

    @Test
    public void shouldSortComparableObjects() {
        class Person implements Comparable<Person> {
            public int weight;
            Person(int weight) {
                this.weight = weight;
            }
            @Override
            public int compareTo(Person o) {
                if(o.weight == weight) return 0;
                return o.weight < weight ? 1 : -1;
            }
        }

        // Arrange
        Heap<Person> heap = new Heap<Person>();

        // Act
        heap.put(new Person(50));
        heap.put(new Person(1));
        heap.put(new Person(23));

        // Assert
        assertEquals(new Person(1).weight, heap.pop().weight);
        assertEquals(new Person(23).weight, heap.pop().weight);
        assertEquals(new Person(50).weight, heap.pop().weight);
    }
}