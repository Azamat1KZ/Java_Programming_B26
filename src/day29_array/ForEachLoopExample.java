package day29_array;

import day26_nested_loops.NestedLoopExample;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] nums = {30, 12, 159, 12};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional: " + nums[i]);
        }
        System.out.println();
        for (int element : nums) {
            System.out.println("for each: " + element);
        }
        // String array
        String [] classes = {"java", "soft skills", "selenium", "database", "api"};
        System.out.println();
        // traditional
        for(int i = 0; i < classes.length; i++){
            System.out.println(classes[i]);
        }
        System.out.println();
        // for each loop
        for (String word : classes){
            System.out.println(word);
        }
        // double example
        System.out.println();

        double [] prices = {10.4, 40.2, 410.2};
        // for each loop
        for (double each : prices) {
            System.out.println("$ " + each);
        }


    }
}