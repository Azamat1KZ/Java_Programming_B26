package Practice.GentritsTasks;

public class Task1 {
    public void OddEven() {
        int num = 10;
        if (num % 2 != 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }


    // Function to perform division `x/y` of two numbers `x` and `y` without using the division operator in the code
    public int divide(int x, int y) {
        // handle divisibility by 0
        if (y == 0) {
            System.out.printf("Error!! Divisible by 0");
            System.exit(-1);
        }

        // store sign of the result
        int sign = 1;
        if (x * y < 0) {
            sign = -1;
        }

        // convert both dividend and divisor to positive
        x = Math.abs(x);
        y = Math.abs(y);

        // initialize quotient by 0
        int quotient = 0;

        // loop till dividend `x` becomes less than divisor `y`
        while (x >= y) {
            x = x - y;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }

        System.out.println("The remainder is " + x);
        return sign * quotient;
    }


    public static void main(String[] args) {
        new Task1().OddEven();

    }
}