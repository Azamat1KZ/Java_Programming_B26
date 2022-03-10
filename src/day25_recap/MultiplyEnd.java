package day25_recap;

import java.util.Scanner;

public class MultiplyEnd {
    /*
    Multiply End [String, Loops]

Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int num = input.nextInt();
        String newWord = "";
        int lastIndex = word.length() - 1;
        for (int i = 0; i <= word.length(); i++) {
            newWord += word.charAt(lastIndex);
        }
        System.out.println(word+newWord);
        }
    }


