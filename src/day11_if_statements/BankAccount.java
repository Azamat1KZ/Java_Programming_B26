package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current balance?");
        double currentBalance = input.nextDouble();
        System.out.println("Enter withdrawal amount");
        double withdrawalAmount = input.nextDouble();
        double overdraftFee = 35;
        if (withdrawalAmount > currentBalance) {
            System.out.println("Your remaining balance is: " + (currentBalance - withdrawalAmount - overdraftFee));
        } else {
            System.out.println("Your remaining balance is: " + (currentBalance - withdrawalAmount));
        }
    }
}
