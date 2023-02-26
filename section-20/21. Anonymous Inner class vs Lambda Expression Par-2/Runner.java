class A {}

abstract class B {}

interface C {
  public void m1();

  public void m2();

  public void m3();
}

interface D {
  public void m1();
}

public class Runner {

  public static void main(String[] args) {
    A a = new A() {};
    // anon innerclass than extends concrete class

    B b = new B() {};
    // anon innerclass than extends abstract class

    C c = new C() {
      public void m1() {
        System.out.println("m1 impl");
      }

      public void m2() {
        System.out.println("m2 impl");
      }

      public void m3() {
        System.out.println("m3 impl");
      }
    };
    // anon innerclass that implments interface which contains multiple methods

    D d = new D() {
      public void m1() {
        System.out.println("d m1 impl");
      }
    };

    D d1 = () -> System.out.println("d m1 impl with lamda expression");
    // anon innerclass that implments functional interface, which contains only one abstract method. This is only scenario when we can subsitute anon innterclass for a lambda expression. Meaning, only functional interfaces should be used with lambda expressions

    // NOTE: anon inner classes are not the same as lambda expressions
    // anon inner classes are more powerful than lamda expressions
    // To substitute an anon inner class with a lamda it should be an functional interface
  }
}
// watch lecture
