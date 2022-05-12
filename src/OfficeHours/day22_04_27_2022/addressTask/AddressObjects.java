package OfficeHours.day22_04_27_2022.addressTask;

public class AddressObjects {
    public static void main(String[] args) {

        //There is NO-ARG CONSTR
        // Address address = new Address();

        Address cydeo = new Address("7925 Jones Branch DR Suite 3300", "McLean", "VA", "223182","USA");
        System.out.println(cydeo);

        // write data --> SETTER

        cydeo.setCity("Tysons");

        //read data --> GETTER
        System.out.println(cydeo.getCity());

        /*
        Make country name Read-Only
        - Delete Setter method for country name
         */
        // cydeo.setCountry(""); - it is read-only
    }
}
