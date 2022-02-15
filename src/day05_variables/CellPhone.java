package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Samsung ";
        String model = "Galaxy S20+ Ultra 5G ";
        String color = "Black ";
        double price = 1400.99;
        int memeory = 128;
        boolean hasCamera = true;

        String myCellPhone = ("My cell phone is: " + brand + model + color + memeory + " " + hasCamera + " MSRP: " + price);
        System.out.println(myCellPhone);

    }
}
