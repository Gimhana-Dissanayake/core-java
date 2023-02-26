interface I {
  public void m1();
}

class Test {

  int x = 10;

  public void m2() {
    int y = 20;
    // From anon inner classes we can refer enclosing class variables and local varialbes / method variables
    // local varialbes / method variables are all final in lamda expressions
    I i = () -> {
      // y = 21;//comilation error here
      System.out.println(x);
      System.out.println(y);
    };
    i.m1();
  }
}

public class Runner {

  // Misconception: lambda expressions were not introduced to replace anon inner classes.
  public static void main(String[] args) {
    Test t = new Test();
    t.m2();
  }
}
// watch the lecture
