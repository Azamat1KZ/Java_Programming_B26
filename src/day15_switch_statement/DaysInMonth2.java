package day15_switch_statement;

import java.util.Scanner;

public class DaysInMonth2 {
    /*
    Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name of the month to figure out how many days it contains:");
        String month = input.nextLine();

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 Days");
                break;
            case "February":
                System.out.println("28 Days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 Days");
                break;
            default:
                System.out.println("invalid name");
        }
    }
}
