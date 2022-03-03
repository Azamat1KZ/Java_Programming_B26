package day22_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        int validPin = 1234;
        int userPin;
        do{
            System.out.println("Enter your PIN:");
            userPin = input.nextInt();

        }while (validPin != userPin);
        if(validPin == userPin){
            System.out.println("logged in");
        }

    }
}
