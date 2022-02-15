package Practice;

import java.util.Scanner;

public class MorningOrEvening {
    /*
    create an int value for the time of the day. Use a 24 hour format
use the given time of day to display a message
hint: use seperate if statements

	if the hours are from 6 - 11, print: Good morning
	if the hours are from 12 - 16, print: Good evening
	if the hours are from 17 - 23, print: Good night
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time;
        System.out.println("Enter current time");
        time = input.nextInt();
        if (time >= 6 && time <= 11) {
            System.out.println("Good morning");
        } else if (time >= 12 && time <= 16) {
            System.out.println("Good evening");
        } else if (time >= 17 && time <= 23) {
            System.out.println("Good night");
        }
    }
}



