package day27_nested_loop;

public class DuplicateCharacters {
    /*
    Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are duplicate
     */
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            if(checked.contains("" + str.charAt(i))){
                continue;
            }
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) { // count >= 2 or count != 1
                System.out.print(str.charAt(i));
            }
            checked += str.charAt(i);
        }
    }
}
