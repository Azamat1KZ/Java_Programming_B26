package day21_loops;

public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int result = 1;
        while (a > 1){
            System.out.println(result + "*" + a);
            result *= a;
            a--;
        }
        System.out.println(result);
    }

}
