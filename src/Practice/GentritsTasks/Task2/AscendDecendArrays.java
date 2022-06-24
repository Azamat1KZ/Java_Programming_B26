package Practice.GentritsTasks.Task2;

import java.util.Arrays;

public class AscendDecendArrays {
    public static int[] sortedAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] sortedDescending(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                int temp = 0;
                if(arr1[j] > arr1 [i]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 3, 4, 5};
        System.out.println(Arrays.toString(sortedAscending(arr)));

        int[] arr1 = {5, 9, 7, 3, 4, 5};
        System.out.println(Arrays.toString(sortedDescending(arr1)));
        }
    }
