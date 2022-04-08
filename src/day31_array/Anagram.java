package day31_array;

import java.util.Arrays;

public class Anagram {
    /*
    given 2 Strings
    find if they are anagram or not
    the characters are the same in both Strings, but the order ois different
    listen
    silent
     */
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        char [] a1 = a.toCharArray();
        char [] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1, b1)){
            System.out.println("Is anagram");
        }else{
            System.out.println("Not anagram");
        }
    }
}
