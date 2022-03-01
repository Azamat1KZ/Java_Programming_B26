package day18_String;

import java.util.Locale;
import java.util.Scanner;

public class Login {
    /*
        Ask the user to enter a username
        make sure the username is in lowercase
        Ask the user to enter a password
        check if the password is more than 8 characters long
        valid system password: "jamesbond"
        -> if the entered password matches the system password
            logged in
            otherwise print:
            invalid password
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the username:");
        String username = input.next();
        username = username.toLowerCase();

        System.out.println("please enter a password:");
        String password = input.next();

        if(password.length() >= 8 && password.equals("jamesbond")){
            System.out.println("Logged in with " + username);
        }else {
            System.out.println("invalid password");
        }
    }
}
