import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

  // Get only even numbers
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(0);
    al.add(10);
    al.add(25);
    al.add(22);
    al.add(35);

    // without streams (until 1.7v)
    List<Integer> l1 = new ArrayList<Integer>();
    for (Integer i : al) {
      if (i % 2 == 0) {
        l1.add(i);
      }
    }

    System.out.println("List generated without streams " + l1);
    System.out.println(
      "**************************************************************"
    );
    System.out.println(
      "**************************************************************"
    );

    // with streams (form 1.8v)
    List<Integer> l2 = al
      .stream()
      .filter(i -> i % 2 == 0)
      .collect(Collectors.toList());
    System.out.println("List generated with streams " + l2);

    System.out.println(
      "**************************************************************"
    );

    System.out.println("list with all the elements multipled by 2");

    List<Integer> l3 = al.stream().map(i -> i * 2).collect(Collectors.toList());
    System.out.println(l3);
  }
}
