import java.util.Comparator;
import java.util.PriorityQueue;

// Constructors
// 1. public PriorityQueue():
// It can be used to create an empty PriorityQueue with the default initial capacity 11 elements.

// 2. public PriorityQueue(int capacity):
// It can be used to create an empty PriorityQueue with the specified initial capacity.

// 3. public PriorityQueue(Comparator c):
// It can be used to create an empty PriorityQueue object with the comparator reference which has user defined sorting logic explictly

//

public class Runner {

  public static void main(String[] args) {
    PriorityQueue<String> pq = new PriorityQueue<String>();
    System.out.println(pq);
    PriorityQueue<String> pq1 = new PriorityQueue<String>(20);
    System.out.println(pq1);

    // ------------- confused --------------------

    Comparator<StringBuffer> comp = (sb1, sb2) -> {
      return sb1.length() - sb2.length();
    };

    StringBuffer sb1 = new StringBuffer("AAA");
    StringBuffer sb2 = new StringBuffer("B");
    StringBuffer sb3 = new StringBuffer("CCCCC");
    StringBuffer sb4 = new StringBuffer("DD");
    StringBuffer sb5 = new StringBuffer("EEEE");

    PriorityQueue pq2 = new PriorityQueue(comp);
    pq2.add(sb1);
    pq2.add(sb2);
    pq2.add(sb3);
    pq2.add(sb4);
    pq2.add(sb5);

    System.out.println(pq2);
    // ------------- end confused --------------------
  }
}
