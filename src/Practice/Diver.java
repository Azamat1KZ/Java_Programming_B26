package Practice;

public class Diver {
 /*
 create a class Diver
You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
    Above 70 - Don't go too far
    Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%
     */

    public static void main(String[] args) {
        int oxyLevel = 75;

        if (oxyLevel >= 90) {
            System.out.println("your tank is full");
        } else if (oxyLevel >= 80 && oxyLevel < 90) {
            System.out.println("Still ok");
        } else if (oxyLevel >= 70 && oxyLevel < 80) {
            System.out.println("Don't go too far");
        } else if (oxyLevel >= 60 && oxyLevel < 70) {
            System.out.println("Start to head back");
        } else if (oxyLevel < 60) {
            System.out.println("Be careful now you're at 50%");
        }
    }
}