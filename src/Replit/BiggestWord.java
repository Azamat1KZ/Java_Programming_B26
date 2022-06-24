package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        int longest = words[0].length();
        String word = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > longest){
                longest = words[i].length();
                word = words[i];
            }

        }
        System.out.println(word);
    }
}
