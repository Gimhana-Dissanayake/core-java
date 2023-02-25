interface I {
  public void m1(int a, int b);
}

interface I2 {
  public int getLength(String s);
}

public class Runner {

  public static void main(String[] args) {
    I i = (a, b) -> System.out.println(a + b);
    i.m1(10, 40);

    I2 i2 = s -> s.length();

    System.out.println(i2.getLength("mario"));
  }
}
