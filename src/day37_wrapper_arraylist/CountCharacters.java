package day37_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
 /*

    given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

        aP3d572&*jd@jdJU

     */
        String s = "aP3d572&*jd@jdJU";
        int upper = 0, lower = 0, number = 0, other = 0;
        for (int i = 0; i < s.length();i++) {
            char letter = s.charAt(i);
            if(Character.isUpperCase(i)){
                upper++;
            }else if(Character.isLowerCase(letter)){
                lower++;
            }else if(Character.isDigit(letter)){
            number++;
            }else {
                other++;
            }

        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Other: " + other);
    }
}
