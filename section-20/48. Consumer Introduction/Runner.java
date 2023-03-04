// Consumer accepts a value, does some operations and does not return any value
import java.util.function.Consumer;

public class Runner {

  public static void main(String[] args) {
    Consumer<String> c = s -> System.out.println(s);
    c.accept("Hello");
    c.accept("Jimmmy");
  }
}
