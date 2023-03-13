import java.util.ArrayList;
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
    System.out.println();
    ListIterator<String> lit = al.listIterator();
    System.out.println("Elements in forwared direction :");
    while (lit.hasNext()) {
      System.out.println(lit.nextIndex() + "--------->" + lit.next());
    }
    System.out.println();
    System.out.println("Elements in backward direction :");
    while (lit.hasPrevious()) {
      System.out.println(lit.previous());
    }
  }
}
