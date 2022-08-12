package Practice.GentritsTasks.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveMore100 {
    public static ArrayList<Integer> remove100s (ArrayList<Integer> numbers){
        numbers.removeIf(n -> n > 100);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4, 0, 500, 45, 86, 478, 9746, 1, 58, 945));
        System.out.println(remove100s(base));
    }
}
