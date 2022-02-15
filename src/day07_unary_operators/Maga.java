package day07_unary_operators;

public class Maga {
    public static void main(String[] args) {

        int i = 100;
        ++i;
        System.out.println(i);

        int z = ++i;
        System.out.println(z);
        System.out.println(i);

        int x = 5; //6
        int y = x++; //5

        System.out.println(x);
        System.out.println(y);
        System.out.println(y);

    }
}
