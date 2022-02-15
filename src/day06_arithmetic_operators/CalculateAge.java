package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args) {

        /*
        create a class CalculateAge
        add a main method
        declare and assign these variables:
        current year, year you were born

        calculate your age from the two variables.

        Print: I'm $years old
         */

        int currYear = 2022;
        int birthYear = 1986;

        System.out.println("I'm " + (currYear - birthYear) + " years old.");

    }
}
