import java.util.LinkedList;

public class Runner {

  public static void main(String[] args) {
    LinkedList<String> lL1 = new LinkedList<String>();
    lL1.add("a");
    lL1.add("b");
    lL1.add("c");
    lL1.add("d");
    System.out.println(lL1);
    lL1.addFirst("x");
    lL1.addLast("y");
    System.out.println(lL1);
    System.out.println("First element " + lL1.getFirst());
    System.out.println("Last element " + lL1.getLast());
    lL1.removeFirst();
    lL1.removeLast();
    System.out.println(lL1);
  }
}
// LinkedList class Methods:
// --------------------------------
// 1. public void addFirst(Object element)
// It can be used to add the specified element as first element
// 2. public void addLast(Object element)
// It can be used to add the specified element as last element
// 3. public Object getFirst()
// It can be used to get first element of the LinkedList.
// 4. public Object getLast()
// It can be used to get Last element of the LinkedList
// 5. public void removeFirst():
// It can be used to remove first element from LinkedList.
// 6. public void removeLast():
// It can be used to remove last element from LinkedList.
