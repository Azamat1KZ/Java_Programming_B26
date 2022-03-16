package day19_string;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
        Ask the user to enter their last name
        Print the initials as uppercase letters

        james
        bond
        JB
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.nextLine().toLowerCase().trim();
        System.out.println("Please enter your last name");
        String lastName = input.nextLine().toLowerCase().trim();

        String initials = ("" + firstName.toUpperCase().charAt(0) + lastName.toUpperCase().charAt(0));
        System.out.println(initials);

    }
}
