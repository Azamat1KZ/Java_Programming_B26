package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int num = 2;
        // approach 1
        while (num <= 100){
            System.out.println(num);
            num += 2;
        }
        // approach 2
        int i = 1;
        while (i <= 100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println();

        // odd numbers

        int a = 1;
        while (a <= 100){
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println();
                //approach 2
            int b = 0;
            while (b++ <= 100){
                if (b % 2 == 1){
                    System.out.println(b + " ");
                }
            }


    }
}
