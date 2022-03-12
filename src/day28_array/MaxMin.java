package day28_array;

public class MaxMin {
    public static void main(String[] args) {
        /*
        declare and assign an  array
        500, 120, -80, 90, 250, -10
        find the biggest number in the array
        find the smallest number in the array
         */
        int [] number = {500, 120, -80, 90, 250, -10};
        int biggestNumber = number [0];
        int smallestNumber = number [0];
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            if(num > biggestNumber){
                biggestNumber = num;
            }
            if (num < smallestNumber){
                smallestNumber = num;
            }
        }
        System.out.println("max " + biggestNumber);
        System.out.println("min " + smallestNumber);
    }
}
