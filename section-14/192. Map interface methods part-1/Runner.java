import java.util.*;

public class Runner {

  // Methods in Map:
  // 1. public Object put(Object key, Object value):
  // It can be used to add the provided key-value pair to the map, here if key-value is new key-value pair and value is not replacing any existed value then put() method will return null value, if any key-value pair existed already with the same key then existed value will be replaced with the spcified new value and the old value which has been removed will be returned from put() method.

  //   2. public  void putAll(Map map):
  // It can be used to add all the key-value pairs which are existed in the specifed Map

  //   3. public Object get(Object key):
  //   It can be used to get the value on the basis of the provided key. If the specified key is not existing then get() method will return null value

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    System.out.println(map.put("A", "AAA"));
    System.out.println(map.put("B", "BBB"));
    System.out.println(map.put("C", "CCC"));
    System.out.println(map.put("D", "DDD"));
    System.out.println(map);
    System.out.println(map.put("B", "XXX"));
    System.out.println(map);
    System.out.println(map.put("C", "YYY"));
    System.out.println(map);

    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("A", "AAA");
    map1.put("B", "BBB");
    map1.put("C", "CCC");
    map1.put("D", "DDD");
    System.out.println(map1);
    Map<String, String> map2 = new HashMap<String, String>();
    map2.putAll(map1);
    System.out.println(map2);

    Map<String, String> map3 = new HashMap<String, String>();
    map3.put("A", "AAA");
    map3.put("B", "BBB");
    map3.put("C", "CCC");
    System.out.println(map3);
    System.out.println("A -----> " + map3.get("A"));
    System.out.println("B -----> " + map3.get("B"));
    System.out.println("C -----> " + map3.get("C"));
    System.out.println("X -----> " + map3.get("X"));
  }
}
