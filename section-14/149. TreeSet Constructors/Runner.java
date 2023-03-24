import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

// 1.public TreeSet();
// It can be used to create an empty TreeSet object with the default natural sorting order.

// 2. public TreeSet(Comparator c):
// It can be used to create an empty TreeSet object with the Comparator provided sorting order over the elements.

// 3. public TreeSet(SortedSet ss):
// It can be used to create a TreeSet object with all the elements of the specified SortedSet.

// 4. public TreeSet(Collection c):
// It can be used to create a TreeSet object wiht all the elements of the specified Collection, where Collection may be a List, Set, Queue...

public class Runner {

  public static void main(String[] args) {
    TreeSet<String> ts = new TreeSet<String>();
    System.out.println(ts);
    SortedSet<String> ss = new TreeSet<String>();
    ss.add("AAA");
    ss.add("BBB");
    ss.add("CCC");
    ss.add("DDD");
    System.out.println(ss);
    TreeSet<String> ts1 = new TreeSet<>(ss);
    System.out.println(ts1);
    List<String> list = new ArrayList<String>();
    list.add("AAA");
    list.add("DDD");
    list.add("BBB");
    list.add("EEE");
    list.add("DDD");
    list.add("CCC");
    System.out.println(list);
    TreeSet<String> ts2 = new TreeSet<String>(list);
    System.out.println(ts2);
    System.out.println();

    Set<Integer> set = new HashSet();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    System.out.println(set);
    TreeSet<Integer> ts3 = new TreeSet<Integer>(set);
    System.out.println(ts3);
    System.out.println();

    Queue<String> queue = new PriorityQueue<String>();
    queue.add("ABC");
    queue.add("BBB");
    queue.add("CCC");
    queue.add("DDD");
    queue.add("EEE");
    System.out.println(queue);
    TreeSet<String> ts4 = new TreeSet<String>(queue);
    System.out.println(ts4);
  }
}
