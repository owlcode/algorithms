package lab.c2Sheath;

import lab.Out;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GrahamScanTimeTester {
    private static int[] testCases = new int[]{150000, 250000, 500000, 750000, 5000000, 10000000};

    public static void test() {
        for (int testCase : testCases) {

            List<Point> points = PointFactory.anyPoints(testCase);

            Out.std(testCase + "\t");
            long start = System.nanoTime();

            List<Point> list = GrahamScan.getConvexHull(points);

            Out.std(TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS) + "\n");
        }
    }
}
