import java.util.function.Function;

public class Runner {

  public static void main(String[] args) {
    String s = "hello welcome to srilanka";
    Function<String, String> f = s1 -> s1.replaceAll(" ", "");
    System.out.println(f.apply(s));

    Function<String, Integer> f2 = s1 ->
      s1.length() - s1.replaceAll(" ", "").length();
    System.out.println(
      "Number of characters without spaces" + " " + f2.apply(s)
    );
  }
}
