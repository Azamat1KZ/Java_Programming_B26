package Practice.GentritsTasks.Task3;

import java.util.Arrays;

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class ZerosToTheEnd {
    public static void moveZeros (int []n) {
        int [] fixed = new int[n.length];
        int index = 0; // the variable that tracks the indexes of the fixed array
        for (int each : n){
            if (each != 0){
                fixed[index] = each;
                index++;
            }

        }
        System.out.println(Arrays.toString(fixed));
    }

    public static void main(String[] args) {
        int [] result = {12, 5, 0, 0, 2, 6, 5};
       ZerosToTheEnd.moveZeros(result);

        }
    }

