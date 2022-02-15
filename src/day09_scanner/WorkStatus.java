package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    /*
        Task
        create Scanner object
        ask the user to enter their first name - next
        ask the user to enter their last name - next
        ask the user if they are employed - boolean
        ask the user if they are a student - boolean
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName = input.next();
        System.out.println("Last name: ");
        String lastName = input.next();
        System.out.println("Employed? ");
        boolean isEmployed = input.nextBoolean();
        System.out.println("Is student? ");
        boolean isStudent = input.nextBoolean();

        String details = firstName + " " + lastName + " is employed: " + isEmployed + " and they are student: " + isStudent;
        System.out.println(details);

    }
}
