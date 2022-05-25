package Practice;
// we have to return FINRA for numbers divisible by 3 and 5
// Ra for numbers divisible by 5
// FIN for numbers divisible by 3
public class Finra1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.printf("Finra: " + i);
            } else if (i % 3 == 0) {
                System.out.printf("Fin: " + i);
            }else if (i % 5 == 0) {
                System.out.println("Ra: " + i);
            }else {
                System.out.println(i);
            }
        }
    }
}
