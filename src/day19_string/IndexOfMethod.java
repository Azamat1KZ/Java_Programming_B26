package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "pen";
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));

        System.out.println(s.indexOf("x"));
        System.out.println(s.indexOf("pe")); // gives 0 because the string has this sequence of characters and returns the position of the first one
        System.out.println(s.indexOf("pz")); // gives -1 because there is no exact sequence of this characters
    }
}
