package Replit;

import java.util.Scanner;

public class SplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] words = sentence.split(" ");

        for (int i = 0; i < sentence.length() -1; i++) {
            System.out.println(words[i]);
        }

    }
}
