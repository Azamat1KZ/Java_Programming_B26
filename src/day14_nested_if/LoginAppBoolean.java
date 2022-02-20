package day14_nested_if;

import java.util.Scanner;

public class LoginAppBoolean {
    public static void main(String[] args) {
        int pin, ssn;
        int expectedPin = 1552;
        int expectedSSN = 1234;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter pin:");
        pin = input.nextInt();
        System.out.println("Please enter last 4 digits of SSN");
        ssn = input.nextInt();

        if (pin == expectedPin && ssn == expectedSSN) {
            System.out.println("Authentication successful");
        } else {
            if (pin == expectedPin) {
                System.out.println("Invalid SSN");
            }
            if (ssn == expectedSSN) {
                System.out.println("Incorrect PIN");
            } else {
                System.out.println("Authentication failed");
            }
        }
    }
}

