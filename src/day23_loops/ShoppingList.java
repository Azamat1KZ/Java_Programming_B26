package day23_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        /*
        repeated steps:
        ask the user to enter the item
        add item to shopping list
        ask the user is they want to add more items

        at the end show the full shopping list

         */
        Scanner input = new Scanner(System.in);
        String list = "Shoppping List:\n";
        String addMore;

        do{
            System.out.println("Enter the name of the item");
            list += "\n*" + input.nextLine();
            System.out.println("Do yuo want to add more to your shopping list?");
            addMore = input.nextLine();
        }while(addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("y"));
        System.out.println(list);
            }
}
