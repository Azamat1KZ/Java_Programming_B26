package day18_String;

import org.w3c.dom.ls.LSOutput;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "    Saturday   ";
        System.out.println(s);
        System.out.println(s.length());

        s = s.trim();

        System.out.println(s);
        System.out.println(s.length()); // only for beginning and end spaces

        String str = "    java is fun    ";
        System.out.println(str.startsWith("java"));
        //System.out.println(str.trim());
        str = str.trim();
        System.out.println(str.startsWith("java"));


    }
}
