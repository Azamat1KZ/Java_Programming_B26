package Practice.GentritsTasks.Task1;

public class Test1 {
    public static String frequency(String str) {
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
                    checked += "" + letter + count;
                }
            }
        }
        return checked;
    }

    public static void main(String[] args) {

        System.out.println(frequency("AAAABBCCDD"));
    }
}

