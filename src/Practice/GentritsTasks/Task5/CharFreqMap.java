package Practice.GentritsTasks.Task5;

import java.util.HashMap;
import java.util.Map;

public class CharFreqMap {
    /*
    2.Map -- Frequency of Characters
Write a method that prints the frequency of each character from a String
     */
    static void charFreq(String input) {
        // Creating a HashMap containing char as a key and occurrences as a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Converting given string to char array

        char[] strArray = input.toCharArray();

        // checking each char of strArray
        for (char each : strArray) {
            if (charCountMap.containsKey(each)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(each, charCountMap.get(each) + 1);
            } else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(each, 1);
            }
        }

        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

            }
        }


    // Driver Code
    public static void main(String[] args) {
        String str = "azAmat";
        charFreq(str);
    }
}
