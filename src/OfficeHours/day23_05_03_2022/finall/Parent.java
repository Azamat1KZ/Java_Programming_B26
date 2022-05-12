package OfficeHours.day23_05_03_2022.finall;

public class Parent {
    /*
    final: non-access modifier / keyword

    final variables : After it has a value, it is not possible to change it
    final methods   : To prevent OVERRIDNG
    final class     : To prevent INHERITANCE

    variables:

        - if the variable is final, we cannot modify it
        - When variable is final, we need to initialize them
            - Constr
            - Same statement
        if final variable is STATIC they are called CONSTANTS
            - Integer.MAX_VALUE;

     Q: Can we create Setter method fot final variables?
            No. If variable is final you can use setter (READ-ONLY)

     methods: A final method cannot be overriden
     classes: A final class cannot be extended
     */

    public final String password = "123";
    public final String username;

    public final static String COMPANY = "Cydeo";
    public Parent(String password, String username){
        this.username = username;
    }
    public final void finalMethod(){
        System.out.println("Final Method");
    }
}
