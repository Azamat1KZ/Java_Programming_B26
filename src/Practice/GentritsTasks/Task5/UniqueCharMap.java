package Practice.GentritsTasks.Task5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharMap {
    /*
    3.Map -- Unique character from String
     */
    static void firstUniqChar(String str) {
        LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
        char[] charArray = str.toCharArray();
        for (char character : charArray) {
            if (list.get(character) == null) {
                list.put(character, 1);
            } else {
                list.put(character, list.get(character) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : list.entrySet())
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey());
                break;
            }
    }

    public static void main(String[] args) {

        firstUniqChar("aaabcccddeggf");
    }
}
