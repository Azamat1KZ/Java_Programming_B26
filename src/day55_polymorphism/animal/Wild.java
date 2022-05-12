package day55_polymorphism.animal;

import day49_inheritance.Lion;

public class Wild {
    public static void main(String[] args) {
        // all possible reference/object of Lizard

        // itself
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "lizard";
        lizard.numberOfClaws = 10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);
        System.out.println();

        // super class - Reptile
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "lizard";
        reptile.numberOfClaws = 10;
//        reptile.skinColor = "camo"; // Reptile reference does not have access to skinColor variable
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
//        System.out.println(reptile.skinColor); // Reptile reference does not have access to skinColor variable
        System.out.println();

        // super class - Animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "lizard";
//        animal.numberOfClaws = 10; // Animal reference does not have access to numberOfClaws variable
//        animal.skinColor = "camo"; // Animal reference does not have access to skinColor variable
        System.out.println(animal.name);
//        System.out.println(animal.numberOfClaws);
//        System.out.println(animal.skinColor);
        System.out.println();

        /*
            We made 3 Lizard objects with 3 different references
            itself, Reptile (super class), Animal (super class)

            but when it comes to execution, the object implementation is run
         */
    }
}
