import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

// 15. public Iterator iterator():
// It can be used to get all the elements of Deque in an Iterator object in forward direction inorder to read one by one element.

// 16. public Iterator descendingIterator():
// It can be used to get all the elements of Deque in an Iterator object in backward direction or reverse direction.

public class Runner {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.add("AAA");
    dq.add("BBB");
    dq.add("CCC");
    dq.add("DDD");
    dq.add("EEE");
    dq.add("FFF");
    System.out.println(dq);
    Iterator<String> it = dq.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }

    Deque<String> dq1 = new ArrayDeque<String>();
    dq.add("AAA");
    dq.add("BBB");
    dq.add("CCC");
    dq.add("DDD");
    dq.add("EEE");
    dq.add("FFF");
    System.out.println(dq1);

    Iterator<String> it1 = dq.descendingIterator();
    while (it1.hasNext()) {
      System.out.println(it1.next());
    }
  }
}
