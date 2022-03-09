package day23_loops;

public class CharacterInString {
    public static void main(String[] args) {
        String s = "java";
        for (int i = 0; i < s.length(); i++) {
            System.out.println((int)s.charAt(i) + " ");
        }
    }
}
