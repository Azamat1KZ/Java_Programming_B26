package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz322 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
        String s = "";
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>5){
                continue;
            }
            if(numbers.get(i)%2 == 0){
                s += "1";

            }else   {
                s+="0";
            }
        }
        System.out.println(s);
    }
}
