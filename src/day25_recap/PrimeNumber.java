package day25_recap;

import java.util.Scanner;

public class PrimeNumber {
    /*
    [IQ] Prime number [Loops]

Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

Ex:
	Input:
		11

	Output:
		prime
Ex:
	Input:
		10

	Output:
		not prime
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        boolean isPrime = num >= 2;
        /*
        n%2
        n%3
        ...
        n%less than number
         */
        // this loop is trying to check if our number is evenly divisible by values from 2 to the number
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
