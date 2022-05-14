package OfficeHours.day21_04_26_2022.accessModifier;

public class AccessModifiers extends Person{
    /*
    How many access modifiers we have?
    - public --> always reachable
    - protected --> Same package OR subclasses (inheritance) in different packages
    - default --> Same package (PACKAGE - PRIVATE)
    - private --> Same class

    NOTE:
    - We can use access modifiers with variables / Constr / Methods
    - A top level class have public or default
     */
    public static void main(String[] args) {
        Person person = new Person();
        // 1 - PUBLIC
        person.name= "Mike";
        // 2 - PRIVATE
        //person.age = 0; is not visible

        // 3 - DEFAULT --> in same package
        person.ID = 1;
        // 4 = PROTECTED
            // - same package
        person.DoB="06.06.07";

            // - inheritance - there is no inheritance
        AccessModifiers accessModifiers = new AccessModifiers();
        accessModifiers.DoB="06.06.07";
    }
}