package OfficeHours;

public class P01_MethodOverLoading {
    public static void main(char[] args) {
        System.out.println("Hello from char main");
    }

    public static void main(String[] args) {
        // we can overload main method
        System.out.println("Hello from String main");
    }

}
