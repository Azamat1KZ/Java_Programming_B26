package day22_loops;

public class Letters {
    public static void main(String[] args) {
        // a-z lowercase

        char loweCaseUP = 'a';
        while(loweCaseUP <='z'){
            System.out.print(loweCaseUP + " " );
            loweCaseUP++;
        }
        System.out.println();

        // Z-A uppercase

        char upperCaseDown = 'Z';
        while ((upperCaseDown >= 'A')){
            System.out.printf(upperCaseDown + " ");
            upperCaseDown--;


        }
    }
}
