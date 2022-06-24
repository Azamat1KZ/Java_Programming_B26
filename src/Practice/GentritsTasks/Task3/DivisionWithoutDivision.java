package Practice.GentritsTasks.Task3;

import Practice.GentritsTasks.Task1.code;

public class DivisionWithoutDivision {

    public static int divide(int x, int y)
    {
        // handle divisibility by 0
        if (y == 0)
        {
            System.out.printf("Error!! Divisible by 0");
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
        while (x >= y)
        {
            x = x - y;      // perform a reduction on the dividend
            quotient++;     // increase quotient by 1
        }

        System.out.println("The remainder is " + x);
        return sign * quotient;
    }

    public static void main(String[] args)
    {
        int a = 158;
        int b = 0;

        System.out.println("The quotient is " + divide(a, b));
    }
}
