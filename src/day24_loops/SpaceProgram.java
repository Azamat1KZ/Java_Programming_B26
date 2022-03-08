package day24_loops;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Space program [String, Loops]

Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        String word="Hello World";

        String newWord="";

        for(int i=0; i<word.length();i++){

            newWord+=word.charAt(i)+" "; //H e l l o  W o r l d
        }
        if(newWord.contains("   ")) {
            System.out.println(newWord.replace("   ", " _ "));
        }else{
            System.out.println(newWord);
        }
    }
}
