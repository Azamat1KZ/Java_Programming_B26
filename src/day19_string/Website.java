package day19_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the URL");
        String url = input.next(); // www.google.com
                                   // 012345678910
        String website = url.substring(4, url.length() - 4);
        System.out.println(website);

    }
}
