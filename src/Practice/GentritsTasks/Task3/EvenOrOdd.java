package Practice.GentritsTasks.Task3;

import java.util.Scanner;

public class EvenOrOdd {
    public static int identify(int x) {
        int num = 0;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number");
        int x = input.nextInt();
        System.out.println(identify(x));
    }
}