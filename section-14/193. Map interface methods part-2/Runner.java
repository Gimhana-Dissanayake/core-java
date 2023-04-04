import java.util.*;

// 4. public Object remove(Object key):
// It can be used to remove a key-value pair on the basis of the provided key and returns the value from the removed key-value pair, if the associated key-value pair is not existed in Map then JVM will return null value.

// 5. public int size():
// It can be used ot get size of the map, that is, the number key-value pairs which are existed in Map

// 6. public void clear():
// It can be used to remove all the key-value pairs which are existing in the Map.

// 7. public boolean isEmpty():
// It can be used to check whether the map is empty or not, if the map is empty then isEmpty() will return true value, if the map is not empty then is Empty() will return false value.

public class Runner {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    map.put("A", "AAA");
    map.put("B", "BBB");
    map.put("C", "CCC");
    map.put("D", "DDD");
    System.out.println(map);
    System.out.println(map.remove("B"));
    System.out.println(map);
    System.out.println(map.remove("X"));
    System.out.println(map.size());
    System.out.println(map);
    System.out.println(map.isEmpty());
    map.clear();
    System.out.println(map);
    System.out.println(map.isEmpty());
  }
}
