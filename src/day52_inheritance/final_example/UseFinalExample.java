package day52_inheritance.final_example;
// we cannot extend because the FinalExample class was final, so it cannot be inherited.
public class UseFinalExample {
    public static void main(String[] args) {
        System.out.println(FinalExample.PLANET);
        // FinalExample.PLANET = "Mars";

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        // obj.a = 4; cannot be changed
        // obj.b = 59; same shit

        System.out.println();
        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
/*
obj and obj2 are separate objects. Each object has its own copy of instance variables a and b, both are final, so they cannot be changed.
 */
    }
}
