package day33_methods;

public class OurArrayClass {
    /*
        all will accept array argument
        create a method that will print the first element
        create a method that will print the last element
        create a method that will print the element/s
            length matters -> even there is middle, for odd there is one middle
     */
    public static void firstElement(int[] nums){
        System.out.println("First element: " + nums[0]);
    }
    public static void lastElement(int[] nums){
        System.out.println("Last element: " + nums[nums.length - 1]);
    }
    public static void middleElement(int [] nums){
        if(nums.length % 2 == 0){
            System.out.println("First middle: " + nums[nums.length / 2 - 1]);
            System.out.println("Second middle: " + nums[nums.length / 2]);
        }else{
            System.out.println("Middle element: " + nums[nums.length / 2]);
        }

    }
    public static void printArray(int [] nums){
        String result = "";
        for(int num : nums){
            result += num + " ~ ";
        }
        result += " | END";
        System.out.println(result);

    }

    public static void main(String[] args) {
        int [] numbers = {50, 0, 10, 500, 20, 40, 124, 15};
        firstElement(numbers);
        lastElement(numbers);
        middleElement(numbers);

        printArray(numbers);
    }
}
