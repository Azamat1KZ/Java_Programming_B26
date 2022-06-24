package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arr = str.split(", ");
        String shortest = arr[0];
        int lenght = shortest.length();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < lenght) {
                shortest = arr[i];
                lenght = arr[i].length();
            } else if (arr[i].length() == lenght && i != 0) {
                shortest += " " + arr[i];
            }
        }
        System.out.println(Arrays.toString(shortest.split(" ")));

    }
}