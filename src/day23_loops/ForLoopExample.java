package day23_loops;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        /*
        flow of for loop
        1) the loop executes the initialization part to declare assign a variable
        initialization: int i = 1
        initialization part runs once in the beginning
        2) boolean condition/ termination condition
        -> if the boolean is true: the loop will execute the statements
        -> if the boolean is false: the loop will stop
        in our example: i <= 10
        3) the statements in the code body are executed top to bottom
        in our example: sout (i);
        4) update happens - this is the end of iterations
        in our ex: i++;
        5) goes back to step 2 and repeats
         */
    }

    public static class MultiplicationTable {
        public static void main(String[] args) {
            /*
            Task: declare and assign a number
            print all the multiplication results for 1 through 10
            Ex: 4

             */
            int number = 5;
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));

            }

        }
    }

    public static class PrintEachChar {
        public static void main(String[] args) {

            String s = "java";
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(1));
            System.out.println(s.charAt(2));
            System.out.println(s.charAt(3));

            System.out.println("With loop");
            for(int i = 0; i < s.length(); i++)// i <= s.length() -1
                System.out.println(s.charAt(i));
        }
    }
}
