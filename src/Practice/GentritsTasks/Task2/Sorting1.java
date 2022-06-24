package Practice.GentritsTasks.Task2;

import java.util.Arrays;

public class Sorting1 {
    static String sort(String str)
    {
        char [] chars = new char[str.length() + 1];

        // String to character array
        chars = str.toCharArray();

        // Sort the array
        Arrays.sort(chars);

        // Count of alphabets and numbers
        int alfaChars = 0, numericChars = 0;

        // Get the index from where the alphabets start
        while (chars[alfaChars] >= 'A' && chars[alfaChars] < 'Z')
            alfaChars++;

        // Now replace the string with sorted string
        for (int i = 0; i < str.length(); i++)
        {

            // If the position was occupied by an alphabet then replace it with alphabet
            if (str.charAt(i) < 'Z')
                str = str.substring(0,i)+ chars[alfaChars++]+str.substring(i+1);

                // Else replace it with a number
            else
                str = str.substring(0,i)+ chars[numericChars++]+str.substring(i+1);
        }

        // Return the sorted string
        return str;
    }


    public static void main(String[] args)
    {
        String str = "DC501GCCCA098";

        System.out.println(sort(str));
    }
}
