package day15_switch_statement;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day:");
        String day = input.next();

        String info = "";

        switch (day){
            case "mon": case "monday": case "MONDAY":
            case "Monday":
                info = "We have Java with Saim at 7.00 ET";
                break;
            case "Tuesday":
            case "Wednesday":
                info = "We have Selenium with Saim at 7.00 ET";
                break;
            case "Thursday":
                info = "We have Math with Saim at 7.00 ET";
                break;
            case "Friday":
                info = "We have History with Saim at 7.00 ET";
                break;
            case "Saturday":
            case "Sunday":
                info = "We have Biology with Saim at 7.00 ET";
                break;
            default:
                info = "Not valida day";

        }
        System.out.println(info);



    }
}
