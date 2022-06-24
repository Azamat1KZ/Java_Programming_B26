package Practice.GentritsTasks.Task1;

import java.util.Scanner;
/*
Write a method that can divide two numbers without using division operator
 */
public class DivideNoOperator {
    public static int division(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("You cannot divide by zero");
        } else {
            int result = Math.floorDiv(number1, number2);
            System.out.println(result);

        }
        return number1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int number1 = input.nextInt();
        System.out.println("Enter second number");
        int number2 = input.nextInt();
        division(number1, number2);

    }
}
