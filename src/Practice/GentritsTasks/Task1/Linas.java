package Practice.GentritsTasks.Task1;

public class Linas {
    public static boolean sameLetters (String str, String str2) {
/*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false
     */
        boolean sameLetter = false;

        if (str.length()!=str2.length()) {
            sameLetter = false;
        }else{
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    sameLetter = false;
                    if((str.charAt(i) + "").contains(str2.charAt(j) + "")){
                        sameLetter = true;
                    }
                }
            }
        }
        return sameLetter;
    }
    public static void main(String[] args) {

        System.out.println(sameLetters("abcde","rbcde"));
    }
}
