import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Vector;

// 1. public Vector():
// It can be used to create an empty Vector object with initial capacity of 10 objects
// 2. public Vector(int capacity):
// It can be used to create an empty Vector object with the specified capacity value.
// 3. public Vector(int capacity, int incrementalCapacity)
// It can be used to create an empty vector object with the specified initial capacity and with the specified capacity incremental ratio
// 4. public Vector(Collection c)
// It can be used to create a vector object with all the elements of the specified collection, where the provided collection may be a list implementation or may be a set implementation or may be a queue implementation.
public class Runner {

  public static void main(String[] args) {
    // first constructor
    Vector<Integer> v = new Vector<Integer>();
    System.out.println(v);
    System.out.println(v.capacity());
    System.out.println("****************************************************");
    // second contructor
    Vector<Integer> v1 = new Vector<Integer>(15);
    System.out.println(v1.capacity());
    System.out.println("****************************************************");
    // third constructor
    Vector<Integer> v2 = new Vector<Integer>(10, 5);
    System.out.println(v2.capacity());
    for (int i = 1; i < 11; i++) {
      v2.add(i);
    }
    System.out.println(v2.capacity());
    for (int i = 12; i <= 21; i++) {
      v2.add(i);
    }
    System.out.println(v2.capacity());
    System.out.println("****************************************************");
    // fourth constructor
    Vector<String> v3 = new Vector<String>();
    v3.add("a");
    v3.add("b");
    v3.add("c");
    v3.add("d");
    System.out.println(v3);
    Vector<String> v4 = new Vector<>(v3);
    System.out.println(v4);
    System.out.println();

    HashSet<String> hs = new HashSet<String>();
    hs.add("p");
    hs.add("q");
    hs.add("r");
    hs.add("t");
    hs.add("u");

    System.out.println(hs);

    Vector<String> v5 = new Vector<String>(hs);
    System.out.println(v5);

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(10);
    pq.add(20);
    pq.add(30);
    pq.add(40);
    System.out.println(pq);
    Vector<Integer> v6 = new Vector<Integer>(pq);
    System.out.println(v6);
  }
}
