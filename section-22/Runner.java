import java.util.*;

public class Runner {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] a = new int[n];

    int counter = 0;

    Scanner s1 = new Scanner(System.in);
    while (counter < a.length) {
      if (s1.hasNextInt()) {
        int val = Integer.parseInt(s1.nextLine());
        a[counter] = val;
        counter++;
      }
    }

    s1.close();

    scan.close();
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
