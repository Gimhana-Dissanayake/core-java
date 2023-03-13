import java.io.*;
import java.util.*;

public class Solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    /* Enter your code here. Print output to STDOUT. */

    int len = A.length() + B.length();

    boolean lexi = false;

    char[] aAchar = A.toCharArray();
    char[] bAchar = B.toCharArray();

    int counter = 0;

    int limit = A.length() > B.length() ? B.length() : A.length();

    while (counter < limit) {
      if (aAchar[counter] < bAchar[counter]) {
        lexi = true;
        return;
      }

      counter++;
    }

    String lexiStr = lexi ? "No" : "Yes";

    String aCapicatlized =
      A.toUpperCase().substring(0, 0) + A.toUpperCase().substring(1);

    String bCapicatlized =
      B.toUpperCase().substring(0, 0) + B.toUpperCase().substring(1);

    System.out.println(len);
    System.out.println(lexiStr);
    System.out.println(aCapicatlized + " " + bCapicatlized);
  }
}
