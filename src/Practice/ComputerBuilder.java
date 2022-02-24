package Practice;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        System.out.println("Select screen size: ");
        double screenSize = input.nextDouble();
        boolean screen13 = screenSize == 13.3;
        boolean screen15 = screenSize == 15.5;
        boolean screen17 = screenSize == 17.3;
        if (screen13) {
            totalPrice += 150;
        } else if (screen15) {
            totalPrice += 300;
        } else if (screen17) {
            totalPrice += 400;
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Select CPU type: ");
        input.nextLine();
        String cpu = input.nextLine();
        switch (cpu) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Select RAM size: ");
        int ram = input.nextInt();
        int ramMultiplier = ram / 4;
        totalPrice += ramMultiplier * 50;
        System.out.println("Select storage type: ");
        input.nextLine();
        String storageType = input.nextLine();
        int storageMultiplier = 0;
        switch (storageType) {
            case "HDD":
                storageMultiplier = 50;
                break;
            case "SSD":
                storageMultiplier = 100;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Select storage size: ");
        int storageSize = input.nextInt();
        totalPrice += storageSize / 500 * storageMultiplier;

        System.out.println("Select screen resolution: ");
        input.nextLine();
        String resolution = input.nextLine();
        switch (resolution) {
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Laptop price is: $" + totalPrice);
    }
}