//watch the lecture
import java.util.PriorityQueue;
import java.util.Queue;

// 1. public void offer(Object element):
// It can be used to add the specified element to Queue.

// 2. public Object poll();
// It can be used to remove and return Head element from Queue.

public class Runner {

  public static void main(String[] args) {
    Queue<String> queue = new PriorityQueue<String>();
    queue.offer("AAA");
    queue.offer("BBB");
    queue.offer("CCC");
    queue.offer("DDD");
    queue.offer("EEE");
    queue.offer("FFF");
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);
  }
}
