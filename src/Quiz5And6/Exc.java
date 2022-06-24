package Quiz5And6;

import java.util.*;

public class Exc {
    public static void main(String[] args) {
        Map<Integer, String>  map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        for(Integer key : map.keySet()){
            if(key %2 ==0){
                System.out.println(map.get(key));
            }
        }
    }
}
