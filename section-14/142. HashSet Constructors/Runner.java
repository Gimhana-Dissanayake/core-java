import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

//1. public HashSet():
// It can be used to create an empty HashSet object with the initial capacity of 16 elements and with the initial load factor is 75%.

// 2. public HashSet(int capacity):
// It can be used to create HashSet object with the specified capacity value.

// 3. public HashSet(int capacity, float loadFactor)
// It can be used to create HashSet object with the specified initial capacity value and with the specified load factor.

// 4. public HashSet(Collection c):
// It can be used to create HashSet object with all the elements of the specified Collection, where collection may be list implmentations or set implementations or Queue implementations.

public class Runner {

  public static void main(String[] args) {
    // 1.
    HashSet<String> hs = new HashSet<String>();
    System.out.println(hs);
    // 2.
    HashSet<String> hs1 = new HashSet<String>(20);
    System.out.println(hs1);
    // 3.
    HashSet<String> hs2 = new HashSet<String>(15, 0.80f);
    System.out.println(hs2);
    // 4.
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    System.out.println(list);
    HashSet<String> hs3 = new HashSet<String>(list);
    System.out.println(hs3);
    System.out.println();

    Set<Integer> set = new HashSet<Integer>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    System.out.println(set);
    HashSet<Integer> hs4 = new HashSet<Integer>(set);
    System.out.println(hs4);
    System.out.println();

    Queue<String> queue = new PriorityQueue<String>();
    queue.add("a1");
    queue.add("b1");
    queue.add("c1");
    queue.add("d1");
    System.out.println(queue);
    HashSet<String> hs5 = new HashSet<String>(queue);
    System.out.println(hs5);
  }
}
