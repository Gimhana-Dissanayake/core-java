import java.util.ArrayDeque;

public class Runner {

  public static void main(String[] args) {
    ArrayDeque<String> adq = new ArrayDeque<String>();
    adq.add("AAA");
    adq.add("FFF");
    adq.add("BBB");
    adq.add("EEE");
    adq.add("CCC");
    adq.add("DDD");
    System.out.println(adq);
    adq.add("BBB");
    adq.add("CCC");
    System.out.println(adq);

    ArrayDeque adq1 = new ArrayDeque();
    adq1.add("AAA");
    adq1.add("FFF");
    System.out.println(adq1);
    adq1.add(20);
    adq1.add(55.4f);
    // adq1.add(null);//null elements are not allowed
    System.out.println(adq1);
  }
}
