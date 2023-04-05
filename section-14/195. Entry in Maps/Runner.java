import java.util.*;

// Entry:
// Entry is a key-value pair existed in Map.
// Map is the set of Entry objects, where Entry object is able to represent single key-value pair.
// To represent entry objects in java, Java has provided Entry as an inner inner interface inside Map interface.

// public interface Map{

// public interface Entry{
// public void setValue(Object value);
// public Object getValue();
// public Object getKey();
//}

//}

// To get all the Entry objects from Map we will use the following method.
// public Set entrySet();

public class Runner {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    map.put("A", "AAA");
    map.put("B", "BBB");
    map.put("C", "CCC");
    map.put("D", "DDD");
    map.put("E", "EEE");
    map.put("F", "FFF");

    System.out.println(map);

    Set<Map.Entry<String, String>> set = map.entrySet();

    System.out.println(set);

    Iterator<Map.Entry<String, String>> it = set.iterator();

    while (it.hasNext()) {
      Map.Entry<String, String> entry = it.next();
      System.out.println(entry.getKey() + "   " + entry.getValue());
    }
  }
}
