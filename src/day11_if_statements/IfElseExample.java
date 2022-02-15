package day11_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();

        int score = 75;
        if (score >= 75) {
            System.out.println("Passing");
        } else {
            System.out.println("Failing");
        }
        int year = 2025;
        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown){
            System.out.println("Stay at home");
        } else {
            System.out.println("Go party");
        }
    }
}
