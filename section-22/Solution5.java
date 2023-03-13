import java.util.Scanner;

public class Solution5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int[] nums = new int[size];
    int i;

    for (i = 0; i < nums.length; i++) {
      nums[i] = sc.nextInt();
    }

    int j = sc.nextInt();

    int[] nums1 = new int[j];

    for (j = 0; j < nums1.length; j++) {
      nums1[j] = sc.nextInt();
    }
  }
}
