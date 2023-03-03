import java.util.Stack;

public class Runner {

  public static void main(String[] args) {
    Stack<String> s = new Stack<String>();
    System.out.println(s);

    Stack<String> s1 = new Stack<String>();
    s1.push("a");
    s1.push("b");
    s1.push("c");
    s1.push("d");
    s1.push("e");
  }
}
// Stack:
// It was introduce in JDK1.0 version.
// It is a legacy collection.
// It is a child class to Vector class, it follows almost all behaviours of vector class, but, it able to manage all the elements as per LIFO[Last in First Out].
// Stack class constructor
// -----------------------------
// public Stack():
// --- It can be used to create an empty stack object
// Stack class methods:
// --------------------------------
//
