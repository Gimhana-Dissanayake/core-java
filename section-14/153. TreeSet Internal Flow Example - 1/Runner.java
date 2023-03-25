import java.util.TreeSet;

// Watch the lecture

public class Runner {

  public static void main(String[] args) {
    TreeSet ts = new TreeSet();
    ts.add("FFF");

    ts.add("AAA");
    // "AAA".compareTo("FFF")l -ve

    ts.add("EEE");
    // "EEE".compareTo("FFF");-ve
    // "EEE".compareTo("AAA");+ve

    ts.add("BBB");
    // "BBB".compareTo("FFF"); -ve
    // "BBB".compareTo("AAA"); +ve
    // "BBB".compareTo("EEE"); -ve

    ts.add("DDD");
    // "DDD".compareTo("FFF"); -ve
    // "DDD".compareTo("AAA"); +ve
    // "DDD".compareTo("EEE"); -ve
    // "DDD".compareTo("BBB"); +ve

    ts.add("CCC");
    // "CCC".compareTo("FFF"); -ve
    // "CCC".compareTo("AAA");+ve
    // "CCC".compareTo("EEE");-ve
    // "CCC".compareTo("BBB");+ve
    // "CCC".compareTo("DDD");-ve

    System.out.println(ts);
  }
}
