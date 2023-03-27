import java.util.*;

// 4. public PriorityQueue(PriorityQueue pq):
// It can be used to create a PriorityQueue object with all the elements of the specified PriorityQueue

// 5. public PriorityQueue(SortedSet ss):
// It can be used to create PriorityQueue with all the elements of the specified SortedSet.

// 6. public PriorityQueue(Collection c):
// It can be used to create a priorityQueue  object with all the elements of the specified collection object, where the collection may be List implementations or Set implementations or Queue implementations.

public class Runner {

  public static void main(String[] args) {
    PriorityQueue<String> pq1 = new PriorityQueue<String>();
    pq1.add("AAA");
    pq1.add("BBB");
    pq1.add("CCC");
    pq1.add("DDD");
    pq1.add("EEE");
    System.out.println(pq1);

    PriorityQueue<String> pq2 = new PriorityQueue<String>(pq1);
    System.out.println(pq2);

    SortedSet<String> ss = new TreeSet<String>();
    ss.add("FFF");
    ss.add("AAA");
    ss.add("EEE");
    ss.add("BBB");
    ss.add("DDD");
    ss.add("CCC");
    System.out.println(ss);

    PriorityQueue<String> pq3 = new PriorityQueue<String>(ss);
    System.out.println(pq3);

    List<String> list = new ArrayList<String>();
    list.add("AAA");
    list.add("BBB");
    list.add("CCC");
    list.add("DDD");
    System.out.println(list);
    PriorityQueue<String> pq4 = new PriorityQueue<String>(list);
    System.out.println(pq4);
    System.out.println();
    Set<String> set = new HashSet<String>();
    set.add("XXX");
    set.add("YYY");
    set.add("ZZZ");
    System.out.println(set);
    PriorityQueue<String> pq5 = new PriorityQueue<String>(set);
    System.out.println(pq5);
    System.out.println();

    Queue<String> queue = new PriorityQueue<>();
    queue.add("ADC");
    queue.add("BCD");
    queue.add("CDE");
    queue.add("DEF");
    System.out.println(queue);
    PriorityQueue<String> pq6 = new PriorityQueue<String>(queue);
    System.out.println(pq6);
  }
}
