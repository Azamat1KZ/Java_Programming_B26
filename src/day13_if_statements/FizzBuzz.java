package day13_if_statements;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 9;

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (number % 5 == 0){
            System.out.println("Buzz");
        }else if (number % 3 == 0){
            System.out.println("Fizz");
        }else{
            System.out.println(number);
        }
    }
}
