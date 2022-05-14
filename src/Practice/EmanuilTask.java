package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class EmanuilTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements would you like to be your ArrayList?: ");
        int arraySize = input.nextInt(); //this shows how many element my array list will contain and how many times the loop will iterate.
        ArrayList<Integer> nums = new ArrayList<>(); //empty array list where elements will be stored
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Please add element " + i);
            nums.add(input.nextInt());
        }
        System.out.println("Those are the current elements in your ArrayList");
        System.out.println(nums);

        nums.removeIf(n -> n % 2 != 0);
        System.out.println(nums);
    }
}

