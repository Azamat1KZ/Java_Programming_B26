package day05_variables;

public class myName {
    public static void main(String[] args) {
        char letterOne = 'A';
        char letterTwo = 'Z';
        char letterThree = 'M';
        char letterFour = 'T';

        System.out.println("My name is: " + letterOne + letterTwo + letterOne + letterThree + letterOne + letterFour);

        System.out.println();

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(letterOne);
        System.out.println(letterThree);
        System.out.println(letterOne);
        System.out.println(letterFour);

        // or you make a variable of the name

        String name = "" + letterOne + letterTwo + letterOne + letterThree + letterOne + letterFour;
        System.out.println(name);
    }
}
