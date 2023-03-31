import java.util.ArrayDeque;
import java.util.Deque;

// 5. public Object removeFirst():
// It can be used to remove and return first element from Deque at Head side.

// 6. public Object pollFirst():
// It can be used to remove and return first element form Deque at Head Side.

// Q) What is the difference between pollFirst() and removeFirst()?
// Ans:
// Both the methods are used to remove and return head element from Deque at Head side, but, if we access pollFirst() method on an empty Deque then JVM will not raise any exception, where JVM will return Null value. If we access removeFirst() method on any empty Deqeue then JVM will raise an exception like java.util.NoSuchElementException.

//
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
    System.out.println(dq.removeFirst());
    System.out.println(dq);
    System.out.println(dq.removeFirst());
    System.out.println(dq);
    System.out.println(dq.pollFirst());
    System.out.println(dq);
    System.out.println(dq.pollFirst());
    System.out.println(dq);

    Deque<String> dq1 = new ArrayDeque<String>();
    System.out.println(dq1.pollFirst());
    // System.out.println(dq1.removeFirst()); //NoSuchElementException
  }
}
