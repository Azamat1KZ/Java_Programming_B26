package Practice;

import java.util.Scanner;

public class Sales {
    /*
    create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter amount earned:");
        int sales = input.nextInt();
        int bonus;
        if (sales < 10_000) {
            System.out.println("You don't have bonus this month");
        } else if (sales >= 10_000 && sales < 15_000) {
            bonus = 5_000;
            System.out.println("Your bonus is: $" + bonus);
        } else if (sales >= 15_000) {
            bonus = 7_000;
            System.out.println("Your bonus is: " + bonus);
        }
    }
}
