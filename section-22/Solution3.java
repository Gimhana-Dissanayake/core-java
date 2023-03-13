import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.Currency;
import java.util.Locale;
import java.util.regex.*;

public class Solution3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    // Write your code here.

    Formatter fm = new Formatter();
    Formatter f = fm.format("%.2f", payment);

    String us = Currency.getInstance(Locale.US).toString() + f;
    String india = "Rs." + f;
    String china = Currency.getInstance(Locale.CHINESE).toString() + f;
    String france = f + " " + Currency.getInstance(Locale.FRANCE).toString();

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}
