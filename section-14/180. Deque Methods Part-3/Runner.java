import java.util.ArrayDeque;
import java.util.Deque;

public class Runner {

  public static void main(String[] args) {
    // Q) Find the output for the following program?
    Deque<String> dq = new ArrayDeque<String>();
    dq.addFirst("AAA");
    dq.addLast("BBB");
    dq.offerFirst("CCC");
    dq.offerLast("DDD");
    dq.addFirst("EEE");
    dq.offerLast("FFF");
    System.out.println(dq);
  }
}
