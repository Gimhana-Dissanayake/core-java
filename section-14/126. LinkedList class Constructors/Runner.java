import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Runner {

  public static void main(String[] args) {
    LinkedList<String> lL = new LinkedList<String>();
    System.out.println(lL);

    LinkedList<String> lL2 = new LinkedList<String>();
    lL2.add("a");
    lL2.add("b");
    lL2.add("c");
    lL2.add("d");
    System.out.println(lL2);
    LinkedList<String> lL3 = new LinkedList<String>(lL2);
    System.out.println(lL3);

    HashSet<Integer> hs = new HashSet<Integer>();
    hs.add(10);
    hs.add(20);
    hs.add(30);
    hs.add(40);
    hs.add(50);
    System.out.println(hs);
    LinkedList<Integer> lL4 = new LinkedList<Integer>(hs);
    System.out.println(lL4);
    System.out.println();

    PriorityQueue<String> pq = new PriorityQueue<String>();
    pq.add("x");
    pq.add("y");
    pq.add("z");
    System.out.println(pq);
    LinkedList<String> lL5 = new LinkedList<String>(pq);
    System.out.println(lL5);
  }
}
// LinkedList class constructors:
// ---------------------------------------------
// 1. public LinkedList():
// It can be used to create an empty LinkedList Object
// 2. public LinkedList(Collection c):
// It can be used to create a LinkedList object with all the elements of the specified collection, where the collection may be list implementations or itmay be set implentations or it may be queue implementaions.
