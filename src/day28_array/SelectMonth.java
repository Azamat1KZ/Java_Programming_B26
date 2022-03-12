package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        /*
        Asj the user the month they want, print the month name
        1 --> January
        12 --> December
        Assume only valid numbers are given, but as a challenge you can handle invalid numbers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Which number do you want?");
        int mon = input.nextInt();
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(months[mon-1]);

    }

}
