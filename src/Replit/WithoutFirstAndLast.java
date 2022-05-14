package Replit;

import java.util.Scanner;

public class WithoutFirstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String EscapeFirst = word.substring(1, word.length());
        System.out.println("without first letter: " + EscapeFirst);
        String EscapeLast = word.substring(0, word.length()-1);
        System.out.println("without last letter: " + EscapeLast);
    }
}