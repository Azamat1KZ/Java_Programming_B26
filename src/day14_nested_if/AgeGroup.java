package day14_nested_if;

import java.util.Scanner;

public class AgeGroup {
    /*
    declare and assign an age variable

use these ranges to determine which age group you belong to

	if the given age value is less than 0 or more than 120:
		print: Invalid age

	otherwise uses these to determine the age group

		Baby (2 years and below)
		Toddler (3 - 5)
		Kid (6 - 9
		Pre-Teen (10 - 12)
		Teenager (13 - 17)
		Young Adult (18 - 20)
		Adult (21 - 35)
		Middle-Aged Adult (36 - 55)
		Senior Citizen (55+)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        String ageGroup;

        if (age > 0 && age < 120){
            if (age > 0 && age <= 2){
                ageGroup = "Baby";
                System.out.println(ageGroup);
            }else if(age >2 && age <=5){
                ageGroup = "Toddler";
                System.out.println(ageGroup);
            }else if (age >= 6 && age <= 9){
                ageGroup = "Kid";
                System.out.println("Kid");
            }else if (age >= 10 && age <= 12){
                ageGroup = "Pre-Teen";
                System.out.println(ageGroup);
            }else if (age >= 13 && age <= 17){
                ageGroup = "Teenager";
                System.out.println(ageGroup);
            }else if (age >= 18 && age <= 20){
                ageGroup = "Young adult";
                System.out.println(ageGroup);
            }else if (age >= 21 && age <= 35){
                ageGroup = "Adult";
                System.out.println(ageGroup);
            }else if (age >= 36 && age <= 55){
                ageGroup = "Middle-Aged Adult";
                System.out.println(ageGroup);
            }else{
                ageGroup = "Senior";
                System.out.println(ageGroup);
            }
        }else{
            System.out.println("Invalid age");
        }
    }
}
