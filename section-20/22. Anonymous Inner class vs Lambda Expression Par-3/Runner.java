// Inside anon inner class "this" keyword always refers to current class object.

interface I {
  public void m1();
}

class Test {

  int x = 1500;

  public void m2() {
    I i = new I() {
      int x = 1200;

      public void m1() {
        System.out.println(this.x);
      }
    };

    i.m1();
  }
}

class Test2 {

  int x = 1500;

  public void m2() {
    I i = () -> {
      int x = 999;
      System.out.println(this.x);
      //   In Lambda expressions "this" keyword referes to outer class varialbes only
    };

    i.m1();
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
// watch the lecture
