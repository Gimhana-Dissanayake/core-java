import java.util.function.Predicate;

public class Runner {

  public static void main(String[] args) {
    int[] array = { 0, 2, 20, 39, 50, 40, 60, 70, 80, 100, 49, 22, 10, 0, 19 };
    Predicate<Integer> p1 = i -> i > 10;
    Predicate<Integer> p2 = i -> i % 10 == 0;
    System.out.println("The numbers greater than 10 are: ");
    m1(p1, array);
    System.out.println("\n");

    System.out.println("The even numbers are: ");
    m1(p2, array);
    System.out.println("\n");

    System.out.println("The numbers not greater than 10 are: ");
    m1(p1.negate(), array);
    System.out.println("\n");

    System.out.println("The numbers greater than 10 and even numbers are: ");
    m1(p1.and(p2), array);
    System.out.println("\n");

    System.out.println("The numbers greater than 10 or even numbers are: ");
    m1(p1.or(p2), array);
  }

  public static void m1(Predicate<Integer> p, int[] items) {
    for (int item : items) {
      if (p.test(item)) {
        System.out.print(item + ", ");
      }
    }
  }
}
