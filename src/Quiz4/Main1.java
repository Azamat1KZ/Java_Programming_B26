package Quiz4;

public class Main1 {
    public Main1(){
        System.out.println(0);
    }
    static void run(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Main1.run();
        System.out.println(2);
    }
    static {
        System.out.println(3);
    }
}
