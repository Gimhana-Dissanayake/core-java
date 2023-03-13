import java.util.Scanner;

public class Solution4 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    Integer[] a = new Integer[n];

    int counter = 0;

    Scanner s1 = new Scanner(System.in);

    // while (counter < a.length) {
    //   int val = s1.nextInt();
    //   a[counter] = val;
    //   counter++;
    // }

    for (int j = 0; j < n; j++) {
      int val = s1.nextInt();
      a[j] = val;
    }

    s1.close();
    scan.close();

    for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
  }
}
