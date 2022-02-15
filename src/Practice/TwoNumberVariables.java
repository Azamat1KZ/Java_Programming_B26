package Practice;

import java.util.Scanner;

public class TwoNumberVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter 2 number to compare which one is greater");
        num1 = input.nextInt();
        num2 = input.nextInt();

        boolean isGreater = num1 > num2; // true
        if (isGreater){
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
    }
}
