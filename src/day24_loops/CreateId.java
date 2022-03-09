package day24_loops;

import java.util.Locale;
import java.util.Scanner;

public class CreateId {
    public static void main(String[] args) {
        /*Create ID [String]

Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8
         */
        Scanner input = new Scanner(System.in);

        String firstName = input.next().toLowerCase();
        String lastName = input.next().toLowerCase();
        String id = " " + firstName.charAt(0) + lastName.toUpperCase().charAt(0) + lastName.substring(1, 3) + firstName.length()*2;
        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println(id);



    }
}
