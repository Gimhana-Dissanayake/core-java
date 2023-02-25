import java.util.Comparator;
import java.util.TreeMap;

public class Runner {

  public static void main(String[] args) {
    TreeMap<Integer, String> m = new TreeMap<Integer, String>();
    m.put(100, "Jim");
    m.put(400, "Carl");
    m.put(300, "Caroline");
    m.put(50, "Jhon");
    m.put(900, "Sam");
    System.out.println(m);

    System.out.println("With comparator");
    Comparator<Integer> c = (i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? +1 : 0;
    TreeMap<Integer, String> m1 = new TreeMap<Integer, String>(c);

    m1.put(100, "Sampath");
    m1.put(400, "Kalum");
    m1.put(300, "Raj");
    m1.put(50, "Malith");
    m1.put(900, "Surendra");
    System.out.println(m1);
  }
}
