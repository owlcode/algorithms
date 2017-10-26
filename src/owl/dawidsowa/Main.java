package owl.dawidsowa;

import lab.Out;
import lab.c2Sheath.GrahamScan;
import lab.c2Sheath.PointFactory;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    void constructor() {
        System.out.println("Dupa");
    }

    public static void main(String[] args) {
        List<Point> points;
        List<Point> convexShell;
        Input input = new Input();

        System.out.println("Dupa");
        points = PointFactory.anyPoints(5);

        convexShell = GrahamScan.getConvexHull(points);

        Out.std(convexShell);

    }

    private static ArrayList<String> readFromStream(Input input) {
        ArrayList<String> userInput = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            userInput.add(input.read());
        }

        return userInput;
    }

    private static Boolean isInside(List<Point> boundary, Point point) {
        return Boolean.FALSE;
//        int nvert = boundary.size();
//        int i, j, c = 0;
//        for (int i = 0, int j = nvert - 1; i < nvert ; j = i++) {
//            if (((verty[i] > testy) != (verty[j] > testy)) &&
//                    (testx < (vertx[j] - vertx[i]) * (testy - verty[i]) / (verty[j] - verty[i]) + vertx[i]))
//                c = !c;
//        }
//        return c ? true : false;

    }
}
