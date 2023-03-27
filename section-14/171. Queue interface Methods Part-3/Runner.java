import java.util.PriorityQueue;
import java.util.Queue;

// 4. public Object peek();

// It can be used to return(Not remove) Head element of the queue.

// 5. public object element():
// It can be used to return(but not remove) Head element of the Queue.

// 6. What is the difference between peek() and element() are used ot find head element of the queue, if we access peek() method on an empty queue then peek() will return null value, but, if we access element() method on an empty then JVM will raise an exception like java.util.NoSuchElementException.
public class Runner {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<String>();
    queue.offer("AAA");
    queue.offer("BBB");
    queue.offer("CCC");
    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.element());

    Queue<String> queue1 = new PriorityQueue<String>();
    System.out.println(queue1.peek());

    Queue<String> queue2 = new PriorityQueue<String>();
    // System.out.println(queue2.element()); //will raise an exception
  }
}
