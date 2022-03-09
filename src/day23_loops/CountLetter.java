package day23_loops;

public class CountLetter {
    public static void main(String[] args) {
        /*
        GIven a String and we want to count how many 'a' characters we have
        Challenge: adjust so that we can check for not only 'a' but any character
*/
        String word = "aabbcaa";
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a'){ //check if every character equals to 'a'
                count++;
            }
        }
        System.out.println(count);
    }
}
