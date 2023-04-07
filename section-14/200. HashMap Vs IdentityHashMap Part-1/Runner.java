// Q) What is the difference between == operator and equals(--)?
// Ans:
// '==', is a comparison operation, it will check whether the provided two operand values are same or not, if the provided two operand values are same then '==' operator will return true value, if the provided two operand values are different then == operator will return true value, here the two operatnds may be normal primitive variables or object reference variables.

// equals() is a method defined in java.lang.Object class, it was implemented to check whether the two object reference varialbes values are same or not[References comparison], if the provided two object references variables values are same then it will return true value, if the provided two reference variable values are not the same then it will return false value.

// In java, some of the predefined classes like String, all wrapper classes,... have overridden Object class equals() method in such a way to perform content comparison instead of reference comparison

// Q) What are the difference between HashMap and IndentityHashMap?
// Ans:

class A {}

public class Runner {

  public static void main(String[] args) {
    int i = 10;
    int j = 20;

    A a1 = new A();
    A a2 = new A();

    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(i == j); //false
    System.out.println(a1 == a2); //false
    System.out.println(str1 == str2); //false

    System.out.println(a1.equals(a2)); //false
    System.out.println(str1.equals(str2)); //true
  }
}
