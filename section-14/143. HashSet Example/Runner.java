import java.util.*;

public class Runner {

  public static void main(String[] args) {
    HashSet hs = new HashSet();
    hs.add("AAA");
    hs.add("BBB");
    hs.add("CCC");
    hs.add("DDD");
    hs.add("EEE");
    System.out.println(hs);
    // System.out.println(hs.get(3));//Error because HashSet is not index based
    hs.add("BBB"); //duplicates are not allowed
    System.out.println(hs);
    hs.add(10);
    hs.add(20);
    System.out.println(hs); //allows heterogenous elements
    hs.add(null);
    hs.add(null);
    System.out.println(hs); //allows only one null value
  }
}
