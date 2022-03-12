package day28_array;

public class AddElements {
    public static void main(String[] args) {
        /*
        declare and assign an array of numbers
        {3, 6, 10}
        sum all the numbers in the array
         */
        int [] element = {3, 6, 10};
        System.out.println("Hardcoded sum: " + (element[0] + element [1] + element [2]));

        int sum = 0;
        for (int i = 0; i < element.length; i++) {
            sum += element[i];
        }
        System.out.println(sum);
    }
}
