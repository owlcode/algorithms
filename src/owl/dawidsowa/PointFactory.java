package owl.dawidsowa;

import java.awt.*;

public class PointFactory {
    Point get(String input) {
        String[] points = input.split("\\s+");
        return new Point(new Integer(points[0]), new Integer(points[1]));
    }
}
