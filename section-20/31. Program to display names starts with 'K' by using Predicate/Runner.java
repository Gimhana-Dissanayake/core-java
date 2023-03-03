import java.util.function.Predicate;

public class Runner {

  public static void main(String[] args) {
    String[] names = { "Kamal", "Kanthi", "Malan", "Saman", "Raj" };
    Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
    System.out.println("The name starts with K are: ");
    for (String s : names) {
      if (startsWithK.test(s)) {
        System.out.println(s);
      }
    }
  }
}
