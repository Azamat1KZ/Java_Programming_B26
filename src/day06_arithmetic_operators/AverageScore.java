package day06_arithmetic_operators;

public class AverageScore {
    public static void main(String[] args) {

/*
create a class AverageScore
add a main method
declare and assign these variables:
   four score values

calcualte the average score using the given four score values

Ex:
   90, 80, 100, 95

   Print:
      Average: 91.25
 */

        int sc1 = 90, sc2 = 80, sc3 = 100, sc4 = 95;
        int totalScore = sc1 + sc2 + sc3 + sc4;

        System.out.println((double) totalScore / 4);

    }
}
