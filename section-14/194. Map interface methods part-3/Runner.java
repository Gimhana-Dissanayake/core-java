import java.util.*;

// 8. public boolean containsKey(Object key):
// It can be used to check whether the specified key is existed or not at key side of the key-value paris in Map. If the specified key is existed then it will return true value, if the specified key is not existed then it will return false value.

// 9. public boolean containsValue(Object value):
// It can be used to check whether the specified value is existed at values side in map or not, if the provided value is existed in Map then it will return true value, if the provided value is not existed in Map then it will return false value.

// 10. public Set keySet():
// It can be used to get all the keys of the key-value pairs which are existed in the map.

// 11. public Collection values():
// It can be used to get all values of the key-value paris existed in Map.

public class Runner {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    map.put("A", "AAA");
    map.put("B", "BBB");
    map.put("C", "CCC");
    map.put("D", "DDD");
    map.put("E", "EEE");
    System.out.println(map);
    System.out.println(map.containsKey("B"));
    System.out.println(map.containsKey("X"));
    System.out.println(map.containsValue("AAA"));
    System.out.println(map.containsValue("XXX"));
    Set<String> set = map.keySet();
    System.out.println(set);
    Collection<String> c = map.values();
    System.out.println(c);
  }
}
