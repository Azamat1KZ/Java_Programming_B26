package day06_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        /*
                create a class Pizza
        add a main method
        declare and assign these variables:

           type of pizza,  the number of slices,  the number of people eating

        calculate how many slices each person will get
        calculate how many slices are left over

        Sample print statement:

           We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
         */

        String pizzaType = "Square";
        int numOfSlices = 195, numOfPeople = 20;
        int eachAte = numOfSlices / numOfPeople;
        int leftOver = numOfSlices % numOfPeople;
//        int leftOver = numOfSlices - (numOfPeople * eachAte);

        System.out.println("We ordered " + pizzaType + " pizza with " + numOfSlices + " slices, " + numOfPeople + " people ate " + eachAte + " slices each with " + leftOver + " left over");


    }
}
