import java.util.Comparator;
import java.util.TreeSet;

// watch the lecture;

class MyComparator implements Comparator<StringBuffer> {

  @Override
  public int compare(StringBuffer sb1, StringBuffer sb2) {
    return sb1.length() - sb2.length();
  }
}

public class Runner {

  public static void main(String[] args) {
    MyComparator mc = new MyComparator();

    TreeSet ts = new TreeSet(mc);

    StringBuffer sb1 = new StringBuffer("AAA");
    StringBuffer sb2 = new StringBuffer("BBBBB");
    StringBuffer sb3 = new StringBuffer("C");
    StringBuffer sb4 = new StringBuffer("DDDD");
    StringBuffer sb5 = new StringBuffer("EE");

    ts.add(sb1);

    ts.add(sb2); // mc.compare(sb2, sb1); +ve

    ts.add(sb3); // mc.compare(sb3, sb1); -ve

    ts.add(sb4); // mc.compare(sb4, sb1); +ve
    // mc.compare(sb4, sb2); -ve

    ts.add(sb5); //mc.compare(sb5, sb1); -ve
    //mc.compare(sb5, sb3); +ve

    System.out.println(ts); //[sb3, sb5, sb1, sb4, sb2 ]
  }
}
