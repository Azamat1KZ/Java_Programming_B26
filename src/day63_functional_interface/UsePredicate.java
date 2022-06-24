package day63_functional_interface;

import day1_04_04_2022.StringsRecap;

import java.util.function.Predicate;

public class UsePredicate {
    public static Predicate<String> isPalindrome = str -> {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    };
    public static Predicate<Integer> isPrime = n -> {
        boolean valid = true;

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    };
}
