package lab;

import lab.c1Sort.SortTimeTester;
import lab.c2Sheath.GrahamScan;
import lab.c2Sheath.PointFactory;

public class Main {
    public static void main(String[] args) {

        /* Lab 1 */
//        SortTimeTester.insertSortTestAndPrint();
//        SortTimeTester.bubbleSortTestAndPrint();

        /* Lab 2 */
        Out.std(GrahamScan.getConvexHull(PointFactory.anyPoints(5)));
    }
}
