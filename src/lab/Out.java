package lab;

import lab.c1Sort.ComparableObject;
import lab.c1Sort.IComparable;

import java.util.List;

public class Out {
    public static void std(String output) {
        System.out.print(output);
    }

    public static void std(double[] output) {
        int iterator = 0;
        Out.std("[");
        for (iterator = 0; iterator < output.length; iterator++) {
            Out.std(output[iterator] + (output.length - 1 == iterator ? "" : ", "));

        }
        Out.std("]\n");
    }

    public static void std(List<IComparable> output) {
        int iterator = 0;
        Out.std("[");
        for (iterator = 0; iterator < output.size(); iterator++) {
            Out.std(output.get(iterator).getvalue() + (output.size() - 1 == iterator ? "" : ", "));

        }
        Out.std("]\n");
    }
}
