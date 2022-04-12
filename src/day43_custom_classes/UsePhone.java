package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Samsung Galaxy S22 Ultra 5G"); // call the constructor on line 24
        System.out.println(phone1);

        Phone phone2 = new Phone("Iphone 13", "Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("Galaxy S22", "Samsung", 256, 12.2);
        System.out.println(phone3);

    }
}
