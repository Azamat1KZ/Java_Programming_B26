package day08_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {

        int h = 5; // h = 5 -> 6 -> 7 -> 8
        int p = h; // p gets assigned the value of h, which is 5

        h++;

        System.out.println("h " + h);
        System.out.println("p " + p);

        int k = h++; // post increment, gets th value first , which is 6 and assign it to the new variable k, so k has the value of 6. Then h adds 1
        System.out.println("h " + h);
        System.out.println("k " + k);

        int g = ++h; // pre increment, which means it increments 1 right away, then it assignes the value of h to the new variable g
        System.out.println("h " + h);
        System.out.println("g " + g);
    }
}
