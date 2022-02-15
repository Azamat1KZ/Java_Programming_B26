package day07_unary_operators;

public class Store {
    public static void main(String[] args) {

        String store = "Target";
        int numOfTvs = 100;

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Nomber of TVs now: " + --numOfTvs);

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Nomber of TVs now: " + --numOfTvs);

        System.out.println("Person comes in to the store and put tv into the cart");
        System.out.println("Number of tvs in the store: " + numOfTvs--);

        System.out.println("Person bought it, now I have: " + numOfTvs);

        System.out.println("I get a shipment");
        numOfTvs = numOfTvs + 13;
        System.out.println("Tvs in stock: " + numOfTvs);
    }
}
