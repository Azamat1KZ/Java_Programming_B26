package day06_arithmetic_operators;

public class House {
    /* Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
*/

  public static void main(String[] args) {

  /*
  approach 1
  String houseType = "Penthouse";
  int numberOfBedrooms = 4;
  int numberOfBathrooms = 3;
  int numberOfKitchens = 1;
  boolean hasBasement = true;
  boolean hasAttic = false;
  boolean hasPool = true;
  boolean onSale = true;
  double costOfHouse = 1_000_000.99; // 4.5
  String address = "1 Main Str";
  int zipcode = 22031;
  boolean hasPark = true;
  double schoolRating = 4.5;

  String houseInfo = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchen\nIt also includes a basement: " + hasBasement + " has an attic: " + hasAttic + ", has a pool: " + hasPool + " and is on sale: " + onSale + ", and has a park: " + hasPark + ". The schools in the area have a rating of " + schoolRating;

      System.out.println(houseInfo);
      */

      // approach 2

    String houseType = "Penthouse";
    int numberOfBedrooms = 4, numberOfBathrooms = 3, numberOfKitchens = 1, zipcode = 22031;
    boolean hasBasement = true, hasAttic = false, hasPool = true, onSale = true, hasPark = true;
    double costOfHouse = 1_000_000.99, schoolRating = 4.5;
    String address = "1 Main Str";

    String houseInfo = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchen\nIt also includes a basement: " + hasBasement + " has an attic: " + hasAttic + ", has a pool: " + hasPool + " and is on sale: " + onSale + ", and has a park: " + hasPark + ". The schools in the area have a rating of " + schoolRating;

    System.out.println(houseInfo);




  }
}
