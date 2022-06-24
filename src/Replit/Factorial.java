package Replit;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 1;
        while (n > 0){
            result = result * n;
            n--;
        }
        System.out.println(result);
    }
}
