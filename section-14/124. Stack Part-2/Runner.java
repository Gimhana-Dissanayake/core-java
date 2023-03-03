import java.util.Stack;

// 2. public Object pop();
// It can be used to remove and return top of the element.

// 3. public Object peek();
// It can be used to return[but not remove] top of the stack.

// 4. public int search(Object element):
// It can be used to get position value of the specified element in Stack, if the element is existed then its position value will be returned, if the elements is not existed then search() method will return -1 value.

public class Runner {

  public static void main(String[] args) {
    Stack<String> s1 = new Stack<String>();
    s1.push("a");
    s1.push("b");
    s1.push("c");
    s1.push("d");
    s1.push("e");

    System.out.println(s1);
    System.out.println(s1.pop());
    System.out.println(s1);
    System.out.println(s1.pop());
    System.out.println(s1);
    System.out.println(s1.pop());
    System.out.println("Peek " + s1.peek());
    System.out.println("Search " + s1.search("a"));
  }
}
