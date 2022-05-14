package OfficeHours.day23_05_03_2022;

public class Inheritance {
    /* Inheritance is a relationship
    SuperClass - Parent - Base: the class whose features are inherited
    SubClass - Child - Derived: the class that inherits features from other class

    public Parent{}
    public Child extends Parent{}

    What is inherited?
    -- All public and protected variables and methods
    -- All default variables and methods (if parent and child needs to be in same package) (Package-Private_

    What is not inherited?
    -- Private variables and methods CAN NOT BE INHERITED (Access them with Getter/Setter)
    -- Constructors CAN NOT be inherited

    Constructor
    -- The parent class constructor always executes before child constructor

    1. Child class constr MUST call parent constr
    2. Parent class default constr is called by child class default constr implicitly
    3. If the parent class constr is NOT DEFAULT, child one needs to call Explicitly (manually)

    super: refers to parent class objects
    super(): refers to parent class constr

    -- MUST be in the first line from child class constr
    -- We cannot use this() and super() at the same constr

    Overriding:
    Why we need?

    -- Sometimes a subclass inherits a method from parent but the method is inadequate for child classes
    Shape --> area()
    Rectangle --> area()
    Circle --> area()


    Rules:

   -- There MUST be IS A Relationship.Do it in subclass
   -- Parameters, Return Type, methodName (same method signature)
   -- Access modifiers needs to be SAME or MORE VISIBLE

    - public        public
    - protected     public/protected
    - default       public/protected/default
    - private       CAN NOT BE INHERITED

   -- private, final and static ones CAN NOT BE OVERRIDEN


   Method overloading
    - Performed in same class
    - Parameters MUST be DIFFERENT
    - Access modifiers can be changed
    - private, final methods can be overloaded
    - Return Type does not affect overloading
   Method overriding
    - Occurs in two class that have IS-A Relationship
    - Parameters MUST be SAME
    - Access modifiers needs to be SAME or More visible
    - private, final and static ones CANNOT BE OVERRIDEN
    - Return Type needs to be SAME

   Can we override static methods?
        No

   Hiding static methods
    - Overriding +
    - They need static methods

     */
}
