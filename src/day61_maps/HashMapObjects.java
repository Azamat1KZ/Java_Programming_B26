package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    public static void main(String[] args) {
        // keys are Integer, and values are String
        Map<Integer, String> map = new HashMap<>();
        // add key/value to the map
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map); // HashMap element order is random, not insertion order, not sorted

        // read the key/value from map

        System.out.println(map.get(10)); // argument is the key, not index

        String value = map.get(5);

        map.remove(1);
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world"); // null ky exists, so hte value gets updates to hello world
        System.out.println(map);

        map.put(3, "March"); // 3 key exist, the value gets updates to March
        System.out.println(map);

        map.put(7, "March");
        System.out.println(map);


    }
}
