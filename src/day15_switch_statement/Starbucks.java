package day15_switch_statement;

import java.util.Scanner;

public class Starbucks {
    /*

Declare price and calories variables

Ask the user to enter which size drink they want

Based on the drink size determine the price and calories of the order

    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200

 */
    public static void main(String[] args) {
        double price = 0, calories = 0;
        boolean validOrder = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Please select your drink size");
        String size = input.nextLine();

        switch (size) {
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.50;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("Sorry, we don't have that size");
                validOrder = false;
        }
        if (validOrder) {
            System.out.println("You've selected " + size + " size. Your price is: " + price + " + tax. Calories consumed: " + calories);
        }
        }
    }
