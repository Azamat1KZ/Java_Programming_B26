package Practice.GentritsTasks;

public class Divisible3_5_15 {
    public static void main(String[] args) {


    String Div15 = " Divisible By 15 : ";
    String Div5=" Divisible By 5 : ";
    String Div3=" Divisible by 3 : ";

        for (int i = 1; i <= 100; i++) {


        if (i % 15 == 0) {
            Div15+= i+" ";
        } else if (i % 5 == 0) {
            Div5+=i+" ";
        } else if (i % 3 == 0 ) {
            Div3+=i+" ";
        }

    }
        System.out.println(Div15+"\n"+Div5+"\n"+Div3);
}
}
