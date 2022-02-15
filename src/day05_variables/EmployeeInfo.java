package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        char gender = 'M';
        int age = 45;
        String employer = "MI6";
        boolean fullTime = true;
        String jobTitle = "agent";
        String referenceNum = "007";
        int salary = 1000000;
        int pto = 0;
        boolean status = false;
        char suite = 'A';


        System.out.println("Employee card: " +referenceNum + "\nName: " + firstName + " " + lastName);
        System.out.println("Employee is " + gender + " " + age + " years old, working as an " + jobTitle + " at " + employer + " in building " + suite);
        System.out.println("Schedule is Full time: " + fullTime);
        System.out.println("His salary is: GBP" + salary + " a year with " + pto + " days of PTO");


    }
}
