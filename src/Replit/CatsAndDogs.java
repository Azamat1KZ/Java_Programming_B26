package Replit;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int countCats = 0;
        int countDogs = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                countCats++;
            }else if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g'){
                countDogs++;
            }

        }
        if (countCats == countDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
