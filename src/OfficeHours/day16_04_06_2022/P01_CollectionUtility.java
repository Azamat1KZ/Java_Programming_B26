package OfficeHours.day16_04_06_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class P01_CollectionUtility {
    public static void main(String[] args) {


ArrayList<Integer> numbers = new ArrayList<>();
numbers.addAll(Arrays.asList(10, 10, -5, 0, -1, 30, 7, 8, 20, 20, 20));

        System.out.println("--------SORT--------");
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("-------REVERSE--------");
        Collections.reverse(numbers);
        System.out.println(numbers);

        System.out.println("------MAX-------");
        System.out.println(Collections.max(numbers));

        System.out.println("------MIN-------");
        System.out.println(Collections.min(numbers));

        System.out.println("------SECOND MAX-------");
        numbers.removeIf(each -> Collections.max(numbers) == each);// it will remove max value from arraylist
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);

}
}