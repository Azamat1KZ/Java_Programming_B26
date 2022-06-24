package Practice.GentritsTasks.Task1;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        // =  A3B2C1D2
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char letter = str.charAt(i);
            if (checked.contains("" + letter)) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                char eachLetter = str.charAt(j);
                if (letter == eachLetter) {
                    count++;
                }
            }
            System.out.print("" + letter + count);
            checked += letter;
        }
    }
}
