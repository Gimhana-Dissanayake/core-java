import java.util.Vector;

// 1. public void addElement(Object element):
// It can be used to add the specified element to Vector object

// 2. public Object firstElement():
// It can be used ot get First element from Vector.

// 3. public Object lastElement():
// It can be used to get Last element from Vector.

// 4. public Object elementAt(int index):
// It can be used to get an element existed at the specified index,

// 5. public void removeElement(int index):
// It can be used to remove an element existed at the specified index value.

// 6. public boolean removeElement(Object element);
// It can be used to remove the specified element from Vector.
// If the specified element is existed then element will be removed and it will return true value.
// If the specified element is not existed then it will return false value.

// 7. public void removeAllElements():
// It can be used to remove all the elements from the Vector.

public class Runner {

  public static void main(String[] args) {
    Vector<String> v = new Vector<String>();
    v.addElement("a");
    v.addElement("b");
    v.addElement("c");
    v.addElement("d");
    v.addElement("e");
    System.out.println(v);
    System.out.println(v.firstElement());
    System.out.println(v.lastElement());
    System.out.println(v.elementAt(3));
    System.out.println(v.removeElementAt(2));
    System.out.println(v);
    System.out.println(v.removeElement("a"));
    System.out.println(v);
    System.out.println(v.removeElement("z"));
    System.out.println(v);
  }
}
