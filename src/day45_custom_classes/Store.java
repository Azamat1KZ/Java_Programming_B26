package day45_custom_classes;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        Food apples = new Food("Apples");
        System.out.println(apples);

        Food chips = new Food("Lays", 2);
        System.out.println(chips);

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        String [] strs = {"one", "two", "three"};

        Food [] allFood = {apples, chips, chicken, null};
        System.out.println(allFood[2]);

        allFood[3] = new Food("Meat", 4, 4.55);
        System.out.println(Arrays.toString(allFood));

        // calculate the total price of the shopping list
        System.out.println();
        double totalPriceAll = 0;
        for(Food each : allFood){ // each == allFood[i]; // why the Food is the first thing in the for each - it is the datatype of each element
            totalPriceAll += each.totalPrice;
        }
        System.out.println(totalPriceAll);
    }
}
