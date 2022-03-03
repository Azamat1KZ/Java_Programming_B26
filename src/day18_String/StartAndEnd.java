package day18_String;

public class StartAndEnd {
    public static void main(String[] args) {
        String str = "Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        String str2 = "App";
        System.out.println(str.startsWith(str2)); // does the String str starts with String s.
        System.out.println(str.startsWith(  "App"));
        System.out.println(str.startsWith(" App")); // false because space is a character.
        System.out.println(str.startsWith("Aoo"));

        String sentence = "today was a good day";
        System.out.println(sentence.startsWith("today was a")); // true
        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("good")); // false
        System.out.println(sentence.endsWith("today was a good day")); // true

    }
}
