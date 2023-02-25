@FunctionalInterface
interface Home {
  public void m1();

  default void m2() {}

  public static void m3() {}
}

public class Runner {

  public static void main(String[] args) {}
}
