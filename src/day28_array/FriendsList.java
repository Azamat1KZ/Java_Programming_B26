package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsList {
    public static void main(String[] args) {
        /*
        Make an array of your friends name
        asking haw many friends do you have
        ask for each friend's name one at a time, store all the names into an array
        print your friends list
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many friends do you have");
        int size = input.nextInt();
        String [] friendsList = new String[size];

        for (int i = 0; i < friendsList.length; i++) {
            System.out.println("Enter friends names " + (i + 1));
            friendsList[i] = input.next();
        }
        System.out.println(Arrays.toString(friendsList));
    }
}
