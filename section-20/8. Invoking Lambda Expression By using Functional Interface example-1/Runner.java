// Without lambda expression

interface I {
  public void m1();
}

class Demo implements I {

  public void m1() {
    System.out.println("m1 impl");
  }
}

public class Runner {

  public static void main(String[] args) {
    I i1 = new Demo();
    i1.m1();
    // With lambda expression
    I i2 = () -> System.out.println("m1 impl with lamda");
    i2.m1();
  }
}
// watch the lecture
