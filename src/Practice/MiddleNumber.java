package Practice;

import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = scan.nextInt();
        System.out.println("Enter second number:");
        num2 = scan.nextInt();
        System.out.println("Enter third number:");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num1 > num3 && num1 < num2) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println(num2);
        } else if (num2 > num3 && num2 < num1) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 < num2) {
            System.out.println(num3);
        } else {
            System.out.println(num3);
        }
    }
}
