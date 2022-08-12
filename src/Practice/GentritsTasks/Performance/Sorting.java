package Practice.GentritsTasks.Performance;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static ArrayList<Integer> sortAscending (ArrayList<Integer> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = numbers.size() - 1; j > i; j--) {
                if (numbers.get(i) > numbers.get(j)){
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,86,411,4684,4,3,4,8));
        System.out.println(sortAscending(base));
    }
}
