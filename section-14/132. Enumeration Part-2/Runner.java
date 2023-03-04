import java.util.Enumeration;
import java.util.Vector;

public class Runner {

  public static void main(String[] args) {
    Vector<String> v = new Vector<String>();
    v.add("a");
    v.add("b");
    v.add("c");
    v.add("d");
    v.add("e");
    System.out.println(v);
    System.out.println();
    Enumeration<String> e = v.elements();
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement());
    }
  }
}
// Drawbacks with Enumarations:
// 1. Enumeration is applicable for only legacy collections.
// 2. Enumeration allows only read operation while iterating elements, it does not allow remove, replace and insert operations.
// 3. Enumeration allwos us to read elements in only forward direction.
