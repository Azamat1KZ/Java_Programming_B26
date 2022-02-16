package day12_is_statements;

public class CheckCharacter {
    public static void main(String[] args) {

        char letter = 'T';
      //  if(letter >= 65 && letter < 122){
       //     System.out.println("lowercase");
         if(letter >= 'a' && letter <= 'z'){
             System.out.println("Lowercase");
        }
        if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Uppercase");
        }
    }
}
