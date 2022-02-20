package day14_nested_if;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to ATM ***\nPlease enter your card and then type your pincode");
        int pincode = input.nextInt();


        int expectedPin = 4444;
        int balance = 10_000_000;

        if(pincode == expectedPin){
            System.out.println("Logged in");
            System.out.println("Select an option");
            System.out.println("1) Check balance");
            System.out.println("2) Withdraw");
            System.out.println("3) Deposit");

            int option = input.nextInt();
            if(option == 1){
                System.out.println("Your balance is: $" + balance);
            }else if (option == 2){
                System.out.println("How much you want to withdraw?");
                double money = input.nextDouble();
                System.out.println( "Withdrawing " + money);
                System.out.println("Remaining balance: " + (balance - (int) money));
            }else if (option == 3){
                System.out.println("Please deposit when you're ready");
            }else{
                System.out.println("invalid selection. Exiting account");
            }

        }else{
            System.out.println("Invalid pin. Please try again");
        }
    }
}
