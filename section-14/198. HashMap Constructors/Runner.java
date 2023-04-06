import java.util.*;

// Constructors:
// 1. public HashMap():
// It can be used to create an empty hashMap object wiht the default initial capacity 16 elements and with the default load factory 75%

// 2.public HashMap(int capacity):
// It can be used to create an empty HashMap object with the specified capacity and with the default initial load factor 75%

// 3. public HashMap(int capacity, float loadFactor):
// It can be used to create an empty HashMap object with the specified capacity and with the specified load factor.

// 4. public HashMap(Map map):
// It can be used to create HashMap object with all the key-value paris which are existed in the specified map.
public class Runner {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    System.out.println(map);
    HashMap<String, String> map1 = new HashMap<String, String>(20);
    System.out.println(map1);
    HashMap<String, String> map2 = new HashMap<String, String>(20, 0.85f);
    map2.put("Nimal", "python");
    map2.put("Kamal", "C++");
    map2.put("Sunil", "C#");
    map2.put("Arjuna", "Java");
    map2.put("Malith", "HTML,CSS,Javascript");
    System.out.println(map2);
    HashMap<String, String> map3 = new HashMap<String, String>(map2);
    System.out.println(map3);
  }
}
