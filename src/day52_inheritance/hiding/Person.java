package day52_inheritance.hiding;

public class Person {
    String name = "James Bond";

}
class SecretIdentity extends Person{
String name = "DNOB SEMAJ"; //we created
}
class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
    }
}