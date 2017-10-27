package lab;

import lab.c1Sort.SortTimeTester;
import lab.c2Sheath.GrahamScan;
import lab.c2Sheath.PointFactory;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /* Lab 1 */
//        SortTimeTester.insertSortTestAndPrint();
//        SortTimeTester.bubbleSortTestAndPrint();

        /* Lab 2 */
        ArrayList<Point> random = PointFactory.anyPoints(50);
        Out.std("Random points " + random + "\n");
        Out.stdPointList(random);
        Out.std("Path\n");
        Out.stdPointList(GrahamScan.getConvexHull(random));
    }
}
