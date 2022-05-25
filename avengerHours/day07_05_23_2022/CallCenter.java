package day07_05_23_2022;
/*
Create a "CallCenter" runner class
 */
public class CallCenter {
    public static void main(String[] args) {
        WhatsApp wa = new WhatsApp();
        wa.launch();
        wa.allOSCompatible = true;
        wa.isFree = true;
        wa.name = "WhatsApp";

//      wa.count; not accessible

        wa.call("Mehmet");
        wa.sendMessage("Thank you Mehmet!");
        wa.videoCall();
        wa.accept();

        VoiceCallable.decline();
    }
}
