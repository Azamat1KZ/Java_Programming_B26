package day08_relational_operators;

public class OperatorPractice {

    public static void main(String[] args) {

        int b = 10; // 10 -> 11 -> 10 -> 11 -> 12
        b++; // post increment, no other code, adds 1
        System.out.println(b); // print a value ob b, which is 11
        b--; // post decrement, no other code, subtract 1
        System.out.println(b); // print value of b, which is 10
        System.out.println(b++); // post increment, we get the value first, which is 10 and we print it
        System.out.println(b++); // post increment, we get the value first, which is 11, and we print it, then we add 1
        System.out.println(b);



    }
}
