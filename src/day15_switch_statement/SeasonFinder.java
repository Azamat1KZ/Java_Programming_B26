package day15_switch_statement;

import java.util.Scanner;

public class SeasonFinder {
    /*
    Season Finder

declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of the month to determine a season:");
        int monthNum = input.nextInt();

        switch (monthNum){
            case 12: case 1: case 2:
                System.out.println("It's winter");
                break;
            case 3: case 4: case 5:
                System.out.println("it's Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("It's summer");
                break;
            case 9: case 10: case 11:
                System.out.println("It's Fall");
            default:
                System.out.println("Invalid");
        }
    }
}
