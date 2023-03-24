// Q. How TreeSet is able to manager Sorting Order over the elements?
// Ans.

// compareTo() method:
// It can be used to compare elements as per dictionary order.
// compareTo() was provided by java.lang.Comparable interface.
// public int compareTo(Object obj)

// In J2SE, String class, all wrapper classes ,... have implemented java.lang.Comparable interface.

// String class has provided implmentation for compareTo() method like below.

// str1.compareTo(str2);

// 1. If str1 comes first when compared with str2 in dictionary order then compareTo() method will return -ve value.

// 2. If str2 comes first when compared with str1 then compareTo() method will return +ve value.

// 3. If both str1 and str2 are same that is, if both are ath the same location in dictionary order then compareTo() method will return 0 value.

public class Runner {

  public static void main(String[] args) {
    String str1 = new String("abc"); //abc.compareTo(def) -ve
    String str2 = new String("def"); //def.compareTo(abc) +ve
    String str3 = new String("abc"); //abc.compareTo(abc) 0
    System.out.println(str1.compareTo(str2));
    System.out.println(str2.compareTo(str3));
    System.out.println(str3.compareTo(str1));
  }
}
