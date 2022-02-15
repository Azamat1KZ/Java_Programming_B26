package day06_arithmetic_operators;

public class NoahSmith {
    public static void main(String[] args) {

        String firstName = "Noah", lastName = "Smith", companyName = "Apple", jobTitle = "SDET", address = "One Apple Park Way, Cupertino, CA 95014";
        int salary = 200_000, startYear = 2022;
        byte startDay = 10, startMonth = 1;
        boolean fullTime = true;

        String fullName = firstName + " " + lastName, fullStartDate = startMonth + "/" + startDay + "/" + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";
        double salaryAfterTwoYears = salary * 1.15;

        System.out.println("Employee Information");
        System.out.println("We have " + fullName + " joining " + companyName);
        System.out.println(firstName + " will start on " + fullStartDate + " as full time: " + fullTime);
        System.out.println(firstName + " here is some information about your employment");
        System.out.println("Your email is " + email);
        System.out.println("Your base salary is $" + salary + " and after 2 years it will be $" + (int) salaryAfterTwoYears); // TODO: Ask Saim regarding float and casting to int with missing 1
        System.out.println("Welcome aboard, see you at " + address);




    }
}
