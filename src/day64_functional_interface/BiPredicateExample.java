package day64_functional_interface;

import day1_04_04_2022.ArraysRecap;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer [], Integer> contains = (arr, num) -> {
            for (Integer each : arr) {
                if(each == num){
                    return true; // if this if statement is every time true, then my array does contain the number that we were looking for, so we return true
                }
            }
            return false; // if the loop finishes and compares the num with every number in the array, the array does not contain the num, returning false
        };
        Integer [] arr = {4, 5, 12, 10, 24};
        System.out.println(contains.test(arr, 12));
        System.out.println(contains.test(arr, 50));
        System.out.println(contains.test(arr, 24));

        BiPredicate<String, String> anagram = (one, two) -> {
            char [] oneArr = one.toCharArray();
            char [] twoArr = two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);

            return Arrays.equals(oneArr, twoArr);
        };
        System.out.println(anagram.test("listen", "silent")); // true if the length of the Strings is equal
    }
}
