package Replit;

import java.util.Scanner;

public class JavaAndPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence =  scan.nextLine();

        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i < sentence.length() - 3; i++) {
            String java = sentence.substring(i, i + 4);
            if (java.equalsIgnoreCase("java")) {
                countJava++;
            }
        }

        for (int j = 0; j < sentence.length() - 5; j++) {
            String python = sentence.substring(j, j + 6);
            if (python.equalsIgnoreCase("python")) {
                countPython++;
            }
        }
        if (countJava == countPython) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
