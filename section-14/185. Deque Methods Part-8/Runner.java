import java.util.*;

public class Runner {

  // 11. public Object getLast():
  // It can be used to return[But not remove] last element from Deque at tail side.

  // 12. public Object peekLast()
  // It ca be used to return [but not remove] last element from Deque at Tail side.

  //   Q) What is the difference between getLast() and peekLast()?

  // Ans:
  // Both the methods are used to return last element from Deque at tail side, but, if we access getLast() method an empty deque then JVM will raise an exception like java.util.NoSuchElementException,but,if we access peekLast() method on an empty deque then JVM will not raise any exception, where JVM will return null value.

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.add("AAA");
    dq.add("BBB");
    dq.add("CCC");
    dq.add("DDD");
    dq.add("EEE");
    dq.add("FFF");
    System.out.println(dq);
    System.out.println(dq.getLast());
    System.out.println(dq.peekLast());

    Deque<String> dq1 = new ArrayDeque<String>();
    System.out.println(dq1.peekLast());
    // System.out.println(dq1.getLast()); //java.util.NoSuchElementException
  }
}
