package day32_array;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {


    /*
    Flow:
        how many chapters is there
        make that book with that many chapters
        write a chapter one at a time
        break up chapter by sentences
     */
    Scanner input = new Scanner(System.in);
        System.out.println("How many chapters is there");
        String [][] book = new String[input.nextInt()][];
        System.out.println(Arrays.deepToString(book));
        input.nextLine();

        for (int i = 0; i < book.length; i++) {
            System.out.println("Enter chapter " + (i + 1));
            String chapter = input.nextLine();
            String [] sentences = chapter.split("\\.");
            book[i] = sentences;
        }
        System.out.println(Arrays.deepToString(book));

}
}
