package day42_custom_classes;

/*
    Create a coffee class with these instance variables:
        price, size (oz), brand, types

        instance methods:

            -make a toString to print all the information of the coffee objects

            -drink: print trying type of coffee

            -refill(amount in oz) : print refilling x oz
            add the number of ox to the total size
     */
public class Coffee {
    double price;
    double size;
    String brand;
    String type;

   public String toString(){
       return type + " from " + brand + " , size of " + size + " oz. for a total price of " + price;
    }

    public void drink(){
        System.out.println("Drinking " + type);
        size -= 1.5;

    }

    public void refill(double amount){
        System.out.println("Refilling " + amount + " oz. of coffee");
        size += amount;
    }
}

