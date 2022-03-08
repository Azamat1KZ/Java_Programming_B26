package day24_loops;

import java.sql.Struct;

public class CountJava {
    public static void main(String[] args) {
        String str = "java is a java language.";
        int  count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String every4 = str.substring(i, i + 4);
            System.out.println(every4);
            if(every4.equals("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}
