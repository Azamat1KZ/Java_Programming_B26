package day12_is_statements;

public class Biggest {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 55;
        int num3 = 55;


        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }else if (num2 >= num1 && num2 >=num3){
            System.out.println(num2);
        }else if (num3 >= num1 && num3 >= num2) {
            System.out.println(num3);
        }
    }
}
