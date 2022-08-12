package Practice.GentritsTasks.Task5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinValueMap {
    public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("A", 300);
            map.put("B", 200);
            map.put("C", 100);

            Integer min = Collections.min(map.values());
            System.out.println(min);
        }
    }


