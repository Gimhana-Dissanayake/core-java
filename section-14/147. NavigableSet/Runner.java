import java.util.NavigableSet;
import java.util.TreeSet;

// It was introduced in JDK1.6 version
// It is a child interface to SortedSet interface, it has all the properties of SortedSet and it has provided some predefined methods to perfomr navigations over the elements like getting descending order of the elements, finding ceiling elemements, higher elmeemnts, floor elements, lower elements...

// Methods:
// 1. public Navigable descendingSet();
// It will return NavigableSet object with all the elements in decending order.

// 2. public Object ceiling(Object obj):
// It can be used to return an object which is lower than all the elements which are greater than or equal to the specified elements

// 3. public Object higher(Object element):
// It can be used to return an Object which is lower than all the elements which are greater than the specified element.

// 4. public Object floor(Object element):
// It can be used to return an object which must be highest element over all the elments which are less than or equal to the specified element.

// 5. public Object lower(Object element):
// It can be used to return an element which must be higher element over the elements which are less than the specified element.

// 6. public Object pollFirst():
// It can be used to remove and return first element from NavigableSet.

// 7. public Object pollLast():
// It can be used to remove and return last element from  NavigableSet.
public class Runner {

  public static void main(String[] args) {
    NavigableSet<String> ns = new TreeSet<String>();
    ns.add("FFF");
    ns.add("AAA");
    ns.add("EEE");
    ns.add("BBB");
    ns.add("DDD");
    ns.add("CCC");
    System.out.println(ns);
    System.out.println(ns.descendingSet());
    System.out.println(ns.ceiling("DDD"));
    System.out.println(ns.higher("DDD"));
    System.out.println(ns.floor("DDD"));
    System.out.println(ns.lower("DDD"));
    System.out.println(ns.pollFirst());
    System.out.println(ns.pollLast());
    System.out.println(ns);
  }
}
