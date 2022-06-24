package Practice.GentritsTasks.Task3;

import java.util.Arrays;

public class ArraysConcat {
    public static String concatinate(int[] a, int[] b) {
        int[] both = new int[a.length + b.length];
        int index = 0; // the variable that tracks the indexes of the "both" array
        for (int each1 : a) {
            both[index++] = each1;
        }
        for (int each2 : b) {
            both[index++] = each2;
        }
        return Arrays.toString(both);
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 45};
        int[] b = {50, 60, 70, 80};
        System.out.println(concatinate(a, b));
    }
}