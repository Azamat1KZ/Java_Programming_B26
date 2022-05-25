package day07_05_23_2022;
/*
-Create an Interface "VoiceCallable"
        -instance variable : public static final boolean CAN_CALL=true;
        -abstract method : void call(String contact)
        -static method : void decline()
        -default method void accept()
 */
public interface VoiceCallable {
     boolean CAN_CALL = true; // by default, it is public static final

    void call(String contact); // by default, it is public abstract

    public static void decline(){ // by default, it is public and has to have body
        System.out.println("Mike declined voice call...");
    }
    default void accept(){ // default is the keyword to specify that it is a default method, not the access modifier
        System.out.println("Mike finally accepted voice call...");
    }

}
