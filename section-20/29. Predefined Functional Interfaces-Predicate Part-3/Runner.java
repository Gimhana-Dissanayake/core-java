import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Runner {

  public static void main(String[] args) {
    Predicate<String> p = s -> s.length() > 5;
    Predicate<List> p1 = c -> c.isEmpty();

    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(3);
    ArrayList<Integer> al2 = new ArrayList<>();

    System.out.println(p.test("hello"));
    System.out.println(p.test("welcome people"));

    System.out.println(p1.test(al));
    System.out.println(p1.test(al2));
  }
}
