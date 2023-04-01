import java.util.ArrayDeque;
import java.util.Deque;

// 7.public Object removeLast():
// It can be used to remove and return last element from Deque at tail side.

// 8. public Object pollLast():
// It can be used to remove and return last element from Deque at tail side

//Q. What is the difference between pollLast() and removeLast()?
// Ans: Both the methods are used to remove and return last element from dequeue at tail side, but, if we access pollLast() method on an empty Dequeue then JVM will not raise any exception, where JVM will return null value, but, if we access removeLast() method on any mepty Dequeue then JVM will raise an excpetion like java.util.NoSuchElementException.

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
    System.out.println(dq.removeLast());
    System.out.println(dq);
    System.out.println(dq.removeLast());
    System.out.println(dq);
    System.out.println(dq.pollLast());
    System.out.println(dq);
    System.out.println(dq.pollLast());
    System.out.println(dq);

    Deque<String> dq1 = new ArrayDeque<String>();
    System.out.println(dq1.pollLast()); //null
    // System.out.println(dq1.removeLast()); //NoSuchElementException
  }
}
