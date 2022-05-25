package day07_05_23_2022;

import day54_abstraction.creating.Create;
/*
    Create an Abstract class "MessagingApp"
            -instance variables : public String name, protected boolean isFree, boolean allOSCompatible, private int count
        -static variable : public static final String APP_TYPE ;
        -no-args constructor
        -abstract method : void sendMessage(String msg)
        -static method : void close()
        -instance method : void launch()
        - encapsulate the private variable (count)
     */
public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private int count;

    public static final String APP_TYPE = "Messenger";
    // 3 types of variables - local, static, instant

    public MessagingApp(){ //constructor name should be same as class name
        System.out.println("Messaging no-args constructor...");
    }

    public MessagingApp(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public abstract void sendMessage(String msg);

    void launch(){
        System.out.println("Messaging app is launching...");
    }

    public static void close(){
        System.out.println("Messaging app is closing...");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
