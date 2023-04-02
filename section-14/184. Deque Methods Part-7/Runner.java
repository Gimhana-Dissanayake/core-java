import java.util.ArrayDeque;
import java.util.Deque;

// 9. public Object getFirst():
// It can be used to return [but not remove] first element from deque at head side

// 10. public Object peekFirst():
// It can be used to return [but not remove] first element from Deque at head side.

// Q) What is the difference between getFirst() and peekFirst() in Deque?

// Ans.
// Both the methods are used to get first element from deque at Head side, but, if we access getFirst() method on an empty deque then JVM will raise an exception like java.util.NoSuchElementException, but, if we access peekFirst() method on an empty Deque then JVM will not rasie an exception, where JVM will return null value.

public class Runner {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.add("AAA");
    dq.add("BBB");
    dq.add("CCC");
    dq.add("DDD");
    dq.add("EEE");
    System.out.println(dq);
    System.out.println(dq.getFirst());
    System.out.println(dq.peekFirst());

    Deque<String> dq1 = new ArrayDeque<String>();
    System.out.println(dq1.peekFirst());
    // System.out.println(dq1.getFirst());//java.util.NoSuchElementException
  }
}
