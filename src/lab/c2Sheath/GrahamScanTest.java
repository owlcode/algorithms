package lab.c2Sheath;

import lab.Out;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class GrahamScanTest {
    @Test
    public void shouldReturnPathForThreePoints() {
        //Arrange
        List<Point> points = new ArrayList<>();
        
        points.add(new Point(1, 1));
        points.add(new Point(1, 3));
        points.add(new Point(2, 2));

        //Act
        List<Point> list = GrahamScan.getConvexHull(points);

        //Assert
        List<Point> results = new ArrayList<>();
        results.add(new Point(1, 1));
        results.add(new Point(2, 2));
        results.add(new Point(1, 3));
        results.add(new Point(1,1));
        assertArrayEquals(list.toArray(), results.toArray());
    }

    @Test
    public void shouldWorkProperlyForFourPoints() {
        //Arrange
        List<Point> points = new ArrayList<>();

        points.add(new Point(1, 1));
        points.add(new Point(1, 5));
        points.add(new Point(5, 1));
        points.add(new Point(5, 5));

        //Act
        List<Point> list = GrahamScan.getConvexHull(points);

        // Assert
        List<Point> results = new ArrayList<>();
        results.add(new Point(1, 1));
        results.add(new Point(5,1));
        results.add(new Point(5, 5));
        results.add(new Point(1, 5));
        results.add(new Point(1,1));
        assertArrayEquals(list.toArray(), results.toArray());
    }

    @Test
    public void shouldWorkProperlyForFivePoints() {
        //Arrange
        List<Point> points = new ArrayList<>();

        points.add(new Point(-3, 1));
        points.add(new Point(3, 3));
        points.add(new Point(0, -5));
        points.add(new Point(0, 1));
        points.add(new Point(0, -1));

        //Act
        List<Point> list = GrahamScan.getConvexHull(points);

        // Assert
        List<Point> results = new ArrayList<>();
        results.add(new Point(0, -5));
        results.add(new Point(3, 3));
        results.add(new Point(-3, 1));
        results.add(new Point(0, -5));
        assertArrayEquals(list.toArray(), results.toArray());
    }
}