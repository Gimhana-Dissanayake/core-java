import java.util.*;

// 1. public ArrayDeque():
// It can be used to create an empty ArrayDeque object with the initial capacity of 16 elements.

// 2. public ArrayDeque(int capacity)
// It can be used to create an empty Deque object with the specified capacity.

// 3. public ArrayDeque(Collection c):
// It can be used to create an ArrayDeque object with all the elements of the specified Collection, where collection may be List or Set or Queue.
public class Runner {

  public static void main(String[] args) {
    ArrayDeque<String> adq = new ArrayDeque<String>();
    System.out.println(adq);

    ArrayDeque<String> adq1 = new ArrayDeque<String>(20);
    System.out.println(adq1);

    List<String> list = new ArrayList<String>();
    list.add("AAA");
    list.add("BBB");
    list.add("CCC");
    list.add("DDD");
    System.out.println(list);
    ArrayDeque<String> adq2 = new ArrayDeque<String>(list);
    System.out.println(adq2);

    Set<String> set = new HashSet<String>();
    set.add("ABC");
    set.add("BCD");
    set.add("CDE");
    System.out.println(set);
    ArrayDeque<String> adq3 = new ArrayDeque<String>(set);
    System.out.println(adq3);

    Queue<String> queue = new PriorityQueue<String>();
    queue.add("AAA");
    queue.add("BBB");
    queue.add("CCC");
    queue.add("DDD");
    System.out.println(queue);
    ArrayDeque<String> adq4 = new ArrayDeque<String>(queue);
    System.out.println(adq4);
  }
}
