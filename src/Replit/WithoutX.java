package Replit;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        if (word.startsWith("x") || word.startsWith("X")) {
            if (word.endsWith("x") || word.endsWith("X")) {
                System.out.println(word.substring(1, word.length() - 1));
            } else if (!word.endsWith("x") || !word.endsWith("X")) {
                System.out.println(word.substring(1));
            }
        } else if (!word.startsWith("x") || !word.startsWith("X")) {
            if (word.endsWith("x") || word.endsWith("X")) {
                System.out.println(word.substring(0, word.length() - 1));
            } else if (!word.endsWith("x") || !word.endsWith("X")) {
                System.out.println(word);
            }
        }
    }
}
