package day17_StringMemory;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";

        // how to compare String values --> use .equals()
        System.out.println(name.equals("james"));

        System.out.println("cat".equals("dog"));

        System.out.println(name.equalsIgnoreCase("James"));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a.equals(b));

        System.out.println(name.length());
        String last = "today was fun";
        System.out.println(last.length());

    }
}
