interface I {
  default void m1() {
    System.out.println("default method");
  }
}

class Test implements I {

  public void m2() {
    m1();
  }
}

class Test2 implements I {

  public void m1() {
    System.out.println("default method overriden");
  }

  public void m2() {
    m1();
  }
}

public class Runner {

  public static void main(String[] args) {
    Test t = new Test();
    t.m2();

    Test2 t2 = new Test2();
    t2.m2();
  }
}
