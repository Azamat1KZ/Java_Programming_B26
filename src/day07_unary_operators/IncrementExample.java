package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x =0;
        System.out.println(x); // Output 0

        x = x +1;
        System.out.println(x); // Output 1

        x++; // post-increment
        System.out.println(x); // Output 2

        ++x; //  pre-increment
        System.out.println(x); // Output 3

        System.out.println(++x); // because it is preincrement it will add 1 right away so 4 is printed

        System.out.println(x++); // statement is run first because it is a post increment, we will see 4

        System.out.println(x);


    }
}
