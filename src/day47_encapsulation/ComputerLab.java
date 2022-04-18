package day47_encapsulation;

public class ComputerLab {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Computer comp = new Computer("HP", 500, "Silver");

        Computer.hasBattery = false;

        System.out.println(Computer.hasBattery);
        System.out.println(comp.brand);
        System.out.println(comp.hasMemory);
    }

}
