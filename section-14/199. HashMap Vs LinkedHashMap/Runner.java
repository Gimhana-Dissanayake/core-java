import java.util.HashMap;
import java.util.LinkedHashMap;

// Q. What are the differences between HashMap and LinkedHashMap?
// Ans:
// 1. HashMap was introudce in JDK1.2 version.
// LinkedHasMap was nroudced in JDK1.4 version.

// 2. HashMap's internal data structure is 'Hashtable'.
// LinkedHashMap's internal data structure is 'Hashtable+LinkedList'.

// 3. HashMap does not follow insertion order.
//  LinkedHashMap follows insertion order.

public class Runner {

  public static void main(String[] args) {
    HashMap<String, Integer> stds = new HashMap<String, Integer>();
    stds.put("Bimal", 89);
    stds.put("Nimal", 99);
    stds.put("Arun", 46);
    stds.put("Malith", 78);
    stds.put("Lal", 29);
    System.out.println(stds);
    LinkedHashMap<String, Integer> stds1 = new LinkedHashMap<String, Integer>();
    stds1.put("Bimal", 89);
    stds1.put("Nimal", 99);
    stds1.put("Arun", 46);
    stds1.put("Malith", 78);
    stds1.put("Lal", 29);
    System.out.println(stds1);
  }
}
