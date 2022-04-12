package day02_04_11_2022;

import java.util.ArrayList;

public class P01_Contains {
    public static void main(String[] args) {
/*
    Write a method that accepts an array and prints true if it contains 2 or 3
int[] x = {2,5,4,6,8,9}; = > true
int[] y = {4,3,0,100,55}; = > true
int[] z = {4,5,1,5,6}; = > false
     */
        int [] arr = {4,5,1,5,6,3};
        System.out.println(contains(arr));
    }
    public static boolean contains(int [] array){
        for (int each : array){
            if(each == 2 || each == 3){
                return true;
            }

        }
        return false;
    }

    public static boolean contains(ArrayList<Integer> list){
    if(list.contains(2) || list.contains(3)){ // autoboxing
        return true;
    }
        return false;
}
}
