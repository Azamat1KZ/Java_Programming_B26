package day32_array;

import java.util.Arrays;

public class averageOfEachTraditional {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}

        };

        double total = 0;
        int totalLength = 0;

        for (int i = 0; i < nums.length; i++) {
            double sum = 0;

            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }
            System.out.println("Average of the whole 2d array: " + (total / totalLength));
        }
    }
}
