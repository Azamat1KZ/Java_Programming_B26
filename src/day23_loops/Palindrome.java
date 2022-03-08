package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        Palindrome: its the same reading from the beginning and end
        tenet
        Task: check if a word is palindrome
        Flow:
        declare some initial string
        how to reverse a String
        check if the reverse version is the same as the original
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String text = input.next();
        String reversed = "";
        int l = text.length()-1;

        for(int i = l; i >= 0; i--){
            reversed += ""+text.charAt(i);
        }

        if(reversed.equalsIgnoreCase(text)){
            System.out.println("This word is palindrome");
        }else{
            System.out.println("This word is not palindrome");
        }

    }
}

