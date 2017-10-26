package lab.c2Sheath;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class PointFactory {
    Point get(String input) {
        String[] points = input.split("\\s+");
        return new Point(new Integer(points[0]), new Integer(points[1]));
    }

    public static ArrayList<Point> anyPoints(int number) {
        ArrayList<Point> points = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < number; i++) {
            points.add(new Point(r.nextInt(), r.nextInt()));
        }

        return points;

    }
}
