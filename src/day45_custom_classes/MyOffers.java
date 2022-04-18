package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer first = new Offer("Google", "Texas", 200000, true, 15);

        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);

        allOffers.add(new Offer("Amazon", "New York", 180000, true, 15));

        System.out.println();
        System.out.println(allOffers);
        System.out.println();

        Offer [] moreOffers = {
          new Offer("Apple", "Chicago", 230000, false, 10),
          new Offer("Tesla", "Texas", 250000, false, 20),
          new Offer("Facebook", "Florida", 120000, true, 10)
        };
        allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer("Discord", "Chicago", 150000, false, 13),
                new Offer("Boeing", "Virginia", 200000, true, 20),
                new Offer("Lockheed", "DC", 500000, true, 39)
        ));
        System.out.println();
        System.out.println(allOffers);

        // create ArrayList to filter the Offers

        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf( each -> each.salary < 170000);
        System.out.println("Salaries above 170000");
        System.out.println(salaries);

        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.isFullTime); // each.isFullTime == false

        System.out.println("Only full time offers");
        System.out.println(fullTime);



    }

}
