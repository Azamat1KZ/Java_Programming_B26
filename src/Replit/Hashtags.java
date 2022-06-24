package Replit;

import java.util.Scanner;

public class Hashtags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        char hashtag = '#';
        while (n > 0){
            System.out.print(hashtag);
            n--;
        }
    }
}
