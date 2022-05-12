package day56_polymorphism.cars;

public class Car {
}

class BMW extends Car{}
class  Tesla extends Car {}
class Toyota extends Car {}
class Ford extends Car {}
class LandRover extends Car {}

class Dealership {

    public static void lease(Car car) {
        System.out.println("Leasing a car");
    }
}

class Runner{
    public static void main(String[] args) {
        Car car = new Tesla();
        Dealership.lease(car);

        Tesla tesla = new Tesla();
        Dealership.lease(tesla);

        Dealership.lease(new LandRover());

        Dealership.lease(new T);
    }
}