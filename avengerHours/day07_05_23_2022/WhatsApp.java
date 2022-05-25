package day07_05_23_2022;
/*
Create a "WhatsApp" class that inherits VoiceCallable,VideoCallable and MessagingApp
        -implement required methods
 */
public class WhatsApp extends MessagingApp implements VideoCallable, VoiceCallable {

    // we have default constructor here, super() -> it calls non-parameterized constructor of super class

    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp - sending message " + msg + "...");
    }

    @Override
    public void videoCall() {
        System.out.println("WhatsApp - making video call...");
    }

    @Override
    public void call(String contact) {
        System.out.println("WhatsApp  - calling " + contact + "...");
    }
}
