package day09_scanner;

public class GoForWalk {
    // We want to go for a walk

    // We will go for a walk if it is not raining and the weather is above 70

    // There is no need to check the weather if it is raining

    public static void main(String[] args) {
        boolean isRaining = false;
        int temp = 71;
        System.out.println("We are going for a walk: " + (!isRaining && temp > 70));
    }
}
