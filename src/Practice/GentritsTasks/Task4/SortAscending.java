package Practice.GentritsTasks.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending {
    public static ArrayList<Integer> sortAscending(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {

            for (int j = numbers.size() - 1; j > i; j--) {
                if (numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        return numbers;
    }

    public static ArrayList<Integer> sortDescending(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {

            for (int j = numbers.size() - 1; j > i; j--) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
        return numbers;
    }



    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4, 0, 500, 45, 86, 478, 9746, 1, 58, 945));
        System.out.println(sortAscending(base));
        System.out.println(sortDescending(base));

        }
    }


