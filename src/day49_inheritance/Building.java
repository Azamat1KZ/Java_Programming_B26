package day49_inheritance;

public class Building {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.favoriteHobby = "spying";
        obj.talk();
        // obj.study(); this was a method made in a child class

        Student obj2 = new Student();
        obj2.name = "Jeorge";
        obj2.age = 10;
        obj2.favoriteHobby = "drawing";
        obj2.talk();

        // the above variables and methods were inherited from the Person class

        obj2.funLevel = 100;
        obj2.study();
    }
}
