//watch the lecture
import java.util.PriorityQueue;
import java.util.Queue;

// 1. public void offer(Object element):
// It can be used to add the specified element to Queue.

// 2. public Object poll();
// It can be used to remove and return Head element from Queue.

// 3. public Object remove();
// It can be used to remove and return Head element from Queue.

// NOTE: poll and remove methods functionality is the same

// Q) What is the difference between poll() method and remove() method?
// Both the methods are used to remove and return head element form Queue, if we access poll() method on an empty queue then poll() method will return null value, if we access remove() method on an empty queue then JVM will raise an exception like java.util.NoSuchElementException.

public class Runner {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<String>();
    Queue<String> queue1 = new PriorityQueue<String>();
    queue.offer("AAA");
    queue.offer("BBB");
    queue1.offer("AAA");
    queue1.offer("BBB");
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);

    System.out.println("------QUEUE 2------");

    queue1.remove();
    System.out.println(queue1);
    queue1.remove();
    System.out.println(queue1);
    // queue1.remove(); exception
  }
}
