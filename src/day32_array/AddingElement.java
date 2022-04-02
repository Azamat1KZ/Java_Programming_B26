package day32_array;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElement {
    /*
     Having a staring array
     you want ot ass a number to the end
     so make your array bigger to store the new number
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many number to start with");
        int size = input.nextInt();
        int [] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {// the purpose of this loop is to get all the numbers for the array
            System.out.println("Enter a number ");
            nums[i] = input.nextInt();
        }
        System.out.println("Arrays so far: " + Arrays.toString(nums));

        int [] expanded = Arrays.copyOf(nums, nums.length + 1);
        System.out.println("Enter the last number");
        expanded[expanded.length - 1] = input.nextInt();

        System.out.println(Arrays.toString(expanded));
    }
}
