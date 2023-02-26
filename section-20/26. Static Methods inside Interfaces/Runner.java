// from java 1.8 onwards we can declare static methods in interface
// this can be used to define utility methods in applications

interface I {
  public static void m1() {
    System.out.println("interface static method");
  }
}

public class Runner {

  public static void main(String[] args) {
    I.m1();
  }
}
// watch the lecture
