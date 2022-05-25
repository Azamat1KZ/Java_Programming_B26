package day61_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Saim", "java" );
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("Aisun", "ui testing");
        map.put("Nadir","soft skills");
        map.put("username", "password");
        map.put(null, "Nothing");
        System.out.println(map);

        System.out.println("--------------------");

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("Saim", "java" );
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("Aisun", "ui testing");
        linked.put("Nadir","soft skills");
        linked.put("username", "password");
        linked.put(null, "Nothing");
        System.out.println(linked);

        System.out.println("--------------------");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Saim", "java" );
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("Aisun", "ui testing");
        treeMap.put("Nadir","soft skills");
        treeMap.put("username", "password");
//      treeMap.put(null, "Nothing"); // TreeMap objects cannot have a null key
        System.out.println(treeMap);

        System.out.println("--------------------");

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("Saim", "java" );
        hashtable.put("hello", "world");
        hashtable.put("james", "bond");
        hashtable.put("Aisun", "ui testing");
        hashtable.put("Nadir","soft skills");
        hashtable.put("username", "password");
//      hashtable.put(null, "Nothing"); // Hashtable objects cannot have a null key or value
        System.out.println(hashtable);

    }
}
