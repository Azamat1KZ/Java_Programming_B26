package Practice.GentritsTasks.Task1;

import java.util.Arrays;

public class SameLetters {
    public static boolean madeOutSameLetters(String a, String b) {

        char [] left = a.toCharArray();
        char [] right = b.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        return Arrays.equals(left, right);
    }

    public static void main(String[] args) {
        System.out.println("madeOutSameLetters(\"aaasfd\", \"aaasfd\") = " + madeOutSameLetters("qaasfd", "aaasfd"));

    }
}

