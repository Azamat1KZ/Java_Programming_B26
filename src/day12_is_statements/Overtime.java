package day12_is_statements;

public class Overtime {
    /*
    create a double variable for your hourly rate
create a double variable for the number of hours worked

calculate your net pay, with consideration of overtime pay

    if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
        (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */

    public static void main(String[] args) {

        double hourlyRate = 20.5;
        double numberOfHours = 45;
        double netPay;
        String message;

        if (numberOfHours > 40) { // when the number of hours is more than 40, we will get an extra 1.5 for overtime pay
            double overtimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overtimeHours * hourlyRate * 1.5;
            message = "You worked " + numberOfHours + " hours at the rate of " + hourlyRate + " but " + overtimeHours + " hours were overtime, so you get an additional pay for those hours. Your net pay was " + netPay;
        } else {
            netPay = numberOfHours * hourlyRate;
            message = "You worked " + numberOfHours + " hours at the rate of " + hourlyRate + " There was no overtime. Your net pay is: " + netPay;
        }
        System.out.println(message);

    }

}
