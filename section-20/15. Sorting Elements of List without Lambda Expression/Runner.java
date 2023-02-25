import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

  public int compare(Integer i1, Integer i2) {
    if (i1 > i2) {
      return -1;
    } else if (i1 < i2) {
      return +1;
    } else {
      return 0;
    }
  }
}

public class Runner {

  public static void main(String[] args) {
    ArrayList<Integer> l = new ArrayList<Integer>();

    l.add(10);
    l.add(0);
    l.add(100);
    l.add(170);
    l.add(50);
    l.add(20);

    ArrayList<Integer> l2 = new ArrayList<Integer>();

    l2.add(7);
    l2.add(99);
    l2.add(13);
    l2.add(89);
    l2.add(45);
    l2.add(20);

    System.out.println("******Without lamda******");

    System.out.println("Before sorting : " + l);

    Collections.sort(l);
    System.out.println("sorted to accending order : " + l);

    Collections.sort(l, new MyComparator());
    System.out.println("sorted to desending order : " + l);

    System.out.println("--------With lamda------");

    Comparator<Integer> c = (i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? +1 : 0;

    Collections.sort(l2, c);
    System.out.println(l2);
    System.out.println(
      "sorted to desending order with lamda expression : " + l2
    );
  }
}
