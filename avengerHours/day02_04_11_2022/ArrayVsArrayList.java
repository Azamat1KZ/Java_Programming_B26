package day02_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayVsArrayList {
    /*
    ArrayList is a data structure, a member of collection framework

    A class of java that is similar ti arrey but allows us to store only objects

    Size id dynamic
    = Has its own methods (unlike array) add(), get(), remove()


     */
    public static void main(String[] args) {
        //declaring an array
        int[] arr1; // accepts obj and primitive

        //declaring an array
        ArrayList<Integer> list1; // must be object type

        //instantiation array
        arr1 = new int[4]; // [0, 0, 0, 0] -> 4
        arr1[0] = 100; // [100, 0 ,0 ,0] -> length = 4

        //instantiation arrayList
        list1 = new ArrayList<>(); // [] -> size = 0
        list1.add(100); // [100] -> size = 1
        list1.remove(0); // [] -> size = 0

        int number = 50;
        list1.add(number);// autoboxing automatically
        System.out.println(list1);
        list1.get(0); // wrapper class Integer, number still primitive

        //initializing an array
        Integer [] arr2 = {1, 2, 3}; // [1, 2, 3]

        //initializing an arrayList with specific values
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr2)); // we can use only wrapper class objects

        System.out.println("==============================");

        // own methods of ArrayList

        int[] arr4 = {100, 200, 300};
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int length = arr4.length; // 3
        list5.add(20);

        //using utility classes
        //arr.sort();
        Arrays.sort((arr4));

        //list5.reverse();
        Collections.reverse(list5);

    }
}
