package Practice;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {

        int balance = 100, price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String productName = input.nextLine();


        switch (productName){
            case "Blanket":
                price = 60;
                break;
            case "Charger":
                price = 5;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "Socks":
                price = 5;
                break;
            case "USB cable":
                price = 10;
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
        }
        if (price <= balance){
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (balance - price) + "$");
        }else{
            System.out.println("Sorry, not enough funds on your gift card");
        }
    }
}
