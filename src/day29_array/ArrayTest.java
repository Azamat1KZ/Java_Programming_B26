package day29_array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        char [] array = {'D', 'C', 'B', 'A'};
        Arrays.sort(array);

        for(char each : array){
            System.out.println(each + " ");
            if(each == 'D'){
                continue;
            }
        }
    }
}
