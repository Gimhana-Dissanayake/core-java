import java.io.*;
import java.util.*;

public class Driver {

  public static <E> void printArray(E[] inputArray) {
    for (E element : inputArray) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Integer[] intArray = new Integer[3];
    String[] stringArray = new String[2];

    Scanner intScanner = new Scanner(System.in);

    int intCounter = 0;
    while (intCounter < 3) {
      int n = Integer.parseInt(intScanner.nextLine());
      intArray[intCounter] = n;
      intCounter++;
    }

    Scanner stringScanner = new Scanner(System.in);

    int stringCounter = 0;
    while (stringCounter < 2) {
      String s = stringScanner.nextLine();
      stringArray[stringCounter] = s;
      stringCounter++;
    }

    printArray(intArray);

    printArray(stringArray);
  }
}
