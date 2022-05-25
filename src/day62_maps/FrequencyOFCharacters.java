package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOFCharacters {
    /*
    Given a String count how many times each character is in the String
    apple
    a - 1
    p - 2
    l - 1
    e - 1
     */
    public static void frequencyOfEachChar (String str){
        Map<Character, Integer> counter = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (counter.containsKey(key)){
                //the letter/char was found before, this is a duplicate occurrence, so we will need to update the  counter for it, which is the value in our map
                counter.put(key, counter.get(key) + 1); //counter.get() the method form the map to get the value of the previous counter, then we add 1 to that number, them assign ss that result as the new value linked to that key
            }else {
                // the map does not contain the char/letter -> which means this is the first time the char was found, so we should add it to the map

                counter.put(key, 1 );
            }
        }
        System.out.println(counter);
    }
}
