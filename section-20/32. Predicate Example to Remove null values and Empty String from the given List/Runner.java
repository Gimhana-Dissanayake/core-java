import java.util.ArrayList;
import java.util.function.Predicate;

public class Runner {

  public static void main(String[] args) {
    String[] names = { "kamal", "raj", null, null, "Batman", null, "Tharindu" };
    Predicate<String> p = s -> s != null && s.length() != 0;
    ArrayList<String> al = new ArrayList<String>();
    for (String item : names) {
      if (p.test(item)) {
        al.add(item);
      }
    }

    System.out.println("Purified list " + al);
  }
}
