import java.util.function.Function;

public class Runner {

  public static void main(String[] args) {
    Function<String, Integer> f = s -> s.length();
    System.out.println("length " + f.apply("panda"));

    Function<Integer, Integer> f1 = i -> i * i;
    System.out.println("Square " + f1.apply(10));
  }
}
// Predicate is can return only boolean a boolean value, but Function can return any value
// watch lecture
