package java8;

import java.util.HashMap;
import java.util.Map;

public class Map8 {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap();
        // getOrDefault -if you need to update a certain key in the Map
        System.out.println(map.getOrDefault(1, "Dileep"));
        map.put(1, map.getOrDefault(1, "Dileep") + "Append");
        System.out.println(map);
        // putIfAbsent
        map.putIfAbsent(2, "Meera");
        // Insert if value is absent
        map.computeIfAbsent(1, v -> "Damodaran");
        // Append value if present
        map.computeIfPresent(1, (k, v) -> v + "Test");
        System.out.println(map);
    }
}