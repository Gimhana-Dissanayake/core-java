import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

// Iterator
// Iterator is a interface provided by JAVA in its JDK1.2 version.
// It is not legacy cursor
// It is also called as "Universal Cursor", it is applicable for all the collection implementations.
// It allows both read and remove operations while iterating elements.
// To get iterator object we have to use the following method from all collection implementaion classes.
// public Iterator iterator()
// Ex: Itrator it = al.iterator();
// To read elements form Iterator, Iterator has provided the following methods.
// 1. public boolean hasNext();
// It will check whether next element is existing or not from current cursor position.
// If next element is exsisting form current cursor position then it will return true value and if there is no next element it will return false value
// 2. public Object next();
// It will read next element and it will move cursor to the next position
// 3. public void remove():
// It can be used to remove current element from the collection.
public class Runner {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    System.out.println(list);
    Iterator<String> it1 = list.iterator();
    while (it1.hasNext()) {
      System.out.println(it1.next());
    }
    System.out.println();

    Set<Integer> set = new HashSet<Integer>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    System.out.println(set);
    Iterator<Integer> it2 = set.iterator();
    while (it2.hasNext()) {
      System.out.println(it2.next());
    }

    System.out.println();

    Queue<String> queue = new PriorityQueue<String>();
    queue.add("a");
    queue.add("b");
    queue.add("d");
    queue.add("e");

    System.out.println(queue);
    Iterator<String> it3 = queue.iterator();

    while (it3.hasNext()) {
      System.out.println(it3.next());
    }

    System.out.println();

    List<String> list1 = new ArrayList<String>();
    list1.add("a");
    list1.add("b");
    list1.add("d");
    list1.add("e");

    System.out.println(list1);
    Iterator<String> it4 = list1.iterator();

    while (it4.hasNext()) {
      String elem = it4.next();
      if (elem.equals("b")) {
        it4.remove();
      }
    }

    System.out.println("Removed list " + list1);
  }
  //   Drawbacks with iterator:
  // 1. It allows us to perform only read and remove operations, it does not allow us to perform relace and insert operations while iteraing elements
  // 2. It allows us to read elements in only forward direction. It does not allow us to read elements in backward direction

}
