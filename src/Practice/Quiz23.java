package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz23 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("during", "storm", "rain", "fell", "season", "cloudy", "safe"));
        ArrayList<Integer> length   = new ArrayList<>();
        for (String word: words){
            length.add(word.length());
        }
        System.out.println(length);
    }
}
