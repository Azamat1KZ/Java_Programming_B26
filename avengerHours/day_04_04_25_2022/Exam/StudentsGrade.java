package day_04_04_25_2022.Exam;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalQuestions;
        int missed;

        System.out.println("How many questions in the exam?");
        totalQuestions = scan.nextInt();

        System.out.println("How many questions did student miss?");
        missed = scan.nextInt();

        FinalExam math = new FinalExam(totalQuestions, missed);
        System.out.println(math.getScore());
        System.out.println(math.getGrade());

    }
}
