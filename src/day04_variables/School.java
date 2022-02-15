package day04_variables;

public class School {
    public static void main(String[] args) {

        int grade1 = 15;
        int grade2 = 5;
        int grade3 = 34;
        int grade4 = 16;
        int grade5 = 25;
        int total = grade1 + grade2 + grade3 + grade4 + grade5;

        String school = "Bond Lake";
        System.out.println(school.toUpperCase());

        System.out.println("Total number of students in school " + school + " " + total);

        System.out.println("__________________________________________________");

        float days = 200.5F;
        int year = 2022;
        double snowDays = 100.55;
        double gpa = 3.5;

        System.out.println("Number of days in year " + year + " is " + days);
        System.out.println("Number of snowy days in year " + year + " is " + snowDays);
        System.out.println("Average GPA in school " + school + " in year " + year + " is " + gpa);

        boolean Azamat = false;
        boolean Ben = true;
        System.out.println("Is Azamat drunk: " + Azamat);

        int dell = 100;
        int assus = 1000;




        int averageNumberOfStudentsInBatch = 400;
        int numberOfBatchesAYear = 3;
        int priceSDET = 12500;
        int priceSS = priceSDET;
        int priceDeveloper = 18000;

        int sydeoEarnsB26 = (averageNumberOfStudentsInBatch * numberOfBatchesAYear * priceSDET) + (averageNumberOfStudentsInBatch * numberOfBatchesAYear * priceSS) + (averageNumberOfStudentsInBatch * numberOfBatchesAYear * priceDeveloper);
        System.out.println(sydeoEarnsB26);

    }
}
