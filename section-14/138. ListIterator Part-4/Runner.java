import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Runner {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<String>();
    al.add("a");
    al.add("b");
    al.add("c");
    al.add("d");
    al.add("e");
    System.out.println(al);
    ListIterator<String> lit = al.listIterator();
    while (lit.hasNext()) {
      String element = lit.next();
      if (element.equals("b")) {
        lit.add("x");
      }

      if (element.equals("d")) {
        lit.set("y");
      }

      if (element.equals("e")) {
        lit.remove();
      }
    }
    System.out.println(al);
  }
}
