import java.util.ArrayDeque;
import java.util.Deque;

// Watch the lecture

// Q. Find the output for the following program

public class Runner {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.addFirst("AAA");
    dq.addLast("BBB");
    dq.offerFirst("CCC");
    dq.offerLast("DDD");
    dq.pollFirst();
    dq.removeLast();
    dq.offerLast("EEE");
    dq.removeFirst();
    dq.offerFirst("FFF");
    System.out.println(dq);
  }
}
