package day09_scanner;

public class Discount {
    /*
        Task
            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter
             Do you get a discount?
                Must be a weekend day and you must be one of the given professions
     */

    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isPolicman = true;
        boolean isFirefighter = false;

        boolean getDiscount = !isWeekend && (isTeacher || isPolicman || isFirefighter);
        System.out.println(getDiscount);

    }
}
