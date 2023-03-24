import java.util.*;

public class Runner {

  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add("FFF");
    ts.add("AAA");
    ts.add("EEE");
    ts.add("BBB");
    ts.add("DDD");
    ts.add("CCC");
    System.out.println(ts);
    ts.add("BBB");
    System.out.println(ts);
    // ts.add(new Integer(10)); --> ClassCastException
    // ts.add(null); --> NullPointerException
    // ts.add(new StringBuffer("XXX"));  --> ClassCastException

  }
}
