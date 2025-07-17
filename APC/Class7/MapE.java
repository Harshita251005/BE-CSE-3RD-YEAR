import java.util.*;

public class MapE {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(1, "vansh");
        map.put(2, "madhur");
        map.put(3, "pratik");
        System.out.println("Initial Map: " + map);
        
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "arvind");
        map1.put(5, "wasif");
        
        map.putAll(map1);  // Adding all entries from map1 to map

        System.out.println("After putAll: " + map);
        System.out.println("Get value for key 2: " + map.get(2));
        System.out.println("All values: " + map.values());
        System.out.println("Size of map: " + map.size());
        System.out.println("Contains key 4? " + map.containsKey(4));
        System.out.println("Contains key 6? " + map.containsKey(6));
        System.out.println("Contains value 'wasif'? " + map.containsValue("wasif"));
    }
}
