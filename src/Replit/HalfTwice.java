package Replit;

import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String newWord = word.substring(0, word.length()/2);
        String doubleWord = newWord.repeat(2);
        System.out.println(doubleWord);



    }
}
