import java.util.ArrayDeque;
import java.util.Deque;

// 13. public boolean removeFirstOccurence(Object element):
// It can be used to remove the specified element at its first occurence, if the element is removed then it will return true value, if the element is not remove then it will return false value.

// 14. public boolean removeLastOccurence(Object element):
// It can be used to remove the specifed element at its last occurence, if the elemetn is removed then it will return true value,if the element is not remove then it will return false value.

public class Runner {

  public static void main(String[] args) {
    Deque<String> dq = new ArrayDeque<String>();
    dq.add("AAA");
    dq.add("BBB");
    dq.add("CCC");
    dq.add("BBB");
    dq.add("EEE");
    dq.add("FFF");
    dq.add("BBB");
    System.out.println(dq);
    System.out.println(dq.removeFirstOccurrence("BBB"));
    System.out.println(dq);
    System.out.println(dq.removeFirstOccurrence("XXX"));
    System.out.println(dq);
    System.out.println(dq.removeLastOccurrence("BBB"));
    System.out.println(dq);
    System.out.println(dq.removeLastOccurrence("ZZZ"));
    System.out.println(dq);
  }
}
