package Practice;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES

        String word = "qwert";

        //WRITE YOUR CODE BELOW
        String reverse = "";
        if(word.length() < 5){
            System.out.println("Too short!");
        }else if(word.length() > 5){
            System.out.println("Too long!");
        }else if (word.length() == 5){
            for(int i = word.length() - 1; i >= 0; i--){
                reverse += word.charAt(i);
                System.out.println(reverse);
            }
        }
    }
}
