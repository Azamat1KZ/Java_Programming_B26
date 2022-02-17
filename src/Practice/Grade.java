package Practice;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner s = new Scanner(System.in);

        int grade = s.nextInt();

        //WRITE YOUR CODE BELOW:
        String message;
        if (grade >= 90) {
            message = "excellent";
        } else if (grade >= 70 && grade < 90) {
            message = "good";
        } else if (grade >= 60 && grade < 70) {
            message = "pass";
        } else if (grade < 60) {
            message = "fail";
        } else {
            message = "Invalid value";
        }
        System.out.println(message);
    }

    }



