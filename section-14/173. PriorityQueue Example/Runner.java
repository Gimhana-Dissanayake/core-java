import java.util.PriorityQueue;

// confused: watch the lecture
public class Runner {

  public static void main(String[] args) {
    PriorityQueue pq = new PriorityQueue();
    pq.add("AAA");
    pq.add("BBB");
    pq.add("CCC");
    pq.add("DDD");
    System.out.println(pq);
    pq.add("BBB");
    pq.add("BBB");
    // pq.add(10); //class cast exception
    // pq.add(null); //null pointer exception
    System.out.println(pq);

    PriorityQueue<StringBuffer> pq1 = new PriorityQueue<StringBuffer>();
    pq1.add(new StringBuffer("AAAA"));
    pq1.add(new StringBuffer("BBBB"));
    pq1.add(new StringBuffer("CCCC"));
    pq1.add(new StringBuffer("CCCC"));

    System.out.println(pq1);
  }
}
