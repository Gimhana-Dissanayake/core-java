import java.util.ArrayDeque;
import java.util.Deque;

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
