import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Runner {

  public static void main(String[] args) {
    Comparator<Integer> c = (i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? +1 : 0;
    TreeSet<Integer> t = new TreeSet<Integer>();
    TreeSet<Integer> t1 = new TreeSet<Integer>(c);
    t.add(10);
    t.add(0);
    t.add(15);
    t.add(25);
    t.add(5);
    t.add(20);
    t.add(20);

    t1.add(20);
    t1.add(14);
    t1.add(19);
    t1.add(200);
    t1.add(38);
    t1.add(2);
    t1.add(14);

    System.out.println(t);

    System.out.println("In decending order");
    System.out.println(t1);
  }
}
