// The fallowing ways can be used to resolve abiguity problem of default methods when implementing multiple interfaces

interface Left {
  default void m1() {
    System.out.println("Left default method");
  }
}

interface Right {
  default void m1() {
    System.out.println("Right default method");
  }
}

class Test implements Left, Right {

  // solution one - override the m1 method
  public void m1() {
    System.out.println("My own implementation");
  }
  //   solution two - get a prefered implemtation

}

class Test1 implements Left, Right {

  //   solution two - get a prefered implemtation
  public void m1() {
    Left.super.m1();
  }
}

public class Runner {

  public static void main(String[] args) {
    Test t = new Test();
    t.m1();
    Test1 t2 = new Test1();
    t2.m1();
  }
}
// watch the lecture
