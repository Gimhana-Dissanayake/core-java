import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Runner {

  public static void main(String[] args) {
    // 1. It can be used o create an empty ArrayList object with the initial capacity 10 elements.
    ArrayList<String> al1 = new ArrayList<String>();
    System.out.println(al);

    // 2.It can be used to create an empty ArrayList object with the specified capacity value.
    // public ArrayList(int capacity)

    ArrayList<String> al2 = new ArrayList<String>(20);
    System.out.println(a2);

    // 3. public ArrayList(Collection c):
    // It can be used to create an ArrayList object with all the elements of the specified collection, where collection may be List implementations, Set implementations, Queue implementation.
    ArrayList<String> al3 = new ArrayList<String>();
    al3.add("apple");
    al3.add("banana");
    al3.add("grapes");
    al3.add("mango");
    al3.add("oranges");

    ArrayList<String> al4 = new ArrayList<String>(al3);
    System.out.println(al4);

    HashSet<String> hs = new HashSet<String>();
    hs.add("toyota");
    hs.add("mazda");
    hs.add("mitsubishi");

    ArrayList<String> al5 = new ArrayList<String>(hs);
    System.out.println(al5);

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    pq.add(1);
    pq.add(2);
    pq.add(3);
    pq.add(4);
    pq.add(5);

    ArrayList<Integer> al6 = new ArrayList<Integer>(pq);
    System.out.println(al6);
  }
}
