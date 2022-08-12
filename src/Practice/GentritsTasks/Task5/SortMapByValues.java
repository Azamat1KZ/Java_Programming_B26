package Practice.GentritsTasks.Task5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValues {
    /*
    1.Map -- Sort the map by values
Write a method that can sort the Map by values
     */

    public static void main(String[] args) {
        HashMap<String, Integer> InitialMap = new HashMap<String, Integer>();
        ValueSorter sorter = new ValueSorter(InitialMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(sorter);

        InitialMap.put("A", 20);
        InitialMap.put("B", 40);
        InitialMap.put("C", 40);
        InitialMap.put("D", 30);

        System.out.println("initial map: " + InitialMap);
        sortedMap.putAll(InitialMap);
        System.out.println("sorted map: " + sortedMap);
    }
}

class ValueSorter implements Comparator<String> {
    Map<String, Integer> base;

    public ValueSorter(Map<String, Integer> base) {
        this.base = base;
    }

    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
