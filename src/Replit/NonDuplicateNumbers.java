package Replit;

import java.util.Scanner;

public class NonDuplicateNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i < nums.length; i++) {
            int nonDup = 0;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count == 1){
                nonDup = nums[i];
                System.out.println(nonDup);
            }
        }
    }
}
