import java.util.ArrayDeque;
import java.util.Deque;

// 1. public void addFirst(Object element):
// It can be used to add the specified element as first element at Head side.

// 2. public void offerFirst(Object element):
// It can be used to add the specified element as first elment at Head side.

// Ex:
//
public class Runner {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.addFirst("AAA");
    dq.addFirst("BBB");
    dq.addFirst("CCC");
    System.out.println(dq);
    dq.offerFirst("XXX");
    dq.offerFirst("YYY");
    dq.offerFirst("ZZZ");
    System.out.println(dq);
  }
}
