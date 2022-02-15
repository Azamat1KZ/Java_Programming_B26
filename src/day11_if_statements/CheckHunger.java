package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry?");
        boolean isHungry = input.nextBoolean();
        if (isHungry) {
            System.out.println("I'll get some food for you");
        }else{
            System.out.println("Great, then practice Java");
        }
    }
}
