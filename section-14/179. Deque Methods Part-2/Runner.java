import java.util.ArrayDeque;
import java.util.Deque;

// Q) What is the diference between addLast() and offerLast()?

// Ans:
// Both the methods are used to add the provided element as last element at Tail side, if we access addLast() method to the bounded queues over its max capacity then JVM will raise an exception, but, if we access offerLast() method over its max capacity in bounded queues then JVM will not raise any excpetion.
public class Runner {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.addLast("AAA");
    dq.addLast("AAA");
    dq.addLast("AAA");
    System.out.println(dq);
    dq.offerLast("XXX");
    dq.offerLast("YYY");
    dq.offerLast("ZZZ");
    System.out.println(dq);
  }
}
