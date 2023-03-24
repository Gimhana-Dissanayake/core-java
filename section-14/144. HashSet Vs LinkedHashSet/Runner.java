import java.util.HashSet;
import java.util.LinkedHashSet;

// 1. HashSet was introduced in JDK1.2 version.
// LinkedHashSet was introduced in JDK1.4 version.

// 2. HashSet internal data structure in 'Hashtable'.
// LinkedHashSet internal data structure is 'Hashtable + LinkedList'

// 3.HashSet does not follow intersion order.
// LinkedHashSet follows intersion order.

public class Runner {

  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("aaa");
    hs.add("bbb");
    hs.add("ccc");
    hs.add("ddd");
    hs.add("eee");
    System.out.println(hs); //order is not preserved

    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    lhs.add("a");
    lhs.add("b");
    lhs.add("c");
    lhs.add("d");
    lhs.add("e");
    System.out.println(lhs); //order is preserved
  }
}
