package day33_methods;

public class GetCharacters {
  /*
        make a method that prints all the letters from A - Z
        make a method that prints all the letters from a - z
        make a method that prints all the letters from Z - A
        make a method that prints all the letters from z - a
        make a method that prints all the numbers from 0 - 9
     */
    public static void printAToZUpper(){
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAToZLower(){
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAToZUpperReverse() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAToZLowerReverse() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void print0To9() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printAToZUpper();
        printAToZUpperReverse();
        printAToZLower();
        printAToZLowerReverse();
        print0To9();

    }
}
