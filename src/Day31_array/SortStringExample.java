package Day31_array;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] arr = {"java", "Hello", "$Dollar", "4four", "five5", "Zebra", "SIX", "six", "hi"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
