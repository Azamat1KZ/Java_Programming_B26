package day15_switch_statement;

import java.util.Scanner;

public class Author {
    /*[Author] - Look at Starbucks from class for an idea

You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.

Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

Make variables for all of that information. Given empty defaults for all the variables

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
             */
    public static void main(String[] args) {
        int avgPageLength = 1, sequels = 1, country = 1, profit = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a genre to get more info:\n\t1. Fantasy\n\t2. Detective\n\t3. Science Fiction\n\t4. Short Story");
        int genreNum = input.nextInt();
        String genre = "";

        switch (genreNum) {
            case 1:
                genre = "Fantasy";
                avgPageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                country = 50;
                break;
            case 2:
                genre = "Detective";
                avgPageLength = 350;
                profit = 700_000;
                sequels = 3;
                country = 45;
                break;
            case 3:
                genre = "Science Fiction";
                avgPageLength = 720;
                profit = 900_500;
                sequels = 4;
                country = 30;
                break;
            case 4:
                genre = "Short Story";
                avgPageLength = 150;
                profit = 300_000;
                sequels = 1;
                country = 40;
                break;
            default:
                System.out.println("invalid number");
        }
        System.out.println("You selected genre " + genre + ". The average page length in this genre is " + avgPageLength + " pages and average number of sequels is " + sequels + ". It can be sold in average " + country + " countries with maximum profit of $" + profit + ".");
    }
}
