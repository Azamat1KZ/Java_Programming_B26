package day29_array;

public class Store {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jackets", "Water", "Gloves", "AirPod", "Ipod", "Backpack"};
        double[] prices = {89.99, 150.0, 0, 999.99, 250.0, 439.5, 39.99};
        int[] itemIds = {12345, 12346, 12347, 11354, 12348, 12349, 12350};

        // print the catalog
        for (int i = 0; i < items.length; i++) {
            System.out.println("Item ID: " + itemIds[i] + " are " + items[i] + " and they cost $" + prices[i]);
        }
        System.out.println();

        // Task: Find the index of the Gloves
        int indexOfGloves = -1; // we set -2 as the default, so that if gloves is not found in the array it will always give -1
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                indexOfGloves = i;
                break;
            }
        }
        System.out.println(indexOfGloves);

        System.out.println();
        // Task: Find the most expensive item
        double mostExpensive = prices[0];
        int indexOfMostExpensive = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] > mostExpensive) {
                mostExpensive = prices[i];
                indexOfMostExpensive = i;
            }
        }
        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfMostExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfMostExpensive]);
        System.out.println("Price: " + prices[indexOfMostExpensive]);

    }
}
