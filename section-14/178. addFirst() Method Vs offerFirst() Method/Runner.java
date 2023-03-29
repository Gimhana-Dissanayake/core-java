// Q What is the difference between addFirst() method and offerFirstMethod()

// Ans:
// In java, there are two type of Queues.
// 1. Bounded Queues: These queues are having capacity constraints, over the max capacity elements are not going to be allowed.
// Ex: All the queue which are existed in java.util.concurrent package are bounded queues
// Ex: BlockingQueue, ArrayBlockingQueue,...

// 2. Unbounded Queues: These queue are not having capacity constraints, we can add elements to the queue over its max capacity.
// Ex: All the queue which are existed in java.util package are unbounded queues.
// Ex: PriorityQueue, Dequeue, ArrayDequeue, LinkedList

// If we add any element by using addFirst() over its max capacity in a bounded queue then JVM will raise an exception, but, if we use offerFirst() method to add an element to the bounded queue over its max capacity then JVM will not raise any exception.

// 3. public void addLast(Object element):
// It can be used to add the specified element to the queue as last element at Tail side.

// 4. public void offerLast(Object element):
// It can be used to add the specified element to the Queue as last element at tail side
public class Runner {}
