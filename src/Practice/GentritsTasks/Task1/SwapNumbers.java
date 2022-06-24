package Practice.GentritsTasks.Task1;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        x += y; //x = 10 +20 = 30; x=30 -> x=30 y=20
        y = x - y; // y= 30-20 = 10; y=20 -> x=30 y=10
        x = x - y; // x= 30-10 =20; x=20 -> x=20 y= 10

        System.out.println("After Swapping: \n X: "+ x + "\nY: "+ y);
    }
}