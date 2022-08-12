package Practice.GentritsTasks.Performance;

import Quiz5And6.A;

import java.util.ArrayList;
import java.util.Arrays;

public class Today {
    public static ArrayList<Integer> remove100s (ArrayList<Integer> numbers){
        numbers.removeIf(n -> n > 100);
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,86,411,4684,4,3,4,8));
        System.out.println(remove100s(base));
    }

}
