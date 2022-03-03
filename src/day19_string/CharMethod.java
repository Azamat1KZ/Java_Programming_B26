package day19_string;

public class CharMethod {
    public static void main(String[] args) {

        String s = "java";
        //          0123
        System.out.println(s.length());

        System.out.println(s.charAt(0));

        int lastIndex = s.length() - 1;
        System.out.println(s.charAt(lastIndex));

        int secondToLastIndex = s.length() - 2;
        char secondToLAstChar = s.charAt(secondToLastIndex);
        System.out.println("second to last character: " + secondToLAstChar);
    }
}
